import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public final class Class1_Sub5_Sub3 extends Class1_Sub5 {

	@OriginalMember(owner = "client!hd", name = "Fb", descriptor = "Z")
	private boolean aBoolean72;

	@OriginalMember(owner = "client!hd", name = "Gb", descriptor = "I")
	private int anInt1864;

	@OriginalMember(owner = "client!hd", name = "Hb", descriptor = "I")
	private int anInt1865;

	@OriginalMember(owner = "client!hd", name = "Ib", descriptor = "J")
	private long aLong52;

	@OriginalMember(owner = "client!hd", name = "Jb", descriptor = "J")
	private long aLong53;

	@OriginalMember(owner = "client!hd", name = "w", descriptor = "[I")
	public final int[] anIntArray142 = new int[16];

	@OriginalMember(owner = "client!hd", name = "X", descriptor = "[I")
	private final int[] anIntArray145 = new int[16];

	@OriginalMember(owner = "client!hd", name = "V", descriptor = "[I")
	private final int[] anIntArray144 = new int[16];

	@OriginalMember(owner = "client!hd", name = "G", descriptor = "[I")
	private final int[] anIntArray143 = new int[16];

	@OriginalMember(owner = "client!hd", name = "cb", descriptor = "[I")
	private final int[] anIntArray147 = new int[16];

	@OriginalMember(owner = "client!hd", name = "I", descriptor = "[[Lclient!ib;")
	private final Class1_Sub12[][] aClass1_Sub12ArrayArray1 = new Class1_Sub12[16][128];

	@OriginalMember(owner = "client!hd", name = "kb", descriptor = "[I")
	private final int[] anIntArray150 = new int[16];

	@OriginalMember(owner = "client!hd", name = "bb", descriptor = "[I")
	private final int[] anIntArray146 = new int[16];

	@OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
	private final int anInt1838 = 1000000;

	@OriginalMember(owner = "client!hd", name = "eb", descriptor = "[I")
	private final int[] anIntArray148 = new int[16];

	@OriginalMember(owner = "client!hd", name = "hb", descriptor = "[I")
	private final int[] anIntArray149 = new int[16];

	@OriginalMember(owner = "client!hd", name = "ib", descriptor = "I")
	private int anInt1853 = 256;

	@OriginalMember(owner = "client!hd", name = "ub", descriptor = "[I")
	private final int[] anIntArray155 = new int[16];

	@OriginalMember(owner = "client!hd", name = "ob", descriptor = "[I")
	public final int[] anIntArray152 = new int[16];

	@OriginalMember(owner = "client!hd", name = "qb", descriptor = "[I")
	public final int[] anIntArray153 = new int[16];

	@OriginalMember(owner = "client!hd", name = "sb", descriptor = "[I")
	private final int[] anIntArray154 = new int[16];

	@OriginalMember(owner = "client!hd", name = "db", descriptor = "[[Lclient!ib;")
	private final Class1_Sub12[][] aClass1_Sub12ArrayArray2 = new Class1_Sub12[16][128];

	@OriginalMember(owner = "client!hd", name = "Bb", descriptor = "[I")
	private final int[] anIntArray156 = new int[16];

	@OriginalMember(owner = "client!hd", name = "lb", descriptor = "[I")
	private final int[] anIntArray151 = new int[16];

	@OriginalMember(owner = "client!hd", name = "nb", descriptor = "Lclient!ca;")
	private final Class8 aClass8_1 = new Class8();

	@OriginalMember(owner = "client!hd", name = "Kb", descriptor = "Lclient!e;")
	private final Class1_Sub5_Sub1 aClass1_Sub5_Sub1_1 = new Class1_Sub5_Sub1(this);

	@OriginalMember(owner = "client!hd", name = "z", descriptor = "Lclient!da;")
	private final Class14 aClass14_4 = new Class14(128);

	@OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub3() {
		this.method1233();
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V")
	public synchronized void method1212() {
		for (@Pc(11) Class1_Sub16 local11 = (Class1_Sub16) this.aClass14_4.method563(); local11 != null; local11 = (Class1_Sub16) this.aClass14_4.method571()) {
			local11.method3198();
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "()Lclient!bc;")
	@Override
	public synchronized Class1_Sub5 method1314() {
		return null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(II)V")
	private void method1213(@OriginalArg(1) int arg0) {
		for (@Pc(18) Class1_Sub12 local18 = (Class1_Sub12) this.aClass1_Sub5_Sub1_1.aClass59_14.method2417(); local18 != null; local18 = (Class1_Sub12) this.aClass1_Sub5_Sub1_1.aClass59_14.method2424()) {
			if ((arg0 < 0 || arg0 == local18.anInt1965) && local18.anInt1974 < 0) {
				this.aClass1_Sub12ArrayArray2[local18.anInt1965][local18.anInt1980] = null;
				local18.anInt1974 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method1313(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass8_1.method344()) {
			@Pc(14) int local14 = this.anInt1838 * this.aClass8_1.anInt560 / Static74.anInt2248;
			do {
				@Pc(23) long local23 = this.aLong53 + (long) local14 * (long) arg2;
				if (this.aLong52 - local23 >= 0L) {
					this.aLong53 = local23;
					break;
				}
				@Pc(54) int local54 = (int) (((long) local14 + this.aLong52 - this.aLong53 - 1L) / (long) local14);
				arg2 -= local54;
				this.aLong53 += (long) local14 * (long) local54;
				this.aClass1_Sub5_Sub1_1.method1313(arg0, arg1, local54);
				arg1 += local54;
				this.method1227();
			} while (this.aClass8_1.method344());
		}
		this.aClass1_Sub5_Sub1_1.method1313(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)V")
	private void method1214(@OriginalArg(0) int arg0) {
		if ((this.anIntArray152[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(20) Class1_Sub12 local20 = (Class1_Sub12) this.aClass1_Sub5_Sub1_1.aClass59_14.method2417(); local20 != null; local20 = (Class1_Sub12) this.aClass1_Sub5_Sub1_1.aClass59_14.method2424()) {
			if (arg0 == local20.anInt1965) {
				local20.anInt1983 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(III)V")
	private void method1215(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BI)V")
	private void method1216(@OriginalArg(1) int arg0) {
		if ((this.anIntArray152[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class1_Sub12 local18 = (Class1_Sub12) this.aClass1_Sub5_Sub1_1.aClass59_14.method2417(); local18 != null; local18 = (Class1_Sub12) this.aClass1_Sub5_Sub1_1.aClass59_14.method2424()) {
			if (local18.anInt1965 == arg0 && this.aClass1_Sub12ArrayArray2[arg0][local18.anInt1980] == null && local18.anInt1974 < 0) {
				local18.anInt1974 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BII)V")
	private void method1217(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray150[arg1] = arg0;
		this.anIntArray142[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!hd", name = "e", descriptor = "(I)V")
	public synchronized void method1218() {
		this.aClass8_1.method335();
		this.method1233();
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(II)V")
	private void method1219(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method1219(local12);
			}
			return;
		}
		this.anIntArray143[arg0] = 12800;
		this.anIntArray154[arg0] = 8192;
		this.anIntArray156[arg0] = 16383;
		this.anIntArray145[arg0] = 8192;
		this.anIntArray147[arg0] = 0;
		this.anIntArray144[arg0] = 8192;
		this.method1216(arg0);
		this.method1214(arg0);
		this.anIntArray152[arg0] = 0;
		this.anIntArray151[arg0] = 32767;
		this.anIntArray149[arg0] = 256;
		this.anIntArray153[arg0] = 0;
		this.method1217(8192, arg0);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIBI)V")
	private void method1220(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZZLclient!ib;)V")
	public void method1221(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub12 arg1) {
		@Pc(14) int local14 = arg1.aClass1_Sub13_Sub1_1.aByteArray17.length;
		@Pc(33) int local33;
		if (arg0 && arg1.aClass1_Sub13_Sub1_1.aBoolean81) {
			@Pc(44) int local44 = local14 + local14 - arg1.aClass1_Sub13_Sub1_1.anInt2079;
			local33 = (int) ((long) this.anIntArray153[arg1.anInt1965] * (long) local44 >> 6);
			local14 <<= 0x8;
			if (local14 <= local33) {
				arg1.aClass1_Sub5_Sub4_3.method1335();
				local33 = local14 + local14 - local33 - 1;
			}
		} else {
			local33 = (int) ((long) this.anIntArray153[arg1.anInt1965] * (long) local14 >> 6);
		}
		arg1.aClass1_Sub5_Sub4_3.method1338(local33);
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!ib;)Z")
	public boolean method1223(@OriginalArg(1) Class1_Sub12 arg0) {
		if (arg0.aClass1_Sub5_Sub4_3 != null) {
			return false;
		}
		if (arg0.anInt1974 >= 0) {
			arg0.method3198();
			if (arg0.anInt1963 > 0 && arg0 == this.aClass1_Sub12ArrayArray1[arg0.anInt1965][arg0.anInt1963]) {
				this.aClass1_Sub12ArrayArray1[arg0.anInt1965][arg0.anInt1963] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ph;BZ)V")
	public synchronized void method1224(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(2) boolean arg1) {
		this.method1218();
		this.aClass8_1.method333(arg0.aByteArray37);
		this.aBoolean72 = arg1;
		this.aLong53 = 0L;
		@Pc(25) int local25 = this.aClass8_1.method340();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			this.aClass8_1.method339(local27);
			this.aClass8_1.method342(local27);
			this.aClass8_1.method337(local27);
		}
		this.anInt1864 = this.aClass8_1.method345();
		this.anInt1865 = this.aClass8_1.anIntArray41[this.anInt1864];
		this.aLong52 = this.aClass8_1.method331(this.anInt1865);
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "()Lclient!bc;")
	@Override
	public synchronized Class1_Sub5 method1318() {
		return this.aClass1_Sub5_Sub1_1;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(III)V")
	public synchronized void method1225() {
		this.method1237();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)I")
	public int method1226() {
		return this.anInt1853;
	}

	@OriginalMember(owner = "client!hd", name = "g", descriptor = "(I)V")
	private void method1227() {
		@Pc(12) int local12 = this.anInt1864;
		@Pc(15) int local15 = this.anInt1865;
		@Pc(22) long local22 = this.aLong52;
		while (local15 == this.anInt1865) {
			while (this.aClass8_1.anIntArray41[local12] == local15) {
				this.aClass8_1.method339(local12);
				@Pc(33) int local33 = this.aClass8_1.method332(local12);
				if (local33 == 1) {
					this.aClass8_1.method343();
					this.aClass8_1.method337(local12);
					if (this.aClass8_1.method336()) {
						if (!this.aBoolean72 || local15 == 0) {
							this.method1233();
							this.aClass8_1.method335();
							return;
						}
						this.aClass8_1.method330(local22);
					}
					break;
				}
				if ((local33 & 0x80) != 0) {
					this.method1234(local33);
				}
				this.aClass8_1.method342(local12);
				this.aClass8_1.method337(local12);
			}
			local12 = this.aClass8_1.method345();
			local15 = this.aClass8_1.anIntArray41[local12];
			local22 = this.aClass8_1.method331(local15);
		}
		this.aLong52 = local22;
		this.anInt1864 = local12;
		this.anInt1865 = local15;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ib;I)I")
	private int method1228(@OriginalArg(0) Class1_Sub12 arg0) {
		@Pc(2) Class67 local2 = arg0.aClass67_1;
		@Pc(18) int local18 = this.anIntArray143[arg0.anInt1965] * this.anIntArray156[arg0.anInt1965] + 4096 >> 13;
		@Pc(26) int local26 = local18 * local18 + 16384 >> 15;
		@Pc(39) int local39 = arg0.anInt1984 * local26 + 16384 >> 15;
		local18 = this.anInt1853 * local39 + 128 >> 8;
		if (local2.anInt3841 > 0) {
			local18 = (int) ((double) local18 * Math.pow(0.5D, (double) local2.anInt3841 * (double) arg0.anInt1967 * 1.953125E-5D) + 0.5D);
		}
		@Pc(83) int local83;
		@Pc(91) int local91;
		@Pc(121) int local121;
		@Pc(111) int local111;
		if (local2.aByteArray39 != null) {
			local83 = arg0.anInt1976;
			local91 = local2.aByteArray39[arg0.anInt1977 + 1];
			if (arg0.anInt1977 < local2.aByteArray39.length - 2) {
				local111 = (local2.aByteArray39[arg0.anInt1977 + 2] & 0xFF) << 8;
				local121 = (local2.aByteArray39[arg0.anInt1977] & 0xFF) << 8;
				local91 += (local2.aByteArray39[arg0.anInt1977 + 3] - local91) * (local83 - local121) / (local111 - local121);
			}
			local18 = local91 * local18 + 32 >> 6;
		}
		if (arg0.anInt1974 > 0 && local2.aByteArray38 != null) {
			local83 = arg0.anInt1974;
			local91 = local2.aByteArray38[arg0.anInt1979 + 1];
			if (local2.aByteArray38.length - 2 > arg0.anInt1979) {
				local121 = (local2.aByteArray38[arg0.anInt1979] & 0xFF) << 8;
				local111 = (local2.aByteArray38[arg0.anInt1979 + 2] & 0xFF) << 8;
				local91 += (local83 - local121) * (local2.aByteArray38[arg0.anInt1979 + 3] - local91) / (local111 - local121);
			}
			local18 = local91 * local18 + 32 >> 6;
		}
		return local18;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IBI)V")
	private void method1229(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 != this.anIntArray146[arg1]) {
			this.anIntArray146[arg1] = arg0;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass1_Sub12ArrayArray1[arg1][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([IBILclient!ib;I)Z")
	public boolean method1230(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub12 arg2, @OriginalArg(4) int arg3) {
		arg2.anInt1969 = Static74.anInt2248 / 100;
		if (arg2.anInt1974 >= 0 && (arg2.aClass1_Sub5_Sub4_3 == null || arg2.aClass1_Sub5_Sub4_3.method1356())) {
			arg2.method1299();
			arg2.method3198();
			if (arg2.anInt1963 > 0 && arg2 == this.aClass1_Sub12ArrayArray1[arg2.anInt1965][arg2.anInt1963]) {
				this.aClass1_Sub12ArrayArray1[arg2.anInt1965][arg2.anInt1963] = null;
			}
			return true;
		}
		@Pc(65) int local65 = arg2.anInt1970;
		if (local65 > 0) {
			local65 -= (int) (Math.pow(2.0D, (double) this.anIntArray144[arg2.anInt1965] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local65 < 0) {
				local65 = 0;
			}
			arg2.anInt1970 = local65;
		}
		arg2.aClass1_Sub5_Sub4_3.method1324(this.method1243(arg2));
		@Pc(121) double local121 = (double) ((arg2.anInt1980 - 60 << 8) + (arg2.anInt1970 * arg2.anInt1968 >> 12)) * 5.086263020833333E-6D;
		arg2.anInt1971++;
		@Pc(130) Class67 local130 = arg2.aClass67_1;
		arg2.anInt1972 += local130.anInt3840;
		@Pc(139) boolean local139 = false;
		if (local130.anInt3841 > 0) {
			if (local130.anInt3843 <= 0) {
				arg2.anInt1967 += 128;
			} else {
				arg2.anInt1967 += (int) (Math.pow(2.0D, (double) local130.anInt3843 * local121) * 128.0D + 0.5D);
			}
			if (local130.anInt3841 * arg2.anInt1967 >= 819200) {
				local139 = true;
			}
		}
		if (local130.aByteArray39 != null) {
			if (local130.anInt3835 <= 0) {
				arg2.anInt1976 += 128;
			} else {
				arg2.anInt1976 += (int) (Math.pow(2.0D, local121 * (double) local130.anInt3835) * 128.0D + 0.5D);
			}
			while (arg2.anInt1977 < local130.aByteArray39.length - 2 && (local130.aByteArray39[arg2.anInt1977 + 2] & 0xFF) << 8 < arg2.anInt1976) {
				arg2.anInt1977 += 2;
			}
			if (arg2.anInt1977 == local130.aByteArray39.length - 2 && local130.aByteArray39[arg2.anInt1977 + 1] == 0) {
				local139 = true;
			}
		}
		if (arg2.anInt1974 >= 0 && local130.aByteArray38 != null && (this.anIntArray152[arg2.anInt1965] & 0x1) == 0 && (arg2.anInt1963 < 0 || arg2 != this.aClass1_Sub12ArrayArray1[arg2.anInt1965][arg2.anInt1963])) {
			if (local130.anInt3837 <= 0) {
				arg2.anInt1974 += 128;
			} else {
				arg2.anInt1974 += (int) (Math.pow(2.0D, local121 * (double) local130.anInt3837) * 128.0D + 0.5D);
			}
			while (local130.aByteArray38.length - 2 > arg2.anInt1979 && arg2.anInt1974 > (local130.aByteArray38[arg2.anInt1979 + 2] & 0xFF) << 8) {
				arg2.anInt1979 += 2;
			}
			if (local130.aByteArray38.length - 2 == arg2.anInt1979) {
				local139 = true;
			}
		}
		if (!local139) {
			arg2.aClass1_Sub5_Sub4_3.method1341(arg2.anInt1969, this.method1228(arg2), this.method1236(arg2));
			return false;
		}
		arg2.aClass1_Sub5_Sub4_3.method1328(arg2.anInt1969);
		if (arg0 == null) {
			arg2.aClass1_Sub5_Sub4_3.method1316(arg3);
		} else {
			arg2.aClass1_Sub5_Sub4_3.method1313(arg0, arg1, arg3);
		}
		if (arg2.aClass1_Sub5_Sub4_3.method1334()) {
			this.aClass1_Sub5_Sub1_1.aClass1_Sub5_Sub2_2.method1188(arg2.aClass1_Sub5_Sub4_3);
		}
		arg2.method1299();
		if (arg2.anInt1974 >= 0) {
			arg2.method3198();
			if (arg2.anInt1963 > 0 && arg2 == this.aClass1_Sub12ArrayArray1[arg2.anInt1965][arg2.anInt1963]) {
				this.aClass1_Sub12ArrayArray1[arg2.anInt1965][arg2.anInt1963] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "()I")
	@Override
	public synchronized int method1312() {
		return 0;
	}

	@OriginalMember(owner = "client!hd", name = "h", descriptor = "(I)Z")
	public synchronized boolean method1231() {
		return this.aClass8_1.method344();
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(Z)V")
	private void method1233() {
		this.method1238(-1);
		this.method1219(-1);
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray146[local15] = this.anIntArray148[local15];
		}
		for (@Pc(39) int local39 = 0; local39 < 16; local39++) {
			this.anIntArray155[local39] = this.anIntArray148[local39] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(II)V")
	private void method1234(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(24) int local24;
		@Pc(20) int local20;
		@Pc(30) int local30;
		if (local9 == 128) {
			local20 = arg0 >> 8 & 0x7F;
			local24 = arg0 & 0xF;
			local30 = arg0 >> 16 & 0x7F;
			this.method1244(local30, local20, local24);
		} else if (local9 == 144) {
			local24 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 <= 0) {
				this.method1244(64, local20, local24);
			} else {
				this.method1235(local20, local30, local24);
			}
		} else if (local9 == 160) {
			local24 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1220(local24, local30, local20);
		} else if (local9 == 176) {
			local24 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local20 == 0) {
				this.anIntArray155[local24] = (local30 << 14) + (this.anIntArray155[local24] & 0xFFE03FFF);
			}
			if (local20 == 32) {
				this.anIntArray155[local24] = (local30 << 7) + (this.anIntArray155[local24] & 0xFFFFC07F);
			}
			if (local20 == 1) {
				this.anIntArray147[local24] = (local30 << 7) + (this.anIntArray147[local24] & 0xFFFFC07F);
			}
			if (local20 == 33) {
				this.anIntArray147[local24] = (this.anIntArray147[local24] & 0xFFFFFF80) + local30;
			}
			if (local20 == 5) {
				this.anIntArray144[local24] = (this.anIntArray144[local24] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local20 == 37) {
				this.anIntArray144[local24] = (this.anIntArray144[local24] & 0xFFFFFF80) + local30;
			}
			if (local20 == 7) {
				this.anIntArray143[local24] = (this.anIntArray143[local24] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local20 == 39) {
				this.anIntArray143[local24] = (this.anIntArray143[local24] & 0xFFFFFF80) + local30;
			}
			if (local20 == 10) {
				this.anIntArray154[local24] = (local30 << 7) + (this.anIntArray154[local24] & 0xFFFFC07F);
			}
			if (local20 == 42) {
				this.anIntArray154[local24] = (this.anIntArray154[local24] & 0xFFFFFF80) + local30;
			}
			if (local20 == 11) {
				this.anIntArray156[local24] = (local30 << 7) + (this.anIntArray156[local24] & 0xFFFFC07F);
			}
			if (local20 == 43) {
				this.anIntArray156[local24] = local30 + (this.anIntArray156[local24] & 0xFFFFFF80);
			}
			if (local20 == 64) {
				if (local30 < 64) {
					this.anIntArray152[local24] &= 0xFFFFFFFE;
				} else {
					this.anIntArray152[local24] |= 0x1;
				}
			}
			if (local20 == 65) {
				if (local30 >= 64) {
					this.anIntArray152[local24] |= 0x2;
				} else {
					this.method1216(local24);
					this.anIntArray152[local24] &= 0xFFFFFFFD;
				}
			}
			if (local20 == 99) {
				this.anIntArray151[local24] = (this.anIntArray151[local24] & 0x7F) + (local30 << 7);
			}
			if (local20 == 98) {
				this.anIntArray151[local24] = local30 + (this.anIntArray151[local24] & 0x3F80);
			}
			if (local20 == 101) {
				this.anIntArray151[local24] = (local30 << 7) + (this.anIntArray151[local24] & 0x7F) + 16384;
			}
			if (local20 == 100) {
				this.anIntArray151[local24] = (this.anIntArray151[local24] & 0x3F80) + local30 + 16384;
			}
			if (local20 == 120) {
				this.method1238(local24);
			}
			if (local20 == 121) {
				this.method1219(local24);
			}
			if (local20 == 123) {
				this.method1213(local24);
			}
			@Pc(508) int local508;
			if (local20 == 6) {
				local508 = this.anIntArray151[local24];
				if (local508 == 16384) {
					this.anIntArray149[local24] = (this.anIntArray149[local24] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local20 == 38) {
				local508 = this.anIntArray151[local24];
				if (local508 == 16384) {
					this.anIntArray149[local24] = (this.anIntArray149[local24] & 0xFFFFFF80) + local30;
				}
			}
			if (local20 == 16) {
				this.anIntArray153[local24] = (local30 << 7) + (this.anIntArray153[local24] & 0xFFFFC07F);
			}
			if (local20 == 48) {
				this.anIntArray153[local24] = local30 + (this.anIntArray153[local24] & 0xFFFFFF80);
			}
			if (local20 == 81) {
				if (local30 < 64) {
					this.method1214(local24);
					this.anIntArray152[local24] &= 0xFFFFFFFB;
				} else {
					this.anIntArray152[local24] |= 0x4;
				}
			}
			if (local20 == 17) {
				this.method1217((local30 << 7) + (this.anIntArray150[local24] & 0xFFFFC07F), local24);
			}
			if (local20 == 49) {
				this.method1217((this.anIntArray150[local24] & 0xFFFFFF80) + local30, local24);
			}
		} else if (local9 == 192) {
			local24 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			this.method1229(this.anIntArray155[local24] + local20, local24);
		} else if (local9 == 208) {
			local24 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			this.method1215(local24, local20);
		} else if (local9 == 224) {
			local24 = arg0 & 0xF;
			local20 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method1245(local24, local20);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1233();
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIII)V")
	private void method1235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method1244(64, arg0, arg2);
		if ((this.anIntArray152[arg2] & 0x2) != 0) {
			for (@Pc(25) Class1_Sub12 local25 = (Class1_Sub12) this.aClass1_Sub5_Sub1_1.aClass59_14.method2419(); local25 != null; local25 = (Class1_Sub12) this.aClass1_Sub5_Sub1_1.aClass59_14.method2421()) {
				if (local25.anInt1965 == arg2 && local25.anInt1974 < 0) {
					this.aClass1_Sub12ArrayArray2[arg2][local25.anInt1980] = null;
					this.aClass1_Sub12ArrayArray2[arg2][arg0] = local25;
					@Pc(60) int local60 = (local25.anInt1970 * local25.anInt1968 >> 12) + local25.anInt1966;
					local25.anInt1966 += arg0 - local25.anInt1980 << 8;
					local25.anInt1980 = arg0;
					local25.anInt1970 = 4096;
					local25.anInt1968 = local60 - local25.anInt1966;
					return;
				}
			}
		}
		@Pc(106) Class1_Sub16 local106 = (Class1_Sub16) this.aClass14_4.method569((long) this.anIntArray146[arg2]);
		if (local106 == null) {
			return;
		}
		@Pc(118) Class1_Sub13_Sub1 local118 = local106.aClass1_Sub13_Sub1Array1[arg0];
		if (local118 == null) {
			return;
		}
		@Pc(125) Class1_Sub12 local125 = new Class1_Sub12();
		local125.aClass1_Sub16_1 = local106;
		local125.anInt1965 = arg2;
		local125.aClass1_Sub13_Sub1_1 = local118;
		local125.aClass67_1 = local106.aClass67Array1[arg0];
		local125.anInt1963 = local106.aByteArray33[arg0];
		local125.anInt1980 = arg0;
		local125.anInt1984 = local106.aByteArray35[arg0] * arg1 * arg1 * local106.anInt3049 + 1024 >> 11;
		local125.anInt1981 = local106.aByteArray34[arg0] & 0xFF;
		local125.anInt1966 = (arg0 << 8) - (local106.aShortArray27[arg0] & 0x7FFF);
		local125.anInt1967 = 0;
		local125.anInt1977 = 0;
		local125.anInt1979 = 0;
		local125.anInt1976 = 0;
		local125.anInt1974 = -1;
		if (this.anIntArray153[arg2] == 0) {
			local125.aClass1_Sub5_Sub4_3 = Static183.method1319(local118, this.method1243(local125), this.method1228(local125), this.method1236(local125));
		} else {
			local125.aClass1_Sub5_Sub4_3 = Static183.method1319(local118, this.method1243(local125), 0, this.method1236(local125));
			this.method1221(local106.aShortArray27[arg0] < 0, local125);
		}
		if (local106.aShortArray27[arg0] < 0) {
			local125.aClass1_Sub5_Sub4_3.method1357(-1);
		}
		if (local125.anInt1963 >= 0) {
			@Pc(276) Class1_Sub12 local276 = this.aClass1_Sub12ArrayArray1[arg2][local125.anInt1963];
			if (local276 != null && local276.anInt1974 < 0) {
				this.aClass1_Sub12ArrayArray2[arg2][local276.anInt1980] = null;
				local276.anInt1974 = 0;
			}
			this.aClass1_Sub12ArrayArray1[arg2][local125.anInt1963] = local125;
		}
		this.aClass1_Sub5_Sub1_1.aClass59_14.method2411(local125);
		this.aClass1_Sub12ArrayArray2[arg2][arg0] = local125;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!ib;B)I")
	private int method1236(@OriginalArg(0) Class1_Sub12 arg0) {
		@Pc(15) int local15 = this.anIntArray154[arg0.anInt1965];
		return local15 >= 8192 ? 16384 - ((16384 - local15) * (-arg0.anInt1981 + 128) + 32 >> 6) : local15 * arg0.anInt1981 + 32 >> 6;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(III)V")
	private void method1237() {
		this.anIntArray148[9] = 128;
		this.anIntArray155[9] = 128;
		this.method1229(128, 9);
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(IB)V")
	private void method1238(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class1_Sub12 local10 = (Class1_Sub12) this.aClass1_Sub5_Sub1_1.aClass59_14.method2417(); local10 != null; local10 = (Class1_Sub12) this.aClass1_Sub5_Sub1_1.aClass59_14.method2424()) {
			if (arg0 < 0 || arg0 == local10.anInt1965) {
				if (local10.aClass1_Sub5_Sub4_3 != null) {
					local10.aClass1_Sub5_Sub4_3.method1328(Static74.anInt2248 / 100);
					if (local10.aClass1_Sub5_Sub4_3.method1334()) {
						this.aClass1_Sub5_Sub1_1.aClass1_Sub5_Sub2_2.method1188(local10.aClass1_Sub5_Sub4_3);
					}
					local10.method1299();
				}
				if (local10.anInt1974 < 0) {
					this.aClass1_Sub12ArrayArray2[local10.anInt1965][local10.anInt1980] = null;
				}
				local10.method3198();
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method1316(@OriginalArg(0) int arg0) {
		if (this.aClass8_1.method344()) {
			@Pc(18) int local18 = this.aClass8_1.anInt560 * this.anInt1838 / Static74.anInt2248;
			do {
				@Pc(27) long local27 = (long) arg0 * (long) local18 + this.aLong53;
				if (this.aLong52 - local27 >= 0L) {
					this.aLong53 = local27;
					break;
				}
				@Pc(57) int local57 = (int) (((long) local18 + this.aLong52 - this.aLong53 - 1L) / (long) local18);
				arg0 -= local57;
				this.aLong53 += (long) local18 * (long) local57;
				this.aClass1_Sub5_Sub1_1.method1316(local57);
				this.method1227();
			} while (this.aClass8_1.method344());
		}
		this.aClass1_Sub5_Sub1_1.method1316(arg0);
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(IB)V")
	public synchronized void method1239(@OriginalArg(0) int arg0) {
		this.anInt1853 = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "j", descriptor = "(I)V")
	public synchronized void method1240() {
		for (@Pc(7) Class1_Sub16 local7 = (Class1_Sub16) this.aClass14_4.method563(); local7 != null; local7 = (Class1_Sub16) this.aClass14_4.method571()) {
			local7.method2144();
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Lclient!tb;Lclient!ph;Lclient!dd;ZI)Z")
	public synchronized boolean method1241(@OriginalArg(0) Class73 arg0, @OriginalArg(1) Class1_Sub20 arg1, @OriginalArg(2) Class16 arg2) {
		arg1.method2433();
		@Pc(11) boolean local11 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class1_Sub23 local29 = (Class1_Sub23) arg1.aClass14_7.method563(); local29 != null; local29 = (Class1_Sub23) arg1.aClass14_7.method571()) {
			@Pc(35) int local35 = (int) local29.aLong139;
			@Pc(43) Class1_Sub16 local43 = (Class1_Sub16) this.aClass14_4.method569((long) local35);
			if (local43 == null) {
				local43 = Static2.method54(arg2, local35);
				if (local43 == null) {
					local11 = false;
					continue;
				}
				this.aClass14_4.method570(local43, (long) local35);
			}
			if (!local43.method2143(local29.aByteArray40, local23, arg0)) {
				local11 = false;
			}
		}
		if (local11) {
			arg1.method2431();
		}
		return local11;
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(Lclient!ib;I)I")
	private int method1243(@OriginalArg(0) Class1_Sub12 arg0) {
		@Pc(22) int local22 = (arg0.anInt1968 * arg0.anInt1970 >> 12) + arg0.anInt1966;
		@Pc(25) Class67 local25 = arg0.aClass67_1;
		local22 += (this.anIntArray145[arg0.anInt1965] - 8192) * this.anIntArray149[arg0.anInt1965] >> 12;
		@Pc(66) int local66;
		if (local25.anInt3840 > 0 && (local25.anInt3838 > 0 || this.anIntArray147[arg0.anInt1965] > 0)) {
			local66 = local25.anInt3838 << 2;
			@Pc(71) int local71 = local25.anInt3833 << 1;
			if (local71 > arg0.anInt1971) {
				local66 = local66 * arg0.anInt1971 / local71;
			}
			local66 += this.anIntArray147[arg0.anInt1965] >> 7;
			@Pc(101) double local101 = Math.sin((double) (arg0.anInt1972 & 0x1FF) * 0.01227184630308513D);
			local22 += (int) ((double) local66 * local101);
		}
		local66 = (int) ((double) (arg0.aClass1_Sub13_Sub1_1.anInt2078 * 256) * Math.pow(2.0D, (double) local22 * 3.255208333333333E-4D) / (double) Static74.anInt2248 + 0.5D);
		return local66 < 1 ? 1 : local66;
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "(IIII)V")
	private void method1244(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub12 local12 = this.aClass1_Sub12ArrayArray2[arg2][arg1];
		if (local12 == null) {
			return;
		}
		this.aClass1_Sub12ArrayArray2[arg2][arg1] = null;
		if ((this.anIntArray152[arg2] & 0x2) == 0) {
			local12.anInt1974 = 0;
			return;
		}
		for (@Pc(39) Class1_Sub12 local39 = (Class1_Sub12) this.aClass1_Sub5_Sub1_1.aClass59_14.method2417(); local39 != null; local39 = (Class1_Sub12) this.aClass1_Sub5_Sub1_1.aClass59_14.method2424()) {
			if (local39.anInt1965 == local12.anInt1965 && local39.anInt1974 < 0 && local39 != local12) {
				local12.anInt1974 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(III)V")
	private void method1245(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray145[arg0] = arg1;
	}
}
