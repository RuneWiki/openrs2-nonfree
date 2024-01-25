import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qs")
public final class Class40_Sub2 extends Class40 {

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "Lclient!ef;")
	private Class28_Sub3_Sub1 aClass28_Sub3_Sub1_3;

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "I")
	private int anInt4951 = 0;

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "I")
	private int anInt4952 = 0;

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
	private int anInt4953 = 0;

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
	private int anInt4950 = 0;

	@OriginalMember(owner = "client!qs", name = "h", descriptor = "Z")
	private boolean aBoolean348 = false;

	@OriginalMember(owner = "client!qs", name = "i", descriptor = "I")
	private int anInt4954 = 0;

	@OriginalMember(owner = "client!qs", name = "f", descriptor = "Lclient!ge;")
	private final Class81_Sub1 aClass81_Sub1_31;

	@OriginalMember(owner = "client!qs", name = "g", descriptor = "Lclient!ef;")
	private final Class28_Sub3_Sub1 aClass28_Sub3_Sub1_4;

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!ge;IIII)V")
	public Class40_Sub2(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass81_Sub1_31 = arg0;
		this.aClass28_Sub3_Sub1_4 = Static359.method1258(arg3, arg0, arg1, arg2, arg4);
	}

	@OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(Lclient!ge;II[III)V")
	public Class40_Sub2(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass81_Sub1_31 = arg0;
		this.aClass28_Sub3_Sub1_4 = Static359.method1260(arg2, arg1, arg3, arg0);
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method5082(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) opengl local3 = this.aClass81_Sub1_31.anOpengl1;
		this.aClass81_Sub1_31.method2026();
		this.aClass81_Sub1_31.method1963(arg6);
		local3.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean348) {
			@Pc(36) float local36 = (float) arg2 / (float) this.method5083();
			@Pc(43) float local43 = (float) arg3 / (float) this.method5084();
			@Pc(52) float local52 = (float) arg0 + (float) this.anInt4951 * local36;
			@Pc(61) float local61 = (float) arg1 + (float) this.anInt4950 * local43;
			@Pc(70) float local70 = local52 + (float) this.aClass28_Sub3_Sub1_4.anInt1338 * local36;
			@Pc(79) float local79 = local61 + (float) this.aClass28_Sub3_Sub1_4.anInt1337 * local43;
			if (this.aClass28_Sub3_Sub1_3 == null) {
				this.aClass81_Sub1_31.method2022(this.aClass28_Sub3_Sub1_4);
				this.aClass81_Sub1_31.method1979(arg4);
				local3.glBegin(7);
				local3.glTexCoord2f(0.0F, this.aClass28_Sub3_Sub1_4.aFloat20);
				local3.glVertex2f(local52, local61);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2f(local52, local79);
				local3.glTexCoord2f(this.aClass28_Sub3_Sub1_4.aFloat21, 0.0F);
				local3.glVertex2f(local70, local79);
				local3.glTexCoord2f(this.aClass28_Sub3_Sub1_4.aFloat21, this.aClass28_Sub3_Sub1_4.aFloat20);
				local3.glVertex2f(local70, local61);
				local3.glEnd();
			} else {
				this.method4525(arg4);
				local3.glBegin(7);
				local3.glMultiTexCoord2f(33985, 0.0F, this.aClass28_Sub3_Sub1_4.aFloat20);
				local3.glTexCoord2f(0.0F, this.aClass28_Sub3_Sub1_4.aFloat20);
				local3.glVertex2f(local52, local61);
				local3.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2f(local52, local79);
				local3.glMultiTexCoord2f(33985, this.aClass28_Sub3_Sub1_4.aFloat21, 0.0F);
				local3.glTexCoord2f(this.aClass28_Sub3_Sub1_4.aFloat21, 0.0F);
				local3.glVertex2f(local70, local79);
				local3.glMultiTexCoord2f(33985, this.aClass28_Sub3_Sub1_4.aFloat21, this.aClass28_Sub3_Sub1_4.aFloat20);
				local3.glTexCoord2f(this.aClass28_Sub3_Sub1_4.aFloat21, this.aClass28_Sub3_Sub1_4.aFloat20);
				local3.glVertex2f(local70, local61);
				local3.glEnd();
				this.method4526();
			}
		} else if (this.aClass28_Sub3_Sub1_3 == null) {
			this.aClass81_Sub1_31.method2022(this.aClass28_Sub3_Sub1_4);
			this.aClass81_Sub1_31.method1979(arg4);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, this.aClass28_Sub3_Sub1_4.aFloat20);
			local3.glVertex2i(arg0, arg1);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(arg0, arg1 + arg3);
			local3.glTexCoord2f(this.aClass28_Sub3_Sub1_4.aFloat21, 0.0F);
			local3.glVertex2i(arg0 + arg2, arg1 + arg3);
			local3.glTexCoord2f(this.aClass28_Sub3_Sub1_4.aFloat21, this.aClass28_Sub3_Sub1_4.aFloat20);
			local3.glVertex2i(arg0 + arg2, arg1);
			local3.glEnd();
		} else {
			this.method4525(arg4);
			local3.glBegin(7);
			local3.glMultiTexCoord2f(33985, 0.0F, this.aClass28_Sub3_Sub1_4.aFloat20);
			local3.glTexCoord2f(0.0F, this.aClass28_Sub3_Sub1_4.aFloat20);
			local3.glVertex2i(arg0, arg1);
			local3.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(arg0, arg1 + arg3);
			local3.glMultiTexCoord2f(33985, this.aClass28_Sub3_Sub1_4.aFloat21, 0.0F);
			local3.glTexCoord2f(this.aClass28_Sub3_Sub1_4.aFloat21, 0.0F);
			local3.glVertex2i(arg0 + arg2, arg1 + arg3);
			local3.glMultiTexCoord2f(33985, this.aClass28_Sub3_Sub1_4.aFloat21, this.aClass28_Sub3_Sub1_4.aFloat20);
			local3.glTexCoord2f(this.aClass28_Sub3_Sub1_4.aFloat21, this.aClass28_Sub3_Sub1_4.aFloat20);
			local3.glVertex2i(arg0 + arg2, arg1);
			local3.glEnd();
			this.method4526();
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method5085(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) opengl local3 = this.aClass81_Sub1_31.anOpengl1;
		this.aClass81_Sub1_31.method2026();
		this.aClass81_Sub1_31.method1963(1);
		local3.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(31) int local31 = arg0 + this.anInt4951;
		@Pc(36) int local36 = arg1 + this.anInt4950;
		if (this.aClass28_Sub3_Sub1_3 == null) {
			this.aClass81_Sub1_31.method2022(this.aClass28_Sub3_Sub1_4);
			this.aClass81_Sub1_31.method1979(arg2);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, this.aClass28_Sub3_Sub1_4.aFloat20);
			local3.glVertex2i(local31, local36);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(local31, local36 + this.aClass28_Sub3_Sub1_4.anInt1337);
			local3.glTexCoord2f(this.aClass28_Sub3_Sub1_4.aFloat21, 0.0F);
			local3.glVertex2i(local31 + this.aClass28_Sub3_Sub1_4.anInt1338, local36 + this.aClass28_Sub3_Sub1_4.anInt1337);
			local3.glTexCoord2f(this.aClass28_Sub3_Sub1_4.aFloat21, this.aClass28_Sub3_Sub1_4.aFloat20);
			local3.glVertex2i(local31 + this.aClass28_Sub3_Sub1_4.anInt1338, local36);
			local3.glEnd();
			return;
		}
		this.method4525(arg2);
		local3.glBegin(7);
		local3.glMultiTexCoord2f(33985, 0.0F, this.aClass28_Sub3_Sub1_4.aFloat20);
		local3.glTexCoord2f(0.0F, this.aClass28_Sub3_Sub1_4.aFloat20);
		local3.glVertex2i(local31, local36);
		local3.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		local3.glTexCoord2f(0.0F, 0.0F);
		local3.glVertex2i(local31, local36 + this.aClass28_Sub3_Sub1_4.anInt1337);
		local3.glMultiTexCoord2f(33985, this.aClass28_Sub3_Sub1_4.aFloat21, 0.0F);
		local3.glTexCoord2f(this.aClass28_Sub3_Sub1_4.aFloat21, 0.0F);
		local3.glVertex2i(local31 + this.aClass28_Sub3_Sub1_4.anInt1338, local36 + this.aClass28_Sub3_Sub1_4.anInt1337);
		local3.glMultiTexCoord2f(33985, this.aClass28_Sub3_Sub1_4.aFloat21, this.aClass28_Sub3_Sub1_4.aFloat20);
		local3.glTexCoord2f(this.aClass28_Sub3_Sub1_4.aFloat21, this.aClass28_Sub3_Sub1_4.aFloat20);
		local3.glVertex2i(local31 + this.aClass28_Sub3_Sub1_4.anInt1338, local36);
		local3.glEnd();
		this.method4526();
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "()I")
	@Override
	public int method5071() {
		return this.aClass28_Sub3_Sub1_4.anInt1338;
	}

	@OriginalMember(owner = "client!qs", name = "c", descriptor = "()I")
	@Override
	public int method5083() {
		return this.aClass28_Sub3_Sub1_4.anInt1338 + this.anInt4951 + this.anInt4954;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IILclient!rn;II)V")
	@Override
	public void method5069(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class74 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class74_Sub1 local2 = (Class74_Sub1) arg2;
		@Pc(5) Class28_Sub3_Sub1 local5 = local2.aClass28_Sub3_Sub1_1;
		this.aClass81_Sub1_31.method2026();
		this.aClass81_Sub1_31.method2022(this.aClass28_Sub3_Sub1_4);
		this.aClass81_Sub1_31.method1979(0);
		this.aClass81_Sub1_31.method1953(1);
		this.aClass81_Sub1_31.method2022(local5);
		this.aClass81_Sub1_31.method1965(7681, 8448);
		this.aClass81_Sub1_31.method1986(0, 34168, 768);
		this.aClass81_Sub1_31.method1963(1);
		@Pc(45) int local45 = arg0 + this.anInt4951;
		@Pc(50) int local50 = arg1 + this.anInt4950;
		@Pc(56) int local56 = local45 + this.aClass28_Sub3_Sub1_4.anInt1338;
		@Pc(62) int local62 = local50 + this.aClass28_Sub3_Sub1_4.anInt1337;
		@Pc(69) float local69 = local5.aFloat21 / (float) local5.anInt1338;
		@Pc(76) float local76 = local5.aFloat20 / (float) local5.anInt1337;
		@Pc(83) float local83 = (float) (local45 - arg3) * local69;
		@Pc(90) float local90 = (float) (local56 - arg3) * local69;
		@Pc(100) float local100 = local5.aFloat20 - (float) (local50 - arg4) * local76;
		@Pc(110) float local110 = local5.aFloat20 - (float) (local62 - arg4) * local76;
		@Pc(114) opengl local114 = this.aClass81_Sub1_31.anOpengl1;
		local114.glBegin(7);
		local114.glColor3f(1.0F, 1.0F, 1.0F);
		local114.glMultiTexCoord2f(33984, 0.0F, this.aClass28_Sub3_Sub1_4.aFloat20);
		local114.glMultiTexCoord2f(33985, local83, local100);
		local114.glVertex2i(local45, local50);
		local114.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		local114.glMultiTexCoord2f(33985, local83, local110);
		local114.glVertex2i(local45, local50 + this.aClass28_Sub3_Sub1_4.anInt1337);
		local114.glMultiTexCoord2f(33984, this.aClass28_Sub3_Sub1_4.aFloat21, 0.0F);
		local114.glMultiTexCoord2f(33985, local90, local110);
		local114.glVertex2i(local45 + this.aClass28_Sub3_Sub1_4.anInt1338, local50 + this.aClass28_Sub3_Sub1_4.anInt1337);
		local114.glMultiTexCoord2f(33984, this.aClass28_Sub3_Sub1_4.aFloat21, this.aClass28_Sub3_Sub1_4.aFloat20);
		local114.glMultiTexCoord2f(33985, local90, local100);
		local114.glVertex2i(local45 + this.aClass28_Sub3_Sub1_4.anInt1338, local50);
		local114.glEnd();
		this.aClass81_Sub1_31.method1986(0, 5890, 768);
		this.aClass81_Sub1_31.method1979(1);
		this.aClass81_Sub1_31.method2022(null);
		this.aClass81_Sub1_31.method1953(0);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected void method5068(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean348) {
			local6 = this.method5083();
			local10 = this.method5084();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt4950;
			@Pc(46) float local46 = local34 * (float) this.anInt4950;
			@Pc(52) float local52 = local16 * (float) this.anInt4951;
			@Pc(58) float local58 = local22 * (float) this.anInt4951;
			@Pc(65) float local65 = -local16 * (float) this.anInt4954;
			@Pc(72) float local72 = -local22 * (float) this.anInt4954;
			@Pc(79) float local79 = -local28 * (float) this.anInt4953;
			@Pc(86) float local86 = -local34 * (float) this.anInt4953;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = arg2 + local65 + local40;
			arg3 = arg3 + local72 + local46;
			arg4 = arg4 + local52 + local79;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg4 + arg2 - arg0;
		local10 = arg3 + arg5 - arg1;
		@Pc(138) opengl local138 = this.aClass81_Sub1_31.anOpengl1;
		this.aClass81_Sub1_31.method2026();
		this.aClass81_Sub1_31.method2022(this.aClass28_Sub3_Sub1_4);
		this.aClass81_Sub1_31.method1963(1);
		this.aClass81_Sub1_31.method1979(arg6);
		local138.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		local138.glBegin(7);
		local138.glTexCoord2f(0.0F, this.aClass28_Sub3_Sub1_4.aFloat20);
		local138.glVertex2f(arg0, arg1);
		local138.glTexCoord2f(0.0F, 0.0F);
		local138.glVertex2f(arg4, arg5);
		local138.glTexCoord2f(this.aClass28_Sub3_Sub1_4.aFloat21, 0.0F);
		local138.glVertex2f(local6, local10);
		local138.glTexCoord2f(this.aClass28_Sub3_Sub1_4.aFloat21, this.aClass28_Sub3_Sub1_4.aFloat20);
		local138.glVertex2f(arg2, arg3);
		local138.glEnd();
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
	private void method4525(@OriginalArg(0) int arg0) {
		this.aClass81_Sub1_31.method1953(1);
		this.aClass81_Sub1_31.method2022(this.aClass28_Sub3_Sub1_4);
		this.aClass81_Sub1_31.method1965(this.aClass81_Sub1_31.method2013(arg0), 7681);
		this.aClass81_Sub1_31.method1986(1, 34167, 768);
		this.aClass81_Sub1_31.method1984(0, 34168);
		this.aClass81_Sub1_31.method1953(0);
		this.aClass81_Sub1_31.method2022(this.aClass28_Sub3_Sub1_3);
		this.aClass81_Sub1_31.method1965(34479, 7681);
		this.aClass81_Sub1_31.method1986(1, 34166, 768);
		if (this.anInt4952 == 0) {
			this.aClass81_Sub1_31.method2000(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt4952 == 1) {
			this.aClass81_Sub1_31.method2000(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt4952 == 2) {
			this.aClass81_Sub1_31.method2000(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt4952 == 3) {
			this.aClass81_Sub1_31.method2000(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(FFFFFFLclient!rn;II)V")
	@Override
	protected void method5080(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class74 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class28_Sub3_Sub1 local3 = ((Class74_Sub1) arg6).aClass28_Sub3_Sub1_1;
		@Pc(10) float local10;
		@Pc(14) float local14;
		@Pc(26) float local26;
		@Pc(32) float local32;
		if (this.aBoolean348) {
			local10 = this.method5083();
			local14 = this.method5084();
			@Pc(20) float local20 = (arg2 - arg0) / local10;
			local26 = (arg3 - arg1) / local10;
			local32 = (arg4 - arg0) / local14;
			@Pc(38) float local38 = (arg5 - arg1) / local14;
			@Pc(44) float local44 = local32 * (float) this.anInt4950;
			@Pc(50) float local50 = local38 * (float) this.anInt4950;
			@Pc(56) float local56 = local20 * (float) this.anInt4951;
			@Pc(62) float local62 = local26 * (float) this.anInt4951;
			@Pc(69) float local69 = -local20 * (float) this.anInt4954;
			@Pc(76) float local76 = -local26 * (float) this.anInt4954;
			@Pc(83) float local83 = -local32 * (float) this.anInt4953;
			@Pc(90) float local90 = -local38 * (float) this.anInt4953;
			arg0 = arg0 + local56 + local44;
			arg1 = arg1 + local62 + local50;
			arg2 = arg2 + local69 + local44;
			arg3 = arg3 + local76 + local50;
			arg4 = arg4 + local56 + local83;
			arg5 = arg5 + local62 + local90;
		}
		local10 = arg4 + arg2 - arg0;
		local14 = arg3 + arg5 - arg1;
		@Pc(142) opengl local142 = this.aClass81_Sub1_31.anOpengl1;
		this.aClass81_Sub1_31.method2026();
		this.aClass81_Sub1_31.method2022(this.aClass28_Sub3_Sub1_4);
		this.aClass81_Sub1_31.method1979(0);
		this.aClass81_Sub1_31.method1953(1);
		this.aClass81_Sub1_31.method2022(local3);
		this.aClass81_Sub1_31.method1965(7681, 8448);
		this.aClass81_Sub1_31.method1986(0, 34168, 768);
		this.aClass81_Sub1_31.method1963(1);
		local26 = local3.aFloat21 / (float) local3.anInt1338;
		local32 = local3.aFloat20 / (float) local3.anInt1337;
		local142.glBegin(7);
		local142.glColor3f(1.0F, 1.0F, 1.0F);
		local142.glMultiTexCoord2f(33984, 0.0F, this.aClass28_Sub3_Sub1_4.aFloat20);
		local142.glMultiTexCoord2f(33985, local26 * (arg0 - (float) arg7), local3.aFloat20 - local32 * (arg1 - (float) arg8));
		local142.glVertex2f(arg0, arg1);
		local142.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		local142.glMultiTexCoord2f(33985, local26 * (arg4 - (float) arg7), local3.aFloat20 - local32 * (arg5 - (float) arg8));
		local142.glVertex2f(arg4, arg5);
		local142.glMultiTexCoord2f(33984, this.aClass28_Sub3_Sub1_4.aFloat21, 0.0F);
		local142.glMultiTexCoord2f(33985, local26 * (local10 - (float) arg7), local3.aFloat20 - local32 * (local14 - (float) arg8));
		local142.glVertex2f(local10, local14);
		local142.glMultiTexCoord2f(33984, this.aClass28_Sub3_Sub1_4.aFloat21, this.aClass28_Sub3_Sub1_4.aFloat20);
		local142.glMultiTexCoord2f(33985, local26 * (arg2 - (float) arg7), local3.aFloat20 - local32 * (arg3 - (float) arg8));
		local142.glVertex2f(arg2, arg3);
		local142.glEnd();
		this.aClass81_Sub1_31.method1986(0, 5890, 768);
		this.aClass81_Sub1_31.method1979(1);
		this.aClass81_Sub1_31.method2022(null);
		this.aClass81_Sub1_31.method1953(0);
	}

	@OriginalMember(owner = "client!qs", name = "e", descriptor = "()V")
	private void method4526() {
		this.aClass81_Sub1_31.method1953(1);
		this.aClass81_Sub1_31.method2022(null);
		this.aClass81_Sub1_31.method1965(8448, 8448);
		this.aClass81_Sub1_31.method1986(1, 34168, 768);
		this.aClass81_Sub1_31.method1984(0, 5890);
		this.aClass81_Sub1_31.method1953(0);
		this.aClass81_Sub1_31.method1986(1, 34168, 768);
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5074(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4951 = arg0;
		this.anInt4950 = arg1;
		this.anInt4954 = arg2;
		this.anInt4953 = arg3;
		this.aBoolean348 = this.anInt4951 != 0 || this.anInt4950 != 0 || this.anInt4954 != 0 || this.anInt4953 != 0;
	}

	@OriginalMember(owner = "client!qs", name = "d", descriptor = "()I")
	@Override
	public int method5084() {
		return this.aClass28_Sub3_Sub1_4.anInt1337 + this.anInt4950 + this.anInt4953;
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5076(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) opengl local3 = this.aClass81_Sub1_31.anOpengl1;
		@Pc(7) int local7 = arg0 + arg2;
		@Pc(11) int local11 = arg1 + arg3;
		this.aClass81_Sub1_31.method2026();
		this.aClass81_Sub1_31.method2022(this.aClass28_Sub3_Sub1_4);
		this.aClass81_Sub1_31.method1963(1);
		this.aClass81_Sub1_31.method1979(arg4);
		local3.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass28_Sub3_Sub1_4.aBoolean90 && !this.aBoolean348) {
			@Pc(62) float local62 = this.aClass28_Sub3_Sub1_4.aFloat20 * (float) arg3 / (float) this.aClass28_Sub3_Sub1_4.anInt1337;
			@Pc(74) float local74 = this.aClass28_Sub3_Sub1_4.aFloat21 * (float) arg2 / (float) this.aClass28_Sub3_Sub1_4.anInt1338;
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, local62);
			local3.glVertex2i(arg0, arg1);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(arg0, local11);
			local3.glTexCoord2f(local74, 0.0F);
			local3.glVertex2i(local7, local11);
			local3.glTexCoord2f(local74, local62);
			local3.glVertex2i(local7, arg1);
			local3.glEnd();
			return;
		}
		local3.glPushMatrix();
		local3.glTranslatef((float) this.anInt4951, (float) this.anInt4950, 0.0F);
		@Pc(126) int local126 = this.method5083();
		@Pc(129) int local129 = this.method5084();
		@Pc(135) int local135 = arg1 + this.aClass28_Sub3_Sub1_4.anInt1337;
		local3.glBegin(7);
		@Pc(140) int local140 = arg1;
		@Pc(149) int local149;
		while (local135 <= local11) {
			local149 = arg0 + this.aClass28_Sub3_Sub1_4.anInt1338;
			@Pc(151) int local151 = arg0;
			while (local149 <= local7) {
				local3.glTexCoord2f(0.0F, this.aClass28_Sub3_Sub1_4.aFloat20);
				local3.glVertex2i(local151, local140);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2i(local151, local135);
				local3.glTexCoord2f(this.aClass28_Sub3_Sub1_4.aFloat21, 0.0F);
				local3.glVertex2i(local149, local135);
				local3.glTexCoord2f(this.aClass28_Sub3_Sub1_4.aFloat21, this.aClass28_Sub3_Sub1_4.aFloat20);
				local3.glVertex2i(local149, local140);
				local149 += local126;
				local151 += local126;
			}
			if (local151 < local7) {
				@Pc(220) float local220 = this.aClass28_Sub3_Sub1_4.aFloat21 * (float) (local7 - local151) / (float) this.aClass28_Sub3_Sub1_4.anInt1338;
				local3.glTexCoord2f(0.0F, this.aClass28_Sub3_Sub1_4.aFloat20);
				local3.glVertex2i(local151, local140);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2i(local151, local135);
				local3.glTexCoord2f(local220, 0.0F);
				local3.glVertex2i(local7, local135);
				local3.glTexCoord2f(local220, this.aClass28_Sub3_Sub1_4.aFloat20);
				local3.glVertex2i(local7, local140);
			}
			local140 += local129;
			local135 += local129;
		}
		if (local140 < local11) {
			@Pc(286) float local286 = this.aClass28_Sub3_Sub1_4.aFloat20 * (float) (this.aClass28_Sub3_Sub1_4.anInt1335 + local140 - local11) / (float) this.aClass28_Sub3_Sub1_4.anInt1337;
			@Pc(292) int local292 = arg0 + this.aClass28_Sub3_Sub1_4.anInt1338;
			local149 = arg0;
			while (local292 <= local7) {
				local3.glTexCoord2f(0.0F, this.aClass28_Sub3_Sub1_4.aFloat20);
				local3.glVertex2i(local149, local140);
				local3.glTexCoord2f(0.0F, local286);
				local3.glVertex2i(local149, local11);
				local3.glTexCoord2f(this.aClass28_Sub3_Sub1_4.aFloat21, local286);
				local3.glVertex2i(local292, local11);
				local3.glTexCoord2f(this.aClass28_Sub3_Sub1_4.aFloat21, this.aClass28_Sub3_Sub1_4.aFloat20);
				local3.glVertex2i(local292, local140);
				local292 += local126;
				local149 += local126;
			}
			if (local149 < local7) {
				@Pc(363) float local363 = this.aClass28_Sub3_Sub1_4.aFloat21 * (float) (local7 - local149) / (float) this.aClass28_Sub3_Sub1_4.anInt1338;
				local3.glTexCoord2f(0.0F, this.aClass28_Sub3_Sub1_4.aFloat20);
				local3.glVertex2i(local149, local140);
				local3.glTexCoord2f(0.0F, local286);
				local3.glVertex2i(local149, local11);
				local3.glTexCoord2f(local363, local286);
				local3.glVertex2i(local7, local11);
				local3.glTexCoord2f(local363, this.aClass28_Sub3_Sub1_4.aFloat20);
				local3.glVertex2i(local7, local140);
			}
		}
		local3.glEnd();
		local3.glPopMatrix();
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5081(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass28_Sub3_Sub1_4.method1255(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)V")
	@Override
	public void method5078(@OriginalArg(2) int arg0) {
		@Pc(3) opengl local3 = this.aClass81_Sub1_31.anOpengl1;
		local3.glPixelTransferf(3348, 0.5F);
		local3.glPixelTransferf(3349, 0.499F);
		local3.glPixelTransferf(3352, 0.5F);
		local3.glPixelTransferf(3353, 0.499F);
		local3.glPixelTransferf(3354, 0.5F);
		local3.glPixelTransferf(3355, 0.499F);
		this.aClass28_Sub3_Sub1_3 = Static359.method1258(this.aClass28_Sub3_Sub1_4.anInt1338, this.aClass81_Sub1_31, 0, 0, this.aClass28_Sub3_Sub1_4.anInt1337);
		this.anInt4952 = arg0;
		local3.glPixelTransferf(3348, 1.0F);
		local3.glPixelTransferf(3349, 0.0F);
		local3.glPixelTransferf(3352, 1.0F);
		local3.glPixelTransferf(3353, 0.0F);
		local3.glPixelTransferf(3354, 1.0F);
		local3.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!qs", name = "b", descriptor = "()I")
	@Override
	public int method5075() {
		return this.aClass28_Sub3_Sub1_4.anInt1337;
	}
}
