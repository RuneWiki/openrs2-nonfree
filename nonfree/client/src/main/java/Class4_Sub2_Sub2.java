import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ec")
public final class Class4_Sub2_Sub2 extends Class4_Sub2 {

	@OriginalMember(owner = "client!ec", name = "Ob", descriptor = "J")
	private long aLong25;

	@OriginalMember(owner = "client!ec", name = "Pb", descriptor = "J")
	private long aLong26;

	@OriginalMember(owner = "client!ec", name = "Qb", descriptor = "I")
	private int anInt813;

	@OriginalMember(owner = "client!ec", name = "Rb", descriptor = "Z")
	private boolean aBoolean23;

	@OriginalMember(owner = "client!ec", name = "Sb", descriptor = "I")
	private int anInt814;

	@OriginalMember(owner = "client!ec", name = "A", descriptor = "[I")
	public final int[] anIntArray49 = new int[16];

	@OriginalMember(owner = "client!ec", name = "D", descriptor = "[I")
	public final int[] anIntArray51 = new int[16];

	@OriginalMember(owner = "client!ec", name = "X", descriptor = "[[Lclient!f;")
	private final Class4_Sub10[][] aClass4_Sub10ArrayArray1 = new Class4_Sub10[16][128];

	@OriginalMember(owner = "client!ec", name = "T", descriptor = "[I")
	private final int[] anIntArray54 = new int[16];

	@OriginalMember(owner = "client!ec", name = "S", descriptor = "[I")
	private final int[] anIntArray53 = new int[16];

	@OriginalMember(owner = "client!ec", name = "F", descriptor = "[I")
	private final int[] anIntArray52 = new int[16];

	@OriginalMember(owner = "client!ec", name = "gb", descriptor = "[I")
	private final int[] anIntArray56 = new int[16];

	@OriginalMember(owner = "client!ec", name = "lb", descriptor = "[I")
	private final int[] anIntArray57 = new int[16];

	@OriginalMember(owner = "client!ec", name = "sb", descriptor = "[I")
	private final int[] anIntArray59 = new int[16];

	@OriginalMember(owner = "client!ec", name = "ub", descriptor = "[I")
	private final int[] anIntArray60 = new int[16];

	@OriginalMember(owner = "client!ec", name = "rb", descriptor = "[I")
	private final int[] anIntArray58 = new int[16];

	@OriginalMember(owner = "client!ec", name = "Db", descriptor = "[I")
	private final int[] anIntArray61 = new int[16];

	@OriginalMember(owner = "client!ec", name = "zb", descriptor = "[[Lclient!f;")
	private final Class4_Sub10[][] aClass4_Sub10ArrayArray2 = new Class4_Sub10[16][128];

	@OriginalMember(owner = "client!ec", name = "cb", descriptor = "[I")
	public final int[] anIntArray55 = new int[16];

	@OriginalMember(owner = "client!ec", name = "Gb", descriptor = "I")
	private final int anInt807 = 1000000;

	@OriginalMember(owner = "client!ec", name = "Eb", descriptor = "[I")
	private final int[] anIntArray62 = new int[16];

	@OriginalMember(owner = "client!ec", name = "B", descriptor = "[I")
	private final int[] anIntArray50 = new int[16];

	@OriginalMember(owner = "client!ec", name = "Jb", descriptor = "[I")
	private final int[] anIntArray63 = new int[16];

	@OriginalMember(owner = "client!ec", name = "Nb", descriptor = "I")
	private int anInt812 = 256;

	@OriginalMember(owner = "client!ec", name = "bb", descriptor = "Lclient!lf;")
	private final Class44 aClass44_1 = new Class44();

	@OriginalMember(owner = "client!ec", name = "Tb", descriptor = "Lclient!j;")
	private final Class4_Sub2_Sub4 aClass4_Sub2_Sub4_1 = new Class4_Sub2_Sub4(this);

	@OriginalMember(owner = "client!ec", name = "x", descriptor = "Lclient!sb;")
	private final Class66 aClass66_1 = new Class66(128);

	@OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
	public Class4_Sub2_Sub2() {
		this.method568();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IBI)V")
	private void method537(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)V")
	private void method538(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray50[arg1]) {
			this.anIntArray50[arg1] = arg0;
			for (@Pc(25) int local25 = 0; local25 < 128; local25++) {
				this.aClass4_Sub10ArrayArray2[arg1][local25] = null;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIII)V")
	private void method539(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method544(64, arg2, arg1);
		if ((this.anIntArray49[arg2] & 0x2) != 0) {
			for (@Pc(25) Class4_Sub10 local25 = (Class4_Sub10) this.aClass4_Sub2_Sub4_1.aClass70_11.method1930(); local25 != null; local25 = (Class4_Sub10) this.aClass4_Sub2_Sub4_1.aClass70_11.method1937()) {
				if (local25.anInt878 == arg2 && local25.anInt870 < 0) {
					this.aClass4_Sub10ArrayArray1[arg2][local25.anInt863] = null;
					this.aClass4_Sub10ArrayArray1[arg2][arg1] = local25;
					@Pc(61) int local61 = local25.anInt884 + (local25.anInt879 * local25.anInt885 >> 12);
					local25.anInt879 = 4096;
					local25.anInt884 += arg1 - local25.anInt863 << 8;
					local25.anInt863 = arg1;
					local25.anInt885 = local61 - local25.anInt884;
					return;
				}
			}
		}
		@Pc(107) Class4_Sub9 local107 = (Class4_Sub9) this.aClass66_1.method1834((long) this.anIntArray50[arg2]);
		if (local107 == null) {
			return;
		}
		@Pc(115) Class4_Sub1_Sub1 local115 = local107.aClass4_Sub1_Sub1Array1[arg1];
		if (local115 == null) {
			return;
		}
		@Pc(122) Class4_Sub10 local122 = new Class4_Sub10();
		local122.aClass4_Sub1_Sub1_1 = local115;
		local122.aClass4_Sub9_1 = local107;
		local122.anInt878 = arg2;
		local122.aClass7_1 = local107.aClass7Array1[arg1];
		local122.anInt882 = local107.aByteArray35[arg1];
		local122.anInt863 = arg1;
		local122.anInt866 = arg0 * arg0 * local107.anInt838 * local107.aByteArray36[arg1] + 1024 >> 11;
		local122.anInt883 = local107.aByteArray37[arg1] & 0xFF;
		local122.anInt884 = (arg1 << 8) - (local107.aShortArray1[arg1] & 0x7FFF);
		local122.anInt880 = 0;
		local122.anInt881 = 0;
		local122.anInt873 = 0;
		local122.anInt874 = 0;
		local122.anInt870 = -1;
		if (this.anIntArray51[arg2] == 0) {
			local122.aClass4_Sub2_Sub1_1 = Static132.method97(local115, this.method542(local122), this.method564(local122), this.method548(local122));
		} else {
			local122.aClass4_Sub2_Sub1_1 = Static132.method97(local115, this.method542(local122), 0, this.method548(local122));
			this.method571(local107.aShortArray1[arg1] < 0, local122);
		}
		if (local107.aShortArray1[arg1] < 0) {
			local122.aClass4_Sub2_Sub1_1.method86(-1);
		}
		if (local122.anInt882 >= 0) {
			@Pc(276) Class4_Sub10 local276 = this.aClass4_Sub10ArrayArray2[arg2][local122.anInt882];
			if (local276 != null && local276.anInt870 < 0) {
				this.aClass4_Sub10ArrayArray1[arg2][local276.anInt863] = null;
				local276.anInt870 = 0;
			}
			this.aClass4_Sub10ArrayArray2[arg2][local122.anInt882] = local122;
		}
		this.aClass4_Sub2_Sub4_1.aClass70_11.method1931(local122);
		this.aClass4_Sub10ArrayArray1[arg2][arg1] = local122;
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(I)V")
	public synchronized void method540() {
		for (@Pc(18) Class4_Sub9 local18 = (Class4_Sub9) this.aClass66_1.method1838(); local18 != null; local18 = (Class4_Sub9) this.aClass66_1.method1831()) {
			local18.method2124();
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BII)V")
	public synchronized void method541() {
		this.method557();
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BLclient!f;)I")
	private int method542(@OriginalArg(1) Class4_Sub10 arg0) {
		@Pc(23) int local23 = arg0.anInt884 + (arg0.anInt879 * arg0.anInt885 >> 12);
		@Pc(26) Class7 local26 = arg0.aClass7_1;
		local23 += (this.anIntArray63[arg0.anInt878] - 8192) * this.anIntArray53[arg0.anInt878] >> 12;
		@Pc(66) int local66;
		if (local26.anInt82 > 0 && (local26.anInt76 > 0 || this.anIntArray61[arg0.anInt878] > 0)) {
			@Pc(61) int local61 = local26.anInt74 << 1;
			local66 = local26.anInt76 << 2;
			if (local61 > arg0.anInt872) {
				local66 = local66 * arg0.anInt872 / local61;
			}
			local66 += this.anIntArray61[arg0.anInt878] >> 7;
			@Pc(100) double local100 = Math.sin((double) (arg0.anInt861 & 0x1FF) * 0.01227184630308513D);
			local23 += (int) ((double) local66 * local100);
		}
		local66 = (int) ((double) (arg0.aClass4_Sub1_Sub1_1.anInt1056 * 256) * Math.pow(2.0D, (double) local23 * 3.255208333333333E-4D) / (double) Static31.anInt846 + 0.5D);
		return local66 < 1 ? 1 : local66;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(III)V")
	private void method543(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray63[arg1] = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BIII)V")
	private void method544(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class4_Sub10 local18 = this.aClass4_Sub10ArrayArray1[arg1][arg2];
		if (local18 == null) {
			return;
		}
		this.aClass4_Sub10ArrayArray1[arg1][arg2] = null;
		if ((this.anIntArray49[arg1] & 0x2) == 0) {
			local18.anInt870 = 0;
			return;
		}
		for (@Pc(44) Class4_Sub10 local44 = (Class4_Sub10) this.aClass4_Sub2_Sub4_1.aClass70_11.method1939(); local44 != null; local44 = (Class4_Sub10) this.aClass4_Sub2_Sub4_1.aClass70_11.method1936()) {
			if (local18.anInt878 == local44.anInt878 && local44.anInt870 < 0 && local44 != local18) {
				local18.anInt870 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!f;B)Z")
	public boolean method546(@OriginalArg(0) Class4_Sub10 arg0) {
		if (arg0.aClass4_Sub2_Sub1_1 != null) {
			return false;
		}
		if (arg0.anInt870 >= 0) {
			arg0.method2124();
			if (arg0.anInt882 > 0 && this.aClass4_Sub10ArrayArray2[arg0.anInt878][arg0.anInt882] == arg0) {
				this.aClass4_Sub10ArrayArray2[arg0.anInt878][arg0.anInt882] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(IIII)V")
	private void method547(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!f;I)I")
	private int method548(@OriginalArg(0) Class4_Sub10 arg0) {
		@Pc(15) int local15 = this.anIntArray56[arg0.anInt878];
		return local15 < 8192 ? local15 * arg0.anInt883 + 32 >> 6 : 16384 - ((128 - arg0.anInt883) * (-local15 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)V")
	private void method549(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method549(local12);
			}
			return;
		}
		this.anIntArray52[arg0] = 12800;
		this.anIntArray56[arg0] = 8192;
		this.anIntArray60[arg0] = 16383;
		this.anIntArray63[arg0] = 8192;
		this.anIntArray61[arg0] = 0;
		this.anIntArray58[arg0] = 8192;
		this.method551(arg0);
		this.method556(arg0);
		this.anIntArray49[arg0] = 0;
		this.anIntArray62[arg0] = 32767;
		this.anIntArray53[arg0] = 256;
		this.anIntArray51[arg0] = 0;
		this.method566(8192, arg0);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!n;ZZ)V")
	public synchronized void method550(@OriginalArg(0) Class4_Sub15 arg0, @OriginalArg(1) boolean arg1) {
		this.method553();
		this.aClass44_1.method1313(arg0.aByteArray77);
		this.aLong26 = 0L;
		this.aBoolean23 = arg1;
		@Pc(29) int local29 = this.aClass44_1.method1321();
		for (@Pc(31) int local31 = 0; local31 < local29; local31++) {
			this.aClass44_1.method1315(local31);
			this.aClass44_1.method1312(local31);
			this.aClass44_1.method1308(local31);
		}
		this.anInt814 = this.aClass44_1.method1314();
		this.anInt813 = this.aClass44_1.anIntArray180[this.anInt814];
		this.aLong25 = this.aClass44_1.method1320(this.anInt813);
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "()Lclient!oc;")
	@Override
	public synchronized Class4_Sub2 method969() {
		return this.aClass4_Sub2_Sub4_1;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(IB)V")
	private void method551(@OriginalArg(0) int arg0) {
		if ((this.anIntArray49[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(23) Class4_Sub10 local23 = (Class4_Sub10) this.aClass4_Sub2_Sub4_1.aClass70_11.method1939(); local23 != null; local23 = (Class4_Sub10) this.aClass4_Sub2_Sub4_1.aClass70_11.method1936()) {
			if (local23.anInt878 == arg0 && this.aClass4_Sub10ArrayArray1[arg0][local23.anInt863] == null && local23.anInt870 < 0) {
				local23.anInt870 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)V")
	public synchronized void method552(@OriginalArg(1) int arg0) {
		this.anInt812 = arg0;
	}

	@OriginalMember(owner = "client!ec", name = "e", descriptor = "(I)V")
	public synchronized void method553() {
		this.aClass44_1.method1317();
		this.method568();
	}

	@OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)V")
	public synchronized void method554() {
		for (@Pc(20) Class4_Sub9 local20 = (Class4_Sub9) this.aClass66_1.method1838(); local20 != null; local20 = (Class4_Sub9) this.aClass66_1.method1831()) {
			local20.method592();
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(II)V")
	private void method555(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method544(local28, local16, local22);
		} else if (local9 == 144) {
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			local16 = arg0 & 0xF;
			if (local28 <= 0) {
				this.method544(64, local16, local22);
			} else {
				this.method539(local28, local22, local16);
			}
		} else if (local9 == 160) {
			local22 = arg0 >> 8 & 0x7F;
			local16 = arg0 & 0xF;
			local28 = arg0 >> 16 & 0x7F;
			this.method547(local16, local28, local22);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray57[local16] = (local28 << 14) + (this.anIntArray57[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray57[local16] = (local28 << 7) + (this.anIntArray57[local16] & 0xFFFFC07F);
			}
			if (local22 == 1) {
				this.anIntArray61[local16] = (this.anIntArray61[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray61[local16] = (this.anIntArray61[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 5) {
				this.anIntArray58[local16] = (this.anIntArray58[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 37) {
				this.anIntArray58[local16] = local28 + (this.anIntArray58[local16] & 0xFFFFFF80);
			}
			if (local22 == 7) {
				this.anIntArray52[local16] = (this.anIntArray52[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 39) {
				this.anIntArray52[local16] = local28 + (this.anIntArray52[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray56[local16] = (this.anIntArray56[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 42) {
				this.anIntArray56[local16] = local28 + (this.anIntArray56[local16] & 0xFFFFFF80);
			}
			if (local22 == 11) {
				this.anIntArray60[local16] = (this.anIntArray60[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 43) {
				this.anIntArray60[local16] = local28 + (this.anIntArray60[local16] & 0xFFFFFF80);
			}
			if (local22 == 64) {
				if (local28 < 64) {
					this.anIntArray49[local16] &= 0xFFFFFFFE;
				} else {
					this.anIntArray49[local16] |= 0x1;
				}
			}
			if (local22 == 65) {
				if (local28 < 64) {
					this.method551(local16);
					this.anIntArray49[local16] &= 0xFFFFFFFD;
				} else {
					this.anIntArray49[local16] |= 0x2;
				}
			}
			if (local22 == 99) {
				this.anIntArray62[local16] = (local28 << 7) + (this.anIntArray62[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray62[local16] = local28 + (this.anIntArray62[local16] & 0x3F80);
			}
			if (local22 == 101) {
				this.anIntArray62[local16] = (local28 << 7) + ((this.anIntArray62[local16] & 0x7F) + 16384);
			}
			if (local22 == 100) {
				this.anIntArray62[local16] = local28 + (this.anIntArray62[local16] & 0x3F80) + 16384;
			}
			if (local22 == 120) {
				this.method572(local16);
			}
			if (local22 == 121) {
				this.method549(local16);
			}
			if (local22 == 123) {
				this.method562(local16);
			}
			@Pc(512) int local512;
			if (local22 == 6) {
				local512 = this.anIntArray62[local16];
				if (local512 == 16384) {
					this.anIntArray53[local16] = (local28 << 7) + (this.anIntArray53[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local512 = this.anIntArray62[local16];
				if (local512 == 16384) {
					this.anIntArray53[local16] = (this.anIntArray53[local16] & 0xFFFFFF80) + local28;
				}
			}
			if (local22 == 16) {
				this.anIntArray51[local16] = (this.anIntArray51[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 48) {
				this.anIntArray51[local16] = (this.anIntArray51[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 81) {
				if (local28 < 64) {
					this.method556(local16);
					this.anIntArray49[local16] &= 0xFFFFFFFB;
				} else {
					this.anIntArray49[local16] |= 0x4;
				}
			}
			if (local22 == 17) {
				this.method566((this.anIntArray54[local16] & 0xFFFFC07F) + (local28 << 7), local16);
			}
			if (local22 == 49) {
				this.method566((this.anIntArray54[local16] & 0xFFFFFF80) + local28, local16);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method538(local22 + this.anIntArray57[local16], local16);
		} else if (local9 == 208) {
			local22 = arg0 >> 8 & 0x7F;
			local16 = arg0 & 0xF;
			this.method537(local16, local22);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method543(local22, local16);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method568();
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(II)V")
	private void method556(@OriginalArg(0) int arg0) {
		if ((this.anIntArray49[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(20) Class4_Sub10 local20 = (Class4_Sub10) this.aClass4_Sub2_Sub4_1.aClass70_11.method1939(); local20 != null; local20 = (Class4_Sub10) this.aClass4_Sub2_Sub4_1.aClass70_11.method1936()) {
			if (local20.anInt878 == arg0) {
				local20.anInt862 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "(III)V")
	private void method557() {
		this.anIntArray59[9] = 128;
		this.anIntArray57[9] = 128;
		this.method538(128, 9);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "([ILclient!f;BII)Z")
	public boolean method559(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class4_Sub10 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1.anInt865 = Static31.anInt846 / 100;
		if (arg1.anInt870 >= 0 && (arg1.aClass4_Sub2_Sub1_1 == null || arg1.aClass4_Sub2_Sub1_1.method94())) {
			arg1.method610();
			arg1.method2124();
			if (arg1.anInt882 > 0 && arg1 == this.aClass4_Sub10ArrayArray2[arg1.anInt878][arg1.anInt882]) {
				this.aClass4_Sub10ArrayArray2[arg1.anInt878][arg1.anInt882] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg1.anInt879;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray58[arg1.anInt878] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg1.anInt879 = local56;
		}
		arg1.aClass4_Sub2_Sub1_1.method102(this.method542(arg1));
		arg1.anInt872++;
		@Pc(98) boolean local98 = false;
		@Pc(122) double local122 = (double) ((arg1.anInt879 * arg1.anInt885 >> 12) + (arg1.anInt863 - 60 << 8)) * 5.086263020833333E-6D;
		@Pc(125) Class7 local125 = arg1.aClass7_1;
		arg1.anInt861 += local125.anInt82;
		if (local125.anInt75 > 0) {
			if (local125.anInt77 <= 0) {
				arg1.anInt881 += 128;
			} else {
				arg1.anInt881 += (int) (Math.pow(2.0D, (double) local125.anInt77 * local122) * 128.0D + 0.5D);
			}
		}
		if (local125.aByteArray3 != null) {
			if (local125.anInt79 <= 0) {
				arg1.anInt874 += 128;
			} else {
				arg1.anInt874 += (int) (Math.pow(2.0D, (double) local125.anInt79 * local122) * 128.0D + 0.5D);
			}
			while (arg1.anInt873 < local125.aByteArray3.length - 2 && arg1.anInt874 > (local125.aByteArray3[arg1.anInt873 + 2] & 0xFF) << 8) {
				arg1.anInt873 += 2;
			}
			if (arg1.anInt873 == local125.aByteArray3.length - 2 && local125.aByteArray3[arg1.anInt873 + 1] == 0) {
				local98 = true;
			}
		}
		if (arg1.anInt870 >= 0 && local125.aByteArray4 != null && (this.anIntArray49[arg1.anInt878] & 0x1) == 0 && (arg1.anInt882 < 0 || arg1 != this.aClass4_Sub10ArrayArray2[arg1.anInt878][arg1.anInt882])) {
			if (local125.anInt73 <= 0) {
				arg1.anInt870 += 128;
			} else {
				arg1.anInt870 += (int) (Math.pow(2.0D, local122 * (double) local125.anInt73) * 128.0D + 0.5D);
			}
			while (local125.aByteArray4.length - 2 > arg1.anInt880 && (local125.aByteArray4[arg1.anInt880 + 2] & 0xFF) << 8 < arg1.anInt870) {
				arg1.anInt880 += 2;
			}
			if (local125.aByteArray4.length - 2 == arg1.anInt880) {
				local98 = true;
			}
		}
		if (!local98) {
			arg1.aClass4_Sub2_Sub1_1.method76(arg1.anInt865, this.method564(arg1), this.method548(arg1));
			return false;
		}
		arg1.aClass4_Sub2_Sub1_1.method101(arg1.anInt865);
		if (arg0 == null) {
			arg1.aClass4_Sub2_Sub1_1.method964(arg3);
		} else {
			arg1.aClass4_Sub2_Sub1_1.method968(arg0, arg2, arg3);
		}
		if (arg1.aClass4_Sub2_Sub1_1.method107()) {
			this.aClass4_Sub2_Sub4_1.aClass4_Sub2_Sub3_1.method749(arg1.aClass4_Sub2_Sub1_1);
		}
		arg1.method610();
		if (arg1.anInt870 >= 0) {
			arg1.method2124();
			if (arg1.anInt882 > 0 && arg1 == this.aClass4_Sub10ArrayArray2[arg1.anInt878][arg1.anInt882]) {
				this.aClass4_Sub10ArrayArray2[arg1.anInt878][arg1.anInt882] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!ec", name = "g", descriptor = "(I)Z")
	public synchronized boolean method560() {
		return this.aClass44_1.method1307();
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(BI)V")
	private void method562(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class4_Sub10 local12 = (Class4_Sub10) this.aClass4_Sub2_Sub4_1.aClass70_11.method1939(); local12 != null; local12 = (Class4_Sub10) this.aClass4_Sub2_Sub4_1.aClass70_11.method1936()) {
			if ((arg0 < 0 || arg0 == local12.anInt878) && local12.anInt870 < 0) {
				this.aClass4_Sub10ArrayArray1[local12.anInt878][local12.anInt863] = null;
				local12.anInt870 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "()I")
	@Override
	public synchronized int method965() {
		return 0;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILclient!f;)I")
	private int method564(@OriginalArg(1) Class4_Sub10 arg0) {
		@Pc(2) Class7 local2 = arg0.aClass7_1;
		@Pc(18) int local18 = this.anIntArray52[arg0.anInt878] * this.anIntArray60[arg0.anInt878] + 4096 >> 13;
		@Pc(26) int local26 = local18 * local18 + 16384 >> 15;
		@Pc(35) int local35 = local26 * arg0.anInt866 + 16384 >> 15;
		local18 = this.anInt812 * local35 + 128 >> 8;
		if (local2.anInt75 > 0) {
			local18 = (int) ((double) local18 * Math.pow(0.5D, (double) local2.anInt75 * (double) arg0.anInt881 * 1.953125E-5D) + 0.5D);
		}
		@Pc(78) int local78;
		@Pc(86) int local86;
		@Pc(108) int local108;
		@Pc(120) int local120;
		if (local2.aByteArray3 != null) {
			local78 = arg0.anInt874;
			local86 = local2.aByteArray3[arg0.anInt873 + 1];
			if (arg0.anInt873 < local2.aByteArray3.length - 2) {
				local108 = (local2.aByteArray3[arg0.anInt873] & 0xFF) << 8;
				local120 = (local2.aByteArray3[arg0.anInt873 + 2] & 0xFF) << 8;
				local86 += (local2.aByteArray3[arg0.anInt873 + 3] - local86) * (local78 - local108) / (local120 - local108);
			}
			local18 = local86 * local18 + 32 >> 6;
		}
		if (arg0.anInt870 > 0 && local2.aByteArray4 != null) {
			local86 = local2.aByteArray4[arg0.anInt880 + 1];
			local78 = arg0.anInt870;
			if (local2.aByteArray4.length - 2 > arg0.anInt880) {
				local108 = (local2.aByteArray4[arg0.anInt880] & 0xFF) << 8;
				local120 = (local2.aByteArray4[arg0.anInt880 + 2] & 0xFF) << 8;
				local86 += (local78 - local108) * (local2.aByteArray4[arg0.anInt880 + 3] - local86) / (local120 - local108);
			}
			local18 = local86 * local18 + 32 >> 6;
		}
		return local18;
	}

	@OriginalMember(owner = "client!ec", name = "i", descriptor = "(I)I")
	public int method565() {
		return this.anInt812;
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(III)V")
	private void method566(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray54[arg1] = arg0;
		this.anIntArray55[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method968(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass44_1.method1307()) {
			@Pc(18) int local18 = this.aClass44_1.anInt1759 * this.anInt807 / Static31.anInt846;
			do {
				@Pc(28) long local28 = this.aLong26 + (long) arg2 * (long) local18;
				if (this.aLong25 - local28 >= 0L) {
					this.aLong26 = local28;
					break;
				}
				@Pc(56) int local56 = (int) ((this.aLong25 + (long) local18 - this.aLong26 - 1L) / (long) local18);
				arg2 -= local56;
				this.aLong26 += (long) local18 * (long) local56;
				this.aClass4_Sub2_Sub4_1.method968(arg0, arg1, local56);
				this.method569();
				arg1 += local56;
			} while (this.aClass44_1.method1307());
		}
		this.aClass4_Sub2_Sub4_1.method968(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!ec", name = "j", descriptor = "(I)V")
	private void method568() {
		this.method572(-1);
		this.method549(-1);
		for (@Pc(19) int local19 = 0; local19 < 16; local19++) {
			this.anIntArray50[local19] = this.anIntArray59[local19];
		}
		for (@Pc(35) int local35 = 0; local35 < 16; local35++) {
			this.anIntArray57[local35] = this.anIntArray59[local35] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V")
	private void method569() {
		@Pc(14) int local14 = this.anInt814;
		@Pc(17) long local17 = this.aLong25;
		@Pc(20) int local20 = this.anInt813;
		while (this.anInt813 == local20) {
			while (this.aClass44_1.anIntArray180[local14] == local20) {
				this.aClass44_1.method1315(local14);
				@Pc(31) int local31 = this.aClass44_1.method1319(local14);
				if (local31 == 1) {
					this.aClass44_1.method1318();
					this.aClass44_1.method1308(local14);
					if (this.aClass44_1.method1310()) {
						if (!this.aBoolean23 || local20 == 0) {
							this.method568();
							this.aClass44_1.method1317();
							return;
						}
						this.aClass44_1.method1316(local17);
					}
					break;
				}
				if ((local31 & 0x80) != 0) {
					this.method555(local31);
				}
				this.aClass44_1.method1312(local14);
				this.aClass44_1.method1308(local14);
			}
			local14 = this.aClass44_1.method1314();
			local20 = this.aClass44_1.anIntArray180[local14];
			local17 = this.aClass44_1.method1320(local20);
		}
		this.anInt813 = local20;
		this.aLong25 = local17;
		this.anInt814 = local14;
	}

	@OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)V")
	@Override
	public synchronized void method964(@OriginalArg(0) int arg0) {
		if (this.aClass44_1.method1307()) {
			@Pc(14) int local14 = this.anInt807 * this.aClass44_1.anInt1759 / Static31.anInt846;
			do {
				@Pc(23) long local23 = this.aLong26 + (long) arg0 * (long) local14;
				if (this.aLong25 - local23 >= 0L) {
					this.aLong26 = local23;
					break;
				}
				@Pc(53) int local53 = (int) ((this.aLong25 + (long) local14 - this.aLong26 - 1L) / (long) local14);
				this.aLong26 += (long) local14 * (long) local53;
				this.aClass4_Sub2_Sub4_1.method964(local53);
				this.method569();
				arg0 -= local53;
			} while (this.aClass44_1.method1307());
		}
		this.aClass4_Sub2_Sub4_1.method964(arg0);
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(Lclient!rd;ILclient!lc;Lclient!n;B)Z")
	public synchronized boolean method570(@OriginalArg(0) Class63 arg0, @OriginalArg(2) Class40 arg1, @OriginalArg(3) Class4_Sub15 arg2) {
		arg2.method1400();
		@Pc(14) boolean local14 = true;
		@Pc(25) int[] local25 = new int[] { 22050 };
		for (@Pc(33) Class4_Sub7 local33 = (Class4_Sub7) arg2.aClass66_7.method1838(); local33 != null; local33 = (Class4_Sub7) arg2.aClass66_7.method1831()) {
			@Pc(39) int local39 = (int) local33.aLong100;
			@Pc(47) Class4_Sub9 local47 = (Class4_Sub9) this.aClass66_1.method1834((long) local39);
			if (local47 == null) {
				local47 = Static117.method1960(arg1, local39);
				if (local47 == null) {
					local14 = false;
					continue;
				}
				this.aClass66_1.method1830(local47, (long) local39);
			}
			if (!local47.method593(arg0, local25, local33.aByteArray31)) {
				local14 = false;
			}
		}
		if (local14) {
			arg2.method1401();
		}
		return local14;
	}

	@OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZBLclient!f;)V")
	public void method571(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class4_Sub10 arg1) {
		@Pc(4) int local4 = arg1.aClass4_Sub1_Sub1_1.aByteArray46.length;
		@Pc(27) int local27;
		if (arg0 && arg1.aClass4_Sub1_Sub1_1.aBoolean31) {
			@Pc(38) int local38 = local4 + local4 - arg1.aClass4_Sub1_Sub1_1.anInt1054;
			local4 <<= 0x8;
			local27 = (int) ((long) local38 * (long) this.anIntArray51[arg1.anInt878] >> 6);
			if (local27 >= local4) {
				arg1.aClass4_Sub2_Sub1_1.method79();
				local27 = local4 + local4 - local27 - 1;
			}
		} else {
			local27 = (int) ((long) local4 * (long) this.anIntArray51[arg1.anInt878] >> 6);
		}
		arg1.aClass4_Sub2_Sub1_1.method81(local27);
	}

	@OriginalMember(owner = "client!ec", name = "d", descriptor = "(II)V")
	private void method572(@OriginalArg(1) int arg0) {
		for (@Pc(8) Class4_Sub10 local8 = (Class4_Sub10) this.aClass4_Sub2_Sub4_1.aClass70_11.method1939(); local8 != null; local8 = (Class4_Sub10) this.aClass4_Sub2_Sub4_1.aClass70_11.method1936()) {
			if (arg0 < 0 || local8.anInt878 == arg0) {
				if (local8.aClass4_Sub2_Sub1_1 != null) {
					local8.aClass4_Sub2_Sub1_1.method101(Static31.anInt846 / 100);
					if (local8.aClass4_Sub2_Sub1_1.method107()) {
						this.aClass4_Sub2_Sub4_1.aClass4_Sub2_Sub3_1.method749(local8.aClass4_Sub2_Sub1_1);
					}
					local8.method610();
				}
				if (local8.anInt870 < 0) {
					this.aClass4_Sub10ArrayArray1[local8.anInt878][local8.anInt863] = null;
				}
				local8.method2124();
			}
		}
	}

	@OriginalMember(owner = "client!ec", name = "c", descriptor = "()Lclient!oc;")
	@Override
	public synchronized Class4_Sub2 method967() {
		return null;
	}
}
