import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nca")
public final class Class108_Sub7 extends Class108 {

	@OriginalMember(owner = "client!nca", name = "E", descriptor = "Z")
	private boolean aBoolean544;

	@OriginalMember(owner = "client!nca", name = "H", descriptor = "Z")
	private boolean aBoolean546;

	@OriginalMember(owner = "client!nca", name = "w", descriptor = "Z")
	private boolean aBoolean543 = false;

	@OriginalMember(owner = "client!nca", name = "F", descriptor = "[F")
	private final float[] aFloatArray45 = new float[4];

	@OriginalMember(owner = "client!nca", name = "C", descriptor = "Lclient!ow;")
	private Class266 aClass266_2;

	@OriginalMember(owner = "client!nca", name = "I", descriptor = "Lclient!ow;")
	private Class266 aClass266_3;

	@OriginalMember(owner = "client!nca", name = "t", descriptor = "Lclient!ow;")
	private Class266 aClass266_1;

	@OriginalMember(owner = "client!nca", name = "M", descriptor = "Lclient!ow;")
	private Class266 aClass266_4;

	@OriginalMember(owner = "client!nca", name = "G", descriptor = "Z")
	private final boolean aBoolean545;

	@OriginalMember(owner = "client!nca", name = "J", descriptor = "Lclient!tr;")
	private Interface25 anInterface25_6;

	@OriginalMember(owner = "client!nca", name = "<init>", descriptor = "(Lclient!laa;Lclient!wu;)V")
	public Class108_Sub7(@OriginalArg(0) Class126_Sub2_Sub1 arg0, @OriginalArg(1) Class384 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean460) {
			this.aClass266_2 = Static152.method2212(arg1.method8871("uw_ground_unlit", "gl"), arg0);
			this.aClass266_3 = Static152.method2212(arg1.method8871("uw_ground_lit", "gl"), arg0);
			this.aClass266_1 = Static152.method2212(arg1.method8871("uw_model_unlit", "gl"), arg0);
			this.aClass266_4 = Static152.method2212(arg1.method8871("uw_model_lit", "gl"), arg0);
			if (this.aClass266_4 != null & this.aClass266_1 != null & this.aClass266_3 != null & this.aClass266_2 != null) {
				this.anInterface25_6 = super.aClass126_Sub2_23.method5553(2, new int[] { 0, -1 }, false, 1);
				this.anInterface25_6.method7630(false, false);
				this.aBoolean545 = true;
			} else {
				this.aBoolean545 = false;
			}
		} else {
			this.aBoolean545 = false;
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Z)V")
	@Override
	public void method8704() {
		if (!this.aBoolean546) {
			return;
		}
		@Pc(10) int local10 = super.aClass126_Sub2_23.XA();
		@Pc(14) int local14 = super.aClass126_Sub2_23.i();
		@Pc(26) float local26 = -((float) (local10 - local14) * 0.125F) + (float) local10;
		@Pc(36) float local36 = (float) local10 - (float) (local10 - local14) * 0.25F;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local36, local26, 1.0F / (float) super.aClass126_Sub2_23.method5555(), (float) super.aClass126_Sub2_23.method5498() / 255.0F);
		super.aClass126_Sub2_23.method5560(1);
		super.aClass126_Sub2_23.method5496(super.aClass126_Sub2_23.method5522());
		super.aClass126_Sub2_23.method5560(0);
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(B)V")
	@Override
	public void method8706() {
		@Pc(8) int local8 = super.aClass126_Sub2_23.method5573();
		@Pc(21) Class117_Sub2 local21 = super.aClass126_Sub2_23.method5493();
		if (this.aBoolean544) {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass266_3.anInt7168 : this.aClass266_4.anInt7168);
		} else {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass266_2.anInt7168 : this.aClass266_1.anInt7168);
		}
		OpenGL.glEnable(34336);
		this.aBoolean546 = true;
		local21.method3877(this.aFloatArray45, -1.0F, 0.0F, 0.0F, (float) local8);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray45[0], this.aFloatArray45[1], this.aFloatArray45[2], this.aFloatArray45[3]);
		this.method8704();
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(Z)V")
	@Override
	public void method8708() {
		super.aClass126_Sub2_23.method5560(1);
		super.aClass126_Sub2_23.method5449((Interface27) null);
		super.aClass126_Sub2_23.method5475(Static101.aClass10_2, Static101.aClass10_2);
		super.aClass126_Sub2_23.method5466(0, Static256.aClass294_4);
		super.aClass126_Sub2_23.method5466(2, Static645.aClass294_5);
		super.aClass126_Sub2_23.method5471(Static256.aClass294_4, 0);
		super.aClass126_Sub2_23.method5560(0);
		if (this.aBoolean543) {
			super.aClass126_Sub2_23.method5466(0, Static256.aClass294_4);
			super.aClass126_Sub2_23.method5471(Static256.aClass294_4, 0);
			this.aBoolean543 = false;
		}
		if (this.aBoolean546) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean546 = false;
		}
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8702(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZZ)V")
	@Override
	public void method8710(@OriginalArg(1) boolean arg0) {
		this.aBoolean544 = arg0;
		super.aClass126_Sub2_23.method5560(1);
		super.aClass126_Sub2_23.method5449(this.anInterface25_6);
		super.aClass126_Sub2_23.method5475(Static247.aClass10_4, Static646.aClass10_5);
		super.aClass126_Sub2_23.method5466(0, Static645.aClass294_5);
		super.aClass126_Sub2_23.method5537(2, Static256.aClass294_4, false, true);
		super.aClass126_Sub2_23.method5471(Static131.aClass294_2, 0);
		super.aClass126_Sub2_23.method5560(0);
		this.method8706();
	}

	@OriginalMember(owner = "client!nca", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method8699() {
		return this.aBoolean545;
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(III)V")
	@Override
	public void method8700(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!nca", name = "a", descriptor = "(Lclient!wc;IB)V")
	@Override
	public void method8709(@OriginalArg(0) Interface27 arg0, @OriginalArg(1) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean543) {
				super.aClass126_Sub2_23.method5466(0, Static256.aClass294_4);
				super.aClass126_Sub2_23.method5471(Static256.aClass294_4, 0);
				this.aBoolean543 = false;
			}
			super.aClass126_Sub2_23.method5449(arg0);
			super.aClass126_Sub2_23.method5513(arg1);
		} else if (!this.aBoolean543) {
			super.aClass126_Sub2_23.method5449(super.aClass126_Sub2_23.anInterface27_3);
			super.aClass126_Sub2_23.method5513(1);
			super.aClass126_Sub2_23.method5466(0, Static131.aClass294_2);
			super.aClass126_Sub2_23.method5471(Static131.aClass294_2, 0);
			this.aBoolean543 = true;
		}
	}
}
