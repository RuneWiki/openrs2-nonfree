import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class38 {

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "[I")
	private int[] anIntArray249;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "[I")
	private int[] anIntArray250;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "J")
	private long aLong64;

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "Z")
	public boolean aBoolean71;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
	private int anInt1798;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "J")
	private long aLong65;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[I[IZ)V")
	public void method1248(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3) {
		if (arg1 == null) {
			arg1 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static67.anInt1701; local16++) {
					@Pc(22) Class1_Sub1_Sub14 local22 = Static36.method652(local16);
					if (local22 != null && !local22.aBoolean108 && local12 + (arg3 ? 7 : 0) == local22.anInt2532) {
						arg1[Static84.anIntArray373[local12]] = local16 + 256;
						break;
					}
				}
			}
		}
		this.anIntArray249 = arg2;
		this.anInt1798 = arg0;
		this.aBoolean71 = arg3;
		this.anIntArray250 = arg1;
		this.method1256();
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)I")
	public int method1251() {
		return this.anInt1798 == -1 ? (this.anIntArray250[8] << 10) + (this.anIntArray249[0] << 25) + (this.anIntArray249[4] << 20) + (this.anIntArray250[0] << 15) + (this.anIntArray250[11] << 5) + this.anIntArray250[1] : Static55.method1238(this.anInt1798).anInt1488 + 305419896;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
	private void method1256() {
		@Pc(4) long local4 = this.aLong65;
		this.aLong65 = 0L;
		@Pc(12) int local12 = this.anIntArray250[9];
		@Pc(17) int local17 = this.anIntArray250[5];
		this.anIntArray250[9] = local17;
		this.anIntArray250[5] = local12;
		for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
			this.aLong65 <<= 0x4;
			if (this.anIntArray250[local33] >= 256) {
				this.aLong65 += this.anIntArray250[local33] - 256;
			}
		}
		if (this.anIntArray250[0] >= 256) {
			this.aLong65 += this.anIntArray250[0] - 256 >> 4;
		}
		if (this.anIntArray250[1] >= 256) {
			this.aLong65 += this.anIntArray250[1] - 256 >> 8;
		}
		for (@Pc(113) int local113 = 0; local113 < 5; local113++) {
			this.aLong65 <<= 0x3;
			this.aLong65 += this.anIntArray249[local113];
		}
		this.aLong65 <<= 0x1;
		this.anIntArray250[9] = local12;
		this.anIntArray250[5] = local17;
		this.aLong65 += this.aBoolean71 ? 1 : 0;
		if (local4 != 0L && local4 != this.aLong65) {
			Static11.aClass60_24.method1739(local4);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIZ)V")
	public void method1257(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = this.anIntArray249[arg0];
		if (arg1) {
			local8++;
			if (Static16.aShortArrayArray1[arg0].length <= local8) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static16.aShortArrayArray1[arg0].length - 1;
			}
		}
		this.anIntArray249[arg0] = local8;
		this.method1256();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZI)V")
	public void method1258(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		if (arg0 == 1 && this.aBoolean71) {
			return;
		}
		@Pc(23) int local23 = this.anIntArray250[Static84.anIntArray373[arg0]];
		if (local23 == 0) {
			return;
		}
		local23 -= 256;
		@Pc(51) Class1_Sub1_Sub14 local51;
		do {
			if (arg1) {
				local23++;
				if (local23 >= Static67.anInt1701) {
					local23 = 0;
				}
			} else {
				local23--;
				if (local23 < 0) {
					local23 = Static67.anInt1701 - 1;
				}
			}
			local51 = Static36.method652(local23);
		} while (local51 == null || local51.aBoolean108 || (this.aBoolean71 ? 7 : 0) + arg0 != local51.anInt2532);
		this.anIntArray250[Static84.anIntArray373[arg0]] = local23 + 256;
		this.method1256();
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)V")
	public void method1259(@OriginalArg(1) boolean arg0) {
		if (arg0 != this.aBoolean71) {
			this.method1248(-1, null, this.anIntArray249, arg0);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!mc;)V")
	public void method1260(@OriginalArg(1) Class1_Sub12 arg0) {
		arg0.method1197(this.aBoolean71 ? 1 : 0);
		@Pc(23) int local23;
		for (@Pc(14) int local14 = 0; local14 < 7; local14++) {
			local23 = this.anIntArray250[Static84.anIntArray373[local14]];
			if (local23 == 0) {
				arg0.method1197(-1);
			} else {
				arg0.method1197(local23 - 256);
			}
		}
		for (local23 = 0; local23 < 5; local23++) {
			arg0.method1197(this.anIntArray249[local23]);
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)Lclient!td;")
	public Class1_Sub1_Sub1_Sub7 method1263() {
		if (this.anInt1798 != -1) {
			return Static55.method1238(this.anInt1798).method1041();
		}
		@Pc(19) boolean local19 = false;
		for (@Pc(21) int local21 = 0; local21 < 12; local21++) {
			@Pc(28) int local28 = this.anIntArray250[local21];
			if (local28 >= 256 && local28 < 512 && !Static36.method652(local28 - 256).method1783()) {
				local19 = true;
			}
			if (local28 >= 512 && !Static20.method496(local28 - 512).method1081(this.aBoolean71)) {
				local19 = true;
			}
		}
		if (local19) {
			return null;
		}
		@Pc(74) Class1_Sub1_Sub1_Sub7[] local74 = new Class1_Sub1_Sub1_Sub7[12];
		@Pc(76) int local76 = 0;
		for (@Pc(78) int local78 = 0; local78 < 12; local78++) {
			@Pc(85) int local85 = this.anIntArray250[local78];
			@Pc(103) Class1_Sub1_Sub1_Sub7 local103;
			if (local85 >= 256 && local85 < 512) {
				local103 = Static36.method652(local85 - 256).method1782();
				if (local103 != null) {
					local74[local76++] = local103;
				}
			}
			if (local85 >= 512) {
				local103 = Static20.method496(local85 - 512).method1074(this.aBoolean71);
				if (local103 != null) {
					local74[local76++] = local103;
				}
			}
		}
		@Pc(144) Class1_Sub1_Sub1_Sub7 local144 = new Class1_Sub1_Sub1_Sub7(local74, local76);
		for (@Pc(155) int local155 = 0; local155 < 5; local155++) {
			if (this.anIntArray249[local155] < Static16.aShortArrayArray1[local155].length) {
				local144.method1914(Static15.aShortArray102[local155], Static16.aShortArrayArray1[local155][this.anIntArray249[local155]]);
			}
			if (Static16.aShortArrayArray2[local155].length > this.anIntArray249[local155]) {
				local144.method1914(Static70.aShortArray21[local155], Static16.aShortArrayArray2[local155][this.anIntArray249[local155]]);
			}
		}
		return local144;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!tb;Lclient!tb;II)Lclient!lb;")
	public Class1_Sub1_Sub1_Sub6 method1264(@OriginalArg(1) Class1_Sub1_Sub15 arg0, @OriginalArg(2) Class1_Sub1_Sub15 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (this.anInt1798 != -1) {
			return Static55.method1238(this.anInt1798).method1048(arg0, arg3, arg2, arg1);
		}
		@Pc(23) long local23 = this.aLong65;
		@Pc(26) int[] local26 = this.anIntArray250;
		if (arg0 != null && (arg0.anInt2648 >= 0 || arg0.anInt2663 >= 0)) {
			local26 = new int[12];
			for (@Pc(45) int local45 = 0; local45 < 12; local45++) {
				local26[local45] = this.anIntArray250[local45];
			}
			if (arg0.anInt2648 >= 0) {
				local23 += arg0.anInt2648 - this.anIntArray250[5] << 8;
				local26[5] = arg0.anInt2648;
			}
			if (arg0.anInt2663 >= 0) {
				local23 += arg0.anInt2663 - this.anIntArray250[3] << 16;
				local26[3] = arg0.anInt2663;
			}
		}
		@Pc(108) Class1_Sub1_Sub1_Sub6 local108 = (Class1_Sub1_Sub1_Sub6) Static11.aClass60_24.method1745(local23);
		if (local108 == null) {
			@Pc(117) boolean local117 = false;
			for (@Pc(119) int local119 = 0; local119 < 12; local119++) {
				@Pc(125) int local125 = local26[local119];
				if (local125 >= 256 && local125 < 512 && !Static36.method652(local125 - 256).method1790()) {
					local117 = true;
				}
				if (local125 >= 512 && !Static20.method496(local125 - 512).method1073(this.aBoolean71)) {
					local117 = true;
				}
			}
			if (local117) {
				if (this.aLong64 != -1L) {
					local108 = (Class1_Sub1_Sub1_Sub6) Static11.aClass60_24.method1745(this.aLong64);
				}
				if (local108 == null) {
					return null;
				}
			}
			if (local108 == null) {
				@Pc(189) Class1_Sub1_Sub1_Sub7[] local189 = new Class1_Sub1_Sub1_Sub7[12];
				@Pc(191) int local191 = 0;
				for (@Pc(193) int local193 = 0; local193 < 12; local193++) {
					@Pc(199) int local199 = local26[local193];
					@Pc(215) Class1_Sub1_Sub1_Sub7 local215;
					if (local199 >= 256 && local199 < 512) {
						local215 = Static36.method652(local199 - 256).method1784();
						if (local215 != null) {
							local189[local191++] = local215;
						}
					}
					if (local199 >= 512) {
						local215 = Static20.method496(local199 - 512).method1086(this.aBoolean71);
						if (local215 != null) {
							local189[local191++] = local215;
						}
					}
				}
				@Pc(254) Class1_Sub1_Sub1_Sub7 local254 = new Class1_Sub1_Sub1_Sub7(local189, local191);
				for (@Pc(256) int local256 = 0; local256 < 5; local256++) {
					if (this.anIntArray249[local256] < Static16.aShortArrayArray1[local256].length) {
						local254.method1914(Static15.aShortArray102[local256], Static16.aShortArrayArray1[local256][this.anIntArray249[local256]]);
					}
					if (Static16.aShortArrayArray2[local256].length > this.anIntArray249[local256]) {
						local254.method1914(Static70.aShortArray21[local256], Static16.aShortArrayArray2[local256][this.anIntArray249[local256]]);
					}
				}
				local108 = local254.method1899(64, 850, -30, -50, -30);
				Static11.aClass60_24.method1741(local23, local108);
				this.aLong64 = local23;
			}
		}
		if (arg0 == null && arg1 == null) {
			return local108;
		}
		@Pc(342) Class1_Sub1_Sub1_Sub6 local342;
		if (arg0 != null && arg1 != null) {
			local342 = arg0.method1869(arg3, arg1, local108, arg2);
		} else if (arg0 == null) {
			local342 = arg1.method1872(local108, arg3);
		} else {
			local342 = arg0.method1872(local108, arg2);
		}
		return local342;
	}
}
