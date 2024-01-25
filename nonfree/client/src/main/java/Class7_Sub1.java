import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class7_Sub1 extends Class7 {

	@OriginalMember(owner = "client!ai", name = "d", descriptor = "Lclient!jb;")
	private Class115 aClass115_1;

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "Lclient!s;")
	private final Class213 aClass213_1;

	@OriginalMember(owner = "client!ai", name = "e", descriptor = "Lclient!ea;")
	private final Class20_Sub2 aClass20_Sub2_1;

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Lclient!fu;Lclient!s;)V")
	public Class7_Sub1(@OriginalArg(0) Class63_Sub2 arg0, @OriginalArg(1) Class213 arg1) {
		super(arg0);
		this.aClass213_1 = arg1;
		this.method164();
		this.aClass20_Sub2_1 = new Class20_Sub2(this.aClass63_Sub2_41, 6406, 2, new byte[] { 0, -1 }, 6406);
		this.aClass20_Sub2_1.method1099();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Z)V")
	@Override
	public void method5471(@OriginalArg(0) boolean arg0) {
		this.aClass63_Sub2_41.method2091(260, 8448);
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "()V")
	@Override
	public void method5472() {
		@Pc(3) opengl local3 = this.aClass63_Sub2_41.anOpengl2;
		this.aClass115_1.method2847('\u0001');
		if (this.aClass63_Sub2_41.anInt2119 > 0) {
			this.aClass63_Sub2_41.method2115(1);
			this.aClass63_Sub2_41.method2068(null);
			this.aClass63_Sub2_41.method2134(1.0F, 0.0F);
			this.aClass63_Sub2_41.method2115(0);
		}
		this.aClass63_Sub2_41.method2091(8448, 8448);
		local3.glMatrixMode(5890);
		local3.glPopMatrix();
		local3.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "()V")
	private void method164() {
		@Pc(3) opengl local3 = this.aClass63_Sub2_41.anOpengl2;
		this.aClass115_1 = new Class115(this.aClass63_Sub2_41, 2);
		this.aClass115_1.method2846(0);
		this.aClass63_Sub2_41.method2115(1);
		this.aClass63_Sub2_41.method2091(7681, 260);
		this.aClass63_Sub2_41.method2081(0, 34168, 768);
		local3.glTexGeni(8192, 9472, 9216);
		local3.glEnable(3168);
		this.aClass63_Sub2_41.method2115(0);
		local3.glTexEnvf(8960, 34163, 2.0F);
		if (this.aClass213_1.aBoolean387) {
			local3.glTexGeni(8194, 9472, 9217);
			local3.glTexGeni(8195, 9472, 9217);
			local3.glTexGenfv(8195, 9473, new float[] { 0.0F, 0.0F, 0.0F, 1.0F }, 0);
			local3.glEnable(3170);
			local3.glEnable(3171);
		}
		this.aClass115_1.method2848();
		this.aClass115_1.method2846(1);
		this.aClass63_Sub2_41.method2115(1);
		this.aClass63_Sub2_41.method2091(8448, 8448);
		this.aClass63_Sub2_41.method2081(0, 5890, 768);
		local3.glDisable(3168);
		this.aClass63_Sub2_41.method2115(0);
		local3.glTexEnvf(8960, 34163, 1.0F);
		if (this.aClass213_1.aBoolean387) {
			local3.glDisable(3170);
			local3.glDisable(3171);
		}
		this.aClass115_1.method2848();
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
	@Override
	public void method5474(@OriginalArg(0) int arg0) {
		if ((arg0 & 0x1) == 1) {
			if (this.aClass213_1.aBoolean387) {
				this.aClass63_Sub2_41.method2068(this.aClass213_1.aClass20_Sub3_1);
				Static7.aFloatArray1[0] = 0.0F;
				Static7.aFloatArray1[1] = 0.0F;
				Static7.aFloatArray1[2] = 0.0F;
				Static7.aFloatArray1[3] = (float) (this.aClass63_Sub2_41.anInt2088 % 4000) / 4000.0F;
				this.aClass63_Sub2_41.anOpengl2.glTexGenfv(8194, 9473, Static7.aFloatArray1, 0);
			} else {
				@Pc(56) int local56 = this.aClass63_Sub2_41.anInt2088 % 4000 * 16 / 4000;
				this.aClass63_Sub2_41.method2068(this.aClass213_1.aClass20_Sub4Array4[local56]);
			}
		} else if (this.aClass213_1.aBoolean387) {
			this.aClass63_Sub2_41.method2068(this.aClass213_1.aClass20_Sub3_1);
			Static7.aFloatArray1[0] = 0.0F;
			Static7.aFloatArray1[1] = 0.0F;
			Static7.aFloatArray1[2] = 0.0F;
			Static7.aFloatArray1[3] = 0.0F;
			this.aClass63_Sub2_41.anOpengl2.glTexGenfv(8194, 9473, Static7.aFloatArray1, 0);
		} else {
			this.aClass63_Sub2_41.method2068(this.aClass213_1.aClass20_Sub4Array4[0]);
		}
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "()Z")
	@Override
	public boolean method5473() {
		return true;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!tp;)V")
	@Override
	public void method5475(@OriginalArg(0) Class20 arg0) {
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(Z)V")
	@Override
	public void method5476(@OriginalArg(0) boolean arg0) {
		@Pc(3) opengl local3 = this.aClass63_Sub2_41.anOpengl2;
		if (this.aClass63_Sub2_41.anInt2119 > 0) {
			@Pc(14) float local14 = -0.5F / (float) this.aClass63_Sub2_41.anInt2119;
			this.aClass63_Sub2_41.method2115(1);
			Static7.aFloatArray1[0] = 0.0F;
			Static7.aFloatArray1[1] = 0.0F;
			Static7.aFloatArray1[2] = local14;
			Static7.aFloatArray1[3] = this.aClass63_Sub2_41.aFloat34 * local14 + 0.25F;
			local3.glPushMatrix();
			local3.glLoadIdentity();
			local3.glTexGenfv(8192, 9474, Static7.aFloatArray1, 0);
			local3.glPopMatrix();
			this.aClass63_Sub2_41.method2134(0.5F, (float) this.aClass63_Sub2_41.anInt2119);
			this.aClass63_Sub2_41.method2068(this.aClass20_Sub2_1);
			this.aClass63_Sub2_41.method2115(0);
		}
		this.aClass115_1.method2847('\u0000');
		local3.glMatrixMode(5890);
		local3.glPushMatrix();
		local3.glScalef(0.25F, 0.25F, 1.0F);
		local3.glMatrixMode(5888);
	}
}
