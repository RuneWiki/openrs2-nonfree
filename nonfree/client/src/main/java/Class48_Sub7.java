import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lka")
public final class Class48_Sub7 extends Class48 {

	@OriginalMember(owner = "client!lka", name = "C", descriptor = "Z")
	private boolean aBoolean374;

	@OriginalMember(owner = "client!lka", name = "u", descriptor = "Z")
	private boolean aBoolean376;

	@OriginalMember(owner = "client!lka", name = "z", descriptor = "Z")
	private boolean aBoolean375 = false;

	@OriginalMember(owner = "client!lka", name = "o", descriptor = "[F")
	private final float[] aFloatArray47 = new float[4];

	@OriginalMember(owner = "client!lka", name = "v", descriptor = "Z")
	private final boolean aBoolean377;

	@OriginalMember(owner = "client!lka", name = "q", descriptor = "Lclient!wja;")
	private Class394 aClass394_5;

	@OriginalMember(owner = "client!lka", name = "t", descriptor = "Lclient!wja;")
	private Class394 aClass394_2;

	@OriginalMember(owner = "client!lka", name = "E", descriptor = "Lclient!wja;")
	private Class394 aClass394_3;

	@OriginalMember(owner = "client!lka", name = "m", descriptor = "Lclient!wja;")
	private Class394 aClass394_4;

	@OriginalMember(owner = "client!lka", name = "n", descriptor = "Lclient!ah;")
	private Interface2 anInterface2_3;

	@OriginalMember(owner = "client!lka", name = "<init>", descriptor = "(Lclient!tia;Lclient!gda;)V")
	public Class48_Sub7(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class126 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean636) {
			this.aClass394_5 = Static37.method8304(arg1.method3073("uw_ground_unlit", "gl"), arg0);
			this.aClass394_2 = Static37.method8304(arg1.method3073("uw_ground_lit", "gl"), arg0);
			this.aClass394_3 = Static37.method8304(arg1.method3073("uw_model_unlit", "gl"), arg0);
			this.aClass394_4 = Static37.method8304(arg1.method3073("uw_model_lit", "gl"), arg0);
			if (this.aClass394_4 != null & this.aClass394_3 != null & this.aClass394_2 != null & this.aClass394_5 != null) {
				this.anInterface2_3 = super.aClass100_Sub1_23.method7875(false, 2, new int[] { 0, -1 }, 1);
				this.anInterface2_3.method3687(false, false);
				this.aBoolean377 = true;
			} else {
				this.aBoolean377 = false;
			}
		} else {
			this.aBoolean377 = false;
		}
	}

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(Lclient!ln;BI)V")
	@Override
	public void method8933(@OriginalArg(0) Interface19 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean375) {
				super.aClass100_Sub1_23.method7970(Static94.aClass93_2, 0);
				super.aClass100_Sub1_23.method7947(Static94.aClass93_2, 0);
				this.aBoolean375 = false;
			}
			super.aClass100_Sub1_23.method7923(arg0);
			super.aClass100_Sub1_23.method7962(arg1);
		} else if (!this.aBoolean375) {
			super.aClass100_Sub1_23.method7923(super.aClass100_Sub1_23.anInterface19_3);
			super.aClass100_Sub1_23.method7962(1);
			super.aClass100_Sub1_23.method7970(Static237.aClass93_3, 0);
			super.aClass100_Sub1_23.method7947(Static237.aClass93_3, 0);
			this.aBoolean375 = true;
		}
	}

	@OriginalMember(owner = "client!lka", name = "f", descriptor = "(I)Z")
	@Override
	public boolean method8940() {
		return this.aBoolean377;
	}

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(B)V")
	@Override
	public void method8931() {
		@Pc(19) int local19 = super.aClass100_Sub1_23.method7950();
		@Pc(26) Class10_Sub2 local26 = super.aClass100_Sub1_23.method7861();
		if (this.aBoolean376) {
			OpenGL.glBindProgramARB(34336, local19 == Integer.MAX_VALUE ? this.aClass394_2.anInt10800 : this.aClass394_4.anInt10800);
		} else {
			OpenGL.glBindProgramARB(34336, ~local19 == Integer.MIN_VALUE ? this.aClass394_5.anInt10800 : this.aClass394_3.anInt10800);
		}
		OpenGL.glEnable(34336);
		this.aBoolean374 = true;
		local26.method1707(0.0F, (float) local19, -1.0F, 0.0F, this.aFloatArray47);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray47[0], this.aFloatArray47[1], this.aFloatArray47[2], this.aFloatArray47[3]);
		this.method8937();
	}

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8938(@OriginalArg(0) boolean arg0) {
		this.aBoolean376 = arg0;
		super.aClass100_Sub1_23.method7941(1);
		super.aClass100_Sub1_23.method7923(this.anInterface2_3);
		super.aClass100_Sub1_23.method7904(Static164.aClass94_1, Static280.aClass94_2);
		super.aClass100_Sub1_23.method7970(Static520.aClass93_4, 0);
		super.aClass100_Sub1_23.method7883(true, Static94.aClass93_2, false, 2);
		super.aClass100_Sub1_23.method7947(Static237.aClass93_3, 0);
		super.aClass100_Sub1_23.method7941(0);
		this.method8931();
	}

	@OriginalMember(owner = "client!lka", name = "b", descriptor = "(I)V")
	@Override
	public void method8937() {
		if (!this.aBoolean374) {
			return;
		}
		@Pc(6) int local6 = super.aClass100_Sub1_23.XA();
		@Pc(10) int local10 = super.aClass100_Sub1_23.i();
		@Pc(22) float local22 = -((float) (local6 - local10) * 0.125F) + (float) local6;
		@Pc(34) float local34 = -((float) (local6 - local10) * 0.25F) + (float) local6;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local34, local22, 1.0F / (float) super.aClass100_Sub1_23.method7968(), (float) super.aClass100_Sub1_23.method7886() / 255.0F);
		super.aClass100_Sub1_23.method7941(1);
		super.aClass100_Sub1_23.method7873(super.aClass100_Sub1_23.method7911());
		super.aClass100_Sub1_23.method7941(0);
	}

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(III)V")
	@Override
	public void method8935(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(Z)V")
	@Override
	public void method8934() {
		super.aClass100_Sub1_23.method7941(1);
		super.aClass100_Sub1_23.method7923((Interface19) null);
		super.aClass100_Sub1_23.method7904(Static653.aClass94_5, Static653.aClass94_5);
		super.aClass100_Sub1_23.method7970(Static94.aClass93_2, 0);
		super.aClass100_Sub1_23.method7970(Static520.aClass93_4, 2);
		super.aClass100_Sub1_23.method7947(Static94.aClass93_2, 0);
		super.aClass100_Sub1_23.method7941(0);
		if (this.aBoolean375) {
			super.aClass100_Sub1_23.method7970(Static94.aClass93_2, 0);
			super.aClass100_Sub1_23.method7947(Static94.aClass93_2, 0);
			this.aBoolean375 = false;
		}
		if (this.aBoolean374) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean374 = false;
		}
	}

	@OriginalMember(owner = "client!lka", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8941(@OriginalArg(1) boolean arg0) {
	}
}
