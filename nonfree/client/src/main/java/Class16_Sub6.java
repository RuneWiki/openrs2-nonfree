import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nw")
public final class Class16_Sub6 extends Class16 {

	@OriginalMember(owner = "client!nw", name = "t", descriptor = "Lclient!ck;")
	private final Class33_Sub1_Sub1 aClass33_Sub1_Sub1_8;

	@OriginalMember(owner = "client!nw", name = "u", descriptor = "Lclient!eb;")
	private final Class73 aClass73_6;

	@OriginalMember(owner = "client!nw", name = "r", descriptor = "Lclient!hg;")
	private final Class129 aClass129_5;

	@OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(Lclient!ck;Lclient!kha;Lclient!eb;)V")
	public Class16_Sub6(@OriginalArg(0) Class33_Sub1_Sub1 arg0, @OriginalArg(1) Class181 arg1, @OriginalArg(2) Class73 arg2) {
		super(arg0);
		this.aClass33_Sub1_Sub1_8 = arg0;
		this.aClass73_6 = arg2;
		if (arg1 != null && this.aClass73_6.method2713() && this.aClass33_Sub1_Sub1_8.aBoolean142) {
			this.aClass129_5 = Static78.method1881(arg1.method5026("gl", "transparent_water"), this.aClass33_Sub1_Sub1_8);
		} else {
			this.aClass129_5 = null;
		}
	}

	@OriginalMember(owner = "client!nw", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method8608() {
		return this.aClass129_5 != null;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8601(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass129_5.anInt4771);
		OpenGL.glEnable(34336);
		super.aClass33_Sub1_23.method2098(0, Static25.aClass371_1);
	}

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "(B)V")
	@Override
	public void method8604() {
		super.aClass33_Sub1_23.method2098(0, Static419.aClass371_4);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lclient!bia;BI)V")
	@Override
	public void method8611(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8605(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass73_6.aBoolean236) {
			@Pc(40) float local40 = (float) (super.aClass33_Sub1_23.anInt2179 % 4000) / 4000.0F;
			super.aClass33_Sub1_23.method1987(this.aClass73_6.anInterface17_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local40, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(13) int local13 = super.aClass33_Sub1_23.anInt2179 % 4000 * 16 / 4000;
			super.aClass33_Sub1_23.method1987(this.aClass73_6.anInterface2Array2[local13]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8596(@OriginalArg(1) boolean arg0) {
		super.aClass33_Sub1_23.method1983(Static428.aClass363_4, Static64.aClass363_7);
	}
}
