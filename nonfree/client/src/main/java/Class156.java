import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oh")
public final class Class156 {

	@OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
	private int anInt4533;

	@OriginalMember(owner = "client!oh", name = "g", descriptor = "Lclient!dj;")
	public Class32_Sub2 aClass32_Sub2_2;

	@OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
	private int anInt4536;

	@OriginalMember(owner = "client!oh", name = "k", descriptor = "Lclient!tp;")
	private Class199 aClass199_2;

	@OriginalMember(owner = "client!oh", name = "u", descriptor = "[Z")
	private boolean[] aBooleanArray25;

	@OriginalMember(owner = "client!oh", name = "y", descriptor = "Lclient!qh;")
	private Class1_Sub4_Sub4 aClass1_Sub4_Sub4_3;

	@OriginalMember(owner = "client!oh", name = "A", descriptor = "I")
	private int anInt4548;

	@OriginalMember(owner = "client!oh", name = "C", descriptor = "Lclient!bi;")
	private Class3 aClass3_4;

	@OriginalMember(owner = "client!oh", name = "D", descriptor = "I")
	private int anInt4550;

	@OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
	private int anInt4534 = -1;

	@OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
	private int anInt4540 = -1;

	@OriginalMember(owner = "client!oh", name = "q", descriptor = "I")
	private int anInt4541 = -32768;

	@OriginalMember(owner = "client!oh", name = "j", descriptor = "Z")
	private boolean aBoolean341 = false;

	@OriginalMember(owner = "client!oh", name = "G", descriptor = "Z")
	private boolean aBoolean343 = false;

	@OriginalMember(owner = "client!oh", name = "F", descriptor = "I")
	public final int anInt4552;

	@OriginalMember(owner = "client!oh", name = "I", descriptor = "I")
	public final int anInt4554;

	@OriginalMember(owner = "client!oh", name = "J", descriptor = "B")
	private final byte aByte42;

	@OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
	public final int anInt4545;

	@OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
	private int anInt4544;

	@OriginalMember(owner = "client!oh", name = "K", descriptor = "B")
	private final byte aByte43;

	@OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
	private int anInt4535;

	@OriginalMember(owner = "client!oh", name = "m", descriptor = "Z")
	private final boolean aBoolean342;

	@OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(Lclient!fp;Lclient!gn;IIIIIIZI)V")
	public Class156(@OriginalArg(0) Class63 arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		this.anInt4552 = arg2;
		this.anInt4554 = arg3;
		this.aByte42 = (byte) arg4;
		this.anInt4545 = arg1.anInt2365;
		this.anInt4544 = arg6;
		this.aByte43 = (byte) arg5;
		this.aBoolean341 = arg8;
		this.anInt4535 = arg7;
		this.aBoolean342 = arg0.method4583() && arg1.aBoolean165 && !this.aBoolean341;
		if (arg9 != -1) {
			this.aBoolean343 = true;
		}
		this.method4186(arg9);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZIZILclient!fp;IZ)Lclient!bi;")
	public Class3 method4181(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class63 arg4, @OriginalArg(5) int arg5) {
		@Pc(10) Class71 local10 = Static219.method4081(this.anInt4545);
		if (local10.anIntArray178 != null) {
			local10 = local10.method2282();
		}
		if (local10 == null) {
			this.method4189(arg4);
			this.anInt4534 = -1;
			this.anInt4540 = this.anInt4550;
			return null;
		}
		if (!this.aBoolean343 && this.anInt4534 != local10.anInt2365) {
			this.aClass3_4 = null;
			this.method4186(-1);
		}
		this.method4188(arg3, arg1);
		@Pc(67) boolean local67 = arg2 & Static218.anInt4352 != 0 & this.aBoolean342;
		@Pc(112) boolean local112 = local67 & (local10.anInt2365 != this.anInt4534 || (this.anInt4540 != this.anInt4550 || this.aClass199_2 != null && (this.aClass199_2.aBoolean447 || Static21.aBoolean29) && this.anInt4550 != this.anInt4548) && Static218.anInt4352 >= 2);
		if (arg0 && !local112) {
			this.anInt4534 = local10.anInt2365;
			this.anInt4540 = this.anInt4550;
			return null;
		}
		if (local112) {
			Static38.method932(this.aClass1_Sub4_Sub4_3, this.aByte43, this.anInt4544, this.anInt4535, this.aBooleanArray25);
		}
		@Pc(150) Class36 local150 = Static258.aClass36Array2[this.aByte43];
		@Pc(166) Class36 local166;
		if (this.aBoolean341) {
			local166 = Static50.aClass36Array3[0];
		} else {
			local166 = this.aByte43 >= 3 ? null : Static258.aClass36Array2[this.aByte43 + 1];
		}
		@Pc(174) Class3 local174 = null;
		if (this.aClass199_2 != null) {
			if (local112) {
				arg5 |= 0x20000;
			}
			local174 = local10.method2279(arg4, this.anInt4552 == 11 ? 10 : this.anInt4552, arg5, local166, this.aClass199_2, this.anInt4535, this.anInt4552 == 11 ? this.anInt4554 + 4 : this.anInt4554, local150.method4433(this.anInt4544, this.anInt4535), this.anInt4544, this.anInt4548, this.anInt4550, this.anInt4536, local150);
			if (local174 == null) {
				this.aBooleanArray25 = null;
				this.aClass1_Sub4_Sub4_3 = null;
				this.anInt4541 = 0;
			} else {
				if (local112) {
					if (this.aBooleanArray25 == null) {
						this.aBooleanArray25 = new boolean[4];
					}
					this.aClass1_Sub4_Sub4_3 = local174.method1277(this.aClass1_Sub4_Sub4_3);
					Static150.method4953(this.aClass1_Sub4_Sub4_3, this.aByte43, arg1, arg3, this.aBooleanArray25);
				}
				this.anInt4541 = local174.method1245();
			}
			this.aClass3_4 = null;
		} else if (this.aClass3_4 != null && (this.aClass3_4.method1256() & arg5) == arg5 && this.anInt4534 == local10.anInt2365) {
			local174 = this.aClass3_4;
		} else {
			if (this.aClass3_4 != null) {
				arg5 |= this.aClass3_4.method1256();
			}
			@Pc(252) Class221 local252 = local10.method2280(local166, this.anInt4535, this.anInt4544, this.anInt4552 == 11 ? 10 : this.anInt4552, local112, local150.method4433(this.anInt4544, this.anInt4535), arg4, arg5, local150, this.anInt4552 == 11 ? this.anInt4554 + 4 : this.anInt4554);
			if (local252 == null) {
				this.anInt4541 = 0;
				this.aClass3_4 = null;
				this.aClass1_Sub4_Sub4_3 = null;
				this.aBooleanArray25 = null;
			} else {
				local174 = local252.aClass3_7;
				this.aClass3_4 = local252.aClass3_7;
				if (local112) {
					this.aClass1_Sub4_Sub4_3 = local252.aClass1_Sub4_Sub4_6;
					this.aBooleanArray25 = null;
					Static150.method4953(this.aClass1_Sub4_Sub4_3, this.aByte43, arg1, arg3, null);
				}
				this.anInt4541 = local174.method1245();
			}
		}
		this.anInt4534 = local10.anInt2365;
		this.anInt4544 = arg1;
		this.anInt4535 = arg3;
		this.anInt4540 = this.anInt4550;
		return local174;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(IBIIZLclient!fp;Lclient!bi;I)V")
	public void method4183(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class63 arg4, @OriginalArg(6) Class3 arg5, @OriginalArg(7) int arg6) {
		@Pc(6) Class6[] local6 = arg5.method1240();
		@Pc(9) Class107[] local9 = arg5.method1246();
		if ((this.aClass32_Sub2_2 == null || this.aClass32_Sub2_2.aBoolean105) && (local6 != null || local9 != null)) {
			@Pc(25) Class71 local25 = Static219.method4081(this.anInt4545);
			if (local25.anIntArray178 != null) {
				local25 = local25.method2282();
			}
			if (local25 != null) {
				this.aClass32_Sub2_2 = new Class32_Sub2(Static51.anInt1301);
			}
		}
		if (this.aClass32_Sub2_2 == null) {
			return;
		}
		if (arg3) {
			this.aClass32_Sub2_2.method1399(arg4, (long) Static51.anInt1301, local6, local9);
		} else {
			this.aClass32_Sub2_2.method1396((long) Static51.anInt1301);
		}
		this.aClass32_Sub2_2.method1400(this.aByte42, arg6, arg2, arg0, arg1);
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(II)V")
	private void method4186(@OriginalArg(1) int arg0) {
		@Pc(7) int local7 = arg0;
		@Pc(9) boolean local9 = false;
		if (arg0 == -1) {
			@Pc(17) Class71 local17 = Static219.method4081(this.anInt4545);
			@Pc(19) Class71 local19 = local17;
			if (local17.anIntArray178 != null) {
				local17 = local17.method2282();
			}
			if (local17 == null) {
				return;
			}
			if (local17 == local19) {
				local19 = null;
			}
			if (local17.anIntArray175 != null) {
				if (this.aClass199_2 != null && local17.method2273(this.aClass199_2.anInt6026)) {
					return;
				}
				local7 = local17.method2284();
				if (local17.anInt2365 != this.anInt4534) {
					local9 = local17.aBoolean169;
				}
			} else if (local17.anInt2384 == -1) {
				if (local19 != null && local19.anIntArray175 != null) {
					if (this.aClass199_2 != null && local19.method2273(this.aClass199_2.anInt6026)) {
						return;
					}
					local7 = local19.method2284();
					if (local19.anInt2365 != this.anInt4534) {
						local9 = local19.aBoolean169;
					}
				} else if (local19 != null && local19.anInt2384 != -1 && this.anInt4534 != local19.anInt2365) {
					local9 = local19.aBoolean169;
					local7 = local19.anInt2384;
				}
			} else if (local17.anInt2365 != this.anInt4534) {
				local7 = local17.anInt2384;
				local9 = local17.aBoolean169;
			}
		}
		if (local7 == -1) {
			this.aClass199_2 = null;
			return;
		}
		this.aClass3_4 = null;
		if (this.aClass199_2 == null || this.aClass199_2.anInt6026 != local7) {
			this.aClass199_2 = Static161.method3066(local7);
		} else if (this.aClass199_2.anInt6015 == 0) {
			return;
		}
		if (this.aClass199_2.anIntArray467 == null) {
			this.aClass199_2 = null;
			return;
		}
		if (local9) {
			this.anInt4550 = (int) ((double) this.aClass199_2.anIntArray467.length * Math.random());
			this.anInt4536 = (int) ((double) this.aClass199_2.anIntArray466[this.anInt4550] * Math.random()) + 1;
		} else {
			this.anInt4536 = 1;
			this.anInt4550 = 0;
		}
		this.anInt4548 = this.anInt4550 + 1;
		if (this.anInt4548 < 0 || this.aClass199_2.anIntArray467.length <= this.anInt4548) {
			this.anInt4548 = -1;
		}
		this.anInt4533 = Static51.anInt1301 - this.anInt4536;
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lclient!fp;I)V")
	public void method4187(@OriginalArg(0) Class63 arg0) {
		this.method4181(true, this.anInt4544, true, this.anInt4535, arg0, 131072);
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(III)V")
	private void method4188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		label80: while (true) {
			if (this.aClass199_2 == null) {
				if (this.aBoolean343) {
					return;
				}
				this.method4186(-1);
				if (this.aClass199_2 == null) {
					return;
				}
			}
			@Pc(29) int local29 = Static51.anInt1301 - this.anInt4533;
			if (local29 > 100 && this.aClass199_2.anInt6009 > 0) {
				@Pc(46) int local46 = this.aClass199_2.anIntArray467.length - this.aClass199_2.anInt6009;
				while (local46 > this.anInt4550 && this.aClass199_2.anIntArray466[this.anInt4550] < local29) {
					local29 -= this.aClass199_2.anIntArray466[this.anInt4550];
					this.anInt4550++;
				}
				if (local46 <= this.anInt4550) {
					@Pc(85) int local85 = 0;
					for (@Pc(87) int local87 = local46; local87 < this.aClass199_2.anIntArray467.length; local87++) {
						local85 += this.aClass199_2.anIntArray466[local87];
					}
					local29 %= local85;
				}
				this.anInt4548 = this.anInt4550 + 1;
				if (this.aClass199_2.anIntArray467.length <= this.anInt4548) {
					this.anInt4548 -= this.aClass199_2.anInt6009;
					if (this.anInt4548 < 0 || this.aClass199_2.anIntArray467.length <= this.anInt4548) {
						this.anInt4548 = -1;
					}
				}
			}
			while (this.aClass199_2.anIntArray466[this.anInt4550] < local29) {
				Static96.method2060(this.aClass199_2, false, this.aByte42, this.anInt4550, arg1, arg0);
				local29 -= this.aClass199_2.anIntArray466[this.anInt4550];
				this.anInt4550++;
				if (this.aClass199_2.anIntArray467.length <= this.anInt4550) {
					this.anInt4550 -= this.aClass199_2.anInt6009;
					if (this.anInt4550 < 0 || this.aClass199_2.anIntArray467.length <= this.anInt4550) {
						this.aClass199_2 = null;
						continue label80;
					}
				}
				this.anInt4548 = this.anInt4550 + 1;
				if (this.aClass199_2.anIntArray467.length <= this.anInt4548) {
					this.anInt4548 -= this.aClass199_2.anInt6009;
					if (this.anInt4548 < 0 || this.anInt4548 >= this.aClass199_2.anIntArray467.length) {
						this.anInt4548 = -1;
					}
				}
			}
			this.anInt4533 = Static51.anInt1301 - local29;
			this.anInt4536 = local29;
			return;
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILclient!fp;)V")
	public void method4189(@OriginalArg(1) Class63 arg0) {
		if (this.aClass1_Sub4_Sub4_3 != null) {
			Static38.method932(this.aClass1_Sub4_Sub4_3, this.aByte43, this.anInt4544, this.anInt4535, this.aBooleanArray25);
			this.aBooleanArray25 = null;
			this.aClass1_Sub4_Sub4_3 = null;
		}
	}

	@OriginalMember(owner = "client!oh", name = "c", descriptor = "(II)V")
	public void method4190(@OriginalArg(1) int arg0) {
		this.aBoolean343 = true;
		this.method4186(arg0);
	}

	@OriginalMember(owner = "client!oh", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() {
		if (this.aClass32_Sub2_2 != null) {
			this.aClass32_Sub2_2.method1404();
		}
	}

	@OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)I")
	public int method4191() {
		return this.anInt4541;
	}

	@OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)Z")
	public boolean method4192() {
		return this.aBoolean342;
	}
}
