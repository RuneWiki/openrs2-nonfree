import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class21 {

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "J")
	private long aLong28;

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "[I")
	private int[] anIntArray121;

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "Z")
	public boolean aBoolean47;

	@OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
	private int anInt936;

	@OriginalMember(owner = "client!ec", name = "v", descriptor = "[I")
	private int[] anIntArray122;

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "J")
	private long aLong29;

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BILclient!gd;Lclient!gd;I)Lclient!df;")
	public Class6_Sub3_Sub1_Sub3 method704(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub3_Sub7 arg1, @OriginalArg(3) Class6_Sub3_Sub7 arg2, @OriginalArg(4) int arg3) {
		if (this.anInt936 != -1) {
			return Static41.method904(this.anInt936).method370(arg0, arg2, arg1, arg3);
		}
		@Pc(24) long local24 = this.aLong28;
		@Pc(27) int[] local27 = this.anIntArray121;
		if (arg1 != null && (arg1.anInt1324 >= 0 || arg1.anInt1308 >= 0)) {
			local27 = new int[12];
			for (@Pc(43) int local43 = 0; local43 < 12; local43++) {
				local27[local43] = this.anIntArray121[local43];
			}
			if (arg1.anInt1324 >= 0) {
				local24 += arg1.anInt1324 - this.anIntArray121[5] << 8;
				local27[5] = arg1.anInt1324;
			}
			if (arg1.anInt1308 >= 0) {
				local24 += arg1.anInt1308 - this.anIntArray121[3] << 16;
				local27[3] = arg1.anInt1308;
			}
		}
		@Pc(105) Class6_Sub3_Sub1_Sub3 local105 = (Class6_Sub3_Sub1_Sub3) Static100.aClass49_26.method1397(local24);
		if (local105 == null) {
			@Pc(109) boolean local109 = false;
			for (@Pc(111) int local111 = 0; local111 < 12; local111++) {
				@Pc(117) int local117 = local27[local111];
				if (local117 >= 256 && local117 < 512 && !Static88.method1591(local117 - 256).method1488()) {
					local109 = true;
				}
				if (local117 >= 512 && !Static91.method1664(local117 - 512).method965(this.aBoolean47)) {
					local109 = true;
				}
			}
			if (local109) {
				if (this.aLong29 != -1L) {
					local105 = (Class6_Sub3_Sub1_Sub3) Static100.aClass49_26.method1397(this.aLong29);
				}
				if (local105 == null) {
					return null;
				}
			}
			if (local105 == null) {
				@Pc(179) Class6_Sub3_Sub1_Sub1[] local179 = new Class6_Sub3_Sub1_Sub1[12];
				@Pc(181) int local181 = 0;
				for (@Pc(183) int local183 = 0; local183 < 12; local183++) {
					@Pc(189) int local189 = local27[local183];
					@Pc(205) Class6_Sub3_Sub1_Sub1 local205;
					if (local189 >= 256 && local189 < 512) {
						local205 = Static88.method1591(local189 - 256).method1487();
						if (local205 != null) {
							local179[local181++] = local205;
						}
					}
					if (local189 >= 512) {
						local205 = Static91.method1664(local189 - 512).method966(this.aBoolean47);
						if (local205 != null) {
							local179[local181++] = local205;
						}
					}
				}
				@Pc(244) Class6_Sub3_Sub1_Sub1 local244 = new Class6_Sub3_Sub1_Sub1(local179, local181);
				for (@Pc(246) int local246 = 0; local246 < 5; local246++) {
					if (this.anIntArray122[local246] != 0) {
						local244.method229(Static86.aShortArrayArray1[local246][0], Static86.aShortArrayArray1[local246][this.anIntArray122[local246]]);
						if (local246 == 1) {
							local244.method229(Static49.aShortArray7[0], Static49.aShortArray7[this.anIntArray122[local246]]);
						}
					}
				}
				local105 = local244.method211(64, 850, -30, -50, -30);
				Static100.aClass49_26.method1396(local24, local105);
				this.aLong29 = local24;
			}
		}
		if (arg1 == null && arg2 == null) {
			return local105;
		}
		@Pc(335) Class6_Sub3_Sub1_Sub3 local335;
		if (arg1 != null && arg2 != null) {
			local335 = arg1.method921(local105, arg3, arg0, arg2);
		} else if (arg1 == null) {
			local335 = arg2.method930(arg0, local105);
		} else {
			local335 = arg1.method930(arg3, local105);
		}
		return local335;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!bf;)V")
	public void method705(@OriginalArg(1) Class6_Sub4 arg0) {
		arg0.method1330(this.aBoolean47 ? 1 : 0);
		@Pc(33) int local33;
		for (@Pc(24) int local24 = 0; local24 < 7; local24++) {
			local33 = this.anIntArray121[Static105.anIntArray320[local24]];
			if (local33 == 0) {
				arg0.method1330(-1);
			} else {
				arg0.method1330(local33 - 256);
			}
		}
		for (local33 = 0; local33 < 5; local33++) {
			arg0.method1330(this.anIntArray122[local33]);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIZ)V")
	public void method706(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg0 == 1 && this.aBoolean47) {
			return;
		}
		@Pc(21) int local21 = this.anIntArray121[Static105.anIntArray320[arg0]];
		if (local21 == 0) {
			return;
		}
		local21 -= 256;
		@Pc(49) Class6_Sub3_Sub13 local49;
		do {
			if (arg1) {
				local21++;
				if (local21 >= Static13.anInt429) {
					local21 = 0;
				}
			} else {
				local21--;
				if (local21 < 0) {
					local21 = Static13.anInt429 - 1;
				}
			}
			local49 = Static88.method1591(local21);
		} while (local49 == null || local49.aBoolean113 || local49.anInt2213 != (this.aBoolean47 ? 7 : 0) + arg0);
		this.anIntArray121[Static105.anIntArray320[arg0]] = local21 + 256;
		this.method711();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[I[IZI)V")
	public void method707(@OriginalArg(1) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		if (arg0 == null) {
			arg0 = new int[12];
			for (@Pc(20) int local20 = 0; local20 < 7; local20++) {
				for (@Pc(24) int local24 = 0; local24 < Static13.anInt429; local24++) {
					@Pc(30) Class6_Sub3_Sub13 local30 = Static88.method1591(local24);
					if (local30 != null && !local30.aBoolean113 && local30.anInt2213 == (arg2 ? 7 : 0) + local20) {
						arg0[Static105.anIntArray320[local20]] = local24 + 256;
						break;
					}
				}
			}
		}
		this.aBoolean47 = arg2;
		this.anIntArray121 = arg0;
		this.anInt936 = arg3;
		this.anIntArray122 = arg1;
		this.method711();
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
	private void method711() {
		@Pc(16) int local16 = this.anIntArray121[5];
		@Pc(21) int local21 = this.anIntArray121[9];
		this.anIntArray121[5] = local21;
		this.anIntArray121[9] = local16;
		@Pc(34) long local34 = this.aLong28;
		this.aLong28 = 0L;
		for (@Pc(39) int local39 = 0; local39 < 12; local39++) {
			this.aLong28 <<= 0x4;
			if (this.anIntArray121[local39] >= 256) {
				this.aLong28 += this.anIntArray121[local39] - 256;
			}
		}
		if (this.anIntArray121[0] >= 256) {
			this.aLong28 += this.anIntArray121[0] - 256 >> 4;
		}
		if (this.anIntArray121[1] >= 256) {
			this.aLong28 += this.anIntArray121[1] - 256 >> 8;
		}
		for (@Pc(117) int local117 = 0; local117 < 5; local117++) {
			this.aLong28 <<= 0x3;
			this.aLong28 += this.anIntArray122[local117];
		}
		this.anIntArray121[9] = local21;
		this.anIntArray121[5] = local16;
		this.aLong28 <<= 0x1;
		this.aLong28 += this.aBoolean47 ? 1 : 0;
		if (local34 != 0L && local34 != this.aLong28) {
			Static100.aClass49_26.method1393(local34);
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZI)V")
	public void method712(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean47 != arg0) {
			this.method707(null, this.anIntArray122, arg0, -1);
		}
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)I")
	public int method713() {
		return this.anInt936 == -1 ? this.anIntArray121[1] + (this.anIntArray121[11] << 5) + (this.anIntArray121[8] << 10) + (this.anIntArray122[4] << 20) + (this.anIntArray122[0] << 25) + (this.anIntArray121[0] << 15) : Static41.method904(this.anInt936).anInt478 + 305419896;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)Lclient!bc;")
	public Class6_Sub3_Sub1_Sub1 method714() {
		if (this.anInt936 != -1) {
			return Static41.method904(this.anInt936).method373();
		}
		@Pc(19) boolean local19 = false;
		for (@Pc(26) int local26 = 0; local26 < 12; local26++) {
			@Pc(33) int local33 = this.anIntArray121[local26];
			if (local33 >= 256 && local33 < 512 && !Static88.method1591(local33 - 256).method1481()) {
				local19 = true;
			}
			if (local33 >= 512 && !Static91.method1664(local33 - 512).method961(this.aBoolean47)) {
				local19 = true;
			}
		}
		if (local19) {
			return null;
		}
		@Pc(77) Class6_Sub3_Sub1_Sub1[] local77 = new Class6_Sub3_Sub1_Sub1[12];
		@Pc(79) int local79 = 0;
		for (@Pc(81) int local81 = 0; local81 < 12; local81++) {
			@Pc(88) int local88 = this.anIntArray121[local81];
			@Pc(104) Class6_Sub3_Sub1_Sub1 local104;
			if (local88 >= 256 && local88 < 512) {
				local104 = Static88.method1591(local88 - 256).method1484();
				if (local104 != null) {
					local77[local79++] = local104;
				}
			}
			if (local88 >= 512) {
				local104 = Static91.method1664(local88 - 512).method971(this.aBoolean47);
				if (local104 != null) {
					local77[local79++] = local104;
				}
			}
		}
		@Pc(145) Class6_Sub3_Sub1_Sub1 local145 = new Class6_Sub3_Sub1_Sub1(local77, local79);
		for (@Pc(147) int local147 = 0; local147 < 5; local147++) {
			if (this.anIntArray122[local147] != 0) {
				local145.method229(Static86.aShortArrayArray1[local147][0], Static86.aShortArrayArray1[local147][this.anIntArray122[local147]]);
				if (local147 == 1) {
					local145.method229(Static49.aShortArray7[0], Static49.aShortArray7[this.anIntArray122[local147]]);
				}
			}
		}
		return local145;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZII)V")
	public void method715(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(8) int local8 = this.anIntArray122[arg1];
		if (arg0) {
			local8++;
			if (Static86.aShortArrayArray1[arg1].length <= local8) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static86.aShortArrayArray1[arg1].length - 1;
			}
		}
		this.anIntArray122[arg1] = local8;
		this.method711();
	}
}
