import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jba")
public final class Class37_Sub4 extends Class37 {

	@OriginalMember(owner = "client!jba", name = "A", descriptor = "Lclient!nfa;")
	private final Class9_Sub3_Sub2 aClass9_Sub3_Sub2_5;

	@OriginalMember(owner = "client!jba", name = "v", descriptor = "Lclient!ie;")
	private final Class149 aClass149_4;

	@OriginalMember(owner = "client!jba", name = "s", descriptor = "Lclient!uaa;")
	private final Class311 aClass311_5;

	@OriginalMember(owner = "client!jba", name = "<init>", descriptor = "(Lclient!nfa;Lclient!jo;Lclient!ie;)V")
	public Class37_Sub4(@OriginalArg(0) Class9_Sub3_Sub2 arg0, @OriginalArg(1) Class168 arg1, @OriginalArg(2) Class149 arg2) {
		super(arg0);
		this.aClass9_Sub3_Sub2_5 = arg0;
		this.aClass149_4 = arg2;
		if (this.aClass149_4.method3987() && this.aClass9_Sub3_Sub2_5.aBoolean499) {
			this.aClass311_5 = Static356.method5768(this.aClass9_Sub3_Sub2_5, arg1.method4450("transparent_water", "gl"));
		} else {
			this.aClass311_5 = null;
		}
	}

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7565(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass311_5.anInt8967);
		OpenGL.glEnable(34336);
		super.aClass9_Sub3_19.method5596(Static49.aClass50_1, 0);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7559(@OriginalArg(0) boolean arg0) {
		super.aClass9_Sub3_19.method5598(Static167.aClass238_2, Static410.aClass238_3);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(ILclient!ld;B)V")
	@Override
	public void method7552(@OriginalArg(0) int arg0, @OriginalArg(1) Interface10 arg1) {
	}

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method7564() {
		return this.aClass311_5 != null;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(III)V")
	@Override
	public void method7563(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass149_4.aBoolean367) {
			@Pc(16) float local16 = (float) (super.aClass9_Sub3_19.anInt6563 % 4000) / 4000.0F;
			super.aClass9_Sub3_19.method5494(this.aClass149_4.anInterface19_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local16, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(42) int local42 = super.aClass9_Sub3_19.anInt6563 % 4000 * 16 / 4000;
			super.aClass9_Sub3_19.method5494(this.aClass149_4.anInterface1Array2[local42]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!jba", name = "f", descriptor = "(I)V")
	@Override
	public void method7561() {
		super.aClass9_Sub3_19.method5596(Static503.aClass50_4, 0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}
}
