import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jq")
public final class Class5_Sub5 extends Class5 {

	@OriginalMember(owner = "client!jq", name = "m", descriptor = "Lclient!kq;")
	private Class144 aClass144_4;

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "Lclient!mt;")
	private final Class171 aClass171_3;

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "Lclient!ci;")
	private final Class40_Sub1 aClass40_Sub1_1;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!bl;Lclient!mt;)V")
	public Class5_Sub5(@OriginalArg(0) Class28_Sub1 arg0, @OriginalArg(1) Class171 arg1) {
		super(arg0);
		this.aClass171_3 = arg1;
		this.method2947();
		this.aClass40_Sub1_1 = new Class40_Sub1(super.aClass28_Sub1_42, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass40_Sub1_1.method938();
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5928() {
		return true;
	}

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V")
	private void method2947() {
		this.aClass144_4 = new Class144(super.aClass28_Sub1_42, 2);
		this.aClass144_4.method3283(0);
		super.aClass28_Sub1_42.method650(1);
		super.aClass28_Sub1_42.method692(260, 7681);
		super.aClass28_Sub1_42.method665(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass28_Sub1_42.method650(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass171_3.aBoolean281) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass144_4.method3284();
		this.aClass144_4.method3283(1);
		super.aClass28_Sub1_42.method650(1);
		super.aClass28_Sub1_42.method692(8448, 8448);
		super.aClass28_Sub1_42.method665(5890, 768, 0);
		OpenGL.glDisable(3168);
		super.aClass28_Sub1_42.method650(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass171_3.aBoolean281) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass144_4.method3284();
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lclient!ce;IZ)V")
	@Override
	public void method5927(@OriginalArg(0) Class40 arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(III)V")
	@Override
	public void method5923(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass171_3.aBoolean281) {
				super.aClass28_Sub1_42.method654(this.aClass171_3.aClass40_Sub2_3);
				Static401.aFloatArray31[2] = 0.0F;
				Static401.aFloatArray31[1] = 0.0F;
				Static401.aFloatArray31[3] = (float) (super.aClass28_Sub1_42.anInt737 % 4000) / 4000.0F;
				Static401.aFloatArray31[0] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static401.aFloatArray31, 0);
			} else {
				@Pc(108) int local108 = super.aClass28_Sub1_42.anInt737 % 4000 * 16 / 4000;
				super.aClass28_Sub1_42.method654(this.aClass171_3.aClass40_Sub3Array2[local108]);
			}
		} else if (this.aClass171_3.aBoolean281) {
			super.aClass28_Sub1_42.method654(this.aClass171_3.aClass40_Sub2_3);
			Static401.aFloatArray31[0] = 0.0F;
			Static401.aFloatArray31[2] = 0.0F;
			Static401.aFloatArray31[3] = 0.0F;
			Static401.aFloatArray31[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static401.aFloatArray31, 0);
		} else {
			super.aClass28_Sub1_42.method654(this.aClass171_3.aClass40_Sub3Array2[0]);
		}
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IZ)V")
	@Override
	public void method5926(@OriginalArg(1) boolean arg0) {
		super.aClass28_Sub1_42.method692(8448, 260);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5925(@OriginalArg(0) boolean arg0) {
		if (super.aClass28_Sub1_42.anInt775 > 0) {
			@Pc(13) float local13 = -0.5F / (float) super.aClass28_Sub1_42.anInt775;
			super.aClass28_Sub1_42.method650(1);
			Static401.aFloatArray31[2] = local13;
			Static401.aFloatArray31[0] = 0.0F;
			Static401.aFloatArray31[1] = 0.0F;
			Static401.aFloatArray31[3] = super.aClass28_Sub1_42.aFloat12 * local13 + 0.25F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static401.aFloatArray31, 0);
			OpenGL.glPopMatrix();
			super.aClass28_Sub1_42.method658((float) super.aClass28_Sub1_42.anInt775, 0.5F);
			super.aClass28_Sub1_42.method654(this.aClass40_Sub1_1);
			super.aClass28_Sub1_42.method650(0);
		}
		this.aClass144_4.method3285('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(B)V")
	@Override
	public void method5922() {
		this.aClass144_4.method3285('\u0001');
		if (super.aClass28_Sub1_42.anInt775 > 0) {
			super.aClass28_Sub1_42.method650(1);
			super.aClass28_Sub1_42.method654(null);
			super.aClass28_Sub1_42.method658(0.0F, 1.0F);
			super.aClass28_Sub1_42.method650(0);
		}
		super.aClass28_Sub1_42.method692(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}
}
