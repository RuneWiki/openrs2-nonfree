import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public final class Class127_Sub7 extends Class127 {

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "Lclient!tw;")
	private Class329 aClass329_4;

	@OriginalMember(owner = "client!qn", name = "r", descriptor = "Lclient!rb;")
	private final Class287 aClass287_5;

	@OriginalMember(owner = "client!qn", name = "p", descriptor = "Lclient!lda;")
	private final Class76_Sub2 aClass76_Sub2_1;

	@OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lclient!kw;Lclient!rb;)V")
	public Class127_Sub7(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) Class287 arg1) {
		super(arg0);
		this.aClass287_5 = arg1;
		this.method7090();
		this.aClass76_Sub2_1 = new Class76_Sub2(super.aClass5_Sub2_42, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass76_Sub2_1.method5160();
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8456() {
		return true;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8457(@OriginalArg(0) boolean arg0) {
		super.aClass5_Sub2_42.method4982(8448, 260);
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8458(@OriginalArg(1) boolean arg0) {
		if (super.aClass5_Sub2_42.anInt5686 > 0) {
			@Pc(13) float local13 = -0.5F / (float) super.aClass5_Sub2_42.anInt5686;
			super.aClass5_Sub2_42.method5004(1);
			Static482.aFloatArray72[2] = local13;
			Static482.aFloatArray72[0] = 0.0F;
			Static482.aFloatArray72[3] = local13 * super.aClass5_Sub2_42.aFloat119 + 0.25F;
			Static482.aFloatArray72[1] = 0.0F;
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glTexGenfv(8192, 9474, Static482.aFloatArray72, 0);
			OpenGL.glPopMatrix();
			super.aClass5_Sub2_42.method4996((float) super.aClass5_Sub2_42.anInt5686, 0.5F);
			super.aClass5_Sub2_42.method4997(this.aClass76_Sub2_1);
			super.aClass5_Sub2_42.method5004(0);
		}
		this.aClass329_4.method8098('\u0000');
		OpenGL.glMatrixMode(5890);
		OpenGL.glPushMatrix();
		OpenGL.glScalef(0.25F, 0.25F, 1.0F);
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)V")
	@Override
	public void method8454() {
		this.aClass329_4.method8098('\u0001');
		if (super.aClass5_Sub2_42.anInt5686 > 0) {
			super.aClass5_Sub2_42.method5004(1);
			super.aClass5_Sub2_42.method4997(null);
			super.aClass5_Sub2_42.method4996(0.0F, 1.0F);
			super.aClass5_Sub2_42.method5004(0);
		}
		super.aClass5_Sub2_42.method4982(8448, 8448);
		OpenGL.glMatrixMode(5890);
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Lclient!ou;II)V")
	@Override
	public void method8460(@OriginalArg(0) Class76 arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(I)V")
	private void method7090() {
		this.aClass329_4 = new Class329(super.aClass5_Sub2_42, 2);
		this.aClass329_4.method8097(0);
		super.aClass5_Sub2_42.method5004(1);
		super.aClass5_Sub2_42.method4982(260, 7681);
		super.aClass5_Sub2_42.method5000(34168, 768, 0);
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glEnable(3168);
		super.aClass5_Sub2_42.method5004(0);
		OpenGL.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass287_5.aBoolean585) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glTexGeni(8195, 9472, 9217);
			OpenGL.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			OpenGL.glEnable(3170);
			OpenGL.glEnable(3171);
		}
		this.aClass329_4.method8094();
		this.aClass329_4.method8097(1);
		super.aClass5_Sub2_42.method5004(1);
		super.aClass5_Sub2_42.method4982(8448, 8448);
		super.aClass5_Sub2_42.method5000(5890, 768, 0);
		OpenGL.glDisable(3168);
		super.aClass5_Sub2_42.method5004(0);
		OpenGL.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass287_5.aBoolean585) {
			OpenGL.glDisable(3170);
			OpenGL.glDisable(3171);
		}
		this.aClass329_4.method8094();
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8453(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if ((arg1 & 0x1) == 1) {
			if (this.aClass287_5.aBoolean585) {
				super.aClass5_Sub2_42.method4997(this.aClass287_5.aClass76_Sub4_2);
				Static482.aFloatArray72[2] = 0.0F;
				Static482.aFloatArray72[1] = 0.0F;
				Static482.aFloatArray72[3] = (float) (super.aClass5_Sub2_42.anInt5646 % 4000) / 4000.0F;
				Static482.aFloatArray72[0] = 0.0F;
				OpenGL.glTexGenfv(8194, 9473, Static482.aFloatArray72, 0);
			} else {
				@Pc(24) int local24 = super.aClass5_Sub2_42.anInt5646 % 4000 * 16 / 4000;
				super.aClass5_Sub2_42.method4997(this.aClass287_5.aClass76_Sub3Array3[local24]);
			}
		} else if (this.aClass287_5.aBoolean585) {
			super.aClass5_Sub2_42.method4997(this.aClass287_5.aClass76_Sub4_2);
			Static482.aFloatArray72[3] = 0.0F;
			Static482.aFloatArray72[0] = 0.0F;
			Static482.aFloatArray72[1] = 0.0F;
			Static482.aFloatArray72[2] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static482.aFloatArray72, 0);
		} else {
			super.aClass5_Sub2_42.method4997(this.aClass287_5.aClass76_Sub3Array3[0]);
		}
	}
}
