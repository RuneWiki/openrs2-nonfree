import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ega")
public final class Class11_Sub1_Sub1 extends Class11_Sub1 {

	@OriginalMember(owner = "client!ega", name = "u", descriptor = "Lclient!kv;")
	private final Class143_Sub2 aClass143_Sub2_16;

	@OriginalMember(owner = "client!ega", name = "o", descriptor = "Lclient!mu;")
	private final Class44_Sub3 aClass44_Sub3_1;

	@OriginalMember(owner = "client!ega", name = "<init>", descriptor = "(Lclient!kv;I)V")
	public Class11_Sub1_Sub1(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass143_Sub2_16 = arg0;
		this.aClass44_Sub3_1 = new Class44_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!ega", name = "c", descriptor = "(I)I")
	public int method1997() {
		return this.aClass44_Sub3_1.anInt6605;
	}

	@OriginalMember(owner = "client!ega", name = "a", descriptor = "(FLclient!mu;Lclient!mu;Z)Z")
	public boolean method1998(@OriginalArg(0) float arg0, @OriginalArg(1) Class44_Sub3 arg1, @OriginalArg(2) Class44_Sub3 arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class318 local11 = this.aClass143_Sub2_16.aClass318_7;
		this.aClass143_Sub2_16.K(Static614.anIntArray565);
		this.aClass143_Sub2_16.la();
		this.aClass143_Sub2_16.method4992();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass44_Sub3_1.anInt6605, this.aClass44_Sub3_1.anInt6605);
		this.aClass143_Sub2_16.method4976(false);
		this.aClass143_Sub2_16.method4993(false);
		this.aClass143_Sub2_16.method4997(false);
		this.aClass143_Sub2_16.method4931(false);
		this.aClass143_Sub2_16.method4978(-2);
		this.aClass143_Sub2_16.method4930(1);
		this.aClass143_Sub2_16.method4984(0.0F, 0.0F, 0.0F, arg0);
		this.aClass143_Sub2_16.method4940(34165, 34165);
		this.aClass143_Sub2_16.method4945(arg2);
		this.aClass143_Sub2_16.method4930(0);
		this.aClass143_Sub2_16.method4994(1);
		this.aClass143_Sub2_16.method4945(arg1);
		this.aClass143_Sub2_16.method4987(local11);
		for (@Pc(121) int local121 = 0; local121 < 6; local121++) {
			@Pc(127) int local127 = local121 + 34069;
			local11.method7398(this.aClass44_Sub3_1, local127);
			local11.method7389(0);
			if (!local11.method7392()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local127 == 34069) {
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
			} else if (local127 == 34070) {
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
			} else if (local127 == 34071) {
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
			} else if (local127 == 34072) {
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
			} else if (local127 == 34073) {
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
			} else if (local127 == 34074) {
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
		local11.method7388(0);
		this.aClass143_Sub2_16.method4966(local11);
		this.aClass143_Sub2_16.method4930(1);
		this.aClass143_Sub2_16.method4945((Class44) null);
		this.aClass143_Sub2_16.method4940(8448, 8448);
		this.aClass143_Sub2_16.method4930(0);
		this.aClass143_Sub2_16.method4945((Class44) null);
		OpenGL.glPopAttrib();
		this.aClass143_Sub2_16.KA(Static614.anIntArray565[0], Static614.anIntArray565[1], Static614.anIntArray565[2], Static614.anIntArray565[3]);
		if (local7 && !this.aClass143_Sub2_16.aBoolean427) {
			this.aClass44_Sub3_1.method6700();
		}
		return local7;
	}

	@OriginalMember(owner = "client!ega", name = "b", descriptor = "(I)Lclient!mu;")
	@Override
	public Class44_Sub3 method3582() {
		return this.aClass44_Sub3_1;
	}
}
