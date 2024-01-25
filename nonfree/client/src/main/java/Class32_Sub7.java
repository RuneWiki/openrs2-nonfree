import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jh")
public final class Class32_Sub7 extends Class32 {

	@OriginalMember(owner = "client!jh", name = "A", descriptor = "Z")
	private boolean aBoolean298;

	@OriginalMember(owner = "client!jh", name = "B", descriptor = "Z")
	private boolean aBoolean299;

	@OriginalMember(owner = "client!jh", name = "q", descriptor = "Z")
	private boolean aBoolean297 = false;

	@OriginalMember(owner = "client!jh", name = "t", descriptor = "[F")
	private final float[] aFloatArray14 = new float[4];

	@OriginalMember(owner = "client!jh", name = "D", descriptor = "Lclient!eca;")
	private Class78 aClass78_4;

	@OriginalMember(owner = "client!jh", name = "l", descriptor = "Lclient!eca;")
	private Class78 aClass78_1;

	@OriginalMember(owner = "client!jh", name = "y", descriptor = "Lclient!eca;")
	private Class78 aClass78_3;

	@OriginalMember(owner = "client!jh", name = "x", descriptor = "Lclient!eca;")
	private Class78 aClass78_2;

	@OriginalMember(owner = "client!jh", name = "k", descriptor = "Z")
	private final boolean aBoolean296;

	@OriginalMember(owner = "client!jh", name = "n", descriptor = "Lclient!bw;")
	private Interface2 anInterface2_3;

	@OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lclient!oaa;Lclient!ae;)V")
	public Class32_Sub7(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) Class8 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean476) {
			this.aClass78_4 = Static224.method3272(arg0, arg1.method274("gl", "uw_ground_unlit"));
			this.aClass78_1 = Static224.method3272(arg0, arg1.method274("gl", "uw_ground_lit"));
			this.aClass78_3 = Static224.method3272(arg0, arg1.method274("gl", "uw_model_unlit"));
			this.aClass78_2 = Static224.method3272(arg0, arg1.method274("gl", "uw_model_lit"));
			if (this.aClass78_3 != null & this.aClass78_4 != null & this.aClass78_1 != null & this.aClass78_2 != null) {
				this.anInterface2_3 = super.aClass132_Sub1_21.method7590(1, 2, false, new int[] { 0, -1 });
				this.anInterface2_3.method8901(false, false);
				this.aBoolean296 = true;
			} else {
				this.aBoolean296 = false;
			}
		} else {
			this.aBoolean296 = false;
		}
	}

	@OriginalMember(owner = "client!jh", name = "d", descriptor = "(I)V")
	@Override
	public void method8328() {
		super.aClass132_Sub1_21.method7616(1);
		super.aClass132_Sub1_21.method7635((Interface17) null);
		super.aClass132_Sub1_21.method7637(Static131.aClass322_3, Static131.aClass322_3);
		super.aClass132_Sub1_21.method7552(Static368.aClass378_1, 0);
		super.aClass132_Sub1_21.method7552(Static583.aClass378_3, 2);
		super.aClass132_Sub1_21.method7598(0, Static368.aClass378_1);
		super.aClass132_Sub1_21.method7616(0);
		if (this.aBoolean297) {
			super.aClass132_Sub1_21.method7552(Static368.aClass378_1, 0);
			super.aClass132_Sub1_21.method7598(0, Static368.aClass378_1);
			this.aBoolean297 = false;
		}
		if (this.aBoolean298) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean298 = false;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILclient!ml;)V")
	@Override
	public void method8318(@OriginalArg(1) int arg0, @OriginalArg(2) Interface17 arg1) {
		if (arg1 != null) {
			if (this.aBoolean297) {
				super.aClass132_Sub1_21.method7552(Static368.aClass378_1, 0);
				super.aClass132_Sub1_21.method7598(0, Static368.aClass378_1);
				this.aBoolean297 = false;
			}
			super.aClass132_Sub1_21.method7635(arg1);
			super.aClass132_Sub1_21.method7652(arg0);
		} else if (!this.aBoolean297) {
			super.aClass132_Sub1_21.method7635(super.aClass132_Sub1_21.anInterface17_3);
			super.aClass132_Sub1_21.method7652(1);
			super.aClass132_Sub1_21.method7552(Static648.aClass378_4, 0);
			super.aClass132_Sub1_21.method7598(0, Static648.aClass378_4);
			this.aBoolean297 = true;
		}
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8315(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)Z")
	@Override
	public boolean method8324() {
		return this.aBoolean296;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BZ)V")
	@Override
	public void method8316(@OriginalArg(1) boolean arg0) {
		this.aBoolean299 = arg0;
		super.aClass132_Sub1_21.method7616(1);
		super.aClass132_Sub1_21.method7635(this.anInterface2_3);
		super.aClass132_Sub1_21.method7637(Static296.aClass322_4, Static320.aClass322_5);
		super.aClass132_Sub1_21.method7552(Static583.aClass378_3, 0);
		super.aClass132_Sub1_21.method7612(false, 2, Static368.aClass378_1, true);
		super.aClass132_Sub1_21.method7598(0, Static648.aClass378_4);
		super.aClass132_Sub1_21.method7616(0);
		this.method8325();
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(B)V")
	@Override
	public void method8325() {
		@Pc(8) int local8 = super.aClass132_Sub1_21.method7600();
		@Pc(13) Class207_Sub3 local13 = super.aClass132_Sub1_21.method7542();
		if (this.aBoolean299) {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass78_1.anInt2150 : this.aClass78_2.anInt2150);
		} else {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass78_4.anInt2150 : this.aClass78_3.anInt2150);
		}
		OpenGL.glEnable(34336);
		this.aBoolean298 = true;
		local13.method8219(0.0F, 0.0F, -1.0F, this.aFloatArray14, (float) local8);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray14[0], this.aFloatArray14[1], this.aFloatArray14[2], this.aFloatArray14[3]);
		this.method8323();
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(III)V")
	@Override
	public void method8322(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V")
	@Override
	public void method8323() {
		if (!this.aBoolean298) {
			return;
		}
		@Pc(16) int local16 = super.aClass132_Sub1_21.XA();
		@Pc(20) int local20 = super.aClass132_Sub1_21.i();
		@Pc(30) float local30 = (float) local16 - (float) (local16 - local20) * 0.125F;
		@Pc(41) float local41 = (float) local16 - (float) (local16 - local20) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local41, local30, 1.0F / (float) super.aClass132_Sub1_21.method7597(), (float) super.aClass132_Sub1_21.method7530() / 255.0F);
		super.aClass132_Sub1_21.method7616(1);
		super.aClass132_Sub1_21.method7611(super.aClass132_Sub1_21.method7582());
		super.aClass132_Sub1_21.method7616(0);
	}
}
