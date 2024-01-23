import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ij")
public final class Class50 {

	@OriginalMember(owner = "client!ij", name = "g", descriptor = "[I")
	private int[] anIntArray239;

	@OriginalMember(owner = "client!ij", name = "j", descriptor = "Z")
	public boolean aBoolean110;

	@OriginalMember(owner = "client!ij", name = "o", descriptor = "[I")
	private int[] anIntArray240;

	@OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
	private int anInt2055;

	@OriginalMember(owner = "client!ij", name = "w", descriptor = "J")
	private long aLong62;

	@OriginalMember(owner = "client!ij", name = "x", descriptor = "J")
	private long aLong63;

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)I")
	public int method1517() {
		return this.anInt2055 == -1 ? (this.anIntArray240[11] << 5) + (this.anIntArray239[4] << 20) + (this.anIntArray239[0] << 25) + (this.anIntArray240[0] << 15) + (this.anIntArray240[8] << 10) + this.anIntArray240[1] : Static52.method1014(this.anInt2055).anInt2305 + 305419896;
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V")
	private void method1519() {
		@Pc(8) long local8 = this.aLong62;
		this.aLong62 = -1L;
		@Pc(19) long[] local19 = Class1_Sub2_Sub5.aLongArray2;
		for (@Pc(21) int local21 = 0; local21 < 12; local21++) {
			this.aLong62 = local19[(int) (((long) (this.anIntArray240[local21] >> 24) ^ this.aLong62) & 0xFFL)] ^ this.aLong62 >>> 8;
			this.aLong62 = this.aLong62 >>> 8 ^ local19[(int) (((long) (this.anIntArray240[local21] >> 16) ^ this.aLong62) & 0xFFL)];
			this.aLong62 = local19[(int) (((long) (this.anIntArray240[local21] >> 8) ^ this.aLong62) & 0xFFL)] ^ this.aLong62 >>> 8;
			this.aLong62 = this.aLong62 >>> 8 ^ local19[(int) ((this.aLong62 ^ (long) this.anIntArray240[local21]) & 0xFFL)];
		}
		for (@Pc(115) int local115 = 0; local115 < 5; local115++) {
			this.aLong62 = this.aLong62 >>> 8 ^ local19[(int) ((this.aLong62 ^ (long) this.anIntArray239[local115]) & 0xFFL)];
		}
		this.aLong62 = this.aLong62 >>> 8 ^ local19[(int) ((this.aLong62 ^ (long) (this.aBoolean110 ? 1 : 0)) & 0xFFL)];
		if (local8 != 0L && this.aLong62 != local8) {
			Static71.aClass27_44.method964(local8);
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Z[IB[II)V")
	public void method1520(@OriginalArg(0) boolean arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 == null) {
			arg1 = new int[12];
			for (@Pc(12) int local12 = 0; local12 < 7; local12++) {
				for (@Pc(16) int local16 = 0; local16 < Static197.anInt4207; local16++) {
					@Pc(22) Class1_Sub1_Sub7 local22 = Static74.method1346(local16);
					if (local22 != null && !local22.aBoolean80 && (arg0 ? 7 : 0) + local12 == local22.anInt1546) {
						arg1[Static194.anIntArray537[local12]] = Integer.MIN_VALUE | local16;
						break;
					}
				}
			}
		}
		this.anIntArray239 = arg2;
		this.anInt2055 = arg3;
		this.anIntArray240 = arg1;
		this.aBoolean110 = arg0;
		this.method1519();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)V")
	public void method1522(@OriginalArg(1) boolean arg0) {
		this.aBoolean110 = arg0;
		this.method1519();
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIB)V")
	public void method1523(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray239[arg0] = arg1;
		this.method1519();
	}

	@OriginalMember(owner = "client!ij", name = "b", descriptor = "(IIB)V")
	public void method1524(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = Static194.anIntArray537[arg1];
		if (this.anIntArray240[local3] != 0 && Static74.method1346(arg0) != null) {
			this.anIntArray240[local3] = Integer.MIN_VALUE | arg0;
			this.method1519();
		}
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(IILclient!pj;)Lclient!cf;")
	public Class9_Sub2 method1525(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1_Sub21 arg1) {
		if (this.anInt2055 != -1) {
			return Static52.method1014(this.anInt2055).method1744(arg1, arg0);
		}
		@Pc(37) Class9_Sub2 local37 = (Class9_Sub2) Static131.aClass27_74.method965(this.aLong62);
		if (local37 == null) {
			@Pc(41) boolean local41 = false;
			for (@Pc(43) int local43 = 0; local43 < 12; local43++) {
				@Pc(50) int local50 = this.anIntArray240[local43];
				if ((local50 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local50) != 0 && !Static74.method1346(local50 & 0x3FFFFFFF).method1116()) {
						local41 = true;
					}
				} else if (!Static191.method2990(local50 & 0x3FFFFFFF).method2297(this.aBoolean110)) {
					local41 = true;
				}
			}
			if (local41) {
				return null;
			}
			@Pc(98) Class9_Sub1[] local98 = new Class9_Sub1[12];
			@Pc(100) int local100 = 0;
			for (@Pc(102) int local102 = 0; local102 < 12; local102++) {
				@Pc(109) int local109 = this.anIntArray240[local102];
				@Pc(126) Class9_Sub1 local126;
				if ((local109 & 0x40000000) != 0) {
					local126 = Static191.method2990(local109 & 0x3FFFFFFF).method2294(this.aBoolean110);
					if (local126 != null) {
						local98[local100++] = local126;
					}
				} else if ((local109 & Integer.MIN_VALUE) != 0) {
					local126 = Static74.method1346(local109 & 0x3FFFFFFF).method1114();
					if (local126 != null) {
						local98[local100++] = local126;
					}
				}
			}
			@Pc(164) Class9_Sub1 local164 = new Class9_Sub1(local98, local100);
			for (@Pc(166) int local166 = 0; local166 < 5; local166++) {
				if (this.anIntArray239[local166] < Static190.aShortArrayArray7[local166].length) {
					local164.method276(Static10.aShortArray3[local166], Static190.aShortArrayArray7[local166][this.anIntArray239[local166]]);
				}
				if (this.anIntArray239[local166] < Static116.aShortArrayArray5[local166].length) {
					local164.method276(Static103.aShortArray31[local166], Static116.aShortArrayArray5[local166][this.anIntArray239[local166]]);
				}
			}
			local37 = local164.method288(64, 768, -50, -10, -50);
			Static131.aClass27_74.method961(local37, this.aLong62);
		}
		if (arg1 != null) {
			local37 = arg1.method2620(arg0, local37);
		}
		return local37;
	}

	@OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lclient!pj;IILclient!pj;I)Lclient!cf;")
	public Class9_Sub2 method1526(@OriginalArg(0) Class1_Sub1_Sub21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class1_Sub1_Sub21 arg3) {
		if (this.anInt2055 != -1) {
			return Static52.method1014(this.anInt2055).method1743(arg2, arg0, arg3, arg1);
		}
		@Pc(28) long local28 = this.aLong62;
		@Pc(31) int[] local31 = this.anIntArray240;
		if (arg0 != null && (arg0.anInt3452 >= 0 || arg0.anInt3451 >= 0)) {
			local31 = new int[12];
			for (@Pc(47) int local47 = 0; local47 < 12; local47++) {
				local31[local47] = this.anIntArray240[local47];
			}
			if (arg0.anInt3452 >= 0) {
				if (arg0.anInt3452 == 65535) {
					local31[5] = 0;
					local28 ^= 0xFFFFFFFF00000000L;
				} else {
					local31[5] = arg0.anInt3452 | 0x40000000;
					local28 ^= (long) local31[5] << 32;
				}
			}
			if (arg0.anInt3451 >= 0) {
				if (arg0.anInt3451 == 65535) {
					local31[3] = 0;
					local28 ^= 0xFFFFFFFFL;
				} else {
					local31[3] = arg0.anInt3451 | 0x40000000;
					local28 ^= local31[3];
				}
			}
		}
		@Pc(135) Class9_Sub2 local135 = (Class9_Sub2) Static71.aClass27_44.method965(local28);
		if (local135 == null) {
			@Pc(139) boolean local139 = false;
			for (@Pc(141) int local141 = 0; local141 < 12; local141++) {
				@Pc(147) int local147 = local31[local141];
				if ((local147 & 0x40000000) == 0) {
					if ((Integer.MIN_VALUE & local147) != 0 && !Static74.method1346(local147 & 0x3FFFFFFF).method1121()) {
						local139 = true;
					}
				} else if (!Static191.method2990(local147 & 0x3FFFFFFF).method2293(this.aBoolean110)) {
					local139 = true;
				}
			}
			if (local139) {
				if (this.aLong63 != -1L) {
					local135 = (Class9_Sub2) Static71.aClass27_44.method965(this.aLong63);
				}
				if (local135 == null) {
					return null;
				}
			}
			if (local135 == null) {
				@Pc(209) Class9_Sub1[] local209 = new Class9_Sub1[12];
				@Pc(211) int local211 = 0;
				@Pc(219) int local219;
				@Pc(236) Class9_Sub1 local236;
				for (@Pc(213) int local213 = 0; local213 < 12; local213++) {
					local219 = local31[local213];
					if ((local219 & 0x40000000) != 0) {
						local236 = Static191.method2990(local219 & 0x3FFFFFFF).method2304(this.aBoolean110);
						if (local236 != null) {
							local209[local211++] = local236;
						}
					} else if ((Integer.MIN_VALUE & local219) != 0) {
						local236 = Static74.method1346(local219 & 0x3FFFFFFF).method1122();
						if (local236 != null) {
							local209[local211++] = local236;
						}
					}
				}
				local219 = local31[0];
				@Pc(292) int local292;
				if ((local219 & 0x40000000) != 0) {
					@Pc(287) Class1_Sub1_Sub18 local287 = Static191.method2990(local219 & 0x3FFFFFFF);
					if (local287.anIntArrayArray46 != null) {
						for (local292 = 0; local292 < local287.anIntArrayArray46.length; local292++) {
							@Pc(301) int local301 = local287.anIntArrayArray46[local292][0];
							@Pc(308) int local308 = local287.anIntArrayArray46[local292][1];
							@Pc(315) int local315 = local287.anIntArrayArray46[local292][2];
							@Pc(322) int local322 = local287.anIntArrayArray46[local292][3];
							@Pc(329) int local329 = local287.anIntArrayArray46[local292][5];
							@Pc(336) int local336 = local287.anIntArrayArray46[local292][4];
							local209[local292 + 1].method284(local301, local308, local315);
							local209[local292 + 1].method267(local322, local336, local329);
						}
					}
				}
				local236 = new Class9_Sub1(local209, local211);
				for (local292 = 0; local292 < 5; local292++) {
					if (Static190.aShortArrayArray7[local292].length > this.anIntArray239[local292]) {
						local236.method276(Static10.aShortArray3[local292], Static190.aShortArrayArray7[local292][this.anIntArray239[local292]]);
					}
					if (Static116.aShortArrayArray5[local292].length > this.anIntArray239[local292]) {
						local236.method276(Static103.aShortArray31[local292], Static116.aShortArrayArray5[local292][this.anIntArray239[local292]]);
					}
				}
				local135 = local236.method288(64, 850, -30, -50, -30);
				Static71.aClass27_44.method961(local135, local28);
				this.aLong63 = local28;
			}
		}
		if (arg0 == null && arg3 == null) {
			return local135;
		}
		@Pc(456) Class9_Sub2 local456;
		if (arg0 != null && arg3 != null) {
			local456 = arg0.method2618(arg3, arg1, arg2, local135);
		} else if (arg0 == null) {
			local456 = arg3.method2615(arg2, local135);
		} else {
			local456 = arg0.method2615(arg1, local135);
		}
		return local456;
	}
}
