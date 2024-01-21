import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mb")
public final class Class5_Sub2_Sub11 extends Class5_Sub2 {

	@OriginalMember(owner = "client!mb", name = "R", descriptor = "[S")
	private short[] aShortArray21;

	@OriginalMember(owner = "client!mb", name = "S", descriptor = "[S")
	private short[] aShortArray22;

	@OriginalMember(owner = "client!mb", name = "X", descriptor = "[I")
	public int[] anIntArray275;

	@OriginalMember(owner = "client!mb", name = "rb", descriptor = "[I")
	public int[] anIntArray276;

	@OriginalMember(owner = "client!mb", name = "ub", descriptor = "[S")
	private short[] aShortArray23;

	@OriginalMember(owner = "client!mb", name = "yb", descriptor = "I")
	public int anInt1965;

	@OriginalMember(owner = "client!mb", name = "Jb", descriptor = "I")
	private int anInt1974;

	@OriginalMember(owner = "client!mb", name = "Mb", descriptor = "[S")
	private short[] aShortArray24;

	@OriginalMember(owner = "client!mb", name = "P", descriptor = "I")
	private int anInt1938 = -1;

	@OriginalMember(owner = "client!mb", name = "N", descriptor = "Z")
	public boolean aBoolean74 = false;

	@OriginalMember(owner = "client!mb", name = "bb", descriptor = "I")
	private int anInt1947 = -1;

	@OriginalMember(owner = "client!mb", name = "Y", descriptor = "I")
	private int anInt1944 = 128;

	@OriginalMember(owner = "client!mb", name = "fb", descriptor = "I")
	private int anInt1951 = 128;

	@OriginalMember(owner = "client!mb", name = "W", descriptor = "I")
	public int anInt1943 = -1;

	@OriginalMember(owner = "client!mb", name = "V", descriptor = "I")
	private int anInt1942 = 0;

	@OriginalMember(owner = "client!mb", name = "eb", descriptor = "I")
	public int anInt1950 = 0;

	@OriginalMember(owner = "client!mb", name = "ab", descriptor = "I")
	private int anInt1946 = -1;

	@OriginalMember(owner = "client!mb", name = "hb", descriptor = "I")
	public int anInt1953 = 1;

	@OriginalMember(owner = "client!mb", name = "pb", descriptor = "I")
	public int anInt1959 = 0;

	@OriginalMember(owner = "client!mb", name = "gb", descriptor = "I")
	private int anInt1952 = -1;

	@OriginalMember(owner = "client!mb", name = "T", descriptor = "I")
	public int anInt1940 = 0;

	@OriginalMember(owner = "client!mb", name = "vb", descriptor = "I")
	private int anInt1962 = 0;

	@OriginalMember(owner = "client!mb", name = "jb", descriptor = "I")
	public int anInt1954 = 0;

	@OriginalMember(owner = "client!mb", name = "nb", descriptor = "I")
	private int anInt1957 = 128;

	@OriginalMember(owner = "client!mb", name = "qb", descriptor = "I")
	public int anInt1960 = 2000;

	@OriginalMember(owner = "client!mb", name = "Bb", descriptor = "I")
	public int anInt1968 = -1;

	@OriginalMember(owner = "client!mb", name = "Fb", descriptor = "[Lclient!r;")
	public Class61[] aClass61Array14 = new Class61[] { null, null, Static103.aClass61_804, null, null };

	@OriginalMember(owner = "client!mb", name = "Ib", descriptor = "I")
	public int anInt1973 = 0;

	@OriginalMember(owner = "client!mb", name = "ob", descriptor = "I")
	private int anInt1958 = -1;

	@OriginalMember(owner = "client!mb", name = "ib", descriptor = "Lclient!r;")
	public Class61 aClass61_597 = Static22.aClass61_206;

	@OriginalMember(owner = "client!mb", name = "Z", descriptor = "I")
	private int anInt1945 = -1;

	@OriginalMember(owner = "client!mb", name = "Lb", descriptor = "I")
	private int anInt1976 = -1;

	@OriginalMember(owner = "client!mb", name = "Gb", descriptor = "I")
	private int anInt1971 = -1;

	@OriginalMember(owner = "client!mb", name = "zb", descriptor = "I")
	private int anInt1966 = -1;

	@OriginalMember(owner = "client!mb", name = "Ab", descriptor = "I")
	public int anInt1967 = 0;

	@OriginalMember(owner = "client!mb", name = "mb", descriptor = "I")
	public int anInt1956 = 0;

	@OriginalMember(owner = "client!mb", name = "Qb", descriptor = "I")
	public int anInt1979 = 0;

	@OriginalMember(owner = "client!mb", name = "Yb", descriptor = "I")
	public int anInt1984 = 0;

	@OriginalMember(owner = "client!mb", name = "Pb", descriptor = "[Lclient!r;")
	public Class61[] aClass61Array15 = new Class61[] { null, null, null, null, Static48.aClass61_380 };

	@OriginalMember(owner = "client!mb", name = "gc", descriptor = "I")
	private int anInt1988 = -1;

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!pa;I)V")
	public void method1269(@OriginalArg(0) Class5_Sub14 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method1471();
			if (local9 == 0) {
				return;
			}
			this.method1273(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)Lclient!cb;")
	public Class5_Sub2_Sub2_Sub1 method1270(@OriginalArg(1) boolean arg0) {
		@Pc(16) int local16 = this.anInt1971;
		@Pc(19) int local19 = this.anInt1976;
		if (arg0) {
			local16 = this.anInt1945;
			local19 = this.anInt1952;
		}
		if (local16 == -1) {
			return null;
		}
		@Pc(38) Class5_Sub2_Sub2_Sub1 local38 = Static15.method341(Static68.aClass26_10, local16);
		if (local19 != -1) {
			@Pc(47) Class5_Sub2_Sub2_Sub1 local47 = Static15.method341(Static68.aClass26_10, local19);
			@Pc(58) Class5_Sub2_Sub2_Sub1[] local58 = new Class5_Sub2_Sub2_Sub1[] { local38, local47 };
			local38 = new Class5_Sub2_Sub2_Sub1(local58, 2);
		}
		@Pc(69) int local69;
		if (this.aShortArray22 != null) {
			for (local69 = 0; local69 < this.aShortArray22.length; local69++) {
				local38.method329(this.aShortArray22[local69], this.aShortArray24[local69]);
			}
		}
		if (this.aShortArray21 != null) {
			for (local69 = 0; local69 < this.aShortArray21.length; local69++) {
				local38.method343(this.aShortArray21[local69], this.aShortArray23[local69]);
			}
		}
		return local38;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BZ)Z")
	public boolean method1271(@OriginalArg(1) boolean arg0) {
		@Pc(2) int local2 = this.anInt1971;
		@Pc(9) int local9 = this.anInt1976;
		if (arg0) {
			local9 = this.anInt1952;
			local2 = this.anInt1945;
		}
		if (local2 == -1) {
			return true;
		}
		@Pc(29) boolean local29 = true;
		if (!Static68.aClass26_10.method1041(local2, 0)) {
			local29 = false;
		}
		if (local9 != -1 && !Static68.aClass26_10.method1041(local9, 0)) {
			local29 = false;
		}
		return local29;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)Lclient!cb;")
	public Class5_Sub2_Sub2_Sub1 method1272(@OriginalArg(0) boolean arg0) {
		@Pc(2) int local2 = this.anInt1958;
		@Pc(5) int local5 = this.anInt1938;
		@Pc(8) int local8 = this.anInt1947;
		if (arg0) {
			local2 = this.anInt1946;
			local5 = this.anInt1966;
			local8 = this.anInt1988;
		}
		if (local2 == -1) {
			return null;
		}
		@Pc(34) Class5_Sub2_Sub2_Sub1 local34 = Static15.method341(Static68.aClass26_10, local2);
		if (local8 != -1) {
			@Pc(42) Class5_Sub2_Sub2_Sub1 local42 = Static15.method341(Static68.aClass26_10, local8);
			if (local5 == -1) {
				@Pc(83) Class5_Sub2_Sub2_Sub1[] local83 = new Class5_Sub2_Sub2_Sub1[] { local34, local42 };
				local34 = new Class5_Sub2_Sub2_Sub1(local83, 2);
			} else {
				@Pc(50) Class5_Sub2_Sub2_Sub1 local50 = Static15.method341(Static68.aClass26_10, local5);
				@Pc(65) Class5_Sub2_Sub2_Sub1[] local65 = new Class5_Sub2_Sub2_Sub1[] { local34, local42, local50 };
				local34 = new Class5_Sub2_Sub2_Sub1(local65, 3);
			}
		}
		if (!arg0 && this.anInt1962 != 0) {
			local34.method328(0, this.anInt1962, 0);
		}
		if (arg0 && this.anInt1942 != 0) {
			local34.method328(0, this.anInt1942, 0);
		}
		@Pc(122) int local122;
		if (this.aShortArray22 != null) {
			for (local122 = 0; local122 < this.aShortArray22.length; local122++) {
				local34.method329(this.aShortArray22[local122], this.aShortArray24[local122]);
			}
		}
		if (this.aShortArray21 != null) {
			for (local122 = 0; local122 < this.aShortArray21.length; local122++) {
				local34.method343(this.aShortArray21[local122], this.aShortArray23[local122]);
			}
		}
		return local34;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!pa;II)V")
	private void method1273(@OriginalArg(0) Class5_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1974 = arg0.method1478();
		} else if (arg1 == 2) {
			this.aClass61_597 = arg0.method1450();
		} else if (arg1 == 4) {
			this.anInt1960 = arg0.method1478();
		} else if (arg1 == 5) {
			this.anInt1950 = arg0.method1478();
		} else if (arg1 == 6) {
			this.anInt1967 = arg0.method1478();
		} else if (arg1 == 7) {
			this.anInt1959 = arg0.method1478();
			if (this.anInt1959 > 32767) {
				this.anInt1959 -= 65536;
				return;
			}
			return;
		} else if (arg1 == 8) {
			this.anInt1956 = arg0.method1478();
			if (this.anInt1956 > 32767) {
				this.anInt1956 -= 65536;
				return;
			}
		} else if (arg1 == 11) {
			this.anInt1940 = 1;
			return;
		} else if (arg1 == 12) {
			this.anInt1953 = arg0.method1461();
			return;
		} else if (arg1 == 16) {
			this.aBoolean74 = true;
			return;
		} else if (arg1 == 23) {
			this.anInt1958 = arg0.method1478();
			this.anInt1962 = arg0.method1471();
			return;
		} else if (arg1 == 24) {
			this.anInt1947 = arg0.method1478();
			return;
		} else if (arg1 == 25) {
			this.anInt1946 = arg0.method1478();
			this.anInt1942 = arg0.method1471();
			return;
		} else {
			if (arg1 == 26) {
				this.anInt1988 = arg0.method1478();
			} else if (arg1 >= 30 && arg1 < 35) {
				this.aClass61Array14[arg1 - 30] = arg0.method1450();
				if (this.aClass61Array14[arg1 - 30].method1709(Static116.aClass61_928)) {
					this.aClass61Array14[arg1 - 30] = null;
					return;
				}
			} else if (arg1 < 35 || arg1 >= 40) {
				@Pc(348) int local348;
				@Pc(358) int local358;
				if (arg1 != 40) {
					if (arg1 == 41) {
						local348 = arg0.method1471();
						this.aShortArray21 = new short[local348];
						this.aShortArray23 = new short[local348];
						for (local358 = 0; local358 < local348; local358++) {
							this.aShortArray21[local358] = (short) arg0.method1478();
							this.aShortArray23[local358] = (short) arg0.method1478();
						}
					} else if (arg1 != 65) {
						if (arg1 != 78) {
							if (arg1 != 79) {
								if (arg1 == 90) {
									this.anInt1971 = arg0.method1478();
									return;
								}
								if (arg1 != 91) {
									if (arg1 != 92) {
										if (arg1 == 93) {
											this.anInt1952 = arg0.method1478();
											return;
										}
										if (arg1 != 95) {
											if (arg1 == 97) {
												this.anInt1968 = arg0.method1478();
												return;
											}
											if (arg1 == 98) {
												this.anInt1943 = arg0.method1478();
												return;
											}
											if (arg1 >= 100 && arg1 < 110) {
												if (this.anIntArray275 == null) {
													this.anIntArray275 = new int[10];
													this.anIntArray276 = new int[10];
												}
												this.anIntArray275[arg1 - 100] = arg0.method1478();
												this.anIntArray276[arg1 - 100] = arg0.method1478();
												return;
											}
											if (arg1 == 110) {
												this.anInt1944 = arg0.method1478();
												return;
											}
											if (arg1 != 111) {
												if (arg1 == 112) {
													this.anInt1951 = arg0.method1478();
													return;
												}
												if (arg1 == 113) {
													this.anInt1973 = arg0.method1447();
												} else if (arg1 == 114) {
													this.anInt1979 = arg0.method1447() * 5;
													return;
												} else if (arg1 == 115) {
													this.anInt1984 = arg0.method1471();
													return;
												}
												return;
											}
											this.anInt1957 = arg0.method1478();
											return;
										}
										this.anInt1954 = arg0.method1478();
										return;
									}
									this.anInt1976 = arg0.method1478();
									return;
								}
								this.anInt1945 = arg0.method1478();
								return;
							}
							this.anInt1966 = arg0.method1478();
							return;
						}
						this.anInt1938 = arg0.method1478();
						return;
					}
					return;
				}
				local348 = arg0.method1471();
				this.aShortArray24 = new short[local348];
				this.aShortArray22 = new short[local348];
				for (local358 = 0; local358 < local348; local358++) {
					this.aShortArray22[local358] = (short) arg0.method1478();
					this.aShortArray24[local358] = (short) arg0.method1478();
				}
				return;
			} else {
				this.aClass61Array15[arg1 - 35] = arg0.method1450();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)Lclient!wb;")
	public Class5_Sub2_Sub2_Sub6 method1274(@OriginalArg(1) int arg0) {
		if (this.anIntArray275 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (this.anIntArray276[local15] <= arg0 && this.anIntArray276[local15] != 0) {
					local13 = this.anIntArray275[local15];
				}
			}
			if (local13 != -1) {
				return Static111.method1830(local13).method1274(1);
			}
		}
		@Pc(60) Class5_Sub2_Sub2_Sub6 local60 = (Class5_Sub2_Sub2_Sub6) Static65.aClass29_17.method766((long) this.anInt1965);
		if (local60 != null) {
			return local60;
		}
		@Pc(70) Class5_Sub2_Sub2_Sub1 local70 = Static15.method341(Static68.aClass26_10, this.anInt1974);
		if (local70 == null) {
			return null;
		}
		if (this.anInt1944 != 128 || this.anInt1957 != 128 || this.anInt1951 != 128) {
			local70.method323(this.anInt1944, this.anInt1957, this.anInt1951);
		}
		@Pc(101) int local101;
		if (this.aShortArray22 != null) {
			for (local101 = 0; local101 < this.aShortArray22.length; local101++) {
				local70.method329(this.aShortArray22[local101], this.aShortArray24[local101]);
			}
		}
		if (this.aShortArray21 != null) {
			for (local101 = 0; local101 < this.aShortArray21.length; local101++) {
				local70.method343(this.aShortArray21[local101], this.aShortArray23[local101]);
			}
		}
		local60 = local70.method342(this.anInt1973 + 64, 768 - -this.anInt1979, -50, -10, -50);
		local60.aBoolean120 = true;
		Static65.aClass29_17.method762(local60, (long) this.anInt1965);
		return local60;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(IZ)Z")
	public boolean method1275(@OriginalArg(1) boolean arg0) {
		@Pc(14) int local14 = this.anInt1958;
		@Pc(17) int local17 = this.anInt1947;
		@Pc(20) int local20 = this.anInt1938;
		if (arg0) {
			local14 = this.anInt1946;
			local17 = this.anInt1988;
			local20 = this.anInt1966;
		}
		if (local14 == -1) {
			return true;
		}
		@Pc(38) boolean local38 = true;
		if (!Static68.aClass26_10.method1041(local14, 0)) {
			local38 = false;
		}
		if (local17 != -1 && !Static68.aClass26_10.method1041(local17, 0)) {
			local38 = false;
		}
		if (local20 != -1 && !Static68.aClass26_10.method1041(local20, 0)) {
			local38 = false;
		}
		return local38;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)Lclient!mb;")
	public Class5_Sub2_Sub11 method1276(@OriginalArg(0) int arg0) {
		if (this.anIntArray275 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (@Pc(15) int local15 = 0; local15 < 10; local15++) {
				if (arg0 >= this.anIntArray276[local15] && this.anIntArray276[local15] != 0) {
					local13 = this.anIntArray275[local15];
				}
			}
			if (local13 != -1) {
				return Static111.method1830(local13);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	public void method1279() {
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lclient!mb;BLclient!mb;)V")
	public void method1280(@OriginalArg(0) Class5_Sub2_Sub11 arg0, @OriginalArg(2) Class5_Sub2_Sub11 arg1) {
		this.anInt1953 = arg1.anInt1953;
		this.aClass61_597 = arg1.aClass61_597;
		this.anInt1974 = arg0.anInt1974;
		this.anInt1956 = arg0.anInt1956;
		this.anInt1940 = 1;
		this.aShortArray23 = arg0.aShortArray23;
		this.aShortArray22 = arg0.aShortArray22;
		this.anInt1967 = arg0.anInt1967;
		this.aBoolean74 = arg1.aBoolean74;
		this.aShortArray24 = arg0.aShortArray24;
		this.anInt1960 = arg0.anInt1960;
		this.anInt1959 = arg0.anInt1959;
		this.anInt1954 = arg0.anInt1954;
		this.anInt1950 = arg0.anInt1950;
		this.aShortArray21 = arg0.aShortArray21;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(II)Lclient!cb;")
	public Class5_Sub2_Sub2_Sub1 method1282(@OriginalArg(1) int arg0) {
		@Pc(15) int local15;
		if (this.anIntArray275 != null && arg0 > 1) {
			@Pc(13) int local13 = -1;
			for (local15 = 0; local15 < 10; local15++) {
				if (this.anIntArray276[local15] <= arg0 && this.anIntArray276[local15] != 0) {
					local13 = this.anIntArray275[local15];
				}
			}
			if (local13 != -1) {
				return Static111.method1830(local13).method1282(1);
			}
		}
		@Pc(57) Class5_Sub2_Sub2_Sub1 local57 = Static15.method341(Static68.aClass26_10, this.anInt1974);
		if (local57 == null) {
			return null;
		}
		if (this.anInt1944 != 128 || this.anInt1957 != 128 || this.anInt1951 != 128) {
			local57.method323(this.anInt1944, this.anInt1957, this.anInt1951);
		}
		if (this.aShortArray22 != null) {
			for (local15 = 0; local15 < this.aShortArray22.length; local15++) {
				local57.method329(this.aShortArray22[local15], this.aShortArray24[local15]);
			}
		}
		if (this.aShortArray21 != null) {
			for (local15 = 0; local15 < this.aShortArray21.length; local15++) {
				local57.method343(this.aShortArray21[local15], this.aShortArray23[local15]);
			}
		}
		return local57;
	}
}
