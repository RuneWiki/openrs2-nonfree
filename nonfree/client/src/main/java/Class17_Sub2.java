import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class17_Sub2 extends Class17 {

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "Lclient!ag;")
	private final Class9_Sub1_Sub1 aClass9_Sub1_Sub1_1;

	@OriginalMember(owner = "client!bf", name = "B", descriptor = "Lclient!jq;")
	private final Class155 aClass155_4;

	@OriginalMember(owner = "client!bf", name = "r", descriptor = "Lclient!oba;")
	private final Class212 aClass212_1;

	@OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Lclient!ag;Lclient!kda;Lclient!jq;)V")
	public Class17_Sub2(@OriginalArg(0) Class9_Sub1_Sub1 arg0, @OriginalArg(1) Class160 arg1, @OriginalArg(2) Class155 arg2) {
		super(arg0);
		this.aClass9_Sub1_Sub1_1 = arg0;
		this.aClass155_4 = arg2;
		if (this.aClass155_4.method4029() && this.aClass9_Sub1_Sub1_1.aBoolean50) {
			this.aClass212_1 = Static177.method3373(this.aClass9_Sub1_Sub1_1, arg1.method4222("transparent_water", "gl"));
		} else {
			this.aClass212_1 = null;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(BZ)V")
	@Override
	public void method6802(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass212_1.anInt6305);
		OpenGL.glEnable(34336);
		super.aClass9_Sub1_19.method7678(Static426.aClass122_4, 0);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
	@Override
	public void method6800() {
		super.aClass9_Sub1_19.method7678(Static197.aClass122_2, 0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(III)V")
	@Override
	public void method6794(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass155_4.aBoolean280) {
			@Pc(51) float local51 = (float) (super.aClass9_Sub1_19.anInt9193 % 4000) / 4000.0F;
			super.aClass9_Sub1_19.method7712(this.aClass155_4.anInterface18_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local51, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(25) int local25 = super.aClass9_Sub1_19.anInt9193 % 4000 * 16 / 4000;
			super.aClass9_Sub1_19.method7712(this.aClass155_4.anInterface5Array2[local25]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method6805(@OriginalArg(0) boolean arg0) {
		super.aClass9_Sub1_19.method7723(Static361.aClass295_4, Static453.aClass295_5);
	}

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "(B)Z")
	@Override
	public boolean method6799() {
		return this.aClass212_1 != null;
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!pb;II)V")
	@Override
	public void method6796(@OriginalArg(0) Interface14 arg0, @OriginalArg(1) int arg1) {
	}
}
