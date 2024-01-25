import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class34_Sub9 extends Class34 {

	@OriginalMember(owner = "client!oq", name = "z", descriptor = "Lclient!gb;")
	private final Class120 aClass120_8;

	@OriginalMember(owner = "client!oq", name = "D", descriptor = "Lclient!kd;")
	private final Class162_Sub1_Sub2 aClass162_Sub1_Sub2_8;

	@OriginalMember(owner = "client!oq", name = "s", descriptor = "Lclient!tb;")
	private final Class319 aClass319_5;

	@OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Lclient!kd;Lclient!mv;Lclient!gb;)V")
	public Class34_Sub9(@OriginalArg(0) Class162_Sub1_Sub2 arg0, @OriginalArg(1) Class229 arg1, @OriginalArg(2) Class120 arg2) {
		super(arg0);
		this.aClass120_8 = arg2;
		this.aClass162_Sub1_Sub2_8 = arg0;
		if (arg1 != null && this.aClass120_8.method2152() && this.aClass162_Sub1_Sub2_8.aBoolean359) {
			this.aClass319_5 = Static258.method3653(this.aClass162_Sub1_Sub2_8, arg1.method4953("gl", "transparent_water"));
		} else {
			this.aClass319_5 = null;
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ILclient!qda;I)V")
	@Override
	public void method7363(@OriginalArg(1) Interface20 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7355(@OriginalArg(1) boolean arg0) {
		OpenGL.glBindProgramARB(34336, this.aClass319_5.anInt8005);
		OpenGL.glEnable(34336);
		super.aClass162_Sub1_23.method3885(Static64.aClass263_1, 0);
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7362() {
		return this.aClass319_5 != null;
	}

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "(I)V")
	@Override
	public void method7357() {
		super.aClass162_Sub1_23.method3885(Static191.aClass263_2, 0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34820);
		OpenGL.glDisable(34336);
	}

	@OriginalMember(owner = "client!oq", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7361(@OriginalArg(1) boolean arg0) {
		super.aClass162_Sub1_23.method3867(Static317.aClass247_2, Static449.aClass247_3);
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass120_8.aBoolean180) {
			@Pc(49) float local49 = (float) (super.aClass162_Sub1_23.anInt4612 % 4000) / 4000.0F;
			super.aClass162_Sub1_23.method3865(this.aClass120_8.anInterface15_1);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, local49, 0.0F, 0.0F, 1.0F);
		} else {
			@Pc(23) int local23 = super.aClass162_Sub1_23.anInt4612 % 4000 * 16 / 4000;
			super.aClass162_Sub1_23.method3865(this.aClass120_8.anInterface11Array1[local23]);
			OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
		}
	}
}
