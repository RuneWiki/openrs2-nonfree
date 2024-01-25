import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qu")
public final class Class284 {

	@OriginalMember(owner = "client!qu", name = "c", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "()V")
	public Class284() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!qu", name = "<init>", descriptor = "(III)V")
	private Class284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(Lclient!ud;B[B)V")
	public void method6785(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(2) byte[] arg1) {
		if (arg0.aByteArray77[arg0.anInt8188] != 31 || arg0.aByteArray77[arg0.anInt8188 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray77, arg0.anInt8188 + 10, -8 - arg0.anInt8188 + -10 + arg0.aByteArray77.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(70) Exception local70) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!qu", name = "a", descriptor = "(I[B)[B")
	public byte[] method6790(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class2_Sub34 local8 = new Class2_Sub34(arg0);
		local8.anInt8188 = arg0.length - 4;
		@Pc(23) int local23 = local8.method6878();
		local8.anInt8188 = 0;
		@Pc(29) byte[] local29 = new byte[local23];
		this.method6785(local8, local29);
		return local29;
	}
}
