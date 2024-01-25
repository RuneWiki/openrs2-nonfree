import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class73_Sub2 extends Class73 {

	@OriginalMember(owner = "client!fb", name = "n", descriptor = "Lclient!lba;")
	private final Class173 aClass173_2;

	@OriginalMember(owner = "client!fb", name = "o", descriptor = "Lclient!tm;")
	private final Class4_Sub2_Sub2 aClass4_Sub2_Sub2_5;

	@OriginalMember(owner = "client!fb", name = "v", descriptor = "Lclient!oi;")
	private final Class215 aClass215_1;

	@OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lclient!tm;Lclient!dn;Lclient!lba;)V")
	public Class73_Sub2(@OriginalArg(0) Class4_Sub2_Sub2 arg0, @OriginalArg(1) Class69 arg1, @OriginalArg(2) Class173 arg2) {
		super(arg0);
		this.aClass173_2 = arg2;
		this.aClass4_Sub2_Sub2_5 = arg0;
		if (this.aClass173_2.method4735() && this.aClass4_Sub2_Sub2_5.aBoolean618) {
			this.aClass215_1 = Static437.method4248(this.aClass4_Sub2_Sub2_5, arg1.method1900("transparent_water", "gl"));
		} else {
			this.aClass215_1 = null;
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7561(@OriginalArg(1) boolean arg0) {
		super.aClass4_Sub2_19.method7270(Static157.aClass246_1, Static428.aClass246_3);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)V")
	@Override
	public void method7566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass173_2.aBoolean380) {
			@Pc(40) float local40 = (float) (super.aClass4_Sub2_19.anInt8322 % 4000) / 4000.0F;
			super.aClass4_Sub2_19.method7316(this.aClass173_2.anInterface3_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local40, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(13) int local13 = super.aClass4_Sub2_19.anInt8322 % 4000 * 16 / 4000;
			super.aClass4_Sub2_19.method7316(this.aClass173_2.anInterface5Array2[local13]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7569() {
		return this.aClass215_1 != null;
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
	@Override
	public void method7562() {
		super.aClass4_Sub2_19.method7277(0, Static360.aClass27_5);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILclient!hv;I)V")
	@Override
	public void method7568(@OriginalArg(0) int arg0, @OriginalArg(1) Interface8 arg1) {
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7567(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass215_1.anInt6345);
		OpenGL.glEnable(34336);
		super.aClass4_Sub2_19.method7277(0, Static226.aClass27_1);
	}
}
