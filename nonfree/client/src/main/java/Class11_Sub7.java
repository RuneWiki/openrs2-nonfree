import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class11_Sub7 extends Class11 {

	@OriginalMember(owner = "client!nd", name = "o", descriptor = "Z")
	private boolean aBoolean481;

	@OriginalMember(owner = "client!nd", name = "w", descriptor = "Z")
	private boolean aBoolean483;

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "[F")
	private final float[] aFloatArray60 = new float[4];

	@OriginalMember(owner = "client!nd", name = "A", descriptor = "Z")
	private boolean aBoolean484 = false;

	@OriginalMember(owner = "client!nd", name = "r", descriptor = "Z")
	private final boolean aBoolean482;

	@OriginalMember(owner = "client!nd", name = "H", descriptor = "Lclient!kca;")
	private Class171 aClass171_3;

	@OriginalMember(owner = "client!nd", name = "F", descriptor = "Lclient!kca;")
	private Class171 aClass171_2;

	@OriginalMember(owner = "client!nd", name = "I", descriptor = "Lclient!kca;")
	private Class171 aClass171_4;

	@OriginalMember(owner = "client!nd", name = "J", descriptor = "Lclient!kca;")
	private Class171 aClass171_5;

	@OriginalMember(owner = "client!nd", name = "K", descriptor = "Lclient!oq;")
	private Interface20 anInterface20_4;

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Lclient!ai;Lclient!oh;)V")
	public Class11_Sub7(@OriginalArg(0) Class16_Sub1_Sub1 arg0, @OriginalArg(1) Class237 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean70) {
			this.aClass171_3 = Static91.method2153(arg0, arg1.method6304("gl", "uw_ground_unlit"));
			this.aClass171_2 = Static91.method2153(arg0, arg1.method6304("gl", "uw_ground_lit"));
			this.aClass171_4 = Static91.method2153(arg0, arg1.method6304("gl", "uw_model_unlit"));
			this.aClass171_5 = Static91.method2153(arg0, arg1.method6304("gl", "uw_model_lit"));
			if (this.aClass171_5 != null & this.aClass171_4 != null & this.aClass171_3 != null & this.aClass171_2 != null) {
				this.anInterface20_4 = super.aClass16_Sub1_21.method3948(new int[] { 0, -1 }, 1, 2, false);
				this.anInterface20_4.method6623(false, false);
				this.aBoolean482 = true;
			} else {
				this.aBoolean482 = false;
			}
		} else {
			this.aBoolean482 = false;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7357(@OriginalArg(0) boolean arg0) {
		this.aBoolean483 = arg0;
		super.aClass16_Sub1_21.method3899(1);
		super.aClass16_Sub1_21.method3889(this.anInterface20_4);
		super.aClass16_Sub1_21.method3924(Static428.aClass34_5, Static584.aClass34_6);
		super.aClass16_Sub1_21.method3946(0, Static190.aClass265_8);
		super.aClass16_Sub1_21.method4000(false, true, 2, Static625.aClass265_10);
		super.aClass16_Sub1_21.method3950(0, Static613.aClass265_9);
		super.aClass16_Sub1_21.method3899(0);
		this.method7364();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!ke;BI)V")
	@Override
	public void method7354(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean484) {
				super.aClass16_Sub1_21.method3946(0, Static625.aClass265_10);
				super.aClass16_Sub1_21.method3950(0, Static625.aClass265_10);
				this.aBoolean484 = false;
			}
			super.aClass16_Sub1_21.method3889(arg0);
			super.aClass16_Sub1_21.method3937(arg1);
		} else if (!this.aBoolean484) {
			super.aClass16_Sub1_21.method3889(super.aClass16_Sub1_21.anInterface12_3);
			super.aClass16_Sub1_21.method3937(1);
			super.aClass16_Sub1_21.method3946(0, Static613.aClass265_9);
			super.aClass16_Sub1_21.method3950(0, Static613.aClass265_9);
			this.aBoolean484 = true;
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)V")
	@Override
	public void method7363() {
		if (!this.aBoolean481) {
			return;
		}
		@Pc(11) int local11 = super.aClass16_Sub1_21.XA();
		@Pc(15) int local15 = super.aClass16_Sub1_21.i();
		@Pc(26) float local26 = (float) local11 - (float) (local11 - local15) * 0.125F;
		@Pc(37) float local37 = (float) local11 - (float) (local11 - local15) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local37, local26, 1.0F / (float) super.aClass16_Sub1_21.method3905(), (float) super.aClass16_Sub1_21.method3975() / 255.0F);
		super.aClass16_Sub1_21.method3899(1);
		super.aClass16_Sub1_21.method3939(super.aClass16_Sub1_21.method4004());
		super.aClass16_Sub1_21.method3899(0);
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7360() {
		return this.aBoolean482;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
	@Override
	public void method7356() {
		super.aClass16_Sub1_21.method3899(1);
		super.aClass16_Sub1_21.method3889(null);
		super.aClass16_Sub1_21.method3924(Static402.aClass34_4, Static402.aClass34_4);
		super.aClass16_Sub1_21.method3946(0, Static625.aClass265_10);
		super.aClass16_Sub1_21.method3946(2, Static190.aClass265_8);
		super.aClass16_Sub1_21.method3950(0, Static625.aClass265_10);
		super.aClass16_Sub1_21.method3899(0);
		if (this.aBoolean484) {
			super.aClass16_Sub1_21.method3946(0, Static625.aClass265_10);
			super.aClass16_Sub1_21.method3950(0, Static625.aClass265_10);
			this.aBoolean484 = false;
		}
		if (this.aBoolean481) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean481 = false;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7355(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(B)V")
	@Override
	public void method7364() {
		@Pc(8) int local8 = super.aClass16_Sub1_21.method3925();
		@Pc(13) Class54_Sub3 local13 = super.aClass16_Sub1_21.method3904();
		if (this.aBoolean483) {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass171_2.anInt5758 : this.aClass171_5.anInt5758);
		} else {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass171_3.anInt5758 : this.aClass171_4.anInt5758);
		}
		OpenGL.glEnable(34336);
		this.aBoolean481 = true;
		local13.method5165(-1.0F, 0.0F, 0.0F, (float) local8, this.aFloatArray60);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray60[0], this.aFloatArray60[1], this.aFloatArray60[2], this.aFloatArray60[3]);
		this.method7363();
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIZ)V")
	@Override
	public void method7359(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}
}
