import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ws")
public final class Class10_Sub11 extends Class10 {

	@OriginalMember(owner = "client!ws", name = "o", descriptor = "[I")
	public static final int[] anIntArray796 = new int[128];

	@OriginalMember(owner = "client!ws", name = "u", descriptor = "Z")
	private boolean aBoolean770;

	@OriginalMember(owner = "client!ws", name = "K", descriptor = "Z")
	private boolean aBoolean771;

	@OriginalMember(owner = "client!ws", name = "s", descriptor = "[F")
	private final float[] aFloatArray86 = new float[4];

	@OriginalMember(owner = "client!ws", name = "w", descriptor = "Z")
	private boolean aBoolean769 = false;

	@OriginalMember(owner = "client!ws", name = "v", descriptor = "Z")
	private final boolean aBoolean772;

	@OriginalMember(owner = "client!ws", name = "B", descriptor = "Lclient!bea;")
	private Class32 aClass32_4;

	@OriginalMember(owner = "client!ws", name = "G", descriptor = "Lclient!bea;")
	private Class32 aClass32_5;

	@OriginalMember(owner = "client!ws", name = "x", descriptor = "Lclient!bea;")
	private Class32 aClass32_2;

	@OriginalMember(owner = "client!ws", name = "H", descriptor = "Lclient!bea;")
	private Class32 aClass32_3;

	@OriginalMember(owner = "client!ws", name = "A", descriptor = "Lclient!pt;")
	private Interface16 anInterface16_6;

	static {
		for (@Pc(130) int local130 = 0; local130 < anIntArray796.length; local130++) {
			anIntArray796[local130] = -1;
		}
		for (@Pc(146) int local146 = 65; local146 <= 90; local146++) {
			anIntArray796[local146] = local146 - 65;
		}
		for (@Pc(159) int local159 = 97; local159 <= 122; local159++) {
			anIntArray796[local159] = local159 + 26 - 97;
		}
		for (@Pc(174) int local174 = 48; local174 <= 57; local174++) {
			anIntArray796[local174] = local174 + 52 - 48;
		}
		anIntArray796[42] = anIntArray796[43] = 62;
		anIntArray796[45] = anIntArray796[47] = 63;
	}

	@OriginalMember(owner = "client!ws", name = "<init>", descriptor = "(Lclient!vaa;Lclient!ik;)V")
	public Class10_Sub11(@OriginalArg(0) Class22_Sub2_Sub2 arg0, @OriginalArg(1) Class182 arg1) {
		super(arg0);
		if (arg1 != null && arg0.aBoolean715) {
			this.aClass32_4 = Static344.method4898(arg0, arg1.method3958("uw_ground_unlit", "gl"));
			this.aClass32_5 = Static344.method4898(arg0, arg1.method3958("uw_ground_lit", "gl"));
			this.aClass32_2 = Static344.method4898(arg0, arg1.method3958("uw_model_unlit", "gl"));
			this.aClass32_3 = Static344.method4898(arg0, arg1.method3958("uw_model_lit", "gl"));
			if (this.aClass32_4 != null & this.aClass32_5 != null & this.aClass32_2 != null & this.aClass32_3 != null) {
				this.anInterface16_6 = super.aClass22_Sub2_23.method8950(new int[] { 0, -1 }, 2, 1, false);
				this.anInterface16_6.method8248(false, false);
				this.aBoolean772 = true;
			} else {
				this.aBoolean772 = false;
			}
		} else {
			this.aBoolean772 = false;
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(IBI)V")
	@Override
	public void method9552(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "(B)V")
	@Override
	public void method9554() {
		@Pc(8) int local8 = super.aClass22_Sub2_23.method8877();
		@Pc(13) Class58_Sub2 local13 = super.aClass22_Sub2_23.method8913();
		if (this.aBoolean770) {
			OpenGL.glBindProgramARB(34336, local8 == Integer.MAX_VALUE ? this.aClass32_5.anInt1221 : this.aClass32_3.anInt1221);
		} else {
			OpenGL.glBindProgramARB(34336, ~local8 == Integer.MIN_VALUE ? this.aClass32_4.anInt1221 : this.aClass32_2.anInt1221);
		}
		OpenGL.glEnable(34336);
		this.aBoolean771 = true;
		local13.method6091((float) local8, 0.0F, -1.0F, 0.0F, this.aFloatArray86);
		OpenGL.glProgramLocalParameter4fARB(34336, 1, this.aFloatArray86[0], this.aFloatArray86[1], this.aFloatArray86[2], this.aFloatArray86[3]);
		this.method9550();
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!sc;II)V")
	@Override
	public void method9546(@OriginalArg(0) Interface21 arg0, @OriginalArg(2) int arg1) {
		if (arg0 != null) {
			if (this.aBoolean769) {
				super.aClass22_Sub2_23.method8962(Static358.aClass392_1, 0);
				super.aClass22_Sub2_23.method8897(Static358.aClass392_1, 0);
				this.aBoolean769 = false;
			}
			super.aClass22_Sub2_23.method8976(arg0);
			super.aClass22_Sub2_23.method8853(arg1);
		} else if (!this.aBoolean769) {
			super.aClass22_Sub2_23.method8976(super.aClass22_Sub2_23.anInterface21_3);
			super.aClass22_Sub2_23.method8853(1);
			super.aClass22_Sub2_23.method8962(Static671.aClass392_4, 0);
			super.aClass22_Sub2_23.method8897(Static671.aClass392_4, 0);
			this.aBoolean769 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZI)V")
	@Override
	public void method9558(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(B)Z")
	@Override
	public boolean method9557() {
		return this.aBoolean772;
	}

	@OriginalMember(owner = "client!ws", name = "b", descriptor = "(B)V")
	@Override
	public void method9549() {
		super.aClass22_Sub2_23.method8896(1);
		super.aClass22_Sub2_23.method8976((Interface21) null);
		super.aClass22_Sub2_23.method8914(Static503.aClass372_4, Static503.aClass372_4);
		super.aClass22_Sub2_23.method8962(Static358.aClass392_1, 0);
		super.aClass22_Sub2_23.method8962(Static547.aClass392_3, 2);
		super.aClass22_Sub2_23.method8897(Static358.aClass392_1, 0);
		super.aClass22_Sub2_23.method8896(0);
		if (this.aBoolean769) {
			super.aClass22_Sub2_23.method8962(Static358.aClass392_1, 0);
			super.aClass22_Sub2_23.method8897(Static358.aClass392_1, 0);
			this.aBoolean769 = false;
		}
		if (this.aBoolean771) {
			OpenGL.glBindProgramARB(34336, 0);
			OpenGL.glDisable(34820);
			OpenGL.glDisable(34336);
			this.aBoolean771 = false;
		}
	}

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(ZB)V")
	@Override
	public void method9551(@OriginalArg(0) boolean arg0) {
		this.aBoolean770 = arg0;
		super.aClass22_Sub2_23.method8896(1);
		super.aClass22_Sub2_23.method8976(this.anInterface16_6);
		super.aClass22_Sub2_23.method8914(Static468.aClass372_3, Static240.aClass372_6);
		super.aClass22_Sub2_23.method8962(Static547.aClass392_3, 0);
		super.aClass22_Sub2_23.method8954(2, false, true, Static358.aClass392_1);
		super.aClass22_Sub2_23.method8897(Static671.aClass392_4, 0);
		super.aClass22_Sub2_23.method8896(0);
		this.method9554();
	}

	@OriginalMember(owner = "client!ws", name = "c", descriptor = "(I)V")
	@Override
	public void method9550() {
		if (!this.aBoolean771) {
			return;
		}
		@Pc(10) int local10 = super.aClass22_Sub2_23.XA();
		@Pc(14) int local14 = super.aClass22_Sub2_23.i();
		@Pc(25) float local25 = (float) local10 - (float) (local10 - local14) * 0.125F;
		@Pc(37) float local37 = -((float) (local10 - local14) * 0.25F) + (float) local10;
		OpenGL.glProgramLocalParameter4fARB(34336, 0, local37, local25, 1.0F / (float) super.aClass22_Sub2_23.method8870(), (float) super.aClass22_Sub2_23.method8865() / 255.0F);
		super.aClass22_Sub2_23.method8896(1);
		super.aClass22_Sub2_23.method8930(super.aClass22_Sub2_23.method8932());
		super.aClass22_Sub2_23.method8896(0);
	}
}
