import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ifa")
public final class Class94_Sub4 extends Class94 {

	@OriginalMember(owner = "client!ifa", name = "A", descriptor = "I")
	private int anInt4691 = -1;

	@OriginalMember(owner = "client!ifa", name = "C", descriptor = "I")
	private int anInt4692 = -1;

	@OriginalMember(owner = "client!ifa", name = "y", descriptor = "I")
	public final int anInt4689;

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Lclient!dw;II)V")
	public Class94_Sub4(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt4689 = arg2;
		super.aClass82_Sub1_25.method2029(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt4680, arg2, arg2, 0, Static512.method7421(super.anInt4680), 5121, (byte[]) null, 0);
		}
		this.method4012(true);
	}

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Lclient!dw;IIZ[[BI)V")
	public Class94_Sub4(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt4689 = arg2;
		super.aClass82_Sub1_25.method2029(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt4680, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method4012(true);
	}

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "(Lclient!dw;IIZ[[I)V")
	public Class94_Sub4(@OriginalArg(0) Class82_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt4689 = arg2;
		super.aClass82_Sub1_25.method2029(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static507.method7363(super.aClass82_Sub1_25.anInt2488, local30 + 34069, arg2, super.anInt4680, arg2, arg4[local30]);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt4680, arg2, arg2, 0, 32993, super.aClass82_Sub1_25.anInt2488, arg4[local30], 0);
			}
		}
		this.method4012(true);
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)V")
	@Override
	public void method4004() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt4692, this.anInt4691, 3553, 0, 0);
		this.anInt4691 = -1;
		this.anInt4692 = -1;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(IBIII)V")
	public void method4017(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg0, arg1, super.anInt4686, 0);
		this.anInt4691 = arg0;
		this.anInt4692 = arg2;
	}
}
