import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!waa")
public final class Class23_Sub4 extends Class23 {

	@OriginalMember(owner = "client!waa", name = "w", descriptor = "I")
	private int anInt9365 = -1;

	@OriginalMember(owner = "client!waa", name = "x", descriptor = "I")
	private int anInt9366 = -1;

	@OriginalMember(owner = "client!waa", name = "s", descriptor = "I")
	public final int anInt9361;

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lclient!qj;IIZ[[I)V")
	public Class23_Sub4(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt9361 = arg2;
		super.aClass100_Sub3_42.method6277(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static474.method6724(local30 + 34069, super.anInt9354, arg2, arg2, arg4[local30], super.aClass100_Sub3_42.anInt7706);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt9354, arg2, arg2, 0, 32993, super.aClass100_Sub3_42.anInt7706, arg4[local30], 0);
			}
		}
		this.method7783(true);
	}

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lclient!qj;II)V")
	public Class23_Sub4(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt9361 = arg2;
		super.aClass100_Sub3_42.method6277(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9354, arg2, arg2, 0, Static123.method1797(super.anInt9354), 5121, null, 0);
		}
		this.method7783(true);
	}

	@OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(Lclient!qj;IIZ[[BI)V")
	public Class23_Sub4(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt9361 = arg2;
		super.aClass100_Sub3_42.method6277(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt9354, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method7783(true);
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V")
	@Override
	public void method7774() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt9365, this.anInt9366, 3553, 0, 0);
		this.anInt9365 = -1;
		this.anInt9366 = -1;
	}

	@OriginalMember(owner = "client!waa", name = "a", descriptor = "(BIIII)V")
	public void method7786(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg0, arg2, super.anInt9359, 0);
		this.anInt9365 = arg1;
		this.anInt9366 = arg0;
	}
}
