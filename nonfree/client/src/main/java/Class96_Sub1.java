import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nf")
public final class Class96_Sub1 extends Class96 {

	@OriginalMember(owner = "client!nf", name = "E", descriptor = "Lclient!og;")
	private Class188 aClass188_2;

	@OriginalMember(owner = "client!nf", name = "H", descriptor = "[B")
	private byte[] aByteArray61;

	@OriginalMember(owner = "client!nf", name = "K", descriptor = "Z")
	private boolean aBoolean324;

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
	private int anInt4530 = 0;

	@OriginalMember(owner = "client!nf", name = "w", descriptor = "Lclient!ke;")
	private final Class137 aClass137_27 = new Class137(16);

	@OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
	private int anInt4547 = 0;

	@OriginalMember(owner = "client!nf", name = "N", descriptor = "Lclient!ft;")
	private final Class88 aClass88_38 = new Class88();

	@OriginalMember(owner = "client!nf", name = "O", descriptor = "J")
	private long aLong142 = 0L;

	@OriginalMember(owner = "client!nf", name = "o", descriptor = "Lclient!ap;")
	private final Class14 aClass14_2;

	@OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
	private final int anInt4546;

	@OriginalMember(owner = "client!nf", name = "L", descriptor = "Z")
	private boolean aBoolean325;

	@OriginalMember(owner = "client!nf", name = "M", descriptor = "Lclient!ft;")
	private Class88 aClass88_37;

	@OriginalMember(owner = "client!nf", name = "F", descriptor = "Lclient!mf;")
	private final Class165 aClass165_2;

	@OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
	private final int anInt4543;

	@OriginalMember(owner = "client!nf", name = "Q", descriptor = "Z")
	private final boolean aBoolean326;

	@OriginalMember(owner = "client!nf", name = "y", descriptor = "Lclient!ap;")
	private final Class14 aClass14_3;

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "Lclient!no;")
	private final Class179 aClass179_1;

	@OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
	private final int anInt4538;

	@OriginalMember(owner = "client!nf", name = "A", descriptor = "Lclient!pp;")
	private Class6_Sub1_Sub1 aClass6_Sub1_Sub1_1;

	@OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(ILclient!ap;Lclient!ap;Lclient!no;Lclient!mf;IIZ)V")
	public Class96_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class14 arg2, @OriginalArg(3) Class179 arg3, @OriginalArg(4) Class165 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass14_2 = arg1;
		this.anInt4546 = arg0;
		if (this.aClass14_2 == null) {
			this.aBoolean325 = false;
		} else {
			this.aBoolean325 = true;
			this.aClass88_37 = new Class88();
		}
		this.aClass165_2 = arg4;
		this.anInt4543 = arg6;
		this.aBoolean326 = arg7;
		this.aClass14_3 = arg2;
		this.aClass179_1 = arg3;
		this.anInt4538 = arg5;
		if (this.aClass14_3 != null) {
			this.aClass6_Sub1_Sub1_1 = this.aClass165_2.method3740(this.aClass14_3, this.anInt4546);
		}
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)Lclient!og;")
	@Override
	public Class188 method4047() {
		if (this.aClass188_2 != null) {
			return this.aClass188_2;
		}
		if (this.aClass6_Sub1_Sub1_1 == null) {
			if (this.aClass179_1.method4141()) {
				return null;
			}
			this.aClass6_Sub1_Sub1_1 = this.aClass179_1.method4130(true, (byte) 0, 255, this.anInt4546);
		}
		if (this.aClass6_Sub1_Sub1_1.aBoolean481) {
			return null;
		}
		@Pc(49) byte[] local49 = this.aClass6_Sub1_Sub1_1.method5786();
		if (this.aClass6_Sub1_Sub1_1 instanceof Class6_Sub1_Sub1_Sub2) {
			try {
				if (local49 == null) {
					throw new RuntimeException();
				}
				this.aClass188_2 = new Class188(local49, this.anInt4538);
				if (this.anInt4543 != this.aClass188_2.anInt4823) {
					throw new RuntimeException();
				}
			} catch (@Pc(78) RuntimeException local78) {
				this.aClass188_2 = null;
				if (this.aClass179_1.method4141()) {
					this.aClass6_Sub1_Sub1_1 = null;
				} else {
					this.aClass6_Sub1_Sub1_1 = this.aClass179_1.method4130(true, (byte) 0, 255, this.anInt4546);
				}
				return null;
			}
		} else {
			try {
				if (local49 == null) {
					throw new RuntimeException();
				}
				this.aClass188_2 = new Class188(local49, this.anInt4538);
			} catch (@Pc(120) RuntimeException local120) {
				this.aClass179_1.method4144();
				this.aClass188_2 = null;
				if (this.aClass179_1.method4141()) {
					this.aClass6_Sub1_Sub1_1 = null;
				} else {
					this.aClass6_Sub1_Sub1_1 = this.aClass179_1.method4130(true, (byte) 0, 255, this.anInt4546);
				}
				return null;
			}
			if (this.aClass14_3 != null) {
				this.aClass165_2.method3736(this.anInt4546, this.aClass14_3, local49);
			}
		}
		this.aClass6_Sub1_Sub1_1 = null;
		if (this.aClass14_2 != null) {
			this.anInt4530 = 0;
			this.aByteArray61 = new byte[this.aClass188_2.anInt4817];
		}
		return this.aClass188_2;
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)I")
	public int method4055() {
		return this.anInt4530;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)I")
	@Override
	public int method4048(@OriginalArg(1) int arg0) {
		@Pc(11) Class6_Sub1_Sub1 local11 = (Class6_Sub1_Sub1) this.aClass137_27.method3175((long) arg0);
		return local11 == null ? 0 : local11.method5787();
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIZ)Lclient!pp;")
	private Class6_Sub1_Sub1 method4056(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class6_Sub1_Sub1 local13 = (Class6_Sub1_Sub1) this.aClass137_27.method3175((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean482 && local13.aBoolean481) {
			local13.method5977();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass14_2 == null || this.aByteArray61[arg0] == -1) {
					if (this.aClass179_1.method4141()) {
						return null;
					}
					local13 = this.aClass179_1.method4130(true, (byte) 2, this.anInt4546, arg0);
				} else {
					local13 = this.aClass165_2.method3740(this.aClass14_2, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass14_2 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass165_2.method3739(this.aClass14_2, arg0);
			} else if (arg1 == 2) {
				if (this.aClass14_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray61[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass179_1.method4143()) {
					return null;
				}
				local13 = this.aClass179_1.method4130(false, (byte) 2, this.anInt4546, arg0);
			} else {
				throw new RuntimeException();
			}
			this.aClass137_27.method3179((long) arg0, local13);
		}
		if (local13.aBoolean481) {
			return null;
		}
		@Pc(148) byte[] local148 = local13.method5786();
		@Pc(177) int local177;
		@Pc(273) Class6_Sub1_Sub1_Sub1 local273;
		if (!(local13 instanceof Class6_Sub1_Sub1_Sub2)) {
			try {
				if (local148 == null || local148.length <= 2) {
					throw new RuntimeException();
				}
				Static186.aCRC32_1.reset();
				Static186.aCRC32_1.update(local148, 0, local148.length - 2);
				local177 = (int) Static186.aCRC32_1.getValue();
				if (local177 != this.aClass188_2.anIntArray431[arg0]) {
					throw new RuntimeException();
				}
				this.aClass179_1.anInt4659 = 0;
				this.aClass179_1.anInt4660 = 0;
			} catch (@Pc(329) RuntimeException local329) {
				this.aClass179_1.method4144();
				local13.method5977();
				if (local13.aBoolean482 && !this.aClass179_1.method4141()) {
					local273 = this.aClass179_1.method4130(true, (byte) 2, this.anInt4546, arg0);
					this.aClass137_27.method3179((long) arg0, local273);
				}
				return null;
			}
			local148[local148.length - 2] = (byte) (this.aClass188_2.anIntArray430[arg0] >>> 8);
			local148[local148.length - 1] = (byte) this.aClass188_2.anIntArray430[arg0];
			if (this.aClass14_2 != null) {
				this.aClass165_2.method3736(arg0, this.aClass14_2, local148);
				if (this.aByteArray61[arg0] != 1) {
					this.anInt4530++;
					this.aByteArray61[arg0] = 1;
				}
			}
			if (!local13.aBoolean482) {
				local13.method5977();
			}
			return local13;
		}
		try {
			if (local148 == null || local148.length <= 2) {
				throw new RuntimeException();
			}
			Static186.aCRC32_1.reset();
			Static186.aCRC32_1.update(local148, 0, local148.length - 2);
			local177 = (int) Static186.aCRC32_1.getValue();
			if (local177 != this.aClass188_2.anIntArray431[arg0]) {
				throw new RuntimeException();
			}
			@Pc(208) int local208 = (local148[local148.length - 1] & 0xFF) + ((local148[local148.length - 2] & 0xFF) << 8);
			if ((this.aClass188_2.anIntArray430[arg0] & 0xFFFF) != local208) {
				throw new RuntimeException();
			}
			if (this.aByteArray61[arg0] != 1) {
				this.anInt4530++;
				this.aByteArray61[arg0] = 1;
			}
			if (!local13.aBoolean482) {
				local13.method5977();
			}
			return local13;
		} catch (@Pc(247) Exception local247) {
			this.aByteArray61[arg0] = -1;
			local13.method5977();
			if (local13.aBoolean482 && !this.aClass179_1.method4141()) {
				local273 = this.aClass179_1.method4130(true, (byte) 2, this.anInt4546, arg0);
				this.aClass137_27.method3179((long) arg0, local273);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
	public void method4057() {
		if (this.aClass88_37 != null) {
			if (this.method4047() == null) {
				return;
			}
			@Pc(18) boolean local18;
			@Pc(23) Class6 local23;
			@Pc(29) int local29;
			@Pc(114) Class6 local114;
			if (this.aBoolean325) {
				local18 = true;
				for (local23 = this.aClass88_37.method1882(); local23 != null; local23 = this.aClass88_37.method1891()) {
					local29 = (int) local23.aLong217;
					if (this.aByteArray61[local29] == 0) {
						this.method4056(local29, 1);
					}
					if (this.aByteArray61[local29] == 0) {
						local18 = false;
					} else {
						local23.method5977();
					}
				}
				while (this.aClass188_2.anIntArray429.length > this.anInt4547) {
					if (this.aClass188_2.anIntArray429[this.anInt4547] == 0) {
						this.anInt4547++;
					} else {
						if (this.aClass165_2.anInt4105 >= 250) {
							local18 = false;
							break;
						}
						if (this.aByteArray61[this.anInt4547] == 0) {
							this.method4056(this.anInt4547, 1);
						}
						if (this.aByteArray61[this.anInt4547] == 0) {
							local114 = new Class6();
							local114.aLong217 = this.anInt4547;
							this.aClass88_37.method1878(local114);
							local18 = false;
						}
						this.anInt4547++;
					}
				}
				if (local18) {
					this.anInt4547 = 0;
					this.aBoolean325 = false;
				}
			} else if (this.aBoolean324) {
				local18 = true;
				for (local23 = this.aClass88_37.method1882(); local23 != null; local23 = this.aClass88_37.method1891()) {
					local29 = (int) local23.aLong217;
					if (this.aByteArray61[local29] != 1) {
						this.method4056(local29, 2);
					}
					if (this.aByteArray61[local29] == 1) {
						local23.method5977();
					} else {
						local18 = false;
					}
				}
				while (this.aClass188_2.anIntArray429.length > this.anInt4547) {
					if (this.aClass188_2.anIntArray429[this.anInt4547] == 0) {
						this.anInt4547++;
					} else {
						if (this.aClass179_1.method4143()) {
							local18 = false;
							break;
						}
						if (this.aByteArray61[this.anInt4547] != 1) {
							this.method4056(this.anInt4547, 2);
						}
						if (this.aByteArray61[this.anInt4547] != 1) {
							local114 = new Class6();
							local114.aLong217 = this.anInt4547;
							local18 = false;
							this.aClass88_37.method1878(local114);
						}
						this.anInt4547++;
					}
				}
				if (local18) {
					this.aBoolean324 = false;
					this.anInt4547 = 0;
				}
			} else {
				this.aClass88_37 = null;
			}
		}
		if (!this.aBoolean326 || Static154.method2527() < this.aLong142) {
			return;
		}
		for (@Pc(328) Class6_Sub1_Sub1 local328 = (Class6_Sub1_Sub1) this.aClass137_27.method3181(); local328 != null; local328 = (Class6_Sub1_Sub1) this.aClass137_27.method3182()) {
			if (!local328.aBoolean481) {
				if (local328.aBoolean480) {
					if (!local328.aBoolean482) {
						throw new RuntimeException();
					}
					local328.method5977();
				} else {
					local328.aBoolean480 = true;
				}
			}
		}
		this.aLong142 = Static154.method2527() + 1000L;
	}

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)V")
	@Override
	public void method4053(@OriginalArg(0) int arg0) {
		if (this.aClass14_2 == null) {
			return;
		}
		for (@Pc(20) Class6 local20 = this.aClass88_38.method1882(); local20 != null; local20 = this.aClass88_38.method1891()) {
			if (local20.aLong217 == (long) arg0) {
				return;
			}
		}
		@Pc(40) Class6 local40 = new Class6();
		local40.aLong217 = arg0;
		this.aClass88_38.method1878(local40);
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
	public void method4058() {
		if (this.aClass88_37 == null || this.method4047() == null) {
			return;
		}
		for (@Pc(25) Class6 local25 = this.aClass88_38.method1882(); local25 != null; local25 = this.aClass88_38.method1891()) {
			@Pc(31) int local31 = (int) local25.aLong217;
			if (local31 < 0 || local31 >= this.aClass188_2.anInt4817 || this.aClass188_2.anIntArray429[local31] == 0) {
				local25.method5977();
			} else {
				if (this.aByteArray61[local31] == 0) {
					this.method4056(local31, 1);
				}
				if (this.aByteArray61[local31] == -1) {
					this.method4056(local31, 2);
				}
				if (this.aByteArray61[local31] == 1) {
					local25.method5977();
				}
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "(Z)V")
	public void method4059() {
		if (this.aClass14_2 != null) {
			this.aBoolean324 = true;
			if (this.aClass88_37 == null) {
				this.aClass88_37 = new Class88();
			}
		}
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)I")
	public int method4060() {
		return this.aClass188_2 == null ? 0 : this.aClass188_2.anInt4815;
	}

	@OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)I")
	public int method4061() {
		if (this.aClass188_2 == null) {
			return 0;
		} else if (this.aBoolean325) {
			@Pc(24) Class6 local24 = this.aClass88_37.method1882();
			return local24 == null ? 0 : (int) local24.aLong217;
		} else {
			return this.aClass188_2.anInt4815;
		}
	}

	@OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)I")
	public int method4062() {
		if (this.method4047() == null) {
			return this.aClass6_Sub1_Sub1_1 == null ? 0 : this.aClass6_Sub1_Sub1_1.method5787();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] method4054(@OriginalArg(0) int arg0) {
		@Pc(9) Class6_Sub1_Sub1 local9 = this.method4056(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(23) byte[] local23 = local9.method5786();
			local9.method5977();
			return local23;
		}
	}
}
