import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public final class Class91_Sub1_Sub1 extends Class91_Sub1 {

	@OriginalMember(owner = "client!fe", name = "u", descriptor = "Lclient!rda;")
	private final Class126_Sub3 aClass126_Sub3_10;

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "Lclient!jc;")
	private final Class24_Sub3 aClass24_Sub3_1;

	@OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lclient!rda;I)V")
	public Class91_Sub1_Sub1(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1) {
		this.aClass126_Sub3_10 = arg0;
		this.aClass24_Sub3_1 = new Class24_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Z)Lclient!jc;")
	@Override
	public Class24_Sub3 method8859() {
		return this.aClass24_Sub3_1;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)I")
	public int method2190() {
		return this.aClass24_Sub3_1.anInt4260;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!jc;Lclient!jc;BF)Z")
	public boolean method2191(@OriginalArg(0) Class24_Sub3 arg0, @OriginalArg(1) Class24_Sub3 arg1, @OriginalArg(3) float arg2) {
		@Pc(7) boolean local7 = true;
		@Pc(11) Class243 local11 = this.aClass126_Sub3_10.aClass243_2;
		this.aClass126_Sub3_10.K(Static410.anIntArray554);
		this.aClass126_Sub3_10.la();
		this.aClass126_Sub3_10.method7108();
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glPushAttrib(2048);
		OpenGL.glViewport(0, 0, this.aClass24_Sub3_1.anInt4260, this.aClass24_Sub3_1.anInt4260);
		this.aClass126_Sub3_10.method7123(false);
		this.aClass126_Sub3_10.method7102(false);
		this.aClass126_Sub3_10.method7137(false);
		this.aClass126_Sub3_10.method7094(false);
		this.aClass126_Sub3_10.method7106(-2);
		this.aClass126_Sub3_10.method7104(1);
		this.aClass126_Sub3_10.method7134(0.0F, 0.0F, 0.0F, arg2);
		this.aClass126_Sub3_10.method7082(34165, 34165);
		this.aClass126_Sub3_10.method7113(arg0);
		this.aClass126_Sub3_10.method7104(0);
		this.aClass126_Sub3_10.method7105(1);
		this.aClass126_Sub3_10.method7113(arg1);
		this.aClass126_Sub3_10.method7097(local11);
		for (@Pc(122) int local122 = 0; local122 < 6; local122++) {
			@Pc(128) int local128 = local122 + 34069;
			local11.method5835(this.aClass24_Sub3_1, local128);
			local11.method5840(0);
			if (!local11.method5826()) {
				local7 = false;
				break;
			}
			OpenGL.glBegin(7);
			if (local128 == 34069) {
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
			} else if (local128 == 34070) {
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
			} else if (local128 == 34071) {
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
			} else if (local128 == 34072) {
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
			} else if (local128 == 34073) {
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
			} else if (local128 == 34074) {
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
		local11.method5839(0);
		this.aClass126_Sub3_10.method7111(local11);
		this.aClass126_Sub3_10.method7104(1);
		this.aClass126_Sub3_10.method7113((Class24) null);
		this.aClass126_Sub3_10.method7082(8448, 8448);
		this.aClass126_Sub3_10.method7104(0);
		this.aClass126_Sub3_10.method7113((Class24) null);
		OpenGL.glPopAttrib();
		this.aClass126_Sub3_10.KA(Static410.anIntArray554[0], Static410.anIntArray554[1], Static410.anIntArray554[2], Static410.anIntArray554[3]);
		if (local7 && !this.aClass126_Sub3_10.aBoolean677) {
			this.aClass24_Sub3_1.method6784();
		}
		return local7;
	}
}
