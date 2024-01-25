import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!e")
public final class Class2_Sub11_Sub1 extends Class2_Sub11 {

	@OriginalMember(owner = "client!e", name = "Ab", descriptor = "I")
	private int anInt1256;

	@OriginalMember(owner = "client!e", name = "Bb", descriptor = "Z")
	private boolean aBoolean123;

	@OriginalMember(owner = "client!e", name = "Db", descriptor = "I")
	private int anInt1257;

	@OriginalMember(owner = "client!e", name = "Fb", descriptor = "J")
	private long aLong46;

	@OriginalMember(owner = "client!e", name = "Ib", descriptor = "J")
	private long aLong47;

	@OriginalMember(owner = "client!e", name = "Jb", descriptor = "Lclient!vf;")
	private Class2_Sub42 aClass2_Sub42_1;

	@OriginalMember(owner = "client!e", name = "Lb", descriptor = "Z")
	private boolean aBoolean124;

	@OriginalMember(owner = "client!e", name = "Mb", descriptor = "I")
	private int anInt1260;

	@OriginalMember(owner = "client!e", name = "y", descriptor = "[I")
	private final int[] anIntArray105 = new int[16];

	@OriginalMember(owner = "client!e", name = "s", descriptor = "[I")
	private final int[] anIntArray103 = new int[16];

	@OriginalMember(owner = "client!e", name = "D", descriptor = "[I")
	private final int[] anIntArray106 = new int[16];

	@OriginalMember(owner = "client!e", name = "W", descriptor = "[I")
	private final int[] anIntArray112 = new int[16];

	@OriginalMember(owner = "client!e", name = "J", descriptor = "[I")
	public final int[] anIntArray108 = new int[16];

	@OriginalMember(owner = "client!e", name = "T", descriptor = "[I")
	private final int[] anIntArray111 = new int[16];

	@OriginalMember(owner = "client!e", name = "N", descriptor = "[I")
	private final int[] anIntArray109 = new int[16];

	@OriginalMember(owner = "client!e", name = "gb", descriptor = "[I")
	private final int[] anIntArray114 = new int[16];

	@OriginalMember(owner = "client!e", name = "S", descriptor = "[I")
	private final int[] anIntArray110 = new int[16];

	@OriginalMember(owner = "client!e", name = "x", descriptor = "[I")
	private final int[] anIntArray104 = new int[16];

	@OriginalMember(owner = "client!e", name = "H", descriptor = "[I")
	public final int[] anIntArray107 = new int[16];

	@OriginalMember(owner = "client!e", name = "db", descriptor = "[I")
	private final int[] anIntArray113 = new int[16];

	@OriginalMember(owner = "client!e", name = "ib", descriptor = "[I")
	public final int[] anIntArray115 = new int[16];

	@OriginalMember(owner = "client!e", name = "qb", descriptor = "[I")
	private final int[] anIntArray116 = new int[16];

	@OriginalMember(owner = "client!e", name = "O", descriptor = "[[Lclient!po;")
	private final Class2_Sub29[][] aClass2_Sub29ArrayArray2 = new Class2_Sub29[16][128];

	@OriginalMember(owner = "client!e", name = "rb", descriptor = "I")
	private int anInt1248 = 256;

	@OriginalMember(owner = "client!e", name = "lb", descriptor = "[I")
	private final int[] lb = new int[16];

	@OriginalMember(owner = "client!e", name = "fb", descriptor = "I")
	private final int anInt1241 = 1000000;

	@OriginalMember(owner = "client!e", name = "B", descriptor = "[[Lclient!po;")
	private final Class2_Sub29[][] aClass2_Sub29ArrayArray1 = new Class2_Sub29[16][128];

	@OriginalMember(owner = "client!e", name = "yb", descriptor = "[I")
	private final int[] anIntArray117 = new int[16];

	@OriginalMember(owner = "client!e", name = "A", descriptor = "Lclient!dk;")
	private final Class54 aClass54_1 = new Class54();

	@OriginalMember(owner = "client!e", name = "Hb", descriptor = "Lclient!fn;")
	private final Class2_Sub11_Sub2 aClass2_Sub11_Sub2_1 = new Class2_Sub11_Sub2(this);

	@OriginalMember(owner = "client!e", name = "ob", descriptor = "Lclient!cm;")
	private final Class41 aClass41_8 = new Class41(128);

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "()V")
	public Class2_Sub11_Sub1() {
		this.method1420();
		this.method1412(true);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLclient!vf;ZZ)V")
	private synchronized void method1395(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class2_Sub42 arg1, @OriginalArg(3) boolean arg2) {
		this.method1421(arg0);
		this.aClass54_1.method1289(arg1.aByteArray90);
		this.aLong47 = 0L;
		this.aBoolean123 = arg2;
		@Pc(35) int local35 = this.aClass54_1.method1294();
		for (@Pc(37) int local37 = 0; local37 < local35; local37++) {
			this.aClass54_1.method1282(local37);
			this.aClass54_1.method1281(local37);
			this.aClass54_1.method1287(local37);
		}
		this.anInt1256 = this.aClass54_1.method1291();
		this.anInt1257 = this.aClass54_1.anIntArray96[this.anInt1256];
		this.aLong46 = this.aClass54_1.method1285(this.anInt1257);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([ILclient!po;ZII)Z")
	public boolean method1396(@OriginalArg(0) int[] arg0, @OriginalArg(1) Class2_Sub29 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		arg1.anInt5297 = Static36.anInt551 / 100;
		if (arg1.anInt5298 >= 0 && (arg1.aClass2_Sub11_Sub4_1 == null || arg1.aClass2_Sub11_Sub4_1.method4978())) {
			arg1.method4496();
			arg1.method5723();
			if (arg1.anInt5306 > 0 && arg1 == this.aClass2_Sub29ArrayArray1[arg1.anInt5308][arg1.anInt5306]) {
				this.aClass2_Sub29ArrayArray1[arg1.anInt5308][arg1.anInt5306] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg1.anInt5307;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray116[arg1.anInt5308] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg1.anInt5307 = local56;
		}
		arg1.aClass2_Sub11_Sub4_1.method4967(this.method1416(arg1));
		@Pc(96) Class186 local96 = arg1.aClass186_1;
		@Pc(98) boolean local98 = false;
		arg1.anInt5302++;
		arg1.anInt5301 += local96.anInt6037;
		@Pc(137) double local137 = (double) ((arg1.anInt5299 * arg1.anInt5307 >> 12) + (arg1.anInt5293 - 60 << 8)) * 5.086263020833333E-6D;
		if (local96.anInt6034 > 0) {
			if (local96.anInt6031 > 0) {
				arg1.anInt5305 += (int) (Math.pow(2.0D, local137 * (double) local96.anInt6031) * 128.0D + 0.5D);
			} else {
				arg1.anInt5305 += 128;
			}
			if (arg1.anInt5305 * local96.anInt6034 >= 819200) {
				local98 = true;
			}
		}
		if (local96.aByteArray85 != null) {
			if (local96.anInt6035 <= 0) {
				arg1.anInt5295 += 128;
			} else {
				arg1.anInt5295 += (int) (Math.pow(2.0D, local137 * (double) local96.anInt6035) * 128.0D + 0.5D);
			}
			while (local96.aByteArray85.length - 2 > arg1.anInt5303 && (local96.aByteArray85[arg1.anInt5303 + 2] & 0xFF) << 8 < arg1.anInt5295) {
				arg1.anInt5303 += 2;
			}
			if (local96.aByteArray85.length - 2 == arg1.anInt5303 && local96.aByteArray85[arg1.anInt5303 + 1] == 0) {
				local98 = true;
			}
		}
		if (arg1.anInt5298 >= 0 && local96.aByteArray84 != null && (this.anIntArray107[arg1.anInt5308] & 0x1) == 0 && (arg1.anInt5306 < 0 || this.aClass2_Sub29ArrayArray1[arg1.anInt5308][arg1.anInt5306] != arg1)) {
			if (local96.anInt6032 > 0) {
				arg1.anInt5298 += (int) (Math.pow(2.0D, local137 * (double) local96.anInt6032) * 128.0D + 0.5D);
			} else {
				arg1.anInt5298 += 128;
			}
			while (arg1.anInt5294 < local96.aByteArray84.length - 2 && (local96.aByteArray84[arg1.anInt5294 + 2] & 0xFF) << 8 < arg1.anInt5298) {
				arg1.anInt5294 += 2;
			}
			if (local96.aByteArray84.length - 2 == arg1.anInt5294) {
				local98 = true;
			}
		}
		if (!local98) {
			arg1.aClass2_Sub11_Sub4_1.method4963(arg1.anInt5297, this.method1427(arg1), this.method1401(arg1));
			return false;
		}
		arg1.aClass2_Sub11_Sub4_1.method4962(arg1.anInt5297);
		if (arg0 == null) {
			arg1.aClass2_Sub11_Sub4_1.method4946(arg2);
		} else {
			arg1.aClass2_Sub11_Sub4_1.method4945(arg0, arg3, arg2);
		}
		if (arg1.aClass2_Sub11_Sub4_1.method4988()) {
			this.aClass2_Sub11_Sub2_1.aClass2_Sub11_Sub3_2.method4108(arg1.aClass2_Sub11_Sub4_1);
		}
		arg1.method4496();
		if (arg1.anInt5298 >= 0) {
			arg1.method5723();
			if (arg1.anInt5306 > 0 && arg1 == this.aClass2_Sub29ArrayArray1[arg1.anInt5308][arg1.anInt5306]) {
				this.aClass2_Sub29ArrayArray1[arg1.anInt5308][arg1.anInt5306] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IBI)V")
	public synchronized void method1397() {
		this.method1405();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(II)V")
	private void method1398(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class2_Sub29 local16 = (Class2_Sub29) this.aClass2_Sub11_Sub2_1.aClass180_13.method4919(); local16 != null; local16 = (Class2_Sub29) this.aClass2_Sub11_Sub2_1.aClass180_13.method4916()) {
			if (arg0 < 0 || local16.anInt5308 == arg0) {
				if (local16.aClass2_Sub11_Sub4_1 != null) {
					local16.aClass2_Sub11_Sub4_1.method4962(Static36.anInt551 / 100);
					if (local16.aClass2_Sub11_Sub4_1.method4988()) {
						this.aClass2_Sub11_Sub2_1.aClass2_Sub11_Sub3_2.method4108(local16.aClass2_Sub11_Sub4_1);
					}
					local16.method4496();
				}
				if (local16.anInt5298 < 0) {
					this.aClass2_Sub29ArrayArray2[local16.anInt5308][local16.anInt5293] = null;
				}
				local16.method5723();
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
	private void method1399() {
		@Pc(8) int local8 = this.anInt1256;
		@Pc(11) int local11 = this.anInt1257;
		@Pc(14) long local14 = this.aLong46;
		if (this.aClass2_Sub42_1 != null && local11 == this.anInt1260) {
			this.method1395(this.aBoolean124, this.aClass2_Sub42_1, this.aBoolean123);
			this.method1399();
			return;
		}
		while (this.anInt1257 == local11) {
			while (local11 == this.aClass54_1.anIntArray96[local8]) {
				this.aClass54_1.method1282(local8);
				@Pc(47) int local47 = this.aClass54_1.method1286(local8);
				if (local47 == 1) {
					this.aClass54_1.method1288();
					this.aClass54_1.method1287(local8);
					if (this.aClass54_1.method1293()) {
						if (this.aClass2_Sub42_1 != null) {
							this.method1428(this.aBoolean123, this.aClass2_Sub42_1);
							this.method1399();
							return;
						}
						if (!this.aBoolean123 || local11 == 0) {
							this.method1412(true);
							this.aClass54_1.method1283();
							return;
						}
						this.aClass54_1.method1290(local14);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method1426(local47);
				}
				this.aClass54_1.method1281(local8);
				this.aClass54_1.method1287(local8);
			}
			local8 = this.aClass54_1.method1291();
			local11 = this.aClass54_1.anIntArray96[local8];
			local14 = this.aClass54_1.method1285(local11);
		}
		this.aLong46 = local14;
		this.anInt1257 = local11;
		this.anInt1256 = local8;
		if (this.aClass2_Sub42_1 != null && this.anInt1260 < local11) {
			this.anInt1257 = this.anInt1260;
			this.anInt1256 = -1;
			this.aLong46 = this.aClass54_1.method1285(this.anInt1257);
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(II)V")
	private void method1400(@OriginalArg(0) int arg0) {
		for (@Pc(17) Class2_Sub29 local17 = (Class2_Sub29) this.aClass2_Sub11_Sub2_1.aClass180_13.method4919(); local17 != null; local17 = (Class2_Sub29) this.aClass2_Sub11_Sub2_1.aClass180_13.method4916()) {
			if ((arg0 < 0 || local17.anInt5308 == arg0) && local17.anInt5298 < 0) {
				this.aClass2_Sub29ArrayArray2[local17.anInt5308][local17.anInt5293] = null;
				local17.anInt5298 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BLclient!po;)I")
	private int method1401(@OriginalArg(1) Class2_Sub29 arg0) {
		@Pc(9) int local9 = this.anIntArray112[arg0.anInt5308];
		return local9 < 8192 ? arg0.anInt5304 * local9 + 32 >> 6 : 16384 - ((16384 - local9) * (-arg0.anInt5304 + 128) + 32 >> 6);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BII)V")
	private void method1402(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()I")
	@Override
	public synchronized int method4944() {
		return 0;
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()Lclient!wf;")
	@Override
	public synchronized Class2_Sub11 method4947() {
		return null;
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V")
	public synchronized void method1403() {
		for (@Pc(5) Class2_Sub28 local5 = (Class2_Sub28) this.aClass41_8.method896(); local5 != null; local5 = (Class2_Sub28) this.aClass41_8.method904()) {
			local5.method5723();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZLclient!po;)Z")
	public boolean method1404(@OriginalArg(1) Class2_Sub29 arg0) {
		if (arg0.aClass2_Sub11_Sub4_1 != null) {
			return false;
		}
		if (arg0.anInt5298 >= 0) {
			arg0.method5723();
			if (arg0.anInt5306 > 0 && this.aClass2_Sub29ArrayArray1[arg0.anInt5308][arg0.anInt5306] == arg0) {
				this.aClass2_Sub29ArrayArray1[arg0.anInt5308][arg0.anInt5306] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
	private void method1405() {
		this.anIntArray106[9] = 128;
		this.anIntArray104[9] = 128;
		this.method1419(9, 128);
	}

	@OriginalMember(owner = "client!e", name = "f", descriptor = "(I)I")
	public int method1407() {
		return this.anInt1248;
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
	@Override
	public synchronized void method4946(@OriginalArg(0) int arg0) {
		if (this.aClass54_1.method1295()) {
			@Pc(18) int local18 = this.anInt1241 * this.aClass54_1.anInt1095 / Static36.anInt551;
			do {
				@Pc(27) long local27 = (long) arg0 * (long) local18 + this.aLong47;
				if (this.aLong46 - local27 >= 0L) {
					this.aLong47 = local27;
					break;
				}
				@Pc(56) int local56 = (int) (((long) local18 + this.aLong46 - this.aLong47 - 1L) / (long) local18);
				this.aLong47 += (long) local56 * (long) local18;
				this.aClass2_Sub11_Sub2_1.method4946(local56);
				arg0 -= local56;
				this.method1399();
			} while (this.aClass54_1.method1295());
		}
		this.aClass2_Sub11_Sub2_1.method4946(arg0);
	}

	@OriginalMember(owner = "client!e", name = "h", descriptor = "(I)V")
	public synchronized void method1409() {
		for (@Pc(11) Class2_Sub28 local11 = (Class2_Sub28) this.aClass41_8.method896(); local11 != null; local11 = (Class2_Sub28) this.aClass41_8.method904()) {
			local11.method4347();
		}
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "()Lclient!wf;")
	@Override
	public synchronized Class2_Sub11 method4948() {
		return this.aClass2_Sub11_Sub2_1;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!ga;IILclient!iq;Lclient!vf;)Z")
	public synchronized boolean method1410(@OriginalArg(0) Class76 arg0, @OriginalArg(3) Class104 arg1, @OriginalArg(4) Class2_Sub42 arg2) {
		arg2.method5557();
		@Pc(20) boolean local20 = true;
		@Pc(31) int[] local31 = new int[] { 22050 };
		for (@Pc(37) Class2_Sub26 local37 = (Class2_Sub26) arg2.aClass41_33.method896(); local37 != null; local37 = (Class2_Sub26) arg2.aClass41_33.method904()) {
			@Pc(43) int local43 = (int) local37.aLong219;
			@Pc(51) Class2_Sub28 local51 = (Class2_Sub28) this.aClass41_8.method902((long) local43);
			if (local51 == null) {
				local51 = Static279.method3540(arg1, local43);
				if (local51 == null) {
					local20 = false;
					continue;
				}
				this.aClass41_8.method901(local51, (long) local43);
			}
			if (!local51.method4345(arg0, local37.aByteArray51, local31)) {
				local20 = false;
			}
		}
		if (local20) {
			arg2.method5555();
		}
		return local20;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(B)V")
	public synchronized void method1411() {
		this.method1421(true);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(BZ)V")
	private void method1412(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method1398(-1);
		} else {
			this.method1400(-1);
		}
		this.method1414(-1);
		for (@Pc(31) int local31 = 0; local31 < 16; local31++) {
			this.anIntArray105[local31] = this.anIntArray106[local31];
		}
		for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
			this.anIntArray104[local47] = this.anIntArray106[local47] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IZI)V")
	private void method1413(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray110[arg1] = arg0;
		this.anIntArray108[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(II)V")
	private void method1414(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method1414(local9);
			}
			return;
		}
		this.anIntArray117[arg0] = 12800;
		this.anIntArray112[arg0] = 8192;
		this.lb[arg0] = 16383;
		this.anIntArray109[arg0] = 8192;
		this.anIntArray113[arg0] = 0;
		this.anIntArray116[arg0] = 8192;
		this.method1424(arg0);
		this.method1415(arg0);
		this.anIntArray107[arg0] = 0;
		this.anIntArray111[arg0] = 32767;
		this.anIntArray103[arg0] = 256;
		this.anIntArray115[arg0] = 0;
		this.method1413(8192, arg0);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZI)V")
	private void method1415(@OriginalArg(1) int arg0) {
		if ((this.anIntArray107[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class2_Sub29 local18 = (Class2_Sub29) this.aClass2_Sub11_Sub2_1.aClass180_13.method4919(); local18 != null; local18 = (Class2_Sub29) this.aClass2_Sub11_Sub2_1.aClass180_13.method4916()) {
			if (arg0 == local18.anInt5308) {
				local18.anInt5296 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(BLclient!po;)I")
	private int method1416(@OriginalArg(1) Class2_Sub29 arg0) {
		@Pc(14) int local14 = arg0.anInt5309 + (arg0.anInt5299 * arg0.anInt5307 >> 12);
		local14 += (this.anIntArray109[arg0.anInt5308] - 8192) * this.anIntArray103[arg0.anInt5308] >> 12;
		@Pc(35) Class186 local35 = arg0.aClass186_1;
		@Pc(58) int local58;
		if (local35.anInt6037 > 0 && (local35.anInt6036 > 0 || this.anIntArray113[arg0.anInt5308] > 0)) {
			local58 = local35.anInt6036 << 2;
			@Pc(63) int local63 = local35.anInt6033 << 1;
			if (arg0.anInt5302 < local63) {
				local58 = local58 * arg0.anInt5302 / local63;
			}
			local58 += this.anIntArray113[arg0.anInt5308] >> 7;
			@Pc(93) double local93 = Math.sin((double) (arg0.anInt5301 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local58 * local93);
		}
		local58 = (int) ((double) (arg0.aClass2_Sub5_Sub1_1.anInt300 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static36.anInt551 + 0.5D);
		return local58 >= 1 ? local58 : 1;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(III)V")
	private void method1417(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray109[arg1] = arg0;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ILclient!po;Z)V")
	public void method1418(@OriginalArg(1) Class2_Sub29 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(13) int local13 = arg0.aClass2_Sub5_Sub1_1.aByteArray4.length;
		@Pc(32) int local32;
		if (arg1 && arg0.aClass2_Sub5_Sub1_1.aBoolean23) {
			@Pc(43) int local43 = local13 + local13 - arg0.aClass2_Sub5_Sub1_1.anInt301;
			local32 = (int) ((long) this.anIntArray115[arg0.anInt5308] * (long) local43 >> 6);
			local13 <<= 0x8;
			if (local13 <= local32) {
				local32 = local13 + local13 - local32 - 1;
				arg0.aClass2_Sub11_Sub4_1.method4955();
			}
		} else {
			local32 = (int) ((long) this.anIntArray115[arg0.anInt5308] * (long) local13 >> 6);
		}
		arg0.aClass2_Sub11_Sub4_1.method4956(local32);
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(IBI)V")
	private void method1419(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray105[arg0] != arg1) {
			this.anIntArray105[arg0] = arg1;
			for (@Pc(27) int local27 = 0; local27 < 128; local27++) {
				this.aClass2_Sub29ArrayArray1[arg0][local27] = null;
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "(III)V")
	private synchronized void method1420() {
		for (@Pc(5) int local5 = 0; local5 < 16; local5++) {
			this.anIntArray114[local5] = 256;
		}
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(BZ)V")
	private synchronized void method1421(@OriginalArg(1) boolean arg0) {
		this.aClass54_1.method1283();
		this.aClass2_Sub42_1 = null;
		this.method1412(arg0);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIZ)V")
	private void method1422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.method1430(arg0, 64, arg1);
		if ((this.anIntArray107[arg0] & 0x2) != 0) {
			for (@Pc(25) Class2_Sub29 local25 = (Class2_Sub29) this.aClass2_Sub11_Sub2_1.aClass180_13.method4920(); local25 != null; local25 = (Class2_Sub29) this.aClass2_Sub11_Sub2_1.aClass180_13.method4921()) {
				if (arg0 == local25.anInt5308 && local25.anInt5298 < 0) {
					this.aClass2_Sub29ArrayArray2[arg0][local25.anInt5293] = null;
					this.aClass2_Sub29ArrayArray2[arg0][arg1] = local25;
					@Pc(61) int local61 = local25.anInt5309 + (local25.anInt5307 * local25.anInt5299 >> 12);
					local25.anInt5309 += arg1 - local25.anInt5293 << 8;
					local25.anInt5307 = 4096;
					local25.anInt5293 = arg1;
					local25.anInt5299 = local61 - local25.anInt5309;
					return;
				}
			}
		}
		@Pc(107) Class2_Sub28 local107 = (Class2_Sub28) this.aClass41_8.method902((long) this.anIntArray105[arg0]);
		if (local107 == null) {
			return;
		}
		@Pc(119) Class2_Sub5_Sub1 local119 = local107.aClass2_Sub5_Sub1Array1[arg1];
		if (local119 == null) {
			return;
		}
		@Pc(126) Class2_Sub29 local126 = new Class2_Sub29();
		local126.anInt5308 = arg0;
		local126.aClass2_Sub28_1 = local107;
		local126.aClass2_Sub5_Sub1_1 = local119;
		local126.aClass186_1 = local107.aClass186Array1[arg1];
		local126.anInt5306 = local107.aByteArray73[arg1];
		local126.anInt5293 = arg1;
		local126.anInt5292 = local107.anInt5131 * arg2 * arg2 * local107.aByteArray71[arg1] + 1024 >> 11;
		local126.anInt5304 = local107.aByteArray72[arg1] & 0xFF;
		local126.anInt5309 = (arg1 << 8) - (local107.aShortArray94[arg1] & 0x7FFF);
		local126.anInt5298 = -1;
		local126.anInt5295 = 0;
		local126.anInt5294 = 0;
		local126.anInt5303 = 0;
		local126.anInt5305 = 0;
		if (this.anIntArray115[arg0] == 0) {
			local126.aClass2_Sub11_Sub4_1 = Static377.method4985(local119, this.method1416(local126), this.method1427(local126), this.method1401(local126));
		} else {
			local126.aClass2_Sub11_Sub4_1 = Static377.method4985(local119, this.method1416(local126), 0, this.method1401(local126));
			this.method1418(local126, local107.aShortArray94[arg1] < 0);
		}
		if (local107.aShortArray94[arg1] < 0) {
			local126.aClass2_Sub11_Sub4_1.method4977(-1);
		}
		if (local126.anInt5306 >= 0) {
			@Pc(276) Class2_Sub29 local276 = this.aClass2_Sub29ArrayArray1[arg0][local126.anInt5306];
			if (local276 != null && local276.anInt5298 < 0) {
				this.aClass2_Sub29ArrayArray2[arg0][local276.anInt5293] = null;
				local276.anInt5298 = 0;
			}
			this.aClass2_Sub29ArrayArray1[arg0][local126.anInt5306] = local126;
		}
		this.aClass2_Sub11_Sub2_1.aClass180_13.method4909(local126);
		this.aClass2_Sub29ArrayArray2[arg0][arg1] = local126;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZI)V")
	private void method1423(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!e", name = "d", descriptor = "(II)V")
	private void method1424(@OriginalArg(0) int arg0) {
		if ((this.anIntArray107[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(18) Class2_Sub29 local18 = (Class2_Sub29) this.aClass2_Sub11_Sub2_1.aClass180_13.method4919(); local18 != null; local18 = (Class2_Sub29) this.aClass2_Sub11_Sub2_1.aClass180_13.method4916()) {
			if (arg0 == local18.anInt5308 && this.aClass2_Sub29ArrayArray2[arg0][local18.anInt5293] == null && local18.anInt5298 < 0) {
				local18.anInt5298 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)Z")
	public synchronized boolean method1425() {
		return this.aClass54_1.method1295();
	}

	@OriginalMember(owner = "client!e", name = "e", descriptor = "(II)V")
	private void method1426(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1430(local18, local30, local24);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 > 0) {
				this.method1422(local18, local24, local30);
			} else {
				this.method1430(local18, 64, local24);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method1423(local18, local30, local24);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray104[local18] = (local30 << 14) + (this.anIntArray104[local18] & 0xFFE03FFF);
			}
			if (local24 == 32) {
				this.anIntArray104[local18] = (this.anIntArray104[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 1) {
				this.anIntArray113[local18] = (local30 << 7) + (this.anIntArray113[local18] & 0xFFFFC07F);
			}
			if (local24 == 33) {
				this.anIntArray113[local18] = (this.anIntArray113[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray116[local18] = (local30 << 7) + (this.anIntArray116[local18] & 0xFFFFC07F);
			}
			if (local24 == 37) {
				this.anIntArray116[local18] = (this.anIntArray116[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray117[local18] = (local30 << 7) + (this.anIntArray117[local18] & 0xFFFFC07F);
			}
			if (local24 == 39) {
				this.anIntArray117[local18] = local30 + (this.anIntArray117[local18] & 0xFFFFFF80);
			}
			if (local24 == 10) {
				this.anIntArray112[local18] = (this.anIntArray112[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 42) {
				this.anIntArray112[local18] = (this.anIntArray112[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 11) {
				this.lb[local18] = (this.lb[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 43) {
				this.lb[local18] = (this.lb[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray107[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray107[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method1424(local18);
					this.anIntArray107[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray107[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray111[local18] = (local30 << 7) + (this.anIntArray111[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray111[local18] = local30 + (this.anIntArray111[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray111[local18] = (this.anIntArray111[local18] & 0x7F) + ((local30 << 7) + 16384);
			}
			if (local24 == 100) {
				this.anIntArray111[local18] = local30 + (this.anIntArray111[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method1398(local18);
			}
			if (local24 == 121) {
				this.method1414(local18);
			}
			if (local24 == 123) {
				this.method1400(local18);
			}
			@Pc(512) int local512;
			if (local24 == 6) {
				local512 = this.anIntArray111[local18];
				if (local512 == 16384) {
					this.anIntArray103[local18] = (this.anIntArray103[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local512 = this.anIntArray111[local18];
				if (local512 == 16384) {
					this.anIntArray103[local18] = local30 + (this.anIntArray103[local18] & 0xFFFFFF80);
				}
			}
			if (local24 == 16) {
				this.anIntArray115[local18] = (this.anIntArray115[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 48) {
				this.anIntArray115[local18] = (this.anIntArray115[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray107[local18] |= 0x4;
				} else {
					this.method1415(local18);
					this.anIntArray107[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method1413((local30 << 7) + (this.anIntArray110[local18] & 0xFFFFC07F), local18);
			}
			if (local24 == 49) {
				this.method1413((this.anIntArray110[local18] & 0xFFFFFF80) + local30, local18);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1419(local18, this.anIntArray104[local18] + local24);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method1402(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F7E) >> 8);
			this.method1417(local24, local18);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method1412(true);
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4945(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass54_1.method1295()) {
			@Pc(14) int local14 = this.anInt1241 * this.aClass54_1.anInt1095 / Static36.anInt551;
			do {
				@Pc(24) long local24 = this.aLong47 + (long) local14 * (long) arg2;
				if (this.aLong46 - local24 >= 0L) {
					this.aLong47 = local24;
					break;
				}
				@Pc(55) int local55 = (int) (((long) local14 + this.aLong46 - this.aLong47 - 1L) / (long) local14);
				this.aLong47 += (long) local55 * (long) local14;
				this.aClass2_Sub11_Sub2_1.method4945(arg0, arg1, local55);
				arg1 += local55;
				this.method1399();
				arg2 -= local55;
			} while (this.aClass54_1.method1295());
		}
		this.aClass2_Sub11_Sub2_1.method4945(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Lclient!po;I)I")
	private int method1427(@OriginalArg(0) Class2_Sub29 arg0) {
		if (this.anIntArray114[arg0.anInt5308] == 0) {
			return 0;
		}
		@Pc(14) Class186 local14 = arg0.aClass186_1;
		@Pc(30) int local30 = this.anIntArray117[arg0.anInt5308] * this.lb[arg0.anInt5308] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = arg0.anInt5292 * local38 + 16384 >> 15;
		@Pc(62) int local62 = this.anInt1248 * local47 + 128 >> 8;
		local30 = local62 * this.anIntArray114[arg0.anInt5308] + 128 >> 8;
		if (local14.anInt6034 > 0) {
			local30 = (int) (Math.pow(0.5D, (double) arg0.anInt5305 * 1.953125E-5D * (double) local14.anInt6034) * (double) local30 + 0.5D);
		}
		@Pc(101) int local101;
		@Pc(109) int local109;
		@Pc(127) int local127;
		@Pc(139) int local139;
		if (local14.aByteArray85 != null) {
			local101 = arg0.anInt5295;
			local109 = local14.aByteArray85[arg0.anInt5303 + 1];
			if (arg0.anInt5303 < local14.aByteArray85.length - 2) {
				local127 = (local14.aByteArray85[arg0.anInt5303] & 0xFF) << 8;
				local139 = (local14.aByteArray85[arg0.anInt5303 + 2] & 0xFF) << 8;
				local109 += (local14.aByteArray85[arg0.anInt5303 + 3] - local109) * (local101 + -local127) / (local139 - local127);
			}
			local30 = local109 * local30 + 32 >> 6;
		}
		if (arg0.anInt5298 > 0 && local14.aByteArray84 != null) {
			local101 = arg0.anInt5298;
			local109 = local14.aByteArray84[arg0.anInt5294 + 1];
			if (arg0.anInt5294 < local14.aByteArray84.length - 2) {
				local127 = (local14.aByteArray84[arg0.anInt5294] & 0xFF) << 8;
				local139 = (local14.aByteArray84[arg0.anInt5294 + 2] & 0xFF) << 8;
				local109 += (local14.aByteArray84[arg0.anInt5294 + 3] - local109) * (local101 + -local127) / (local139 - local127);
			}
			local30 = local30 * local109 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(ZILclient!vf;)V")
	public synchronized void method1428(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class2_Sub42 arg1) {
		this.method1395(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "(ZI)V")
	public synchronized void method1429(@OriginalArg(1) int arg0) {
		this.anInt1248 = arg0;
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)V")
	private void method1430(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(15) Class2_Sub29 local15 = this.aClass2_Sub29ArrayArray2[arg0][arg2];
		if (local15 == null) {
			return;
		}
		this.aClass2_Sub29ArrayArray2[arg0][arg2] = null;
		if ((this.anIntArray107[arg0] & 0x2) == 0) {
			local15.anInt5298 = 0;
			return;
		}
		for (@Pc(46) Class2_Sub29 local46 = (Class2_Sub29) this.aClass2_Sub11_Sub2_1.aClass180_13.method4919(); local46 != null; local46 = (Class2_Sub29) this.aClass2_Sub11_Sub2_1.aClass180_13.method4916()) {
			if (local46.anInt5308 == local15.anInt5308 && local46.anInt5298 < 0 && local15 != local46) {
				local15.anInt5298 = 0;
				return;
			}
		}
	}
}
