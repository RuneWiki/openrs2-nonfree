import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!u")
public final class Class323 {

	@OriginalMember(owner = "client!u", name = "e", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
	public Class323() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!u", name = "<init>", descriptor = "(III)V")
	private Class323(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "([BLclient!mo;B)V")
	public void method7175(@OriginalArg(0) byte[] arg0, @OriginalArg(1) Class1_Sub35 arg1) {
		if (arg1.aByteArray85[arg1.anInt7214] != 31 || arg1.aByteArray85[arg1.anInt7214 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray85, arg1.anInt7214 + 10, -arg1.anInt7214 + -10 - 8 + arg1.aByteArray85.length);
			this.anInflater1.inflate(arg0);
		} catch (@Pc(70) Exception local70) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!u", name = "a", descriptor = "(I[B)[B")
	public byte[] method7178(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class1_Sub35 local8 = new Class1_Sub35(arg0);
		local8.anInt7214 = arg0.length - 4;
		@Pc(26) int local26 = local8.method5774();
		local8.anInt7214 = 0;
		@Pc(32) byte[] local32 = new byte[local26];
		this.method7175(local32, local8);
		return local32;
	}
}
