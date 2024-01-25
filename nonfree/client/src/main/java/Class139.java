import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gi")
public final class Class139 {

	@OriginalMember(owner = "client!gi", name = "c", descriptor = "I")
	private int anInt3447;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!gi", name = "m", descriptor = "[S")
	private short[] aShortArray25;

	@OriginalMember(owner = "client!gi", name = "b", descriptor = "Lclient!faa;")
	public Class106 aClass106_1;

	@OriginalMember(owner = "client!gi", name = "k", descriptor = "I")
	public int anInt3456;

	@OriginalMember(owner = "client!gi", name = "e", descriptor = "[S")
	private short[] aShortArray26;

	@OriginalMember(owner = "client!gi", name = "d", descriptor = "[S")
	private short[] aShortArray27;

	@OriginalMember(owner = "client!gi", name = "t", descriptor = "I")
	private int anInt3446 = 128;

	@OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
	private int anInt3455 = 0;

	@OriginalMember(owner = "client!gi", name = "l", descriptor = "B")
	public byte aByte61 = 0;

	@OriginalMember(owner = "client!gi", name = "r", descriptor = "I")
	public int anInt3453 = -1;

	@OriginalMember(owner = "client!gi", name = "s", descriptor = "Z")
	public boolean aBoolean218 = false;

	@OriginalMember(owner = "client!gi", name = "u", descriptor = "I")
	private int anInt3454 = 0;

	@OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
	private int anInt3458 = 128;

	@OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
	private int anInt3459 = 0;

	@OriginalMember(owner = "client!gi", name = "n", descriptor = "I")
	private int anInt3451 = -1;

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!ika;BI)V")
	private void method3143(@OriginalArg(0) Class3_Sub2 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3447 = arg0.method2028(-14795);
		} else if (arg1 == 2) {
			this.anInt3453 = arg0.method2028(-14795);
		} else if (arg1 == 4) {
			this.anInt3446 = arg0.method2028(-14795);
		} else if (arg1 == 5) {
			this.anInt3458 = arg0.method2028(-14795);
		} else if (arg1 == 6) {
			this.anInt3454 = arg0.method2028(-14795);
		} else if (arg1 == 7) {
			this.anInt3455 = arg0.method2048(255);
		} else if (arg1 == 8) {
			this.anInt3459 = arg0.method2048(255);
		} else if (arg1 == 9) {
			this.aByte61 = 3;
			this.anInt3451 = 8224;
		} else if (arg1 == 10) {
			this.aBoolean218 = true;
		} else if (arg1 == 11) {
			this.aByte61 = 1;
		} else if (arg1 == 12) {
			this.aByte61 = 4;
		} else if (arg1 == 13) {
			this.aByte61 = 5;
		} else if (arg1 == 14) {
			this.aByte61 = 2;
			this.anInt3451 = arg0.method2048(255) * 256;
		} else if (arg1 == 15) {
			this.aByte61 = 3;
			this.anInt3451 = arg0.method2028(-14795);
		} else if (arg1 == 16) {
			this.aByte61 = 3;
			this.anInt3451 = arg0.method2036();
		} else {
			@Pc(185) int local185;
			@Pc(195) int local195;
			if (arg1 == 40) {
				local185 = arg0.method2048(255);
				this.aShortArray24 = new short[local185];
				this.aShortArray26 = new short[local185];
				for (local195 = 0; local195 < local185; local195++) {
					this.aShortArray26[local195] = (short) arg0.method2028(-14795);
					this.aShortArray24[local195] = (short) arg0.method2028(-14795);
				}
			} else if (arg1 == 41) {
				local185 = arg0.method2048(255);
				this.aShortArray27 = new short[local185];
				this.aShortArray25 = new short[local185];
				for (local195 = 0; local195 < local185; local195++) {
					this.aShortArray25[local195] = (short) arg0.method2028(-14795);
					this.aShortArray27[local195] = (short) arg0.method2028(-14795);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZLclient!s;Lclient!s;IBLclient!rf;BIIILclient!ha;)Lclient!ka;")
	public Class170 method3144(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class259 arg1, @OriginalArg(2) Class259 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class45 arg4, @OriginalArg(6) byte arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) Class22 arg9) {
		@Pc(28) boolean local28 = arg0 & this.aByte61 != 0;
		@Pc(30) int local30 = arg3;
		if (arg4 != null) {
			local30 = arg3 | arg4.method6588();
		}
		if (local28) {
			local30 |= this.aByte61 == 3 ? 7 : 2;
		}
		if (this.anInt3458 != 128) {
			local30 |= 0x2;
		}
		if (this.anInt3446 != 128 || this.anInt3454 != 0) {
			local30 |= 0x5;
		}
		@Pc(85) Class307 local85 = this.aClass106_1.aClass307_38;
		@Pc(105) Class170 local105;
		synchronized (this.aClass106_1.aClass307_38) {
			local105 = (Class170) this.aClass106_1.aClass307_38.method7002((long) (this.anInt3456 |= arg9.anInt11007 << 29));
		}
		if (local105 == null || arg9.method9324(local105.ua(), local30) != 0) {
			if (local105 != null) {
				local30 = arg9.method9375(local30, local105.ua());
			}
			@Pc(136) int local136 = local30;
			if (this.aShortArray26 != null) {
				local136 = local30 | 0x4000;
			}
			if (this.aShortArray25 != null) {
				local136 |= 0x8000;
			}
			@Pc(159) Class145 local159 = Static716.method9500(this.anInt3447, this.aClass106_1.aClass182_42);
			if (local159 == null) {
				return null;
			}
			if (local159.anInt3633 < 13) {
				local159.method3297(2);
			}
			local105 = arg9.method9382(local159, local136, this.aClass106_1.anInt2857, this.anInt3455 + 64, this.anInt3459 + 850);
			@Pc(195) int local195;
			if (this.aShortArray26 != null) {
				for (local195 = 0; local195 < this.aShortArray26.length; local195++) {
					local105.ia(this.aShortArray26[local195], this.aShortArray24[local195]);
				}
			}
			if (this.aShortArray25 != null) {
				for (local195 = 0; local195 < this.aShortArray25.length; local195++) {
					local105.aa(this.aShortArray25[local195], this.aShortArray27[local195]);
				}
			}
			local105.s(local30);
			@Pc(253) Class307 local253 = this.aClass106_1.aClass307_38;
			synchronized (this.aClass106_1.aClass307_38) {
				this.aClass106_1.aClass307_38.method7000(local105, (long) (this.anInt3456 |= arg9.anInt11007 << 29));
			}
		}
		@Pc(284) Class170 local284 = local105.method8369(arg5, local30, true);
		if (arg4 != null) {
			arg4.method6574(0, local284);
		}
		if (this.anInt3446 != 128 || this.anInt3458 != 128) {
			local284.O(this.anInt3446, this.anInt3458, this.anInt3446);
		}
		if (this.anInt3454 != 0) {
			if (this.anInt3454 == 90) {
				local284.a(4096);
			}
			if (this.anInt3454 == 180) {
				local284.a(8192);
			}
			if (this.anInt3454 == 270) {
				local284.a(12288);
			}
		}
		if (local28) {
			local284.p(this.aByte61, this.anInt3451, arg2, arg1, arg6, arg8, arg7);
		}
		local284.s(arg3);
		return local284;
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lclient!ika;Z)V")
	public void method3145(@OriginalArg(0) Class3_Sub2 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method2048(255);
			if (local5 == 0) {
				return;
			}
			this.method3143(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZILclient!rf;Lclient!ha;B)Lclient!ka;")
	public Class170 method3146(@OriginalArg(1) int arg0, @OriginalArg(2) Class45 arg1, @OriginalArg(3) Class22 arg2, @OriginalArg(4) byte arg3) {
		return this.method3144(false, (Class259) null, (Class259) null, arg0, arg1, arg3, 0, 0, 0, arg2);
	}
}
