import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!td")
public final class Class1_Sub2_Sub1_Sub6 extends Class1_Sub2_Sub1 {

	@OriginalMember(owner = "client!td", name = "N", descriptor = "S")
	public short aShort29;

	@OriginalMember(owner = "client!td", name = "O", descriptor = "[S")
	public short[] aShortArray42;

	@OriginalMember(owner = "client!td", name = "P", descriptor = "[Lclient!nc;")
	public Class58[] aClass58Array1;

	@OriginalMember(owner = "client!td", name = "S", descriptor = "[[I")
	public int[][] anIntArrayArray32;

	@OriginalMember(owner = "client!td", name = "T", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!td", name = "U", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!td", name = "X", descriptor = "[S")
	private short[] aShortArray43;

	@OriginalMember(owner = "client!td", name = "Y", descriptor = "[B")
	private byte[] aByteArray33;

	@OriginalMember(owner = "client!td", name = "Z", descriptor = "[I")
	private int[] anIntArray374;

	@OriginalMember(owner = "client!td", name = "ab", descriptor = "[I")
	public int[] anIntArray375;

	@OriginalMember(owner = "client!td", name = "bb", descriptor = "[S")
	public short[] aShortArray44;

	@OriginalMember(owner = "client!td", name = "cb", descriptor = "I")
	public int anInt3616;

	@OriginalMember(owner = "client!td", name = "db", descriptor = "S")
	public short aShort30;

	@OriginalMember(owner = "client!td", name = "eb", descriptor = "[I")
	public int[] anIntArray376;

	@OriginalMember(owner = "client!td", name = "fb", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!td", name = "ib", descriptor = "S")
	public short aShort31;

	@OriginalMember(owner = "client!td", name = "jb", descriptor = "S")
	public short aShort32;

	@OriginalMember(owner = "client!td", name = "kb", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!td", name = "lb", descriptor = "[I")
	private int[] anIntArray377;

	@OriginalMember(owner = "client!td", name = "mb", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!td", name = "nb", descriptor = "[B")
	private byte[] aByteArray37;

	@OriginalMember(owner = "client!td", name = "ob", descriptor = "[I")
	public int[] anIntArray378;

	@OriginalMember(owner = "client!td", name = "pb", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!td", name = "qb", descriptor = "[[I")
	public int[][] anIntArrayArray33;

	@OriginalMember(owner = "client!td", name = "rb", descriptor = "S")
	public short aShort33;

	@OriginalMember(owner = "client!td", name = "sb", descriptor = "[S")
	private short[] aShortArray45;

	@OriginalMember(owner = "client!td", name = "tb", descriptor = "[I")
	public int[] anIntArray379;

	@OriginalMember(owner = "client!td", name = "ub", descriptor = "[Lclient!nb;")
	public Class57[] aClass57Array1;

	@OriginalMember(owner = "client!td", name = "vb", descriptor = "[S")
	public short[] aShortArray46;

	@OriginalMember(owner = "client!td", name = "wb", descriptor = "[S")
	private short[] aShortArray47;

	@OriginalMember(owner = "client!td", name = "yb", descriptor = "[I")
	public int[] anIntArray380;

	@OriginalMember(owner = "client!td", name = "zb", descriptor = "[S")
	public short[] aShortArray48;

	@OriginalMember(owner = "client!td", name = "Ab", descriptor = "[S")
	public short[] aShortArray49;

	@OriginalMember(owner = "client!td", name = "Bb", descriptor = "S")
	public short aShort34;

	@OriginalMember(owner = "client!td", name = "Cb", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!td", name = "Db", descriptor = "[Lclient!nc;")
	public Class58[] aClass58Array2;

	@OriginalMember(owner = "client!td", name = "Eb", descriptor = "[B")
	private byte[] aByteArray40;

	@OriginalMember(owner = "client!td", name = "Ib", descriptor = "[I")
	public int[] anIntArray384;

	@OriginalMember(owner = "client!td", name = "Jb", descriptor = "S")
	public short aShort35;

	@OriginalMember(owner = "client!td", name = "Q", descriptor = "I")
	public int anInt3615 = 0;

	@OriginalMember(owner = "client!td", name = "hb", descriptor = "Z")
	private boolean aBoolean152 = false;

	@OriginalMember(owner = "client!td", name = "xb", descriptor = "I")
	public int anInt3618 = 0;

	@OriginalMember(owner = "client!td", name = "V", descriptor = "B")
	public byte aByte9 = 0;

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "()V")
	private Class1_Sub2_Sub1_Sub6() {
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub1_Sub6(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method2751(arg0);
		} else {
			this.method2744(arg0);
		}
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "([Lclient!td;I)V")
	public Class1_Sub2_Sub1_Sub6(@OriginalArg(0) Class1_Sub2_Sub1_Sub6[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt3618 = 0;
		this.anInt3615 = 0;
		this.anInt3616 = 0;
		this.aByte9 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class1_Sub2_Sub1_Sub6 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt3618 += local44.anInt3618;
				this.anInt3615 += local44.anInt3615;
				this.anInt3616 += local44.anInt3616;
				if (local44.aByteArray31 == null) {
					if (this.aByte9 == -1) {
						this.aByte9 = local44.aByte9;
					}
					if (this.aByte9 != local44.aByte9) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray39 != null;
				local19 |= local44.aByteArray36 != null;
				local21 |= local44.anIntArray374 != null;
				local23 |= local44.aShortArray48 != null;
				local25 |= local44.aByteArray34 != null;
			}
		}
		this.anIntArray376 = new int[this.anInt3618];
		this.anIntArray375 = new int[this.anInt3618];
		this.anIntArray378 = new int[this.anInt3618];
		this.anIntArray377 = new int[this.anInt3618];
		this.anIntArray380 = new int[this.anInt3615];
		this.anIntArray379 = new int[this.anInt3615];
		this.anIntArray384 = new int[this.anInt3615];
		if (local15) {
			this.aByteArray39 = new byte[this.anInt3615];
		}
		if (local17) {
			this.aByteArray31 = new byte[this.anInt3615];
		}
		if (local19) {
			this.aByteArray36 = new byte[this.anInt3615];
		}
		if (local21) {
			this.anIntArray374 = new int[this.anInt3615];
		}
		if (local23) {
			this.aShortArray48 = new short[this.anInt3615];
		}
		if (local25) {
			this.aByteArray34 = new byte[this.anInt3615];
		}
		this.aShortArray46 = new short[this.anInt3615];
		if (this.anInt3616 > 0) {
			this.aByteArray38 = new byte[this.anInt3616];
			this.aShortArray44 = new short[this.anInt3616];
			this.aShortArray49 = new short[this.anInt3616];
			this.aShortArray42 = new short[this.anInt3616];
			this.aShortArray47 = new short[this.anInt3616];
			this.aShortArray43 = new short[this.anInt3616];
			this.aShortArray45 = new short[this.anInt3616];
			this.aByteArray32 = new byte[this.anInt3616];
			this.aByteArray35 = new byte[this.anInt3616];
			this.aByteArray40 = new byte[this.anInt3616];
			this.aByteArray37 = new byte[this.anInt3616];
			this.aByteArray33 = new byte[this.anInt3616];
		}
		this.anInt3618 = 0;
		this.anInt3615 = 0;
		this.anInt3616 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class1_Sub2_Sub1_Sub6 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt3615; local302++) {
					if (local15 && local298.aByteArray39 != null) {
						this.aByteArray39[this.anInt3615] = local298.aByteArray39[local302];
					}
					if (local17) {
						if (local298.aByteArray31 == null) {
							this.aByteArray31[this.anInt3615] = local298.aByte9;
						} else {
							this.aByteArray31[this.anInt3615] = local298.aByteArray31[local302];
						}
					}
					if (local19 && local298.aByteArray36 != null) {
						this.aByteArray36[this.anInt3615] = local298.aByteArray36[local302];
					}
					if (local21 && local298.anIntArray374 != null) {
						this.anIntArray374[this.anInt3615] = local298.anIntArray374[local302];
					}
					if (local23) {
						if (local298.aShortArray48 == null) {
							this.aShortArray48[this.anInt3615] = -1;
						} else {
							this.aShortArray48[this.anInt3615] = local298.aShortArray48[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray34 == null || local298.aByteArray34[local302] == -1) {
							this.aByteArray34[this.anInt3615] = -1;
						} else {
							this.aByteArray34[this.anInt3615] = (byte) (local298.aByteArray34[local302] + this.anInt3616);
						}
					}
					this.aShortArray46[this.anInt3615] = local298.aShortArray46[local302];
					this.anIntArray380[this.anInt3615] = this.method2760(local298, local298.anIntArray380[local302]);
					this.anIntArray379[this.anInt3615] = this.method2760(local298, local298.anIntArray379[local302]);
					this.anIntArray384[this.anInt3615] = this.method2760(local298, local298.anIntArray384[local302]);
					this.anInt3615++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt3616; local477++) {
					@Pc(489) byte local489 = this.aByteArray38[this.anInt3616] = local298.aByteArray38[local477];
					if (local489 == 0) {
						this.aShortArray44[this.anInt3616] = (short) this.method2760(local298, local298.aShortArray44[local477]);
						this.aShortArray49[this.anInt3616] = (short) this.method2760(local298, local298.aShortArray49[local477]);
						this.aShortArray42[this.anInt3616] = (short) this.method2760(local298, local298.aShortArray42[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray44[this.anInt3616] = local298.aShortArray44[local477];
						this.aShortArray49[this.anInt3616] = local298.aShortArray49[local477];
						this.aShortArray42[this.anInt3616] = local298.aShortArray42[local477];
						this.aShortArray47[this.anInt3616] = local298.aShortArray47[local477];
						this.aShortArray43[this.anInt3616] = local298.aShortArray43[local477];
						this.aShortArray45[this.anInt3616] = local298.aShortArray45[local477];
						this.aByteArray32[this.anInt3616] = local298.aByteArray32[local477];
						this.aByteArray35[this.anInt3616] = local298.aByteArray35[local477];
						this.aByteArray40[this.anInt3616] = local298.aByteArray40[local477];
					}
					if (local489 == 2) {
						this.aByteArray37[this.anInt3616] = local298.aByteArray37[local477];
						this.aByteArray33[this.anInt3616] = local298.aByteArray33[local477];
					}
					this.anInt3616++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "<init>", descriptor = "(Lclient!td;ZZZZ)V")
	public Class1_Sub2_Sub1_Sub6(@OriginalArg(0) Class1_Sub2_Sub1_Sub6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3618 = arg0.anInt3618;
		this.anInt3615 = arg0.anInt3615;
		this.anInt3616 = arg0.anInt3616;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray376 = arg0.anIntArray376;
			this.anIntArray375 = arg0.anIntArray375;
			this.anIntArray378 = arg0.anIntArray378;
		} else {
			this.anIntArray376 = new int[this.anInt3618];
			this.anIntArray375 = new int[this.anInt3618];
			this.anIntArray378 = new int[this.anInt3618];
			for (local57 = 0; local57 < this.anInt3618; local57++) {
				this.anIntArray376[local57] = arg0.anIntArray376[local57];
				this.anIntArray375[local57] = arg0.anIntArray375[local57];
				this.anIntArray378[local57] = arg0.anIntArray378[local57];
			}
		}
		if (arg2) {
			this.aShortArray46 = arg0.aShortArray46;
		} else {
			this.aShortArray46 = new short[this.anInt3615];
			for (local57 = 0; local57 < this.anInt3615; local57++) {
				this.aShortArray46[local57] = arg0.aShortArray46[local57];
			}
		}
		if (arg3 || arg0.aShortArray48 == null) {
			this.aShortArray48 = arg0.aShortArray48;
		} else {
			this.aShortArray48 = new short[this.anInt3615];
			for (local57 = 0; local57 < this.anInt3615; local57++) {
				this.aShortArray48[local57] = arg0.aShortArray48[local57];
			}
		}
		this.aByteArray36 = arg0.aByteArray36;
		this.anIntArray380 = arg0.anIntArray380;
		this.anIntArray379 = arg0.anIntArray379;
		this.anIntArray384 = arg0.anIntArray384;
		this.aByteArray39 = arg0.aByteArray39;
		this.aByteArray31 = arg0.aByteArray31;
		this.aByteArray34 = arg0.aByteArray34;
		this.aByte9 = arg0.aByte9;
		this.aByteArray38 = arg0.aByteArray38;
		this.aShortArray44 = arg0.aShortArray44;
		this.aShortArray49 = arg0.aShortArray49;
		this.aShortArray42 = arg0.aShortArray42;
		this.aShortArray47 = arg0.aShortArray47;
		this.aShortArray43 = arg0.aShortArray43;
		this.aShortArray45 = arg0.aShortArray45;
		this.aByteArray32 = arg0.aByteArray32;
		this.aByteArray35 = arg0.aByteArray35;
		this.aByteArray40 = arg0.aByteArray40;
		this.aByteArray37 = arg0.aByteArray37;
		this.aByteArray33 = arg0.aByteArray33;
		this.anIntArray377 = arg0.anIntArray377;
		this.anIntArray374 = arg0.anIntArray374;
		this.anIntArrayArray33 = arg0.anIntArrayArray33;
		this.anIntArrayArray32 = arg0.anIntArrayArray32;
		this.aClass58Array2 = arg0.aClass58Array2;
		this.aClass57Array1 = arg0.aClass57Array1;
		this.aClass58Array1 = arg0.aClass58Array1;
		this.aShort31 = arg0.aShort31;
		this.aShort35 = arg0.aShort35;
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([B)V")
	private void method2744(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class1_Sub8 local8 = new Class1_Sub8(arg0);
		@Pc(13) Class1_Sub8 local13 = new Class1_Sub8(arg0);
		@Pc(18) Class1_Sub8 local18 = new Class1_Sub8(arg0);
		@Pc(23) Class1_Sub8 local23 = new Class1_Sub8(arg0);
		@Pc(28) Class1_Sub8 local28 = new Class1_Sub8(arg0);
		local8.anInt446 = arg0.length - 18;
		@Pc(38) int local38 = local8.method359();
		@Pc(42) int local42 = local8.method359();
		@Pc(46) int local46 = local8.method336();
		@Pc(50) int local50 = local8.method336();
		@Pc(54) int local54 = local8.method336();
		@Pc(58) int local58 = local8.method336();
		@Pc(62) int local62 = local8.method336();
		@Pc(66) int local66 = local8.method336();
		@Pc(70) int local70 = local8.method359();
		@Pc(74) int local74 = local8.method359();
		@Pc(78) int local78 = local8.method359();
		@Pc(82) int local82 = local8.method359();
		@Pc(90) int local90 = local38;
		@Pc(92) int local92 = local90;
		local90 += local42;
		@Pc(98) int local98 = local90;
		if (local54 == 255) {
			local90 += local42;
		}
		@Pc(107) int local107 = local90;
		if (local62 == 1) {
			local90 += local42;
		}
		@Pc(116) int local116 = local90;
		if (local50 == 1) {
			local90 += local42;
		}
		@Pc(125) int local125 = local90;
		if (local66 == 1) {
			local90 += local38;
		}
		@Pc(134) int local134 = local90;
		if (local58 == 1) {
			local90 += local42;
		}
		@Pc(143) int local143 = local90;
		local90 += local82;
		@Pc(149) int local149 = local90;
		local90 += local42 * 2;
		@Pc(157) int local157 = local90;
		local90 += local46 * 6;
		@Pc(165) int local165 = local90;
		local90 += local70;
		@Pc(171) int local171 = local90;
		local90 += local74;
		this.anInt3618 = local38;
		this.anInt3615 = local42;
		this.anInt3616 = local46;
		this.anIntArray376 = new int[local38];
		this.anIntArray375 = new int[local38];
		this.anIntArray378 = new int[local38];
		this.anIntArray380 = new int[local42];
		this.anIntArray379 = new int[local42];
		this.anIntArray384 = new int[local42];
		if (local46 > 0) {
			this.aByteArray38 = new byte[local46];
			this.aShortArray44 = new short[local46];
			this.aShortArray49 = new short[local46];
			this.aShortArray42 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray377 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray39 = new byte[local42];
			this.aByteArray34 = new byte[local42];
			this.aShortArray48 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray31 = new byte[local42];
		} else {
			this.aByte9 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray36 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray374 = new int[local42];
		}
		this.aShortArray46 = new short[local42];
		local8.anInt446 = 0;
		local13.anInt446 = local165;
		local18.anInt446 = local171;
		local23.anInt446 = local90;
		local28.anInt446 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method336();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method351();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method351();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method351();
			}
			this.anIntArray376[local307] = local301 + local314;
			this.anIntArray375[local307] = local303 + local324;
			this.anIntArray378[local307] = local305 + local334;
			local301 = this.anIntArray376[local307];
			local303 = this.anIntArray375[local307];
			local305 = this.anIntArray378[local307];
			if (local66 == 1) {
				this.anIntArray377[local307] = local28.method336();
			}
		}
		local8.anInt446 = local149;
		local13.anInt446 = local116;
		local18.anInt446 = local98;
		local23.anInt446 = local134;
		local28.anInt446 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray46[local312] = (short) local8.method359();
			if (local50 == 1) {
				local314 = local13.method336();
				if ((local314 & 0x1) == 1) {
					this.aByteArray39[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray39[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray34[local312] = (byte) (local314 >> 2);
					this.aShortArray48[local312] = this.aShortArray46[local312];
					this.aShortArray46[local312] = 127;
					if (this.aShortArray48[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray34[local312] = -1;
					this.aShortArray48[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray31[local312] = local18.method339();
			}
			if (local58 == 1) {
				this.aByteArray36[local312] = local23.method339();
			}
			if (local62 == 1) {
				this.anIntArray374[local312] = local28.method336();
			}
		}
		local8.anInt446 = local143;
		local13.anInt446 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method336();
			if (local543 == 1) {
				local314 = local8.method351() + local536;
				local324 = local8.method351() + local314;
				local334 = local8.method351() + local324;
				local536 = local334;
				this.anIntArray380[local538] = local314;
				this.anIntArray379[local538] = local324;
				this.anIntArray384[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method351() + local536;
				local536 = local334;
				this.anIntArray380[local538] = local314;
				this.anIntArray379[local538] = local324;
				this.anIntArray384[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method351() + local536;
				local536 = local334;
				this.anIntArray380[local538] = local314;
				this.anIntArray379[local538] = local324;
				this.anIntArray384[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method351() + local536;
				local536 = local334;
				this.anIntArray380[local538] = local314;
				this.anIntArray379[local538] = local646;
				this.anIntArray384[local538] = local334;
			}
		}
		local8.anInt446 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray38[local543] = 0;
			this.aShortArray44[local543] = (short) local8.method359();
			this.aShortArray49[local543] = (short) local8.method359();
			this.aShortArray42[local543] = (short) local8.method359();
		}
		if (this.aByteArray34 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray34[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray44[local731] & 0xFFFF) == this.anIntArray380[local723] && (this.aShortArray49[local731] & 0xFFFF) == this.anIntArray379[local723] && (this.aShortArray42[local731] & 0xFFFF) == this.anIntArray384[local723]) {
						this.aByteArray34[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray34 = null;
			}
		}
		if (!local3) {
			this.aShortArray48 = null;
		}
		if (!local1) {
			this.aByteArray39 = null;
		}
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIIIZZ)Lclient!oh;")
	public Class1_Sub2_Sub1_Sub4 method2745(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class1_Sub2_Sub1_Sub4_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "()V")
	public void method2746() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray377 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt3618; local9++) {
				local15 = this.anIntArray377[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray33 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray33[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt3618) {
				local65 = this.anIntArray377[local59];
				this.anIntArrayArray33[local65][local5[local65]++] = local59++;
			}
			this.anIntArray377 = null;
		}
		if (this.anIntArray374 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt3615; local9++) {
			local15 = this.anIntArray374[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray32 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray32[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt3615) {
			local65 = this.anIntArray374[local59];
			this.anIntArrayArray32[local65][local5[local65]++] = local59++;
		}
		this.anIntArray374 = null;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "()V")
	public void method2747() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3615; local1++) {
			@Pc(7) int local7 = this.anIntArray380[local1];
			this.anIntArray380[local1] = this.anIntArray384[local1];
			this.anIntArray384[local1] = local7;
		}
		this.method2754();
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "()V")
	public void method2748() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3618; local1++) {
			@Pc(7) int local7 = this.anIntArray378[local1];
			this.anIntArray378[local1] = this.anIntArray376[local1];
			this.anIntArray376[local1] = -local7;
		}
		this.method2754();
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "()V")
	public void method2749() {
		if (this.aClass58Array2 != null) {
			return;
		}
		this.aClass58Array2 = new Class58[this.anInt3618];
		for (@Pc(10) int local10 = 0; local10 < this.anInt3618; local10++) {
			this.aClass58Array2[local10] = new Class58();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt3615; local25++) {
			@Pc(31) int local31 = this.anIntArray380[local25];
			@Pc(36) int local36 = this.anIntArray379[local25];
			@Pc(41) int local41 = this.anIntArray384[local25];
			@Pc(51) int local51 = this.anIntArray376[local36] - this.anIntArray376[local31];
			@Pc(61) int local61 = this.anIntArray375[local36] - this.anIntArray375[local31];
			@Pc(71) int local71 = this.anIntArray378[local36] - this.anIntArray378[local31];
			@Pc(81) int local81 = this.anIntArray376[local41] - this.anIntArray376[local31];
			@Pc(91) int local91 = this.anIntArray375[local41] - this.anIntArray375[local31];
			@Pc(101) int local101 = this.anIntArray378[local41] - this.anIntArray378[local31];
			@Pc(109) int local109 = local61 * local101 - local91 * local71;
			@Pc(117) int local117 = local71 * local81 - local101 * local51;
			@Pc(125) int local125;
			for (local125 = local51 * local91 - local81 * local61; local109 > 8192 || local117 > 8192 || local125 > 8192 || local109 < -8192 || local117 < -8192 || local125 < -8192; local125 >>= 0x1) {
				local109 >>= 0x1;
				local117 >>= 0x1;
			}
			@Pc(171) int local171 = (int) Math.sqrt((double) (local109 * local109 + local117 * local117 + local125 * local125));
			if (local171 <= 0) {
				local171 = 1;
			}
			local109 = local109 * 256 / local171;
			local117 = local117 * 256 / local171;
			local125 = local125 * 256 / local171;
			@Pc(198) byte local198;
			if (this.aByteArray39 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray39[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class58 local211 = this.aClass58Array2[local31];
				local211.anInt2515 += local109;
				local211.anInt2521 += local117;
				local211.anInt2517 += local125;
				local211.anInt2522++;
				@Pc(240) Class58 local240 = this.aClass58Array2[local36];
				local240.anInt2515 += local109;
				local240.anInt2521 += local117;
				local240.anInt2517 += local125;
				local240.anInt2522++;
				@Pc(269) Class58 local269 = this.aClass58Array2[local41];
				local269.anInt2515 += local109;
				local269.anInt2521 += local117;
				local269.anInt2517 += local125;
				local269.anInt2522++;
			} else if (local198 == 1) {
				if (this.aClass57Array1 == null) {
					this.aClass57Array1 = new Class57[this.anInt3615];
				}
				@Pc(314) Class57 local314 = this.aClass57Array1[local25] = new Class57();
				local314.anInt2506 = local109;
				local314.anInt2510 = local117;
				local314.anInt2511 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "e", descriptor = "()V")
	public void method2750() {
		if (this.aBoolean152) {
			return;
		}
		this.aBoolean152 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt3618; local20++) {
			@Pc(26) int local26 = this.anIntArray376[local20];
			@Pc(31) int local31 = this.anIntArray375[local20];
			@Pc(36) int local36 = this.anIntArray378[local20];
			if (local26 < local8) {
				local8 = local26;
			}
			if (local26 > local14) {
				local14 = local26;
			}
			if (local31 < local10) {
				local10 = local31;
			}
			if (local31 > local16) {
				local16 = local31;
			}
			if (local36 < local12) {
				local12 = local36;
			}
			if (local36 > local18) {
				local18 = local36;
			}
		}
		this.aShort29 = (short) local8;
		this.aShort30 = (short) local14;
		super.aShort36 = (short) local10;
		this.aShort33 = (short) local16;
		this.aShort32 = (short) local12;
		this.aShort34 = (short) local18;
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "([B)V")
	private void method2751(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub8 local4 = new Class1_Sub8(arg0);
		@Pc(9) Class1_Sub8 local9 = new Class1_Sub8(arg0);
		@Pc(14) Class1_Sub8 local14 = new Class1_Sub8(arg0);
		@Pc(19) Class1_Sub8 local19 = new Class1_Sub8(arg0);
		@Pc(24) Class1_Sub8 local24 = new Class1_Sub8(arg0);
		@Pc(29) Class1_Sub8 local29 = new Class1_Sub8(arg0);
		@Pc(34) Class1_Sub8 local34 = new Class1_Sub8(arg0);
		local4.anInt446 = arg0.length - 23;
		@Pc(44) int local44 = local4.method359();
		@Pc(48) int local48 = local4.method359();
		@Pc(52) int local52 = local4.method336();
		@Pc(56) int local56 = local4.method336();
		@Pc(60) int local60 = local4.method336();
		@Pc(64) int local64 = local4.method336();
		@Pc(68) int local68 = local4.method336();
		@Pc(72) int local72 = local4.method336();
		@Pc(76) int local76 = local4.method336();
		@Pc(80) int local80 = local4.method359();
		@Pc(84) int local84 = local4.method359();
		@Pc(88) int local88 = local4.method359();
		@Pc(92) int local92 = local4.method359();
		@Pc(96) int local96 = local4.method359();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray38 = new byte[local52];
			local4.anInt446 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray38[local113] = local4.method339();
				if (local123 == 0) {
					local98++;
				}
				if (local123 >= 1 && local123 <= 3) {
					local100++;
				}
				if (local123 == 2) {
					local102++;
				}
			}
		}
		local113 = local52 + local44;
		@Pc(151) int local151 = local113;
		if (local56 == 1) {
			local113 += local48;
		}
		@Pc(160) int local160 = local113;
		local113 += local48;
		@Pc(166) int local166 = local113;
		if (local60 == 255) {
			local113 += local48;
		}
		@Pc(175) int local175 = local113;
		if (local68 == 1) {
			local113 += local48;
		}
		@Pc(184) int local184 = local113;
		if (local76 == 1) {
			local113 += local44;
		}
		@Pc(193) int local193 = local113;
		if (local64 == 1) {
			local113 += local48;
		}
		@Pc(202) int local202 = local113;
		local113 += local92;
		@Pc(208) int local208 = local113;
		if (local72 == 1) {
			local113 += local48 * 2;
		}
		@Pc(219) int local219 = local113;
		local113 += local96;
		@Pc(225) int local225 = local113;
		local113 += local48 * 2;
		@Pc(233) int local233 = local113;
		local113 += local80;
		@Pc(239) int local239 = local113;
		local113 += local84;
		@Pc(245) int local245 = local113;
		local113 += local88;
		@Pc(251) int local251 = local113;
		local113 += local98 * 6;
		@Pc(259) int local259 = local113;
		local113 += local100 * 6;
		@Pc(267) int local267 = local113;
		local113 += local100 * 6;
		@Pc(275) int local275 = local113;
		local113 += local100;
		@Pc(281) int local281 = local113;
		local113 += local100;
		@Pc(287) int local287 = local113;
		local113 += local100 + local102 * 2;
		this.anInt3618 = local44;
		this.anInt3615 = local48;
		this.anInt3616 = local52;
		this.anIntArray376 = new int[local44];
		this.anIntArray375 = new int[local44];
		this.anIntArray378 = new int[local44];
		this.anIntArray380 = new int[local48];
		this.anIntArray379 = new int[local48];
		this.anIntArray384 = new int[local48];
		if (local76 == 1) {
			this.anIntArray377 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray39 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray31 = new byte[local48];
		} else {
			this.aByte9 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray36 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray374 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray48 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray34 = new byte[local48];
		}
		this.aShortArray46 = new short[local48];
		if (local52 > 0) {
			this.aShortArray44 = new short[local52];
			this.aShortArray49 = new short[local52];
			this.aShortArray42 = new short[local52];
			if (local100 > 0) {
				this.aShortArray47 = new short[local100];
				this.aShortArray43 = new short[local100];
				this.aShortArray45 = new short[local100];
				this.aByteArray32 = new byte[local100];
				this.aByteArray35 = new byte[local100];
				this.aByteArray40 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray37 = new byte[local102];
				this.aByteArray33 = new byte[local102];
			}
		}
		local4.anInt446 = local52;
		local9.anInt446 = local233;
		local14.anInt446 = local239;
		local19.anInt446 = local245;
		local24.anInt446 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method336();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method351();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method351();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method351();
			}
			this.anIntArray376[local463] = local457 + local470;
			this.anIntArray375[local463] = local459 + local480;
			this.anIntArray378[local463] = local461 + local490;
			local457 = this.anIntArray376[local463];
			local459 = this.anIntArray375[local463];
			local461 = this.anIntArray378[local463];
			if (local76 == 1) {
				this.anIntArray377[local463] = local24.method336();
			}
		}
		local4.anInt446 = local225;
		local9.anInt446 = local151;
		local14.anInt446 = local166;
		local19.anInt446 = local193;
		local24.anInt446 = local175;
		local29.anInt446 = local208;
		local34.anInt446 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray46[local468] = (short) local4.method359();
			if (local56 == 1) {
				this.aByteArray39[local468] = local9.method339();
			}
			if (local60 == 255) {
				this.aByteArray31[local468] = local14.method339();
			}
			if (local64 == 1) {
				this.aByteArray36[local468] = local19.method339();
			}
			if (local68 == 1) {
				this.anIntArray374[local468] = local24.method336();
			}
			if (local72 == 1) {
				this.aShortArray48[local468] = (short) (local29.method359() - 1);
			}
			if (this.aByteArray34 != null) {
				if (this.aShortArray48[local468] == -1) {
					this.aByteArray34[local468] = -1;
				} else {
					this.aByteArray34[local468] = (byte) (local34.method336() - 1);
				}
			}
		}
		local4.anInt446 = local202;
		local9.anInt446 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(676) int local676 = 0;
		@Pc(683) int local683;
		@Pc(786) int local786;
		for (@Pc(678) int local678 = 0; local678 < local48; local678++) {
			local683 = local9.method336();
			if (local683 == 1) {
				local470 = local4.method351() + local676;
				local480 = local4.method351() + local470;
				local490 = local4.method351() + local480;
				local676 = local490;
				this.anIntArray380[local678] = local470;
				this.anIntArray379[local678] = local480;
				this.anIntArray384[local678] = local490;
			}
			if (local683 == 2) {
				local480 = local490;
				local490 = local4.method351() + local676;
				local676 = local490;
				this.anIntArray380[local678] = local470;
				this.anIntArray379[local678] = local480;
				this.anIntArray384[local678] = local490;
			}
			if (local683 == 3) {
				local470 = local490;
				local490 = local4.method351() + local676;
				local676 = local490;
				this.anIntArray380[local678] = local470;
				this.anIntArray379[local678] = local480;
				this.anIntArray384[local678] = local490;
			}
			if (local683 == 4) {
				local786 = local470;
				local470 = local480;
				local480 = local786;
				local490 = local4.method351() + local676;
				local676 = local490;
				this.anIntArray380[local678] = local470;
				this.anIntArray379[local678] = local786;
				this.anIntArray384[local678] = local490;
			}
		}
		local4.anInt446 = local251;
		local9.anInt446 = local259;
		local14.anInt446 = local267;
		local19.anInt446 = local275;
		local24.anInt446 = local281;
		local29.anInt446 = local287;
		for (local683 = 0; local683 < local52; local683++) {
			local786 = this.aByteArray38[local683] & 0xFF;
			if (local786 == 0) {
				this.aShortArray44[local683] = (short) local4.method359();
				this.aShortArray49[local683] = (short) local4.method359();
				this.aShortArray42[local683] = (short) local4.method359();
			}
			if (local786 == 1) {
				this.aShortArray44[local683] = (short) local9.method359();
				this.aShortArray49[local683] = (short) local9.method359();
				this.aShortArray42[local683] = (short) local9.method359();
				this.aShortArray47[local683] = (short) local14.method359();
				this.aShortArray43[local683] = (short) local14.method359();
				this.aShortArray45[local683] = (short) local14.method359();
				this.aByteArray32[local683] = local19.method339();
				this.aByteArray35[local683] = local24.method339();
				this.aByteArray40[local683] = local29.method339();
			}
			if (local786 == 2) {
				this.aShortArray44[local683] = (short) local9.method359();
				this.aShortArray49[local683] = (short) local9.method359();
				this.aShortArray42[local683] = (short) local9.method359();
				this.aShortArray47[local683] = (short) local14.method359();
				this.aShortArray43[local683] = (short) local14.method359();
				this.aShortArray45[local683] = (short) local14.method359();
				this.aByteArray32[local683] = local19.method339();
				this.aByteArray35[local683] = local24.method339();
				this.aByteArray40[local683] = local29.method339();
				this.aByteArray37[local683] = local29.method339();
				this.aByteArray33[local683] = local29.method339();
			}
			if (local786 == 3) {
				this.aShortArray44[local683] = (short) local9.method359();
				this.aShortArray49[local683] = (short) local9.method359();
				this.aShortArray42[local683] = (short) local9.method359();
				this.aShortArray47[local683] = (short) local14.method359();
				this.aShortArray43[local683] = (short) local14.method359();
				this.aShortArray45[local683] = (short) local14.method359();
				this.aByteArray32[local683] = local19.method339();
				this.aByteArray35[local683] = local24.method339();
				this.aByteArray40[local683] = local29.method339();
			}
		}
		local4.anInt446 = local113;
		local786 = local4.method336();
		if (local786 == 0) {
			return;
		}
		new Class20();
		local4.method359();
		local4.method359();
		local4.method359();
		local4.method347();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(SS)V")
	public void method2752(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3615; local1++) {
			if (this.aShortArray46[local1] == arg0) {
				this.aShortArray46[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "c", descriptor = "(III)V")
	public void method2753(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3618; local1++) {
			this.anIntArray376[local1] = this.anIntArray376[local1] * arg0 / 128;
			this.anIntArray375[local1] = this.anIntArray375[local1] * arg1 / 128;
			this.anIntArray378[local1] = this.anIntArray378[local1] * arg2 / 128;
		}
		this.method2754();
	}

	@OriginalMember(owner = "client!td", name = "f", descriptor = "()V")
	private void method2754() {
		this.aClass58Array2 = null;
		this.aClass58Array1 = null;
		this.aClass57Array1 = null;
		this.aBoolean152 = false;
	}

	@OriginalMember(owner = "client!td", name = "g", descriptor = "()V")
	public void method2755() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3618; local1++) {
			@Pc(7) int local7 = this.anIntArray376[local1];
			this.anIntArray376[local1] = this.anIntArray378[local1];
			this.anIntArray378[local1] = -local7;
		}
		this.method2754();
	}

	@OriginalMember(owner = "client!td", name = "b", descriptor = "(SS)V")
	public void method2756(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray48 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt3615; local5++) {
			if (this.aShortArray48[local5] == arg0) {
				this.aShortArray48[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!td", name = "h", descriptor = "()Lclient!td;")
	public Class1_Sub2_Sub1_Sub6 method2757() {
		@Pc(3) Class1_Sub2_Sub1_Sub6 local3 = new Class1_Sub2_Sub1_Sub6();
		if (this.aByteArray39 != null) {
			local3.aByteArray39 = new byte[this.anInt3615];
			for (@Pc(13) int local13 = 0; local13 < this.anInt3615; local13++) {
				local3.aByteArray39[local13] = this.aByteArray39[local13];
			}
		}
		local3.anInt3618 = this.anInt3618;
		local3.anInt3615 = this.anInt3615;
		local3.anInt3616 = this.anInt3616;
		local3.anIntArray376 = this.anIntArray376;
		local3.anIntArray375 = this.anIntArray375;
		local3.anIntArray378 = this.anIntArray378;
		local3.anIntArray380 = this.anIntArray380;
		local3.anIntArray379 = this.anIntArray379;
		local3.anIntArray384 = this.anIntArray384;
		local3.aByteArray31 = this.aByteArray31;
		local3.aByteArray36 = this.aByteArray36;
		local3.aByteArray34 = this.aByteArray34;
		local3.aShortArray46 = this.aShortArray46;
		local3.aShortArray48 = this.aShortArray48;
		local3.aByte9 = this.aByte9;
		local3.aByteArray38 = this.aByteArray38;
		local3.aShortArray44 = this.aShortArray44;
		local3.aShortArray49 = this.aShortArray49;
		local3.aShortArray42 = this.aShortArray42;
		local3.aShortArray47 = this.aShortArray47;
		local3.aShortArray43 = this.aShortArray43;
		local3.aShortArray45 = this.aShortArray45;
		local3.aByteArray32 = this.aByteArray32;
		local3.aByteArray35 = this.aByteArray35;
		local3.aByteArray40 = this.aByteArray40;
		local3.aByteArray37 = this.aByteArray37;
		local3.aByteArray33 = this.aByteArray33;
		local3.anIntArray377 = this.anIntArray377;
		local3.anIntArray374 = this.anIntArray374;
		local3.anIntArrayArray33 = this.anIntArrayArray33;
		local3.anIntArrayArray32 = this.anIntArrayArray32;
		local3.aClass58Array2 = this.aClass58Array2;
		local3.aClass57Array1 = this.aClass57Array1;
		local3.aShort31 = this.aShort31;
		local3.aShort35 = this.aShort35;
		return local3;
	}

	@OriginalMember(owner = "client!td", name = "j", descriptor = "()V")
	public void method2759() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3618; local1++) {
			this.anIntArray376[local1] = -this.anIntArray376[local1];
			this.anIntArray378[local1] = -this.anIntArray378[local1];
		}
		this.method2754();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(Lclient!td;I)I")
	private int method2760(@OriginalArg(0) Class1_Sub2_Sub1_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray376[arg1];
		@Pc(11) int local11 = arg0.anIntArray375[arg1];
		@Pc(16) int local16 = arg0.anIntArray378[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt3618; local18++) {
			if (local6 == this.anIntArray376[local18] && local11 == this.anIntArray375[local18] && local16 == this.anIntArray378[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray376[this.anInt3618] = local6;
			this.anIntArray375[this.anInt3618] = local11;
			this.anIntArray378[this.anInt3618] = local16;
			if (arg0.anIntArray377 != null) {
				this.anIntArray377[this.anInt3618] = arg0.anIntArray377[arg1];
			}
			local1 = this.anInt3618++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(III)V")
	public void method2761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3618; local1++) {
			this.anIntArray376[local1] += arg0;
			this.anIntArray375[local1] += arg1;
			this.anIntArray378[local1] += arg2;
		}
		this.method2754();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([[IIIIZI)Lclient!td;")
	public Class1_Sub2_Sub1_Sub6 method2762(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method2750();
		@Pc(6) int local6 = arg1 + this.aShort29;
		@Pc(11) int local11 = arg1 + this.aShort30;
		@Pc(16) int local16 = arg3 + this.aShort32;
		@Pc(21) int local21 = arg3 + this.aShort34;
		if (local6 < 0 || local11 + 128 >> 7 >= arg0.length || local16 < 0 || local21 + 128 >> 7 >= arg0[0].length) {
			return this;
		}
		local6 >>= 0x7;
		local11 = local11 + 127 >> 7;
		local16 >>= 0x7;
		local21 = local21 + 127 >> 7;
		if (arg0[local6][local16] == arg2 && arg0[local11][local16] == arg2 && arg0[local6][local21] == arg2 && arg0[local11][local21] == arg2) {
			return this;
		}
		@Pc(101) Class1_Sub2_Sub1_Sub6 local101 = new Class1_Sub2_Sub1_Sub6();
		local101.anInt3618 = this.anInt3618;
		local101.anInt3615 = this.anInt3615;
		local101.anInt3616 = this.anInt3616;
		local101.anIntArray376 = this.anIntArray376;
		local101.anIntArray378 = this.anIntArray378;
		local101.anIntArray380 = this.anIntArray380;
		local101.anIntArray379 = this.anIntArray379;
		local101.anIntArray384 = this.anIntArray384;
		local101.aByteArray39 = this.aByteArray39;
		local101.aByteArray31 = this.aByteArray31;
		local101.aByteArray36 = this.aByteArray36;
		local101.aByteArray34 = this.aByteArray34;
		local101.aShortArray46 = this.aShortArray46;
		local101.aShortArray48 = this.aShortArray48;
		local101.aByte9 = this.aByte9;
		local101.aByteArray38 = this.aByteArray38;
		local101.aShortArray44 = this.aShortArray44;
		local101.aShortArray49 = this.aShortArray49;
		local101.aShortArray42 = this.aShortArray42;
		local101.aShortArray47 = this.aShortArray47;
		local101.aShortArray43 = this.aShortArray43;
		local101.aShortArray45 = this.aShortArray45;
		local101.aByteArray32 = this.aByteArray32;
		local101.aByteArray35 = this.aByteArray35;
		local101.aByteArray40 = this.aByteArray40;
		local101.aByteArray37 = this.aByteArray37;
		local101.aByteArray33 = this.aByteArray33;
		local101.anIntArray377 = this.anIntArray377;
		local101.anIntArray374 = this.anIntArray374;
		local101.anIntArrayArray33 = this.anIntArrayArray33;
		local101.anIntArrayArray32 = this.anIntArrayArray32;
		local101.aShort31 = this.aShort31;
		local101.aShort35 = this.aShort35;
		local101.anIntArray375 = new int[local101.anInt3618];
		@Pc(245) int local245;
		@Pc(253) int local253;
		@Pc(260) int local260;
		@Pc(264) int local264;
		@Pc(268) int local268;
		@Pc(272) int local272;
		@Pc(276) int local276;
		@Pc(298) int local298;
		@Pc(324) int local324;
		@Pc(336) int local336;
		if (arg4 == 0) {
			for (local245 = 0; local245 < local101.anInt3618; local245++) {
				local253 = this.anIntArray376[local245] + arg1;
				local260 = this.anIntArray378[local245] + arg3;
				local264 = local253 & 0x7F;
				local268 = local260 & 0x7F;
				local272 = local253 >> 7;
				local276 = local260 >> 7;
				local298 = arg0[local272][local276] * (128 - local264) + arg0[local272 + 1][local276] * local264 >> 7;
				local324 = arg0[local272][local276 + 1] * (128 - local264) + arg0[local272 + 1][local276 + 1] * local264 >> 7;
				local336 = local298 * (128 - local268) + local324 * local268 >> 7;
				local101.anIntArray375[local245] = this.anIntArray375[local245] + local336 - arg2;
			}
		} else {
			for (local245 = 0; local245 < local101.anInt3618; local245++) {
				local253 = (this.anIntArray375[local245] << 16) / super.aShort36;
				if (local253 < arg4) {
					local260 = this.anIntArray376[local245] + arg1;
					local264 = this.anIntArray378[local245] + arg3;
					local268 = local260 & 0x7F;
					local272 = local264 & 0x7F;
					local276 = local260 >> 7;
					local298 = local264 >> 7;
					local324 = arg0[local276][local298] * (128 - local268) + arg0[local276 + 1][local298] * local268 >> 7;
					local336 = arg0[local276][local298 + 1] * (128 - local268) + arg0[local276 + 1][local298 + 1] * local268 >> 7;
					@Pc(460) int local460 = local324 * (128 - local272) + local336 * local272 >> 7;
					local101.anIntArray375[local245] = this.anIntArray375[local245] + (local460 - arg2) * (arg4 - local253) / arg4;
				} else {
					local101.anIntArray375[local245] = this.anIntArray375[local245];
				}
			}
		}
		local101.method2754();
		return local101;
	}

	@OriginalMember(owner = "client!td", name = "k", descriptor = "()V")
	public void method2764() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3618; local1++) {
			this.anIntArray378[local1] = -this.anIntArray378[local1];
		}
		this.method2754();
	}

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(I)V")
	public void method2765() {
		@Pc(3) int local3 = Static159.anIntArray382[256];
		@Pc(7) int local7 = Static159.anIntArray383[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3618; local9++) {
			@Pc(26) int local26 = this.anIntArray378[local9] * local3 + this.anIntArray376[local9] * local7 >> 16;
			this.anIntArray378[local9] = this.anIntArray378[local9] * local7 - this.anIntArray376[local9] * local3 >> 16;
			this.anIntArray376[local9] = local26;
		}
		this.method2754();
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IIIII)Lclient!jh;")
	public Class1_Sub2_Sub1_Sub4_Sub1 method2766(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class1_Sub2_Sub1_Sub4_Sub1(this, arg0, arg1, -50, -10, -50);
	}
}
