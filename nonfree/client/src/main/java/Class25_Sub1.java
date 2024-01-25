import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class25_Sub1 extends Class25 {

	@OriginalMember(owner = "client!bk", name = "q", descriptor = "Lclient!fv;")
	private Class84 aClass84_1;

	@OriginalMember(owner = "client!bk", name = "s", descriptor = "[B")
	private byte[] aByteArray15;

	@OriginalMember(owner = "client!bk", name = "O", descriptor = "Z")
	private boolean aBoolean87;

	@OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
	private int anInt957 = 0;

	@OriginalMember(owner = "client!bk", name = "A", descriptor = "Lclient!an;")
	private final Class11 aClass11_3 = new Class11(16);

	@OriginalMember(owner = "client!bk", name = "M", descriptor = "I")
	private int anInt970 = 0;

	@OriginalMember(owner = "client!bk", name = "N", descriptor = "Lclient!ug;")
	private final Class243 aClass243_6 = new Class243();

	@OriginalMember(owner = "client!bk", name = "Q", descriptor = "J")
	private long aLong27 = 0L;

	@OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
	private final int anInt954;

	@OriginalMember(owner = "client!bk", name = "I", descriptor = "Lclient!sk;")
	private final Class228 aClass228_3;

	@OriginalMember(owner = "client!bk", name = "L", descriptor = "Z")
	private boolean aBoolean86;

	@OriginalMember(owner = "client!bk", name = "K", descriptor = "Lclient!ug;")
	private Class243 aClass243_5;

	@OriginalMember(owner = "client!bk", name = "y", descriptor = "Lclient!sk;")
	private final Class228 aClass228_2;

	@OriginalMember(owner = "client!bk", name = "k", descriptor = "Lclient!vf;")
	private final Class257 aClass257_1;

	@OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
	private final int anInt961;

	@OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
	private final int anInt965;

	@OriginalMember(owner = "client!bk", name = "v", descriptor = "Lclient!d;")
	private final Class46 aClass46_1;

	@OriginalMember(owner = "client!bk", name = "R", descriptor = "Z")
	private final boolean aBoolean88;

	@OriginalMember(owner = "client!bk", name = "w", descriptor = "Lclient!nn;")
	private Class3_Sub4_Sub1 aClass3_Sub4_Sub1_1;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(ILclient!sk;Lclient!sk;Lclient!vf;Lclient!d;IIZ)V")
	public Class25_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class228 arg1, @OriginalArg(2) Class228 arg2, @OriginalArg(3) Class257 arg3, @OriginalArg(4) Class46 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt954 = arg0;
		this.aClass228_3 = arg1;
		if (this.aClass228_3 == null) {
			this.aBoolean86 = false;
		} else {
			this.aBoolean86 = true;
			this.aClass243_5 = new Class243();
		}
		this.aClass228_2 = arg2;
		this.aClass257_1 = arg3;
		this.anInt961 = arg5;
		this.anInt965 = arg6;
		this.aClass46_1 = arg4;
		this.aBoolean88 = arg7;
		if (this.aClass228_2 != null) {
			this.aClass3_Sub4_Sub1_1 = this.aClass46_1.method1235(this.aClass228_2, this.anInt954);
		}
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V")
	public void method668() {
		if (this.aClass243_5 == null || this.method662() == null) {
			return;
		}
		for (@Pc(27) Class3 local27 = this.aClass243_6.method5208(); local27 != null; local27 = this.aClass243_6.method5203()) {
			@Pc(33) int local33 = (int) local27.aLong234;
			if (local33 < 0 || this.aClass84_1.anInt2621 <= local33 || this.aClass84_1.anIntArray154[local33] == 0) {
				local27.method5977();
			} else {
				if (this.aByteArray15[local33] == 0) {
					this.method669(1, local33);
				}
				if (this.aByteArray15[local33] == -1) {
					this.method669(2, local33);
				}
				if (this.aByteArray15[local33] == 1) {
					local27.method5977();
				}
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V")
	@Override
	public void method665(@OriginalArg(0) int arg0) {
		if (this.aClass228_3 == null) {
			return;
		}
		for (@Pc(14) Class3 local14 = this.aClass243_6.method5208(); local14 != null; local14 = this.aClass243_6.method5203()) {
			if (local14.aLong234 == (long) arg0) {
				return;
			}
		}
		@Pc(44) Class3 local44 = new Class3();
		local44.aLong234 = arg0;
		this.aClass243_6.method5198(local44);
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IBI)Lclient!nn;")
	private Class3_Sub4_Sub1 method669(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class3_Sub4_Sub1 local13 = (Class3_Sub4_Sub1) this.aClass11_3.method324((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean528 && local13.aBoolean527) {
			local13.method5977();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass228_3 == null || this.aByteArray15[arg1] == -1) {
					if (this.aClass257_1.method5397()) {
						return null;
					}
					local13 = this.aClass257_1.method5398(this.anInt954, (byte) 2, true, arg1);
				} else {
					local13 = this.aClass46_1.method1235(this.aClass228_3, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass228_3 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass46_1.method1230(arg1, this.aClass228_3);
			} else if (arg0 == 2) {
				if (this.aClass228_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray15[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass257_1.method5406()) {
					return null;
				}
				local13 = this.aClass257_1.method5398(this.anInt954, (byte) 2, false, arg1);
			} else {
				throw new RuntimeException();
			}
			this.aClass11_3.method319(local13, (long) arg1);
		}
		if (local13.aBoolean527) {
			return null;
		}
		@Pc(167) byte[] local167 = local13.method4715();
		@Pc(194) int local194;
		@Pc(297) Class3_Sub4_Sub1_Sub2 local297;
		if (!(local13 instanceof Class3_Sub4_Sub1_Sub1)) {
			try {
				if (local167 == null || local167.length <= 2) {
					throw new RuntimeException();
				}
				Static266.aCRC32_1.reset();
				Static266.aCRC32_1.update(local167, 0, local167.length - 2);
				local194 = (int) Static266.aCRC32_1.getValue();
				if (this.aClass84_1.anIntArray151[arg1] != local194) {
					throw new RuntimeException();
				}
				this.aClass257_1.anInt6910 = 0;
				this.aClass257_1.anInt6911 = 0;
			} catch (@Pc(355) RuntimeException local355) {
				this.aClass257_1.method5407();
				local13.method5977();
				if (local13.aBoolean528 && !this.aClass257_1.method5397()) {
					local297 = this.aClass257_1.method5398(this.anInt954, (byte) 2, true, arg1);
					this.aClass11_3.method319(local297, (long) arg1);
				}
				return null;
			}
			local167[local167.length - 2] = (byte) (this.aClass84_1.anIntArray149[arg1] >>> 8);
			local167[local167.length - 1] = (byte) this.aClass84_1.anIntArray149[arg1];
			if (this.aClass228_3 != null) {
				this.aClass46_1.method1231(this.aClass228_3, local167, arg1);
				if (this.aByteArray15[arg1] != 1) {
					this.anInt957++;
					this.aByteArray15[arg1] = 1;
				}
			}
			if (!local13.aBoolean528) {
				local13.method5977();
			}
			return local13;
		}
		try {
			if (local167 == null || local167.length <= 2) {
				throw new RuntimeException();
			}
			Static266.aCRC32_1.reset();
			Static266.aCRC32_1.update(local167, 0, local167.length - 2);
			local194 = (int) Static266.aCRC32_1.getValue();
			if (this.aClass84_1.anIntArray151[arg1] != local194) {
				throw new RuntimeException();
			}
			@Pc(226) int local226 = ((local167[local167.length - 2] & 0xFF) << 8) + (local167[local167.length - 1] & 0xFF);
			if (local226 != (this.aClass84_1.anIntArray149[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray15[arg1] != 1) {
				this.anInt957++;
				this.aByteArray15[arg1] = 1;
			}
			if (!local13.aBoolean528) {
				local13.method5977();
			}
			return local13;
		} catch (@Pc(271) Exception local271) {
			this.aByteArray15[arg1] = -1;
			local13.method5977();
			if (local13.aBoolean528 && !this.aClass257_1.method5397()) {
				local297 = this.aClass257_1.method5398(this.anInt954, (byte) 2, true, arg1);
				this.aClass11_3.method319(local297, (long) arg1);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V")
	public void method670() {
		if (this.aClass243_5 != null) {
			if (this.method662() == null) {
				return;
			}
			@Pc(22) boolean local22;
			@Pc(29) Class3 local29;
			@Pc(35) int local35;
			@Pc(125) Class3 local125;
			if (this.aBoolean86) {
				local22 = true;
				for (local29 = this.aClass243_5.method5208(); local29 != null; local29 = this.aClass243_5.method5203()) {
					local35 = (int) local29.aLong234;
					if (this.aByteArray15[local35] == 0) {
						this.method669(1, local35);
					}
					if (this.aByteArray15[local35] == 0) {
						local22 = false;
					} else {
						local29.method5977();
					}
				}
				while (this.anInt970 < this.aClass84_1.anIntArray154.length) {
					if (this.aClass84_1.anIntArray154[this.anInt970] == 0) {
						this.anInt970++;
					} else {
						if (this.aClass46_1.anInt1579 >= 250) {
							local22 = false;
							break;
						}
						if (this.aByteArray15[this.anInt970] == 0) {
							this.method669(1, this.anInt970);
						}
						if (this.aByteArray15[this.anInt970] == 0) {
							local125 = new Class3();
							local125.aLong234 = this.anInt970;
							this.aClass243_5.method5198(local125);
							local22 = false;
						}
						this.anInt970++;
					}
				}
				if (local22) {
					this.anInt970 = 0;
					this.aBoolean86 = false;
				}
			} else if (this.aBoolean87) {
				local22 = true;
				for (local29 = this.aClass243_5.method5208(); local29 != null; local29 = this.aClass243_5.method5203()) {
					local35 = (int) local29.aLong234;
					if (this.aByteArray15[local35] != 1) {
						this.method669(2, local35);
					}
					if (this.aByteArray15[local35] == 1) {
						local29.method5977();
					} else {
						local22 = false;
					}
				}
				while (this.anInt970 < this.aClass84_1.anIntArray154.length) {
					if (this.aClass84_1.anIntArray154[this.anInt970] == 0) {
						this.anInt970++;
					} else {
						if (this.aClass257_1.method5406()) {
							local22 = false;
							break;
						}
						if (this.aByteArray15[this.anInt970] != 1) {
							this.method669(2, this.anInt970);
						}
						if (this.aByteArray15[this.anInt970] != 1) {
							local125 = new Class3();
							local125.aLong234 = this.anInt970;
							local22 = false;
							this.aClass243_5.method5198(local125);
						}
						this.anInt970++;
					}
				}
				if (local22) {
					this.anInt970 = 0;
					this.aBoolean87 = false;
				}
			} else {
				this.aClass243_5 = null;
			}
		}
		if (!this.aBoolean88 || Static118.method1934() < this.aLong27) {
			return;
		}
		for (@Pc(324) Class3_Sub4_Sub1 local324 = (Class3_Sub4_Sub1) this.aClass11_3.method313(); local324 != null; local324 = (Class3_Sub4_Sub1) this.aClass11_3.method316()) {
			if (!local324.aBoolean527) {
				if (local324.aBoolean526) {
					if (!local324.aBoolean528) {
						throw new RuntimeException();
					}
					local324.method5977();
				} else {
					local324.aBoolean526 = true;
				}
			}
		}
		this.aLong27 = Static118.method1934() + 1000L;
	}

	@OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V")
	public void method671() {
		if (this.aClass228_3 != null) {
			this.aBoolean87 = true;
			if (this.aClass243_5 == null) {
				this.aClass243_5 = new Class243();
			}
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)[B")
	@Override
	public byte[] method663(@OriginalArg(0) int arg0) {
		@Pc(9) Class3_Sub4_Sub1 local9 = this.method669(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(25) byte[] local25 = local9.method4715();
			local9.method5977();
			return local25;
		}
	}

	@OriginalMember(owner = "client!bk", name = "e", descriptor = "(I)I")
	public int method672() {
		return this.anInt957;
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)Lclient!fv;")
	@Override
	public Class84 method662() {
		if (this.aClass84_1 != null) {
			return this.aClass84_1;
		}
		if (this.aClass3_Sub4_Sub1_1 == null) {
			if (this.aClass257_1.method5397()) {
				return null;
			}
			this.aClass3_Sub4_Sub1_1 = this.aClass257_1.method5398(255, (byte) 0, true, this.anInt954);
		}
		if (this.aClass3_Sub4_Sub1_1.aBoolean527) {
			return null;
		}
		@Pc(43) byte[] local43 = this.aClass3_Sub4_Sub1_1.method4715();
		if (this.aClass3_Sub4_Sub1_1 instanceof Class3_Sub4_Sub1_Sub1) {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass84_1 = new Class84(local43, this.anInt961);
				if (this.anInt965 != this.aClass84_1.anInt2623) {
					throw new RuntimeException();
				}
			} catch (@Pc(76) RuntimeException local76) {
				this.aClass84_1 = null;
				if (this.aClass257_1.method5397()) {
					this.aClass3_Sub4_Sub1_1 = null;
				} else {
					this.aClass3_Sub4_Sub1_1 = this.aClass257_1.method5398(255, (byte) 0, true, this.anInt954);
				}
				return null;
			}
		} else {
			try {
				if (local43 == null) {
					throw new RuntimeException();
				}
				this.aClass84_1 = new Class84(local43, this.anInt961);
			} catch (@Pc(118) RuntimeException local118) {
				this.aClass257_1.method5407();
				this.aClass84_1 = null;
				if (this.aClass257_1.method5397()) {
					this.aClass3_Sub4_Sub1_1 = null;
				} else {
					this.aClass3_Sub4_Sub1_1 = this.aClass257_1.method5398(255, (byte) 0, true, this.anInt954);
				}
				return null;
			}
			if (this.aClass228_2 != null) {
				this.aClass46_1.method1231(this.aClass228_2, local43, this.anInt954);
			}
		}
		this.aClass3_Sub4_Sub1_1 = null;
		if (this.aClass228_3 != null) {
			this.anInt957 = 0;
			this.aByteArray15 = new byte[this.aClass84_1.anInt2621];
		}
		return this.aClass84_1;
	}

	@OriginalMember(owner = "client!bk", name = "f", descriptor = "(I)I")
	public int method673() {
		return this.aClass84_1 == null ? 0 : this.aClass84_1.anInt2617;
	}

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "(Z)I")
	public int method674() {
		if (this.method662() == null) {
			return this.aClass3_Sub4_Sub1_1 == null ? 0 : this.aClass3_Sub4_Sub1_1.method4713();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)I")
	@Override
	public int method666(@OriginalArg(1) int arg0) {
		@Pc(17) Class3_Sub4_Sub1 local17 = (Class3_Sub4_Sub1) this.aClass11_3.method324((long) arg0);
		return local17 == null ? 0 : local17.method4713();
	}

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "(I)I")
	public int method676() {
		if (this.aClass84_1 == null) {
			return 0;
		} else if (this.aBoolean86) {
			@Pc(29) Class3 local29 = this.aClass243_5.method5208();
			return local29 == null ? 0 : (int) local29.aLong234;
		} else {
			return this.aClass84_1.anInt2617;
		}
	}
}
