import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wfa")
public final class Class6_Sub19_Sub4 extends Class6_Sub19 {

	@OriginalMember(owner = "client!wfa", name = "Cb", descriptor = "I")
	private int anInt9454;

	@OriginalMember(owner = "client!wfa", name = "Db", descriptor = "J")
	private long aLong244;

	@OriginalMember(owner = "client!wfa", name = "Eb", descriptor = "Z")
	private boolean aBoolean661;

	@OriginalMember(owner = "client!wfa", name = "Gb", descriptor = "I")
	private int anInt9455;

	@OriginalMember(owner = "client!wfa", name = "Hb", descriptor = "J")
	private long aLong245;

	@OriginalMember(owner = "client!wfa", name = "Ib", descriptor = "I")
	private int anInt9456;

	@OriginalMember(owner = "client!wfa", name = "Jb", descriptor = "Z")
	private boolean aBoolean662;

	@OriginalMember(owner = "client!wfa", name = "Kb", descriptor = "Lclient!ts;")
	private Class6_Sub46 aClass6_Sub46_2;

	@OriginalMember(owner = "client!wfa", name = "n", descriptor = "[I")
	private final int[] anIntArray700 = new int[16];

	@OriginalMember(owner = "client!wfa", name = "u", descriptor = "[I")
	private final int[] anIntArray702 = new int[16];

	@OriginalMember(owner = "client!wfa", name = "q", descriptor = "[I")
	private final int[] anIntArray701 = new int[16];

	@OriginalMember(owner = "client!wfa", name = "I", descriptor = "[I")
	private final int[] anIntArray708 = new int[16];

	@OriginalMember(owner = "client!wfa", name = "M", descriptor = "[[Lclient!no;")
	private final Class6_Sub39[][] aClass6_Sub39ArrayArray2 = new Class6_Sub39[16][128];

	@OriginalMember(owner = "client!wfa", name = "U", descriptor = "I")
	private final int anInt9430 = 1000000;

	@OriginalMember(owner = "client!wfa", name = "G", descriptor = "[I")
	public final int[] anIntArray707 = new int[16];

	@OriginalMember(owner = "client!wfa", name = "O", descriptor = "I")
	private int anInt9425 = 256;

	@OriginalMember(owner = "client!wfa", name = "W", descriptor = "[I")
	private final int[] anIntArray711 = new int[16];

	@OriginalMember(owner = "client!wfa", name = "V", descriptor = "[I")
	private final int[] anIntArray710 = new int[16];

	@OriginalMember(owner = "client!wfa", name = "y", descriptor = "[I")
	public final int[] anIntArray704 = new int[16];

	@OriginalMember(owner = "client!wfa", name = "P", descriptor = "[I")
	public final int[] anIntArray709 = new int[16];

	@OriginalMember(owner = "client!wfa", name = "E", descriptor = "[I")
	private final int[] anIntArray706 = new int[16];

	@OriginalMember(owner = "client!wfa", name = "hb", descriptor = "[I")
	private final int[] anIntArray712 = new int[16];

	@OriginalMember(owner = "client!wfa", name = "K", descriptor = "[[Lclient!no;")
	private final Class6_Sub39[][] aClass6_Sub39ArrayArray1 = new Class6_Sub39[16][128];

	@OriginalMember(owner = "client!wfa", name = "rb", descriptor = "[I")
	private final int[] anIntArray714 = new int[16];

	@OriginalMember(owner = "client!wfa", name = "nb", descriptor = "[I")
	private final int[] anIntArray713 = new int[16];

	@OriginalMember(owner = "client!wfa", name = "C", descriptor = "[I")
	private final int[] anIntArray705 = new int[16];

	@OriginalMember(owner = "client!wfa", name = "ub", descriptor = "[I")
	private final int[] anIntArray715 = new int[16];

	@OriginalMember(owner = "client!wfa", name = "zb", descriptor = "[I")
	private final int[] anIntArray716 = new int[16];

	@OriginalMember(owner = "client!wfa", name = "xb", descriptor = "Lclient!rca;")
	private final Class271 aClass271_1 = new Class271();

	@OriginalMember(owner = "client!wfa", name = "Fb", descriptor = "Lclient!eq;")
	private final Class6_Sub19_Sub1 aClass6_Sub19_Sub1_1 = new Class6_Sub19_Sub1(this);

	@OriginalMember(owner = "client!wfa", name = "L", descriptor = "Lclient!nj;")
	private final Class212 aClass212_38 = new Class212(128);

	@OriginalMember(owner = "client!wfa", name = "<init>", descriptor = "()V")
	public Class6_Sub19_Sub4() {
		this.method7716();
		this.method7735(true);
	}

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "()Lclient!wi;")
	@Override
	public synchronized Class6_Sub19 method7700() {
		return this.aClass6_Sub19_Sub1_1;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7697(@OriginalArg(0) int arg0) {
		if (this.aClass271_1.method6288()) {
			@Pc(18) int local18 = this.aClass271_1.anInt7604 * this.anInt9430 / Static508.anInt8600;
			do {
				@Pc(27) long local27 = this.aLong244 + (long) arg0 * (long) local18;
				if (this.aLong245 - local27 >= 0L) {
					this.aLong244 = local27;
					break;
				}
				@Pc(58) int local58 = (int) ((this.aLong245 + (long) local18 - this.aLong244 - 1L) / (long) local18);
				this.aLong244 += (long) local58 * (long) local18;
				arg0 -= local58;
				this.aClass6_Sub19_Sub1_1.method7697(local58);
				this.method7717();
			} while (this.aClass271_1.method6288());
		}
		this.aClass6_Sub19_Sub1_1.method7697(arg0);
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(I)V")
	public synchronized void method7702() {
		this.method7704(true);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(BIII)V")
	private void method7703(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method7712(arg0, arg1, 64);
		if ((this.anIntArray704[arg1] & 0x2) != 0) {
			for (@Pc(32) Class6_Sub39 local32 = (Class6_Sub39) this.aClass6_Sub19_Sub1_1.aClass275_45.method6369(); local32 != null; local32 = (Class6_Sub39) this.aClass6_Sub19_Sub1_1.aClass275_45.method6363()) {
				if (local32.anInt6016 == arg1 && local32.anInt6003 < 0) {
					this.aClass6_Sub39ArrayArray2[arg1][local32.anInt6002] = null;
					this.aClass6_Sub39ArrayArray2[arg1][arg0] = local32;
					@Pc(71) int local71 = local32.anInt6021 + (local32.anInt6015 * local32.anInt6014 >> 12);
					local32.anInt6021 += arg0 - local32.anInt6002 << 8;
					local32.anInt6015 = 4096;
					local32.anInt6002 = arg0;
					local32.anInt6014 = local71 - local32.anInt6021;
					return;
				}
			}
		}
		@Pc(119) Class6_Sub23 local119 = (Class6_Sub23) this.aClass212_38.method5106((long) this.anIntArray710[arg1]);
		if (local119 == null) {
			return;
		}
		@Pc(127) Class6_Sub12_Sub1 local127 = local119.aClass6_Sub12_Sub1Array1[arg0];
		if (local127 == null) {
			return;
		}
		@Pc(134) Class6_Sub39 local134 = new Class6_Sub39();
		local134.aClass6_Sub23_1 = local119;
		local134.aClass6_Sub12_Sub1_4 = local127;
		local134.anInt6016 = arg1;
		local134.aClass333_1 = local119.aClass333Array1[arg0];
		local134.anInt6022 = local119.aByteArray46[arg0];
		local134.anInt6002 = arg0;
		local134.anInt6012 = local119.anInt3250 * arg2 * arg2 * local119.aByteArray44[arg0] + 1024 >> 11;
		local134.anInt6008 = local119.aByteArray45[arg0] & 0xFF;
		local134.anInt6021 = (arg0 << 8) - (local119.aShortArray60[arg0] & 0x7FFF);
		local134.anInt6005 = 0;
		local134.anInt6003 = -1;
		local134.anInt6010 = 0;
		local134.anInt6018 = 0;
		local134.anInt6020 = 0;
		if (this.anIntArray707[arg1] == 0) {
			local134.aClass6_Sub19_Sub2_4 = Static583.method2849(local127, this.method7706(local134), this.method7734(local134), this.method7718(local134));
		} else {
			local134.aClass6_Sub19_Sub2_4 = Static583.method2849(local127, this.method7706(local134), 0, this.method7718(local134));
			this.method7724(local134, local119.aShortArray60[arg0] < 0);
		}
		if (local119.aShortArray60[arg0] < 0) {
			local134.aClass6_Sub19_Sub2_4.method2845(-1);
		}
		if (local134.anInt6022 >= 0) {
			@Pc(287) Class6_Sub39 local287 = this.aClass6_Sub39ArrayArray1[arg1][local134.anInt6022];
			if (local287 != null && local287.anInt6003 < 0) {
				this.aClass6_Sub39ArrayArray2[arg1][local287.anInt6002] = null;
				local287.anInt6003 = 0;
			}
			this.aClass6_Sub39ArrayArray1[arg1][local134.anInt6022] = local134;
		}
		this.aClass6_Sub19_Sub1_1.aClass275_45.method6370(local134);
		this.aClass6_Sub39ArrayArray2[arg1][arg0] = local134;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZB)V")
	private synchronized void method7704(@OriginalArg(0) boolean arg0) {
		this.aClass271_1.method6293();
		this.aClass6_Sub46_2 = null;
		this.method7735(arg0);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IBI)V")
	private void method7705(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray715[arg1] = arg0;
		this.anIntArray709[arg1] = (int) (Math.pow(2.0D, (double) arg0 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(BLclient!no;)I")
	private int method7706(@OriginalArg(1) Class6_Sub39 arg0) {
		@Pc(15) int local15 = arg0.anInt6021 + (arg0.anInt6014 * arg0.anInt6015 >> 12);
		local15 += this.anIntArray700[arg0.anInt6016] * (this.anIntArray705[arg0.anInt6016] - 8192) >> 12;
		@Pc(36) Class333 local36 = arg0.aClass333_1;
		@Pc(61) int local61;
		if (local36.anInt9193 > 0 && (local36.anInt9203 > 0 || this.anIntArray702[arg0.anInt6016] > 0)) {
			local61 = local36.anInt9203 << 2;
			@Pc(66) int local66 = local36.anInt9188 << 1;
			if (local66 > arg0.anInt6019) {
				local61 = local61 * arg0.anInt6019 / local66;
			}
			local61 += this.anIntArray702[arg0.anInt6016] >> 7;
			@Pc(96) double local96 = Math.sin((double) (arg0.anInt6007 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) (local96 * (double) local61);
		}
		local61 = (int) ((double) (arg0.aClass6_Sub12_Sub1_4.anInt5511 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static508.anInt8600 + 0.5D);
		return local61 < 1 ? 1 : local61;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(B)I")
	public int method7707() {
		return this.anInt9425;
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method7698(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass271_1.method6288()) {
			@Pc(18) int local18 = this.aClass271_1.anInt7604 * this.anInt9430 / Static508.anInt8600;
			do {
				@Pc(28) long local28 = this.aLong244 + (long) local18 * (long) arg2;
				if (this.aLong245 - local28 >= 0L) {
					this.aLong244 = local28;
					break;
				}
				@Pc(57) int local57 = (int) (((long) local18 + this.aLong245 - this.aLong244 - 1L) / (long) local18);
				this.aLong244 += (long) local57 * (long) local18;
				this.aClass6_Sub19_Sub1_1.method7698(arg0, arg1, local57);
				arg1 += local57;
				arg2 -= local57;
				this.method7717();
			} while (this.aClass271_1.method6288());
		}
		this.aClass6_Sub19_Sub1_1.method7698(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "(B)Z")
	public synchronized boolean method7709() {
		return this.aClass271_1.method6288();
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IZII)V")
	private void method7710(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IBII)V")
	private void method7712(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(18) Class6_Sub39 local18 = this.aClass6_Sub39ArrayArray2[arg1][arg0];
		if (local18 == null) {
			return;
		}
		this.aClass6_Sub39ArrayArray2[arg1][arg0] = null;
		if ((this.anIntArray704[arg1] & 0x2) == 0) {
			local18.anInt6003 = 0;
			return;
		}
		for (@Pc(45) Class6_Sub39 local45 = (Class6_Sub39) this.aClass6_Sub19_Sub1_1.aClass275_45.method6366(); local45 != null; local45 = (Class6_Sub39) this.aClass6_Sub19_Sub1_1.aClass275_45.method6364()) {
			if (local45.anInt6016 == local18.anInt6016 && local45.anInt6003 < 0 && local18 != local45) {
				local18.anInt6003 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IB)V")
	private void method7713(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class6_Sub39 local16 = (Class6_Sub39) this.aClass6_Sub19_Sub1_1.aClass275_45.method6366(); local16 != null; local16 = (Class6_Sub39) this.aClass6_Sub19_Sub1_1.aClass275_45.method6364()) {
			if ((arg0 < 0 || local16.anInt6016 == arg0) && local16.anInt6003 < 0) {
				this.aClass6_Sub39ArrayArray2[local16.anInt6016][local16.anInt6002] = null;
				local16.anInt6003 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZI)V")
	private void method7714(@OriginalArg(1) int arg0) {
		if ((this.anIntArray704[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(15) Class6_Sub39 local15 = (Class6_Sub39) this.aClass6_Sub19_Sub1_1.aClass275_45.method6366(); local15 != null; local15 = (Class6_Sub39) this.aClass6_Sub19_Sub1_1.aClass275_45.method6364()) {
			if (arg0 == local15.anInt6016 && this.aClass6_Sub39ArrayArray2[arg0][local15.anInt6002] == null && local15.anInt6003 < 0) {
				local15.anInt6003 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Lclient!ts;Lclient!iu;IBLclient!pq;)Z")
	public synchronized boolean method7715(@OriginalArg(0) Class6_Sub46 arg0, @OriginalArg(1) Class152 arg1, @OriginalArg(4) Class251 arg2) {
		arg0.method6871();
		@Pc(14) boolean local14 = true;
		@Pc(28) int[] local28 = new int[] { 22050 };
		for (@Pc(34) Class6_Sub18 local34 = (Class6_Sub18) arg0.aClass212_34.method5099(); local34 != null; local34 = (Class6_Sub18) arg0.aClass212_34.method5103()) {
			@Pc(40) int local40 = (int) local34.aLong249;
			@Pc(48) Class6_Sub23 local48 = (Class6_Sub23) this.aClass212_38.method5106((long) local40);
			if (local48 == null) {
				local48 = Static305.method4680(arg2, local40);
				if (local48 == null) {
					local14 = false;
					continue;
				}
				this.aClass212_38.method5104((long) local40, local48);
			}
			if (!local48.method2763(local34.aByteArray34, arg1, local28)) {
				local14 = false;
			}
		}
		if (local14) {
			arg0.method6873();
		}
		return local14;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(BII)V")
	private synchronized void method7716() {
		for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
			this.anIntArray706[local12] = 256;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "()Lclient!wi;")
	@Override
	public synchronized Class6_Sub19 method7694() {
		return null;
	}

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "(B)V")
	private void method7717() {
		@Pc(8) int local8 = this.anInt9455;
		@Pc(17) int local17 = this.anInt9454;
		@Pc(20) long local20 = this.aLong245;
		if (this.aClass6_Sub46_2 != null && this.anInt9456 == local17) {
			this.method7720(this.aBoolean662, this.aBoolean661, this.aClass6_Sub46_2);
			this.method7717();
			return;
		}
		while (this.anInt9454 == local17) {
			while (this.aClass271_1.anIntArray599[local8] == local17) {
				this.aClass271_1.method6296(local8);
				@Pc(49) int local49 = this.aClass271_1.method6290(local8);
				if (local49 == 1) {
					this.aClass271_1.method6294();
					this.aClass271_1.method6292(local8);
					if (this.aClass271_1.method6287()) {
						if (this.aClass6_Sub46_2 != null) {
							this.method7728(this.aBoolean661, this.aClass6_Sub46_2);
							this.method7717();
							return;
						}
						if (!this.aBoolean661 || local17 == 0) {
							this.method7735(true);
							this.aClass271_1.method6293();
							return;
						}
						this.aClass271_1.method6284(local20);
					}
					break;
				}
				if ((local49 & 0x80) != 0) {
					this.method7730(local49);
				}
				this.aClass271_1.method6291(local8);
				this.aClass271_1.method6292(local8);
			}
			local8 = this.aClass271_1.method6297();
			local17 = this.aClass271_1.anIntArray599[local8];
			local20 = this.aClass271_1.method6289(local17);
		}
		this.aLong245 = local20;
		this.anInt9455 = local8;
		this.anInt9454 = local17;
		if (this.aClass6_Sub46_2 != null && this.anInt9456 < local17) {
			this.anInt9454 = this.anInt9456;
			this.anInt9455 = -1;
			this.aLong245 = this.aClass271_1.method6289(this.anInt9454);
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Lclient!no;Z)I")
	private int method7718(@OriginalArg(0) Class6_Sub39 arg0) {
		@Pc(17) int local17 = this.anIntArray711[arg0.anInt6016];
		return local17 >= 8192 ? 16384 - ((128 - arg0.anInt6008) * (-local17 + 16384) + 32 >> 6) : local17 * arg0.anInt6008 + 32 >> 6;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(II)V")
	private void method7719(@OriginalArg(0) int arg0) {
		for (@Pc(13) Class6_Sub39 local13 = (Class6_Sub39) this.aClass6_Sub19_Sub1_1.aClass275_45.method6366(); local13 != null; local13 = (Class6_Sub39) this.aClass6_Sub19_Sub1_1.aClass275_45.method6364()) {
			if (arg0 < 0 || local13.anInt6016 == arg0) {
				if (local13.aClass6_Sub19_Sub2_4 != null) {
					local13.aClass6_Sub19_Sub2_4.method2826(Static508.anInt8600 / 100);
					if (local13.aClass6_Sub19_Sub2_4.method2825()) {
						this.aClass6_Sub19_Sub1_1.aClass6_Sub19_Sub3_1.method6425(local13.aClass6_Sub19_Sub2_4);
					}
					local13.method5134();
				}
				if (local13.anInt6003 < 0) {
					this.aClass6_Sub39ArrayArray2[local13.anInt6016][local13.anInt6002] = null;
				}
				local13.method7849();
			}
		}
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZZLclient!ts;B)V")
	private synchronized void method7720(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class6_Sub46 arg2) {
		this.method7704(arg0);
		this.aClass271_1.method6295(arg2.aByteArray107);
		this.aBoolean661 = arg1;
		this.aLong244 = 0L;
		@Pc(31) int local31 = this.aClass271_1.method6285();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			this.aClass271_1.method6296(local33);
			this.aClass271_1.method6291(local33);
			this.aClass271_1.method6292(local33);
		}
		this.anInt9455 = this.aClass271_1.method6297();
		this.anInt9454 = this.aClass271_1.anIntArray599[this.anInt9455];
		this.aLong245 = this.aClass271_1.method6289(this.anInt9454);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IIB)V")
	private void method7721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(BLclient!no;)Z")
	public boolean method7722(@OriginalArg(1) Class6_Sub39 arg0) {
		if (arg0.aClass6_Sub19_Sub2_4 != null) {
			return false;
		}
		if (arg0.anInt6003 >= 0) {
			arg0.method7849();
			if (arg0.anInt6022 > 0 && arg0 == this.aClass6_Sub39ArrayArray1[arg0.anInt6016][arg0.anInt6022]) {
				this.aClass6_Sub39ArrayArray1[arg0.anInt6016][arg0.anInt6022] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Lclient!no;BZ)V")
	public void method7724(@OriginalArg(0) Class6_Sub39 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(14) int local14 = arg0.aClass6_Sub12_Sub1_4.aByteArray66.length;
		@Pc(33) int local33;
		if (arg1 && arg0.aClass6_Sub12_Sub1_4.aBoolean351) {
			@Pc(43) int local43 = local14 + local14 - arg0.aClass6_Sub12_Sub1_4.anInt5510;
			local14 <<= 0x8;
			local33 = (int) ((long) local43 * (long) this.anIntArray707[arg0.anInt6016] >> 6);
			if (local14 <= local33) {
				local33 = local14 + local14 - local33 - 1;
				arg0.aClass6_Sub19_Sub2_4.method2836();
			}
		} else {
			local33 = (int) ((long) this.anIntArray707[arg0.anInt6016] * (long) local14 >> 6);
		}
		arg0.aClass6_Sub19_Sub2_4.method2812(local33);
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(BI)V")
	private void method7725(@OriginalArg(1) int arg0) {
		if ((this.anIntArray704[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(22) Class6_Sub39 local22 = (Class6_Sub39) this.aClass6_Sub19_Sub1_1.aClass275_45.method6366(); local22 != null; local22 = (Class6_Sub39) this.aClass6_Sub19_Sub1_1.aClass275_45.method6364()) {
			if (local22.anInt6016 == arg0) {
				local22.anInt6006 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "()I")
	@Override
	public synchronized int method7695() {
		return 0;
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(III)V")
	private void method7726(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray705[arg1] = arg0;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ILclient!no;[III)Z")
	public boolean method7727(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub39 arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int arg3) {
		arg1.anInt6024 = Static508.anInt8600 / 100;
		if (arg1.anInt6003 >= 0 && (arg1.aClass6_Sub19_Sub2_4 == null || arg1.aClass6_Sub19_Sub2_4.method2810())) {
			arg1.method5134();
			arg1.method7849();
			if (arg1.anInt6022 > 0 && this.aClass6_Sub39ArrayArray1[arg1.anInt6016][arg1.anInt6022] == arg1) {
				this.aClass6_Sub39ArrayArray1[arg1.anInt6016][arg1.anInt6022] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg1.anInt6015;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray716[arg1.anInt6016] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg1.anInt6015 = local56;
		}
		arg1.aClass6_Sub19_Sub2_4.method2828(this.method7706(arg1));
		@Pc(99) Class333 local99 = arg1.aClass333_1;
		arg1.anInt6019++;
		@Pc(107) boolean local107 = false;
		arg1.anInt6007 += local99.anInt9193;
		@Pc(132) double local132 = (double) ((arg1.anInt6014 * arg1.anInt6015 >> 12) + (arg1.anInt6002 - 60 << 8)) * 5.086263020833333E-6D;
		if (local99.anInt9195 > 0) {
			if (local99.anInt9198 > 0) {
				arg1.anInt6020 += (int) (Math.pow(2.0D, (double) local99.anInt9198 * local132) * 128.0D + 0.5D);
			} else {
				arg1.anInt6020 += 128;
			}
			if (local99.anInt9195 * arg1.anInt6020 >= 819200) {
				local107 = true;
			}
		}
		if (local99.aByteArray120 != null) {
			if (local99.anInt9191 <= 0) {
				arg1.anInt6010 += 128;
			} else {
				arg1.anInt6010 += (int) (Math.pow(2.0D, local132 * (double) local99.anInt9191) * 128.0D + 0.5D);
			}
			while (local99.aByteArray120.length - 2 > arg1.anInt6018 && arg1.anInt6010 > (local99.aByteArray120[arg1.anInt6018 + 2] & 0xFF) << 8) {
				arg1.anInt6018 += 2;
			}
			if (arg1.anInt6018 == local99.aByteArray120.length - 2 && local99.aByteArray120[arg1.anInt6018 + 1] == 0) {
				local107 = true;
			}
		}
		if (arg1.anInt6003 >= 0 && local99.aByteArray121 != null && (this.anIntArray704[arg1.anInt6016] & 0x1) == 0 && (arg1.anInt6022 < 0 || this.aClass6_Sub39ArrayArray1[arg1.anInt6016][arg1.anInt6022] != arg1)) {
			if (local99.anInt9201 > 0) {
				arg1.anInt6003 += (int) (Math.pow(2.0D, local132 * (double) local99.anInt9201) * 128.0D + 0.5D);
			} else {
				arg1.anInt6003 += 128;
			}
			while (local99.aByteArray121.length - 2 > arg1.anInt6005 && arg1.anInt6003 > (local99.aByteArray121[arg1.anInt6005 + 2] & 0xFF) << 8) {
				arg1.anInt6005 += 2;
			}
			if (local99.aByteArray121.length - 2 == arg1.anInt6005) {
				local107 = true;
			}
		}
		if (!local107) {
			arg1.aClass6_Sub19_Sub2_4.method2837(arg1.anInt6024, this.method7734(arg1), this.method7718(arg1));
			return false;
		}
		arg1.aClass6_Sub19_Sub2_4.method2826(arg1.anInt6024);
		if (arg2 == null) {
			arg1.aClass6_Sub19_Sub2_4.method7697(arg0);
		} else {
			arg1.aClass6_Sub19_Sub2_4.method7698(arg2, arg3, arg0);
		}
		if (arg1.aClass6_Sub19_Sub2_4.method2825()) {
			this.aClass6_Sub19_Sub1_1.aClass6_Sub19_Sub3_1.method6425(arg1.aClass6_Sub19_Sub2_4);
		}
		arg1.method5134();
		if (arg1.anInt6003 >= 0) {
			arg1.method7849();
			if (arg1.anInt6022 > 0 && this.aClass6_Sub39ArrayArray1[arg1.anInt6016][arg1.anInt6022] == arg1) {
				this.aClass6_Sub39ArrayArray1[arg1.anInt6016][arg1.anInt6022] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(ZLclient!ts;B)V")
	public synchronized void method7728(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class6_Sub46 arg1) {
		this.method7720(true, arg0, arg1);
	}

	@OriginalMember(owner = "client!wfa", name = "f", descriptor = "(I)V")
	public synchronized void method7729() {
		for (@Pc(7) Class6_Sub23 local7 = (Class6_Sub23) this.aClass212_38.method5099(); local7 != null; local7 = (Class6_Sub23) this.aClass212_38.method5103()) {
			local7.method7849();
		}
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(II)V")
	private void method7730(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method7712(local22, local16, local28);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 > 0) {
				this.method7703(local22, local16, local28);
			} else {
				this.method7712(local22, local16, 64);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method7710(local22, local16, local28);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray713[local16] = (local28 << 14) + (this.anIntArray713[local16] & 0xFFE03FFF);
			}
			if (local22 == 32) {
				this.anIntArray713[local16] = (local28 << 7) + (this.anIntArray713[local16] & 0xFFFFC07F);
			}
			if (local22 == 1) {
				this.anIntArray702[local16] = (local28 << 7) + (this.anIntArray702[local16] & 0xFFFFC07F);
			}
			if (local22 == 33) {
				this.anIntArray702[local16] = local28 + (this.anIntArray702[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray716[local16] = (this.anIntArray716[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 37) {
				this.anIntArray716[local16] = (this.anIntArray716[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 7) {
				this.anIntArray701[local16] = (local28 << 7) + (this.anIntArray701[local16] & 0xFFFFC07F);
			}
			if (local22 == 39) {
				this.anIntArray701[local16] = local28 + (this.anIntArray701[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray711[local16] = (this.anIntArray711[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 42) {
				this.anIntArray711[local16] = (this.anIntArray711[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 11) {
				this.anIntArray708[local16] = (local28 << 7) + (this.anIntArray708[local16] & 0xFFFFC07F);
			}
			if (local22 == 43) {
				this.anIntArray708[local16] = (this.anIntArray708[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 64) {
				if (local28 < 64) {
					this.anIntArray704[local16] &= 0xFFFFFFFE;
				} else {
					this.anIntArray704[local16] |= 0x1;
				}
			}
			if (local22 == 65) {
				if (local28 >= 64) {
					this.anIntArray704[local16] |= 0x2;
				} else {
					this.method7714(local16);
					this.anIntArray704[local16] &= 0xFFFFFFFD;
				}
			}
			if (local22 == 99) {
				this.anIntArray712[local16] = (local28 << 7) + (this.anIntArray712[local16] & 0x7F);
			}
			if (local22 == 98) {
				this.anIntArray712[local16] = local28 + (this.anIntArray712[local16] & 0x3F80);
			}
			if (local22 == 101) {
				this.anIntArray712[local16] = (this.anIntArray712[local16] & 0x7F) + (local28 << 7) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray712[local16] = (this.anIntArray712[local16] & 0x3F80) + local28 + 16384;
			}
			if (local22 == 120) {
				this.method7719(local16);
			}
			if (local22 == 121) {
				this.method7738(local16);
			}
			if (local22 == 123) {
				this.method7713(local16);
			}
			@Pc(508) int local508;
			if (local22 == 6) {
				local508 = this.anIntArray712[local16];
				if (local508 == 16384) {
					this.anIntArray700[local16] = (this.anIntArray700[local16] & 0xFFFFC07F) + (local28 << 7);
				}
			}
			if (local22 == 38) {
				local508 = this.anIntArray712[local16];
				if (local508 == 16384) {
					this.anIntArray700[local16] = local28 + (this.anIntArray700[local16] & 0xFFFFFF80);
				}
			}
			if (local22 == 16) {
				this.anIntArray707[local16] = (local28 << 7) + (this.anIntArray707[local16] & 0xFFFFC07F);
			}
			if (local22 == 48) {
				this.anIntArray707[local16] = (this.anIntArray707[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 81) {
				if (local28 < 64) {
					this.method7725(local16);
					this.anIntArray704[local16] &= 0xFFFFFFFB;
				} else {
					this.anIntArray704[local16] |= 0x4;
				}
			}
			if (local22 == 17) {
				this.method7705((local28 << 7) + (this.anIntArray715[local16] & 0xFFFFC07F), local16);
			}
			if (local22 == 49) {
				this.method7705(local28 + (this.anIntArray715[local16] & 0xFFFFFF80), local16);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method7731(local16, this.anIntArray713[local16] + local22);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method7721(local16, local22);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F15) >> 8);
			this.method7726(local22, local16);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method7735(true);
			}
		}
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(BII)V")
	private void method7731(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 != this.anIntArray710[arg0]) {
			this.anIntArray710[arg0] = arg1;
			for (@Pc(26) int local26 = 0; local26 < 128; local26++) {
				this.aClass6_Sub39ArrayArray1[arg0][local26] = null;
			}
		}
	}

	@OriginalMember(owner = "client!wfa", name = "b", descriptor = "(IBI)V")
	private void method7732() {
		this.anIntArray714[9] = 128;
		this.anIntArray713[9] = 128;
		this.method7731(9, 128);
	}

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "(III)V")
	public synchronized void method7733() {
		this.method7732();
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(Lclient!no;I)I")
	private int method7734(@OriginalArg(0) Class6_Sub39 arg0) {
		if (this.anIntArray706[arg0.anInt6016] == 0) {
			return 0;
		}
		@Pc(14) Class333 local14 = arg0.aClass333_1;
		@Pc(30) int local30 = this.anIntArray701[arg0.anInt6016] * this.anIntArray708[arg0.anInt6016] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(52) int local52 = local38 * arg0.anInt6012 + 16384 >> 15;
		@Pc(61) int local61 = local52 * this.anInt9425 + 128 >> 8;
		local30 = local61 * this.anIntArray706[arg0.anInt6016] + 128 >> 8;
		if (local14.anInt9195 > 0) {
			local30 = (int) ((double) local30 * Math.pow(0.5D, (double) arg0.anInt6020 * 1.953125E-5D * (double) local14.anInt9195) + 0.5D);
		}
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(133) int local133;
		@Pc(145) int local145;
		if (local14.aByteArray120 != null) {
			local103 = arg0.anInt6010;
			local111 = local14.aByteArray120[arg0.anInt6018 + 1];
			if (arg0.anInt6018 < local14.aByteArray120.length - 2) {
				local133 = (local14.aByteArray120[arg0.anInt6018] & 0xFF) << 8;
				local145 = (local14.aByteArray120[arg0.anInt6018 + 2] & 0xFF) << 8;
				local111 += (local14.aByteArray120[arg0.anInt6018 + 3] - local111) * (local103 + -local133) / (local145 - local133);
			}
			local30 = local30 * local111 + 32 >> 6;
		}
		if (arg0.anInt6003 > 0 && local14.aByteArray121 != null) {
			local103 = arg0.anInt6003;
			local111 = local14.aByteArray121[arg0.anInt6005 + 1];
			if (arg0.anInt6005 < local14.aByteArray121.length - 2) {
				local133 = (local14.aByteArray121[arg0.anInt6005] & 0xFF) << 8;
				local145 = (local14.aByteArray121[arg0.anInt6005 + 2] & 0xFF) << 8;
				local111 += (local103 - local133) * (-local111 + local14.aByteArray121[arg0.anInt6005 + 3]) / (local145 - local133);
			}
			local30 = local111 * local30 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!wfa", name = "a", descriptor = "(IZ)V")
	private void method7735(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method7719(-1);
		} else {
			this.method7713(-1);
		}
		this.method7738(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray710[local23] = this.anIntArray714[local23];
		}
		for (@Pc(39) int local39 = 0; local39 < 16; local39++) {
			this.anIntArray713[local39] = this.anIntArray714[local39] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!wfa", name = "h", descriptor = "(I)V")
	public synchronized void method7737() {
		for (@Pc(9) Class6_Sub23 local9 = (Class6_Sub23) this.aClass212_38.method5099(); local9 != null; local9 = (Class6_Sub23) this.aClass212_38.method5103()) {
			local9.method2768();
		}
	}

	@OriginalMember(owner = "client!wfa", name = "c", descriptor = "(II)V")
	private void method7738(@OriginalArg(1) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method7738(local9);
			}
			return;
		}
		this.anIntArray701[arg0] = 12800;
		this.anIntArray711[arg0] = 8192;
		this.anIntArray708[arg0] = 16383;
		this.anIntArray705[arg0] = 8192;
		this.anIntArray702[arg0] = 0;
		this.anIntArray716[arg0] = 8192;
		this.method7714(arg0);
		this.method7725(arg0);
		this.anIntArray704[arg0] = 0;
		this.anIntArray712[arg0] = 32767;
		this.anIntArray700[arg0] = 256;
		this.anIntArray707[arg0] = 0;
		this.method7705(8192, arg0);
	}

	@OriginalMember(owner = "client!wfa", name = "d", descriptor = "(II)V")
	public synchronized void method7739(@OriginalArg(1) int arg0) {
		this.anInt9425 = arg0;
	}
}
