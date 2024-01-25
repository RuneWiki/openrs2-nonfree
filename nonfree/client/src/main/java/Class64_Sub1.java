import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class64_Sub1 extends Class64 {

	@OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
	private int anInt1427 = -1;

	@OriginalMember(owner = "client!ea", name = "y", descriptor = "I")
	private int anInt1422 = -1;

	@OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
	public final int anInt1424;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!na;II)V")
	public Class64_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt1424 = arg2;
		super.aClass75_Sub2_24.method3844(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt4384, arg2, arg2, 0, Static353.method4961(super.anInt4384), 5121, null, 0);
		}
		this.method3523(true);
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!na;IIZ[[BI)V")
	public Class64_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt1424 = arg2;
		super.aClass75_Sub2_24.method3844(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt4384, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method3523(true);
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!na;IIZ[[I)V")
	public Class64_Sub1(@OriginalArg(0) Class75_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt1424 = arg2;
		super.aClass75_Sub2_24.method3844(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static203.method2865(local30 + 34069, arg4[local30], arg2, arg2, super.aClass75_Sub2_24.anInt4902, super.anInt4384);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt4384, arg2, arg2, 0, 32993, super.aClass75_Sub2_24.anInt4902, arg4[local30], 0);
			}
		}
		this.method3523(true);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	@Override
	public void method5596() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt1422, this.anInt1427, 3553, 0, 0);
		this.anInt1427 = -1;
		this.anInt1422 = -1;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIBI)V")
	public void method1311(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg1, arg0, super.anInt4398, 0);
		this.anInt1422 = arg2;
		this.anInt1427 = arg1;
	}
}
