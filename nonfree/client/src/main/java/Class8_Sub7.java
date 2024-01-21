import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class8_Sub7 extends Class8 {

	@OriginalMember(owner = "client!o", name = "o", descriptor = "[B")
	public byte[] aByteArray27;

	@OriginalMember(owner = "client!o", name = "p", descriptor = "[[I")
	public int[][] anIntArrayArray19;

	@OriginalMember(owner = "client!o", name = "r", descriptor = "[S")
	public short[] aShortArray27;

	@OriginalMember(owner = "client!o", name = "s", descriptor = "[B")
	private byte[] aByteArray28;

	@OriginalMember(owner = "client!o", name = "u", descriptor = "[S")
	public short[] aShortArray28;

	@OriginalMember(owner = "client!o", name = "v", descriptor = "S")
	private short aShort5;

	@OriginalMember(owner = "client!o", name = "x", descriptor = "S")
	private short aShort6;

	@OriginalMember(owner = "client!o", name = "y", descriptor = "[I")
	public int[] anIntArray214;

	@OriginalMember(owner = "client!o", name = "A", descriptor = "S")
	public short aShort7;

	@OriginalMember(owner = "client!o", name = "D", descriptor = "[B")
	private byte[] aByteArray29;

	@OriginalMember(owner = "client!o", name = "E", descriptor = "[Lclient!hc;")
	public Class40[] aClass40Array1;

	@OriginalMember(owner = "client!o", name = "F", descriptor = "[S")
	private short[] aShortArray29;

	@OriginalMember(owner = "client!o", name = "G", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!o", name = "H", descriptor = "[I")
	public int[] anIntArray215;

	@OriginalMember(owner = "client!o", name = "I", descriptor = "[B")
	public byte[] aByteArray31;

	@OriginalMember(owner = "client!o", name = "J", descriptor = "[[I")
	public int[][] anIntArrayArray20;

	@OriginalMember(owner = "client!o", name = "K", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!o", name = "L", descriptor = "[I")
	private int[] anIntArray216;

	@OriginalMember(owner = "client!o", name = "M", descriptor = "[I")
	public int[] anIntArray217;

	@OriginalMember(owner = "client!o", name = "N", descriptor = "[S")
	private short[] aShortArray30;

	@OriginalMember(owner = "client!o", name = "O", descriptor = "S")
	private short aShort8;

	@OriginalMember(owner = "client!o", name = "P", descriptor = "S")
	private short aShort9;

	@OriginalMember(owner = "client!o", name = "Q", descriptor = "[Lclient!sb;")
	public Class84[] aClass84Array1;

	@OriginalMember(owner = "client!o", name = "R", descriptor = "I")
	public int anInt2762;

	@OriginalMember(owner = "client!o", name = "S", descriptor = "[S")
	public short[] aShortArray31;

	@OriginalMember(owner = "client!o", name = "T", descriptor = "[S")
	private short[] aShortArray32;

	@OriginalMember(owner = "client!o", name = "U", descriptor = "[I")
	public int[] anIntArray218;

	@OriginalMember(owner = "client!o", name = "V", descriptor = "S")
	private short aShort10;

	@OriginalMember(owner = "client!o", name = "W", descriptor = "[I")
	public int[] anIntArray219;

	@OriginalMember(owner = "client!o", name = "X", descriptor = "S")
	private short aShort11;

	@OriginalMember(owner = "client!o", name = "Y", descriptor = "[S")
	public short[] aShortArray33;

	@OriginalMember(owner = "client!o", name = "ab", descriptor = "S")
	public short aShort12;

	@OriginalMember(owner = "client!o", name = "bb", descriptor = "[B")
	public byte[] aByteArray33;

	@OriginalMember(owner = "client!o", name = "cb", descriptor = "[B")
	public byte[] aByteArray34;

	@OriginalMember(owner = "client!o", name = "db", descriptor = "[I")
	public int[] anIntArray221;

	@OriginalMember(owner = "client!o", name = "eb", descriptor = "[S")
	public short[] aShortArray34;

	@OriginalMember(owner = "client!o", name = "gb", descriptor = "[I")
	private int[] anIntArray223;

	@OriginalMember(owner = "client!o", name = "hb", descriptor = "[Lclient!hc;")
	public Class40[] aClass40Array2;

	@OriginalMember(owner = "client!o", name = "jb", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!o", name = "kb", descriptor = "[B")
	public byte[] aByteArray36;

	@OriginalMember(owner = "client!o", name = "q", descriptor = "I")
	public int anInt2759 = 0;

	@OriginalMember(owner = "client!o", name = "z", descriptor = "B")
	public byte aByte9 = 0;

	@OriginalMember(owner = "client!o", name = "t", descriptor = "I")
	public int anInt2760 = 0;

	@OriginalMember(owner = "client!o", name = "ib", descriptor = "Z")
	private boolean aBoolean160 = false;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
	private Class8_Sub7() {
	}

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "([B)V")
	public Class8_Sub7(@OriginalArg(0) byte[] arg0) {
		if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
			this.method1996(arg0);
		} else {
			this.method2008(arg0);
		}
	}

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "([Lclient!o;I)V")
	public Class8_Sub7(@OriginalArg(0) Class8_Sub7[] arg0, @OriginalArg(1) int arg1) {
		@Pc(15) boolean local15 = false;
		@Pc(17) boolean local17 = false;
		@Pc(19) boolean local19 = false;
		@Pc(21) boolean local21 = false;
		@Pc(23) boolean local23 = false;
		@Pc(25) boolean local25 = false;
		this.anInt2760 = 0;
		this.anInt2759 = 0;
		this.anInt2762 = 0;
		this.aByte9 = -1;
		for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
			@Pc(44) Class8_Sub7 local44 = arg0[local39];
			if (local44 != null) {
				this.anInt2760 += local44.anInt2760;
				this.anInt2759 += local44.anInt2759;
				this.anInt2762 += local44.anInt2762;
				if (local44.aByteArray36 == null) {
					if (this.aByte9 == -1) {
						this.aByte9 = local44.aByte9;
					}
					if (this.aByte9 != local44.aByte9) {
						local17 = true;
					}
				} else {
					local17 = true;
				}
				local15 |= local44.aByteArray33 != null;
				local19 |= local44.aByteArray27 != null;
				local21 |= local44.anIntArray216 != null;
				local23 |= local44.aShortArray28 != null;
				local25 |= local44.aByteArray31 != null;
			}
		}
		this.anIntArray218 = new int[this.anInt2760];
		this.anIntArray221 = new int[this.anInt2760];
		this.anIntArray215 = new int[this.anInt2760];
		this.anIntArray223 = new int[this.anInt2760];
		this.anIntArray217 = new int[this.anInt2759];
		this.anIntArray214 = new int[this.anInt2759];
		this.anIntArray219 = new int[this.anInt2759];
		if (local15) {
			this.aByteArray33 = new byte[this.anInt2759];
		}
		if (local17) {
			this.aByteArray36 = new byte[this.anInt2759];
		}
		if (local19) {
			this.aByteArray27 = new byte[this.anInt2759];
		}
		if (local21) {
			this.anIntArray216 = new int[this.anInt2759];
		}
		if (local23) {
			this.aShortArray28 = new short[this.anInt2759];
		}
		if (local25) {
			this.aByteArray31 = new byte[this.anInt2759];
		}
		this.aShortArray33 = new short[this.anInt2759];
		if (this.anInt2762 > 0) {
			this.aByteArray34 = new byte[this.anInt2762];
			this.aShortArray27 = new short[this.anInt2762];
			this.aShortArray34 = new short[this.anInt2762];
			this.aShortArray31 = new short[this.anInt2762];
			this.aShortArray30 = new short[this.anInt2762];
			this.aShortArray29 = new short[this.anInt2762];
			this.aShortArray32 = new short[this.anInt2762];
			this.aByteArray35 = new byte[this.anInt2762];
			this.aByteArray30 = new byte[this.anInt2762];
			this.aByteArray28 = new byte[this.anInt2762];
			this.aByteArray32 = new byte[this.anInt2762];
			this.aByteArray29 = new byte[this.anInt2762];
		}
		this.anInt2760 = 0;
		this.anInt2759 = 0;
		this.anInt2762 = 0;
		for (@Pc(293) int local293 = 0; local293 < arg1; local293++) {
			@Pc(298) Class8_Sub7 local298 = arg0[local293];
			if (local298 != null) {
				for (@Pc(302) int local302 = 0; local302 < local298.anInt2759; local302++) {
					if (local15 && local298.aByteArray33 != null) {
						this.aByteArray33[this.anInt2759] = local298.aByteArray33[local302];
					}
					if (local17) {
						if (local298.aByteArray36 == null) {
							this.aByteArray36[this.anInt2759] = local298.aByte9;
						} else {
							this.aByteArray36[this.anInt2759] = local298.aByteArray36[local302];
						}
					}
					if (local19 && local298.aByteArray27 != null) {
						this.aByteArray27[this.anInt2759] = local298.aByteArray27[local302];
					}
					if (local21 && local298.anIntArray216 != null) {
						this.anIntArray216[this.anInt2759] = local298.anIntArray216[local302];
					}
					if (local23) {
						if (local298.aShortArray28 == null) {
							this.aShortArray28[this.anInt2759] = -1;
						} else {
							this.aShortArray28[this.anInt2759] = local298.aShortArray28[local302];
						}
					}
					if (local25) {
						if (local298.aByteArray31 == null || local298.aByteArray31[local302] == -1) {
							this.aByteArray31[this.anInt2759] = -1;
						} else {
							this.aByteArray31[this.anInt2759] = (byte) (local298.aByteArray31[local302] + this.anInt2762);
						}
					}
					this.aShortArray33[this.anInt2759] = local298.aShortArray33[local302];
					this.anIntArray217[this.anInt2759] = this.method2009(local298, local298.anIntArray217[local302]);
					this.anIntArray214[this.anInt2759] = this.method2009(local298, local298.anIntArray214[local302]);
					this.anIntArray219[this.anInt2759] = this.method2009(local298, local298.anIntArray219[local302]);
					this.anInt2759++;
				}
				for (@Pc(477) int local477 = 0; local477 < local298.anInt2762; local477++) {
					@Pc(489) byte local489 = this.aByteArray34[this.anInt2762] = local298.aByteArray34[local477];
					if (local489 == 0) {
						this.aShortArray27[this.anInt2762] = (short) this.method2009(local298, local298.aShortArray27[local477]);
						this.aShortArray34[this.anInt2762] = (short) this.method2009(local298, local298.aShortArray34[local477]);
						this.aShortArray31[this.anInt2762] = (short) this.method2009(local298, local298.aShortArray31[local477]);
					}
					if (local489 >= 1 && local489 <= 3) {
						this.aShortArray27[this.anInt2762] = local298.aShortArray27[local477];
						this.aShortArray34[this.anInt2762] = local298.aShortArray34[local477];
						this.aShortArray31[this.anInt2762] = local298.aShortArray31[local477];
						this.aShortArray30[this.anInt2762] = local298.aShortArray30[local477];
						this.aShortArray29[this.anInt2762] = local298.aShortArray29[local477];
						this.aShortArray32[this.anInt2762] = local298.aShortArray32[local477];
						this.aByteArray35[this.anInt2762] = local298.aByteArray35[local477];
						this.aByteArray30[this.anInt2762] = local298.aByteArray30[local477];
						this.aByteArray28[this.anInt2762] = local298.aByteArray28[local477];
					}
					if (local489 == 2) {
						this.aByteArray32[this.anInt2762] = local298.aByteArray32[local477];
						this.aByteArray29[this.anInt2762] = local298.aByteArray29[local477];
					}
					this.anInt2762++;
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(Lclient!o;ZZZZ)V")
	public Class8_Sub7(@OriginalArg(0) Class8_Sub7 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt2760 = arg0.anInt2760;
		this.anInt2759 = arg0.anInt2759;
		this.anInt2762 = arg0.anInt2762;
		@Pc(57) int local57;
		if (arg1) {
			this.anIntArray218 = arg0.anIntArray218;
			this.anIntArray221 = arg0.anIntArray221;
			this.anIntArray215 = arg0.anIntArray215;
		} else {
			this.anIntArray218 = new int[this.anInt2760];
			this.anIntArray221 = new int[this.anInt2760];
			this.anIntArray215 = new int[this.anInt2760];
			for (local57 = 0; local57 < this.anInt2760; local57++) {
				this.anIntArray218[local57] = arg0.anIntArray218[local57];
				this.anIntArray221[local57] = arg0.anIntArray221[local57];
				this.anIntArray215[local57] = arg0.anIntArray215[local57];
			}
		}
		if (arg2) {
			this.aShortArray33 = arg0.aShortArray33;
		} else {
			this.aShortArray33 = new short[this.anInt2759];
			for (local57 = 0; local57 < this.anInt2759; local57++) {
				this.aShortArray33[local57] = arg0.aShortArray33[local57];
			}
		}
		if (arg3 || arg0.aShortArray28 == null) {
			this.aShortArray28 = arg0.aShortArray28;
		} else {
			this.aShortArray28 = new short[this.anInt2759];
			for (local57 = 0; local57 < this.anInt2759; local57++) {
				this.aShortArray28[local57] = arg0.aShortArray28[local57];
			}
		}
		this.aByteArray27 = arg0.aByteArray27;
		this.anIntArray217 = arg0.anIntArray217;
		this.anIntArray214 = arg0.anIntArray214;
		this.anIntArray219 = arg0.anIntArray219;
		this.aByteArray33 = arg0.aByteArray33;
		this.aByteArray36 = arg0.aByteArray36;
		this.aByteArray31 = arg0.aByteArray31;
		this.aByte9 = arg0.aByte9;
		this.aByteArray34 = arg0.aByteArray34;
		this.aShortArray27 = arg0.aShortArray27;
		this.aShortArray34 = arg0.aShortArray34;
		this.aShortArray31 = arg0.aShortArray31;
		this.aShortArray30 = arg0.aShortArray30;
		this.aShortArray29 = arg0.aShortArray29;
		this.aShortArray32 = arg0.aShortArray32;
		this.aByteArray35 = arg0.aByteArray35;
		this.aByteArray30 = arg0.aByteArray30;
		this.aByteArray28 = arg0.aByteArray28;
		this.aByteArray32 = arg0.aByteArray32;
		this.aByteArray29 = arg0.aByteArray29;
		this.anIntArray223 = arg0.anIntArray223;
		this.anIntArray216 = arg0.anIntArray216;
		this.anIntArrayArray19 = arg0.anIntArrayArray19;
		this.anIntArrayArray20 = arg0.anIntArrayArray20;
		this.aClass40Array2 = arg0.aClass40Array2;
		this.aClass84Array1 = arg0.aClass84Array1;
		this.aClass40Array1 = arg0.aClass40Array1;
		this.aShort12 = arg0.aShort12;
		this.aShort7 = arg0.aShort7;
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "()Lclient!o;")
	public Class8_Sub7 method1992() {
		@Pc(3) Class8_Sub7 local3 = new Class8_Sub7();
		if (this.aByteArray33 != null) {
			local3.aByteArray33 = new byte[this.anInt2759];
			for (@Pc(13) int local13 = 0; local13 < this.anInt2759; local13++) {
				local3.aByteArray33[local13] = this.aByteArray33[local13];
			}
		}
		local3.anInt2760 = this.anInt2760;
		local3.anInt2759 = this.anInt2759;
		local3.anInt2762 = this.anInt2762;
		local3.anIntArray218 = this.anIntArray218;
		local3.anIntArray221 = this.anIntArray221;
		local3.anIntArray215 = this.anIntArray215;
		local3.anIntArray217 = this.anIntArray217;
		local3.anIntArray214 = this.anIntArray214;
		local3.anIntArray219 = this.anIntArray219;
		local3.aByteArray36 = this.aByteArray36;
		local3.aByteArray27 = this.aByteArray27;
		local3.aByteArray31 = this.aByteArray31;
		local3.aShortArray33 = this.aShortArray33;
		local3.aShortArray28 = this.aShortArray28;
		local3.aByte9 = this.aByte9;
		local3.aByteArray34 = this.aByteArray34;
		local3.aShortArray27 = this.aShortArray27;
		local3.aShortArray34 = this.aShortArray34;
		local3.aShortArray31 = this.aShortArray31;
		local3.aShortArray30 = this.aShortArray30;
		local3.aShortArray29 = this.aShortArray29;
		local3.aShortArray32 = this.aShortArray32;
		local3.aByteArray35 = this.aByteArray35;
		local3.aByteArray30 = this.aByteArray30;
		local3.aByteArray28 = this.aByteArray28;
		local3.aByteArray32 = this.aByteArray32;
		local3.aByteArray29 = this.aByteArray29;
		local3.anIntArray223 = this.anIntArray223;
		local3.anIntArray216 = this.anIntArray216;
		local3.anIntArrayArray19 = this.anIntArrayArray19;
		local3.anIntArrayArray20 = this.anIntArrayArray20;
		local3.aClass40Array2 = this.aClass40Array2;
		local3.aClass84Array1 = this.aClass84Array1;
		local3.aShort12 = this.aShort12;
		local3.aShort7 = this.aShort7;
		return local3;
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "()V")
	public void method1993() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2760; local1++) {
			this.anIntArray218[local1] = -this.anIntArray218[local1];
			this.anIntArray215[local1] = -this.anIntArray215[local1];
		}
		this.method2004();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!e;IIIZ)V")
	@Override
	public void method2674(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		@Pc(2) Class8_Sub7 local2 = (Class8_Sub7) arg0;
		local2.method2014();
		local2.method1998();
		Static135.anInt2761++;
		@Pc(12) int local12 = 0;
		@Pc(15) int[] local15 = local2.anIntArray218;
		@Pc(18) int local18 = local2.anInt2760;
		@Pc(36) int local36;
		for (@Pc(20) int local20 = 0; local20 < this.anInt2760; local20++) {
			@Pc(26) Class40 local26 = this.aClass40Array2[local20];
			if (local26.anInt1624 != 0) {
				local36 = this.anIntArray221[local20] - arg2;
				if (local36 >= local2.aShort6 && local36 <= local2.aShort11) {
					@Pc(52) int local52 = this.anIntArray218[local20] - arg1;
					if (local52 >= local2.aShort5 && local52 <= local2.aShort9) {
						@Pc(68) int local68 = this.anIntArray215[local20] - arg3;
						if (local68 >= local2.aShort8 && local68 <= local2.aShort10) {
							for (@Pc(79) int local79 = 0; local79 < local18; local79++) {
								@Pc(85) Class40 local85 = local2.aClass40Array2[local79];
								if (local52 == local15[local79] && local68 == local2.anIntArray215[local79] && local36 == local2.anIntArray221[local79] && local85.anInt1624 != 0) {
									if (this.aClass40Array1 == null) {
										this.aClass40Array1 = new Class40[this.anInt2760];
									}
									if (local2.aClass40Array1 == null) {
										local2.aClass40Array1 = new Class40[local18];
									}
									@Pc(125) Class40 local125 = this.aClass40Array1[local20];
									if (local125 == null) {
										local125 = this.aClass40Array1[local20] = new Class40(local26);
									}
									@Pc(142) Class40 local142 = local2.aClass40Array1[local79];
									if (local142 == null) {
										local142 = local2.aClass40Array1[local79] = new Class40(local85);
									}
									local125.anInt1622 += local85.anInt1622;
									local125.anInt1626 += local85.anInt1626;
									local125.anInt1625 += local85.anInt1625;
									local125.anInt1624 += local85.anInt1624;
									local142.anInt1622 += local26.anInt1622;
									local142.anInt1626 += local26.anInt1626;
									local142.anInt1625 += local26.anInt1625;
									local142.anInt1624 += local26.anInt1624;
									local12++;
									Static135.anIntArray224[local20] = Static135.anInt2761;
									Static135.anIntArray222[local79] = Static135.anInt2761;
								}
							}
						}
					}
				}
			}
		}
		if (local12 < 3 || !arg4) {
			return;
		}
		for (@Pc(236) int local236 = 0; local236 < this.anInt2759; local236++) {
			if (Static135.anIntArray224[this.anIntArray217[local236]] == Static135.anInt2761 && Static135.anIntArray224[this.anIntArray214[local236]] == Static135.anInt2761 && Static135.anIntArray224[this.anIntArray219[local236]] == Static135.anInt2761) {
				if (this.aByteArray33 == null) {
					this.aByteArray33 = new byte[this.anInt2759];
				}
				this.aByteArray33[local236] = 2;
			}
		}
		for (local36 = 0; local36 < local2.anInt2759; local36++) {
			if (Static135.anIntArray222[local2.anIntArray217[local36]] == Static135.anInt2761 && Static135.anIntArray222[local2.anIntArray214[local36]] == Static135.anInt2761 && Static135.anIntArray222[local2.anIntArray219[local36]] == Static135.anInt2761) {
				if (local2.aByteArray33 == null) {
					local2.aByteArray33 = new byte[local2.anInt2759];
				}
				local2.aByteArray33[local36] = 2;
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "([[IIIIZIZ)Lclient!o;")
	public Class8_Sub7 method1994(@OriginalArg(0) int[][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		this.method2014();
		@Pc(6) int local6 = arg1 + this.aShort5;
		@Pc(11) int local11 = arg1 + this.aShort9;
		@Pc(16) int local16 = arg3 + this.aShort8;
		@Pc(21) int local21 = arg3 + this.aShort10;
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
		@Pc(101) Class8_Sub7 local101 = new Class8_Sub7();
		local101.anInt2760 = this.anInt2760;
		local101.anInt2759 = this.anInt2759;
		local101.anInt2762 = this.anInt2762;
		local101.anIntArray218 = this.anIntArray218;
		local101.anIntArray215 = this.anIntArray215;
		local101.anIntArray217 = this.anIntArray217;
		local101.anIntArray214 = this.anIntArray214;
		local101.anIntArray219 = this.anIntArray219;
		local101.aByteArray33 = this.aByteArray33;
		local101.aByteArray36 = this.aByteArray36;
		local101.aByteArray27 = this.aByteArray27;
		local101.aByteArray31 = this.aByteArray31;
		local101.aShortArray33 = this.aShortArray33;
		local101.aShortArray28 = this.aShortArray28;
		local101.aByte9 = this.aByte9;
		local101.aByteArray34 = this.aByteArray34;
		local101.aShortArray27 = this.aShortArray27;
		local101.aShortArray34 = this.aShortArray34;
		local101.aShortArray31 = this.aShortArray31;
		local101.aShortArray30 = this.aShortArray30;
		local101.aShortArray29 = this.aShortArray29;
		local101.aShortArray32 = this.aShortArray32;
		local101.aByteArray35 = this.aByteArray35;
		local101.aByteArray30 = this.aByteArray30;
		local101.aByteArray28 = this.aByteArray28;
		local101.aByteArray32 = this.aByteArray32;
		local101.aByteArray29 = this.aByteArray29;
		local101.anIntArray223 = this.anIntArray223;
		local101.anIntArray216 = this.anIntArray216;
		local101.anIntArrayArray19 = this.anIntArrayArray19;
		local101.anIntArrayArray20 = this.anIntArrayArray20;
		local101.aShort12 = this.aShort12;
		local101.aShort7 = this.aShort7;
		local101.aClass40Array2 = this.aClass40Array2;
		local101.aClass84Array1 = this.aClass84Array1;
		local101.aClass40Array1 = this.aClass40Array1;
		local101.anIntArray221 = new int[local101.anInt2760];
		@Pc(257) int local257;
		@Pc(265) int local265;
		@Pc(272) int local272;
		@Pc(276) int local276;
		@Pc(280) int local280;
		@Pc(284) int local284;
		@Pc(288) int local288;
		@Pc(310) int local310;
		@Pc(336) int local336;
		@Pc(348) int local348;
		if (arg4 == 0) {
			for (local257 = 0; local257 < local101.anInt2760; local257++) {
				local265 = this.anIntArray218[local257] + arg1;
				local272 = this.anIntArray215[local257] + arg3;
				local276 = local265 & 0x7F;
				local280 = local272 & 0x7F;
				local284 = local265 >> 7;
				local288 = local272 >> 7;
				local310 = arg0[local284][local288] * (128 - local276) + arg0[local284 + 1][local288] * local276 >> 7;
				local336 = arg0[local284][local288 + 1] * (128 - local276) + arg0[local284 + 1][local288 + 1] * local276 >> 7;
				local348 = local310 * (128 - local280) + local336 * local280 >> 7;
				local101.anIntArray221[local257] = this.anIntArray221[local257] + local348 - arg2;
			}
		} else {
			for (local257 = 0; local257 < local101.anInt2760; local257++) {
				local265 = (this.anIntArray221[local257] << 16) / this.aShort6;
				if (local265 < arg4) {
					local272 = this.anIntArray218[local257] + arg1;
					local276 = this.anIntArray215[local257] + arg3;
					local280 = local272 & 0x7F;
					local284 = local276 & 0x7F;
					local288 = local272 >> 7;
					local310 = local276 >> 7;
					local336 = arg0[local288][local310] * (128 - local280) + arg0[local288 + 1][local310] * local280 >> 7;
					local348 = arg0[local288][local310 + 1] * (128 - local280) + arg0[local288 + 1][local310 + 1] * local280 >> 7;
					@Pc(472) int local472 = local336 * (128 - local284) + local348 * local284 >> 7;
					local101.anIntArray221[local257] = this.anIntArray221[local257] + (local472 - arg2) * (arg4 - local265) / arg4;
				} else {
					local101.anIntArray221[local257] = this.anIntArray221[local257];
				}
			}
		}
		this.aBoolean160 = false;
		return local101;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "()Z")
	@Override
	public boolean method2671() {
		return true;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "()I")
	@Override
	public int method2668() {
		if (!this.aBoolean160) {
			this.method2014();
		}
		return this.aShort6;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(III)V")
	public void method1995(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2760; local1++) {
			this.anIntArray218[local1] += arg0;
			this.anIntArray221[local1] += arg1;
			this.anIntArray215[local1] += arg2;
		}
		this.method2004();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "([B)V")
	private void method1996(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class1_Sub14 local4 = new Class1_Sub14(arg0);
		@Pc(9) Class1_Sub14 local9 = new Class1_Sub14(arg0);
		@Pc(14) Class1_Sub14 local14 = new Class1_Sub14(arg0);
		@Pc(19) Class1_Sub14 local19 = new Class1_Sub14(arg0);
		@Pc(24) Class1_Sub14 local24 = new Class1_Sub14(arg0);
		@Pc(29) Class1_Sub14 local29 = new Class1_Sub14(arg0);
		@Pc(34) Class1_Sub14 local34 = new Class1_Sub14(arg0);
		local4.anInt4061 = arg0.length - 23;
		@Pc(44) int local44 = local4.method3023();
		@Pc(48) int local48 = local4.method3023();
		@Pc(52) int local52 = local4.method3010();
		@Pc(56) int local56 = local4.method3010();
		@Pc(60) int local60 = local4.method3010();
		@Pc(64) int local64 = local4.method3010();
		@Pc(68) int local68 = local4.method3010();
		@Pc(72) int local72 = local4.method3010();
		@Pc(76) int local76 = local4.method3010();
		@Pc(80) int local80 = local4.method3023();
		@Pc(84) int local84 = local4.method3023();
		@Pc(88) int local88 = local4.method3023();
		@Pc(92) int local92 = local4.method3023();
		@Pc(96) int local96 = local4.method3023();
		@Pc(98) int local98 = 0;
		@Pc(100) int local100 = 0;
		@Pc(102) int local102 = 0;
		@Pc(113) int local113;
		if (local52 > 0) {
			this.aByteArray34 = new byte[local52];
			local4.anInt4061 = 0;
			for (local113 = 0; local113 < local52; local113++) {
				@Pc(123) byte local123 = this.aByteArray34[local113] = local4.method3009();
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
		this.anInt2760 = local44;
		this.anInt2759 = local48;
		this.anInt2762 = local52;
		this.anIntArray218 = new int[local44];
		this.anIntArray221 = new int[local44];
		this.anIntArray215 = new int[local44];
		this.anIntArray217 = new int[local48];
		this.anIntArray214 = new int[local48];
		this.anIntArray219 = new int[local48];
		if (local76 == 1) {
			this.anIntArray223 = new int[local44];
		}
		if (local56 == 1) {
			this.aByteArray33 = new byte[local48];
		}
		if (local60 == 255) {
			this.aByteArray36 = new byte[local48];
		} else {
			this.aByte9 = (byte) local60;
		}
		if (local64 == 1) {
			this.aByteArray27 = new byte[local48];
		}
		if (local68 == 1) {
			this.anIntArray216 = new int[local48];
		}
		if (local72 == 1) {
			this.aShortArray28 = new short[local48];
		}
		if (local72 == 1 && local52 > 0) {
			this.aByteArray31 = new byte[local48];
		}
		this.aShortArray33 = new short[local48];
		if (local52 > 0) {
			this.aShortArray27 = new short[local52];
			this.aShortArray34 = new short[local52];
			this.aShortArray31 = new short[local52];
			if (local100 > 0) {
				this.aShortArray30 = new short[local100];
				this.aShortArray29 = new short[local100];
				this.aShortArray32 = new short[local100];
				this.aByteArray35 = new byte[local100];
				this.aByteArray30 = new byte[local100];
				this.aByteArray28 = new byte[local100];
			}
			if (local102 > 0) {
				this.aByteArray32 = new byte[local102];
				this.aByteArray29 = new byte[local102];
			}
		}
		local4.anInt4061 = local52;
		local9.anInt4061 = local233;
		local14.anInt4061 = local239;
		local19.anInt4061 = local245;
		local24.anInt4061 = local184;
		@Pc(457) int local457 = 0;
		@Pc(459) int local459 = 0;
		@Pc(461) int local461 = 0;
		@Pc(468) int local468;
		@Pc(470) int local470;
		@Pc(480) int local480;
		@Pc(490) int local490;
		for (@Pc(463) int local463 = 0; local463 < local44; local463++) {
			local468 = local4.method3010();
			local470 = 0;
			if ((local468 & 0x1) != 0) {
				local470 = local9.method3045();
			}
			local480 = 0;
			if ((local468 & 0x2) != 0) {
				local480 = local14.method3045();
			}
			local490 = 0;
			if ((local468 & 0x4) != 0) {
				local490 = local19.method3045();
			}
			this.anIntArray218[local463] = local457 + local470;
			this.anIntArray221[local463] = local459 + local480;
			this.anIntArray215[local463] = local461 + local490;
			local457 = this.anIntArray218[local463];
			local459 = this.anIntArray221[local463];
			local461 = this.anIntArray215[local463];
			if (local76 == 1) {
				this.anIntArray223[local463] = local24.method3010();
			}
		}
		local4.anInt4061 = local225;
		local9.anInt4061 = local151;
		local14.anInt4061 = local166;
		local19.anInt4061 = local193;
		local24.anInt4061 = local175;
		local29.anInt4061 = local208;
		local34.anInt4061 = local219;
		for (local468 = 0; local468 < local48; local468++) {
			this.aShortArray33[local468] = (short) local4.method3023();
			if (local56 == 1) {
				this.aByteArray33[local468] = local9.method3009();
			}
			if (local60 == 255) {
				this.aByteArray36[local468] = local14.method3009();
			}
			if (local64 == 1) {
				this.aByteArray27[local468] = local19.method3009();
			}
			if (local68 == 1) {
				this.anIntArray216[local468] = local24.method3010();
			}
			if (local72 == 1) {
				this.aShortArray28[local468] = (short) (local29.method3023() - 1);
			}
			if (this.aByteArray31 != null) {
				if (this.aShortArray28[local468] == -1) {
					this.aByteArray31[local468] = -1;
				} else {
					this.aByteArray31[local468] = (byte) (local34.method3010() - 1);
				}
			}
		}
		local4.anInt4061 = local202;
		local9.anInt4061 = local160;
		local470 = 0;
		local480 = 0;
		local490 = 0;
		@Pc(676) int local676 = 0;
		@Pc(683) int local683;
		@Pc(786) int local786;
		for (@Pc(678) int local678 = 0; local678 < local48; local678++) {
			local683 = local9.method3010();
			if (local683 == 1) {
				local470 = local4.method3045() + local676;
				local480 = local4.method3045() + local470;
				local490 = local4.method3045() + local480;
				local676 = local490;
				this.anIntArray217[local678] = local470;
				this.anIntArray214[local678] = local480;
				this.anIntArray219[local678] = local490;
			}
			if (local683 == 2) {
				local480 = local490;
				local490 = local4.method3045() + local676;
				local676 = local490;
				this.anIntArray217[local678] = local470;
				this.anIntArray214[local678] = local480;
				this.anIntArray219[local678] = local490;
			}
			if (local683 == 3) {
				local470 = local490;
				local490 = local4.method3045() + local676;
				local676 = local490;
				this.anIntArray217[local678] = local470;
				this.anIntArray214[local678] = local480;
				this.anIntArray219[local678] = local490;
			}
			if (local683 == 4) {
				local786 = local470;
				local470 = local480;
				local480 = local786;
				local490 = local4.method3045() + local676;
				local676 = local490;
				this.anIntArray217[local678] = local470;
				this.anIntArray214[local678] = local786;
				this.anIntArray219[local678] = local490;
			}
		}
		local4.anInt4061 = local251;
		local9.anInt4061 = local259;
		local14.anInt4061 = local267;
		local19.anInt4061 = local275;
		local24.anInt4061 = local281;
		local29.anInt4061 = local287;
		for (local683 = 0; local683 < local52; local683++) {
			local786 = this.aByteArray34[local683] & 0xFF;
			if (local786 == 0) {
				this.aShortArray27[local683] = (short) local4.method3023();
				this.aShortArray34[local683] = (short) local4.method3023();
				this.aShortArray31[local683] = (short) local4.method3023();
			}
			if (local786 == 1) {
				this.aShortArray27[local683] = (short) local9.method3023();
				this.aShortArray34[local683] = (short) local9.method3023();
				this.aShortArray31[local683] = (short) local9.method3023();
				this.aShortArray30[local683] = (short) local14.method3023();
				this.aShortArray29[local683] = (short) local14.method3023();
				this.aShortArray32[local683] = (short) local14.method3023();
				this.aByteArray35[local683] = local19.method3009();
				this.aByteArray30[local683] = local24.method3009();
				this.aByteArray28[local683] = local29.method3009();
			}
			if (local786 == 2) {
				this.aShortArray27[local683] = (short) local9.method3023();
				this.aShortArray34[local683] = (short) local9.method3023();
				this.aShortArray31[local683] = (short) local9.method3023();
				this.aShortArray30[local683] = (short) local14.method3023();
				this.aShortArray29[local683] = (short) local14.method3023();
				this.aShortArray32[local683] = (short) local14.method3023();
				this.aByteArray35[local683] = local19.method3009();
				this.aByteArray30[local683] = local24.method3009();
				this.aByteArray28[local683] = local29.method3009();
				this.aByteArray32[local683] = local29.method3009();
				this.aByteArray29[local683] = local29.method3009();
			}
			if (local786 == 3) {
				this.aShortArray27[local683] = (short) local9.method3023();
				this.aShortArray34[local683] = (short) local9.method3023();
				this.aShortArray31[local683] = (short) local9.method3023();
				this.aShortArray30[local683] = (short) local14.method3023();
				this.aShortArray29[local683] = (short) local14.method3023();
				this.aShortArray32[local683] = (short) local14.method3023();
				this.aByteArray35[local683] = local19.method3009();
				this.aByteArray30[local683] = local24.method3009();
				this.aByteArray28[local683] = local29.method3009();
			}
		}
		local4.anInt4061 = local113;
		local786 = local4.method3010();
		if (local786 != 0) {
			local4.method3023();
			local4.method3023();
			local4.method3023();
			local4.method3058();
		}
	}

	@OriginalMember(owner = "client!o", name = "e", descriptor = "()V")
	public void method1998() {
		if (this.aClass40Array2 != null) {
			return;
		}
		this.aClass40Array2 = new Class40[this.anInt2760];
		for (@Pc(10) int local10 = 0; local10 < this.anInt2760; local10++) {
			this.aClass40Array2[local10] = new Class40();
		}
		for (@Pc(25) int local25 = 0; local25 < this.anInt2759; local25++) {
			@Pc(31) int local31 = this.anIntArray217[local25];
			@Pc(36) int local36 = this.anIntArray214[local25];
			@Pc(41) int local41 = this.anIntArray219[local25];
			@Pc(51) int local51 = this.anIntArray218[local36] - this.anIntArray218[local31];
			@Pc(61) int local61 = this.anIntArray221[local36] - this.anIntArray221[local31];
			@Pc(71) int local71 = this.anIntArray215[local36] - this.anIntArray215[local31];
			@Pc(81) int local81 = this.anIntArray218[local41] - this.anIntArray218[local31];
			@Pc(91) int local91 = this.anIntArray221[local41] - this.anIntArray221[local31];
			@Pc(101) int local101 = this.anIntArray215[local41] - this.anIntArray215[local31];
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
			if (this.aByteArray33 == null) {
				local198 = 0;
			} else {
				local198 = this.aByteArray33[local25];
			}
			if (local198 == 0) {
				@Pc(211) Class40 local211 = this.aClass40Array2[local31];
				local211.anInt1622 += local109;
				local211.anInt1626 += local117;
				local211.anInt1625 += local125;
				local211.anInt1624++;
				@Pc(240) Class40 local240 = this.aClass40Array2[local36];
				local240.anInt1622 += local109;
				local240.anInt1626 += local117;
				local240.anInt1625 += local125;
				local240.anInt1624++;
				@Pc(269) Class40 local269 = this.aClass40Array2[local41];
				local269.anInt1622 += local109;
				local269.anInt1626 += local117;
				local269.anInt1625 += local125;
				local269.anInt1624++;
			} else if (local198 == 1) {
				if (this.aClass84Array1 == null) {
					this.aClass84Array1 = new Class84[this.anInt2759];
				}
				@Pc(314) Class84 local314 = this.aClass84Array1[local25] = new Class84();
				local314.anInt3500 = local109;
				local314.anInt3498 = local117;
				local314.anInt3496 = local125;
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "f", descriptor = "()V")
	public void method1999() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2760; local1++) {
			this.anIntArray215[local1] = -this.anIntArray215[local1];
		}
		for (@Pc(18) int local18 = 0; local18 < this.anInt2759; local18++) {
			@Pc(24) int local24 = this.anIntArray217[local18];
			this.anIntArray217[local18] = this.anIntArray219[local18];
			this.anIntArray219[local18] = local24;
		}
		this.method2004();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIII)Lclient!ob;")
	public Class8_Sub5_Sub1 method2000(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return new Class8_Sub5_Sub1(this, arg0, arg1, -50, -10, -50);
	}

	@OriginalMember(owner = "client!o", name = "g", descriptor = "()V")
	public void method2001() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2760; local1++) {
			@Pc(7) int local7 = this.anIntArray218[local1];
			this.anIntArray218[local1] = this.anIntArray215[local1];
			this.anIntArray215[local1] = -local7;
		}
		this.method2004();
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(III)V")
	public void method2002(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2760; local1++) {
			this.anIntArray218[local1] = this.anIntArray218[local1] * arg0 / 128;
			this.anIntArray221[local1] = this.anIntArray221[local1] * arg1 / 128;
			this.anIntArray215[local1] = this.anIntArray215[local1] * arg2 / 128;
		}
		this.method2004();
	}

	@OriginalMember(owner = "client!o", name = "i", descriptor = "()V")
	private void method2004() {
		this.aClass40Array2 = null;
		this.aClass40Array1 = null;
		this.aClass84Array1 = null;
		this.aBoolean160 = false;
	}

	@OriginalMember(owner = "client!o", name = "j", descriptor = "()V")
	public void method2005() {
		@Pc(5) int[] local5;
		@Pc(7) int local7;
		@Pc(19) int local19;
		@Pc(9) int local9;
		@Pc(15) int local15;
		@Pc(59) int local59;
		@Pc(65) int local65;
		if (this.anIntArray223 != null) {
			local5 = new int[256];
			local7 = 0;
			for (local9 = 0; local9 < this.anInt2760; local9++) {
				local15 = this.anIntArray223[local9];
				local19 = local5[local15]++;
				if (local15 > local7) {
					local7 = local15;
				}
			}
			this.anIntArrayArray19 = new int[local7 + 1][];
			for (local15 = 0; local15 <= local7; local15++) {
				this.anIntArrayArray19[local15] = new int[local5[local15]];
				local5[local15] = 0;
			}
			local59 = 0;
			while (local59 < this.anInt2760) {
				local65 = this.anIntArray223[local59];
				this.anIntArrayArray19[local65][local5[local65]++] = local59++;
			}
			this.anIntArray223 = null;
		}
		if (this.anIntArray216 == null) {
			return;
		}
		local5 = new int[256];
		local7 = 0;
		for (local9 = 0; local9 < this.anInt2759; local9++) {
			local15 = this.anIntArray216[local9];
			local19 = local5[local15]++;
			if (local15 > local7) {
				local7 = local15;
			}
		}
		this.anIntArrayArray20 = new int[local7 + 1][];
		for (local15 = 0; local15 <= local7; local15++) {
			this.anIntArrayArray20[local15] = new int[local5[local15]];
			local5[local15] = 0;
		}
		local59 = 0;
		while (local59 < this.anInt2759) {
			local65 = this.anIntArray216[local59];
			this.anIntArrayArray20[local65][local5[local65]++] = local59++;
		}
		this.anIntArray216 = null;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIIIIJ)V")
	@Override
	public void method2672(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(SS)V")
	public void method2006(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2759; local1++) {
			if (this.aShortArray33[local1] == arg0) {
				this.aShortArray33[local1] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(IIIII)Lclient!ee;")
	public Class8_Sub5 method2007(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return new Class8_Sub5_Sub1(this, arg0, arg1, arg2, arg3, arg4);
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "([B)V")
	private void method2008(@OriginalArg(0) byte[] arg0) {
		@Pc(1) boolean local1 = false;
		@Pc(3) boolean local3 = false;
		@Pc(8) Class1_Sub14 local8 = new Class1_Sub14(arg0);
		@Pc(13) Class1_Sub14 local13 = new Class1_Sub14(arg0);
		@Pc(18) Class1_Sub14 local18 = new Class1_Sub14(arg0);
		@Pc(23) Class1_Sub14 local23 = new Class1_Sub14(arg0);
		@Pc(28) Class1_Sub14 local28 = new Class1_Sub14(arg0);
		local8.anInt4061 = arg0.length - 18;
		@Pc(38) int local38 = local8.method3023();
		@Pc(42) int local42 = local8.method3023();
		@Pc(46) int local46 = local8.method3010();
		@Pc(50) int local50 = local8.method3010();
		@Pc(54) int local54 = local8.method3010();
		@Pc(58) int local58 = local8.method3010();
		@Pc(62) int local62 = local8.method3010();
		@Pc(66) int local66 = local8.method3010();
		@Pc(70) int local70 = local8.method3023();
		@Pc(74) int local74 = local8.method3023();
		@Pc(78) int local78 = local8.method3023();
		@Pc(82) int local82 = local8.method3023();
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
		this.anInt2760 = local38;
		this.anInt2759 = local42;
		this.anInt2762 = local46;
		this.anIntArray218 = new int[local38];
		this.anIntArray221 = new int[local38];
		this.anIntArray215 = new int[local38];
		this.anIntArray217 = new int[local42];
		this.anIntArray214 = new int[local42];
		this.anIntArray219 = new int[local42];
		if (local46 > 0) {
			this.aByteArray34 = new byte[local46];
			this.aShortArray27 = new short[local46];
			this.aShortArray34 = new short[local46];
			this.aShortArray31 = new short[local46];
		}
		if (local66 == 1) {
			this.anIntArray223 = new int[local38];
		}
		if (local50 == 1) {
			this.aByteArray33 = new byte[local42];
			this.aByteArray31 = new byte[local42];
			this.aShortArray28 = new short[local42];
		}
		if (local54 == 255) {
			this.aByteArray36 = new byte[local42];
		} else {
			this.aByte9 = (byte) local54;
		}
		if (local58 == 1) {
			this.aByteArray27 = new byte[local42];
		}
		if (local62 == 1) {
			this.anIntArray216 = new int[local42];
		}
		this.aShortArray33 = new short[local42];
		local8.anInt4061 = 0;
		local13.anInt4061 = local165;
		local18.anInt4061 = local171;
		local23.anInt4061 = local90;
		local28.anInt4061 = local125;
		@Pc(301) int local301 = 0;
		@Pc(303) int local303 = 0;
		@Pc(305) int local305 = 0;
		@Pc(312) int local312;
		@Pc(314) int local314;
		@Pc(324) int local324;
		@Pc(334) int local334;
		for (@Pc(307) int local307 = 0; local307 < local38; local307++) {
			local312 = local8.method3010();
			local314 = 0;
			if ((local312 & 0x1) != 0) {
				local314 = local13.method3045();
			}
			local324 = 0;
			if ((local312 & 0x2) != 0) {
				local324 = local18.method3045();
			}
			local334 = 0;
			if ((local312 & 0x4) != 0) {
				local334 = local23.method3045();
			}
			this.anIntArray218[local307] = local301 + local314;
			this.anIntArray221[local307] = local303 + local324;
			this.anIntArray215[local307] = local305 + local334;
			local301 = this.anIntArray218[local307];
			local303 = this.anIntArray221[local307];
			local305 = this.anIntArray215[local307];
			if (local66 == 1) {
				this.anIntArray223[local307] = local28.method3010();
			}
		}
		local8.anInt4061 = local149;
		local13.anInt4061 = local116;
		local18.anInt4061 = local98;
		local23.anInt4061 = local134;
		local28.anInt4061 = local107;
		for (local312 = 0; local312 < local42; local312++) {
			this.aShortArray33[local312] = (short) local8.method3023();
			if (local50 == 1) {
				local314 = local13.method3010();
				if ((local314 & 0x1) == 1) {
					this.aByteArray33[local312] = 1;
					local1 = true;
				} else {
					this.aByteArray33[local312] = 0;
				}
				if ((local314 & 0x2) == 2) {
					this.aByteArray31[local312] = (byte) (local314 >> 2);
					this.aShortArray28[local312] = this.aShortArray33[local312];
					this.aShortArray33[local312] = 127;
					if (this.aShortArray28[local312] != -1) {
						local3 = true;
					}
				} else {
					this.aByteArray31[local312] = -1;
					this.aShortArray28[local312] = -1;
				}
			}
			if (local54 == 255) {
				this.aByteArray36[local312] = local18.method3009();
			}
			if (local58 == 1) {
				this.aByteArray27[local312] = local23.method3009();
			}
			if (local62 == 1) {
				this.anIntArray216[local312] = local28.method3010();
			}
		}
		local8.anInt4061 = local143;
		local13.anInt4061 = local92;
		local314 = 0;
		local324 = 0;
		local334 = 0;
		@Pc(536) int local536 = 0;
		@Pc(543) int local543;
		for (@Pc(538) int local538 = 0; local538 < local42; local538++) {
			local543 = local13.method3010();
			if (local543 == 1) {
				local314 = local8.method3045() + local536;
				local324 = local8.method3045() + local314;
				local334 = local8.method3045() + local324;
				local536 = local334;
				this.anIntArray217[local538] = local314;
				this.anIntArray214[local538] = local324;
				this.anIntArray219[local538] = local334;
			}
			if (local543 == 2) {
				local324 = local334;
				local334 = local8.method3045() + local536;
				local536 = local334;
				this.anIntArray217[local538] = local314;
				this.anIntArray214[local538] = local324;
				this.anIntArray219[local538] = local334;
			}
			if (local543 == 3) {
				local314 = local334;
				local334 = local8.method3045() + local536;
				local536 = local334;
				this.anIntArray217[local538] = local314;
				this.anIntArray214[local538] = local324;
				this.anIntArray219[local538] = local334;
			}
			if (local543 == 4) {
				@Pc(646) int local646 = local314;
				local314 = local324;
				local324 = local646;
				local334 = local8.method3045() + local536;
				local536 = local334;
				this.anIntArray217[local538] = local314;
				this.anIntArray214[local538] = local646;
				this.anIntArray219[local538] = local334;
			}
		}
		local8.anInt4061 = local157;
		for (local543 = 0; local543 < local46; local543++) {
			this.aByteArray34[local543] = 0;
			this.aShortArray27[local543] = (short) local8.method3023();
			this.aShortArray34[local543] = (short) local8.method3023();
			this.aShortArray31[local543] = (short) local8.method3023();
		}
		if (this.aByteArray31 != null) {
			@Pc(721) boolean local721 = false;
			for (@Pc(723) int local723 = 0; local723 < local42; local723++) {
				@Pc(731) int local731 = this.aByteArray31[local723] & 0xFF;
				if (local731 != 255) {
					if ((this.aShortArray27[local731] & 0xFFFF) == this.anIntArray217[local723] && (this.aShortArray34[local731] & 0xFFFF) == this.anIntArray214[local723] && (this.aShortArray31[local731] & 0xFFFF) == this.anIntArray219[local723]) {
						this.aByteArray31[local723] = -1;
					} else {
						local721 = true;
					}
				}
			}
			if (!local721) {
				this.aByteArray31 = null;
			}
		}
		if (!local3) {
			this.aShortArray28 = null;
		}
		if (!local1) {
			this.aByteArray33 = null;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(Lclient!o;I)I")
	private int method2009(@OriginalArg(0) Class8_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = -1;
		@Pc(6) int local6 = arg0.anIntArray218[arg1];
		@Pc(11) int local11 = arg0.anIntArray221[arg1];
		@Pc(16) int local16 = arg0.anIntArray215[arg1];
		for (@Pc(18) int local18 = 0; local18 < this.anInt2760; local18++) {
			if (local6 == this.anIntArray218[local18] && local11 == this.anIntArray221[local18] && local16 == this.anIntArray215[local18]) {
				local1 = local18;
				break;
			}
		}
		if (local1 == -1) {
			this.anIntArray218[this.anInt2760] = local6;
			this.anIntArray221[this.anInt2760] = local11;
			this.anIntArray215[this.anInt2760] = local16;
			if (arg0.anIntArray223 != null) {
				this.anIntArray223[this.anInt2760] = arg0.anIntArray223[arg1];
			}
			local1 = this.anInt2760++;
		}
		return local1;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(SS)V")
	public void method2010(@OriginalArg(0) short arg0, @OriginalArg(1) short arg1) {
		if (this.aShortArray28 == null) {
			return;
		}
		for (@Pc(5) int local5 = 0; local5 < this.anInt2759; local5++) {
			if (this.aShortArray28[local5] == arg0) {
				this.aShortArray28[local5] = arg1;
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(III)Lclient!e;")
	@Override
	public Class8 method2669() {
		return this.method2007(this.aShort12, this.aShort7, -50, -10, -50);
	}

	@OriginalMember(owner = "client!o", name = "k", descriptor = "()V")
	public void method2011() {
		for (@Pc(1) int local1 = 0; local1 < this.anInt2760; local1++) {
			@Pc(7) int local7 = this.anIntArray215[local1];
			this.anIntArray215[local1] = this.anIntArray218[local1];
			this.anIntArray218[local1] = -local7;
		}
		this.method2004();
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
	public void method2012() {
		@Pc(3) int local3 = Static135.anIntArray220[256];
		@Pc(7) int local7 = Static135.anIntArray213[256];
		for (@Pc(9) int local9 = 0; local9 < this.anInt2760; local9++) {
			@Pc(26) int local26 = this.anIntArray215[local9] * local3 + this.anIntArray218[local9] * local7 >> 16;
			this.anIntArray215[local9] = this.anIntArray215[local9] * local7 - this.anIntArray218[local9] * local3 >> 16;
			this.anIntArray218[local9] = local26;
		}
		this.method2004();
	}

	@OriginalMember(owner = "client!o", name = "l", descriptor = "()V")
	public void method2013() {
		this.anIntArray223 = null;
		this.anIntArray216 = null;
		this.anIntArrayArray19 = null;
		this.anIntArrayArray20 = null;
	}

	@OriginalMember(owner = "client!o", name = "m", descriptor = "()V")
	private void method2014() {
		if (this.aBoolean160) {
			return;
		}
		this.aBoolean160 = true;
		@Pc(8) int local8 = 32767;
		@Pc(10) int local10 = 32767;
		@Pc(12) int local12 = 32767;
		@Pc(14) int local14 = -32768;
		@Pc(16) int local16 = -32768;
		@Pc(18) int local18 = -32768;
		for (@Pc(20) int local20 = 0; local20 < this.anInt2760; local20++) {
			@Pc(26) int local26 = this.anIntArray218[local20];
			@Pc(31) int local31 = this.anIntArray221[local20];
			@Pc(36) int local36 = this.anIntArray215[local20];
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
		this.aShort5 = (short) local8;
		this.aShort9 = (short) local14;
		this.aShort6 = (short) local10;
		this.aShort11 = (short) local16;
		this.aShort8 = (short) local12;
		this.aShort10 = (short) local18;
	}
}
