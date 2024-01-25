import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class21_Sub4 extends Class21 {

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "Lclient!pi;")
	private final Class42_Sub1_Sub2 aClass42_Sub1_Sub2_4;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "Lclient!paa;")
	private final Class236 aClass236_4;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "Lclient!oj;")
	private final Class230 aClass230_5;

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lclient!pi;Lclient!an;Lclient!paa;)V")
	public Class21_Sub4(@OriginalArg(0) Class42_Sub1_Sub2 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(2) Class236 arg2) {
		super(arg0);
		this.aClass42_Sub1_Sub2_4 = arg0;
		this.aClass236_4 = arg2;
		if (this.aClass236_4.method5705() && this.aClass42_Sub1_Sub2_4.aBoolean519) {
			this.aClass230_5 = Static466.method6992(arg1.method396("transparent_water", "gl"), this.aClass42_Sub1_Sub2_4);
		} else {
			this.aClass230_5 = null;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7552(@OriginalArg(1) boolean arg0) {
		super.aClass42_Sub1_19.method5945(Static88.aClass129_1, Static191.aClass129_3);
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(B)V")
	@Override
	public void method7556() {
		super.aClass42_Sub1_19.method5951(Static159.aClass302_1, 0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7550() {
		return this.aClass230_5 != null;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!baa;II)V")
	@Override
	public void method7544(@OriginalArg(0) Interface3 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7549(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass230_5.anInt6606);
		OpenGL.glEnable(34336);
		super.aClass42_Sub1_19.method5951(Static499.aClass302_4, 0);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)V")
	@Override
	public void method7557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass236_4.aBoolean493) {
			@Pc(20) float local20 = (float) (super.aClass42_Sub1_19.anInt7105 % 4000) / 4000.0F;
			super.aClass42_Sub1_19.method5868(this.aClass236_4.anInterface17_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local20, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(46) int local46 = super.aClass42_Sub1_19.anInt7105 % 4000 * 16 / 4000;
			super.aClass42_Sub1_19.method5868(this.aClass236_4.anInterface20Array1[local46]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}
}
