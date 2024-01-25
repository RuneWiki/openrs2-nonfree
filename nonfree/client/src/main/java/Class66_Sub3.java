import jaggl.opengl;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class66_Sub3 extends Class66 {

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
	private int anInt4186 = -1;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	public final int anInt4189;

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
	public final int anInt4187;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
	public final int anInt4188;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!se;IIII)V")
	public Class66_Sub3(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt4189 = arg2;
		this.anInt4187 = arg3;
		this.anInt4188 = arg4;
		@Pc(25) opengl local25 = arg0.anOpengl2;
		this.aClass122_Sub2_35.method4864(this);
		local25.glTexImage3D(this.anInt4752, 0, this.anInt4753, this.anInt4189, this.anInt4187, this.anInt4188, 0, Static101.method4039(this.anInt4753), 5121, null);
		this.method4044(true);
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!se;IIII[BI)V")
	public Class66_Sub3(@OriginalArg(0) Class122_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt4189 = arg2;
		this.anInt4187 = arg3;
		this.anInt4188 = arg4;
		@Pc(25) opengl local25 = arg0.anOpengl2;
		this.aClass122_Sub2_35.method4864(this);
		local25.glTexImage3D(this.anInt4752, 0, this.anInt4753, this.anInt4189, this.anInt4187, this.anInt4188, 0, arg6, 5121, ByteBuffer.wrap(arg5));
		this.method4044(true);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
	public void method3565(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass122_Sub2_35.anOpengl2.glFramebufferTexture3DEXT(36160, arg0, this.anInt4752, this.anInt4751, 0, arg1);
		this.anInt4186 = arg0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "()V")
	@Override
	public void method4037() {
		this.aClass122_Sub2_35.anOpengl2.glFramebufferTexture3DEXT(36160, this.anInt4186, this.anInt4752, 0, 0, 0);
		this.anInt4186 = -1;
	}
}
