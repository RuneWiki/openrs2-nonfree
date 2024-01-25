import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class31_Sub2 extends Class31 {

	@OriginalMember(owner = "client!bi", name = "n", descriptor = "Z")
	private boolean aBoolean95;

	@OriginalMember(owner = "client!bi", name = "A", descriptor = "Z")
	private boolean aBoolean96;

	@OriginalMember(owner = "client!bi", name = "l", descriptor = "Z")
	private boolean aBoolean93 = false;

	@OriginalMember(owner = "client!bi", name = "z", descriptor = "[F")
	private final float[] aFloatArray7 = new float[4];

	@OriginalMember(owner = "client!bi", name = "s", descriptor = "Lclient!hka;")
	private Class146 aClass146_1;

	@OriginalMember(owner = "client!bi", name = "t", descriptor = "Lclient!hka;")
	private Class146 aClass146_2;

	@OriginalMember(owner = "client!bi", name = "y", descriptor = "Lclient!hka;")
	private Class146 aClass146_3;

	@OriginalMember(owner = "client!bi", name = "G", descriptor = "Lclient!hka;")
	private Class146 aClass146_4;

	@OriginalMember(owner = "client!bi", name = "m", descriptor = "Z")
	private final boolean aBoolean94;

	@OriginalMember(owner = "client!bi", name = "D", descriptor = "Lclient!oga;")
	private Interface21 anInterface21_1;

	@OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lclient!ko;Lclient!wia;)V")
	public Class31_Sub2(@OriginalArg(0) Class137_Sub1_Sub1 arg0, @OriginalArg(1) Class386 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean404) {
			this.aClass146_1 = Static42.method929(arg0, arg1.method9219("uw_ground_unlit", "gl"));
			this.aClass146_2 = Static42.method929(arg0, arg1.method9219("uw_ground_lit", "gl"));
			this.aClass146_3 = Static42.method929(arg0, arg1.method9219("uw_model_unlit", "gl"));
			this.aClass146_4 = Static42.method929(arg0, arg1.method9219("uw_model_lit", "gl"));
			if (this.aClass146_4 != null & this.aClass146_3 != null & this.aClass146_2 != null & this.aClass146_1 != null) {
				this.anInterface21_1 = super.aClass137_Sub1_22.method7982(false, 1, new int[] { 0, -1 }, 2);
				this.anInterface21_1.method9033(false, false);
				this.aBoolean94 = true;
			} else {
				this.aBoolean94 = false;
			}
		} else {
			this.aBoolean94 = false;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZB)V")
	@Override
	public void method8592(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8595(@OriginalArg(1) boolean arg0) {
		this.aBoolean95 = arg0;
		super.aClass137_Sub1_22.method8081(1);
		super.aClass137_Sub1_22.method8007(this.anInterface21_1);
		super.aClass137_Sub1_22.method7969(Static129.aClass87_4, Static461.aClass87_5);
		super.aClass137_Sub1_22.method8069(0, Static490.aClass169_6);
		super.aClass137_Sub1_22.method8047(false, true, Static201.aClass169_3, 2);
		super.aClass137_Sub1_22.method7971(0, Static567.aClass169_7);
		super.aClass137_Sub1_22.method8081(0);
		this.method8599();
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(Z)V")
	@Override
	public void method8597() {
		if (!this.aBoolean96) {
			return;
		}
		@Pc(13) int local13 = super.aClass137_Sub1_22.XA();
		@Pc(17) int local17 = super.aClass137_Sub1_22.i();
		@Pc(28) float local28 = (float) local13 - (float) (local13 - local17) * 0.125F;
		@Pc(39) float local39 = -((float) (local13 - local17) * 0.25F) + (float) local13;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local39, local28, 1.0F / (float) super.aClass137_Sub1_22.method8035(), (float) super.aClass137_Sub1_22.method7995() / 255.0F);
		super.aClass137_Sub1_22.method8081(1);
		super.aClass137_Sub1_22.method8048(super.aClass137_Sub1_22.method7988());
		super.aClass137_Sub1_22.method8081(0);
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
	@Override
	public void method8591() {
		super.aClass137_Sub1_22.method8081(1);
		super.aClass137_Sub1_22.method8007((Interface15) null);
		super.aClass137_Sub1_22.method7969(Static575.aClass87_7, Static575.aClass87_7);
		super.aClass137_Sub1_22.method8069(0, Static201.aClass169_3);
		super.aClass137_Sub1_22.method8069(2, Static490.aClass169_6);
		super.aClass137_Sub1_22.method7971(0, Static201.aClass169_3);
		super.aClass137_Sub1_22.method8081(0);
		if (this.aBoolean93) {
			super.aClass137_Sub1_22.method8069(0, Static201.aClass169_3);
			super.aClass137_Sub1_22.method7971(0, Static201.aClass169_3);
			this.aBoolean93 = false;
		}
		if (this.aBoolean96) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean96 = false;
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8593() {
		return this.aBoolean94;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(BILclient!kja;)V")
	@Override
	public void method8588(@OriginalArg(1) int arg0, @OriginalArg(2) Interface15 arg1) {
		if (arg1 != null) {
			if (this.aBoolean93) {
				super.aClass137_Sub1_22.method8069(0, Static201.aClass169_3);
				super.aClass137_Sub1_22.method7971(0, Static201.aClass169_3);
				this.aBoolean93 = false;
			}
			super.aClass137_Sub1_22.method8007(arg1);
			super.aClass137_Sub1_22.method8078(arg0);
		} else if (!this.aBoolean93) {
			super.aClass137_Sub1_22.method8007(super.aClass137_Sub1_22.anInterface15_3);
			super.aClass137_Sub1_22.method8078(1);
			super.aClass137_Sub1_22.method8069(0, Static567.aClass169_7);
			super.aClass137_Sub1_22.method7971(0, Static567.aClass169_7);
			this.aBoolean93 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "(Z)V")
	@Override
	public void method8599() {
		@Pc(8) int local8 = super.aClass137_Sub1_22.method7985();
		@Pc(17) Class26_Sub1 local17 = super.aClass137_Sub1_22.method8076();
		if (this.aBoolean95) {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass146_2.anInt4171 : this.aClass146_4.anInt4171);
		} else {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass146_1.anInt4171 : this.aClass146_3.anInt4171);
		}
		OpenGL.glEnable(34336);
		this.aBoolean96 = true;
		local17.method798(0.0F, -1.0F, (float) local8, 0.0F, this.aFloatArray7);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray7[0], this.aFloatArray7[1], this.aFloatArray7[2], this.aFloatArray7[3]);
		this.method8597();
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IBI)V")
	@Override
	public void method8587(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}
}
