import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class17 {

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "[Z")
	public boolean[] aBooleanArray1;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "[I")
	public int[] anIntArray24;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
	public int anInt509;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray1;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "[I")
	private int[] anIntArray25;

	@OriginalMember(owner = "client!bb", name = "B", descriptor = "[I")
	public int[] anIntArray26;

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "Z")
	public boolean aBoolean33 = false;

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
	public int anInt514 = -1;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
	public int anInt510 = -1;

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
	public int anInt506 = 5;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
	public int anInt516 = -1;

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "Z")
	public boolean aBoolean34 = false;

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
	public int anInt505 = 2;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
	public int anInt518 = -1;

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
	public int anInt520 = -1;

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "Z")
	public boolean aBoolean36 = false;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "Z")
	public boolean aBoolean35 = false;

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "I")
	public int anInt522 = 99;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILclient!mj;IBIIII)Lclient!mj;")
	public Class101 method521(@OriginalArg(0) int arg0, @OriginalArg(1) Class101 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(8) int local8 = this.anIntArray26[arg6];
		@Pc(13) int local13 = this.anIntArray24[arg6];
		@Pc(19) Class5_Sub9_Sub11 local19 = Static12.method396(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg1.method5184((byte) 1, arg5, true);
		}
		@Pc(33) Class5_Sub9_Sub11 local33 = null;
		if ((this.aBoolean34 || Static353.aBoolean489) && arg0 != -1 && this.anIntArray24.length > arg0) {
			@Pc(56) int local56 = this.anIntArray24[arg0];
			local33 = Static12.method396(local56 >> 16);
			arg0 = local56 & 0xFFFF;
		}
		if (this.aBoolean35) {
			arg5 |= 0x200;
		}
		if (local19.method2616(local23)) {
			arg5 |= 0x80;
		}
		if (local19.method2610(local23)) {
			arg5 |= 0x100;
		}
		if (local33 != null) {
			if (local33.method2616(arg0)) {
				arg5 |= 0x80;
			}
			if (local33.method2610(arg0)) {
				arg5 |= 0x100;
			}
		}
		arg5 |= 0x20;
		@Pc(129) Class101 local129 = arg1.method5184(arg3, arg5, true);
		local129.method5146(local8, arg0, local23, this.aBoolean35, local19, arg2 - 1, arg4, local33);
		return local129;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIZI)I")
	public int method522(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		@Pc(18) int local18 = this.anIntArray24[arg0];
		@Pc(20) Class5_Sub9_Sub11 local20 = null;
		@Pc(26) Class5_Sub9_Sub11 local26 = Static12.method396(local18 >> 16);
		@Pc(30) int local30 = local18 & 0xFFFF;
		if (local26 == null) {
			return 0;
		}
		if ((this.aBoolean34 || Static353.aBoolean489) && arg1 != -1 && arg1 < this.anIntArray24.length) {
			local13 = this.anIntArray24[arg1];
			local20 = Static12.method396(local13 >> 16);
			local13 &= 0xFFFF;
		}
		if (this.aBoolean35) {
			local11 = 512;
		}
		if (local26.method2616(local30)) {
			local11 |= 0x80;
		}
		if (local26.method2610(local30)) {
			local11 |= 0x100;
		}
		if (local20 != null) {
			if (local20.method2616(local13)) {
				local11 |= 0x80;
			}
			if (local20.method2610(local13)) {
				local11 |= 0x100;
			}
		}
		if (this.anIntArray25 != null && arg2) {
			@Pc(130) int local130;
			@Pc(141) Class5_Sub9_Sub11 local141;
			if (arg0 < this.anIntArray25.length) {
				local130 = this.anIntArray25[arg0];
				if (local130 != 65535) {
					local141 = Static12.method396(local130 >> 16);
					local130 &= 0xFFFF;
					if (local141 != null) {
						if (local141.method2616(local130)) {
							local11 |= 0x80;
						}
						if (local141.method2610(local130)) {
							local11 |= 0x100;
						}
					}
				}
			}
			if ((this.aBoolean34 || Static353.aBoolean489) && arg1 != -1 && this.anIntArray25.length > arg1) {
				local130 = this.anIntArray25[arg1];
				if (local130 != 65535) {
					local141 = Static12.method396(local130 >> 16);
					local130 &= 0xFFFF;
					if (local141 != null) {
						if (local141.method2616(local130)) {
							local11 |= 0x80;
						}
						if (local141.method2610(local130)) {
							local11 |= 0x100;
						}
					}
				}
			}
		}
		return local11 | 0x20;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILclient!bk;)V")
	private void method525(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub1 arg1) {
		@Pc(113) int local113;
		@Pc(119) int local119;
		@Pc(125) int local125;
		@Pc(144) int local144;
		if (arg0 == 1) {
			local113 = arg1.method1845();
			this.anIntArray26 = new int[local113];
			for (local119 = 0; local119 < local113; local119++) {
				this.anIntArray26[local119] = arg1.method1845();
			}
			this.anIntArray24 = new int[local113];
			for (local125 = 0; local125 < local113; local125++) {
				this.anIntArray24[local125] = arg1.method1845();
			}
			for (local144 = 0; local144 < local113; local144++) {
				this.anIntArray24[local144] = (arg1.method1845() << 16) + this.anIntArray24[local144];
			}
		} else if (arg0 == 2) {
			this.anInt520 = arg1.method1845();
		} else if (arg0 == 3) {
			this.aBooleanArray1 = new boolean[256];
			local113 = arg1.method1832();
			for (local119 = 0; local119 < local113; local119++) {
				this.aBooleanArray1[arg1.method1832()] = true;
			}
		} else if (arg0 == 4) {
			this.aBoolean33 = true;
		} else if (arg0 == 5) {
			this.anInt506 = arg1.method1832();
		} else if (arg0 == 6) {
			this.anInt510 = arg1.method1845();
		} else if (arg0 == 7) {
			this.anInt514 = arg1.method1845();
		} else if (arg0 == 8) {
			this.anInt522 = arg1.method1832();
		} else if (arg0 == 9) {
			this.anInt516 = arg1.method1832();
		} else if (arg0 == 10) {
			this.anInt518 = arg1.method1832();
		} else if (arg0 == 11) {
			this.anInt505 = arg1.method1832();
		} else if (arg0 == 12) {
			local113 = arg1.method1832();
			this.anIntArray25 = new int[local113];
			for (local119 = 0; local119 < local113; local119++) {
				this.anIntArray25[local119] = arg1.method1845();
			}
			for (local125 = 0; local125 < local113; local125++) {
				this.anIntArray25[local125] = (arg1.method1845() << 16) + this.anIntArray25[local125];
			}
		} else if (arg0 == 13) {
			local113 = arg1.method1845();
			this.anIntArrayArray1 = new int[local113][];
			for (local119 = 0; local119 < local113; local119++) {
				local125 = arg1.method1832();
				if (local125 > 0) {
					this.anIntArrayArray1[local119] = new int[local125];
					this.anIntArrayArray1[local119][0] = arg1.method1843();
					for (local144 = 1; local144 < local125; local144++) {
						this.anIntArrayArray1[local119][local144] = arg1.method1845();
					}
				}
			}
		} else if (arg0 == 14) {
			this.aBoolean35 = true;
		} else if (arg0 == 15) {
			this.aBoolean34 = true;
		} else if (arg0 == 16) {
			this.aBoolean36 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
	public void method526() {
		if (this.anInt518 == -1) {
			if (this.aBooleanArray1 == null) {
				this.anInt518 = 0;
			} else {
				this.anInt518 = 2;
			}
		}
		if (this.anInt516 != -1) {
			return;
		}
		if (this.aBooleanArray1 == null) {
			this.anInt516 = 0;
		} else {
			this.anInt516 = 2;
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIZLclient!mj;II)Lclient!mj;")
	public Class101 method528(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class101 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(8) int local8 = this.anIntArray26[arg3];
		@Pc(13) int local13 = this.anIntArray24[arg3];
		@Pc(19) Class5_Sub9_Sub11 local19 = Static12.method396(local13 >> 16);
		@Pc(23) int local23 = local13 & 0xFFFF;
		if (local19 == null) {
			return arg2.method5184((byte) 1, arg0, true);
		}
		@Pc(33) Class5_Sub9_Sub11 local33 = null;
		if ((this.aBoolean34 || Static353.aBoolean489) && arg4 != -1 && arg4 < this.anIntArray24.length) {
			@Pc(52) int local52 = this.anIntArray24[arg4];
			local33 = Static12.method396(local52 >> 16);
			arg4 = local52 & 0xFFFF;
		}
		@Pc(64) Class5_Sub9_Sub11 local64 = null;
		@Pc(66) Class5_Sub9_Sub11 local66 = null;
		@Pc(68) int local68 = 0;
		@Pc(70) int local70 = 0;
		if (this.anIntArray25 != null) {
			if (this.anIntArray25.length > arg3) {
				local68 = this.anIntArray25[arg3];
				if (local68 != 65535) {
					local64 = Static12.method396(local68 >> 16);
					local68 &= 0xFFFF;
				}
			}
			if ((this.aBoolean34 || Static353.aBoolean489) && arg4 != -1 && arg4 < this.anIntArray25.length) {
				local70 = this.anIntArray25[arg4];
				if (local70 != 65535) {
					local66 = Static12.method396(local70 >> 16);
					local70 &= 0xFFFF;
				}
			}
		}
		if (this.aBoolean35) {
			arg0 |= 0x200;
		}
		if (local19.method2616(local23)) {
			arg0 |= 0x80;
		}
		if (local19.method2610(local23)) {
			arg0 |= 0x100;
		}
		if (local64 != null) {
			if (local64.method2616(local68)) {
				arg0 |= 0x80;
			}
			if (local64.method2610(local68)) {
				arg0 |= 0x100;
			}
		}
		if (local33 != null) {
			if (local33.method2616(arg4)) {
				arg0 |= 0x80;
			}
			if (local33.method2610(arg4)) {
				arg0 |= 0x100;
			}
		}
		if (local66 != null) {
			if (local66.method2616(local70)) {
				arg0 |= 0x80;
			}
			if (local66.method2610(local70)) {
				arg0 |= 0x100;
			}
		}
		arg0 |= 0x20;
		@Pc(235) Class101 local235 = arg2.method5184((byte) 1, arg0, true);
		local235.method5146(local8, arg4, local23, this.aBoolean35, local19, arg1 - 1, 0, local33);
		if (local64 != null) {
			local235.method5146(local8, local70, local68, this.aBoolean35, local64, arg1 - 1, 0, local66);
		}
		return local235;
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZLclient!bk;)V")
	public void method529(@OriginalArg(1) Class5_Sub1 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1832();
			if (local13 == 0) {
				return;
			}
			this.method525(local13, arg0);
		}
	}
}
