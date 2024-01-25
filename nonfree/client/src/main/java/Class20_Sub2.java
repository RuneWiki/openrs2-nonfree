import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class20_Sub2 extends Class20 {

	@OriginalMember(owner = "client!ci", name = "I", descriptor = "I")
	private int anInt1680 = -1;

	@OriginalMember(owner = "client!ci", name = "G", descriptor = "I")
	private int anInt1679 = -1;

	@OriginalMember(owner = "client!ci", name = "C", descriptor = "I")
	public final int anInt1675;

	static {
		new Class114(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!te;IIZ[[BI)V")
	public Class20_Sub2(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) byte[][] arg4, @OriginalArg(5) int arg5) {
		super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
		this.anInt1675 = arg2;
		super.aClass9_Sub3_36.method6701(this);
		for (@Pc(26) int local26 = 0; local26 < 6; local26++) {
			OpenGL.glTexImage2Dub(local26 + 34069, 0, super.anInt7318, arg2, arg2, 0, arg5, 5121, arg4[local26], 0);
		}
		this.method6237(true);
	}

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!te;II)V")
	public Class20_Sub2(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
		this.anInt1675 = arg2;
		super.aClass9_Sub3_36.method6701(this);
		for (@Pc(28) int local28 = 0; local28 < 6; local28++) {
			OpenGL.glTexImage2Dub(local28 + 34069, 0, super.anInt7318, arg2, arg2, 0, Static210.method3821(super.anInt7318), 5121, null, 0);
		}
		this.method6237(true);
	}

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Lclient!te;IIZ[[I)V")
	public Class20_Sub2(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int[][] arg4) {
		super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
		this.anInt1675 = arg2;
		super.aClass9_Sub3_36.method6701(this);
		@Pc(30) int local30;
		if (arg3) {
			for (local30 = 0; local30 < 6; local30++) {
				Static223.method3942(arg2, super.aClass9_Sub3_36.anInt7913, super.anInt7318, arg2, arg4[local30], local30 + 34069);
			}
		} else {
			for (local30 = 0; local30 < 6; local30++) {
				OpenGL.glTexImage2Di(local30 + 34069, 0, super.anInt7318, arg2, arg2, 0, 32993, super.aClass9_Sub3_36.anInt7913, arg4[local30], 0);
			}
		}
		this.method6237(true);
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	@Override
	public void method6233() {
		OpenGL.glFramebufferTexture2DEXT(this.anInt1679, this.anInt1680, 3553, 0, 0);
		this.anInt1680 = -1;
		this.anInt1679 = -1;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIBI)V")
	public void method1661(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		OpenGL.glFramebufferTexture2DEXT(arg2, arg0, arg1, super.anInt7321, 0);
		this.anInt1679 = arg2;
		this.anInt1680 = arg0;
	}
}
