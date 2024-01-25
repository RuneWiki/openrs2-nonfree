import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rc")
public final class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!rc", name = "x", descriptor = "I")
	private int anInt5599 = -1;

	@OriginalMember(owner = "client!rc", name = "v", descriptor = "I")
	private int anInt5597 = -1;

	@OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
	public final int anInt5595;

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!od;IIZ[[BI)V")
	public Class5_Sub4(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt5595 = arg2;
		super.aClass128_Sub2_43.method3691(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt7332, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method5540(true);
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!od;IIZ[[I)V")
	public Class5_Sub4(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt5595 = arg2;
		super.aClass128_Sub2_43.method3691(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static216.method2876(local30 + 34069, arg4[local30], arg2, super.aClass128_Sub2_43.anInt4641, arg2, super.anInt7332);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt7332, arg2, arg2, 0, 32993, super.aClass128_Sub2_43.anInt4641, arg4[local30], 0);
			}
		}
		this.method5540(true);
	}

	@OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Lclient!od;II)V")
	public Class5_Sub4(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt5595 = arg2;
		super.aClass128_Sub2_43.method3691(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt7332, arg2, arg2, 0, Static217.method2879(super.anInt7332), 5121, null, 0);
		}
		this.method5540(true);
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
	@Override
	public void method5532() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt5597, this.anInt5599, 3553, 0, 0);
		this.anInt5599 = -1;
		this.anInt5597 = -1;
	}

	@OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIII)V")
	public void method4360(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg1, arg0, super.anInt7327, 0);
		this.anInt5599 = arg1;
		this.anInt5597 = arg2;
	}
}
