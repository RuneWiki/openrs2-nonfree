import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public final class Class21_Sub1 extends Class21 {

	@OriginalMember(owner = "client!av", name = "o", descriptor = "Z")
	private boolean aBoolean15;

	@OriginalMember(owner = "client!av", name = "x", descriptor = "Z")
	private boolean aBoolean17;

	@OriginalMember(owner = "client!av", name = "q", descriptor = "[F")
	private final float[] aFloatArray3 = new float[4];

	@OriginalMember(owner = "client!av", name = "r", descriptor = "Z")
	private final boolean aBoolean16;

	@OriginalMember(owner = "client!av", name = "t", descriptor = "Lclient!oj;")
	private Class230 aClass230_2;

	@OriginalMember(owner = "client!av", name = "k", descriptor = "Lclient!oj;")
	private Class230 aClass230_1;

	@OriginalMember(owner = "client!av", name = "v", descriptor = "Lclient!oj;")
	private Class230 aClass230_3;

	@OriginalMember(owner = "client!av", name = "D", descriptor = "Lclient!oj;")
	private Class230 aClass230_4;

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lclient!pi;Lclient!an;)V")
	public Class21_Sub1(@OriginalArg(0) Class42_Sub1_Sub2 arg0, @OriginalArg(1) Class16 arg1) {
		super(arg0);
		if (arg0.aBoolean519) {
			this.aClass230_2 = Static466.method6992(arg1.method396("uw_ground_unlit", "gl"), arg0);
			this.aClass230_1 = Static466.method6992(arg1.method396("uw_ground_lit", "gl"), arg0);
			this.aClass230_3 = Static466.method6992(arg1.method396("uw_model_unlit", "gl"), arg0);
			this.aClass230_4 = Static466.method6992(arg1.method396("uw_model_lit", "gl"), arg0);
			this.aBoolean16 = this.aClass230_4 != null & this.aClass230_1 != null & this.aClass230_2 != null & this.aClass230_3 != null;
		} else {
			this.aBoolean16 = false;
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
	@Override
	public void method7547() {
		@Pc(12) int local12 = super.aClass42_Sub1_19.method5881();
		@Pc(17) Class91_Sub2 local17 = super.aClass42_Sub1_19.method5898();
		local17.method5498(0.0F, 0.0F, (float) local12, -1.0F, this.aFloatArray3);
		if (this.aBoolean15) {
			OpenGL.glBindProgramARB(34336, ~local12 == Integer.MIN_VALUE ? this.aClass230_1.anInt6606 : this.aClass230_4.anInt6606);
		} else {
			OpenGL.glBindProgramARB(34336, ~local12 == Integer.MIN_VALUE ? this.aClass230_2.anInt6606 : this.aClass230_3.anInt6606);
		}
		OpenGL.glEnable(34336);
		this.aBoolean17 = true;
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray3[0], this.aFloatArray3[1], this.aFloatArray3[2], this.aFloatArray3[3]);
		this.method7551();
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(III)V")
	@Override
	public void method7557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7550() {
		return this.aBoolean16;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7552(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "(B)V")
	@Override
	public void method7551() {
		if (this.aBoolean17) {
			OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.aClass42_Sub1_19.CA() - 1280), (float) (super.aClass42_Sub1_19.CA() - 768), 1.0F / (float) super.aClass42_Sub1_19.method5976(), (float) super.aClass42_Sub1_19.method5879() / 255.0F);
		}
	}

	@OriginalMember(owner = "client!av", name = "e", descriptor = "(B)V")
	@Override
	public void method7556() {
		if (this.aBoolean17) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean17 = false;
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7549(@OriginalArg(0) boolean arg0) {
		this.aBoolean15 = arg0;
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(Lclient!baa;II)V")
	@Override
	public void method7544(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
		super.aClass42_Sub1_19.method5868(arg0);
	}
}
