import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ol")
public final class Class26_Sub9 extends Class26 {

	@OriginalMember(owner = "client!ol", name = "D", descriptor = "Z")
	private boolean aBoolean649;

	@OriginalMember(owner = "client!ol", name = "F", descriptor = "Z")
	private boolean aBoolean650;

	@OriginalMember(owner = "client!ol", name = "k", descriptor = "Z")
	private boolean aBoolean648 = false;

	@OriginalMember(owner = "client!ol", name = "B", descriptor = "[F")
	private final float[] aFloatArray54 = new float[4];

	@OriginalMember(owner = "client!ol", name = "t", descriptor = "Z")
	private final boolean aBoolean647;

	@OriginalMember(owner = "client!ol", name = "l", descriptor = "Lclient!kf;")
	private Class208 aClass208_2;

	@OriginalMember(owner = "client!ol", name = "E", descriptor = "Lclient!kf;")
	private Class208 aClass208_3;

	@OriginalMember(owner = "client!ol", name = "A", descriptor = "Lclient!kf;")
	private Class208 aClass208_5;

	@OriginalMember(owner = "client!ol", name = "o", descriptor = "Lclient!kf;")
	private Class208 aClass208_4;

	@OriginalMember(owner = "client!ol", name = "y", descriptor = "Lclient!de;")
	private Interface4 anInterface4_5;

	@OriginalMember(owner = "client!ol", name = "<init>", descriptor = "(Lclient!mba;Lclient!nca;)V")
	public Class26_Sub9(@OriginalArg(0) Class145_Sub1_Sub1 arg0, @OriginalArg(1) Class254 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean532) {
			this.aClass208_2 = Static127.method1859(arg1.method6104("gl", "uw_ground_unlit"), arg0);
			this.aClass208_3 = Static127.method1859(arg1.method6104("gl", "uw_ground_lit"), arg0);
			this.aClass208_5 = Static127.method1859(arg1.method6104("gl", "uw_model_unlit"), arg0);
			this.aClass208_4 = Static127.method1859(arg1.method6104("gl", "uw_model_lit"), arg0);
			if (this.aClass208_5 != null & this.aClass208_3 != null & this.aClass208_2 != null & this.aClass208_4 != null) {
				this.anInterface4_5 = super.aClass145_Sub1_21.method9753(new int[] { 0, -1 }, false, 1, 2);
				this.anInterface4_5.method6853(false, false);
				this.aBoolean647 = true;
			} else {
				this.aBoolean647 = false;
			}
		} else {
			this.aBoolean647 = false;
		}
	}

	@OriginalMember(owner = "client!ol", name = "c", descriptor = "(Z)V")
	@Override
	public void method8009() {
		super.aClass145_Sub1_21.method9745(1);
		super.aClass145_Sub1_21.method9754((Interface9) null);
		super.aClass145_Sub1_21.method9725(Static105.aClass293_3, Static105.aClass293_3);
		super.aClass145_Sub1_21.method9813(Static231.aClass352_5, 0);
		super.aClass145_Sub1_21.method9813(Static45.aClass352_1, 2);
		super.aClass145_Sub1_21.method9795(0, Static231.aClass352_5);
		super.aClass145_Sub1_21.method9745(0);
		if (this.aBoolean648) {
			super.aClass145_Sub1_21.method9813(Static231.aClass352_5, 0);
			super.aClass145_Sub1_21.method9795(0, Static231.aClass352_5);
			this.aBoolean648 = false;
		}
		if (this.aBoolean650) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean650 = false;
		}
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(Lclient!iba;BI)V")
	@Override
	public void method8004(@OriginalArg(0) Interface9 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean648) {
				super.aClass145_Sub1_21.method9813(Static231.aClass352_5, 0);
				super.aClass145_Sub1_21.method9795(0, Static231.aClass352_5);
				this.aBoolean648 = false;
			}
			super.aClass145_Sub1_21.method9754(arg0);
			super.aClass145_Sub1_21.method9797(arg1);
		} else if (!this.aBoolean648) {
			super.aClass145_Sub1_21.method9754(super.aClass145_Sub1_21.anInterface9_3);
			super.aClass145_Sub1_21.method9797(1);
			super.aClass145_Sub1_21.method9813(Static240.aClass352_6, 0);
			super.aClass145_Sub1_21.method9795(0, Static240.aClass352_6);
			this.aBoolean648 = true;
		}
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)V")
	@Override
	public void method7996() {
		@Pc(8) int local8 = super.aClass145_Sub1_21.method9791();
		@Pc(13) Class86_Sub2 local13 = super.aClass145_Sub1_21.method9721();
		if (this.aBoolean649) {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass208_3.anInt5014 : this.aClass208_4.anInt5014);
		} else {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass208_2.anInt5014 : this.aClass208_5.anInt5014);
		}
		OpenGL.glEnable(34336);
		this.aBoolean650 = true;
		local13.method2722(0.0F, 0.0F, this.aFloatArray54, -1.0F, (float) local8);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray54[0], this.aFloatArray54[1], this.aFloatArray54[2], this.aFloatArray54[3]);
		this.method8000();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8006(@OriginalArg(1) boolean arg0) {
		this.aBoolean649 = arg0;
		super.aClass145_Sub1_21.method9745(1);
		super.aClass145_Sub1_21.method9754(this.anInterface4_5);
		super.aClass145_Sub1_21.method9725(Static62.aClass293_1, Static162.aClass293_4);
		super.aClass145_Sub1_21.method9813(Static45.aClass352_1, 0);
		super.aClass145_Sub1_21.method9829(2, false, Static231.aClass352_5, true);
		super.aClass145_Sub1_21.method9795(0, Static240.aClass352_6);
		super.aClass145_Sub1_21.method9745(0);
		this.method7996();
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7998(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(III)V")
	@Override
	public void method8007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!ol", name = "b", descriptor = "(Z)V")
	@Override
	public void method8000() {
		if (!this.aBoolean650) {
			return;
		}
		@Pc(15) int local15 = super.aClass145_Sub1_21.XA();
		@Pc(19) int local19 = super.aClass145_Sub1_21.i();
		@Pc(30) float local30 = (float) local15 - (float) (local15 - local19) * 0.125F;
		@Pc(41) float local41 = (float) local15 - (float) (local15 - local19) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local41, local30, 1.0F / (float) super.aClass145_Sub1_21.method9827(), (float) super.aClass145_Sub1_21.method9746() / 255.0F);
		super.aClass145_Sub1_21.method9745(1);
		super.aClass145_Sub1_21.method9769(super.aClass145_Sub1_21.method9726());
		super.aClass145_Sub1_21.method9745(0);
	}

	@OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8001() {
		return this.aBoolean647;
	}
}
