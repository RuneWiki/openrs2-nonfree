import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sa")
public final class Class77_Sub4 extends Class77 {

	@OriginalMember(owner = "client!sa", name = "A", descriptor = "I")
	private int anInt8682 = -1;

	@OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
	private int anInt8680 = -1;

	@OriginalMember(owner = "client!sa", name = "D", descriptor = "I")
	public final int anInt8684;

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!kga;II)V")
	public Class77_Sub4(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, false);
		this.anInt8684 = arg2;
		super.aClass44_Sub3_36.method4605(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt8673, arg2, arg2, 0, Static296.method5095(super.anInt8673), 5121, null, 0);
		}
		this.method7076(true);
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!kga;IIZ[[BI)V")
	public Class77_Sub4(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt8684 = arg2;
		super.aClass44_Sub3_36.method4605(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt8673, arg2, arg2, 0, arg5, 5121, arg4[local28], 0);
		}
		this.method7076(true);
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(Lclient!kga;IIZ[[I)V")
	public Class77_Sub4(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt8684 = arg2;
		super.aClass44_Sub3_36.method4605(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static495.method7350(local30 + 34069, arg2, super.aClass44_Sub3_36.anInt5484, super.anInt8673, arg2, arg4[local30]);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt8673, arg2, arg2, 0, 32993, super.aClass44_Sub3_36.anInt5484, arg4[local30], 0);
			}
		}
		this.method7076(true);
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V")
	@Override
	public void method7064() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt8680, this.anInt8682, 3553, 0, 0);
		this.anInt8680 = -1;
		this.anInt8682 = -1;
	}

	@OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIII)V")
	public void method7077(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(4) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg0, arg1, arg2, super.anInt8675, 0);
		this.anInt8682 = arg1;
		this.anInt8680 = arg0;
	}
}
