import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class21_Sub3 extends Class21 {

	@OriginalMember(owner = "client!nm", name = "L", descriptor = "[J")
	public static final long[] aLongArray10;

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
	private int anInt7033 = 0;

	@OriginalMember(owner = "client!nm", name = "B", descriptor = "I")
	private int anInt7048 = 0;

	@OriginalMember(owner = "client!nm", name = "u", descriptor = "I")
	private int anInt7043 = 0;

	@OriginalMember(owner = "client!nm", name = "G", descriptor = "Z")
	private boolean aBoolean499 = false;

	@OriginalMember(owner = "client!nm", name = "K", descriptor = "I")
	private int anInt7053 = 0;

	@OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
	private final int anInt7038;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
	private final int anInt7037;

	@OriginalMember(owner = "client!nm", name = "r", descriptor = "Lclient!ln;")
	private final Class16_Sub1 aClass16_Sub1_15;

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "Lclient!oq;")
	private final Interface20 anInterface20_5;

	@OriginalMember(owner = "client!nm", name = "F", descriptor = "Z")
	private final boolean aBoolean498;

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "Z")
	private final boolean aBoolean494;

	@OriginalMember(owner = "client!nm", name = "D", descriptor = "Z")
	private final boolean aBoolean497;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "Z")
	private final boolean aBoolean493;

	static {
		new Class165("", 76);
		aLongArray10 = new long[256];
		for (@Pc(22) int local22 = 0; local22 < 256; local22++) {
			@Pc(26) long local26 = (long) local22;
			for (@Pc(28) int local28 = 0; local28 < 8; local28++) {
				if ((local26 & 0x1L) == 1L) {
					local26 = local26 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local26 >>>= 0x1;
				}
			}
			aLongArray10[local22] = local26;
		}
	}

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!ln;IIZ)V")
	public Class21_Sub3(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		this.anInt7038 = arg2;
		this.anInt7037 = arg1;
		this.aClass16_Sub1_15 = arg0;
		this.anInterface20_5 = arg0.method3923(Static258.aClass160_9, arg3 ? Static456.aClass366_9 : Static527.aClass366_12, arg1, arg2);
		this.anInterface20_5.method6623(true, true);
		this.aBoolean498 = arg1 != this.anInterface20_5.method6624();
		this.aBoolean494 = arg2 != this.anInterface20_5.method6630();
		this.aBoolean497 = !this.aBoolean498 && this.anInterface20_5.method6626();
		this.aBoolean493 = !this.aBoolean494 && this.anInterface20_5.method6626();
	}

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!ln;II[III)V")
	public Class21_Sub3(@OriginalArg(0) Class16_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt7038 = arg2;
		this.aClass16_Sub1_15 = arg0;
		this.anInt7037 = arg1;
		this.anInterface20_5 = arg0.method3928(arg1, false, arg3, arg2, arg5, arg4);
		this.anInterface20_5.method6623(true, true);
		this.aBoolean498 = this.anInterface20_5.method6624() != arg1;
		this.aBoolean494 = arg2 != this.anInterface20_5.method6630();
		this.aBoolean497 = !this.aBoolean498 && this.anInterface20_5.method6626();
		this.aBoolean493 = !this.aBoolean494 && this.anInterface20_5.method6626();
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "()I")
	@Override
	public int method5785() {
		return this.anInt7043 + this.anInt7038 + this.anInt7048;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(FFFFFFILclient!aa;II)V")
	@Override
	protected void method5799(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		@Pc(8) Class54_Sub3 local8 = this.aClass16_Sub1_15.method3945();
		@Pc(13) Class54_Sub3 local13 = this.aClass16_Sub1_15.method3906();
		@Pc(16) Class1_Sub2 local16 = (Class1_Sub2) arg6;
		@Pc(19) Interface20 local19 = local16.anInterface20_2;
		this.anInterface20_5.method8280(this.aBoolean498 || this.aBoolean494 ? Static116.aClass277_4 : Static579.aClass277_10);
		this.aClass16_Sub1_15.method3951();
		this.aClass16_Sub1_15.method3889(this.anInterface20_5);
		this.aClass16_Sub1_15.method3956(1);
		this.aClass16_Sub1_15.method3937(1);
		if (this.aBoolean499) {
			@Pc(100) float local100 = (float) this.anInt7037 / (float) this.method5779();
			@Pc(108) float local108 = (float) this.anInt7038 / (float) this.method5785();
			local8.method5168(0.0F, 0.0F, 0.0F, 1.0F, local108 * (arg4 - arg0), 0.0F, (arg3 - arg1) * local100, local100 * (arg2 - arg0), local108 * (arg5 - arg1));
			local8.method5161(0.0F, local100 * ((float) this.anInt7053 + arg0), ((float) this.anInt7043 + arg1) * local108);
		} else {
			local8.method5168(0.0F, 0.0F, 0.0F, 1.0F, arg4 - arg0, 0.0F, arg3 - arg1, -arg0 + arg2, arg5 - arg1);
			local8.method5161(0.0F, arg0, arg1);
		}
		local13.method5156(this.anInterface20_5.method6625((float) this.anInt7038), 1.0F, this.anInterface20_5.method6627((float) this.anInt7037));
		this.aClass16_Sub1_15.method3908(Static465.aClass207_6);
		this.aClass16_Sub1_15.method3899(1);
		this.aClass16_Sub1_15.method3889(local19);
		this.aClass16_Sub1_15.method3924(Static402.aClass34_4, Static428.aClass34_5);
		this.aClass16_Sub1_15.method3946(0, Static613.aClass265_9);
		@Pc(207) Class54_Sub3 local207 = this.aClass16_Sub1_15.method3906();
		local207.method5137(local8);
		local207.method5142(-arg7, -arg8, 0);
		local207.method5167(local19.method6627(1.0F), 1.0F, local19.method6625(1.0F));
		this.aClass16_Sub1_15.method3908(Static465.aClass207_6);
		this.aClass16_Sub1_15.method3986();
		this.aClass16_Sub1_15.method3961();
		this.aClass16_Sub1_15.method3930();
		this.aClass16_Sub1_15.method3946(0, Static625.aClass265_10);
		this.aClass16_Sub1_15.method3924(Static402.aClass34_4, Static402.aClass34_4);
		this.aClass16_Sub1_15.method3889(null);
		this.aClass16_Sub1_15.method3899(0);
		this.aClass16_Sub1_15.method3930();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "()I")
	@Override
	public int method5779() {
		return this.anInt7033 + this.anInt7053 + this.anInt7037;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)V")
	@Override
	public void method5794(@OriginalArg(2) int arg0) {
		@Pc(15) int[] local15 = this.aClass16_Sub1_15.na(0, 0, this.anInt7037, this.anInt7038);
		@Pc(22) int[] local22 = new int[this.anInt7037 * this.anInt7038];
		this.anInterface20_5.method6628(local22, this.anInt7037, this.anInt7038);
		@Pc(52) int local52;
		@Pc(59) int local59;
		@Pc(61) int local61;
		if (arg0 == 0) {
			for (local52 = 0; local52 < this.anInt7038; local52++) {
				local59 = local52 * this.anInt7037;
				for (local61 = 0; local61 < this.anInt7037; local61++) {
					local22[local59 + local61] = local22[local59 + local61] & 0xFFFFFF | (local15[local61 + local59] & 0xA8FF0000) << 8;
				}
			}
		} else if (arg0 == 3) {
			for (local52 = 0; local52 < this.anInt7038; local52++) {
				local59 = this.anInt7037 * local52;
				for (local61 = 0; local61 < this.anInt7037; local61++) {
					local22[local59 + local61] = local22[local59 + local61] & 0xFFFFFF | (local15[local61 + local59] == 0 ? 0 : -16777216);
				}
			}
		}
		this.method5803(0, 0, this.anInt7037, this.anInt7038, local22, this.anInt7037);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIII)V")
	@Override
	public void method5782(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(10) Class54_Sub3 local10 = this.aClass16_Sub1_15.method3945();
		@Pc(15) Class54_Sub3 local15 = this.aClass16_Sub1_15.method3906();
		this.anInterface20_5.method8280(Static116.aClass277_4);
		this.aClass16_Sub1_15.method3951();
		this.aClass16_Sub1_15.method3889(this.anInterface20_5);
		this.aClass16_Sub1_15.method3956(arg6);
		this.aClass16_Sub1_15.method3937(arg4);
		this.aClass16_Sub1_15.method3946(1, Static190.aClass265_8);
		this.aClass16_Sub1_15.method3950(1, Static190.aClass265_8);
		this.aClass16_Sub1_15.method3939(arg5);
		@Pc(76) boolean local76 = this.aBoolean493 && this.anInt7043 == 0 && this.anInt7048 == 0;
		@Pc(92) boolean local92 = this.aBoolean497 && this.anInt7053 == 0 && this.anInt7033 == 0;
		if (local76 & local92) {
			local15.method5156(this.anInterface20_5.method6625((float) arg3), 1.0F, this.anInterface20_5.method6627((float) arg2));
			local10.method5156((float) arg3, 0.0F, (float) arg2);
			local10.method5142(arg0, arg1, 0);
			this.aClass16_Sub1_15.method3908(Static465.aClass207_6);
			this.aClass16_Sub1_15.method3986();
			this.aClass16_Sub1_15.method3961();
		} else {
			@Pc(147) int local147;
			@Pc(150) int local150;
			@Pc(177) int local177;
			@Pc(182) int local182;
			@Pc(224) int local224;
			if (local92) {
				local147 = arg1 + arg3;
				local150 = this.method5785();
				local15.method5156(this.anInterface20_5.method6625((float) this.anInt7038), 1.0F, this.anInterface20_5.method6627((float) arg2));
				this.aClass16_Sub1_15.method3908(Static465.aClass207_6);
				local177 = arg1 + this.anInt7043;
				for (local182 = local177 + this.anInt7038; local182 <= local147; local182 += local150) {
					local10.method5156((float) this.anInt7038, 0.0F, (float) arg2);
					local10.method5142(arg0, local177, 0);
					this.aClass16_Sub1_15.method3986();
					this.aClass16_Sub1_15.method3961();
					local177 += local150;
				}
				if (local177 < local147) {
					local224 = local147 - local177;
					local15.method5156(this.anInterface20_5.method6625((float) local224), 1.0F, this.anInterface20_5.method6627((float) arg2));
					this.aClass16_Sub1_15.method3908(Static465.aClass207_6);
					local10.method5156((float) local224, 0.0F, (float) arg2);
					local10.method5142(arg0, local177, 0);
					this.aClass16_Sub1_15.method3986();
					this.aClass16_Sub1_15.method3961();
				}
			} else if (local76) {
				local147 = arg2 + arg0;
				local150 = this.method5779();
				local15.method5156(this.anInterface20_5.method6625((float) arg3), 1.0F, this.anInterface20_5.method6627((float) this.anInt7037));
				this.aClass16_Sub1_15.method3908(Static465.aClass207_6);
				local177 = this.anInt7053 + arg0;
				local182 = this.anInt7037 + local177;
				while (local147 >= local182) {
					local10.method5156((float) arg3, 0.0F, (float) this.anInt7037);
					local10.method5142(local177, arg1, 0);
					this.aClass16_Sub1_15.method3986();
					this.aClass16_Sub1_15.method3961();
					local182 += local150;
					local177 += local150;
				}
				if (local177 < local147) {
					local224 = local147 - local177;
					local15.method5156(this.anInterface20_5.method6625((float) arg3), 1.0F, this.anInterface20_5.method6627((float) local224));
					this.aClass16_Sub1_15.method3908(Static465.aClass207_6);
					local10.method5156((float) arg3, 0.0F, (float) local224);
					local10.method5142(local177, arg1, 0);
					this.aClass16_Sub1_15.method3986();
					this.aClass16_Sub1_15.method3961();
				}
			} else {
				local147 = arg3 + arg1;
				local150 = arg2 + arg0;
				local177 = this.method5779();
				local182 = this.method5785();
				local224 = this.anInt7043 + arg1;
				@Pc(294) int local294 = local224 + this.anInt7038;
				@Pc(324) int local324;
				@Pc(329) int local329;
				@Pc(372) int local372;
				while (local147 >= local294) {
					local15.method5156(this.anInterface20_5.method6625((float) this.anInt7038), 1.0F, this.anInterface20_5.method6627((float) this.anInt7037));
					this.aClass16_Sub1_15.method3908(Static465.aClass207_6);
					local324 = arg0 + this.anInt7053;
					local329 = local324 + this.anInt7037;
					while (local150 >= local329) {
						local10.method5156((float) this.anInt7038, 0.0F, (float) this.anInt7037);
						local10.method5142(local324, local224, 0);
						this.aClass16_Sub1_15.method3986();
						local329 += local177;
						local324 += local177;
						this.aClass16_Sub1_15.method3961();
					}
					if (local324 < local150) {
						local372 = local150 - local324;
						local15.method5156(this.anInterface20_5.method6625((float) this.anInt7038), 1.0F, this.anInterface20_5.method6627((float) local372));
						this.aClass16_Sub1_15.method3908(Static465.aClass207_6);
						local10.method5156((float) this.anInt7038, 0.0F, (float) local372);
						local10.method5142(local324, local224, 0);
						this.aClass16_Sub1_15.method3986();
						this.aClass16_Sub1_15.method3961();
					}
					local294 += local182;
					local224 += local182;
				}
				if (local224 < local147) {
					local324 = local147 - local224;
					local15.method5156(this.anInterface20_5.method6625((float) local324), 1.0F, this.anInterface20_5.method6627((float) this.anInt7037));
					this.aClass16_Sub1_15.method3908(Static465.aClass207_6);
					local329 = this.anInt7053 + arg0;
					local372 = local329 + this.anInt7037;
					while (local150 >= local372) {
						local10.method5156((float) local324, 0.0F, (float) this.anInt7037);
						local10.method5142(local329, local224, 0);
						this.aClass16_Sub1_15.method3986();
						local329 += local177;
						local372 += local177;
						this.aClass16_Sub1_15.method3961();
					}
					if (local329 < local150) {
						@Pc(514) int local514 = local150 - local329;
						local15.method5156(this.anInterface20_5.method6625((float) local324), 1.0F, this.anInterface20_5.method6627((float) local514));
						this.aClass16_Sub1_15.method3908(Static465.aClass207_6);
						local10.method5156((float) local324, 0.0F, (float) local514);
						local10.method5142(local329, local224, 0);
						this.aClass16_Sub1_15.method3986();
						this.aClass16_Sub1_15.method3961();
					}
				}
			}
		}
		this.aClass16_Sub1_15.method3930();
		this.aClass16_Sub1_15.method3946(1, Static613.aClass265_9);
		this.aClass16_Sub1_15.method3950(1, Static613.aClass265_9);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IILclient!aa;II)V")
	@Override
	public void method5800(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(6) Class1_Sub2 local6 = (Class1_Sub2) arg2;
		@Pc(11) int local11 = arg0 + this.anInt7053;
		@Pc(16) int local16 = arg1 + this.anInt7043;
		@Pc(19) Interface20 local19 = local6.anInterface20_2;
		this.anInterface20_5.method8280(Static116.aClass277_4);
		this.aClass16_Sub1_15.method3951();
		this.aClass16_Sub1_15.method3889(this.anInterface20_5);
		this.aClass16_Sub1_15.method3956(1);
		this.aClass16_Sub1_15.method3937(1);
		@Pc(49) Class54_Sub3 local49 = this.aClass16_Sub1_15.method3945();
		local49.method5156((float) this.anInt7038, 0.0F, (float) this.anInt7037);
		local49.method5142(local11, local16, 0);
		this.aClass16_Sub1_15.method3986();
		@Pc(73) Class54_Sub3 local73 = this.aClass16_Sub1_15.method3906();
		local73.method5156(this.anInterface20_5.method6625((float) this.anInt7038), 1.0F, this.anInterface20_5.method6627((float) this.anInt7037));
		this.aClass16_Sub1_15.method3908(Static465.aClass207_6);
		this.aClass16_Sub1_15.method3899(1);
		this.aClass16_Sub1_15.method3889(local19);
		this.aClass16_Sub1_15.method3924(Static402.aClass34_4, Static428.aClass34_5);
		this.aClass16_Sub1_15.method3946(0, Static613.aClass265_9);
		@Pc(123) Class54_Sub3 local123 = this.aClass16_Sub1_15.method3906();
		local123.method5156(local19.method6625((float) this.anInt7038), 1.0F, local19.method6627((float) this.anInt7037));
		local123.method5161(0.0F, local19.method6627((float) (local11 - arg3)), local19.method6625((float) (local16 - arg4)));
		this.aClass16_Sub1_15.method3908(Static465.aClass207_6);
		this.aClass16_Sub1_15.method3961();
		this.aClass16_Sub1_15.method3930();
		this.aClass16_Sub1_15.method3946(0, Static625.aClass265_10);
		this.aClass16_Sub1_15.method3924(Static402.aClass34_4, Static402.aClass34_4);
		this.aClass16_Sub1_15.method3889(null);
		this.aClass16_Sub1_15.method3899(0);
		this.aClass16_Sub1_15.method3930();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIII[III)V")
	private void method5803(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4, @OriginalArg(6) int arg5) {
		this.anInterface20_5.method6629(arg2, arg5, arg1, arg4, arg0, arg3);
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "()I")
	@Override
	public int method5783() {
		return this.anInt7038;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIII)V")
	@Override
	public void method5791(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class54_Sub3 local8 = this.aClass16_Sub1_15.method3945();
		@Pc(13) Class54_Sub3 local13 = this.aClass16_Sub1_15.method3906();
		@Pc(18) int local18 = arg0 + this.anInt7053;
		@Pc(23) int local23 = arg1 + this.anInt7043;
		this.anInterface20_5.method8280(Static116.aClass277_4);
		this.aClass16_Sub1_15.method3951();
		this.aClass16_Sub1_15.method3889(this.anInterface20_5);
		this.aClass16_Sub1_15.method3956(arg4);
		this.aClass16_Sub1_15.method3937(arg2);
		this.aClass16_Sub1_15.method3946(1, Static190.aClass265_8);
		this.aClass16_Sub1_15.method3950(1, Static190.aClass265_8);
		this.aClass16_Sub1_15.method3939(arg3);
		local8.method5156((float) this.anInt7038, 0.0F, (float) this.anInt7037);
		local8.method5142(local18, local23, 0);
		local13.method5156(this.anInterface20_5.method6625((float) this.anInt7038), 1.0F, this.anInterface20_5.method6627((float) this.anInt7037));
		this.aClass16_Sub1_15.method3908(Static465.aClass207_6);
		this.aClass16_Sub1_15.method3986();
		this.aClass16_Sub1_15.method3961();
		this.aClass16_Sub1_15.method3930();
		this.aClass16_Sub1_15.method3946(1, Static613.aClass265_9);
		this.aClass16_Sub1_15.method3950(1, Static613.aClass265_9);
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(IIII)V")
	@Override
	public void method5778(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt7033 = arg2;
		this.anInt7043 = arg1;
		this.anInt7048 = arg3;
		this.anInt7053 = arg0;
		this.aBoolean499 = this.anInt7053 != 0 || this.anInt7043 != 0 || this.anInt7033 != 0 || this.anInt7048 != 0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(FFFFFFIIII)V")
	@Override
	protected void method5786(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(2) float arg2, @OriginalArg(3) float arg3, @OriginalArg(4) float arg4, @OriginalArg(5) float arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		@Pc(8) Class54_Sub3 local8 = this.aClass16_Sub1_15.method3945();
		@Pc(13) Class54_Sub3 local13 = this.aClass16_Sub1_15.method3906();
		this.anInterface20_5.method8280(this.aBoolean498 || this.aBoolean494 ? Static116.aClass277_4 : Static579.aClass277_10);
		this.aClass16_Sub1_15.method3951();
		this.aClass16_Sub1_15.method3889(this.anInterface20_5);
		this.aClass16_Sub1_15.method3956(1);
		this.aClass16_Sub1_15.method3937(arg6);
		this.aClass16_Sub1_15.method3946(1, Static190.aClass265_8);
		this.aClass16_Sub1_15.method3950(1, Static190.aClass265_8);
		this.aClass16_Sub1_15.method3939(arg7);
		if (this.aBoolean499) {
			@Pc(77) float local77 = (float) this.method5779();
			@Pc(81) float local81 = (float) this.method5785();
			@Pc(88) float local88 = (arg2 - arg0) / local77;
			@Pc(94) float local94 = (arg3 - arg1) / local77;
			@Pc(101) float local101 = (arg4 - arg0) / local81;
			@Pc(108) float local108 = (arg5 - arg1) / local81;
			@Pc(114) float local114 = local101 * (float) this.anInt7043;
			@Pc(120) float local120 = (float) this.anInt7043 * local108;
			@Pc(126) float local126 = local88 * (float) this.anInt7053;
			@Pc(132) float local132 = local94 * (float) this.anInt7053;
			@Pc(139) float local139 = (float) this.anInt7033 * -local88;
			@Pc(146) float local146 = -local94 * (float) this.anInt7033;
			@Pc(153) float local153 = -local101 * (float) this.anInt7048;
			@Pc(160) float local160 = -local108 * (float) this.anInt7048;
			arg4 = local153 + local126 + arg4;
			arg3 = local120 + arg3 + local146;
			arg0 = arg0 + local126 + local114;
			arg1 = local120 + arg1 + local132;
			arg2 = local114 + local139 + arg2;
			arg5 = local160 + local132 + arg5;
		}
		local8.method5168(0.0F, 0.0F, 0.0F, 1.0F, arg4 - arg0, 0.0F, arg3 - arg1, arg2 - arg0, arg5 - arg1);
		local8.method5161(0.0F, arg0, arg1);
		local13.method5156(this.anInterface20_5.method6625((float) this.anInt7038), 1.0F, this.anInterface20_5.method6627((float) this.anInt7037));
		this.aClass16_Sub1_15.method3908(Static465.aClass207_6);
		this.aClass16_Sub1_15.method3986();
		this.aClass16_Sub1_15.method3961();
		this.aClass16_Sub1_15.method3930();
		this.aClass16_Sub1_15.method3946(1, Static613.aClass265_9);
		this.aClass16_Sub1_15.method3950(1, Static613.aClass265_9);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIIIII)V")
	@Override
	protected void method5781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(8) Class54_Sub3 local8 = this.aClass16_Sub1_15.method3945();
		@Pc(13) Class54_Sub3 local13 = this.aClass16_Sub1_15.method3906();
		this.anInterface20_5.method8280(this.aBoolean498 || this.aBoolean494 ? Static116.aClass277_4 : Static579.aClass277_10);
		this.aClass16_Sub1_15.method3951();
		this.aClass16_Sub1_15.method3889(this.anInterface20_5);
		this.aClass16_Sub1_15.method3956(arg6);
		this.aClass16_Sub1_15.method3937(arg4);
		this.aClass16_Sub1_15.method3946(1, Static190.aClass265_8);
		this.aClass16_Sub1_15.method3950(1, Static190.aClass265_8);
		this.aClass16_Sub1_15.method3939(arg5);
		local13.method5156(this.anInterface20_5.method6625((float) this.anInt7038), 1.0F, this.anInterface20_5.method6627((float) this.anInt7037));
		if (this.aBoolean499) {
			arg2 = this.anInt7037 * arg2 / this.method5779();
			arg3 = this.anInt7038 * arg3 / this.method5785();
			arg0 += this.anInt7053 * arg2 / this.anInt7037;
			arg1 += this.anInt7043 * arg3 / this.anInt7038;
		}
		local8.method5156((float) arg3, 0.0F, (float) arg2);
		local8.method5142(arg0, arg1, 0);
		this.aClass16_Sub1_15.method3908(Static465.aClass207_6);
		this.aClass16_Sub1_15.method3986();
		this.aClass16_Sub1_15.method3961();
		this.aClass16_Sub1_15.method3930();
		this.aClass16_Sub1_15.method3946(1, Static613.aClass265_9);
		this.aClass16_Sub1_15.method3950(1, Static613.aClass265_9);
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIIII)V")
	@Override
	public void method5798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(13) int[] local13 = this.aClass16_Sub1_15.na(arg4, arg5, arg2, arg3);
		if (local13 != null) {
			for (@Pc(17) int local17 = 0; local17 < local13.length; local17++) {
				local13[local17] |= 0xFF000000;
			}
			this.method5803(arg0, arg1, arg2, arg3, local13, arg2);
		}
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "()I")
	@Override
	public int method5790() {
		return this.anInt7037;
	}
}
