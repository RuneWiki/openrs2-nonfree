import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ap")
public final class Class21 {

	@OriginalMember(owner = "client!ap", name = "f", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "()V")
	public Class21() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(III)V")
	private Class21(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "([BI)[B")
	public byte[] method217(@OriginalArg(0) byte[] arg0) {
		@Pc(8) Class3_Sub26 local8 = new Class3_Sub26(arg0);
		local8.anInt8703 = arg0.length - 4;
		@Pc(26) int local26 = local8.method6799();
		local8.anInt8703 = 0;
		@Pc(32) byte[] local32 = new byte[local26];
		this.method218(local8, local32);
		return local32;
	}

	@OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lclient!ie;I[B)V")
	public void method218(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray213[arg0.anInt8703] != 31 || arg0.aByteArray213[arg0.anInt8703 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray213, arg0.anInt8703 + 10, -arg0.anInt8703 + -10 + -8 + arg0.aByteArray213.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(67) Exception local67) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
