import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class84_Sub9 extends Class84 {

	@OriginalMember(owner = "client!un", name = "k", descriptor = "Lclient!qh;")
	private final Class202 aClass202_6;

	@OriginalMember(owner = "client!un", name = "o", descriptor = "Lclient!bw;")
	private final Class32 aClass32_6;

	static {
		new Class151("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
	}

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!od;Lclient!qh;)V")
	public Class84_Sub9(@OriginalArg(0) Class128_Sub2 arg0, @OriginalArg(1) Class202 arg1) {
		super(arg0);
		this.aClass202_6 = arg1;
		this.aClass32_6 = new Class32(arg0, 2);
		this.aClass32_6.method657(0);
		super.aClass128_Sub2_39.method3667(1);
		if (this.aClass202_6.aBoolean437) {
			OpenGL.glTexGeni(8194, 9472, 9217);
			OpenGL.glEnable(3170);
		}
		OpenGL.glTexGeni(8192, 9472, 9216);
		OpenGL.glTexGeni(8193, 9472, 9216);
		OpenGL.glEnable(3168);
		OpenGL.glEnable(3169);
		super.aClass128_Sub2_39.method3667(0);
		this.aClass32_6.method658();
		this.aClass32_6.method657(1);
		super.aClass128_Sub2_39.method3667(1);
		if (this.aClass202_6.aBoolean437) {
			OpenGL.glDisable(3170);
		}
		OpenGL.glDisable(3168);
		OpenGL.glDisable(3169);
		super.aClass128_Sub2_39.method3667(0);
		this.aClass32_6.method658();
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)Z")
	@Override
	public boolean method5155() {
		return true;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Z)V")
	@Override
	public void method5153() {
		this.aClass32_6.method651('\u0001');
		super.aClass128_Sub2_39.method3667(1);
		super.aClass128_Sub2_39.method3691(null);
		super.aClass128_Sub2_39.method3667(0);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Lclient!jk;IB)V")
	@Override
	public void method5152(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1) {
		super.aClass128_Sub2_39.method3691(arg0);
		super.aClass128_Sub2_39.method3677(arg1);
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ZB)V")
	@Override
	public void method5150(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ZI)V")
	@Override
	public void method5149(@OriginalArg(0) boolean arg0) {
		this.aClass32_6.method651('\u0000');
		if (this.aClass202_6.aBoolean437) {
			super.aClass128_Sub2_39.method3667(1);
			super.aClass128_Sub2_39.method3691(this.aClass202_6.aClass5_Sub3_2);
			super.aClass128_Sub2_39.method3667(0);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(III)V")
	@Override
	public void method5154(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) float local14 = -5.0E-4F * (float) ((arg1 & 0x3) + 1);
		@Pc(33) float local33 = (float) ((arg1 >> 3 & 0x3) + 1) * 5.0E-4F;
		@Pc(41) float local41 = (arg1 & 0x40) == 0 ? 4.8828125E-4F : 9.765625E-4F;
		@Pc(49) boolean local49 = (arg1 & 0x80) != 0;
		super.aClass128_Sub2_39.method3667(1);
		if (local49) {
			Static52.aFloatArray3[3] = 0.0F;
			Static52.aFloatArray3[0] = local41;
			Static52.aFloatArray3[1] = 0.0F;
			Static52.aFloatArray3[2] = 0.0F;
		} else {
			Static52.aFloatArray3[1] = 0.0F;
			Static52.aFloatArray3[2] = local41;
			Static52.aFloatArray3[0] = 0.0F;
			Static52.aFloatArray3[3] = 0.0F;
		}
		OpenGL.glTexGenfv(8192, 9474, Static52.aFloatArray3, 0);
		Static52.aFloatArray3[3] = (float) super.aClass128_Sub2_39.anInt4604 * local14 % 1.0F;
		Static52.aFloatArray3[0] = 0.0F;
		Static52.aFloatArray3[2] = 0.0F;
		Static52.aFloatArray3[1] = local41;
		OpenGL.glTexGenfv(8193, 9474, Static52.aFloatArray3, 0);
		if (this.aClass202_6.aBoolean437) {
			Static52.aFloatArray3[2] = 0.0F;
			Static52.aFloatArray3[3] = (float) super.aClass128_Sub2_39.anInt4604 * local33 % 1.0F;
			Static52.aFloatArray3[1] = 0.0F;
			Static52.aFloatArray3[0] = 0.0F;
			OpenGL.glTexGenfv(8194, 9473, Static52.aFloatArray3, 0);
		} else {
			@Pc(137) int local137 = (int) ((float) super.aClass128_Sub2_39.anInt4604 * local33 * 16.0F);
			super.aClass128_Sub2_39.method3691(this.aClass202_6.aClass5_Sub1Array3[local137 % 16]);
		}
		super.aClass128_Sub2_39.method3667(0);
	}
}
