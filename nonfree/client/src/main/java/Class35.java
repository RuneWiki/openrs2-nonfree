import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public abstract class Class35 {

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "[I")
	private int[] anIntArray300;

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "[Ljava/lang/Object;")
	protected Object[] anObjectArray28;

	@OriginalMember(owner = "client!ie", name = "r", descriptor = "[Lclient!p;")
	private Class57[] aClass57Array2;

	@OriginalMember(owner = "client!ie", name = "v", descriptor = "[I")
	protected int[] anIntArray301;

	@OriginalMember(owner = "client!ie", name = "B", descriptor = "[I")
	protected int[] anIntArray302;

	@OriginalMember(owner = "client!ie", name = "C", descriptor = "[I")
	private int[] anIntArray303;

	@OriginalMember(owner = "client!ie", name = "E", descriptor = "[I")
	protected int[] anIntArray304;

	@OriginalMember(owner = "client!ie", name = "H", descriptor = "Lclient!p;")
	private Class57 aClass57_2;

	@OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
	private int anInt2385;

	@OriginalMember(owner = "client!ie", name = "O", descriptor = "[[I")
	private int[][] anIntArrayArray24;

	@OriginalMember(owner = "client!ie", name = "Q", descriptor = "[[I")
	private int[][] anIntArrayArray25;

	@OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
	public int anInt2387;

	@OriginalMember(owner = "client!ie", name = "T", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray2;

	@OriginalMember(owner = "client!ie", name = "s", descriptor = "Z")
	private final boolean aBoolean125;

	@OriginalMember(owner = "client!ie", name = "W", descriptor = "Z")
	private final boolean aBoolean126;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(ZZ)V")
	protected Class35(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		this.aBoolean125 = arg1;
		this.aBoolean126 = arg0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)V")
	protected void method1559(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIB)Z")
	public final boolean method1561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 < 0 || arg1 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || this.anObjectArrayArray2[arg1].length <= arg0) {
			return false;
		} else if (this.anObjectArrayArray2[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray28[arg1] == null) {
			this.method1559(arg1);
			return this.anObjectArray28[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II[I)Z")
	private boolean method1562(@OriginalArg(0) int arg0, @OriginalArg(2) int[] arg1) {
		if (this.anObjectArray28[arg0] == null) {
			return false;
		}
		@Pc(15) int[] local15 = this.anIntArrayArray24[arg0];
		@Pc(20) int local20 = this.anIntArray302[arg0];
		@Pc(25) Object[] local25 = this.anObjectArrayArray2[arg0];
		@Pc(27) boolean local27 = true;
		for (@Pc(29) int local29 = 0; local29 < local20; local29++) {
			if (local25[local15[local29]] == null) {
				local27 = false;
				break;
			}
		}
		if (local27) {
			return true;
		}
		@Pc(86) byte[] local86;
		if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
			local86 = Static20.method436(false, this.anObjectArray28[arg0]);
		} else {
			local86 = Static20.method436(true, this.anObjectArray28[arg0]);
			@Pc(100) Class1_Sub19 local100 = new Class1_Sub19(local86);
			local100.method2044(arg1, local100.aByteArray42.length);
		}
		@Pc(117) byte[] local117;
		try {
			local117 = Static62.method1062(local86);
		} catch (@Pc(119) RuntimeException local119) {
			throw Static34.method627(local119, "T3 - " + (arg1 != null) + "," + arg0 + "," + local86.length + "," + Static106.method1726(local86.length, local86) + "," + Static106.method1726(local86.length - 2, local86) + "," + this.anIntArray301[arg0] + "," + this.anInt2387);
		}
		if (this.aBoolean126) {
			this.anObjectArray28[arg0] = null;
		}
		if (local20 > 1) {
			@Pc(188) int local188 = local117.length;
			@Pc(191) int local191 = local188 - 1;
			@Pc(195) int local195 = local117[local191] & 0xFF;
			@Pc(203) int local203 = local191 - local20 * local195 * 4;
			@Pc(208) Class1_Sub19 local208 = new Class1_Sub19(local117);
			@Pc(211) int[] local211 = new int[local20];
			local208.anInt3111 = local203;
			@Pc(221) int local221;
			for (@Pc(216) int local216 = 0; local216 < local195; local216++) {
				@Pc(219) int local219 = 0;
				for (local221 = 0; local221 < local20; local221++) {
					local219 += local208.method2046();
					local211[local221] += local219;
				}
			}
			@Pc(254) byte[][] local254 = new byte[local20][];
			for (local221 = 0; local221 < local20; local221++) {
				local254[local221] = new byte[local211[local221]];
				local211[local221] = 0;
			}
			@Pc(278) int local278 = 0;
			local208.anInt3111 = local203;
			@Pc(286) int local286;
			for (@Pc(283) int local283 = 0; local283 < local195; local283++) {
				local286 = 0;
				for (@Pc(288) int local288 = 0; local288 < local20; local288++) {
					local286 += local208.method2046();
					Static140.method1970(local117, local278, local254[local288], local211[local288], local286);
					local278 += local286;
					local211[local288] += local286;
				}
			}
			for (local286 = 0; local286 < local20; local286++) {
				if (this.aBoolean125) {
					local25[local15[local286]] = local254[local286];
				} else {
					local25[local15[local286]] = Static85.method1459(local254[local286]);
				}
			}
		} else if (this.aBoolean125) {
			local25[local15[0]] = local117;
		} else {
			local25[local15[0]] = Static85.method1459(local117);
		}
		return true;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)[B")
	public final byte[] method1563(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1577(arg0, 0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1577(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLclient!id;I)I")
	public final int method1564(@OriginalArg(1) Class34 arg0, @OriginalArg(2) int arg1) {
		@Pc(3) Class34 local3 = arg0.method963();
		return this.aClass57Array2[arg1].method1556(local3.method970());
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!id;I)V")
	public final void method1565(@OriginalArg(0) Class34 arg0) {
		@Pc(15) Class34 local15 = arg0.method963();
		@Pc(23) int local23 = this.aClass57_2.method1556(local15.method970());
		if (local23 >= 0) {
			this.method1572(local23);
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!id;Lclient!id;I)Z")
	public final boolean method1566(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class34 arg1) {
		@Pc(7) Class34 local7 = arg0.method963();
		@Pc(13) Class34 local13 = arg1.method963();
		@Pc(21) int local21 = this.aClass57_2.method1556(local7.method970());
		@Pc(33) int local33 = this.aClass57Array2[local21].method1556(local13.method970());
		return this.method1561(local33, local21);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)I")
	public final int method1568() {
		return this.anObjectArrayArray2.length;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!id;Lclient!id;B)[B")
	public final byte[] method1569(@OriginalArg(0) Class34 arg0, @OriginalArg(1) Class34 arg1) {
		@Pc(5) Class34 local5 = arg0.method963();
		@Pc(9) Class34 local9 = arg1.method963();
		@Pc(23) int local23 = this.aClass57_2.method1556(local5.method970());
		@Pc(33) int local33 = this.aClass57Array2[local23].method1556(local9.method970());
		return this.method1573(local23, local33);
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)Z")
	public final boolean method1570() {
		@Pc(12) boolean local12 = true;
		for (@Pc(14) int local14 = 0; local14 < this.anIntArray303.length; local14++) {
			@Pc(21) int local21 = this.anIntArray303[local14];
			if (this.anObjectArray28[local21] == null) {
				this.method1559(local21);
				if (this.anObjectArray28[local21] == null) {
					local12 = false;
				}
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)[B")
	public final byte[] method1571(@OriginalArg(1) int arg0) {
		if (this.anObjectArrayArray2.length == 1) {
			return this.method1573(0, arg0);
		} else if (this.anObjectArrayArray2[arg0].length == 1) {
			return this.method1573(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "(II)V")
	protected void method1572(@OriginalArg(1) int arg0) {
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(BII)[B")
	public final byte[] method1573(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method1574(null, arg1, arg0);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Z[III)[B")
	public final byte[] method1574(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 < 0 || arg2 >= this.anObjectArrayArray2.length || this.anObjectArrayArray2[arg2] == null || arg1 < 0 || arg1 >= this.anObjectArrayArray2[arg2].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg2][arg1] == null) {
			@Pc(42) boolean local42 = this.method1562(arg2, arg0);
			if (!local42) {
				this.method1559(arg2);
				local42 = this.method1562(arg2, arg0);
				if (!local42) {
					return null;
				}
			}
		}
		@Pc(68) byte[] local68 = Static20.method436(false, this.anObjectArrayArray2[arg2][arg1]);
		if (this.aBoolean125) {
			this.anObjectArrayArray2[arg2][arg1] = null;
		}
		return local68;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IZ)Z")
	public final boolean method1575(@OriginalArg(0) int arg0) {
		if (this.anObjectArray28[arg0] == null) {
			this.method1559(arg0);
			return this.anObjectArray28[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)V")
	public final void method1576(@OriginalArg(0) int arg0) {
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArrayArray2[arg0].length; local11++) {
			this.anObjectArrayArray2[arg0][local11] = null;
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)[B")
	public final byte[] method1577(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 < 0 || this.anObjectArrayArray2.length <= arg1 || this.anObjectArrayArray2[arg1] == null || arg0 < 0 || arg0 >= this.anObjectArrayArray2[arg1].length) {
			return null;
		}
		if (this.anObjectArrayArray2[arg1][arg0] == null) {
			@Pc(56) boolean local56 = this.method1562(arg1, null);
			if (!local56) {
				this.method1559(arg1);
				local56 = this.method1562(arg1, null);
				if (!local56) {
					return null;
				}
			}
		}
		return Static20.method436(false, this.anObjectArrayArray2[arg1][arg0]);
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "([BZ)V")
	protected final void method1578(@OriginalArg(0) byte[] arg0) {
		this.anInt2387 = Static106.method1726(arg0.length, arg0);
		@Pc(19) Class1_Sub19 local19 = new Class1_Sub19(Static62.method1062(arg0));
		@Pc(23) int local23 = local19.method2072();
		if (local23 != 5 && local23 != 6) {
			throw new RuntimeException("Incorrect JS5 protocol number: " + local23);
		}
		if (local23 >= 6) {
			local19.method2046();
		}
		@Pc(53) int local53 = local19.method2072();
		this.anInt2385 = local19.method2051();
		this.anIntArray303 = new int[this.anInt2385];
		@Pc(65) int local65 = 0;
		@Pc(67) int local67 = -1;
		for (@Pc(69) int local69 = 0; local69 < this.anInt2385; local69++) {
			this.anIntArray303[local69] = local65 += local19.method2051();
			if (local67 < this.anIntArray303[local69]) {
				local67 = this.anIntArray303[local69];
			}
		}
		this.anObjectArrayArray2 = new Object[local67 + 1][];
		this.anObjectArray28 = new Object[local67 + 1];
		this.anIntArray301 = new int[local67 + 1];
		this.anIntArray302 = new int[local67 + 1];
		this.anIntArrayArray24 = new int[local67 + 1][];
		this.anIntArray304 = new int[local67 + 1];
		@Pc(151) int local151;
		if (local53 != 0) {
			this.anIntArray300 = new int[local67 + 1];
			for (local151 = 0; local151 < this.anInt2385; local151++) {
				this.anIntArray300[this.anIntArray303[local151]] = local19.method2046();
			}
			this.aClass57_2 = new Class57(this.anIntArray300);
		}
		for (local151 = 0; local151 < this.anInt2385; local151++) {
			this.anIntArray301[this.anIntArray303[local151]] = local19.method2046();
		}
		for (@Pc(200) int local200 = 0; local200 < this.anInt2385; local200++) {
			this.anIntArray304[this.anIntArray303[local200]] = local19.method2046();
		}
		for (@Pc(227) int local227 = 0; local227 < this.anInt2385; local227++) {
			this.anIntArray302[this.anIntArray303[local227]] = local19.method2051();
		}
		@Pc(259) int local259;
		@Pc(266) int local266;
		@Pc(261) int local261;
		@Pc(274) int local274;
		for (@Pc(250) int local250 = 0; local250 < this.anInt2385; local250++) {
			local65 = 0;
			local259 = this.anIntArray303[local250];
			local261 = -1;
			local266 = this.anIntArray302[local259];
			this.anIntArrayArray24[local259] = new int[local266];
			for (local274 = 0; local274 < local266; local274++) {
				@Pc(291) int local291 = this.anIntArrayArray24[local259][local274] = local65 += local19.method2051();
				if (local261 < local291) {
					local261 = local291;
				}
			}
			this.anObjectArrayArray2[local259] = new Object[local261 + 1];
		}
		if (local53 == 0) {
			return;
		}
		this.aClass57Array2 = new Class57[local67 + 1];
		this.anIntArrayArray25 = new int[local67 + 1][];
		for (local259 = 0; local259 < this.anInt2385; local259++) {
			local266 = this.anIntArray303[local259];
			local261 = this.anIntArray302[local266];
			this.anIntArrayArray25[local266] = new int[this.anObjectArrayArray2[local266].length];
			for (local274 = 0; local274 < local261; local274++) {
				this.anIntArrayArray25[local266][this.anIntArrayArray24[local266][local274]] = local19.method2046();
			}
			this.aClass57Array2[local266] = new Class57(this.anIntArrayArray25[local266]);
		}
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(IB)I")
	public final int method1579(@OriginalArg(0) int arg0) {
		return this.anObjectArrayArray2[arg0].length;
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(BI)[I")
	public final int[] method1580(@OriginalArg(1) int arg0) {
		return this.anIntArrayArray24[arg0];
	}

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
	public final void method1581() {
		for (@Pc(3) int local3 = 0; local3 < this.anObjectArrayArray2.length; local3++) {
			if (this.anObjectArrayArray2[local3] != null) {
				for (@Pc(12) int local12 = 0; local12 < this.anObjectArrayArray2[local3].length; local12++) {
					this.anObjectArrayArray2[local3][local12] = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILclient!id;)I")
	public final int method1582(@OriginalArg(1) Class34 arg0) {
		@Pc(3) Class34 local3 = arg0.method963();
		return this.aClass57_2.method1556(local3.method970());
	}
}
