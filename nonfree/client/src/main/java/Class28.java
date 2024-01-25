import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bba")
public final class Class28 {

	@OriginalMember(owner = "client!bba", name = "h", descriptor = "I")
	private int anInt1123;

	@OriginalMember(owner = "client!bba", name = "m", descriptor = "[Z")
	private boolean[] aBooleanArray2;

	@OriginalMember(owner = "client!bba", name = "p", descriptor = "Lclient!ha;")
	private Class4_Sub6_Sub7 aClass4_Sub6_Sub7_1;

	@OriginalMember(owner = "client!bba", name = "q", descriptor = "I")
	private int anInt1130;

	@OriginalMember(owner = "client!bba", name = "v", descriptor = "I")
	private int anInt1135;

	@OriginalMember(owner = "client!bba", name = "z", descriptor = "I")
	private int anInt1138;

	@OriginalMember(owner = "client!bba", name = "A", descriptor = "Lclient!fo;")
	private Class111 aClass111_1;

	@OriginalMember(owner = "client!bba", name = "B", descriptor = "Lclient!da;")
	private Class65 aClass65_1;

	@OriginalMember(owner = "client!bba", name = "I", descriptor = "Lclient!hda;")
	public Class21_Sub5 aClass21_Sub5_1;

	@OriginalMember(owner = "client!bba", name = "r", descriptor = "I")
	private int anInt1131 = 0;

	@OriginalMember(owner = "client!bba", name = "n", descriptor = "I")
	private int anInt1128 = -1;

	@OriginalMember(owner = "client!bba", name = "E", descriptor = "Z")
	private boolean aBoolean105 = false;

	@OriginalMember(owner = "client!bba", name = "y", descriptor = "I")
	private int anInt1137 = -1;

	@OriginalMember(owner = "client!bba", name = "u", descriptor = "I")
	private int anInt1134 = -1;

	@OriginalMember(owner = "client!bba", name = "G", descriptor = "I")
	private int anInt1141 = 0;

	@OriginalMember(owner = "client!bba", name = "D", descriptor = "Z")
	private boolean aBoolean104 = false;

	@OriginalMember(owner = "client!bba", name = "J", descriptor = "B")
	private final byte aByte10;

	@OriginalMember(owner = "client!bba", name = "w", descriptor = "Lclient!vj;")
	private final Class21_Sub1 aClass21_Sub1_1;

	@OriginalMember(owner = "client!bba", name = "c", descriptor = "B")
	private final byte aByte9;

	@OriginalMember(owner = "client!bba", name = "L", descriptor = "I")
	public final int anInt1144;

	@OriginalMember(owner = "client!bba", name = "j", descriptor = "I")
	public final int anInt1125;

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "I")
	public final int anInt1119;

	@OriginalMember(owner = "client!bba", name = "f", descriptor = "Z")
	private boolean aBoolean103;

	@OriginalMember(owner = "client!bba", name = "<init>", descriptor = "(Lclient!r;Lclient!nf;IIIILclient!vj;ZI)V")
	public Class28(@OriginalArg(0) Class7 arg0, @OriginalArg(1) Class233 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class21_Sub1 arg6, @OriginalArg(7) boolean arg7, @OriginalArg(8) int arg8) {
		this.aByte10 = (byte) arg5;
		this.aBoolean105 = arg7;
		this.aClass21_Sub1_1 = arg6;
		this.aByte9 = (byte) arg4;
		this.anInt1144 = arg2;
		this.anInt1125 = arg3;
		this.anInt1119 = arg1.anInt6713;
		this.aBoolean103 = arg0.method7782() && arg1.aBoolean466 && !this.aBoolean105;
		if (arg8 != -1) {
			this.aBoolean104 = true;
		}
		this.method975(arg8);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZILclient!r;ZZ)Lclient!da;")
	public Class65 method964(@OriginalArg(1) int arg0, @OriginalArg(2) Class7 arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) boolean arg3) {
		@Pc(11) Class233 local11 = Static103.aClass298_1.method6822(this.anInt1119);
		if (local11.anIntArray374 != null) {
			local11 = local11.method5295(Static523.aClass173_1);
		}
		if (local11 == null) {
			this.method968(arg1);
			this.anInt1134 = -1;
			this.anInt1128 = -1;
			this.anInt1137 = -1;
			return null;
		}
		if (!this.aBoolean104 && this.anInt1128 != local11.anInt6713) {
			this.aClass65_1 = null;
			this.method975(-1);
		}
		this.method966(this.aClass21_Sub1_1);
		if (arg2) {
			@Pc(79) boolean local79 = arg2 & this.aBoolean103 & Static455.aClass4_Sub35_Sub1_1.method7614(Static453.anInt8614) != 0;
			arg2 = local79 & (this.anInt1137 != local11.anInt6713 || this.aClass111_1 != null && Static455.aClass4_Sub35_Sub1_1.method7614(Static453.anInt8614) >= 2 && (this.anInt1134 != this.anInt1138 || (this.aClass111_1.aBoolean235 || Static165.aBoolean248) && this.anInt1123 != this.anInt1138));
		}
		if (arg3 && !arg2) {
			this.anInt1128 = local11.anInt6713;
			return null;
		}
		if (arg2) {
			Static440.method6502(this.aClass4_Sub6_Sub7_1, this.aByte10, this.aClass21_Sub1_1.anInt10551, this.aClass21_Sub1_1.anInt10550, this.aBooleanArray2);
			this.anInt1134 = -1;
			this.anInt1137 = -1;
		}
		@Pc(173) Class115 local173 = Static255.aClass115Array2[this.aByte10];
		@Pc(189) Class115 local189;
		if (this.aBoolean105) {
			local189 = Static432.aClass115Array3[0];
		} else {
			local189 = this.aByte10 < 3 ? Static255.aClass115Array2[this.aByte10 + 1] : null;
		}
		@Pc(197) Class65 local197 = null;
		if (this.aClass111_1 != null) {
			if (arg2) {
				arg0 |= 0x40000;
			}
			local197 = local11.method5292(this.anInt1144 == 11 ? 10 : this.anInt1144, local173, arg1, local173.method8064(this.aClass21_Sub1_1.anInt10551, this.aClass21_Sub1_1.anInt10550), this.aClass21_Sub1_1.anInt10550, this.anInt1138, local189, this.anInt1123, arg0, this.anInt1144 == 11 ? this.anInt1125 + 4 : this.anInt1125, this.aClass21_Sub1_1.anInt10551, this.aClass111_1, this.anInt1135);
			if (local197 == null) {
				this.aBooleanArray2 = null;
				this.aClass4_Sub6_Sub7_1 = null;
				this.anInt1131 = 0;
				this.anInt1141 = 0;
			} else {
				if (arg2) {
					if (this.aBooleanArray2 == null) {
						this.aBooleanArray2 = new boolean[4];
					}
					this.aClass4_Sub6_Sub7_1 = local197.S(this.aClass4_Sub6_Sub7_1);
					Static4.method1519(this.aClass4_Sub6_Sub7_1, this.aByte10, this.aClass21_Sub1_1.anInt10551, this.aClass21_Sub1_1.anInt10550, this.aBooleanArray2);
					this.anInt1137 = local11.anInt6713;
					this.anInt1134 = this.anInt1138;
				}
				this.anInt1131 = local197.J();
				this.anInt1141 = local197.RA();
			}
			this.aClass65_1 = null;
		} else if (this.aClass65_1 != null && (this.aClass65_1.PA() & arg0) == arg0 && local11.anInt6713 == this.anInt1128) {
			local197 = this.aClass65_1;
		} else {
			if (this.aClass65_1 != null) {
				arg0 |= this.aClass65_1.PA();
			}
			@Pc(402) Class108 local402 = local11.method5286(local189, local173.method8064(this.aClass21_Sub1_1.anInt10551, this.aClass21_Sub1_1.anInt10550), this.anInt1144 == 11 ? this.anInt1125 + 4 : this.anInt1125, arg1, this.anInt1144 == 11 ? 10 : this.anInt1144, this.aClass21_Sub1_1.anInt10551, local173, arg0, arg2, this.aClass21_Sub1_1.anInt10550);
			if (local402 == null) {
				this.aClass65_1 = null;
				this.anInt1141 = 0;
				this.anInt1131 = 0;
				this.aBooleanArray2 = null;
				this.aClass4_Sub6_Sub7_1 = null;
			} else {
				local197 = local402.aClass65_2;
				this.aClass65_1 = local402.aClass65_2;
				if (arg2) {
					this.aClass4_Sub6_Sub7_1 = local402.aClass4_Sub6_Sub7_2;
					this.aBooleanArray2 = null;
					Static4.method1519(this.aClass4_Sub6_Sub7_1, this.aByte10, this.aClass21_Sub1_1.anInt10551, this.aClass21_Sub1_1.anInt10550, null);
					this.anInt1134 = -1;
					this.anInt1137 = local11.anInt6713;
				}
				this.anInt1131 = local197.J();
				this.anInt1141 = local197.RA();
			}
		}
		this.anInt1128 = local11.anInt6713;
		return local197;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(B)I")
	public int method965(@OriginalArg(0) byte arg0) {
		if (arg0 != 60) {
			this.aBoolean103 = false;
		}
		return this.anInt1141;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lclient!vj;I)V")
	private void method966(@OriginalArg(0) Class21_Sub1 arg0) {
		label80: while (true) {
			if (this.aClass111_1 == null) {
				if (this.aBoolean104) {
					return;
				}
				this.method975(-1);
				if (this.aClass111_1 == null) {
					return;
				}
			}
			@Pc(34) int local34 = Static306.anInt6122 - this.anInt1130;
			if (local34 > 100 && this.aClass111_1.anInt3155 > 0) {
				@Pc(52) int local52 = this.aClass111_1.anIntArray153.length - this.aClass111_1.anInt3155;
				while (this.anInt1138 < local52 && local34 > this.aClass111_1.anIntArray150[this.anInt1138]) {
					local34 -= this.aClass111_1.anIntArray150[this.anInt1138];
					this.anInt1138++;
				}
				if (local52 <= this.anInt1138) {
					@Pc(91) int local91 = 0;
					for (@Pc(93) int local93 = local52; local93 < this.aClass111_1.anIntArray153.length; local93++) {
						local91 += this.aClass111_1.anIntArray150[local93];
					}
					local34 %= local91;
				}
				this.anInt1123 = this.anInt1138 + 1;
				if (this.aClass111_1.anIntArray153.length <= this.anInt1123) {
					this.anInt1123 -= this.aClass111_1.anInt3155;
					if (this.anInt1123 < 0 || this.anInt1123 >= this.aClass111_1.anIntArray153.length) {
						this.anInt1123 = -1;
					}
				}
			}
			while (this.aClass111_1.anIntArray150[this.anInt1138] < local34) {
				Static593.method8263(this.anInt1138, arg0, this.aClass111_1);
				local34 -= this.aClass111_1.anIntArray150[this.anInt1138];
				this.anInt1138++;
				if (this.aClass111_1.anIntArray153.length <= this.anInt1138) {
					this.anInt1138 -= this.aClass111_1.anInt3155;
					if (this.anInt1138 < 0 || this.anInt1138 >= this.aClass111_1.anIntArray153.length) {
						this.aClass111_1 = null;
						continue label80;
					}
				}
				this.anInt1123 = this.anInt1138 + 1;
				if (this.anInt1123 >= this.aClass111_1.anIntArray153.length) {
					this.anInt1123 -= this.aClass111_1.anInt3155;
					if (this.anInt1123 < 0 || this.anInt1123 >= this.aClass111_1.anIntArray153.length) {
						this.anInt1123 = -1;
					}
				}
			}
			this.anInt1135 = local34;
			this.anInt1130 = Static306.anInt6122 - local34;
			return;
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(I)Z")
	public boolean method967() {
		return this.aBoolean103;
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(Lclient!r;B)V")
	public void method968(@OriginalArg(0) Class7 arg0) {
		if (this.aClass4_Sub6_Sub7_1 != null) {
			Static440.method6502(this.aClass4_Sub6_Sub7_1, this.aByte10, this.aClass21_Sub1_1.anInt10551, this.aClass21_Sub1_1.anInt10550, this.aBooleanArray2);
			this.aBooleanArray2 = null;
			this.aClass4_Sub6_Sub7_1 = null;
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IZ)V")
	public void method970(@OriginalArg(0) int arg0) {
		this.aBoolean104 = true;
		this.method975(arg0);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IZLclient!r;IIILclient!q;ILclient!da;)V")
	public void method971(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class7 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class81 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class65 arg7) {
		@Pc(14) Class190[] local14 = arg7.method7675();
		@Pc(17) Class52[] local17 = arg7.method7688();
		if ((this.aClass21_Sub5_1 == null || this.aClass21_Sub5_1.aBoolean281) && (local14 != null || local17 != null)) {
			@Pc(34) Class233 local34 = Static103.aClass298_1.method6822(this.anInt1119);
			if (local34.anIntArray374 != null) {
				local34 = local34.method5295(Static523.aClass173_1);
			}
			if (local34 != null) {
				this.aClass21_Sub5_1 = Static185.method3047(Static306.anInt6122, true);
			}
		}
		if (this.aClass21_Sub5_1 == null) {
			return;
		}
		arg7.method7665(arg5);
		if (arg1) {
			this.aClass21_Sub5_1.method3046(arg2, (long) Static306.anInt6122, local14, local17);
		} else {
			this.aClass21_Sub5_1.method3043((long) Static306.anInt6122);
		}
		this.aClass21_Sub5_1.method3054(this.aByte9, arg4, arg3, arg0, arg6);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ILclient!r;)V")
	public void method972(@OriginalArg(1) Class7 arg0) {
		this.method964(262144, arg0, true, true);
	}

	@OriginalMember(owner = "client!bba", name = "b", descriptor = "(I)I")
	public int method973() {
		return this.anInt1131;
	}

	@OriginalMember(owner = "client!bba", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass21_Sub5_1 != null) {
			this.aClass21_Sub5_1.method3051();
		}
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(II)V")
	private void method975(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(19) Class233 local19 = Static103.aClass298_1.method6822(this.anInt1119);
			@Pc(21) Class233 local21 = local19;
			if (local19.anIntArray374 != null) {
				local19 = local19.method5295(Static523.aClass173_1);
			}
			if (local19 == null) {
				return;
			}
			if (local19 == local21) {
				local21 = null;
			}
			if (local19.anIntArray377 != null) {
				if (this.aClass111_1 != null && local19.method5287(this.aClass111_1.anInt3157)) {
					return;
				}
				local7 = local19.method5297();
				if (this.anInt1128 != local19.anInt6713) {
					local9 = local19.aBoolean467;
				}
			} else if (local19.anInt6682 == -1) {
				if (local21 != null && local21.anIntArray377 != null) {
					if (this.aClass111_1 != null && local21.method5287(this.aClass111_1.anInt3157)) {
						return;
					}
					local7 = local21.method5297();
					if (this.anInt1128 != local21.anInt6713) {
						local9 = local21.aBoolean467;
					}
				} else if (local21 != null && local21.anInt6682 != -1 && local21.anInt6713 != this.anInt1128) {
					local7 = local21.anInt6682;
					local9 = local21.aBoolean467;
				}
			} else if (this.anInt1128 != local19.anInt6713) {
				local9 = local19.aBoolean467;
				local7 = local19.anInt6682;
			}
		}
		if (local7 == -1) {
			this.aClass111_1 = null;
			return;
		}
		this.aClass65_1 = null;
		if (this.aClass111_1 == null || local7 != this.aClass111_1.anInt3157) {
			this.aClass111_1 = Static17.aClass254_1.method5936(local7);
		} else if (this.aClass111_1.anInt3148 == 0) {
			return;
		}
		if (this.aClass111_1.anIntArray153 == null) {
			this.aClass111_1 = null;
			return;
		}
		if (local9) {
			this.anInt1138 = (int) ((double) this.aClass111_1.anIntArray153.length * Math.random());
			this.anInt1135 = (int) (Math.random() * (double) this.aClass111_1.anIntArray150[this.anInt1138]) + 1;
		} else {
			this.anInt1138 = 0;
			this.anInt1135 = 1;
		}
		this.anInt1123 = this.anInt1138 + 1;
		if (this.anInt1123 < 0 || this.anInt1123 >= this.aClass111_1.anIntArray153.length) {
			this.anInt1123 = -1;
		}
		this.anInt1130 = Static306.anInt6122 - this.anInt1135;
	}
}
