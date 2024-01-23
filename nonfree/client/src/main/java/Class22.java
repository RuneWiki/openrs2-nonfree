import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class22 {

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray1;

	@OriginalMember(owner = "client!cg", name = "E", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "Lclient!on;")
	private Class125 aClass125_1 = null;

	@OriginalMember(owner = "client!cg", name = "n", descriptor = "Z")
	private boolean aBoolean49;

	@OriginalMember(owner = "client!cg", name = "r", descriptor = "Z")
	private boolean aBoolean50;

	@OriginalMember(owner = "client!cg", name = "v", descriptor = "Lclient!wn;")
	private Class39 aClass39_1;

	@OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lclient!wn;ZZ)V")
	public Class22(@OriginalArg(0) Class39 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) boolean arg2) {
		this.aBoolean49 = arg2;
		this.aBoolean50 = arg1;
		this.aClass39_1 = arg0;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)Z")
	public boolean method653(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method658(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray1[arg1] == null) {
			this.method680(arg1);
			return this.anObjectArray1[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IB)[I")
	public int[] method654(@OriginalArg(0) int arg0) {
		if (!this.method673(arg0)) {
			return null;
		}
		@Pc(26) int[] local26 = this.aClass125_1.anIntArrayArray26[arg0];
		if (local26 == null) {
			local26 = new int[this.aClass125_1.anIntArray321[arg0]];
			@Pc(38) int local38 = 0;
			while (local38 < local26.length) {
				local26[local38] = local38++;
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZ)Z")
	public boolean method656(@OriginalArg(0) int arg0) {
		if (!this.method668()) {
			return false;
		} else if (this.aClass125_1.anIntArray322.length == 1) {
			return this.method653(arg0, 0);
		} else if (!this.method673(arg0)) {
			return false;
		} else if (this.aClass125_1.anIntArray322[arg0] == 1) {
			return this.method653(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method657(@OriginalArg(0) String arg0) {
		if (this.method668()) {
			@Pc(21) String local21 = arg0.toLowerCase();
			@Pc(30) int local30 = this.aClass125_1.aClass28_1.method798(Static160.method2580(local21));
			return this.method663(local30);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(III)Z")
	private boolean method658(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method668()) {
			return false;
		} else if (arg1 >= 0 && arg0 >= 0 && this.aClass125_1.anIntArray322.length > arg1 && arg0 < this.aClass125_1.anIntArray322[arg1]) {
			return true;
		} else if (Static118.aBoolean157) {
			throw new IllegalArgumentException(arg1 + "," + arg0);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public boolean method659(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method668()) {
			return false;
		}
		@Pc(21) String local21 = arg1.toLowerCase();
		@Pc(24) String local24 = arg0.toLowerCase();
		@Pc(33) int local33 = this.aClass125_1.aClass28_1.method798(Static160.method2580(local21));
		if (this.method673(local33)) {
			@Pc(52) int local52 = this.aClass125_1.aClass28Array1[local33].method798(Static160.method2580(local24));
			return this.method653(local52, local33);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "([III)Z")
	private boolean method660(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1) {
		if (!this.method673(arg1)) {
			return false;
		} else if (this.anObjectArray1[arg1] == null) {
			return false;
		} else {
			@Pc(30) int local30 = this.aClass125_1.anIntArray321[arg1];
			@Pc(36) int[] local36 = this.aClass125_1.anIntArrayArray26[arg1];
			@Pc(38) boolean local38 = true;
			if (this.anObjectArrayArray1[arg1] == null) {
				this.anObjectArrayArray1[arg1] = new Object[this.aClass125_1.anIntArray322[arg1]];
			}
			@Pc(59) Object[] local59 = this.anObjectArrayArray1[arg1];
			for (@Pc(61) int local61 = 0; local61 < local30; local61++) {
				@Pc(75) int local75;
				if (local36 == null) {
					local75 = local61;
				} else {
					local75 = local36[local61];
				}
				if (local59[local75] == null) {
					local38 = false;
					break;
				}
			}
			if (local38) {
				return true;
			}
			@Pc(128) byte[] local128;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local128 = Static82.method1400(false, this.anObjectArray1[arg1]);
			} else {
				local128 = Static82.method1400(true, this.anObjectArray1[arg1]);
				@Pc(142) Class4_Sub24 local142 = new Class4_Sub24(local128);
				local142.method3106(arg0, local142.aByteArray47.length);
			}
			@Pc(154) byte[] local154;
			try {
				local154 = Static40.method748(local128);
			} catch (@Pc(156) RuntimeException local156) {
				throw Static9.method148(local156, "T3 - " + (arg0 != null) + "," + arg1 + "," + local128.length + "," + Static243.method3736(local128, local128.length) + "," + Static243.method3736(local128, local128.length - 2) + "," + this.aClass125_1.anIntArray318[arg1] + "," + this.aClass125_1.anInt4013);
			}
			if (this.aBoolean50) {
				this.anObjectArray1[arg1] = null;
			}
			@Pc(228) int local228;
			if (local30 > 1) {
				local228 = local154.length;
				@Pc(230) int local230 = local228 - 1;
				@Pc(235) int local235 = local154[local230] & 0xFF;
				@Pc(243) int local243 = local230 - local235 * local30 * 4;
				@Pc(246) int[] local246 = new int[local30];
				@Pc(251) Class4_Sub24 local251 = new Class4_Sub24(local154);
				local251.anInt3822 = local243;
				@Pc(261) int local261;
				@Pc(263) int local263;
				for (@Pc(256) int local256 = 0; local256 < local235; local256++) {
					local261 = 0;
					for (local263 = 0; local263 < local30; local263++) {
						local261 += local251.method3084();
						local246[local263] += local261;
						if (local36 == null) {
						}
					}
				}
				@Pc(294) byte[][] local294 = new byte[local30][];
				for (local261 = 0; local261 < local30; local261++) {
					local294[local261] = new byte[local246[local261]];
					local246[local261] = 0;
				}
				local251.anInt3822 = local243;
				local261 = 0;
				@Pc(329) int local329;
				for (local263 = 0; local263 < local235; local263++) {
					local329 = 0;
					for (@Pc(331) int local331 = 0; local331 < local30; local331++) {
						local329 += local251.method3084();
						Static317.method3199(local154, local261, local294[local331], local246[local331], local329);
						local246[local331] += local329;
						local261 += local329;
					}
				}
				for (local263 = 0; local263 < local30; local263++) {
					if (local36 == null) {
						local329 = local263;
					} else {
						local329 = local36[local263];
					}
					if (this.aBoolean49) {
						local59[local329] = local294[local263];
					} else {
						local59[local329] = Static51.method994(local294[local263]);
					}
				}
			} else {
				if (local36 == null) {
					local228 = 0;
				} else {
					local228 = local36[0];
				}
				if (this.aBoolean49) {
					local59[local228] = local154;
				} else {
					local59[local228] = Static51.method994(local154);
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BLjava/lang/String;)I")
	public int method661(@OriginalArg(1) String arg0) {
		if (this.method668()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass125_1.aClass28_1.method798(Static160.method2580(local18));
			return this.method673(local29) ? local29 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILjava/lang/String;)V")
	public void method662(@OriginalArg(1) String arg0) {
		if (this.method668()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass125_1.aClass28_1.method798(Static160.method2580(local12));
			this.method671(local21);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)I")
	private int method663(@OriginalArg(1) int arg0) {
		if (this.method673(arg0)) {
			return this.anObjectArray1[arg0] == null ? this.aClass39_1.method1131(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)I")
	public int method664() {
		if (!this.method668()) {
			return 0;
		}
		@Pc(20) int local20 = 0;
		@Pc(22) int local22 = 0;
		for (@Pc(24) int local24 = 0; local24 < this.anObjectArray1.length; local24++) {
			if (this.aClass125_1.anIntArray321[local24] > 0) {
				local20 += 100;
				local22 += this.method663(local24);
			}
		}
		if (local20 == 0) {
			return 100;
		} else {
			return local22 * 100 / local20;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZII)[B")
	public byte[] method665(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method675(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIZ)[B")
	public byte[] method666(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method658(arg0, arg1)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(31) boolean local31 = this.method660(null, arg1);
			if (!local31) {
				this.method680(arg1);
				local31 = this.method660(null, arg1);
				if (!local31) {
					return null;
				}
			}
		}
		return Static82.method1400(false, this.anObjectArrayArray1[arg1][arg0]);
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)I")
	public int method667() {
		if (!this.method668()) {
			throw new IllegalStateException("");
		}
		return this.aClass125_1.anInt4013;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)Z")
	private boolean method668() {
		if (this.aClass125_1 == null) {
			this.aClass125_1 = this.aClass39_1.method1135();
			if (this.aClass125_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass125_1.anInt4007][];
			this.anObjectArray1 = new Object[this.aClass125_1.anInt4007];
		}
		return true;
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)V")
	public void method669(@OriginalArg(0) int arg0) {
		if (this.method673(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method670(@OriginalArg(0) String arg0) {
		if (this.method668()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(23) int local23 = this.aClass125_1.aClass28_1.method798(Static160.method2580(local12));
			return local23 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)V")
	private void method671(@OriginalArg(1) int arg0) {
		this.aClass39_1.method1132(arg0);
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(II)Z")
	public boolean method672(@OriginalArg(0) int arg0) {
		if (!this.method673(arg0)) {
			return false;
		} else if (this.anObjectArray1[arg0] == null) {
			this.method680(arg0);
			return this.anObjectArray1[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(II)Z")
	private boolean method673(@OriginalArg(0) int arg0) {
		if (!this.method668()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass125_1.anIntArray322.length && this.aClass125_1.anIntArray322[arg0] != 0) {
			return true;
		} else if (Static118.aBoolean157) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BZZ)V")
	public void method674(@OriginalArg(2) boolean arg0) {
		if (!this.method668()) {
			return;
		}
		if (arg0) {
			this.aClass125_1.aClass28_1 = null;
			this.aClass125_1.anIntArray320 = null;
		}
		this.aClass125_1.anIntArrayArray27 = null;
		this.aClass125_1.aClass28Array1 = null;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIZ[I)[B")
	public byte[] method675(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method658(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg1] == null) {
			@Pc(31) boolean local31 = this.method660(arg2, arg0);
			if (!local31) {
				this.method680(arg0);
				local31 = this.method660(arg2, arg0);
				if (!local31) {
					return null;
				}
			}
		}
		@Pc(59) byte[] local59 = Static82.method1400(false, this.anObjectArrayArray1[arg0][arg1]);
		if (this.aBoolean49) {
			this.anObjectArrayArray1[arg0][arg1] = null;
			if (this.aClass125_1.anIntArray322[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		}
		return local59;
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)I")
	public int method677() {
		return this.method668() ? this.aClass125_1.anIntArray322.length : -1;
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)V")
	public void method678() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(7) int local7 = 0; local7 < this.anObjectArrayArray1.length; local7++) {
				this.anObjectArrayArray1[local7] = null;
			}
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(IZ)I")
	public int method679(@OriginalArg(0) int arg0) {
		return this.method673(arg0) ? this.aClass125_1.anIntArray322[arg0] : 0;
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(II)V")
	private void method680(@OriginalArg(0) int arg0) {
		if (this.aBoolean50) {
			this.anObjectArray1[arg0] = this.aClass39_1.method1133(arg0);
		} else {
			this.anObjectArray1[arg0] = Static51.method994(this.aClass39_1.method1133(arg0));
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)[B")
	public byte[] method681(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method668()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(19) String local19 = arg0.toLowerCase();
		@Pc(30) int local30 = this.aClass125_1.aClass28_1.method798(Static160.method2580(local12));
		if (this.method673(local30)) {
			@Pc(48) int local48 = this.aClass125_1.aClass28Array1[local30].method798(Static160.method2580(local19));
			return this.method665(local30, local48);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)Z")
	public boolean method682() {
		if (!this.method668()) {
			return false;
		}
		@Pc(14) boolean local14 = true;
		for (@Pc(16) int local16 = 0; local16 < this.aClass125_1.anIntArray319.length; local16++) {
			@Pc(28) int local28 = this.aClass125_1.anIntArray319[local16];
			if (this.anObjectArray1[local28] == null) {
				this.method680(local28);
				if (this.anObjectArray1[local28] == null) {
					local14 = false;
				}
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "(II)[B")
	public byte[] method683(@OriginalArg(0) int arg0) {
		if (!this.method668()) {
			return null;
		} else if (this.aClass125_1.anIntArray322.length == 1) {
			return this.method665(0, arg0);
		} else if (!this.method673(arg0)) {
			return null;
		} else if (this.aClass125_1.anIntArray322[arg0] == 1) {
			return this.method665(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method684(@OriginalArg(0) String arg0) {
		if (this.method668()) {
			@Pc(13) String local13 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass125_1.aClass28_1.method798(Static160.method2580(local13));
			return this.method672(local28);
		} else {
			return false;
		}
	}
}
