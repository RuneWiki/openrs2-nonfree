import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cu")
public final class Class48 {

	@OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
	private int anInt1198;

	@OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
	public int anInt1199;

	@OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
	private int anInt1201;

	@OriginalMember(owner = "client!cu", name = "m", descriptor = "Ljava/lang/String;")
	public String aString7;

	@OriginalMember(owner = "client!cu", name = "t", descriptor = "I")
	private int anInt1207;

	@OriginalMember(owner = "client!cu", name = "u", descriptor = "[I")
	public int[] anIntArray86;

	@OriginalMember(owner = "client!cu", name = "y", descriptor = "Lclient!mn;")
	private Class163 aClass163_4;

	@OriginalMember(owner = "client!cu", name = "z", descriptor = "I")
	public int anInt1211;

	@OriginalMember(owner = "client!cu", name = "B", descriptor = "Ljava/lang/String;")
	public String aString8;

	@OriginalMember(owner = "client!cu", name = "C", descriptor = "Lclient!rk;")
	public Class215 aClass215_1;

	@OriginalMember(owner = "client!cu", name = "E", descriptor = "I")
	public int anInt1214;

	@OriginalMember(owner = "client!cu", name = "L", descriptor = "I")
	public int anInt1221;

	@OriginalMember(owner = "client!cu", name = "N", descriptor = "I")
	public int anInt1223;

	@OriginalMember(owner = "client!cu", name = "O", descriptor = "I")
	private int anInt1224;

	@OriginalMember(owner = "client!cu", name = "T", descriptor = "I")
	public int anInt1228;

	@OriginalMember(owner = "client!cu", name = "k", descriptor = "I")
	public int anInt1202 = -1;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
	public int anInt1195 = -1;

	@OriginalMember(owner = "client!cu", name = "o", descriptor = "I")
	private int anInt1204 = -1;

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
	public int anInt1196 = -1;

	@OriginalMember(owner = "client!cu", name = "s", descriptor = "Z")
	public boolean aBoolean69 = true;

	@OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
	private int anInt1203 = -1;

	@OriginalMember(owner = "client!cu", name = "w", descriptor = "I")
	public int anInt1209 = 0;

	@OriginalMember(owner = "client!cu", name = "c", descriptor = "[Ljava/lang/String;")
	public final String[] aStringArray5 = new String[5];

	@OriginalMember(owner = "client!cu", name = "i", descriptor = "Z")
	public boolean aBoolean67 = false;

	@OriginalMember(owner = "client!cu", name = "I", descriptor = "I")
	public int anInt1218 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!cu", name = "n", descriptor = "Z")
	public boolean aBoolean68 = true;

	@OriginalMember(owner = "client!cu", name = "J", descriptor = "I")
	private int anInt1219 = -1;

	@OriginalMember(owner = "client!cu", name = "H", descriptor = "I")
	public int anInt1217 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!cu", name = "P", descriptor = "I")
	private int anInt1225 = -1;

	@OriginalMember(owner = "client!cu", name = "S", descriptor = "Z")
	public boolean aBoolean70 = true;

	@OriginalMember(owner = "client!cu", name = "R", descriptor = "I")
	public int anInt1227 = -1;

	@OriginalMember(owner = "client!cu", name = "M", descriptor = "I")
	public int anInt1222 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!cu", name = "G", descriptor = "I")
	public int anInt1216 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!cu", name = "Q", descriptor = "I")
	private int anInt1226 = -1;

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!ya;ZZ)Lclient!l;")
	public Class17 method923(@OriginalArg(0) Class49 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(11) int local11 = arg1 ? this.anInt1202 : this.anInt1227;
		@Pc(18) int local18 = arg0.anInt5543 << 29 | local11;
		@Pc(31) Class17 local31 = (Class17) this.aClass215_1.aClass171_50.method3941((long) local18);
		if (local31 != null) {
			return local31;
		} else if (this.aClass215_1.aClass160_66.method3716(local11)) {
			@Pc(56) Class85 local56 = Static459.method2069(this.aClass215_1.aClass160_66, local11, 0);
			if (local56 != null) {
				local31 = arg0.method4435(local56);
				this.aClass215_1.aClass171_50.method3940((long) local18, local31);
			}
			return local31;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLclient!si;)V")
	public void method925(@OriginalArg(1) Class2_Sub23 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method5495();
			if (local15 == 0) {
				return;
			}
			this.method928(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(III)I")
	public int method926(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass163_4 == null) {
			return arg0;
		} else {
			@Pc(25) Class2_Sub26 local25 = (Class2_Sub26) this.aClass163_4.method3769((long) arg1);
			return local25 == null ? arg0 : local25.anInt4485;
		}
	}

	@OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)V")
	public void method927() {
		if (this.anIntArray86 == null) {
			return;
		}
		for (@Pc(16) int local16 = 0; local16 < this.anIntArray86.length; local16 += 2) {
			if (this.anInt1218 > this.anIntArray86[local16]) {
				this.anInt1218 = this.anIntArray86[local16];
			} else if (this.anInt1222 < this.anIntArray86[local16]) {
				this.anInt1222 = this.anIntArray86[local16];
			}
			if (this.anInt1216 > this.anIntArray86[local16 + 1]) {
				this.anInt1216 = this.anIntArray86[local16 + 1];
			} else if (this.anIntArray86[local16 + 1] > this.anInt1217) {
				this.anInt1217 = this.anIntArray86[local16 + 1];
			}
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!si;II)V")
	private void method928(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1227 = arg0.method5500();
		} else if (arg1 == 2) {
			this.anInt1202 = arg0.method5500();
		} else if (arg1 == 3) {
			this.aString7 = arg0.method5494();
		} else if (arg1 == 4) {
			this.anInt1214 = arg0.method5485();
		} else if (arg1 == 5) {
			this.anInt1196 = arg0.method5485();
		} else if (arg1 == 6) {
			this.anInt1209 = arg0.method5495();
		} else {
			@Pc(88) int local88;
			if (arg1 == 7) {
				local88 = arg0.method5495();
				if ((local88 & 0x2) == 2) {
					this.aBoolean67 = true;
				}
				if ((local88 & 0x1) == 0) {
					this.aBoolean70 = false;
				}
			} else if (arg1 == 8) {
				this.aBoolean69 = arg0.method5495() == 1;
			} else if (arg1 == 9) {
				this.anInt1219 = arg0.method5500();
				if (this.anInt1219 == 65535) {
					this.anInt1219 = -1;
				}
				this.anInt1204 = arg0.method5500();
				if (this.anInt1204 == 65535) {
					this.anInt1204 = -1;
				}
				this.anInt1198 = arg0.method5508();
				this.anInt1207 = arg0.method5508();
			} else if (arg1 >= 10 && arg1 <= 14) {
				this.aStringArray5[arg1 - 10] = arg0.method5494();
			} else {
				@Pc(96) int local96;
				if (arg1 == 15) {
					local88 = arg0.method5495();
					this.anIntArray86 = new int[local88 * 2];
					for (local96 = 0; local96 < local88 * 2; local96++) {
						this.anIntArray86[local96] = arg0.method5458();
					}
					this.anInt1223 = arg0.method5508();
					this.anInt1199 = arg0.method5508();
				} else if (arg1 == 16) {
					this.aBoolean68 = false;
				} else if (arg1 == 17) {
					this.aString8 = arg0.method5494();
				} else if (arg1 == 18) {
					this.anInt1203 = arg0.method5500();
				} else if (arg1 == 19) {
					this.anInt1195 = arg0.method5500();
				} else if (arg1 == 20) {
					this.anInt1225 = arg0.method5500();
					if (this.anInt1225 == 65535) {
						this.anInt1225 = -1;
					}
					this.anInt1226 = arg0.method5500();
					if (this.anInt1226 == 65535) {
						this.anInt1226 = -1;
					}
					this.anInt1224 = arg0.method5508();
					this.anInt1201 = arg0.method5508();
				} else if (arg1 == 21) {
					this.anInt1211 = arg0.method5508();
				} else if (arg1 == 22) {
					this.anInt1228 = arg0.method5508();
				} else if (arg1 == 249) {
					local88 = arg0.method5495();
					if (this.aClass163_4 == null) {
						local96 = Static51.method863(local88);
						this.aClass163_4 = new Class163(local96);
					}
					for (local96 = 0; local96 < local88; local96++) {
						@Pc(249) boolean local249 = arg0.method5495() == 1;
						@Pc(253) int local253 = arg0.method5485();
						@Pc(262) Class2 local262;
						if (local249) {
							local262 = new Class2_Sub4(arg0.method5494());
						} else {
							local262 = new Class2_Sub26(arg0.method5508());
						}
						this.aClass163_4.method3764((long) local253, local262);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lclient!ya;B)Lclient!l;")
	public Class17 method929(@OriginalArg(0) Class49 arg0) {
		@Pc(20) Class17 local20 = (Class17) this.aClass215_1.aClass171_50.method3941((long) (arg0.anInt5543 << 29 | this.anInt1203 | 0x20000));
		if (local20 != null) {
			return local20;
		}
		this.aClass215_1.aClass160_66.method3716(this.anInt1203);
		@Pc(46) Class85 local46 = Static459.method2069(this.aClass215_1.aClass160_66, this.anInt1203, 0);
		if (local46 != null) {
			local20 = arg0.method4435(local46);
			this.aClass215_1.aClass171_50.method3940((long) (this.anInt1203 | 0x20000 | arg0.anInt5543 << 29), local20);
		}
		return local20;
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILjava/lang/String;B)Ljava/lang/String;")
	public String method930(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass163_4 == null) {
			return arg1;
		} else {
			@Pc(24) Class2_Sub4 local24 = (Class2_Sub4) this.aClass163_4.method3769((long) arg0);
			return local24 == null ? arg1 : local24.aString2;
		}
	}

	@OriginalMember(owner = "client!cu", name = "a", descriptor = "(BLclient!vk;)Z")
	public boolean method932(@OriginalArg(1) Interface12 arg0) {
		@Pc(15) int local15;
		if (this.anInt1204 == -1) {
			if (this.anInt1219 == -1) {
				return true;
			}
			local15 = arg0.method2423(this.anInt1219);
		} else {
			local15 = arg0.method2422(this.anInt1204);
		}
		if (local15 < this.anInt1198 || this.anInt1207 < local15) {
			return false;
		}
		@Pc(62) int local62;
		if (this.anInt1226 == -1) {
			if (this.anInt1225 == -1) {
				return true;
			}
			local62 = arg0.method2423(this.anInt1225);
		} else {
			local62 = arg0.method2422(this.anInt1226);
		}
		return this.anInt1224 <= local62 && this.anInt1201 >= local62;
	}
}
