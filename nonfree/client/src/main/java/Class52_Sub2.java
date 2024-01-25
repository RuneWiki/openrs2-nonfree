import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pd")
public final class Class52_Sub2 extends Class52 {

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "Lclient!mc;")
	private Class92_Sub4_Sub1 aClass92_Sub4_Sub1_3;

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
	private int anInt4741 = 0;

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
	private int anInt4740 = 0;

	@OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
	private int anInt4743 = 0;

	@OriginalMember(owner = "client!pd", name = "g", descriptor = "Z")
	private boolean aBoolean351 = false;

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
	private int anInt4742 = 0;

	@OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
	private int anInt4744 = 0;

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "Lclient!hd;")
	private final Class89_Sub1 aClass89_Sub1_32;

	@OriginalMember(owner = "client!pd", name = "h", descriptor = "Lclient!mc;")
	private final Class92_Sub4_Sub1 aClass92_Sub4_Sub1_4;

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!hd;IIII)V")
	public Class52_Sub2(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass89_Sub1_32 = arg0;
		this.aClass92_Sub4_Sub1_4 = Static363.method3536(arg0, arg3, arg2, arg1, arg4);
	}

	@OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Lclient!hd;II[III)V")
	public Class52_Sub2(@OriginalArg(0) Class89_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass89_Sub1_32 = arg0;
		this.aClass92_Sub4_Sub1_4 = Static363.method3535(arg1, arg0, arg3, arg2);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method4127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(3) opengl local3 = this.aClass89_Sub1_32.anOpengl2;
		this.aClass89_Sub1_32.method2441();
		this.aClass89_Sub1_32.method2403(arg6);
		local3.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean351) {
			@Pc(36) float local36 = (float) arg2 / (float) this.method4141();
			@Pc(43) float local43 = (float) arg3 / (float) this.method4140();
			@Pc(52) float local52 = (float) arg0 + (float) this.anInt4742 * local36;
			@Pc(61) float local61 = (float) arg1 + (float) this.anInt4743 * local43;
			@Pc(70) float local70 = local52 + (float) this.aClass92_Sub4_Sub1_4.anInt3884 * local36;
			@Pc(79) float local79 = local61 + (float) this.aClass92_Sub4_Sub1_4.anInt3883 * local43;
			if (this.aClass92_Sub4_Sub1_3 == null) {
				this.aClass89_Sub1_32.method2445(this.aClass92_Sub4_Sub1_4);
				this.aClass89_Sub1_32.method2425(arg4);
				local3.glBegin(7);
				local3.glTexCoord2f(0.0F, this.aClass92_Sub4_Sub1_4.aFloat53);
				local3.glVertex2f(local52, local61);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2f(local52, local79);
				local3.glTexCoord2f(this.aClass92_Sub4_Sub1_4.aFloat54, 0.0F);
				local3.glVertex2f(local70, local79);
				local3.glTexCoord2f(this.aClass92_Sub4_Sub1_4.aFloat54, this.aClass92_Sub4_Sub1_4.aFloat53);
				local3.glVertex2f(local70, local61);
				local3.glEnd();
			} else {
				this.method4142(arg4);
				local3.glBegin(7);
				local3.glMultiTexCoord2f(33985, 0.0F, this.aClass92_Sub4_Sub1_4.aFloat53);
				local3.glTexCoord2f(0.0F, this.aClass92_Sub4_Sub1_4.aFloat53);
				local3.glVertex2f(local52, local61);
				local3.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2f(local52, local79);
				local3.glMultiTexCoord2f(33985, this.aClass92_Sub4_Sub1_4.aFloat54, 0.0F);
				local3.glTexCoord2f(this.aClass92_Sub4_Sub1_4.aFloat54, 0.0F);
				local3.glVertex2f(local70, local79);
				local3.glMultiTexCoord2f(33985, this.aClass92_Sub4_Sub1_4.aFloat54, this.aClass92_Sub4_Sub1_4.aFloat53);
				local3.glTexCoord2f(this.aClass92_Sub4_Sub1_4.aFloat54, this.aClass92_Sub4_Sub1_4.aFloat53);
				local3.glVertex2f(local70, local61);
				local3.glEnd();
				this.method4143();
			}
		} else if (this.aClass92_Sub4_Sub1_3 == null) {
			this.aClass89_Sub1_32.method2445(this.aClass92_Sub4_Sub1_4);
			this.aClass89_Sub1_32.method2425(arg4);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, this.aClass92_Sub4_Sub1_4.aFloat53);
			local3.glVertex2i(arg0, arg1);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(arg0, arg1 + arg3);
			local3.glTexCoord2f(this.aClass92_Sub4_Sub1_4.aFloat54, 0.0F);
			local3.glVertex2i(arg0 + arg2, arg1 + arg3);
			local3.glTexCoord2f(this.aClass92_Sub4_Sub1_4.aFloat54, this.aClass92_Sub4_Sub1_4.aFloat53);
			local3.glVertex2i(arg0 + arg2, arg1);
			local3.glEnd();
		} else {
			this.method4142(arg4);
			local3.glBegin(7);
			local3.glMultiTexCoord2f(33985, 0.0F, this.aClass92_Sub4_Sub1_4.aFloat53);
			local3.glTexCoord2f(0.0F, this.aClass92_Sub4_Sub1_4.aFloat53);
			local3.glVertex2i(arg0, arg1);
			local3.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(arg0, arg1 + arg3);
			local3.glMultiTexCoord2f(33985, this.aClass92_Sub4_Sub1_4.aFloat54, 0.0F);
			local3.glTexCoord2f(this.aClass92_Sub4_Sub1_4.aFloat54, 0.0F);
			local3.glVertex2i(arg0 + arg2, arg1 + arg3);
			local3.glMultiTexCoord2f(33985, this.aClass92_Sub4_Sub1_4.aFloat54, this.aClass92_Sub4_Sub1_4.aFloat53);
			local3.glTexCoord2f(this.aClass92_Sub4_Sub1_4.aFloat54, this.aClass92_Sub4_Sub1_4.aFloat53);
			local3.glVertex2i(arg0 + arg2, arg1);
			local3.glEnd();
			this.method4143();
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected void method4136(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean351) {
			local6 = this.method4141();
			local10 = this.method4140();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(28) float local28 = (arg4 - arg0) / local10;
			@Pc(34) float local34 = (arg5 - arg1) / local10;
			@Pc(40) float local40 = local28 * (float) this.anInt4743;
			@Pc(46) float local46 = local34 * (float) this.anInt4743;
			@Pc(52) float local52 = local16 * (float) this.anInt4742;
			@Pc(58) float local58 = local22 * (float) this.anInt4742;
			@Pc(65) float local65 = -local16 * (float) this.anInt4741;
			@Pc(72) float local72 = -local22 * (float) this.anInt4741;
			@Pc(79) float local79 = -local28 * (float) this.anInt4744;
			@Pc(86) float local86 = -local34 * (float) this.anInt4744;
			arg0 = arg0 + local52 + local40;
			arg1 = arg1 + local58 + local46;
			arg2 = arg2 + local65 + local40;
			arg3 = arg3 + local72 + local46;
			arg4 = arg4 + local52 + local79;
			arg5 = arg5 + local58 + local86;
		}
		local6 = arg4 + arg2 - arg0;
		local10 = arg3 + arg5 - arg1;
		@Pc(138) opengl local138 = this.aClass89_Sub1_32.anOpengl2;
		this.aClass89_Sub1_32.method2441();
		this.aClass89_Sub1_32.method2445(this.aClass92_Sub4_Sub1_4);
		this.aClass89_Sub1_32.method2403(1);
		this.aClass89_Sub1_32.method2425(arg6);
		local138.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		local138.glBegin(7);
		local138.glTexCoord2f(0.0F, this.aClass92_Sub4_Sub1_4.aFloat53);
		local138.glVertex2f(arg0, arg1);
		local138.glTexCoord2f(0.0F, 0.0F);
		local138.glVertex2f(arg4, arg5);
		local138.glTexCoord2f(this.aClass92_Sub4_Sub1_4.aFloat54, 0.0F);
		local138.glVertex2f(local6, local10);
		local138.glTexCoord2f(this.aClass92_Sub4_Sub1_4.aFloat54, this.aClass92_Sub4_Sub1_4.aFloat53);
		local138.glVertex2f(arg2, arg3);
		local138.glEnd();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "()I")
	@Override
	public int method4124() {
		return this.aClass92_Sub4_Sub1_4.anInt3884;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(IIII)V")
	@Override
	public void method4139(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4742 = arg0;
		this.anInt4743 = arg1;
		this.anInt4741 = arg2;
		this.anInt4744 = arg3;
		this.aBoolean351 = this.anInt4742 != 0 || this.anInt4743 != 0 || this.anInt4741 != 0 || this.anInt4744 != 0;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "()I")
	@Override
	public int method4134() {
		return this.aClass92_Sub4_Sub1_4.anInt3883;
	}

	@OriginalMember(owner = "client!pd", name = "d", descriptor = "()I")
	@Override
	public int method4141() {
		return this.aClass92_Sub4_Sub1_4.anInt3884 + this.anInt4742 + this.anInt4741;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
	private void method4142(@OriginalArg(0) int arg0) {
		this.aClass89_Sub1_32.method2433(1);
		this.aClass89_Sub1_32.method2445(this.aClass92_Sub4_Sub1_4);
		this.aClass89_Sub1_32.method2419(this.aClass89_Sub1_32.method2399(arg0), 7681);
		this.aClass89_Sub1_32.method2392(1, 34167, 768);
		this.aClass89_Sub1_32.method2451(0, 34168);
		this.aClass89_Sub1_32.method2433(0);
		this.aClass89_Sub1_32.method2445(this.aClass92_Sub4_Sub1_3);
		this.aClass89_Sub1_32.method2419(34479, 7681);
		this.aClass89_Sub1_32.method2392(1, 34166, 768);
		if (this.anInt4740 == 0) {
			this.aClass89_Sub1_32.method2429(1.0F, 0.5F, 0.5F, 0.0F);
		} else if (this.anInt4740 == 1) {
			this.aClass89_Sub1_32.method2429(0.5F, 1.0F, 0.5F, 0.0F);
		} else if (this.anInt4740 == 2) {
			this.aClass89_Sub1_32.method2429(0.5F, 0.5F, 1.0F, 0.0F);
		} else if (this.anInt4740 == 3) {
			this.aClass89_Sub1_32.method2429(128.5F, 128.5F, 128.5F, 0.0F);
		}
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method4137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass92_Sub4_Sub1_4.method3532(arg0, arg1, arg2, arg3);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IILclient!vj;II)V")
	@Override
	public void method4122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class64 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) Class64_Sub2 local2 = (Class64_Sub2) arg2;
		@Pc(5) Class92_Sub4_Sub1 local5 = local2.aClass92_Sub4_Sub1_2;
		this.aClass89_Sub1_32.method2441();
		this.aClass89_Sub1_32.method2445(this.aClass92_Sub4_Sub1_4);
		this.aClass89_Sub1_32.method2425(0);
		this.aClass89_Sub1_32.method2433(1);
		this.aClass89_Sub1_32.method2445(local5);
		this.aClass89_Sub1_32.method2419(7681, 8448);
		this.aClass89_Sub1_32.method2392(0, 34168, 768);
		this.aClass89_Sub1_32.method2403(1);
		@Pc(45) int local45 = arg0 + this.anInt4742;
		@Pc(50) int local50 = arg1 + this.anInt4743;
		@Pc(56) int local56 = local45 + this.aClass92_Sub4_Sub1_4.anInt3884;
		@Pc(62) int local62 = local50 + this.aClass92_Sub4_Sub1_4.anInt3883;
		@Pc(69) float local69 = local5.aFloat54 / (float) local5.anInt3884;
		@Pc(76) float local76 = local5.aFloat53 / (float) local5.anInt3883;
		@Pc(83) float local83 = (float) (local45 - arg3) * local69;
		@Pc(90) float local90 = (float) (local56 - arg3) * local69;
		@Pc(100) float local100 = local5.aFloat53 - (float) (local50 - arg4) * local76;
		@Pc(110) float local110 = local5.aFloat53 - (float) (local62 - arg4) * local76;
		@Pc(114) opengl local114 = this.aClass89_Sub1_32.anOpengl2;
		local114.glBegin(7);
		local114.glColor3f(1.0F, 1.0F, 1.0F);
		local114.glMultiTexCoord2f(33984, 0.0F, this.aClass92_Sub4_Sub1_4.aFloat53);
		local114.glMultiTexCoord2f(33985, local83, local100);
		local114.glVertex2i(local45, local50);
		local114.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		local114.glMultiTexCoord2f(33985, local83, local110);
		local114.glVertex2i(local45, local50 + this.aClass92_Sub4_Sub1_4.anInt3883);
		local114.glMultiTexCoord2f(33984, this.aClass92_Sub4_Sub1_4.aFloat54, 0.0F);
		local114.glMultiTexCoord2f(33985, local90, local110);
		local114.glVertex2i(local45 + this.aClass92_Sub4_Sub1_4.anInt3884, local50 + this.aClass92_Sub4_Sub1_4.anInt3883);
		local114.glMultiTexCoord2f(33984, this.aClass92_Sub4_Sub1_4.aFloat54, this.aClass92_Sub4_Sub1_4.aFloat53);
		local114.glMultiTexCoord2f(33985, local90, local100);
		local114.glVertex2i(local45 + this.aClass92_Sub4_Sub1_4.anInt3884, local50);
		local114.glEnd();
		this.aClass89_Sub1_32.method2392(0, 5890, 768);
		this.aClass89_Sub1_32.method2425(1);
		this.aClass89_Sub1_32.method2445(null);
		this.aClass89_Sub1_32.method2433(0);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(FFFFFFLclient!vj;II)V")
	@Override
	protected void method4133(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class64 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(3) Class92_Sub4_Sub1 local3 = ((Class64_Sub2) arg6).aClass92_Sub4_Sub1_2;
		@Pc(10) float local10;
		@Pc(14) float local14;
		@Pc(26) float local26;
		@Pc(32) float local32;
		if (this.aBoolean351) {
			local10 = this.method4141();
			local14 = this.method4140();
			@Pc(20) float local20 = (arg2 - arg0) / local10;
			local26 = (arg3 - arg1) / local10;
			local32 = (arg4 - arg0) / local14;
			@Pc(38) float local38 = (arg5 - arg1) / local14;
			@Pc(44) float local44 = local32 * (float) this.anInt4743;
			@Pc(50) float local50 = local38 * (float) this.anInt4743;
			@Pc(56) float local56 = local20 * (float) this.anInt4742;
			@Pc(62) float local62 = local26 * (float) this.anInt4742;
			@Pc(69) float local69 = -local20 * (float) this.anInt4741;
			@Pc(76) float local76 = -local26 * (float) this.anInt4741;
			@Pc(83) float local83 = -local32 * (float) this.anInt4744;
			@Pc(90) float local90 = -local38 * (float) this.anInt4744;
			arg0 = arg0 + local56 + local44;
			arg1 = arg1 + local62 + local50;
			arg2 = arg2 + local69 + local44;
			arg3 = arg3 + local76 + local50;
			arg4 = arg4 + local56 + local83;
			arg5 = arg5 + local62 + local90;
		}
		local10 = arg4 + arg2 - arg0;
		local14 = arg3 + arg5 - arg1;
		@Pc(142) opengl local142 = this.aClass89_Sub1_32.anOpengl2;
		this.aClass89_Sub1_32.method2441();
		this.aClass89_Sub1_32.method2445(this.aClass92_Sub4_Sub1_4);
		this.aClass89_Sub1_32.method2425(0);
		this.aClass89_Sub1_32.method2433(1);
		this.aClass89_Sub1_32.method2445(local3);
		this.aClass89_Sub1_32.method2419(7681, 8448);
		this.aClass89_Sub1_32.method2392(0, 34168, 768);
		this.aClass89_Sub1_32.method2403(1);
		local26 = local3.aFloat54 / (float) local3.anInt3884;
		local32 = local3.aFloat53 / (float) local3.anInt3883;
		local142.glBegin(7);
		local142.glColor3f(1.0F, 1.0F, 1.0F);
		local142.glMultiTexCoord2f(33984, 0.0F, this.aClass92_Sub4_Sub1_4.aFloat53);
		local142.glMultiTexCoord2f(33985, local26 * (arg0 - (float) arg7), local3.aFloat53 - local32 * (arg1 - (float) arg8));
		local142.glVertex2f(arg0, arg1);
		local142.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		local142.glMultiTexCoord2f(33985, local26 * (arg4 - (float) arg7), local3.aFloat53 - local32 * (arg5 - (float) arg8));
		local142.glVertex2f(arg4, arg5);
		local142.glMultiTexCoord2f(33984, this.aClass92_Sub4_Sub1_4.aFloat54, 0.0F);
		local142.glMultiTexCoord2f(33985, local26 * (local10 - (float) arg7), local3.aFloat53 - local32 * (local14 - (float) arg8));
		local142.glVertex2f(local10, local14);
		local142.glMultiTexCoord2f(33984, this.aClass92_Sub4_Sub1_4.aFloat54, this.aClass92_Sub4_Sub1_4.aFloat53);
		local142.glMultiTexCoord2f(33985, local26 * (arg2 - (float) arg7), local3.aFloat53 - local32 * (arg3 - (float) arg8));
		local142.glVertex2f(arg2, arg3);
		local142.glEnd();
		this.aClass89_Sub1_32.method2392(0, 5890, 768);
		this.aClass89_Sub1_32.method2425(1);
		this.aClass89_Sub1_32.method2445(null);
		this.aClass89_Sub1_32.method2433(0);
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method4138(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(3) opengl local3 = this.aClass89_Sub1_32.anOpengl2;
		@Pc(7) int local7 = arg0 + arg2;
		@Pc(11) int local11 = arg1 + arg3;
		this.aClass89_Sub1_32.method2441();
		this.aClass89_Sub1_32.method2445(this.aClass92_Sub4_Sub1_4);
		this.aClass89_Sub1_32.method2403(1);
		this.aClass89_Sub1_32.method2425(arg4);
		local3.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass92_Sub4_Sub1_4.aBoolean305 && !this.aBoolean351) {
			@Pc(62) float local62 = this.aClass92_Sub4_Sub1_4.aFloat53 * (float) arg3 / (float) this.aClass92_Sub4_Sub1_4.anInt3883;
			@Pc(74) float local74 = this.aClass92_Sub4_Sub1_4.aFloat54 * (float) arg2 / (float) this.aClass92_Sub4_Sub1_4.anInt3884;
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
		local3.glTranslatef((float) this.anInt4742, (float) this.anInt4743, 0.0F);
		@Pc(126) int local126 = this.method4141();
		@Pc(129) int local129 = this.method4140();
		@Pc(135) int local135 = arg1 + this.aClass92_Sub4_Sub1_4.anInt3883;
		local3.glBegin(7);
		@Pc(140) int local140 = arg1;
		@Pc(149) int local149;
		while (local135 <= local11) {
			local149 = arg0 + this.aClass92_Sub4_Sub1_4.anInt3884;
			@Pc(151) int local151 = arg0;
			while (local149 <= local7) {
				local3.glTexCoord2f(0.0F, this.aClass92_Sub4_Sub1_4.aFloat53);
				local3.glVertex2i(local151, local140);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2i(local151, local135);
				local3.glTexCoord2f(this.aClass92_Sub4_Sub1_4.aFloat54, 0.0F);
				local3.glVertex2i(local149, local135);
				local3.glTexCoord2f(this.aClass92_Sub4_Sub1_4.aFloat54, this.aClass92_Sub4_Sub1_4.aFloat53);
				local3.glVertex2i(local149, local140);
				local149 += local126;
				local151 += local126;
			}
			if (local151 < local7) {
				@Pc(220) float local220 = this.aClass92_Sub4_Sub1_4.aFloat54 * (float) (local7 - local151) / (float) this.aClass92_Sub4_Sub1_4.anInt3884;
				local3.glTexCoord2f(0.0F, this.aClass92_Sub4_Sub1_4.aFloat53);
				local3.glVertex2i(local151, local140);
				local3.glTexCoord2f(0.0F, 0.0F);
				local3.glVertex2i(local151, local135);
				local3.glTexCoord2f(local220, 0.0F);
				local3.glVertex2i(local7, local135);
				local3.glTexCoord2f(local220, this.aClass92_Sub4_Sub1_4.aFloat53);
				local3.glVertex2i(local7, local140);
			}
			local140 += local129;
			local135 += local129;
		}
		if (local140 < local11) {
			@Pc(286) float local286 = this.aClass92_Sub4_Sub1_4.aFloat53 * (float) (this.aClass92_Sub4_Sub1_4.anInt3880 + local140 - local11) / (float) this.aClass92_Sub4_Sub1_4.anInt3883;
			@Pc(292) int local292 = arg0 + this.aClass92_Sub4_Sub1_4.anInt3884;
			local149 = arg0;
			while (local292 <= local7) {
				local3.glTexCoord2f(0.0F, this.aClass92_Sub4_Sub1_4.aFloat53);
				local3.glVertex2i(local149, local140);
				local3.glTexCoord2f(0.0F, local286);
				local3.glVertex2i(local149, local11);
				local3.glTexCoord2f(this.aClass92_Sub4_Sub1_4.aFloat54, local286);
				local3.glVertex2i(local292, local11);
				local3.glTexCoord2f(this.aClass92_Sub4_Sub1_4.aFloat54, this.aClass92_Sub4_Sub1_4.aFloat53);
				local3.glVertex2i(local292, local140);
				local292 += local126;
				local149 += local126;
			}
			if (local149 < local7) {
				@Pc(363) float local363 = this.aClass92_Sub4_Sub1_4.aFloat54 * (float) (local7 - local149) / (float) this.aClass92_Sub4_Sub1_4.anInt3884;
				local3.glTexCoord2f(0.0F, this.aClass92_Sub4_Sub1_4.aFloat53);
				local3.glVertex2i(local149, local140);
				local3.glTexCoord2f(0.0F, local286);
				local3.glVertex2i(local149, local11);
				local3.glTexCoord2f(local363, local286);
				local3.glVertex2i(local7, local11);
				local3.glTexCoord2f(local363, this.aClass92_Sub4_Sub1_4.aFloat53);
				local3.glVertex2i(local7, local140);
			}
		}
		local3.glEnd();
		local3.glPopMatrix();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method4131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(3) opengl local3 = this.aClass89_Sub1_32.anOpengl2;
		this.aClass89_Sub1_32.method2441();
		this.aClass89_Sub1_32.method2403(1);
		local3.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(31) int local31 = arg0 + this.anInt4742;
		@Pc(36) int local36 = arg1 + this.anInt4743;
		if (this.aClass92_Sub4_Sub1_3 == null) {
			this.aClass89_Sub1_32.method2445(this.aClass92_Sub4_Sub1_4);
			this.aClass89_Sub1_32.method2425(arg2);
			local3.glBegin(7);
			local3.glTexCoord2f(0.0F, this.aClass92_Sub4_Sub1_4.aFloat53);
			local3.glVertex2i(local31, local36);
			local3.glTexCoord2f(0.0F, 0.0F);
			local3.glVertex2i(local31, local36 + this.aClass92_Sub4_Sub1_4.anInt3883);
			local3.glTexCoord2f(this.aClass92_Sub4_Sub1_4.aFloat54, 0.0F);
			local3.glVertex2i(local31 + this.aClass92_Sub4_Sub1_4.anInt3884, local36 + this.aClass92_Sub4_Sub1_4.anInt3883);
			local3.glTexCoord2f(this.aClass92_Sub4_Sub1_4.aFloat54, this.aClass92_Sub4_Sub1_4.aFloat53);
			local3.glVertex2i(local31 + this.aClass92_Sub4_Sub1_4.anInt3884, local36);
			local3.glEnd();
			return;
		}
		this.method4142(arg2);
		local3.glBegin(7);
		local3.glMultiTexCoord2f(33985, 0.0F, this.aClass92_Sub4_Sub1_4.aFloat53);
		local3.glTexCoord2f(0.0F, this.aClass92_Sub4_Sub1_4.aFloat53);
		local3.glVertex2i(local31, local36);
		local3.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		local3.glTexCoord2f(0.0F, 0.0F);
		local3.glVertex2i(local31, local36 + this.aClass92_Sub4_Sub1_4.anInt3883);
		local3.glMultiTexCoord2f(33985, this.aClass92_Sub4_Sub1_4.aFloat54, 0.0F);
		local3.glTexCoord2f(this.aClass92_Sub4_Sub1_4.aFloat54, 0.0F);
		local3.glVertex2i(local31 + this.aClass92_Sub4_Sub1_4.anInt3884, local36 + this.aClass92_Sub4_Sub1_4.anInt3883);
		local3.glMultiTexCoord2f(33985, this.aClass92_Sub4_Sub1_4.aFloat54, this.aClass92_Sub4_Sub1_4.aFloat53);
		local3.glTexCoord2f(this.aClass92_Sub4_Sub1_4.aFloat54, this.aClass92_Sub4_Sub1_4.aFloat53);
		local3.glVertex2i(local31 + this.aClass92_Sub4_Sub1_4.anInt3884, local36);
		local3.glEnd();
		this.method4143();
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "()I")
	@Override
	public int method4140() {
		return this.aClass92_Sub4_Sub1_4.anInt3883 + this.anInt4743 + this.anInt4744;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V")
	@Override
	public void method4135(@OriginalArg(2) int arg0) {
		@Pc(3) opengl local3 = this.aClass89_Sub1_32.anOpengl2;
		local3.glPixelTransferf(3348, 0.5F);
		local3.glPixelTransferf(3349, 0.499F);
		local3.glPixelTransferf(3352, 0.5F);
		local3.glPixelTransferf(3353, 0.499F);
		local3.glPixelTransferf(3354, 0.5F);
		local3.glPixelTransferf(3355, 0.499F);
		this.aClass92_Sub4_Sub1_3 = Static363.method3536(this.aClass89_Sub1_32, this.aClass92_Sub4_Sub1_4.anInt3884, 0, 0, this.aClass92_Sub4_Sub1_4.anInt3883);
		this.anInt4740 = arg0;
		local3.glPixelTransferf(3348, 1.0F);
		local3.glPixelTransferf(3349, 0.0F);
		local3.glPixelTransferf(3352, 1.0F);
		local3.glPixelTransferf(3353, 0.0F);
		local3.glPixelTransferf(3354, 1.0F);
		local3.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!pd", name = "e", descriptor = "()V")
	private void method4143() {
		this.aClass89_Sub1_32.method2433(1);
		this.aClass89_Sub1_32.method2445(null);
		this.aClass89_Sub1_32.method2419(8448, 8448);
		this.aClass89_Sub1_32.method2392(1, 34168, 768);
		this.aClass89_Sub1_32.method2451(0, 5890);
		this.aClass89_Sub1_32.method2433(0);
		this.aClass89_Sub1_32.method2392(1, 34168, 768);
	}
}
