import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!da")
public final class Class1_Sub2_Sub3_Sub2 extends Class1_Sub2_Sub3 {

	@OriginalMember(owner = "client!da", name = "db", descriptor = "[I")
	public int[] anIntArray103;

	@OriginalMember(owner = "client!da", name = "eb", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!da", name = "fb", descriptor = "[I")
	public int[] anIntArray104;

	@OriginalMember(owner = "client!da", name = "gb", descriptor = "[I")
	public int[] anIntArray105;

	@OriginalMember(owner = "client!da", name = "hb", descriptor = "[I")
	public int[] anIntArray106;

	@OriginalMember(owner = "client!da", name = "ib", descriptor = "[[I")
	public int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!da", name = "kb", descriptor = "I")
	private int anInt564;

	@OriginalMember(owner = "client!da", name = "lb", descriptor = "[[I")
	public int[][] anIntArrayArray6;

	@OriginalMember(owner = "client!da", name = "mb", descriptor = "[I")
	public int[] anIntArray107;

	@OriginalMember(owner = "client!da", name = "nb", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!da", name = "ob", descriptor = "I")
	private int anInt565;

	@OriginalMember(owner = "client!da", name = "qb", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!da", name = "rb", descriptor = "I")
	private int anInt566;

	@OriginalMember(owner = "client!da", name = "tb", descriptor = "[I")
	public int[] anIntArray108;

	@OriginalMember(owner = "client!da", name = "ub", descriptor = "[I")
	public int[] anIntArray109;

	@OriginalMember(owner = "client!da", name = "vb", descriptor = "[S")
	public short[] aShortArray1;

	@OriginalMember(owner = "client!da", name = "wb", descriptor = "[I")
	public int[] anIntArray110;

	@OriginalMember(owner = "client!da", name = "xb", descriptor = "[I")
	public int[] anIntArray111;

	@OriginalMember(owner = "client!da", name = "yb", descriptor = "[I")
	public int[] anIntArray112;

	@OriginalMember(owner = "client!da", name = "zb", descriptor = "[I")
	public int[] anIntArray113;

	@OriginalMember(owner = "client!da", name = "Cb", descriptor = "I")
	private int anInt569;

	@OriginalMember(owner = "client!da", name = "Db", descriptor = "I")
	private int anInt570;

	@OriginalMember(owner = "client!da", name = "dc", descriptor = "[I")
	public int[] anIntArray129;

	@OriginalMember(owner = "client!da", name = "cb", descriptor = "B")
	public byte aByte1 = 0;

	@OriginalMember(owner = "client!da", name = "Ab", descriptor = "Z")
	public boolean aBoolean19 = false;

	@OriginalMember(owner = "client!da", name = "Bb", descriptor = "I")
	public int anInt568 = 0;

	@OriginalMember(owner = "client!da", name = "sb", descriptor = "I")
	public int anInt567 = 0;

	@OriginalMember(owner = "client!da", name = "Eb", descriptor = "I")
	public int anInt571 = 0;

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub3_Sub2() {
	}

	@OriginalMember(owner = "client!da", name = "<init>", descriptor = "([Lclient!da;I)V")
	public Class1_Sub2_Sub3_Sub2(@OriginalArg(0) Class1_Sub2_Sub3_Sub2[] arg0, @OriginalArg(1) int arg1) {
		@Pc(18) boolean local18 = false;
		@Pc(20) boolean local20 = false;
		@Pc(22) boolean local22 = false;
		this.anInt567 = 0;
		this.anInt571 = 0;
		this.anInt568 = 0;
		this.aByte1 = -1;
		for (@Pc(36) int local36 = 0; local36 < arg1; local36++) {
			@Pc(41) Class1_Sub2_Sub3_Sub2 local41 = arg0[local36];
			if (local41 != null) {
				this.anInt567 += local41.anInt567;
				this.anInt571 += local41.anInt571;
				this.anInt568 += local41.anInt568;
				if (local41.aByteArray5 == null) {
					if (this.aByte1 == -1) {
						this.aByte1 = local41.aByte1;
					}
					if (this.aByte1 != local41.aByte1) {
						local18 = true;
					}
				} else {
					local18 = true;
				}
				local20 |= local41.aByteArray8 != null;
				local22 |= local41.aByteArray6 != null;
			}
		}
		this.anIntArray111 = new int[this.anInt567];
		this.anIntArray108 = new int[this.anInt567];
		this.anIntArray113 = new int[this.anInt567];
		this.anIntArray129 = new int[this.anInt571];
		this.anIntArray106 = new int[this.anInt571];
		this.anIntArray112 = new int[this.anInt571];
		this.anIntArray110 = new int[this.anInt571];
		this.anIntArray105 = new int[this.anInt571];
		this.anIntArray103 = new int[this.anInt571];
		if (this.anInt568 > 0) {
			this.anIntArray109 = new int[this.anInt568];
			this.anIntArray107 = new int[this.anInt568];
			this.anIntArray104 = new int[this.anInt568];
		}
		if (local18) {
			this.aByteArray5 = new byte[this.anInt571];
		}
		if (local20) {
			this.aByteArray8 = new byte[this.anInt571];
		}
		if (local22) {
			this.aByteArray6 = new byte[this.anInt571];
			this.aShortArray1 = new short[this.anInt571];
		}
		this.anInt567 = 0;
		this.anInt571 = 0;
		this.anInt568 = 0;
		@Pc(207) int local207 = 0;
		for (@Pc(209) int local209 = 0; local209 < arg1; local209++) {
			@Pc(214) Class1_Sub2_Sub3_Sub2 local214 = arg0[local209];
			if (local214 != null) {
				@Pc(219) int local219 = this.anInt567;
				for (@Pc(221) int local221 = 0; local221 < local214.anInt567; local221++) {
					this.anIntArray111[this.anInt567] = local214.anIntArray111[local221];
					this.anIntArray108[this.anInt567] = local214.anIntArray108[local221];
					this.anIntArray113[this.anInt567] = local214.anIntArray113[local221];
					this.anInt567++;
				}
				for (@Pc(262) int local262 = 0; local262 < local214.anInt571; local262++) {
					this.anIntArray129[this.anInt571] = local214.anIntArray129[local262] + local219;
					this.anIntArray106[this.anInt571] = local214.anIntArray106[local262] + local219;
					this.anIntArray112[this.anInt571] = local214.anIntArray112[local262] + local219;
					this.anIntArray110[this.anInt571] = local214.anIntArray110[local262];
					this.anIntArray105[this.anInt571] = local214.anIntArray105[local262];
					this.anIntArray103[this.anInt571] = local214.anIntArray103[local262];
					if (local18) {
						if (local214.aByteArray5 == null) {
							this.aByteArray5[this.anInt571] = local214.aByte1;
						} else {
							this.aByteArray5[this.anInt571] = local214.aByteArray5[local262];
						}
					}
					if (local20) {
						if (local214.aByteArray8 == null) {
							this.aByteArray8[this.anInt571] = 0;
						} else {
							this.aByteArray8[this.anInt571] = local214.aByteArray8[local262];
						}
					}
					if (local22) {
						if (local214.aByteArray6 == null || local214.aByteArray6[local262] == -1) {
							this.aByteArray6[this.anInt571] = -1;
						} else {
							this.aByteArray6[this.anInt571] = (byte) (local214.aByteArray6[local262] + local207);
							this.aShortArray1[this.anInt571] = local214.aShortArray1[local262];
						}
					}
					this.anInt571++;
				}
				for (@Pc(418) int local418 = 0; local418 < local214.anInt568; local418++) {
					this.anIntArray109[this.anInt568] = local214.anIntArray109[local418] + local219;
					this.anIntArray107[this.anInt568] = local214.anIntArray107[local418] + local219;
					this.anIntArray104[this.anInt568] = local214.anIntArray104[local418] + local219;
					this.anInt568++;
				}
				local207 += local214.anInt568;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(I[IIII)V")
	private void method459(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(2) int local2 = arg1.length;
		@Pc(6) int local6;
		@Pc(14) int local14;
		@Pc(31) int local31;
		@Pc(36) int local36;
		if (arg0 == 0) {
			local6 = 0;
			Static20.anInt572 = 0;
			Static20.anInt577 = 0;
			Static20.anInt576 = 0;
			for (local14 = 0; local14 < local2; local14++) {
				@Pc(19) int local19 = arg1[local14];
				if (local19 < this.anIntArrayArray6.length) {
					@Pc(29) int[] local29 = this.anIntArrayArray6[local19];
					for (local31 = 0; local31 < local29.length; local31++) {
						local36 = local29[local31];
						Static20.anInt572 += this.anIntArray111[local36];
						Static20.anInt577 += this.anIntArray108[local36];
						Static20.anInt576 += this.anIntArray113[local36];
						local6++;
					}
				}
			}
			if (local6 > 0) {
				Static20.anInt572 = Static20.anInt572 / local6 + arg2;
				Static20.anInt577 = Static20.anInt577 / local6 + arg3;
				Static20.anInt576 = Static20.anInt576 / local6 + arg4;
			} else {
				Static20.anInt572 = arg2;
				Static20.anInt577 = arg3;
				Static20.anInt576 = arg4;
			}
			return;
		}
		@Pc(115) int[] local115;
		@Pc(117) int local117;
		if (arg0 == 1) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray6.length) {
					local115 = this.anIntArrayArray6[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray111[local31] += arg2;
						this.anIntArray108[local31] += arg3;
						this.anIntArray113[local31] += arg4;
					}
				}
			}
		} else if (arg0 == 2) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray6.length) {
					local115 = this.anIntArrayArray6[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray111[local31] -= Static20.anInt572;
						this.anIntArray108[local31] -= Static20.anInt577;
						this.anIntArray113[local31] -= Static20.anInt576;
						local36 = (arg2 & 0xFF) * 8;
						@Pc(219) int local219 = (arg3 & 0xFF) * 8;
						@Pc(225) int local225 = (arg4 & 0xFF) * 8;
						@Pc(231) int local231;
						@Pc(235) int local235;
						@Pc(251) int local251;
						if (local225 != 0) {
							local231 = Static20.anIntArray121[local225];
							local235 = Static20.anIntArray131[local225];
							local251 = this.anIntArray108[local31] * local231 + this.anIntArray111[local31] * local235 >> 16;
							this.anIntArray108[local31] = this.anIntArray108[local31] * local235 - this.anIntArray111[local31] * local231 >> 16;
							this.anIntArray111[local31] = local251;
						}
						if (local36 != 0) {
							local231 = Static20.anIntArray121[local36];
							local235 = Static20.anIntArray131[local36];
							local251 = this.anIntArray108[local31] * local235 - this.anIntArray113[local31] * local231 >> 16;
							this.anIntArray113[local31] = this.anIntArray108[local31] * local231 + this.anIntArray113[local31] * local235 >> 16;
							this.anIntArray108[local31] = local251;
						}
						if (local219 != 0) {
							local231 = Static20.anIntArray121[local219];
							local235 = Static20.anIntArray131[local219];
							local251 = this.anIntArray113[local31] * local231 + this.anIntArray111[local31] * local235 >> 16;
							this.anIntArray113[local31] = this.anIntArray113[local31] * local235 - this.anIntArray111[local31] * local231 >> 16;
							this.anIntArray111[local31] = local251;
						}
						this.anIntArray111[local31] += Static20.anInt572;
						this.anIntArray108[local31] += Static20.anInt577;
						this.anIntArray113[local31] += Static20.anInt576;
					}
				}
			}
		} else if (arg0 == 3) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray6.length) {
					local115 = this.anIntArrayArray6[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						this.anIntArray111[local31] -= Static20.anInt572;
						this.anIntArray108[local31] -= Static20.anInt577;
						this.anIntArray113[local31] -= Static20.anInt576;
						this.anIntArray111[local31] = this.anIntArray111[local31] * arg2 / 128;
						this.anIntArray108[local31] = this.anIntArray108[local31] * arg3 / 128;
						this.anIntArray113[local31] = this.anIntArray113[local31] * arg4 / 128;
						this.anIntArray111[local31] += Static20.anInt572;
						this.anIntArray108[local31] += Static20.anInt577;
						this.anIntArray113[local31] += Static20.anInt576;
					}
				}
			}
		} else if (arg0 == 5 && (this.anIntArrayArray5 != null && this.aByteArray8 != null)) {
			for (local6 = 0; local6 < local2; local6++) {
				local14 = arg1[local6];
				if (local14 < this.anIntArrayArray5.length) {
					local115 = this.anIntArrayArray5[local14];
					for (local117 = 0; local117 < local115.length; local117++) {
						local31 = local115[local117];
						local36 = (this.aByteArray8[local31] & 0xFF) + arg2 * 8;
						if (local36 < 0) {
							local36 = 0;
						} else if (local36 > 255) {
							local36 = 255;
						}
						this.aByteArray8[local31] = (byte) local36;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIZ)Lclient!da;")
	public Class1_Sub2_Sub3_Sub2 method460(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (arg0 == arg1 && arg0 == arg2 && arg0 == arg3) {
			return this;
		}
		@Pc(16) Class1_Sub2_Sub3_Sub2 local16;
		if (arg4) {
			local16 = new Class1_Sub2_Sub3_Sub2();
			local16.anInt567 = this.anInt567;
			local16.anInt571 = this.anInt571;
			local16.anInt568 = this.anInt568;
			local16.anIntArray111 = this.anIntArray111;
			local16.anIntArray113 = this.anIntArray113;
			local16.anIntArray129 = this.anIntArray129;
			local16.anIntArray106 = this.anIntArray106;
			local16.anIntArray112 = this.anIntArray112;
			local16.anIntArray110 = this.anIntArray110;
			local16.anIntArray105 = this.anIntArray105;
			local16.anIntArray103 = this.anIntArray103;
			local16.aByteArray5 = this.aByteArray5;
			local16.aByteArray8 = this.aByteArray8;
			local16.aByteArray6 = this.aByteArray6;
			local16.aShortArray1 = this.aShortArray1;
			local16.aByte1 = this.aByte1;
			local16.anIntArray109 = this.anIntArray109;
			local16.anIntArray107 = this.anIntArray107;
			local16.anIntArray104 = this.anIntArray104;
			local16.anIntArrayArray6 = this.anIntArrayArray6;
			local16.anIntArrayArray5 = this.anIntArrayArray5;
			local16.aBoolean19 = this.aBoolean19;
			local16.anIntArray108 = new int[local16.anInt567];
		} else {
			local16 = this;
		}
		@Pc(122) int local122 = (arg0 + arg1 + arg2 + arg3) / 4;
		for (@Pc(124) int local124 = 0; local124 < local16.anInt567; local124++) {
			@Pc(130) int local130 = this.anIntArray111[local124];
			@Pc(135) int local135 = this.anIntArray108[local124];
			@Pc(140) int local140 = this.anIntArray113[local124];
			@Pc(152) int local152 = arg0 + (arg1 - arg0) * (local130 + 64) / 128;
			@Pc(164) int local164 = arg3 + (arg2 - arg3) * (local130 + 64) / 128;
			@Pc(176) int local176 = local152 + (local164 - local152) * (local140 + 64) / 128;
			local16.anIntArray108[local124] = local135 + local176 - local122;
		}
		local16.anInt566 = 0;
		return local16;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!id;ILclient!id;I[I)V")
	public void method461(@OriginalArg(0) Class1_Sub2_Sub10 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class1_Sub2_Sub10 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int[] arg4) {
		if (arg1 == -1) {
			return;
		}
		if (arg4 == null || arg3 == -1) {
			this.method464(arg0, arg1);
			return;
		}
		@Pc(18) Class30 local18 = arg0.aClass30Array1[arg1];
		@Pc(23) Class30 local23 = arg2.aClass30Array1[arg3];
		@Pc(26) Class1_Sub6 local26 = local18.aClass1_Sub6_1;
		Static20.anInt572 = 0;
		Static20.anInt577 = 0;
		Static20.anInt576 = 0;
		@Pc(34) byte local34 = 0;
		@Pc(37) int local37 = local34 + 1;
		@Pc(39) int local39 = arg4[0];
		@Pc(47) int local47;
		for (@Pc(41) int local41 = 0; local41 < local18.anInt1156; local41++) {
			local47 = local18.anIntArray232[local41];
			while (local47 > local39) {
				local39 = arg4[local37++];
			}
			if (local47 != local39 || local26.anIntArray194[local47] == 0) {
				this.method459(local26.anIntArray194[local47], local26.anIntArrayArray9[local47], local18.anIntArray227[local41], local18.anIntArray231[local41], local18.anIntArray233[local41]);
			}
		}
		Static20.anInt572 = 0;
		Static20.anInt577 = 0;
		Static20.anInt576 = 0;
		local34 = 0;
		local37 = local34 + 1;
		local39 = arg4[0];
		for (local47 = 0; local47 < local23.anInt1156; local47++) {
			@Pc(112) int local112 = local23.anIntArray232[local47];
			while (local112 > local39) {
				local39 = arg4[local37++];
			}
			if (local112 == local39 || local26.anIntArray194[local112] == 0) {
				this.method459(local26.anIntArray194[local112], local26.anIntArrayArray9[local112], local23.anIntArray227[local47], local23.anIntArray231[local47], local23.anIntArray233[local47]);
			}
		}
		this.anInt566 = 0;
	}

	@OriginalMember(owner = "client!da", name = "e", descriptor = "(I)V")
	private void method462(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = Static36.anInt1030;
		@Pc(3) int local3 = Static36.anInt1029;
		@Pc(5) int local5 = 0;
		@Pc(10) int local10 = this.anIntArray129[arg0];
		@Pc(15) int local15 = this.anIntArray106[arg0];
		@Pc(20) int local20 = this.anIntArray112[arg0];
		@Pc(24) int local24 = Static20.anIntArray127[local10];
		@Pc(28) int local28 = Static20.anIntArray127[local15];
		@Pc(32) int local32 = Static20.anIntArray127[local20];
		if (this.aByteArray8 == null) {
			Static36.anInt1024 = 0;
		} else {
			Static36.anInt1024 = this.aByteArray8[arg0] & 0xFF;
		}
		@Pc(73) int local73;
		@Pc(77) int local77;
		@Pc(82) int local82;
		@Pc(95) int local95;
		if (local24 >= 50) {
			Static20.anIntArray128[0] = Static20.anIntArray116[local10];
			Static20.anIntArray126[0] = Static20.anIntArray130[local10];
			local5++;
			Static20.anIntArray124[0] = this.anIntArray110[arg0];
		} else {
			local73 = Static20.anIntArray118[local10];
			local77 = Static20.anIntArray132[local10];
			local82 = this.anIntArray110[arg0];
			if (local32 >= 50) {
				local95 = (50 - local24) * Static20.anIntArray119[local32 - local24];
				Static20.anIntArray128[0] = local1 + (local73 + ((Static20.anIntArray118[local20] - local73) * local95 >> 16) << 9) / 50;
				Static20.anIntArray126[0] = local3 + (local77 + ((Static20.anIntArray132[local20] - local77) * local95 >> 16) << 9) / 50;
				local5++;
				Static20.anIntArray124[0] = local82 + ((this.anIntArray103[arg0] - local82) * local95 >> 16);
			}
			if (local28 >= 50) {
				local95 = (50 - local24) * Static20.anIntArray119[local28 - local24];
				Static20.anIntArray128[local5] = local1 + (local73 + ((Static20.anIntArray118[local15] - local73) * local95 >> 16) << 9) / 50;
				Static20.anIntArray126[local5] = local3 + (local77 + ((Static20.anIntArray132[local15] - local77) * local95 >> 16) << 9) / 50;
				Static20.anIntArray124[local5++] = local82 + ((this.anIntArray105[arg0] - local82) * local95 >> 16);
			}
		}
		if (local28 >= 50) {
			Static20.anIntArray128[local5] = Static20.anIntArray116[local15];
			Static20.anIntArray126[local5] = Static20.anIntArray130[local15];
			Static20.anIntArray124[local5++] = this.anIntArray105[arg0];
		} else {
			local73 = Static20.anIntArray118[local15];
			local77 = Static20.anIntArray132[local15];
			local82 = this.anIntArray105[arg0];
			if (local24 >= 50) {
				local95 = (50 - local28) * Static20.anIntArray119[local24 - local28];
				Static20.anIntArray128[local5] = local1 + (local73 + ((Static20.anIntArray118[local10] - local73) * local95 >> 16) << 9) / 50;
				Static20.anIntArray126[local5] = local3 + (local77 + ((Static20.anIntArray132[local10] - local77) * local95 >> 16) << 9) / 50;
				Static20.anIntArray124[local5++] = local82 + ((this.anIntArray110[arg0] - local82) * local95 >> 16);
			}
			if (local32 >= 50) {
				local95 = (50 - local28) * Static20.anIntArray119[local32 - local28];
				Static20.anIntArray128[local5] = local1 + (local73 + ((Static20.anIntArray118[local20] - local73) * local95 >> 16) << 9) / 50;
				Static20.anIntArray126[local5] = local3 + (local77 + ((Static20.anIntArray132[local20] - local77) * local95 >> 16) << 9) / 50;
				Static20.anIntArray124[local5++] = local82 + ((this.anIntArray103[arg0] - local82) * local95 >> 16);
			}
		}
		if (local32 >= 50) {
			Static20.anIntArray128[local5] = Static20.anIntArray116[local20];
			Static20.anIntArray126[local5] = Static20.anIntArray130[local20];
			Static20.anIntArray124[local5++] = this.anIntArray103[arg0];
		} else {
			local73 = Static20.anIntArray118[local20];
			local77 = Static20.anIntArray132[local20];
			local82 = this.anIntArray103[arg0];
			if (local28 >= 50) {
				local95 = (50 - local32) * Static20.anIntArray119[local28 - local32];
				Static20.anIntArray128[local5] = local1 + (local73 + ((Static20.anIntArray118[local15] - local73) * local95 >> 16) << 9) / 50;
				Static20.anIntArray126[local5] = local3 + (local77 + ((Static20.anIntArray132[local15] - local77) * local95 >> 16) << 9) / 50;
				Static20.anIntArray124[local5++] = local82 + ((this.anIntArray105[arg0] - local82) * local95 >> 16);
			}
			if (local24 >= 50) {
				local95 = (50 - local32) * Static20.anIntArray119[local24 - local32];
				Static20.anIntArray128[local5] = local1 + (local73 + ((Static20.anIntArray118[local10] - local73) * local95 >> 16) << 9) / 50;
				Static20.anIntArray126[local5] = local3 + (local77 + ((Static20.anIntArray132[local10] - local77) * local95 >> 16) << 9) / 50;
				Static20.anIntArray124[local5++] = local82 + ((this.anIntArray110[arg0] - local82) * local95 >> 16);
			}
		}
		local73 = Static20.anIntArray128[0];
		local77 = Static20.anIntArray128[1];
		local82 = Static20.anIntArray128[2];
		local95 = Static20.anIntArray126[0];
		@Pc(590) int local590 = Static20.anIntArray126[1];
		@Pc(594) int local594 = Static20.anIntArray126[2];
		Static36.aBoolean41 = false;
		@Pc(669) int local669;
		@Pc(674) int local674;
		@Pc(679) int local679;
		@Pc(684) int local684;
		if (local5 == 3) {
			if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static36.anInt1031 || local77 > Static36.anInt1031 || local82 > Static36.anInt1031) {
				Static36.aBoolean41 = true;
			}
			if (this.aByteArray6 != null && this.aByteArray6[arg0] != -1) {
				local669 = this.aByteArray6[arg0] & 0xFF;
				local674 = this.anIntArray109[local669];
				local679 = this.anIntArray107[local669];
				local684 = this.anIntArray104[local669];
				if (this.anIntArray103[arg0] == -1) {
					Static36.method846(local95, local590, local594, local73, local77, local82, this.anIntArray110[arg0], this.anIntArray110[arg0], this.anIntArray110[arg0], Static20.anIntArray118[local674], Static20.anIntArray118[local679], Static20.anIntArray118[local684], Static20.anIntArray132[local674], Static20.anIntArray132[local679], Static20.anIntArray132[local684], Static20.anIntArray127[local674], Static20.anIntArray127[local679], Static20.anIntArray127[local684], this.aShortArray1[arg0]);
				} else {
					Static36.method846(local95, local590, local594, local73, local77, local82, Static20.anIntArray124[0], Static20.anIntArray124[1], Static20.anIntArray124[2], Static20.anIntArray118[local674], Static20.anIntArray118[local679], Static20.anIntArray118[local684], Static20.anIntArray132[local674], Static20.anIntArray132[local679], Static20.anIntArray132[local684], Static20.anIntArray127[local674], Static20.anIntArray127[local679], Static20.anIntArray127[local684], this.aShortArray1[arg0]);
				}
			} else if (this.anIntArray103[arg0] == -1) {
				Static36.method843(local95, local590, local594, local73, local77, local82, Static20.anIntArray120[this.anIntArray110[arg0]]);
			} else {
				Static36.method842(local95, local590, local594, local73, local77, local82, Static20.anIntArray124[0], Static20.anIntArray124[1], Static20.anIntArray124[2]);
			}
		}
		if (local5 != 4) {
			return;
		}
		if (local73 < 0 || local77 < 0 || local82 < 0 || local73 > Static36.anInt1031 || local77 > Static36.anInt1031 || local82 > Static36.anInt1031 || Static20.anIntArray128[3] < 0 || Static20.anIntArray128[3] > Static36.anInt1031) {
			Static36.aBoolean41 = true;
		}
		if (this.aByteArray6 == null || this.aByteArray6[arg0] == -1) {
			if (this.anIntArray103[arg0] == -1) {
				local669 = Static20.anIntArray120[this.anIntArray110[arg0]];
				Static36.method843(local95, local590, local594, local73, local77, local82, local669);
				Static36.method843(local95, local594, Static20.anIntArray126[3], local73, local82, Static20.anIntArray128[3], local669);
				return;
			}
			Static36.method842(local95, local590, local594, local73, local77, local82, Static20.anIntArray124[0], Static20.anIntArray124[1], Static20.anIntArray124[2]);
			Static36.method842(local95, local594, Static20.anIntArray126[3], local73, local82, Static20.anIntArray128[3], Static20.anIntArray124[0], Static20.anIntArray124[2], Static20.anIntArray124[3]);
			return;
		}
		local669 = this.aByteArray6[arg0] & 0xFF;
		local674 = this.anIntArray109[local669];
		local679 = this.anIntArray107[local669];
		local684 = this.anIntArray104[local669];
		@Pc(924) short local924 = this.aShortArray1[arg0];
		if (this.anIntArray103[arg0] == -1) {
			Static36.method846(local95, local590, local594, local73, local77, local82, this.anIntArray110[arg0], this.anIntArray110[arg0], this.anIntArray110[arg0], Static20.anIntArray118[local674], Static20.anIntArray118[local679], Static20.anIntArray118[local684], Static20.anIntArray132[local674], Static20.anIntArray132[local679], Static20.anIntArray132[local684], Static20.anIntArray127[local674], Static20.anIntArray127[local679], Static20.anIntArray127[local684], local924);
			Static36.method846(local95, local594, Static20.anIntArray126[3], local73, local82, Static20.anIntArray128[3], this.anIntArray110[arg0], this.anIntArray110[arg0], this.anIntArray110[arg0], Static20.anIntArray118[local674], Static20.anIntArray118[local679], Static20.anIntArray118[local684], Static20.anIntArray132[local674], Static20.anIntArray132[local679], Static20.anIntArray132[local684], Static20.anIntArray127[local674], Static20.anIntArray127[local679], Static20.anIntArray127[local684], local924);
			return;
		}
		Static36.method846(local95, local590, local594, local73, local77, local82, Static20.anIntArray124[0], Static20.anIntArray124[1], Static20.anIntArray124[2], Static20.anIntArray118[local674], Static20.anIntArray118[local679], Static20.anIntArray118[local684], Static20.anIntArray132[local674], Static20.anIntArray132[local679], Static20.anIntArray132[local684], Static20.anIntArray127[local674], Static20.anIntArray127[local679], Static20.anIntArray127[local684], local924);
		Static36.method846(local95, local594, Static20.anIntArray126[3], local73, local82, Static20.anIntArray128[3], Static20.anIntArray124[0], Static20.anIntArray124[2], Static20.anIntArray124[3], Static20.anIntArray118[local674], Static20.anIntArray118[local679], Static20.anIntArray118[local684], Static20.anIntArray132[local674], Static20.anIntArray132[local679], Static20.anIntArray132[local684], Static20.anIntArray127[local674], Static20.anIntArray127[local679], Static20.anIntArray127[local684], local924);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(Z)Lclient!da;")
	public Class1_Sub2_Sub3_Sub2 method463(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static20.aByteArray9.length < this.anInt571) {
			Static20.aByteArray9 = new byte[this.anInt571 + 100];
		}
		return this.method472(arg0, Static20.aClass1_Sub2_Sub3_Sub2_2, Static20.aByteArray9);
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(Lclient!id;I)V")
	public void method464(@OriginalArg(0) Class1_Sub2_Sub10 arg0, @OriginalArg(1) int arg1) {
		if (this.anIntArrayArray6 == null || arg1 == -1) {
			return;
		}
		@Pc(12) Class30 local12 = arg0.aClass30Array1[arg1];
		@Pc(15) Class1_Sub6 local15 = local12.aClass1_Sub6_1;
		Static20.anInt572 = 0;
		Static20.anInt577 = 0;
		Static20.anInt576 = 0;
		for (@Pc(23) int local23 = 0; local23 < local12.anInt1156; local23++) {
			@Pc(29) int local29 = local12.anIntArray232[local23];
			this.method459(local15.anIntArray194[local29], local15.anIntArrayArray9[local29], local12.anIntArray227[local23], local12.anIntArray231[local23], local12.anIntArray233[local23]);
		}
		this.anInt566 = 0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "()V")
	public void method465() {
		if (this.anInt566 == 1) {
			return;
		}
		this.anInt566 = 1;
		super.anInt2778 = 0;
		this.anInt569 = 0;
		this.anInt570 = 0;
		for (@Pc(18) int local18 = 0; local18 < this.anInt567; local18++) {
			@Pc(24) int local24 = this.anIntArray111[local18];
			@Pc(29) int local29 = this.anIntArray108[local18];
			@Pc(34) int local34 = this.anIntArray113[local18];
			if (-local29 > super.anInt2778) {
				super.anInt2778 = -local29;
			}
			if (local29 > this.anInt569) {
				this.anInt569 = local29;
			}
			@Pc(58) int local58 = local24 * local24 + local34 * local34;
			if (local58 > this.anInt570) {
				this.anInt570 = local58;
			}
		}
		this.anInt570 = (int) (Math.sqrt((double) this.anInt570) + 0.99D);
		this.anInt565 = (int) (Math.sqrt((double) (this.anInt570 * this.anInt570 + super.anInt2778 * super.anInt2778)) + 0.99D);
		this.anInt564 = this.anInt565 + (int) (Math.sqrt((double) (this.anInt570 * this.anInt570 + this.anInt569 * this.anInt569)) + 0.99D);
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "()V")
	public void method466() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt567; local1++) {
			@Pc(7) int local7 = this.anIntArray113[local1];
			this.anIntArray113[local1] = this.anIntArray111[local1];
			this.anIntArray111[local1] = -local7;
		}
		this.anInt566 = 0;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "()V")
	public void method467() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt567; local1++) {
			@Pc(7) int local7 = this.anIntArray111[local1];
			this.anIntArray111[local1] = this.anIntArray113[local1];
			this.anIntArray113[local1] = -local7;
		}
		this.anInt566 = 0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIII)V")
	public void method468(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		Static20.anIntArray114[0] = -1;
		if (this.anInt566 != 2 && this.anInt566 != 1) {
			this.method469();
		}
		@Pc(15) int local15 = Static36.anInt1030;
		@Pc(17) int local17 = Static36.anInt1029;
		@Pc(21) int local21 = Static20.anIntArray121[0];
		@Pc(25) int local25 = Static20.anIntArray131[0];
		@Pc(29) int local29 = Static20.anIntArray121[arg0];
		@Pc(33) int local33 = Static20.anIntArray131[arg0];
		@Pc(37) int local37 = Static20.anIntArray121[arg1];
		@Pc(41) int local41 = Static20.anIntArray131[arg1];
		@Pc(45) int local45 = Static20.anIntArray121[arg2];
		@Pc(49) int local49 = Static20.anIntArray131[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt567; local61++) {
			@Pc(67) int local67 = this.anIntArray111[local61];
			@Pc(72) int local72 = this.anIntArray108[local61];
			@Pc(77) int local77 = this.anIntArray113[local61];
			@Pc(89) int local89;
			if (arg1 != 0) {
				local89 = local72 * local37 + local67 * local41 >> 16;
				local72 = local72 * local41 - local67 * local37 >> 16;
				local67 = local89;
			}
			if (arg0 != 0) {
				local89 = local77 * local29 + local67 * local33 >> 16;
				local77 = local77 * local33 - local67 * local29 >> 16;
				local67 = local89;
			}
			local67 += arg3;
			local72 += arg4;
			local77 += arg5;
			local89 = local72 * local49 - local77 * local45 >> 16;
			local77 = local72 * local45 + local77 * local49 >> 16;
			Static20.anIntArray122[local61] = local77 - local59;
			Static20.anIntArray116[local61] = local15 + (local67 << 9) / arg6;
			Static20.anIntArray130[local61] = local17 + (local89 << 9) / arg6;
			if (this.anInt568 > 0) {
				Static20.anIntArray118[local61] = local67;
				Static20.anIntArray132[local61] = local89;
				Static20.anIntArray127[local61] = local77;
			}
		}
		try {
			this.method477(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!da", name = "d", descriptor = "()V")
	private void method469() {
		if (this.anInt566 == 2) {
			return;
		}
		this.anInt566 = 2;
		this.anInt570 = 0;
		for (@Pc(12) int local12 = 0; local12 < this.anInt567; local12++) {
			@Pc(18) int local18 = this.anIntArray111[local12];
			@Pc(23) int local23 = this.anIntArray108[local12];
			@Pc(28) int local28 = this.anIntArray113[local12];
			@Pc(40) int local40 = local18 * local18 + local28 * local28 + local23 * local23;
			if (local40 > this.anInt570) {
				this.anInt570 = local40;
			}
		}
		this.anInt570 = (int) (Math.sqrt((double) this.anInt570) + 0.99D);
		this.anInt565 = this.anInt570;
		this.anInt564 = this.anInt570 + this.anInt570;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(III)V")
	public void method470(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt567; local1++) {
			this.anIntArray111[local1] += arg0;
			this.anIntArray108[local1] += arg1;
			this.anIntArray113[local1] += arg2;
		}
		this.anInt566 = 0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZLclient!da;[B)Lclient!da;")
	private Class1_Sub2_Sub3_Sub2 method472(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class1_Sub2_Sub3_Sub2 arg1, @OriginalArg(2) byte[] arg2) {
		arg1.anInt567 = this.anInt567;
		arg1.anInt571 = this.anInt571;
		arg1.anInt568 = this.anInt568;
		if (arg1.anIntArray111 == null || arg1.anIntArray111.length < this.anInt567) {
			arg1.anIntArray111 = new int[this.anInt567 + 100];
			arg1.anIntArray108 = new int[this.anInt567 + 100];
			arg1.anIntArray113 = new int[this.anInt567 + 100];
		}
		for (@Pc(43) int local43 = 0; local43 < this.anInt567; local43++) {
			arg1.anIntArray111[local43] = this.anIntArray111[local43];
			arg1.anIntArray108[local43] = this.anIntArray108[local43];
			arg1.anIntArray113[local43] = this.anIntArray113[local43];
		}
		if (arg0) {
			arg1.aByteArray8 = this.aByteArray8;
		} else {
			arg1.aByteArray8 = arg2;
			@Pc(88) int local88;
			if (this.aByteArray8 == null) {
				for (local88 = 0; local88 < this.anInt571; local88++) {
					arg1.aByteArray8[local88] = 0;
				}
			} else {
				for (local88 = 0; local88 < this.anInt571; local88++) {
					arg1.aByteArray8[local88] = this.aByteArray8[local88];
				}
			}
		}
		arg1.anIntArray129 = this.anIntArray129;
		arg1.anIntArray106 = this.anIntArray106;
		arg1.anIntArray112 = this.anIntArray112;
		arg1.anIntArray110 = this.anIntArray110;
		arg1.anIntArray105 = this.anIntArray105;
		arg1.anIntArray103 = this.anIntArray103;
		arg1.aByteArray5 = this.aByteArray5;
		arg1.aByteArray6 = this.aByteArray6;
		arg1.aShortArray1 = this.aShortArray1;
		arg1.aByte1 = this.aByte1;
		arg1.anIntArray109 = this.anIntArray109;
		arg1.anIntArray107 = this.anIntArray107;
		arg1.anIntArray104 = this.anIntArray104;
		arg1.anIntArrayArray6 = this.anIntArrayArray6;
		arg1.anIntArrayArray5 = this.anIntArrayArray5;
		arg1.aBoolean19 = this.aBoolean19;
		arg1.anInt566 = 0;
		return arg1;
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(III)V")
	public void method473(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt567; local1++) {
			this.anIntArray111[local1] = this.anIntArray111[local1] * arg0 / 128;
			this.anIntArray108[local1] = this.anIntArray108[local1] * arg1 / 128;
			this.anIntArray113[local1] = this.anIntArray113[local1] * arg2 / 128;
		}
		this.anInt566 = 0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIII)V")
	public void method474(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static20.anIntArray114[0] = -1;
		if (this.anInt566 != 2 && this.anInt566 != 1) {
			this.method469();
		}
		@Pc(15) int local15 = Static36.anInt1030;
		@Pc(17) int local17 = Static36.anInt1029;
		@Pc(21) int local21 = Static20.anIntArray121[0];
		@Pc(25) int local25 = Static20.anIntArray131[0];
		@Pc(29) int local29 = Static20.anIntArray121[arg0];
		@Pc(33) int local33 = Static20.anIntArray131[arg0];
		@Pc(37) int local37 = Static20.anIntArray121[arg1];
		@Pc(41) int local41 = Static20.anIntArray131[arg1];
		@Pc(45) int local45 = Static20.anIntArray121[arg2];
		@Pc(49) int local49 = Static20.anIntArray131[arg2];
		@Pc(59) int local59 = arg4 * local45 + arg5 * local49 >> 16;
		for (@Pc(61) int local61 = 0; local61 < this.anInt567; local61++) {
			@Pc(67) int local67 = this.anIntArray111[local61];
			@Pc(72) int local72 = this.anIntArray108[local61];
			@Pc(77) int local77 = this.anIntArray113[local61];
			@Pc(89) int local89;
			if (arg1 != 0) {
				local89 = local72 * local37 + local67 * local41 >> 16;
				local72 = local72 * local41 - local67 * local37 >> 16;
				local67 = local89;
			}
			if (arg0 != 0) {
				local89 = local77 * local29 + local67 * local33 >> 16;
				local77 = local77 * local33 - local67 * local29 >> 16;
				local67 = local89;
			}
			local67 += arg3;
			local72 += arg4;
			local77 += arg5;
			local89 = local72 * local49 - local77 * local45 >> 16;
			local77 = local72 * local45 + local77 * local49 >> 16;
			Static20.anIntArray122[local61] = local77 - local59;
			Static20.anIntArray116[local61] = local15 + (local67 << 9) / local77;
			Static20.anIntArray130[local61] = local17 + (local89 << 9) / local77;
			if (this.anInt568 > 0) {
				Static20.anIntArray118[local61] = local67;
				Static20.anIntArray132[local61] = local89;
				Static20.anIntArray127[local61] = local77;
			}
		}
		try {
			this.method477(false, false, 0);
		} catch (@Pc(236) Exception local236) {
		}
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "()I")
	public int method475() {
		this.method465();
		return this.anInt570;
	}

	@OriginalMember(owner = "client!da", name = "f", descriptor = "(I)V")
	private void method476(@OriginalArg(0) int arg0) {
		if (Static20.aBooleanArray3[arg0]) {
			this.method462(arg0);
			return;
		}
		@Pc(12) int local12 = this.anIntArray129[arg0];
		@Pc(17) int local17 = this.anIntArray106[arg0];
		@Pc(22) int local22 = this.anIntArray112[arg0];
		Static36.aBoolean41 = Static20.aBooleanArray2[arg0];
		if (this.aByteArray8 == null) {
			Static36.anInt1024 = 0;
		} else {
			Static36.anInt1024 = this.aByteArray8[arg0] & 0xFF;
		}
		if (this.aByteArray6 != null && this.aByteArray6[arg0] != -1) {
			@Pc(119) int local119 = this.aByteArray6[arg0] & 0xFF;
			@Pc(124) int local124 = this.anIntArray109[local119];
			@Pc(129) int local129 = this.anIntArray107[local119];
			@Pc(134) int local134 = this.anIntArray104[local119];
			if (this.anIntArray103[arg0] == -1) {
				Static36.method846(Static20.anIntArray130[local12], Static20.anIntArray130[local17], Static20.anIntArray130[local22], Static20.anIntArray116[local12], Static20.anIntArray116[local17], Static20.anIntArray116[local22], this.anIntArray110[arg0], this.anIntArray110[arg0], this.anIntArray110[arg0], Static20.anIntArray118[local124], Static20.anIntArray118[local129], Static20.anIntArray118[local134], Static20.anIntArray132[local124], Static20.anIntArray132[local129], Static20.anIntArray132[local134], Static20.anIntArray127[local124], Static20.anIntArray127[local129], Static20.anIntArray127[local134], this.aShortArray1[arg0]);
			} else {
				Static36.method846(Static20.anIntArray130[local12], Static20.anIntArray130[local17], Static20.anIntArray130[local22], Static20.anIntArray116[local12], Static20.anIntArray116[local17], Static20.anIntArray116[local22], this.anIntArray110[arg0], this.anIntArray105[arg0], this.anIntArray103[arg0], Static20.anIntArray118[local124], Static20.anIntArray118[local129], Static20.anIntArray118[local134], Static20.anIntArray132[local124], Static20.anIntArray132[local129], Static20.anIntArray132[local134], Static20.anIntArray127[local124], Static20.anIntArray127[local129], Static20.anIntArray127[local134], this.aShortArray1[arg0]);
			}
		} else if (this.anIntArray103[arg0] == -1) {
			Static36.method843(Static20.anIntArray130[local12], Static20.anIntArray130[local17], Static20.anIntArray130[local22], Static20.anIntArray116[local12], Static20.anIntArray116[local17], Static20.anIntArray116[local22], Static20.anIntArray120[this.anIntArray110[arg0]]);
		} else {
			Static36.method842(Static20.anIntArray130[local12], Static20.anIntArray130[local17], Static20.anIntArray130[local22], Static20.anIntArray116[local12], Static20.anIntArray116[local17], Static20.anIntArray116[local22], this.anIntArray110[arg0], this.anIntArray105[arg0], this.anIntArray103[arg0]);
		}
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ZZI)V")
	private void method477(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (this.anInt564 >= 1600) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anInt564; local6++) {
			Static20.anIntArray114[local6] = 0;
		}
		@Pc(30) int local30;
		@Pc(35) int local35;
		@Pc(40) int local40;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(52) int local52;
		@Pc(67) int local67;
		@Pc(71) int local71;
		@Pc(83) int local83;
		@Pc(87) int local87;
		@Pc(95) int local95;
		for (@Pc(18) int local18 = 0; local18 < this.anInt571; local18++) {
			if (this.anIntArray103[local18] != -2) {
				local30 = this.anIntArray129[local18];
				local35 = this.anIntArray106[local18];
				local40 = this.anIntArray112[local18];
				local44 = Static20.anIntArray116[local30];
				local48 = Static20.anIntArray116[local35];
				local52 = Static20.anIntArray116[local40];
				if (arg0 && (local44 == -5000 || local48 == -5000 || local52 == -5000)) {
					local67 = Static20.anIntArray118[local30];
					local71 = Static20.anIntArray118[local35];
					@Pc(75) int local75 = Static20.anIntArray118[local40];
					@Pc(79) int local79 = Static20.anIntArray132[local30];
					local83 = Static20.anIntArray132[local35];
					local87 = Static20.anIntArray132[local40];
					@Pc(91) int local91 = Static20.anIntArray127[local30];
					local95 = Static20.anIntArray127[local35];
					@Pc(99) int local99 = Static20.anIntArray127[local40];
					local67 -= local71;
					@Pc(107) int local107 = local75 - local71;
					@Pc(111) int local111 = local79 - local83;
					@Pc(115) int local115 = local87 - local83;
					@Pc(119) int local119 = local91 - local95;
					@Pc(123) int local123 = local99 - local95;
					@Pc(131) int local131 = local111 * local123 - local119 * local115;
					@Pc(139) int local139 = local119 * local107 - local67 * local123;
					@Pc(147) int local147 = local67 * local115 - local111 * local107;
					if (local71 * local131 + local83 * local139 + local95 * local147 > 0) {
						Static20.aBooleanArray3[local18] = true;
						@Pc(180) int local180 = (Static20.anIntArray122[local30] + Static20.anIntArray122[local35] + Static20.anIntArray122[local40]) / 3 + this.anInt565;
						Static20.anIntArrayArray7[local180][Static20.anIntArray114[local180]++] = local18;
					}
				} else {
					if (arg1 && this.method479(Static20.anInt573, Static20.anInt574, Static20.anIntArray130[local30], Static20.anIntArray130[local35], Static20.anIntArray130[local40], local44, local48, local52)) {
						Static20.anIntArray133[Static20.anInt575++] = arg2;
						arg1 = false;
					}
					if ((local44 - local48) * (Static20.anIntArray130[local40] - Static20.anIntArray130[local35]) - (Static20.anIntArray130[local30] - Static20.anIntArray130[local35]) * (local52 - local48) > 0) {
						Static20.aBooleanArray3[local18] = false;
						if (local44 >= 0 && local48 >= 0 && local52 >= 0 && local44 <= Static36.anInt1031 && local48 <= Static36.anInt1031 && local52 <= Static36.anInt1031) {
							Static20.aBooleanArray2[local18] = false;
						} else {
							Static20.aBooleanArray2[local18] = true;
						}
						local67 = (Static20.anIntArray122[local30] + Static20.anIntArray122[local35] + Static20.anIntArray122[local40]) / 3 + this.anInt565;
						Static20.anIntArrayArray7[local67][Static20.anIntArray114[local67]++] = local18;
					}
				}
			}
		}
		if (this.aByteArray5 == null) {
			for (local30 = this.anInt564 - 1; local30 >= 0; local30--) {
				local35 = Static20.anIntArray114[local30];
				if (local35 > 0) {
					@Pc(329) int[] local329 = Static20.anIntArrayArray7[local30];
					for (local44 = 0; local44 < local35; local44++) {
						this.method476(local329[local44]);
					}
				}
			}
			return;
		}
		for (local30 = 0; local30 < 12; local30++) {
			Static20.anIntArray117[local30] = 0;
			Static20.anIntArray123[local30] = 0;
		}
		for (local35 = this.anInt564 - 1; local35 >= 0; local35--) {
			local40 = Static20.anIntArray114[local35];
			if (local40 > 0) {
				@Pc(376) int[] local376 = Static20.anIntArrayArray7[local35];
				for (local48 = 0; local48 < local40; local48++) {
					local52 = local376[local48];
					@Pc(388) byte local388 = this.aByteArray5[local52];
					local71 = Static20.anIntArray117[local388]++;
					Static20.anIntArrayArray8[local388][local71] = local52;
					if (local388 < 10) {
						Static20.anIntArray123[local388] += local35;
					} else if (local388 == 10) {
						Static20.anIntArray125[local71] = local35;
					} else {
						Static20.anIntArray115[local71] = local35;
					}
				}
			}
		}
		local40 = 0;
		if (Static20.anIntArray117[1] > 0 || Static20.anIntArray117[2] > 0) {
			local40 = (Static20.anIntArray123[1] + Static20.anIntArray123[2]) / (Static20.anIntArray117[1] + Static20.anIntArray117[2]);
		}
		local44 = 0;
		if (Static20.anIntArray117[3] > 0 || Static20.anIntArray117[4] > 0) {
			local44 = (Static20.anIntArray123[3] + Static20.anIntArray123[4]) / (Static20.anIntArray117[3] + Static20.anIntArray117[4]);
		}
		local48 = 0;
		if (Static20.anIntArray117[6] > 0 || Static20.anIntArray117[8] > 0) {
			local48 = (Static20.anIntArray123[6] + Static20.anIntArray123[8]) / (Static20.anIntArray117[6] + Static20.anIntArray117[8]);
		}
		local67 = 0;
		local71 = Static20.anIntArray117[10];
		@Pc(521) int[] local521 = Static20.anIntArrayArray8[10];
		@Pc(523) int[] local523 = Static20.anIntArray125;
		if (local71 == 0) {
			local67 = 0;
			local71 = Static20.anIntArray117[11];
			local521 = Static20.anIntArrayArray8[11];
			local523 = Static20.anIntArray115;
		}
		if (local71 > 0) {
			local52 = local523[0];
		} else {
			local52 = -1000;
		}
		for (local83 = 0; local83 < 10; local83++) {
			while (local83 == 0 && local52 > local40) {
				this.method476(local521[local67++]);
				if (local67 == local71 && local521 != Static20.anIntArrayArray8[11]) {
					local67 = 0;
					local71 = Static20.anIntArray117[11];
					local521 = Static20.anIntArrayArray8[11];
					local523 = Static20.anIntArray115;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 3 && local52 > local44) {
				this.method476(local521[local67++]);
				if (local67 == local71 && local521 != Static20.anIntArrayArray8[11]) {
					local67 = 0;
					local71 = Static20.anIntArray117[11];
					local521 = Static20.anIntArrayArray8[11];
					local523 = Static20.anIntArray115;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			while (local83 == 5 && local52 > local48) {
				this.method476(local521[local67++]);
				if (local67 == local71 && local521 != Static20.anIntArrayArray8[11]) {
					local67 = 0;
					local71 = Static20.anIntArray117[11];
					local521 = Static20.anIntArrayArray8[11];
					local523 = Static20.anIntArray115;
				}
				if (local67 < local71) {
					local52 = local523[local67];
				} else {
					local52 = -1000;
				}
			}
			local87 = Static20.anIntArray117[local83];
			@Pc(686) int[] local686 = Static20.anIntArrayArray8[local83];
			for (local95 = 0; local95 < local87; local95++) {
				this.method476(local686[local95]);
			}
		}
		while (local52 != -1000) {
			this.method476(local521[local67++]);
			if (local67 == local71 && local521 != Static20.anIntArrayArray8[11]) {
				local67 = 0;
				local521 = Static20.anIntArrayArray8[11];
				local71 = Static20.anIntArray117[11];
				local523 = Static20.anIntArray115;
			}
			if (local67 < local71) {
				local52 = local523[local67];
			} else {
				local52 = -1000;
			}
		}
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "(I)V")
	public void method478(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = Static20.anIntArray121[arg0];
		@Pc(7) int local7 = Static20.anIntArray131[arg0];
		for (@Pc(9) int local9 = 0; local9 < this.anInt567; local9++) {
			@Pc(26) int local26 = this.anIntArray108[local9] * local7 - this.anIntArray113[local9] * local3 >> 16;
			this.anIntArray113[local9] = this.anIntArray108[local9] * local3 + this.anIntArray113[local9] * local7 >> 16;
			this.anIntArray108[local9] = local26;
		}
		this.anInt566 = 0;
	}

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIII)V")
	@Override
	public void method1968(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8) {
		Static20.anIntArray114[0] = -1;
		if (this.anInt566 != 1) {
			this.method465();
		}
		@Pc(19) int local19 = arg7 * arg4 - arg5 * arg3 >> 16;
		@Pc(29) int local29 = arg6 * arg1 + local19 * arg2 >> 16;
		@Pc(36) int local36 = this.anInt570 * arg2 >> 16;
		@Pc(40) int local40 = local29 + local36;
		if (local40 <= 50 || local29 >= 3500) {
			return;
		}
		@Pc(57) int local57 = arg7 * arg3 + arg5 * arg4 >> 16;
		@Pc(64) int local64 = local57 - this.anInt570 << 9;
		if (local64 / local40 >= Static36.anInt1032) {
			return;
		}
		@Pc(77) int local77 = local57 + this.anInt570 << 9;
		if (local77 / local40 <= Static36.anInt1025) {
			return;
		}
		@Pc(93) int local93 = arg6 * arg2 - local19 * arg1 >> 16;
		@Pc(100) int local100 = this.anInt570 * arg1 >> 16;
		@Pc(106) int local106 = local93 + local100 << 9;
		if (local106 / local40 <= Static36.anInt1028) {
			return;
		}
		@Pc(121) int local121 = local100 + (super.anInt2778 * arg2 >> 16);
		@Pc(127) int local127 = local93 - local121 << 9;
		if (local127 / local40 >= Static36.anInt1027) {
			return;
		}
		@Pc(142) int local142 = local36 + (super.anInt2778 * arg1 >> 16);
		@Pc(144) boolean local144 = false;
		@Pc(146) boolean local146 = false;
		if (local29 - local142 <= 50) {
			local146 = true;
		}
		@Pc(162) boolean local162 = local146 || this.anInt568 > 0;
		@Pc(164) boolean local164 = false;
		@Pc(172) int local172;
		@Pc(219) int local219;
		@Pc(223) int local223;
		if (arg8 > 0 && Static20.aBoolean20) {
			local172 = local29 - local36;
			if (local172 <= 50) {
				local172 = 50;
			}
			if (local57 > 0) {
				local64 /= local40;
				local77 /= local172;
			} else {
				local77 /= local40;
				local64 /= local172;
			}
			if (local93 > 0) {
				local127 /= local40;
				local106 /= local172;
			} else {
				local106 /= local40;
				local127 /= local172;
			}
			local219 = Static20.anInt573 - Static36.anInt1030;
			local223 = Static20.anInt574 - Static36.anInt1029;
			if (local219 > local64 && local219 < local77 && local223 > local127 && local223 < local106) {
				if (this.aBoolean19) {
					Static20.anIntArray133[Static20.anInt575++] = arg8;
				} else {
					local164 = true;
				}
			}
		}
		local172 = Static36.anInt1030;
		local219 = Static36.anInt1029;
		local223 = 0;
		@Pc(257) int local257 = 0;
		if (arg0 != 0) {
			local223 = Static20.anIntArray121[arg0];
			local257 = Static20.anIntArray131[arg0];
		}
		for (@Pc(269) int local269 = 0; local269 < this.anInt567; local269++) {
			@Pc(275) int local275 = this.anIntArray111[local269];
			@Pc(280) int local280 = this.anIntArray108[local269];
			@Pc(285) int local285 = this.anIntArray113[local269];
			@Pc(297) int local297;
			if (arg0 != 0) {
				local297 = local285 * local223 + local275 * local257 >> 16;
				local285 = local285 * local257 - local275 * local223 >> 16;
				local275 = local297;
			}
			local275 += arg5;
			local280 += arg6;
			local285 += arg7;
			local297 = local285 * arg3 + local275 * arg4 >> 16;
			local285 = local285 * arg4 - local275 * arg3 >> 16;
			local275 = local297;
			local297 = local280 * arg2 - local285 * arg1 >> 16;
			local285 = local280 * arg1 + local285 * arg2 >> 16;
			Static20.anIntArray122[local269] = local285 - local29;
			if (local285 >= 50) {
				Static20.anIntArray116[local269] = local172 + (local275 << 9) / local285;
				Static20.anIntArray130[local269] = local219 + (local297 << 9) / local285;
			} else {
				Static20.anIntArray116[local269] = -5000;
				local144 = true;
			}
			if (local162) {
				Static20.anIntArray118[local269] = local275;
				Static20.anIntArray132[local269] = local297;
				Static20.anIntArray127[local269] = local285;
			}
		}
		try {
			this.method477(local144, local164, arg8);
		} catch (@Pc(427) Exception local427) {
		}
	}

	@OriginalMember(owner = "client!da", name = "b", descriptor = "(IIIIIIII)Z")
	private boolean method479(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
			return false;
		} else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
			return false;
		} else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
			return false;
		} else {
			return arg0 <= arg5 || arg0 <= arg6 || arg0 <= arg7;
		}
	}

	@OriginalMember(owner = "client!da", name = "g", descriptor = "()V")
	public void method480() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt567; local1++) {
			this.anIntArray111[local1] = -this.anIntArray111[local1];
			this.anIntArray113[local1] = -this.anIntArray113[local1];
		}
		this.anInt566 = 0;
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(Z)Lclient!da;")
	public Class1_Sub2_Sub3_Sub2 method481(@OriginalArg(0) boolean arg0) {
		if (!arg0 && Static20.aByteArray7.length < this.anInt571) {
			Static20.aByteArray7 = new byte[this.anInt571 + 100];
		}
		return this.method472(arg0, Static20.aClass1_Sub2_Sub3_Sub2_1, Static20.aByteArray7);
	}
}
