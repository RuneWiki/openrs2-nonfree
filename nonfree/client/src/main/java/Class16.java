import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ef")
public abstract class Class16 {

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray2;

	@OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
	public int anInt938;

	@OriginalMember(owner = "client!ef", name = "i", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "[I")
	protected int[] anIntArray94;

	@OriginalMember(owner = "client!ef", name = "z", descriptor = "[I")
	protected int[] anIntArray95;

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "[I")
	private int[] anIntArray96;

	@OriginalMember(owner = "client!ef", name = "H", descriptor = "[I")
	private int[] anIntArray98;

	@OriginalMember(owner = "client!ef", name = "K", descriptor = "Lclient!rf;")
	private Class62 aClass62_2;

	@OriginalMember(owner = "client!ef", name = "M", descriptor = "[Lclient!rf;")
	private Class62[] aClass62Array2;

	@OriginalMember(owner = "client!ef", name = "P", descriptor = "I")
	private int anInt958;

	@OriginalMember(owner = "client!ef", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!ef", name = "R", descriptor = "[I")
	protected int[] anIntArray99;

	@OriginalMember(owner = "client!ef", name = "O", descriptor = "Z")
	private final boolean aBoolean53;

	@OriginalMember(owner = "client!ef", name = "r", descriptor = "Z")
	private final boolean aBoolean52;

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(ZZ)V")
	protected Class16(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean53 = arg1;
		this.aBoolean52 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public final void method556() {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2.length; local3++) {
			if (this.anObjectArrayArray2[local3] != null) {
				for (@Pc(12) int local12 = 0; local12 < this.anObjectArrayArray2[local3].length; local12++) {
					this.anObjectArrayArray2[local3][local12] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IB[I)Z")
	private boolean method557(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.anObjectArray2[arg0] == null) {
			return false;
		}
		@Pc(22) int local22 = this.anIntArray95[arg0];
		@Pc(27) int[] local27 = this.anIntArrayArray8[arg0];
		@Pc(32) Object[] local32 = this.anObjectArrayArray2[arg0];
		@Pc(34) boolean local34 = true;
		for (@Pc(36) int local36 = 0; local36 < local22; local36++) {
			if (local32[local27[local36]] == null) {
				local34 = false;
				break;
			}
		}
		if (local34) {
			return true;
		}
		@Pc(86) byte[] local86;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local86 = Static98.method1797(false, this.anObjectArray2[arg0]);
		} else {
			local86 = Static98.method1797(true, this.anObjectArray2[arg0]);
			@Pc(101) Class3_Sub11 local101 = new Class3_Sub11(local86);
			local101.method1012(arg1, local101.aByteArray13.length);
		}
		@Pc(113) byte[] local113;
		try {
			local113 = Static109.method1999(local86);
		} catch (@Pc(115) RuntimeException local115) {
			throw Static38.method769(local115, "T3 - " + (arg1 != null) + "," + arg0 + "," + local86.length + "," + Static10.method167(local86, local86.length) + "," + Static10.method167(local86, local86.length - 2) + "," + this.anIntArray94[arg0] + "," + this.anInt938);
		}
		if (this.aBoolean52) {
			this.anObjectArray2[arg0] = null;
		}
		if (local22 > 1) {
			@Pc(182) int local182 = local113.length;
			@Pc(184) int local184 = local182 - 1;
			@Pc(189) int local189 = local113[local184] & 0xFF;
			@Pc(197) int local197 = local184 - local189 * local22 * 4;
			@Pc(202) Class3_Sub11 local202 = new Class3_Sub11(local113);
			@Pc(205) int[] local205 = new int[local22];
			local202.anInt1562 = local197;
			@Pc(216) int local216;
			for (@Pc(210) int local210 = 0; local210 < local189; local210++) {
				@Pc(214) int local214 = 0;
				for (local216 = 0; local216 < local22; local216++) {
					local214 += local202.method984();
					local205[local216] += local214;
				}
			}
			@Pc(250) byte[][] local250 = new byte[local22][];
			for (local216 = 0; local216 < local22; local216++) {
				local250[local216] = new byte[local205[local216]];
				local205[local216] = 0;
			}
			local202.anInt1562 = local197;
			@Pc(278) int local278 = 0;
			@Pc(284) int local284;
			for (@Pc(280) int local280 = 0; local280 < local189; local280++) {
				local284 = 0;
				for (@Pc(286) int local286 = 0; local286 < local22; local286++) {
					local284 += local202.method984();
					Static135.method733(local113, local278, local250[local286], local205[local286], local284);
					local205[local286] += local284;
					local278 += local284;
				}
			}
			for (local284 = 0; local284 < local22; local284++) {
				if (this.aBoolean53) {
					local32[local27[local284]] = local250[local284];
				} else {
					local32[local27[local284]] = Static108.method1979(local250[local284]);
				}
			}
		} else if (this.aBoolean53) {
			local32[local27[0]] = local113;
		} else {
			local32[local27[0]] = Static108.method1979(local113);
		}
		return true;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IBI)[B")
	public final byte[] method558(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || arg0 >= this.anObjectArrayArray2[arg1].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(55) boolean local55 = this.method557(arg1, null);
			if (!local55) {
				this.method568(arg1);
				local55 = this.method557(arg1, null);
				if (!local55) {
					return null;
				}
			}
		}
		return Static98.method1797(false, this.anObjectArrayArray2[arg1][arg0]);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BII)Z")
	public final boolean method559(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg0].length) {
			return false;
		} else if (this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method568(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZ)[B")
	public final byte[] method560(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method566(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method566(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(IZ)I")
	public final int method561(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)Z")
	public final boolean method562(@OriginalArg(0) int arg0) {
		if (this.anObjectArray2[arg0] == null) {
			this.method568(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)V")
	protected void method563(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BLclient!he;Lclient!he;)Z")
	public final boolean method564(@OriginalArg(1) Class26 arg0, @OriginalArg(2) Class26 arg1) {
		@Pc(3) Class26 local3 = arg0.method841();
		@Pc(7) Class26 local7 = arg1.method841();
		@Pc(19) int local19 = this.aClass62_2.method1901(local3.method834());
		@Pc(37) int local37 = this.aClass62Array2[local19].method1901(local7.method834());
		return this.method559(local19, local37);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILclient!he;)V")
	public final void method565(@OriginalArg(1) Class26 arg0) {
		@Pc(7) Class26 local7 = arg0.method841();
		@Pc(15) int local15 = this.aClass62_2.method1901(local7.method834());
		if (local15 >= 0) {
			this.method563(local15);
		}
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(IBI)[B")
	public final byte[] method566(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method578(null, arg0, arg1);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZLclient!he;I)I")
	public final int method567(@OriginalArg(1) Class26 arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class26 local3 = arg0.method841();
		return this.aClass62Array2[arg1].method1901(local3.method834());
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "(II)V")
	protected void method568(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)[B")
	public final byte[] method569(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method558(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method558(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "(II)[I")
	public final int[] method571(@OriginalArg(1) int arg0) {
		return this.anIntArrayArray8[arg0];
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)Z")
	public final boolean method572() {
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.anIntArray98.length; local9++) {
			@Pc(16) int local16 = this.anIntArray98[local9];
			if (this.anObjectArray2[local16] == null) {
				this.method568(local16);
				if (this.anObjectArray2[local16] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZLclient!he;Lclient!he;)[B")
	public final byte[] method573(@OriginalArg(1) Class26 arg0, @OriginalArg(2) Class26 arg1) {
		@Pc(16) Class26 local16 = arg0.method841();
		@Pc(20) Class26 local20 = arg1.method841();
		@Pc(28) int local28 = this.aClass62_2.method1901(local16.method834());
		@Pc(38) int local38 = this.aClass62Array2[local28].method1901(local20.method834());
		return this.method566(local28, local38);
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!he;I)I")
	public final int method574(@OriginalArg(0) Class26 arg0) {
		@Pc(3) Class26 local3 = arg0.method841();
		return this.aClass62_2.method1901(local3.method834());
	}

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "(II)V")
	public final void method575(@OriginalArg(1) int arg0) {
		for (@Pc(13) int local13 = 0; local13 < this.anObjectArrayArray2[arg0].length; local13++) {
			this.anObjectArrayArray2[arg0][local13] = null;
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B[B)V")
	protected final void method576(@OriginalArg(1) byte[] arg0) {
		this.anInt938 = Static10.method167(arg0, arg0.length);
		@Pc(19) Class3_Sub11 local19 = new Class3_Sub11(Static109.method1999(arg0));
		@Pc(23) int local23 = local19.method981();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		if (local23 >= 6) {
			local19.method984();
		}
		@Pc(57) int local57 = local19.method981();
		@Pc(59) int local59 = -1;
		@Pc(61) int local61 = 0;
		this.anInt958 = local19.method974();
		this.anIntArray98 = new int[this.anInt958];
		for (@Pc(73) int local73 = 0; local73 < this.anInt958; local73++) {
			this.anIntArray98[local73] = local61 += local19.method974();
			if (this.anIntArray98[local73] > local59) {
				local59 = this.anIntArray98[local73];
			}
		}
		this.anObjectArray2 = new Object[local59 + 1];
		this.anIntArray99 = new int[local59 + 1];
		this.anIntArray95 = new int[local59 + 1];
		this.anObjectArrayArray2 = new Object[local59 + 1][];
		this.anIntArray94 = new int[local59 + 1];
		this.anIntArrayArray8 = new int[local59 + 1][];
		@Pc(158) int local158;
		if (local57 != 0) {
			this.anIntArray96 = new int[local59 + 1];
			for (local158 = 0; local158 < this.anInt958; local158++) {
				this.anIntArray96[this.anIntArray98[local158]] = local19.method984();
			}
			this.aClass62_2 = new Class62(this.anIntArray96);
		}
		for (local158 = 0; local158 < this.anInt958; local158++) {
			this.anIntArray94[this.anIntArray98[local158]] = local19.method984();
		}
		for (@Pc(207) int local207 = 0; local207 < this.anInt958; local207++) {
			this.anIntArray99[this.anIntArray98[local207]] = local19.method984();
		}
		for (@Pc(226) int local226 = 0; local226 < this.anInt958; local226++) {
			this.anIntArray95[this.anIntArray98[local226]] = local19.method974();
		}
		@Pc(258) int local258;
		@Pc(265) int local265;
		@Pc(260) int local260;
		@Pc(273) int local273;
		for (@Pc(249) int local249 = 0; local249 < this.anInt958; local249++) {
			local61 = 0;
			local258 = this.anIntArray98[local249];
			local260 = -1;
			local265 = this.anIntArray95[local258];
			this.anIntArrayArray8[local258] = new int[local265];
			for (local273 = 0; local273 < local265; local273++) {
				@Pc(290) int local290 = this.anIntArrayArray8[local258][local273] = local61 += local19.method974();
				if (local290 > local260) {
					local260 = local290;
				}
			}
			this.anObjectArrayArray2[local258] = new Object[local260 + 1];
		}
		if (local57 == 0) {
			return;
		}
		this.aClass62Array2 = new Class62[local59 + 1];
		this.anIntArrayArray9 = new int[local59 + 1][];
		for (local258 = 0; local258 < this.anInt958; local258++) {
			local265 = this.anIntArray98[local258];
			local260 = this.anIntArray95[local265];
			this.anIntArrayArray9[local265] = new int[this.anObjectArrayArray2[local265].length];
			for (local273 = 0; local273 < local260; local273++) {
				this.anIntArrayArray9[local265][this.anIntArrayArray8[local265][local273]] = local19.method984();
			}
			this.aClass62Array2[local265] = new Class62(this.anIntArrayArray9[local265]);
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([IIZI)[B")
	public final byte[] method578(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg2 < 0 || arg2 >= this.anObjectArrayArray2[arg1].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg2] == null) {
			@Pc(49) boolean local49 = this.method557(arg1, arg0);
			if (!local49) {
				this.method568(arg1);
				local49 = this.method557(arg1, arg0);
				if (!local49) {
					return null;
				}
			}
		}
		@Pc(75) byte[] local75 = Static98.method1797(false, this.anObjectArrayArray2[arg1][arg2]);
		if (this.aBoolean53) {
			this.anObjectArrayArray2[arg1][arg2] = null;
		}
		return local75;
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)I")
	public final int method579() {
		return this.anObjectArrayArray2.length;
	}
}
