import jaggl.opengl;
import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!or")
public final class Class28_Sub4 extends Class28 {

	@OriginalMember(owner = "client!or", name = "l", descriptor = "I")
	private int anInt4324 = -1;

	@OriginalMember(owner = "client!or", name = "j", descriptor = "I")
	private final int anInt4322;

	@OriginalMember(owner = "client!or", name = "k", descriptor = "I")
	private final int anInt4323;

	@OriginalMember(owner = "client!or", name = "i", descriptor = "I")
	private final int anInt4321;

	@OriginalMember(owner = "client!or", name = "<init>", descriptor = "(Lclient!ge;IIII[BI)V")
	public Class28_Sub4(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[] arg5, @OriginalArg(6) int arg6) {
		super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
		this.anInt4322 = arg2;
		this.anInt4323 = arg3;
		this.anInt4321 = arg4;
		@Pc(25) opengl local25 = arg0.anOpengl1;
		this.aClass81_Sub1_26.method2022(this);
		local25.glTexImage3D(this.anInt4318, 0, this.anInt4319, this.anInt4322, this.anInt4323, this.anInt4321, 0, arg6, 5121, ByteBuffer.wrap(arg5));
		this.method4124(true);
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "()V")
	@Override
	public void method4114() {
		this.aClass81_Sub1_26.anOpengl1.glFramebufferTexture3DEXT(36160, this.anInt4324, this.anInt4318, 0, 0, 0);
		this.anInt4324 = -1;
	}
}
