import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!o")
public final class Class240_Sub1 extends Class240 {

	@OriginalMember(owner = "client!o", name = "g", descriptor = "[B")
	private byte[] aByteArray67;

	@OriginalMember(owner = "client!o", name = "m", descriptor = "Lclient!pq;")
	private Class267 aClass267_1;

	@OriginalMember(owner = "client!o", name = "L", descriptor = "Z")
	private boolean aBoolean484;

	@OriginalMember(owner = "client!o", name = "l", descriptor = "I")
	private int anInt7014 = 0;

	@OriginalMember(owner = "client!o", name = "e", descriptor = "Lclient!mo;")
	private final Class221 aClass221_24 = new Class221(16);

	@OriginalMember(owner = "client!o", name = "N", descriptor = "I")
	private int anInt7031 = 0;

	@OriginalMember(owner = "client!o", name = "M", descriptor = "Lclient!au;")
	private final Class22 aClass22_47 = new Class22();

	@OriginalMember(owner = "client!o", name = "Q", descriptor = "J")
	private long aLong188 = 0L;

	@OriginalMember(owner = "client!o", name = "A", descriptor = "I")
	private final int anInt7023;

	@OriginalMember(owner = "client!o", name = "o", descriptor = "Lclient!vm;")
	private final Class346 aClass346_4;

	@OriginalMember(owner = "client!o", name = "O", descriptor = "Z")
	private boolean aBoolean485;

	@OriginalMember(owner = "client!o", name = "K", descriptor = "Lclient!au;")
	private Class22 aClass22_46;

	@OriginalMember(owner = "client!o", name = "u", descriptor = "Lclient!dga;")
	private final Class72 aClass72_2;

	@OriginalMember(owner = "client!o", name = "G", descriptor = "I")
	private final int anInt7028;

	@OriginalMember(owner = "client!o", name = "z", descriptor = "Lclient!ms;")
	private final Class225 aClass225_3;

	@OriginalMember(owner = "client!o", name = "d", descriptor = "Lclient!vm;")
	private final Class346 aClass346_3;

	@OriginalMember(owner = "client!o", name = "P", descriptor = "Z")
	private final boolean aBoolean486;

	@OriginalMember(owner = "client!o", name = "B", descriptor = "[B")
	private final byte[] aByteArray68;

	@OriginalMember(owner = "client!o", name = "n", descriptor = "I")
	private final int anInt7015;

	@OriginalMember(owner = "client!o", name = "i", descriptor = "Lclient!hv;")
	private Class4_Sub6_Sub6 aClass4_Sub6_Sub6_1;

	@OriginalMember(owner = "client!o", name = "<init>", descriptor = "(ILclient!vm;Lclient!vm;Lclient!dga;Lclient!ms;I[BIZ)V")
	public Class240_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class346 arg1, @OriginalArg(2) Class346 arg2, @OriginalArg(3) Class72 arg3, @OriginalArg(4) Class225 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt7023 = arg0;
		this.aClass346_4 = arg1;
		if (this.aClass346_4 == null) {
			this.aBoolean485 = false;
		} else {
			this.aBoolean485 = true;
			this.aClass22_46 = new Class22();
		}
		this.aClass72_2 = arg3;
		this.anInt7028 = arg5;
		this.aClass225_3 = arg4;
		this.aClass346_3 = arg2;
		this.aBoolean486 = arg8;
		this.aByteArray68 = arg6;
		this.anInt7015 = arg7;
		if (this.aClass346_3 != null) {
			this.aClass4_Sub6_Sub6_1 = this.aClass225_3.method5103(this.anInt7023, this.aClass346_3);
		}
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(II)V")
	@Override
	public void method5490(@OriginalArg(1) int arg0) {
		if (this.aClass346_4 == null) {
			return;
		}
		for (@Pc(20) Class4 local20 = this.aClass22_47.method895(); local20 != null; local20 = this.aClass22_47.method889()) {
			if ((long) arg0 == local20.aLong295) {
				return;
			}
		}
		@Pc(44) Class4 local44 = new Class4();
		local44.aLong295 = arg0;
		this.aClass22_47.method894(local44);
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] method5488(@OriginalArg(0) int arg0) {
		@Pc(14) Class4_Sub6_Sub6 local14 = this.method5493(0, arg0);
		if (local14 == null) {
			return null;
		} else {
			@Pc(22) byte[] local22 = local14.method6777();
			local14.method8193();
			return local22;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(B)I")
	public int method5491() {
		return this.aClass267_1 == null ? 0 : this.aClass267_1.anInt7969;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(I)Lclient!pq;")
	@Override
	public Class267 method5489() {
		if (this.aClass267_1 != null) {
			return this.aClass267_1;
		}
		if (this.aClass4_Sub6_Sub6_1 == null) {
			if (this.aClass72_2.method1865()) {
				return null;
			}
			this.aClass4_Sub6_Sub6_1 = this.aClass72_2.method1851(this.anInt7023, (byte) 0, 255, true);
		}
		if (this.aClass4_Sub6_Sub6_1.aBoolean619) {
			return null;
		}
		@Pc(48) byte[] local48 = this.aClass4_Sub6_Sub6_1.method6777();
		if (this.aClass4_Sub6_Sub6_1 instanceof Class4_Sub6_Sub6_Sub2) {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass267_1 = new Class267(local48, this.anInt7028, this.aByteArray68);
				if (this.anInt7015 != this.aClass267_1.anInt7967) {
					throw new RuntimeException();
				}
			} catch (@Pc(142) RuntimeException local142) {
				this.aClass267_1 = null;
				if (this.aClass72_2.method1865()) {
					this.aClass4_Sub6_Sub6_1 = null;
				} else {
					this.aClass4_Sub6_Sub6_1 = this.aClass72_2.method1851(this.anInt7023, (byte) 0, 255, true);
				}
				return null;
			}
		} else {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass267_1 = new Class267(local48, this.anInt7028, this.aByteArray68);
			} catch (@Pc(70) RuntimeException local70) {
				this.aClass72_2.method1856();
				this.aClass267_1 = null;
				if (this.aClass72_2.method1865()) {
					this.aClass4_Sub6_Sub6_1 = null;
				} else {
					this.aClass4_Sub6_Sub6_1 = this.aClass72_2.method1851(this.anInt7023, (byte) 0, 255, true);
				}
				return null;
			}
			if (this.aClass346_3 != null) {
				this.aClass225_3.method5102(local48, this.aClass346_3, this.anInt7023);
			}
		}
		if (this.aClass346_4 != null) {
			this.anInt7014 = 0;
			this.aByteArray67 = new byte[this.aClass267_1.anInt7966];
		}
		this.aClass4_Sub6_Sub6_1 = null;
		return this.aClass267_1;
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(BII)Lclient!hv;")
	private Class4_Sub6_Sub6 method5493(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(18) Class4_Sub6_Sub6 local18 = (Class4_Sub6_Sub6) this.aClass221_24.method5075((long) arg1);
		if (local18 != null && arg0 == 0 && !local18.aBoolean617 && local18.aBoolean619) {
			local18.method8193();
			local18 = null;
		}
		if (local18 == null) {
			if (arg0 == 0) {
				if (this.aClass346_4 == null || this.aByteArray67[arg1] == -1) {
					if (this.aClass72_2.method1865()) {
						return null;
					}
					local18 = this.aClass72_2.method1851(arg1, (byte) 2, this.anInt7023, true);
				} else {
					local18 = this.aClass225_3.method5103(arg1, this.aClass346_4);
				}
			} else if (arg0 == 1) {
				if (this.aClass346_4 == null) {
					throw new RuntimeException();
				}
				local18 = this.aClass225_3.method5104(this.aClass346_4, arg1);
			} else if (arg0 == 2) {
				if (this.aClass346_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray67[arg1] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass72_2.method1857()) {
					return null;
				}
				local18 = this.aClass72_2.method1851(arg1, (byte) 2, this.anInt7023, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass221_24.method5073(local18, (long) arg1);
		}
		if (local18.aBoolean619) {
			return null;
		}
		@Pc(161) byte[] local161 = local18.method6777();
		@Pc(190) int local190;
		@Pc(221) byte[] local221;
		@Pc(230) byte[] local230;
		@Pc(232) int local232;
		@Pc(288) Class4_Sub6_Sub6_Sub1 local288;
		if (!(local18 instanceof Class4_Sub6_Sub6_Sub2)) {
			try {
				if (local161 == null || local161.length <= 2) {
					throw new RuntimeException();
				}
				Static517.aCRC32_140.reset();
				Static517.aCRC32_140.update(local161, 0, local161.length - 2);
				local190 = (int) Static517.aCRC32_140.getValue();
				if (local190 != this.aClass267_1.anIntArray443[arg1]) {
					throw new RuntimeException();
				}
				if (this.aClass267_1.aByteArrayArray24 != null && this.aClass267_1.aByteArrayArray24[arg1] != null) {
					local221 = this.aClass267_1.aByteArrayArray24[arg1];
					local230 = Static236.method3843(local161.length - 2, local161, 0);
					for (local232 = 0; local232 < 64; local232++) {
						if (local230[local232] != local221[local232]) {
							throw new RuntimeException();
						}
					}
				}
				this.aClass72_2.anInt2351 = 0;
				this.aClass72_2.anInt2352 = 0;
			} catch (@Pc(261) RuntimeException local261) {
				this.aClass72_2.method1856();
				local18.method8193();
				if (local18.aBoolean617 && !this.aClass72_2.method1865()) {
					local288 = this.aClass72_2.method1851(arg1, (byte) 2, this.anInt7023, true);
					this.aClass221_24.method5073(local288, (long) arg1);
				}
				return null;
			}
			local161[local161.length - 2] = (byte) (this.aClass267_1.anIntArray446[arg1] >>> 8);
			local161[local161.length - 1] = (byte) this.aClass267_1.anIntArray446[arg1];
			if (this.aClass346_4 != null) {
				this.aClass225_3.method5102(local161, this.aClass346_4, arg1);
				if (this.aByteArray67[arg1] != 1) {
					this.anInt7014++;
					this.aByteArray67[arg1] = 1;
				}
			}
			if (!local18.aBoolean617) {
				local18.method8193();
			}
			return local18;
		}
		try {
			if (local161 == null || local161.length <= 2) {
				throw new RuntimeException();
			}
			Static517.aCRC32_140.reset();
			Static517.aCRC32_140.update(local161, 0, local161.length - 2);
			local190 = (int) Static517.aCRC32_140.getValue();
			if (local190 != this.aClass267_1.anIntArray443[arg1]) {
				throw new RuntimeException();
			}
			if (this.aClass267_1.aByteArrayArray24 != null && this.aClass267_1.aByteArrayArray24[arg1] != null) {
				local221 = this.aClass267_1.aByteArrayArray24[arg1];
				local230 = Static236.method3843(local161.length - 2, local161, 0);
				for (local232 = 0; local232 < 64; local232++) {
					if (local221[local232] != local230[local232]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(465) int local465 = (local161[local161.length - 1] & 0xFF) + ((local161[local161.length - 2] & 0xFF) << 8);
			if (local465 != (this.aClass267_1.anIntArray446[arg1] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray67[arg1] != 1) {
				this.anInt7014++;
				this.aByteArray67[arg1] = 1;
			}
			if (!local18.aBoolean617) {
				local18.method8193();
			}
			return local18;
		} catch (@Pc(504) Exception local504) {
			this.aByteArray67[arg1] = -1;
			local18.method8193();
			if (local18.aBoolean617 && !this.aClass72_2.method1865()) {
				local288 = this.aClass72_2.method1851(arg1, (byte) 2, this.anInt7023, true);
				this.aClass221_24.method5073(local288, (long) arg1);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(I)I")
	public int method5495() {
		return this.anInt7014;
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V")
	public void method5496() {
		if (this.aClass22_46 != null) {
			if (this.method5489() == null) {
				return;
			}
			@Pc(21) boolean local21;
			@Pc(26) Class4 local26;
			@Pc(32) int local32;
			@Pc(119) Class4 local119;
			if (this.aBoolean485) {
				local21 = true;
				for (local26 = this.aClass22_46.method895(); local26 != null; local26 = this.aClass22_46.method889()) {
					local32 = (int) local26.aLong295;
					if (this.aByteArray67[local32] == 0) {
						this.method5493(1, local32);
					}
					if (this.aByteArray67[local32] == 0) {
						local21 = false;
					} else {
						local26.method8193();
					}
				}
				while (this.aClass267_1.anIntArray445.length > this.anInt7031) {
					if (this.aClass267_1.anIntArray445[this.anInt7031] == 0) {
						this.anInt7031++;
					} else {
						if (this.aClass225_3.anInt6471 >= 250) {
							local21 = false;
							break;
						}
						if (this.aByteArray67[this.anInt7031] == 0) {
							this.method5493(1, this.anInt7031);
						}
						if (this.aByteArray67[this.anInt7031] == 0) {
							local119 = new Class4();
							local119.aLong295 = this.anInt7031;
							local21 = false;
							this.aClass22_46.method894(local119);
						}
						this.anInt7031++;
					}
				}
				if (local21) {
					this.anInt7031 = 0;
					this.aBoolean485 = false;
				}
			} else if (this.aBoolean484) {
				local21 = true;
				for (local26 = this.aClass22_46.method895(); local26 != null; local26 = this.aClass22_46.method889()) {
					local32 = (int) local26.aLong295;
					if (this.aByteArray67[local32] != 1) {
						this.method5493(2, local32);
					}
					if (this.aByteArray67[local32] == 1) {
						local26.method8193();
					} else {
						local21 = false;
					}
				}
				while (this.aClass267_1.anIntArray445.length > this.anInt7031) {
					if (this.aClass267_1.anIntArray445[this.anInt7031] == 0) {
						this.anInt7031++;
					} else {
						if (this.aClass72_2.method1857()) {
							local21 = false;
							break;
						}
						if (this.aByteArray67[this.anInt7031] != 1) {
							this.method5493(2, this.anInt7031);
						}
						if (this.aByteArray67[this.anInt7031] != 1) {
							local119 = new Class4();
							local119.aLong295 = this.anInt7031;
							local21 = false;
							this.aClass22_46.method894(local119);
						}
						this.anInt7031++;
					}
				}
				if (local21) {
					this.anInt7031 = 0;
					this.aBoolean484 = false;
				}
			} else {
				this.aClass22_46 = null;
			}
		}
		if (!this.aBoolean486 || this.aLong188 > Static112.method2047()) {
			return;
		}
		for (@Pc(326) Class4_Sub6_Sub6 local326 = (Class4_Sub6_Sub6) this.aClass221_24.method5072(); local326 != null; local326 = (Class4_Sub6_Sub6) this.aClass221_24.method5071()) {
			if (!local326.aBoolean619) {
				if (local326.aBoolean618) {
					if (!local326.aBoolean617) {
						throw new RuntimeException();
					}
					local326.method8193();
				} else {
					local326.aBoolean618 = true;
				}
			}
		}
		this.aLong188 = Static112.method2047() + 1000L;
	}

	@OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V")
	public void method5497() {
		if (this.aClass22_46 == null || this.method5489() == null) {
			return;
		}
		for (@Pc(19) Class4 local19 = this.aClass22_47.method895(); local19 != null; local19 = this.aClass22_47.method889()) {
			@Pc(25) int local25 = (int) local19.aLong295;
			if (local25 < 0 || this.aClass267_1.anInt7966 <= local25 || this.aClass267_1.anIntArray445[local25] == 0) {
				local19.method8193();
			} else {
				if (this.aByteArray67[local25] == 0) {
					this.method5493(1, local25);
				}
				if (this.aByteArray67[local25] == -1) {
					this.method5493(2, local25);
				}
				if (this.aByteArray67[local25] == 1) {
					local19.method8193();
				}
			}
		}
	}

	@OriginalMember(owner = "client!o", name = "e", descriptor = "(I)I")
	public int method5498() {
		if (this.method5489() == null) {
			return this.aClass4_Sub6_Sub6_1 == null ? 0 : this.aClass4_Sub6_Sub6_1.method6779();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!o", name = "a", descriptor = "(II)I")
	@Override
	public int method5487(@OriginalArg(0) int arg0) {
		@Pc(11) Class4_Sub6_Sub6 local11 = (Class4_Sub6_Sub6) this.aClass221_24.method5075((long) arg0);
		return local11 == null ? 0 : local11.method6779();
	}

	@OriginalMember(owner = "client!o", name = "b", descriptor = "(Z)I")
	public int method5499() {
		if (this.aClass267_1 == null) {
			return 0;
		} else if (this.aBoolean485) {
			@Pc(25) Class4 local25 = this.aClass22_46.method895();
			return local25 == null ? 0 : (int) local25.aLong295;
		} else {
			return this.aClass267_1.anInt7969;
		}
	}

	@OriginalMember(owner = "client!o", name = "c", descriptor = "(B)V")
	public void method5500() {
		if (this.aClass346_4 != null) {
			this.aBoolean484 = true;
			if (this.aClass22_46 == null) {
				this.aClass22_46 = new Class22();
			}
		}
	}
}
