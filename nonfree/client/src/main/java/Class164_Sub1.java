import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public final class Class164_Sub1 extends Class164 {

	@OriginalMember(owner = "client!ko", name = "m", descriptor = "[B")
	private byte[] aByteArray84;

	@OriginalMember(owner = "client!ko", name = "n", descriptor = "Lclient!vm;")
	private Class301 aClass301_2;

	@OriginalMember(owner = "client!ko", name = "L", descriptor = "Z")
	private boolean aBoolean342;

	@OriginalMember(owner = "client!ko", name = "t", descriptor = "I")
	private int anInt4608 = 0;

	@OriginalMember(owner = "client!ko", name = "B", descriptor = "Lclient!ica;")
	private final Class127 aClass127_31 = new Class127(16);

	@OriginalMember(owner = "client!ko", name = "K", descriptor = "I")
	private int anInt4619 = 0;

	@OriginalMember(owner = "client!ko", name = "J", descriptor = "Lclient!rk;")
	private final Class249 aClass249_22 = new Class249();

	@OriginalMember(owner = "client!ko", name = "N", descriptor = "J")
	private long aLong124 = 0L;

	@OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
	private final int anInt4605;

	@OriginalMember(owner = "client!ko", name = "p", descriptor = "Lclient!saa;")
	private final Class257 aClass257_4;

	@OriginalMember(owner = "client!ko", name = "H", descriptor = "Z")
	private boolean aBoolean341;

	@OriginalMember(owner = "client!ko", name = "I", descriptor = "Lclient!rk;")
	private Class249 aClass249_21;

	@OriginalMember(owner = "client!ko", name = "D", descriptor = "I")
	private final int anInt4616;

	@OriginalMember(owner = "client!ko", name = "G", descriptor = "I")
	private final int anInt4618;

	@OriginalMember(owner = "client!ko", name = "A", descriptor = "Lclient!dk;")
	private final Class57 aClass57_3;

	@OriginalMember(owner = "client!ko", name = "l", descriptor = "Lclient!saa;")
	private final Class257 aClass257_3;

	@OriginalMember(owner = "client!ko", name = "r", descriptor = "[B")
	private final byte[] aByteArray85;

	@OriginalMember(owner = "client!ko", name = "M", descriptor = "Z")
	private final boolean aBoolean343;

	@OriginalMember(owner = "client!ko", name = "F", descriptor = "Lclient!fs;")
	private final Class94 aClass94_3;

	@OriginalMember(owner = "client!ko", name = "h", descriptor = "Lclient!naa;")
	private Class2_Sub13_Sub2 aClass2_Sub13_Sub2_1;

	@OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(ILclient!saa;Lclient!saa;Lclient!fs;Lclient!dk;I[BIZ)V")
	public Class164_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class257 arg1, @OriginalArg(2) Class257 arg2, @OriginalArg(3) Class94 arg3, @OriginalArg(4) Class57 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt4605 = arg0;
		this.aClass257_4 = arg1;
		if (this.aClass257_4 == null) {
			this.aBoolean341 = false;
		} else {
			this.aBoolean341 = true;
			this.aClass249_21 = new Class249();
		}
		this.anInt4616 = arg5;
		this.anInt4618 = arg7;
		this.aClass57_3 = arg4;
		this.aClass257_3 = arg2;
		this.aByteArray85 = arg6;
		this.aBoolean343 = arg8;
		this.aClass94_3 = arg3;
		if (this.aClass257_3 != null) {
			this.aClass2_Sub13_Sub2_1 = this.aClass57_3.method1690(this.aClass257_3, this.anInt4605);
		}
	}

	@OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)I")
	public int method4001() {
		return this.anInt4608;
	}

	@OriginalMember(owner = "client!ko", name = "e", descriptor = "(I)V")
	public void method4002() {
		if (this.aClass257_4 != null) {
			this.aBoolean342 = true;
			if (this.aClass249_21 == null) {
				this.aClass249_21 = new Class249();
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)Lclient!vm;")
	@Override
	public Class301 method3995() {
		if (this.aClass301_2 != null) {
			return this.aClass301_2;
		}
		if (this.aClass2_Sub13_Sub2_1 == null) {
			if (this.aClass94_3.method2501()) {
				return null;
			}
			this.aClass2_Sub13_Sub2_1 = this.aClass94_3.method2495(this.anInt4605, (byte) 0, true, 255);
		}
		if (this.aClass2_Sub13_Sub2_1.aBoolean514) {
			return null;
		}
		@Pc(50) byte[] local50 = this.aClass2_Sub13_Sub2_1.method5809();
		if (this.aClass2_Sub13_Sub2_1 instanceof Class2_Sub13_Sub2_Sub1) {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass301_2 = new Class301(local50, this.anInt4616, this.aByteArray85);
				if (this.anInt4618 != this.aClass301_2.anInt8966) {
					throw new RuntimeException();
				}
			} catch (@Pc(148) RuntimeException local148) {
				this.aClass301_2 = null;
				if (this.aClass94_3.method2501()) {
					this.aClass2_Sub13_Sub2_1 = null;
				} else {
					this.aClass2_Sub13_Sub2_1 = this.aClass94_3.method2495(this.anInt4605, (byte) 0, true, 255);
				}
				return null;
			}
		} else {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass301_2 = new Class301(local50, this.anInt4616, this.aByteArray85);
			} catch (@Pc(72) RuntimeException local72) {
				this.aClass94_3.method2500();
				this.aClass301_2 = null;
				if (this.aClass94_3.method2501()) {
					this.aClass2_Sub13_Sub2_1 = null;
				} else {
					this.aClass2_Sub13_Sub2_1 = this.aClass94_3.method2495(this.anInt4605, (byte) 0, true, 255);
				}
				return null;
			}
			if (this.aClass257_3 != null) {
				this.aClass57_3.method1688(this.anInt4605, local50, this.aClass257_3);
			}
		}
		if (this.aClass257_4 != null) {
			this.anInt4608 = 0;
			this.aByteArray84 = new byte[this.aClass301_2.anInt8967];
		}
		this.aClass2_Sub13_Sub2_1 = null;
		return this.aClass301_2;
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(II)V")
	@Override
	public void method3996(@OriginalArg(0) int arg0) {
		if (this.aClass257_4 == null) {
			return;
		}
		for (@Pc(14) Class2 local14 = this.aClass249_22.method6527(); local14 != null; local14 = this.aClass249_22.method6525()) {
			if ((long) arg0 == local14.aLong241) {
				return;
			}
		}
		@Pc(34) Class2 local34 = new Class2();
		local34.aLong241 = arg0;
		this.aClass249_22.method6523(local34);
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZI)Lclient!naa;")
	private Class2_Sub13_Sub2 method4004(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub13_Sub2 local13 = (Class2_Sub13_Sub2) this.aClass127_31.method3205((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean515 && local13.aBoolean514) {
			local13.method7802();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass257_4 == null || this.aByteArray84[arg0] == -1) {
					if (this.aClass94_3.method2501()) {
						return null;
					}
					local13 = this.aClass94_3.method2495(arg0, (byte) 2, true, this.anInt4605);
				} else {
					local13 = this.aClass57_3.method1690(this.aClass257_4, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass257_4 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass57_3.method1689(this.aClass257_4, arg0);
			} else if (arg1 == 2) {
				if (this.aClass257_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray84[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass94_3.method2490()) {
					return null;
				}
				local13 = this.aClass94_3.method2495(arg0, (byte) 2, false, this.anInt4605);
			} else {
				throw new RuntimeException();
			}
			this.aClass127_31.method3213(local13, (long) arg0);
		}
		if (local13.aBoolean514) {
			return null;
		}
		@Pc(159) byte[] local159 = local13.method5809();
		@Pc(188) int local188;
		@Pc(219) byte[] local219;
		@Pc(228) byte[] local228;
		@Pc(230) int local230;
		@Pc(282) Class2_Sub13_Sub2_Sub2 local282;
		if (!(local13 instanceof Class2_Sub13_Sub2_Sub1)) {
			try {
				if (local159 == null || local159.length <= 2) {
					throw new RuntimeException();
				}
				Static267.aCRC32_9.reset();
				Static267.aCRC32_9.update(local159, 0, local159.length - 2);
				local188 = (int) Static267.aCRC32_9.getValue();
				if (local188 != this.aClass301_2.anIntArray685[arg0]) {
					throw new RuntimeException();
				}
				if (this.aClass301_2.aByteArrayArray27 != null && this.aClass301_2.aByteArrayArray27[arg0] != null) {
					local219 = this.aClass301_2.aByteArrayArray27[arg0];
					local228 = Static266.method4288(0, local159.length - 2, local159);
					for (local230 = 0; local230 < 64; local230++) {
						if (local228[local230] != local219[local230]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass94_3.anInt2646 = 0;
				this.aClass94_3.anInt2645 = 0;
			} catch (@Pc(257) RuntimeException local257) {
				this.aClass94_3.method2500();
				local13.method7802();
				if (local13.aBoolean515 && !this.aClass94_3.method2501()) {
					local282 = this.aClass94_3.method2495(arg0, (byte) 2, true, this.anInt4605);
					this.aClass127_31.method3213(local282, (long) arg0);
				}
				return null;
			}
			local159[local159.length - 2] = (byte) (this.aClass301_2.anIntArray689[arg0] >>> 8);
			local159[local159.length - 1] = (byte) this.aClass301_2.anIntArray689[arg0];
			if (this.aClass257_4 != null) {
				this.aClass57_3.method1688(arg0, local159, this.aClass257_4);
				if (this.aByteArray84[arg0] != 1) {
					this.anInt4608++;
					this.aByteArray84[arg0] = 1;
				}
			}
			if (!local13.aBoolean515) {
				local13.method7802();
			}
			return local13;
		}
		try {
			if (local159 == null || local159.length <= 2) {
				throw new RuntimeException();
			}
			Static267.aCRC32_9.reset();
			Static267.aCRC32_9.update(local159, 0, local159.length - 2);
			local188 = (int) Static267.aCRC32_9.getValue();
			if (this.aClass301_2.anIntArray685[arg0] != local188) {
				throw new RuntimeException();
			}
			if (this.aClass301_2.aByteArrayArray27 != null && this.aClass301_2.aByteArrayArray27[arg0] != null) {
				local219 = this.aClass301_2.aByteArrayArray27[arg0];
				local228 = Static266.method4288(0, local159.length - 2, local159);
				for (local230 = 0; local230 < 64; local230++) {
					if (local228[local230] != local219[local230]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(456) int local456 = ((local159[local159.length - 2] & 0xFF) << 8) + (local159[local159.length - 1] & 0xFF);
			if ((this.aClass301_2.anIntArray689[arg0] & 0xFFFF) != local456) {
				throw new RuntimeException();
			}
			if (this.aByteArray84[arg0] != 1) {
				this.anInt4608++;
				this.aByteArray84[arg0] = 1;
			}
			if (!local13.aBoolean515) {
				local13.method7802();
			}
			return local13;
		} catch (@Pc(501) Exception local501) {
			this.aByteArray84[arg0] = -1;
			local13.method7802();
			if (local13.aBoolean515 && !this.aClass94_3.method2501()) {
				local282 = this.aClass94_3.method2495(arg0, (byte) 2, true, this.anInt4605);
				this.aClass127_31.method3213(local282, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)I")
	public int method4005() {
		return this.aClass301_2 == null ? 0 : this.aClass301_2.anInt8969;
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(Z)I")
	public int method4006() {
		if (this.aClass301_2 == null) {
			return 0;
		} else if (this.aBoolean341) {
			@Pc(26) Class2 local26 = this.aClass249_21.method6527();
			return local26 == null ? 0 : (int) local26.aLong241;
		} else {
			return this.aClass301_2.anInt8969;
		}
	}

	@OriginalMember(owner = "client!ko", name = "c", descriptor = "(Z)V")
	public void method4008() {
		if (this.aClass249_21 == null || this.method3995() == null) {
			return;
		}
		for (@Pc(25) Class2 local25 = this.aClass249_22.method6527(); local25 != null; local25 = this.aClass249_22.method6525()) {
			@Pc(31) int local31 = (int) local25.aLong241;
			if (local31 < 0 || this.aClass301_2.anInt8967 <= local31 || this.aClass301_2.anIntArray686[local31] == 0) {
				local25.method7802();
			} else {
				if (this.aByteArray84[local31] == 0) {
					this.method4004(local31, 1);
				}
				if (this.aByteArray84[local31] == -1) {
					this.method4004(local31, 2);
				}
				if (this.aByteArray84[local31] == 1) {
					local25.method7802();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] method3993(@OriginalArg(1) int arg0) {
		@Pc(9) Class2_Sub13_Sub2 local9 = this.method4004(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method5809();
			local9.method7802();
			return local17;
		}
	}

	@OriginalMember(owner = "client!ko", name = "f", descriptor = "(I)V")
	public void method4009() {
		if (this.aClass249_21 != null) {
			if (this.method3995() == null) {
				return;
			}
			@Pc(26) boolean local26;
			@Pc(31) Class2 local31;
			@Pc(37) int local37;
			@Pc(124) Class2 local124;
			if (this.aBoolean341) {
				local26 = true;
				for (local31 = this.aClass249_21.method6527(); local31 != null; local31 = this.aClass249_21.method6525()) {
					local37 = (int) local31.aLong241;
					if (this.aByteArray84[local37] == 0) {
						this.method4004(local37, 1);
					}
					if (this.aByteArray84[local37] == 0) {
						local26 = false;
					} else {
						local31.method7802();
					}
				}
				while (this.anInt4619 < this.aClass301_2.anIntArray686.length) {
					if (this.aClass301_2.anIntArray686[this.anInt4619] == 0) {
						this.anInt4619++;
					} else {
						if (this.aClass57_3.anInt1784 >= 250) {
							local26 = false;
							break;
						}
						if (this.aByteArray84[this.anInt4619] == 0) {
							this.method4004(this.anInt4619, 1);
						}
						if (this.aByteArray84[this.anInt4619] == 0) {
							local124 = new Class2();
							local124.aLong241 = this.anInt4619;
							this.aClass249_21.method6523(local124);
							local26 = false;
						}
						this.anInt4619++;
					}
				}
				if (local26) {
					this.anInt4619 = 0;
					this.aBoolean341 = false;
				}
			} else if (this.aBoolean342) {
				local26 = true;
				for (local31 = this.aClass249_21.method6527(); local31 != null; local31 = this.aClass249_21.method6525()) {
					local37 = (int) local31.aLong241;
					if (this.aByteArray84[local37] != 1) {
						this.method4004(local37, 2);
					}
					if (this.aByteArray84[local37] == 1) {
						local31.method7802();
					} else {
						local26 = false;
					}
				}
				while (this.aClass301_2.anIntArray686.length > this.anInt4619) {
					if (this.aClass301_2.anIntArray686[this.anInt4619] == 0) {
						this.anInt4619++;
					} else {
						if (this.aClass94_3.method2490()) {
							local26 = false;
							break;
						}
						if (this.aByteArray84[this.anInt4619] != 1) {
							this.method4004(this.anInt4619, 2);
						}
						if (this.aByteArray84[this.anInt4619] != 1) {
							local124 = new Class2();
							local124.aLong241 = this.anInt4619;
							local26 = false;
							this.aClass249_21.method6523(local124);
						}
						this.anInt4619++;
					}
				}
				if (local26) {
					this.anInt4619 = 0;
					this.aBoolean342 = false;
				}
			} else {
				this.aClass249_21 = null;
			}
		}
		if (!this.aBoolean343 || this.aLong124 > Static143.method2502()) {
			return;
		}
		for (@Pc(308) Class2_Sub13_Sub2 local308 = (Class2_Sub13_Sub2) this.aClass127_31.method3203(); local308 != null; local308 = (Class2_Sub13_Sub2) this.aClass127_31.method3212()) {
			if (!local308.aBoolean514) {
				if (local308.aBoolean516) {
					if (!local308.aBoolean515) {
						throw new RuntimeException();
					}
					local308.method7802();
				} else {
					local308.aBoolean516 = true;
				}
			}
		}
		this.aLong124 = Static143.method2502() + 1000L;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)I")
	@Override
	public int method3991(@OriginalArg(0) int arg0) {
		@Pc(16) Class2_Sub13_Sub2 local16 = (Class2_Sub13_Sub2) this.aClass127_31.method3205((long) arg0);
		return local16 == null ? 0 : local16.method5810();
	}

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "(I)I")
	public int method4010() {
		if (this.method3995() == null) {
			return this.aClass2_Sub13_Sub2_1 == null ? 0 : this.aClass2_Sub13_Sub2_1.method5810();
		} else {
			return 100;
		}
	}
}
