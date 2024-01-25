import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class3_Sub11 extends Class3 {

	@OriginalMember(owner = "client!vj", name = "i", descriptor = "Lclient!qi;")
	private final Class12_Sub2_Sub2 aClass12_Sub2_Sub2_12;

	@OriginalMember(owner = "client!vj", name = "p", descriptor = "Lclient!ln;")
	private final Class204 aClass204_8;

	@OriginalMember(owner = "client!vj", name = "q", descriptor = "Lclient!qaa;")
	private final Class264 aClass264_5;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Lclient!qi;Lclient!ga;Lclient!ln;)V")
	public Class3_Sub11(@OriginalArg(0) Class12_Sub2_Sub2 arg0, @OriginalArg(1) Class111 arg1, @OriginalArg(2) Class204 arg2) {
		super(arg0);
		this.aClass12_Sub2_Sub2_12 = arg0;
		this.aClass204_8 = arg2;
		if (arg1 != null && this.aClass204_8.method4712() && this.aClass12_Sub2_Sub2_12.aBoolean559) {
			this.aClass264_5 = Static363.method6689(arg1.method2450("transparent_water", "gl"), this.aClass12_Sub2_Sub2_12);
		} else {
			this.aClass264_5 = null;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7533(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass264_5.anInt7124);
		OpenGL.glEnable(34336);
		super.aClass12_Sub2_23.method6179(Static266.aClass84_5, 0);
	}

	@OriginalMember(owner = "client!vj", name = "b", descriptor = "(B)V")
	@Override
	public void method7534() {
		super.aClass12_Sub2_23.method6179(Static587.aClass84_6, 0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7535(@OriginalArg(0) boolean arg0) {
		super.aClass12_Sub2_23.method6241(Static466.aClass108_4, Static240.aClass108_5);
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(III)V")
	@Override
	public void method7529(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass204_8.aBoolean413) {
			@Pc(44) float local44 = (float) (super.aClass12_Sub2_23.anInt7542 % 4000) / 4000.0F;
			super.aClass12_Sub2_23.method6159(this.aClass204_8.anInterface4_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local44, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(17) int local17 = super.aClass12_Sub2_23.anInt7542 % 4000 * 16 / 4000;
			super.aClass12_Sub2_23.method6159(this.aClass204_8.anInterface8Array2[local17]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!ot;BI)V")
	@Override
	public void method7528(@OriginalArg(0) Interface18 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7531() {
		return this.aClass264_5 != null;
	}
}
