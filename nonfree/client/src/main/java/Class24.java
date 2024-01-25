import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public final class Class24 {

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
	private int anInt1142;

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
	public int anInt1144;

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
	public int anInt1146;

	@OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
	public int anInt1149;

	@OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
	public int anInt1154;

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
	private int anInt1158;

	@OriginalMember(owner = "client!bc", name = "u", descriptor = "Lclient!re;")
	public Class250 aClass250_1;

	@OriginalMember(owner = "client!bc", name = "w", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "Lclient!lb;")
	private Class174 aClass174_3;

	@OriginalMember(owner = "client!bc", name = "B", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!bc", name = "L", descriptor = "I")
	private int anInt1171;

	@OriginalMember(owner = "client!bc", name = "M", descriptor = "[I")
	public int[] anIntArray117;

	@OriginalMember(owner = "client!bc", name = "N", descriptor = "I")
	public int anInt1172;

	@OriginalMember(owner = "client!bc", name = "R", descriptor = "I")
	private int anInt1175;

	@OriginalMember(owner = "client!bc", name = "V", descriptor = "I")
	public int anInt1177;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
	public int anInt1155 = 0;

	@OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
	public int anInt1151 = -1;

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
	private int anInt1157 = -1;

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
	public int anInt1156 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bc", name = "s", descriptor = "I")
	private int anInt1159 = -1;

	@OriginalMember(owner = "client!bc", name = "D", descriptor = "I")
	private int anInt1165 = -1;

	@OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
	private int anInt1168 = -1;

	@OriginalMember(owner = "client!bc", name = "v", descriptor = "I")
	public int anInt1161 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bc", name = "P", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray4 = new String[5];

	@OriginalMember(owner = "client!bc", name = "I", descriptor = "I")
	public int anInt1169 = -1;

	@OriginalMember(owner = "client!bc", name = "O", descriptor = "I")
	public int anInt1173 = -1;

	@OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
	private int anInt1147 = -1;

	@OriginalMember(owner = "client!bc", name = "Q", descriptor = "I")
	public int anInt1174 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!bc", name = "T", descriptor = "Z")
	public boolean aBoolean99 = true;

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
	public int anInt1162 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!bc", name = "X", descriptor = "Z")
	public boolean aBoolean100 = true;

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "Z")
	public boolean aBoolean98 = false;

	@OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
	public int anInt1166 = -1;

	@OriginalMember(owner = "client!bc", name = "Y", descriptor = "Z")
	public boolean aBoolean101 = true;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!nc;B)Z")
	public boolean method1184(@OriginalArg(0) Interface10 arg0) {
		@Pc(17) int local17;
		if (this.anInt1159 == -1) {
			if (this.anInt1147 == -1) {
				return true;
			}
			local17 = arg0.method6992(this.anInt1147);
		} else {
			local17 = arg0.method6991(this.anInt1159);
		}
		if (this.anInt1142 > local17 || local17 > this.anInt1158) {
			return false;
		}
		@Pc(53) int local53;
		if (this.anInt1157 == -1) {
			if (this.anInt1165 == -1) {
				return true;
			}
			local53 = arg0.method6992(this.anInt1165);
		} else {
			local53 = arg0.method6991(this.anInt1157);
		}
		return local53 >= this.anInt1171 && this.anInt1175 >= local53;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public void method1186() {
		if (this.anIntArray117 == null) {
			return;
		}
		for (@Pc(4) int local4 = 0; local4 < this.anIntArray117.length; local4 += 2) {
			if (this.anInt1161 > this.anIntArray117[local4]) {
				this.anInt1161 = this.anIntArray117[local4];
			} else if (this.anInt1174 < this.anIntArray117[local4]) {
				this.anInt1174 = this.anIntArray117[local4];
			}
			if (this.anInt1162 > this.anIntArray117[local4 + 1]) {
				this.anInt1162 = this.anIntArray117[local4 + 1];
			} else if (this.anIntArray117[local4 + 1] > this.anInt1156) {
				this.anInt1156 = this.anIntArray117[local4 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!qa;I)Lclient!ha;")
	public Class12 method1187(@OriginalArg(0) Class9 arg0) {
		@Pc(20) Class12 local20 = (Class12) this.aClass250_1.aClass316_54.method7799((long) (arg0.anInt9019 << 29 | 0x20000 | this.anInt1168));
		if (local20 != null) {
			return local20;
		}
		this.aClass250_1.aClass160_84.method4213(this.anInt1168);
		@Pc(40) Class242 local40 = Static559.method5942(this.aClass250_1.aClass160_84, this.anInt1168, 0);
		if (local40 != null) {
			local20 = arg0.method7625(local40);
			this.aClass250_1.aClass316_54.method7792((long) (this.anInt1168 | 0x20000 | arg0.anInt9019 << 29), local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BZLclient!qa;)Lclient!ha;")
	public Class12 method1188(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class9 arg1) {
		@Pc(11) int local11 = arg0 ? this.anInt1166 : this.anInt1173;
		@Pc(18) int local18 = arg1.anInt9019 << 29 | local11;
		@Pc(27) Class12 local27 = (Class12) this.aClass250_1.aClass316_54.method7799((long) local18);
		if (local27 != null) {
			return local27;
		} else if (this.aClass250_1.aClass160_84.method4213(local11)) {
			@Pc(47) Class242 local47 = Static559.method5942(this.aClass250_1.aClass160_84, local11, 0);
			if (local47 != null) {
				local27 = arg1.method7625(local47);
				this.aClass250_1.aClass316_54.method7792((long) local18, local27);
			}
			return local27;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)I")
	public int method1191(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass174_3 == null) {
			return arg1;
		} else {
			@Pc(16) Class1_Sub33 local16 = (Class1_Sub33) this.aClass174_3.method4422((long) arg0);
			return local16 == null ? arg1 : local16.anInt6397;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BILclient!gw;)V")
	private void method1194(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt1173 = arg1.method3056();
		} else if (arg0 == 2) {
			this.anInt1166 = arg1.method3056();
		} else if (arg0 == 3) {
			this.aString3 = arg1.method3034();
		} else if (arg0 == 4) {
			this.anInt1172 = arg1.method3039();
		} else if (arg0 == 5) {
			this.anInt1151 = arg1.method3039();
		} else if (arg0 == 6) {
			this.anInt1155 = arg1.method3043();
		} else {
			@Pc(54) int local54;
			if (arg0 == 7) {
				local54 = arg1.method3043();
				if ((local54 & 0x2) == 2) {
					this.aBoolean98 = true;
				}
				if ((local54 & 0x1) == 0) {
					this.aBoolean99 = false;
				}
			} else if (arg0 == 8) {
				this.aBoolean101 = arg1.method3043() == 1;
			} else if (arg0 == 9) {
				this.anInt1147 = arg1.method3056();
				if (this.anInt1147 == 65535) {
					this.anInt1147 = -1;
				}
				this.anInt1159 = arg1.method3056();
				if (this.anInt1159 == 65535) {
					this.anInt1159 = -1;
				}
				this.anInt1142 = arg1.method3037();
				this.anInt1158 = arg1.method3037();
			} else if (arg0 >= 10 && arg0 <= 14) {
				this.aStringArray4[arg0 - 10] = arg1.method3034();
			} else {
				@Pc(148) int local148;
				if (arg0 == 15) {
					local54 = arg1.method3043();
					this.anIntArray117 = new int[local54 * 2];
					for (local148 = 0; local148 < local54 * 2; local148++) {
						this.anIntArray117[local148] = arg1.method3058();
					}
					this.anInt1144 = arg1.method3037();
					this.anInt1177 = arg1.method3037();
				} else if (arg0 == 16) {
					this.aBoolean100 = false;
				} else if (arg0 == 17) {
					this.aString4 = arg1.method3034();
				} else if (arg0 == 18) {
					this.anInt1168 = arg1.method3056();
				} else if (arg0 == 19) {
					this.anInt1169 = arg1.method3056();
				} else if (arg0 == 20) {
					this.anInt1165 = arg1.method3056();
					if (this.anInt1165 == 65535) {
						this.anInt1165 = -1;
					}
					this.anInt1157 = arg1.method3056();
					if (this.anInt1157 == 65535) {
						this.anInt1157 = -1;
					}
					this.anInt1171 = arg1.method3037();
					this.anInt1175 = arg1.method3037();
				} else if (arg0 == 21) {
					this.anInt1149 = arg1.method3037();
				} else if (arg0 == 22) {
					this.anInt1146 = arg1.method3037();
				} else if (arg0 == 249) {
					local54 = arg1.method3043();
					if (this.aClass174_3 == null) {
						local148 = Static117.method2662(local54);
						this.aClass174_3 = new Class174(local148);
					}
					for (local148 = 0; local148 < local54; local148++) {
						@Pc(256) boolean local256 = arg1.method3043() == 1;
						@Pc(260) int local260 = arg1.method3039();
						@Pc(269) Class1 local269;
						if (local256) {
							local269 = new Class1_Sub24(arg1.method3034());
						} else {
							local269 = new Class1_Sub33(arg1.method3037());
						}
						this.aClass174_3.method4420(local269, (long) local260);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!gw;I)V")
	public void method1195(@OriginalArg(0) Class1_Sub13 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method3043();
			if (local14 == 0) {
				return;
			}
			this.method1194(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method1196(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass174_3 == null) {
			return arg0;
		} else {
			@Pc(22) Class1_Sub24 local22 = (Class1_Sub24) this.aClass174_3.method4422((long) arg1);
			return local22 == null ? arg0 : local22.aString29;
		}
	}
}
