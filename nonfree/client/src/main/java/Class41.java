import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class41 {

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "Z")
	public boolean aBoolean103;

	@OriginalMember(owner = "client!jf", name = "o", descriptor = "[I")
	private int[] anIntArray146;

	@OriginalMember(owner = "client!jf", name = "t", descriptor = "[I")
	private int[] anIntArray147;

	@OriginalMember(owner = "client!jf", name = "A", descriptor = "J")
	private long aLong40;

	@OriginalMember(owner = "client!jf", name = "E", descriptor = "J")
	private long aLong41;

	@OriginalMember(owner = "client!jf", name = "F", descriptor = "I")
	private int anInt1483;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZ)V")
	public void method992(@OriginalArg(1) boolean arg0) {
		if (this.aBoolean103 != arg0) {
			this.method1006(-1, null, this.anIntArray146, arg0);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)I")
	public int method993() {
		return this.anInt1483 == -1 ? (this.anIntArray147[8] << 10) + (this.anIntArray146[0] << 25) + (this.anIntArray146[4] << 20) + (this.anIntArray147[0] << 15) - (-(this.anIntArray147[11] << 5) - this.anIntArray147[1]) : Static87.method896(this.anInt1483).anInt2344 + 305419896;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!nc;IILclient!nc;I)Lclient!ad;")
	public Class2_Sub1_Sub1_Sub2 method995(@OriginalArg(0) Class2_Sub1_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub1_Sub7 arg2, @OriginalArg(4) int arg3) {
		if (this.anInt1483 != -1) {
			return Static87.method896(this.anInt1483).method1661(arg1, arg2, arg0, arg3);
		}
		@Pc(26) long local26 = this.aLong41;
		@Pc(29) int[] local29 = this.anIntArray147;
		if (arg2 != null && (arg2.anInt1969 >= 0 || arg2.anInt1965 >= 0)) {
			local29 = new int[12];
			for (@Pc(45) int local45 = 0; local45 < 12; local45++) {
				local29[local45] = this.anIntArray147[local45];
			}
			if (arg2.anInt1969 >= 0) {
				local26 += arg2.anInt1969 - this.anIntArray147[5] << 8;
				local29[5] = arg2.anInt1969;
			}
			if (arg2.anInt1965 >= 0) {
				local26 += arg2.anInt1965 - this.anIntArray147[3] << 16;
				local29[3] = arg2.anInt1965;
			}
		}
		@Pc(109) Class2_Sub1_Sub1_Sub2 local109 = (Class2_Sub1_Sub1_Sub2) Static54.aClass55_42.method1410(local26);
		if (local109 == null) {
			@Pc(113) boolean local113 = false;
			for (@Pc(115) int local115 = 0; local115 < 12; local115++) {
				@Pc(121) int local121 = local29[local115];
				if (local121 >= 256 && local121 < 512 && !Static96.method1764(local121 - 256).method2228()) {
					local113 = true;
				}
				if (local121 >= 512 && !Static102.method1800(local121 - 512).method1574(this.aBoolean103)) {
					local113 = true;
				}
			}
			if (local113) {
				if (this.aLong40 != -1L) {
					local109 = (Class2_Sub1_Sub1_Sub2) Static54.aClass55_42.method1410(this.aLong40);
				}
				if (local109 == null) {
					return null;
				}
			}
			if (local109 == null) {
				@Pc(186) int local186 = 0;
				@Pc(189) Class2_Sub1_Sub1_Sub7[] local189 = new Class2_Sub1_Sub1_Sub7[12];
				for (@Pc(191) int local191 = 0; local191 < 12; local191++) {
					@Pc(197) int local197 = local29[local191];
					@Pc(211) Class2_Sub1_Sub1_Sub7 local211;
					if (local197 >= 256 && local197 < 512) {
						local211 = Static96.method1764(local197 - 256).method2217();
						if (local211 != null) {
							local189[local186++] = local211;
						}
					}
					if (local197 >= 512) {
						local211 = Static102.method1800(local197 - 512).method1580(this.aBoolean103);
						if (local211 != null) {
							local189[local186++] = local211;
						}
					}
				}
				@Pc(250) Class2_Sub1_Sub1_Sub7 local250 = new Class2_Sub1_Sub1_Sub7(local189, local186);
				for (@Pc(252) int local252 = 0; local252 < 5; local252++) {
					if (Static126.aShortArrayArray14[local252].length > this.anIntArray146[local252]) {
						local250.method2184(Static26.aShortArray5[local252], Static126.aShortArrayArray14[local252][this.anIntArray146[local252]]);
					}
					if (this.anIntArray146[local252] < Static25.aShortArrayArray7[local252].length) {
						local250.method2184(Static95.aShortArray19[local252], Static25.aShortArrayArray7[local252][this.anIntArray146[local252]]);
					}
				}
				local109 = local250.method2176(64, 850, -30, -50, -30);
				Static54.aClass55_42.method1411(local26, local109);
				this.aLong40 = local26;
			}
		}
		if (arg2 == null && arg0 == null) {
			return local109;
		}
		@Pc(350) Class2_Sub1_Sub1_Sub2 local350;
		if (arg2 != null && arg0 != null) {
			local350 = arg2.method1272(arg1, arg0, arg3, local109);
		} else if (arg2 == null) {
			local350 = arg0.method1271(local109, arg1);
		} else {
			local350 = arg2.method1271(local109, arg3);
		}
		return local350;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lclient!na;B)V")
	public void method996(@OriginalArg(0) Class2_Sub9 arg0) {
		arg0.method644(this.aBoolean103 ? 1 : 0);
		@Pc(29) int local29;
		for (@Pc(20) int local20 = 0; local20 < 7; local20++) {
			local29 = this.anIntArray147[Static63.anIntArray57[local20]];
			if (local29 == 0) {
				arg0.method644(-1);
			} else {
				arg0.method644(local29 - 256);
			}
		}
		for (local29 = 0; local29 < 5; local29++) {
			arg0.method644(this.anIntArray146[local29]);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZB)V")
	public void method997(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) int local8 = this.anIntArray146[arg0];
		if (arg1) {
			local8++;
			if (local8 >= Static126.aShortArrayArray14[arg0].length) {
				local8 = 0;
			}
		} else {
			local8--;
			if (local8 < 0) {
				local8 = Static126.aShortArrayArray14[arg0].length - 1;
			}
		}
		this.anIntArray146[arg0] = local8;
		this.method999();
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
	private void method999() {
		@Pc(10) int local10 = this.anIntArray147[5];
		@Pc(19) long local19 = this.aLong41;
		@Pc(24) int local24 = this.anIntArray147[9];
		this.anIntArray147[9] = local10;
		this.anIntArray147[5] = local24;
		this.aLong41 = 0L;
		for (@Pc(39) int local39 = 0; local39 < 12; local39++) {
			this.aLong41 <<= 0x4;
			if (this.anIntArray147[local39] >= 256) {
				this.aLong41 += this.anIntArray147[local39] - 256;
			}
		}
		if (this.anIntArray147[0] >= 256) {
			this.aLong41 += this.anIntArray147[0] - 256 >> 4;
		}
		if (this.anIntArray147[1] >= 256) {
			this.aLong41 += this.anIntArray147[1] - 256 >> 8;
		}
		for (@Pc(117) int local117 = 0; local117 < 5; local117++) {
			this.aLong41 <<= 0x3;
			this.aLong41 += this.anIntArray146[local117];
		}
		this.anIntArray147[5] = local10;
		this.anIntArray147[9] = local24;
		this.aLong41 <<= 0x1;
		this.aLong41 += this.aBoolean103 ? 1 : 0;
		if (local19 != 0L && this.aLong41 != local19) {
			Static54.aClass55_42.method1416(local19);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IZI)V")
	public void method1000(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1 && this.aBoolean103) {
			return;
		}
		@Pc(27) int local27 = this.anIntArray147[Static63.anIntArray57[arg1]];
		if (local27 == 0) {
			return;
		}
		local27 -= 256;
		@Pc(62) Class2_Sub1_Sub17 local62;
		do {
			if (arg0) {
				local27++;
				if (Static61.anInt1680 <= local27) {
					local27 = 0;
				}
			} else {
				local27--;
				if (local27 < 0) {
					local27 = Static61.anInt1680 - 1;
				}
			}
			local62 = Static96.method1764(local27);
		} while (local62 == null || local62.aBoolean251 || arg1 + (this.aBoolean103 ? 7 : 0) != local62.anInt3076);
		this.anIntArray147[Static63.anIntArray57[arg1]] = local27 + 256;
		this.method999();
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)Lclient!wc;")
	public Class2_Sub1_Sub1_Sub7 method1003() {
		if (this.anInt1483 != -1) {
			return Static87.method896(this.anInt1483).method1667();
		}
		@Pc(20) boolean local20 = false;
		for (@Pc(22) int local22 = 0; local22 < 12; local22++) {
			@Pc(29) int local29 = this.anIntArray147[local22];
			if (local29 >= 256 && local29 < 512 && !Static96.method1764(local29 - 256).method2218()) {
				local20 = true;
			}
			if (local29 >= 512 && !Static102.method1800(local29 - 512).method1576(this.aBoolean103)) {
				local20 = true;
			}
		}
		if (local20) {
			return null;
		}
		@Pc(73) Class2_Sub1_Sub1_Sub7[] local73 = new Class2_Sub1_Sub1_Sub7[12];
		@Pc(75) int local75 = 0;
		for (@Pc(77) int local77 = 0; local77 < 12; local77++) {
			@Pc(84) int local84 = this.anIntArray147[local77];
			@Pc(102) Class2_Sub1_Sub1_Sub7 local102;
			if (local84 >= 256 && local84 < 512) {
				local102 = Static96.method1764(local84 - 256).method2227();
				if (local102 != null) {
					local73[local75++] = local102;
				}
			}
			if (local84 >= 512) {
				local102 = Static102.method1800(local84 - 512).method1568(this.aBoolean103);
				if (local102 != null) {
					local73[local75++] = local102;
				}
			}
		}
		@Pc(145) Class2_Sub1_Sub1_Sub7 local145 = new Class2_Sub1_Sub1_Sub7(local73, local75);
		for (@Pc(147) int local147 = 0; local147 < 5; local147++) {
			if (this.anIntArray146[local147] < Static126.aShortArrayArray14[local147].length) {
				local145.method2184(Static26.aShortArray5[local147], Static126.aShortArrayArray14[local147][this.anIntArray146[local147]]);
			}
			if (this.anIntArray146[local147] < Static25.aShortArrayArray7[local147].length) {
				local145.method2184(Static95.aShortArray19[local147], Static25.aShortArrayArray7[local147][this.anIntArray146[local147]]);
			}
		}
		return local145;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I[IB[IZ)V")
	public void method1006(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) boolean arg3) {
		if (arg1 == null) {
			arg1 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static61.anInt1680; local16++) {
					@Pc(22) Class2_Sub1_Sub17 local22 = Static96.method1764(local16);
					if (local22 != null && !local22.aBoolean251 && local22.anInt3076 == (arg3 ? 7 : 0) + local12) {
						arg1[Static63.anIntArray57[local12]] = local16 + 256;
						break;
					}
				}
			}
		}
		this.anIntArray146 = arg2;
		this.anIntArray147 = arg1;
		this.aBoolean103 = arg3;
		this.anInt1483 = arg0;
		this.method999();
	}
}
