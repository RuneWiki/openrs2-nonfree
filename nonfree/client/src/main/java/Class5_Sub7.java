import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class5_Sub7 extends Class5 {

	@OriginalMember(owner = "client!ln", name = "t", descriptor = "Z")
	private boolean aBoolean428;

	@OriginalMember(owner = "client!ln", name = "s", descriptor = "Z")
	private boolean aBoolean431;

	@OriginalMember(owner = "client!ln", name = "x", descriptor = "Z")
	private boolean aBoolean430 = false;

	@OriginalMember(owner = "client!ln", name = "C", descriptor = "[F")
	private final float[] aFloatArray46 = new float[4];

	@OriginalMember(owner = "client!ln", name = "D", descriptor = "Lclient!un;")
	private Class368 aClass368_3;

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "Lclient!un;")
	private Class368 aClass368_2;

	@OriginalMember(owner = "client!ln", name = "F", descriptor = "Lclient!un;")
	private Class368 aClass368_4;

	@OriginalMember(owner = "client!ln", name = "B", descriptor = "Lclient!un;")
	private Class368 aClass368_5;

	@OriginalMember(owner = "client!ln", name = "y", descriptor = "Lclient!gka;")
	private Interface9 anInterface9_4;

	@OriginalMember(owner = "client!ln", name = "E", descriptor = "Z")
	private final boolean aBoolean429;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!md;Lclient!rg;)V")
	public Class5_Sub7(@OriginalArg(0) Class144_Sub1_Sub2 arg0, @OriginalArg(1) Class310 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean470) {
			this.aClass368_3 = Static641.method8996(arg1.method7801("uw_ground_unlit", "gl"), arg0);
			this.aClass368_2 = Static641.method8996(arg1.method7801("uw_ground_lit", "gl"), arg0);
			this.aClass368_4 = Static641.method8996(arg1.method7801("uw_model_unlit", "gl"), arg0);
			this.aClass368_5 = Static641.method8996(arg1.method7801("uw_model_lit", "gl"), arg0);
			if (this.aClass368_5 != null & this.aClass368_4 != null & this.aClass368_3 != null & this.aClass368_2 != null) {
				this.anInterface9_4 = super.aClass144_Sub1_20.method5687(2, false, 1, new int[] { 0, -1 });
				this.anInterface9_4.method4773(false, false);
				this.aBoolean429 = true;
			} else {
				this.aBoolean429 = false;
			}
		} else {
			this.aBoolean429 = false;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZI)V")
	@Override
	public void method6878(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ZII)V")
	@Override
	public void method6864(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZ)V")
	@Override
	public void method6873(@OriginalArg(1) boolean arg0) {
		this.aBoolean431 = arg0;
		super.aClass144_Sub1_20.method5706(1);
		super.aClass144_Sub1_20.method5643(this.anInterface9_4);
		super.aClass144_Sub1_20.method5653(Static284.aClass287_1, Static448.aClass287_4);
		super.aClass144_Sub1_20.method5740(Static216.aClass138_5, 0);
		super.aClass144_Sub1_20.method5775(2, Static308.aClass138_4, true, false);
		super.aClass144_Sub1_20.method5779(0, Static225.aClass138_3);
		super.aClass144_Sub1_20.method5706(0);
		this.method6866();
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)V")
	@Override
	public void method6865() {
		super.aClass144_Sub1_20.method5706(1);
		super.aClass144_Sub1_20.method5643((Interface25) null);
		super.aClass144_Sub1_20.method5653(Static345.aClass287_2, Static345.aClass287_2);
		super.aClass144_Sub1_20.method5740(Static308.aClass138_4, 0);
		super.aClass144_Sub1_20.method5740(Static216.aClass138_5, 2);
		super.aClass144_Sub1_20.method5779(0, Static308.aClass138_4);
		super.aClass144_Sub1_20.method5706(0);
		if (this.aBoolean430) {
			super.aClass144_Sub1_20.method5740(Static308.aClass138_4, 0);
			super.aClass144_Sub1_20.method5779(0, Static308.aClass138_4);
			this.aBoolean430 = false;
		}
		if (this.aBoolean428) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean428 = false;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V")
	@Override
	public void method6868() {
		if (!this.aBoolean428) {
			return;
		}
		@Pc(19) int local19 = super.aClass144_Sub1_20.XA();
		@Pc(23) int local23 = super.aClass144_Sub1_20.i();
		@Pc(35) float local35 = -((float) (local19 - local23) * 0.125F) + (float) local19;
		@Pc(46) float local46 = (float) local19 - (float) (local19 - local23) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local46, local35, 1.0F / (float) super.aClass144_Sub1_20.method5701(), (float) super.aClass144_Sub1_20.method5658() / 255.0F);
		super.aClass144_Sub1_20.method5706(1);
		super.aClass144_Sub1_20.method5655(super.aClass144_Sub1_20.method5684());
		super.aClass144_Sub1_20.method5706(0);
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method6867() {
		return this.aBoolean429;
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IILclient!vi;)V")
	@Override
	public void method6877(@OriginalArg(0) int arg0, @OriginalArg(2) Interface25 arg1) {
		if (arg1 != null) {
			if (this.aBoolean430) {
				super.aClass144_Sub1_20.method5740(Static308.aClass138_4, 0);
				super.aClass144_Sub1_20.method5779(0, Static308.aClass138_4);
				this.aBoolean430 = false;
			}
			super.aClass144_Sub1_20.method5643(arg1);
			super.aClass144_Sub1_20.method5723(arg0);
		} else if (!this.aBoolean430) {
			super.aClass144_Sub1_20.method5643(super.aClass144_Sub1_20.anInterface25_3);
			super.aClass144_Sub1_20.method5723(1);
			super.aClass144_Sub1_20.method5740(Static225.aClass138_3, 0);
			super.aClass144_Sub1_20.method5779(0, Static225.aClass138_3);
			this.aBoolean430 = true;
		}
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V")
	@Override
	public void method6866() {
		@Pc(16) int local16 = super.aClass144_Sub1_20.method5676();
		@Pc(21) Class263_Sub2 local21 = super.aClass144_Sub1_20.method5674();
		if (this.aBoolean431) {
			OpenGL.glBindProgramARB(34336, ~local16 == Integer.MIN_VALUE ? this.aClass368_2.anInt10238 : this.aClass368_5.anInt10238);
		} else {
			OpenGL.glBindProgramARB(34336, ~local16 == Integer.MIN_VALUE ? this.aClass368_3.anInt10238 : this.aClass368_4.anInt10238);
		}
		OpenGL.glEnable(34336);
		this.aBoolean428 = true;
		local21.method7286((float) local16, 0.0F, -1.0F, 0.0F, this.aFloatArray46);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray46[0], this.aFloatArray46[1], this.aFloatArray46[2], this.aFloatArray46[3]);
		this.method6868();
	}
}
