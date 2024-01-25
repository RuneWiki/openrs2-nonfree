import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nq")
public final class Class87_Sub2 extends Class87 {

	@OriginalMember(owner = "client!nq", name = "w", descriptor = "Lclient!oc;")
	private Class19_Sub4_Sub1 aClass19_Sub4_Sub1_2;

	@OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
	private int anInt4883 = 0;

	@OriginalMember(owner = "client!nq", name = "h", descriptor = "I")
	private int anInt4885 = 0;

	@OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
	private int anInt4895 = 0;

	@OriginalMember(owner = "client!nq", name = "o", descriptor = "I")
	private int anInt4892 = 0;

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "Z")
	private boolean aBoolean304 = false;

	@OriginalMember(owner = "client!nq", name = "t", descriptor = "I")
	private int anInt4897 = 0;

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "Lclient!rl;")
	private final Class66_Sub2 aClass66_Sub2_26;

	@OriginalMember(owner = "client!nq", name = "y", descriptor = "Lclient!oc;")
	private final Class19_Sub4_Sub1 aClass19_Sub4_Sub1_3;

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!rl;IIII)V")
	public Class87_Sub2(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		this.aClass66_Sub2_26 = arg0;
		this.aClass19_Sub4_Sub1_3 = Static137.method2413(arg4, arg2, arg3, arg0, arg1);
	}

	@OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lclient!rl;II[III)V")
	public Class87_Sub2(@OriginalArg(0) Class66_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass66_Sub2_26 = arg0;
		this.aClass19_Sub4_Sub1_3 = Static331.method4829(arg2, arg3, arg1, arg0);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIII)V")
	@Override
	public void method6556(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt4897 = arg0;
		this.anInt4883 = arg2;
		this.anInt4895 = arg1;
		this.anInt4892 = arg3;
		this.aBoolean304 = this.anInt4897 != 0 || this.anInt4895 != 0 || this.anInt4883 != 0 || this.anInt4892 != 0;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "()I")
	@Override
	public int method6554() {
		return this.aClass19_Sub4_Sub1_3.anInt5086;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method6560(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass19_Sub4_Sub1_3.method4238(false);
		this.aClass66_Sub2_26.method5151();
		this.aClass66_Sub2_26.method5078(1);
		OpenGL.glColor4ub((byte) (arg3 >> 16), (byte) (arg3 >> 8), (byte) arg3, (byte) (arg3 >> 24));
		@Pc(37) int local37 = arg1 + this.anInt4895;
		@Pc(42) int local42 = arg0 + this.anInt4897;
		if (this.aClass19_Sub4_Sub1_2 == null) {
			this.aClass66_Sub2_26.method5109(this.aClass19_Sub4_Sub1_3);
			this.aClass66_Sub2_26.method5140(arg2);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass19_Sub4_Sub1_3.aFloat55);
			OpenGL.glVertex2i(local42, local37);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(local42, local37 + this.aClass19_Sub4_Sub1_3.anInt5086);
			OpenGL.glTexCoord2f(this.aClass19_Sub4_Sub1_3.aFloat54, 0.0F);
			OpenGL.glVertex2i(this.aClass19_Sub4_Sub1_3.anInt5085 + local42, this.aClass19_Sub4_Sub1_3.anInt5086 + local37);
			OpenGL.glTexCoord2f(this.aClass19_Sub4_Sub1_3.aFloat54, this.aClass19_Sub4_Sub1_3.aFloat55);
			OpenGL.glVertex2i(this.aClass19_Sub4_Sub1_3.anInt5085 + local42, local37);
			OpenGL.glEnd();
			return;
		}
		this.method4130(arg2);
		this.aClass19_Sub4_Sub1_2.method4238(false);
		OpenGL.glBegin(7);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass19_Sub4_Sub1_3.aFloat55);
		OpenGL.glTexCoord2f(0.0F, this.aClass19_Sub4_Sub1_3.aFloat55);
		OpenGL.glVertex2i(local42, local37);
		OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(local42, this.aClass19_Sub4_Sub1_3.anInt5086 + local37);
		OpenGL.glMultiTexCoord2f(33985, this.aClass19_Sub4_Sub1_3.aFloat54, 0.0F);
		OpenGL.glTexCoord2f(this.aClass19_Sub4_Sub1_3.aFloat54, 0.0F);
		OpenGL.glVertex2i(local42 + this.aClass19_Sub4_Sub1_3.anInt5085, local37 - -this.aClass19_Sub4_Sub1_3.anInt5086);
		OpenGL.glMultiTexCoord2f(33985, this.aClass19_Sub4_Sub1_3.aFloat54, this.aClass19_Sub4_Sub1_3.aFloat55);
		OpenGL.glTexCoord2f(this.aClass19_Sub4_Sub1_3.aFloat54, this.aClass19_Sub4_Sub1_3.aFloat55);
		OpenGL.glVertex2i(local42 + this.aClass19_Sub4_Sub1_3.anInt5085, local37);
		OpenGL.glEnd();
		this.method4129();
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)V")
	@Override
	public void method6563(@OriginalArg(2) int arg0) {
		OpenGL.glPixelTransferf(3348, 0.5F);
		OpenGL.glPixelTransferf(3349, 0.499F);
		OpenGL.glPixelTransferf(3352, 0.5F);
		OpenGL.glPixelTransferf(3353, 0.499F);
		OpenGL.glPixelTransferf(3354, 0.5F);
		OpenGL.glPixelTransferf(3355, 0.499F);
		this.aClass19_Sub4_Sub1_2 = Static137.method2413(this.aClass19_Sub4_Sub1_3.anInt5086, 0, this.aClass19_Sub4_Sub1_3.anInt5085, this.aClass66_Sub2_26, 0);
		this.anInt4885 = arg0;
		OpenGL.glPixelTransferf(3348, 1.0F);
		OpenGL.glPixelTransferf(3349, 0.0F);
		OpenGL.glPixelTransferf(3352, 1.0F);
		OpenGL.glPixelTransferf(3353, 0.0F);
		OpenGL.glPixelTransferf(3354, 1.0F);
		OpenGL.glPixelTransferf(3355, 0.0F);
	}

	@OriginalMember(owner = "client!nq", name = "c", descriptor = "()I")
	@Override
	public int method6561() {
		return this.anInt4892 + this.anInt4895 + this.aClass19_Sub4_Sub1_3.anInt5086;
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "()I")
	@Override
	public int method6555() {
		return this.aClass19_Sub4_Sub1_3.anInt5085;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(FFFFFFLclient!fs;II)V")
	@Override
	protected void method6558(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) Class22 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		@Pc(7) Class19_Sub4_Sub1 local7 = ((Class22_Sub1) arg6).aClass19_Sub4_Sub1_1;
		@Pc(14) float local14;
		@Pc(18) float local18;
		@Pc(25) float local25;
		@Pc(31) float local31;
		if (this.aBoolean304) {
			local14 = this.method6565();
			local18 = this.method6561();
			local25 = (arg2 - arg0) / local14;
			local31 = (arg3 - arg1) / local14;
			@Pc(37) float local37 = (arg4 - arg0) / local18;
			@Pc(43) float local43 = (arg5 - arg1) / local18;
			@Pc(49) float local49 = local37 * (float) this.anInt4895;
			@Pc(55) float local55 = local43 * (float) this.anInt4895;
			@Pc(61) float local61 = (float) this.anInt4897 * local25;
			@Pc(67) float local67 = (float) this.anInt4897 * local31;
			@Pc(74) float local74 = (float) this.anInt4883 * -local25;
			@Pc(81) float local81 = (float) this.anInt4883 * -local31;
			@Pc(88) float local88 = (float) this.anInt4892 * -local37;
			arg1 = local55 + arg1 + local67;
			arg4 = local88 + arg4 + local61;
			arg3 = local55 + local81 + arg3;
			arg0 = local49 + local61 + arg0;
			arg2 = local49 + local74 + arg2;
			@Pc(125) float local125 = -local43 * (float) this.anInt4892;
			arg5 = local125 + local67 + arg5;
		}
		local14 = arg4 + arg2 - arg0;
		this.aClass19_Sub4_Sub1_3.method4238(true);
		local18 = arg3 + arg5 - arg1;
		this.aClass66_Sub2_26.method5151();
		this.aClass66_Sub2_26.method5109(this.aClass19_Sub4_Sub1_3);
		this.aClass66_Sub2_26.method5140(1);
		this.aClass66_Sub2_26.method5075(1);
		this.aClass66_Sub2_26.method5109(local7);
		this.aClass66_Sub2_26.method5145(8448, 7681);
		this.aClass66_Sub2_26.method5081(0, 34168, 768);
		this.aClass66_Sub2_26.method5078(1);
		local25 = local7.aFloat54 / (float) local7.anInt5085;
		local31 = local7.aFloat55 / (float) local7.anInt5086;
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass19_Sub4_Sub1_3.aFloat55);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg0), local7.aFloat55 - ((float) -arg8 + arg1) * local31);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg4), local7.aFloat55 - (arg5 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glMultiTexCoord2f(33984, this.aClass19_Sub4_Sub1_3.aFloat54, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, ((float) -arg7 + local14) * local25, local7.aFloat55 - local31 * (local18 - (float) arg8));
		OpenGL.glVertex2f(local14, local18);
		OpenGL.glMultiTexCoord2f(33984, this.aClass19_Sub4_Sub1_3.aFloat54, this.aClass19_Sub4_Sub1_3.aFloat55);
		OpenGL.glMultiTexCoord2f(33985, local25 * ((float) -arg7 + arg2), local7.aFloat55 - (arg3 - (float) arg8) * local31);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
		this.aClass66_Sub2_26.method5081(0, 5890, 768);
		this.aClass66_Sub2_26.method5140(0);
		this.aClass66_Sub2_26.method5109(null);
		this.aClass66_Sub2_26.method5075(0);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IILclient!fs;II)V")
	@Override
	public void method6562(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class22 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class22_Sub1 local6 = (Class22_Sub1) arg2;
		@Pc(9) Class19_Sub4_Sub1 local9 = local6.aClass19_Sub4_Sub1_1;
		this.aClass19_Sub4_Sub1_3.method4238(false);
		this.aClass66_Sub2_26.method5151();
		this.aClass66_Sub2_26.method5109(this.aClass19_Sub4_Sub1_3);
		this.aClass66_Sub2_26.method5140(1);
		this.aClass66_Sub2_26.method5075(1);
		this.aClass66_Sub2_26.method5109(local9);
		this.aClass66_Sub2_26.method5145(8448, 7681);
		this.aClass66_Sub2_26.method5081(0, 34168, 768);
		this.aClass66_Sub2_26.method5078(1);
		@Pc(62) int local62 = arg0 + this.anInt4897;
		@Pc(67) int local67 = arg1 + this.anInt4895;
		@Pc(73) int local73 = this.aClass19_Sub4_Sub1_3.anInt5085 + local62;
		@Pc(79) int local79 = this.aClass19_Sub4_Sub1_3.anInt5086 + local67;
		@Pc(86) float local86 = local9.aFloat54 / (float) local9.anInt5085;
		@Pc(93) float local93 = local9.aFloat55 / (float) local9.anInt5086;
		@Pc(101) float local101 = (float) (local62 - arg3) * local86;
		@Pc(109) float local109 = (float) (local73 - arg3) * local86;
		@Pc(120) float local120 = local9.aFloat55 - local93 * (float) (local67 - arg4);
		@Pc(130) float local130 = local9.aFloat55 - local93 * (float) (local79 - arg4);
		OpenGL.glBegin(7);
		OpenGL.glColor3f(1.0F, 1.0F, 1.0F);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, this.aClass19_Sub4_Sub1_3.aFloat55);
		OpenGL.glMultiTexCoord2f(33985, local101, local120);
		OpenGL.glVertex2i(local62, local67);
		OpenGL.glMultiTexCoord2f(33984, 0.0F, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local101, local130);
		OpenGL.glVertex2i(local62, local67 + this.aClass19_Sub4_Sub1_3.anInt5086);
		OpenGL.glMultiTexCoord2f(33984, this.aClass19_Sub4_Sub1_3.aFloat54, 0.0F);
		OpenGL.glMultiTexCoord2f(33985, local109, local130);
		OpenGL.glVertex2i(local62 + this.aClass19_Sub4_Sub1_3.anInt5085, this.aClass19_Sub4_Sub1_3.anInt5086 + local67);
		OpenGL.glMultiTexCoord2f(33984, this.aClass19_Sub4_Sub1_3.aFloat54, this.aClass19_Sub4_Sub1_3.aFloat55);
		OpenGL.glMultiTexCoord2f(33985, local109, local120);
		OpenGL.glVertex2i(this.aClass19_Sub4_Sub1_3.anInt5085 + local62, local67);
		OpenGL.glEnd();
		this.aClass66_Sub2_26.method5081(0, 5890, 768);
		this.aClass66_Sub2_26.method5140(0);
		this.aClass66_Sub2_26.method5109(null);
		this.aClass66_Sub2_26.method5075(0);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method6571(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		this.aClass19_Sub4_Sub1_3.method4238(true);
		this.aClass66_Sub2_26.method5151();
		this.aClass66_Sub2_26.method5078(arg6);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aBoolean304) {
			@Pc(184) float local184 = (float) arg2 / (float) this.method6565();
			@Pc(191) float local191 = (float) arg3 / (float) this.method6561();
			@Pc(200) float local200 = (float) arg0 + local184 * (float) this.anInt4897;
			@Pc(209) float local209 = (float) arg1 + (float) this.anInt4895 * local191;
			@Pc(218) float local218 = (float) this.aClass19_Sub4_Sub1_3.anInt5085 * local184 + local200;
			@Pc(227) float local227 = local209 + (float) this.aClass19_Sub4_Sub1_3.anInt5086 * local191;
			if (this.aClass19_Sub4_Sub1_2 == null) {
				this.aClass66_Sub2_26.method5109(this.aClass19_Sub4_Sub1_3);
				this.aClass66_Sub2_26.method5140(arg4);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord2f(0.0F, this.aClass19_Sub4_Sub1_3.aFloat55);
				OpenGL.glVertex2f(local200, local209);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local200, local227);
				OpenGL.glTexCoord2f(this.aClass19_Sub4_Sub1_3.aFloat54, 0.0F);
				OpenGL.glVertex2f(local218, local227);
				OpenGL.glTexCoord2f(this.aClass19_Sub4_Sub1_3.aFloat54, this.aClass19_Sub4_Sub1_3.aFloat55);
				OpenGL.glVertex2f(local218, local209);
				OpenGL.glEnd();
			} else {
				this.method4130(arg4);
				this.aClass19_Sub4_Sub1_2.method4238(true);
				OpenGL.glBegin(7);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass19_Sub4_Sub1_3.aFloat55);
				OpenGL.glTexCoord2f(0.0F, this.aClass19_Sub4_Sub1_3.aFloat55);
				OpenGL.glVertex2f(local200, local209);
				OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2f(local200, local227);
				OpenGL.glMultiTexCoord2f(33985, this.aClass19_Sub4_Sub1_3.aFloat54, 0.0F);
				OpenGL.glTexCoord2f(this.aClass19_Sub4_Sub1_3.aFloat54, 0.0F);
				OpenGL.glVertex2f(local218, local227);
				OpenGL.glMultiTexCoord2f(33985, this.aClass19_Sub4_Sub1_3.aFloat54, this.aClass19_Sub4_Sub1_3.aFloat55);
				OpenGL.glTexCoord2f(this.aClass19_Sub4_Sub1_3.aFloat54, this.aClass19_Sub4_Sub1_3.aFloat55);
				OpenGL.glVertex2f(local218, local209);
				OpenGL.glEnd();
				this.method4129();
			}
		} else if (this.aClass19_Sub4_Sub1_2 == null) {
			this.aClass66_Sub2_26.method5109(this.aClass19_Sub4_Sub1_3);
			this.aClass66_Sub2_26.method5140(arg4);
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, this.aClass19_Sub4_Sub1_3.aFloat55);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg1 + arg3);
			OpenGL.glTexCoord2f(this.aClass19_Sub4_Sub1_3.aFloat54, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 - -arg3);
			OpenGL.glTexCoord2f(this.aClass19_Sub4_Sub1_3.aFloat54, this.aClass19_Sub4_Sub1_3.aFloat55);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
		} else {
			this.method4130(arg4);
			this.aClass19_Sub4_Sub1_2.method4238(true);
			OpenGL.glBegin(7);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, this.aClass19_Sub4_Sub1_3.aFloat55);
			OpenGL.glTexCoord2f(0.0F, this.aClass19_Sub4_Sub1_3.aFloat55);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glMultiTexCoord2f(33985, 0.0F, 0.0F);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, arg3 + arg1);
			OpenGL.glMultiTexCoord2f(33985, this.aClass19_Sub4_Sub1_3.aFloat54, 0.0F);
			OpenGL.glTexCoord2f(this.aClass19_Sub4_Sub1_3.aFloat54, 0.0F);
			OpenGL.glVertex2i(arg0 + arg2, arg1 + arg3);
			OpenGL.glMultiTexCoord2f(33985, this.aClass19_Sub4_Sub1_3.aFloat54, this.aClass19_Sub4_Sub1_3.aFloat55);
			OpenGL.glTexCoord2f(this.aClass19_Sub4_Sub1_3.aFloat54, this.aClass19_Sub4_Sub1_3.aFloat55);
			OpenGL.glVertex2i(arg2 + arg0, arg1);
			OpenGL.glEnd();
			this.method4129();
		}
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(FFFFFFIII)V")
	@Override
	protected void method6553(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(6) float local6;
		@Pc(10) float local10;
		if (this.aBoolean304) {
			local6 = this.method6565();
			local10 = this.method6561();
			@Pc(16) float local16 = (arg2 - arg0) / local6;
			@Pc(22) float local22 = (arg3 - arg1) / local6;
			@Pc(29) float local29 = (arg4 - arg0) / local10;
			@Pc(36) float local36 = (arg5 - arg1) / local10;
			@Pc(42) float local42 = local29 * (float) this.anInt4895;
			@Pc(48) float local48 = local36 * (float) this.anInt4895;
			@Pc(54) float local54 = (float) this.anInt4897 * local16;
			@Pc(60) float local60 = local22 * (float) this.anInt4897;
			@Pc(67) float local67 = -local16 * (float) this.anInt4883;
			@Pc(74) float local74 = -local22 * (float) this.anInt4883;
			@Pc(81) float local81 = -local29 * (float) this.anInt4892;
			arg3 = local48 + arg3 + local74;
			arg4 = local81 + local54 + arg4;
			arg2 = arg2 + local67 + local42;
			arg1 = arg1 + local60 + local48;
			arg0 = local42 + arg0 + local54;
			@Pc(118) float local118 = -local36 * (float) this.anInt4892;
			arg5 = local118 + local60 + arg5;
		}
		local6 = arg2 + arg4 - arg0;
		this.aClass19_Sub4_Sub1_3.method4238(true);
		local10 = arg5 + arg3 - arg1;
		this.aClass66_Sub2_26.method5151();
		this.aClass66_Sub2_26.method5109(this.aClass19_Sub4_Sub1_3);
		this.aClass66_Sub2_26.method5078(1);
		this.aClass66_Sub2_26.method5140(arg6);
		OpenGL.glColor4ub((byte) (arg7 >> 16), (byte) (arg7 >> 8), (byte) arg7, (byte) (arg7 >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(0.0F, this.aClass19_Sub4_Sub1_3.aFloat55);
		OpenGL.glVertex2f(arg0, arg1);
		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2f(arg4, arg5);
		OpenGL.glTexCoord2f(this.aClass19_Sub4_Sub1_3.aFloat54, 0.0F);
		OpenGL.glVertex2f(local6, local10);
		OpenGL.glTexCoord2f(this.aClass19_Sub4_Sub1_3.aFloat54, this.aClass19_Sub4_Sub1_3.aFloat55);
		OpenGL.glVertex2f(arg2, arg3);
		OpenGL.glEnd();
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(IIIIIII)V")
	@Override
	public void method6573(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(10) int local10 = arg0 + arg2;
		this.aClass19_Sub4_Sub1_3.method4238(false);
		@Pc(20) int local20 = arg1 + arg3;
		this.aClass66_Sub2_26.method5151();
		this.aClass66_Sub2_26.method5109(this.aClass19_Sub4_Sub1_3);
		this.aClass66_Sub2_26.method5078(1);
		this.aClass66_Sub2_26.method5140(arg4);
		OpenGL.glColor4ub((byte) (arg5 >> 16), (byte) (arg5 >> 8), (byte) arg5, (byte) (arg5 >> 24));
		if (this.aClass19_Sub4_Sub1_3.aBoolean313 && !this.aBoolean304) {
			@Pc(74) float local74 = this.aClass19_Sub4_Sub1_3.aFloat55 * (float) arg3 / (float) this.aClass19_Sub4_Sub1_3.anInt5086;
			@Pc(86) float local86 = this.aClass19_Sub4_Sub1_3.aFloat54 * (float) arg2 / (float) this.aClass19_Sub4_Sub1_3.anInt5085;
			OpenGL.glBegin(7);
			OpenGL.glTexCoord2f(0.0F, local74);
			OpenGL.glVertex2i(arg0, arg1);
			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(arg0, local20);
			OpenGL.glTexCoord2f(local86, 0.0F);
			OpenGL.glVertex2i(local10, local20);
			OpenGL.glTexCoord2f(local86, local74);
			OpenGL.glVertex2i(local10, arg1);
			OpenGL.glEnd();
			return;
		}
		OpenGL.glPushMatrix();
		OpenGL.glTranslatef((float) this.anInt4897, (float) this.anInt4895, 0.0F);
		@Pc(126) int local126 = this.method6565();
		@Pc(129) int local129 = this.method6561();
		@Pc(135) int local135 = this.aClass19_Sub4_Sub1_3.anInt5086 + arg1;
		OpenGL.glBegin(7);
		@Pc(139) int local139 = arg1;
		@Pc(147) int local147;
		while (local20 >= local135) {
			local147 = this.aClass19_Sub4_Sub1_3.anInt5085 + arg0;
			@Pc(149) int local149 = arg0;
			while (local147 <= local10) {
				OpenGL.glTexCoord2f(0.0F, this.aClass19_Sub4_Sub1_3.aFloat55);
				OpenGL.glVertex2i(local149, local139);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local149, local135);
				OpenGL.glTexCoord2f(this.aClass19_Sub4_Sub1_3.aFloat54, 0.0F);
				OpenGL.glVertex2i(local147, local135);
				OpenGL.glTexCoord2f(this.aClass19_Sub4_Sub1_3.aFloat54, this.aClass19_Sub4_Sub1_3.aFloat55);
				OpenGL.glVertex2i(local147, local139);
				local149 += local126;
				local147 += local126;
			}
			if (local149 < local10) {
				@Pc(216) float local216 = this.aClass19_Sub4_Sub1_3.aFloat54 * (float) (local10 - local149) / (float) this.aClass19_Sub4_Sub1_3.anInt5085;
				OpenGL.glTexCoord2f(0.0F, this.aClass19_Sub4_Sub1_3.aFloat55);
				OpenGL.glVertex2i(local149, local139);
				OpenGL.glTexCoord2f(0.0F, 0.0F);
				OpenGL.glVertex2i(local149, local135);
				OpenGL.glTexCoord2f(local216, 0.0F);
				OpenGL.glVertex2i(local10, local135);
				OpenGL.glTexCoord2f(local216, this.aClass19_Sub4_Sub1_3.aFloat55);
				OpenGL.glVertex2i(local10, local139);
			}
			local135 += local129;
			local139 += local129;
		}
		if (local20 > local139) {
			@Pc(277) float local277 = (float) (local139 + this.aClass19_Sub4_Sub1_3.anInt5086 - local20) * this.aClass19_Sub4_Sub1_3.aFloat55 / (float) this.aClass19_Sub4_Sub1_3.anInt5086;
			@Pc(283) int local283 = arg0 + this.aClass19_Sub4_Sub1_3.anInt5085;
			local147 = arg0;
			while (local10 >= local283) {
				OpenGL.glTexCoord2f(0.0F, this.aClass19_Sub4_Sub1_3.aFloat55);
				OpenGL.glVertex2i(local147, local139);
				OpenGL.glTexCoord2f(0.0F, local277);
				OpenGL.glVertex2i(local147, local20);
				OpenGL.glTexCoord2f(this.aClass19_Sub4_Sub1_3.aFloat54, local277);
				OpenGL.glVertex2i(local283, local20);
				OpenGL.glTexCoord2f(this.aClass19_Sub4_Sub1_3.aFloat54, this.aClass19_Sub4_Sub1_3.aFloat55);
				OpenGL.glVertex2i(local283, local139);
				local147 += local126;
				local283 += local126;
			}
			if (local10 > local147) {
				@Pc(351) float local351 = this.aClass19_Sub4_Sub1_3.aFloat54 * (float) (local10 - local147) / (float) this.aClass19_Sub4_Sub1_3.anInt5085;
				OpenGL.glTexCoord2f(0.0F, this.aClass19_Sub4_Sub1_3.aFloat55);
				OpenGL.glVertex2i(local147, local139);
				OpenGL.glTexCoord2f(0.0F, local277);
				OpenGL.glVertex2i(local147, local20);
				OpenGL.glTexCoord2f(local351, local277);
				OpenGL.glVertex2i(local10, local20);
				OpenGL.glTexCoord2f(local351, this.aClass19_Sub4_Sub1_3.aFloat55);
				OpenGL.glVertex2i(local10, local139);
			}
		}
		OpenGL.glEnd();
		OpenGL.glPopMatrix();
	}

	@OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)V")
	private void method4129() {
		this.aClass66_Sub2_26.method5075(1);
		this.aClass66_Sub2_26.method5109(null);
		this.aClass66_Sub2_26.method5145(8448, 8448);
		this.aClass66_Sub2_26.method5081(1, 34168, 768);
		this.aClass66_Sub2_26.method5102(0, 5890);
		this.aClass66_Sub2_26.method5075(0);
		this.aClass66_Sub2_26.method5081(1, 34168, 768);
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method6566(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.aClass19_Sub4_Sub1_3.method4254(arg0, arg3, arg2, arg1);
	}

	@OriginalMember(owner = "client!nq", name = "d", descriptor = "()I")
	@Override
	public int method6565() {
		return this.anInt4883 + this.aClass19_Sub4_Sub1_3.anInt5085 + this.anInt4897;
	}

	@OriginalMember(owner = "client!nq", name = "a", descriptor = "(BI)V")
	private void method4130(@OriginalArg(1) int arg0) {
		this.aClass66_Sub2_26.method5075(1);
		this.aClass66_Sub2_26.method5109(this.aClass19_Sub4_Sub1_3);
		this.aClass66_Sub2_26.method5145(7681, this.aClass66_Sub2_26.method5148(arg0));
		this.aClass66_Sub2_26.method5081(1, 34167, 768);
		this.aClass66_Sub2_26.method5102(0, 34168);
		this.aClass66_Sub2_26.method5075(0);
		this.aClass66_Sub2_26.method5109(this.aClass19_Sub4_Sub1_2);
		this.aClass66_Sub2_26.method5145(7681, 34479);
		this.aClass66_Sub2_26.method5081(1, 34166, 768);
		if (this.anInt4885 == 0) {
			this.aClass66_Sub2_26.method5079(0.5F, 0.5F, 0.0F, 1.0F);
		} else if (this.anInt4885 == 1) {
			this.aClass66_Sub2_26.method5079(0.5F, 1.0F, 0.0F, 0.5F);
		} else if (this.anInt4885 == 2) {
			this.aClass66_Sub2_26.method5079(1.0F, 0.5F, 0.0F, 0.5F);
		} else if (this.anInt4885 == 3) {
			this.aClass66_Sub2_26.method5079(128.5F, 128.5F, 0.0F, 128.5F);
			return;
		}
	}
}
