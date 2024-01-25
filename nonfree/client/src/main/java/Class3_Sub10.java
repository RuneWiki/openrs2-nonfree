import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ru")
public final class Class3_Sub10 extends Class3 {

	@OriginalMember(owner = "client!ru", name = "u", descriptor = "Z")
	private boolean aBoolean572;

	@OriginalMember(owner = "client!ru", name = "z", descriptor = "Z")
	private boolean aBoolean573;

	@OriginalMember(owner = "client!ru", name = "n", descriptor = "[F")
	private final float[] aFloatArray66 = new float[4];

	@OriginalMember(owner = "client!ru", name = "x", descriptor = "Lclient!qaa;")
	private Class264 aClass264_4;

	@OriginalMember(owner = "client!ru", name = "q", descriptor = "Lclient!qaa;")
	private Class264 aClass264_2;

	@OriginalMember(owner = "client!ru", name = "m", descriptor = "Lclient!qaa;")
	private Class264 aClass264_1;

	@OriginalMember(owner = "client!ru", name = "t", descriptor = "Lclient!qaa;")
	private Class264 aClass264_3;

	@OriginalMember(owner = "client!ru", name = "A", descriptor = "Z")
	private final boolean aBoolean574;

	@OriginalMember(owner = "client!ru", name = "y", descriptor = "Lclient!gn;")
	private Interface8 anInterface8_6;

	@OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lclient!qi;Lclient!ga;)V")
	public Class3_Sub10(@OriginalArg(0) Class12_Sub2_Sub2 arg0, @OriginalArg(1) Class111 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean559) {
			this.aClass264_4 = Static363.method6689(arg1.method2450("uw_ground_unlit", "gl"), arg0);
			this.aClass264_2 = Static363.method6689(arg1.method2450("uw_ground_lit", "gl"), arg0);
			this.aClass264_1 = Static363.method6689(arg1.method2450("uw_model_unlit", "gl"), arg0);
			this.aClass264_3 = Static363.method6689(arg1.method2450("uw_model_lit", "gl"), arg0);
			if (this.aClass264_3 != null & this.aClass264_2 != null & this.aClass264_4 != null & this.aClass264_1 != null) {
				this.anInterface8_6 = super.aClass12_Sub2_23.method6229(1, false, 2, new int[] { 0, -1 });
				this.anInterface8_6.method7331(false, false);
				this.aBoolean574 = true;
			} else {
				this.aBoolean574 = false;
			}
		} else {
			this.aBoolean574 = false;
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(III)V")
	@Override
	public void method7529(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(Lclient!ot;BI)V")
	@Override
	public void method7528(@OriginalArg(0) Interface18 arg0, @OriginalArg(2) int arg1) {
		super.aClass12_Sub2_23.method6159(arg0);
		super.aClass12_Sub2_23.method6249(arg1);
	}

	@OriginalMember(owner = "client!ru", name = "b", descriptor = "(B)V")
	@Override
	public void method7534() {
		super.aClass12_Sub2_23.method6196(1);
		super.aClass12_Sub2_23.method6159(null);
		super.aClass12_Sub2_23.method6241(Static9.aClass108_2, Static9.aClass108_2);
		super.aClass12_Sub2_23.method6179(Static587.aClass84_6, 0);
		super.aClass12_Sub2_23.method6179(Static135.aClass84_1, 2);
		super.aClass12_Sub2_23.method6234(0, Static587.aClass84_6);
		super.aClass12_Sub2_23.method6196(0);
		if (this.aBoolean573) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean573 = false;
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7533(@OriginalArg(1) boolean arg0) {
		this.aBoolean572 = arg0;
		super.aClass12_Sub2_23.method6196(1);
		super.aClass12_Sub2_23.method6159(this.anInterface8_6);
		super.aClass12_Sub2_23.method6241(Static240.aClass108_5, Static6.aClass108_7);
		super.aClass12_Sub2_23.method6179(Static135.aClass84_1, 0);
		super.aClass12_Sub2_23.method6280(2, Static587.aClass84_6, false, true);
		super.aClass12_Sub2_23.method6234(0, Static266.aClass84_5);
		super.aClass12_Sub2_23.method6196(0);
		this.method7532();
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7535(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7531() {
		return this.aBoolean574;
	}

	@OriginalMember(owner = "client!ru", name = "d", descriptor = "(I)V")
	@Override
	public void method7532() {
		@Pc(8) int local8 = super.aClass12_Sub2_23.method6282();
		@Pc(13) Class209_Sub2 local13 = super.aClass12_Sub2_23.method6198();
		if (this.aBoolean572) {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass264_2.anInt7124 : this.aClass264_3.anInt7124);
		} else {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass264_4.anInt7124 : this.aClass264_1.anInt7124);
		}
		OpenGL.glEnable(34336);
		this.aBoolean573 = true;
		local13.method4923(-1.0F, 0.0F, 0.0F, (float) local8, this.aFloatArray66);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray66[0], this.aFloatArray66[1], this.aFloatArray66[2], this.aFloatArray66[3]);
		this.method7525();
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V")
	@Override
	public void method7525() {
		if (!this.aBoolean573) {
			return;
		}
		@Pc(6) int local6 = super.aClass12_Sub2_23.U();
		@Pc(10) int local10 = super.aClass12_Sub2_23.BA();
		@Pc(21) float local21 = (float) local6 - (float) (local6 - local10) * 0.125F;
		@Pc(32) float local32 = (float) local6 - (float) (local6 - local10) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local32, local21, 1.0F / (float) super.aClass12_Sub2_23.method6224(), (float) super.aClass12_Sub2_23.method6220() / 255.0F);
		super.aClass12_Sub2_23.method6196(1);
		super.aClass12_Sub2_23.method6259(super.aClass12_Sub2_23.method6251());
		super.aClass12_Sub2_23.method6196(0);
	}
}
