import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public abstract class Class11 {

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "[Lclient!ne;")
	private Class39[] aClass39Array2;

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "I")
	private int anInt471;

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "Lclient!ne;")
	private Class39 aClass39_2;

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "[[[B")
	private byte[][][] aByteArrayArrayArray7;

	@OriginalMember(owner = "client!kc", name = "o", descriptor = "[[B")
	public byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "[I")
	protected int[] anIntArray68;

	@OriginalMember(owner = "client!kc", name = "y", descriptor = "[[I")
	private int[][] anIntArrayArray15;

	@OriginalMember(owner = "client!kc", name = "z", descriptor = "[I")
	private int[] anIntArray69;

	@OriginalMember(owner = "client!kc", name = "A", descriptor = "[I")
	public int[] anIntArray70;

	@OriginalMember(owner = "client!kc", name = "F", descriptor = "[[I")
	private int[][] anIntArrayArray16;

	@OriginalMember(owner = "client!kc", name = "H", descriptor = "I")
	public int anInt493;

	@OriginalMember(owner = "client!kc", name = "I", descriptor = "[I")
	private int[] anIntArray71;

	@OriginalMember(owner = "client!kc", name = "P", descriptor = "[I")
	public int[] anIntArray72;

	@OriginalMember(owner = "client!kc", name = "Q", descriptor = "Z")
	private final boolean aBoolean34;

	@OriginalMember(owner = "client!kc", name = "v", descriptor = "Z")
	private final boolean aBoolean33;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(ZZ)V")
	protected Class11(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean34 = arg1;
		this.aBoolean33 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIZ)[B")
	public final byte[] method324(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0 || this.aByteArrayArrayArray7.length <= arg1 || this.aByteArrayArrayArray7[arg1] == null || arg0 < 0 || this.aByteArrayArrayArray7[arg1].length <= arg0) {
			return null;
		}
		if (this.aByteArrayArrayArray7[arg1][arg0] == null) {
			@Pc(55) boolean local55 = this.method341(arg1, null);
			if (!local55) {
				this.method344(arg1);
				local55 = this.method341(arg1, null);
				if (!local55) {
					return null;
				}
			}
		}
		return this.aByteArrayArrayArray7[arg1][arg0];
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)I")
	public final int method325(@OriginalArg(0) int arg0) {
		return this.aByteArrayArrayArray7[arg0].length;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(III[I)[B")
	public final byte[] method326(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (arg0 < 0 || arg0 >= this.aByteArrayArrayArray7.length || this.aByteArrayArrayArray7[arg0] == null || arg1 < 0 || this.aByteArrayArrayArray7[arg0].length <= arg1) {
			return null;
		}
		if (this.aByteArrayArrayArray7[arg0][arg1] == null) {
			@Pc(51) boolean local51 = this.method341(arg0, arg2);
			if (!local51) {
				this.method344(arg0);
				local51 = this.method341(arg0, arg2);
				if (!local51) {
					return null;
				}
			}
		}
		@Pc(74) byte[] local74 = this.aByteArrayArrayArray7[arg0][arg1];
		if (this.aBoolean34) {
			this.aByteArrayArrayArray7[arg0][arg1] = null;
		}
		return local74;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
	protected void method328(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)[I")
	public final int[] method329(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray16[arg0];
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!lc;ILclient!lc;)Z")
	public final boolean method330(@OriginalArg(0) Class31 arg0, @OriginalArg(2) Class31 arg1) {
		@Pc(7) Class31 local7 = arg0.method1230();
		@Pc(11) Class31 local11 = arg1.method1230();
		@Pc(19) int local19 = this.aClass39_2.method1384(local7.method1225());
		@Pc(35) int local35 = this.aClass39Array2[local19].method1384(local11.method1225());
		return this.method347(local35, local19);
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(II)[B")
	public final byte[] method332(@OriginalArg(1) int arg0) {
		if (this.aByteArrayArrayArray7.length == 1) {
			return this.method324(arg0, 0);
		} else if (this.aByteArrayArrayArray7[arg0].length == 1) {
			return this.method324(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!lc;Lclient!lc;B)[B")
	public final byte[] method333(@OriginalArg(0) Class31 arg0, @OriginalArg(1) Class31 arg1) {
		@Pc(12) Class31 local12 = arg1.method1230();
		@Pc(16) Class31 local16 = arg0.method1230();
		@Pc(26) int local26 = this.aClass39_2.method1384(local12.method1225());
		@Pc(38) int local38 = this.aClass39Array2[local26].method1384(local16.method1225());
		return this.method338(local26, local38);
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!lc;I)I")
	public final int method334(@OriginalArg(0) int arg0, @OriginalArg(1) Class31 arg1) {
		@Pc(3) Class31 local3 = arg1.method1230();
		return this.aClass39Array2[arg0].method1384(local3.method1225());
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BI)Z")
	public final boolean method335(@OriginalArg(1) int arg0) {
		if (this.aByteArrayArray3[arg0] == null) {
			this.method344(arg0);
			return this.aByteArrayArray3[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIB)[B")
	public final byte[] method338(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method326(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(II)V")
	public final void method339(@OriginalArg(1) int arg0) {
		for (@Pc(3) int local3 = 0; local3 < this.aByteArrayArrayArray7[arg0].length; local3++) {
			this.aByteArrayArrayArray7[arg0][local3] = null;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)Z")
	public final boolean method340() {
		@Pc(3) boolean local3 = true;
		for (@Pc(5) int local5 = 0; local5 < this.anIntArray69.length; local5++) {
			@Pc(12) int local12 = this.anIntArray69[local5];
			if (this.aByteArrayArray3[local12] == null) {
				this.method344(local12);
				if (this.aByteArrayArray3[local12] == null) {
					local3 = false;
				}
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I[IZ)Z")
	private boolean method341(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (this.aByteArrayArray3[arg0] == null) {
			return false;
		}
		@Pc(17) int local17 = this.anIntArray68[arg0];
		@Pc(22) int[] local22 = this.anIntArrayArray16[arg0];
		@Pc(27) byte[][] local27 = this.aByteArrayArrayArray7[arg0];
		@Pc(29) boolean local29 = true;
		for (@Pc(31) int local31 = 0; local31 < local17; local31++) {
			if (local27[local22[local31]] == null) {
				local29 = false;
				break;
			}
		}
		if (local29) {
			return true;
		}
		@Pc(86) byte[] local86;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local86 = this.aByteArrayArray3[arg0];
		} else {
			local86 = new byte[this.aByteArrayArray3[arg0].length];
			Static112.method991(this.aByteArrayArray3[arg0], 0, local86, 0, local86.length);
			@Pc(101) Class2_Sub6 local101 = new Class2_Sub6(local86);
			local101.method640(local101.aByteArray11.length, arg1);
		}
		@Pc(120) byte[] local120 = Static31.method852(local86);
		if (this.aBoolean33) {
			this.aByteArrayArray3[arg0] = null;
		}
		if (local17 <= 1) {
			local27[local22[0]] = local120;
		} else {
			@Pc(142) int local142 = local120.length;
			@Pc(145) int local145 = local142 - 1;
			@Pc(149) int local149 = local120[local145] & 0xFF;
			@Pc(157) int local157 = local145 - local149 * 4 * local17;
			@Pc(162) Class2_Sub6 local162 = new Class2_Sub6(local120);
			@Pc(165) int[] local165 = new int[local17];
			local162.anInt952 = local157;
			@Pc(174) int local174;
			@Pc(176) int local176;
			for (@Pc(170) int local170 = 0; local170 < local149; local170++) {
				local174 = 0;
				for (local176 = 0; local176 < local17; local176++) {
					local174 += local162.method629();
					local165[local176] += local174;
				}
			}
			for (local174 = 0; local174 < local17; local174++) {
				if (local27[local22[local174]] == null) {
					local27[local22[local174]] = new byte[local165[local174]];
				}
				local165[local174] = 0;
			}
			local162.anInt952 = local157;
			local176 = 0;
			for (@Pc(237) int local237 = 0; local237 < local149; local237++) {
				@Pc(241) int local241 = 0;
				for (@Pc(243) int local243 = 0; local243 < local17; local243++) {
					local241 += local162.method629();
					Static112.method991(local120, local176, local27[local22[local243]], local165[local243], local241);
					local176 += local241;
					local165[local243] += local241;
				}
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLclient!lc;)V")
	public final void method342(@OriginalArg(1) Class31 arg0) {
		@Pc(7) Class31 local7 = arg0.method1230();
		@Pc(23) int local23 = this.aClass39_2.method1384(local7.method1225());
		if (local23 >= 0) {
			this.method328(local23);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)V")
	protected void method344(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!lc;B)I")
	public final int method345(@OriginalArg(0) Class31 arg0) {
		@Pc(3) Class31 local3 = arg0.method1230();
		return this.aClass39_2.method1384(local3.method1225());
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
	public final void method346() {
		for (@Pc(13) int local13 = 0; local13 < this.aByteArrayArrayArray7.length; local13++) {
			if (this.aByteArrayArrayArray7[local13] != null) {
				for (@Pc(22) int local22 = 0; local22 < this.aByteArrayArrayArray7[local13].length; local22++) {
					this.aByteArrayArrayArray7[local13][local22] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(IIB)Z")
	public final boolean method347(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0 || this.aByteArrayArrayArray7.length <= arg1 || this.aByteArrayArrayArray7[arg1] == null || arg0 < 0 || this.aByteArrayArrayArray7[arg1].length <= arg0) {
			return false;
		} else if (this.aByteArrayArrayArray7[arg1][arg0] != null) {
			return true;
		} else if (this.aByteArrayArray3[arg1] == null) {
			this.method344(arg1);
			return this.aByteArrayArray3[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(ZI)[B")
	public final byte[] method348(@OriginalArg(1) int arg0) {
		if (this.aByteArrayArrayArray7.length == 1) {
			return this.method338(0, arg0);
		} else if (this.aByteArrayArrayArray7[arg0].length == 1) {
			return this.method338(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)I")
	public final int method350() {
		return this.aByteArrayArrayArray7.length;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([BI)V")
	protected final void method352(@OriginalArg(0) byte[] arg0) {
		this.anInt493 = Static48.method1110(arg0, arg0.length);
		@Pc(19) Class2_Sub6 local19 = new Class2_Sub6(Static31.method852(arg0));
		@Pc(23) int local23 = local19.method665();
		if (local23 != 5) {
			return;
		}
		@Pc(33) int local33 = local19.method665();
		this.anInt471 = local19.method627();
		@Pc(40) int local40 = 0;
		@Pc(42) int local42 = -1;
		this.anIntArray69 = new int[this.anInt471];
		for (@Pc(49) int local49 = 0; local49 < this.anInt471; local49++) {
			this.anIntArray69[local49] = local40 += local19.method627();
			if (local42 < this.anIntArray69[local49]) {
				local42 = this.anIntArray69[local49];
			}
		}
		this.anIntArray68 = new int[local42 + 1];
		this.anIntArray72 = new int[local42 + 1];
		this.anIntArray70 = new int[local42 + 1];
		this.aByteArrayArrayArray7 = new byte[local42 + 1][][];
		this.aByteArrayArray3 = new byte[local42 + 1][];
		this.anIntArrayArray16 = new int[local42 + 1][];
		@Pc(135) int local135;
		if (local33 != 0) {
			this.anIntArray71 = new int[local42 + 1];
			for (local135 = 0; local135 < this.anInt471; local135++) {
				this.anIntArray71[this.anIntArray69[local135]] = local19.method629();
			}
			this.aClass39_2 = new Class39(this.anIntArray71);
		}
		for (local135 = 0; local135 < this.anInt471; local135++) {
			this.anIntArray72[this.anIntArray69[local135]] = local19.method629();
		}
		for (@Pc(188) int local188 = 0; local188 < this.anInt471; local188++) {
			this.anIntArray70[this.anIntArray69[local188]] = local19.method629();
		}
		for (@Pc(213) int local213 = 0; local213 < this.anInt471; local213++) {
			this.anIntArray68[this.anIntArray69[local213]] = local19.method627();
		}
		@Pc(241) int local241;
		@Pc(246) int local246;
		@Pc(254) int local254;
		@Pc(256) int local256;
		for (@Pc(232) int local232 = 0; local232 < this.anInt471; local232++) {
			local40 = 0;
			local241 = this.anIntArray69[local232];
			local246 = this.anIntArray68[local241];
			this.anIntArrayArray16[local241] = new int[local246];
			local254 = -1;
			for (local256 = 0; local256 < local246; local256++) {
				@Pc(273) int local273 = this.anIntArrayArray16[local241][local256] = local40 += local19.method627();
				if (local254 < local273) {
					local254 = local273;
				}
			}
			this.aByteArrayArrayArray7[local241] = new byte[local254 + 1][];
		}
		if (local33 == 0) {
			return;
		}
		this.aClass39Array2 = new Class39[local42 + 1];
		this.anIntArrayArray15 = new int[local42 + 1][];
		for (local241 = 0; local241 < this.anInt471; local241++) {
			local246 = this.anIntArray69[local241];
			local254 = this.anIntArray68[local246];
			this.anIntArrayArray15[local246] = new int[this.aByteArrayArrayArray7[local246].length];
			for (local256 = 0; local256 < local254; local256++) {
				this.anIntArrayArray15[local246][this.anIntArrayArray16[local246][local256]] = local19.method629();
			}
			this.aClass39Array2[local246] = new Class39(this.anIntArrayArray15[local246]);
		}
	}
}
