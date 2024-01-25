import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bca")
public final class Class25_Sub1_Sub1 extends Class25_Sub1 {

	@OriginalMember(owner = "client!bca", name = "m", descriptor = "Lclient!te;")
	private final Class9_Sub3 aClass9_Sub3_3;

	@OriginalMember(owner = "client!bca", name = "o", descriptor = "Lclient!ci;")
	private final Class20_Sub2 aClass20_Sub2_1;

	@OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Lclient!te;I)V")
	public Class25_Sub1_Sub1(@OriginalArg(0) Class9_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass9_Sub3_3 = arg0;
		this.aClass20_Sub2_1 = new Class20_Sub2(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(ZLclient!ci;Lclient!ci;F)Z")
	public boolean method1217(@OriginalArg(1) Class20_Sub2 arg0, @OriginalArg(2) Class20_Sub2 arg1, @OriginalArg(3) float arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class205 local11 = this.aClass9_Sub3_3.aClass205_6;
		this.aClass9_Sub3_3.d(Static273.anIntArray381);
		this.aClass9_Sub3_3.n();
		this.aClass9_Sub3_3.method6690();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass20_Sub2_1.anInt1675, this.aClass20_Sub2_1.anInt1675);
		this.aClass9_Sub3_3.method6655(false);
		this.aClass9_Sub3_3.method6733(false);
		this.aClass9_Sub3_3.method6705(false);
		this.aClass9_Sub3_3.method6691(false);
		this.aClass9_Sub3_3.method6672(-2);
		this.aClass9_Sub3_3.method6660(1);
		this.aClass9_Sub3_3.method6709(0.0F, 0.0F, arg2, 0.0F);
		this.aClass9_Sub3_3.method6732(34165, 34165);
		this.aClass9_Sub3_3.method6701(arg0);
		this.aClass9_Sub3_3.method6660(0);
		this.aClass9_Sub3_3.method6670(1);
		this.aClass9_Sub3_3.method6701(arg1);
		this.aClass9_Sub3_3.method6698(local11);
		for (@Pc(117) int local117 = 0; local117 < 6; local117++) {
			@Pc(123) int local123 = local117 + 34069;
			local11.method5226(this.aClass20_Sub2_1, local123);
			local11.method5227(0);
			if (!local11.method5232()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local123 == 34069) {
				OpenGL.glTexCoord3i(65535, 65534, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65535, 65534, 65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65535, 65534, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65535, 65534, -65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65535, -65534, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65535, -65534, -65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(65535, -65534, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65535, -65534, 65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local123 == 34070) {
				OpenGL.glTexCoord3i(-65535, 65534, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65535, 65534, -65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(-65535, 65534, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65535, 65534, 65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(-65535, -65534, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65535, -65534, 65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65535, -65534, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65535, -65534, -65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local123 == 34071) {
				OpenGL.glTexCoord3i(-65534, 65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65535, -65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, 65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65535, -65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, 65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65535, 65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65534, 65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65535, 65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local123 == 34072) {
				OpenGL.glTexCoord3i(-65534, -65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65535, 65534);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, -65535, 65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65535, 65534);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, -65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65535, -65534);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65534, -65535, -65534);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65535, -65534);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local123 == 34073) {
				OpenGL.glTexCoord3i(-65534, 65534, 65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65534, 65535);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, 65534, 65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65534, 65535);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(65534, -65534, 65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65534, 65535);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(-65534, -65534, 65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65534, 65535);
				OpenGL.glVertex2f(0.0F, 1.0F);
			} else if (local123 == 34074) {
				OpenGL.glTexCoord3i(65534, 65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, 65534, -65535);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3i(-65534, 65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, 65534, -65535);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3i(-65534, -65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, -65534, -65534, -65535);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3i(65534, -65534, -65535);
				OpenGL.glMultiTexCoord3i(33985, 65534, -65534, -65535);
				OpenGL.glVertex2f(0.0F, 1.0F);
			}
			OpenGL.glEnd();
		}
		local11.method5233(0);
		this.aClass9_Sub3_3.method6707(local11);
		this.aClass9_Sub3_3.method6660(1);
		this.aClass9_Sub3_3.method6701(null);
		this.aClass9_Sub3_3.method6732(8448, 8448);
		this.aClass9_Sub3_3.method6660(0);
		this.aClass9_Sub3_3.method6701(null);
		OpenGL.glPopAttrib();
		this.aClass9_Sub3_3.N(Static273.anIntArray381[0], Static273.anIntArray381[1], Static273.anIntArray381[2], Static273.anIntArray381[3]);
		if (local7 && !this.aClass9_Sub3_3.aBoolean533) {
			this.aClass20_Sub2_1.method6238();
		}
		return local7;
	}

	@OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)Lclient!ci;")
	@Override
	public Class20_Sub2 method3934() {
		return this.aClass20_Sub2_1;
	}

	@OriginalMember(owner = "client!bca", name = "d", descriptor = "(B)I")
	public int method1219() {
		return this.aClass20_Sub2_1.anInt1675;
	}
}
