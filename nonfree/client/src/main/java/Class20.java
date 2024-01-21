import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public abstract class Class20 {

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "I")
	private int anInt909;

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray28;

	@OriginalMember(owner = "client!ea", name = "h", descriptor = "[I")
	protected int[] anIntArray106;

	@OriginalMember(owner = "client!ea", name = "k", descriptor = "[I")
	protected int[] anIntArray107;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "[I")
	private int[] anIntArray108;

	@OriginalMember(owner = "client!ea", name = "A", descriptor = "[I")
	protected int[] anIntArray109;

	@OriginalMember(owner = "client!ea", name = "B", descriptor = "I")
	public int anInt925;

	@OriginalMember(owner = "client!ea", name = "E", descriptor = "[Lclient!nd;")
	private Class52[] aClass52Array2;

	@OriginalMember(owner = "client!ea", name = "K", descriptor = "[I")
	private int[] anIntArray110;

	@OriginalMember(owner = "client!ea", name = "P", descriptor = "Lclient!nd;")
	private Class52 aClass52_2;

	@OriginalMember(owner = "client!ea", name = "S", descriptor = "[[I")
	private int[][] anIntArrayArray7;

	@OriginalMember(owner = "client!ea", name = "V", descriptor = "[[I")
	private int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!ea", name = "F", descriptor = "Z")
	private final boolean aBoolean95;

	@OriginalMember(owner = "client!ea", name = "H", descriptor = "Z")
	private final boolean aBoolean96;

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(ZZ)V")
	protected Class20(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean95 = arg1;
		this.aBoolean96 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[I)Z")
	private boolean method589(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.anObjectArray28[arg0] == null) {
			return false;
		}
		@Pc(24) int local24 = this.anIntArray107[arg0];
		@Pc(29) int[] local29 = this.anIntArrayArray7[arg0];
		@Pc(34) Object[] local34 = this.anObjectArrayArray2[arg0];
		@Pc(36) boolean local36 = true;
		for (@Pc(38) int local38 = 0; local38 < local24; local38++) {
			if (local34[local29[local38]] == null) {
				local36 = false;
				break;
			}
		}
		if (local36) {
			return true;
		}
		@Pc(87) byte[] local87;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local87 = Static113.method1802(false, this.anObjectArray28[arg0]);
		} else {
			local87 = Static113.method1802(true, this.anObjectArray28[arg0]);
			@Pc(102) Class4_Sub11 local102 = new Class4_Sub11(local87);
			local102.method710(local102.aByteArray9.length, arg1);
		}
		@Pc(114) byte[] local114;
		try {
			local114 = Static79.method1431(local87);
		} catch (@Pc(116) RuntimeException local116) {
			throw Static80.method1447(local116, "T3 - " + (arg1 != null) + "," + arg0 + "," + local87.length + "," + Static103.method1717(local87.length, local87) + "," + Static103.method1717(local87.length - 2, local87) + "," + this.anIntArray109[arg0] + "," + this.anInt925);
		}
		if (this.aBoolean96) {
			this.anObjectArray28[arg0] = null;
		}
		if (local24 > 1) {
			@Pc(205) int local205 = local114.length;
			@Pc(207) int local207 = local205 - 1;
			@Pc(212) int local212 = local114[local207] & 0xFF;
			@Pc(217) Class4_Sub11 local217 = new Class4_Sub11(local114);
			@Pc(225) int local225 = local207 - local24 * local212 * 4;
			local217.anInt1099 = local225;
			@Pc(231) int[] local231 = new int[local24];
			@Pc(239) int local239;
			for (@Pc(233) int local233 = 0; local233 < local212; local233++) {
				@Pc(237) int local237 = 0;
				for (local239 = 0; local239 < local24; local239++) {
					local237 += local217.method725();
					local231[local239] += local237;
				}
			}
			@Pc(273) byte[][] local273 = new byte[local24][];
			for (local239 = 0; local239 < local24; local239++) {
				local273[local239] = new byte[local231[local239]];
				local231[local239] = 0;
			}
			local217.anInt1099 = local225;
			@Pc(297) int local297 = 0;
			@Pc(303) int local303;
			for (@Pc(299) int local299 = 0; local299 < local212; local299++) {
				local303 = 0;
				for (@Pc(305) int local305 = 0; local305 < local24; local305++) {
					local303 += local217.method725();
					Static139.method952(local114, local297, local273[local305], local231[local305], local303);
					local297 += local303;
					local231[local305] += local303;
				}
			}
			for (local303 = 0; local303 < local24; local303++) {
				if (this.aBoolean95) {
					local34[local29[local303]] = local273[local303];
				} else {
					local34[local29[local303]] = Static60.method1111(local273[local303]);
				}
			}
		} else if (this.aBoolean95) {
			local34[local29[0]] = local114;
		} else {
			local34[local29[0]] = Static60.method1111(local114);
		}
		return true;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
	protected void method590(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)I")
	public final int method591(@OriginalArg(1) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILclient!ec;)I")
	public final int method592(@OriginalArg(1) Class22 arg0) {
		@Pc(12) Class22 local12 = arg0.method479();
		return this.aClass52_2.method1301(local12.method456());
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)Z")
	public final boolean method594(@OriginalArg(0) int arg0) {
		if (this.anObjectArray28[arg0] == null) {
			this.method590(arg0);
			return this.anObjectArray28[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)I")
	public final int method595() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(BI)V")
	protected void method596(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(III)[B")
	public final byte[] method597(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method611(arg0, null, arg1);
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(II)[I")
	public final int[] method598(@OriginalArg(0) int arg0) {
		return this.anIntArrayArray7[arg0];
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)Z")
	public final boolean method599() {
		@Pc(3) boolean local3 = true;
		for (@Pc(5) int local5 = 0; local5 < this.anIntArray110.length; local5++) {
			@Pc(12) int local12 = this.anIntArray110[local5];
			if (this.anObjectArray28[local12] == null) {
				this.method590(local12);
				if (this.anObjectArray28[local12] == null) {
					local3 = false;
				}
			}
		}
		return local3;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([BI)V")
	protected final void method600(@OriginalArg(0) byte[] arg0) {
		this.anInt925 = Static103.method1717(arg0.length, arg0);
		@Pc(19) Class4_Sub11 local19 = new Class4_Sub11(Static79.method1431(arg0));
		@Pc(25) int local25 = local19.method719();
		if (local25 != 5 && local25 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local25);
		}
		if (local25 >= 6) {
			local19.method725();
		}
		@Pc(53) int local53 = 0;
		@Pc(57) int local57 = local19.method719();
		this.anInt909 = local19.method718();
		this.anIntArray110 = new int[this.anInt909];
		@Pc(78) int local78 = -1;
		for (@Pc(80) int local80 = 0; local80 < this.anInt909; local80++) {
			this.anIntArray110[local80] = local53 += local19.method718();
			if (local78 < this.anIntArray110[local80]) {
				local78 = this.anIntArray110[local80];
			}
		}
		this.anIntArray109 = new int[local78 + 1];
		this.anIntArray106 = new int[local78 + 1];
		this.anObjectArray28 = new Object[local78 + 1];
		this.anObjectArrayArray2 = new Object[local78 + 1][];
		this.anIntArray107 = new int[local78 + 1];
		this.anIntArrayArray7 = new int[local78 + 1][];
		@Pc(162) int local162;
		if (local57 != 0) {
			this.anIntArray108 = new int[local78 + 1];
			for (local162 = 0; local162 < this.anInt909; local162++) {
				this.anIntArray108[this.anIntArray110[local162]] = local19.method725();
			}
			this.aClass52_2 = new Class52(this.anIntArray108);
		}
		for (local162 = 0; local162 < this.anInt909; local162++) {
			this.anIntArray109[this.anIntArray110[local162]] = local19.method725();
		}
		for (@Pc(207) int local207 = 0; local207 < this.anInt909; local207++) {
			this.anIntArray106[this.anIntArray110[local207]] = local19.method725();
		}
		for (@Pc(230) int local230 = 0; local230 < this.anInt909; local230++) {
			this.anIntArray107[this.anIntArray110[local230]] = local19.method718();
		}
		@Pc(260) int local260;
		@Pc(265) int local265;
		@Pc(255) int local255;
		@Pc(273) int local273;
		for (@Pc(249) int local249 = 0; local249 < this.anInt909; local249++) {
			local53 = 0;
			local255 = -1;
			local260 = this.anIntArray110[local249];
			local265 = this.anIntArray107[local260];
			this.anIntArrayArray7[local260] = new int[local265];
			for (local273 = 0; local273 < local265; local273++) {
				@Pc(290) int local290 = this.anIntArrayArray7[local260][local273] = local53 += local19.method718();
				if (local255 < local290) {
					local255 = local290;
				}
			}
			this.anObjectArrayArray2[local260] = new Object[local255 + 1];
		}
		if (local57 == 0) {
			return;
		}
		this.anIntArrayArray8 = new int[local78 + 1][];
		this.aClass52Array2 = new Class52[local78 + 1];
		for (local260 = 0; local260 < this.anInt909; local260++) {
			local265 = this.anIntArray110[local260];
			local255 = this.anIntArray107[local265];
			this.anIntArrayArray8[local265] = new int[this.anObjectArrayArray2[local265].length];
			for (local273 = 0; local273 < local255; local273++) {
				this.anIntArrayArray8[local265][this.anIntArrayArray7[local265][local273]] = local19.method725();
			}
			this.aClass52Array2[local265] = new Class52(this.anIntArrayArray8[local265]);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ec;Lclient!ec;I)Z")
	public final boolean method601(@OriginalArg(0) Class22 arg0, @OriginalArg(1) Class22 arg1) {
		@Pc(3) Class22 local3 = arg0.method479();
		@Pc(11) Class22 local11 = arg1.method479();
		@Pc(19) int local19 = this.aClass52_2.method1301(local3.method456());
		@Pc(34) int local34 = this.aClass52Array2[local19].method1301(local11.method456());
		return this.method604(local19, local34);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BLclient!ec;)V")
	public final void method603(@OriginalArg(1) Class22 arg0) {
		@Pc(7) Class22 local7 = arg0.method479();
		@Pc(15) int local15 = this.aClass52_2.method1301(local7.method456());
		if (local15 >= 0) {
			this.method596(local15);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZI)Z")
	public final boolean method604(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 < 0 || arg0 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg0] == null || arg1 < 0 || this.anObjectArrayArray2[arg0].length <= arg1) {
			return false;
		} else if (this.anObjectArrayArray2[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray28[arg0] == null) {
			this.method590(arg0);
			return this.anObjectArray28[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
	public final void method605() {
		for (@Pc(8) int local8 = 0; local8 < this.anObjectArrayArray2.length; local8++) {
			if (this.anObjectArrayArray2[local8] != null) {
				for (@Pc(17) int local17 = 0; local17 < this.anObjectArrayArray2[local8].length; local17++) {
					this.anObjectArrayArray2[local8][local17] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ec;IZ)I")
	public final int method606(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) Class22 local16 = arg0.method479();
		return this.aClass52Array2[arg1].method1301(local16.method456());
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "(II)[B")
	public final byte[] method607(@OriginalArg(0) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method608(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method608(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(III)[B")
	public final byte[] method608(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || this.anObjectArrayArray2.length <= arg1 || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || arg0 >= this.anObjectArrayArray2[arg1].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(49) boolean local49 = this.method589(arg1, null);
			if (!local49) {
				this.method590(arg1);
				local49 = this.method589(arg1, null);
				if (!local49) {
					return null;
				}
			}
		}
		return Static113.method1802(false, this.anObjectArrayArray2[arg1][arg0]);
	}

	@OriginalMember(owner = "client!ea", name = "e", descriptor = "(II)[B")
	public final byte[] method609(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method597(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method597(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ec;ILclient!ec;)[B")
	public final byte[] method610(@OriginalArg(0) Class22 arg0, @OriginalArg(2) Class22 arg1) {
		@Pc(7) Class22 local7 = arg0.method479();
		@Pc(11) Class22 local11 = arg1.method479();
		@Pc(19) int local19 = this.aClass52_2.method1301(local7.method456());
		@Pc(36) int local36 = this.aClass52Array2[local19].method1301(local11.method456());
		return this.method597(local19, local36);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II[II)[B")
	public final byte[] method611(@OriginalArg(1) int arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int arg2) {
		if (arg0 < 0 || this.anObjectArrayArray2.length <= arg0 || this.anObjectArrayArray2[arg0] == null || arg2 < 0 || arg2 >= this.anObjectArrayArray2[arg0].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg0][arg2] == null) {
			@Pc(46) boolean local46 = this.method589(arg0, arg1);
			if (!local46) {
				this.method590(arg0);
				local46 = this.method589(arg0, arg1);
				if (!local46) {
					return null;
				}
			}
		}
		@Pc(80) byte[] local80 = Static113.method1802(false, this.anObjectArrayArray2[arg0][arg2]);
		if (this.aBoolean95) {
			this.anObjectArrayArray2[arg0][arg2] = null;
		}
		return local80;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)V")
	public final void method612(@OriginalArg(0) int arg0) {
		for (@Pc(10) int local10 = 0; local10 < this.anObjectArrayArray2[arg0].length; local10++) {
			this.anObjectArrayArray2[arg0][local10] = null;
		}
	}
}
