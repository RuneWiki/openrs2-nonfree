import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class52 {

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
	private int anInt2195;

	@OriginalMember(owner = "client!mc", name = "h", descriptor = "[I")
	private int[] anIntArray225;

	@OriginalMember(owner = "client!mc", name = "u", descriptor = "Z")
	public boolean aBoolean147;

	@OriginalMember(owner = "client!mc", name = "v", descriptor = "J")
	private long aLong103;

	@OriginalMember(owner = "client!mc", name = "y", descriptor = "[I")
	private int[] anIntArray227;

	@OriginalMember(owner = "client!mc", name = "C", descriptor = "J")
	private long aLong104;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "([IZ[III)V")
	public void method1698(@OriginalArg(0) int[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg0 == null) {
			arg0 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static38.anInt3122; local16++) {
					@Pc(22) Class3_Sub1_Sub9 local22 = Static157.method2516(local16);
					if (local22 != null && !local22.aBoolean91 && local22.anInt1364 == (arg1 ? 7 : 0) + local12) {
						arg0[Static32.anIntArray77[local12]] = local16 + 256;
						break;
					}
				}
			}
		}
		this.anIntArray227 = arg0;
		this.anIntArray225 = arg2;
		this.aBoolean147 = arg1;
		this.anInt2195 = arg3;
		this.method1702();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILclient!gg;Lclient!gg;I)Lclient!o;")
	public Class3_Sub1_Sub4_Sub5 method1699(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub1_Sub8 arg1, @OriginalArg(3) Class3_Sub1_Sub8 arg2, @OriginalArg(4) int arg3) {
		if (this.anInt2195 != -1) {
			return Static164.method2578(this.anInt2195).method1205(arg1, arg2, arg0, arg3);
		}
		@Pc(25) int[] local25 = this.anIntArray227;
		@Pc(28) long local28 = this.aLong104;
		if (arg1 != null && (arg1.anInt1313 >= 0 || arg1.anInt1311 >= 0)) {
			local25 = new int[12];
			for (@Pc(41) int local41 = 0; local41 < 12; local41++) {
				local25[local41] = this.anIntArray227[local41];
			}
			if (arg1.anInt1313 >= 0) {
				local28 += arg1.anInt1313 - this.anIntArray227[5] << 8;
				local25[5] = arg1.anInt1313;
			}
			if (arg1.anInt1311 >= 0) {
				local28 += arg1.anInt1311 - this.anIntArray227[3] << 16;
				local25[3] = arg1.anInt1311;
			}
		}
		@Pc(106) Class3_Sub1_Sub4_Sub5 local106 = (Class3_Sub1_Sub4_Sub5) Static13.aClass7_5.method183(local28);
		if (local106 == null) {
			@Pc(110) boolean local110 = false;
			for (@Pc(112) int local112 = 0; local112 < 12; local112++) {
				@Pc(118) int local118 = local25[local112];
				if (local118 >= 256 && local118 < 512 && !Static157.method2516(local118 - 256).method1014()) {
					local110 = true;
				}
				if (local118 >= 512 && !Static3.method42(local118 - 512).method942(this.aBoolean147)) {
					local110 = true;
				}
			}
			if (local110) {
				if (this.aLong103 != -1L) {
					local106 = (Class3_Sub1_Sub4_Sub5) Static13.aClass7_5.method183(this.aLong103);
				}
				if (local106 == null) {
					return null;
				}
			}
			if (local106 == null) {
				@Pc(178) Class3_Sub1_Sub4_Sub4[] local178 = new Class3_Sub1_Sub4_Sub4[12];
				@Pc(180) int local180 = 0;
				for (@Pc(182) int local182 = 0; local182 < 12; local182++) {
					@Pc(188) int local188 = local25[local182];
					@Pc(206) Class3_Sub1_Sub4_Sub4 local206;
					if (local188 >= 256 && local188 < 512) {
						local206 = Static157.method2516(local188 - 256).method1018();
						if (local206 != null) {
							local178[local180++] = local206;
						}
					}
					if (local188 >= 512) {
						local206 = Static3.method42(local188 - 512).method939(this.aBoolean147);
						if (local206 != null) {
							local178[local180++] = local206;
						}
					}
				}
				@Pc(245) Class3_Sub1_Sub4_Sub4 local245 = new Class3_Sub1_Sub4_Sub4(local178, local180);
				for (@Pc(247) int local247 = 0; local247 < 5; local247++) {
					if (Static5.aShortArrayArray1[local247].length > this.anIntArray225[local247]) {
						local245.method1552(Static103.aShortArray25[local247], Static5.aShortArrayArray1[local247][this.anIntArray225[local247]]);
					}
					if (Static157.aShortArrayArray5[local247].length > this.anIntArray225[local247]) {
						local245.method1552(Static28.aShortArray1[local247], Static157.aShortArrayArray5[local247][this.anIntArray225[local247]]);
					}
				}
				local106 = local245.method1558(64, 850, -30, -50, -30, true);
				Static13.aClass7_5.method186(local106, local28);
				this.aLong103 = local28;
			}
		}
		if (arg1 == null && arg2 == null) {
			return local106;
		}
		@Pc(335) Class3_Sub1_Sub4_Sub5 local335;
		if (arg1 != null && arg2 != null) {
			local335 = arg1.method984(arg2, arg3, local106, arg0);
		} else if (arg1 == null) {
			local335 = arg2.method993(arg3, local106);
		} else {
			local335 = arg1.method993(arg0, local106);
		}
		return local335;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZII)V")
	public void method1701(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(4) int local4 = this.anIntArray225[arg1];
		if (arg0) {
			local4++;
			if (Static5.aShortArrayArray1[arg1].length <= local4) {
				local4 = 0;
			}
		} else {
			local4--;
			if (local4 < 0) {
				local4 = Static5.aShortArrayArray1[arg1].length - 1;
			}
		}
		this.anIntArray225[arg1] = local4;
		this.method1702();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
	private void method1702() {
		@Pc(8) long local8 = this.aLong104;
		this.aLong104 = 0L;
		@Pc(16) int local16 = this.anIntArray227[5];
		@Pc(21) int local21 = this.anIntArray227[9];
		this.anIntArray227[9] = local16;
		this.anIntArray227[5] = local21;
		for (@Pc(33) int local33 = 0; local33 < 12; local33++) {
			this.aLong104 <<= 0x4;
			if (this.anIntArray227[local33] >= 256) {
				this.aLong104 += this.anIntArray227[local33] - 256;
			}
		}
		if (this.anIntArray227[0] >= 256) {
			this.aLong104 += this.anIntArray227[0] - 256 >> 4;
		}
		if (this.anIntArray227[1] >= 256) {
			this.aLong104 += this.anIntArray227[1] - 256 >> 8;
		}
		for (@Pc(107) int local107 = 0; local107 < 5; local107++) {
			this.aLong104 <<= 0x3;
			this.aLong104 += this.anIntArray225[local107];
		}
		this.anIntArray227[5] = local16;
		this.anIntArray227[9] = local21;
		this.aLong104 <<= 0x1;
		this.aLong104 += this.aBoolean147 ? 1 : 0;
		if (local8 != 0L && this.aLong104 != local8) {
			Static13.aClass7_5.method189(local8);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lclient!ff;B)V")
	public void method1703(@OriginalArg(0) Class3_Sub12 arg0) {
		arg0.method1383(this.aBoolean147 ? 1 : 0);
		@Pc(31) int local31;
		for (@Pc(16) int local16 = 0; local16 < 7; local16++) {
			local31 = this.anIntArray227[Static32.anIntArray77[local16]];
			if (local31 == 0) {
				arg0.method1383(-1);
			} else {
				arg0.method1383(local31 - 256);
			}
		}
		for (local31 = 0; local31 < 5; local31++) {
			arg0.method1383(this.anIntArray225[local31]);
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZLclient!gg;I)Lclient!o;")
	public Class3_Sub1_Sub4_Sub5 method1704(@OriginalArg(1) Class3_Sub1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (this.anInt2195 != -1) {
			return Static164.method2578(this.anInt2195).method1204(arg0, arg1);
		}
		@Pc(34) Class3_Sub1_Sub4_Sub5 local34 = (Class3_Sub1_Sub4_Sub5) Static80.aClass7_11.method183(this.aLong104);
		if (local34 == null) {
			@Pc(38) boolean local38 = false;
			for (@Pc(40) int local40 = 0; local40 < 12; local40++) {
				@Pc(47) int local47 = this.anIntArray227[local40];
				if (local47 >= 256 && local47 < 512 && !Static157.method2516(local47 - 256).method1016()) {
					local38 = true;
				}
				if (local47 >= 512 && !Static3.method42(local47 - 512).method940(this.aBoolean147)) {
					local38 = true;
				}
			}
			if (local38) {
				return null;
			}
			@Pc(95) Class3_Sub1_Sub4_Sub4[] local95 = new Class3_Sub1_Sub4_Sub4[12];
			@Pc(97) int local97 = 0;
			for (@Pc(99) int local99 = 0; local99 < 12; local99++) {
				@Pc(106) int local106 = this.anIntArray227[local99];
				@Pc(124) Class3_Sub1_Sub4_Sub4 local124;
				if (local106 >= 256 && local106 < 512) {
					local124 = Static157.method2516(local106 - 256).method1021();
					if (local124 != null) {
						local95[local97++] = local124;
					}
				}
				if (local106 >= 512) {
					local124 = Static3.method42(local106 - 512).method936(this.aBoolean147);
					if (local124 != null) {
						local95[local97++] = local124;
					}
				}
			}
			@Pc(163) Class3_Sub1_Sub4_Sub4 local163 = new Class3_Sub1_Sub4_Sub4(local95, local97);
			for (@Pc(165) int local165 = 0; local165 < 5; local165++) {
				if (Static5.aShortArrayArray1[local165].length > this.anIntArray225[local165]) {
					local163.method1552(Static103.aShortArray25[local165], Static5.aShortArrayArray1[local165][this.anIntArray225[local165]]);
				}
				if (Static157.aShortArrayArray5[local165].length > this.anIntArray225[local165]) {
					local163.method1552(Static28.aShortArray1[local165], Static157.aShortArrayArray5[local165][this.anIntArray225[local165]]);
				}
			}
			local34 = local163.method1558(64, 768, -50, -10, -50, true);
			Static80.aClass7_11.method186(local34, this.aLong104);
		}
		if (arg0 != null) {
			local34 = arg0.method988(local34, arg1);
		}
		return local34;
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZI)V")
	public void method1705(@OriginalArg(0) boolean arg0) {
		if (this.aBoolean147 != arg0) {
			this.method1698(null, arg0, this.anIntArray225, -1);
		}
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(ZII)V")
	public void method1706(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1 && this.aBoolean147) {
			return;
		}
		@Pc(21) int local21 = this.anIntArray227[Static32.anIntArray77[arg1]];
		if (local21 == 0) {
			return;
		}
		local21 -= 256;
		@Pc(52) Class3_Sub1_Sub9 local52;
		do {
			if (arg0) {
				local21++;
				if (Static38.anInt3122 <= local21) {
					local21 = 0;
				}
			} else {
				local21--;
				if (local21 < 0) {
					local21 = Static38.anInt3122 - 1;
				}
			}
			local52 = Static157.method2516(local21);
		} while (local52 == null || local52.aBoolean91 || (this.aBoolean147 ? 7 : 0) + arg1 != local52.anInt1364);
		this.anIntArray227[Static32.anIntArray77[arg1]] = local21 + 256;
		this.method1702();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)I")
	public int method1710() {
		return this.anInt2195 == -1 ? (this.anIntArray227[11] << 5) + (this.anIntArray227[0] << 15) + (this.anIntArray225[0] << 25) + (this.anIntArray225[4] << 20) + (this.anIntArray227[8] << 10) + this.anIntArray227[1] : 305419896 - -Static164.method2578(this.anInt2195).anInt1568;
	}
}
