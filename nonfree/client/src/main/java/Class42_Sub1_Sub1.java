import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public final class Class42_Sub1_Sub1 extends Class42_Sub1 {

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "[I")
	private static final int[] anIntArray103 = new int[4];

	@OriginalMember(owner = "client!dc", name = "k", descriptor = "Lclient!bf;")
	private final Class19_Sub1 aClass19_Sub1_8;

	@OriginalMember(owner = "client!dc", name = "i", descriptor = "Lclient!qd;")
	private final Class8_Sub3 aClass8_Sub3_1;

	@OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lclient!bf;I)V", line = 114)
	public Class42_Sub1_Sub1(@OriginalArg(0) Class19_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass19_Sub1_8 = arg0;
		this.aClass8_Sub3_1 = new Class8_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "(I)I", line = 4)
	public int method1611() {
		return this.aClass8_Sub3_1.anInt5157;
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)Lclient!qd;", line = 14)
	@Override
	public Class8_Sub3 method2430() {
		return this.aClass8_Sub3_1;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(FLclient!qd;BLclient!qd;)V", line = 26)
	public void method1612(@OriginalArg(0) float arg0, @OriginalArg(1) Class8_Sub3 arg1, @OriginalArg(3) Class8_Sub3 arg2) {
		@Pc(3) opengl local3 = this.aClass19_Sub1_8.anOpengl1;
		@Pc(7) Class228 local7 = this.aClass19_Sub1_8.aClass228_1;
		if (this.aClass19_Sub1_8.aClass8_Sub1_2.anInt3680 != arg2.anInt5157 || arg2.anInt5157 != this.aClass19_Sub1_8.aClass8_Sub1_2.anInt3681) {
			this.aClass19_Sub1_8.aClass8_Sub1_2 = new Class8_Sub1(this.aClass19_Sub1_8, 3553, 6408, arg2.anInt5157, arg2.anInt5157);
		}
		if (this.aClass19_Sub1_8.aClass8_Sub1_3.anInt3680 != arg1.anInt5157 || arg1.anInt5157 != this.aClass19_Sub1_8.aClass8_Sub1_3.anInt3681) {
			this.aClass19_Sub1_8.aClass8_Sub1_3 = new Class8_Sub1(this.aClass19_Sub1_8, 3553, 6408, arg1.anInt5157, arg1.anInt5157);
		}
		this.aClass19_Sub1_8.method2853(anIntArray103);
		this.aClass19_Sub1_8.method2900();
		this.aClass19_Sub1_8.method808(local7);
		this.aClass19_Sub1_8.method806();
		local3.glMatrixMode(5889);
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local3.glMatrixMode(5888);
		local3.glLoadIdentity();
		local3.glPushAttrib(2048);
		local3.glViewport(0, 0, this.aClass8_Sub3_1.anInt5157, this.aClass8_Sub3_1.anInt5157);
		this.aClass19_Sub1_8.method786(false);
		this.aClass19_Sub1_8.method782(false);
		this.aClass19_Sub1_8.method813(false);
		this.aClass19_Sub1_8.method817(false);
		this.aClass19_Sub1_8.method784();
		this.aClass19_Sub1_8.method832(1);
		this.aClass19_Sub1_8.method804(0.0F, 0.0F, 0.0F, arg0);
		this.aClass19_Sub1_8.method794(34165, 34165);
		this.aClass19_Sub1_8.method832(0);
		this.aClass19_Sub1_8.method792(0);
		for (@Pc(167) int local167 = 0; local167 < 6; local167++) {
			@Pc(176) int local176 = local167 + 34069;
			local7.method5802(arg2, local176);
			this.aClass19_Sub1_8.aClass8_Sub1_2.method3637(0, 0, arg2.anInt5157, arg2.anInt5157);
			local7.method5802(arg1, local176);
			this.aClass19_Sub1_8.aClass8_Sub1_3.method3637(0, 0, arg1.anInt5157, arg1.anInt5157);
			local7.method5802(this.aClass8_Sub3_1, local176);
			this.aClass19_Sub1_8.method832(1);
			this.aClass19_Sub1_8.method848(this.aClass19_Sub1_8.aClass8_Sub1_3);
			this.aClass19_Sub1_8.method832(0);
			this.aClass19_Sub1_8.method848(this.aClass19_Sub1_8.aClass8_Sub1_2);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			local3.glVertex2f(0.0F, 0.0F);
			local3.glTexCoord2f(1.0F, 0.0F);
			local3.glMultiTexCoord2f(33985, 1.0F, 0.0F);
			local3.glVertex2f(1.0F, 0.0F);
			local3.glTexCoord2f(1.0F, 1.0F);
			local3.glMultiTexCoord2f(33985, 1.0F, 1.0F);
			local3.glVertex2f(1.0F, 1.0F);
			local3.glTexCoord2f(0.0F, 1.0F);
			local3.glMultiTexCoord2f(33985, 0.0F, 1.0F);
			local3.glVertex2f(0.0F, 1.0F);
			local3.glEnd();
			this.aClass19_Sub1_8.method832(1);
			this.aClass19_Sub1_8.method848(null);
			this.aClass19_Sub1_8.method832(0);
			this.aClass19_Sub1_8.method848(null);
		}
		this.aClass19_Sub1_8.method832(1);
		this.aClass19_Sub1_8.method794(8448, 8448);
		this.aClass19_Sub1_8.method832(0);
		local7.method5799(0);
		local3.glPopAttrib();
		this.aClass19_Sub1_8.method830(local7);
		this.aClass19_Sub1_8.method2897(anIntArray103[0], anIntArray103[1], anIntArray103[2], anIntArray103[3]);
		this.aClass8_Sub3_1.method6160();
	}
}
