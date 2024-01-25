import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public final class Class191 {

	@OriginalMember(owner = "client!tq", name = "E", descriptor = "[[Ljava/lang/Object;")
	private Object[][] anObjectArrayArray1;

	@OriginalMember(owner = "client!tq", name = "M", descriptor = "[Ljava/lang/Object;")
	private Object[] anObjectArray34;

	@OriginalMember(owner = "client!tq", name = "t", descriptor = "Lclient!er;")
	private Class58 aClass58_2 = null;

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "Lclient!lk;")
	private final Class121 aClass121_1;

	@OriginalMember(owner = "client!tq", name = "I", descriptor = "I")
	public int anInt6270;

	@OriginalMember(owner = "client!tq", name = "z", descriptor = "Z")
	private final boolean aBoolean555;

	static {
		new Class93("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
	}

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!lk;ZI)V")
	public Class191(@OriginalArg(0) Class121 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		this.aClass121_1 = arg0;
		this.anInt6270 = arg2;
		this.aBoolean555 = arg1;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
	public void method5432() {
		if (this.anObjectArrayArray1 != null) {
			for (@Pc(15) int local15 = 0; local15 < this.anObjectArrayArray1.length; local15++) {
				this.anObjectArrayArray1[local15] = null;
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;B)Z")
	public boolean method5433(@OriginalArg(0) String arg0) {
		if (this.method5439()) {
			@Pc(17) String local17 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass58_2.aClass139_1.method3816(Static114.method5709(local17));
			return local28 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(Ljava/lang/String;B)V")
	public void method5434(@OriginalArg(0) String arg0) {
		if (this.method5439()) {
			@Pc(15) String local15 = arg0.toLowerCase();
			@Pc(24) int local24 = this.aClass58_2.aClass139_1.method3816(Static114.method5709(local15));
			this.method5463(local24);
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	public byte[] method5436(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method5439()) {
			return null;
		}
		@Pc(12) String local12 = arg0.toLowerCase();
		@Pc(15) String local15 = arg1.toLowerCase();
		@Pc(24) int local24 = this.aClass58_2.aClass139_1.method3816(Static114.method5709(local12));
		if (this.method5456(local24)) {
			@Pc(47) int local47 = this.aClass58_2.aClass139Array1[local24].method3816(Static114.method5709(local15));
			return this.method5459(local24, local47);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)V")
	private void method5437(@OriginalArg(0) int arg0) {
		if (this.aBoolean555) {
			this.anObjectArray34[arg0] = this.aClass121_1.method4857(arg0);
		} else {
			this.anObjectArray34[arg0] = Static228.method1035(this.aClass121_1.method4857(arg0));
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z")
	public boolean method5438(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		if (!this.method5439()) {
			return false;
		}
		@Pc(17) String local17 = arg0.toLowerCase();
		@Pc(20) String local20 = arg1.toLowerCase();
		@Pc(29) int local29 = this.aClass58_2.aClass139_1.method3816(Static114.method5709(local17));
		if (this.method5456(local29)) {
			@Pc(47) int local47 = this.aClass58_2.aClass139Array1[local29].method3816(Static114.method5709(local20));
			return this.method5454(local29, local47);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)Z")
	private boolean method5439() {
		if (this.aClass58_2 == null) {
			this.aClass58_2 = this.aClass121_1.method4858();
			if (this.aClass58_2 == null) {
				return false;
			}
			this.anObjectArrayArray1 = new Object[this.aClass58_2.anInt1738][];
			this.anObjectArray34 = new Object[this.aClass58_2.anInt1738];
		}
		return true;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(II)Z")
	public boolean method5440(@OriginalArg(0) int arg0) {
		if (!this.method5439()) {
			return false;
		} else if (this.aClass58_2.anIntArray191.length == 1) {
			return this.method5454(0, arg0);
		} else if (!this.method5456(arg0)) {
			return false;
		} else if (this.aClass58_2.anIntArray191[arg0] == 1) {
			return this.method5454(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZZI)V")
	public void method5441(@OriginalArg(0) boolean arg0) {
		if (!this.method5439()) {
			return;
		}
		if (arg0) {
			this.aClass58_2.aClass139_1 = null;
			this.aClass58_2.anIntArray190 = null;
		}
		this.aClass58_2.anIntArrayArray54 = null;
		this.aClass58_2.aClass139Array1 = null;
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)I")
	public int method5442() {
		if (!this.method5439()) {
			return 0;
		}
		@Pc(13) int local13 = 0;
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < this.anObjectArray34.length; local17++) {
			if (this.aClass58_2.anIntArray188[local17] > 0) {
				local13 += 100;
				local15 += this.method5462(local17);
			}
		}
		if (local13 == 0) {
			return 100;
		} else {
			return local15 * 100 / local13;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IB)I")
	public int method5443(@OriginalArg(0) int arg0) {
		return this.method5456(arg0) ? this.aClass58_2.anIntArray191[arg0] : 0;
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(II)V")
	public void method5444(@OriginalArg(0) int arg0) {
		if (this.method5456(arg0) && this.anObjectArrayArray1 != null) {
			this.anObjectArrayArray1[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(I)V")
	public void method5445() {
		if (this.anObjectArray34 != null) {
			for (@Pc(11) int local11 = 0; local11 < this.anObjectArray34.length; local11++) {
				this.anObjectArray34[local11] = null;
			}
		}
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(Ljava/lang/String;B)I")
	public int method5446(@OriginalArg(0) String arg0) {
		if (this.method5439()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(21) int local21 = this.aClass58_2.aClass139_1.method3816(Static114.method5709(local12));
			return this.method5456(local21) ? local21 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BI)[I")
	public int[] method5447(@OriginalArg(1) int arg0) {
		if (!this.method5456(arg0)) {
			return null;
		}
		@Pc(25) int[] local25 = this.aClass58_2.anIntArrayArray55[arg0];
		if (local25 == null) {
			local25 = new int[this.aClass58_2.anIntArray188[arg0]];
			@Pc(36) int local36 = 0;
			while (local36 < local25.length) {
				local25[local36] = local36++;
			}
		}
		return local25;
	}

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "(II)[B")
	public byte[] method5448(@OriginalArg(0) int arg0) {
		if (!this.method5439()) {
			return null;
		} else if (this.aClass58_2.anIntArray191.length == 1) {
			return this.method5459(0, arg0);
		} else if (!this.method5456(arg0)) {
			return null;
		} else if (this.aClass58_2.anIntArray191[arg0] == 1) {
			return this.method5459(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)Z")
	private boolean method5449(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5439()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass58_2.anIntArray191.length && arg1 < this.aClass58_2.anIntArray191[arg0]) {
			return true;
		} else if (Static123.aBoolean233) {
			throw new IllegalArgumentException(arg0 + "," + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "([IIII)[B")
	public byte[] method5450(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (!this.method5449(arg1, arg2)) {
			return null;
		}
		if (this.anObjectArrayArray1[arg1] == null || this.anObjectArrayArray1[arg1][arg2] == null) {
			@Pc(30) boolean local30 = this.method5451(arg0, arg2, arg1);
			if (!local30) {
				this.method5437(arg1);
				local30 = this.method5451(arg0, arg2, arg1);
				if (!local30) {
					return null;
				}
			}
		}
		@Pc(57) byte[] local57 = Static37.method858(false, this.anObjectArrayArray1[arg1][arg2]);
		if (this.anInt6270 == 1) {
			this.anObjectArrayArray1[arg1][arg2] = null;
			if (this.aClass58_2.anIntArray191[arg1] == 1) {
				this.anObjectArrayArray1[arg1] = null;
			}
		} else if (this.anInt6270 == 2) {
			this.anObjectArrayArray1[arg1] = null;
		}
		return local57;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I[III)Z")
	private boolean method5451(@OriginalArg(1) int[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!this.method5456(arg2)) {
			return false;
		} else if (this.anObjectArray34[arg2] == null) {
			return false;
		} else {
			@Pc(25) int local25 = this.aClass58_2.anIntArray188[arg2];
			@Pc(31) int[] local31 = this.aClass58_2.anIntArrayArray55[arg2];
			if (this.anObjectArrayArray1[arg2] == null) {
				this.anObjectArrayArray1[arg2] = new Object[this.aClass58_2.anIntArray191[arg2]];
			}
			@Pc(51) Object[] local51 = this.anObjectArrayArray1[arg2];
			@Pc(53) boolean local53 = true;
			for (@Pc(61) int local61 = 0; local61 < local25; local61++) {
				@Pc(69) int local69;
				if (local31 == null) {
					local69 = local61;
				} else {
					local69 = local31[local61];
				}
				if (local51[local69] == null) {
					local53 = false;
					break;
				}
			}
			if (local53) {
				return true;
			}
			@Pc(126) byte[] local126;
			if (arg0 == null || arg0[0] == 0 && arg0[1] == 0 && arg0[2] == 0 && arg0[3] == 0) {
				local126 = Static37.method858(false, this.anObjectArray34[arg2]);
			} else {
				local126 = Static37.method858(true, this.anObjectArray34[arg2]);
				@Pc(141) Class2_Sub10 local141 = new Class2_Sub10(local126);
				local141.method4423(local141.aByteArray57.length, arg0);
			}
			@Pc(153) byte[] local153;
			try {
				local153 = Static145.method5966(local126);
			} catch (@Pc(155) RuntimeException local155) {
				throw Static293.method5190(local155, "T3 - " + (arg0 != null) + "," + arg2 + "," + local126.length + "," + Static330.method5772(local126.length, local126) + "," + Static330.method5772(local126.length - 2, local126) + "," + this.aClass58_2.anIntArray189[arg2] + "," + this.aClass58_2.anInt1742);
			}
			if (this.aBoolean555) {
				this.anObjectArray34[arg2] = null;
			}
			@Pc(227) int local227;
			if (local25 <= 1) {
				if (local31 == null) {
					local227 = 0;
				} else {
					local227 = local31[0];
				}
				if (this.anInt6270 == 0) {
					local51[local227] = Static228.method1035(local153);
				} else {
					local51[local227] = local153;
				}
			} else {
				@Pc(268) int local268;
				@Pc(281) Class2_Sub10 local281;
				@Pc(289) int local289;
				@Pc(293) int local293;
				@Pc(295) int local295;
				@Pc(355) int local355;
				@Pc(357) int local357;
				@Pc(361) int local361;
				@Pc(363) int local363;
				if (this.anInt6270 == 2) {
					local227 = local153.length;
					local227--;
					local268 = local153[local227] & 0xFF;
					local227 -= local25 * 4 * local268;
					local281 = new Class2_Sub10(local153);
					@Pc(473) int local473 = 0;
					local281.anInt4807 = local227;
					local289 = 0;
					for (local293 = 0; local293 < local268; local293++) {
						local295 = 0;
						for (local355 = 0; local355 < local25; local355++) {
							local295 += local281.method4444();
							if (local31 == null) {
								local357 = local355;
							} else {
								local357 = local31[local355];
							}
							if (arg1 == local357) {
								local289 = local357;
								local473 += local295;
							}
						}
					}
					if (local473 == 0) {
						return true;
					}
					@Pc(530) byte[] local530 = new byte[local473];
					local473 = 0;
					local281.anInt4807 = local227;
					local355 = 0;
					for (local357 = 0; local357 < local268; local357++) {
						local361 = 0;
						for (local363 = 0; local363 < local25; local363++) {
							local361 += local281.method4444();
							@Pc(559) int local559;
							if (local31 == null) {
								local559 = local363;
							} else {
								local559 = local31[local363];
							}
							if (local559 == arg1) {
								Static359.method687(local153, local355, local530, local473, local361);
								local473 += local361;
							}
							local355 += local361;
						}
					}
					local51[local289] = local530;
				} else {
					local227 = local153.length;
					local227--;
					local268 = local153[local227] & 0xFF;
					local227 -= local25 * 4 * local268;
					local281 = new Class2_Sub10(local153);
					@Pc(284) int[] local284 = new int[local25];
					local281.anInt4807 = local227;
					for (local289 = 0; local289 < local268; local289++) {
						local293 = 0;
						for (local295 = 0; local295 < local25; local295++) {
							local293 += local281.method4444();
							local284[local295] += local293;
						}
					}
					@Pc(327) byte[][] local327 = new byte[local25][];
					for (local295 = 0; local295 < local25; local295++) {
						local327[local295] = new byte[local284[local295]];
						local284[local295] = 0;
					}
					local281.anInt4807 = local227;
					local355 = 0;
					for (local357 = 0; local357 < local268; local357++) {
						local361 = 0;
						for (local363 = 0; local363 < local25; local363++) {
							local361 += local281.method4444();
							Static359.method687(local153, local355, local327[local363], local284[local363], local361);
							local284[local363] += local361;
							local355 += local361;
						}
					}
					for (local361 = 0; local361 < local25; local361++) {
						if (local31 == null) {
							local363 = local361;
						} else {
							local363 = local31[local361];
						}
						if (this.anInt6270 == 0) {
							local51[local363] = Static228.method1035(local327[local361]);
						} else {
							local51[local363] = local327[local361];
						}
					}
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)Z")
	public boolean method5452() {
		if (!this.method5439()) {
			return false;
		}
		@Pc(13) boolean local13 = true;
		for (@Pc(15) int local15 = 0; local15 < this.aClass58_2.anIntArray187.length; local15++) {
			@Pc(23) int local23 = this.aClass58_2.anIntArray187[local15];
			if (this.anObjectArray34[local23] == null) {
				this.method5437(local23);
				if (this.anObjectArray34[local23] == null) {
					local13 = false;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "(B)I")
	public int method5453() {
		if (!this.method5439()) {
			throw new IllegalStateException("");
		}
		return this.aClass58_2.anInt1742;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZII)Z")
	public boolean method5454(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (!this.method5449(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray1[arg0] != null && this.anObjectArrayArray1[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray34[arg0] == null) {
			this.method5437(arg0);
			return this.anObjectArray34[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method5455(@OriginalArg(1) String arg0) {
		if (this.method5439()) {
			@Pc(12) String local12 = arg0.toLowerCase();
			@Pc(29) int local29 = this.aClass58_2.aClass139_1.method3816(Static114.method5709(local12));
			return this.method5457(local29);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IZ)Z")
	private boolean method5456(@OriginalArg(0) int arg0) {
		if (!this.method5439()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass58_2.anIntArray191.length && this.aClass58_2.anIntArray191[arg0] != 0) {
			return true;
		} else if (Static123.aBoolean233) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(BI)Z")
	public boolean method5457(@OriginalArg(1) int arg0) {
		if (!this.method5456(arg0)) {
			return false;
		} else if (this.anObjectArray34[arg0] == null) {
			this.method5437(arg0);
			return this.anObjectArray34[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(BLjava/lang/String;)I")
	public int method5458(@OriginalArg(1) String arg0) {
		if (this.method5439()) {
			@Pc(19) String local19 = arg0.toLowerCase();
			@Pc(28) int local28 = this.aClass58_2.aClass139_1.method3816(Static114.method5709(local19));
			return this.method5462(local28);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(BII)[B")
	public byte[] method5459(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return this.method5450(null, arg0, arg1);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(Z)I")
	public int method5460() {
		return this.method5439() ? this.aClass58_2.anIntArray191.length : -1;
	}

	@OriginalMember(owner = "client!tq", name = "e", descriptor = "(II)I")
	public int method5461(@OriginalArg(0) int arg0) {
		if (this.method5439()) {
			@Pc(16) int local16 = this.aClass58_2.aClass139_1.method3816(arg0);
			return this.method5456(local16) ? local16 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(IB)I")
	private int method5462(@OriginalArg(0) int arg0) {
		if (this.method5456(arg0)) {
			return this.anObjectArray34[arg0] == null ? this.aClass121_1.method4861(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "(II)V")
	private void method5463(@OriginalArg(1) int arg0) {
		this.aClass121_1.method4862(arg0);
	}
}
