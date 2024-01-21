import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class64 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "J")
	private long aLong98;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "[I")
	private int[] anIntArray333;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "J")
	private long aLong99;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "[I")
	private int[] anIntArray334;

	@OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
	private int anInt2961;

	@OriginalMember(owner = "client!pe", name = "F", descriptor = "Z")
	public boolean aBoolean123;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)V")
	private void method2112() {
		@Pc(8) long local8 = this.aLong99;
		this.aLong99 = 0L;
		@Pc(16) int local16 = this.anIntArray333[5];
		@Pc(21) int local21 = this.anIntArray333[9];
		this.anIntArray333[5] = local21;
		this.anIntArray333[9] = local16;
		for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
			this.aLong99 <<= 0x4;
			if (this.anIntArray333[local33] >= 256) {
				this.aLong99 += this.anIntArray333[local33] - 256;
			}
		}
		if (this.anIntArray333[0] >= 256) {
			this.aLong99 += this.anIntArray333[0] - 256 >> 4;
		}
		if (this.anIntArray333[1] >= 256) {
			this.aLong99 += this.anIntArray333[1] - 256 >> 8;
		}
		for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
			this.aLong99 <<= 0x3;
			this.aLong99 += this.anIntArray334[local107];
		}
		this.aLong99 <<= 0x1;
		this.anIntArray333[5] = local16;
		this.anIntArray333[9] = local21;
		this.aLong99 += this.aBoolean123 ? 1 : 0;
		if (local8 != 0L && this.aLong99 != local8) {
			Static155.aClass57_26.method1721(local8);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!dg;B)Lclient!fd;")
	public Class3_Sub2_Sub1_Sub2 method2113(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub2_Sub2 arg1) {
		if (this.anInt2961 != -1) {
			return Static176.method2828(this.anInt2961).method2744(arg1, arg0);
		}
		@Pc(25) Class3_Sub2_Sub1_Sub2 local25 = (Class3_Sub2_Sub1_Sub2) Static159.aClass57_28.method1719(this.aLong99);
		if (local25 == null) {
			@Pc(36) boolean local36 = false;
			for (@Pc(38) int local38 = 0; local38 < 12; local38++) {
				@Pc(45) int local45 = this.anIntArray333[local38];
				if (local45 >= 256 && local45 < 512 && !Static64.method1146(local45 - 256).method2338()) {
					local36 = true;
				}
				if (local45 >= 512 && !Static146.method2432(local45 - 512).method2428(this.aBoolean123)) {
					local36 = true;
				}
			}
			if (local36) {
				return null;
			}
			@Pc(91) Class3_Sub2_Sub1_Sub6[] local91 = new Class3_Sub2_Sub1_Sub6[12];
			@Pc(93) int local93 = 0;
			for (@Pc(95) int local95 = 0; local95 < 12; local95++) {
				@Pc(102) int local102 = this.anIntArray333[local95];
				@Pc(118) Class3_Sub2_Sub1_Sub6 local118;
				if (local102 >= 256 && local102 < 512) {
					local118 = Static64.method1146(local102 - 256).method2342();
					if (local118 != null) {
						local91[local93++] = local118;
					}
				}
				if (local102 >= 512) {
					local118 = Static146.method2432(local102 - 512).method2422(this.aBoolean123);
					if (local118 != null) {
						local91[local93++] = local118;
					}
				}
			}
			@Pc(159) Class3_Sub2_Sub1_Sub6 local159 = new Class3_Sub2_Sub1_Sub6(local91, local93);
			for (@Pc(161) int local161 = 0; local161 < 5; local161++) {
				if (this.anIntArray334[local161] < Static22.aShortArrayArray3[local161].length) {
					local159.method1954(Static106.aShortArray15[local161], Static22.aShortArrayArray3[local161][this.anIntArray334[local161]]);
				}
				if (this.anIntArray334[local161] < Static167.aShortArrayArray4[local161].length) {
					local159.method1954(Static113.aShortArray13[local161], Static167.aShortArrayArray4[local161][this.anIntArray334[local161]]);
				}
			}
			local25 = local159.method1938(64, 768, -50, -10, -50, true);
			Static159.aClass57_28.method1717(local25, this.aLong99);
		}
		if (arg1 != null) {
			local25 = arg1.method604(arg0, local25);
		}
		return local25;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IZ)V")
	public void method2114(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean123 != arg0) {
			this.method2121(this.anIntArray334, -1, null, arg0);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZII)V")
	public void method2115(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray334[arg1];
		if (arg0) {
			local8++;
			if (local8 >= Static22.aShortArrayArray3[arg1].length) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static22.aShortArrayArray3[arg1].length - 1;
			}
		}
		this.anIntArray334[arg1] = local8;
		this.method2112();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIILclient!dg;Lclient!dg;)Lclient!fd;")
	public Class3_Sub2_Sub1_Sub2 method2116(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub2_Sub2 arg2, @OriginalArg(4) Class3_Sub2_Sub2 arg3) {
		if (this.anInt2961 != -1) {
			return Static176.method2828(this.anInt2961).method2741(arg0, arg3, arg2, arg1);
		}
		@Pc(26) int[] local26 = this.anIntArray333;
		@Pc(29) long local29 = this.aLong99;
		if (arg3 != null && (arg3.anInt948 >= 0 || arg3.anInt936 >= 0)) {
			local26 = new int[12];
			for (@Pc(45) int local45 = 0; local45 < 12; local45++) {
				local26[local45] = this.anIntArray333[local45];
			}
			if (arg3.anInt948 >= 0) {
				local29 += arg3.anInt948 - this.anIntArray333[5] << 8;
				local26[5] = arg3.anInt948;
			}
			if (arg3.anInt936 >= 0) {
				local29 += arg3.anInt936 - this.anIntArray333[3] << 16;
				local26[3] = arg3.anInt936;
			}
		}
		@Pc(110) Class3_Sub2_Sub1_Sub2 local110 = (Class3_Sub2_Sub1_Sub2) Static155.aClass57_26.method1719(local29);
		if (local110 == null) {
			@Pc(114) boolean local114 = false;
			for (@Pc(116) int local116 = 0; local116 < 12; local116++) {
				@Pc(122) int local122 = local26[local116];
				if (local122 >= 256 && local122 < 512 && !Static64.method1146(local122 - 256).method2340()) {
					local114 = true;
				}
				if (local122 >= 512 && !Static146.method2432(local122 - 512).method2426(this.aBoolean123)) {
					local114 = true;
				}
			}
			if (local114) {
				if (this.aLong98 != -1L) {
					local110 = (Class3_Sub2_Sub1_Sub2) Static155.aClass57_26.method1719(this.aLong98);
				}
				if (local110 == null) {
					return null;
				}
			}
			if (local110 == null) {
				@Pc(182) Class3_Sub2_Sub1_Sub6[] local182 = new Class3_Sub2_Sub1_Sub6[12];
				@Pc(184) int local184 = 0;
				for (@Pc(186) int local186 = 0; local186 < 12; local186++) {
					@Pc(192) int local192 = local26[local186];
					@Pc(208) Class3_Sub2_Sub1_Sub6 local208;
					if (local192 >= 256 && local192 < 512) {
						local208 = Static64.method1146(local192 - 256).method2337();
						if (local208 != null) {
							local182[local184++] = local208;
						}
					}
					if (local192 >= 512) {
						local208 = Static146.method2432(local192 - 512).method2429(this.aBoolean123);
						if (local208 != null) {
							local182[local184++] = local208;
						}
					}
				}
				@Pc(249) Class3_Sub2_Sub1_Sub6 local249 = new Class3_Sub2_Sub1_Sub6(local182, local184);
				for (@Pc(251) int local251 = 0; local251 < 5; local251++) {
					if (this.anIntArray334[local251] < Static22.aShortArrayArray3[local251].length) {
						local249.method1954(Static106.aShortArray15[local251], Static22.aShortArrayArray3[local251][this.anIntArray334[local251]]);
					}
					if (Static167.aShortArrayArray4[local251].length > this.anIntArray334[local251]) {
						local249.method1954(Static113.aShortArray13[local251], Static167.aShortArrayArray4[local251][this.anIntArray334[local251]]);
					}
				}
				local110 = local249.method1938(64, 850, -30, -50, -30, true);
				Static155.aClass57_26.method1717(local110, local29);
				this.aLong98 = local29;
			}
		}
		if (arg3 == null && arg2 == null) {
			return local110;
		}
		@Pc(346) Class3_Sub2_Sub1_Sub2 local346;
		if (arg3 != null && arg2 != null) {
			local346 = arg3.method596(local110, arg1, arg2, arg0);
		} else if (arg3 == null) {
			local346 = arg2.method605(local110, arg1);
		} else {
			local346 = arg3.method605(local110, arg0);
		}
		return local346;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)I")
	public int method2118() {
		return this.anInt2961 == -1 ? this.anIntArray333[1] + (this.anIntArray333[11] << 5) + (this.anIntArray333[8] << 10) + (this.anIntArray334[4] << 20) + (this.anIntArray334[0] << 25) + (this.anIntArray333[0] << 15) : Static176.method2828(this.anInt2961).anInt3816 + 305419896;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIZ)V")
	public void method2120(@OriginalArg(1) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 1 && this.aBoolean123) {
			return;
		}
		@Pc(24) int local24 = this.anIntArray333[Static139.anIntArray371[arg0]];
		if (local24 == 0) {
			return;
		}
		local24 -= 256;
		@Pc(52) Class3_Sub2_Sub12 local52;
		do {
			if (arg1) {
				local24++;
				if (Static179.anInt3953 <= local24) {
					local24 = 0;
				}
			} else {
				local24--;
				if (local24 < 0) {
					local24 = Static179.anInt3953 - 1;
				}
			}
			local52 = Static64.method1146(local24);
		} while (local52 == null || local52.aBoolean135 || local52.anInt3220 != (this.aBoolean123 ? 7 : 0) + arg0);
		this.anIntArray333[Static139.anIntArray371[arg0]] = local24 + 256;
		this.method2112();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "([IIZ[IZ)V")
	public void method2121(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3) {
		if (arg2 == null) {
			arg2 = new int[12];
			for (@Pc(8) int local8 = 0; local8 < 7; local8++) {
				for (@Pc(12) int local12 = 0; local12 < Static179.anInt3953; local12++) {
					@Pc(18) Class3_Sub2_Sub12 local18 = Static64.method1146(local12);
					if (local18 != null && !local18.aBoolean135 && (arg3 ? 7 : 0) + local8 == local18.anInt3220) {
						arg2[Static139.anIntArray371[local8]] = local12 + 256;
						break;
					}
				}
			}
		}
		this.anInt2961 = arg1;
		this.anIntArray334 = arg0;
		this.aBoolean123 = arg3;
		this.anIntArray333 = arg2;
		this.method2112();
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLclient!rd;)V")
	public void method2122(@OriginalArg(1) Class3_Sub4 arg0) {
		arg0.method206(this.aBoolean123 ? 1 : 0);
		@Pc(30) int local30;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local30 = this.anIntArray333[Static139.anIntArray371[local16]];
			if (local30 == 0) {
				arg0.method206(-1);
			} else {
				arg0.method206(local30 - 256);
			}
		}
		for (local30 = 0; local30 < 5; local30++) {
			arg0.method206(this.anIntArray334[local30]);
		}
	}
}
