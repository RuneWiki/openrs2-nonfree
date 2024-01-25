import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class55 {

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "[I")
	public int[] anIntArray73;

	@OriginalMember(owner = "client!dr", name = "u", descriptor = "[[I")
	public int[][] anIntArrayArray5;

	@OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
	public int anInt1173 = 0;

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
	public int anInt1175 = 0;

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
	public int anInt1178 = -1;

	@OriginalMember(owner = "client!dr", name = "l", descriptor = "I")
	public int anInt1180 = 0;

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
	public int anInt1174 = -1;

	@OriginalMember(owner = "client!dr", name = "t", descriptor = "I")
	public int anInt1188 = 0;

	@OriginalMember(owner = "client!dr", name = "w", descriptor = "I")
	public int anInt1190 = -1;

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
	public int anInt1172 = 0;

	@OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
	public int anInt1176 = -1;

	@OriginalMember(owner = "client!dr", name = "z", descriptor = "Z")
	public boolean aBoolean69 = true;

	@OriginalMember(owner = "client!dr", name = "B", descriptor = "I")
	public int anInt1193 = 0;

	@OriginalMember(owner = "client!dr", name = "p", descriptor = "I")
	public int anInt1184 = -1;

	@OriginalMember(owner = "client!dr", name = "C", descriptor = "I")
	public int anInt1194 = -1;

	@OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
	public int anInt1177 = -1;

	@OriginalMember(owner = "client!dr", name = "n", descriptor = "I")
	public int anInt1182 = -1;

	@OriginalMember(owner = "client!dr", name = "J", descriptor = "I")
	public int anInt1200 = -1;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
	public int anInt1171 = -1;

	@OriginalMember(owner = "client!dr", name = "v", descriptor = "I")
	public int anInt1189 = -1;

	@OriginalMember(owner = "client!dr", name = "F", descriptor = "I")
	public int anInt1197 = -1;

	@OriginalMember(owner = "client!dr", name = "q", descriptor = "I")
	public int anInt1185 = -1;

	@OriginalMember(owner = "client!dr", name = "O", descriptor = "I")
	private int anInt1205 = 0;

	@OriginalMember(owner = "client!dr", name = "D", descriptor = "I")
	public int anInt1195 = -1;

	@OriginalMember(owner = "client!dr", name = "m", descriptor = "I")
	public int anInt1181 = -1;

	@OriginalMember(owner = "client!dr", name = "K", descriptor = "I")
	public int anInt1201 = -1;

	@OriginalMember(owner = "client!dr", name = "k", descriptor = "[I")
	public int[] anIntArray74 = null;

	@OriginalMember(owner = "client!dr", name = "L", descriptor = "I")
	public int anInt1202 = -1;

	@OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
	public int anInt1183 = 0;

	@OriginalMember(owner = "client!dr", name = "V", descriptor = "I")
	public int anInt1211 = -1;

	@OriginalMember(owner = "client!dr", name = "S", descriptor = "I")
	public int anInt1209 = 0;

	@OriginalMember(owner = "client!dr", name = "X", descriptor = "I")
	public int anInt1213 = -1;

	@OriginalMember(owner = "client!dr", name = "R", descriptor = "I")
	public int anInt1208 = -1;

	@OriginalMember(owner = "client!dr", name = "Y", descriptor = "I")
	public int anInt1214 = 0;

	@OriginalMember(owner = "client!dr", name = "P", descriptor = "I")
	public int anInt1206 = 0;

	@OriginalMember(owner = "client!dr", name = "H", descriptor = "[I")
	public int[] anIntArray75 = null;

	@OriginalMember(owner = "client!dr", name = "ab", descriptor = "I")
	public int anInt1216 = -1;

	@OriginalMember(owner = "client!dr", name = "U", descriptor = "I")
	public int anInt1210 = -1;

	@OriginalMember(owner = "client!dr", name = "W", descriptor = "I")
	public int anInt1212 = -1;

	@OriginalMember(owner = "client!dr", name = "Q", descriptor = "I")
	public int anInt1207 = -1;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)I")
	public int method935() {
		if (this.anInt1202 != -1) {
			return this.anInt1202;
		} else if (this.anIntArray74 == null) {
			return -1;
		} else {
			@Pc(28) int local28 = (int) (Math.random() * (double) this.anInt1205);
			@Pc(30) int local30;
			for (local30 = 0; local28 >= this.anIntArray75[local30]; local30++) {
				local28 -= this.anIntArray75[local30];
			}
			return this.anIntArray74[local30];
		}
	}

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "(I)V")
	public void method938() {
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILclient!kh;I)V")
	private void method939(@OriginalArg(0) int arg0, @OriginalArg(1) Class11_Sub25 arg1) {
		if (arg0 == 1) {
			this.anInt1202 = arg1.method5187();
			this.anInt1212 = arg1.method5187();
			if (this.anInt1212 == 65535) {
				this.anInt1212 = -1;
			}
			if (this.anInt1202 == 65535) {
				this.anInt1202 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt1211 = arg1.method5187();
		} else if (arg0 == 3) {
			this.anInt1177 = arg1.method5187();
		} else if (arg0 == 4) {
			this.anInt1190 = arg1.method5187();
		} else if (arg0 == 5) {
			this.anInt1216 = arg1.method5187();
		} else if (arg0 == 6) {
			this.anInt1208 = arg1.method5187();
		} else if (arg0 == 7) {
			this.anInt1194 = arg1.method5187();
		} else if (arg0 == 8) {
			this.anInt1195 = arg1.method5187();
		} else if (arg0 == 9) {
			this.anInt1182 = arg1.method5187();
		} else if (arg0 == 26) {
			this.anInt1183 = (short) (arg1.method5185() * 4);
			this.anInt1206 = (short) (arg1.method5185() * 4);
		} else {
			@Pc(266) int local266;
			@Pc(276) int local276;
			if (arg0 == 27) {
				if (this.anIntArrayArray5 == null) {
					this.anIntArrayArray5 = new int[12][];
				}
				local266 = arg1.method5185();
				this.anIntArrayArray5[local266] = new int[6];
				for (local276 = 0; local276 < 6; local276++) {
					this.anIntArrayArray5[local266][local276] = arg1.method5220();
				}
			} else if (arg0 == 28) {
				this.anIntArray73 = new int[12];
				for (local266 = 0; local266 < 12; local266++) {
					this.anIntArray73[local266] = arg1.method5185();
					if (this.anIntArray73[local266] == 255) {
						this.anIntArray73[local266] = -1;
					}
				}
			} else if (arg0 == 29) {
				this.anInt1173 = arg1.method5185();
			} else if (arg0 == 30) {
				this.anInt1180 = arg1.method5187();
			} else if (arg0 == 31) {
				this.anInt1193 = arg1.method5185();
			} else if (arg0 == 32) {
				this.anInt1214 = arg1.method5187();
			} else if (arg0 == 33) {
				this.anInt1209 = arg1.method5220();
			} else if (arg0 == 34) {
				this.anInt1172 = arg1.method5185();
			} else if (arg0 == 35) {
				this.anInt1188 = arg1.method5187();
			} else if (arg0 == 36) {
				this.anInt1175 = arg1.method5220();
			} else if (arg0 == 37) {
				this.anInt1185 = arg1.method5185();
			} else if (arg0 == 38) {
				this.anInt1213 = arg1.method5187();
			} else if (arg0 == 39) {
				this.anInt1197 = arg1.method5187();
			} else if (arg0 == 40) {
				this.anInt1210 = arg1.method5187();
			} else if (arg0 == 41) {
				this.anInt1176 = arg1.method5187();
			} else if (arg0 == 42) {
				this.anInt1201 = arg1.method5187();
			} else if (arg0 == 43) {
				arg1.method5187();
			} else if (arg0 == 44) {
				this.anInt1181 = arg1.method5187();
			} else if (arg0 == 45) {
				this.anInt1207 = arg1.method5187();
			} else if (arg0 == 46) {
				this.anInt1200 = arg1.method5187();
			} else if (arg0 == 47) {
				this.anInt1189 = arg1.method5187();
			} else if (arg0 == 48) {
				this.anInt1178 = arg1.method5187();
			} else if (arg0 == 49) {
				this.anInt1184 = arg1.method5187();
			} else if (arg0 == 50) {
				this.anInt1174 = arg1.method5187();
			} else if (arg0 == 51) {
				this.anInt1171 = arg1.method5187();
			} else if (arg0 == 52) {
				local266 = arg1.method5185();
				this.anIntArray74 = new int[local266];
				this.anIntArray75 = new int[local266];
				for (local276 = 0; local276 < local266; local276++) {
					this.anIntArray74[local276] = arg1.method5187();
					@Pc(289) int local289 = arg1.method5185();
					this.anIntArray75[local276] = local289;
					this.anInt1205 += local289;
				}
			} else if (arg0 == 53) {
				this.aBoolean69 = false;
			}
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!kh;I)V")
	public void method943(@OriginalArg(0) Class11_Sub25 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5185();
			if (local11 == 0) {
				return;
			}
			this.method939(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(IB)Z")
	public boolean method944(@OriginalArg(0) int arg0) {
		if (arg0 == -1) {
			return false;
		} else if (arg0 == this.anInt1202) {
			return true;
		} else {
			if (this.anIntArray74 != null) {
				for (@Pc(30) int local30 = 0; local30 < this.anIntArray74.length; local30++) {
					if (this.anIntArray74[local30] == arg0) {
						return true;
					}
				}
			}
			return false;
		}
	}
}
