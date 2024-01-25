import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lp")
public final class Class6_Sub8_Sub4 extends Class6_Sub8 {

	@OriginalMember(owner = "client!lp", name = "zb", descriptor = "Z")
	private boolean aBoolean396;

	@OriginalMember(owner = "client!lp", name = "Ab", descriptor = "J")
	private long aLong172;

	@OriginalMember(owner = "client!lp", name = "Bb", descriptor = "J")
	private long aLong173;

	@OriginalMember(owner = "client!lp", name = "Cb", descriptor = "I")
	private int anInt5987;

	@OriginalMember(owner = "client!lp", name = "Eb", descriptor = "I")
	private int anInt5988;

	@OriginalMember(owner = "client!lp", name = "Fb", descriptor = "Lclient!tv;")
	private Class6_Sub53 aClass6_Sub53_1;

	@OriginalMember(owner = "client!lp", name = "Gb", descriptor = "I")
	private int anInt5989;

	@OriginalMember(owner = "client!lp", name = "Hb", descriptor = "Z")
	private boolean aBoolean397;

	@OriginalMember(owner = "client!lp", name = "q", descriptor = "[I")
	private final int[] anIntArray341 = new int[16];

	@OriginalMember(owner = "client!lp", name = "B", descriptor = "[I")
	private final int[] anIntArray343 = new int[16];

	@OriginalMember(owner = "client!lp", name = "v", descriptor = "[[Lclient!bf;")
	private final Class6_Sub5[][] aClass6_Sub5ArrayArray1 = new Class6_Sub5[16][128];

	@OriginalMember(owner = "client!lp", name = "t", descriptor = "[I")
	public final int[] anIntArray342 = new int[16];

	@OriginalMember(owner = "client!lp", name = "Y", descriptor = "[I")
	private final int[] anIntArray348 = new int[16];

	@OriginalMember(owner = "client!lp", name = "n", descriptor = "I")
	private int anInt5944 = 256;

	@OriginalMember(owner = "client!lp", name = "ab", descriptor = "[[Lclient!bf;")
	private final Class6_Sub5[][] aClass6_Sub5ArrayArray2 = new Class6_Sub5[16][128];

	@OriginalMember(owner = "client!lp", name = "R", descriptor = "[I")
	private final int[] anIntArray346 = new int[16];

	@OriginalMember(owner = "client!lp", name = "cb", descriptor = "[I")
	public final int[] anIntArray350 = new int[16];

	@OriginalMember(owner = "client!lp", name = "bb", descriptor = "I")
	private final int anInt5970 = 1000000;

	@OriginalMember(owner = "client!lp", name = "N", descriptor = "[I")
	private final int[] anIntArray345 = new int[16];

	@OriginalMember(owner = "client!lp", name = "Z", descriptor = "[I")
	private final int[] anIntArray349 = new int[16];

	@OriginalMember(owner = "client!lp", name = "db", descriptor = "[I")
	private final int[] anIntArray351 = new int[16];

	@OriginalMember(owner = "client!lp", name = "I", descriptor = "[I")
	private final int[] anIntArray344 = new int[16];

	@OriginalMember(owner = "client!lp", name = "eb", descriptor = "[I")
	private final int[] anIntArray352 = new int[16];

	@OriginalMember(owner = "client!lp", name = "fb", descriptor = "[I")
	private final int[] anIntArray353 = new int[16];

	@OriginalMember(owner = "client!lp", name = "ub", descriptor = "[I")
	private final int[] anIntArray355 = new int[16];

	@OriginalMember(owner = "client!lp", name = "S", descriptor = "[I")
	public final int[] anIntArray347 = new int[16];

	@OriginalMember(owner = "client!lp", name = "lb", descriptor = "[I")
	private final int[] lb = new int[16];

	@OriginalMember(owner = "client!lp", name = "ob", descriptor = "[I")
	private final int[] anIntArray354 = new int[16];

	@OriginalMember(owner = "client!lp", name = "H", descriptor = "Lclient!gu;")
	private final Class129 aClass129_1 = new Class129();

	@OriginalMember(owner = "client!lp", name = "Db", descriptor = "Lclient!bp;")
	private final Class6_Sub8_Sub1 aClass6_Sub8_Sub1_1 = new Class6_Sub8_Sub1(this);

	@OriginalMember(owner = "client!lp", name = "O", descriptor = "Lclient!lk;")
	private final Class209 aClass209_33;

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "()V")
	public Class6_Sub8_Sub4() {
		this.aClass209_33 = new Class209(128);
		this.method5068(256, -1);
		this.method5101(true);
	}

	@OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lclient!lp;)V")
	public Class6_Sub8_Sub4(@OriginalArg(0) Class6_Sub8_Sub4 arg0) {
		this.aClass209_33 = arg0.aClass209_33;
		this.method5068(256, -1);
		this.method5101(true);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BI)V")
	public synchronized void method5066(@OriginalArg(1) int arg0) {
		this.anInt5944 = arg0;
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)V")
	public synchronized void method5067() {
		for (@Pc(13) Class6_Sub10 local13 = (Class6_Sub10) this.aClass209_33.method5037(); local13 != null; local13 = (Class6_Sub10) this.aClass209_33.method5036()) {
			local13.method1194();
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IBI)V")
	public synchronized void method5068(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0) {
			for (@Pc(5) int local5 = 0; local5 < 16; local5++) {
				this.anIntArray341[local5] = arg0;
			}
		} else {
			this.anIntArray341[arg1] = arg0;
		}
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(IBI)V")
	private void method5069() {
		this.anIntArray355[9] = 128;
		this.anIntArray346[9] = 128;
		this.method5082(9, 128);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)V")
	private void method5070() {
		@Pc(8) int local8 = this.anInt5988;
		@Pc(11) int local11 = this.anInt5987;
		@Pc(14) long local14 = this.aLong172;
		if (this.aClass6_Sub53_1 != null && this.anInt5989 == local11) {
			this.method5072(this.aBoolean396, this.aBoolean397, this.aClass6_Sub53_1);
			this.method5070();
			return;
		}
		while (local11 == this.anInt5987) {
			while (local11 == this.aClass129_1.anIntArray188[local8]) {
				this.aClass129_1.method2905(local8);
				@Pc(47) int local47 = this.aClass129_1.method2895(local8);
				if (local47 == 1) {
					this.aClass129_1.method2900();
					this.aClass129_1.method2908(local8);
					if (this.aClass129_1.method2899()) {
						if (this.aClass6_Sub53_1 != null) {
							this.method5094(this.aBoolean396, this.aClass6_Sub53_1);
							this.method5070();
							return;
						}
						if (!this.aBoolean396 || local11 == 0) {
							this.method5101(true);
							this.aClass129_1.method2897();
							return;
						}
						this.aClass129_1.method2902(local14);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method5085(local47);
				}
				this.aClass129_1.method2910(local8);
				this.aClass129_1.method2908(local8);
			}
			local8 = this.aClass129_1.method2903();
			local11 = this.aClass129_1.anIntArray188[local8];
			local14 = this.aClass129_1.method2901(local11);
		}
		this.aLong172 = local14;
		this.anInt5988 = local8;
		this.anInt5987 = local11;
		if (this.aClass6_Sub53_1 != null && local11 > this.anInt5989) {
			this.anInt5988 = -1;
			this.anInt5987 = this.anInt5989;
			this.aLong172 = this.aClass129_1.method2901(this.anInt5987);
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)V")
	private void method5071(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(12) int local12 = 0; local12 < 16; local12++) {
				this.method5071(local12);
			}
			return;
		}
		this.anIntArray348[arg0] = 12800;
		this.anIntArray354[arg0] = 8192;
		this.anIntArray352[arg0] = 16383;
		this.anIntArray351[arg0] = 8192;
		this.lb[arg0] = 0;
		this.anIntArray343[arg0] = 8192;
		this.method5092(arg0);
		this.method5074(arg0);
		this.anIntArray347[arg0] = 0;
		this.anIntArray353[arg0] = 32767;
		this.anIntArray349[arg0] = 256;
		this.anIntArray342[arg0] = 0;
		this.method5091(arg0, 8192);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZZLclient!tv;)V")
	private synchronized void method5072(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class6_Sub53 arg2) {
		this.method5089(arg1);
		this.aClass129_1.method2904(arg2.aByteArray98);
		this.aBoolean396 = arg0;
		this.aLong173 = 0L;
		@Pc(24) int local24 = this.aClass129_1.method2906();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass129_1.method2905(local26);
			this.aClass129_1.method2910(local26);
			this.aClass129_1.method2908(local26);
		}
		this.anInt5988 = this.aClass129_1.method2903();
		this.anInt5987 = this.aClass129_1.anIntArray188[this.anInt5988];
		this.aLong172 = this.aClass129_1.method2901(this.anInt5987);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIII)V")
	private void method5073(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(12) Class6_Sub5 local12 = this.aClass6_Sub5ArrayArray1[arg1][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass6_Sub5ArrayArray1[arg1][arg0] = null;
		if ((this.anIntArray347[arg1] & 0x2) == 0) {
			local12.anInt911 = 0;
			return;
		}
		for (@Pc(37) Class6_Sub5 local37 = (Class6_Sub5) this.aClass6_Sub8_Sub1_1.aClass362_7.method8538(); local37 != null; local37 = (Class6_Sub5) this.aClass6_Sub8_Sub1_1.aClass362_7.method8530()) {
			if (local12.anInt917 == local37.anInt917 && local37.anInt911 < 0 && local37 != local12) {
				local12.anInt911 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IB)V")
	private void method5074(@OriginalArg(0) int arg0) {
		if ((this.anIntArray347[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(15) Class6_Sub5 local15 = (Class6_Sub5) this.aClass6_Sub8_Sub1_1.aClass362_7.method8538(); local15 != null; local15 = (Class6_Sub5) this.aClass6_Sub8_Sub1_1.aClass362_7.method8530()) {
			if (local15.anInt917 == arg0) {
				local15.anInt919 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(I)Z")
	public synchronized boolean method5075() {
		return this.aClass129_1.method2909();
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(III)V")
	private void method5076(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray351[arg1] = arg0;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BII)V")
	private void method5077(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BLclient!bf;)I")
	private int method5078(@OriginalArg(1) Class6_Sub5 arg0) {
		@Pc(15) int local15 = arg0.anInt921 + (arg0.anInt916 * arg0.anInt915 >> 12);
		local15 += (this.anIntArray351[arg0.anInt917] - 8192) * this.anIntArray349[arg0.anInt917] >> 12;
		@Pc(41) Class130 local41 = arg0.aClass130_1;
		@Pc(61) int local61;
		if (local41.anInt3460 > 0 && (local41.anInt3467 > 0 || this.lb[arg0.anInt917] > 0)) {
			local61 = local41.anInt3467 << 2;
			@Pc(66) int local66 = local41.anInt3461 << 1;
			if (arg0.anInt923 < local66) {
				local61 = local61 * arg0.anInt923 / local66;
			}
			local61 += this.lb[arg0.anInt917] >> 7;
			@Pc(96) double local96 = Math.sin((double) (arg0.anInt928 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) ((double) local61 * local96);
		}
		local61 = (int) ((double) (arg0.aClass6_Sub21_Sub1_1.anInt2712 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static328.anInt8868 + 0.5D);
		return local61 >= 1 ? local61 : 1;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(JI)V")
	private void method5079(@OriginalArg(0) long arg0) {
		while (this.aLong172 <= arg0) {
			@Pc(18) int local18 = this.anInt5988;
			@Pc(21) int local21 = this.anInt5987;
			@Pc(24) long local24 = this.aLong172;
			while (local21 == this.anInt5987) {
				while (this.aClass129_1.anIntArray188[local18] == local21) {
					this.aClass129_1.method2905(local18);
					@Pc(35) int local35 = this.aClass129_1.method2895(local18);
					if (local35 == 1) {
						this.aClass129_1.method2900();
						this.aClass129_1.method2908(local18);
						if (this.aClass129_1.method2899()) {
							if (!this.aBoolean396 || local21 == 0) {
								this.method5101(true);
								this.aClass129_1.method2897();
								return;
							}
							this.aClass129_1.method2902(local24);
						}
						break;
					}
					if ((local35 & 0x80) != 0 && (local35 & 0xF0) != 144) {
						this.method5085(local35);
					}
					this.aClass129_1.method2910(local18);
					this.aClass129_1.method2908(local18);
				}
				this.aLong173 = local24;
				local18 = this.aClass129_1.method2903();
				local21 = this.aClass129_1.anIntArray188[local18];
				local24 = this.aClass129_1.method2901(local21);
			}
			this.anInt5988 = local18;
			this.aLong172 = local24;
			this.anInt5987 = local21;
		}
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(II)V")
	private void method5080(@OriginalArg(0) int arg0) {
		for (@Pc(16) Class6_Sub5 local16 = (Class6_Sub5) this.aClass6_Sub8_Sub1_1.aClass362_7.method8538(); local16 != null; local16 = (Class6_Sub5) this.aClass6_Sub8_Sub1_1.aClass362_7.method8530()) {
			if ((arg0 < 0 || local16.anInt917 == arg0) && local16.anInt911 < 0) {
				this.aClass6_Sub5ArrayArray1[local16.anInt917][local16.anInt910] = null;
				local16.anInt911 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method9119(@OriginalArg(0) int arg0) {
		if (this.aClass129_1.method2909()) {
			@Pc(18) int local18 = this.aClass129_1.anInt3457 * this.anInt5970 / Static328.anInt8868;
			do {
				@Pc(27) long local27 = this.aLong173 + (long) arg0 * (long) local18;
				if (this.aLong172 - local27 >= 0L) {
					this.aLong173 = local27;
					break;
				}
				@Pc(58) int local58 = (int) (((long) local18 + this.aLong172 - this.aLong173 - 1L) / (long) local18);
				this.aLong173 += (long) local58 * (long) local18;
				arg0 -= local58;
				this.aClass6_Sub8_Sub1_1.method9119(local58);
				this.method5070();
			} while (this.aClass129_1.method2909());
		}
		this.aClass6_Sub8_Sub1_1.method9119(arg0);
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(II)V")
	private void method5081(@OriginalArg(0) int arg0) {
		for (@Pc(12) Class6_Sub5 local12 = (Class6_Sub5) this.aClass6_Sub8_Sub1_1.aClass362_7.method8538(); local12 != null; local12 = (Class6_Sub5) this.aClass6_Sub8_Sub1_1.aClass362_7.method8530()) {
			if (arg0 < 0 || arg0 == local12.anInt917) {
				if (local12.aClass6_Sub8_Sub5_1 != null) {
					local12.aClass6_Sub8_Sub5_1.method9145(Static328.anInt8868 / 100);
					if (local12.aClass6_Sub8_Sub5_1.method9134()) {
						this.aClass6_Sub8_Sub1_1.aClass6_Sub8_Sub3_1.method4256(local12.aClass6_Sub8_Sub5_1);
					}
					local12.method897();
				}
				if (local12.anInt911 < 0) {
					this.aClass6_Sub5ArrayArray1[local12.anInt917][local12.anInt910] = null;
				}
				local12.method9174();
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(III)V")
	private void method5082(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray345[arg0] != arg1) {
			this.anIntArray345[arg0] = arg1;
			for (@Pc(18) int local18 = 0; local18 < 128; local18++) {
				this.aClass6_Sub5ArrayArray2[arg0][local18] = null;
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "([IILclient!bf;II)Z")
	public boolean method5083(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class6_Sub5 arg2, @OriginalArg(4) int arg3) {
		arg2.anInt914 = Static328.anInt8868 / 100;
		if (arg2.anInt911 >= 0 && (arg2.aClass6_Sub8_Sub5_1 == null || arg2.aClass6_Sub8_Sub5_1.method9164())) {
			arg2.method897();
			arg2.method9174();
			if (arg2.anInt922 > 0 && this.aClass6_Sub5ArrayArray2[arg2.anInt917][arg2.anInt922] == arg2) {
				this.aClass6_Sub5ArrayArray2[arg2.anInt917][arg2.anInt922] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg2.anInt915;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray343[arg2.anInt917] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg2.anInt915 = local56;
		}
		arg2.aClass6_Sub8_Sub5_1.method9143(this.method5078(arg2));
		@Pc(96) Class130 local96 = arg2.aClass130_1;
		arg2.anInt928 += local96.anInt3460;
		arg2.anInt923++;
		@Pc(111) boolean local111 = false;
		@Pc(138) double local138 = (double) ((arg2.anInt910 - 60 << 8) + (arg2.anInt916 * arg2.anInt915 >> 12)) * 5.086263020833333E-6D;
		if (local96.anInt3462 > 0) {
			if (local96.anInt3465 > 0) {
				arg2.anInt920 += (int) (Math.pow(2.0D, local138 * (double) local96.anInt3465) * 128.0D + 0.5D);
			} else {
				arg2.anInt920 += 128;
			}
			if (local96.anInt3462 * arg2.anInt920 >= 819200) {
				local111 = true;
			}
		}
		if (local96.aByteArray38 != null) {
			if (local96.anInt3468 <= 0) {
				arg2.anInt926 += 128;
			} else {
				arg2.anInt926 += (int) (Math.pow(2.0D, (double) local96.anInt3468 * local138) * 128.0D + 0.5D);
			}
			while (local96.aByteArray38.length - 2 > arg2.anInt927 && arg2.anInt926 > (local96.aByteArray38[arg2.anInt927 + 2] & 0xFF) << 8) {
				arg2.anInt927 += 2;
			}
			if (arg2.anInt927 == local96.aByteArray38.length - 2 && local96.aByteArray38[arg2.anInt927 + 1] == 0) {
				local111 = true;
			}
		}
		if (arg2.anInt911 >= 0 && local96.aByteArray37 != null && (this.anIntArray347[arg2.anInt917] & 0x1) == 0 && (arg2.anInt922 < 0 || this.aClass6_Sub5ArrayArray2[arg2.anInt917][arg2.anInt922] != arg2)) {
			if (local96.anInt3463 <= 0) {
				arg2.anInt911 += 128;
			} else {
				arg2.anInt911 += (int) (Math.pow(2.0D, local138 * (double) local96.anInt3463) * 128.0D + 0.5D);
			}
			while (arg2.anInt913 < local96.aByteArray37.length - 2 && arg2.anInt911 > (local96.aByteArray37[arg2.anInt913 + 2] & 0xFF) << 8) {
				arg2.anInt913 += 2;
			}
			if (arg2.anInt913 == local96.aByteArray37.length - 2) {
				local111 = true;
			}
		}
		if (!local111) {
			arg2.aClass6_Sub8_Sub5_1.method9148(arg2.anInt914, this.method5088(arg2), this.method5100(arg2));
			return false;
		}
		arg2.aClass6_Sub8_Sub5_1.method9145(arg2.anInt914);
		if (arg0 == null) {
			arg2.aClass6_Sub8_Sub5_1.method9119(arg1);
		} else {
			arg2.aClass6_Sub8_Sub5_1.method9120(arg0, arg3, arg1);
		}
		if (arg2.aClass6_Sub8_Sub5_1.method9134()) {
			this.aClass6_Sub8_Sub1_1.aClass6_Sub8_Sub3_1.method4256(arg2.aClass6_Sub8_Sub5_1);
		}
		arg2.method897();
		if (arg2.anInt911 >= 0) {
			arg2.method9174();
			if (arg2.anInt922 > 0 && arg2 == this.aClass6_Sub5ArrayArray2[arg2.anInt917][arg2.anInt922]) {
				this.aClass6_Sub5ArrayArray2[arg2.anInt917][arg2.anInt922] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)I")
	public int method5084() {
		return this.anInt5944;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method9120(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass129_1.method2909()) {
			@Pc(18) int local18 = this.anInt5970 * this.aClass129_1.anInt3457 / Static328.anInt8868;
			do {
				@Pc(27) long local27 = (long) arg2 * (long) local18 + this.aLong173;
				if (this.aLong172 - local27 >= 0L) {
					this.aLong173 = local27;
					break;
				}
				@Pc(57) int local57 = (int) ((this.aLong172 + (long) local18 - this.aLong173 - 1L) / (long) local18);
				this.aLong173 += (long) local18 * (long) local57;
				this.aClass6_Sub8_Sub1_1.method9120(arg0, arg1, local57);
				arg1 += local57;
				arg2 -= local57;
				this.method5070();
			} while (this.aClass129_1.method2909());
		}
		this.aClass6_Sub8_Sub1_1.method9120(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(IB)V")
	private void method5085(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(18) int local18;
		@Pc(24) int local24;
		@Pc(30) int local30;
		if (local9 == 128) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method5073(local24, local18, local30);
		} else if (local9 == 144) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local30 > 0) {
				this.method5086(local24, local30, local18);
			} else {
				this.method5073(local24, local18, 64);
			}
		} else if (local9 == 160) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			this.method5095(local18, local24, local30);
		} else if (local9 == 176) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			local30 = arg0 >> 16 & 0x7F;
			if (local24 == 0) {
				this.anIntArray346[local18] = (local30 << 14) + (this.anIntArray346[local18] & 0xFFE03FFF);
			}
			if (local24 == 32) {
				this.anIntArray346[local18] = (local30 << 7) + (this.anIntArray346[local18] & 0xFFFFC07F);
			}
			if (local24 == 1) {
				this.lb[local18] = (local30 << 7) + (this.lb[local18] & 0xFFFFC07F);
			}
			if (local24 == 33) {
				this.lb[local18] = (this.lb[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 5) {
				this.anIntArray343[local18] = (this.anIntArray343[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 37) {
				this.anIntArray343[local18] = (this.anIntArray343[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 7) {
				this.anIntArray348[local18] = (this.anIntArray348[local18] & 0xFFFFC07F) + (local30 << 7);
			}
			if (local24 == 39) {
				this.anIntArray348[local18] = local30 + (this.anIntArray348[local18] & 0xFFFFFF80);
			}
			if (local24 == 10) {
				this.anIntArray354[local18] = (local30 << 7) + (this.anIntArray354[local18] & 0xFFFFC07F);
			}
			if (local24 == 42) {
				this.anIntArray354[local18] = (this.anIntArray354[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 11) {
				this.anIntArray352[local18] = (local30 << 7) + (this.anIntArray352[local18] & 0xFFFFC07F);
			}
			if (local24 == 43) {
				this.anIntArray352[local18] = (this.anIntArray352[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 64) {
				if (local30 >= 64) {
					this.anIntArray347[local18] |= 0x1;
				} else {
					this.anIntArray347[local18] &= 0xFFFFFFFE;
				}
			}
			if (local24 == 65) {
				if (local30 < 64) {
					this.method5092(local18);
					this.anIntArray347[local18] &= 0xFFFFFFFD;
				} else {
					this.anIntArray347[local18] |= 0x2;
				}
			}
			if (local24 == 99) {
				this.anIntArray353[local18] = (local30 << 7) + (this.anIntArray353[local18] & 0x7F);
			}
			if (local24 == 98) {
				this.anIntArray353[local18] = (this.anIntArray353[local18] & 0x3F80) + local30;
			}
			if (local24 == 101) {
				this.anIntArray353[local18] = (this.anIntArray353[local18] & 0x7F) + (local30 << 7) + 16384;
			}
			if (local24 == 100) {
				this.anIntArray353[local18] = local30 + (this.anIntArray353[local18] & 0x3F80) + 16384;
			}
			if (local24 == 120) {
				this.method5081(local18);
			}
			if (local24 == 121) {
				this.method5071(local18);
			}
			if (local24 == 123) {
				this.method5080(local18);
			}
			@Pc(500) int local500;
			if (local24 == 6) {
				local500 = this.anIntArray353[local18];
				if (local500 == 16384) {
					this.anIntArray349[local18] = (this.anIntArray349[local18] & 0xFFFFC07F) + (local30 << 7);
				}
			}
			if (local24 == 38) {
				local500 = this.anIntArray353[local18];
				if (local500 == 16384) {
					this.anIntArray349[local18] = (this.anIntArray349[local18] & 0xFFFFFF80) + local30;
				}
			}
			if (local24 == 16) {
				this.anIntArray342[local18] = (local30 << 7) + (this.anIntArray342[local18] & 0xFFFFC07F);
			}
			if (local24 == 48) {
				this.anIntArray342[local18] = (this.anIntArray342[local18] & 0xFFFFFF80) + local30;
			}
			if (local24 == 81) {
				if (local30 >= 64) {
					this.anIntArray347[local18] |= 0x4;
				} else {
					this.method5074(local18);
					this.anIntArray347[local18] &= 0xFFFFFFFB;
				}
			}
			if (local24 == 17) {
				this.method5091(local18, (this.anIntArray344[local18] & 0xFFFFC07F) + (local30 << 7));
			}
			if (local24 == 49) {
				this.method5091(local18, (this.anIntArray344[local18] & 0xFFFFFF80) + local30);
			}
		} else if (local9 == 192) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method5082(local18, local24 + this.anIntArray346[local18]);
		} else if (local9 == 208) {
			local18 = arg0 & 0xF;
			local24 = arg0 >> 8 & 0x7F;
			this.method5077(local24, local18);
		} else if (local9 == 224) {
			local18 = arg0 & 0xF;
			local24 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method5076(local24, local18);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method5101(true);
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(IIII)V")
	private void method5086(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method5073(arg0, arg2, 64);
		if ((this.anIntArray347[arg2] & 0x2) != 0) {
			for (@Pc(25) Class6_Sub5 local25 = (Class6_Sub5) this.aClass6_Sub8_Sub1_1.aClass362_7.method8542(); local25 != null; local25 = (Class6_Sub5) this.aClass6_Sub8_Sub1_1.aClass362_7.method8532()) {
				if (arg2 == local25.anInt917 && local25.anInt911 < 0) {
					this.aClass6_Sub5ArrayArray1[arg2][local25.anInt910] = null;
					this.aClass6_Sub5ArrayArray1[arg2][arg0] = local25;
					@Pc(65) int local65 = local25.anInt921 + (local25.anInt916 * local25.anInt915 >> 12);
					local25.anInt921 += arg0 - local25.anInt910 << 8;
					local25.anInt916 = local65 - local25.anInt921;
					local25.anInt915 = 4096;
					local25.anInt910 = arg0;
					return;
				}
			}
		}
		@Pc(119) Class6_Sub10 local119 = (Class6_Sub10) this.aClass209_33.method5038((long) this.anIntArray345[arg2]);
		if (local119 == null) {
			return;
		}
		@Pc(127) Class6_Sub21_Sub1 local127 = local119.aClass6_Sub21_Sub1Array1[arg0];
		if (local127 == null) {
			return;
		}
		@Pc(134) Class6_Sub5 local134 = new Class6_Sub5();
		local134.aClass6_Sub10_1 = local119;
		local134.aClass6_Sub21_Sub1_1 = local127;
		local134.anInt917 = arg2;
		local134.aClass130_1 = local119.aClass130Array1[arg0];
		local134.anInt922 = local119.aByteArray11[arg0];
		local134.anInt910 = arg0;
		local134.anInt925 = local119.anInt1275 * arg1 * arg1 * local119.aByteArray13[arg0] + 1024 >> 11;
		local134.anInt918 = local119.aByteArray12[arg0] & 0xFF;
		local134.anInt921 = (arg0 << 8) - (local119.aShortArray24[arg0] & 0x7FFF);
		local134.anInt927 = 0;
		local134.anInt911 = -1;
		local134.anInt913 = 0;
		local134.anInt926 = 0;
		local134.anInt920 = 0;
		if (this.anIntArray342[arg2] == 0) {
			local134.aClass6_Sub8_Sub5_1 = Static687.method9151(local127, this.method5078(local134), this.method5088(local134), this.method5100(local134));
		} else {
			local134.aClass6_Sub8_Sub5_1 = Static687.method9151(local127, this.method5078(local134), 0, this.method5100(local134));
			this.method5087(local134, local119.aShortArray24[arg0] < 0);
		}
		if (local119.aShortArray24[arg0] < 0) {
			local134.aClass6_Sub8_Sub5_1.method9131(-1);
		}
		if (local134.anInt922 >= 0) {
			@Pc(285) Class6_Sub5 local285 = this.aClass6_Sub5ArrayArray2[arg2][local134.anInt922];
			if (local285 != null && local285.anInt911 < 0) {
				this.aClass6_Sub5ArrayArray1[arg2][local285.anInt910] = null;
				local285.anInt911 = 0;
			}
			this.aClass6_Sub5ArrayArray2[arg2][local134.anInt922] = local134;
		}
		this.aClass6_Sub8_Sub1_1.aClass362_7.method8536(local134);
		this.aClass6_Sub5ArrayArray1[arg2][arg0] = local134;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZLclient!bf;Z)V")
	public void method5087(@OriginalArg(1) Class6_Sub5 arg0, @OriginalArg(2) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass6_Sub21_Sub1_1.aByteArray29.length;
		@Pc(40) int local40;
		if (arg1 && arg0.aClass6_Sub21_Sub1_1.aBoolean169) {
			@Pc(27) int local27 = local8 + local8 - arg0.aClass6_Sub21_Sub1_1.anInt2711;
			local40 = (int) ((long) local27 * (long) this.anIntArray342[arg0.anInt917] >> 6);
			local8 <<= 0x8;
			if (local8 <= local40) {
				local40 = local8 + local8 - local40 - 1;
				arg0.aClass6_Sub8_Sub5_1.method9128();
			}
		} else {
			local40 = (int) ((long) this.anIntArray342[arg0.anInt917] * (long) local8 >> 6);
		}
		arg0.aClass6_Sub8_Sub5_1.method9152(local40);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!bf;I)I")
	private int method5088(@OriginalArg(0) Class6_Sub5 arg0) {
		if (this.anIntArray341[arg0.anInt917] == 0) {
			return 0;
		}
		@Pc(14) Class130 local14 = arg0.aClass130_1;
		@Pc(30) int local30 = this.anIntArray352[arg0.anInt917] * this.anIntArray348[arg0.anInt917] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = arg0.anInt925 * local38 + 16384 >> 15;
		@Pc(56) int local56 = local47 * this.anInt5944 + 128 >> 8;
		local30 = local56 * this.anIntArray341[arg0.anInt917] + 128 >> 8;
		if (local14.anInt3462 > 0) {
			local30 = (int) (Math.pow(0.5D, (double) local14.anInt3462 * 1.953125E-5D * (double) arg0.anInt920) * (double) local30 + 0.5D);
		}
		@Pc(109) int local109;
		@Pc(117) int local117;
		@Pc(135) int local135;
		@Pc(147) int local147;
		if (local14.aByteArray38 != null) {
			local109 = arg0.anInt926;
			local117 = local14.aByteArray38[arg0.anInt927 + 1];
			if (arg0.anInt927 < local14.aByteArray38.length - 2) {
				local135 = (local14.aByteArray38[arg0.anInt927] & 0xFF) << 8;
				local147 = (local14.aByteArray38[arg0.anInt927 + 2] & 0xFF) << 8;
				local117 += (local14.aByteArray38[arg0.anInt927 + 3] - local117) * (local109 + -local135) / (local147 - local135);
			}
			local30 = local117 * local30 + 32 >> 6;
		}
		if (arg0.anInt911 > 0 && local14.aByteArray37 != null) {
			local109 = arg0.anInt911;
			local117 = local14.aByteArray37[arg0.anInt913 + 1];
			if (arg0.anInt913 < local14.aByteArray37.length - 2) {
				local135 = (local14.aByteArray37[arg0.anInt913] & 0xFF) << 8;
				local147 = (local14.aByteArray37[arg0.anInt913 + 2] & 0xFF) << 8;
				local117 += (local109 - local135) * (local14.aByteArray37[arg0.anInt913 - -3] - local117) / (local147 - local135);
			}
			local30 = local117 * local30 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZB)V")
	private synchronized void method5089(@OriginalArg(0) boolean arg0) {
		this.aClass129_1.method2897();
		this.aClass6_Sub53_1 = null;
		this.method5101(arg0);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!bf;B)Z")
	public boolean method5090(@OriginalArg(0) Class6_Sub5 arg0) {
		if (arg0.aClass6_Sub8_Sub5_1 != null) {
			return false;
		}
		if (arg0.anInt911 >= 0) {
			arg0.method9174();
			if (arg0.anInt922 > 0 && arg0 == this.aClass6_Sub5ArrayArray2[arg0.anInt917][arg0.anInt922]) {
				this.aClass6_Sub5ArrayArray2[arg0.anInt917][arg0.anInt922] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(III)V")
	private void method5091(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray344[arg0] = arg1;
		this.anIntArray350[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IZ)V")
	private void method5092(@OriginalArg(0) int arg0) {
		if ((this.anIntArray347[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(29) Class6_Sub5 local29 = (Class6_Sub5) this.aClass6_Sub8_Sub1_1.aClass362_7.method8538(); local29 != null; local29 = (Class6_Sub5) this.aClass6_Sub8_Sub1_1.aClass362_7.method8530()) {
			if (arg0 == local29.anInt917 && this.aClass6_Sub5ArrayArray1[arg0][local29.anInt910] == null && local29.anInt911 < 0) {
				local29.anInt911 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!lp", name = "d", descriptor = "()I")
	@Override
	public synchronized int method9125() {
		return 0;
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "()Lclient!qp;")
	@Override
	public synchronized Class6_Sub8 method9121() {
		return this.aClass6_Sub8_Sub1_1;
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "()Lclient!qp;")
	@Override
	public synchronized Class6_Sub8 method9124() {
		return null;
	}

	@OriginalMember(owner = "client!lp", name = "g", descriptor = "(I)V")
	public synchronized void method5093() {
		for (@Pc(13) Class6_Sub10 local13 = (Class6_Sub10) this.aClass209_33.method5037(); local13 != null; local13 = (Class6_Sub10) this.aClass209_33.method5036()) {
			local13.method9174();
		}
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(BZLclient!tv;)V")
	public synchronized void method5094(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class6_Sub53 arg1) {
		this.method5072(arg0, true, arg1);
	}

	@OriginalMember(owner = "client!lp", name = "c", descriptor = "(IIII)V")
	private void method5095(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(ZLclient!tv;JZI)V")
	public synchronized void method5096(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class6_Sub53 arg1, @OriginalArg(2) long arg2) {
		this.method5072(arg0, true, arg1);
		this.method5079(arg2 * (long) this.aClass129_1.anInt3457);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(Lclient!ae;BLclient!tv;Lclient!ig;I)Z")
	public synchronized boolean method5097(@OriginalArg(0) Class8 arg0, @OriginalArg(2) Class6_Sub53 arg1, @OriginalArg(3) Class158 arg2) {
		arg1.method8105();
		@Pc(9) boolean local9 = true;
		@Pc(20) int[] local20 = new int[] { 22050 };
		for (@Pc(26) Class6_Sub47 local26 = (Class6_Sub47) arg1.aClass209_51.method5037(); local26 != null; local26 = (Class6_Sub47) arg1.aClass209_51.method5036()) {
			@Pc(32) int local32 = (int) local26.aLong314;
			@Pc(40) Class6_Sub10 local40 = (Class6_Sub10) this.aClass209_33.method5038((long) local32);
			if (local40 == null) {
				local40 = Static490.method7096(local32, arg0);
				if (local40 == null) {
					local9 = false;
					continue;
				}
				this.aClass209_33.method5035((long) local32, local40);
			}
			if (!local40.method1197(arg2, local26.aByteArray95, local20)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method8104();
		}
		return local9;
	}

	@OriginalMember(owner = "client!lp", name = "h", descriptor = "(I)V")
	public synchronized void method5098() {
		this.method5089(true);
	}

	@OriginalMember(owner = "client!lp", name = "a", descriptor = "(IIB)V")
	public synchronized void method5099() {
		this.method5069();
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(Lclient!bf;B)I")
	private int method5100(@OriginalArg(0) Class6_Sub5 arg0) {
		@Pc(17) int local17 = this.anIntArray354[arg0.anInt917];
		return local17 >= 8192 ? 16384 - ((128 - arg0.anInt918) * (-local17 + 16384) + 32 >> 6) : arg0.anInt918 * local17 + 32 >> 6;
	}

	@OriginalMember(owner = "client!lp", name = "b", descriptor = "(ZB)V")
	private void method5101(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method5081(-1);
		} else {
			this.method5080(-1);
		}
		this.method5071(-1);
		for (@Pc(23) int local23 = 0; local23 < 16; local23++) {
			this.anIntArray345[local23] = this.anIntArray355[local23];
		}
		for (@Pc(41) int local41 = 0; local41 < 16; local41++) {
			this.anIntArray346[local41] = this.anIntArray355[local41] & 0xFFFFFF80;
		}
	}
}
