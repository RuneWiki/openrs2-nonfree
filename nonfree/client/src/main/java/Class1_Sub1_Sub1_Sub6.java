import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class1_Sub1_Sub1_Sub6 extends Class1_Sub1_Sub1 {

	@OriginalMember(owner = "client!sf", name = "X", descriptor = "[B")
	private byte[] aByteArray33;

	@OriginalMember(owner = "client!sf", name = "Y", descriptor = "[S")
	private short[] aShortArray35;

	@OriginalMember(owner = "client!sf", name = "Z", descriptor = "[I")
	public int[] anIntArray494;

	@OriginalMember(owner = "client!sf", name = "bb", descriptor = "[Lclient!ue;")
	public Class83[] aClass83Array1;

	@OriginalMember(owner = "client!sf", name = "db", descriptor = "[B")
	private byte[] aByteArray34;

	@OriginalMember(owner = "client!sf", name = "fb", descriptor = "S")
	public short aShort29;

	@OriginalMember(owner = "client!sf", name = "gb", descriptor = "[I")
	private int[] anIntArray496;

	@OriginalMember(owner = "client!sf", name = "ib", descriptor = "S")
	public short aShort30;

	@OriginalMember(owner = "client!sf", name = "jb", descriptor = "S")
	public short aShort31;

	@OriginalMember(owner = "client!sf", name = "kb", descriptor = "[B")
	public byte[] aByteArray35;

	@OriginalMember(owner = "client!sf", name = "lb", descriptor = "[B")
	private byte[] aByteArray36;

	@OriginalMember(owner = "client!sf", name = "mb", descriptor = "[I")
	public int[] anIntArray497;

	@OriginalMember(owner = "client!sf", name = "nb", descriptor = "S")
	public short aShort32;

	@OriginalMember(owner = "client!sf", name = "pb", descriptor = "S")
	public short aShort33;

	@OriginalMember(owner = "client!sf", name = "qb", descriptor = "[B")
	private byte[] aByteArray37;

	@OriginalMember(owner = "client!sf", name = "rb", descriptor = "[I")
	private int[] anIntArray499;

	@OriginalMember(owner = "client!sf", name = "tb", descriptor = "[S")
	public short[] aShortArray36;

	@OriginalMember(owner = "client!sf", name = "ub", descriptor = "[S")
	private short[] aShortArray37;

	@OriginalMember(owner = "client!sf", name = "vb", descriptor = "[B")
	public byte[] aByteArray38;

	@OriginalMember(owner = "client!sf", name = "wb", descriptor = "[I")
	public int[] anIntArray500;

	@OriginalMember(owner = "client!sf", name = "xb", descriptor = "S")
	public short aShort34;

	@OriginalMember(owner = "client!sf", name = "yb", descriptor = "[Lclient!ue;")
	public Class83[] aClass83Array2;

	@OriginalMember(owner = "client!sf", name = "zb", descriptor = "[Lclient!ld;")
	public Class49[] aClass49Array1;

	@OriginalMember(owner = "client!sf", name = "Ab", descriptor = "[[I")
	public int[][] anIntArrayArray34;

	@OriginalMember(owner = "client!sf", name = "Bb", descriptor = "[S")
	private short[] aShortArray38;

	@OriginalMember(owner = "client!sf", name = "Cb", descriptor = "[S")
	public short[] aShortArray39;

	@OriginalMember(owner = "client!sf", name = "Db", descriptor = "S")
	public short aShort35;

	@OriginalMember(owner = "client!sf", name = "Eb", descriptor = "[I")
	public int[] anIntArray501;

	@OriginalMember(owner = "client!sf", name = "Fb", descriptor = "I")
	public int anInt3773;

	@OriginalMember(owner = "client!sf", name = "Gb", descriptor = "[S")
	public short[] aShortArray40;

	@OriginalMember(owner = "client!sf", name = "Hb", descriptor = "[I")
	public int[] anIntArray502;

	@OriginalMember(owner = "client!sf", name = "Lb", descriptor = "[B")
	public byte[] aByteArray39;

	@OriginalMember(owner = "client!sf", name = "Mb", descriptor = "[B")
	private byte[] aByteArray40;

	@OriginalMember(owner = "client!sf", name = "Nb", descriptor = "[B")
	public byte[] aByteArray41;

	@OriginalMember(owner = "client!sf", name = "Ob", descriptor = "[S")
	public short[] aShortArray41;

	@OriginalMember(owner = "client!sf", name = "Pb", descriptor = "[[I")
	public int[][] anIntArrayArray35;

	@OriginalMember(owner = "client!sf", name = "Qb", descriptor = "[B")
	public byte[] aByteArray42;

	@OriginalMember(owner = "client!sf", name = "Rb", descriptor = "[I")
	public int[] anIntArray505;

	@OriginalMember(owner = "client!sf", name = "Sb", descriptor = "[S")
	public short[] aShortArray42;

	@OriginalMember(owner = "client!sf", name = "eb", descriptor = "I")
	public int anInt3771 = 0;

	@OriginalMember(owner = "client!sf", name = "Kb", descriptor = "I")
	public int anInt3774 = 0;

	@OriginalMember(owner = "client!sf", name = "cb", descriptor = "B")
	public byte aByte8 = 0;

	@OriginalMember(owner = "client!sf", name = "hb", descriptor = "Z")
	private boolean aBoolean192 = false;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	private Class1_Sub1_Sub1_Sub6() {
	}

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "([B)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method2612(arg0);
		} else {
			this.method2605(arg0);
		}
	}

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "([Lclient!sf;I)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) Class1_Sub1_Sub1_Sub6[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt3774 = 0;
		this.anInt3771 = 0;
		this.anInt3773 = 0;
		this.aByte8 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class1_Sub1_Sub1_Sub6 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt3774 += local44.anInt3774;
				this.anInt3771 += local44.anInt3771;
				this.anInt3773 += local44.anInt3773;
				if (local44.aByteArray41 == null) {
					if (this.aByte8 == -1) {
						this.aByte8 = local44.aByte8;
					}
					if (this.aByte8 != local44.aByte8) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray39 != null;
				local19 |= local44.aByteArray42 != null;
				local21 |= local44.anIntArray499 != null;
				local23 |= local44.aShortArray40 != null;
				local25 |= local44.aByteArray38 != null;
			}
		}
		this.anIntArray497 = new int[this.anInt3774];
		this.anIntArray505 = new int[this.anInt3774];
		this.anIntArray500 = new int[this.anInt3774];
		this.anIntArray496 = new int[this.anInt3774];
		this.anIntArray494 = new int[this.anInt3771];
		this.anIntArray501 = new int[this.anInt3771];
		this.anIntArray502 = new int[this.anInt3771];
		if (local15) {
			this.aByteArray39 = new byte[this.anInt3771];
		}
		if (local17) {
			this.aByteArray41 = new byte[this.anInt3771];
		}
		if (local19) {
			this.aByteArray42 = new byte[this.anInt3771];
		}
		if (local21) {
			this.anIntArray499 = new int[this.anInt3771];
		}
		if (local23) {
			this.aShortArray40 = new short[this.anInt3771];
		}
		if (local25) {
			this.aByteArray38 = new byte[this.anInt3771];
		}
		this.aShortArray42 = new short[this.anInt3771];
		if (this.anInt3773 > 0) {
			this.aByteArray35 = new byte[this.anInt3773];
			this.aShortArray36 = new short[this.anInt3773];
			this.aShortArray39 = new short[this.anInt3773];
			this.aShortArray41 = new short[this.anInt3773];
			this.aShortArray35 = new short[this.anInt3773];
			this.aShortArray38 = new short[this.anInt3773];
			this.aShortArray37 = new short[this.anInt3773];
			this.aByteArray37 = new byte[this.anInt3773];
			this.aByteArray40 = new byte[this.anInt3773];
			this.aByteArray33 = new byte[this.anInt3773];
			this.aByteArray34 = new byte[this.anInt3773];
			this.aByteArray36 = new byte[this.anInt3773];
		}
		this.anInt3774 = 0;
		this.anInt3771 = 0;
		this.anInt3773 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class1_Sub1_Sub1_Sub6 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt3771; local302++) {
					if (local15 && local298.aByteArray39 != null) {
						this.aByteArray39[this.anInt3771] = local298.aByteArray39[local302];
					}
					if (local17) {
						if (local298.aByteArray41 == null) {
							this.aByteArray41[this.anInt3771] = local298.aByte8;
						} else {
							this.aByteArray41[this.anInt3771] = local298.aByteArray41[local302];
						}
					}
					if (local19 && local298.aByteArray42 != null) {
						this.aByteArray42[this.anInt3771] = local298.aByteArray42[local302];
					}
					if (local21 && local298.anIntArray499 != null) {
						this.anIntArray499[this.anInt3771] = local298.anIntArray499[local302];
					}
					if (local23) {
						if (local298.aShortArray40 == null) {
							this.aShortArray40[this.anInt3771] = -1;
						} else {
							this.aShortArray40[this.anInt3771] = local298.aShortArray40[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray38 == null || local298.aByteArray38[local302] == -1) {
							this.aByteArray38[this.anInt3771] = -1;
						} else {
							this.aByteArray38[this.anInt3771] = (byte) (local298.aByteArray38[local302] + this.anInt3773);
						}
					}
					this.aShortArray42[this.anInt3771] = local298.aShortArray42[local302];
					this.anIntArray494[this.anInt3771] = this.method2602(local298, local298.anIntArray494[local302]);
					this.anIntArray501[this.anInt3771] = this.method2602(local298, local298.anIntArray501[local302]);
					this.anIntArray502[this.anInt3771] = this.method2602(local298, local298.anIntArray502[local302]);
					this.anInt3771++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt3773; local477++) {
					@Pc(489) byte local489 = this.aByteArray35[this.anInt3773] = local298.aByteArray35[local477];
					if (local489 == 0) {
						this.aShortArray36[this.anInt3773] = (short) this.method2602(local298, local298.aShortArray36[local477]);
						this.aShortArray39[this.anInt3773] = (short) this.method2602(local298, local298.aShortArray39[local477]);
						this.aShortArray41[this.anInt3773] = (short) this.method2602(local298, local298.aShortArray41[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray36[this.anInt3773] = local298.aShortArray36[local477];
						this.aShortArray39[this.anInt3773] = local298.aShortArray39[local477];
						this.aShortArray41[this.anInt3773] = local298.aShortArray41[local477];
						this.aShortArray35[this.anInt3773] = local298.aShortArray35[local477];
						this.aShortArray38[this.anInt3773] = local298.aShortArray38[local477];
						this.aShortArray37[this.anInt3773] = local298.aShortArray37[local477];
						this.aByteArray37[this.anInt3773] = local298.aByteArray37[local477];
						this.aByteArray40[this.anInt3773] = local298.aByteArray40[local477];
						this.aByteArray33[this.anInt3773] = local298.aByteArray33[local477];
					}
					if (local489 == 2) {
						this.aByteArray34[this.anInt3773] = local298.aByteArray34[local477];
						this.aByteArray36[this.anInt3773] = local298.aByteArray36[local477];
					}
					this.anInt3773++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(Lclient!sf;ZZZZ)V")
	public Class1_Sub1_Sub1_Sub6(@OriginalArg(0) Class1_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt3774 = arg0.anInt3774;
		this.anInt3771 = arg0.anInt3771;
		this.anInt3773 = arg0.anInt3773;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray497 = arg0.anIntArray497;
			this.anIntArray505 = arg0.anIntArray505;
			this.anIntArray500 = arg0.anIntArray500;
		} else {
			this.anIntArray497 = new int[this.anInt3774];
			this.anIntArray505 = new int[this.anInt3774];
			this.anIntArray500 = new int[this.anInt3774];
			for (local57 = 0; local57 < this.anInt3774; local57++) {
				this.anIntArray497[local57] = arg0.anIntArray497[local57];
				this.anIntArray505[local57] = arg0.anIntArray505[local57];
				this.anIntArray500[local57] = arg0.anIntArray500[local57];
			}
		}
		if (arg2) {
			this.aShortArray42 = arg0.aShortArray42;
		} else {
			this.aShortArray42 = new short[this.anInt3771];
			for (local57 = 0; local57 < this.anInt3771; local57++) {
				this.aShortArray42[local57] = arg0.aShortArray42[local57];
			}
		}
		if (arg3 || arg0.aShortArray40 == null) {
			this.aShortArray40 = arg0.aShortArray40;
		} else {
			this.aShortArray40 = new short[this.anInt3771];
			for (local57 = 0; local57 < this.anInt3771; local57++) {
				this.aShortArray40[local57] = arg0.aShortArray40[local57];
			}
		}
		this.aByteArray42 = arg0.aByteArray42;
		this.anIntArray494 = arg0.anIntArray494;
		this.anIntArray501 = arg0.anIntArray501;
		this.anIntArray502 = arg0.anIntArray502;
		this.aByteArray39 = arg0.aByteArray39;
		this.aByteArray41 = arg0.aByteArray41;
		this.aByteArray38 = arg0.aByteArray38;
		this.aByte8 = arg0.aByte8;
		this.aByteArray35 = arg0.aByteArray35;
		this.aShortArray36 = arg0.aShortArray36;
		this.aShortArray39 = arg0.aShortArray39;
		this.aShortArray41 = arg0.aShortArray41;
		this.aShortArray35 = arg0.aShortArray35;
		this.aShortArray38 = arg0.aShortArray38;
		this.aShortArray37 = arg0.aShortArray37;
		this.aByteArray37 = arg0.aByteArray37;
		this.aByteArray40 = arg0.aByteArray40;
		this.aByteArray33 = arg0.aByteArray33;
		this.aByteArray34 = arg0.aByteArray34;
		this.aByteArray36 = arg0.aByteArray36;
		this.anIntArray496 = arg0.anIntArray496;
		this.anIntArray499 = arg0.anIntArray499;
		this.anIntArrayArray34 = arg0.anIntArrayArray34;
		this.anIntArrayArray35 = arg0.anIntArrayArray35;
		this.aClass83Array2 = arg0.aClass83Array2;
		this.aClass49Array1 = arg0.aClass49Array1;
		this.aClass83Array1 = arg0.aClass83Array1;
		this.aShort35 = arg0.aShort35;
		this.aShort32 = arg0.aShort32;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "()V")
	public void method2591() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray496 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt3774; local9++) {
				local15 = this.anIntArray496[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray34 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray34[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt3774) {
				local65 = this.anIntArray496[local59];
				this.anIntArrayArray34[local65][local5[local65]++] = local59++;
			}
			this.anIntArray496 = null;
		}
		if (this.anIntArray499 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt3771; local9++) {
			local15 = this.anIntArray499[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray35 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray35[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt3771) {
			local65 = this.anIntArray499[local59];
			this.anIntArrayArray35[local65][local5[local65]++] = local59++;
		}
		this.anIntArray499 = null;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(IIIII)Lclient!gg;")
	public Class1_Sub1_Sub1_Sub2_Sub1 method2592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class1_Sub1_Sub1_Sub2_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(SS)V")
	public void method2593(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3771; local1++) {
			if (this.aShortArray42[local1] == arg0) {
				this.aShortArray42[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(III)V")
	public void method2594(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3774; local1++) {
			this.anIntArray497[local1] += arg0;
			this.anIntArray505[local1] += arg1;
			this.anIntArray500[local1] += arg2;
		}
		this.method2608();
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "()V")
	public void method2595() {
		if (this.aClass83Array2 != null) {
			return;
		}
		this.aClass83Array2 = new Class83[this.anInt3774];
		for (@Pc(10) int local10 = 0; local10 < this.anInt3774; local10++) {
			this.aClass83Array2[local10] = new Class83();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt3771; local25++) {
			@Pc(31) int local31 = this.anIntArray494[local25];
			@Pc(36) int local36 = this.anIntArray501[local25];
			@Pc(41) int local41 = this.anIntArray502[local25];
			@Pc(51) int local51 = this.anIntArray497[local36] - this.anIntArray497[local31];
			@Pc(61) int local61 = this.anIntArray505[local36] - this.anIntArray505[local31];
			@Pc(71) int local71 = this.anIntArray500[local36] - this.anIntArray500[local31];
			@Pc(81) int local81 = this.anIntArray497[local41] - this.anIntArray497[local31];
			@Pc(91) int local91 = this.anIntArray505[local41] - this.anIntArray505[local31];
			@Pc(101) int local101 = this.anIntArray500[local41] - this.anIntArray500[local31];
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
				@Pc(211) Class83 local211 = this.aClass83Array2[local31];
				local211.anInt4015 += local109;
				local211.anInt4021 += local117;
				local211.anInt4017 += local125;
				local211.anInt4019++;
				@Pc(240) Class83 local240 = this.aClass83Array2[local36];
				local240.anInt4015 += local109;
				local240.anInt4021 += local117;
				local240.anInt4017 += local125;
				local240.anInt4019++;
				@Pc(269) Class83 local269 = this.aClass83Array2[local41];
				local269.anInt4015 += local109;
				local269.anInt4021 += local117;
				local269.anInt4017 += local125;
				local269.anInt4019++;
			} else if (local198 == 1) {
				if (this.aClass49Array1 == null) {
					this.aClass49Array1 = new Class49[this.anInt3771];
				}
				@Pc(314) Class49 local314 = this.aClass49Array1[local25] = new Class49();
				local314.anInt2456 = local109;
				local314.anInt2460 = local117;
				local314.anInt2461 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "(I)V")
	public void method2596() {
		@Pc(3) int local3 = Static151.anIntArray498[256];
		@Pc(7) int local7 = Static151.anIntArray495[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt3774; local9++) {
			@Pc(26) int local26 = this.anIntArray500[local9] * local3 + this.anIntArray497[local9] * local7 >> 16;
			this.anIntArray500[local9] = this.anIntArray500[local9] * local7 - this.anIntArray497[local9] * local3 >> 16;
			this.anIntArray497[local9] = local26;
		}
		this.method2608();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "([[IIIIZI)Lclient!sf;")
	public Class1_Sub1_Sub1_Sub6 method2597(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method2607();
		@Pc(6) int local6 = arg1 + this.aShort31;
		@Pc(11) int local11 = arg1 + this.aShort29;
		@Pc(16) int local16 = arg3 + this.aShort33;
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
		@Pc(101) Class1_Sub1_Sub1_Sub6 local101 = new Class1_Sub1_Sub1_Sub6();
		local101.anInt3774 = this.anInt3774;
		local101.anInt3771 = this.anInt3771;
		local101.anInt3773 = this.anInt3773;
		local101.anIntArray497 = this.anIntArray497;
		local101.anIntArray500 = this.anIntArray500;
		local101.anIntArray494 = this.anIntArray494;
		local101.anIntArray501 = this.anIntArray501;
		local101.anIntArray502 = this.anIntArray502;
		local101.aByteArray39 = this.aByteArray39;
		local101.aByteArray41 = this.aByteArray41;
		local101.aByteArray42 = this.aByteArray42;
		local101.aByteArray38 = this.aByteArray38;
		local101.aShortArray42 = this.aShortArray42;
		local101.aShortArray40 = this.aShortArray40;
		local101.aByte8 = this.aByte8;
		local101.aByteArray35 = this.aByteArray35;
		local101.aShortArray36 = this.aShortArray36;
		local101.aShortArray39 = this.aShortArray39;
		local101.aShortArray41 = this.aShortArray41;
		local101.aShortArray35 = this.aShortArray35;
		local101.aShortArray38 = this.aShortArray38;
		local101.aShortArray37 = this.aShortArray37;
		local101.aByteArray37 = this.aByteArray37;
		local101.aByteArray40 = this.aByteArray40;
		local101.aByteArray33 = this.aByteArray33;
		local101.aByteArray34 = this.aByteArray34;
		local101.aByteArray36 = this.aByteArray36;
		local101.anIntArray496 = this.anIntArray496;
		local101.anIntArray499 = this.anIntArray499;
		local101.anIntArrayArray34 = this.anIntArrayArray34;
		local101.anIntArrayArray35 = this.anIntArrayArray35;
		local101.aShort35 = this.aShort35;
		local101.aShort32 = this.aShort32;
		local101.anIntArray505 = new int[local101.anInt3774];
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
			for (local245 = 0; local245 < local101.anInt3774; local245++) {
				local253 = this.anIntArray497[local245] + arg1;
				local260 = this.anIntArray500[local245] + arg3;
				local264 = local253 & 0x7F;
				local268 = local260 & 0x7F;
				local272 = local253 >> 7;
				local276 = local260 >> 7;
				local298 = arg0[local272][local276] * (128 - local264) + arg0[local272 + 1][local276] * local264 >> 7;
				local324 = arg0[local272][local276 + 1] * (128 - local264) + arg0[local272 + 1][local276 + 1] * local264 >> 7;
				local336 = local298 * (128 - local268) + local324 * local268 >> 7;
				local101.anIntArray505[local245] = this.anIntArray505[local245] + local336 - arg2;
			}
		} else {
			for (local245 = 0; local245 < local101.anInt3774; local245++) {
				local253 = (this.anIntArray505[local245] << 16) / super.aShort36;
				if (local253 < arg4) {
					local260 = this.anIntArray497[local245] + arg1;
					local264 = this.anIntArray500[local245] + arg3;
					local268 = local260 & 0x7F;
					local272 = local264 & 0x7F;
					local276 = local260 >> 7;
					local298 = local264 >> 7;
					local324 = arg0[local276][local298] * (128 - local268) + arg0[local276 + 1][local298] * local268 >> 7;
					local336 = arg0[local276][local298 + 1] * (128 - local268) + arg0[local276 + 1][local298 + 1] * local268 >> 7;
					@Pc(460) int local460 = local324 * (128 - local272) + local336 * local272 >> 7;
					local101.anIntArray505[local245] = this.anIntArray505[local245] + (local460 - arg2) * (arg4 - local253) / arg4;
				} else {
					local101.anIntArray505[local245] = this.anIntArray505[local245];
				}
			}
		}
		local101.method2608();
		return local101;
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "()V")
	public void method2600() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3774; local1++) {
			this.anIntArray500[local1] = -this.anIntArray500[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt3771; local18++) {
			@Pc(24) int local24 = this.anIntArray494[local18];
			this.anIntArray494[local18] = this.anIntArray502[local18];
			this.anIntArray502[local18] = local24;
		}
		this.method2608();
	}

	@OriginalMember(owner = "client!sf", name = "e", descriptor = "()Lclient!sf;")
	public Class1_Sub1_Sub1_Sub6 method2601() {
		@Pc(3) Class1_Sub1_Sub1_Sub6 local3 = new Class1_Sub1_Sub1_Sub6();
		if (this.aByteArray39 != null) {
			local3.aByteArray39 = new byte[this.anInt3771];
			for (@Pc(13) int local13 = 0; local13 < this.anInt3771; local13++) {
				local3.aByteArray39[local13] = this.aByteArray39[local13];
			}
		}
		local3.anInt3774 = this.anInt3774;
		local3.anInt3771 = this.anInt3771;
		local3.anInt3773 = this.anInt3773;
		local3.anIntArray497 = this.anIntArray497;
		local3.anIntArray505 = this.anIntArray505;
		local3.anIntArray500 = this.anIntArray500;
		local3.anIntArray494 = this.anIntArray494;
		local3.anIntArray501 = this.anIntArray501;
		local3.anIntArray502 = this.anIntArray502;
		local3.aByteArray41 = this.aByteArray41;
		local3.aByteArray42 = this.aByteArray42;
		local3.aByteArray38 = this.aByteArray38;
		local3.aShortArray42 = this.aShortArray42;
		local3.aShortArray40 = this.aShortArray40;
		local3.aByte8 = this.aByte8;
		local3.aByteArray35 = this.aByteArray35;
		local3.aShortArray36 = this.aShortArray36;
		local3.aShortArray39 = this.aShortArray39;
		local3.aShortArray41 = this.aShortArray41;
		local3.aShortArray35 = this.aShortArray35;
		local3.aShortArray38 = this.aShortArray38;
		local3.aShortArray37 = this.aShortArray37;
		local3.aByteArray37 = this.aByteArray37;
		local3.aByteArray40 = this.aByteArray40;
		local3.aByteArray33 = this.aByteArray33;
		local3.aByteArray34 = this.aByteArray34;
		local3.aByteArray36 = this.aByteArray36;
		local3.anIntArray496 = this.anIntArray496;
		local3.anIntArray499 = this.anIntArray499;
		local3.anIntArrayArray34 = this.anIntArrayArray34;
		local3.anIntArrayArray35 = this.anIntArrayArray35;
		local3.aClass83Array2 = this.aClass83Array2;
		local3.aClass49Array1 = this.aClass49Array1;
		local3.aShort35 = this.aShort35;
		local3.aShort32 = this.aShort32;
		return local3;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!sf;I)I")
	private int method2602(@OriginalArg(0) Class1_Sub1_Sub1_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray497[arg1];
		@Pc(11) int local11 = arg0.anIntArray505[arg1];
		@Pc(16) int local16 = arg0.anIntArray500[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt3774; local18++) {
			if (local6 == this.anIntArray497[local18] && local11 == this.anIntArray505[local18] && local16 == this.anIntArray500[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray497[this.anInt3774] = local6;
			this.anIntArray505[this.anInt3774] = local11;
			this.anIntArray500[this.anInt3774] = local16;
			if (arg0.anIntArray496 != null) {
				this.anIntArray496[this.anInt3774] = arg0.anIntArray496[arg1];
			}
			local1 = this.anInt3774++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(SS)V")
	public void method2603(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray40 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt3771; local5++) {
			if (this.aShortArray40[local5] == arg0) {
				this.aShortArray40[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!sf", name = "f", descriptor = "()V")
	public void method2604() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3774; local1++) {
			@Pc(7) int local7 = this.anIntArray497[local1];
			this.anIntArray497[local1] = this.anIntArray500[local1];
			this.anIntArray500[local1] = -local7;
		}
		this.method2608();
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "([B)V")
	private void method2605(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class1_Sub8 local8 = new Class1_Sub8(arg0);
		@Pc(13) Class1_Sub8 local13 = new Class1_Sub8(arg0);
		@Pc(18) Class1_Sub8 local18 = new Class1_Sub8(arg0);
		@Pc(23) Class1_Sub8 local23 = new Class1_Sub8(arg0);
		@Pc(28) Class1_Sub8 local28 = new Class1_Sub8(arg0);
		local8.anInt1357 = arg0.length - 18;
		@Pc(38) int local38 = local8.method878();
		@Pc(42) int local42 = local8.method878();
		@Pc(46) int local46 = local8.method861();
		@Pc(50) int local50 = local8.method861();
		@Pc(54) int local54 = local8.method861();
		@Pc(58) int local58 = local8.method861();
		@Pc(62) int local62 = local8.method861();
		@Pc(66) int local66 = local8.method861();
		@Pc(70) int local70 = local8.method878();
		@Pc(74) int local74 = local8.method878();
		@Pc(78) int local78 = local8.method878();
		@Pc(82) int local82 = local8.method878();
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
		this.anInt3774 = local38;
		this.anInt3771 = local42;
		this.anInt3773 = local46;
		this.anIntArray497 = new int[local38];
		this.anIntArray505 = new int[local38];
		this.anIntArray500 = new int[local38];
		this.anIntArray494 = new int[local42];
		this.anIntArray501 = new int[local42];
		this.anIntArray502 = new int[local42];
		if (local46 > 0) {
			this.aByteArray35 = new byte[local46];
			this.aShortArray36 = new short[local46];
			this.aShortArray39 = new short[local46];
			this.aShortArray41 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray496 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray39 = new byte[local42];
			this.aByteArray38 = new byte[local42];
			this.aShortArray40 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray41 = new byte[local42];
		} else {
			this.aByte8 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray42 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray499 = new int[local42];
		}
		this.aShortArray42 = new short[local42];
		local8.anInt1357 = 0;
		local13.anInt1357 = local165;
		local18.anInt1357 = local171;
		local23.anInt1357 = local90;
		local28.anInt1357 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method861();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method889();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method889();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method889();
			}
			this.anIntArray497[local307] = local301 + local314;
			this.anIntArray505[local307] = local303 + local324;
			this.anIntArray500[local307] = local305 + local334;
			local301 = this.anIntArray497[local307];
			local303 = this.anIntArray505[local307];
			local305 = this.anIntArray500[local307];
			if (local66 == 1) {
				this.anIntArray496[local307] = local28.method861();
			}
		}
		local8.anInt1357 = local149;
		local13.anInt1357 = local116;
		local18.anInt1357 = local98;
		local23.anInt1357 = local134;
		local28.anInt1357 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray42[local312] = (short) local8.method878();
			if (local50 == 1) {
				local314 = local13.method861();
				if ((local314 & 0x1) == 1) {
					this.aByteArray39[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray39[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray38[local312] = (byte) (local314 >> 2);
					this.aShortArray40[local312] = this.aShortArray42[local312];
					this.aShortArray42[local312] = 127;
					if (this.aShortArray40[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray38[local312] = -1;
					this.aShortArray40[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray41[local312] = local18.method900();
			}
			if (local58 == 1) {
				this.aByteArray42[local312] = local23.method900();
			}
			if (local62 == 1) {
				this.anIntArray499[local312] = local28.method861();
			}
		}
		local8.anInt1357 = local143;
		local13.anInt1357 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method861();
			if (local543 == 1) {
				local314 = local8.method889() + local536;
				local324 = local8.method889() + local314;
				local334 = local8.method889() + local324;
				local536 = local334;
				this.anIntArray494[local538] = local314;
				this.anIntArray501[local538] = local324;
				this.anIntArray502[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method889() + local536;
				local536 = local334;
				this.anIntArray494[local538] = local314;
				this.anIntArray501[local538] = local324;
				this.anIntArray502[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method889() + local536;
				local536 = local334;
				this.anIntArray494[local538] = local314;
				this.anIntArray501[local538] = local324;
				this.anIntArray502[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method889() + local536;
				local536 = local334;
				this.anIntArray494[local538] = local314;
				this.anIntArray501[local538] = local646;
				this.anIntArray502[local538] = local334;
			}
		}
		local8.anInt1357 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray35[local543] = 0;
			this.aShortArray36[local543] = (short) local8.method878();
			this.aShortArray39[local543] = (short) local8.method878();
			this.aShortArray41[local543] = (short) local8.method878();
		}
		if (this.aByteArray38 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray38[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray36[local731] & 0xFFFF) == this.anIntArray494[local723] && (this.aShortArray39[local731] & 0xFFFF) == this.anIntArray501[local723] && (this.aShortArray41[local731] & 0xFFFF) == this.anIntArray502[local723]) {
						this.aByteArray38[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray38 = null;
			}
		}
		if (!local3) {
			this.aShortArray40 = null;
		}
		if (!local1) {
			this.aByteArray39 = null;
		}
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(III)V")
	public void method2606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3774; local1++) {
			this.anIntArray497[local1] = this.anIntArray497[local1] * arg0 / 128;
			this.anIntArray505[local1] = this.anIntArray505[local1] * arg1 / 128;
			this.anIntArray500[local1] = this.anIntArray500[local1] * arg2 / 128;
		}
		this.method2608();
	}

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "()V")
	public void method2607() {
		if (this.aBoolean192) {
			return;
		}
		this.aBoolean192 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt3774; local20++) {
			@Pc(26) int local26 = this.anIntArray497[local20];
			@Pc(31) int local31 = this.anIntArray505[local20];
			@Pc(36) int local36 = this.anIntArray500[local20];
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
		this.aShort31 = (short) local8;
		this.aShort29 = (short) local14;
		super.aShort36 = (short) local10;
		this.aShort30 = (short) local16;
		this.aShort33 = (short) local12;
		this.aShort34 = (short) local18;
	}

	@OriginalMember(owner = "client!sf", name = "h", descriptor = "()V")
	private void method2608() {
		this.aClass83Array2 = null;
		this.aClass83Array1 = null;
		this.aClass49Array1 = null;
		this.aBoolean192 = false;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIZZ)Lclient!w;")
	public Class1_Sub1_Sub1_Sub2 method2609(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5) {
		return new Class1_Sub1_Sub1_Sub2_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!sf", name = "i", descriptor = "()V")
	public void method2611() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3774; local1++) {
			this.anIntArray497[local1] = -this.anIntArray497[local1];
			this.anIntArray500[local1] = -this.anIntArray500[local1];
		}
		this.method2608();
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "([B)V")
	private void method2612(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub8 local4 = new Class1_Sub8(arg0);
		@Pc(9) Class1_Sub8 local9 = new Class1_Sub8(arg0);
		@Pc(14) Class1_Sub8 local14 = new Class1_Sub8(arg0);
		@Pc(19) Class1_Sub8 local19 = new Class1_Sub8(arg0);
		@Pc(24) Class1_Sub8 local24 = new Class1_Sub8(arg0);
		@Pc(29) Class1_Sub8 local29 = new Class1_Sub8(arg0);
		@Pc(34) Class1_Sub8 local34 = new Class1_Sub8(arg0);
		local4.anInt1357 = arg0.length - 23;
		@Pc(44) int local44 = local4.method878();
		@Pc(48) int local48 = local4.method878();
		@Pc(52) int local52 = local4.method861();
		@Pc(56) int local56 = local4.method861();
		@Pc(60) int local60 = local4.method861();
		@Pc(64) int local64 = local4.method861();
		@Pc(68) int local68 = local4.method861();
		@Pc(72) int local72 = local4.method861();
		@Pc(76) int local76 = local4.method861();
		@Pc(80) int local80 = local4.method878();
		@Pc(84) int local84 = local4.method878();
		@Pc(88) int local88 = local4.method878();
		@Pc(92) int local92 = local4.method878();
		@Pc(96) int local96 = local4.method878();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray35 = new byte[local52];
			local4.anInt1357 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray35[local113] = local4.method900();
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
		this.anInt3774 = local44;
		this.anInt3771 = local48;
		this.anInt3773 = local52;
		this.anIntArray497 = new int[local44];
		this.anIntArray505 = new int[local44];
		this.anIntArray500 = new int[local44];
		this.anIntArray494 = new int[local48];
		this.anIntArray501 = new int[local48];
		this.anIntArray502 = new int[local48];
		if (local76 == 1) {
			this.anIntArray496 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray39 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray41 = new byte[local48];
		} else {
			this.aByte8 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray42 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray499 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray40 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray38 = new byte[local48];
		}
		this.aShortArray42 = new short[local48];
		if (local52 > 0) {
			this.aShortArray36 = new short[local52];
			this.aShortArray39 = new short[local52];
			this.aShortArray41 = new short[local52];
			if (local100 > 0) {
				this.aShortArray35 = new short[local100];
				this.aShortArray38 = new short[local100];
				this.aShortArray37 = new short[local100];
				this.aByteArray37 = new byte[local100];
				this.aByteArray40 = new byte[local100];
				this.aByteArray33 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray34 = new byte[local102];
				this.aByteArray36 = new byte[local102];
			}
		}
		local4.anInt1357 = local52;
		local9.anInt1357 = local233;
		local14.anInt1357 = local239;
		local19.anInt1357 = local245;
		local24.anInt1357 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method861();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method889();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method889();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method889();
			}
			this.anIntArray497[local463] = local457 + local470;
			this.anIntArray505[local463] = local459 + local480;
			this.anIntArray500[local463] = local461 + local490;
			local457 = this.anIntArray497[local463];
			local459 = this.anIntArray505[local463];
			local461 = this.anIntArray500[local463];
			if (local76 == 1) {
				this.anIntArray496[local463] = local24.method861();
			}
		}
		local4.anInt1357 = local225;
		local9.anInt1357 = local151;
		local14.anInt1357 = local166;
		local19.anInt1357 = local193;
		local24.anInt1357 = local175;
		local29.anInt1357 = local208;
		local34.anInt1357 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray42[local468] = (short) local4.method878();
			if (local56 == 1) {
				this.aByteArray39[local468] = local9.method900();
			}
			if (local60 == 255) {
				this.aByteArray41[local468] = local14.method900();
			}
			if (local64 == 1) {
				this.aByteArray42[local468] = local19.method900();
			}
			if (local68 == 1) {
				this.anIntArray499[local468] = local24.method861();
			}
			if (local72 == 1) {
				this.aShortArray40[local468] = (short) (local29.method878() - 1);
			}
			if (this.aByteArray38 != null) {
				if (this.aShortArray40[local468] == -1) {
					this.aByteArray38[local468] = -1;
				} else {
					this.aByteArray38[local468] = (byte) (local34.method861() - 1);
				}
			}
		}
		local4.anInt1357 = local202;
		local9.anInt1357 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(676) int local676 = 0;
		@Pc(683) int local683;
		@Pc(786) int local786;
		for (@Pc(678) int local678 = 0; local678 < local48; local678++) {
			local683 = local9.method861();
			if (local683 == 1) {
				local470 = local4.method889() + local676;
				local480 = local4.method889() + local470;
				local490 = local4.method889() + local480;
				local676 = local490;
				this.anIntArray494[local678] = local470;
				this.anIntArray501[local678] = local480;
				this.anIntArray502[local678] = local490;
			}
			if (local683 == 2) {
				local480 = local490;
				local490 = local4.method889() + local676;
				local676 = local490;
				this.anIntArray494[local678] = local470;
				this.anIntArray501[local678] = local480;
				this.anIntArray502[local678] = local490;
			}
			if (local683 == 3) {
				local470 = local490;
				local490 = local4.method889() + local676;
				local676 = local490;
				this.anIntArray494[local678] = local470;
				this.anIntArray501[local678] = local480;
				this.anIntArray502[local678] = local490;
			}
			if (local683 == 4) {
				local786 = local470;
				local470 = local480;
				local480 = local786;
				local490 = local4.method889() + local676;
				local676 = local490;
				this.anIntArray494[local678] = local470;
				this.anIntArray501[local678] = local786;
				this.anIntArray502[local678] = local490;
			}
		}
		local4.anInt1357 = local251;
		local9.anInt1357 = local259;
		local14.anInt1357 = local267;
		local19.anInt1357 = local275;
		local24.anInt1357 = local281;
		local29.anInt1357 = local287;
		for (local683 = 0; local683 < local52; local683++) {
			local786 = this.aByteArray35[local683] & 0xFF;
			if (local786 == 0) {
				this.aShortArray36[local683] = (short) local4.method878();
				this.aShortArray39[local683] = (short) local4.method878();
				this.aShortArray41[local683] = (short) local4.method878();
			}
			if (local786 == 1) {
				this.aShortArray36[local683] = (short) local9.method878();
				this.aShortArray39[local683] = (short) local9.method878();
				this.aShortArray41[local683] = (short) local9.method878();
				this.aShortArray35[local683] = (short) local14.method878();
				this.aShortArray38[local683] = (short) local14.method878();
				this.aShortArray37[local683] = (short) local14.method878();
				this.aByteArray37[local683] = local19.method900();
				this.aByteArray40[local683] = local24.method900();
				this.aByteArray33[local683] = local29.method900();
			}
			if (local786 == 2) {
				this.aShortArray36[local683] = (short) local9.method878();
				this.aShortArray39[local683] = (short) local9.method878();
				this.aShortArray41[local683] = (short) local9.method878();
				this.aShortArray35[local683] = (short) local14.method878();
				this.aShortArray38[local683] = (short) local14.method878();
				this.aShortArray37[local683] = (short) local14.method878();
				this.aByteArray37[local683] = local19.method900();
				this.aByteArray40[local683] = local24.method900();
				this.aByteArray33[local683] = local29.method900();
				this.aByteArray34[local683] = local29.method900();
				this.aByteArray36[local683] = local29.method900();
			}
			if (local786 == 3) {
				this.aShortArray36[local683] = (short) local9.method878();
				this.aShortArray39[local683] = (short) local9.method878();
				this.aShortArray41[local683] = (short) local9.method878();
				this.aShortArray35[local683] = (short) local14.method878();
				this.aShortArray38[local683] = (short) local14.method878();
				this.aShortArray37[local683] = (short) local14.method878();
				this.aByteArray37[local683] = local19.method900();
				this.aByteArray40[local683] = local24.method900();
				this.aByteArray33[local683] = local29.method900();
			}
		}
		local4.anInt1357 = local113;
		local786 = local4.method861();
		if (local786 == 0) {
			return;
		}
		new Class88();
		local4.method878();
		local4.method878();
		local4.method878();
		local4.method868();
	}

	@OriginalMember(owner = "client!sf", name = "j", descriptor = "()V")
	public void method2613() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt3774; local1++) {
			@Pc(7) int local7 = this.anIntArray500[local1];
			this.anIntArray500[local1] = this.anIntArray497[local1];
			this.anIntArray497[local1] = -local7;
		}
		this.method2608();
	}
}
