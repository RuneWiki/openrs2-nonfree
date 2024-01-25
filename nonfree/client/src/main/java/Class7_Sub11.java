import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rba")
public final class Class7_Sub11 extends Class7 {

	@OriginalMember(owner = "client!rba", name = "t", descriptor = "Lclient!no;")
	private final Class100_Sub1_Sub2 aClass100_Sub1_Sub2_8;

	@OriginalMember(owner = "client!rba", name = "l", descriptor = "Lclient!pba;")
	private final Class249 aClass249_8;

	@OriginalMember(owner = "client!rba", name = "u", descriptor = "Lclient!dw;")
	private final Class70 aClass70_5;

	@OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lclient!no;Lclient!vd;Lclient!pba;)V")
	public Class7_Sub11(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) Class353 arg1, @OriginalArg(2) Class249 arg2) {
		super(arg0);
		this.aClass100_Sub1_Sub2_8 = arg0;
		this.aClass249_8 = arg2;
		if (arg1 != null && this.aClass249_8.method6665() && this.aClass100_Sub1_Sub2_8.aBoolean491) {
			this.aClass70_5 = Static105.method1740(arg1.method8426("gl", "transparent_water"), this.aClass100_Sub1_Sub2_8);
		} else {
			this.aClass70_5 = null;
		}
	}

	@OriginalMember(owner = "client!rba", name = "d", descriptor = "(I)V")
	@Override
	public void method7197() {
		super.aClass100_Sub1_22.method6068(0, Static622.aClass187_4);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(Lclient!bca;II)V")
	@Override
	public void method7186(@OriginalArg(0) Interface1 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(BII)V")
	@Override
	public void method7192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass249_8.aBoolean522) {
			@Pc(47) float local47 = (float) (super.aClass100_Sub1_22.anInt7125 % 4000) / 4000.0F;
			super.aClass100_Sub1_22.method6033(this.aClass249_8.anInterface15_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local47, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(21) int local21 = super.aClass100_Sub1_22.anInt7125 % 4000 * 16 / 4000;
			super.aClass100_Sub1_22.method6033(this.aClass249_8.anInterface3Array2[local21]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!rba", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7194() {
		return this.aClass70_5 != null;
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7187(@OriginalArg(0) boolean arg0) {
		super.aClass100_Sub1_22.method6039(Static114.aClass256_1, Static436.aClass256_4);
	}

	@OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method7195(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass70_5.anInt2258);
		OpenGL.glEnable(34336);
		super.aClass100_Sub1_22.method6068(0, Static506.aClass187_3);
	}
}
