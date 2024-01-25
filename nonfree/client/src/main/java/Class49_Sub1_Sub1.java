import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public final class Class49_Sub1_Sub1 extends Class49_Sub1 {

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "Lclient!ql;")
	private final Class92_Sub2 aClass92_Sub2_32;

	@OriginalMember(owner = "client!qm", name = "f", descriptor = "Lclient!g;")
	private final Class70_Sub2 aClass70_Sub2_1;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lclient!ql;I)V")
	public Class49_Sub1_Sub1(@OriginalArg(0) Class92_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass92_Sub2_32 = arg0;
		this.aClass70_Sub2_1 = new Class70_Sub2(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)Lclient!g;")
	@Override
	public Class70_Sub2 method4781() {
		return this.aClass70_Sub2_1;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)I")
	public int method4623() {
		return this.aClass70_Sub2_1.anInt2161;
	}

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lclient!g;BLclient!g;F)V")
	public void method4624(@OriginalArg(0) Class70_Sub2 arg0, @OriginalArg(2) Class70_Sub2 arg1, @OriginalArg(3) float arg2) {
		@Pc(3) opengl local3 = this.aClass92_Sub2_32.anOpengl2;
		@Pc(7) Class214 local7 = this.aClass92_Sub2_32.aClass214_4;
		if (this.aClass92_Sub2_32.aClass70_Sub4_6.anInt2354 != arg0.anInt2161 || this.aClass92_Sub2_32.aClass70_Sub4_6.anInt2353 != arg0.anInt2161) {
			this.aClass92_Sub2_32.aClass70_Sub4_6 = new Class70_Sub4(this.aClass92_Sub2_32, 3553, 6408, arg0.anInt2161, arg0.anInt2161);
		}
		if (arg1.anInt2161 != this.aClass92_Sub2_32.aClass70_Sub4_4.anInt2354 || this.aClass92_Sub2_32.aClass70_Sub4_4.anInt2353 != arg1.anInt2161) {
			this.aClass92_Sub2_32.aClass70_Sub4_4 = new Class70_Sub4(this.aClass92_Sub2_32, 3553, 6408, arg1.anInt2161, arg1.anInt2161);
		}
		this.aClass92_Sub2_32.method4525(Static262.anIntArray448);
		this.aClass92_Sub2_32.method4467();
		this.aClass92_Sub2_32.method4615(local7);
		this.aClass92_Sub2_32.method4563();
		local3.glMatrixMode(5889);
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local3.glMatrixMode(5888);
		local3.glLoadIdentity();
		local3.glPushAttrib(2048);
		local3.glViewport(0, 0, this.aClass70_Sub2_1.anInt2161, this.aClass70_Sub2_1.anInt2161);
		this.aClass92_Sub2_32.method4588(false);
		this.aClass92_Sub2_32.method4607(false);
		this.aClass92_Sub2_32.method4606(false);
		this.aClass92_Sub2_32.method4593(false);
		this.aClass92_Sub2_32.method4604();
		this.aClass92_Sub2_32.method4568(1);
		this.aClass92_Sub2_32.method4572(0.0F, 0.0F, 0.0F, arg2);
		this.aClass92_Sub2_32.method4569(34165, 34165);
		this.aClass92_Sub2_32.method4568(0);
		this.aClass92_Sub2_32.method4570(0);
		for (@Pc(169) int local169 = 0; local169 < 6; local169++) {
			@Pc(176) int local176 = local169 + 34069;
			local7.method5567(arg0, local176);
			this.aClass92_Sub2_32.aClass70_Sub4_6.method1994(0, 0, arg0.anInt2161, arg0.anInt2161);
			local7.method5567(arg1, local176);
			this.aClass92_Sub2_32.aClass70_Sub4_4.method1994(0, 0, arg1.anInt2161, arg1.anInt2161);
			local7.method5567(this.aClass70_Sub2_1, local176);
			this.aClass92_Sub2_32.method4568(1);
			this.aClass92_Sub2_32.method4548(this.aClass92_Sub2_32.aClass70_Sub4_4);
			this.aClass92_Sub2_32.method4568(0);
			this.aClass92_Sub2_32.method4548(this.aClass92_Sub2_32.aClass70_Sub4_6);
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
			this.aClass92_Sub2_32.method4568(1);
			this.aClass92_Sub2_32.method4548(null);
			this.aClass92_Sub2_32.method4568(0);
			this.aClass92_Sub2_32.method4548(null);
		}
		this.aClass92_Sub2_32.method4568(1);
		this.aClass92_Sub2_32.method4569(8448, 8448);
		this.aClass92_Sub2_32.method4568(0);
		local7.method5569(0);
		local3.glPopAttrib();
		this.aClass92_Sub2_32.method4613(local7);
		this.aClass92_Sub2_32.method4459(Static262.anIntArray448[0], Static262.anIntArray448[1], Static262.anIntArray448[2], Static262.anIntArray448[3]);
		this.aClass70_Sub2_1.method1986();
	}
}
