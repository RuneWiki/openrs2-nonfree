import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gg")
public final class Class70_Sub3 extends Class70 {

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "I")
	private int anInt2293 = -1;

	@OriginalMember(owner = "client!gg", name = "l", descriptor = "I")
	private final int anInt2296;

	@OriginalMember(owner = "client!gg", name = "j", descriptor = "I")
	private final int anInt2294;

	@OriginalMember(owner = "client!gg", name = "k", descriptor = "I")
	private final int anInt2295;

	@OriginalMember(owner = "client!gg", name = "<init>", descriptor = "(Lclient!ql;IIII[BI)V")
	public Class70_Sub3(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt2296 = arg2;
		this.anInt2294 = arg3;
		this.anInt2295 = arg4;
		@Pc(25) opengl local25 = arg0.anOpengl2;
		this.aClass92_Sub2_15.method4548(this);
		local25.glTexImage3D(this.anInt2351, 0, this.anInt2349, this.anInt2296, this.anInt2294, this.anInt2295, 0, arg6, 5121, ByteBuffer.wrap(arg5));
		this.method1989(true);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "()V")
	@Override
	public void method5489() {
		this.aClass92_Sub2_15.anOpengl2.glFramebufferTexture3DEXT(36160, this.anInt2293, this.anInt2351, 0, 0, 0);
		this.anInt2293 = -1;
	}
}
