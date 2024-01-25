import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class1_Sub4_Sub4 extends Class1_Sub4 {

	@OriginalMember(owner = "client!wb", name = "Fb", descriptor = "Z")
	private boolean aBoolean692;

	@OriginalMember(owner = "client!wb", name = "Gb", descriptor = "I")
	private int anInt9279;

	@OriginalMember(owner = "client!wb", name = "Hb", descriptor = "I")
	private int anInt9280;

	@OriginalMember(owner = "client!wb", name = "Ib", descriptor = "J")
	private long aLong244;

	@OriginalMember(owner = "client!wb", name = "Jb", descriptor = "J")
	private long aLong245;

	@OriginalMember(owner = "client!wb", name = "Kb", descriptor = "Lclient!sda;")
	private Class1_Sub45 aClass1_Sub45_2;

	@OriginalMember(owner = "client!wb", name = "Lb", descriptor = "Z")
	private boolean aBoolean693;

	@OriginalMember(owner = "client!wb", name = "Nb", descriptor = "I")
	private int anInt9281;

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "[I")
	private final int[] anIntArray795 = new int[16];

	@OriginalMember(owner = "client!wb", name = "E", descriptor = "[I")
	private final int[] anIntArray801 = new int[16];

	@OriginalMember(owner = "client!wb", name = "M", descriptor = "[I")
	private final int[] anIntArray802 = new int[16];

	@OriginalMember(owner = "client!wb", name = "w", descriptor = "[I")
	private final int[] anIntArray798 = new int[16];

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "[I")
	public final int[] anIntArray799 = new int[16];

	@OriginalMember(owner = "client!wb", name = "u", descriptor = "[I")
	private final int[] anIntArray797 = new int[16];

	@OriginalMember(owner = "client!wb", name = "A", descriptor = "[I")
	public final int[] anIntArray800 = new int[16];

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "[I")
	private final int[] anIntArray796 = new int[16];

	@OriginalMember(owner = "client!wb", name = "hb", descriptor = "I")
	private int anInt9266 = 256;

	@OriginalMember(owner = "client!wb", name = "mb", descriptor = "[I")
	private final int[] anIntArray806 = new int[16];

	@OriginalMember(owner = "client!wb", name = "qb", descriptor = "[I")
	private final int[] anIntArray807 = new int[16];

	@OriginalMember(owner = "client!wb", name = "ub", descriptor = "I")
	private final int anInt9273 = 1000000;

	@OriginalMember(owner = "client!wb", name = "rb", descriptor = "[I")
	private final int[] anIntArray808 = new int[16];

	@OriginalMember(owner = "client!wb", name = "ob", descriptor = "[[Lclient!nl;")
	private final Class1_Sub40[][] aClass1_Sub40ArrayArray1 = new Class1_Sub40[16][128];

	@OriginalMember(owner = "client!wb", name = "kb", descriptor = "[I")
	private final int[] anIntArray805 = new int[16];

	@OriginalMember(owner = "client!wb", name = "bb", descriptor = "[I")
	private final int[] anIntArray803 = new int[16];

	@OriginalMember(owner = "client!wb", name = "zb", descriptor = "[I")
	private final int[] anIntArray810 = new int[16];

	@OriginalMember(owner = "client!wb", name = "cb", descriptor = "[I")
	private final int[] anIntArray804 = new int[16];

	@OriginalMember(owner = "client!wb", name = "yb", descriptor = "[I")
	public final int[] anIntArray809 = new int[16];

	@OriginalMember(owner = "client!wb", name = "Db", descriptor = "[[Lclient!nl;")
	private final Class1_Sub40[][] aClass1_Sub40ArrayArray2 = new Class1_Sub40[16][128];

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "Lclient!bm;")
	private final Class33 aClass33_1 = new Class33();

	@OriginalMember(owner = "client!wb", name = "Eb", descriptor = "Lclient!mn;")
	private final Class1_Sub4_Sub3 aClass1_Sub4_Sub3_1 = new Class1_Sub4_Sub3(this);

	@OriginalMember(owner = "client!wb", name = "Ab", descriptor = "Lclient!pt;")
	private final Class230 aClass230_48 = new Class230(128);

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub4() {
		this.method7988();
		this.method7992(true);
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(III)V")
	private synchronized void method7988() {
		for (@Pc(18) int local18 = 0; local18 < 16; local18++) {
			this.anIntArray795[local18] = 256;
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(III)V")
	private void method7989() {
		this.anIntArray805[9] = 128;
		this.anIntArray802[9] = 128;
		this.method8023(9, 128);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7981(@OriginalArg(0) int arg0) {
		if (this.aClass33_1.method1138()) {
			@Pc(18) int local18 = this.aClass33_1.anInt1123 * this.anInt9273 / Static411.anInt9206;
			do {
				@Pc(28) long local28 = this.aLong245 + (long) local18 * (long) arg0;
				if (this.aLong244 - local28 >= 0L) {
					this.aLong245 = local28;
					break;
				}
				@Pc(58) int local58 = (int) (((long) local18 + this.aLong244 - this.aLong245 - 1L) / (long) local18);
				this.aLong245 += (long) local18 * (long) local58;
				arg0 -= local58;
				this.aClass1_Sub4_Sub3_1.method7981(local58);
				this.method8010();
			} while (this.aClass33_1.method1138());
		}
		this.aClass1_Sub4_Sub3_1.method7981(arg0);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIIB)V")
	private void method7990(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II[IILclient!nl;)Z")
	public boolean method7991(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class1_Sub40 arg3) {
		arg3.anInt6144 = Static411.anInt9206 / 100;
		if (arg3.anInt6127 >= 0 && (arg3.aClass1_Sub4_Sub1_4 == null || arg3.aClass1_Sub4_Sub1_4.method1184())) {
			arg3.method5579();
			arg3.method8239();
			if (arg3.anInt6142 > 0 && this.aClass1_Sub40ArrayArray2[arg3.anInt6136][arg3.anInt6142] == arg3) {
				this.aClass1_Sub40ArrayArray2[arg3.anInt6136][arg3.anInt6142] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg3.anInt6132;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray808[arg3.anInt6136] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg3.anInt6132 = local56;
		}
		arg3.aClass1_Sub4_Sub1_4.method1209(this.method8015(arg3));
		@Pc(96) Class267 local96 = arg3.aClass267_1;
		arg3.anInt6135 += local96.anInt7836;
		@Pc(105) boolean local105 = false;
		arg3.anInt6141++;
		@Pc(130) double local130 = (double) ((arg3.anInt6143 - 60 << 8) + (arg3.anInt6132 * arg3.anInt6151 >> 12)) * 5.086263020833333E-6D;
		if (local96.anInt7839 > 0) {
			if (local96.anInt7838 <= 0) {
				arg3.anInt6137 += 128;
			} else {
				arg3.anInt6137 += (int) (Math.pow(2.0D, local130 * (double) local96.anInt7838) * 128.0D + 0.5D);
			}
			if (arg3.anInt6137 * local96.anInt7839 >= 819200) {
				local105 = true;
			}
		}
		if (local96.aByteArray107 != null) {
			if (local96.anInt7835 <= 0) {
				arg3.anInt6128 += 128;
			} else {
				arg3.anInt6128 += (int) (Math.pow(2.0D, (double) local96.anInt7835 * local130) * 128.0D + 0.5D);
			}
			while (local96.aByteArray107.length - 2 > arg3.anInt6145 && arg3.anInt6128 > (local96.aByteArray107[arg3.anInt6145 + 2] & 0xFF) << 8) {
				arg3.anInt6145 += 2;
			}
			if (arg3.anInt6145 == local96.aByteArray107.length - 2 && local96.aByteArray107[arg3.anInt6145 + 1] == 0) {
				local105 = true;
			}
		}
		if (arg3.anInt6127 >= 0 && local96.aByteArray108 != null && (this.anIntArray809[arg3.anInt6136] & 0x1) == 0 && (arg3.anInt6142 < 0 || this.aClass1_Sub40ArrayArray2[arg3.anInt6136][arg3.anInt6142] != arg3)) {
			if (local96.anInt7833 <= 0) {
				arg3.anInt6127 += 128;
			} else {
				arg3.anInt6127 += (int) (Math.pow(2.0D, (double) local96.anInt7833 * local130) * 128.0D + 0.5D);
			}
			while (arg3.anInt6129 < local96.aByteArray108.length - 2 && (local96.aByteArray108[arg3.anInt6129 + 2] & 0xFF) << 8 < arg3.anInt6127) {
				arg3.anInt6129 += 2;
			}
			if (arg3.anInt6129 == local96.aByteArray108.length - 2) {
				local105 = true;
			}
		}
		if (!local105) {
			arg3.aClass1_Sub4_Sub1_4.method1179(arg3.anInt6144, this.method8002(arg3), this.method8018(arg3));
			return false;
		}
		arg3.aClass1_Sub4_Sub1_4.method1191(arg3.anInt6144);
		if (arg1 == null) {
			arg3.aClass1_Sub4_Sub1_4.method7981(arg2);
		} else {
			arg3.aClass1_Sub4_Sub1_4.method7986(arg1, arg0, arg2);
		}
		if (arg3.aClass1_Sub4_Sub1_4.method1195()) {
			this.aClass1_Sub4_Sub3_1.aClass1_Sub4_Sub2_1.method3189(arg3.aClass1_Sub4_Sub1_4);
		}
		arg3.method5579();
		if (arg3.anInt6127 >= 0) {
			arg3.method8239();
			if (arg3.anInt6142 > 0 && arg3 == this.aClass1_Sub40ArrayArray2[arg3.anInt6136][arg3.anInt6142]) {
				this.aClass1_Sub40ArrayArray2[arg3.anInt6136][arg3.anInt6142] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "()I")
	@Override
	public synchronized int method7987() {
		return 0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZI)V")
	private void method7992(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method8007(-1);
		} else {
			this.method7998(-1);
		}
		this.method8008(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray810[local23] = this.anIntArray805[local23];
		}
		for (@Pc(39) int local39 = 0; local39 < 16; local39++) {
			this.anIntArray802[local39] = this.anIntArray805[local39] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BI)V")
	public synchronized void method7993(@OriginalArg(1) int arg0) {
		this.anInt9266 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	public synchronized void method7994() {
		for (@Pc(7) Class1_Sub47 local7 = (Class1_Sub47) this.aClass230_48.method6137(); local7 != null; local7 = (Class1_Sub47) this.aClass230_48.method6140()) {
			local7.method7058();
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)I")
	public int method7995() {
		return this.anInt9266;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!dn;Lclient!sda;Lclient!jca;II)Z")
	public synchronized boolean method7996(@OriginalArg(0) Class69 arg0, @OriginalArg(1) Class1_Sub45 arg1, @OriginalArg(2) Class148 arg2) {
		arg1.method6857();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(29) Class1_Sub1 local29 = (Class1_Sub1) arg1.aClass230_43.method6137(); local29 != null; local29 = (Class1_Sub1) arg1.aClass230_43.method6140()) {
			@Pc(35) int local35 = (int) local29.aLong251;
			@Pc(43) Class1_Sub47 local43 = (Class1_Sub47) this.aClass230_48.method6144((long) local35);
			if (local43 == null) {
				local43 = Static122.method2336(arg0, local35);
				if (local43 == null) {
					local9 = false;
					continue;
				}
				this.aClass230_48.method6139((long) local35, local43);
			}
			if (!local43.method7057(arg2, local23, local29.aByteArray2)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method6856();
		}
		return local9;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZBLclient!sda;)V")
	public synchronized void method7997(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class1_Sub45 arg1) {
		this.method8009(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(II)V")
	private void method7998(@OriginalArg(1) int arg0) {
		for (@Pc(12) Class1_Sub40 local12 = (Class1_Sub40) this.aClass1_Sub4_Sub3_1.aClass295_32.method7543(); local12 != null; local12 = (Class1_Sub40) this.aClass1_Sub4_Sub3_1.aClass295_32.method7540()) {
			if ((arg0 < 0 || arg0 == local12.anInt6136) && local12.anInt6127 < 0) {
				this.aClass1_Sub40ArrayArray1[local12.anInt6136][local12.anInt6143] = null;
				local12.anInt6127 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(II)V")
	private void method7999(@OriginalArg(1) int arg0) {
		if ((this.anIntArray809[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(18) Class1_Sub40 local18 = (Class1_Sub40) this.aClass1_Sub4_Sub3_1.aClass295_32.method7543(); local18 != null; local18 = (Class1_Sub40) this.aClass1_Sub4_Sub3_1.aClass295_32.method7540()) {
			if (local18.anInt6136 == arg0) {
				local18.anInt6130 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(B)V")
	public synchronized void method8001() {
		this.method8021(true);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ILclient!nl;)I")
	private int method8002(@OriginalArg(1) Class1_Sub40 arg0) {
		if (this.anIntArray795[arg0.anInt6136] == 0) {
			return 0;
		}
		@Pc(14) Class267 local14 = arg0.aClass267_1;
		@Pc(30) int local30 = this.anIntArray803[arg0.anInt6136] * this.anIntArray797[arg0.anInt6136] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = local38 * arg0.anInt6138 + 16384 >> 15;
		@Pc(56) int local56 = this.anInt9266 * local47 + 128 >> 8;
		local30 = this.anIntArray795[arg0.anInt6136] * local56 + 128 >> 8;
		if (local14.anInt7839 > 0) {
			local30 = (int) (Math.pow(0.5D, (double) local14.anInt7839 * (double) arg0.anInt6137 * 1.953125E-5D) * (double) local30 + 0.5D);
		}
		@Pc(95) int local95;
		@Pc(103) int local103;
		@Pc(121) int local121;
		@Pc(133) int local133;
		if (local14.aByteArray107 != null) {
			local95 = arg0.anInt6128;
			local103 = local14.aByteArray107[arg0.anInt6145 + 1];
			if (local14.aByteArray107.length - 2 > arg0.anInt6145) {
				local121 = (local14.aByteArray107[arg0.anInt6145] & 0xFF) << 8;
				local133 = (local14.aByteArray107[arg0.anInt6145 + 2] & 0xFF) << 8;
				local103 += (local95 - local121) * (local14.aByteArray107[arg0.anInt6145 + 3] - local103) / (local133 - local121);
			}
			local30 = local30 * local103 + 32 >> 6;
		}
		if (arg0.anInt6127 > 0 && local14.aByteArray108 != null) {
			local95 = arg0.anInt6127;
			local103 = local14.aByteArray108[arg0.anInt6129 + 1];
			if (arg0.anInt6129 < local14.aByteArray108.length - 2) {
				local121 = (local14.aByteArray108[arg0.anInt6129] & 0xFF) << 8;
				local133 = (local14.aByteArray108[arg0.anInt6129 + 2] & 0xFF) << 8;
				local103 += (local14.aByteArray108[arg0.anInt6129 + 3] - local103) * (-local121 + local95) / (local133 - local121);
			}
			local30 = local103 * local30 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIII)V")
	private void method8003(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class1_Sub40 local12 = this.aClass1_Sub40ArrayArray1[arg2][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass1_Sub40ArrayArray1[arg2][arg0] = null;
		if ((this.anIntArray809[arg2] & 0x2) == 0) {
			local12.anInt6127 = 0;
			return;
		}
		for (@Pc(36) Class1_Sub40 local36 = (Class1_Sub40) this.aClass1_Sub4_Sub3_1.aClass295_32.method7543(); local36 != null; local36 = (Class1_Sub40) this.aClass1_Sub4_Sub3_1.aClass295_32.method7540()) {
			if (local12.anInt6136 == local36.anInt6136 && local36.anInt6127 < 0 && local12 != local36) {
				local12.anInt6127 = 0;
				break;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BII)V")
	private void method8004(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray798[arg1] = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(B)V")
	public synchronized void method8005() {
		for (@Pc(17) Class1_Sub47 local17 = (Class1_Sub47) this.aClass230_48.method6137(); local17 != null; local17 = (Class1_Sub47) this.aClass230_48.method6140()) {
			local17.method8239();
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method7986(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass33_1.method1138()) {
			@Pc(14) int local14 = this.anInt9273 * this.aClass33_1.anInt1123 / Static411.anInt9206;
			do {
				@Pc(23) long local23 = this.aLong245 + (long) local14 * (long) arg2;
				if (this.aLong244 - local23 >= 0L) {
					this.aLong245 = local23;
					break;
				}
				@Pc(52) int local52 = (int) (((long) local14 + this.aLong244 - this.aLong245 - 1L) / (long) local14);
				this.aLong245 += (long) local14 * (long) local52;
				this.aClass1_Sub4_Sub3_1.method7986(arg0, arg1, local52);
				arg1 += local52;
				this.method8010();
				arg2 -= local52;
			} while (this.aClass33_1.method1138());
		}
		this.aClass1_Sub4_Sub3_1.method7986(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()Lclient!vv;")
	@Override
	public synchronized Class1_Sub4 method7983() {
		return this.aClass1_Sub4_Sub3_1;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(II)V")
	private void method8006(@OriginalArg(1) int arg0) {
		if ((this.anIntArray809[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(22) Class1_Sub40 local22 = (Class1_Sub40) this.aClass1_Sub4_Sub3_1.aClass295_32.method7543(); local22 != null; local22 = (Class1_Sub40) this.aClass1_Sub4_Sub3_1.aClass295_32.method7540()) {
			if (local22.anInt6136 == arg0 && this.aClass1_Sub40ArrayArray1[arg0][local22.anInt6143] == null && local22.anInt6127 < 0) {
				local22.anInt6127 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(II)V")
	private void method8007(@OriginalArg(0) int arg0) {
		for (@Pc(8) Class1_Sub40 local8 = (Class1_Sub40) this.aClass1_Sub4_Sub3_1.aClass295_32.method7543(); local8 != null; local8 = (Class1_Sub40) this.aClass1_Sub4_Sub3_1.aClass295_32.method7540()) {
			if (arg0 < 0 || local8.anInt6136 == arg0) {
				if (local8.aClass1_Sub4_Sub1_4 != null) {
					local8.aClass1_Sub4_Sub1_4.method1191(Static411.anInt9206 / 100);
					if (local8.aClass1_Sub4_Sub1_4.method1195()) {
						this.aClass1_Sub4_Sub3_1.aClass1_Sub4_Sub2_1.method3189(local8.aClass1_Sub4_Sub1_4);
					}
					local8.method5579();
				}
				if (local8.anInt6127 < 0) {
					this.aClass1_Sub40ArrayArray1[local8.anInt6136][local8.anInt6143] = null;
				}
				local8.method8239();
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(II)V")
	private void method8008(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method8008(local9);
			}
			return;
		}
		this.anIntArray797[arg0] = 12800;
		this.anIntArray801[arg0] = 8192;
		this.anIntArray803[arg0] = 16383;
		this.anIntArray798[arg0] = 8192;
		this.anIntArray796[arg0] = 0;
		this.anIntArray808[arg0] = 8192;
		this.method8006(arg0);
		this.method7999(arg0);
		this.anIntArray809[arg0] = 0;
		this.anIntArray804[arg0] = 32767;
		this.anIntArray807[arg0] = 256;
		this.anIntArray799[arg0] = 0;
		this.method8024(8192, arg0);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IZZLclient!sda;)V")
	private synchronized void method8009(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class1_Sub45 arg2) {
		this.method8021(arg0);
		this.aClass33_1.method1141(arg2.aByteArray104);
		this.aBoolean692 = arg1;
		this.aLong245 = 0;
		@Pc(25) int local25 = this.aClass33_1.method1133();
		for (@Pc(27) int local27 = 0; local27 < local25; local27++) {
			this.aClass33_1.method1137(local27);
			this.aClass33_1.method1143(local27);
			this.aClass33_1.method1146(local27);
		}
		this.anInt9280 = this.aClass33_1.method1142();
		this.anInt9279 = this.aClass33_1.anIntArray75[this.anInt9280];
		this.aLong244 = this.aClass33_1.method1136(this.anInt9279);
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
	private void method8010() {
		@Pc(8) int local8 = this.anInt9280;
		@Pc(11) int local11 = this.anInt9279;
		@Pc(14) long local14 = this.aLong244;
		if (this.aClass1_Sub45_2 != null && this.anInt9281 == local11) {
			this.method8009(this.aBoolean693, this.aBoolean692, this.aClass1_Sub45_2);
			this.method8010();
			return;
		}
		while (local11 == this.anInt9279) {
			while (this.aClass33_1.anIntArray75[local8] == local11) {
				this.aClass33_1.method1137(local8);
				@Pc(47) int local47 = this.aClass33_1.method1145(local8);
				if (local47 == 1) {
					this.aClass33_1.method1135();
					this.aClass33_1.method1146(local8);
					if (this.aClass33_1.method1139()) {
						if (this.aClass1_Sub45_2 != null) {
							this.method7997(this.aBoolean692, this.aClass1_Sub45_2);
							this.method8010();
							return;
						}
						if (!this.aBoolean692 || local11 == 0) {
							this.method7992(true);
							this.aClass33_1.method1144();
							return;
						}
						this.aClass33_1.method1147(local14);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method8017(local47);
				}
				this.aClass33_1.method1143(local8);
				this.aClass33_1.method1146(local8);
			}
			local8 = this.aClass33_1.method1142();
			local11 = this.aClass33_1.anIntArray75[local8];
			local14 = this.aClass33_1.method1136(local11);
		}
		this.aLong244 = local14;
		this.anInt9279 = local11;
		this.anInt9280 = local8;
		if (this.aClass1_Sub45_2 != null && local11 > this.anInt9281) {
			this.anInt9279 = this.anInt9281;
			this.anInt9280 = -1;
			this.aLong244 = this.aClass33_1.method1136(this.anInt9279);
		}
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(I)Z")
	public synchronized boolean method8011() {
		return this.aClass33_1.method1138();
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "()Lclient!vv;")
	@Override
	public synchronized Class1_Sub4 method7984() {
		return null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!nl;ZZ)V")
	public void method8012(@OriginalArg(0) Class1_Sub40 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(12) int local12 = arg0.aClass1_Sub30_Sub1_2.aByteArray77.length;
		@Pc(31) int local31;
		if (arg1 && arg0.aClass1_Sub30_Sub1_2.aBoolean452) {
			@Pc(42) int local42 = local12 + local12 - arg0.aClass1_Sub30_Sub1_2.anInt5921;
			local12 <<= 0x8;
			local31 = (int) ((long) local42 * (long) this.anIntArray799[arg0.anInt6136] >> 6);
			if (local12 <= local31) {
				local31 = local12 + local12 - local31 - 1;
				arg0.aClass1_Sub4_Sub1_4.method1206();
			}
		} else {
			local31 = (int) ((long) local12 * (long) this.anIntArray799[arg0.anInt6136] >> 6);
		}
		arg0.aClass1_Sub4_Sub1_4.method1215(local31);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIBI)V")
	private void method8013(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method8003(arg2, 64, arg0);
		if ((this.anIntArray809[arg0] & 0x2) != 0) {
			for (@Pc(28) Class1_Sub40 local28 = (Class1_Sub40) this.aClass1_Sub4_Sub3_1.aClass295_32.method7535(); local28 != null; local28 = (Class1_Sub40) this.aClass1_Sub4_Sub3_1.aClass295_32.method7544()) {
				if (arg0 == local28.anInt6136 && local28.anInt6127 < 0) {
					this.aClass1_Sub40ArrayArray1[arg0][local28.anInt6143] = null;
					this.aClass1_Sub40ArrayArray1[arg0][arg2] = local28;
					@Pc(64) int local64 = local28.anInt6134 + (local28.anInt6132 * local28.anInt6151 >> 12);
					local28.anInt6134 += arg2 - local28.anInt6143 << 8;
					local28.anInt6151 = local64 - local28.anInt6134;
					local28.anInt6132 = 4096;
					local28.anInt6143 = arg2;
					return;
				}
			}
		}
		@Pc(110) Class1_Sub47 local110 = (Class1_Sub47) this.aClass230_48.method6144((long) this.anIntArray810[arg0]);
		if (local110 == null) {
			return;
		}
		@Pc(118) Class1_Sub30_Sub1 local118 = local110.aClass1_Sub30_Sub1Array1[arg2];
		if (local118 == null) {
			return;
		}
		@Pc(125) Class1_Sub40 local125 = new Class1_Sub40();
		local125.anInt6136 = arg0;
		local125.aClass1_Sub30_Sub1_2 = local118;
		local125.aClass1_Sub47_1 = local110;
		local125.aClass267_1 = local110.aClass267Array1[arg2];
		local125.anInt6142 = local110.aByteArray111[arg2];
		local125.anInt6143 = arg2;
		local125.anInt6138 = local110.aByteArray110[arg2] * arg1 * arg1 * local110.anInt7993 + 1024 >> 11;
		local125.anInt6139 = local110.aByteArray112[arg2] & 0xFF;
		local125.anInt6134 = (arg2 << 8) - (local110.aShortArray140[arg2] & 0x7FFF);
		local125.anInt6137 = 0;
		local125.anInt6145 = 0;
		local125.anInt6127 = -1;
		local125.anInt6129 = 0;
		local125.anInt6128 = 0;
		if (this.anIntArray799[arg0] == 0) {
			local125.aClass1_Sub4_Sub1_4 = Static546.method1196(local118, this.method8015(local125), this.method8002(local125), this.method8018(local125));
		} else {
			local125.aClass1_Sub4_Sub1_4 = Static546.method1196(local118, this.method8015(local125), 0, this.method8018(local125));
			this.method8012(local125, local110.aShortArray140[arg2] < 0);
		}
		if (local110.aShortArray140[arg2] < 0) {
			local125.aClass1_Sub4_Sub1_4.method1201(-1);
		}
		if (local125.anInt6142 >= 0) {
			@Pc(284) Class1_Sub40 local284 = this.aClass1_Sub40ArrayArray2[arg0][local125.anInt6142];
			if (local284 != null && local284.anInt6127 < 0) {
				this.aClass1_Sub40ArrayArray1[arg0][local284.anInt6143] = null;
				local284.anInt6127 = 0;
			}
			this.aClass1_Sub40ArrayArray2[arg0][local125.anInt6142] = local125;
		}
		this.aClass1_Sub4_Sub3_1.aClass295_32.method7533(local125);
		this.aClass1_Sub40ArrayArray1[arg0][arg2] = local125;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "(III)V")
	private void method8014(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!nl;Z)I")
	private int method8015(@OriginalArg(0) Class1_Sub40 arg0) {
		@Pc(15) int local15 = arg0.anInt6134 + (arg0.anInt6132 * arg0.anInt6151 >> 12);
		local15 += this.anIntArray807[arg0.anInt6136] * (this.anIntArray798[arg0.anInt6136] - 8192) >> 12;
		@Pc(36) Class267 local36 = arg0.aClass267_1;
		@Pc(56) int local56;
		if (local36.anInt7836 > 0 && (local36.anInt7834 > 0 || this.anIntArray796[arg0.anInt6136] > 0)) {
			local56 = local36.anInt7834 << 2;
			@Pc(61) int local61 = local36.anInt7841 << 1;
			if (local61 > arg0.anInt6141) {
				local56 = arg0.anInt6141 * local56 / local61;
			}
			local56 += this.anIntArray796[arg0.anInt6136] >> 7;
			@Pc(91) double local91 = Math.sin((double) (arg0.anInt6135 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) (local91 * (double) local56);
		}
		local56 = (int) ((double) (arg0.aClass1_Sub30_Sub1_2.anInt5920 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static411.anInt9206 + 0.5D);
		return local56 < 1 ? 1 : local56;
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "(II)V")
	private void method8017(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method8003(local24, local30, local18);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 > 0) {
				this.method8013(local18, local30, local24);
			} else {
				this.method8003(local24, 64, local18);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method7990(local24, local18, local30);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray802[local18] = (this.anIntArray802[local18] & 0xFFE03FFF) + (local30 << 14);
			}
			if (local24 == 32) {
				this.anIntArray802[local18] = (this.anIntArray802[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 1) {
				this.anIntArray796[local18] = (this.anIntArray796[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 33) {
				this.anIntArray796[local18] = local30 + (this.anIntArray796[local18] & 0xFFFFFF80);
			}
			if (local24 == 5) {
				this.anIntArray808[local18] = (local30 << 7) + (this.anIntArray808[local18] & 0xFFFFC07F);
			}
			if (local24 == 37) {
				this.anIntArray808[local18] = (this.anIntArray808[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray797[local18] = (this.anIntArray797[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 39) {
				this.anIntArray797[local18] = local30 + (this.anIntArray797[local18] & 0xFFFFFF80);
			}
			if (local24 == 10) {
				this.anIntArray801[local18] = (this.anIntArray801[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 42) {
				this.anIntArray801[local18] = (this.anIntArray801[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 11) {
				this.anIntArray803[local18] = (local30 << 7) + (this.anIntArray803[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray803[local18] = (this.anIntArray803[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 < 64) {
					this.anIntArray809[local18] &= 0xFFFFFFFE;
				} else {
					this.anIntArray809[local18] |= 0x1;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method8006(local18);
					this.anIntArray809[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray809[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray804[local18] = (this.anIntArray804[local18] & 0x7F) + (local30 << 7);
			}
			if (local24 == 98) {
				this.anIntArray804[local18] = local30 + (this.anIntArray804[local18] & 0x3F80);
			}
			if (local24 == 101) {
				this.anIntArray804[local18] = (local30 << 7) + (this.anIntArray804[local18] & 0x7F) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray804[local18] = (this.anIntArray804[local18] & 0x3F80) + local30 + 16384;
			}
			if (local24 == 120) {
				this.method8007(local18);
			}
			if (local24 == 121) {
				this.method8008(local18);
			}
			if (local24 == 123) {
				this.method7998(local18);
			}
			@Pc(500) int local500;
			if (local24 == 6) {
				local500 = this.anIntArray804[local18];
				if (local500 == 16384) {
					this.anIntArray807[local18] = (this.anIntArray807[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local500 = this.anIntArray804[local18];
				if (local500 == 16384) {
					this.anIntArray807[local18] = local30 + (this.anIntArray807[local18] & 0xFFFFFF80);
				}
			}
			if (local24 == 16) {
				this.anIntArray799[local18] = (local30 << 7) + (this.anIntArray799[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray799[local18] = local30 + (this.anIntArray799[local18] & 0xFFFFFF80);
			}
			if (local24 == 81) {
				if (local30 < 64) {
					this.method7999(local18);
					this.anIntArray809[local18] &= 0xFFFFFFFB;
				} else {
					this.anIntArray809[local18] |= 0x4;
				}
			}
			if (local24 == 17) {
				this.method8024((local30 << 7) + (this.anIntArray806[local18] & 0xFFFFC07F), local18);
			}
			if (local24 == 49) {
				this.method8024(local30 + (this.anIntArray806[local18] & 0xFFFFFF80), local18);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method8023(local18, this.anIntArray802[local18] + local24);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method8014(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 9 & 0x3F80) + (arg0 >> 8 & 0x7F);
			this.method8004(local24, local18);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method7992(true);
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!nl;I)I")
	private int method8018(@OriginalArg(0) Class1_Sub40 arg0) {
		@Pc(14) int local14 = this.anIntArray801[arg0.anInt6136];
		return local14 < 8192 ? arg0.anInt6139 * local14 + 32 >> 6 : 16384 - ((128 - arg0.anInt6139) * (-local14 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!wb", name = "e", descriptor = "(III)V")
	public synchronized void method8020() {
		this.method7989();
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(ZI)V")
	private synchronized void method8021(@OriginalArg(0) boolean arg0) {
		this.aClass33_1.method1144();
		this.aClass1_Sub45_2 = null;
		this.method7992(arg0);
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(Lclient!nl;I)Z")
	public boolean method8022(@OriginalArg(0) Class1_Sub40 arg0) {
		if (arg0.aClass1_Sub4_Sub1_4 != null) {
			return false;
		}
		if (arg0.anInt6127 >= 0) {
			arg0.method8239();
			if (arg0.anInt6142 > 0 && this.aClass1_Sub40ArrayArray2[arg0.anInt6136][arg0.anInt6142] == arg0) {
				this.aClass1_Sub40ArrayArray2[arg0.anInt6136][arg0.anInt6142] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(BII)V")
	private void method8023(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray810[arg0] != arg1) {
			this.anIntArray810[arg0] = arg1;
			for (@Pc(22) int local22 = 0; local22 < 128; local22++) {
				this.aClass1_Sub40ArrayArray2[arg0][local22] = null;
			}
		}
	}

	@OriginalMember(owner = "client!wb", name = "f", descriptor = "(III)V")
	private void method8024(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray806[arg1] = arg0;
		this.anIntArray800[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * (double) 2097152 + 0.5D);
	}
}
