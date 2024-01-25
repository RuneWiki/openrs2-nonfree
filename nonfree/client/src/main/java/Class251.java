import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pfa")
public final class Class251 {

	@OriginalMember(owner = "client!pfa", name = "k", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!pfa", name = "L", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray2;

	@OriginalMember(owner = "client!pfa", name = "I", descriptor = "Lclient!aca;")
	private Class5 aClass5_1 = null;

	@OriginalMember(owner = "client!pfa", name = "v", descriptor = "I")
	public int anInt6868;

	@OriginalMember(owner = "client!pfa", name = "N", descriptor = "Z")
	private final boolean aBoolean468;

	@OriginalMember(owner = "client!pfa", name = "G", descriptor = "Lclient!jq;")
	private final Class160 aClass160_1;

	@OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Lclient!jq;ZI)V")
	public Class251(@OriginalArg(0) Class160 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.anInt6868 = arg2;
		this.aBoolean468 = arg1;
		this.aClass160_1 = arg0;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(BI)V")
	private void method5748(@OriginalArg(1) int arg0) {
		this.aClass160_1.method6353(arg0);
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method5751(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = this.method5764("");
		return local8 == -1 ? this.method5770(arg0, "") : this.method5770("", arg0);
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(II)[I")
	public int[] method5752(@OriginalArg(0) int arg0) {
		if (!this.method5778(arg0)) {
			return null;
		}
		@Pc(18) int[] local18 = this.aClass5_1.anIntArrayArray3[arg0];
		if (local18 == null) {
			local18 = new int[this.aClass5_1.anIntArray21[arg0]];
			@Pc(36) int local36 = 0;
			while (local36 < local18.length) {
				local18[local36] = local36++;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method5753(@OriginalArg(1) String arg0) {
		if (this.method5754()) {
			@Pc(22) String local22 = arg0.toLowerCase();
			@Pc(31) int local31 = this.aClass5_1.aClass283_1.method6317(Static309.method4875(local22));
			return this.method5775(local31);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)Z")
	private boolean method5754() {
		if (this.aClass5_1 == null) {
			this.aClass5_1 = this.aClass160_1.method6354();
			if (this.aClass5_1 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass5_1.anInt242][];
			this.anObjectArray2 = new Object[this.aClass5_1.anInt242];
		}
		return true;
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(I)I")
	public int method5755() {
		return this.method5754() ? this.aClass5_1.anIntArray18.length : -1;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public int method5756(@OriginalArg(0) String arg0) {
		if (this.method5754()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass5_1.aClass283_1.method6317(Static309.method4875(local12));
			return this.method5766(local26);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(III[I)Z")
	private boolean method5757(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method5778(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			return false;
		} else {
			@Pc(32) int local32 = this.aClass5_1.anIntArray21[arg0];
			@Pc(38) int[] local38 = this.aClass5_1.anIntArrayArray3[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass5_1.anIntArray18[arg0]];
			}
			@Pc(58) Object[] local58 = this.anObjectArrayArray1[arg0];
			@Pc(60) boolean local60 = true;
			for (@Pc(62) int local62 = 0; local62 < local32; local62++) {
				@Pc(70) int local70;
				if (local38 == null) {
					local70 = local62;
				} else {
					local70 = local38[local62];
				}
				if (local58[local70] == null) {
					local60 = false;
					break;
				}
			}
			if (local60) {
				return true;
			}
			@Pc(128) byte[] local128;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local128 = Static36.method965(this.anObjectArray2[arg0], false);
			} else {
				local128 = Static36.method965(this.anObjectArray2[arg0], true);
				@Pc(143) Class6_Sub21 local143 = new Class6_Sub21(local128);
				local143.method6034(arg2, local143.aByteArray93.length);
			}
			@Pc(155) byte[] local155;
			try {
				local155 = Static351.method7783(local128);
			} catch (@Pc(157) RuntimeException local157) {
				throw Static518.method7151(local157, "T3 - " + (arg2 != null) + "," + arg0 + "," + local128.length + "," + Static369.method5528(local128.length, local128) + "," + Static369.method5528(local128.length - 2, local128) + "," + this.aClass5_1.anIntArray19[arg0] + "," + this.aClass5_1.anInt240);
			}
			if (this.aBoolean468) {
				this.anObjectArray2[arg0] = null;
			}
			@Pc(234) int local234;
			if (local32 > 1) {
				@Pc(241) int local241;
				@Pc(254) Class6_Sub21 local254;
				@Pc(262) int local262;
				@Pc(266) int local266;
				@Pc(268) int local268;
				@Pc(326) int local326;
				@Pc(328) int local328;
				@Pc(332) int local332;
				@Pc(334) int local334;
				if (this.anInt6868 == 2) {
					local234 = local155.length;
					local234--;
					local241 = local155[local234] & 0xFF;
					local234 -= local32 * 4 * local241;
					local254 = new Class6_Sub21(local155);
					@Pc(444) int local444 = 0;
					local254.anInt7338 = local234;
					local262 = 0;
					for (local266 = 0; local266 < local241; local266++) {
						local268 = 0;
						for (local326 = 0; local326 < local32; local326++) {
							local268 += local254.method6036();
							if (local38 == null) {
								local328 = local326;
							} else {
								local328 = local38[local326];
							}
							if (arg1 == local328) {
								local444 += local268;
								local262 = local328;
							}
						}
					}
					if (local444 == 0) {
						return true;
					}
					@Pc(507) byte[] local507 = new byte[local444];
					local254.anInt7338 = local234;
					local444 = 0;
					local326 = 0;
					for (local328 = 0; local328 < local241; local328++) {
						local332 = 0;
						for (local334 = 0; local334 < local32; local334++) {
							local332 += local254.method6036();
							@Pc(538) int local538;
							if (local38 == null) {
								local538 = local334;
							} else {
								local538 = local38[local334];
							}
							if (local538 == arg1) {
								Static601.method2938(local155, local326, local507, local444, local332);
								local444 += local332;
							}
							local326 += local332;
						}
					}
					local58[local262] = local507;
				} else {
					local234 = local155.length;
					@Pc(237) int local237 = local234 - 1;
					local241 = local155[local237] & 0xFF;
					@Pc(249) int local249 = local237 - local32 * local241 * 4;
					local254 = new Class6_Sub21(local155);
					local254.anInt7338 = local249;
					@Pc(260) int[] local260 = new int[local32];
					for (local262 = 0; local262 < local241; local262++) {
						local266 = 0;
						for (local268 = 0; local268 < local32; local268++) {
							local266 += local254.method6036();
							local260[local268] += local266;
						}
					}
					@Pc(298) byte[][] local298 = new byte[local32][];
					for (local268 = 0; local268 < local32; local268++) {
						local298[local268] = new byte[local260[local268]];
						local260[local268] = 0;
					}
					local254.anInt7338 = local249;
					local326 = 0;
					for (local328 = 0; local328 < local241; local328++) {
						local332 = 0;
						for (local334 = 0; local334 < local32; local334++) {
							local332 += local254.method6036();
							Static601.method2938(local155, local326, local298[local334], local260[local334], local332);
							local260[local334] += local332;
							local326 += local332;
						}
					}
					for (local332 = 0; local332 < local32; local332++) {
						if (local38 == null) {
							local334 = local332;
						} else {
							local334 = local38[local332];
						}
						if (this.anInt6868 == 0) {
							local58[local334] = Static531.method7230(local298[local332]);
						} else {
							local58[local334] = local298[local332];
						}
					}
				}
			} else {
				if (local38 == null) {
					local234 = 0;
				} else {
					local234 = local38[0];
				}
				if (this.anInt6868 == 0) {
					local58[local234] = Static531.method7230(local155);
				} else {
					local58[local234] = local155;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(B)Z")
	public boolean method5758() {
		if (!this.method5754()) {
			return false;
		}
		@Pc(21) boolean local21 = true;
		for (@Pc(23) int local23 = 0; local23 < this.aClass5_1.anIntArray22.length; local23++) {
			@Pc(31) int local31 = this.aClass5_1.anIntArray22[local23];
			if (this.anObjectArray2[local31] == null) {
				this.method5773(local31);
				if (this.anObjectArray2[local31] == null) {
					local21 = false;
				}
			}
		}
		return local21;
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ZBZ)V")
	public void method5759(@OriginalArg(2) boolean arg0) {
		if (!this.method5754()) {
			return;
		}
		this.aClass5_1.anIntArrayArray2 = null;
		this.aClass5_1.aClass283Array1 = null;
		if (arg0) {
			this.aClass5_1.anIntArray23 = null;
			this.aClass5_1.aClass283_1 = null;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(III)Z")
	private boolean method5760(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5754()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass5_1.anIntArray18.length && this.aClass5_1.anIntArray18[arg0] > arg1) {
			return true;
		} else if (Static33.aBoolean56) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(II)[B")
	public byte[] method5761(@OriginalArg(1) int arg0) {
		if (!this.method5754()) {
			return null;
		} else if (this.aClass5_1.anIntArray18.length == 1) {
			return this.method5772(arg0, 0);
		} else if (!this.method5778(arg0)) {
			return null;
		} else if (this.aClass5_1.anIntArray18[arg0] == 1) {
			return this.method5772(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)[B")
	public byte[] method5762(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5754()) {
			return null;
		}
		@Pc(12) String local12 = arg1.toLowerCase();
		@Pc(15) String local15 = arg0.toLowerCase();
		@Pc(24) int local24 = this.aClass5_1.aClass283_1.method6317(Static309.method4875(local12));
		if (this.method5778(local24)) {
			@Pc(47) int local47 = this.aClass5_1.aClass283Array1[local24].method6317(Static309.method4875(local15));
			return this.method5772(local47, local24);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "c", descriptor = "(I)V")
	public void method5763() {
		if (this.anObjectArray2 != null) {
			for (@Pc(10) int local10 = 0; local10 < this.anObjectArray2.length; local10++) {
				this.anObjectArray2[local10] = null;
			}
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Ljava/lang/String;B)I")
	public int method5764(@OriginalArg(0) String arg0) {
		if (this.method5754()) {
			@Pc(18) String local18 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass5_1.aClass283_1.method6317(Static309.method4875(local18));
			return this.method5778(local29) ? local29 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "c", descriptor = "(II)I")
	public int method5765(@OriginalArg(1) int arg0) {
		if (this.method5754()) {
			@Pc(25) int local25 = this.aClass5_1.aClass283_1.method6317(arg0);
			return this.method5778(local25) ? local25 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "d", descriptor = "(II)I")
	private int method5766(@OriginalArg(1) int arg0) {
		if (this.method5778(arg0)) {
			return this.anObjectArray2[arg0] == null ? this.aClass160_1.method6352(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IB)I")
	public int method5768(@OriginalArg(0) int arg0) {
		return this.method5778(arg0) ? this.aClass5_1.anIntArray18[arg0] : 0;
	}

	@OriginalMember(owner = "client!pfa", name = "e", descriptor = "(II)V")
	public void method5769(@OriginalArg(0) int arg0) {
		if (this.method5778(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	private boolean method5770(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5754()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(22) String local22 = arg1.toLowerCase();
		@Pc(31) int local31 = this.aClass5_1.aClass283_1.method6317(Static309.method4875(local12));
		if (this.method5778(local31)) {
			@Pc(49) int local49 = this.aClass5_1.aClass283Array1[local31].method6317(Static309.method4875(local22));
			return this.method5780(local49, local31);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "d", descriptor = "(I)I")
	public int method5771() {
		if (!this.method5754()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray2.length; local17++) {
			if (this.aClass5_1.anIntArray21[local17] > 0) {
				local13 += 100;
				local15 += this.method5766(local17);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(III)[B")
	public byte[] method5772(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method5783(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(BI)V")
	private void method5773(@OriginalArg(1) int arg0) {
		if (this.aBoolean468) {
			this.anObjectArray2[arg0] = this.aClass160_1.method6357(arg0);
		} else {
			this.anObjectArray2[arg0] = Static531.method7230(this.aClass160_1.method6357(arg0));
		}
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(Ljava/lang/String;Z)Z")
	public boolean method5774(@OriginalArg(0) String arg0) {
		if (this.method5754()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass5_1.aClass283_1.method6317(Static309.method4875(local17));
			return local26 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "f", descriptor = "(II)Z")
	public boolean method5775(@OriginalArg(0) int arg0) {
		if (!this.method5778(arg0)) {
			return false;
		} else if (this.anObjectArray2[arg0] == null) {
			this.method5773(arg0);
			return this.anObjectArray2[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public boolean method5776(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5754()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass5_1.aClass283_1.method6317(Static309.method4875(local12));
		if (local24 < 0) {
			return false;
		} else {
			@Pc(44) int local44 = this.aClass5_1.aClass283Array1[local24].method6317(Static309.method4875(local15));
			return local44 >= 0;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Z)V")
	public void method5777() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anObjectArrayArray1.length; local14++) {
				this.anObjectArrayArray1[local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!pfa", name = "c", descriptor = "(BI)Z")
	private boolean method5778(@OriginalArg(1) int arg0) {
		if (!this.method5754()) {
			return false;
		} else if (arg0 >= 0 && this.aClass5_1.anIntArray18.length > arg0 && this.aClass5_1.anIntArray18[arg0] != 0) {
			return true;
		} else if (Static33.aBoolean56) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "c", descriptor = "(B)I")
	public int method5779() {
		if (!this.method5754()) {
			throw new IllegalStateException("");
		}
		return this.aClass5_1.anInt240;
	}

	@OriginalMember(owner = "client!pfa", name = "c", descriptor = "(III)Z")
	public boolean method5780(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method5760(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray2[arg1] == null) {
			this.method5773(arg1);
			return this.anObjectArray2[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(ILjava/lang/String;)V")
	public void method5781(@OriginalArg(1) String arg0) {
		if (this.method5754()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass5_1.aClass283_1.method6317(Static309.method4875(local11));
			this.method5748(local20);
		}
	}

	@OriginalMember(owner = "client!pfa", name = "d", descriptor = "(BI)Z")
	public boolean method5782(@OriginalArg(1) int arg0) {
		if (!this.method5754()) {
			return false;
		} else if (this.aClass5_1.anIntArray18.length == 1) {
			return this.method5780(arg0, 0);
		} else if (!this.method5778(arg0)) {
			return false;
		} else if (this.aClass5_1.anIntArray18[arg0] == 1) {
			return this.method5780(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pfa", name = "b", descriptor = "(III[I)[B")
	public byte[] method5783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2) {
		if (!this.method5760(arg1, arg0)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg0] == null) {
			@Pc(30) boolean local30 = this.method5757(arg1, arg0, arg2);
			if (!local30) {
				this.method5773(arg1);
				local30 = this.method5757(arg1, arg0, arg2);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static36.method965(this.anObjectArrayArray1[arg1][arg0], false);
		if (this.anInt6868 == 1) {
			this.anObjectArrayArray1[arg1][arg0] = null;
			if (this.aClass5_1.anIntArray18[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt6868 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local57;
	}
}
