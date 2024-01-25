import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class71 {

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray3;

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!fc", name = "w", descriptor = "Lclient!po;")
	private Class180 aClass180_1 = null;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "Lclient!ht;")
	private final Class106 aClass106_1;

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
	public int anInt1745;

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "Z")
	private final boolean aBoolean148;

	@OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Lclient!ht;ZI)V")
	public Class71(@OriginalArg(0) Class106 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aClass106_1 = arg0;
		this.anInt1745 = arg2;
		this.aBoolean148 = arg1;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	public byte[] method1550(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method1558()) {
			return null;
		}
		@Pc(17) String local17 = arg1.toLowerCase();
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(29) int local29 = this.aClass180_1.aClass49_1.method1130(Static319.method4937(local17));
		if (this.method1563(local29)) {
			@Pc(51) int local51 = this.aClass180_1.aClass49Array1[local29].method1130(Static319.method4937(local20));
			return this.method1555(local29, local51);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BI)I")
	public int method1551(@OriginalArg(1) int arg0) {
		if (this.method1558()) {
			@Pc(18) int local18 = this.aClass180_1.aClass49_1.method1130(arg0);
			return this.method1563(local18) ? local18 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)[I")
	public int[] method1552(@OriginalArg(0) int arg0) {
		if (!this.method1563(arg0)) {
			return null;
		}
		@Pc(24) int[] local24 = this.aClass180_1.anIntArrayArray42[arg0];
		if (local24 == null) {
			local24 = new int[this.aClass180_1.anIntArray613[arg0]];
			@Pc(35) int local35 = 0;
			while (local35 < local24.length) {
				local24[local35] = local35++;
			}
		}
		return local24;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)I")
	public int method1553() {
		return this.method1558() ? this.aClass180_1.anIntArray615.length : -1;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IBI)Z")
	private boolean method1554(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method1558()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.aClass180_1.anIntArray615.length && arg0 < this.aClass180_1.anIntArray615[arg1]) {
			return true;
		} else if (Static342.aBoolean458) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)[B")
	public byte[] method1555(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method1569(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)V")
	private void method1557(@OriginalArg(1) int arg0) {
		if (this.aBoolean148) {
			this.anObjectArray3[arg0] = this.aClass106_1.method3056(arg0);
		} else {
			this.anObjectArray3[arg0] = Static274.method1027(this.aClass106_1.method3056(arg0));
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)Z")
	private boolean method1558() {
		if (this.aClass180_1 == null) {
			this.aClass180_1 = this.aClass106_1.method3052();
			if (this.aClass180_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass180_1.anInt4944][];
			this.anObjectArray3 = new Object[this.aClass180_1.anInt4944];
		}
		return true;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	public void method1559() {
		if (this.anObjectArray3 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArray3.length; local10++) {
				this.anObjectArray3[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(II)Z")
	public boolean method1560(@OriginalArg(0) int arg0) {
		if (!this.method1558()) {
			return false;
		} else if (this.aClass180_1.anIntArray615.length == 1) {
			return this.method1561(0, arg0);
		} else if (!this.method1563(arg0)) {
			return false;
		} else if (this.aClass180_1.anIntArray615[arg0] == 1) {
			return this.method1561(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(III)Z")
	public boolean method1561(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method1554(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray3[arg0] == null) {
			this.method1557(arg0);
			return this.anObjectArray3[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZZ)V")
	public void method1562(@OriginalArg(1) boolean arg0) {
		if (!this.method1558()) {
			return;
		}
		this.aClass180_1.anIntArrayArray40 = null;
		this.aClass180_1.aClass49Array1 = null;
		if (arg0) {
			this.aClass180_1.anIntArray614 = null;
			this.aClass180_1.aClass49_1 = null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(II)Z")
	private boolean method1563(@OriginalArg(1) int arg0) {
		if (!this.method1558()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass180_1.anIntArray615.length && this.aClass180_1.anIntArray615[arg0] != 0) {
			return true;
		} else if (Static342.aBoolean458) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(BI)[B")
	public byte[] method1564(@OriginalArg(1) int arg0) {
		if (!this.method1558()) {
			return null;
		} else if (this.aClass180_1.anIntArray615.length == 1) {
			return this.method1555(0, arg0);
		} else if (!this.method1563(arg0)) {
			return null;
		} else if (this.aClass180_1.anIntArray615[arg0] == 1) {
			return this.method1555(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)Z")
	public boolean method1565() {
		if (!this.method1558()) {
			return false;
		}
		@Pc(21) boolean local21 = true;
		for (@Pc(23) int local23 = 0; local23 < this.aClass180_1.anIntArray618.length; local23++) {
			@Pc(31) int local31 = this.aClass180_1.anIntArray618[local23];
			if (this.anObjectArray3[local31] == null) {
				this.method1557(local31);
				if (this.anObjectArray3[local31] == null) {
					local21 = false;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)I")
	public int method1566() {
		if (!this.method1558()) {
			throw new IllegalStateException("");
		}
		return this.aClass180_1.anInt4945;
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V")
	public void method1567() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method1568(@OriginalArg(1) String arg0) {
		if (this.method1558()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass180_1.aClass49_1.method1130(Static319.method4937(local12));
			return this.method1563(local28) ? local28 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II[II)[B")
	public byte[] method1569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method1554(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(30) boolean local30 = this.method1576(arg0, arg2, arg1);
			if (!local30) {
				this.method1557(arg0);
				local30 = this.method1576(arg0, arg2, arg1);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static21.method618(this.anObjectArrayArray1[arg0][arg1], false);
		if (this.anInt1745 == 1) {
			this.anObjectArrayArray1[arg0][arg1] = null;
			if (this.aClass180_1.anIntArray615[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt1745 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local57;
	}

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "(II)Z")
	public boolean method1570(@OriginalArg(1) int arg0) {
		if (!this.method1563(arg0)) {
			return false;
		} else if (this.anObjectArray3[arg0] == null) {
			this.method1557(arg0);
			return this.anObjectArray3[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(I)I")
	public int method1571() {
		if (!this.method1558()) {
			return 0;
		}
		@Pc(15) int local15 = 0;
		@Pc(17) int local17 = 0;
		for (@Pc(19) int local19 = 0; local19 < this.anObjectArray3.length; local19++) {
			if (this.aClass180_1.anIntArray613[local19] > 0) {
				local17 += this.method1573(local19);
				local15 += 100;
			}
		}
		if (local15 == 0) {
			return 100;
		} else {
			return local17 * 100 / local15;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)V")
	public void method1572(@OriginalArg(1) int arg0) {
		if (this.method1563(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(IB)I")
	private int method1573(@OriginalArg(0) int arg0) {
		if (this.method1563(arg0)) {
			return this.anObjectArray3[arg0] == null ? this.aClass106_1.method3051(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public void method1574(@OriginalArg(0) String arg0) {
		if (this.method1558()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass180_1.aClass49_1.method1130(Static319.method4937(local19));
			this.method1579(local28);
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method1575(@OriginalArg(0) String arg0) {
		if (this.method1558()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass180_1.aClass49_1.method1130(Static319.method4937(local12));
			return this.method1573(local21);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[IIZ)Z")
	private boolean method1576(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (!this.method1563(arg0)) {
			return false;
		} else if (this.anObjectArray3[arg0] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass180_1.anIntArray613[arg0];
			@Pc(31) int[] local31 = this.aClass180_1.anIntArrayArray42[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass180_1.anIntArray615[arg0]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg0];
			@Pc(53) boolean local53 = true;
			for (@Pc(55) int local55 = 0; local55 < local25; local55++) {
				@Pc(61) int local61;
				if (local31 == null) {
					local61 = local55;
				} else {
					local61 = local31[local55];
				}
				if (local51[local61] == null) {
					local53 = false;
					break;
				}
			}
			if (local53) {
				return true;
			}
			@Pc(122) byte[] local122;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local122 = Static21.method618(this.anObjectArray3[arg0], false);
			} else {
				local122 = Static21.method618(this.anObjectArray3[arg0], true);
				@Pc(137) Class2_Sub13 local137 = new Class2_Sub13(local122);
				local137.method4204(local137.aByteArray77.length, arg1);
			}
			@Pc(149) byte[] local149;
			try {
				local149 = Static171.method2803(local122);
			} catch (@Pc(151) RuntimeException local151) {
				throw Static182.method2947(local151, "T3 - " + (arg1 != null) + "," + arg0 + "," + local122.length + "," + Static14.method437(local122, local122.length) + "," + Static14.method437(local122, local122.length - 2) + "," + this.aClass180_1.anIntArray617[arg0] + "," + this.aClass180_1.anInt4945);
			}
			if (this.aBoolean148) {
				this.anObjectArray3[arg0] = null;
			}
			@Pc(224) int local224;
			if (local25 > 1) {
				@Pc(231) int local231;
				@Pc(244) Class2_Sub13 local244;
				@Pc(251) int local251;
				@Pc(253) int local253;
				@Pc(257) int local257;
				@Pc(259) int local259;
				@Pc(271) int local271;
				@Pc(314) int local314;
				@Pc(316) int local316;
				if (this.anInt1745 == 2) {
					local224 = local149.length;
					@Pc(226) int local226 = local224 - 1;
					local231 = local149[local226] & 0xFF;
					@Pc(239) int local239 = local226 - local231 * local25 * 4;
					local244 = new Class2_Sub13(local149);
					@Pc(246) int local246 = 0;
					local244.anInt4788 = local239;
					local251 = 0;
					for (local253 = 0; local253 < local231; local253++) {
						local257 = 0;
						for (local259 = 0; local259 < local25; local259++) {
							local257 += local244.method4239();
							if (local31 == null) {
								local271 = local259;
							} else {
								local271 = local31[local259];
							}
							if (local271 == arg2) {
								local246 += local257;
								local251 = local271;
							}
						}
					}
					if (local246 == 0) {
						return true;
					}
					@Pc(301) byte[] local301 = new byte[local246];
					local244.anInt4788 = local239;
					local246 = 0;
					local259 = 0;
					for (local271 = 0; local271 < local231; local271++) {
						local314 = 0;
						for (local316 = 0; local316 < local25; local316++) {
							local314 += local244.method4239();
							@Pc(330) int local330;
							if (local31 == null) {
								local330 = local316;
							} else {
								local330 = local31[local316];
							}
							if (local330 == arg2) {
								Static406.method5656(local149, local259, local301, local246, local314);
								local246 += local314;
							}
							local259 += local314;
						}
					}
					local51[local251] = local301;
				} else {
					local224 = local149.length;
					local224--;
					local231 = local149[local224] & 0xFF;
					local224 -= local25 * local231 * 4;
					local244 = new Class2_Sub13(local149);
					@Pc(399) int[] local399 = new int[local25];
					local244.anInt4788 = local224;
					for (local251 = 0; local251 < local231; local251++) {
						local253 = 0;
						for (local257 = 0; local257 < local25; local257++) {
							local253 += local244.method4239();
							local399[local257] += local253;
						}
					}
					@Pc(444) byte[][] local444 = new byte[local25][];
					for (local257 = 0; local257 < local25; local257++) {
						local444[local257] = new byte[local399[local257]];
						local399[local257] = 0;
					}
					local244.anInt4788 = local224;
					local259 = 0;
					for (local271 = 0; local271 < local231; local271++) {
						local314 = 0;
						for (local316 = 0; local316 < local25; local316++) {
							local314 += local244.method4239();
							Static406.method5656(local149, local259, local444[local316], local399[local316], local314);
							local399[local316] += local314;
							local259 += local314;
						}
					}
					for (local314 = 0; local314 < local25; local314++) {
						if (local31 == null) {
							local316 = local314;
						} else {
							local316 = local31[local314];
						}
						if (this.anInt1745 == 0) {
							local51[local316] = Static274.method1027(local444[local314]);
						} else {
							local51[local316] = local444[local314];
						}
					}
				}
			} else {
				if (local31 == null) {
					local224 = 0;
				} else {
					local224 = local31[0];
				}
				if (this.anInt1745 == 0) {
					local51[local224] = Static274.method1027(local149);
				} else {
					local51[local224] = local149;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method1577(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method1558()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass180_1.aClass49_1.method1130(Static319.method4937(local12));
		if (this.method1563(local24)) {
			@Pc(44) int local44 = this.aClass180_1.aClass49Array1[local24].method1130(Static319.method4937(local15));
			return this.method1561(local24, local44);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method1578(@OriginalArg(0) String arg0) {
		if (this.method1558()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass180_1.aClass49_1.method1130(Static319.method4937(local17));
			return this.method1570(local26);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(IB)V")
	private void method1579(@OriginalArg(0) int arg0) {
		this.aClass106_1.method3053(arg0);
	}

	@OriginalMember(owner = "client!fc", name = "f", descriptor = "(II)I")
	public int method1580(@OriginalArg(1) int arg0) {
		return this.method1563(arg0) ? this.aClass180_1.anIntArray615[arg0] : 0;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method1582(@OriginalArg(0) String arg0) {
		if (this.method1558()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass180_1.aClass49_1.method1130(Static319.method4937(local17));
			return local26 >= 0;
		} else {
			return false;
		}
	}
}
