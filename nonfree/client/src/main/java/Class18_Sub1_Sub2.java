import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ua")
public final class Class18_Sub1_Sub2 extends Class18_Sub1 {

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "Lclient!po;")
	private final Class59_Sub1 aClass59_Sub1_34;

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "Lclient!bc;")
	private final Class11_Sub2 aClass11_Sub2_2;

	@OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lclient!po;I)V")
	public Class18_Sub1_Sub2(@OriginalArg(0) Class59_Sub1 arg0, @OriginalArg(1) int arg1) {
		this.aClass59_Sub1_34 = arg0;
		this.aClass11_Sub2_2 = new Class11_Sub2(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILclient!bc;Lclient!bc;F)V")
	public void method5333(@OriginalArg(1) Class11_Sub2 arg0, @OriginalArg(2) Class11_Sub2 arg1, @OriginalArg(3) float arg2) {
		@Pc(3) opengl local3 = this.aClass59_Sub1_34.anOpengl2;
		@Pc(7) Class87 local7 = this.aClass59_Sub1_34.aClass87_3;
		if (this.aClass59_Sub1_34.aClass11_Sub1_5.anInt365 != arg1.anInt529 || this.aClass59_Sub1_34.aClass11_Sub1_5.anInt367 != arg1.anInt529) {
			this.aClass59_Sub1_34.aClass11_Sub1_5 = new Class11_Sub1(this.aClass59_Sub1_34, 3553, 6408, arg1.anInt529, arg1.anInt529);
		}
		if (arg0.anInt529 != this.aClass59_Sub1_34.aClass11_Sub1_4.anInt365 || this.aClass59_Sub1_34.aClass11_Sub1_4.anInt367 != arg0.anInt529) {
			this.aClass59_Sub1_34.aClass11_Sub1_4 = new Class11_Sub1(this.aClass59_Sub1_34, 3553, 6408, arg0.anInt529, arg0.anInt529);
		}
		this.aClass59_Sub1_34.method4817(Static313.anIntArray510);
		this.aClass59_Sub1_34.method4810();
		this.aClass59_Sub1_34.method4289(local7);
		this.aClass59_Sub1_34.method4343();
		local3.glMatrixMode(5889);
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local3.glMatrixMode(5888);
		local3.glLoadIdentity();
		local3.glPushAttrib(2048);
		local3.glViewport(0, 0, this.aClass11_Sub2_2.anInt529, this.aClass11_Sub2_2.anInt529);
		this.aClass59_Sub1_34.method4310(false);
		this.aClass59_Sub1_34.method4321(false);
		this.aClass59_Sub1_34.method4267(false);
		this.aClass59_Sub1_34.method4274(false);
		this.aClass59_Sub1_34.method4320();
		this.aClass59_Sub1_34.method4273(1);
		this.aClass59_Sub1_34.method4287(0.0F, 0.0F, 0.0F, arg2);
		this.aClass59_Sub1_34.method4311(34165, 34165);
		this.aClass59_Sub1_34.method4273(0);
		this.aClass59_Sub1_34.method4327(0);
		for (@Pc(159) int local159 = 0; local159 < 6; local159++) {
			@Pc(167) int local167 = local159 + 34069;
			local7.method2463(arg1, local167);
			this.aClass59_Sub1_34.aClass11_Sub1_5.method385(0, 0, arg1.anInt529, arg1.anInt529);
			local7.method2463(arg0, local167);
			this.aClass59_Sub1_34.aClass11_Sub1_4.method385(0, 0, arg0.anInt529, arg0.anInt529);
			local7.method2463(this.aClass11_Sub2_2, local167);
			this.aClass59_Sub1_34.method4273(1);
			this.aClass59_Sub1_34.method4296(this.aClass59_Sub1_34.aClass11_Sub1_4);
			this.aClass59_Sub1_34.method4273(0);
			this.aClass59_Sub1_34.method4296(this.aClass59_Sub1_34.aClass11_Sub1_5);
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
			this.aClass59_Sub1_34.method4273(1);
			this.aClass59_Sub1_34.method4296(null);
			this.aClass59_Sub1_34.method4273(0);
			this.aClass59_Sub1_34.method4296(null);
		}
		this.aClass59_Sub1_34.method4273(1);
		this.aClass59_Sub1_34.method4311(8448, 8448);
		this.aClass59_Sub1_34.method4273(0);
		local7.method2457(0);
		local3.glPopAttrib();
		this.aClass59_Sub1_34.method4315(local7);
		this.aClass59_Sub1_34.method4795(Static313.anIntArray510[0], Static313.anIntArray510[1], Static313.anIntArray510[2], Static313.anIntArray510[3]);
		this.aClass11_Sub2_2.method3580();
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)Lclient!bc;")
	@Override
	public Class11_Sub2 method5332() {
		return this.aClass11_Sub2_2;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)I")
	public int method5334() {
		return this.aClass11_Sub2_2.anInt529;
	}
}
