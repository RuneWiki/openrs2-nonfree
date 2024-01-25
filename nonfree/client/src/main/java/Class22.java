import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class22 {

	@OriginalMember(owner = "client!at", name = "h", descriptor = "[I")
	public static final int[] anIntArray31 = new int[120];

	@OriginalMember(owner = "client!at", name = "v", descriptor = "[[Lclient!iia;")
	private Class167[][] aClass167ArrayArray1;

	@OriginalMember(owner = "client!at", name = "l", descriptor = "Lclient!kv;")
	private final Class143_Sub2 aClass143_Sub2_3;

	@OriginalMember(owner = "client!at", name = "i", descriptor = "Lclient!wr;")
	private final Class88_Sub3 aClass88_Sub3_1;

	@OriginalMember(owner = "client!at", name = "y", descriptor = "I")
	public final int anInt390;

	@OriginalMember(owner = "client!at", name = "j", descriptor = "I")
	private final int anInt379;

	@OriginalMember(owner = "client!at", name = "q", descriptor = "[B")
	public final byte[] aByteArray3;

	@OriginalMember(owner = "client!at", name = "d", descriptor = "I")
	private final int anInt375;

	@OriginalMember(owner = "client!at", name = "k", descriptor = "I")
	private final int anInt380;

	@OriginalMember(owner = "client!at", name = "n", descriptor = "I")
	private final int anInt382;

	static {
		@Pc(6) int local6 = 0;
		for (@Pc(8) int local8 = 0; local8 < 120; local8++) {
			@Pc(13) int local13 = local8 + 1;
			@Pc(26) int local26 = (int) ((double) local13 + Math.pow(2.0D, (double) local13 / 7.0D) * 300.0D);
			local6 += local26;
			anIntArray31[local8] = local6 / 4;
		}
	}

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "(Lclient!kv;Lclient!wr;)V")
	public Class22(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) Class88_Sub3 arg1) {
		this.aClass143_Sub2_3 = arg0;
		this.aClass88_Sub3_1 = arg1;
		this.anInt390 = (this.aClass88_Sub3_1.anInt10540 * this.aClass88_Sub3_1.anInt10541 >> this.aClass143_Sub2_3.anInt5821) + 2;
		this.anInt379 = (this.aClass88_Sub3_1.anInt10545 * this.aClass88_Sub3_1.anInt10540 >> this.aClass143_Sub2_3.anInt5821) + 2;
		this.aByteArray3 = new byte[this.anInt379 * this.anInt390];
		this.anInt375 = this.aClass143_Sub2_3.anInt5821 + 7 - this.aClass88_Sub3_1.anInt10547;
		this.anInt380 = this.aClass88_Sub3_1.anInt10541 >> this.anInt375;
		this.anInt382 = this.aClass88_Sub3_1.anInt10545 >> this.anInt375;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(B)V")
	public void method372() {
		this.aClass167ArrayArray1 = new Class167[this.anInt380][this.anInt382];
		for (@Pc(14) int local14 = 0; local14 < this.anInt382; local14++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt380; local18++) {
				this.aClass167ArrayArray1[local18][local14] = new Class167(this.aClass143_Sub2_3, this, this.aClass88_Sub3_1, local18, local14, this.anInt375, local18 * 128 + 1, local14 * 128 + 1);
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ILclient!r;II)Z")
	public boolean method373(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub2_Sub7 arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class5_Sub2_Sub7_Sub2 local16 = (Class5_Sub2_Sub7_Sub2) arg1;
		arg2 += local16.anInt6446 + 1;
		arg0 += local16.anInt6439 + 1;
		@Pc(37) int local37 = arg0 * this.anInt390 + arg2;
		@Pc(40) int local40 = local16.anInt6435;
		@Pc(43) int local43 = local16.anInt6437;
		@Pc(49) int local49;
		if (arg0 <= 0) {
			local49 = 1 - arg0;
			local40 -= local49;
			arg0 = 1;
			local37 += this.anInt390 * local49;
		}
		@Pc(68) int local68 = this.anInt390 - local43;
		if (local40 + arg0 >= this.anInt379) {
			local49 = local40 + arg0 + 1 - this.anInt379;
			local40 -= local49;
		}
		if (arg2 <= 0) {
			local49 = 1 - arg2;
			arg2 = 1;
			local37 += local49;
			local68 += local49;
			local43 -= local49;
		}
		if (arg2 + local43 >= this.anInt390) {
			local49 = local43 + arg2 + 1 - this.anInt390;
			local43 -= local49;
			local68 += local49;
		}
		if (local43 > 0 && local40 > 0) {
			local68 += this.anInt390 * 7;
			return Static572.method7826(this.aByteArray3, local68, local37, local40, local43);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIIII)V")
	private void method375(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.aClass167ArrayArray1 == null) {
			return;
		}
		@Pc(15) int local15 = arg0 - 1 >> 7;
		@Pc(23) int local23 = arg3 + arg0 - 2 >> 7;
		@Pc(29) int local29 = arg2 - 1 >> 7;
		@Pc(39) int local39 = arg2 + arg1 - 1 - 1 >> 7;
		for (@Pc(45) int local45 = local15; local45 <= local23; local45++) {
			@Pc(52) Class167[] local52 = this.aClass167ArrayArray1[local45];
			for (@Pc(54) int local54 = local29; local54 <= local39; local54++) {
				local52[local54].aBoolean277 = true;
			}
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(ZIIII[[Z)V")
	public void method379(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean[][] arg4) {
		this.aClass143_Sub2_3.method4993(false);
		this.aClass143_Sub2_3.method4931(false);
		this.aClass143_Sub2_3.method4978(-2);
		this.aClass143_Sub2_3.method4994(1);
		this.aClass143_Sub2_3.method4922(1);
		@Pc(39) float local39 = 1.0F / (float) (this.aClass143_Sub2_3.anInt5823 * 128);
		@Pc(43) int local43;
		@Pc(50) int local50;
		@Pc(57) int local57;
		@Pc(59) int local59;
		@Pc(63) int local63;
		@Pc(68) int local68;
		@Pc(75) int local75;
		if (arg0) {
			for (local43 = 0; local43 < this.anInt382; local43++) {
				local50 = local43 << this.anInt375;
				local57 = local43 + 1 << this.anInt375;
				label81: for (local59 = 0; local59 < this.anInt380; local59++) {
					local63 = local59 << this.anInt375;
					local68 = local59 + 1 << this.anInt375;
					for (local75 = local63; local75 < local68; local75++) {
						if (-arg2 <= local75 - arg3 && arg2 >= local75 - arg3) {
							for (@Pc(321) int local321 = local50; local321 < local57; local321++) {
								if (-arg2 <= local321 - arg1 && local321 - arg1 <= arg2 && arg4[local75 + arg2 - arg3][local321 + arg2 - arg1]) {
									OpenGL.glMatrixMode(5890);
									OpenGL.glLoadIdentity();
									OpenGL.glScalef(local39, local39, 1.0F);
									OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
									OpenGL.glMatrixMode(5888);
									this.aClass167ArrayArray1[local59][local43].method3518();
									continue label81;
								}
							}
						}
					}
				}
			}
		} else {
			for (local43 = 0; local43 < this.anInt382; local43++) {
				local50 = local43 << this.anInt375;
				local57 = local43 + 1 << this.anInt375;
				for (local59 = 0; local59 < this.anInt380; local59++) {
					local63 = 0;
					local68 = local59 << this.anInt375;
					local75 = local59 + 1 << this.anInt375;
					@Pc(79) Class5_Sub15_Sub1 local79 = this.aClass143_Sub2_3.aClass5_Sub15_Sub1_3;
					local79.anInt4144 = 0;
					for (@Pc(84) int local84 = local50; local84 < local57; local84++) {
						if (-arg2 <= local84 - arg1 && arg2 >= local84 - arg1) {
							@Pc(110) int local110 = this.aClass88_Sub3_1.anInt10541 * local84 + local68;
							for (@Pc(112) int local112 = local68; local112 < local75; local112++) {
								if (-arg2 <= local112 - arg3 && arg2 >= local112 - arg3 && arg4[local112 + arg2 - arg3][arg2 + local84 - arg1]) {
									@Pc(153) short[] local153 = this.aClass88_Sub3_1.aShortArrayArray18[local110];
									if (local153 != null) {
										@Pc(161) int local161;
										if (this.aClass143_Sub2_3.aBoolean408) {
											for (local161 = 0; local161 < local153.length; local161++) {
												local63++;
												local79.method3660(local153[local161] & 0xFFFF);
											}
										} else {
											for (local161 = 0; local161 < local153.length; local161++) {
												local79.method3668(local153[local161] & 0xFFFF);
												local63++;
											}
										}
									}
								}
								local110++;
							}
						}
					}
					if (local63 > 0) {
						OpenGL.glMatrixMode(5890);
						OpenGL.glLoadIdentity();
						OpenGL.glScalef(local39, local39, 1.0F);
						OpenGL.glTranslatef((float) -local59 / local39, (float) -local43 / local39, 1.0F);
						OpenGL.glMatrixMode(5888);
						this.aClass167ArrayArray1[local59][local43].method3521(local79.aByteArray45, local63);
					}
				}
			}
		}
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IIILclient!r;)V")
	public void method381(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5_Sub2_Sub7 arg2) {
		@Pc(16) Class5_Sub2_Sub7_Sub2 local16 = (Class5_Sub2_Sub7_Sub2) arg2;
		arg0 += local16.anInt6446 + 1;
		arg1 += local16.anInt6439 + 1;
		@Pc(37) int local37 = this.anInt390 * arg1 + arg0;
		@Pc(39) int local39 = 0;
		@Pc(42) int local42 = local16.anInt6435;
		@Pc(45) int local45 = local16.anInt6437;
		@Pc(50) int local50 = this.anInt390 - local45;
		@Pc(52) int local52 = 0;
		@Pc(61) int local61;
		if (arg1 <= 0) {
			local61 = 1 - arg1;
			local37 += this.anInt390 * local61;
			arg1 = 1;
			local39 = local61 * local45;
			local42 -= local61;
		}
		if (this.anInt379 <= arg1 + local42) {
			local61 = arg1 + local42 + 1 - this.anInt379;
			local42 -= local61;
		}
		if (arg0 <= 0) {
			local61 = 1 - arg0;
			local37 += local61;
			local39 += local61;
			local45 -= local61;
			arg0 = 1;
			local50 += local61;
			local52 = local61;
		}
		if (this.anInt390 <= local45 + arg0) {
			local61 = local45 + arg0 + 1 - this.anInt390;
			local45 -= local61;
			local52 += local61;
			local50 += local61;
		}
		if (local45 > 0 && local42 > 0) {
			Static261.method3622(local45, local52, local50, local39, local42, local37, this.aByteArray3, local16.aByteArray61);
			this.method375(arg0, local42, arg1, local45);
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(IILclient!r;I)V")
	public void method382(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub2_Sub7 arg2) {
		@Pc(6) Class5_Sub2_Sub7_Sub2 local6 = (Class5_Sub2_Sub7_Sub2) arg2;
		arg1 += local6.anInt6439 + 1;
		arg0 += local6.anInt6446 + 1;
		@Pc(28) int local28 = arg0 + this.anInt390 * arg1;
		@Pc(30) int local30 = 0;
		@Pc(33) int local33 = local6.anInt6435;
		@Pc(36) int local36 = local6.anInt6437;
		@Pc(42) int local42 = this.anInt390 - local36;
		@Pc(61) int local61;
		if (arg1 <= 0) {
			local61 = 1 - arg1;
			arg1 = 1;
			local33 -= local61;
			local28 += this.anInt390 * local61;
			local30 = local36 * local61;
		}
		@Pc(82) int local82 = 0;
		if (local33 + arg1 >= this.anInt379) {
			local61 = local33 + arg1 + 1 - this.anInt379;
			local33 -= local61;
		}
		if (arg0 <= 0) {
			local61 = 1 - arg0;
			local42 += local61;
			local28 += local61;
			local36 -= local61;
			arg0 = 1;
			local82 = local61;
			local30 += local61;
		}
		if (this.anInt390 <= local36 + arg0) {
			local61 = arg0 + local36 + 1 - this.anInt390;
			local36 -= local61;
			local82 += local61;
			local42 += local61;
		}
		if (local36 > 0 && local33 > 0) {
			Static394.method5727(local6.aByteArray61, local28, local42, this.aByteArray3, local82, local33, local30, local36);
			this.method375(arg0, local33, arg1, local36);
		}
	}
}
