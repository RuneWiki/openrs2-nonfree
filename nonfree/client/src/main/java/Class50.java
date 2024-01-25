import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cb")
public final class Class50 {

	@OriginalMember(owner = "client!cb", name = "A", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!cb", name = "B", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "Lclient!ew;")
	private Class106 aClass106_2 = null;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "Z")
	private final boolean aBoolean62;

	@OriginalMember(owner = "client!cb", name = "N", descriptor = "I")
	public int anInt990;

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "Lclient!al;")
	private final Class7 aClass7_1;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lclient!al;ZI)V")
	public Class50(@OriginalArg(0) Class7 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.aBoolean62 = arg1;
		this.anInt990 = arg2;
		this.aClass7_1 = arg0;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method892(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method925()) {
			return null;
		}
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(23) String local23 = arg1.toLowerCase();
		@Pc(32) int local32 = this.aClass106_2.aClass134_1.method2768(Static634.method8423(local20));
		if (this.method912(local32)) {
			@Pc(50) int local50 = this.aClass106_2.aClass134Array1[local32].method2768(Static634.method8423(local23));
			return this.method916(local50, local32);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BII)Z")
	private boolean method893(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method925()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && this.aClass106_2.anIntArray120.length > arg0 && this.aClass106_2.anIntArray120[arg0] > arg1) {
			return true;
		} else if (Static116.aBoolean144) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)V")
	public void method895() {
		if (this.anObjectArray1 != null) {
			for (@Pc(8) int local8 = 0; local8 < this.anObjectArray1.length; local8++) {
				this.anObjectArray1[local8] = null;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method896(@OriginalArg(0) String arg0) {
		@Pc(13) int local13 = this.method900("");
		return local13 == -1 ? this.method917("", arg0) : this.method917(arg0, "");
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)Z")
	public boolean method897(@OriginalArg(1) int arg0) {
		if (!this.method925()) {
			return false;
		} else if (this.aClass106_2.anIntArray120.length == 1) {
			return this.method901(arg0, 0);
		} else if (!this.method912(arg0)) {
			return false;
		} else if (this.aClass106_2.anIntArray120[arg0] == 1) {
			return this.method901(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Z)Z")
	public boolean method898() {
		if (!this.method925()) {
			return false;
		}
		@Pc(15) boolean local15 = true;
		for (@Pc(17) int local17 = 0; local17 < this.aClass106_2.anIntArray122.length; local17++) {
			@Pc(24) int local24 = this.aClass106_2.anIntArray122[local17];
			if (this.anObjectArray1[local24] == null) {
				this.method918(local24);
				if (this.anObjectArray1[local24] == null) {
					local15 = false;
				}
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method899(@OriginalArg(0) String arg0) {
		if (this.method925()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass106_2.aClass134_1.method2768(Static634.method8423(local12));
			return local21 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/String;)I")
	public int method900(@OriginalArg(1) String arg0) {
		if (this.method925()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass106_2.aClass134_1.method2768(Static634.method8423(local12));
			return this.method912(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(III)Z")
	public boolean method901(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method893(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray1[arg1] == null) {
			this.method918(arg1);
			return this.anObjectArray1[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)I")
	public int method902() {
		return this.method925() ? this.aClass106_2.anIntArray120.length : -1;
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)V")
	public void method903() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(4) int local4 = 0; local4 < this.anObjectArrayArray1.length; local4++) {
				this.anObjectArrayArray1[local4] = null;
			}
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BLjava/lang/String;)V")
	public void method904(@OriginalArg(1) String arg0) {
		if (this.method925()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass106_2.aClass134_1.method2768(Static634.method8423(local11));
			this.method909(local20);
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(II)[I")
	public int[] method905(@OriginalArg(1) int arg0) {
		if (!this.method912(arg0)) {
			return null;
		}
		@Pc(16) int[] local16 = this.aClass106_2.anIntArrayArray19[arg0];
		if (local16 == null) {
			local16 = new int[this.aClass106_2.anIntArray119[arg0]];
			@Pc(27) int local27 = 0;
			while (local27 < local16.length) {
				local16[local27] = local27++;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)Z")
	public boolean method906(@OriginalArg(0) int arg0) {
		if (!this.method912(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method918(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(II)V")
	public void method907(@OriginalArg(0) int arg0) {
		if (this.method912(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "([IIII)[B")
	public byte[] method908(@OriginalArg(0) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method893(arg2, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg2] == null || this.anObjectArrayArray1[arg2][arg1] == null) {
			@Pc(30) boolean local30 = this.method919(arg2, arg1, arg0);
			if (!local30) {
				this.method918(arg2);
				local30 = this.method919(arg2, arg1, arg0);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static120.method1911(false, this.anObjectArrayArray1[arg2][arg1]);
		if (this.anInt990 == 1) {
			this.anObjectArrayArray1[arg2][arg1] = null;
			if (this.aClass106_2.anIntArray120[arg2] == 1) {
				this.anObjectArrayArray1[arg2] = null;
			}
		} else if (this.anInt990 == 2) {
			this.anObjectArrayArray1[arg2] = null;
		}
		return local57;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZ)V")
	private void method909(@OriginalArg(0) int arg0) {
		this.aClass7_1.method158(arg0);
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(II)I")
	private int method910(@OriginalArg(0) int arg0) {
		if (this.method912(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass7_1.method154(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZIZ)V")
	public void method911(@OriginalArg(2) boolean arg0) {
		if (!this.method925()) {
			return;
		}
		if (arg0) {
			this.aClass106_2.aClass134_1 = null;
			this.aClass106_2.anIntArray124 = null;
		}
		this.aClass106_2.aClass134Array1 = null;
		this.aClass106_2.anIntArrayArray20 = null;
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(BI)Z")
	private boolean method912(@OriginalArg(1) int arg0) {
		if (!this.method925()) {
			return false;
		} else if (arg0 >= 0 && this.aClass106_2.anIntArray120.length > arg0 && this.aClass106_2.anIntArray120[arg0] != 0) {
			return true;
		} else if (Static116.aBoolean144) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(II)I")
	public int method913(@OriginalArg(0) int arg0) {
		return this.method912(arg0) ? this.aClass106_2.anIntArray120[arg0] : 0;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(ILjava/lang/String;)I")
	public int method914(@OriginalArg(1) String arg0) {
		if (this.method925()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass106_2.aClass134_1.method2768(Static634.method8423(local12));
			return this.method910(local29);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "(II)[B")
	public byte[] method915(@OriginalArg(0) int arg0) {
		if (!this.method925()) {
			return null;
		} else if (this.aClass106_2.anIntArray120.length == 1) {
			return this.method916(arg0, 0);
		} else if (!this.method912(arg0)) {
			return null;
		} else if (this.aClass106_2.anIntArray120[arg0] == 1) {
			return this.method916(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(III)[B")
	public byte[] method916(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method908((int[]) null, arg0, arg1);
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	private boolean method917(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method925()) {
			return false;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(20) String local20 = arg0.toLowerCase();
		@Pc(29) int local29 = this.aClass106_2.aClass134_1.method2768(Static634.method8423(local12));
		if (this.method912(local29)) {
			@Pc(49) int local49 = this.aClass106_2.aClass134Array1[local29].method2768(Static634.method8423(local20));
			return this.method901(local49, local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZI)V")
	private void method918(@OriginalArg(1) int arg0) {
		if (this.aBoolean62) {
			this.anObjectArray1[arg0] = this.aClass7_1.method155(arg0);
		} else {
			this.anObjectArray1[arg0] = Static280.method3887(this.aClass7_1.method155(arg0));
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(IBI[I)Z")
	private boolean method919(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method912(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			return false;
		} else {
			@Pc(33) int local33 = this.aClass106_2.anIntArray119[arg0];
			@Pc(39) int[] local39 = this.aClass106_2.anIntArrayArray19[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass106_2.anIntArray120[arg0]];
			}
			@Pc(59) Object[] local59 = this.anObjectArrayArray1[arg0];
			@Pc(61) boolean local61 = true;
			for (@Pc(63) int local63 = 0; local63 < local33; local63++) {
				@Pc(68) int local68;
				if (local39 == null) {
					local68 = local63;
				} else {
					local68 = local39[local63];
				}
				if (local59[local68] == null) {
					local61 = false;
					break;
				}
			}
			if (local61) {
				return true;
			}
			@Pc(120) byte[] local120;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local120 = Static120.method1911(false, this.anObjectArray1[arg0]);
			} else {
				local120 = Static120.method1911(true, this.anObjectArray1[arg0]);
				@Pc(134) Class5_Sub15 local134 = new Class5_Sub15(local120);
				local134.method3692(local134.aByteArray45.length, arg2);
			}
			@Pc(146) byte[] local146;
			try {
				local146 = Static427.method8767(local120);
			} catch (@Pc(148) RuntimeException local148) {
				throw Static389.method570(local148, "T3 - " + (arg2 != null) + "," + arg0 + "," + local120.length + "," + Static255.method3589(local120, local120.length) + "," + Static255.method3589(local120, local120.length - 2) + "," + this.aClass106_2.anIntArray123[arg0] + "," + this.aClass106_2.anInt2407);
			}
			if (this.aBoolean62) {
				this.anObjectArray1[arg0] = null;
			}
			@Pc(218) int local218;
			if (local33 <= 1) {
				if (local39 == null) {
					local218 = 0;
				} else {
					local218 = local39[0];
				}
				if (this.anInt990 == 0) {
					local59[local218] = Static280.method3887(local146);
				} else {
					local59[local218] = local146;
				}
			} else {
				@Pc(256) int local256;
				@Pc(269) Class5_Sub15 local269;
				@Pc(277) int local277;
				@Pc(280) int local280;
				@Pc(282) int local282;
				@Pc(334) int local334;
				@Pc(336) int local336;
				@Pc(339) int local339;
				@Pc(341) int local341;
				if (this.anInt990 == 2) {
					local218 = local146.length;
					local218--;
					local256 = local146[local218] & 0xFF;
					local218 -= local256 * 4 * local33;
					local269 = new Class5_Sub15(local146);
					@Pc(446) int local446 = 0;
					local277 = 0;
					local269.anInt4144 = local218;
					for (local280 = 0; local280 < local256; local280++) {
						local282 = 0;
						for (local334 = 0; local334 < local33; local334++) {
							local282 += local269.method3671();
							if (local39 == null) {
								local336 = local334;
							} else {
								local336 = local39[local334];
							}
							if (arg1 == local336) {
								local446 += local282;
								local277 = local336;
							}
						}
					}
					if (local446 == 0) {
						return true;
					}
					@Pc(506) byte[] local506 = new byte[local446];
					local446 = 0;
					local269.anInt4144 = local218;
					local334 = 0;
					for (local336 = 0; local336 < local256; local336++) {
						local339 = 0;
						for (local341 = 0; local341 < local33; local341++) {
							local339 += local269.method3671();
							@Pc(531) int local531;
							if (local39 == null) {
								local531 = local341;
							} else {
								local531 = local39[local341];
							}
							if (local531 == arg1) {
								Static685.method8328(local146, local334, local506, local446, local339);
								local446 += local339;
							}
							local334 += local339;
						}
					}
					local59[local277] = local506;
				} else {
					local218 = local146.length;
					local218--;
					local256 = local146[local218] & 0xFF;
					local218 -= local33 * local256 * 4;
					local269 = new Class5_Sub15(local146);
					@Pc(272) int[] local272 = new int[local33];
					local269.anInt4144 = local218;
					for (local277 = 0; local277 < local256; local277++) {
						local280 = 0;
						for (local282 = 0; local282 < local33; local282++) {
							local280 += local269.method3671();
							local272[local282] += local280;
						}
					}
					@Pc(311) byte[][] local311 = new byte[local33][];
					for (local282 = 0; local282 < local33; local282++) {
						local311[local282] = new byte[local272[local282]];
						local272[local282] = 0;
					}
					local269.anInt4144 = local218;
					local334 = 0;
					for (local336 = 0; local336 < local256; local336++) {
						local339 = 0;
						for (local341 = 0; local341 < local33; local341++) {
							local339 += local269.method3671();
							Static685.method8328(local146, local334, local311[local341], local272[local341], local339);
							local272[local341] += local339;
							local334 += local339;
						}
					}
					for (local339 = 0; local339 < local33; local339++) {
						if (local39 == null) {
							local341 = local339;
						} else {
							local341 = local39[local339];
						}
						if (this.anInt990 == 0) {
							local59[local341] = Static280.method3887(local311[local339]);
						} else {
							local59[local341] = local311[local339];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
	public boolean method920(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method925()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(21) String local21 = arg1.toLowerCase();
		@Pc(30) int local30 = this.aClass106_2.aClass134_1.method2768(Static634.method8423(local12));
		if (local30 < 0) {
			return false;
		} else {
			@Pc(48) int local48 = this.aClass106_2.aClass134Array1[local30].method2768(Static634.method8423(local21));
			return local48 >= 0;
		}
	}

	@OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)I")
	public int method921() {
		if (!this.method925()) {
			return 0;
		}
		@Pc(11) int local11 = 0;
		@Pc(13) int local13 = 0;
		for (@Pc(15) int local15 = 0; local15 < this.anObjectArray1.length; local15++) {
			if (this.aClass106_2.anIntArray119[local15] > 0) {
				local13 += this.method910(local15);
				local11 += 100;
			}
		}
		if (local11 == 0) {
			return 100;
		} else {
			return local13 * 100 / local11;
		}
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(BLjava/lang/String;)Z")
	public boolean method922(@OriginalArg(1) String arg0) {
		if (this.method925()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass106_2.aClass134_1.method2768(Static634.method8423(local20));
			return this.method906(local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)I")
	public int method923() {
		if (!this.method925()) {
			throw new IllegalStateException("");
		}
		return this.aClass106_2.anInt2407;
	}

	@OriginalMember(owner = "client!cb", name = "b", descriptor = "(ZI)I")
	public int method924(@OriginalArg(1) int arg0) {
		if (this.method925()) {
			@Pc(21) int local21 = this.aClass106_2.aClass134_1.method2768(arg0);
			return this.method912(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!cb", name = "c", descriptor = "(Z)Z")
	private boolean method925() {
		if (this.aClass106_2 == null) {
			this.aClass106_2 = this.aClass7_1.method157();
			if (this.aClass106_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass106_2.anInt2411][];
			this.anObjectArray1 = new Object[this.aClass106_2.anInt2411];
		}
		return true;
	}
}
