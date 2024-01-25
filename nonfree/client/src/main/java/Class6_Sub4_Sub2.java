import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class6_Sub4_Sub2 extends Class6_Sub4 {

	@OriginalMember(owner = "client!bk", name = "Mb", descriptor = "J")
	private long aLong35;

	@OriginalMember(owner = "client!bk", name = "Nb", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!bk", name = "Ob", descriptor = "Z")
	private boolean aBoolean44;

	@OriginalMember(owner = "client!bk", name = "Pb", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!bk", name = "Qb", descriptor = "J")
	private long aLong36;

	@OriginalMember(owner = "client!bk", name = "Rb", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!bk", name = "Sb", descriptor = "Lclient!kk;")
	private Class6_Sub21 aClass6_Sub21_1;

	@OriginalMember(owner = "client!bk", name = "Tb", descriptor = "Z")
	private boolean aBoolean45;

	@OriginalMember(owner = "client!bk", name = "C", descriptor = "[[Lclient!d;")
	private final Class6_Sub10[][] aClass6_Sub10ArrayArray1 = new Class6_Sub10[16][128];

	@OriginalMember(owner = "client!bk", name = "Q", descriptor = "I")
	private final int anInt843 = 1000000;

	@OriginalMember(owner = "client!bk", name = "L", descriptor = "[I")
	private final int[] anIntArray37 = new int[16];

	@OriginalMember(owner = "client!bk", name = "eb", descriptor = "[I")
	private final int[] anIntArray43 = new int[16];

	@OriginalMember(owner = "client!bk", name = "lb", descriptor = "[I")
	public final int[] lb = new int[16];

	@OriginalMember(owner = "client!bk", name = "y", descriptor = "[I")
	private final int[] anIntArray35 = new int[16];

	@OriginalMember(owner = "client!bk", name = "mb", descriptor = "[I")
	public final int[] anIntArray44 = new int[16];

	@OriginalMember(owner = "client!bk", name = "bb", descriptor = "[I")
	public final int[] anIntArray42 = new int[16];

	@OriginalMember(owner = "client!bk", name = "N", descriptor = "[I")
	private final int[] anIntArray39 = new int[16];

	@OriginalMember(owner = "client!bk", name = "U", descriptor = "[I")
	private final int[] anIntArray40 = new int[16];

	@OriginalMember(owner = "client!bk", name = "Y", descriptor = "[I")
	private final int[] anIntArray41 = new int[16];

	@OriginalMember(owner = "client!bk", name = "tb", descriptor = "I")
	private int anInt862 = 256;

	@OriginalMember(owner = "client!bk", name = "rb", descriptor = "[I")
	private final int[] anIntArray46 = new int[16];

	@OriginalMember(owner = "client!bk", name = "ub", descriptor = "[I")
	private final int[] anIntArray47 = new int[16];

	@OriginalMember(owner = "client!bk", name = "pb", descriptor = "[I")
	private final int[] anIntArray45 = new int[16];

	@OriginalMember(owner = "client!bk", name = "M", descriptor = "[I")
	private final int[] anIntArray38 = new int[16];

	@OriginalMember(owner = "client!bk", name = "Db", descriptor = "[[Lclient!d;")
	private final Class6_Sub10[][] aClass6_Sub10ArrayArray2 = new Class6_Sub10[16][128];

	@OriginalMember(owner = "client!bk", name = "E", descriptor = "[I")
	private final int[] anIntArray36 = new int[16];

	@OriginalMember(owner = "client!bk", name = "Eb", descriptor = "[I")
	private final int[] anIntArray49 = new int[16];

	@OriginalMember(owner = "client!bk", name = "Hb", descriptor = "[I")
	private final int[] anIntArray51 = new int[16];

	@OriginalMember(owner = "client!bk", name = "yb", descriptor = "Lclient!kq;")
	private final Class146 aClass146_1 = new Class146();

	@OriginalMember(owner = "client!bk", name = "Lb", descriptor = "Lclient!nd;")
	private final Class6_Sub4_Sub3 aClass6_Sub4_Sub3_1 = new Class6_Sub4_Sub3(this);

	@OriginalMember(owner = "client!bk", name = "vb", descriptor = "Lclient!fe;")
	private final Class74 aClass74_4 = new Class74(128);

	static {
		new Class267("You cannot report that person for Staff Impersonation, they are Jagex Staff.", "Diese Person ist ein Jagex-Mitarbeiter!", "Cette personne est un membre du personnel de Jagex, vous ne pouvez pas la signaler pour abus d'identité.", "Você não pode denunciar essa pessoa por tentar se passar por membro da equipe Jagex, pois ela faz parte da equipe.");
	}

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub2() {
		this.method715();
		this.method744(true);
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(III)V")
	private void method708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(Z)I")
	public int method710() {
		return this.anInt862;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "()I")
	@Override
	public synchronized int method5900() {
		return 0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)V")
	private void method711(@OriginalArg(0) int arg0) {
		if ((this.anIntArray42[arg0] & 0x4) == 0) {
			return;
		}
		for (@Pc(23) Class6_Sub10 local23 = (Class6_Sub10) this.aClass6_Sub4_Sub3_1.aClass244_23.method5976(); local23 != null; local23 = (Class6_Sub10) this.aClass6_Sub4_Sub3_1.aClass244_23.method5964()) {
			if (arg0 == local23.anInt1691) {
				local23.anInt1685 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V")
	private void method712(@OriginalArg(1) int arg0) {
		if ((this.anIntArray42[arg0] & 0x2) == 0) {
			return;
		}
		for (@Pc(23) Class6_Sub10 local23 = (Class6_Sub10) this.aClass6_Sub4_Sub3_1.aClass244_23.method5976(); local23 != null; local23 = (Class6_Sub10) this.aClass6_Sub4_Sub3_1.aClass244_23.method5964()) {
			if (local23.anInt1691 == arg0 && this.aClass6_Sub10ArrayArray2[arg0][local23.anInt1694] == null && local23.anInt1693 < 0) {
				local23.anInt1693 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLclient!d;)Z")
	public boolean method714(@OriginalArg(1) Class6_Sub10 arg0) {
		if (arg0.aClass6_Sub4_Sub1_1 != null) {
			return false;
		}
		if (arg0.anInt1693 >= 0) {
			arg0.method6525();
			if (arg0.anInt1692 > 0 && arg0 == this.aClass6_Sub10ArrayArray1[arg0.anInt1691][arg0.anInt1692]) {
				this.aClass6_Sub10ArrayArray1[arg0.anInt1691][arg0.anInt1692] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BII)V")
	private synchronized void method715() {
		for (@Pc(15) int local15 = 0; local15 < 16; local15++) {
			this.anIntArray46[local15] = 256;
		}
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V")
	public synchronized void method716() {
		for (@Pc(7) Class6_Sub35 local7 = (Class6_Sub35) this.aClass74_4.method1889(); local7 != null; local7 = (Class6_Sub35) this.aClass74_4.method1881()) {
			local7.method5208();
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!ii;ILclient!kk;Lclient!he;B)Z")
	public synchronized boolean method717(@OriginalArg(0) Class117 arg0, @OriginalArg(2) Class6_Sub21 arg1, @OriginalArg(3) Class100 arg2) {
		arg1.method3232();
		@Pc(9) boolean local9 = true;
		@Pc(26) int[] local26 = new int[] { 22050 };
		for (@Pc(32) Class6_Sub38 local32 = (Class6_Sub38) arg1.aClass74_20.method1889(); local32 != null; local32 = (Class6_Sub38) arg1.aClass74_20.method1881()) {
			@Pc(38) int local38 = (int) local32.aLong229;
			@Pc(46) Class6_Sub35 local46 = (Class6_Sub35) this.aClass74_4.method1883((long) local38);
			if (local46 == null) {
				local46 = Static181.method2962(arg2, local38);
				if (local46 == null) {
					local9 = false;
					continue;
				}
				this.aClass74_4.method1890((long) local38, local46);
			}
			if (!local46.method5207(local26, arg0, local32.aByteArray80)) {
				local9 = false;
			}
		}
		if (local9) {
			arg1.method3230();
		}
		return local9;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II[ILclient!d;I)Z")
	public boolean method718(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class6_Sub10 arg3) {
		arg3.anInt1687 = Static275.anInt4927 / 100;
		if (arg3.anInt1693 >= 0 && (arg3.aClass6_Sub4_Sub1_1 == null || arg3.aClass6_Sub4_Sub1_1.method434())) {
			arg3.method1337();
			arg3.method6525();
			if (arg3.anInt1692 > 0 && this.aClass6_Sub10ArrayArray1[arg3.anInt1691][arg3.anInt1692] == arg3) {
				this.aClass6_Sub10ArrayArray1[arg3.anInt1691][arg3.anInt1692] = null;
			}
			return true;
		}
		@Pc(56) int local56 = arg3.anInt1681;
		if (local56 > 0) {
			local56 -= (int) (Math.pow(2.0D, (double) this.anIntArray43[arg3.anInt1691] * 4.921259842519685E-4D) * 16.0D + 0.5D);
			if (local56 < 0) {
				local56 = 0;
			}
			arg3.anInt1681 = local56;
		}
		arg3.aClass6_Sub4_Sub1_1.method442(this.method724(arg3));
		@Pc(94) Class190 local94 = arg3.aClass190_1;
		arg3.anInt1679++;
		@Pc(102) boolean local102 = false;
		arg3.anInt1699 += local94.anInt5278;
		@Pc(127) double local127 = (double) ((arg3.anInt1700 * arg3.anInt1681 >> 12) + (arg3.anInt1694 - 60 << 8)) * 5.086263020833333E-6D;
		if (local94.anInt5280 > 0) {
			if (local94.anInt5276 <= 0) {
				arg3.anInt1684 += 128;
			} else {
				arg3.anInt1684 += (int) (Math.pow(2.0D, local127 * (double) local94.anInt5276) * 128.0D + 0.5D);
			}
			if (local94.anInt5280 * arg3.anInt1684 >= 819200) {
				local102 = true;
			}
		}
		if (local94.aByteArray65 != null) {
			if (local94.anInt5273 > 0) {
				arg3.anInt1695 += (int) (Math.pow(2.0D, (double) local94.anInt5273 * local127) * 128.0D + 0.5D);
			} else {
				arg3.anInt1695 += 128;
			}
			while (local94.aByteArray65.length - 2 > arg3.anInt1683 && arg3.anInt1695 > (local94.aByteArray65[arg3.anInt1683 + 2] & 0xFF) << 8) {
				arg3.anInt1683 += 2;
			}
			if (arg3.anInt1683 == local94.aByteArray65.length - 2 && local94.aByteArray65[arg3.anInt1683 + 1] == 0) {
				local102 = true;
			}
		}
		if (arg3.anInt1693 >= 0 && local94.aByteArray64 != null && (this.anIntArray42[arg3.anInt1691] & 0x1) == 0 && (arg3.anInt1692 < 0 || this.aClass6_Sub10ArrayArray1[arg3.anInt1691][arg3.anInt1692] != arg3)) {
			if (local94.anInt5272 <= 0) {
				arg3.anInt1693 += 128;
			} else {
				arg3.anInt1693 += (int) (Math.pow(2.0D, (double) local94.anInt5272 * local127) * 128.0D + 0.5D);
			}
			while (arg3.anInt1690 < local94.aByteArray64.length - 2 && arg3.anInt1693 > (local94.aByteArray64[arg3.anInt1690 + 2] & 0xFF) << 8) {
				arg3.anInt1690 += 2;
			}
			if (local94.aByteArray64.length - 2 == arg3.anInt1690) {
				local102 = true;
			}
		}
		if (!local102) {
			arg3.aClass6_Sub4_Sub1_1.method456(arg3.anInt1687, this.method728(arg3), this.method742(arg3));
			return false;
		}
		arg3.aClass6_Sub4_Sub1_1.method460(arg3.anInt1687);
		if (arg2 == null) {
			arg3.aClass6_Sub4_Sub1_1.method5899(arg1);
		} else {
			arg3.aClass6_Sub4_Sub1_1.method5898(arg2, arg0, arg1);
		}
		if (arg3.aClass6_Sub4_Sub1_1.method439()) {
			this.aClass6_Sub4_Sub3_1.aClass6_Sub4_Sub4_1.method5905(arg3.aClass6_Sub4_Sub1_1);
		}
		arg3.method1337();
		if (arg3.anInt1693 >= 0) {
			arg3.method6525();
			if (arg3.anInt1692 > 0 && this.aClass6_Sub10ArrayArray1[arg3.anInt1691][arg3.anInt1692] == arg3) {
				this.aClass6_Sub10ArrayArray1[arg3.anInt1691][arg3.anInt1692] = null;
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIB)V")
	private void method720() {
		this.anIntArray45[9] = 128;
		this.anIntArray41[9] = 128;
		this.method723(9, 128);
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(II)V")
	private void method721(@OriginalArg(0) int arg0) {
		if (arg0 < 0) {
			for (@Pc(9) int local9 = 0; local9 < 16; local9++) {
				this.method721(local9);
			}
			return;
		}
		this.anIntArray39[arg0] = 12800;
		this.anIntArray37[arg0] = 8192;
		this.anIntArray35[arg0] = 16383;
		this.anIntArray36[arg0] = 8192;
		this.anIntArray40[arg0] = 0;
		this.anIntArray43[arg0] = 8192;
		this.method712(arg0);
		this.method711(arg0);
		this.anIntArray42[arg0] = 0;
		this.anIntArray51[arg0] = 32767;
		this.anIntArray38[arg0] = 256;
		this.lb[arg0] = 0;
		this.method739(arg0, 8192);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5899(@OriginalArg(0) int arg0) {
		if (this.aClass146_1.method3276()) {
			@Pc(18) int local18 = this.anInt843 * this.aClass146_1.anInt3945 / Static275.anInt4927;
			do {
				@Pc(28) long local28 = this.aLong36 + (long) arg0 * (long) local18;
				if (this.aLong35 - local28 >= 0L) {
					this.aLong36 = local28;
					break;
				}
				@Pc(58) int local58 = (int) ((this.aLong35 + (long) local18 - this.aLong36 - 1L) / (long) local18);
				this.aLong36 += (long) local58 * (long) local18;
				this.aClass6_Sub4_Sub3_1.method5899(local58);
				arg0 -= local58;
				this.method730();
			} while (this.aClass146_1.method3276());
		}
		this.aClass6_Sub4_Sub3_1.method5899(arg0);
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(III)V")
	private void method723(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.anIntArray49[arg0] != arg1) {
			this.anIntArray49[arg0] = arg1;
			for (@Pc(22) int local22 = 0; local22 < 128; local22++) {
				this.aClass6_Sub10ArrayArray1[arg0][local22] = null;
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILclient!d;)I")
	private int method724(@OriginalArg(1) Class6_Sub10 arg0) {
		@Pc(15) int local15 = arg0.anInt1686 + (arg0.anInt1681 * arg0.anInt1700 >> 12);
		local15 += (this.anIntArray36[arg0.anInt1691] - 8192) * this.anIntArray38[arg0.anInt1691] >> 12;
		@Pc(36) Class190 local36 = arg0.aClass190_1;
		@Pc(57) int local57;
		if (local36.anInt5278 > 0 && (local36.anInt5271 > 0 || this.anIntArray40[arg0.anInt1691] > 0)) {
			local57 = local36.anInt5271 << 2;
			@Pc(62) int local62 = local36.anInt5277 << 1;
			if (arg0.anInt1679 < local62) {
				local57 = arg0.anInt1679 * local57 / local62;
			}
			local57 += this.anIntArray40[arg0.anInt1691] >> 7;
			@Pc(92) double local92 = Math.sin((double) (arg0.anInt1699 & 0x1FF) * 0.01227184630308513D);
			local15 += (int) ((double) local57 * local92);
		}
		local57 = (int) ((double) (arg0.aClass6_Sub17_Sub1_1.anInt3086 * 256) * Math.pow(2.0D, (double) local15 * 3.255208333333333E-4D) / (double) Static275.anInt4927 + 0.5D);
		return local57 < 1 ? 1 : local57;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!d;ZB)V")
	public void method725(@OriginalArg(0) Class6_Sub10 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) int local8 = arg0.aClass6_Sub17_Sub1_1.aByteArray38.length;
		@Pc(36) int local36;
		if (arg1 && arg0.aClass6_Sub17_Sub1_1.aBoolean195) {
			@Pc(23) int local23 = local8 + local8 - arg0.aClass6_Sub17_Sub1_1.anInt3088;
			local36 = (int) ((long) this.lb[arg0.anInt1691] * (long) local23 >> 6);
			local8 <<= 0x8;
			if (local8 <= local36) {
				arg0.aClass6_Sub4_Sub1_1.method445();
				local36 = local8 + local8 - local36 - 1;
			}
		} else {
			local36 = (int) ((long) local8 * (long) this.lb[arg0.anInt1691] >> 6);
		}
		arg0.aClass6_Sub4_Sub1_1.method449(local36);
	}

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "(B)V")
	public synchronized void method726() {
		this.method733(true);
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(IIII)V")
	private void method727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.method732(arg2, arg1, 64);
		if ((this.anIntArray42[arg1] & 0x2) != 0) {
			for (@Pc(25) Class6_Sub10 local25 = (Class6_Sub10) this.aClass6_Sub4_Sub3_1.aClass244_23.method5974(); local25 != null; local25 = (Class6_Sub10) this.aClass6_Sub4_Sub3_1.aClass244_23.method5978()) {
				if (local25.anInt1691 == arg1 && local25.anInt1693 < 0) {
					this.aClass6_Sub10ArrayArray2[arg1][local25.anInt1694] = null;
					this.aClass6_Sub10ArrayArray2[arg1][arg2] = local25;
					@Pc(68) int local68 = local25.anInt1686 + (local25.anInt1700 * local25.anInt1681 >> 12);
					local25.anInt1686 += arg2 - local25.anInt1694 << 8;
					local25.anInt1681 = 4096;
					local25.anInt1694 = arg2;
					local25.anInt1700 = local68 - local25.anInt1686;
					return;
				}
			}
		}
		@Pc(114) Class6_Sub35 local114 = (Class6_Sub35) this.aClass74_4.method1883((long) this.anIntArray49[arg1]);
		if (local114 == null) {
			return;
		}
		@Pc(122) Class6_Sub17_Sub1 local122 = local114.aClass6_Sub17_Sub1Array1[arg2];
		if (local122 == null) {
			return;
		}
		@Pc(129) Class6_Sub10 local129 = new Class6_Sub10();
		local129.anInt1691 = arg1;
		local129.aClass6_Sub35_1 = local114;
		local129.aClass6_Sub17_Sub1_1 = local122;
		local129.aClass190_1 = local114.aClass190Array1[arg2];
		local129.anInt1692 = local114.aByteArray77[arg2];
		local129.anInt1694 = arg2;
		local129.anInt1697 = local114.anInt6262 * arg0 * arg0 * local114.aByteArray76[arg2] + 1024 >> 11;
		local129.anInt1688 = local114.aByteArray75[arg2] & 0xFF;
		local129.anInt1686 = (arg2 << 8) - (local114.aShortArray93[arg2] & 0x7FFF);
		local129.anInt1693 = -1;
		local129.anInt1683 = 0;
		local129.anInt1690 = 0;
		local129.anInt1684 = 0;
		local129.anInt1695 = 0;
		if (this.lb[arg1] == 0) {
			local129.aClass6_Sub4_Sub1_1 = Static452.method430(local122, this.method724(local129), this.method728(local129), this.method742(local129));
		} else {
			local129.aClass6_Sub4_Sub1_1 = Static452.method430(local122, this.method724(local129), 0, this.method742(local129));
			this.method725(local129, local114.aShortArray93[arg2] < 0);
		}
		if (local114.aShortArray93[arg2] < 0) {
			local129.aClass6_Sub4_Sub1_1.method435(-1);
		}
		if (local129.anInt1692 >= 0) {
			@Pc(281) Class6_Sub10 local281 = this.aClass6_Sub10ArrayArray1[arg1][local129.anInt1692];
			if (local281 != null && local281.anInt1693 < 0) {
				this.aClass6_Sub10ArrayArray2[arg1][local281.anInt1694] = null;
				local281.anInt1693 = 0;
			}
			this.aClass6_Sub10ArrayArray1[arg1][local129.anInt1692] = local129;
		}
		this.aClass6_Sub4_Sub3_1.aClass244_23.method5966(local129);
		this.aClass6_Sub10ArrayArray2[arg1][arg2] = local129;
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "()Lclient!cb;")
	@Override
	public synchronized Class6_Sub4 method5901() {
		return null;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!d;B)I")
	private int method728(@OriginalArg(0) Class6_Sub10 arg0) {
		if (this.anIntArray46[arg0.anInt1691] == 0) {
			return 0;
		}
		@Pc(22) Class190 local22 = arg0.aClass190_1;
		@Pc(38) int local38 = this.anIntArray39[arg0.anInt1691] * this.anIntArray35[arg0.anInt1691] + 4096 >> 13;
		@Pc(46) int local46 = local38 * local38 + 16384 >> 15;
		@Pc(55) int local55 = arg0.anInt1697 * local46 + 16384 >> 15;
		@Pc(64) int local64 = this.anInt862 * local55 + 128 >> 8;
		local38 = local64 * this.anIntArray46[arg0.anInt1691] + 128 >> 8;
		if (local22.anInt5280 > 0) {
			local38 = (int) (Math.pow(0.5D, (double) arg0.anInt1684 * 1.953125E-5D * (double) local22.anInt5280) * (double) local38 + 0.5D);
		}
		@Pc(103) int local103;
		@Pc(111) int local111;
		@Pc(133) int local133;
		@Pc(145) int local145;
		if (local22.aByteArray65 != null) {
			local103 = arg0.anInt1695;
			local111 = local22.aByteArray65[arg0.anInt1683 + 1];
			if (arg0.anInt1683 < local22.aByteArray65.length - 2) {
				local133 = (local22.aByteArray65[arg0.anInt1683] & 0xFF) << 8;
				local145 = (local22.aByteArray65[arg0.anInt1683 + 2] & 0xFF) << 8;
				local111 += (local103 - local133) * (local22.aByteArray65[arg0.anInt1683 + 3] - local111) / (local145 - local133);
			}
			local38 = local111 * local38 + 32 >> 6;
		}
		if (arg0.anInt1693 > 0 && local22.aByteArray64 != null) {
			local103 = arg0.anInt1693;
			local111 = local22.aByteArray64[arg0.anInt1690 + 1];
			if (local22.aByteArray64.length - 2 > arg0.anInt1690) {
				local133 = (local22.aByteArray64[arg0.anInt1690] & 0xFF) << 8;
				local145 = (local22.aByteArray64[arg0.anInt1690 + 2] & 0xFF) << 8;
				local111 += (local103 - local133) * (-local111 + local22.aByteArray64[arg0.anInt1690 - -3]) / (local145 - local133);
			}
			local38 = local111 * local38 + 32 >> 6;
		}
		return local38;
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(BII)V")
	public synchronized void method729() {
		this.method720();
	}

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V")
	private void method730() {
		@Pc(8) int local8 = this.anInt871;
		@Pc(11) int local11 = this.anInt872;
		@Pc(14) long local14 = this.aLong35;
		if (this.aClass6_Sub21_1 != null && local11 == this.anInt873) {
			this.method741(this.aClass6_Sub21_1, this.aBoolean44, this.aBoolean45);
			this.method730();
			return;
		}
		while (local11 == this.anInt872) {
			while (local11 == this.aClass146_1.anIntArray284[local8]) {
				this.aClass146_1.method3269(local8);
				@Pc(47) int local47 = this.aClass146_1.method3275(local8);
				if (local47 == 1) {
					this.aClass146_1.method3265();
					this.aClass146_1.method3267(local8);
					if (this.aClass146_1.method3270()) {
						if (this.aClass6_Sub21_1 != null) {
							this.method740(this.aClass6_Sub21_1, this.aBoolean44);
							this.method730();
							return;
						}
						if (!this.aBoolean44 || local11 == 0) {
							this.method744(true);
							this.aClass146_1.method3280();
							return;
						}
						this.aClass146_1.method3278(local14);
					}
					break;
				}
				if ((local47 & 0x80) != 0) {
					this.method737(local47);
				}
				this.aClass146_1.method3268(local8);
				this.aClass146_1.method3267(local8);
			}
			local8 = this.aClass146_1.method3273();
			local11 = this.aClass146_1.anIntArray284[local8];
			local14 = this.aClass146_1.method3272(local11);
		}
		this.anInt872 = local11;
		this.anInt871 = local8;
		this.aLong35 = local14;
		if (this.aClass6_Sub21_1 != null && local11 > this.anInt873) {
			this.anInt872 = this.anInt873;
			this.anInt871 = -1;
			this.aLong35 = this.aClass146_1.method3272(this.anInt872);
		}
	}

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "()Lclient!cb;")
	@Override
	public synchronized Class6_Sub4 method5904() {
		return this.aClass6_Sub4_Sub3_1;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIBI)V")
	private void method732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(12) Class6_Sub10 local12 = this.aClass6_Sub10ArrayArray2[arg1][arg0];
		if (local12 == null) {
			return;
		}
		this.aClass6_Sub10ArrayArray2[arg1][arg0] = null;
		if ((this.anIntArray42[arg1] & 0x2) == 0) {
			local12.anInt1693 = 0;
			return;
		}
		for (@Pc(48) Class6_Sub10 local48 = (Class6_Sub10) this.aClass6_Sub4_Sub3_1.aClass244_23.method5976(); local48 != null; local48 = (Class6_Sub10) this.aClass6_Sub4_Sub3_1.aClass244_23.method5964()) {
			if (local48.anInt1691 == local12.anInt1691 && local48.anInt1693 < 0 && local48 != local12) {
				local12.anInt1693 = 0;
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZB)V")
	private synchronized void method733(@OriginalArg(0) boolean arg0) {
		this.aClass146_1.method3280();
		this.aClass6_Sub21_1 = null;
		this.method744(arg0);
	}

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "(I)Z")
	public synchronized boolean method734() {
		return this.aClass146_1.method3276();
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(Z)V")
	public synchronized void method735() {
		for (@Pc(11) Class6_Sub35 local11 = (Class6_Sub35) this.aClass74_4.method1889(); local11 != null; local11 = (Class6_Sub35) this.aClass74_4.method1881()) {
			local11.method6525();
		}
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(IIB)V")
	private void method736(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray36[arg1] = arg0;
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(II)V")
	private void method737(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = arg0 & 0xF0;
		@Pc(16) int local16;
		@Pc(22) int local22;
		@Pc(28) int local28;
		if (local9 == 128) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method732(local22, local16, local28);
		} else if (local9 == 144) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local28 <= 0) {
				this.method732(local22, local16, 64);
			} else {
				this.method727(local28, local16, local22);
			}
		} else if (local9 == 160) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			this.method745(local22, local16, local28);
		} else if (local9 == 176) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			local28 = arg0 >> 16 & 0x7F;
			if (local22 == 0) {
				this.anIntArray41[local16] = (this.anIntArray41[local16] & 0xFFE03FFF) + (local28 << 14);
			}
			if (local22 == 32) {
				this.anIntArray41[local16] = (this.anIntArray41[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 1) {
				this.anIntArray40[local16] = (this.anIntArray40[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 33) {
				this.anIntArray40[local16] = local28 + (this.anIntArray40[local16] & 0xFFFFFF80);
			}
			if (local22 == 5) {
				this.anIntArray43[local16] = (local28 << 7) + (this.anIntArray43[local16] & 0xFFFFC07F);
			}
			if (local22 == 37) {
				this.anIntArray43[local16] = (this.anIntArray43[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 7) {
				this.anIntArray39[local16] = (this.anIntArray39[local16] & 0xFFFFC07F) + (local28 << 7);
			}
			if (local22 == 39) {
				this.anIntArray39[local16] = local28 + (this.anIntArray39[local16] & 0xFFFFFF80);
			}
			if (local22 == 10) {
				this.anIntArray37[local16] = (local28 << 7) + (this.anIntArray37[local16] & 0xFFFFC07F);
			}
			if (local22 == 42) {
				this.anIntArray37[local16] = local28 + (this.anIntArray37[local16] & 0xFFFFFF80);
			}
			if (local22 == 11) {
				this.anIntArray35[local16] = (local28 << 7) + (this.anIntArray35[local16] & 0xFFFFC07F);
			}
			if (local22 == 43) {
				this.anIntArray35[local16] = local28 + (this.anIntArray35[local16] & 0xFFFFFF80);
			}
			if (local22 == 64) {
				if (local28 >= 64) {
					this.anIntArray42[local16] |= 0x1;
				} else {
					this.anIntArray42[local16] &= 0xFFFFFFFE;
				}
			}
			if (local22 == 65) {
				if (local28 >= 64) {
					this.anIntArray42[local16] |= 0x2;
				} else {
					this.method712(local16);
					this.anIntArray42[local16] &= 0xFFFFFFFD;
				}
			}
			if (local22 == 99) {
				this.anIntArray51[local16] = (this.anIntArray51[local16] & 0x7F) + (local28 << 7);
			}
			if (local22 == 98) {
				this.anIntArray51[local16] = (this.anIntArray51[local16] & 0x3F80) + local28;
			}
			if (local22 == 101) {
				this.anIntArray51[local16] = (local28 << 7) + (this.anIntArray51[local16] & 0x7F) + 16384;
			}
			if (local22 == 100) {
				this.anIntArray51[local16] = (this.anIntArray51[local16] & 0x3F80) + local28 + 16384;
			}
			if (local22 == 120) {
				this.method747(local16);
			}
			if (local22 == 121) {
				this.method721(local16);
			}
			if (local22 == 123) {
				this.method743(local16);
			}
			@Pc(509) int local509;
			if (local22 == 6) {
				local509 = this.anIntArray51[local16];
				if (local509 == 16384) {
					this.anIntArray38[local16] = (local28 << 7) + (this.anIntArray38[local16] & 0xFFFFC07F);
				}
			}
			if (local22 == 38) {
				local509 = this.anIntArray51[local16];
				if (local509 == 16384) {
					this.anIntArray38[local16] = local28 + (this.anIntArray38[local16] & 0xFFFFFF80);
				}
			}
			if (local22 == 16) {
				this.lb[local16] = (local28 << 7) + (this.lb[local16] & 0xFFFFC07F);
			}
			if (local22 == 48) {
				this.lb[local16] = (this.lb[local16] & 0xFFFFFF80) + local28;
			}
			if (local22 == 81) {
				if (local28 >= 64) {
					this.anIntArray42[local16] |= 0x4;
				} else {
					this.method711(local16);
					this.anIntArray42[local16] &= 0xFFFFFFFB;
				}
			}
			if (local22 == 17) {
				this.method739(local16, (this.anIntArray47[local16] & 0xFFFFC07F) + (local28 << 7));
			}
			if (local22 == 49) {
				this.method739(local16, (this.anIntArray47[local16] & 0xFFFFFF80) + local28);
			}
		} else if (local9 == 192) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method723(local16, local22 + this.anIntArray41[local16]);
		} else if (local9 == 208) {
			local16 = arg0 & 0xF;
			local22 = arg0 >> 8 & 0x7F;
			this.method708(local16, local22);
		} else if (local9 == 224) {
			local16 = arg0 & 0xF;
			local22 = (arg0 >> 9 & 0x3F80) + ((arg0 & 0x7F16) >> 8);
			this.method736(local22, local16);
		} else {
			local9 = arg0 & 0xFF;
			if (local9 == 255) {
				this.method744(true);
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(IIB)V")
	private void method739(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray47[arg0] = arg1;
		this.anIntArray44[arg0] = (int) (Math.pow(2.0D, (double) arg1 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLclient!kk;Z)V")
	public synchronized void method740(@OriginalArg(1) Class6_Sub21 arg0, @OriginalArg(2) boolean arg1) {
		this.method741(arg0, arg1, true);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!kk;ZZB)V")
	private synchronized void method741(@OriginalArg(0) Class6_Sub21 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.method733(arg2);
		this.aClass146_1.method3271(arg0.aByteArray47);
		this.aBoolean44 = arg1;
		this.aLong36 = 0L;
		@Pc(24) int local24 = this.aClass146_1.method3274();
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			this.aClass146_1.method3269(local26);
			this.aClass146_1.method3268(local26);
			this.aClass146_1.method3267(local26);
		}
		this.anInt871 = this.aClass146_1.method3273();
		this.anInt872 = this.aClass146_1.anIntArray284[this.anInt871];
		this.aLong35 = this.aClass146_1.method3272(this.anInt872);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lclient!d;I)I")
	private int method742(@OriginalArg(0) Class6_Sub10 arg0) {
		@Pc(15) int local15 = this.anIntArray37[arg0.anInt1691];
		return local15 >= 8192 ? 16384 - ((16384 - local15) * (128 - arg0.anInt1688) + 32 >> 6) : local15 * arg0.anInt1688 - -32 >> 6;
	}

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "(II)V")
	private void method743(@OriginalArg(0) int arg0) {
		for (@Pc(17) Class6_Sub10 local17 = (Class6_Sub10) this.aClass6_Sub4_Sub3_1.aClass244_23.method5976(); local17 != null; local17 = (Class6_Sub10) this.aClass6_Sub4_Sub3_1.aClass244_23.method5964()) {
			if ((arg0 < 0 || local17.anInt1691 == arg0) && local17.anInt1693 < 0) {
				this.aClass6_Sub10ArrayArray2[local17.anInt1691][local17.anInt1694] = null;
				local17.anInt1693 = 0;
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BZ)V")
	private void method744(@OriginalArg(1) boolean arg0) {
		if (arg0) {
			this.method747(-1);
		} else {
			this.method743(-1);
		}
		this.method721(-1);
		for (@Pc(31) int local31 = 0; local31 < 16; local31++) {
			this.anIntArray49[local31] = this.anIntArray45[local31];
		}
		for (@Pc(47) int local47 = 0; local47 < 16; local47++) {
			this.anIntArray41[local47] = this.anIntArray45[local47] & 0xFFFFFF80;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIZ)V")
	private void method745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZI)V")
	public synchronized void method746(@OriginalArg(1) int arg0) {
		this.anInt862 = arg0;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5898(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aClass146_1.method3276()) {
			@Pc(18) int local18 = this.aClass146_1.anInt3945 * this.anInt843 / Static275.anInt4927;
			do {
				@Pc(27) long local27 = this.aLong36 + (long) local18 * (long) arg2;
				if (this.aLong35 - local27 >= 0L) {
					this.aLong36 = local27;
					break;
				}
				@Pc(56) int local56 = (int) ((this.aLong35 + (long) local18 - this.aLong36 - 1L) / (long) local18);
				this.aLong36 += (long) local18 * (long) local56;
				this.aClass6_Sub4_Sub3_1.method5898(arg0, arg1, local56);
				arg1 += local56;
				arg2 -= local56;
				this.method730();
			} while (this.aClass146_1.method3276());
		}
		this.aClass6_Sub4_Sub3_1.method5898(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "(II)V")
	private void method747(@OriginalArg(1) int arg0) {
		for (@Pc(14) Class6_Sub10 local14 = (Class6_Sub10) this.aClass6_Sub4_Sub3_1.aClass244_23.method5976(); local14 != null; local14 = (Class6_Sub10) this.aClass6_Sub4_Sub3_1.aClass244_23.method5964()) {
			if (arg0 < 0 || arg0 == local14.anInt1691) {
				if (local14.aClass6_Sub4_Sub1_1 != null) {
					local14.aClass6_Sub4_Sub1_1.method460(Static275.anInt4927 / 100);
					if (local14.aClass6_Sub4_Sub1_1.method439()) {
						this.aClass6_Sub4_Sub3_1.aClass6_Sub4_Sub4_1.method5905(local14.aClass6_Sub4_Sub1_1);
					}
					local14.method1337();
				}
				if (local14.anInt1693 < 0) {
					this.aClass6_Sub10ArrayArray2[local14.anInt1691][local14.anInt1694] = null;
				}
				local14.method6525();
			}
		}
	}
}
