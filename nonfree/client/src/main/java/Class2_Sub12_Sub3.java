import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!od")
public final class Class2_Sub12_Sub3 extends Class2_Sub12 {

	@OriginalMember(owner = "client!od", name = "bb", descriptor = "[[B")
	public static final byte[][] aByteArrayArray12 = new byte[50][];

	@OriginalMember(owner = "client!od", name = "Bb", descriptor = "Lclient!h;")
	public static final Class89 aClass89_174 = new Class89(96, 6);

	@OriginalMember(owner = "client!od", name = "Lb", descriptor = "I")
	private int anInt4557;

	@OriginalMember(owner = "client!od", name = "Mb", descriptor = "I")
	private int anInt4558;

	@OriginalMember(owner = "client!od", name = "Nb", descriptor = "J")
	private long aLong135;

	@OriginalMember(owner = "client!od", name = "Ob", descriptor = "Z")
	private boolean aBoolean314;

	@OriginalMember(owner = "client!od", name = "Pb", descriptor = "J")
	private long aLong136;

	@OriginalMember(owner = "client!od", name = "Qb", descriptor = "Lclient!sl;")
	private Class2_Sub34 aClass2_Sub34_2;

	@OriginalMember(owner = "client!od", name = "Rb", descriptor = "I")
	private int anInt4559;

	@OriginalMember(owner = "client!od", name = "Sb", descriptor = "Z")
	private boolean aBoolean315;

	@OriginalMember(owner = "client!od", name = "w", descriptor = "[I")
	private final int[] anIntArray295 = new int[16];

	@OriginalMember(owner = "client!od", name = "x", descriptor = "[I")
	private final int[] anIntArray296 = new int[16];

	@OriginalMember(owner = "client!od", name = "C", descriptor = "[I")
	public final int[] anIntArray297 = new int[16];

	@OriginalMember(owner = "client!od", name = "I", descriptor = "[[Lclient!ej;")
	private final Class2_Sub11[][] aClass2_Sub11ArrayArray2 = new Class2_Sub11[16][128];

	@OriginalMember(owner = "client!od", name = "S", descriptor = "[I")
	public final int[] anIntArray300 = new int[16];

	@OriginalMember(owner = "client!od", name = "A", descriptor = "[[Lclient!ej;")
	private final Class2_Sub11[][] aClass2_Sub11ArrayArray1 = new Class2_Sub11[16][128];

	@OriginalMember(owner = "client!od", name = "kb", descriptor = "I")
	private int anInt4541 = 256;

	@OriginalMember(owner = "client!od", name = "F", descriptor = "[I")
	private final int[] anIntArray298 = new int[16];

	@OriginalMember(owner = "client!od", name = "qb", descriptor = "[I")
	private final int[] anIntArray305 = new int[16];

	@OriginalMember(owner = "client!od", name = "hb", descriptor = "[I")
	private final int[] anIntArray303 = new int[16];

	@OriginalMember(owner = "client!od", name = "Q", descriptor = "[I")
	private final int[] anIntArray299 = new int[16];

	@OriginalMember(owner = "client!od", name = "pb", descriptor = "[I")
	private final int[] anIntArray304 = new int[16];

	@OriginalMember(owner = "client!od", name = "gb", descriptor = "[I")
	private final int[] anIntArray302 = new int[16];

	@OriginalMember(owner = "client!od", name = "Y", descriptor = "I")
	private final int anInt4533 = 1000000;

	@OriginalMember(owner = "client!od", name = "U", descriptor = "[I")
	private final int[] anIntArray301 = new int[16];

	@OriginalMember(owner = "client!od", name = "yb", descriptor = "[I")
	private final int[] anIntArray307 = new int[16];

	@OriginalMember(owner = "client!od", name = "zb", descriptor = "[I")
	public final int[] anIntArray308 = new int[16];

	@OriginalMember(owner = "client!od", name = "Db", descriptor = "[I")
	private final int[] anIntArray309 = new int[16];

	@OriginalMember(owner = "client!od", name = "tb", descriptor = "[I")
	private final int[] anIntArray306 = new int[16];

	@OriginalMember(owner = "client!od", name = "Jb", descriptor = "[I")
	private final int[] anIntArray310 = new int[16];

	@OriginalMember(owner = "client!od", name = "vb", descriptor = "Lclient!jp;")
	private final Class118 aClass118_1 = new Class118();

	@OriginalMember(owner = "client!od", name = "Kb", descriptor = "Lclient!ff;")
	private final Class2_Sub12_Sub1 aClass2_Sub12_Sub1_1 = new Class2_Sub12_Sub1(this);

	@OriginalMember(owner = "client!od", name = "cb", descriptor = "Lclient!ad;")
	private final Class4 aClass4_92 = new Class4(128);

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "()V", line = 1531)
	public Class2_Sub12_Sub3() {
		this.method4302();
		this.method4289(true);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(B)Z", line = 3)
	public synchronized boolean method4271() {
		return this.aClass118_1.method3200();
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V", line = 20)
	public synchronized void method4272() {
		for (@Pc(11) Class2_Sub25 local11 = (Class2_Sub25) this.aClass4_92.method80(); local11 != null; local11 = (Class2_Sub25) this.aClass4_92.method79()) {
			local11.method4014();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "()Lclient!ll;", line = 37)
	@Override
	public synchronized Class2_Sub12 method4973() {
		return null;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZLclient!ej;)V", line = 45)
	public void method4273(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class2_Sub11 arg1) {
		@Pc(8) int local8 = arg1.aClass2_Sub21_Sub1_1.aByteArray31.length;
		@Pc(31) int local31;
		if (arg0 && arg1.aClass2_Sub21_Sub1_1.aBoolean219) {
			@Pc(41) int local41 = local8 + local8 - arg1.aClass2_Sub21_Sub1_1.anInt3174;
			local8 <<= 0x8;
			local31 = (int) ((long) this.anIntArray297[arg1.anInt1791] * (long) local41 >> 6);
			if (local31 >= local8) {
				arg1.aClass2_Sub12_Sub4_1.method5005();
				local31 = local8 + local8 - local31 - 1;
			}
		} else {
			local31 = (int) ((long) local8 * (long) this.anIntArray297[arg1.anInt1791] >> 6);
		}
		arg1.aClass2_Sub12_Sub4_1.method5016(local31);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!sl;ZI)V", line = 78)
	public synchronized void method4274(@OriginalArg(0) Class2_Sub34 arg0, @OriginalArg(1) boolean arg1) {
		this.method4284(true, arg1, arg0);
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(B)V", line = 90)
	public synchronized void method4275() {
		this.method4294(true);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BLclient!ej;)Z", line = 102)
	public boolean method4276(@OriginalArg(1) Class2_Sub11 arg0) {
		if (arg0.aClass2_Sub12_Sub4_1 != null) {
			return false;
		}
		if (arg0.anInt1789 >= 0) {
			arg0.method6469();
			if (arg0.anInt1786 > 0 && arg0 == this.aClass2_Sub11ArrayArray2[arg0.anInt1791][arg0.anInt1786]) {
				this.aClass2_Sub11ArrayArray2[arg0.anInt1791][arg0.anInt1786] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)V", line = 134)
	public synchronized void method4277() {
		for (@Pc(7) Class2_Sub25 local7 = (Class2_Sub25) this.aClass4_92.method80(); local7 != null; local7 = (Class2_Sub25) this.aClass4_92.method79()) {
			local7.method6469();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZI[ILclient!ej;)Z", line = 154)
	public boolean method4278(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class2_Sub11 arg3) {
		arg3.anInt1778 = Static331.anInt6630 / 100;
		if (arg3.anInt1789 >= 0 && (arg3.aClass2_Sub12_Sub4_1 == null || arg3.aClass2_Sub12_Sub4_1.method5002())) {
			arg3.method1870();
			arg3.method6469();
			if (arg3.anInt1786 > 0 && this.aClass2_Sub11ArrayArray2[arg3.anInt1791][arg3.anInt1786] == arg3) {
				this.aClass2_Sub11ArrayArray2[arg3.anInt1791][arg3.anInt1786] = null;
			}
			return true;
		}
		@Pc(54) int local54 = arg3.anInt1792;
		if (local54 > 0) {
			local54 -= (int) (Math.pow(2.0D, (double) this.anIntArray306[arg3.anInt1791] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local54 < 0) {
				local54 = 0;
			}
			arg3.anInt1792 = local54;
		}
		arg3.aClass2_Sub12_Sub4_1.method4992(this.method4295(arg3));
		@Pc(97) Class17 local97 = arg3.aClass17_1;
		@Pc(99) boolean local99 = false;
		arg3.anInt1780++;
		arg3.anInt1788 += local97.anInt547;
		@Pc(136) double local136 = (double) ((arg3.anInt1774 * arg3.anInt1792 >> 12) + (arg3.anInt1779 - 60 << 8)) * 5.086263020833333E-6D;
		if (local97.anInt544 > 0) {
			if (local97.anInt541 > 0) {
				arg3.anInt1784 += (int) (Math.pow(2.0D, local136 * (double) local97.anInt541) * 128.0D + 0.5D);
			} else {
				arg3.anInt1784 += 128;
			}
			if (local97.anInt544 * arg3.anInt1784 >= 819200) {
				local99 = true;
			}
		}
		if (local97.aByteArray3 != null) {
			if (local97.anInt546 > 0) {
				arg3.anInt1776 += (int) (Math.pow(2.0D, local136 * (double) local97.anInt546) * 128.0D + 0.5D);
			} else {
				arg3.anInt1776 += 128;
			}
			while (local97.aByteArray3.length - 2 > arg3.anInt1775 && (local97.aByteArray3[arg3.anInt1775 + 2] & 0xFF) << 8 < arg3.anInt1776) {
				arg3.anInt1775 += 2;
			}
			if (arg3.anInt1775 == local97.aByteArray3.length - 2 && local97.aByteArray3[arg3.anInt1775 + 1] == 0) {
				local99 = true;
			}
		}
		if (arg3.anInt1789 >= 0 && local97.aByteArray4 != null && (this.anIntArray308[arg3.anInt1791] & 0x1) == 0 && (arg3.anInt1786 < 0 || this.aClass2_Sub11ArrayArray2[arg3.anInt1791][arg3.anInt1786] != arg3)) {
			if (local97.anInt542 <= 0) {
				arg3.anInt1789 += 128;
			} else {
				arg3.anInt1789 += (int) (Math.pow(2.0D, (double) local97.anInt542 * local136) * 128.0D + 0.5D);
			}
			while (arg3.anInt1777 < local97.aByteArray4.length - 2 && arg3.anInt1789 > (local97.aByteArray4[arg3.anInt1777 + 2] & 0xFF) << 8) {
				arg3.anInt1777 += 2;
			}
			if (arg3.anInt1777 == local97.aByteArray4.length - 2) {
				local99 = true;
			}
		}
		if (!local99) {
			arg3.aClass2_Sub12_Sub4_1.method4995(arg3.anInt1778, this.method4299(arg3), this.method4293(arg3));
			return false;
		}
		arg3.aClass2_Sub12_Sub4_1.method4991(arg3.anInt1778);
		if (arg2 == null) {
			arg3.aClass2_Sub12_Sub4_1.method4975(arg0);
		} else {
			arg3.aClass2_Sub12_Sub4_1.method4974(arg2, arg1, arg0);
		}
		if (arg3.aClass2_Sub12_Sub4_1.method4990()) {
			this.aClass2_Sub12_Sub1_1.aClass2_Sub12_Sub2_1.method2085(arg3.aClass2_Sub12_Sub4_1);
		}
		arg3.method1870();
		if (arg3.anInt1789 >= 0) {
			arg3.method6469();
			if (arg3.anInt1786 > 0 && arg3 == this.aClass2_Sub11ArrayArray2[arg3.anInt1791][arg3.anInt1786]) {
				this.aClass2_Sub11ArrayArray2[arg3.anInt1791][arg3.anInt1786] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V", line = 281)
	public synchronized void method4279(@OriginalArg(0) int arg0) {
		this.anInt4541 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIII)V", line = 294)
	private void method4280(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class2_Sub11 local14 = this.aClass2_Sub11ArrayArray1[arg0][arg1];
		if (local14 == null) {
			return;
		}
		this.aClass2_Sub11ArrayArray1[arg0][arg1] = null;
		if ((this.anIntArray308[arg0] & 0x2) == 0) {
			local14.anInt1789 = 0;
			return;
		}
		for (@Pc(41) Class2_Sub11 local41 = (Class2_Sub11) this.aClass2_Sub12_Sub1_1.aClass135_15.method3552(); local41 != null; local41 = (Class2_Sub11) this.aClass2_Sub12_Sub1_1.aClass135_15.method3553()) {
			if (local41.anInt1791 == local14.anInt1791 && local41.anInt1789 < 0 && local41 != local14) {
				local14.anInt1789 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!bk;Lclient!sl;Lclient!r;II)Z", line = 354)
	public synchronized boolean method4282(@OriginalArg(0) Class24 arg0, @OriginalArg(1) Class2_Sub34 arg1, @OriginalArg(2) Class197 arg2) {
		arg1.method5450();
		@Pc(9) boolean local9 = true;
		@Pc(23) int[] local23 = new int[] { 22050 };
		for (@Pc(34) Class2_Sub44 local34 = (Class2_Sub44) arg1.aClass4_119.method80(); local34 != null; local34 = (Class2_Sub44) arg1.aClass4_119.method79()) {
			@Pc(40) int local40 = (int) local34.aLong232;
			@Pc(48) Class2_Sub25 local48 = (Class2_Sub25) this.aClass4_92.method90((long) local40);
			if (local48 == null) {
				local48 = Static271.method5063(local40, arg2);
				if (local48 == null) {
					local9 = false;
					continue;
				}
				this.aClass4_92.method87(local48, (long) local40);
			}
			if (!local48.method4019(local34.aByteArray99, arg0, local23)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method5448();
		}
		return local9;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IBI)V", line = 408)
	private void method4283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray299[arg1] = arg0;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)V", line = 420)
	@Override
	public synchronized void method4975(@OriginalArg(0) int arg0) {
		if (this.aClass118_1.method3200()) {
			@Pc(12) int local12 = this.anInt4533 * this.aClass118_1.anInt3190 / Static331.anInt6630;
			do {
				@Pc(22) long local22 = this.aLong136 + (long) arg0 * (long) local12;
				if (this.aLong135 - local22 >= 0L) {
					this.aLong136 = local22;
					break;
				}
				@Pc(51) int local51 = (int) (((long) local12 + this.aLong135 - this.aLong136 - 1L) / (long) local12);
				this.aLong136 += (long) local51 * (long) local12;
				this.aClass2_Sub12_Sub1_1.method4975(local51);
				arg0 -= local51;
				this.method4290();
			} while (this.aClass118_1.method3200());
		}
		this.aClass2_Sub12_Sub1_1.method4975(arg0);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "([III)V", line = 463)
	@Override
	public synchronized void method4974(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass118_1.method3200()) {
			@Pc(14) int local14 = this.anInt4533 * this.aClass118_1.anInt3190 / Static331.anInt6630;
			do {
				@Pc(23) long local23 = this.aLong136 + (long) arg2 * (long) local14;
				if (this.aLong135 - local23 >= 0L) {
					this.aLong136 = local23;
					break;
				}
				@Pc(53) int local53 = (int) (((long) local14 + this.aLong135 - this.aLong136 - 1L) / (long) local14);
				this.aLong136 += (long) local14 * (long) local53;
				this.aClass2_Sub12_Sub1_1.method4974(arg0, arg1, local53);
				arg1 += local53;
				this.method4290();
				arg2 -= local53;
			} while (this.aClass118_1.method3200());
		}
		this.aClass2_Sub12_Sub1_1.method4974(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BZZLclient!sl;)V", line = 505)
	private synchronized void method4284(@OriginalArg(1) boolean arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) Class2_Sub34 arg2) {
		this.method4294(arg0);
		this.aClass118_1.method3204(arg2.aByteArray77);
		this.aBoolean314 = arg1;
		this.aLong136 = 0L;
		@Pc(29) int local29 = this.aClass118_1.method3194();
		for (@Pc(31) int local31 = 0; local31 < local29; local31++) {
			this.aClass118_1.method3207(local31);
			this.aClass118_1.method3196(local31);
			this.aClass118_1.method3193(local31);
		}
		this.anInt4557 = this.aClass118_1.method3199();
		this.anInt4558 = this.aClass118_1.anIntArray195[this.anInt4557];
		this.aLong135 = this.aClass118_1.method3201(this.anInt4558);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZII)V", line = 535)
	private void method4285(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(III)V", line = 546)
	private void method4286(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IB)V", line = 563)
	private void method4287(@OriginalArg(0) int arg0) {
		for (@Pc(6) Class2_Sub11 local6 = (Class2_Sub11) this.aClass2_Sub12_Sub1_1.aClass135_15.method3552(); local6 != null; local6 = (Class2_Sub11) this.aClass2_Sub12_Sub1_1.aClass135_15.method3553()) {
			if (arg0 < 0 || arg0 == local6.anInt1791) {
				if (local6.aClass2_Sub12_Sub4_1 != null) {
					local6.aClass2_Sub12_Sub4_1.method4991(Static331.anInt6630 / 100);
					if (local6.aClass2_Sub12_Sub4_1.method4990()) {
						this.aClass2_Sub12_Sub1_1.aClass2_Sub12_Sub2_1.method2085(local6.aClass2_Sub12_Sub4_1);
					}
					local6.method1870();
				}
				if (local6.anInt1789 < 0) {
					this.aClass2_Sub11ArrayArray1[local6.anInt1791][local6.anInt1779] = null;
				}
				local6.method6469();
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IZ)V", line = 606)
	private void method4288(@OriginalArg(0) int arg0) {
		if ((this.anIntArray308[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(13) Class2_Sub11 local13 = (Class2_Sub11) this.aClass2_Sub12_Sub1_1.aClass135_15.method3552(); local13 != null; local13 = (Class2_Sub11) this.aClass2_Sub12_Sub1_1.aClass135_15.method3553()) {
			if (local13.anInt1791 == arg0 && this.aClass2_Sub11ArrayArray1[arg0][local13.anInt1779] == null && local13.anInt1789 < 0) {
				local13.anInt1789 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZI)V", line = 641)
	private void method4289(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			this.method4287(-1);
		} else {
			this.method4298(-1);
		}
		this.method4296(-1);
		for (@Pc(24) int local24 = 0; local24 < 16; local24++) {
			this.anIntArray295[local24] = this.anIntArray304[local24];
		}
		for (@Pc(41) int local41 = 0; local41 < 16; local41++) {
			this.anIntArray309[local41] = this.anIntArray304[local41] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!od", name = "e", descriptor = "(I)V", line = 685)
	private void method4290() {
		@Pc(6) int local6 = this.anInt4557;
		@Pc(9) int local9 = this.anInt4558;
		@Pc(12) long local12 = this.aLong135;
		if (this.aClass2_Sub34_2 != null && local9 == this.anInt4559) {
			this.method4284(this.aBoolean315, this.aBoolean314, this.aClass2_Sub34_2);
			this.method4290();
			return;
		}
		while (this.anInt4558 == local9) {
			while (local9 == this.aClass118_1.anIntArray195[local6]) {
				this.aClass118_1.method3207(local6);
				@Pc(45) int local45 = this.aClass118_1.method3206(local6);
				if (local45 == 1) {
					this.aClass118_1.method3195();
					this.aClass118_1.method3193(local6);
					if (this.aClass118_1.method3197()) {
						if (this.aClass2_Sub34_2 != null) {
							this.method4274(this.aClass2_Sub34_2, this.aBoolean314);
							this.method4290();
							return;
						}
						if (!this.aBoolean314 || local9 == 0) {
							this.method4289(true);
							this.aClass118_1.method3208();
							return;
						}
						this.aClass118_1.method3205(local12);
					}
					break;
				}
				if ((local45 & 0x80) != 0) {
					this.method4291(local45);
				}
				this.aClass118_1.method3196(local6);
				this.aClass118_1.method3193(local6);
			}
			local6 = this.aClass118_1.method3199();
			local9 = this.aClass118_1.anIntArray195[local6];
			local12 = this.aClass118_1.method3201(local9);
		}
		this.anInt4557 = local6;
		this.aLong135 = local12;
		this.anInt4558 = local9;
		if (this.aClass2_Sub34_2 != null && local9 > this.anInt4559) {
			this.anInt4558 = this.anInt4559;
			this.anInt4557 = -1;
			this.aLong135 = this.aClass118_1.method3201(this.anInt4558);
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(II)V", line = 769)
	private void method4291(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0xF0;
		@Pc(14) int local14;
		@Pc(20) int local20;
		@Pc(26) int local26;
		if (local7 == 128) {
			local14 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			local26 = arg0 >> 16 & 0x7F;
			this.method4280(local14, local20, local26);
		} else if (local7 == 144) {
			local14 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			local26 = arg0 >> 16 & 0x7F;
			if (local26 <= 0) {
				this.method4280(local14, local20, 64);
			} else {
				this.method4301(local14, local20, local26);
			}
		} else if (local7 == 160) {
			local14 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			local26 = arg0 >> 16 & 0x7F;
			this.method4285(local14, local26, local20);
		} else if (local7 == 176) {
			local14 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			local26 = arg0 >> 16 & 0x7F;
			if (local20 == 0) {
				this.anIntArray309[local14] = (local26 << 14) + (this.anIntArray309[local14] & 0xFFE03FFF);
			}
			if (local20 == 32) {
				this.anIntArray309[local14] = (local26 << 7) + (this.anIntArray309[local14] & 0xFFFFC07F);
			}
			if (local20 == 1) {
				this.anIntArray301[local14] = (this.anIntArray301[local14] & 0xFFFFC07F) + (local26 << 7);
			}
			if (local20 == 33) {
				this.anIntArray301[local14] = local26 + (this.anIntArray301[local14] & 0xFFFFFF80);
			}
			if (local20 == 5) {
				this.anIntArray306[local14] = (local26 << 7) + (this.anIntArray306[local14] & 0xFFFFC07F);
			}
			if (local20 == 37) {
				this.anIntArray306[local14] = (this.anIntArray306[local14] & 0xFFFFFF80) + local26;
			}
			if (local20 == 7) {
				this.anIntArray296[local14] = (local26 << 7) + (this.anIntArray296[local14] & 0xFFFFC07F);
			}
			if (local20 == 39) {
				this.anIntArray296[local14] = (this.anIntArray296[local14] & 0xFFFFFF80) + local26;
			}
			if (local20 == 10) {
				this.anIntArray305[local14] = (this.anIntArray305[local14] & 0xFFFFC07F) + (local26 << 7);
			}
			if (local20 == 42) {
				this.anIntArray305[local14] = (this.anIntArray305[local14] & 0xFFFFFF80) + local26;
			}
			if (local20 == 11) {
				this.anIntArray298[local14] = (this.anIntArray298[local14] & 0xFFFFC07F) + (local26 << 7);
			}
			if (local20 == 43) {
				this.anIntArray298[local14] = (this.anIntArray298[local14] & 0xFFFFFF80) + local26;
			}
			if (local20 == 64) {
				if (local26 >= 64) {
					this.anIntArray308[local14] |= 0x1;
				} else {
					this.anIntArray308[local14] &= 0xFFFFFFFE;
				}
			}
			if (local20 == 65) {
				if (local26 >= 64) {
					this.anIntArray308[local14] |= 0x2;
				} else {
					this.method4288(local14);
					this.anIntArray308[local14] &= 0xFFFFFFFD;
				}
			}
			if (local20 == 99) {
				this.anIntArray310[local14] = (this.anIntArray310[local14] & 0x7F) + (local26 << 7);
			}
			if (local20 == 98) {
				this.anIntArray310[local14] = local26 + (this.anIntArray310[local14] & 0x3F80);
			}
			if (local20 == 101) {
				this.anIntArray310[local14] = (local26 << 7) + (this.anIntArray310[local14] & 0x7F) + 16384;
			}
			if (local20 == 100) {
				this.anIntArray310[local14] = local26 + (this.anIntArray310[local14] & 0x3F80) + 16384;
			}
			if (local20 == 120) {
				this.method4287(local14);
			}
			if (local20 == 121) {
				this.method4296(local14);
			}
			if (local20 == 123) {
				this.method4298(local14);
			}
			@Pc(497) int local497;
			if (local20 == 6) {
				local497 = this.anIntArray310[local14];
				if (local497 == 16384) {
					this.anIntArray307[local14] = (this.anIntArray307[local14] & 0xFFFFC07F) + (local26 << 7);
				}
			}
			if (local20 == 38) {
				local497 = this.anIntArray310[local14];
				if (local497 == 16384) {
					this.anIntArray307[local14] = (this.anIntArray307[local14] & 0xFFFFFF80) + local26;
				}
			}
			if (local20 == 16) {
				this.anIntArray297[local14] = (local26 << 7) + (this.anIntArray297[local14] & 0xFFFFC07F);
			}
			if (local20 == 48) {
				this.anIntArray297[local14] = (this.anIntArray297[local14] & 0xFFFFFF80) + local26;
			}
			if (local20 == 81) {
				if (local26 >= 64) {
					this.anIntArray308[local14] |= 0x4;
				} else {
					this.method4306(local14);
					this.anIntArray308[local14] &= 0xFFFFFFFB;
				}
			}
			if (local20 == 17) {
				this.method4307(local14, (this.anIntArray303[local14] & 0xFFFFC07F) + (local26 << 7));
			}
			if (local20 == 49) {
				this.method4307(local14, local26 + (this.anIntArray303[local14] & 0xFFFFFF80));
			}
		} else if (local7 == 192) {
			local14 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			this.method4292(local20 + this.anIntArray309[local14], local14);
		} else if (local7 == 208) {
			local14 = arg0 & 0xF;
			local20 = arg0 >> 8 & 0x7F;
			this.method4286(local20, local14);
		} else if (local7 == 224) {
			local14 = arg0 & 0xF;
			local20 = (arg0 >> 8 & 0x7F) + (arg0 >> 9 & 0x3F80);
			this.method4283(local20, local14);
		} else {
			local7 = arg0 & 0xFF;
			if (local7 == 255) {
				this.method4289(true);
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIB)V", line = 1008)
	private void method4292(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 != this.anIntArray295[arg1]) {
			this.anIntArray295[arg1] = arg0;
			for (@Pc(16) int local16 = 0; local16 < 128; local16++) {
				this.aClass2_Sub11ArrayArray2[arg1][local16] = null;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(Lclient!ej;I)I", line = 1031)
	private int method4293(@OriginalArg(0) Class2_Sub11 arg0) {
		@Pc(9) int local9 = this.anIntArray305[arg0.anInt1791];
		return local9 < 8192 ? local9 * arg0.anInt1773 + 32 >> 6 : 16384 - ((128 - arg0.anInt1773) * (-local9 + 16384) + 32 >> 6);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BZ)V", line = 1051)
	private synchronized void method4294(@OriginalArg(1) boolean arg0) {
		this.aClass118_1.method3208();
		this.aClass2_Sub34_2 = null;
		this.method4289(arg0);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(Lclient!ej;I)I", line = 1064)
	private int method4295(@OriginalArg(0) Class2_Sub11 arg0) {
		@Pc(14) int local14 = (arg0.anInt1792 * arg0.anInt1774 >> 12) + arg0.anInt1793;
		local14 += this.anIntArray307[arg0.anInt1791] * (this.anIntArray299[arg0.anInt1791] - 8192) >> 12;
		@Pc(40) Class17 local40 = arg0.aClass17_1;
		@Pc(63) int local63;
		if (local40.anInt547 > 0 && (local40.anInt540 > 0 || this.anIntArray301[arg0.anInt1791] > 0)) {
			local63 = local40.anInt540 << 2;
			@Pc(68) int local68 = local40.anInt539 << 1;
			if (arg0.anInt1780 < local68) {
				local63 = local63 * arg0.anInt1780 / local68;
			}
			local63 += this.anIntArray301[arg0.anInt1791] >> 7;
			@Pc(102) double local102 = Math.sin((double) (arg0.anInt1788 & 0x1FF) * 0.01227184630308513D);
			local14 += (int) ((double) local63 * local102);
		}
		local63 = (int) ((double) (arg0.aClass2_Sub21_Sub1_1.anInt3172 * 256) * Math.pow(2.0D, (double) local14 * 3.255208333333333E-4D) / (double) Static331.anInt6630 + 0.5D);
		return local63 < 1 ? 1 : local63;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(IB)V", line = 1100)
	private void method4296(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(7) int local7 = 0; local7 < 16; local7++) {
				this.method4296(local7);
			}
			return;
		}
		this.anIntArray296[arg0] = 12800;
		this.anIntArray305[arg0] = 8192;
		this.anIntArray298[arg0] = 16383;
		this.anIntArray299[arg0] = 8192;
		this.anIntArray301[arg0] = 0;
		this.anIntArray306[arg0] = 8192;
		this.method4288(arg0);
		this.method4306(arg0);
		this.anIntArray308[arg0] = 0;
		this.anIntArray310[arg0] = 32767;
		this.anIntArray307[arg0] = 256;
		this.anIntArray297[arg0] = 0;
		this.method4307(arg0, 8192);
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IIB)V", line = 1140)
	public synchronized void method4297() {
		this.method4305();
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(IZ)V", line = 1153)
	private void method4298(@OriginalArg(0) int arg0) {
		for (@Pc(10) Class2_Sub11 local10 = (Class2_Sub11) this.aClass2_Sub12_Sub1_1.aClass135_15.method3552(); local10 != null; local10 = (Class2_Sub11) this.aClass2_Sub12_Sub1_1.aClass135_15.method3553()) {
			if ((arg0 < 0 || arg0 == local10.anInt1791) && local10.anInt1789 < 0) {
				this.aClass2_Sub11ArrayArray1[local10.anInt1791][local10.anInt1779] = null;
				local10.anInt1789 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "()Lclient!ll;", line = 1185)
	@Override
	public synchronized Class2_Sub12 method4979() {
		return this.aClass2_Sub12_Sub1_1;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "()I", line = 1194)
	@Override
	public synchronized int method4978() {
		return 0;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ILclient!ej;)I", line = 1203)
	private int method4299(@OriginalArg(1) Class2_Sub11 arg0) {
		if (this.anIntArray302[arg0.anInt1791] == 0) {
			return 0;
		}
		@Pc(14) Class17 local14 = arg0.aClass17_1;
		@Pc(30) int local30 = this.anIntArray296[arg0.anInt1791] * this.anIntArray298[arg0.anInt1791] + 4096 >> 13;
		@Pc(38) int local38 = local30 * local30 + 16384 >> 15;
		@Pc(47) int local47 = arg0.anInt1781 * local38 + 16384 >> 15;
		@Pc(56) int local56 = local47 * this.anInt4541 + 128 >> 8;
		local30 = this.anIntArray302[arg0.anInt1791] * local56 + 128 >> 8;
		if (local14.anInt544 > 0) {
			local30 = (int) (Math.pow(0.5D, (double) arg0.anInt1784 * 1.953125E-5D * (double) local14.anInt544) * (double) local30 + 0.5D);
		}
		@Pc(95) int local95;
		@Pc(103) int local103;
		@Pc(125) int local125;
		@Pc(137) int local137;
		if (local14.aByteArray3 != null) {
			local95 = arg0.anInt1776;
			local103 = local14.aByteArray3[arg0.anInt1775 + 1];
			if (local14.aByteArray3.length - 2 > arg0.anInt1775) {
				local125 = (local14.aByteArray3[arg0.anInt1775] & 0xFF) << 8;
				local137 = (local14.aByteArray3[arg0.anInt1775 + 2] & 0xFF) << 8;
				local103 += (local95 - local125) * (-local103 + local14.aByteArray3[arg0.anInt1775 + 3]) / (local137 - local125);
			}
			local30 = local30 * local103 + 32 >> 6;
		}
		if (arg0.anInt1789 > 0 && local14.aByteArray4 != null) {
			local95 = arg0.anInt1789;
			local103 = local14.aByteArray4[arg0.anInt1777 + 1];
			if (local14.aByteArray4.length - 2 > arg0.anInt1777) {
				local125 = (local14.aByteArray4[arg0.anInt1777] & 0xFF) << 8;
				local137 = (local14.aByteArray4[arg0.anInt1777 + 2] & 0xFF) << 8;
				local103 += (local95 - local125) * (-local103 + local14.aByteArray4[arg0.anInt1777 + 3]) / (local137 - local125);
			}
			local30 = local103 * local30 + 32 >> 6;
		}
		return local30;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IBII)V", line = 1282)
	private void method4301(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		this.method4280(arg0, arg1, 64);
		if ((this.anIntArray308[arg0] & 0x2) != 0) {
			for (@Pc(26) Class2_Sub11 local26 = (Class2_Sub11) this.aClass2_Sub12_Sub1_1.aClass135_15.method3549(); local26 != null; local26 = (Class2_Sub11) this.aClass2_Sub12_Sub1_1.aClass135_15.method3548()) {
				if (local26.anInt1791 == arg0 && local26.anInt1789 < 0) {
					this.aClass2_Sub11ArrayArray1[arg0][local26.anInt1779] = null;
					this.aClass2_Sub11ArrayArray1[arg0][arg1] = local26;
					@Pc(60) int local60 = local26.anInt1793 + (local26.anInt1774 * local26.anInt1792 >> 12);
					local26.anInt1793 += arg1 - local26.anInt1779 << 8;
					local26.anInt1792 = 4096;
					local26.anInt1774 = local60 - local26.anInt1793;
					local26.anInt1779 = arg1;
					return;
				}
			}
		}
		@Pc(105) Class2_Sub25 local105 = (Class2_Sub25) this.aClass4_92.method90((long) this.anIntArray295[arg0]);
		if (local105 == null) {
			return;
		}
		@Pc(113) Class2_Sub21_Sub1 local113 = local105.aClass2_Sub21_Sub1Array1[arg1];
		if (local113 == null) {
			return;
		}
		@Pc(120) Class2_Sub11 local120 = new Class2_Sub11();
		local120.anInt1791 = arg0;
		local120.aClass2_Sub21_Sub1_1 = local113;
		local120.aClass2_Sub25_1 = local105;
		local120.aClass17_1 = local105.aClass17Array1[arg1];
		local120.anInt1786 = local105.aByteArray46[arg1];
		local120.anInt1779 = arg1;
		local120.anInt1781 = arg2 * arg2 * local105.anInt4059 * local105.aByteArray47[arg1] + 1024 >> 11;
		local120.anInt1773 = local105.aByteArray45[arg1] & 0xFF;
		local120.anInt1793 = (arg1 << 8) - (local105.aShortArray89[arg1] & 0x7FFF);
		local120.anInt1775 = 0;
		local120.anInt1776 = 0;
		local120.anInt1789 = -1;
		local120.anInt1784 = 0;
		local120.anInt1777 = 0;
		if (this.anIntArray297[arg0] == 0) {
			local120.aClass2_Sub12_Sub4_1 = Static392.method4999(local113, this.method4295(local120), this.method4299(local120), this.method4293(local120));
		} else {
			local120.aClass2_Sub12_Sub4_1 = Static392.method4999(local113, this.method4295(local120), 0, this.method4293(local120));
			this.method4273(local105.aShortArray89[arg1] < 0, local120);
		}
		if (local105.aShortArray89[arg1] < 0) {
			local120.aClass2_Sub12_Sub4_1.method4985(-1);
		}
		if (local120.anInt1786 >= 0) {
			@Pc(276) Class2_Sub11 local276 = this.aClass2_Sub11ArrayArray2[arg0][local120.anInt1786];
			if (local276 != null && local276.anInt1789 < 0) {
				this.aClass2_Sub11ArrayArray1[arg0][local276.anInt1779] = null;
				local276.anInt1789 = 0;
			}
			this.aClass2_Sub11ArrayArray2[arg0][local120.anInt1786] = local120;
		}
		this.aClass2_Sub12_Sub1_1.aClass135_15.method3541(local120);
		this.aClass2_Sub11ArrayArray1[arg0][arg1] = local120;
	}

	@OriginalMember(owner = "client!od", name = "c", descriptor = "(III)V", line = 1377)
	private synchronized void method4302() {
		for (@Pc(6) int local6 = 0; local6 < 16; local6++) {
			this.anIntArray302[local6] = 256;
		}
	}

	@OriginalMember(owner = "client!od", name = "g", descriptor = "(I)I", line = 1421)
	public int method4304() {
		return this.anInt4541;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BII)V", line = 1447)
	private void method4305() {
		this.anIntArray304[9] = 128;
		this.anIntArray309[9] = 128;
		this.method4292(128, 9);
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(BI)V", line = 1469)
	private void method4306(@OriginalArg(1) int arg0) {
		if ((this.anIntArray308[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(17) Class2_Sub11 local17 = (Class2_Sub11) this.aClass2_Sub12_Sub1_1.aClass135_15.method3552(); local17 != null; local17 = (Class2_Sub11) this.aClass2_Sub12_Sub1_1.aClass135_15.method3553()) {
			if (arg0 == local17.anInt1791) {
				local17.anInt1790 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(III)V", line = 1495)
	private void method4307(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray303[arg0] = arg1;
		this.anIntArray300[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}
}
