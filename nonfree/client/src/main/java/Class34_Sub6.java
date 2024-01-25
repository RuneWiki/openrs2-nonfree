import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ln")
public final class Class34_Sub6 extends Class34 {

	@OriginalMember(owner = "client!ln", name = "x", descriptor = "Z")
	private boolean aBoolean400;

	@OriginalMember(owner = "client!ln", name = "E", descriptor = "Z")
	private boolean aBoolean401;

	@OriginalMember(owner = "client!ln", name = "v", descriptor = "[F")
	private final float[] aFloatArray49 = new float[4];

	@OriginalMember(owner = "client!ln", name = "o", descriptor = "Z")
	private final boolean aBoolean399;

	@OriginalMember(owner = "client!ln", name = "q", descriptor = "Lclient!tb;")
	private Class319 aClass319_2;

	@OriginalMember(owner = "client!ln", name = "p", descriptor = "Lclient!tb;")
	private Class319 aClass319_1;

	@OriginalMember(owner = "client!ln", name = "H", descriptor = "Lclient!tb;")
	private Class319 aClass319_4;

	@OriginalMember(owner = "client!ln", name = "B", descriptor = "Lclient!tb;")
	private Class319 aClass319_3;

	@OriginalMember(owner = "client!ln", name = "s", descriptor = "Lclient!fj;")
	private Interface11 anInterface11_3;

	@OriginalMember(owner = "client!ln", name = "<init>", descriptor = "(Lclient!kd;Lclient!mv;)V")
	public Class34_Sub6(@OriginalArg(0) Class162_Sub1_Sub2 arg0, @OriginalArg(1) Class229 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean359) {
			this.aClass319_2 = Static258.method3653(arg0, arg1.method4953("gl", "uw_ground_unlit"));
			this.aClass319_1 = Static258.method3653(arg0, arg1.method4953("gl", "uw_ground_lit"));
			this.aClass319_4 = Static258.method3653(arg0, arg1.method4953("gl", "uw_model_unlit"));
			this.aClass319_3 = Static258.method3653(arg0, arg1.method4953("gl", "uw_model_lit"));
			if (this.aClass319_4 != null & this.aClass319_1 != null & this.aClass319_2 != null & this.aClass319_3 != null) {
				this.anInterface11_3 = super.aClass162_Sub1_23.method3904(1, 2, false, new int[] { 0, -1 });
				this.anInterface11_3.method7639(false, false);
				this.aBoolean399 = true;
			} else {
				this.aBoolean399 = false;
			}
		} else {
			this.aBoolean399 = false;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZI)V")
	@Override
	public void method7366(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ln", name = "c", descriptor = "(I)V")
	@Override
	public void method7357() {
		super.aClass162_Sub1_23.method3926(1);
		super.aClass162_Sub1_23.method3865(null);
		super.aClass162_Sub1_23.method3867(Static460.aClass247_4, Static460.aClass247_4);
		super.aClass162_Sub1_23.method3885(Static191.aClass263_2, 0);
		super.aClass162_Sub1_23.method3885(Static504.aClass263_4, 2);
		super.aClass162_Sub1_23.method3877(0, Static191.aClass263_2);
		super.aClass162_Sub1_23.method3926(0);
		if (this.aBoolean401) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean401 = false;
		}
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(ILclient!qda;I)V")
	@Override
	public void method7363(@OriginalArg(1) Interface20 arg0, @OriginalArg(2) int arg1) {
		super.aClass162_Sub1_23.method3865(arg0);
		super.aClass162_Sub1_23.method3906(arg1);
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(IZ)V")
	@Override
	public void method7361(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(Z)V")
	@Override
	public void method7365() {
		if (!this.aBoolean401) {
			return;
		}
		@Pc(16) int local16 = super.aClass162_Sub1_23.U();
		@Pc(20) int local20 = super.aClass162_Sub1_23.BA();
		@Pc(31) float local31 = (float) local16 - (float) (local16 - local20) * 0.125F;
		@Pc(43) float local43 = -((float) (local16 - local20) * 0.25F) + (float) local16;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local43, local31, 1.0F / (float) super.aClass162_Sub1_23.method3878(), (float) super.aClass162_Sub1_23.method3897() / 255.0F);
		super.aClass162_Sub1_23.method3926(1);
		super.aClass162_Sub1_23.method3891(super.aClass162_Sub1_23.method3936());
		super.aClass162_Sub1_23.method3926(0);
	}

	@OriginalMember(owner = "client!ln", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7355(@OriginalArg(1) boolean arg0) {
		this.aBoolean400 = arg0;
		super.aClass162_Sub1_23.method3926(1);
		super.aClass162_Sub1_23.method3865(this.anInterface11_3);
		super.aClass162_Sub1_23.method3867(Static584.aClass247_5, Static317.aClass247_2);
		super.aClass162_Sub1_23.method3885(Static504.aClass263_4, 0);
		super.aClass162_Sub1_23.method3828(true, false, Static191.aClass263_2, 2);
		super.aClass162_Sub1_23.method3877(0, Static64.aClass263_1);
		super.aClass162_Sub1_23.method3926(0);
		this.method7359();
	}

	@OriginalMember(owner = "client!ln", name = "d", descriptor = "(I)V")
	@Override
	public void method7359() {
		@Pc(8) int local8 = super.aClass162_Sub1_23.method3880();
		@Pc(13) Class25_Sub2 local13 = super.aClass162_Sub1_23.method3841();
		if (this.aBoolean400) {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass319_1.anInt8005 : this.aClass319_3.anInt8005);
		} else {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass319_2.anInt8005 : this.aClass319_4.anInt8005);
		}
		OpenGL.glEnable(34336);
		this.aBoolean401 = true;
		local13.method2716(0.0F, 0.0F, this.aFloatArray49, (float) local8, -1.0F);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray49[0], this.aFloatArray49[1], this.aFloatArray49[2], this.aFloatArray49[3]);
		this.method7365();
	}

	@OriginalMember(owner = "client!ln", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method7362() {
		return this.aBoolean399;
	}
}
