import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class49_Sub2 extends Class49 {

	@OriginalMember(owner = "client!se", name = "f", descriptor = "Lclient!gda;")
	private Class44_Sub1_Sub1 aClass44_Sub1_Sub1_4;

	@OriginalMember(owner = "client!se", name = "o", descriptor = "I")
	private int anInt8882 = 0;

	@OriginalMember(owner = "client!se", name = "n", descriptor = "I")
	private int anInt8897 = 0;

	@OriginalMember(owner = "client!se", name = "h", descriptor = "I")
	private int anInt8892 = 0;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "I")
	private int anInt8881 = 0;

	@OriginalMember(owner = "client!se", name = "m", descriptor = "Z")
	private boolean aBoolean673 = false;

	@OriginalMember(owner = "client!se", name = "e", descriptor = "I")
	private int anInt8893 = 0;

	@OriginalMember(owner = "client!se", name = "t", descriptor = "Lclient!ml;")
	private final Class75_Sub3 aClass75_Sub3_36;

	@OriginalMember(owner = "client!se", name = "F", descriptor = "Lclient!gda;")
	private final Class44_Sub1_Sub1 aClass44_Sub1_Sub1_5;

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!ml;IIZ)V")
	public Class49_Sub2(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.aClass75_Sub3_36 = arg0;
		this.aClass44_Sub1_Sub1_5 = Static547.method7751(arg1, arg3 ? 6408 : 6407, arg0, arg2);
	}

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!ml;IIII)V")
	public Class49_Sub2(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass75_Sub3_36 = arg0;
		this.aClass44_Sub1_Sub1_5 = Static323.method5077(arg1, arg3, arg4, arg2, arg0);
	}

	@OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Lclient!ml;II[III)V")
	public Class49_Sub2(@OriginalArg(0) Class75_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass75_Sub3_36 = arg0;
		this.aClass44_Sub1_Sub1_5 = Static414.method6397(arg5, arg1, arg3, arg0, arg4, arg2);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method8975(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean673) {
			local6 = (float) this.method8991();
			local10 = (float) this.method8987();
			@Pc(17) float local17 = (arg2 - arg0) / local6;
			@Pc(23) float local23 = (arg3 - arg1) / local6;
			@Pc(29) float local29 = (arg4 - arg0) / local10;
			@Pc(36) float local36 = (arg5 - arg1) / local10;
			@Pc(42) float local42 = local29 * (float) this.anInt8882;
			@Pc(48) float local48 = (float) this.anInt8882 * local36;
			@Pc(54) float local54 = local17 * (float) this.anInt8892;
			@Pc(60) float local60 = (float) this.anInt8892 * local23;
			@Pc(67) float local67 = (float) this.anInt8881 * -local17;
			@Pc(74) float local74 = -local23 * (float) this.anInt8881;
			@Pc(81) float local81 = -local29 * (float) this.anInt8897;
			arg4 = arg4 + local54 + local81;
			arg1 = local48 + arg1 + local60;
			@Pc(100) float local100 = (float) this.anInt8897 * -local36;
			arg2 = local42 + arg2 + local67;
			arg3 = local48 + arg3 + local74;
			arg0 = local42 + local54 + arg0;
			arg5 = local100 + arg5 + local60;
		}
		local6 = arg2 + arg4 - arg0;
		this.aClass44_Sub1_Sub1_5.method9007(true);
		local10 = arg3 + arg5 - arg1;
		this.aClass75_Sub3_36.method5776();
		this.aClass75_Sub3_36.method5774(this.aClass44_Sub1_Sub1_5);
		this.aClass75_Sub3_36.method5826(1);
		this.aClass75_Sub3_36.method5787(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass44_Sub1_Sub1_5.aFloat69);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_5.aFloat68, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_5.aFloat68, this.aClass44_Sub1_Sub1_5.aFloat69);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method8982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass44_Sub1_Sub1_5.method9007(true);
		this.aClass75_Sub3_36.method5776();
		this.aClass75_Sub3_36.method5826(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean673) {
			@Pc(191) float local191 = (float) arg2 / (float) this.method8991();
			@Pc(198) float local198 = (float) arg3 / (float) this.method8987();
			@Pc(207) float local207 = (float) this.anInt8892 * local191 + (float) arg0;
			@Pc(216) float local216 = (float) arg1 + (float) this.anInt8882 * local198;
			@Pc(225) float local225 = (float) this.aClass44_Sub1_Sub1_5.anInt3730 * local191 + local207;
			@Pc(234) float local234 = (float) this.aClass44_Sub1_Sub1_5.anInt3729 * local198 + local216;
			if (this.aClass44_Sub1_Sub1_4 == null) {
				this.aClass75_Sub3_36.method5774(this.aClass44_Sub1_Sub1_5);
				this.aClass75_Sub3_36.method5787(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass44_Sub1_Sub1_5.aFloat69);
				OpenGL.glVertex2f(local207, local216);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local207, local234);
				OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_5.aFloat68, 0.0F);
				OpenGL.glVertex2f(local225, local234);
				OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_5.aFloat68, this.aClass44_Sub1_Sub1_5.aFloat69);
				OpenGL.glVertex2f(local225, local216);
				OpenGL.glEnd();
			} else {
				this.method7786(arg4);
				this.aClass44_Sub1_Sub1_4.method9007(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass44_Sub1_Sub1_5.aFloat69);
				OpenGL.glTexCoord2f(0.0F, this.aClass44_Sub1_Sub1_5.aFloat69);
				OpenGL.glVertex2f(local207, local216);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local207, local234);
				OpenGL.glMultiTexCoord2f(33985, this.aClass44_Sub1_Sub1_5.aFloat68, 0.0F);
				OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_5.aFloat68, 0.0F);
				OpenGL.glVertex2f(local225, local234);
				OpenGL.glMultiTexCoord2f(33985, this.aClass44_Sub1_Sub1_5.aFloat68, this.aClass44_Sub1_Sub1_5.aFloat69);
				OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_5.aFloat68, this.aClass44_Sub1_Sub1_5.aFloat69);
				OpenGL.glVertex2f(local225, local216);
				OpenGL.glEnd();
				this.method7790();
			}
		} else if (this.aClass44_Sub1_Sub1_4 == null) {
			this.aClass75_Sub3_36.method5774(this.aClass44_Sub1_Sub1_5);
			this.aClass75_Sub3_36.method5787(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass44_Sub1_Sub1_5.aFloat69);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_5.aFloat68, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg3 + arg1);
			OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_5.aFloat68, this.aClass44_Sub1_Sub1_5.aFloat69);
			OpenGL.glVertex2i(arg0 + arg2, arg1);
			OpenGL.glEnd();
		} else {
			this.method7786(arg4);
			this.aClass44_Sub1_Sub1_4.method9007(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass44_Sub1_Sub1_5.aFloat69);
			OpenGL.glTexCoord2f(0.0F, this.aClass44_Sub1_Sub1_5.aFloat69);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass44_Sub1_Sub1_5.aFloat68, 0.0F);
			OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_5.aFloat68, 0.0F);
			OpenGL.glVertex2i(arg2 + arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass44_Sub1_Sub1_5.aFloat68, this.aClass44_Sub1_Sub1_5.aFloat69);
			OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_5.aFloat68, this.aClass44_Sub1_Sub1_5.aFloat69);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method7790();
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "([I)V")
	@Override
	public void method8984(@OriginalArg(0) int[] arg0) {
		arg0[2] = this.anInt8881;
		arg0[3] = this.anInt8897;
		arg0[1] = this.anInt8882;
		arg0[0] = this.anInt8892;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method8980(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(7) Class44_Sub1_Sub1 local7 = ((Class1_Sub1) arg6).aClass44_Sub1_Sub1_1;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(32) float local32;
		if (this.aBoolean673) {
			local14 = (float) this.method8991();
			local18 = (float) this.method8987();
			local25 = (arg2 - arg0) / local14;
			local32 = (arg3 - arg1) / local14;
			@Pc(39) float local39 = (arg4 - arg0) / local18;
			@Pc(46) float local46 = (arg5 - arg1) / local18;
			@Pc(52) float local52 = (float) this.anInt8882 * local39;
			@Pc(58) float local58 = local46 * (float) this.anInt8882;
			@Pc(64) float local64 = (float) this.anInt8892 * local25;
			@Pc(70) float local70 = local32 * (float) this.anInt8892;
			@Pc(77) float local77 = -local25 * (float) this.anInt8881;
			@Pc(84) float local84 = -local32 * (float) this.anInt8881;
			@Pc(91) float local91 = (float) this.anInt8897 * -local39;
			@Pc(98) float local98 = (float) this.anInt8897 * -local46;
			arg1 = local58 + local70 + arg1;
			arg2 = local52 + arg2 + local77;
			arg4 = arg4 + local64 + local91;
			arg0 = local52 + arg0 + local64;
			arg3 = local58 + arg3 + local84;
			arg5 = local70 + arg5 + local98;
		}
		local14 = arg4 + arg2 - arg0;
		this.aClass44_Sub1_Sub1_5.method9007(true);
		local18 = arg3 + arg5 - arg1;
		this.aClass75_Sub3_36.method5776();
		this.aClass75_Sub3_36.method5774(this.aClass44_Sub1_Sub1_5);
		this.aClass75_Sub3_36.method5787(1);
		this.aClass75_Sub3_36.method5775(1);
		this.aClass75_Sub3_36.method5774(local7);
		this.aClass75_Sub3_36.method5784(8448, 7681);
		this.aClass75_Sub3_36.method5825(768, 0, 34168);
		this.aClass75_Sub3_36.method5826(1);
		local25 = local7.aFloat68 / (float) local7.anInt3730;
		local32 = local7.aFloat69 / (float) local7.anInt3729;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass44_Sub1_Sub1_5.aFloat69);
		OpenGL.glMultiTexCoord2f(33985, (arg0 - (float) arg7) * local25, local7.aFloat69 - local32 * (arg1 - (float) arg8));
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * (arg4 - (float) arg7), local7.aFloat69 - local32 * (arg5 - (float) arg8));
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass44_Sub1_Sub1_5.aFloat68, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, (local14 - (float) arg7) * local25, local7.aFloat69 - ((float) -arg8 + local18) * local32);
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass44_Sub1_Sub1_5.aFloat68, this.aClass44_Sub1_Sub1_5.aFloat69);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + arg2) * local25, local7.aFloat69 - local32 * (arg3 - (float) arg8));
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass75_Sub3_36.method5825(768, 0, 5890);
		this.aClass75_Sub3_36.method5787(0);
		this.aClass75_Sub3_36.method5774((Class44) null);
		this.aClass75_Sub3_36.method5775(0);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "()I")
	@Override
	public int method8988() {
		return this.aClass44_Sub1_Sub1_5.anInt3730;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
	@Override
	public void method8977() {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass44_Sub1_Sub1_4 = Static323.method5077(0, this.aClass44_Sub1_Sub1_5.anInt3730, this.aClass44_Sub1_Sub1_5.anInt3729, 0, this.aClass75_Sub3_36);
		this.anInt8893 = 3;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method8981(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass44_Sub1_Sub1_5.method9007(false);
		this.aClass75_Sub3_36.method5776();
		this.aClass75_Sub3_36.method5826(arg4);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg0 + this.anInt8892;
		@Pc(42) int local42 = arg1 + this.anInt8882;
		if (this.aClass44_Sub1_Sub1_4 == null) {
			this.aClass75_Sub3_36.method5774(this.aClass44_Sub1_Sub1_5);
			this.aClass75_Sub3_36.method5787(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass44_Sub1_Sub1_5.aFloat69);
			OpenGL.glVertex2i(local37, local42);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local37, this.aClass44_Sub1_Sub1_5.anInt3729 + local42);
			OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_5.aFloat68, 0.0F);
			OpenGL.glVertex2i(this.aClass44_Sub1_Sub1_5.anInt3730 + local37, this.aClass44_Sub1_Sub1_5.anInt3729 + local42);
			OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_5.aFloat68, this.aClass44_Sub1_Sub1_5.aFloat69);
			OpenGL.glVertex2i(local37 + this.aClass44_Sub1_Sub1_5.anInt3730, local42);
			OpenGL.glEnd();
			return;
		}
		this.method7786(arg2);
		this.aClass44_Sub1_Sub1_4.method9007(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass44_Sub1_Sub1_5.aFloat69);
		OpenGL.glTexCoord2f(0.0F, this.aClass44_Sub1_Sub1_5.aFloat69);
		OpenGL.glVertex2i(local37, local42);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local37, this.aClass44_Sub1_Sub1_5.anInt3729 + local42);
		OpenGL.glMultiTexCoord2f(33985, this.aClass44_Sub1_Sub1_5.aFloat68, 0.0F);
		OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_5.aFloat68, 0.0F);
		OpenGL.glVertex2i(this.aClass44_Sub1_Sub1_5.anInt3730 + local37, local42 + this.aClass44_Sub1_Sub1_5.anInt3729);
		OpenGL.glMultiTexCoord2f(33985, this.aClass44_Sub1_Sub1_5.aFloat68, this.aClass44_Sub1_Sub1_5.aFloat69);
		OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_5.aFloat68, this.aClass44_Sub1_Sub1_5.aFloat69);
		OpenGL.glVertex2i(this.aClass44_Sub1_Sub1_5.anInt3730 + local37, local42);
		OpenGL.glEnd();
		this.method7790();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method8979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub1 local6 = (Class1_Sub1) arg2;
		@Pc(9) Class44_Sub1_Sub1 local9 = local6.aClass44_Sub1_Sub1_1;
		this.aClass44_Sub1_Sub1_5.method9007(false);
		this.aClass75_Sub3_36.method5776();
		this.aClass75_Sub3_36.method5774(this.aClass44_Sub1_Sub1_5);
		this.aClass75_Sub3_36.method5787(1);
		this.aClass75_Sub3_36.method5775(1);
		this.aClass75_Sub3_36.method5774(local9);
		this.aClass75_Sub3_36.method5784(8448, 7681);
		this.aClass75_Sub3_36.method5825(768, 0, 34168);
		this.aClass75_Sub3_36.method5826(1);
		@Pc(62) int local62 = arg0 + this.anInt8892;
		@Pc(67) int local67 = arg1 + this.anInt8882;
		@Pc(74) int local74 = local62 + this.aClass44_Sub1_Sub1_5.anInt3730;
		@Pc(80) int local80 = this.aClass44_Sub1_Sub1_5.anInt3729 + local67;
		@Pc(87) float local87 = local9.aFloat68 / (float) local9.anInt3730;
		@Pc(94) float local94 = local9.aFloat69 / (float) local9.anInt3729;
		@Pc(102) float local102 = local87 * (float) (local62 - arg3);
		@Pc(110) float local110 = local87 * (float) (local74 - arg3);
		@Pc(122) float local122 = local9.aFloat69 - local94 * (float) (local67 - arg4);
		@Pc(134) float local134 = local9.aFloat69 - (float) (local80 - arg4) * local94;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass44_Sub1_Sub1_5.aFloat69);
		OpenGL.glMultiTexCoord2f(33985, local102, local122);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local102, local134);
		OpenGL.glVertex2i(local62, this.aClass44_Sub1_Sub1_5.anInt3729 + local67);
		OpenGL.glMultiTexCoord2f(33984, this.aClass44_Sub1_Sub1_5.aFloat68, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local110, local134);
		OpenGL.glVertex2i(local62 + this.aClass44_Sub1_Sub1_5.anInt3730, local67 + this.aClass44_Sub1_Sub1_5.anInt3729);
		OpenGL.glMultiTexCoord2f(33984, this.aClass44_Sub1_Sub1_5.aFloat68, this.aClass44_Sub1_Sub1_5.aFloat69);
		OpenGL.glMultiTexCoord2f(33985, local110, local122);
		OpenGL.glVertex2i(local62 + this.aClass44_Sub1_Sub1_5.anInt3730, local67);
		OpenGL.glEnd();
		this.aClass75_Sub3_36.method5825(768, 0, 5890);
		this.aClass75_Sub3_36.method5787(0);
		this.aClass75_Sub3_36.method5774((Class44) null);
		this.aClass75_Sub3_36.method5775(0);
	}

	@OriginalMember(owner = "client!se", name = "c", descriptor = "()I")
	@Override
	public int method8993() {
		return this.aClass44_Sub1_Sub1_5.anInt3729;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method8976(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (!this.aClass75_Sub3_36.aBoolean490) {
			this.aClass44_Sub1_Sub1_5.method3478(arg2, arg1, arg5, arg3, arg4, arg0);
			return;
		}
		@Pc(29) int[] local29 = this.aClass75_Sub3_36.na(arg4, arg5, arg2, arg3);
		if (local29 != null) {
			for (@Pc(33) int local33 = 0; local33 < local29.length; local33++) {
				local29[local33] |= 0xFF000000;
			}
			this.method7789(arg0, arg1, arg2, arg3, local29, arg2);
		}
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "()I")
	@Override
	public int method8991() {
		return this.anInt8881 + this.aClass44_Sub1_Sub1_5.anInt3730 + this.anInt8892;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "(IIII)V")
	@Override
	public void method8989(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt8881 = arg2;
		this.anInt8897 = arg3;
		this.anInt8882 = arg1;
		this.anInt8892 = arg0;
		this.aBoolean673 = this.anInt8892 != 0 || this.anInt8882 != 0 || this.anInt8881 != 0 || this.anInt8897 != 0;
	}

	@OriginalMember(owner = "client!se", name = "b", descriptor = "()I")
	@Override
	public int method8987() {
		return this.anInt8882 + this.aClass44_Sub1_Sub1_5.anInt3729 + this.anInt8897;
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IB)V")
	private void method7786(@OriginalArg(0) int arg0) {
		this.aClass75_Sub3_36.method5775(1);
		this.aClass75_Sub3_36.method5774(this.aClass44_Sub1_Sub1_5);
		this.aClass75_Sub3_36.method5784(7681, this.aClass75_Sub3_36.method5793(arg0));
		this.aClass75_Sub3_36.method5825(768, 1, 34167);
		this.aClass75_Sub3_36.method5806(0, 34168);
		this.aClass75_Sub3_36.method5775(0);
		this.aClass75_Sub3_36.method5774(this.aClass44_Sub1_Sub1_4);
		this.aClass75_Sub3_36.method5784(7681, 34479);
		this.aClass75_Sub3_36.method5825(768, 1, 34166);
		if (this.anInt8893 == 0) {
			this.aClass75_Sub3_36.method5815(0.5F, 0.0F, 1.0F, 0.5F);
		} else if (this.anInt8893 == 1) {
			this.aClass75_Sub3_36.method5815(1.0F, 0.0F, 0.5F, 0.5F);
		} else if (this.anInt8893 == 2) {
			this.aClass75_Sub3_36.method5815(0.5F, 0.0F, 0.5F, 1.0F);
		} else if (this.anInt8893 == 3) {
			this.aClass75_Sub3_36.method5815(128.5F, 0.0F, 128.5F, 128.5F);
			return;
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method8990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(9) int local9 = arg2 + arg0;
		this.aClass44_Sub1_Sub1_5.method9007(false);
		@Pc(18) int local18 = arg1 + arg3;
		this.aClass75_Sub3_36.method5776();
		this.aClass75_Sub3_36.method5774(this.aClass44_Sub1_Sub1_5);
		this.aClass75_Sub3_36.method5826(arg6);
		this.aClass75_Sub3_36.method5787(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass44_Sub1_Sub1_5.aBoolean307 && !this.aBoolean673) {
			@Pc(362) float local362 = this.aClass44_Sub1_Sub1_5.aFloat69 * (float) arg3 / (float) this.aClass44_Sub1_Sub1_5.anInt3729;
			@Pc(374) float local374 = this.aClass44_Sub1_Sub1_5.aFloat68 * (float) arg2 / (float) this.aClass44_Sub1_Sub1_5.anInt3730;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local362);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local18);
			OpenGL.glTexCoord2f(local374, 0.0F);
			OpenGL.glVertex2i(local9, local18);
			OpenGL.glTexCoord2f(local374, local362);
			OpenGL.glVertex2i(local9, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt8892, (float) this.anInt8882, 0.0F);
		@Pc(74) int local74 = this.method8991();
		@Pc(77) int local77 = this.method8987();
		@Pc(83) int local83 = arg1 + this.aClass44_Sub1_Sub1_5.anInt3729;
		OpenGL.glBegin(7);
		@Pc(87) int local87 = arg1;
		@Pc(97) int local97;
		while (local18 >= local83) {
			local97 = this.aClass44_Sub1_Sub1_5.anInt3730 + arg0;
			@Pc(99) int local99 = arg0;
			while (local9 >= local97) {
				OpenGL.glTexCoord2f(0.0F, this.aClass44_Sub1_Sub1_5.aFloat69);
				OpenGL.glVertex2i(local99, local87);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local99, local83);
				OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_5.aFloat68, 0.0F);
				OpenGL.glVertex2i(local97, local83);
				OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_5.aFloat68, this.aClass44_Sub1_Sub1_5.aFloat69);
				OpenGL.glVertex2i(local97, local87);
				local97 += local74;
				local99 += local74;
			}
			if (local9 > local99) {
				@Pc(170) float local170 = (float) (local9 - local99) * this.aClass44_Sub1_Sub1_5.aFloat68 / (float) this.aClass44_Sub1_Sub1_5.anInt3730;
				OpenGL.glTexCoord2f(0.0F, this.aClass44_Sub1_Sub1_5.aFloat69);
				OpenGL.glVertex2i(local99, local87);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local99, local83);
				OpenGL.glTexCoord2f(local170, 0.0F);
				OpenGL.glVertex2i(local9, local83);
				OpenGL.glTexCoord2f(local170, this.aClass44_Sub1_Sub1_5.aFloat69);
				OpenGL.glVertex2i(local9, local87);
			}
			local87 += local77;
			local83 += local77;
		}
		if (local87 < local18) {
			@Pc(239) float local239 = (float) (local87 + this.aClass44_Sub1_Sub1_5.anInt3729 - local18) * this.aClass44_Sub1_Sub1_5.aFloat69 / (float) this.aClass44_Sub1_Sub1_5.anInt3729;
			@Pc(246) int local246 = arg0 + this.aClass44_Sub1_Sub1_5.anInt3730;
			local97 = arg0;
			while (local246 <= local9) {
				OpenGL.glTexCoord2f(0.0F, this.aClass44_Sub1_Sub1_5.aFloat69);
				OpenGL.glVertex2i(local97, local87);
				OpenGL.glTexCoord2f(0.0F, local239);
				OpenGL.glVertex2i(local97, local18);
				OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_5.aFloat68, local239);
				OpenGL.glVertex2i(local246, local18);
				OpenGL.glTexCoord2f(this.aClass44_Sub1_Sub1_5.aFloat68, this.aClass44_Sub1_Sub1_5.aFloat69);
				OpenGL.glVertex2i(local246, local87);
				local97 += local74;
				local246 += local74;
			}
			if (local97 < local9) {
				@Pc(319) float local319 = this.aClass44_Sub1_Sub1_5.aFloat68 * (float) (local9 - local97) / (float) this.aClass44_Sub1_Sub1_5.anInt3730;
				OpenGL.glTexCoord2f(0.0F, this.aClass44_Sub1_Sub1_5.aFloat69);
				OpenGL.glVertex2i(local97, local87);
				OpenGL.glTexCoord2f(0.0F, local239);
				OpenGL.glVertex2i(local97, local18);
				OpenGL.glTexCoord2f(local319, local239);
				OpenGL.glVertex2i(local9, local18);
				OpenGL.glTexCoord2f(local319, this.aClass44_Sub1_Sub1_5.aFloat69);
				OpenGL.glVertex2i(local9, local87);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IIII[III)V")
	private void method7789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.aClass44_Sub1_Sub1_5.method3479(arg3, arg5, arg1, arg4, arg0, arg2);
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
	private void method7790() {
		this.aClass75_Sub3_36.method5775(1);
		this.aClass75_Sub3_36.method5774((Class44) null);
		this.aClass75_Sub3_36.method5784(8448, 8448);
		this.aClass75_Sub3_36.method5825(768, 1, 34168);
		this.aClass75_Sub3_36.method5806(0, 5890);
		this.aClass75_Sub3_36.method5775(0);
		this.aClass75_Sub3_36.method5825(768, 1, 34168);
	}
}
