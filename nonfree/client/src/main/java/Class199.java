import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class199 {

	@OriginalMember(owner = "client!tp", name = "f", descriptor = "[I")
	private int[] anIntArray465;

	@OriginalMember(owner = "client!tp", name = "i", descriptor = "[I")
	public int[] anIntArray466;

	@OriginalMember(owner = "client!tp", name = "t", descriptor = "[Z")
	public boolean[] aBooleanArray29;

	@OriginalMember(owner = "client!tp", name = "v", descriptor = "[[I")
	public int[][] anIntArrayArray67;

	@OriginalMember(owner = "client!tp", name = "C", descriptor = "I")
	public int anInt6026;

	@OriginalMember(owner = "client!tp", name = "D", descriptor = "[I")
	public int[] anIntArray467;

	@OriginalMember(owner = "client!tp", name = "d", descriptor = "Z")
	public boolean aBoolean446 = false;

	@OriginalMember(owner = "client!tp", name = "k", descriptor = "I")
	public int anInt6012 = -1;

	@OriginalMember(owner = "client!tp", name = "u", descriptor = "I")
	public int anInt6020 = 5;

	@OriginalMember(owner = "client!tp", name = "o", descriptor = "I")
	public int anInt6015 = 2;

	@OriginalMember(owner = "client!tp", name = "l", descriptor = "Z")
	public boolean aBoolean447 = false;

	@OriginalMember(owner = "client!tp", name = "q", descriptor = "I")
	public int anInt6017 = -1;

	@OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
	public int anInt6008 = -1;

	@OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
	public int anInt6009 = -1;

	@OriginalMember(owner = "client!tp", name = "p", descriptor = "I")
	public int anInt6016 = -1;

	@OriginalMember(owner = "client!tp", name = "j", descriptor = "I")
	public int anInt6011 = 99;

	@OriginalMember(owner = "client!tp", name = "E", descriptor = "Z")
	public boolean aBoolean449 = false;

	@OriginalMember(owner = "client!tp", name = "y", descriptor = "Z")
	public boolean aBoolean448 = false;

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIILclient!bi;II)Lclient!bi;")
	public Class3 method5407(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class3 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray466[arg3];
		@Pc(13) int local13 = this.anIntArray467[arg3];
		@Pc(19) Class1_Sub4_Sub20 local19 = Static156.method2960(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg2.method1261((byte) 1, arg4, true);
		}
		@Pc(33) Class1_Sub4_Sub20 local33 = null;
		if ((this.aBoolean446 || Static21.aBoolean29) && arg1 != -1 && this.anIntArray467.length > arg1) {
			@Pc(56) int local56 = this.anIntArray467[arg1];
			local33 = Static156.method2960(local56 >> 16);
			arg1 = local56 & 0xFFFF;
		}
		@Pc(68) Class1_Sub4_Sub20 local68 = null;
		@Pc(70) Class1_Sub4_Sub20 local70 = null;
		@Pc(78) int local78 = 0;
		@Pc(80) int local80 = 0;
		if (this.anIntArray465 != null) {
			if (this.anIntArray465.length > arg3) {
				local78 = this.anIntArray465[arg3];
				if (local78 != 65535) {
					local68 = Static156.method2960(local78 >> 16);
					local78 &= 0xFFFF;
				}
			}
			if ((this.aBoolean446 || Static21.aBoolean29) && arg1 != -1 && arg1 < this.anIntArray465.length) {
				local80 = this.anIntArray465[arg1];
				if (local80 != 65535) {
					local70 = Static156.method2960(local80 >> 16);
					local80 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean448) {
			arg4 |= 0x200;
		}
		if (local19.method4029(local23)) {
			arg4 |= 0x80;
		}
		if (local19.method4032(local23)) {
			arg4 |= 0x100;
		}
		if (local68 != null) {
			if (local68.method4029(local78)) {
				arg4 |= 0x80;
			}
			if (local68.method4032(local78)) {
				arg4 |= 0x100;
			}
		}
		if (local33 != null) {
			if (local33.method4029(arg1)) {
				arg4 |= 0x80;
			}
			if (local33.method4032(arg1)) {
				arg4 |= 0x100;
			}
		}
		if (local70 != null) {
			if (local70.method4029(local80)) {
				arg4 |= 0x80;
			}
			if (local70.method4032(local80)) {
				arg4 |= 0x100;
			}
		}
		arg4 |= 0x20;
		@Pc(234) Class3 local234 = arg2.method1261((byte) 1, arg4, true);
		local234.method1279(local23, local19, arg1, arg0 - 1, this.aBoolean448, 0, local8, local33);
		if (local68 != null) {
			local234.method1279(local78, local68, local80, arg0 - 1, this.aBoolean448, 0, local8, local70);
		}
		return local234;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
	public void method5409() {
		if (this.anInt6017 == -1) {
			if (this.aBooleanArray29 == null) {
				this.anInt6017 = 0;
			} else {
				this.anInt6017 = 2;
			}
		}
		if (this.anInt6016 != -1) {
			return;
		}
		if (this.aBooleanArray29 == null) {
			this.anInt6016 = 0;
		} else {
			this.anInt6016 = 2;
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BLclient!at;)V")
	public void method5410(@OriginalArg(1) Class1_Sub7 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method2132();
			if (local13 == 0) {
				return;
			}
			this.method5415(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIBIBLclient!bi;II)Lclient!bi;")
	public Class3 method5411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class3 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray466[arg5];
		@Pc(13) int local13 = this.anIntArray467[arg5];
		@Pc(19) Class1_Sub4_Sub20 local19 = Static156.method2960(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg4.method1261(arg2, arg6, true);
		}
		@Pc(33) Class1_Sub4_Sub20 local33 = null;
		if ((this.aBoolean446 || Static21.aBoolean29) && arg0 != -1 && arg0 < this.anIntArray467.length) {
			@Pc(55) int local55 = this.anIntArray467[arg0];
			local33 = Static156.method2960(local55 >> 16);
			arg0 = local55 & 0xFFFF;
		}
		if (this.aBoolean448) {
			arg6 |= 0x200;
		}
		if (local19.method4029(local23)) {
			arg6 |= 0x80;
		}
		if (local19.method4032(local23)) {
			arg6 |= 0x100;
		}
		if (local33 != null) {
			if (local33.method4029(arg0)) {
				arg6 |= 0x80;
			}
			if (local33.method4032(arg0)) {
				arg6 |= 0x100;
			}
		}
		arg6 |= 0x20;
		@Pc(120) Class3 local120 = arg4.method1261(arg2, arg6, true);
		local120.method1279(local23, local19, arg0, arg3 - 1, this.aBoolean448, arg1, local8, local33);
		return local120;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IILclient!at;)V")
	private void method5415(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		@Pc(119) int local119;
		@Pc(125) int local125;
		@Pc(131) int local131;
		@Pc(153) int local153;
		if (arg0 == 1) {
			local119 = arg1.method2161();
			this.anIntArray466 = new int[local119];
			for (local125 = 0; local125 < local119; local125++) {
				this.anIntArray466[local125] = arg1.method2161();
			}
			this.anIntArray467 = new int[local119];
			for (local131 = 0; local131 < local119; local131++) {
				this.anIntArray467[local131] = arg1.method2161();
			}
			for (local153 = 0; local153 < local119; local153++) {
				this.anIntArray467[local153] += arg1.method2161() << 16;
			}
		} else if (arg0 == 2) {
			this.anInt6009 = arg1.method2161();
		} else if (arg0 == 3) {
			this.aBooleanArray29 = new boolean[256];
			local119 = arg1.method2132();
			for (local125 = 0; local125 < local119; local125++) {
				this.aBooleanArray29[arg1.method2132()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean449 = true;
		} else if (arg0 == 5) {
			this.anInt6020 = arg1.method2132();
		} else if (arg0 == 6) {
			this.anInt6012 = arg1.method2161();
		} else if (arg0 == 7) {
			this.anInt6008 = arg1.method2161();
		} else if (arg0 == 8) {
			this.anInt6011 = arg1.method2132();
		} else if (arg0 == 9) {
			this.anInt6017 = arg1.method2132();
		} else if (arg0 == 10) {
			this.anInt6016 = arg1.method2132();
		} else if (arg0 == 11) {
			this.anInt6015 = arg1.method2132();
		} else if (arg0 == 12) {
			local119 = arg1.method2132();
			this.anIntArray465 = new int[local119];
			for (local125 = 0; local125 < local119; local125++) {
				this.anIntArray465[local125] = arg1.method2161();
			}
			for (local131 = 0; local131 < local119; local131++) {
				this.anIntArray465[local131] = (arg1.method2161() << 16) + this.anIntArray465[local131];
			}
		} else if (arg0 == 13) {
			local119 = arg1.method2161();
			this.anIntArrayArray67 = new int[local119][];
			for (local125 = 0; local125 < local119; local125++) {
				local131 = arg1.method2132();
				if (local131 > 0) {
					this.anIntArrayArray67[local125] = new int[local131];
					this.anIntArrayArray67[local125][0] = arg1.method2119();
					for (local153 = 1; local153 < local131; local153++) {
						this.anIntArrayArray67[local125][local153] = arg1.method2161();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean448 = true;
		} else if (arg0 == 15) {
			this.aBoolean446 = true;
		} else if (arg0 == 16) {
			this.aBoolean447 = true;
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BZII)I")
	public int method5416(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) int local5 = 0;
		@Pc(7) int local7 = 0;
		@Pc(18) int local18 = this.anIntArray467[arg1];
		@Pc(20) Class1_Sub4_Sub20 local20 = null;
		@Pc(28) Class1_Sub4_Sub20 local28 = Static156.method2960(local18 >> 16);
		@Pc(32) int local32 = local18 & 0xFFFF;
		if (local28 == null) {
			return 0;
		}
		if ((this.aBoolean446 || Static21.aBoolean29) && arg2 != -1 && arg2 < this.anIntArray467.length) {
			local7 = this.anIntArray467[arg2];
			local20 = Static156.method2960(local7 >> 16);
			local7 &= 0xFFFF;
		}
		if (this.aBoolean448) {
			local5 = 512;
		}
		if (local28.method4029(local32)) {
			local5 |= 0x80;
		}
		if (local28.method4032(local32)) {
			local5 |= 0x100;
		}
		if (local20 != null) {
			if (local20.method4029(local7)) {
				local5 |= 0x80;
			}
			if (local20.method4032(local7)) {
				local5 |= 0x100;
			}
		}
		if (this.anIntArray465 != null && arg0) {
			@Pc(137) int local137;
			@Pc(148) Class1_Sub4_Sub20 local148;
			if (this.anIntArray465.length > arg1) {
				local137 = this.anIntArray465[arg1];
				if (local137 != 65535) {
					local148 = Static156.method2960(local137 >> 16);
					local137 &= 0xFFFF;
					if (local148 != null) {
						if (local148.method4029(local137)) {
							local5 |= 0x80;
						}
						if (local148.method4032(local137)) {
							local5 |= 0x100;
						}
					}
				}
			}
			if ((this.aBoolean446 || Static21.aBoolean29) && arg2 != -1 && arg2 < this.anIntArray465.length) {
				local137 = this.anIntArray465[arg2];
				if (local137 != 65535) {
					local148 = Static156.method2960(local137 >> 16);
					local137 &= 0xFFFF;
					if (local148 != null) {
						if (local148.method4029(local137)) {
							local5 |= 0x80;
						}
						if (local148.method4032(local137)) {
							local5 |= 0x100;
						}
					}
				}
			}
		}
		return local5 | 0x20;
	}
}
