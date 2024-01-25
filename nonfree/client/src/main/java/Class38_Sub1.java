import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bn")
public final class Class38_Sub1 extends Class38 {

	@OriginalMember(owner = "client!bn", name = "p", descriptor = "Lclient!dda;")
	private final Class44_Sub2_Sub1 aClass44_Sub2_Sub1_2;

	@OriginalMember(owner = "client!bn", name = "q", descriptor = "Lclient!vt;")
	private final Class348 aClass348_1;

	@OriginalMember(owner = "client!bn", name = "n", descriptor = "Lclient!qd;")
	private final Class270 aClass270_1;

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(Lclient!dda;Lclient!jn;Lclient!vt;)V")
	public Class38_Sub1(@OriginalArg(0) Class44_Sub2_Sub1 arg0, @OriginalArg(1) Class176 arg1, @OriginalArg(2) Class348 arg2) {
		super(arg0);
		this.aClass44_Sub2_Sub1_2 = arg0;
		this.aClass348_1 = arg2;
		if (arg1 != null && this.aClass348_1.method8144() && this.aClass44_Sub2_Sub1_2.aBoolean147) {
			this.aClass270_1 = Static490.method7271(arg1.method3972("gl", "transparent_water"), this.aClass44_Sub2_Sub1_2);
		} else {
			this.aClass270_1 = null;
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7431(@OriginalArg(0) boolean arg0) {
		super.aClass44_Sub2_21.method4243(Static341.aClass117_4, Static379.aClass117_7);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(ILclient!oa;B)V")
	@Override
	public void method7440(@OriginalArg(0) int arg0, @OriginalArg(1) Interface16 arg1) {
	}

	@OriginalMember(owner = "client!bn", name = "c", descriptor = "(I)V")
	@Override
	public void method7434() {
		super.aClass44_Sub2_21.method4241(0, Static519.aClass328_4);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7433(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass348_1.aBoolean705) {
			@Pc(50) float local50 = (float) (super.aClass44_Sub2_21.anInt4957 % 4000) / 4000.0F;
			super.aClass44_Sub2_21.method4265(this.aClass348_1.anInterface4_2);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local50, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(24) int local24 = super.aClass44_Sub2_21.anInt4957 % 4000 * 16 / 4000;
			super.aClass44_Sub2_21.method4265(this.aClass348_1.anInterface6Array2[local24]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method7427() {
		return this.aClass270_1 != null;
	}

	@OriginalMember(owner = "client!bn", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7439(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass270_1.anInt7873);
		OpenGL.glEnable(34336);
		super.aClass44_Sub2_21.method4241(0, Static283.aClass328_5);
	}
}
