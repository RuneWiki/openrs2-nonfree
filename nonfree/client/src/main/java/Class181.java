import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kha")
public final class Class181 {

	@OriginalMember(owner = "client!kha", name = "s", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!kha", name = "E", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray32;

	@OriginalMember(owner = "client!kha", name = "o", descriptor = "Lclient!oba;")
	private Class241 aClass241_2 = null;

	@OriginalMember(owner = "client!kha", name = "C", descriptor = "Z")
	private final boolean aBoolean509;

	@OriginalMember(owner = "client!kha", name = "q", descriptor = "Lclient!mc;")
	private final Class120 aClass120_1;

	@OriginalMember(owner = "client!kha", name = "p", descriptor = "I")
	public int anInt5947;

	@OriginalMember(owner = "client!kha", name = "<init>", descriptor = "(Lclient!mc;ZI)V")
	public Class181(@OriginalArg(0) Class120 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
		}
		this.aBoolean509 = arg1;
		this.aClass120_1 = arg0;
		this.anInt5947 = arg2;
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(III)[B")
	public byte[] method5023(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return this.method5041(arg0, null, arg1);
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(IBI)Z")
	public boolean method5024(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5028(arg1, arg0)) {
			return false;
		} else if (this.anObjectArrayArray1[arg1] != null && this.anObjectArrayArray1[arg1][arg0] != null) {
			return true;
		} else if (this.anObjectArray32[arg1] == null) {
			this.method5047(arg1);
			return this.anObjectArray32[arg1] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(II)I")
	public int method5025(@OriginalArg(1) int arg0) {
		return this.method5050(arg0) ? this.aClass241_2.anIntArray457[arg0] : 0;
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	public byte[] method5026(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method5054()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass241_2.aClass296_1.method7292(Static120.method2826(local12));
		if (this.method5050(local24)) {
			@Pc(47) int local47 = this.aClass241_2.aClass296Array1[local24].method7292(Static120.method2826(local15));
			return this.method5023(local24, local47);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(IIB)Z")
	private boolean method5028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method5054()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass241_2.anIntArray457.length && arg1 < this.aClass241_2.anIntArray457[arg0]) {
			return true;
		} else if (Static438.aBoolean676) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kha", name = "b", descriptor = "(I)I")
	public int method5029() {
		return this.method5054() ? this.aClass241_2.anIntArray457.length : -1;
	}

	@OriginalMember(owner = "client!kha", name = "b", descriptor = "(II)[I")
	public int[] method5030(@OriginalArg(0) int arg0) {
		if (!this.method5050(arg0)) {
			return null;
		}
		@Pc(23) int[] local23 = this.aClass241_2.anIntArrayArray70[arg0];
		if (local23 == null) {
			local23 = new int[this.aClass241_2.anIntArray458[arg0]];
			@Pc(34) int local34 = 0;
			while (local34 < local23.length) {
				local23[local34] = local34++;
			}
		}
		return local23;
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(BI)Z")
	public boolean method5031(@OriginalArg(1) int arg0) {
		if (!this.method5050(arg0)) {
			return false;
		} else if (this.anObjectArray32[arg0] == null) {
			this.method5047(arg0);
			return this.anObjectArray32[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(II[II)Z")
	private boolean method5032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method5050(arg0)) {
			return false;
		} else if (this.anObjectArray32[arg0] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass241_2.anIntArray458[arg0];
			@Pc(31) int[] local31 = this.aClass241_2.anIntArrayArray70[arg0];
			if (this.anObjectArrayArray1[arg0] == null) {
				this.anObjectArrayArray1[arg0] = new Object[this.aClass241_2.anIntArray457[arg0]];
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
			@Pc(121) byte[] local121;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local121 = Static530.method7538(this.anObjectArray32[arg0], false);
			} else {
				local121 = Static530.method7538(this.anObjectArray32[arg0], true);
				@Pc(126) Class3_Sub15 local126 = new Class3_Sub15(local121);
				local126.method8449(arg2, local126.aByteArray106.length);
			}
			@Pc(148) byte[] local148;
			try {
				local148 = Static282.method4634(local121);
			} catch (@Pc(150) RuntimeException local150) {
				throw Static335.method5568(local150, "T3 - " + (arg2 != null) + "," + arg0 + "," + local121.length + "," + Static347.method5692(local121.length, local121) + "," + Static347.method5692(local121.length - 2, local121) + "," + this.aClass241_2.anIntArray461[arg0] + "," + this.aClass241_2.anInt7446);
			}
			if (this.aBoolean509) {
				this.anObjectArray32[arg0] = null;
			}
			@Pc(222) int local222;
			if (local25 <= 1) {
				if (local31 == null) {
					local222 = 0;
				} else {
					local222 = local31[0];
				}
				if (this.anInt5947 == 0) {
					local51[local222] = Static368.method5897(local148);
				} else {
					local51[local222] = local148;
				}
			} else {
				@Pc(260) int local260;
				@Pc(273) Class3_Sub15 local273;
				@Pc(280) int local280;
				@Pc(282) int local282;
				@Pc(286) int local286;
				@Pc(288) int local288;
				@Pc(302) int local302;
				@Pc(351) int local351;
				@Pc(353) int local353;
				if (this.anInt5947 == 2) {
					local222 = local148.length;
					local222--;
					local260 = local148[local222] & 0xFF;
					local222 -= local260 * local25 * 4;
					local273 = new Class3_Sub15(local148);
					@Pc(275) int local275 = 0;
					local273.anInt10282 = local222;
					local280 = 0;
					for (local282 = 0; local282 < local260; local282++) {
						local286 = 0;
						for (local288 = 0; local288 < local25; local288++) {
							local286 += local273.method8402();
							if (local31 == null) {
								local302 = local288;
							} else {
								local302 = local31[local288];
							}
							if (arg1 == local302) {
								local275 += local286;
								local280 = local302;
							}
						}
					}
					if (local275 == 0) {
						return true;
					}
					@Pc(338) byte[] local338 = new byte[local275];
					local273.anInt10282 = local222;
					local275 = 0;
					local288 = 0;
					for (local302 = 0; local302 < local260; local302++) {
						local351 = 0;
						for (local353 = 0; local353 < local25; local353++) {
							local351 += local273.method8402();
							@Pc(367) int local367;
							if (local31 == null) {
								local367 = local353;
							} else {
								local367 = local31[local353];
							}
							if (arg1 == local367) {
								Static655.method6406(local148, local288, local338, local275, local351);
								local275 += local351;
							}
							local288 += local351;
						}
					}
					local51[local280] = local338;
				} else {
					local222 = local148.length;
					local222--;
					local260 = local148[local222] & 0xFF;
					local222 -= local25 * 4 * local260;
					local273 = new Class3_Sub15(local148);
					@Pc(428) int[] local428 = new int[local25];
					local273.anInt10282 = local222;
					for (local280 = 0; local280 < local260; local280++) {
						local282 = 0;
						for (local286 = 0; local286 < local25; local286++) {
							local282 += local273.method8402();
							local428[local286] += local282;
						}
					}
					@Pc(469) byte[][] local469 = new byte[local25][];
					for (local286 = 0; local286 < local25; local286++) {
						local469[local286] = new byte[local428[local286]];
						local428[local286] = 0;
					}
					local273.anInt10282 = local222;
					local288 = 0;
					for (local302 = 0; local302 < local260; local302++) {
						local351 = 0;
						for (local353 = 0; local353 < local25; local353++) {
							local351 += local273.method8402();
							Static655.method6406(local148, local288, local469[local353], local428[local353], local351);
							local288 += local351;
							local428[local353] += local351;
						}
					}
					for (local351 = 0; local351 < local25; local351++) {
						if (local31 == null) {
							local353 = local351;
						} else {
							local353 = local31[local351];
						}
						if (this.anInt5947 == 0) {
							local51[local353] = Static368.method5897(local469[local351]);
						} else {
							local51[local353] = local469[local351];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(Ljava/lang/String;I)I")
	public int method5033(@OriginalArg(0) String arg0) {
		if (this.method5054()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(27) int local27 = this.aClass241_2.aClass296_1.method7292(Static120.method2826(local12));
			return this.method5050(local27) ? local27 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method5034(@OriginalArg(1) String arg0) {
		if (this.method5054()) {
			@Pc(20) String local20 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass241_2.aClass296_1.method7292(Static120.method2826(local20));
			return local29 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kha", name = "c", descriptor = "(II)I")
	private int method5035(@OriginalArg(0) int arg0) {
		if (this.method5050(arg0)) {
			return this.anObjectArray32[arg0] == null ? this.aClass120_1.method3830(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kha", name = "b", descriptor = "(Ljava/lang/String;I)I")
	public int method5036(@OriginalArg(0) String arg0) {
		if (this.method5054()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(26) int local26 = this.aClass241_2.aClass296_1.method7292(Static120.method2826(local17));
			return this.method5035(local26);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(IB)I")
	public int method5037(@OriginalArg(0) int arg0) {
		if (this.method5054()) {
			@Pc(16) int local16 = this.aClass241_2.aClass296_1.method7292(arg0);
			return this.method5050(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method5038(@OriginalArg(0) String arg0) {
		if (this.method5054()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass241_2.aClass296_1.method7292(Static120.method2826(local12));
			return this.method5031(local21);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(ZZB)V")
	public void method5039(@OriginalArg(0) boolean arg0) {
		if (!this.method5054()) {
			return;
		}
		this.aClass241_2.anIntArrayArray69 = null;
		this.aClass241_2.aClass296Array1 = null;
		if (arg0) {
			this.aClass241_2.anIntArray462 = null;
			this.aClass241_2.aClass296_1 = null;
		}
	}

	@OriginalMember(owner = "client!kha", name = "b", descriptor = "(IB)Z")
	public boolean method5040(@OriginalArg(0) int arg0) {
		if (!this.method5054()) {
			return false;
		} else if (this.aClass241_2.anIntArray457.length == 1) {
			return this.method5024(arg0, 0);
		} else if (!this.method5050(arg0)) {
			return false;
		} else if (this.aClass241_2.anIntArray457[arg0] == 1) {
			return this.method5024(0, arg0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(I[III)[B")
	public byte[] method5041(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2) {
		if (!this.method5028(arg0, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg0] == null || this.anObjectArrayArray1[arg0][arg2] == null) {
			@Pc(30) boolean local30 = this.method5032(arg0, arg2, arg1);
			if (!local30) {
				this.method5047(arg0);
				local30 = this.method5032(arg0, arg2, arg1);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(59) byte[] local59 = Static530.method7538(this.anObjectArrayArray1[arg0][arg2], false);
		if (this.anInt5947 == 1) {
			this.anObjectArrayArray1[arg0][arg2] = null;
			if (this.aClass241_2.anIntArray457[arg0] == 1) {
				this.anObjectArrayArray1[arg0] = null;
			}
		} else if (this.anInt5947 == 2) {
			this.anObjectArrayArray1[arg0] = null;
		}
		return local59;
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(B)Z")
	public boolean method5042() {
		if (!this.method5054()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(22) int local22 = 0; local22 < this.aClass241_2.anIntArray459.length; local22++) {
			@Pc(30) int local30 = this.aClass241_2.anIntArray459[local22];
			if (this.anObjectArray32[local30] == null) {
				this.method5047(local30);
				if (this.anObjectArray32[local30] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!kha", name = "c", descriptor = "(I)V")
	public void method5043() {
		if (this.anObjectArray32 != null) {
			for (@Pc(17) int local17 = 0; local17 < this.anObjectArray32.length; local17++) {
				this.anObjectArray32[local17] = null;
			}
		}
	}

	@OriginalMember(owner = "client!kha", name = "d", descriptor = "(II)V")
	public void method5044(@OriginalArg(1) int arg0) {
		if (this.method5050(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!kha", name = "d", descriptor = "(I)I")
	public int method5045() {
		if (!this.method5054()) {
			return 0;
		}
		@Pc(19) int local19 = 0;
		@Pc(21) int local21 = 0;
		for (@Pc(23) int local23 = 0; local23 < this.anObjectArray32.length; local23++) {
			if (this.aClass241_2.anIntArray458[local23] > 0) {
				local19 += 100;
				local21 += this.method5035(local23);
			}
		}
		if (local19 == 0) {
			return 100;
		} else {
			return local21 * 100 / local19;
		}
	}

	@OriginalMember(owner = "client!kha", name = "b", descriptor = "(B)I")
	public int method5046() {
		if (!this.method5054()) {
			throw new IllegalStateException("");
		}
		return this.aClass241_2.anInt7446;
	}

	@OriginalMember(owner = "client!kha", name = "b", descriptor = "(BI)V")
	private void method5047(@OriginalArg(1) int arg0) {
		if (this.aBoolean509) {
			this.anObjectArray32[arg0] = this.aClass120_1.method3831(arg0);
		} else {
			this.anObjectArray32[arg0] = Static368.method5897(this.aClass120_1.method3831(arg0));
		}
	}

	@OriginalMember(owner = "client!kha", name = "c", descriptor = "(B)V")
	public void method5048() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(14) int local14 = 0; local14 < this.anObjectArrayArray1.length; local14++) {
				this.anObjectArrayArray1[local14] = null;
			}
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(IZ)[B")
	public byte[] method5049(@OriginalArg(0) int arg0) {
		if (!this.method5054()) {
			return null;
		} else if (this.aClass241_2.anIntArray457.length == 1) {
			return this.method5023(0, arg0);
		} else if (!this.method5050(arg0)) {
			return null;
		} else if (this.aClass241_2.anIntArray457[arg0] == 1) {
			return this.method5023(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(ZI)Z")
	private boolean method5050(@OriginalArg(1) int arg0) {
		if (!this.method5054()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass241_2.anIntArray457.length && this.aClass241_2.anIntArray457[arg0] != 0) {
			return true;
		} else if (Static438.aBoolean676) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(ZLjava/lang/String;)V")
	public void method5051(@OriginalArg(1) String arg0) {
		if (this.method5054()) {
			@Pc(11) String local11 = arg0.toLowerCase();
			@Pc(20) int local20 = this.aClass241_2.aClass296_1.method7292(Static120.method2826(local11));
			this.method5055(local20);
		}
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z")
	private boolean method5052(@OriginalArg(0) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5054()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass241_2.aClass296_1.method7292(Static120.method2826(local12));
		if (this.method5050(local24)) {
			@Pc(50) int local50 = this.aClass241_2.aClass296Array1[local24].method7292(Static120.method2826(local15));
			return this.method5024(local50, local24);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!kha", name = "c", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method5053(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = this.method5033("");
		return local8 == -1 ? this.method5052(arg0, "") : this.method5052("", arg0);
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(Z)Z")
	private boolean method5054() {
		if (this.aClass241_2 == null) {
			this.aClass241_2 = this.aClass120_1.method3827();
			if (this.aClass241_2 == null) {
				return false;
			}
			this.anObjectArray32 = new Object[this.aClass241_2.anInt7448];
			this.anObjectArrayArray1 = new Object[this.aClass241_2.anInt7448][];
		}
		return true;
	}

	@OriginalMember(owner = "client!kha", name = "e", descriptor = "(II)V")
	private void method5055(@OriginalArg(0) int arg0) {
		this.aClass120_1.method3829(arg0);
	}

	@OriginalMember(owner = "client!kha", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)Z")
	public boolean method5056(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method5054()) {
			return false;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(23) String local23 = arg1.toLowerCase();
		@Pc(32) int local32 = this.aClass241_2.aClass296_1.method7292(Static120.method2826(local12));
		if (local32 < 0) {
			return false;
		} else {
			@Pc(47) int local47 = this.aClass241_2.aClass296Array1[local32].method7292(Static120.method2826(local23));
			return local47 >= 0;
		}
	}
}
