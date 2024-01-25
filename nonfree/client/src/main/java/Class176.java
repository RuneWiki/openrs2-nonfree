import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class176 {

	@OriginalMember(owner = "client!jn", name = "m", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray2;

	@OriginalMember(owner = "client!jn", name = "w", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!jn", name = "R", descriptor = "Lclient!dw;")
	private Class75 aClass75_2 = null;

	@OriginalMember(owner = "client!jn", name = "D", descriptor = "Z")
	private final boolean aBoolean325;

	@OriginalMember(owner = "client!jn", name = "i", descriptor = "Lclient!hr;")
	private final Class146 aClass146_1;

	@OriginalMember(owner = "client!jn", name = "E", descriptor = "I")
	public int anInt4548;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lclient!hr;ZI)V")
	public Class176(@OriginalArg(0) Class146 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aBoolean325 = arg1;
		this.aClass146_1 = arg0;
		this.anInt4548 = arg2;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method3972(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method3986()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(32) int local32 = this.aClass75_2.aClass263_1.method6328(Static424.method6617(local12));
		if (this.method4007(local32)) {
			@Pc(50) int local50 = this.aClass75_2.aClass263Array1[local32].method6328(Static424.method6617(local15));
			return this.method3994(local50, local32);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)I")
	public int method3973() {
		return this.method3986() ? this.aClass75_2.anIntArray97.length : -1;
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V")
	public void method3974() {
		if (this.anObjectArray2 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArray2.length; local10++) {
				this.anObjectArray2[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(I)Z")
	public boolean method3975() {
		if (!this.method3986()) {
			return false;
		}
		@Pc(16) boolean local16 = true;
		for (@Pc(18) int local18 = 0; local18 < this.aClass75_2.anIntArray99.length; local18++) {
			@Pc(25) int local25 = this.aClass75_2.anIntArray99[local18];
			if (this.anObjectArray2[local25] == null) {
				this.method3990(local25);
				if (this.anObjectArray2[local25] == null) {
					local16 = false;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)I")
	public int method3976() {
		if (!this.method3986()) {
			throw new IllegalStateException("");
		}
		return this.aClass75_2.anInt2304;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(III)Z")
	public boolean method3977(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method3982(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method3990(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(II)I")
	public int method3978(@OriginalArg(0) int arg0) {
		if (this.method3986()) {
			@Pc(24) int local24 = this.aClass75_2.aClass263_1.method6328(arg0);
			return this.method4007(local24) ? local24 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(B)V")
	public void method3979() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArrayArray1.length; local6++) {
				this.anObjectArrayArray1[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "([IIBI)Z")
	private boolean method3980(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method4007(arg1)) {
			return false;
		} else if (this.anObjectArray2[arg1] == null) {
			return false;
		} else {
			@Pc(23) int local23 = this.aClass75_2.anIntArray96[arg1];
			@Pc(29) int[] local29 = this.aClass75_2.anIntArrayArray15[arg1];
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass75_2.anIntArray97[arg1]];
			}
			@Pc(49) Object[] local49 = this.anObjectArrayArray1[arg1];
			@Pc(51) boolean local51 = true;
			for (@Pc(61) int local61 = 0; local61 < local23; local61++) {
				@Pc(66) int local66;
				if (local29 == null) {
					local66 = local61;
				} else {
					local66 = local29[local61];
				}
				if (local49[local66] == null) {
					local51 = false;
					break;
				}
			}
			if (local51) {
				return true;
			}
			@Pc(112) byte[] local112;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local112 = Static501.method5647(this.anObjectArray2[arg1], false);
			} else {
				local112 = Static501.method5647(this.anObjectArray2[arg1], true);
				@Pc(126) Class4_Sub11 local126 = new Class4_Sub11(local112);
				local126.method4914(arg0, local126.aByteArray68.length);
			}
			@Pc(138) byte[] local138;
			try {
				local138 = Static587.method8307(local112);
			} catch (@Pc(140) RuntimeException local140) {
				throw Static211.method3520(local140, "T3 - " + (arg0 != null) + "," + arg1 + "," + local112.length + "," + Static477.method7163(local112.length, local112) + "," + Static477.method7163(local112.length - 2, local112) + "," + this.aClass75_2.anIntArray95[arg1] + "," + this.aClass75_2.anInt2304);
			}
			if (this.aBoolean325) {
				this.anObjectArray2[arg1] = null;
			}
			@Pc(212) int local212;
			if (local23 <= 1) {
				if (local29 == null) {
					local212 = 0;
				} else {
					local212 = local29[0];
				}
				if (this.anInt4548 == 0) {
					local49[local212] = Static305.method5221(local138);
				} else {
					local49[local212] = local138;
				}
			} else {
				@Pc(249) int local249;
				@Pc(262) Class4_Sub11 local262;
				@Pc(270) int local270;
				@Pc(273) int local273;
				@Pc(275) int local275;
				@Pc(327) int local327;
				@Pc(329) int local329;
				@Pc(332) int local332;
				@Pc(334) int local334;
				if (this.anInt4548 == 2) {
					local212 = local138.length;
					local212--;
					local249 = local138[local212] & 0xFF;
					local212 -= local249 * 4 * local23;
					local262 = new Class4_Sub11(local138);
					@Pc(435) int local435 = 0;
					local270 = 0;
					local262.anInt5831 = local212;
					for (local273 = 0; local273 < local249; local273++) {
						local275 = 0;
						for (local327 = 0; local327 < local23; local327++) {
							local275 += local262.method4931();
							if (local29 == null) {
								local329 = local327;
							} else {
								local329 = local29[local327];
							}
							if (local329 == arg2) {
								local270 = local329;
								local435 += local275;
							}
						}
					}
					if (local435 == 0) {
						return true;
					}
					@Pc(494) byte[] local494 = new byte[local435];
					local262.anInt5831 = local212;
					local435 = 0;
					local327 = 0;
					for (local329 = 0; local329 < local249; local329++) {
						local332 = 0;
						for (local334 = 0; local334 < local23; local334++) {
							local332 += local262.method4931();
							@Pc(519) int local519;
							if (local29 == null) {
								local519 = local334;
							} else {
								local519 = local29[local334];
							}
							if (arg2 == local519) {
								Static597.method3730(local138, local327, local494, local435, local332);
								local435 += local332;
							}
							local327 += local332;
						}
					}
					local49[local270] = local494;
				} else {
					local212 = local138.length;
					local212--;
					local249 = local138[local212] & 0xFF;
					local212 -= local249 * local23 * 4;
					local262 = new Class4_Sub11(local138);
					@Pc(265) int[] local265 = new int[local23];
					local262.anInt5831 = local212;
					for (local270 = 0; local270 < local249; local270++) {
						local273 = 0;
						for (local275 = 0; local275 < local23; local275++) {
							local273 += local262.method4931();
							local265[local275] += local273;
						}
					}
					@Pc(304) byte[][] local304 = new byte[local23][];
					for (local275 = 0; local275 < local23; local275++) {
						local304[local275] = new byte[local265[local275]];
						local265[local275] = 0;
					}
					local262.anInt5831 = local212;
					local327 = 0;
					for (local329 = 0; local329 < local249; local329++) {
						local332 = 0;
						for (local334 = 0; local334 < local23; local334++) {
							local332 += local262.method4931();
							Static597.method3730(local138, local327, local304[local334], local265[local334], local332);
							local327 += local332;
							local265[local334] += local332;
						}
					}
					for (local332 = 0; local332 < local23; local332++) {
						if (local29 == null) {
							local334 = local332;
						} else {
							local334 = local29[local332];
						}
						if (this.anInt4548 == 0) {
							local49[local334] = Static305.method5221(local304[local332]);
						} else {
							local49[local334] = local304[local332];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "([IIII)[B")
	public byte[] method3981(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method3982(arg2, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg1] == null) {
			@Pc(36) boolean local36 = this.method3980(arg0, arg2, arg1);
			if (!local36) {
				this.method3990(arg2);
				local36 = this.method3980(arg0, arg2, arg1);
				if (!local36) {
					return null;
				}
			}
		}
		@Pc(63) byte[] local63 = Static501.method5647(this.anObjectArrayArray1[arg2][arg1], false);
		if (this.anInt4548 == 1) {
			this.anObjectArrayArray1[arg2][arg1] = null;
			if (this.aClass75_2.anIntArray97[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt4548 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local63;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIB)Z")
	private boolean method3982(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method3986()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass75_2.anIntArray97.length > arg0 && this.aClass75_2.anIntArray97[arg0] > arg1) {
			return true;
		} else if (Static165.aBoolean282) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method3983(@OriginalArg(0) String arg0) {
		if (this.method3986()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass75_2.aClass263_1.method6328(Static424.method6617(local17));
			return this.method3987(local26);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZI)V")
	public void method3984(@OriginalArg(1) int arg0) {
		if (this.method4007(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "(I)Z")
	private boolean method3986() {
		if (this.aClass75_2 == null) {
			this.aClass75_2 = this.aClass146_1.method3509();
			if (this.aClass75_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass75_2.anInt2306][];
			this.anObjectArray2 = new Object[this.aClass75_2.anInt2306];
		}
		return true;
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(II)I")
	private int method3987(@OriginalArg(1) int arg0) {
		if (this.method4007(arg0)) {
			return this.anObjectArray2[arg0] == null ? this.aClass146_1.method3511(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method3989(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = this.method3998("");
		return local8 == -1 ? this.method3997(arg0, "") : this.method3997("", arg0);
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(II)V")
	private void method3990(@OriginalArg(1) int arg0) {
		if (this.aBoolean325) {
			this.anObjectArray2[arg0] = this.aClass146_1.method3512(arg0);
		} else {
			this.anObjectArray2[arg0] = Static305.method5221(this.aClass146_1.method3512(arg0));
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IB)Z")
	public boolean method3991(@OriginalArg(0) int arg0) {
		if (!this.method4007(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method3990(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public void method3993(@OriginalArg(0) String arg0) {
		if (this.method3986()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass75_2.aClass263_1.method6328(Static424.method6617(local11));
			this.method3995(local20);
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(IIB)[B")
	public byte[] method3994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method3981(null, arg0, arg1);
	}

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "(II)V")
	private void method3995(@OriginalArg(1) int arg0) {
		this.aClass146_1.method3517(arg0);
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(IB)Z")
	public boolean method3996(@OriginalArg(0) int arg0) {
		if (!this.method3986()) {
			return false;
		} else if (this.aClass75_2.anIntArray97.length == 1) {
			return this.method3977(0, arg0);
		} else if (!this.method4007(arg0)) {
			return false;
		} else if (this.aClass75_2.anIntArray97[arg0] == 1) {
			return this.method3977(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	private boolean method3997(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method3986()) {
			return false;
		}
		@Pc(14) String local14 = arg0.toLowerCase();
		@Pc(17) String local17 = arg1.toLowerCase();
		@Pc(28) int local28 = this.aClass75_2.aClass263_1.method6328(Static424.method6617(local14));
		if (this.method4007(local28)) {
			@Pc(48) int local48 = this.aClass75_2.aClass263Array1[local28].method6328(Static424.method6617(local17));
			return this.method3977(local28, local48);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(BLjava/lang/String;)I")
	public int method3998(@OriginalArg(1) String arg0) {
		if (this.method3986()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass75_2.aClass263_1.method6328(Static424.method6617(local18));
			return this.method4007(local27) ? local27 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZ)I")
	public int method3999(@OriginalArg(0) int arg0) {
		return this.method4007(arg0) ? this.aClass75_2.anIntArray97[arg0] : 0;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZZZ)V")
	public void method4000(@OriginalArg(1) boolean arg0) {
		if (!this.method3986()) {
			return;
		}
		if (arg0) {
			this.aClass75_2.aClass263_1 = null;
			this.aClass75_2.anIntArray98 = null;
		}
		this.aClass75_2.anIntArrayArray14 = null;
		this.aClass75_2.aClass263Array1 = null;
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method4001(@OriginalArg(1) String arg0) {
		if (this.method3986()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass75_2.aClass263_1.method6328(Static424.method6617(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jn", name = "e", descriptor = "(II)[I")
	public int[] method4002(@OriginalArg(1) int arg0) {
		if (!this.method4007(arg0)) {
			return null;
		}
		@Pc(18) int[] local18 = this.aClass75_2.anIntArrayArray15[arg0];
		if (local18 == null) {
			local18 = new int[this.aClass75_2.anIntArray96[arg0]];
			@Pc(34) int local34 = 0;
			while (local34 < local18.length) {
				local18[local34] = local34++;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "(I)I")
	public int method4003() {
		if (!this.method3986()) {
			return 0;
		}
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < this.anObjectArray2.length; local24++) {
			if (this.aClass75_2.anIntArray96[local24] > 0) {
				local22 += this.method3987(local24);
				local20 += 100;
			}
		}
		if (local20 == 0) {
			return 100;
		} else {
			return local22 * 100 / local20;
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(ILjava/lang/String;)Z")
	public boolean method4004(@OriginalArg(1) String arg0) {
		if (this.method3986()) {
			@Pc(14) String local14 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass75_2.aClass263_1.method6328(Static424.method6617(local14));
			return this.method3991(local23);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "(II)[B")
	public byte[] method4005(@OriginalArg(1) int arg0) {
		if (!this.method3986()) {
			return null;
		} else if (this.aClass75_2.anIntArray97.length == 1) {
			return this.method3994(arg0, 0);
		} else if (!this.method4007(arg0)) {
			return null;
		} else if (this.aClass75_2.anIntArray97[arg0] == 1) {
			return this.method3994(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method4006(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method3986()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass75_2.aClass263_1.method6328(Static424.method6617(local12));
		if (local24 < 0) {
			return false;
		} else {
			@Pc(47) int local47 = this.aClass75_2.aClass263Array1[local24].method6328(Static424.method6617(local15));
			return local47 >= 0;
		}
	}

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(IB)Z")
	private boolean method4007(@OriginalArg(0) int arg0) {
		if (!this.method3986()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass75_2.anIntArray97.length && this.aClass75_2.anIntArray97[arg0] != 0) {
			return true;
		} else if (Static165.aBoolean282) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}
}
