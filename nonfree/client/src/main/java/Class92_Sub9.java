import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wh")
public final class Class92_Sub9 extends Class92 {

	@OriginalMember(owner = "client!wh", name = "w", descriptor = "Lclient!mc;")
	private final Class121_Sub2_Sub1 aClass121_Sub2_Sub1_10;

	@OriginalMember(owner = "client!wh", name = "x", descriptor = "Lclient!rba;")
	private final Class269 aClass269_6;

	@OriginalMember(owner = "client!wh", name = "r", descriptor = "Lclient!waa;")
	private final Class339 aClass339_5;

	@OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Lclient!mc;Lclient!pq;Lclient!rba;)V")
	public Class92_Sub9(@OriginalArg(0) Class121_Sub2_Sub1 arg0, @OriginalArg(1) Class251 arg1, @OriginalArg(2) Class269 arg2) {
		super(arg0);
		this.aClass121_Sub2_Sub1_10 = arg0;
		this.aClass269_6 = arg2;
		if (this.aClass269_6.method6276() && this.aClass121_Sub2_Sub1_10.aBoolean341) {
			this.aClass339_5 = Static487.method6723(this.aClass121_Sub2_Sub1_10, arg1.method5836("gl", "transparent_water"));
		} else {
			this.aClass339_5 = null;
		}
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILclient!aw;)V")
	@Override
	public void method7754(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1) {
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(III)V")
	@Override
	public void method7751(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass269_6.aBoolean523) {
			@Pc(12) float local12 = (float) (super.aClass121_Sub2_20.anInt8920 % 4000) / 4000.0F;
			super.aClass121_Sub2_20.method7167(this.aClass269_6.anInterface12_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local12, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(40) int local40 = super.aClass121_Sub2_20.anInt8920 % 4000 * 16 / 4000;
			super.aClass121_Sub2_20.method7167(this.aClass269_6.anInterface20Array2[local40]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)Z")
	@Override
	public boolean method7758() {
		return this.aClass339_5 != null;
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(ZI)V")
	@Override
	public void method7749(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass339_5.anInt9307);
		OpenGL.glEnable(34336);
		super.aClass121_Sub2_20.method7270(Static197.aClass305_3, 0);
	}

	@OriginalMember(owner = "client!wh", name = "c", descriptor = "(ZI)V")
	@Override
	public void method7756(@OriginalArg(0) boolean arg0) {
		super.aClass121_Sub2_20.method7198(Static570.aClass59_5, Static526.aClass59_4);
	}

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V")
	@Override
	public void method7748() {
		super.aClass121_Sub2_20.method7270(Static67.aClass305_1, 0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}
}
