import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public final class Class10_Sub1_Sub2 extends Class10_Sub1 {

	@OriginalMember(owner = "client!un", name = "i", descriptor = "Lclient!ic;")
	private final Class48_Sub2 aClass48_Sub2_35;

	@OriginalMember(owner = "client!un", name = "h", descriptor = "Lclient!nb;")
	private final Class81_Sub3 aClass81_Sub3_2;

	@OriginalMember(owner = "client!un", name = "<init>", descriptor = "(Lclient!ic;I)V")
	public Class10_Sub1_Sub2(@OriginalArg(0) Class48_Sub2 arg0, @OriginalArg(1) int arg1) {
		this.aClass48_Sub2_35 = arg0;
		this.aClass81_Sub3_2 = new Class81_Sub3(arg0, 6408, arg1);
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(I)Lclient!nb;")
	@Override
	public Class81_Sub3 method5620() {
		return this.aClass81_Sub3_2;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILclient!nb;FLclient!nb;)V")
	public void method5621(@OriginalArg(1) Class81_Sub3 arg0, @OriginalArg(2) float arg1, @OriginalArg(3) Class81_Sub3 arg2) {
		@Pc(3) opengl local3 = this.aClass48_Sub2_35.anOpengl2;
		@Pc(7) Class121 local7 = this.aClass48_Sub2_35.aClass121_1;
		if (arg0.anInt4461 != this.aClass48_Sub2_35.aClass81_Sub2_2.anInt4125 || arg0.anInt4461 != this.aClass48_Sub2_35.aClass81_Sub2_2.anInt4124) {
			this.aClass48_Sub2_35.aClass81_Sub2_2 = new Class81_Sub2(this.aClass48_Sub2_35, 3553, 6408, arg0.anInt4461, arg0.anInt4461);
		}
		if (arg2.anInt4461 != this.aClass48_Sub2_35.aClass81_Sub2_3.anInt4125 || arg2.anInt4461 != this.aClass48_Sub2_35.aClass81_Sub2_3.anInt4124) {
			this.aClass48_Sub2_35.aClass81_Sub2_3 = new Class81_Sub2(this.aClass48_Sub2_35, 3553, 6408, arg2.anInt4461, arg2.anInt4461);
		}
		this.aClass48_Sub2_35.method2495(Static356.anIntArray557);
		this.aClass48_Sub2_35.method2505();
		this.aClass48_Sub2_35.method2556(local7);
		this.aClass48_Sub2_35.method2578();
		local3.glMatrixMode(5889);
		local3.glLoadIdentity();
		local3.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
		local3.glMatrixMode(5888);
		local3.glLoadIdentity();
		local3.glPushAttrib(2048);
		local3.glViewport(0, 0, this.aClass81_Sub3_2.anInt4461, this.aClass81_Sub3_2.anInt4461);
		this.aClass48_Sub2_35.method2600(false);
		this.aClass48_Sub2_35.method2558(false);
		this.aClass48_Sub2_35.method2582(false);
		this.aClass48_Sub2_35.method2603(false);
		this.aClass48_Sub2_35.method2589();
		this.aClass48_Sub2_35.method2566(1);
		this.aClass48_Sub2_35.method2606(0.0F, 0.0F, 0.0F, arg1);
		this.aClass48_Sub2_35.method2563(34165, 34165);
		this.aClass48_Sub2_35.method2566(0);
		this.aClass48_Sub2_35.method2609(0);
		for (@Pc(172) int local172 = 0; local172 < 6; local172++) {
			@Pc(181) int local181 = local172 + 34069;
			local7.method3031(arg0, local181);
			this.aClass48_Sub2_35.aClass81_Sub2_2.method3638(0, 0, arg0.anInt4461, arg0.anInt4461);
			local7.method3031(arg2, local181);
			this.aClass48_Sub2_35.aClass81_Sub2_3.method3638(0, 0, arg2.anInt4461, arg2.anInt4461);
			local7.method3031(this.aClass81_Sub3_2, local181);
			this.aClass48_Sub2_35.method2566(1);
			this.aClass48_Sub2_35.method2573(this.aClass48_Sub2_35.aClass81_Sub2_3);
			this.aClass48_Sub2_35.method2566(0);
			this.aClass48_Sub2_35.method2573(this.aClass48_Sub2_35.aClass81_Sub2_2);
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
			this.aClass48_Sub2_35.method2566(1);
			this.aClass48_Sub2_35.method2573(null);
			this.aClass48_Sub2_35.method2566(0);
			this.aClass48_Sub2_35.method2573(null);
		}
		this.aClass48_Sub2_35.method2566(1);
		this.aClass48_Sub2_35.method2563(8448, 8448);
		this.aClass48_Sub2_35.method2566(0);
		local7.method3024(0);
		local3.glPopAttrib();
		this.aClass48_Sub2_35.method2608(local7);
		this.aClass48_Sub2_35.method2496(Static356.anIntArray557[0], Static356.anIntArray557[1], Static356.anIntArray557[2], Static356.anIntArray557[3]);
		this.aClass81_Sub3_2.method4343();
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(I)I")
	public int method5622() {
		return this.aClass81_Sub3_2.anInt4461;
	}
}
