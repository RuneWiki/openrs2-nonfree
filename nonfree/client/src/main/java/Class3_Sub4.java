import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public final class Class3_Sub4 extends Class3 {

	@OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
	private int anInt6749 = -1;

	@OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
	private int anInt6751 = -1;

	@OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
	public final int anInt6748;

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!wh;IIZ[[BI)V")
	public Class3_Sub4(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt6748 = arg2;
		super.aClass100_Sub3_34.method8925(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt6737, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method5781(true);
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!wh;IIZ[[I)V")
	public Class3_Sub4(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt6748 = arg2;
		super.aClass100_Sub3_34.method8925(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static566.method8122(arg4[local30], arg2, arg2, super.anInt6737, local30 + 34069, super.aClass100_Sub3_34.anInt10618);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt6737, arg2, arg2, 0, 32993, super.aClass100_Sub3_34.anInt10618, arg4[local30], 0);
			}
		}
		this.method5781(true);
	}

	@OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lclient!wh;II)V")
	public Class3_Sub4(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt6748 = arg2;
		super.aClass100_Sub3_34.method8925(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt6737, arg2, arg2, 0, Static59.method1052(super.anInt6737), 5121, (byte[]) null, 0);
		}
		this.method5781(true);
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIII)V")
	public void method5784(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg1, arg0, super.anInt6739, 0);
		this.anInt6749 = arg1;
		this.anInt6751 = arg2;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	@Override
	public void method5769() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt6751, this.anInt6749, 3553, 0, 0);
		this.anInt6751 = -1;
		this.anInt6749 = -1;
	}
}
