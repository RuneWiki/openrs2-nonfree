import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class86_Sub5 extends Class86 {

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "Lclient!mb;")
	private final Class152 aClass152_4;

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "Lclient!ma;")
	private final Class151 aClass151_4;

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "(Lclient!mi;Lclient!mb;)V")
	public Class86_Sub5(@OriginalArg(0) Class155_Sub1 arg0, @OriginalArg(1) Class152 arg1) {
		super(arg0);
		this.aClass152_4 = arg1;
		@Pc(8) opengl local8 = arg0.anOpengl1;
		this.aClass151_4 = new Class151(arg0, 2);
		this.aClass151_4.method3281(0);
		this.aClass155_Sub1_39.method3590(1);
		if (this.aClass152_4.aBoolean269) {
			local8.glTexGeni(8194, 9472, 9217);
			local8.glEnable(3170);
		}
		local8.glTexGeni(8192, 9472, 9216);
		local8.glTexGeni(8193, 9472, 9216);
		local8.glEnable(3168);
		local8.glEnable(3169);
		this.aClass155_Sub1_39.method3590(0);
		this.aClass151_4.method3280();
		this.aClass151_4.method3281(1);
		this.aClass155_Sub1_39.method3590(1);
		if (this.aClass152_4.aBoolean269) {
			local8.glDisable(3170);
		}
		local8.glDisable(3168);
		local8.glDisable(3169);
		this.aClass155_Sub1_39.method3590(0);
		this.aClass151_4.method3280();
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
	@Override
	public void method5359(@OriginalArg(0) int arg0) {
		@Pc(8) float local8 = -5.0E-4F * (float) ((arg0 & 0x3) + 1);
		@Pc(19) float local19 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(27) float local27 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(35) boolean local35 = (arg0 & 0x80) != 0;
		@Pc(39) opengl local39 = this.aClass155_Sub1_39.anOpengl1;
		this.aClass155_Sub1_39.method3590(1);
		if (local35) {
			Static265.aFloatArray24[0] = local27;
			Static265.aFloatArray24[1] = 0.0F;
			Static265.aFloatArray24[2] = 0.0F;
			Static265.aFloatArray24[3] = 0.0F;
		} else {
			Static265.aFloatArray24[0] = 0.0F;
			Static265.aFloatArray24[1] = 0.0F;
			Static265.aFloatArray24[2] = local27;
			Static265.aFloatArray24[3] = 0.0F;
		}
		local39.glTexGenfv(8192, 9474, Static265.aFloatArray24, 0);
		Static265.aFloatArray24[0] = 0.0F;
		Static265.aFloatArray24[1] = local27;
		Static265.aFloatArray24[2] = 0.0F;
		Static265.aFloatArray24[3] = (float) this.aClass155_Sub1_39.anInt3844 * local8 % 1.0F;
		local39.glTexGenfv(8193, 9474, Static265.aFloatArray24, 0);
		if (this.aClass152_4.aBoolean269) {
			Static265.aFloatArray24[0] = 0.0F;
			Static265.aFloatArray24[1] = 0.0F;
			Static265.aFloatArray24[2] = 0.0F;
			Static265.aFloatArray24[3] = (float) this.aClass155_Sub1_39.anInt3844 * local19 % 1.0F;
			local39.glTexGenfv(8194, 9473, Static265.aFloatArray24, 0);
		} else {
			@Pc(127) int local127 = (int) (local19 * (float) this.aClass155_Sub1_39.anInt3844 * 16.0F);
			this.aClass155_Sub1_39.method3585(this.aClass152_4.aClass30_Sub3Array3[local127 % 16]);
		}
		this.aClass155_Sub1_39.method3590(0);
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(Z)V")
	@Override
	public void method5362(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)V")
	@Override
	public void method5360(@OriginalArg(0) boolean arg0) {
		this.aClass151_4.method3279('\u0000');
		if (this.aClass152_4.aBoolean269) {
			this.aClass155_Sub1_39.method3590(1);
			this.aClass155_Sub1_39.method3585(this.aClass152_4.aClass30_Sub2_2);
			this.aClass155_Sub1_39.method3590(0);
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "()Z")
	@Override
	public boolean method5358() {
		return true;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!bl;)V")
	@Override
	public void method5357(@OriginalArg(0) Class30 arg0) {
		this.aClass155_Sub1_39.method3585(arg0);
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "()V")
	@Override
	public void method5361() {
		this.aClass151_4.method3279('\u0001');
		this.aClass155_Sub1_39.method3590(1);
		this.aClass155_Sub1_39.method3585(null);
		this.aClass155_Sub1_39.method3590(0);
	}
}
