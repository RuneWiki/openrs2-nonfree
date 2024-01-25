import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class36 {

	@OriginalMember(owner = "client!bm", name = "e", descriptor = "I")
	private int anInt1334;

	@OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
	public int anInt1335;

	@OriginalMember(owner = "client!bm", name = "h", descriptor = "[I")
	public int[] anIntArray39;

	@OriginalMember(owner = "client!bm", name = "m", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
	public int anInt1342;

	@OriginalMember(owner = "client!bm", name = "r", descriptor = "I")
	public int anInt1343;

	@OriginalMember(owner = "client!bm", name = "s", descriptor = "Ljava/lang/String;")
	public String aString5;

	@OriginalMember(owner = "client!bm", name = "w", descriptor = "I")
	public int anInt1346;

	@OriginalMember(owner = "client!bm", name = "x", descriptor = "[B")
	public byte[] aByteArray5;

	@OriginalMember(owner = "client!bm", name = "y", descriptor = "Lclient!qp;")
	private Class280 aClass280_1;

	@OriginalMember(owner = "client!bm", name = "G", descriptor = "I")
	private int anInt1352;

	@OriginalMember(owner = "client!bm", name = "H", descriptor = "I")
	public int anInt1353;

	@OriginalMember(owner = "client!bm", name = "I", descriptor = "I")
	public int anInt1354;

	@OriginalMember(owner = "client!bm", name = "L", descriptor = "[I")
	public int[] anIntArray40;

	@OriginalMember(owner = "client!bm", name = "M", descriptor = "I")
	public int anInt1356;

	@OriginalMember(owner = "client!bm", name = "Q", descriptor = "I")
	private int anInt1359;

	@OriginalMember(owner = "client!bm", name = "R", descriptor = "I")
	private int anInt1360;

	@OriginalMember(owner = "client!bm", name = "W", descriptor = "Lclient!uda;")
	public Class335 aClass335_1;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
	public int anInt1331 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bm", name = "d", descriptor = "I")
	public int anInt1333 = -1;

	@OriginalMember(owner = "client!bm", name = "k", descriptor = "I")
	private int anInt1337 = -1;

	@OriginalMember(owner = "client!bm", name = "u", descriptor = "I")
	public int anInt1345 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
	private int anInt1332 = -1;

	@OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
	public int anInt1341 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bm", name = "J", descriptor = "Z")
	public boolean aBoolean90 = false;

	@OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
	private int anInt1347 = -1;

	@OriginalMember(owner = "client!bm", name = "j", descriptor = "Z")
	public boolean aBoolean88 = true;

	@OriginalMember(owner = "client!bm", name = "S", descriptor = "I")
	public int anInt1361 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bm", name = "P", descriptor = "I")
	public int anInt1358 = -1;

	@OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
	private int anInt1340 = -1;

	@OriginalMember(owner = "client!bm", name = "V", descriptor = "I")
	private int anInt1364 = -1;

	@OriginalMember(owner = "client!bm", name = "O", descriptor = "I")
	public int anInt1357 = 0;

	@OriginalMember(owner = "client!bm", name = "F", descriptor = "I")
	public int anInt1351 = -1;

	@OriginalMember(owner = "client!bm", name = "c", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray1 = new String[5];

	@OriginalMember(owner = "client!bm", name = "T", descriptor = "I")
	public int anInt1362 = -1;

	@OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
	public int anInt1339 = -1;

	@OriginalMember(owner = "client!bm", name = "v", descriptor = "Z")
	public boolean aBoolean89 = true;

	@OriginalMember(owner = "client!bm", name = "D", descriptor = "I")
	public int anInt1349 = -1;

	@OriginalMember(owner = "client!bm", name = "f", descriptor = "Z")
	public boolean aBoolean87 = true;

	@OriginalMember(owner = "client!bm", name = "Y", descriptor = "I")
	public int anInt1366 = -1;

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!ha;)Lclient!td;")
	public Class24 method1407(@OriginalArg(1) Class5 arg0) {
		@Pc(25) Class24 local25 = (Class24) this.aClass335_1.aClass102_61.method2677((long) (arg0.anInt8747 << 29 | this.anInt1340 | 0x20000));
		if (local25 != null) {
			return local25;
		}
		this.aClass335_1.aClass196_117.method5111(this.anInt1340);
		@Pc(45) Class107 local45 = Static645.method2771(this.aClass335_1.aClass196_117, this.anInt1340, 0);
		if (local45 != null) {
			local25 = arg0.method7525(local45, true);
			this.aClass335_1.aClass102_61.method2674((long) (arg0.anInt8747 << 29 | 0x20000 | this.anInt1340), local25);
		}
		return local25;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(IILclient!sl;)V")
	private void method1408(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt1339 = arg1.method4221();
		} else if (arg0 == 2) {
			this.anInt1366 = arg1.method4221();
		} else if (arg0 == 3) {
			this.aString5 = arg1.method4233();
		} else if (arg0 == 4) {
			this.anInt1335 = arg1.method4204();
		} else if (arg0 == 5) {
			this.anInt1349 = arg1.method4204();
		} else if (arg0 == 6) {
			this.anInt1357 = arg1.method4225();
		} else {
			@Pc(66) int local66;
			if (arg0 == 7) {
				local66 = arg1.method4225();
				if ((local66 & 0x1) == 0) {
					this.aBoolean88 = false;
				}
				if ((local66 & 0x2) == 2) {
					this.aBoolean90 = true;
					return;
				}
			} else if (arg0 == 8) {
				this.aBoolean87 = arg1.method4225() == 1;
				return;
			} else if (arg0 == 9) {
				this.anInt1337 = arg1.method4221();
				if (this.anInt1337 == 65535) {
					this.anInt1337 = -1;
				}
				this.anInt1364 = arg1.method4221();
				if (this.anInt1364 == 65535) {
					this.anInt1364 = -1;
				}
				this.anInt1352 = arg1.method4207();
				this.anInt1360 = arg1.method4207();
				return;
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray1[arg0 - 10] = arg1.method4233();
			} else {
				@Pc(278) int local278;
				@Pc(303) int local303;
				if (arg0 != 15) {
					if (arg0 != 16) {
						if (arg0 != 17) {
							if (arg0 == 18) {
								this.anInt1340 = arg1.method4221();
								return;
							}
							if (arg0 != 19) {
								if (arg0 == 20) {
									this.anInt1347 = arg1.method4221();
									if (this.anInt1347 == 65535) {
										this.anInt1347 = -1;
									}
									this.anInt1332 = arg1.method4221();
									if (this.anInt1332 == 65535) {
										this.anInt1332 = -1;
									}
									this.anInt1334 = arg1.method4207();
									this.anInt1359 = arg1.method4207();
									return;
								}
								if (arg0 == 21) {
									this.anInt1346 = arg1.method4207();
									return;
								}
								if (arg0 != 22) {
									if (arg0 == 23) {
										this.anInt1362 = arg1.method4225();
										this.anInt1358 = arg1.method4225();
										this.anInt1333 = arg1.method4225();
										return;
									}
									if (arg0 == 24) {
										this.anInt1356 = arg1.method4209();
										this.anInt1343 = arg1.method4209();
									} else if (arg0 == 249) {
										local66 = arg1.method4225();
										if (this.aClass280_1 == null) {
											local278 = Static109.method2234(local66);
											this.aClass280_1 = new Class280(local278);
										}
										for (local278 = 0; local278 < local66; local278++) {
											@Pc(299) boolean local299 = arg1.method4225() == 1;
											local303 = arg1.method4204();
											@Pc(312) Class3 local312;
											if (local299) {
												local312 = new Class3_Sub48(arg1.method4233());
											} else {
												local312 = new Class3_Sub19(arg1.method4207());
											}
											this.aClass280_1.method7109(local312, (long) local303);
										}
										return;
									}
									return;
								}
								this.anInt1353 = arg1.method4207();
								return;
							}
							this.anInt1351 = arg1.method4221();
							return;
						}
						this.aString4 = arg1.method4233();
						return;
					}
					this.aBoolean89 = false;
					return;
				}
				local66 = arg1.method4225();
				this.anIntArray40 = new int[local66 * 2];
				for (local278 = 0; local278 < local66 * 2; local278++) {
					this.anIntArray40[local278] = arg1.method4209();
				}
				this.anInt1342 = arg1.method4207();
				@Pc(410) int local410 = arg1.method4225();
				this.anIntArray39 = new int[local410];
				for (local303 = 0; local303 < this.anIntArray39.length; local303++) {
					this.anIntArray39[local303] = arg1.method4207();
				}
				this.aByteArray5 = new byte[local66];
				for (@Pc(437) int local437 = 0; local437 < local66; local437++) {
					this.aByteArray5[local437] = arg1.method4254();
				}
				return;
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
	public String method1409(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass280_1 == null) {
			return arg0;
		} else {
			@Pc(24) Class3_Sub48 local24 = (Class3_Sub48) this.aClass280_1.method7107((long) arg1);
			return local24 == null ? arg0 : local24.aString106;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(III)I")
	public int method1411(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass280_1 == null) {
			return arg0;
		} else {
			@Pc(22) Class3_Sub19 local22 = (Class3_Sub19) this.aClass280_1.method7107((long) arg1);
			return local22 == null ? arg0 : local22.anInt2696;
		}
	}

	@OriginalMember(owner = "client!bm", name = "b", descriptor = "(I)V")
	public void method1412() {
		if (this.anIntArray40 == null) {
			return;
		}
		for (@Pc(6) int local6 = 0; local6 < this.anIntArray40.length; local6 += 2) {
			if (this.anInt1345 > this.anIntArray40[local6]) {
				this.anInt1345 = this.anIntArray40[local6];
			} else if (this.anInt1331 < this.anIntArray40[local6]) {
				this.anInt1331 = this.anIntArray40[local6];
			}
			if (this.anIntArray40[local6 + 1] < this.anInt1341) {
				this.anInt1341 = this.anIntArray40[local6 + 1];
			} else if (this.anIntArray40[local6 + 1] > this.anInt1361) {
				this.anInt1361 = this.anIntArray40[local6 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!ab;B)Z")
	public boolean method1413(@OriginalArg(0) Interface1 arg0) {
		@Pc(22) int local22;
		if (this.anInt1364 == -1) {
			if (this.anInt1337 == -1) {
				return true;
			}
			local22 = arg0.method3821(this.anInt1337);
		} else {
			local22 = arg0.method3820(this.anInt1364);
		}
		if (local22 < this.anInt1352 || this.anInt1360 < local22) {
			return false;
		}
		@Pc(63) int local63;
		if (this.anInt1332 == -1) {
			if (this.anInt1347 == -1) {
				return true;
			}
			local63 = arg0.method3821(this.anInt1347);
		} else {
			local63 = arg0.method3820(this.anInt1332);
		}
		return local63 >= this.anInt1334 && local63 <= this.anInt1359;
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!ha;ZB)Lclient!td;")
	public Class24 method1414(@OriginalArg(0) Class5 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt1366 : this.anInt1339;
		@Pc(18) int local18 = local11 | arg0.anInt8747 << 29;
		@Pc(27) Class24 local27 = (Class24) this.aClass335_1.aClass102_61.method2677((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass335_1.aClass196_117.method5111(local11)) {
			@Pc(47) Class107 local47 = Static645.method2771(this.aClass335_1.aClass196_117, local11, 0);
			if (local47 != null) {
				local27 = arg0.method7525(local47, true);
				this.aClass335_1.aClass102_61.method2674((long) local18, local27);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!sl;)V")
	public void method1415(@OriginalArg(1) Class3_Sub3 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4225();
			if (local13 == 0) {
				return;
			}
			this.method1408(local13, arg0);
		}
	}
}
