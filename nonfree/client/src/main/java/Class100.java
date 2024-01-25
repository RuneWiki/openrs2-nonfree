import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fn")
public final class Class100 {

	@OriginalMember(owner = "client!fn", name = "g", descriptor = "Ljava/util/zip/Inflater;")
	private Inflater anInflater1;

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "()V")
	public Class100() {
		this(-1, 1000000, 1000000);
	}

	@OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(III)V")
	private Class100(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lclient!qh;[BB)V")
	public void method2788(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) byte[] arg1) {
		if (arg0.aByteArray36[arg0.anInt3520] != 31 || arg0.aByteArray36[arg0.anInt3520 + 1] != -117) {
			throw new RuntimeException("Invalid GZIP header!");
		}
		if (this.anInflater1 == null) {
			this.anInflater1 = new Inflater(true);
		}
		try {
			this.anInflater1.setInput(arg0.aByteArray36, arg0.anInt3520 + 10, -10 + -8 + -arg0.anInt3520 + arg0.aByteArray36.length);
			this.anInflater1.inflate(arg1);
		} catch (@Pc(68) Exception local68) {
			this.anInflater1.reset();
			throw new RuntimeException("Invalid GZIP compressed data!");
		}
		this.anInflater1.reset();
	}

	@OriginalMember(owner = "client!fn", name = "a", descriptor = "(I[B)[B")
	public byte[] method2789(@OriginalArg(1) byte[] arg0) {
		@Pc(8) Class3_Sub11 local8 = new Class3_Sub11(arg0);
		local8.anInt3520 = arg0.length - 4;
		@Pc(18) int local18 = local8.method3113();
		@Pc(21) byte[] local21 = new byte[local18];
		local8.anInt3520 = 0;
		this.method2788(local8, local21);
		return local21;
	}
}
