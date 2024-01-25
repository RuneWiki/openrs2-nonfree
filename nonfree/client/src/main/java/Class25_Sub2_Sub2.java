import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pia")
public final class Class25_Sub2_Sub2 extends Class25_Sub2 {

	@OriginalMember(owner = "client!pia", name = "m", descriptor = "Lclient!pq;")
	private final Class132_Sub3 aClass132_Sub3_35;

	@OriginalMember(owner = "client!pia", name = "i", descriptor = "Lclient!jka;")
	private final Class53_Sub3 aClass53_Sub3_2;

	@OriginalMember(owner = "client!pia", name = "<init>", descriptor = "(Lclient!pq;I)V")
	public Class25_Sub2_Sub2(@OriginalArg(0) Class132_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass132_Sub3_35 = arg0;
		this.aClass53_Sub3_2 = new Class53_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(Lclient!jka;ILclient!jka;F)Z")
	public boolean method6551(@OriginalArg(0) Class53_Sub3 arg0, @OriginalArg(2) Class53_Sub3 arg1, @OriginalArg(3) float arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class143 local11 = this.aClass132_Sub3_35.aClass143_7;
		this.aClass132_Sub3_35.K(Static412.anIntArray442);
		this.aClass132_Sub3_35.la();
		this.aClass132_Sub3_35.method6765();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass53_Sub3_2.anInt4822, this.aClass53_Sub3_2.anInt4822);
		this.aClass132_Sub3_35.method6774(false);
		this.aClass132_Sub3_35.method6742(false);
		this.aClass132_Sub3_35.method6764(false);
		this.aClass132_Sub3_35.method6787(false);
		this.aClass132_Sub3_35.method6772(-2);
		this.aClass132_Sub3_35.method6802(1);
		this.aClass132_Sub3_35.method6746(0.0F, 0.0F, 0.0F, arg2);
		this.aClass132_Sub3_35.method6770(34165, 34165);
		this.aClass132_Sub3_35.method6759(arg1);
		this.aClass132_Sub3_35.method6802(0);
		this.aClass132_Sub3_35.method6803(1);
		this.aClass132_Sub3_35.method6759(arg0);
		this.aClass132_Sub3_35.method6814(local11);
		for (@Pc(123) int local123 = 0; local123 < 6; local123++) {
			@Pc(129) int local129 = local123 + 34069;
			local11.method3137(local129, this.aClass53_Sub3_2);
			local11.method3129(0);
			if (!local11.method3136()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local129 == 34069) {
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
			} else if (local129 == 34070) {
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
			} else if (local129 == 34071) {
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
			} else if (local129 == 34072) {
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
			} else if (local129 == 34073) {
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
			} else if (local129 == 34074) {
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
		local11.method3138(0);
		this.aClass132_Sub3_35.method6799(local11);
		this.aClass132_Sub3_35.method6802(1);
		this.aClass132_Sub3_35.method6759((Class53) null);
		this.aClass132_Sub3_35.method6770(8448, 8448);
		this.aClass132_Sub3_35.method6802(0);
		this.aClass132_Sub3_35.method6759((Class53) null);
		OpenGL.glPopAttrib();
		this.aClass132_Sub3_35.KA(Static412.anIntArray442[0], Static412.anIntArray442[1], Static412.anIntArray442[2], Static412.anIntArray442[3]);
		if (local7 && !this.aClass132_Sub3_35.aBoolean524) {
			this.aClass53_Sub3_2.method8288();
		}
		return local7;
	}

	@OriginalMember(owner = "client!pia", name = "b", descriptor = "(I)I")
	public int method6553() {
		return this.aClass53_Sub3_2.anInt4822;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)Lclient!jka;")
	@Override
	public Class53_Sub3 method6550() {
		return this.aClass53_Sub3_2;
	}
}
