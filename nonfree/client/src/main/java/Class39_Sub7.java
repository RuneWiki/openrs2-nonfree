import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vs")
public final class Class39_Sub7 extends Class39 {

	@OriginalMember(owner = "client!vs", name = "o", descriptor = "Lclient!ah;")
	private final Class12 aClass12_4;

	@OriginalMember(owner = "client!vs", name = "e", descriptor = "Lclient!iw;")
	private final Class169 aClass169_5;

	@OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lclient!rs;Lclient!ah;)V")
	public Class39_Sub7(@OriginalArg(0) Class133_Sub3 arg0, @OriginalArg(1) Class12 arg1) {
		super(arg0);
		this.aClass12_4 = arg1;
		this.aClass169_5 = new Class169(arg0, 2);
		this.aClass169_5.method4029(0);
		super.aClass133_Sub3_42.method7368(1);
		if (this.aClass12_4.aBoolean10) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass133_Sub3_42.method7368(0);
		this.aClass169_5.method4027();
		this.aClass169_5.method4029(1);
		super.aClass133_Sub3_42.method7368(1);
		if (this.aClass12_4.aBoolean10) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass133_Sub3_42.method7368(0);
		this.aClass169_5.method4027();
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(Z)V")
	@Override
	public void method8866() {
		this.aClass169_5.method4025('\u0001');
		super.aClass133_Sub3_42.method7368(1);
		super.aClass133_Sub3_42.method7375(null);
		super.aClass133_Sub3_42.method7368(0);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ILclient!nba;I)V")
	@Override
	public void method8864(@OriginalArg(0) int arg0, @OriginalArg(1) Class167 arg1) {
		super.aClass133_Sub3_42.method7375(arg1);
		super.aClass133_Sub3_42.method7401(arg0);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIB)V")
	@Override
	public void method8860(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(14) float local14 = (float) ((arg0 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg0 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(33) float local33 = (arg0 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(48) boolean local48 = (arg0 & 0x80) != 0;
		super.aClass133_Sub3_42.method7368(1);
		if (local48) {
			Static317.aFloatArray42[2] = 0.0F;
			Static317.aFloatArray42[1] = 0.0F;
			Static317.aFloatArray42[3] = 0.0F;
			Static317.aFloatArray42[0] = local33;
		} else {
			Static317.aFloatArray42[2] = local33;
			Static317.aFloatArray42[0] = 0.0F;
			Static317.aFloatArray42[1] = 0.0F;
			Static317.aFloatArray42[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static317.aFloatArray42, 0);
		Static317.aFloatArray42[0] = 0.0F;
		Static317.aFloatArray42[1] = local33;
		Static317.aFloatArray42[2] = 0.0F;
		Static317.aFloatArray42[3] = (float) super.aClass133_Sub3_42.anInt8530 * local14 % 1.0F;
		OpenGL.glTexGenfv(8193, 9474, Static317.aFloatArray42, 0);
		if (this.aClass12_4.aBoolean10) {
			Static317.aFloatArray42[1] = 0.0F;
			Static317.aFloatArray42[3] = (float) super.aClass133_Sub3_42.anInt8530 * local25 % 1.0F;
			Static317.aFloatArray42[0] = 0.0F;
			Static317.aFloatArray42[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static317.aFloatArray42, 0);
		} else {
			@Pc(136) int local136 = (int) ((float) super.aClass133_Sub3_42.anInt8530 * local25 * 16.0F);
			super.aClass133_Sub3_42.method7375(this.aClass12_4.aClass167_Sub3Array1[local136 % 16]);
		}
		super.aClass133_Sub3_42.method7368(0);
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8863(@OriginalArg(0) boolean arg0) {
		this.aClass169_5.method4025('\u0000');
		if (this.aClass12_4.aBoolean10) {
			super.aClass133_Sub3_42.method7368(1);
			super.aClass133_Sub3_42.method7375(this.aClass12_4.aClass167_Sub4_3);
			super.aClass133_Sub3_42.method7368(0);
		}
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(IZ)V")
	@Override
	public void method8862(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8865() {
		return true;
	}
}
