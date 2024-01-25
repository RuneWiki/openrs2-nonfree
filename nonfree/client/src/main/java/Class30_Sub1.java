import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class30_Sub1 extends Class30 {

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
	private final int anInt558;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!mi;II[BI)V")
	public Class30_Sub1(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		super(arg0, 3552, arg1, arg2, false);
		this.anInt558 = arg2;
		@Pc(12) opengl local12 = arg0.anOpengl1;
		this.aClass155_Sub1_35.method3585(this);
		local12.glPixelStorei(3317, 1);
		local12.glTexImage1D(this.anInt5155, 0, this.anInt5154, this.anInt558, 0, arg4, 5121, ByteBuffer.wrap(arg3));
		local12.glPixelStorei(3317, 4);
		this.method4607(true);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "()V")
	@Override
	public void method4599() {
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZB)V")
	public void method504() {
		@Pc(7) opengl local7 = this.aClass155_Sub1_35.anOpengl1;
		this.aClass155_Sub1_35.method3585(this);
		local7.glTexParameteri(this.anInt5155, 10242, 33071);
	}
}
