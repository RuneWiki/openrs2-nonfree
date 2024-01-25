import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class93_Sub9 extends Class93 {

	@OriginalMember(owner = "client!ws", name = "p", descriptor = "Z")
	private boolean aBoolean686;

	@OriginalMember(owner = "client!ws", name = "y", descriptor = "Z")
	private boolean aBoolean687;

	@OriginalMember(owner = "client!ws", name = "m", descriptor = "[F")
	private final float[] aFloatArray68 = new float[4];

	@OriginalMember(owner = "client!ws", name = "B", descriptor = "Z")
	private final boolean aBoolean688;

	@OriginalMember(owner = "client!ws", name = "q", descriptor = "Lclient!mi;")
	private Class225 aClass225_2;

	@OriginalMember(owner = "client!ws", name = "E", descriptor = "Lclient!mi;")
	private Class225 aClass225_5;

	@OriginalMember(owner = "client!ws", name = "z", descriptor = "Lclient!mi;")
	private Class225 aClass225_4;

	@OriginalMember(owner = "client!ws", name = "r", descriptor = "Lclient!mi;")
	private Class225 aClass225_3;

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!dc;Lclient!bi;)V")
	public Class93_Sub9(@OriginalArg(0) Class66_Sub1_Sub1 arg0, @OriginalArg(1) Class31 arg1) {
		super(arg0);
		if (arg0.aBoolean189) {
			this.aClass225_2 = Static59.method860(arg1.method662("gl", "uw_ground_unlit"), arg0);
			this.aClass225_5 = Static59.method860(arg1.method662("gl", "uw_ground_lit"), arg0);
			this.aClass225_4 = Static59.method860(arg1.method662("gl", "uw_model_unlit"), arg0);
			this.aClass225_3 = Static59.method860(arg1.method662("gl", "uw_model_lit"), arg0);
			this.aBoolean688 = this.aClass225_2 != null & this.aClass225_5 != null & this.aClass225_4 != null & this.aClass225_3 != null;
		} else {
			this.aBoolean688 = false;
		}
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method7998() {
		return this.aBoolean688;
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(BII)V")
	@Override
	public void method7996(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8000(@OriginalArg(0) boolean arg0) {
		this.aBoolean687 = arg0;
	}

	@OriginalMember(owner = "client!ws", name = "d", descriptor = "(I)V")
	@Override
	public void method8002() {
		if (this.aBoolean686) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean686 = false;
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IILclient!nq;)V")
	@Override
	public void method7995(@OriginalArg(0) int arg0, @OriginalArg(2) Interface15 arg1) {
		super.aClass66_Sub1_19.method6979(arg1);
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)V")
	@Override
	public void method8006() {
		@Pc(16) int local16 = super.aClass66_Sub1_19.method6871();
		@Pc(21) Class134_Sub1 local21 = super.aClass66_Sub1_19.method6939();
		local21.method3402(0.0F, 0.0F, (float) local16, this.aFloatArray68, -1.0F);
		if (this.aBoolean687) {
			OpenGL.glBindProgramARB(34336, local16 == Integer.MAX_VALUE ? this.aClass225_5.anInt5862 : this.aClass225_3.anInt5862);
		} else {
			OpenGL.glBindProgramARB(34336, ~local16 == Integer.MIN_VALUE ? this.aClass225_2.anInt5862 : this.aClass225_4.anInt5862);
		}
		OpenGL.glEnable(34336);
		this.aBoolean686 = true;
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray68[0], this.aFloatArray68[1], this.aFloatArray68[2], this.aFloatArray68[3]);
		this.method7999();
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZI)V")
	@Override
	public void method7997(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Z)V")
	@Override
	public void method7999() {
		if (this.aBoolean686) {
			OpenGL.glProgramLocalParameter4fARB(34336, 0, (float) (super.aClass66_Sub1_19.IA() - 1280), (float) (super.aClass66_Sub1_19.IA() - 768), 1.0F / (float) super.aClass66_Sub1_19.method6934(), (float) super.aClass66_Sub1_19.method6954() / 255.0F);
		}
	}
}
