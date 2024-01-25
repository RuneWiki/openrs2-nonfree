import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rd")
public final class Class112_Sub4 extends Class112 {

	@OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
	private int anInt5828 = -1;

	@OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
	private int anInt5830 = -1;

	@OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
	public final int anInt5833;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!vj;IIZ[[BI)V")
	public Class112_Sub4(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt5833 = arg2;
		super.aClass172_Sub2_29.method5630(this);
		for (@Pc(26) int local26 = 0; local26 < 6; local26++) {
			OpenGL.glTexImage2Dub(local26 + 34069, 0, super.anInt5821, arg2, arg2, 0, arg5, 5121, arg4[local26], 0);
		}
		this.method4551(true);
	}

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!vj;II)V")
	public Class112_Sub4(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt5833 = arg2;
		super.aClass172_Sub2_29.method5630(this);
		for (@Pc(26) int local26 = 0; local26 < 6; local26++) {
			OpenGL.glTexImage2Dub(local26 + 34069, 0, super.anInt5821, arg2, arg2, 0, Static228.method3427(super.anInt5821), 5121, null, 0);
		}
		this.method4551(true);
	}

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!vj;IIZ[[I)V")
	public Class112_Sub4(@OriginalArg(0) Class172_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt5833 = arg2;
		super.aClass172_Sub2_29.method5630(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static446.method5885(local30 + 34069, super.aClass172_Sub2_29.anInt7177, arg2, arg2, arg4[local30], super.anInt5821);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt5821, arg2, arg2, 0, 32993, super.aClass172_Sub2_29.anInt7177, arg4[local30], 0);
			}
		}
		this.method4551(true);
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
	@Override
	public void method4544() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt5830, this.anInt5828, 3553, 0, 0);
		this.anInt5830 = -1;
		this.anInt5828 = -1;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZIII)V")
	public void method4558(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg1, arg0, super.anInt5818, 0);
		this.anInt5828 = arg1;
		this.anInt5830 = arg2;
	}
}
