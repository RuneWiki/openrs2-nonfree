import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pl")
public final class Class259 {

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!pl", name = "v", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray33;

	@OriginalMember(owner = "client!pl", name = "L", descriptor = "Lclient!ds;")
	private Class85 aClass85_2 = null;

	@OriginalMember(owner = "client!pl", name = "j", descriptor = "Lclient!ur;")
	private final Class251 aClass251_1;

	@OriginalMember(owner = "client!pl", name = "w", descriptor = "Z")
	private final boolean aBoolean553;

	@OriginalMember(owner = "client!pl", name = "y", descriptor = "I")
	public int anInt7135;

	@OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lclient!ur;ZI)V")
	public Class259(@OriginalArg(0) Class251 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aClass251_1 = arg0;
		this.aBoolean553 = arg1;
		this.anInt7135 = arg2;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	public boolean method5959(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5980()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass85_2.aClass152_1.method3474(Static244.method3779(local12));
		if (local24 < 0) {
			return false;
		} else {
			@Pc(39) int local39 = this.aClass85_2.aClass152Array1[local24].method3474(Static244.method3779(local15));
			return local39 >= 0;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)I")
	public int method5960() {
		if (!this.method5980()) {
			throw new IllegalStateException("");
		}
		return this.aClass85_2.anInt2075;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method5961(@OriginalArg(0) String arg0) {
		if (this.method5980()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass85_2.aClass152_1.method3474(Static244.method3779(local20));
			return this.method5987(local29) ? local29 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)I")
	public int method5962() {
		return this.method5980() ? this.aClass85_2.anIntArray113.length : -1;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZZB)V")
	public void method5963(@OriginalArg(0) boolean arg0) {
		if (!this.method5980()) {
			return;
		}
		if (arg0) {
			this.aClass85_2.anIntArray115 = null;
			this.aClass85_2.aClass152_1 = null;
		}
		this.aClass85_2.anIntArrayArray9 = null;
		this.aClass85_2.aClass152Array1 = null;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(II)[B")
	public byte[] method5964(@OriginalArg(1) int arg0) {
		if (!this.method5980()) {
			return null;
		} else if (this.aClass85_2.anIntArray113.length == 1) {
			return this.method5985(arg0, 0);
		} else if (!this.method5987(arg0)) {
			return null;
		} else if (this.aClass85_2.anIntArray113[arg0] == 1) {
			return this.method5985(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method5965(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5980()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass85_2.aClass152_1.method3474(Static244.method3779(local12));
		if (this.method5987(local24)) {
			@Pc(47) int local47 = this.aClass85_2.aClass152Array1[local24].method3474(Static244.method3779(local15));
			return this.method5985(local47, local24);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(BI)I")
	public int method5966(@OriginalArg(1) int arg0) {
		if (this.method5980()) {
			@Pc(16) int local16 = this.aClass85_2.aClass152_1.method3474(arg0);
			return this.method5987(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;B)V")
	public void method5967(@OriginalArg(0) String arg0) {
		if (this.method5980()) {
			@Pc(15) String local15 = arg0.toLowerCase();
			@Pc(24) int local24 = this.aClass85_2.aClass152_1.method3474(Static244.method3779(local15));
			this.method5991(local24);
		}
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)V")
	public void method5968(@OriginalArg(1) int arg0) {
		if (this.method5987(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZ)I")
	public int method5969(@OriginalArg(0) int arg0) {
		return this.method5987(arg0) ? this.aClass85_2.anIntArray113[arg0] : 0;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZI)Z")
	public boolean method5970(@OriginalArg(1) int arg0) {
		if (!this.method5987(arg0)) {
			return false;
		} else if (this.anObjectArray33[arg0] == null) {
			this.method5974(arg0);
			return this.anObjectArray33[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	private boolean method5971(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method5980()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(29) int local29 = this.aClass85_2.aClass152_1.method3474(Static244.method3779(local12));
		if (this.method5987(local29)) {
			@Pc(49) int local49 = this.aClass85_2.aClass152Array1[local29].method3474(Static244.method3779(local20));
			return this.method5990(local49, local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method5972(@OriginalArg(0) String arg0) {
		if (this.method5980()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass85_2.aClass152_1.method3474(Static244.method3779(local18));
			return this.method5978(local27);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(II)[I")
	public int[] method5973(@OriginalArg(0) int arg0) {
		if (!this.method5987(arg0)) {
			return null;
		}
		@Pc(18) int[] local18 = this.aClass85_2.anIntArrayArray8[arg0];
		if (local18 == null) {
			local18 = new int[this.aClass85_2.anIntArray117[arg0]];
			@Pc(29) int local29 = 0;
			while (local18.length > local29) {
				local18[local29] = local29++;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!pl", name = "d", descriptor = "(II)V")
	private void method5974(@OriginalArg(0) int arg0) {
		if (this.aBoolean553) {
			this.anObjectArray33[arg0] = this.aClass251_1.method5855(arg0);
		} else {
			this.anObjectArray33[arg0] = Static276.method3094(this.aClass251_1.method5855(arg0));
		}
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(I)V")
	public void method5975() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArrayArray1.length; local10++) {
				this.anObjectArrayArray1[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "c", descriptor = "(I)Z")
	public boolean method5976() {
		if (!this.method5980()) {
			return false;
		}
		@Pc(20) boolean local20 = true;
		for (@Pc(22) int local22 = 0; local22 < this.aClass85_2.anIntArray114.length; local22++) {
			@Pc(30) int local30 = this.aClass85_2.anIntArray114[local22];
			if (this.anObjectArray33[local30] == null) {
				this.method5974(local30);
				if (this.anObjectArray33[local30] == null) {
					local20 = false;
				}
			}
		}
		return local20;
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Z)I")
	public int method5977() {
		if (!this.method5980()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray33.length; local17++) {
			if (this.aClass85_2.anIntArray117[local17] > 0) {
				local15 += this.method5978(local17);
				local13 += 100;
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!pl", name = "e", descriptor = "(II)I")
	private int method5978(@OriginalArg(1) int arg0) {
		if (this.method5987(arg0)) {
			return this.anObjectArray33[arg0] == null ? this.aClass251_1.method5861(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(Z)Z")
	private boolean method5980() {
		if (this.aClass85_2 == null) {
			this.aClass85_2 = this.aClass251_1.method5860();
			if (this.aClass85_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass85_2.anInt2074][];
			this.anObjectArray33 = new Object[this.aClass85_2.anInt2074];
		}
		return true;
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)V")
	public void method5981() {
		if (this.anObjectArray33 != null) {
			for (@Pc(6) int local6 = 0; local6 < this.anObjectArray33.length; local6++) {
				this.anObjectArray33[local6] = null;
			}
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public boolean method5982(@OriginalArg(1) String arg0) {
		if (this.method5980()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass85_2.aClass152_1.method3474(Static244.method3779(local12));
			return this.method5970(local27);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(III)Z")
	private boolean method5984(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5980()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass85_2.anIntArray113.length && this.aClass85_2.anIntArray113[arg0] > arg1) {
			return true;
		} else if (Static167.aBoolean292) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pl", name = "b", descriptor = "(III)[B")
	public byte[] method5985(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method5986(arg0, null, arg1);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[IBI)[B")
	public byte[] method5986(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2) {
		if (!this.method5984(arg2, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg0] == null) {
			@Pc(36) boolean local36 = this.method5992(arg0, arg1, arg2);
			if (!local36) {
				this.method5974(arg2);
				local36 = this.method5992(arg0, arg1, arg2);
				if (!local36) {
					return null;
				}
			}
		}
		@Pc(63) byte[] local63 = Static583.method7909(false, this.anObjectArrayArray1[arg2][arg0]);
		if (this.anInt7135 == 1) {
			this.anObjectArrayArray1[arg2][arg0] = null;
			if (this.aClass85_2.anIntArray113[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt7135 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local63;
	}

	@OriginalMember(owner = "client!pl", name = "f", descriptor = "(II)Z")
	private boolean method5987(@OriginalArg(1) int arg0) {
		if (!this.method5980()) {
			return false;
		} else if (arg0 >= 0 && this.aClass85_2.anIntArray113.length > arg0 && this.aClass85_2.anIntArray113[arg0] != 0) {
			return true;
		} else if (Static167.aBoolean292) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pl", name = "g", descriptor = "(II)Z")
	public boolean method5988(@OriginalArg(1) int arg0) {
		if (!this.method5980()) {
			return false;
		} else if (this.aClass85_2.anIntArray113.length == 1) {
			return this.method5990(arg0, 0);
		} else if (!this.method5987(arg0)) {
			return false;
		} else if (this.aClass85_2.anIntArray113[arg0] == 1) {
			return this.method5990(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method5989(@OriginalArg(1) String arg0) {
		@Pc(10) int local10 = this.method5961("");
		return local10 == -1 ? this.method5971("", arg0) : this.method5971(arg0, "");
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(IBI)Z")
	public boolean method5990(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5984(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray33[arg1] == null) {
			this.method5974(arg1);
			return this.anObjectArray33[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pl", name = "h", descriptor = "(II)V")
	private void method5991(@OriginalArg(1) int arg0) {
		this.aClass251_1.method5854(arg0);
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(I[IIB)Z")
	private boolean method5992(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (!this.method5987(arg2)) {
			return false;
		} else if (this.anObjectArray33[arg2] == null) {
			return false;
		} else {
			@Pc(33) int local33 = this.aClass85_2.anIntArray117[arg2];
			@Pc(39) int[] local39 = this.aClass85_2.anIntArrayArray8[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass85_2.anIntArray113[arg2]];
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
			@Pc(130) byte[] local130;
			if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
				local130 = Static583.method7909(false, this.anObjectArray33[arg2]);
			} else {
				local130 = Static583.method7909(true, this.anObjectArray33[arg2]);
				@Pc(135) Class2_Sub15 local135 = new Class2_Sub15(local130);
				local135.method4320(local135.aByteArray62.length, arg1);
			}
			@Pc(157) byte[] local157;
			try {
				local157 = Static123.method1788(local130);
			} catch (@Pc(159) RuntimeException local159) {
				throw Static354.method3776(local159, "T3 - " + (arg1 != null) + "," + arg2 + "," + local130.length + "," + Static209.method3350(local130, local130.length) + "," + Static209.method3350(local130, local130.length - 2) + "," + this.aClass85_2.anIntArray116[arg2] + "," + this.aClass85_2.anInt2075);
			}
			if (this.aBoolean553) {
				this.anObjectArray33[arg2] = null;
			}
			@Pc(231) int local231;
			if (local33 <= 1) {
				if (local39 == null) {
					local231 = 0;
				} else {
					local231 = local39[0];
				}
				if (this.anInt7135 == 0) {
					local59[local231] = Static276.method3094(local157);
				} else {
					local59[local231] = local157;
				}
			} else {
				@Pc(270) int local270;
				@Pc(283) Class2_Sub15 local283;
				@Pc(291) int local291;
				@Pc(295) int local295;
				@Pc(297) int local297;
				@Pc(351) int local351;
				@Pc(353) int local353;
				@Pc(357) int local357;
				@Pc(359) int local359;
				if (this.anInt7135 == 2) {
					local231 = local157.length;
					local231--;
					local270 = local157[local231] & 0xFF;
					local231 -= local33 * local270 * 4;
					local283 = new Class2_Sub15(local157);
					@Pc(469) int local469 = 0;
					local291 = 0;
					local283.anInt5241 = local231;
					for (local295 = 0; local295 < local270; local295++) {
						local297 = 0;
						for (local351 = 0; local351 < local33; local351++) {
							local297 += local283.method4307();
							if (local39 == null) {
								local353 = local351;
							} else {
								local353 = local39[local351];
							}
							if (local353 == arg0) {
								local469 += local297;
								local291 = local353;
							}
						}
					}
					if (local469 == 0) {
						return true;
					}
					@Pc(539) byte[] local539 = new byte[local469];
					local469 = 0;
					local283.anInt5241 = local231;
					local351 = 0;
					for (local353 = 0; local353 < local270; local353++) {
						local357 = 0;
						for (local359 = 0; local359 < local33; local359++) {
							local357 += local283.method4307();
							@Pc(568) int local568;
							if (local39 == null) {
								local568 = local359;
							} else {
								local568 = local39[local359];
							}
							if (arg0 == local568) {
								Static598.method1137(local157, local351, local539, local469, local357);
								local469 += local357;
							}
							local351 += local357;
						}
					}
					local59[local291] = local539;
				} else {
					local231 = local157.length;
					local231--;
					local270 = local157[local231] & 0xFF;
					local231 -= local270 * 4 * local33;
					local283 = new Class2_Sub15(local157);
					@Pc(286) int[] local286 = new int[local33];
					local283.anInt5241 = local231;
					for (local291 = 0; local291 < local270; local291++) {
						local295 = 0;
						for (local297 = 0; local297 < local33; local297++) {
							local295 += local283.method4307();
							local286[local297] += local295;
						}
					}
					@Pc(327) byte[][] local327 = new byte[local33][];
					for (local297 = 0; local297 < local33; local297++) {
						local327[local297] = new byte[local286[local297]];
						local286[local297] = 0;
					}
					local283.anInt5241 = local231;
					local351 = 0;
					for (local353 = 0; local353 < local270; local353++) {
						local357 = 0;
						for (local359 = 0; local359 < local33; local359++) {
							local357 += local283.method4307();
							Static598.method1137(local157, local351, local327[local359], local286[local359], local357);
							local286[local359] += local357;
							local351 += local357;
						}
					}
					for (local357 = 0; local357 < local33; local357++) {
						if (local39 == null) {
							local359 = local357;
						} else {
							local359 = local39[local357];
						}
						if (this.anInt7135 == 0) {
							local59[local359] = Static276.method3094(local327[local357]);
						} else {
							local59[local359] = local327[local357];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method5993(@OriginalArg(0) String arg0) {
		if (this.method5980()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass85_2.aClass152_1.method3474(Static244.method3779(local12));
			return local26 >= 0;
		} else {
			return false;
		}
	}
}
