import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class205_Sub1_Sub1 extends Class205_Sub1 {

	@OriginalMember(owner = "client!li", name = "h", descriptor = "Lclient!kw;")
	private final Class5_Sub2 aClass5_Sub2_23;

	@OriginalMember(owner = "client!li", name = "j", descriptor = "Lclient!dm;")
	private final Class76_Sub1 aClass76_Sub1_1;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!kw;I)V")
	public Class205_Sub1_Sub1(@OriginalArg(0) Class5_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass5_Sub2_23 = arg0;
		this.aClass76_Sub1_1 = new Class76_Sub1(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(B)Lclient!dm;")
	@Override
	public Class76_Sub1 method6466() {
		return this.aClass76_Sub1_1;
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(I)I")
	public int method5260() {
		return this.aClass76_Sub1_1.anInt2308;
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(Lclient!dm;Lclient!dm;FB)Z")
	public boolean method5261(@OriginalArg(0) Class76_Sub1 arg0, @OriginalArg(1) Class76_Sub1 arg1, @OriginalArg(2) float arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class320 local11 = this.aClass5_Sub2_23.aClass320_5;
		this.aClass5_Sub2_23.K(Static204.anIntArray208);
		this.aClass5_Sub2_23.la();
		this.aClass5_Sub2_23.method4970();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass76_Sub1_1.anInt2308, this.aClass76_Sub1_1.anInt2308);
		this.aClass5_Sub2_23.method5023(false);
		this.aClass5_Sub2_23.method4975(false);
		this.aClass5_Sub2_23.method5013(false);
		this.aClass5_Sub2_23.method4993(false);
		this.aClass5_Sub2_23.method5009(-2);
		this.aClass5_Sub2_23.method5004(1);
		this.aClass5_Sub2_23.method4973(0.0F, 0.0F, 0.0F, arg2);
		this.aClass5_Sub2_23.method4982(34165, 34165);
		this.aClass5_Sub2_23.method4997(arg1);
		this.aClass5_Sub2_23.method5004(0);
		this.aClass5_Sub2_23.method4953(1);
		this.aClass5_Sub2_23.method4997(arg0);
		this.aClass5_Sub2_23.method5028(local11);
		for (@Pc(117) int local117 = 0; local117 < 6; local117++) {
			@Pc(123) int local123 = local117 + 34069;
			local11.method7965(this.aClass76_Sub1_1, local123);
			local11.method7963(0);
			if (!local11.method7964()) {
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
		local11.method7961(0);
		this.aClass5_Sub2_23.method5026(local11);
		this.aClass5_Sub2_23.method5004(1);
		this.aClass5_Sub2_23.method4997(null);
		this.aClass5_Sub2_23.method4982(8448, 8448);
		this.aClass5_Sub2_23.method5004(0);
		this.aClass5_Sub2_23.method4997(null);
		OpenGL.glPopAttrib();
		this.aClass5_Sub2_23.KA(Static204.anIntArray208[0], Static204.anIntArray208[1], Static204.anIntArray208[2], Static204.anIntArray208[3]);
		if (local7 && !this.aClass5_Sub2_23.aBoolean381) {
			this.aClass76_Sub1_1.method7925();
		}
		return local7;
	}
}
