import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bj")
public final class Class34_Sub1 extends Class34 {

	@OriginalMember(owner = "client!bj", name = "z", descriptor = "Z")
	private boolean aBoolean56;

	@OriginalMember(owner = "client!bj", name = "E", descriptor = "Z")
	private boolean aBoolean57;

	@OriginalMember(owner = "client!bj", name = "q", descriptor = "[F")
	private final float[] aFloatArray7 = new float[4];

	@OriginalMember(owner = "client!bj", name = "s", descriptor = "Z")
	private final boolean aBoolean55;

	@OriginalMember(owner = "client!bj", name = "A", descriptor = "Lclient!ch;")
	private Class53 aClass53_3;

	@OriginalMember(owner = "client!bj", name = "C", descriptor = "Lclient!ch;")
	private Class53 aClass53_4;

	@OriginalMember(owner = "client!bj", name = "l", descriptor = "Lclient!ch;")
	private Class53 aClass53_1;

	@OriginalMember(owner = "client!bj", name = "u", descriptor = "Lclient!ch;")
	private Class53 aClass53_2;

	@OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lclient!mc;Lclient!pj;)V")
	public Class34_Sub1(@OriginalArg(0) Class90_Sub3_Sub1 arg0, @OriginalArg(1) Class248 arg1) {
		super(arg0);
		if (arg0.aBoolean430) {
			this.aClass53_3 = Static115.method1818(arg1.method5794("uw_ground_unlit", "gl"), arg0);
			this.aClass53_4 = Static115.method1818(arg1.method5794("uw_ground_lit", "gl"), arg0);
			this.aClass53_1 = Static115.method1818(arg1.method5794("uw_model_unlit", "gl"), arg0);
			this.aClass53_2 = Static115.method1818(arg1.method5794("uw_model_lit", "gl"), arg0);
			this.aBoolean55 = this.aClass53_1 != null & this.aClass53_3 != null & this.aClass53_4 != null & this.aClass53_2 != null;
		} else {
			this.aBoolean55 = false;
		}
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7269(@OriginalArg(1) boolean arg0) {
		this.aBoolean57 = arg0;
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
	@Override
	public void method7273() {
		@Pc(8) int local8 = super.aClass90_Sub3_19.method7544();
		@Pc(13) Class93_Sub3 local13 = super.aClass90_Sub3_19.method7588();
		local13.method3764(-1.0F, this.aFloatArray7, 0.0F, 0.0F, (float) local8);
		if (this.aBoolean57) {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass53_4.anInt1181 : this.aClass53_2.anInt1181);
		} else {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass53_3.anInt1181 : this.aClass53_1.anInt1181);
		}
		OpenGL.glEnable(34336);
		this.aBoolean56 = true;
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray7[0], this.aFloatArray7[1], this.aFloatArray7[2], this.aFloatArray7[3]);
		this.method7279();
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(III)V")
	@Override
	public void method7275(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)Z")
	@Override
	public boolean method7276() {
		return this.aBoolean55;
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lclient!ek;IB)V")
	@Override
	public void method7277(@OriginalArg(0) Interface3 arg0, @OriginalArg(1) int arg1) {
		super.aClass90_Sub3_19.method7624(arg0);
	}

	@OriginalMember(owner = "client!bj", name = "f", descriptor = "(I)V")
	@Override
	public void method7279() {
		if (this.aBoolean56) {
			OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.aClass90_Sub3_19.IA() - 1280), (float) (super.aClass90_Sub3_19.IA() - 768), 1.0F / (float) super.aClass90_Sub3_19.method7639(), (float) super.aClass90_Sub3_19.method7649() / 255.0F);
		}
	}

	@OriginalMember(owner = "client!bj", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7271(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V")
	@Override
	public void method7282() {
		if (this.aBoolean56) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean56 = false;
		}
	}
}
