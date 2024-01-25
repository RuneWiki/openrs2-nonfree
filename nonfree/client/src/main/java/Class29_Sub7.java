import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jea")
public final class Class29_Sub7 extends Class29 {

	@OriginalMember(owner = "client!jea", name = "y", descriptor = "Z")
	private boolean aBoolean315;

	@OriginalMember(owner = "client!jea", name = "H", descriptor = "Z")
	private boolean aBoolean317;

	@OriginalMember(owner = "client!jea", name = "x", descriptor = "[F")
	private final float[] aFloatArray31 = new float[4];

	@OriginalMember(owner = "client!jea", name = "t", descriptor = "Z")
	private boolean aBoolean314 = false;

	@OriginalMember(owner = "client!jea", name = "I", descriptor = "Z")
	private final boolean aBoolean318;

	@OriginalMember(owner = "client!jea", name = "C", descriptor = "Lclient!ob;")
	private Class242 aClass242_3;

	@OriginalMember(owner = "client!jea", name = "E", descriptor = "Lclient!ob;")
	private Class242 aClass242_4;

	@OriginalMember(owner = "client!jea", name = "r", descriptor = "Lclient!ob;")
	private Class242 aClass242_1;

	@OriginalMember(owner = "client!jea", name = "s", descriptor = "Lclient!ob;")
	private Class242 aClass242_2;

	@OriginalMember(owner = "client!jea", name = "q", descriptor = "Lclient!ug;")
	private Interface24 anInterface24_3;

	@OriginalMember(owner = "client!jea", name = "<init>", descriptor = "(Lclient!mba;Lclient!la;)V")
	public Class29_Sub7(@OriginalArg(0) Class5_Sub1_Sub2 arg0, @OriginalArg(1) Class196 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean483) {
			this.aClass242_3 = Static561.method8093(arg1.method5093("gl", "uw_ground_unlit"), arg0);
			this.aClass242_4 = Static561.method8093(arg1.method5093("gl", "uw_ground_lit"), arg0);
			this.aClass242_1 = Static561.method8093(arg1.method5093("gl", "uw_model_unlit"), arg0);
			this.aClass242_2 = Static561.method8093(arg1.method5093("gl", "uw_model_lit"), arg0);
			if (this.aClass242_1 != null & this.aClass242_4 != null & this.aClass242_3 != null & this.aClass242_2 != null) {
				this.anInterface24_3 = super.aClass5_Sub1_22.method5633(false, 1, 2, new int[] { 0, -1 });
				this.anInterface24_3.method7475(false, false);
				this.aBoolean318 = true;
			} else {
				this.aBoolean318 = false;
			}
		} else {
			this.aBoolean318 = false;
		}
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(III)V")
	@Override
	public void method8083(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(I)V")
	@Override
	public void method8071() {
		super.aClass5_Sub1_22.method5571(1);
		super.aClass5_Sub1_22.method5609(null);
		super.aClass5_Sub1_22.method5682(Static514.aClass374_5, Static514.aClass374_5);
		super.aClass5_Sub1_22.method5583(Static333.aClass9_2, 0);
		super.aClass5_Sub1_22.method5583(Static161.aClass9_3, 2);
		super.aClass5_Sub1_22.method5592(Static333.aClass9_2, 0);
		super.aClass5_Sub1_22.method5571(0);
		if (this.aBoolean314) {
			super.aClass5_Sub1_22.method5583(Static333.aClass9_2, 0);
			super.aClass5_Sub1_22.method5592(Static333.aClass9_2, 0);
			this.aBoolean314 = false;
		}
		if (this.aBoolean315) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean315 = false;
		}
	}

	@OriginalMember(owner = "client!jea", name = "h", descriptor = "(I)V")
	@Override
	public void method8084() {
		if (!this.aBoolean315) {
			return;
		}
		@Pc(6) int local6 = super.aClass5_Sub1_22.XA();
		@Pc(10) int local10 = super.aClass5_Sub1_22.i();
		@Pc(22) float local22 = -((float) (local6 - local10) * 0.125F) + (float) local6;
		@Pc(32) float local32 = (float) local6 - (float) (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local32, local22, 1.0F / (float) super.aClass5_Sub1_22.method5689(), (float) super.aClass5_Sub1_22.method5577() / 255.0F);
		super.aClass5_Sub1_22.method5571(1);
		super.aClass5_Sub1_22.method5574(super.aClass5_Sub1_22.method5696());
		super.aClass5_Sub1_22.method5571(0);
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8067(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(IILclient!ec;)V")
	@Override
	public void method8072(@OriginalArg(1) int arg0, @OriginalArg(2) Interface10 arg1) {
		if (arg1 != null) {
			if (this.aBoolean314) {
				super.aClass5_Sub1_22.method5583(Static333.aClass9_2, 0);
				super.aClass5_Sub1_22.method5592(Static333.aClass9_2, 0);
				this.aBoolean314 = false;
			}
			super.aClass5_Sub1_22.method5609(arg1);
			super.aClass5_Sub1_22.method5697(arg0);
		} else if (!this.aBoolean314) {
			super.aClass5_Sub1_22.method5609(super.aClass5_Sub1_22.anInterface10_3);
			super.aClass5_Sub1_22.method5697(1);
			super.aClass5_Sub1_22.method5583(Static482.aClass9_4, 0);
			super.aClass5_Sub1_22.method5592(Static482.aClass9_4, 0);
			this.aBoolean314 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!jea", name = "d", descriptor = "(I)V")
	@Override
	public void method8076() {
		@Pc(8) int local8 = super.aClass5_Sub1_22.method5588();
		@Pc(13) Class39_Sub1 local13 = super.aClass5_Sub1_22.method5646();
		if (this.aBoolean317) {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass242_4.anInt7252 : this.aClass242_2.anInt7252);
		} else {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass242_3.anInt7252 : this.aClass242_1.anInt7252);
		}
		OpenGL.glEnable(34336);
		this.aBoolean315 = true;
		local13.method1553(-1.0F, this.aFloatArray31, (float) 0, (float) local8, 0.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray31[0], this.aFloatArray31[1], this.aFloatArray31[2], this.aFloatArray31[3]);
		this.method8084();
	}

	@OriginalMember(owner = "client!jea", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8080(@OriginalArg(1) boolean arg0) {
		this.aBoolean317 = arg0;
		super.aClass5_Sub1_22.method5571(1);
		super.aClass5_Sub1_22.method5609(this.anInterface24_3);
		super.aClass5_Sub1_22.method5682(Static314.aClass374_2, Static275.aClass374_1);
		super.aClass5_Sub1_22.method5583(Static161.aClass9_3, 0);
		super.aClass5_Sub1_22.method5618(false, true, 2, Static333.aClass9_2);
		super.aClass5_Sub1_22.method5592(Static482.aClass9_4, 0);
		super.aClass5_Sub1_22.method5571(0);
		this.method8076();
	}

	@OriginalMember(owner = "client!jea", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8073() {
		return this.aBoolean318;
	}
}
