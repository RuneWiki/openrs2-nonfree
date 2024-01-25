import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kl")
public final class Class18_Sub3 extends Class18 {

	@OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
	private final int anInt3456;

	@OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(Lclient!hj;II[BI)V")
	public Class18_Sub3(@OriginalArg(0) Class2_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt3456 = arg2;
		@Pc(12) opengl local12 = arg0.anOpengl1;
		this.aClass2_Sub1_34.method2376(this);
		local12.glPixelStorei(3317, 1);
		local12.glTexImage1D(this.anInt5452, 0, this.anInt5454, this.anInt3456, 0, arg4, 5121, ByteBuffer.wrap(arg3));
		local12.glPixelStorei(3317, 4);
		this.method4852(true);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "(ZI)V")
	public void method3200() {
		@Pc(7) opengl local7 = this.aClass2_Sub1_34.anOpengl1;
		this.aClass2_Sub1_34.method2376(this);
		local7.glTexParameteri(this.anInt5452, 10242, 33071);
	}

	@OriginalMember(owner = "client!kl", name = "a", descriptor = "()V")
	@Override
	public void method5354() {
	}
}
