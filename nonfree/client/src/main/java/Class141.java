import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hh")
public final class Class141 {

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
	public Class141() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(III)V")
	private Class141(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "([BILclient!ek;)V")
	public void method3143(@OriginalArg(0) byte[] arg0, @OriginalArg(2) Class4_Sub13 arg1) {
		if (arg1.aByteArray88[arg1.anInt9170] != 31 || arg1.aByteArray88[arg1.anInt9170 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg1.aByteArray88, arg1.anInt9170 + 10, -18 - (arg1.anInt9170 - arg1.aByteArray88.length));
			this.anInflater1.inflate(arg0);
		} catch (@Pc(59) Exception local59) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "([BB)[B")
	public byte[] method3144(@OriginalArg(0) byte[] arg0) {
		@Pc(16) Class4_Sub13 local16 = new Class4_Sub13(arg0);
		local16.anInt9170 = arg0.length - 4;
		@Pc(26) int local26 = local16.method7018();
		local16.anInt9170 = 0;
		@Pc(32) byte[] local32 = new byte[local26];
		this.method3143(local32, local16);
		return local32;
	}
}
