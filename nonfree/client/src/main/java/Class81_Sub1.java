import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ft")
public final class Class81_Sub1 extends Class81 {

	@OriginalMember(owner = "client!ft", name = "l", descriptor = "I")
	private int anInt2400 = -1;

	@OriginalMember(owner = "client!ft", name = "i", descriptor = "I")
	private final int anInt2397;

	@OriginalMember(owner = "client!ft", name = "j", descriptor = "I")
	private final int anInt2398;

	@OriginalMember(owner = "client!ft", name = "k", descriptor = "I")
	private final int anInt2399;

	@OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lclient!ic;IIII[BI)V")
	public Class81_Sub1(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt2397 = arg2;
		this.anInt2398 = arg3;
		this.anInt2399 = arg4;
		@Pc(25) opengl local25 = arg0.anOpengl2;
		this.aClass48_Sub2_26.method2573(this);
		local25.glTexImage3D(this.anInt4831, 0, this.anInt4829, this.anInt2397, this.anInt2398, this.anInt2399, 0, arg6, 5121, ByteBuffer.wrap(arg5));
		this.method4350(true);
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "()V")
	@Override
	public void method5235() {
		this.aClass48_Sub2_26.anOpengl2.glFramebufferTexture3DEXT(36160, this.anInt2400, this.anInt4831, 0, 0, 0);
		this.anInt2400 = -1;
	}
}
