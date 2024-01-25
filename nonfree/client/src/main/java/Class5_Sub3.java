import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tc")
public final class Class5_Sub3 extends Class5 {

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
	private int anInt9188 = 0;

	@OriginalMember(owner = "client!tc", name = "q", descriptor = "I")
	private int anInt9199 = 0;

	@OriginalMember(owner = "client!tc", name = "u", descriptor = "I")
	private int anInt9202 = 0;

	@OriginalMember(owner = "client!tc", name = "s", descriptor = "Z")
	private boolean aBoolean773 = false;

	@OriginalMember(owner = "client!tc", name = "z", descriptor = "I")
	private int anInt9205 = 0;

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
	private final int anInt9187;

	@OriginalMember(owner = "client!tc", name = "j", descriptor = "I")
	private final int anInt9193;

	@OriginalMember(owner = "client!tc", name = "i", descriptor = "Lclient!bm;")
	private final Class33_Sub1 aClass33_Sub1_19;

	@OriginalMember(owner = "client!tc", name = "A", descriptor = "Lclient!baa;")
	private final Interface2 anInterface2_5;

	@OriginalMember(owner = "client!tc", name = "w", descriptor = "Z")
	private final boolean aBoolean774;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "Z")
	private final boolean aBoolean771;

	@OriginalMember(owner = "client!tc", name = "o", descriptor = "Z")
	private final boolean aBoolean772;

	@OriginalMember(owner = "client!tc", name = "C", descriptor = "Z")
	private final boolean aBoolean775;

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!bm;IIZ)V")
	public Class5_Sub3(@OriginalArg(0) Class33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt9187 = arg2;
		this.anInt9193 = arg1;
		this.aClass33_Sub1_19 = arg0;
		this.anInterface2_5 = arg0.method2083(arg3 ? Static333.aClass82_9 : Static358.aClass82_12, arg1, Static137.aClass89_8, arg2);
		this.anInterface2_5.method6506(true, true);
		this.aBoolean774 = this.anInterface2_5.method6501() != arg1;
		this.aBoolean771 = this.anInterface2_5.method6507() != arg2;
		this.aBoolean772 = !this.aBoolean774 && this.anInterface2_5.method6505();
		this.aBoolean775 = !this.aBoolean771 && this.anInterface2_5.method6505();
	}

	@OriginalMember(owner = "client!tc", name = "<init>", descriptor = "(Lclient!bm;II[III)V")
	public Class5_Sub3(@OriginalArg(0) Class33_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.aClass33_Sub1_19 = arg0;
		this.anInt9193 = arg1;
		this.anInt9187 = arg2;
		this.anInterface2_5 = arg0.method2013(arg2, arg1, arg3, false, arg4, arg5);
		this.anInterface2_5.method6506(true, true);
		this.aBoolean774 = this.anInterface2_5.method6501() != arg1;
		this.aBoolean771 = arg2 != this.anInterface2_5.method6507();
		this.aBoolean772 = !this.aBoolean774 && this.anInterface2_5.method6505();
		this.aBoolean775 = !this.aBoolean771 && this.anInterface2_5.method6505();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method7581(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class47_Sub3 local8 = this.aClass33_Sub1_19.method2052();
		@Pc(13) Class47_Sub3 local13 = this.aClass33_Sub1_19.method2020();
		this.anInterface2_5.method7294(this.aBoolean774 || this.aBoolean771 ? Static310.aClass26_7 : Static229.aClass26_6);
		this.aClass33_Sub1_19.method2101();
		this.aClass33_Sub1_19.method1987(this.anInterface2_5);
		this.aClass33_Sub1_19.method2032(1);
		this.aClass33_Sub1_19.method2105(arg6);
		this.aClass33_Sub1_19.method2098(1, Static139.aClass371_3);
		this.aClass33_Sub1_19.method1991(Static139.aClass371_3, 1);
		this.aClass33_Sub1_19.method1996(arg7);
		if (this.aBoolean773) {
			@Pc(74) float local74 = (float) this.method7589();
			@Pc(78) float local78 = (float) this.method7585();
			@Pc(85) float local85 = (arg2 - arg0) / local74;
			@Pc(91) float local91 = (arg3 - arg1) / local74;
			@Pc(97) float local97 = (arg4 - arg0) / local78;
			@Pc(104) float local104 = (arg5 - arg1) / local78;
			@Pc(110) float local110 = local97 * (float) this.anInt9188;
			@Pc(116) float local116 = (float) this.anInt9188 * local104;
			@Pc(122) float local122 = local85 * (float) this.anInt9199;
			@Pc(128) float local128 = (float) this.anInt9199 * local91;
			@Pc(135) float local135 = -local85 * (float) this.anInt9205;
			@Pc(142) float local142 = -local91 * (float) this.anInt9205;
			@Pc(149) float local149 = (float) this.anInt9202 * -local97;
			arg2 = local135 + arg2 + local110;
			arg3 = arg3 + local142 + local116;
			arg4 = local122 + arg4 + local149;
			@Pc(174) float local174 = (float) this.anInt9202 * -local104;
			arg1 = local128 + arg1 + local116;
			arg0 = local110 + local122 + arg0;
			arg5 = local174 + arg5 + local128;
		}
		local8.method7904(0.0F, arg4 - arg0, -arg1 + arg5, 1.0F, 0.0F, 0.0F, arg2 - arg0, arg3 - arg1, 0.0F);
		local8.method7882(arg0, arg1, 0.0F);
		local13.method7901(this.anInterface2_5.method6504((float) this.anInt9187), 1.0F, this.anInterface2_5.method6503((float) this.anInt9193));
		this.aClass33_Sub1_19.method2088(Static235.aClass180_4);
		this.aClass33_Sub1_19.method2042();
		this.aClass33_Sub1_19.method2065();
		this.aClass33_Sub1_19.method2029();
		this.aClass33_Sub1_19.method2098(1, Static25.aClass371_1);
		this.aClass33_Sub1_19.method1991(Static25.aClass371_1, 1);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method7595(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class47_Sub3 local8 = this.aClass33_Sub1_19.method2052();
		@Pc(13) Class47_Sub3 local13 = this.aClass33_Sub1_19.method2020();
		@Pc(18) int local18 = arg1 + this.anInt9188;
		@Pc(23) int local23 = arg0 + this.anInt9199;
		this.anInterface2_5.method7294(Static310.aClass26_7);
		this.aClass33_Sub1_19.method2101();
		this.aClass33_Sub1_19.method1987(this.anInterface2_5);
		this.aClass33_Sub1_19.method2032(arg4);
		this.aClass33_Sub1_19.method2105(arg2);
		this.aClass33_Sub1_19.method2098(1, Static139.aClass371_3);
		this.aClass33_Sub1_19.method1991(Static139.aClass371_3, 1);
		this.aClass33_Sub1_19.method1996(arg3);
		local8.method7901((float) this.anInt9187, 0.0F, (float) this.anInt9193);
		local8.method7876(local23, local18, 0);
		local13.method7901(this.anInterface2_5.method6504((float) this.anInt9187), 1.0F, this.anInterface2_5.method6503((float) this.anInt9193));
		this.aClass33_Sub1_19.method2088(Static235.aClass180_4);
		this.aClass33_Sub1_19.method2042();
		this.aClass33_Sub1_19.method2065();
		this.aClass33_Sub1_19.method2029();
		this.aClass33_Sub1_19.method2098(1, Static25.aClass371_1);
		this.aClass33_Sub1_19.method1991(Static25.aClass371_1, 1);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method7576(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class47_Sub3 local8 = this.aClass33_Sub1_19.method2052();
		@Pc(13) Class47_Sub3 local13 = this.aClass33_Sub1_19.method2020();
		this.anInterface2_5.method7294(this.aBoolean774 || this.aBoolean771 ? Static310.aClass26_7 : Static229.aClass26_6);
		this.aClass33_Sub1_19.method2101();
		this.aClass33_Sub1_19.method1987(this.anInterface2_5);
		this.aClass33_Sub1_19.method2032(arg6);
		this.aClass33_Sub1_19.method2105(arg4);
		this.aClass33_Sub1_19.method2098(1, Static139.aClass371_3);
		this.aClass33_Sub1_19.method1991(Static139.aClass371_3, 1);
		this.aClass33_Sub1_19.method1996(arg5);
		local13.method7901(this.anInterface2_5.method6504((float) this.anInt9187), 1.0F, this.anInterface2_5.method6503((float) this.anInt9193));
		if (this.aBoolean773) {
			arg2 = this.anInt9193 * arg2 / this.method7589();
			arg3 = arg3 * this.anInt9187 / this.method7585();
			arg1 += arg3 * this.anInt9188 / this.anInt9187;
			arg0 += arg2 * this.anInt9199 / this.anInt9193;
		}
		local8.method7901((float) arg3, 0.0F, (float) arg2);
		local8.method7876(arg0, arg1, 0);
		this.aClass33_Sub1_19.method2088(Static235.aClass180_4);
		this.aClass33_Sub1_19.method2042();
		this.aClass33_Sub1_19.method2065();
		this.aClass33_Sub1_19.method2029();
		this.aClass33_Sub1_19.method2098(1, Static25.aClass371_1);
		this.aClass33_Sub1_19.method1991(Static25.aClass371_1, 1);
	}

	@OriginalMember(owner = "client!tc", name = "c", descriptor = "()I")
	@Override
	public int method7588() {
		return this.anInt9193;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method7594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class47_Sub3 local10 = this.aClass33_Sub1_19.method2052();
		@Pc(15) Class47_Sub3 local15 = this.aClass33_Sub1_19.method2020();
		this.anInterface2_5.method7294(Static310.aClass26_7);
		this.aClass33_Sub1_19.method2101();
		this.aClass33_Sub1_19.method1987(this.anInterface2_5);
		this.aClass33_Sub1_19.method2032(arg6);
		this.aClass33_Sub1_19.method2105(arg4);
		this.aClass33_Sub1_19.method2098(1, Static139.aClass371_3);
		this.aClass33_Sub1_19.method1991(Static139.aClass371_3, 1);
		this.aClass33_Sub1_19.method1996(arg5);
		@Pc(76) boolean local76 = this.aBoolean775 && this.anInt9188 == 0 && this.anInt9202 == 0;
		@Pc(95) boolean local95 = this.aBoolean772 && this.anInt9199 == 0 && this.anInt9205 == 0;
		if (local76 & local95) {
			local15.method7901(this.anInterface2_5.method6504((float) arg3), 1.0F, this.anInterface2_5.method6503((float) arg2));
			local10.method7901((float) arg3, 0.0F, (float) arg2);
			local10.method7876(arg0, arg1, 0);
			this.aClass33_Sub1_19.method2088(Static235.aClass180_4);
			this.aClass33_Sub1_19.method2042();
			this.aClass33_Sub1_19.method2065();
		} else {
			@Pc(107) int local107;
			@Pc(110) int local110;
			@Pc(137) int local137;
			@Pc(142) int local142;
			@Pc(185) int local185;
			if (local95) {
				local107 = arg1 + arg3;
				local110 = this.method7585();
				local15.method7901(this.anInterface2_5.method6504((float) this.anInt9187), 1.0F, this.anInterface2_5.method6503((float) arg2));
				this.aClass33_Sub1_19.method2088(Static235.aClass180_4);
				local137 = arg1 + this.anInt9188;
				local142 = local137 + this.anInt9187;
				while (local142 <= local107) {
					local10.method7901((float) this.anInt9187, 0.0F, (float) arg2);
					local10.method7876(arg0, local137, 0);
					this.aClass33_Sub1_19.method2042();
					local142 += local110;
					this.aClass33_Sub1_19.method2065();
					local137 += local110;
				}
				if (local107 > local137) {
					local185 = local107 - local137;
					local15.method7901(this.anInterface2_5.method6504((float) local185), 1.0F, this.anInterface2_5.method6503((float) arg2));
					this.aClass33_Sub1_19.method2088(Static235.aClass180_4);
					local10.method7901((float) local185, 0.0F, (float) arg2);
					local10.method7876(arg0, local137, 0);
					this.aClass33_Sub1_19.method2042();
					this.aClass33_Sub1_19.method2065();
				}
			} else if (local76) {
				local107 = arg0 + arg2;
				local110 = this.method7589();
				local15.method7901(this.anInterface2_5.method6504((float) arg3), 1.0F, this.anInterface2_5.method6503((float) this.anInt9193));
				this.aClass33_Sub1_19.method2088(Static235.aClass180_4);
				local137 = this.anInt9199 + arg0;
				for (local142 = local137 + this.anInt9193; local142 <= local107; local142 += local110) {
					local10.method7901((float) arg3, 0.0F, (float) this.anInt9193);
					local10.method7876(local137, arg1, 0);
					this.aClass33_Sub1_19.method2042();
					this.aClass33_Sub1_19.method2065();
					local137 += local110;
				}
				if (local107 > local137) {
					local185 = local107 - local137;
					local15.method7901(this.anInterface2_5.method6504((float) arg3), 1.0F, this.anInterface2_5.method6503((float) local185));
					this.aClass33_Sub1_19.method2088(Static235.aClass180_4);
					local10.method7901((float) arg3, 0.0F, (float) local185);
					local10.method7876(local137, arg1, 0);
					this.aClass33_Sub1_19.method2042();
					this.aClass33_Sub1_19.method2065();
				}
			} else {
				local107 = arg3 + arg1;
				local110 = arg0 + arg2;
				local137 = this.method7589();
				local142 = this.method7585();
				local185 = arg1 + this.anInt9188;
				@Pc(284) int local284;
				@Pc(289) int local289;
				@Pc(333) int local333;
				for (@Pc(254) int local254 = this.anInt9187 + local185; local254 <= local107; local254 += local142) {
					local15.method7901(this.anInterface2_5.method6504((float) this.anInt9187), 1.0F, this.anInterface2_5.method6503((float) this.anInt9193));
					this.aClass33_Sub1_19.method2088(Static235.aClass180_4);
					local284 = this.anInt9199 + arg0;
					local289 = this.anInt9193 + local284;
					while (local289 <= local110) {
						local10.method7901((float) this.anInt9187, 0.0F, (float) this.anInt9193);
						local10.method7876(local284, local185, 0);
						this.aClass33_Sub1_19.method2042();
						local289 += local137;
						local284 += local137;
						this.aClass33_Sub1_19.method2065();
					}
					if (local110 > local284) {
						local333 = local110 - local284;
						local15.method7901(this.anInterface2_5.method6504((float) this.anInt9187), 1.0F, this.anInterface2_5.method6503((float) local333));
						this.aClass33_Sub1_19.method2088(Static235.aClass180_4);
						local10.method7901((float) this.anInt9187, 0.0F, (float) local333);
						local10.method7876(local284, local185, 0);
						this.aClass33_Sub1_19.method2042();
						this.aClass33_Sub1_19.method2065();
					}
					local185 += local142;
				}
				if (local185 < local107) {
					local284 = local107 - local185;
					local15.method7901(this.anInterface2_5.method6504((float) local284), 1.0F, this.anInterface2_5.method6503((float) this.anInt9193));
					this.aClass33_Sub1_19.method2088(Static235.aClass180_4);
					local289 = arg0 + this.anInt9199;
					local333 = local289 + this.anInt9193;
					while (local333 <= local110) {
						local10.method7901((float) local284, 0.0F, (float) this.anInt9193);
						local10.method7876(local289, local185, 0);
						this.aClass33_Sub1_19.method2042();
						local333 += local137;
						this.aClass33_Sub1_19.method2065();
						local289 += local137;
					}
					if (local289 < local110) {
						@Pc(483) int local483 = local110 - local289;
						local15.method7901(this.anInterface2_5.method6504((float) local284), 1.0F, this.anInterface2_5.method6503((float) local483));
						this.aClass33_Sub1_19.method2088(Static235.aClass180_4);
						local10.method7901((float) local284, 0.0F, (float) local483);
						local10.method7876(local289, local185, 0);
						this.aClass33_Sub1_19.method2042();
						this.aClass33_Sub1_19.method2065();
					}
				}
			}
		}
		this.aClass33_Sub1_19.method2029();
		this.aClass33_Sub1_19.method2098(1, Static25.aClass371_1);
		this.aClass33_Sub1_19.method1991(Static25.aClass371_1, 1);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V")
	@Override
	public void method7587(@OriginalArg(2) int arg0) {
		@Pc(15) int[] local15 = this.aClass33_Sub1_19.na(0, 0, this.anInt9193, this.anInt9187);
		@Pc(22) int[] local22 = new int[this.anInt9187 * this.anInt9193];
		this.anInterface2_5.method6502(this.anInt9187, this.anInt9193, local22);
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(50) int local50;
		if (arg0 == 0) {
			for (local41 = 0; local41 < this.anInt9187; local41++) {
				local48 = local41 * this.anInt9193;
				for (local50 = 0; local50 < this.anInt9193; local50++) {
					local22[local48 + local50] = local22[local48 + local50] & 0xFFFFFF | local15[local48 + local50] << 8 & 0xFF00005D;
				}
			}
		} else if (arg0 == 3) {
			for (local41 = 0; local41 < this.anInt9187; local41++) {
				local48 = local41 * this.anInt9193;
				for (local50 = 0; local50 < this.anInt9193; local50++) {
					local22[local50 + local48] = (local15[local48 + local50] == 0 ? 0 : -16777216) | local22[local50 + local48] & 0xFFFFFF;
				}
			}
		}
		this.method7600(0, 0, this.anInt9193, this.anInt9187, local22, this.anInt9193);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method7575(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class47_Sub3 local8 = this.aClass33_Sub1_19.method2052();
		@Pc(13) Class47_Sub3 local13 = this.aClass33_Sub1_19.method2020();
		@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) arg6;
		@Pc(19) Interface2 local19 = local16.anInterface2_2;
		this.anInterface2_5.method7294(this.aBoolean774 || this.aBoolean771 ? Static310.aClass26_7 : Static229.aClass26_6);
		this.aClass33_Sub1_19.method2101();
		this.aClass33_Sub1_19.method1987(this.anInterface2_5);
		this.aClass33_Sub1_19.method2032(1);
		this.aClass33_Sub1_19.method2105(1);
		if (this.aBoolean773) {
			@Pc(99) float local99 = (float) this.anInt9193 / (float) this.method7589();
			@Pc(107) float local107 = (float) this.anInt9187 / (float) this.method7585();
			local8.method7904(0.0F, (arg4 - arg0) * local107, local107 * (arg5 - arg1), 1.0F, 0.0F, 0.0F, (arg2 - arg0) * local99, (arg3 - arg1) * local99, 0.0F);
			local8.method7882((arg0 + (float) this.anInt9199) * local99, (arg1 + (float) this.anInt9188) * local107, 0.0F);
		} else {
			local8.method7904(0.0F, arg4 - arg0, -arg1 + arg5, 1.0F, 0.0F, 0.0F, arg2 - arg0, -arg1 + arg3, 0.0F);
			local8.method7882(arg0, arg1, 0.0F);
		}
		local13.method7901(this.anInterface2_5.method6504((float) this.anInt9187), 1.0F, this.anInterface2_5.method6503((float) this.anInt9193));
		this.aClass33_Sub1_19.method2088(Static235.aClass180_4);
		this.aClass33_Sub1_19.method2010(1);
		this.aClass33_Sub1_19.method1987(local19);
		this.aClass33_Sub1_19.method1983(Static25.aClass363_1, Static64.aClass363_7);
		this.aClass33_Sub1_19.method2098(0, Static25.aClass371_1);
		@Pc(206) Class47_Sub3 local206 = this.aClass33_Sub1_19.method2020();
		local206.method7877(local8);
		local206.method7876(-arg7, -arg8, 0);
		local206.method7888(1.0F, local19.method6504(1.0F), local19.method6503(1.0F));
		this.aClass33_Sub1_19.method2088(Static235.aClass180_4);
		this.aClass33_Sub1_19.method2042();
		this.aClass33_Sub1_19.method2065();
		this.aClass33_Sub1_19.method2029();
		this.aClass33_Sub1_19.method2098(0, Static419.aClass371_4);
		this.aClass33_Sub1_19.method1983(Static25.aClass363_1, Static25.aClass363_1);
		this.aClass33_Sub1_19.method1987(null);
		this.aClass33_Sub1_19.method2010(0);
		this.aClass33_Sub1_19.method2029();
	}

	@OriginalMember(owner = "client!tc", name = "d", descriptor = "()I")
	@Override
	public int method7589() {
		return this.anInt9193 + this.anInt9199 + this.anInt9205;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "([I)V")
	@Override
	public void method7597(@OriginalArg(0) int[] arg0) {
		arg0[3] = this.anInt9202;
		arg0[0] = this.anInt9199;
		arg0[2] = this.anInt9205;
		arg0[1] = this.anInt9188;
	}

	@OriginalMember(owner = "client!tc", name = "b", descriptor = "()I")
	@Override
	public int method7585() {
		return this.anInt9187 + this.anInt9188 + this.anInt9202;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIII)V")
	@Override
	public void method7586(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt9199 = arg0;
		this.anInt9202 = arg3;
		this.anInt9188 = arg1;
		this.anInt9205 = arg2;
		this.aBoolean773 = this.anInt9199 != 0 || this.anInt9188 != 0 || this.anInt9205 != 0 || this.anInt9202 != 0;
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIII[III)V")
	private void method7600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface2_5.method6500(arg2, arg3, arg1, arg4, arg0, arg5);
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method7583(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg2;
		@Pc(11) int local11 = arg0 + this.anInt9199;
		@Pc(16) int local16 = arg1 + this.anInt9188;
		@Pc(19) Interface2 local19 = local6.anInterface2_2;
		this.anInterface2_5.method7294(Static310.aClass26_7);
		this.aClass33_Sub1_19.method2101();
		this.aClass33_Sub1_19.method1987(this.anInterface2_5);
		this.aClass33_Sub1_19.method2032(1);
		this.aClass33_Sub1_19.method2105(1);
		@Pc(49) Class47_Sub3 local49 = this.aClass33_Sub1_19.method2052();
		local49.method7901((float) this.anInt9187, 0.0F, (float) this.anInt9193);
		local49.method7876(local11, local16, 0);
		this.aClass33_Sub1_19.method2042();
		@Pc(73) Class47_Sub3 local73 = this.aClass33_Sub1_19.method2020();
		local73.method7901(this.anInterface2_5.method6504((float) this.anInt9187), 1.0F, this.anInterface2_5.method6503((float) this.anInt9193));
		this.aClass33_Sub1_19.method2088(Static235.aClass180_4);
		this.aClass33_Sub1_19.method2010(1);
		this.aClass33_Sub1_19.method1987(local19);
		this.aClass33_Sub1_19.method1983(Static25.aClass363_1, Static64.aClass363_7);
		this.aClass33_Sub1_19.method2098(0, Static25.aClass371_1);
		@Pc(123) Class47_Sub3 local123 = this.aClass33_Sub1_19.method2020();
		local123.method7901(local19.method6504((float) this.anInt9187), 1.0F, local19.method6503((float) this.anInt9193));
		local123.method7882(local19.method6503((float) (local11 - arg3)), local19.method6504((float) (local16 - arg4)), 0.0F);
		this.aClass33_Sub1_19.method2088(Static235.aClass180_4);
		this.aClass33_Sub1_19.method2065();
		this.aClass33_Sub1_19.method2029();
		this.aClass33_Sub1_19.method2098(0, Static419.aClass371_4);
		this.aClass33_Sub1_19.method1983(Static25.aClass363_1, Static25.aClass363_1);
		this.aClass33_Sub1_19.method1987(null);
		this.aClass33_Sub1_19.method2010(0);
		this.aClass33_Sub1_19.method2029();
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method7578(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass33_Sub1_19.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method7600(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "()I")
	@Override
	public int method7580() {
		return this.anInt9187;
	}
}
