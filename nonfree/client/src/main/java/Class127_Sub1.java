import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gha")
public final class Class127_Sub1 extends Class127 {

	@OriginalMember(owner = "client!gha", name = "j", descriptor = "Lclient!rb;")
	private final Class287 aClass287_1;

	@OriginalMember(owner = "client!gha", name = "o", descriptor = "Lclient!tw;")
	private final Class329 aClass329_1;

	@OriginalMember(owner = "client!gha", name = "<init>", descriptor = "(Lclient!kw;Lclient!rb;)V")
	public Class127_Sub1(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) Class287 arg1) {
		super(arg0);
		this.aClass287_1 = arg1;
		this.aClass329_1 = new Class329(arg0, 2);
		this.aClass329_1.method8097(0);
		super.aClass5_Sub2_42.method5004(1);
		if (this.aClass287_1.aBoolean585) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass5_Sub2_42.method5004(0);
		this.aClass329_1.method8094();
		this.aClass329_1.method8097(1);
		super.aClass5_Sub2_42.method5004(1);
		if (this.aClass287_1.aBoolean585) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass5_Sub2_42.method5004(0);
		this.aClass329_1.method8094();
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(B)V")
	@Override
	public void method8454() {
		this.aClass329_1.method8098('\u0001');
		super.aClass5_Sub2_42.method5004(1);
		super.aClass5_Sub2_42.method4997(null);
		super.aClass5_Sub2_42.method5004(0);
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(Lclient!ou;II)V")
	@Override
	public void method8460(@OriginalArg(0) Class76 arg0, @OriginalArg(2) int arg1) {
		super.aClass5_Sub2_42.method4997(arg0);
		super.aClass5_Sub2_42.method4953(arg1);
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(ZII)V")
	@Override
	public void method8453(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(19) float local19 = (float) ((arg1 & 0x3) + 1) * -5.0E-4F;
		@Pc(30) float local30 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(41) float local41 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(49) boolean local49 = (arg1 & 0x80) != 0;
		super.aClass5_Sub2_42.method5004(1);
		if (local49) {
			Static135.aFloatArray24[2] = 0.0F;
			Static135.aFloatArray24[0] = local41;
			Static135.aFloatArray24[1] = 0.0F;
			Static135.aFloatArray24[3] = 0.0F;
		} else {
			Static135.aFloatArray24[3] = 0.0F;
			Static135.aFloatArray24[2] = local41;
			Static135.aFloatArray24[0] = 0.0F;
			Static135.aFloatArray24[1] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static135.aFloatArray24, 0);
		Static135.aFloatArray24[0] = 0.0F;
		Static135.aFloatArray24[2] = 0.0F;
		Static135.aFloatArray24[3] = (float) super.aClass5_Sub2_42.anInt5646 * local19 % 1.0F;
		Static135.aFloatArray24[1] = local41;
		OpenGL.glTexGenfv(8193, 9474, Static135.aFloatArray24, 0);
		if (this.aClass287_1.aBoolean585) {
			Static135.aFloatArray24[2] = 0.0F;
			Static135.aFloatArray24[0] = 0.0F;
			Static135.aFloatArray24[3] = local30 * (float) super.aClass5_Sub2_42.anInt5646 % 1.0F;
			Static135.aFloatArray24[1] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static135.aFloatArray24, 0);
		} else {
			@Pc(137) int local137 = (int) (local30 * (float) super.aClass5_Sub2_42.anInt5646 * 16.0F);
			super.aClass5_Sub2_42.method4997(this.aClass287_1.aClass76_Sub3Array2[local137 % 16]);
		}
		super.aClass5_Sub2_42.method5004(0);
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(ZI)V")
	@Override
	public void method8457(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!gha", name = "b", descriptor = "(IZ)V")
	@Override
	public void method8458(@OriginalArg(1) boolean arg0) {
		this.aClass329_1.method8098('\u0000');
		if (this.aClass287_1.aBoolean585) {
			super.aClass5_Sub2_42.method5004(1);
			super.aClass5_Sub2_42.method4997(this.aClass287_1.aClass76_Sub4_3);
			super.aClass5_Sub2_42.method5004(0);
		}
	}

	@OriginalMember(owner = "client!gha", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method8456() {
		return true;
	}
}
