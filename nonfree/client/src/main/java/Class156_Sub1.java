import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mc")
public final class Class156_Sub1 extends Class156 {

	@OriginalMember(owner = "client!mc", name = "q", descriptor = "[B")
	private byte[] aByteArray45;

	@OriginalMember(owner = "client!mc", name = "r", descriptor = "Lclient!fga;")
	private Class99 aClass99_1;

	@OriginalMember(owner = "client!mc", name = "O", descriptor = "Z")
	private boolean aBoolean449;

	@OriginalMember(owner = "client!mc", name = "C", descriptor = "I")
	private int anInt5787 = 0;

	@OriginalMember(owner = "client!mc", name = "j", descriptor = "Lclient!faa;")
	private final Class91 aClass91_25 = new Class91(16);

	@OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
	private int anInt5793 = 0;

	@OriginalMember(owner = "client!mc", name = "P", descriptor = "Lclient!gca;")
	private final Class111 aClass111_36 = new Class111();

	@OriginalMember(owner = "client!mc", name = "Q", descriptor = "J")
	private long aLong141 = 0L;

	@OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
	private final int anInt5775;

	@OriginalMember(owner = "client!mc", name = "x", descriptor = "Lclient!sp;")
	private final Class313 aClass313_3;

	@OriginalMember(owner = "client!mc", name = "L", descriptor = "Z")
	private boolean aBoolean448;

	@OriginalMember(owner = "client!mc", name = "N", descriptor = "Lclient!gca;")
	private Class111 aClass111_35;

	@OriginalMember(owner = "client!mc", name = "g", descriptor = "[B")
	private final byte[] aByteArray44;

	@OriginalMember(owner = "client!mc", name = "E", descriptor = "Lclient!lfa;")
	private final Class205 aClass205_2;

	@OriginalMember(owner = "client!mc", name = "z", descriptor = "I")
	private final int anInt5784;

	@OriginalMember(owner = "client!mc", name = "R", descriptor = "Z")
	private final boolean aBoolean450;

	@OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
	private final int anInt5792;

	@OriginalMember(owner = "client!mc", name = "m", descriptor = "Lclient!mu;")
	private final Class228 aClass228_3;

	@OriginalMember(owner = "client!mc", name = "J", descriptor = "Lclient!sp;")
	private final Class313 aClass313_4;

	@OriginalMember(owner = "client!mc", name = "w", descriptor = "Lclient!ufa;")
	private Class1_Sub8_Sub1 aClass1_Sub8_Sub1_1;

	@OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(ILclient!sp;Lclient!sp;Lclient!lfa;Lclient!mu;I[BIZ)V")
	public Class156_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class313 arg1, @OriginalArg(2) Class313 arg2, @OriginalArg(3) Class205 arg3, @OriginalArg(4) Class228 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt5775 = arg0;
		this.aClass313_3 = arg1;
		if (this.aClass313_3 == null) {
			this.aBoolean448 = false;
		} else {
			this.aBoolean448 = true;
			this.aClass111_35 = new Class111();
		}
		this.aByteArray44 = arg6;
		this.aClass205_2 = arg3;
		this.anInt5784 = arg5;
		this.aBoolean450 = arg8;
		this.anInt5792 = arg7;
		this.aClass228_3 = arg4;
		this.aClass313_4 = arg2;
		if (this.aClass313_4 != null) {
			this.aClass1_Sub8_Sub1_1 = this.aClass228_3.method4910(this.anInt5775, this.aClass313_4);
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)I")
	public int method4690() {
		return this.aClass99_1 == null ? 0 : this.aClass99_1.anInt2728;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(II)I")
	@Override
	public int method4686(@OriginalArg(1) int arg0) {
		@Pc(19) Class1_Sub8_Sub1 local19 = (Class1_Sub8_Sub1) this.aClass91_25.method2271((long) arg0);
		return local19 == null ? 0 : local19.method5911();
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Lclient!ufa;")
	private Class1_Sub8_Sub1 method4692(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class1_Sub8_Sub1 local18 = (Class1_Sub8_Sub1) this.aClass91_25.method2271((long) arg1);
		if (local18 != null && arg0 == 0 && !local18.aBoolean564 && local18.aBoolean563) {
			local18.method7908();
			local18 = null;
		}
		if (local18 == null) {
			if (arg0 == 0) {
				if (this.aClass313_3 == null || this.aByteArray45[arg1] == -1) {
					if (this.aClass205_2.method4367()) {
						return null;
					}
					local18 = this.aClass205_2.method4366(true, this.anInt5775, (byte) 2, arg1);
				} else {
					local18 = this.aClass228_3.method4910(arg1, this.aClass313_3);
				}
			} else if (arg0 == 1) {
				if (this.aClass313_3 == null) {
					throw new RuntimeException();
				}
				local18 = this.aClass228_3.method4907(this.aClass313_3, arg1);
			} else if (arg0 == 2) {
				if (this.aClass313_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray45[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass205_2.method4360()) {
					return null;
				}
				local18 = this.aClass205_2.method4366(false, this.anInt5775, (byte) 2, arg1);
			} else {
				throw new RuntimeException();
			}
			this.aClass91_25.method2269((long) arg1, local18);
		}
		if (local18.aBoolean563) {
			return null;
		}
		@Pc(160) byte[] local160 = local18.method5914();
		@Pc(189) int local189;
		@Pc(216) byte[] local216;
		@Pc(225) byte[] local225;
		@Pc(227) int local227;
		@Pc(331) Class1_Sub8_Sub1_Sub2 local331;
		if (!(local18 instanceof Class1_Sub8_Sub1_Sub1)) {
			try {
				label157: {
					if (local160 != null && local160.length > 2) {
						Static330.aCRC32_1.reset();
						Static330.aCRC32_1.update(local160, 0, local160.length - 2);
						local189 = (int) Static330.aCRC32_1.getValue();
						if (local189 != this.aClass99_1.anIntArray119[arg1]) {
							throw new RuntimeException();
						}
						if (this.aClass99_1.aByteArrayArray4 == null || this.aClass99_1.aByteArrayArray4[arg1] == null) {
							break label157;
						}
						local216 = this.aClass99_1.aByteArrayArray4[arg1];
						local225 = Static387.method5581(local160, 0, local160.length - 2);
						local227 = 0;
						while (true) {
							if (local227 >= 64) {
								break label157;
							}
							if (local216[local227] != local225[local227]) {
								throw new RuntimeException();
							}
							local227++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass205_2.anInt5307 = 0;
				this.aClass205_2.anInt5306 = 0;
			} catch (@Pc(433) RuntimeException local433) {
				this.aClass205_2.method4369();
				local18.method7908();
				if (local18.aBoolean564 && !this.aClass205_2.method4367()) {
					local331 = this.aClass205_2.method4366(true, this.anInt5775, (byte) 2, arg1);
					this.aClass91_25.method2269((long) arg1, local331);
				}
				return null;
			}
			local160[local160.length - 2] = (byte) (this.aClass99_1.anIntArray120[arg1] >>> 8);
			local160[local160.length - 1] = (byte) this.aClass99_1.anIntArray120[arg1];
			if (this.aClass313_3 != null) {
				this.aClass228_3.method4908(this.aClass313_3, local160, arg1);
				if (this.aByteArray45[arg1] != 1) {
					this.anInt5787++;
					this.aByteArray45[arg1] = 1;
				}
			}
			if (!local18.aBoolean564) {
				local18.method7908();
			}
			return local18;
		}
		try {
			if (local160 == null || local160.length <= 2) {
				throw new RuntimeException();
			}
			Static330.aCRC32_1.reset();
			Static330.aCRC32_1.update(local160, 0, local160.length - 2);
			local189 = (int) Static330.aCRC32_1.getValue();
			if (this.aClass99_1.anIntArray119[arg1] != local189) {
				throw new RuntimeException();
			}
			if (this.aClass99_1.aByteArrayArray4 != null && this.aClass99_1.aByteArrayArray4[arg1] != null) {
				local216 = this.aClass99_1.aByteArrayArray4[arg1];
				local225 = Static387.method5581(local160, 0, local160.length - 2);
				for (local227 = 0; local227 < 64; local227++) {
					if (local216[local227] != local225[local227]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(266) int local266 = (local160[local160.length - 1] & 0xFF) + ((local160[local160.length - 2] & 0xFF) << 8);
			if ((this.aClass99_1.anIntArray120[arg1] & 0xFFFF) != local266) {
				throw new RuntimeException();
			}
			if (this.aByteArray45[arg1] != 1) {
				this.anInt5787++;
				this.aByteArray45[arg1] = 1;
			}
			if (!local18.aBoolean564) {
				local18.method7908();
			}
			return local18;
		} catch (@Pc(305) Exception local305) {
			this.aByteArray45[arg1] = -1;
			local18.method7908();
			if (local18.aBoolean564 && !this.aClass205_2.method4367()) {
				local331 = this.aClass205_2.method4366(true, this.anInt5775, (byte) 2, arg1);
				this.aClass91_25.method2269((long) arg1, local331);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)Lclient!fga;")
	@Override
	public Class99 method4683() {
		if (this.aClass99_1 != null) {
			return this.aClass99_1;
		}
		if (this.aClass1_Sub8_Sub1_1 == null) {
			if (this.aClass205_2.method4367()) {
				return null;
			}
			this.aClass1_Sub8_Sub1_1 = this.aClass205_2.method4366(true, 255, (byte) 0, this.anInt5775);
		}
		if (this.aClass1_Sub8_Sub1_1.aBoolean563) {
			return null;
		}
		@Pc(48) byte[] local48 = this.aClass1_Sub8_Sub1_1.method5914();
		if (this.aClass1_Sub8_Sub1_1 instanceof Class1_Sub8_Sub1_Sub1) {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass99_1 = new Class99(local48, this.anInt5784, this.aByteArray44);
				if (this.aClass99_1.anInt2730 != this.anInt5792) {
					throw new RuntimeException();
				}
			} catch (@Pc(79) RuntimeException local79) {
				this.aClass99_1 = null;
				if (this.aClass205_2.method4367()) {
					this.aClass1_Sub8_Sub1_1 = null;
				} else {
					this.aClass1_Sub8_Sub1_1 = this.aClass205_2.method4366(true, 255, (byte) 0, this.anInt5775);
				}
				return null;
			}
		} else {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass99_1 = new Class99(local48, this.anInt5784, this.aByteArray44);
			} catch (@Pc(123) RuntimeException local123) {
				this.aClass205_2.method4369();
				this.aClass99_1 = null;
				if (this.aClass205_2.method4367()) {
					this.aClass1_Sub8_Sub1_1 = null;
				} else {
					this.aClass1_Sub8_Sub1_1 = this.aClass205_2.method4366(true, 255, (byte) 0, this.anInt5775);
				}
				return null;
			}
			if (this.aClass313_4 != null) {
				this.aClass228_3.method4908(this.aClass313_4, local48, this.anInt5775);
			}
		}
		if (this.aClass313_3 != null) {
			this.aByteArray45 = new byte[this.aClass99_1.anInt2727];
			this.anInt5787 = 0;
		}
		this.aClass1_Sub8_Sub1_1 = null;
		return this.aClass99_1;
	}

	@OriginalMember(owner = "client!mc", name = "b", descriptor = "(I)V")
	public void method4693() {
		if (this.aClass111_35 != null) {
			if (this.method4683() == null) {
				return;
			}
			@Pc(26) boolean local26;
			@Pc(31) Class1 local31;
			@Pc(37) int local37;
			@Pc(128) Class1 local128;
			if (this.aBoolean448) {
				local26 = true;
				for (local31 = this.aClass111_35.method2547(); local31 != null; local31 = this.aClass111_35.method2554()) {
					local37 = (int) local31.aLong268;
					if (this.aByteArray45[local37] == 0) {
						this.method4692(1, local37);
					}
					if (this.aByteArray45[local37] == 0) {
						local26 = false;
					} else {
						local31.method7908();
					}
				}
				while (this.aClass99_1.anIntArray118.length > this.anInt5793) {
					if (this.aClass99_1.anIntArray118[this.anInt5793] == 0) {
						this.anInt5793++;
					} else {
						if (this.aClass228_3.anInt6065 >= 250) {
							local26 = false;
							break;
						}
						if (this.aByteArray45[this.anInt5793] == 0) {
							this.method4692(1, this.anInt5793);
						}
						if (this.aByteArray45[this.anInt5793] == 0) {
							local128 = new Class1();
							local128.aLong268 = this.anInt5793;
							local26 = false;
							this.aClass111_35.method2552(local128);
						}
						this.anInt5793++;
					}
				}
				if (local26) {
					this.anInt5793 = 0;
					this.aBoolean448 = false;
				}
			} else if (this.aBoolean449) {
				local26 = true;
				for (local31 = this.aClass111_35.method2547(); local31 != null; local31 = this.aClass111_35.method2554()) {
					local37 = (int) local31.aLong268;
					if (this.aByteArray45[local37] != 1) {
						this.method4692(2, local37);
					}
					if (this.aByteArray45[local37] == 1) {
						local31.method7908();
					} else {
						local26 = false;
					}
				}
				while (this.aClass99_1.anIntArray118.length > this.anInt5793) {
					if (this.aClass99_1.anIntArray118[this.anInt5793] == 0) {
						this.anInt5793++;
					} else {
						if (this.aClass205_2.method4360()) {
							local26 = false;
							break;
						}
						if (this.aByteArray45[this.anInt5793] != 1) {
							this.method4692(2, this.anInt5793);
						}
						if (this.aByteArray45[this.anInt5793] != 1) {
							local128 = new Class1();
							local128.aLong268 = this.anInt5793;
							local26 = false;
							this.aClass111_35.method2552(local128);
						}
						this.anInt5793++;
					}
				}
				if (local26) {
					this.anInt5793 = 0;
					this.aBoolean449 = false;
				}
			} else {
				this.aClass111_35 = null;
			}
		}
		if (!this.aBoolean450 || this.aLong141 > Static480.method6650()) {
			return;
		}
		for (@Pc(320) Class1_Sub8_Sub1 local320 = (Class1_Sub8_Sub1) this.aClass91_25.method2278(); local320 != null; local320 = (Class1_Sub8_Sub1) this.aClass91_25.method2276()) {
			if (!local320.aBoolean563) {
				if (local320.aBoolean565) {
					if (!local320.aBoolean564) {
						throw new RuntimeException();
					}
					local320.method7908();
				} else {
					local320.aBoolean565 = true;
				}
			}
		}
		this.aLong141 = Static480.method6650() + 1000L;
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(II)[B")
	@Override
	public byte[] method4688(@OriginalArg(0) int arg0) {
		@Pc(9) Class1_Sub8_Sub1 local9 = this.method4692(0, arg0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(22) byte[] local22 = local9.method5914();
			local9.method7908();
			return local22;
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)V")
	public void method4695() {
		if (this.aClass313_3 != null) {
			this.aBoolean449 = true;
			if (this.aClass111_35 == null) {
				this.aClass111_35 = new Class111();
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(I)V")
	public void method4696() {
		if (this.aClass111_35 == null || this.method4683() == null) {
			return;
		}
		for (@Pc(19) Class1 local19 = this.aClass111_36.method2547(); local19 != null; local19 = this.aClass111_36.method2554()) {
			@Pc(25) int local25 = (int) local19.aLong268;
			if (local25 < 0 || local25 >= this.aClass99_1.anInt2727 || this.aClass99_1.anIntArray118[local25] == 0) {
				local19.method7908();
			} else {
				if (this.aByteArray45[local25] == 0) {
					this.method4692(1, local25);
				}
				if (this.aByteArray45[local25] == -1) {
					this.method4692(2, local25);
				}
				if (this.aByteArray45[local25] == 1) {
					local19.method7908();
				}
			}
		}
	}

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(II)V")
	@Override
	public void method4687(@OriginalArg(0) int arg0) {
		if (this.aClass313_3 == null) {
			return;
		}
		for (@Pc(14) Class1 local14 = this.aClass111_36.method2547(); local14 != null; local14 = this.aClass111_36.method2554()) {
			if ((long) arg0 == local14.aLong268) {
				return;
			}
		}
		@Pc(42) Class1 local42 = new Class1();
		local42.aLong268 = arg0;
		this.aClass111_36.method2552(local42);
	}

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)I")
	public int method4697() {
		if (this.method4683() == null) {
			return this.aClass1_Sub8_Sub1_1 == null ? 0 : this.aClass1_Sub8_Sub1_1.method5911();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)I")
	public int method4698() {
		if (this.aClass99_1 == null) {
			return 0;
		} else if (this.aBoolean448) {
			@Pc(26) Class1 local26 = this.aClass111_35.method2547();
			return local26 == null ? 0 : (int) local26.aLong268;
		} else {
			return this.aClass99_1.anInt2728;
		}
	}

	@OriginalMember(owner = "client!mc", name = "e", descriptor = "(B)I")
	public int method4699() {
		return this.anInt5787;
	}
}
