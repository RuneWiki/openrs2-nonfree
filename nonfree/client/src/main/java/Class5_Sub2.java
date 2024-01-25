import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class5_Sub2 extends Class5 {

	@OriginalMember(owner = "client!al", name = "t", descriptor = "Lclient!qba;")
	private final Class39_Sub2_Sub2 aClass39_Sub2_Sub2_1;

	@OriginalMember(owner = "client!al", name = "s", descriptor = "Lclient!ui;")
	private final Class284 aClass284_1;

	@OriginalMember(owner = "client!al", name = "r", descriptor = "Lclient!on;")
	private final Class216 aClass216_1;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!qba;Lclient!dda;Lclient!ui;)V")
	public Class5_Sub2(@OriginalArg(0) Class39_Sub2_Sub2 arg0, @OriginalArg(1) Class53 arg1, @OriginalArg(2) Class284 arg2) {
		super(arg0);
		this.aClass39_Sub2_Sub2_1 = arg0;
		this.aClass284_1 = arg2;
		if (this.aClass284_1.method7212() && this.aClass39_Sub2_Sub2_1.aBoolean552) {
			this.aClass216_1 = Static328.method5236(arg1.method1596("transparent_water", "gl"), this.aClass39_Sub2_Sub2_1);
		} else {
			this.aClass216_1 = null;
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZILclient!mn;)V")
	@Override
	public void method7083(@OriginalArg(1) int arg0, @OriginalArg(2) Interface11 arg1) {
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ZB)V")
	@Override
	public void method7081(@OriginalArg(0) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass216_1.anInt6455);
		OpenGL.glEnable(34336);
		super.aClass39_Sub2_20.method6192(0, Static409.aClass111_3);
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IBI)V")
	@Override
	public void method7091(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass284_1.aBoolean618) {
			@Pc(16) float local16 = (float) (super.aClass39_Sub2_20.anInt7297 % 4000) / 4000.0F;
			super.aClass39_Sub2_20.method6179(this.aClass284_1.anInterface15_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local16, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(42) int local42 = super.aClass39_Sub2_20.anInt7297 % 4000 * 16 / 4000;
			super.aClass39_Sub2_20.method6179(this.aClass284_1.anInterface8Array2[local42]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V")
	@Override
	public void method7087() {
		super.aClass39_Sub2_20.method6192(0, Static132.aClass111_1);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7085() {
		return this.aClass216_1 != null;
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7092(@OriginalArg(1) boolean arg0) {
		super.aClass39_Sub2_20.method6093(Static99.aClass165_2, Static420.aClass165_4);
	}
}
