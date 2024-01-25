import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hfa")
public final class Class139 {

	@OriginalMember(owner = "client!hfa", name = "c", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "()V")
	public Class139() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!hfa", name = "<init>", descriptor = "(III)V")
	private Class139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Z[B)[B")
	public byte[] method3289(@OriginalArg(1) byte[] arg0) {
		@Pc(14) Class3_Sub7 local14 = new Class3_Sub7(arg0);
		local14.anInt7869 = arg0.length - 4;
		@Pc(24) int local24 = local14.method6490();
		@Pc(27) byte[] local27 = new byte[local24];
		local14.anInt7869 = 0;
		this.method3290(local14, local27);
		return local27;
	}

	@OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lclient!fd;[BB)V")
	public void method3290(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray86[arg0.anInt7869] != 31 || arg0.aByteArray86[arg0.anInt7869 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray86, arg0.anInt7869 + 10, -arg0.anInt7869 + -10 - (8 - arg0.aByteArray86.length));
			this.anInflater1.inflate(arg1);
		} catch (@Pc(64) Exception local64) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}
}
