import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qc")
public final class Class3_Sub1_Sub13 extends Class3_Sub1 {

	@OriginalMember(owner = "client!qc", name = "bb", descriptor = "[I")
	private int[] anIntArray248;

	@OriginalMember(owner = "client!qc", name = "cb", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!qc", name = "kb", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!qc", name = "nb", descriptor = "I")
	public int anInt2212;

	@OriginalMember(owner = "client!qc", name = "rb", descriptor = "[I")
	public int[] anIntArray251;

	@OriginalMember(owner = "client!qc", name = "zb", descriptor = "[I")
	private int[] anIntArray252;

	@OriginalMember(owner = "client!qc", name = "pb", descriptor = "I")
	private int anInt2214 = 128;

	@OriginalMember(owner = "client!qc", name = "ob", descriptor = "I")
	public int anInt2213 = -1;

	@OriginalMember(owner = "client!qc", name = "Z", descriptor = "[Lclient!ae;")
	public final Class5[] aClass5Array14 = new Class5[5];

	@OriginalMember(owner = "client!qc", name = "W", descriptor = "I")
	public int anInt2201 = -1;

	@OriginalMember(owner = "client!qc", name = "eb", descriptor = "I")
	public int anInt2204 = -1;

	@OriginalMember(owner = "client!qc", name = "qb", descriptor = "I")
	public int anInt2215 = -1;

	@OriginalMember(owner = "client!qc", name = "sb", descriptor = "I")
	public int anInt2216 = -1;

	@OriginalMember(owner = "client!qc", name = "wb", descriptor = "Z")
	public boolean aBoolean105 = false;

	@OriginalMember(owner = "client!qc", name = "R", descriptor = "I")
	public int anInt2196 = -1;

	@OriginalMember(owner = "client!qc", name = "vb", descriptor = "I")
	public int anInt2218 = 32;

	@OriginalMember(owner = "client!qc", name = "ub", descriptor = "Lclient!ae;")
	public Class5 aClass5_1000 = Static95.aClass5_1122;

	@OriginalMember(owner = "client!qc", name = "O", descriptor = "I")
	public int anInt2194 = -1;

	@OriginalMember(owner = "client!qc", name = "U", descriptor = "I")
	private int anInt2199 = 128;

	@OriginalMember(owner = "client!qc", name = "tb", descriptor = "I")
	private int anInt2217 = 0;

	@OriginalMember(owner = "client!qc", name = "Y", descriptor = "I")
	private int anInt2202 = 0;

	@OriginalMember(owner = "client!qc", name = "db", descriptor = "I")
	public int anInt2203 = 1;

	@OriginalMember(owner = "client!qc", name = "Bb", descriptor = "I")
	public int anInt2221 = -1;

	@OriginalMember(owner = "client!qc", name = "Ab", descriptor = "Z")
	public boolean aBoolean106 = true;

	@OriginalMember(owner = "client!qc", name = "yb", descriptor = "I")
	private int anInt2220 = -1;

	@OriginalMember(owner = "client!qc", name = "jb", descriptor = "I")
	public int anInt2209 = -1;

	@OriginalMember(owner = "client!qc", name = "Db", descriptor = "I")
	private int anInt2222 = -1;

	@OriginalMember(owner = "client!qc", name = "Cb", descriptor = "Z")
	public boolean aBoolean107 = true;

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(Z)Z")
	public boolean method1475() {
		if (this.anIntArray251 == null) {
			return true;
		}
		@Pc(17) int local17 = -1;
		if (this.anInt2220 != -1) {
			local17 = Static73.method1216(this.anInt2220);
		} else if (this.anInt2222 != -1) {
			local17 = Static110.anIntArray373[this.anInt2222];
		}
		return local17 >= 0 && this.anIntArray251.length > local17 && this.anIntArray251[local17] != -1;
	}

	@OriginalMember(owner = "client!qc", name = "f", descriptor = "(I)Lclient!v;")
	public Class3_Sub1_Sub1_Sub6 method1477() {
		if (this.anIntArray251 != null) {
			@Pc(14) Class3_Sub1_Sub13 local14 = this.method1480();
			return local14 == null ? null : local14.method1477();
		} else if (this.anIntArray250 == null) {
			return null;
		} else {
			@Pc(29) boolean local29 = false;
			for (@Pc(31) int local31 = 0; local31 < this.anIntArray250.length; local31++) {
				if (!Static90.aClass11_57.method1872(0, this.anIntArray250[local31])) {
					local29 = true;
				}
			}
			if (local29) {
				return null;
			}
			@Pc(63) Class3_Sub1_Sub1_Sub6[] local63 = new Class3_Sub1_Sub1_Sub6[this.anIntArray250.length];
			for (@Pc(65) int local65 = 0; local65 < this.anIntArray250.length; local65++) {
				local63[local65] = Static107.method1799(Static90.aClass11_57, this.anIntArray250[local65]);
			}
			@Pc(97) Class3_Sub1_Sub1_Sub6 local97;
			if (local63.length == 1) {
				local97 = local63[0];
			} else {
				local97 = new Class3_Sub1_Sub1_Sub6(local63, local63.length);
			}
			if (this.anIntArray248 != null) {
				for (@Pc(111) int local111 = 0; local111 < this.anIntArray248.length; local111++) {
					local97.method1821(this.anIntArray248[local111], this.anIntArray249[local111]);
				}
			}
			return local97;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILclient!m;I)V")
	private void method1478(@OriginalArg(1) Class3_Sub6 arg0, @OriginalArg(2) int arg1) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		if (arg1 == 1) {
			local14 = arg0.method1587();
			this.anIntArray252 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray252[local20] = arg0.method1603();
			}
		} else if (arg1 == 2) {
			this.aClass5_1000 = arg0.method1627();
		} else if (arg1 == 12) {
			this.anInt2203 = arg0.method1587();
		} else if (arg1 == 13) {
			this.anInt2221 = arg0.method1603();
		} else if (arg1 == 14) {
			this.anInt2196 = arg0.method1603();
		} else if (arg1 == 15) {
			this.anInt2209 = arg0.method1603();
		} else if (arg1 == 16) {
			this.anInt2213 = arg0.method1603();
		} else if (arg1 == 17) {
			this.anInt2196 = arg0.method1603();
			this.anInt2215 = arg0.method1603();
			this.anInt2201 = arg0.method1603();
			this.anInt2216 = arg0.method1603();
		} else if (arg1 >= 30 && arg1 < 35) {
			this.aClass5Array14[arg1 - 30] = arg0.method1627();
			if (this.aClass5Array14[arg1 - 30].method171(Static108.aClass5_1282)) {
				this.aClass5Array14[arg1 - 30] = null;
			}
		} else if (arg1 == 40) {
			local14 = arg0.method1587();
			this.anIntArray249 = new int[local14];
			this.anIntArray248 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray248[local20] = arg0.method1603();
				this.anIntArray249[local20] = arg0.method1603();
			}
		} else if (arg1 == 60) {
			local14 = arg0.method1587();
			this.anIntArray250 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray250[local20] = arg0.method1603();
			}
		} else if (arg1 == 93) {
			this.aBoolean107 = false;
		} else if (arg1 == 95) {
			this.anInt2194 = arg0.method1603();
		} else if (arg1 == 97) {
			this.anInt2199 = arg0.method1603();
		} else if (arg1 == 98) {
			this.anInt2214 = arg0.method1603();
		} else if (arg1 == 99) {
			this.aBoolean105 = true;
		} else if (arg1 == 100) {
			this.anInt2202 = arg0.method1605();
		} else if (arg1 == 101) {
			this.anInt2217 = arg0.method1605() * 5;
		} else if (arg1 == 102) {
			this.anInt2204 = arg0.method1603();
		} else if (arg1 == 103) {
			this.anInt2218 = arg0.method1603();
		} else if (arg1 == 106) {
			this.anInt2220 = arg0.method1603();
			if (this.anInt2220 == 65535) {
				this.anInt2220 = -1;
			}
			this.anInt2222 = arg0.method1603();
			if (this.anInt2222 == 65535) {
				this.anInt2222 = -1;
			}
			local14 = arg0.method1587();
			this.anIntArray251 = new int[local14 + 1];
			for (local20 = 0; local20 <= local14; local20++) {
				this.anIntArray251[local20] = arg0.method1603();
				if (this.anIntArray251[local20] == 65535) {
					this.anIntArray251[local20] = -1;
				}
			}
		} else if (arg1 == 107) {
			this.aBoolean106 = false;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZLclient!m;)V")
	public void method1479(@OriginalArg(1) Class3_Sub6 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method1587();
			if (local5 == 0) {
				return;
			}
			this.method1478(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!qc", name = "g", descriptor = "(I)Lclient!qc;")
	public Class3_Sub1_Sub13 method1480() {
		@Pc(6) int local6 = -1;
		if (this.anInt2220 != -1) {
			local6 = Static73.method1216(this.anInt2220);
		} else if (this.anInt2222 != -1) {
			local6 = Static110.anIntArray373[this.anInt2222];
		}
		return local6 < 0 || local6 >= this.anIntArray251.length || this.anIntArray251[local6] == -1 ? null : Static115.method1958(this.anIntArray251[local6]);
	}

	@OriginalMember(owner = "client!qc", name = "c", descriptor = "(B)V")
	public void method1483() {
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILclient!ne;Lclient!ne;I)Lclient!v;")
	public Class3_Sub1_Sub1_Sub6 method1484(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub1_Sub11 arg1, @OriginalArg(3) Class3_Sub1_Sub11 arg2, @OriginalArg(4) int arg3) {
		if (this.anIntArray251 != null) {
			@Pc(14) Class3_Sub1_Sub13 local14 = this.method1480();
			return local14 == null ? null : local14.method1484(arg0, arg1, arg2, arg3);
		}
		@Pc(34) Class3_Sub1_Sub1_Sub6 local34 = (Class3_Sub1_Sub1_Sub6) Static58.aClass9_16.method282((long) this.anInt2212);
		if (local34 == null) {
			@Pc(38) boolean local38 = false;
			for (@Pc(40) int local40 = 0; local40 < this.anIntArray252.length; local40++) {
				if (!Static90.aClass11_57.method1872(0, this.anIntArray252[local40])) {
					local38 = true;
				}
			}
			if (local38) {
				return null;
			}
			@Pc(72) Class3_Sub1_Sub1_Sub6[] local72 = new Class3_Sub1_Sub1_Sub6[this.anIntArray252.length];
			for (@Pc(74) int local74 = 0; local74 < this.anIntArray252.length; local74++) {
				local72[local74] = Static107.method1799(Static90.aClass11_57, this.anIntArray252[local74]);
			}
			if (local72.length == 1) {
				local34 = local72[0];
			} else {
				local34 = new Class3_Sub1_Sub1_Sub6(local72, local72.length);
			}
			if (this.anIntArray248 != null) {
				for (@Pc(120) int local120 = 0; local120 < this.anIntArray248.length; local120++) {
					local34.method1821(this.anIntArray248[local120], this.anIntArray249[local120]);
				}
			}
			local34.method1811();
			local34.method1806(this.anInt2202 + 64, this.anInt2217 + 850, -30, -50, -30, true);
			Static58.aClass9_16.method284(local34, (long) this.anInt2212);
		}
		@Pc(177) Class3_Sub1_Sub1_Sub6 local177;
		if (arg2 != null && arg1 != null) {
			local177 = arg2.method1254(arg0, local34, arg1, arg3);
		} else if (arg2 != null) {
			local177 = arg2.method1256(local34, arg0);
		} else if (arg1 == null) {
			local177 = local34.method1825(true);
		} else {
			local177 = arg1.method1256(local34, arg3);
		}
		if (this.anInt2199 != 128 || this.anInt2214 != 128) {
			local177.method1817(this.anInt2199, this.anInt2214, this.anInt2199);
		}
		return local177;
	}
}
