import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class5_Sub1_Sub18 extends Class5_Sub1 {

	@OriginalMember(owner = "client!wc", name = "ob", descriptor = "[I")
	public int[] anIntArray290;

	@OriginalMember(owner = "client!wc", name = "rb", descriptor = "[I")
	private int[] anIntArray291;

	@OriginalMember(owner = "client!wc", name = "tb", descriptor = "[I")
	private int[] anIntArray292;

	@OriginalMember(owner = "client!wc", name = "yb", descriptor = "[I")
	public int[] anIntArray293;

	@OriginalMember(owner = "client!wc", name = "Bb", descriptor = "[I")
	public int[] anIntArray294;

	@OriginalMember(owner = "client!wc", name = "Y", descriptor = "I")
	public int anInt2942 = -1;

	@OriginalMember(owner = "client!wc", name = "X", descriptor = "I")
	public int anInt2941 = 5;

	@OriginalMember(owner = "client!wc", name = "bb", descriptor = "I")
	public int anInt2945 = -1;

	@OriginalMember(owner = "client!wc", name = "ab", descriptor = "I")
	public int anInt2944 = 2;

	@OriginalMember(owner = "client!wc", name = "mb", descriptor = "I")
	public int anInt2953 = -1;

	@OriginalMember(owner = "client!wc", name = "eb", descriptor = "I")
	public int anInt2947 = -1;

	@OriginalMember(owner = "client!wc", name = "ub", descriptor = "I")
	public int anInt2957 = -1;

	@OriginalMember(owner = "client!wc", name = "lb", descriptor = "I")
	public int anInt2952 = 99;

	@OriginalMember(owner = "client!wc", name = "Cb", descriptor = "Z")
	public boolean aBoolean129 = false;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!bf;II)Lclient!bf;")
	public Class5_Sub1_Sub1_Sub2 method1951(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1_Sub1_Sub2 arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = this.anIntArray294[arg0];
		@Pc(16) Class5_Sub1_Sub5 local16 = Static116.method1900(local10 >> 16);
		@Pc(20) int local20 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg1.method243(true);
		}
		@Pc(30) int local30 = arg2 & 0x3;
		@Pc(43) Class5_Sub1_Sub1_Sub2 local43 = arg1.method243(!local16.method521(local20));
		if (local30 == 1) {
			local43.method248();
		} else if (local30 == 2) {
			local43.method239();
		} else if (local30 == 3) {
			local43.method240();
		}
		local43.method242(local16, local20);
		if (local30 == 1) {
			local43.method240();
		} else if (local30 == 2) {
			local43.method239();
		} else if (local30 == 3) {
			local43.method248();
		}
		return local43;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!bf;II)Lclient!bf;")
	public Class5_Sub1_Sub1_Sub2 method1953(@OriginalArg(0) Class5_Sub1_Sub1_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray294[arg1];
		@Pc(14) Class5_Sub1_Sub5 local14 = Static116.method1900(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method252(true);
		} else {
			@Pc(44) Class5_Sub1_Sub1_Sub2 local44 = arg0.method252(!local14.method521(local18));
			local44.method242(local14, local18);
			return local44;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIBLclient!wc;Lclient!bf;)Lclient!bf;")
	public Class5_Sub1_Sub1_Sub2 method1954(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class5_Sub1_Sub18 arg2, @OriginalArg(4) Class5_Sub1_Sub1_Sub2 arg3) {
		@Pc(8) int local8 = this.anIntArray294[arg0];
		@Pc(14) Class5_Sub1_Sub5 local14 = Static116.method1900(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg2.method1958(arg1, arg3);
		}
		@Pc(31) int local31 = arg2.anIntArray294[arg1];
		@Pc(37) Class5_Sub1_Sub5 local37 = Static116.method1900(local31 >> 16);
		@Pc(41) int local41 = local31 & 0xFFFF;
		@Pc(54) Class5_Sub1_Sub1_Sub2 local54;
		if (local37 == null) {
			local54 = arg3.method243(!local14.method521(local18));
			local54.method242(local14, local18);
			return local54;
		} else {
			local54 = arg3.method243(!local14.method521(local18) & !local37.method521(local41));
			local54.method237(local14, local18, local37, local41, this.anIntArray291);
			return local54;
		}
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(B)V")
	public void method1957() {
		if (this.anInt2957 == -1) {
			if (this.anIntArray291 == null) {
				this.anInt2957 = 0;
			} else {
				this.anInt2957 = 2;
			}
		}
		if (this.anInt2953 != -1) {
			return;
		}
		if (this.anIntArray291 == null) {
			this.anInt2953 = 0;
		} else {
			this.anInt2953 = 2;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!bf;B)Lclient!bf;")
	public Class5_Sub1_Sub1_Sub2 method1958(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub1_Sub1_Sub2 arg1) {
		@Pc(10) int local10 = this.anIntArray294[arg0];
		@Pc(20) Class5_Sub1_Sub5 local20 = Static116.method1900(local10 >> 16);
		@Pc(24) int local24 = local10 & 0xFFFF;
		if (local20 == null) {
			return arg1.method243(true);
		} else {
			@Pc(41) Class5_Sub1_Sub1_Sub2 local41 = arg1.method243(!local20.method521(local24));
			local41.method242(local20, local24);
			return local41;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZILclient!bf;)Lclient!bf;")
	public Class5_Sub1_Sub1_Sub2 method1959(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub1_Sub1_Sub2 arg1) {
		@Pc(13) int local13 = this.anIntArray294[arg0];
		@Pc(19) Class5_Sub1_Sub5 local19 = Static116.method1900(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg1.method243(true);
		}
		@Pc(31) Class5_Sub1_Sub5 local31 = null;
		@Pc(33) int local33 = 0;
		if (this.anIntArray292 != null && arg0 < this.anIntArray292.length) {
			local33 = this.anIntArray292[arg0];
			local31 = Static116.method1900(local33 >> 16);
			local33 &= 0xFFFF;
		}
		@Pc(72) Class5_Sub1_Sub1_Sub2 local72;
		if (local31 == null || local33 == 65535) {
			local72 = arg1.method243(!local19.method521(local23));
			local72.method242(local19, local23);
			return local72;
		} else {
			local72 = arg1.method243(!local19.method521(local23) & !local31.method521(local33));
			local72.method242(local19, local23);
			local72.method242(local31, local33);
			return local72;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!qe;II)V")
	private void method1960(@OriginalArg(0) Class5_Sub11 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14;
		@Pc(20) int local20;
		@Pc(39) int local39;
		if (arg1 == 1) {
			local14 = arg0.method1546();
			this.anIntArray290 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray290[local20] = arg0.method1543();
			}
			this.anIntArray294 = new int[local14];
			for (local39 = 0; local39 < local14; local39++) {
				this.anIntArray294[local39] = arg0.method1543();
			}
			for (@Pc(58) int local58 = 0; local58 < local14; local58++) {
				this.anIntArray294[local58] += arg0.method1543() << 16;
			}
		} else if (arg1 == 2) {
			this.anInt2945 = arg0.method1543();
		} else if (arg1 == 3) {
			local14 = arg0.method1546();
			this.anIntArray291 = new int[local14 + 1];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray291[local20] = arg0.method1546();
			}
			this.anIntArray291[local14] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean129 = true;
		} else if (arg1 == 5) {
			this.anInt2941 = arg0.method1546();
		} else if (arg1 == 6) {
			this.anInt2947 = arg0.method1543();
		} else if (arg1 == 7) {
			this.anInt2942 = arg0.method1543();
		} else if (arg1 == 8) {
			this.anInt2952 = arg0.method1546();
		} else if (arg1 == 9) {
			this.anInt2953 = arg0.method1546();
		} else if (arg1 == 10) {
			this.anInt2957 = arg0.method1546();
		} else if (arg1 == 11) {
			this.anInt2944 = arg0.method1546();
		} else if (arg1 == 12) {
			local14 = arg0.method1546();
			this.anIntArray292 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray292[local20] = arg0.method1543();
			}
			for (local39 = 0; local39 < local14; local39++) {
				this.anIntArray292[local39] += arg0.method1543() << 16;
			}
		} else if (arg1 == 13) {
			local14 = arg0.method1546();
			this.anIntArray293 = new int[local14];
			for (local20 = 0; local20 < local14; local20++) {
				this.anIntArray293[local20] = arg0.method1530();
			}
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!qe;)V")
	public void method1961(@OriginalArg(1) Class5_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1546();
			if (local13 == 0) {
				return;
			}
			this.method1960(arg0, local13);
		}
	}
}
