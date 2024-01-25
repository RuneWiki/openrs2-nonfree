import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kt")
public final class Class44_Sub5 extends Class44 {

	@OriginalMember(owner = "client!kt", name = "p", descriptor = "Lclient!hm;")
	private final Class145 aClass145_3;

	@OriginalMember(owner = "client!kt", name = "s", descriptor = "Lclient!u;")
	private final Class326 aClass326_2;

	@OriginalMember(owner = "client!kt", name = "<init>", descriptor = "(Lclient!no;Lclient!hm;)V")
	public Class44_Sub5(@OriginalArg(0) Class66_Sub3 arg0, @OriginalArg(1) Class145 arg1) {
		super(arg0);
		this.aClass145_3 = arg1;
		this.aClass326_2 = new Class326(arg0, 2);
		this.aClass326_2.method7293(0);
		super.aClass66_Sub3_38.method5381(1);
		if (this.aClass145_3.aBoolean315) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass66_Sub3_38.method5381(0);
		this.aClass326_2.method7295();
		this.aClass326_2.method7293(1);
		super.aClass66_Sub3_38.method5381(1);
		if (this.aClass145_3.aBoolean315) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass66_Sub3_38.method5381(0);
		this.aClass326_2.method7295();
	}

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)Z")
	@Override
	public boolean method7484() {
		return true;
	}

	@OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)V")
	@Override
	public void method7482() {
		this.aClass326_2.method7292('\u0001');
		super.aClass66_Sub3_38.method5381(1);
		super.aClass66_Sub3_38.method5382(null);
		super.aClass66_Sub3_38.method5381(0);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(BZ)V")
	@Override
	public void method7479(@OriginalArg(1) boolean arg0) {
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(III)V")
	@Override
	public void method7476(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = (float) ((arg1 & 0x3) + 1) * -5.0E-4F;
		@Pc(25) float local25 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(36) float local36 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		super.aClass66_Sub3_38.method5381(1);
		@Pc(52) boolean local52 = (arg1 & 0x80) != 0;
		if (local52) {
			Static319.aFloatArray39[0] = local36;
			Static319.aFloatArray39[2] = 0.0F;
			Static319.aFloatArray39[3] = 0.0F;
			Static319.aFloatArray39[1] = 0.0F;
		} else {
			Static319.aFloatArray39[1] = 0.0F;
			Static319.aFloatArray39[3] = 0.0F;
			Static319.aFloatArray39[2] = local36;
			Static319.aFloatArray39[0] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static319.aFloatArray39, 0);
		Static319.aFloatArray39[2] = 0.0F;
		Static319.aFloatArray39[3] = (float) super.aClass66_Sub3_38.anInt6442 * local14 % 1.0F;
		Static319.aFloatArray39[1] = local36;
		Static319.aFloatArray39[0] = 0.0F;
		OpenGL.glTexGenfv(8193, 9474, Static319.aFloatArray39, 0);
		if (this.aClass145_3.aBoolean315) {
			Static319.aFloatArray39[1] = 0.0F;
			Static319.aFloatArray39[3] = (float) super.aClass66_Sub3_38.anInt6442 * local25 % 1.0F;
			Static319.aFloatArray39[2] = 0.0F;
			Static319.aFloatArray39[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static319.aFloatArray39, 0);
		} else {
			@Pc(135) int local135 = (int) ((float) super.aClass66_Sub3_38.anInt6442 * local25 * 16.0F);
			super.aClass66_Sub3_38.method5382(this.aClass145_3.aClass114_Sub1Array1[local135 % 16]);
		}
		super.aClass66_Sub3_38.method5381(0);
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7477(@OriginalArg(1) boolean arg0) {
		this.aClass326_2.method7292('\u0000');
		if (this.aClass145_3.aBoolean315) {
			super.aClass66_Sub3_38.method5381(1);
			super.aClass66_Sub3_38.method5382(this.aClass145_3.aClass114_Sub2_3);
			super.aClass66_Sub3_38.method5381(0);
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IILclient!hf;)V")
	@Override
	public void method7478(@OriginalArg(1) int arg0, @OriginalArg(2) Class114 arg1) {
		super.aClass66_Sub3_38.method5382(arg1);
		super.aClass66_Sub3_38.method5355(arg0);
	}
}
