import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ib")
public final class Class82_Sub1 extends Class82 {

	@OriginalMember(owner = "client!ib", name = "h", descriptor = "[B")
	private byte[] aByteArray30;

	@OriginalMember(owner = "client!ib", name = "k", descriptor = "Lclient!vv;")
	private Class268 aClass268_1;

	@OriginalMember(owner = "client!ib", name = "K", descriptor = "Z")
	private boolean aBoolean284;

	@OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
	private int anInt2827 = 0;

	@OriginalMember(owner = "client!ib", name = "u", descriptor = "Lclient!qi;")
	private final Class208 aClass208_17 = new Class208(16);

	@OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
	private int anInt2845 = 0;

	@OriginalMember(owner = "client!ib", name = "L", descriptor = "Lclient!am;")
	private final Class14 aClass14_11 = new Class14();

	@OriginalMember(owner = "client!ib", name = "N", descriptor = "J")
	private long aLong98 = 0L;

	@OriginalMember(owner = "client!ib", name = "j", descriptor = "Lclient!wk;")
	private final Class271 aClass271_3;

	@OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
	private final int anInt2838;

	@OriginalMember(owner = "client!ib", name = "G", descriptor = "Z")
	private boolean aBoolean283;

	@OriginalMember(owner = "client!ib", name = "J", descriptor = "Lclient!am;")
	private Class14 aClass14_10;

	@OriginalMember(owner = "client!ib", name = "E", descriptor = "Lclient!kv;")
	private final Class145 aClass145_2;

	@OriginalMember(owner = "client!ib", name = "q", descriptor = "Lclient!wk;")
	private final Class271 aClass271_4;

	@OriginalMember(owner = "client!ib", name = "M", descriptor = "Z")
	private final boolean aBoolean285;

	@OriginalMember(owner = "client!ib", name = "z", descriptor = "Lclient!wd;")
	private final Class269 aClass269_4;

	@OriginalMember(owner = "client!ib", name = "v", descriptor = "I")
	private final int anInt2839;

	@OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
	private final int anInt2830;

	@OriginalMember(owner = "client!ib", name = "y", descriptor = "Lclient!se;")
	private Class1_Sub3_Sub7 aClass1_Sub3_Sub7_1;

	static {
		new Class142(" joined the channel.", " hat den Chatraum betreten.", " a rejoint le canal.", " entrou no canal.");
	}

	@OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(ILclient!wk;Lclient!wk;Lclient!wd;Lclient!kv;IIZ)V")
	public Class82_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class271 arg1, @OriginalArg(2) Class271 arg2, @OriginalArg(3) Class269 arg3, @OriginalArg(4) Class145 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass271_3 = arg1;
		this.anInt2838 = arg0;
		if (this.aClass271_3 == null) {
			this.aBoolean283 = false;
		} else {
			this.aBoolean283 = true;
			this.aClass14_10 = new Class14();
		}
		this.aClass145_2 = arg4;
		this.aClass271_4 = arg2;
		this.aBoolean285 = arg7;
		this.aClass269_4 = arg3;
		this.anInt2839 = arg6;
		this.anInt2830 = arg5;
		if (this.aClass271_4 != null) {
			this.aClass1_Sub3_Sub7_1 = this.aClass145_2.method3213(this.aClass271_4, this.anInt2838);
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)V")
	@Override
	public void method2266(@OriginalArg(0) int arg0) {
		if (this.aClass271_3 == null) {
			return;
		}
		for (@Pc(20) Class1 local20 = this.aClass14_11.method203(); local20 != null; local20 = this.aClass14_11.method208()) {
			if ((long) arg0 == local20.aLong236) {
				return;
			}
		}
		@Pc(40) Class1 local40 = new Class1();
		local40.aLong236 = arg0;
		this.aClass14_11.method205(local40);
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
	public void method2268() {
		if (this.aClass271_3 != null) {
			this.aBoolean284 = true;
			if (this.aClass14_10 == null) {
				this.aClass14_10 = new Class14();
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)I")
	public int method2269() {
		if (this.aClass268_1 == null) {
			return 0;
		} else if (this.aBoolean283) {
			@Pc(27) Class1 local27 = this.aClass14_10.method203();
			return local27 == null ? 0 : (int) local27.aLong236;
		} else {
			return this.aClass268_1.anInt6961;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)[B")
	@Override
	public byte[] method2263(@OriginalArg(0) int arg0) {
		@Pc(9) Class1_Sub3_Sub7 local9 = this.method2279(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(22) byte[] local22 = local9.method5942();
			local9.method5953();
			return local22;
		}
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)I")
	public int method2272() {
		return this.anInt2827;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(B)V")
	public void method2273() {
		if (this.aClass14_10 == null || this.method2265() == null) {
			return;
		}
		for (@Pc(19) Class1 local19 = this.aClass14_11.method203(); local19 != null; local19 = this.aClass14_11.method208()) {
			@Pc(25) int local25 = (int) local19.aLong236;
			if (local25 < 0 || this.aClass268_1.anInt6956 <= local25 || this.aClass268_1.anIntArray504[local25] == 0) {
				local19.method5953();
			} else {
				if (this.aByteArray30[local25] == 0) {
					this.method2279(1, local25);
				}
				if (this.aByteArray30[local25] == -1) {
					this.method2279(2, local25);
				}
				if (this.aByteArray30[local25] == 1) {
					local19.method5953();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ib", name = "c", descriptor = "(I)I")
	public int method2274() {
		if (this.method2265() == null) {
			return this.aClass1_Sub3_Sub7_1 == null ? 0 : this.aClass1_Sub3_Sub7_1.method5947();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)Lclient!vv;")
	@Override
	public Class268 method2265() {
		if (this.aClass268_1 != null) {
			return this.aClass268_1;
		}
		if (this.aClass1_Sub3_Sub7_1 == null) {
			if (this.aClass269_4.method5756()) {
				return null;
			}
			this.aClass1_Sub3_Sub7_1 = this.aClass269_4.method5753((byte) 0, this.anInt2838, true, 255);
		}
		if (this.aClass1_Sub3_Sub7_1.aBoolean646) {
			return null;
		}
		@Pc(50) byte[] local50 = this.aClass1_Sub3_Sub7_1.method5942();
		if (this.aClass1_Sub3_Sub7_1 instanceof Class1_Sub3_Sub7_Sub1) {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass268_1 = new Class268(local50, this.anInt2830);
				if (this.aClass268_1.anInt6958 != this.anInt2839) {
					throw new RuntimeException();
				}
			} catch (@Pc(146) RuntimeException local146) {
				this.aClass268_1 = null;
				if (this.aClass269_4.method5756()) {
					this.aClass1_Sub3_Sub7_1 = null;
				} else {
					this.aClass1_Sub3_Sub7_1 = this.aClass269_4.method5753((byte) 0, this.anInt2838, true, 255);
				}
				return null;
			}
		} else {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass268_1 = new Class268(local50, this.anInt2830);
			} catch (@Pc(70) RuntimeException local70) {
				this.aClass269_4.method5764();
				this.aClass268_1 = null;
				if (this.aClass269_4.method5756()) {
					this.aClass1_Sub3_Sub7_1 = null;
				} else {
					this.aClass1_Sub3_Sub7_1 = this.aClass269_4.method5753((byte) 0, this.anInt2838, true, 255);
				}
				return null;
			}
			if (this.aClass271_4 != null) {
				this.aClass145_2.method3216(this.aClass271_4, this.anInt2838, local50);
			}
		}
		if (this.aClass271_3 != null) {
			this.aByteArray30 = new byte[this.aClass268_1.anInt6956];
			this.anInt2827 = 0;
		}
		this.aClass1_Sub3_Sub7_1 = null;
		return this.aClass268_1;
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(IB)I")
	@Override
	public int method2267(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub3_Sub7 local16 = (Class1_Sub3_Sub7) this.aClass208_17.method4405((long) arg0);
		return local16 == null ? 0 : local16.method5947();
	}

	@OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V")
	public void method2276() {
		if (this.aClass14_10 != null) {
			if (this.method2265() == null) {
				return;
			}
			@Pc(30) boolean local30;
			@Pc(35) Class1 local35;
			@Pc(41) int local41;
			@Pc(124) Class1 local124;
			if (this.aBoolean283) {
				local30 = true;
				for (local35 = this.aClass14_10.method203(); local35 != null; local35 = this.aClass14_10.method208()) {
					local41 = (int) local35.aLong236;
					if (this.aByteArray30[local41] == 0) {
						this.method2279(1, local41);
					}
					if (this.aByteArray30[local41] == 0) {
						local30 = false;
					} else {
						local35.method5953();
					}
				}
				while (this.aClass268_1.anIntArray504.length > this.anInt2845) {
					if (this.aClass268_1.anIntArray504[this.anInt2845] == 0) {
						this.anInt2845++;
					} else {
						if (this.aClass145_2.anInt4107 >= 250) {
							local30 = false;
							break;
						}
						if (this.aByteArray30[this.anInt2845] == 0) {
							this.method2279(1, this.anInt2845);
						}
						if (this.aByteArray30[this.anInt2845] == 0) {
							local124 = new Class1();
							local124.aLong236 = this.anInt2845;
							this.aClass14_10.method205(local124);
							local30 = false;
						}
						this.anInt2845++;
					}
				}
				if (local30) {
					this.anInt2845 = 0;
					this.aBoolean283 = false;
				}
			} else if (this.aBoolean284) {
				local30 = true;
				for (local35 = this.aClass14_10.method203(); local35 != null; local35 = this.aClass14_10.method208()) {
					local41 = (int) local35.aLong236;
					if (this.aByteArray30[local41] != 1) {
						this.method2279(2, local41);
					}
					if (this.aByteArray30[local41] == 1) {
						local35.method5953();
					} else {
						local30 = false;
					}
				}
				while (this.anInt2845 < this.aClass268_1.anIntArray504.length) {
					if (this.aClass268_1.anIntArray504[this.anInt2845] == 0) {
						this.anInt2845++;
					} else {
						if (this.aClass269_4.method5757()) {
							local30 = false;
							break;
						}
						if (this.aByteArray30[this.anInt2845] != 1) {
							this.method2279(2, this.anInt2845);
						}
						if (this.aByteArray30[this.anInt2845] != 1) {
							local124 = new Class1();
							local124.aLong236 = this.anInt2845;
							local30 = false;
							this.aClass14_10.method205(local124);
						}
						this.anInt2845++;
					}
				}
				if (local30) {
					this.anInt2845 = 0;
					this.aBoolean284 = false;
				}
			} else {
				this.aClass14_10 = null;
			}
		}
		if (!this.aBoolean285 || Static183.method2674() < this.aLong98) {
			return;
		}
		for (@Pc(316) Class1_Sub3_Sub7 local316 = (Class1_Sub3_Sub7) this.aClass208_17.method4414(); local316 != null; local316 = (Class1_Sub3_Sub7) this.aClass208_17.method4410()) {
			if (!local316.aBoolean646) {
				if (local316.aBoolean644) {
					if (!local316.aBoolean645) {
						throw new RuntimeException();
					}
					local316.method5953();
				} else {
					local316.aBoolean644 = true;
				}
			}
		}
		this.aLong98 = Static183.method2674() + 1000L;
	}

	@OriginalMember(owner = "client!ib", name = "d", descriptor = "(I)I")
	public int method2277() {
		return this.aClass268_1 == null ? 0 : this.aClass268_1.anInt6961;
	}

	@OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIZ)Lclient!se;")
	private Class1_Sub3_Sub7 method2279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class1_Sub3_Sub7 local13 = (Class1_Sub3_Sub7) this.aClass208_17.method4405((long) arg1);
		if (local13 != null && arg0 == 0 && !local13.aBoolean645 && local13.aBoolean646) {
			local13.method5953();
			local13 = null;
		}
		if (local13 == null) {
			if (arg0 == 0) {
				if (this.aClass271_3 == null || this.aByteArray30[arg1] == -1) {
					if (this.aClass269_4.method5756()) {
						return null;
					}
					local13 = this.aClass269_4.method5753((byte) 2, arg1, true, this.anInt2838);
				} else {
					local13 = this.aClass145_2.method3213(this.aClass271_3, arg1);
				}
			} else if (arg0 == 1) {
				if (this.aClass271_3 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass145_2.method3217(this.aClass271_3, arg1);
			} else if (arg0 == 2) {
				if (this.aClass271_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray30[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass269_4.method5757()) {
					return null;
				}
				local13 = this.aClass269_4.method5753((byte) 2, arg1, false, this.anInt2838);
			} else {
				throw new RuntimeException();
			}
			this.aClass208_17.method4413((long) arg1, local13);
		}
		if (local13.aBoolean646) {
			return null;
		}
		@Pc(153) byte[] local153 = local13.method5942();
		@Pc(188) int local188;
		@Pc(290) Class1_Sub3_Sub7_Sub2 local290;
		if (!(local13 instanceof Class1_Sub3_Sub7_Sub1)) {
			try {
				if (local153 == null || local153.length <= 2) {
					throw new RuntimeException();
				}
				Static340.aCRC32_1.reset();
				Static340.aCRC32_1.update(local153, 0, local153.length - 2);
				local188 = (int) Static340.aCRC32_1.getValue();
				if (this.aClass268_1.anIntArray505[arg1] != local188) {
					throw new RuntimeException();
				}
				this.aClass269_4.anInt7113 = 0;
				this.aClass269_4.anInt7112 = 0;
			} catch (@Pc(350) RuntimeException local350) {
				this.aClass269_4.method5764();
				local13.method5953();
				if (local13.aBoolean645 && !this.aClass269_4.method5756()) {
					local290 = this.aClass269_4.method5753((byte) 2, arg1, true, this.anInt2838);
					this.aClass208_17.method4413((long) arg1, local290);
				}
				return null;
			}
			local153[local153.length - 2] = (byte) (this.aClass268_1.anIntArray507[arg1] >>> 8);
			local153[local153.length - 1] = (byte) this.aClass268_1.anIntArray507[arg1];
			if (this.aClass271_3 != null) {
				this.aClass145_2.method3216(this.aClass271_3, arg1, local153);
				if (this.aByteArray30[arg1] != 1) {
					this.anInt2827++;
					this.aByteArray30[arg1] = 1;
				}
			}
			if (!local13.aBoolean645) {
				local13.method5953();
			}
			return local13;
		}
		try {
			if (local153 == null || local153.length <= 2) {
				throw new RuntimeException();
			}
			Static340.aCRC32_1.reset();
			Static340.aCRC32_1.update(local153, 0, local153.length - 2);
			local188 = (int) Static340.aCRC32_1.getValue();
			if (local188 != this.aClass268_1.anIntArray505[arg1]) {
				throw new RuntimeException();
			}
			@Pc(219) int local219 = ((local153[local153.length - 2] & 0xFF) << 8) + (local153[local153.length - 1] & 0xFF);
			if (local219 != (this.aClass268_1.anIntArray507[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray30[arg1] != 1) {
				this.anInt2827++;
				this.aByteArray30[arg1] = 1;
			}
			if (!local13.aBoolean645) {
				local13.method5953();
			}
			return local13;
		} catch (@Pc(264) Exception local264) {
			this.aByteArray30[arg1] = -1;
			local13.method5953();
			if (local13.aBoolean645 && !this.aClass269_4.method5756()) {
				local290 = this.aClass269_4.method5753((byte) 2, arg1, true, this.anInt2838);
				this.aClass208_17.method4413((long) arg1, local290);
			}
			return null;
		}
	}
}
