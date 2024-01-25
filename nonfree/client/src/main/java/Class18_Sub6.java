import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!re")
public final class Class18_Sub6 extends Class18 {

	@OriginalMember(owner = "client!re", name = "w", descriptor = "Z")
	private boolean aBoolean715;

	@OriginalMember(owner = "client!re", name = "F", descriptor = "Z")
	private boolean aBoolean717;

	@OriginalMember(owner = "client!re", name = "E", descriptor = "Z")
	private boolean aBoolean716 = false;

	@OriginalMember(owner = "client!re", name = "G", descriptor = "[F")
	private final float[] aFloatArray84 = new float[4];

	@OriginalMember(owner = "client!re", name = "D", descriptor = "Lclient!via;")
	private Class370 aClass370_5;

	@OriginalMember(owner = "client!re", name = "r", descriptor = "Lclient!via;")
	private Class370 aClass370_2;

	@OriginalMember(owner = "client!re", name = "x", descriptor = "Lclient!via;")
	private Class370 aClass370_3;

	@OriginalMember(owner = "client!re", name = "B", descriptor = "Lclient!via;")
	private Class370 aClass370_4;

	@OriginalMember(owner = "client!re", name = "q", descriptor = "Z")
	private final boolean aBoolean714;

	@OriginalMember(owner = "client!re", name = "s", descriptor = "Lclient!w;")
	private Interface27 anInterface27_5;

	@OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lclient!jc;Lclient!wm;)V")
	public Class18_Sub6(@OriginalArg(0) Class65_Sub2_Sub2 arg0, @OriginalArg(1) Class390 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean459) {
			this.aClass370_5 = Static657.method8803(arg1.method8917("gl", "uw_ground_unlit"), arg0);
			this.aClass370_2 = Static657.method8803(arg1.method8917("gl", "uw_ground_lit"), arg0);
			this.aClass370_3 = Static657.method8803(arg1.method8917("gl", "uw_model_unlit"), arg0);
			this.aClass370_4 = Static657.method8803(arg1.method8917("gl", "uw_model_lit"), arg0);
			if (this.aClass370_3 != null & this.aClass370_5 != null & this.aClass370_2 != null & this.aClass370_4 != null) {
				this.anInterface27_5 = super.aClass65_Sub2_23.method4371(2, new int[] { 0, -1 }, 1, false);
				this.anInterface27_5.method5618(false, false);
				this.aBoolean714 = true;
			} else {
				this.aBoolean714 = false;
			}
		} else {
			this.aBoolean714 = false;
		}
	}

	@OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
	@Override
	public void method9003() {
		super.aClass65_Sub2_23.method4358(1);
		super.aClass65_Sub2_23.method4426((Interface25) null);
		super.aClass65_Sub2_23.method4432(Static606.aClass178_4, Static606.aClass178_4);
		super.aClass65_Sub2_23.method4400(Static536.aClass64_4, 0);
		super.aClass65_Sub2_23.method4400(Static413.aClass64_3, 2);
		super.aClass65_Sub2_23.method4369(0, Static536.aClass64_4);
		super.aClass65_Sub2_23.method4358(0);
		if (this.aBoolean716) {
			super.aClass65_Sub2_23.method4400(Static536.aClass64_4, 0);
			super.aClass65_Sub2_23.method4369(0, Static536.aClass64_4);
			this.aBoolean716 = false;
		}
		if (this.aBoolean715) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean715 = false;
		}
	}

	@OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
	@Override
	public void method9010() {
		if (!this.aBoolean715) {
			return;
		}
		@Pc(16) int local16 = super.aClass65_Sub2_23.XA();
		@Pc(20) int local20 = super.aClass65_Sub2_23.i();
		@Pc(30) float local30 = (float) local16 - (float) (local16 - local20) * 0.125F;
		@Pc(41) float local41 = (float) local16 - (float) (local16 - local20) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local41, local30, 1.0F / (float) super.aClass65_Sub2_23.method4406(), (float) super.aClass65_Sub2_23.method4414() / 255.0F);
		super.aClass65_Sub2_23.method4358(1);
		super.aClass65_Sub2_23.method4455(super.aClass65_Sub2_23.method4353());
		super.aClass65_Sub2_23.method4358(0);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9011(@OriginalArg(1) boolean arg0) {
		this.aBoolean717 = arg0;
		super.aClass65_Sub2_23.method4358(1);
		super.aClass65_Sub2_23.method4426(this.anInterface27_5);
		super.aClass65_Sub2_23.method4432(Static512.aClass178_3, Static138.aClass178_2);
		super.aClass65_Sub2_23.method4400(Static413.aClass64_3, 0);
		super.aClass65_Sub2_23.method4388(2, Static536.aClass64_4, true, false);
		super.aClass65_Sub2_23.method4369(0, Static169.aClass64_1);
		super.aClass65_Sub2_23.method4358(0);
		this.method9001();
	}

	@OriginalMember(owner = "client!re", name = "c", descriptor = "(B)V")
	@Override
	public void method9001() {
		@Pc(8) int local8 = super.aClass65_Sub2_23.method4476();
		@Pc(13) Class254_Sub2 local13 = super.aClass65_Sub2_23.method4468();
		if (this.aBoolean717) {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass370_2.anInt10313 : this.aClass370_4.anInt10313);
		} else {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass370_5.anInt10313 : this.aClass370_3.anInt10313);
		}
		OpenGL.glEnable(34336);
		this.aBoolean715 = true;
		local13.method6233((float) local8, this.aFloatArray84, -1.0F, 0.0F, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray84[0], this.aFloatArray84[1], this.aFloatArray84[2], this.aFloatArray84[3]);
		this.method9010();
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(BII)V")
	@Override
	public void method9012(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(Z)Z")
	@Override
	public boolean method9000() {
		return this.aBoolean714;
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method9009(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(ILclient!sfa;I)V")
	@Override
	public void method9006(@OriginalArg(0) int arg0, @OriginalArg(1) Interface25 arg1) {
		if (arg1 != null) {
			if (this.aBoolean716) {
				super.aClass65_Sub2_23.method4400(Static536.aClass64_4, 0);
				super.aClass65_Sub2_23.method4369(0, Static536.aClass64_4);
				this.aBoolean716 = false;
			}
			super.aClass65_Sub2_23.method4426(arg1);
			super.aClass65_Sub2_23.method4405(arg0);
		} else if (!this.aBoolean716) {
			super.aClass65_Sub2_23.method4426(super.aClass65_Sub2_23.anInterface25_3);
			super.aClass65_Sub2_23.method4405(1);
			super.aClass65_Sub2_23.method4400(Static169.aClass64_1, 0);
			super.aClass65_Sub2_23.method4369(0, Static169.aClass64_1);
			this.aBoolean716 = true;
		}
	}
}
