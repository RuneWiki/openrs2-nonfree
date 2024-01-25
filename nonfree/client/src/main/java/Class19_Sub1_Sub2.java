import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class19_Sub1_Sub2 extends Class19_Sub1 {

	@OriginalMember(owner = "client!pp", name = "h", descriptor = "Lclient!ge;")
	private final Class81_Sub1 aClass81_Sub1_27;

	@OriginalMember(owner = "client!pp", name = "i", descriptor = "Lclient!ca;")
	private final Class28_Sub1 aClass28_Sub1_2;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(Lclient!ge;I)V")
	public Class19_Sub1_Sub2(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass81_Sub1_27 = arg0;
		this.aClass28_Sub1_2 = new Class28_Sub1(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)I")
	public int method4312() {
		return this.aClass28_Sub1_2.anInt644;
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(B)Lclient!ca;")
	@Override
	public Class28_Sub1 method4311() {
		return this.aClass28_Sub1_2;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(FBLclient!ca;Lclient!ca;)V")
	public void method4313(@OriginalArg(0) float arg0, @OriginalArg(2) Class28_Sub1 arg1, @OriginalArg(3) Class28_Sub1 arg2) {
		@Pc(10) opengl local10 = this.aClass81_Sub1_27.anOpengl1;
		@Pc(14) Class105 local14 = this.aClass81_Sub1_27.aClass105_2;
		if (this.aClass81_Sub1_27.aClass28_Sub3_3.anInt1334 != arg1.anInt644 || this.aClass81_Sub1_27.aClass28_Sub3_3.anInt1335 != arg1.anInt644) {
			this.aClass81_Sub1_27.aClass28_Sub3_3 = new Class28_Sub3(this.aClass81_Sub1_27, 3553, 6408, arg1.anInt644, arg1.anInt644);
		}
		if (this.aClass81_Sub1_27.aClass28_Sub3_4.anInt1334 != arg2.anInt644 || this.aClass81_Sub1_27.aClass28_Sub3_4.anInt1335 != arg2.anInt644) {
			this.aClass81_Sub1_27.aClass28_Sub3_4 = new Class28_Sub3(this.aClass81_Sub1_27, 3553, 6408, arg2.anInt644, arg2.anInt644);
		}
		this.aClass81_Sub1_27.method2989(Static248.anIntArray508);
		this.aClass81_Sub1_27.method3032();
		this.aClass81_Sub1_27.method1997(local14);
		this.aClass81_Sub1_27.method1992();
		local10.glMatrixMode(5889);
		local10.glLoadIdentity();
		local10.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local10.glMatrixMode(5888);
		local10.glLoadIdentity();
		local10.glPushAttrib(2048);
		local10.glViewport(0, 0, this.aClass28_Sub1_2.anInt644, this.aClass28_Sub1_2.anInt644);
		this.aClass81_Sub1_27.method1962(false);
		this.aClass81_Sub1_27.method2004(false);
		this.aClass81_Sub1_27.method2006(false);
		this.aClass81_Sub1_27.method1959(false);
		this.aClass81_Sub1_27.method1993();
		this.aClass81_Sub1_27.method1953(1);
		this.aClass81_Sub1_27.method2000(0.0F, 0.0F, 0.0F, arg0);
		this.aClass81_Sub1_27.method1965(34165, 34165);
		this.aClass81_Sub1_27.method1953(0);
		this.aClass81_Sub1_27.method1979(0);
		for (@Pc(170) int local170 = 0; local170 < 6; local170++) {
			@Pc(179) int local179 = local170 + 34069;
			local14.method2747(arg1, local179);
			this.aClass81_Sub1_27.aClass28_Sub3_3.method1255(0, 0, arg1.anInt644, arg1.anInt644);
			local14.method2747(arg2, local179);
			this.aClass81_Sub1_27.aClass28_Sub3_4.method1255(0, 0, arg2.anInt644, arg2.anInt644);
			local14.method2747(this.aClass28_Sub1_2, local179);
			this.aClass81_Sub1_27.method1953(1);
			this.aClass81_Sub1_27.method2022(this.aClass81_Sub1_27.aClass28_Sub3_4);
			this.aClass81_Sub1_27.method1953(0);
			this.aClass81_Sub1_27.method2022(this.aClass81_Sub1_27.aClass28_Sub3_3);
			local10.glBegin(7);
			local10.glTexCoord2f(0.0F, 0.0F);
			local10.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			local10.glVertex2f(0.0F, 0.0F);
			local10.glTexCoord2f(1.0F, 0.0F);
			local10.glMultiTexCoord2f(33985, 1.0F, 0.0F);
			local10.glVertex2f(1.0F, 0.0F);
			local10.glTexCoord2f(1.0F, 1.0F);
			local10.glMultiTexCoord2f(33985, 1.0F, 1.0F);
			local10.glVertex2f(1.0F, 1.0F);
			local10.glTexCoord2f(0.0F, 1.0F);
			local10.glMultiTexCoord2f(33985, 0.0F, 1.0F);
			local10.glVertex2f(0.0F, 1.0F);
			local10.glEnd();
			this.aClass81_Sub1_27.method1953(1);
			this.aClass81_Sub1_27.method2022(null);
			this.aClass81_Sub1_27.method1953(0);
			this.aClass81_Sub1_27.method2022(null);
		}
		this.aClass81_Sub1_27.method1953(1);
		this.aClass81_Sub1_27.method1965(8448, 8448);
		this.aClass81_Sub1_27.method1953(0);
		local14.method2746(0);
		local10.glPopAttrib();
		this.aClass81_Sub1_27.method1964(local14);
		this.aClass81_Sub1_27.method3033(Static248.anIntArray508[0], Static248.anIntArray508[1], Static248.anIntArray508[2], Static248.anIntArray508[3]);
		this.aClass28_Sub1_2.method4119();
	}
}
