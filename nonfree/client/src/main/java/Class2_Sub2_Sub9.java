import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!k")
public final class Class2_Sub2_Sub9 extends Class2_Sub2 {

	@OriginalMember(owner = "client!k", name = "J", descriptor = "[I")
	public int[] anIntArray233;

	@OriginalMember(owner = "client!k", name = "eb", descriptor = "[I")
	private int[] anIntArray234;

	@OriginalMember(owner = "client!k", name = "jb", descriptor = "[I")
	public int[] anIntArray235;

	@OriginalMember(owner = "client!k", name = "ub", descriptor = "[[I")
	public int[][] anIntArrayArray21;

	@OriginalMember(owner = "client!k", name = "wb", descriptor = "[I")
	private int[] anIntArray236;

	@OriginalMember(owner = "client!k", name = "E", descriptor = "Z")
	public boolean aBoolean125 = false;

	@OriginalMember(owner = "client!k", name = "R", descriptor = "I")
	public int anInt2342 = -1;

	@OriginalMember(owner = "client!k", name = "U", descriptor = "I")
	public int anInt2344 = -1;

	@OriginalMember(owner = "client!k", name = "Z", descriptor = "I")
	public int anInt2348 = -1;

	@OriginalMember(owner = "client!k", name = "K", descriptor = "I")
	public int anInt2338 = 2;

	@OriginalMember(owner = "client!k", name = "P", descriptor = "I")
	public int anInt2341 = 99;

	@OriginalMember(owner = "client!k", name = "cb", descriptor = "I")
	public int anInt2350 = -1;

	@OriginalMember(owner = "client!k", name = "tb", descriptor = "I")
	public int anInt2361 = -1;

	@OriginalMember(owner = "client!k", name = "sb", descriptor = "I")
	public int anInt2360 = 5;

	@OriginalMember(owner = "client!k", name = "mb", descriptor = "Z")
	private boolean aBoolean126 = false;

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!cg;I)Lclient!cg;")
	public Class12_Sub2 method1652(@OriginalArg(1) Class12_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = this.anIntArray233[arg1];
		@Pc(14) Class2_Sub2_Sub13 local14 = Static115.method2742(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg0.method1854(true, true);
		} else {
			@Pc(42) Class12_Sub2 local42 = arg0.method1854(!local14.method1949(local18), !this.aBoolean126);
			local42.method1856(local14, local18, this.aBoolean126);
			return local42;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!ea;II)V")
	private void method1655(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(22) int local22;
		@Pc(28) int local28;
		@Pc(51) int local51;
		@Pc(70) int local70;
		if (arg1 == 1) {
			local22 = arg0.method163();
			this.anIntArray235 = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.anIntArray235[local28] = arg0.method163();
			}
			this.anIntArray233 = new int[local22];
			for (local51 = 0; local51 < local22; local51++) {
				this.anIntArray233[local51] = arg0.method163();
			}
			for (local70 = 0; local70 < local22; local70++) {
				this.anIntArray233[local70] = (arg0.method163() << 16) + this.anIntArray233[local70];
			}
		} else if (arg1 == 2) {
			this.anInt2342 = arg0.method163();
		} else if (arg1 == 3) {
			local22 = arg0.method209();
			this.anIntArray234 = new int[local22 + 1];
			for (local28 = 0; local28 < local22; local28++) {
				this.anIntArray234[local28] = arg0.method209();
			}
			this.anIntArray234[local22] = 9999999;
		} else if (arg1 == 4) {
			this.aBoolean125 = true;
		} else if (arg1 == 5) {
			this.anInt2360 = arg0.method209();
		} else if (arg1 == 6) {
			this.anInt2361 = arg0.method163();
		} else if (arg1 == 7) {
			this.anInt2344 = arg0.method163();
		} else if (arg1 == 8) {
			this.anInt2341 = arg0.method209();
		} else if (arg1 == 9) {
			this.anInt2350 = arg0.method209();
		} else if (arg1 == 10) {
			this.anInt2348 = arg0.method209();
		} else if (arg1 == 11) {
			this.anInt2338 = arg0.method209();
		} else if (arg1 == 12) {
			local22 = arg0.method209();
			this.anIntArray236 = new int[local22];
			for (local28 = 0; local28 < local22; local28++) {
				this.anIntArray236[local28] = arg0.method163();
			}
			for (local51 = 0; local51 < local22; local51++) {
				this.anIntArray236[local51] = (arg0.method163() << 16) + this.anIntArray236[local51];
			}
		} else if (arg1 == 13) {
			local22 = arg0.method163();
			this.anIntArrayArray21 = new int[local22][];
			for (local28 = 0; local28 < local22; local28++) {
				local51 = arg0.method209();
				if (local51 > 0) {
					this.anIntArrayArray21[local28] = new int[local51];
					this.anIntArrayArray21[local28][0] = arg0.method166();
					for (local70 = 1; local70 < local51; local70++) {
						this.anIntArrayArray21[local28][local70] = arg0.method163();
					}
				}
			}
			return;
		} else if (arg1 == 14) {
			this.aBoolean126 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IZLclient!cg;I)Lclient!cg;")
	public Class12_Sub2 method1660(@OriginalArg(0) int arg0, @OriginalArg(2) Class12_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(10) int local10 = this.anIntArray233[arg2];
		@Pc(16) Class2_Sub2_Sub13 local16 = Static115.method2742(local10 >> 16);
		@Pc(20) int local20 = local10 & 0xFFFF;
		if (local16 == null) {
			return arg1.method1853(true, true);
		}
		@Pc(31) int local31 = arg0 & 0x3;
		@Pc(48) Class12_Sub2 local48 = arg1.method1853(!local16.method1949(local20), !this.aBoolean126);
		if (local31 == 1) {
			local48.method1850();
		} else if (local31 == 2) {
			local48.method1859();
		} else if (local31 == 3) {
			local48.method1851();
		}
		local48.method1856(local16, local20, this.aBoolean126);
		if (local31 == 1) {
			local48.method1851();
		} else if (local31 == 2) {
			local48.method1859();
		} else if (local31 == 3) {
			local48.method1850();
		}
		return local48;
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(IILclient!cg;)Lclient!cg;")
	public Class12_Sub2 method1661(@OriginalArg(1) int arg0, @OriginalArg(2) Class12_Sub2 arg1) {
		@Pc(4) int local4 = this.anIntArray233[arg0];
		@Pc(10) Class2_Sub2_Sub13 local10 = Static115.method2742(local4 >> 16);
		@Pc(14) int local14 = local4 & 0xFFFF;
		if (local10 == null) {
			return arg1.method1853(true, true);
		} else {
			@Pc(42) Class12_Sub2 local42 = arg1.method1853(!local10.method1949(local14), !this.aBoolean126);
			local42.method1856(local10, local14, this.aBoolean126);
			return local42;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(Lclient!ea;Z)V")
	public void method1662(@OriginalArg(0) Class2_Sub3 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method209();
			if (local5 == 0) {
				return;
			}
			this.method1655(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!k;IBLclient!cg;)Lclient!cg;")
	public Class12_Sub2 method1665(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub2_Sub9 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class12_Sub2 arg3) {
		@Pc(8) int local8 = this.anIntArray233[arg0];
		@Pc(14) Class2_Sub2_Sub13 local14 = Static115.method2742(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1661(arg2, arg3);
		}
		@Pc(31) int local31 = arg1.anIntArray233[arg2];
		@Pc(39) Class2_Sub2_Sub13 local39 = Static115.method2742(local31 >> 16);
		@Pc(43) int local43 = local31 & 0xFFFF;
		@Pc(67) Class12_Sub2 local67;
		if (local39 == null) {
			local67 = arg3.method1853(!local14.method1949(local18), !this.aBoolean126);
			local67.method1856(local14, local18, this.aBoolean126);
			return local67;
		} else {
			local67 = arg3.method1853(!local14.method1949(local18) & !local39.method1949(local43), !arg1.aBoolean126 & !this.aBoolean126);
			local67.method1858(local14, local18, local39, local43, this.anIntArray234, arg1.aBoolean126 | this.aBoolean126);
			return local67;
		}
	}

	@OriginalMember(owner = "client!k", name = "d", descriptor = "(B)V")
	public void method1668() {
		if (this.anInt2350 == -1) {
			if (this.anIntArray234 == null) {
				this.anInt2350 = 0;
			} else {
				this.anInt2350 = 2;
			}
		}
		if (this.anInt2348 != -1) {
			return;
		}
		if (this.anIntArray234 == null) {
			this.anInt2348 = 0;
		} else {
			this.anInt2348 = 2;
		}
	}

	@OriginalMember(owner = "client!k", name = "a", descriptor = "(ILclient!cg;B)Lclient!cg;")
	public Class12_Sub2 method1669(@OriginalArg(0) int arg0, @OriginalArg(1) Class12_Sub2 arg1) {
		@Pc(8) int local8 = this.anIntArray233[arg0];
		@Pc(14) Class2_Sub2_Sub13 local14 = Static115.method2742(local8 >> 16);
		@Pc(18) int local18 = local8 & 0xFFFF;
		if (local14 == null) {
			return arg1.method1853(true, true);
		}
		@Pc(33) Class2_Sub2_Sub13 local33 = null;
		@Pc(35) int local35 = 0;
		if (this.anIntArray236 != null && this.anIntArray236.length > arg0) {
			local35 = this.anIntArray236[arg0];
			local33 = Static115.method2742(local35 >> 16);
			local35 &= 0xFFFF;
		}
		@Pc(82) Class12_Sub2 local82;
		if (local33 == null || local35 == 65535) {
			local82 = arg1.method1853(!local14.method1949(local18), !this.aBoolean126);
			local82.method1856(local14, local18, this.aBoolean126);
			return local82;
		} else {
			local82 = arg1.method1853(!local14.method1949(local18) & !local33.method1949(local35), !this.aBoolean126);
			local82.method1856(local14, local18, this.aBoolean126);
			local82.method1856(local33, local35, this.aBoolean126);
			return local82;
		}
	}
}
