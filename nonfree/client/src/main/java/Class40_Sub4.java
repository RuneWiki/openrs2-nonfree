import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class40_Sub4 extends Class40 {

	@OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
	private int anInt7366 = -1;

	@OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
	private int anInt7371 = -1;

	@OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
	public final int anInt7369;

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!ok;IIZ[[I)V")
	public Class40_Sub4(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt7369 = arg2;
		super.aClass134_Sub2_31.method5202(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static459.method6337(super.anInt7350, arg2, arg2, arg4[local30], local30 + 34069, super.aClass134_Sub2_31.anInt6595);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt7350, arg2, arg2, 0, 32993, super.aClass134_Sub2_31.anInt6595, arg4[local30], 0);
			}
		}
		this.method5874(true);
	}

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!ok;IIZ[[BI)V")
	public Class40_Sub4(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt7369 = arg2;
		super.aClass134_Sub2_31.method5202(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt7350, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method5874(true);
	}

	@OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lclient!ok;II)V")
	public Class40_Sub4(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt7369 = arg2;
		super.aClass134_Sub2_31.method5202(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt7350, arg2, arg2, 0, Static22.method242(super.anInt7350), 5121, null, 0);
		}
		this.method5874(true);
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIIIB)V")
	public void method5880(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg1, arg2, arg0, super.anInt7359, 0);
		this.anInt7371 = arg2;
		this.anInt7366 = arg1;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
	@Override
	public void method5870() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt7366, this.anInt7371, 3553, 0, 0);
		this.anInt7366 = -1;
		this.anInt7371 = -1;
	}
}
