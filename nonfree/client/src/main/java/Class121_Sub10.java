import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tda")
public final class Class121_Sub10 extends Class121 {

	@OriginalMember(owner = "client!tda", name = "B", descriptor = "Z")
	private boolean aBoolean711;

	@OriginalMember(owner = "client!tda", name = "p", descriptor = "Z")
	private boolean aBoolean712;

	@OriginalMember(owner = "client!tda", name = "n", descriptor = "Z")
	private boolean aBoolean710 = false;

	@OriginalMember(owner = "client!tda", name = "z", descriptor = "[F")
	private final float[] aFloatArray100 = new float[4];

	@OriginalMember(owner = "client!tda", name = "k", descriptor = "Z")
	private final boolean aBoolean713;

	@OriginalMember(owner = "client!tda", name = "u", descriptor = "Lclient!mn;")
	private Class242 aClass242_2;

	@OriginalMember(owner = "client!tda", name = "y", descriptor = "Lclient!mn;")
	private Class242 aClass242_3;

	@OriginalMember(owner = "client!tda", name = "w", descriptor = "Lclient!mn;")
	private Class242 aClass242_4;

	@OriginalMember(owner = "client!tda", name = "o", descriptor = "Lclient!mn;")
	private Class242 aClass242_5;

	@OriginalMember(owner = "client!tda", name = "q", descriptor = "Lclient!gp;")
	private Interface6 anInterface6_5;

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Lclient!lt;Lclient!lb;)V")
	public Class121_Sub10(@OriginalArg(0) Class67_Sub1_Sub2 arg0, @OriginalArg(1) Class221 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean531) {
			this.aClass242_2 = Static16.method289(arg1.method5076("uw_ground_unlit", "gl"), arg0);
			this.aClass242_3 = Static16.method289(arg1.method5076("uw_ground_lit", "gl"), arg0);
			this.aClass242_4 = Static16.method289(arg1.method5076("uw_model_unlit", "gl"), arg0);
			this.aClass242_5 = Static16.method289(arg1.method5076("uw_model_lit", "gl"), arg0);
			if (this.aClass242_2 != null & this.aClass242_3 != null & this.aClass242_4 != null & this.aClass242_5 != null) {
				this.anInterface6_5 = super.aClass67_Sub1_23.method5567(2, false, 1, new int[] { 0, -1 });
				this.anInterface6_5.method9275(false, false);
				this.aBoolean713 = true;
			} else {
				this.aBoolean713 = false;
			}
		} else {
			this.aBoolean713 = false;
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(I)V")
	@Override
	public void method9240() {
		if (!this.aBoolean712) {
			return;
		}
		@Pc(10) int local10 = super.aClass67_Sub1_23.XA();
		@Pc(14) int local14 = super.aClass67_Sub1_23.i();
		@Pc(26) float local26 = -((float) (local10 - local14) * 0.125F) + (float) local10;
		@Pc(37) float local37 = (float) local10 - (float) (local10 - local14) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local37, local26, 1.0F / (float) super.aClass67_Sub1_23.method5596(), (float) super.aClass67_Sub1_23.method5634() / 255.0F);
		super.aClass67_Sub1_23.method5687(1);
		super.aClass67_Sub1_23.method5588(super.aClass67_Sub1_23.method5647());
		super.aClass67_Sub1_23.method5687(0);
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(III)V")
	@Override
	public void method9236(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "(B)V")
	@Override
	public void method9242() {
		@Pc(13) int local13 = super.aClass67_Sub1_23.method5654();
		@Pc(18) Class181_Sub1 local18 = super.aClass67_Sub1_23.method5619();
		if (this.aBoolean711) {
			OpenGL.glBindProgramARB(34336, local13 == Integer.MAX_VALUE ? this.aClass242_3.anInt7166 : this.aClass242_5.anInt7166);
		} else {
			OpenGL.glBindProgramARB(34336, local13 == Integer.MAX_VALUE ? this.aClass242_2.anInt7166 : this.aClass242_4.anInt7166);
		}
		OpenGL.glEnable(34336);
		this.aBoolean712 = true;
		local18.method4921(0.0F, (float) local13, 0.0F, this.aFloatArray100, -1.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray100[0], this.aFloatArray100[1], this.aFloatArray100[2], this.aFloatArray100[3]);
		this.method9240();
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(IZ)V")
	@Override
	public void method9231(@OriginalArg(1) boolean arg0) {
		this.aBoolean711 = arg0;
		super.aClass67_Sub1_23.method5687(1);
		super.aClass67_Sub1_23.method5612(this.anInterface6_5);
		super.aClass67_Sub1_23.method5686(Static477.aClass37_1, Static573.aClass37_3);
		super.aClass67_Sub1_23.method5590(0, Static472.aClass58_3);
		super.aClass67_Sub1_23.method5641(true, false, Static143.aClass58_1, 2);
		super.aClass67_Sub1_23.method5674(0, Static273.aClass58_2);
		super.aClass67_Sub1_23.method5687(0);
		this.method9242();
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(B)V")
	@Override
	public void method9232() {
		super.aClass67_Sub1_23.method5687(1);
		super.aClass67_Sub1_23.method5612((Interface12) null);
		super.aClass67_Sub1_23.method5686(Static496.aClass37_2, Static496.aClass37_2);
		super.aClass67_Sub1_23.method5590(0, Static143.aClass58_1);
		super.aClass67_Sub1_23.method5590(2, Static472.aClass58_3);
		super.aClass67_Sub1_23.method5674(0, Static143.aClass58_1);
		super.aClass67_Sub1_23.method5687(0);
		if (this.aBoolean710) {
			super.aClass67_Sub1_23.method5590(0, Static143.aClass58_1);
			super.aClass67_Sub1_23.method5674(0, Static143.aClass58_1);
			this.aBoolean710 = false;
		}
		if (this.aBoolean712) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean712 = false;
		}
	}

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method9241() {
		return this.aBoolean713;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!ip;II)V")
	@Override
	public void method9244(@OriginalArg(0) Interface12 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean710) {
				super.aClass67_Sub1_23.method5590(0, Static143.aClass58_1);
				super.aClass67_Sub1_23.method5674(0, Static143.aClass58_1);
				this.aBoolean710 = false;
			}
			super.aClass67_Sub1_23.method5612(arg0);
			super.aClass67_Sub1_23.method5655(arg1);
		} else if (!this.aBoolean710) {
			super.aClass67_Sub1_23.method5612(super.aClass67_Sub1_23.anInterface12_3);
			super.aClass67_Sub1_23.method5655(1);
			super.aClass67_Sub1_23.method5590(0, Static273.aClass58_2);
			super.aClass67_Sub1_23.method5674(0, Static273.aClass58_2);
			this.aBoolean710 = true;
		}
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(IZ)V")
	@Override
	public void method9239(@OriginalArg(1) boolean arg0) {
	}
}
