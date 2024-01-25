import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!am")
public final class Class11 {

	@OriginalMember(owner = "client!am", name = "w", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!am", name = "K", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!am", name = "I", descriptor = "Lclient!qh;")
	private Class167 aClass167_1 = null;

	@OriginalMember(owner = "client!am", name = "E", descriptor = "I")
	public int anInt298;

	@OriginalMember(owner = "client!am", name = "g", descriptor = "Z")
	private final boolean aBoolean18;

	@OriginalMember(owner = "client!am", name = "z", descriptor = "Lclient!ba;")
	private final Class18 aClass18_1;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!ba;ZI)V")
	public Class11(@OriginalArg(0) Class18 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.anInt298 = arg2;
		this.aBoolean18 = arg1;
		this.aClass18_1 = arg0;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)Z")
	public boolean method272(@OriginalArg(0) int arg0) {
		if (!this.method296(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method299(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BII)Z")
	private boolean method273(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method298()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass167_1.anIntArray437.length > arg0 && arg1 < this.aClass167_1.anIntArray437[arg0]) {
			return true;
		} else if (Static72.aBoolean127) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(II)Z")
	public boolean method274(@OriginalArg(1) int arg0) {
		if (!this.method298()) {
			return false;
		} else if (this.aClass167_1.anIntArray437.length == 1) {
			return this.method276(arg0, 0);
		} else if (!this.method296(arg0)) {
			return false;
		} else if (this.aClass167_1.anIntArray437[arg0] == 1) {
			return this.method276(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(II)V")
	public void method275(@OriginalArg(0) int arg0) {
		if (this.method296(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(III)Z")
	public boolean method276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method273(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray1[arg1] == null) {
			this.method299(arg1);
			return this.anObjectArray1[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I)I")
	public int method277() {
		return this.method298() ? this.aClass167_1.anIntArray437.length : -1;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IBI[I)[B")
	public byte[] method279(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method273(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(36) boolean local36 = this.method294(arg0, arg2, arg1);
			if (!local36) {
				this.method299(arg1);
				local36 = this.method294(arg0, arg2, arg1);
				if (!local36) {
					return null;
				}
			}
		}
		@Pc(63) byte[] local63 = Static245.method4235(false, this.anObjectArrayArray1[arg1][arg0]);
		if (this.anInt298 == 1) {
			this.anObjectArrayArray1[arg1][arg0] = null;
			if (this.aClass167_1.anIntArray437[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt298 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local63;
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IZZ)V")
	public void method280(@OriginalArg(2) boolean arg0) {
		if (!this.method298()) {
			return;
		}
		this.aClass167_1.anIntArrayArray51 = null;
		this.aClass167_1.aClass48Array1 = null;
		if (arg0) {
			this.aClass167_1.anIntArray445 = null;
			this.aClass167_1.aClass48_1 = null;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method282(@OriginalArg(1) String arg0) {
		if (this.method298()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass167_1.aClass48_1.method1012(Static63.method1077(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B")
	public byte[] method283(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method298()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass167_1.aClass48_1.method1012(Static63.method1077(local12));
		if (this.method296(local24)) {
			@Pc(42) int local42 = this.aClass167_1.aClass48Array1[local24].method1012(Static63.method1077(local15));
			return this.method288(local42, local24);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BLjava/lang/String;)V")
	public void method284(@OriginalArg(1) String arg0) {
		if (this.method298()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass167_1.aClass48_1.method1012(Static63.method1077(local17));
			this.method287(local26);
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V")
	public void method285() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArrayArray1.length; local10++) {
				this.anObjectArrayArray1[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(II)[I")
	public int[] method286(@OriginalArg(1) int arg0) {
		if (!this.method296(arg0)) {
			return null;
		}
		@Pc(22) int[] local22 = this.aClass167_1.anIntArrayArray50[arg0];
		if (local22 == null) {
			local22 = new int[this.aClass167_1.anIntArray441[arg0]];
			@Pc(33) int local33 = 0;
			while (local22.length > local33) {
				local22[local33] = local33++;
			}
		}
		return local22;
	}

	@OriginalMember(owner = "client!am", name = "d", descriptor = "(II)V")
	private void method287(@OriginalArg(0) int arg0) {
		this.aClass18_1.method5604(arg0);
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(III)[B")
	public byte[] method288(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method279(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)Z")
	public boolean method289(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method298()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(31) int local31 = this.aClass167_1.aClass48_1.method1012(Static63.method1077(local12));
		if (this.method296(local31)) {
			@Pc(49) int local49 = this.aClass167_1.aClass48Array1[local31].method1012(Static63.method1077(local15));
			return this.method276(local49, local31);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)I")
	private int method290(@OriginalArg(1) int arg0) {
		if (this.method296(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass18_1.method5602(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method291(@OriginalArg(0) String arg0) {
		if (this.method298()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass167_1.aClass48_1.method1012(Static63.method1077(local20));
			return this.method272(local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!am", name = "e", descriptor = "(II)I")
	public int method292(@OriginalArg(0) int arg0) {
		return this.method296(arg0) ? this.aClass167_1.anIntArray437[arg0] : 0;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(B)I")
	public int method293() {
		if (!this.method298()) {
			return 0;
		}
		@Pc(18) int local18 = 0;
		@Pc(20) int local20 = 0;
		for (@Pc(22) int local22 = 0; local22 < this.anObjectArray1.length; local22++) {
			if (this.aClass167_1.anIntArray441[local22] > 0) {
				local18 += 100;
				local20 += this.method290(local22);
			}
		}
		if (local18 == 0) {
			return 100;
		} else {
			return local20 * 100 / local18;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(I[III)Z")
	private boolean method294(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method296(arg2)) {
			return false;
		} else if (this.anObjectArray1[arg2] == null) {
			return false;
		} else {
			@Pc(33) int local33 = this.aClass167_1.anIntArray441[arg2];
			@Pc(39) int[] local39 = this.aClass167_1.anIntArrayArray50[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass167_1.anIntArray437[arg2]];
			}
			@Pc(59) Object[] local59 = this.anObjectArrayArray1[arg2];
			@Pc(61) boolean local61 = true;
			for (@Pc(63) int local63 = 0; local63 < local33; local63++) {
				@Pc(71) int local71;
				if (local39 == null) {
					local71 = local63;
				} else {
					local71 = local39[local63];
				}
				if (local59[local71] == null) {
					local61 = false;
					break;
				}
			}
			if (local61) {
				return true;
			}
			@Pc(117) byte[] local117;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local117 = Static245.method4235(false, this.anObjectArray1[arg2]);
			} else {
				local117 = Static245.method4235(true, this.anObjectArray1[arg2]);
				@Pc(122) Class4_Sub7 local122 = new Class4_Sub7(local117);
				local122.method2368(arg1, local122.aByteArray42.length);
			}
			@Pc(144) byte[] local144;
			try {
				local144 = Static51.method954(local117);
			} catch (@Pc(146) RuntimeException local146) {
				throw Static48.method919(local146, "T3 - " + (arg1 != null) + "," + arg2 + "," + local117.length + "," + Static325.method5353(local117, local117.length) + "," + Static325.method5353(local117, local117.length - 2) + "," + this.aClass167_1.anIntArray439[arg2] + "," + this.aClass167_1.anInt5311);
			}
			if (this.aBoolean18) {
				this.anObjectArray1[arg2] = null;
			}
			@Pc(220) int local220;
			if (local33 <= 1) {
				if (local39 == null) {
					local220 = 0;
				} else {
					local220 = local39[0];
				}
				if (this.anInt298 == 0) {
					local59[local220] = Static287.method4923(local144);
				} else {
					local59[local220] = local144;
				}
			} else {
				@Pc(256) int local256;
				@Pc(269) Class4_Sub7 local269;
				@Pc(277) int local277;
				@Pc(281) int local281;
				@Pc(283) int local283;
				@Pc(341) int local341;
				@Pc(343) int local343;
				@Pc(347) int local347;
				@Pc(349) int local349;
				if (this.anInt298 == 2) {
					local220 = local144.length;
					local220--;
					local256 = local144[local220] & 0xFF;
					local220 -= local33 * local256 * 4;
					local269 = new Class4_Sub7(local144);
					@Pc(455) int local455 = 0;
					local277 = 0;
					local269.anInt2667 = local220;
					for (local281 = 0; local281 < local256; local281++) {
						local283 = 0;
						for (local341 = 0; local341 < local33; local341++) {
							local283 += local269.method2389();
							if (local39 == null) {
								local343 = local341;
							} else {
								local343 = local39[local341];
							}
							if (arg0 == local343) {
								local277 = local343;
								local455 += local283;
							}
						}
					}
					if (local455 == 0) {
						return true;
					}
					@Pc(522) byte[] local522 = new byte[local455];
					local269.anInt2667 = local220;
					local455 = 0;
					local341 = 0;
					for (local343 = 0; local343 < local256; local343++) {
						local347 = 0;
						for (local349 = 0; local349 < local33; local349++) {
							local347 += local269.method2389();
							@Pc(551) int local551;
							if (local39 == null) {
								local551 = local349;
							} else {
								local551 = local39[local349];
							}
							if (arg0 == local551) {
								Static363.method4761(local144, local341, local522, local455, local347);
								local455 += local347;
							}
							local341 += local347;
						}
					}
					local59[local277] = local522;
				} else {
					local220 = local144.length;
					local220--;
					local256 = local144[local220] & 0xFF;
					local220 -= local33 * 4 * local256;
					local269 = new Class4_Sub7(local144);
					@Pc(272) int[] local272 = new int[local33];
					local269.anInt2667 = local220;
					for (local277 = 0; local277 < local256; local277++) {
						local281 = 0;
						for (local283 = 0; local283 < local33; local283++) {
							local281 += local269.method2389();
							local272[local283] += local281;
						}
					}
					@Pc(313) byte[][] local313 = new byte[local33][];
					for (local283 = 0; local283 < local33; local283++) {
						local313[local283] = new byte[local272[local283]];
						local272[local283] = 0;
					}
					local269.anInt2667 = local220;
					local341 = 0;
					for (local343 = 0; local343 < local256; local343++) {
						local347 = 0;
						for (local349 = 0; local349 < local33; local349++) {
							local347 += local269.method2389();
							Static363.method4761(local144, local341, local313[local349], local272[local349], local347);
							local272[local349] += local347;
							local341 += local347;
						}
					}
					for (local347 = 0; local347 < local33; local347++) {
						if (local39 == null) {
							local349 = local347;
						} else {
							local349 = local39[local347];
						}
						if (this.anInt298 == 0) {
							local59[local349] = Static287.method4923(local313[local347]);
						} else {
							local59[local349] = local313[local347];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(I)I")
	public int method295() {
		if (!this.method298()) {
			throw new IllegalStateException("");
		}
		return this.aClass167_1.anInt5311;
	}

	@OriginalMember(owner = "client!am", name = "f", descriptor = "(II)Z")
	private boolean method296(@OriginalArg(1) int arg0) {
		if (!this.method298()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass167_1.anIntArray437.length && this.aClass167_1.anIntArray437[arg0] != 0) {
			return true;
		} else if (Static72.aBoolean127) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(IZ)I")
	public int method297(@OriginalArg(0) int arg0) {
		if (this.method298()) {
			@Pc(22) int local22 = this.aClass167_1.aClass48_1.method1012(arg0);
			return this.method296(local22) ? local22 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(B)Z")
	private boolean method298() {
		if (this.aClass167_1 == null) {
			this.aClass167_1 = this.aClass18_1.method5600();
			if (this.aClass167_1 == null) {
				return false;
			}
			this.anObjectArray1 = new Object[this.aClass167_1.anInt5312];
			this.anObjectArrayArray1 = new Object[this.aClass167_1.anInt5312][];
		}
		return true;
	}

	@OriginalMember(owner = "client!am", name = "g", descriptor = "(II)V")
	private void method299(@OriginalArg(0) int arg0) {
		if (this.aBoolean18) {
			this.anObjectArray1[arg0] = this.aClass18_1.method5605(arg0);
		} else {
			this.anObjectArray1[arg0] = Static287.method4923(this.aClass18_1.method5605(arg0));
		}
	}

	@OriginalMember(owner = "client!am", name = "h", descriptor = "(II)[B")
	public byte[] method300(@OriginalArg(0) int arg0) {
		if (!this.method298()) {
			return null;
		} else if (this.aClass167_1.anIntArray437.length == 1) {
			return this.method288(arg0, 0);
		} else if (!this.method296(arg0)) {
			return null;
		} else if (this.aClass167_1.anIntArray437[arg0] == 1) {
			return this.method288(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(Ljava/lang/String;B)I")
	public int method301(@OriginalArg(0) String arg0) {
		if (this.method298()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass167_1.aClass48_1.method1012(Static63.method1077(local19));
			return this.method296(local28) ? local28 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
	public void method302() {
		if (this.anObjectArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray1.length; local6++) {
				this.anObjectArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)Z")
	public boolean method303() {
		if (!this.method298()) {
			return false;
		}
		@Pc(18) boolean local18 = true;
		for (@Pc(20) int local20 = 0; local20 < this.aClass167_1.anIntArray444.length; local20++) {
			@Pc(28) int local28 = this.aClass167_1.anIntArray444[local20];
			if (this.anObjectArray1[local28] == null) {
				this.method299(local28);
				if (this.anObjectArray1[local28] == null) {
					local18 = false;
				}
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!am", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method304(@OriginalArg(1) String arg0) {
		if (this.method298()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass167_1.aClass48_1.method1012(Static63.method1077(local19));
			return this.method290(local30);
		} else {
			return 0;
		}
	}
}
