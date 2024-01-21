import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class3_Sub1_Sub7 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ga", name = "ib", descriptor = "[I")
	public int[] anIntArray128;

	@OriginalMember(owner = "client!ga", name = "nb", descriptor = "[S")
	private short[] aShortArray3;

	@OriginalMember(owner = "client!ga", name = "qb", descriptor = "[S")
	private short[] aShortArray4;

	@OriginalMember(owner = "client!ga", name = "Eb", descriptor = "[I")
	public int[] anIntArray129;

	@OriginalMember(owner = "client!ga", name = "Fb", descriptor = "I")
	public int anInt1233;

	@OriginalMember(owner = "client!ga", name = "Ib", descriptor = "[S")
	private short[] aShortArray5;

	@OriginalMember(owner = "client!ga", name = "Pb", descriptor = "I")
	private int anInt1240;

	@OriginalMember(owner = "client!ga", name = "Xb", descriptor = "[S")
	private short[] aShortArray6;

	@OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
	public int anInt1204 = -1;

	@OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
	private int anInt1206 = 128;

	@OriginalMember(owner = "client!ga", name = "Z", descriptor = "I")
	private int anInt1209 = 128;

	@OriginalMember(owner = "client!ga", name = "X", descriptor = "I")
	public int anInt1208 = 1;

	@OriginalMember(owner = "client!ga", name = "Y", descriptor = "Z")
	public boolean aBoolean84 = false;

	@OriginalMember(owner = "client!ga", name = "fb", descriptor = "I")
	private int anInt1214 = -1;

	@OriginalMember(owner = "client!ga", name = "S", descriptor = "Lclient!sd;")
	public Class73 aClass73_680 = Static31.aClass73_469;

	@OriginalMember(owner = "client!ga", name = "T", descriptor = "[Lclient!sd;")
	public Class73[] aClass73Array8 = new Class73[] { null, null, Static160.aClass73_1903, null, null };

	@OriginalMember(owner = "client!ga", name = "rb", descriptor = "I")
	public int anInt1222 = -1;

	@OriginalMember(owner = "client!ga", name = "db", descriptor = "I")
	private int anInt1212 = -1;

	@OriginalMember(owner = "client!ga", name = "hb", descriptor = "I")
	public int anInt1216 = 0;

	@OriginalMember(owner = "client!ga", name = "kb", descriptor = "I")
	public int anInt1218 = 0;

	@OriginalMember(owner = "client!ga", name = "xb", descriptor = "I")
	private int anInt1227 = -1;

	@OriginalMember(owner = "client!ga", name = "sb", descriptor = "I")
	private int anInt1223 = -1;

	@OriginalMember(owner = "client!ga", name = "wb", descriptor = "I")
	private int anInt1226 = -1;

	@OriginalMember(owner = "client!ga", name = "bb", descriptor = "[Lclient!sd;")
	public Class73[] aClass73Array9 = new Class73[] { null, null, null, null, Static92.aClass73_1162 };

	@OriginalMember(owner = "client!ga", name = "O", descriptor = "Z")
	public boolean aBoolean83 = false;

	@OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
	public int anInt1202 = 0;

	@OriginalMember(owner = "client!ga", name = "Db", descriptor = "I")
	public int anInt1232 = 0;

	@OriginalMember(owner = "client!ga", name = "Gb", descriptor = "I")
	private int anInt1234 = -1;

	@OriginalMember(owner = "client!ga", name = "ob", descriptor = "I")
	private int anInt1220 = -1;

	@OriginalMember(owner = "client!ga", name = "Ab", descriptor = "I")
	public int anInt1229 = 0;

	@OriginalMember(owner = "client!ga", name = "pb", descriptor = "I")
	public int anInt1221 = 0;

	@OriginalMember(owner = "client!ga", name = "Jb", descriptor = "I")
	private int anInt1236 = -1;

	@OriginalMember(owner = "client!ga", name = "lb", descriptor = "I")
	private int anInt1219 = -1;

	@OriginalMember(owner = "client!ga", name = "Bb", descriptor = "I")
	private int anInt1230 = 128;

	@OriginalMember(owner = "client!ga", name = "vb", descriptor = "I")
	private int anInt1225 = 0;

	@OriginalMember(owner = "client!ga", name = "Qb", descriptor = "I")
	private int anInt1241 = -1;

	@OriginalMember(owner = "client!ga", name = "Vb", descriptor = "I")
	private int anInt1246 = 0;

	@OriginalMember(owner = "client!ga", name = "Lb", descriptor = "I")
	private int anInt1238 = 0;

	@OriginalMember(owner = "client!ga", name = "Wb", descriptor = "I")
	private int anInt1247 = 0;

	@OriginalMember(owner = "client!ga", name = "jb", descriptor = "I")
	public int anInt1217 = 0;

	@OriginalMember(owner = "client!ga", name = "Tb", descriptor = "I")
	public int anInt1244 = 2000;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(II)Lclient!ga;")
	public Class3_Sub1_Sub7 method934(@OriginalArg(0) int arg0) {
		if (this.anIntArray128 != null && arg0 > 1) {
			@Pc(21) int local21 = -1;
			for (@Pc(23) int local23 = 0; local23 < 10; local23++) {
				if (arg0 >= this.anIntArray129[local23] && this.anIntArray129[local23] != 0) {
					local21 = this.anIntArray128[local23];
				}
			}
			if (local21 != -1) {
				return Static3.method42(local21);
			}
		}
		return this;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLclient!ga;Lclient!ga;)V")
	public void method935(@OriginalArg(1) Class3_Sub1_Sub7 arg0, @OriginalArg(2) Class3_Sub1_Sub7 arg1) {
		this.anInt1229 = arg0.anInt1229;
		this.anInt1208 = arg1.anInt1208;
		this.anInt1216 = 1;
		this.aShortArray3 = arg0.aShortArray3;
		this.anInt1240 = arg0.anInt1240;
		this.anInt1202 = arg0.anInt1202;
		this.aShortArray5 = arg0.aShortArray5;
		this.anInt1217 = arg0.anInt1217;
		this.aClass73_680 = arg1.aClass73_680;
		this.aShortArray6 = arg0.aShortArray6;
		this.anInt1244 = arg0.anInt1244;
		this.aBoolean83 = arg1.aBoolean83;
		this.anInt1232 = arg0.anInt1232;
		this.aShortArray4 = arg0.aShortArray4;
		this.anInt1218 = arg0.anInt1218;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BZ)Lclient!lb;")
	public Class3_Sub1_Sub4_Sub4 method936(@OriginalArg(1) boolean arg0) {
		@Pc(4) int local4 = this.anInt1220;
		@Pc(19) int local19 = this.anInt1236;
		if (arg0) {
			local4 = this.anInt1212;
			local19 = this.anInt1234;
		}
		if (local19 == -1) {
			return null;
		}
		@Pc(38) Class3_Sub1_Sub4_Sub4 local38 = Static89.method1571(Static175.aClass13_32, local19);
		if (local4 != -1) {
			@Pc(46) Class3_Sub1_Sub4_Sub4 local46 = Static89.method1571(Static175.aClass13_32, local4);
			@Pc(57) Class3_Sub1_Sub4_Sub4[] local57 = new Class3_Sub1_Sub4_Sub4[] { local38, local46 };
			local38 = new Class3_Sub1_Sub4_Sub4(local57, 2);
		}
		@Pc(68) int local68;
		if (this.aShortArray3 != null) {
			for (local68 = 0; local68 < this.aShortArray3.length; local68++) {
				local38.method1552(this.aShortArray3[local68], this.aShortArray6[local68]);
			}
		}
		if (this.aShortArray5 != null) {
			for (local68 = 0; local68 < this.aShortArray5.length; local68++) {
				local38.method1565(this.aShortArray5[local68], this.aShortArray4[local68]);
			}
		}
		return local38;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZI)Lclient!lb;")
	public Class3_Sub1_Sub4_Sub4 method939(@OriginalArg(0) boolean arg0) {
		@Pc(8) int local8 = this.anInt1227;
		@Pc(11) int local11 = this.anInt1214;
		@Pc(14) int local14 = this.anInt1223;
		if (arg0) {
			local8 = this.anInt1219;
			local14 = this.anInt1226;
			local11 = this.anInt1241;
		}
		if (local8 == -1) {
			return null;
		}
		@Pc(35) Class3_Sub1_Sub4_Sub4 local35 = Static89.method1571(Static175.aClass13_32, local8);
		if (local11 != -1) {
			@Pc(44) Class3_Sub1_Sub4_Sub4 local44 = Static89.method1571(Static175.aClass13_32, local11);
			if (local14 == -1) {
				@Pc(58) Class3_Sub1_Sub4_Sub4[] local58 = new Class3_Sub1_Sub4_Sub4[] { local35, local44 };
				local35 = new Class3_Sub1_Sub4_Sub4(local58, 2);
			} else {
				@Pc(71) Class3_Sub1_Sub4_Sub4 local71 = Static89.method1571(Static175.aClass13_32, local14);
				@Pc(86) Class3_Sub1_Sub4_Sub4[] local86 = new Class3_Sub1_Sub4_Sub4[] { local35, local44, local71 };
				local35 = new Class3_Sub1_Sub4_Sub4(local86, 3);
			}
		}
		if (!arg0 && this.anInt1238 != 0) {
			local35.method1566(0, this.anInt1238, 0);
		}
		if (arg0 && this.anInt1247 != 0) {
			local35.method1566(0, this.anInt1247, 0);
		}
		@Pc(129) int local129;
		if (this.aShortArray3 != null) {
			for (local129 = 0; local129 < this.aShortArray3.length; local129++) {
				local35.method1552(this.aShortArray3[local129], this.aShortArray6[local129]);
			}
		}
		if (this.aShortArray5 != null) {
			for (local129 = 0; local129 < this.aShortArray5.length; local129++) {
				local35.method1565(this.aShortArray5[local129], this.aShortArray4[local129]);
			}
		}
		return local35;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZZ)Z")
	public boolean method940(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt1220;
		@Pc(9) int local9 = this.anInt1236;
		if (arg0) {
			local6 = this.anInt1212;
			local9 = this.anInt1234;
		}
		if (local9 == -1) {
			return true;
		}
		@Pc(30) boolean local30 = true;
		if (!Static175.aClass13_32.method349(0, local9)) {
			local30 = false;
		}
		if (local6 != -1 && !Static175.aClass13_32.method349(0, local6)) {
			local30 = false;
		}
		return local30;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(ZZ)Z")
	public boolean method942(@OriginalArg(0) boolean arg0) {
		@Pc(6) int local6 = this.anInt1227;
		@Pc(9) int local9 = this.anInt1223;
		@Pc(12) int local12 = this.anInt1214;
		if (arg0) {
			local12 = this.anInt1241;
			local6 = this.anInt1219;
			local9 = this.anInt1226;
		}
		if (local6 == -1) {
			return true;
		}
		@Pc(36) boolean local36 = true;
		if (!Static175.aClass13_32.method349(0, local6)) {
			local36 = false;
		}
		if (local12 != -1 && !Static175.aClass13_32.method349(0, local12)) {
			local36 = false;
		}
		if (local9 != -1 && !Static175.aClass13_32.method349(0, local9)) {
			local36 = false;
		}
		return local36;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZLclient!ff;I)V")
	private void method943(@OriginalArg(1) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1240 = arg0.method1359();
		} else if (arg1 == 2) {
			this.aClass73_680 = arg0.method1390();
		} else if (arg1 == 4) {
			this.anInt1244 = arg0.method1359();
		} else if (arg1 == 5) {
			this.anInt1229 = arg0.method1359();
			return;
		} else if (arg1 == 6) {
			this.anInt1218 = arg0.method1359();
			return;
		} else if (arg1 == 7) {
			this.anInt1232 = arg0.method1359();
			if (this.anInt1232 > 32767) {
				this.anInt1232 -= 65536;
				return;
			}
			return;
		} else if (arg1 == 8) {
			this.anInt1217 = arg0.method1359();
			if (this.anInt1217 > 32767) {
				this.anInt1217 -= 65536;
				return;
			}
		} else if (arg1 == 11) {
			this.anInt1216 = 1;
			return;
		} else if (arg1 == 12) {
			this.anInt1208 = arg0.method1373();
			return;
		} else if (arg1 == 16) {
			this.aBoolean83 = true;
			return;
		} else if (arg1 == 23) {
			this.anInt1227 = arg0.method1359();
			this.anInt1238 = arg0.method1354();
			return;
		} else if (arg1 == 24) {
			this.anInt1214 = arg0.method1359();
			return;
		} else if (arg1 == 25) {
			this.anInt1219 = arg0.method1359();
			this.anInt1247 = arg0.method1354();
			return;
		} else if (arg1 == 26) {
			this.anInt1241 = arg0.method1359();
			return;
		} else {
			if (arg1 >= 30 && arg1 < 35) {
				this.aClass73Array8[arg1 - 30] = arg0.method1390();
				if (this.aClass73Array8[arg1 - 30].method2438(Static59.aClass73_1525)) {
					this.aClass73Array8[arg1 - 30] = null;
					return;
				}
			} else if (arg1 < 35 || arg1 >= 40) {
				@Pc(197) int local197;
				@Pc(207) int local207;
				if (arg1 != 40) {
					if (arg1 != 41) {
						if (arg1 == 65) {
							this.aBoolean84 = true;
							return;
						}
						if (arg1 != 78) {
							if (arg1 != 79) {
								if (arg1 != 90) {
									if (arg1 != 91) {
										if (arg1 == 92) {
											this.anInt1220 = arg0.method1359();
											return;
										}
										if (arg1 != 93) {
											if (arg1 != 95) {
												if (arg1 != 97) {
													if (arg1 == 98) {
														this.anInt1204 = arg0.method1359();
														return;
													}
													if (arg1 >= 100 && arg1 < 110) {
														if (this.anIntArray128 == null) {
															this.anIntArray128 = new int[10];
															this.anIntArray129 = new int[10];
														}
														this.anIntArray128[arg1 - 100] = arg0.method1359();
														this.anIntArray129[arg1 - 100] = arg0.method1359();
														return;
													}
													if (arg1 != 110) {
														if (arg1 != 111) {
															if (arg1 == 112) {
																this.anInt1209 = arg0.method1359();
																return;
															}
															if (arg1 != 113) {
																if (arg1 == 114) {
																	this.anInt1246 = arg0.method1342() * 5;
																} else if (arg1 == 115) {
																	this.anInt1221 = arg0.method1354();
																	return;
																}
																return;
															}
															this.anInt1225 = arg0.method1342();
															return;
														}
														this.anInt1206 = arg0.method1359();
														return;
													}
													this.anInt1230 = arg0.method1359();
													return;
												}
												this.anInt1222 = arg0.method1359();
												return;
											}
											this.anInt1202 = arg0.method1359();
											return;
										}
										this.anInt1212 = arg0.method1359();
										return;
									}
									this.anInt1234 = arg0.method1359();
									return;
								}
								this.anInt1236 = arg0.method1359();
								return;
							}
							this.anInt1226 = arg0.method1359();
							return;
						}
						this.anInt1223 = arg0.method1359();
						return;
					}
					local197 = arg0.method1354();
					this.aShortArray5 = new short[local197];
					this.aShortArray4 = new short[local197];
					for (local207 = 0; local207 < local197; local207++) {
						this.aShortArray5[local207] = (short) arg0.method1359();
						this.aShortArray4[local207] = (short) arg0.method1359();
					}
					return;
				}
				local197 = arg0.method1354();
				this.aShortArray6 = new short[local197];
				this.aShortArray3 = new short[local197];
				for (local207 = 0; local207 < local197; local207++) {
					this.aShortArray3[local207] = (short) arg0.method1359();
					this.aShortArray6[local207] = (short) arg0.method1359();
				}
			} else {
				this.aClass73Array9[arg1 - 35] = arg0.method1390();
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "(I)V")
	public void method944() {
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)Lclient!na;")
	public Class3_Sub1_Sub4_Sub5_Sub1 method945() {
		@Pc(11) Class3_Sub1_Sub4_Sub4 local11 = Static89.method1571(Static175.aClass13_32, this.anInt1240);
		if (local11 == null) {
			return null;
		}
		@Pc(20) int local20;
		if (this.aShortArray3 != null) {
			for (local20 = 0; local20 < this.aShortArray3.length; local20++) {
				local11.method1552(this.aShortArray3[local20], this.aShortArray6[local20]);
			}
		}
		if (this.aShortArray5 != null) {
			for (local20 = 0; local20 < this.aShortArray5.length; local20++) {
				local11.method1565(this.aShortArray5[local20], this.aShortArray4[local20]);
			}
		}
		@Pc(79) Class3_Sub1_Sub4_Sub5_Sub1 local79 = local11.method1554(this.anInt1225 + 64, this.anInt1246 + 768);
		local79.aBoolean166 = true;
		if (this.anInt1230 != 128 || this.anInt1206 != 128 || this.anInt1209 != 128) {
			local79.method1885(this.anInt1230, this.anInt1206, this.anInt1209);
		}
		return local79;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!gg;IZI)Lclient!o;")
	public Class3_Sub1_Sub4_Sub5 method947(@OriginalArg(0) Class3_Sub1_Sub8 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (this.anIntArray128 != null && arg1 > 1) {
			@Pc(18) int local18 = -1;
			for (@Pc(20) int local20 = 0; local20 < 10; local20++) {
				if (arg1 >= this.anIntArray129[local20] && this.anIntArray129[local20] != 0) {
					local18 = this.anIntArray128[local20];
				}
			}
			if (local18 != -1) {
				return Static3.method42(local18).method947(arg0, 1, arg2);
			}
		}
		@Pc(69) Class3_Sub1_Sub4_Sub5 local69 = (Class3_Sub1_Sub4_Sub5) Static142.aClass7_23.method183((long) this.anInt1233);
		if (local69 == null) {
			@Pc(77) Class3_Sub1_Sub4_Sub4 local77 = Static89.method1571(Static175.aClass13_32, this.anInt1240);
			if (local77 == null) {
				return null;
			}
			@Pc(86) int local86;
			if (this.aShortArray3 != null) {
				for (local86 = 0; local86 < this.aShortArray3.length; local86++) {
					local77.method1552(this.aShortArray3[local86], this.aShortArray6[local86]);
				}
			}
			if (this.aShortArray5 != null) {
				for (local86 = 0; local86 < this.aShortArray5.length; local86++) {
					local77.method1565(this.aShortArray5[local86], this.aShortArray4[local86]);
				}
			}
			local69 = local77.method1558(this.anInt1225 + 64, this.anInt1246 + 768, -50, -10, -50, false);
			if (this.anInt1230 != 128 || this.anInt1206 != 128 || this.anInt1209 != 128) {
				local69.method1885(this.anInt1230, this.anInt1206, this.anInt1209);
			}
			Static142.aClass7_23.method186(local69, (long) this.anInt1233);
		}
		if (arg0 != null) {
			local69 = arg0.method988(local69, arg2);
		}
		return local69;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ff;I)V")
	public void method948(@OriginalArg(0) Class3_Sub12 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1354();
			if (local7 == 0) {
				return;
			}
			this.method943(arg0, local7);
		}
	}
}
