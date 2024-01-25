import jaggl.opengl;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hr")
public final class Class98 {

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "[[Lclient!cr;")
	private Class44[][] aClass44ArrayArray1;

	@OriginalMember(owner = "client!hr", name = "f", descriptor = "Lclient!tb;")
	private final Class129_Sub2 aClass129_Sub2_15;

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "Lclient!fq;")
	private final Class77_Sub1 aClass77_Sub1_2;

	@OriginalMember(owner = "client!hr", name = "e", descriptor = "I")
	public final int anInt2252;

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "I")
	private final int anInt2249;

	@OriginalMember(owner = "client!hr", name = "d", descriptor = "I")
	private final int anInt2251;

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "[B")
	public final byte[] aByteArray32;

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "I")
	private final int anInt2250;

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "I")
	private final int anInt2253;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!tb;Lclient!fq;)V")
	public Class98(@OriginalArg(0) Class129_Sub2 arg0, @OriginalArg(1) Class77_Sub1 arg1) {
		this.aClass129_Sub2_15 = arg0;
		this.aClass77_Sub1_2 = arg1;
		this.anInt2252 = (this.aClass77_Sub1_2.anInt4673 * this.aClass77_Sub1_2.anInt1677 >> this.aClass129_Sub2_15.anInt5884) + 2;
		this.anInt2249 = (this.aClass77_Sub1_2.anInt4672 * this.aClass77_Sub1_2.anInt1677 >> this.aClass129_Sub2_15.anInt5884) + 2;
		this.anInt2251 = this.aClass129_Sub2_15.anInt5884 + 7 - this.aClass77_Sub1_2.anInt1681;
		this.aByteArray32 = new byte[this.anInt2252 * this.anInt2249];
		this.anInt2250 = this.aClass77_Sub1_2.anInt4673 >> this.anInt2251;
		this.anInt2253 = this.aClass77_Sub1_2.anInt4672 >> this.anInt2251;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIZI[[ZI)V")
	public void method1872(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[][] arg4) {
		@Pc(16) opengl local16 = this.aClass129_Sub2_15.anOpengl2;
		this.aClass129_Sub2_15.method5088();
		this.aClass129_Sub2_15.method5069(false);
		this.aClass129_Sub2_15.method5044(false);
		this.aClass129_Sub2_15.method5041();
		this.aClass129_Sub2_15.method5094(0);
		this.aClass129_Sub2_15.method5035(1);
		@Pc(48) float local48 = 1.0F / (float) (this.aClass129_Sub2_15.anInt5883 * 128);
		@Pc(52) int local52;
		@Pc(65) int local65;
		@Pc(72) int local72;
		@Pc(74) int local74;
		@Pc(80) int local80;
		@Pc(85) int local85;
		@Pc(92) int local92;
		if (arg2) {
			for (local52 = 0; local52 < this.anInt2253; local52++) {
				local65 = local52 << this.anInt2251;
				local72 = local52 + 1 << this.anInt2251;
				label83: for (local74 = 0; local74 < this.anInt2250; local74++) {
					local80 = local74 << this.anInt2251;
					local85 = local74 + 1 << this.anInt2251;
					for (local92 = local80; local92 < local85; local92++) {
						if (-arg3 <= local92 - arg0 && arg3 >= local92 - arg0) {
							for (@Pc(340) int local340 = local65; local340 < local72; local340++) {
								if (-arg3 <= local340 - arg1 && local340 - arg1 <= arg3 && arg4[arg3 + local92 - arg0][local340 + arg3 - arg1]) {
									local16.glMatrixMode(5890);
									local16.glLoadIdentity();
									local16.glScalef(local48, local48, 1.0F);
									local16.glTranslatef((float) -local74 / local48, (float) -local52 / local48, 1.0F);
									local16.glMatrixMode(5888);
									this.aClass44ArrayArray1[local74][local52].method685();
									continue label83;
								}
							}
						}
					}
				}
			}
		} else {
			for (local52 = 0; local52 < this.anInt2253; local52++) {
				local65 = local52 << this.anInt2251;
				local72 = local52 + 1 << this.anInt2251;
				for (local74 = 0; local74 < this.anInt2250; local74++) {
					local80 = 0;
					local85 = local74 << this.anInt2251;
					local92 = local74 + 1 << this.anInt2251;
					@Pc(94) Class11_Sub25 local94 = Static94.aClass11_Sub25_2;
					local94.anInt6076 = 0;
					for (@Pc(99) int local99 = local65; local99 < local72; local99++) {
						if (-arg3 <= local99 - arg1 && arg3 >= local99 - arg1) {
							@Pc(126) int local126 = this.aClass77_Sub1_2.anInt4673 * local99 + local85;
							for (@Pc(128) int local128 = local85; local128 < local92; local128++) {
								if (-arg3 <= local128 - arg0 && local128 - arg0 <= arg3 && arg4[arg3 + local128 - arg0][arg3 + local99 - arg1]) {
									@Pc(170) short[] local170 = this.aClass77_Sub1_2.aShortArrayArray2[local126];
									if (local170 != null) {
										@Pc(178) int local178;
										if (this.aClass129_Sub2_15.aBoolean377) {
											for (local178 = 0; local178 < local170.length; local178++) {
												local94.method5204(local170[local178] & 0xFFFF);
												local80++;
											}
										} else {
											for (local178 = 0; local178 < local170.length; local178++) {
												local80++;
												local94.method5223(local170[local178] & 0xFFFF);
											}
										}
									}
								}
								local126++;
							}
						}
					}
					if (local80 > 0) {
						local16.glMatrixMode(5890);
						local16.glLoadIdentity();
						local16.glScalef(local48, local48, 1.0F);
						local16.glTranslatef((float) -local74 / local48, (float) -local52 / local48, 1.0F);
						local16.glMatrixMode(5888);
						this.aClass44ArrayArray1[local74][local52].method683(local80, local94.aByteArray93);
					}
				}
			}
		}
		local16.glMatrixMode(5890);
		local16.glLoadIdentity();
		local16.glMatrixMode(5888);
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(I)V")
	public void method1874() {
		this.aClass44ArrayArray1 = new Class44[this.anInt2250][this.anInt2253];
		for (@Pc(12) int local12 = 0; local12 < this.anInt2253; local12++) {
			for (@Pc(18) int local18 = 0; local18 < this.anInt2250; local18++) {
				this.aClass44ArrayArray1[local18][local12] = new Class44(this.aClass129_Sub2_15, this, this.aClass77_Sub1_2, local18, local12, this.anInt2251, local18 * 128 + 1, local12 * 128 - -1);
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IILclient!mc;B)Z")
	public boolean method1875(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class11_Sub4_Sub4 arg2) {
		@Pc(2) Class11_Sub4_Sub4_Sub1 local2 = (Class11_Sub4_Sub4_Sub1) arg2;
		arg0 += local2.anInt627 + 1;
		arg1 += local2.anInt626 + 1;
		@Pc(31) int local31 = arg1 * this.anInt2252 + arg0;
		@Pc(34) int local34 = local2.anInt629;
		@Pc(37) int local37 = local2.anInt628;
		@Pc(43) int local43 = this.anInt2252 - local37;
		@Pc(51) int local51;
		if (arg1 <= 0) {
			local51 = 1 - arg1;
			local31 += this.anInt2252 * local51;
			arg1 = 1;
			local34 -= local51;
		}
		if (this.anInt2249 <= local34 + arg1) {
			local51 = arg1 + local34 + 1 - this.anInt2249;
			local34 -= local51;
		}
		if (arg0 <= 0) {
			local51 = 1 - arg0;
			local31 += local51;
			local37 -= local51;
			local43 += local51;
			arg0 = 1;
		}
		if (this.anInt2252 <= arg0 + local37) {
			local51 = local37 + arg0 + 1 - this.anInt2252;
			local43 += local51;
			local37 -= local51;
		}
		if (local37 > 0 && local34 > 0) {
			local43 += this.anInt2252 * 7;
			return Static364.method1879(this.aByteArray32, local31, local34, local37, local43);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIILclient!mc;)V")
	public void method1876(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11_Sub4_Sub4 arg2) {
		@Pc(2) Class11_Sub4_Sub4_Sub1 local2 = (Class11_Sub4_Sub4_Sub1) arg2;
		arg1 += local2.anInt626 + 1;
		arg0 += local2.anInt627 + 1;
		@Pc(23) int local23 = this.anInt2252 * arg1 + arg0;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt629;
		@Pc(44) int local44 = local2.anInt628;
		@Pc(50) int local50 = this.anInt2252 - local44;
		@Pc(60) int local60;
		if (arg1 <= 0) {
			local60 = 1 - arg1;
			arg1 = 1;
			local28 -= local60;
			local25 = local44 * local60;
			local23 += this.anInt2252 * local60;
		}
		@Pc(81) int local81 = 0;
		if (this.anInt2249 <= local28 + arg1) {
			local60 = local28 + arg1 + 1 - this.anInt2249;
			local28 -= local60;
		}
		if (arg0 <= 0) {
			local60 = 1 - arg0;
			local25 += local60;
			local50 += local60;
			local44 -= local60;
			local23 += local60;
			local81 = local60;
			arg0 = 1;
		}
		if (this.anInt2252 <= local44 + arg0) {
			local60 = arg0 + local44 + 1 - this.anInt2252;
			local50 += local60;
			local44 -= local60;
			local81 += local60;
		}
		if (local44 > 0 && local28 > 0) {
			Static364.method1878(local50, local81, this.aByteArray32, local44, local25, local2.aByteArray17, local23, local28);
			this.method1877(arg1, local28, local44, arg0);
		}
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IIIII)V")
	private void method1877(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (this.aClass44ArrayArray1 == null) {
			return;
		}
		@Pc(10) int local10 = arg3 - 1 >> 7;
		@Pc(18) int local18 = arg3 + arg2 - 2 >> 7;
		@Pc(24) int local24 = arg0 - 1 >> 7;
		@Pc(34) int local34 = arg1 + arg0 - 1 - 1 >> 7;
		for (@Pc(42) int local42 = local10; local42 <= local18; local42++) {
			@Pc(50) Class44[] local50 = this.aClass44ArrayArray1[local42];
			for (@Pc(52) int local52 = local24; local52 <= local34; local52++) {
				local50[local52].aBoolean56 = true;
			}
		}
	}

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "(IIILclient!mc;)V")
	public void method1880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class11_Sub4_Sub4 arg2) {
		@Pc(2) Class11_Sub4_Sub4_Sub1 local2 = (Class11_Sub4_Sub4_Sub1) arg2;
		arg0 += local2.anInt627 + 1;
		arg1 += local2.anInt626 + 1;
		@Pc(23) int local23 = arg1 * this.anInt2252 + arg0;
		@Pc(25) int local25 = 0;
		@Pc(28) int local28 = local2.anInt629;
		@Pc(31) int local31 = local2.anInt628;
		@Pc(37) int local37 = this.anInt2252 - local31;
		@Pc(47) int local47;
		if (arg1 <= 0) {
			local47 = 1 - arg1;
			local23 += this.anInt2252 * local47;
			local25 = local47 * local31;
			local28 -= local47;
			arg1 = 1;
		}
		@Pc(68) int local68 = 0;
		if (this.anInt2249 <= local28 + arg1) {
			local47 = arg1 + local28 + 1 - this.anInt2249;
			local28 -= local47;
		}
		if (arg0 <= 0) {
			local47 = 1 - arg0;
			local37 += local47;
			local23 += local47;
			local25 += local47;
			local68 = local47;
			local31 -= local47;
			arg0 = 1;
		}
		if (this.anInt2252 <= arg0 + local31) {
			local47 = arg0 + local31 + 1 - this.anInt2252;
			local68 += local47;
			local31 -= local47;
			local37 += local47;
		}
		if (local31 > 0 && local28 > 0) {
			Static364.method1873(this.aByteArray32, local68, local28, local37, local25, local31, local2.aByteArray17, local23);
			this.method1877(arg1, local28, local31, arg0);
		}
	}
}
