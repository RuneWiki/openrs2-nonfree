import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class13_Sub4 extends Class13 {

	@OriginalMember(owner = "client!gd", name = "s", descriptor = "Z")
	private boolean aBoolean302;

	@OriginalMember(owner = "client!gd", name = "y", descriptor = "Z")
	private boolean aBoolean303;

	@OriginalMember(owner = "client!gd", name = "p", descriptor = "Z")
	private boolean aBoolean301 = false;

	@OriginalMember(owner = "client!gd", name = "o", descriptor = "[F")
	private final float[] aFloatArray21 = new float[4];

	@OriginalMember(owner = "client!gd", name = "x", descriptor = "Lclient!oga;")
	private Class261 aClass261_3;

	@OriginalMember(owner = "client!gd", name = "t", descriptor = "Lclient!oga;")
	private Class261 aClass261_2;

	@OriginalMember(owner = "client!gd", name = "G", descriptor = "Lclient!oga;")
	private Class261 aClass261_5;

	@OriginalMember(owner = "client!gd", name = "D", descriptor = "Lclient!oga;")
	private Class261 aClass261_4;

	@OriginalMember(owner = "client!gd", name = "z", descriptor = "Z")
	private final boolean aBoolean304;

	@OriginalMember(owner = "client!gd", name = "u", descriptor = "Lclient!lba;")
	private Interface10 anInterface10_1;

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!fc;Lclient!gga;)V")
	public Class13_Sub4(@OriginalArg(0) Class101_Sub1_Sub1 arg0, @OriginalArg(1) Class124 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean248) {
			this.aClass261_3 = Static144.method2522(arg1.method3639("uw_ground_unlit", "gl"), arg0);
			this.aClass261_2 = Static144.method2522(arg1.method3639("uw_ground_lit", "gl"), arg0);
			this.aClass261_5 = Static144.method2522(arg1.method3639("uw_model_unlit", "gl"), arg0);
			this.aClass261_4 = Static144.method2522(arg1.method3639("uw_model_lit", "gl"), arg0);
			if (this.aClass261_4 != null & this.aClass261_3 != null & this.aClass261_2 != null & this.aClass261_5 != null) {
				this.anInterface10_1 = super.aClass101_Sub1_22.method5833(1, 2, new int[] { 0, -1 }, false);
				this.anInterface10_1.method9107(false, false);
				this.aBoolean304 = true;
			} else {
				this.aBoolean304 = false;
			}
		} else {
			this.aBoolean304 = false;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method8489() {
		return this.aBoolean304;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!en;ZI)V")
	@Override
	public void method8494(@OriginalArg(0) Interface5 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean301) {
				super.aClass101_Sub1_22.method5954(0, Static44.aClass118_1);
				super.aClass101_Sub1_22.method5890(0, Static44.aClass118_1);
				this.aBoolean301 = false;
			}
			super.aClass101_Sub1_22.method5909(arg0);
			super.aClass101_Sub1_22.method5840(arg1);
		} else if (!this.aBoolean301) {
			super.aClass101_Sub1_22.method5909(super.aClass101_Sub1_22.anInterface5_3);
			super.aClass101_Sub1_22.method5840(1);
			super.aClass101_Sub1_22.method5954(0, Static175.aClass118_2);
			super.aClass101_Sub1_22.method5890(0, Static175.aClass118_2);
			this.aBoolean301 = true;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8490(@OriginalArg(0) boolean arg0) {
		this.aBoolean302 = arg0;
		super.aClass101_Sub1_22.method5862(1);
		super.aClass101_Sub1_22.method5909(this.anInterface10_1);
		super.aClass101_Sub1_22.method5891(Static98.aClass381_1, Static512.aClass381_5);
		super.aClass101_Sub1_22.method5954(0, Static660.aClass118_5);
		super.aClass101_Sub1_22.method5922(2, false, true, Static44.aClass118_1);
		super.aClass101_Sub1_22.method5890(0, Static175.aClass118_2);
		super.aClass101_Sub1_22.method5862(0);
		this.method8497();
	}

	@OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)V")
	@Override
	public void method8499() {
		if (!this.aBoolean303) {
			return;
		}
		@Pc(6) int local6 = super.aClass101_Sub1_22.XA();
		@Pc(10) int local10 = super.aClass101_Sub1_22.i();
		@Pc(21) float local21 = -((float) (local6 - local10) * 0.125F) + (float) local6;
		@Pc(31) float local31 = (float) local6 - (float) (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local31, local21, 1.0F / (float) super.aClass101_Sub1_22.method5927(), (float) super.aClass101_Sub1_22.method5956() / 255.0F);
		super.aClass101_Sub1_22.method5862(1);
		super.aClass101_Sub1_22.method5933(super.aClass101_Sub1_22.method5949());
		super.aClass101_Sub1_22.method5862(0);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(III)V")
	@Override
	public void method8488(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(B)V")
	@Override
	public void method8498() {
		super.aClass101_Sub1_22.method5862(1);
		super.aClass101_Sub1_22.method5909((Interface5) null);
		super.aClass101_Sub1_22.method5891(Static175.aClass381_3, Static175.aClass381_3);
		super.aClass101_Sub1_22.method5954(0, Static44.aClass118_1);
		super.aClass101_Sub1_22.method5954(2, Static660.aClass118_5);
		super.aClass101_Sub1_22.method5890(0, Static44.aClass118_1);
		super.aClass101_Sub1_22.method5862(0);
		if (this.aBoolean301) {
			super.aClass101_Sub1_22.method5954(0, Static44.aClass118_1);
			super.aClass101_Sub1_22.method5890(0, Static44.aClass118_1);
			this.aBoolean301 = false;
		}
		if (this.aBoolean303) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean303 = false;
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8495(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!gd", name = "e", descriptor = "(I)V")
	@Override
	public void method8497() {
		@Pc(10) int local10 = super.aClass101_Sub1_22.method5901();
		@Pc(15) Class76_Sub2 local15 = super.aClass101_Sub1_22.method5835();
		if (this.aBoolean302) {
			OpenGL.glBindProgramARB(34336, local10 == Integer.MAX_VALUE ? this.aClass261_2.anInt7847 : this.aClass261_4.anInt7847);
		} else {
			OpenGL.glBindProgramARB(34336, ~local10 == Integer.MIN_VALUE ? this.aClass261_3.anInt7847 : this.aClass261_5.anInt7847);
		}
		OpenGL.glEnable(34336);
		this.aBoolean303 = true;
		local15.method7348((float) local10, 0.0F, -1.0F, 0.0F, this.aFloatArray21);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray21[0], this.aFloatArray21[1], this.aFloatArray21[2], this.aFloatArray21[3]);
		this.method8499();
	}
}
