import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class138_Sub1 extends Class138 {

	@OriginalMember(owner = "client!ne", name = "l", descriptor = "Lclient!vk;")
	private Class206 aClass206_1;

	@OriginalMember(owner = "client!ne", name = "p", descriptor = "[B")
	private byte[] aByteArray63;

	@OriginalMember(owner = "client!ne", name = "M", descriptor = "Z")
	private boolean aBoolean283;

	@OriginalMember(owner = "client!ne", name = "B", descriptor = "I")
	private int anInt4202 = 0;

	@OriginalMember(owner = "client!ne", name = "u", descriptor = "Lclient!ec;")
	private final Class58 aClass58_19 = new Class58(16);

	@OriginalMember(owner = "client!ne", name = "K", descriptor = "I")
	private int anInt4207 = 0;

	@OriginalMember(owner = "client!ne", name = "N", descriptor = "Lclient!aq;")
	private final Class16 aClass16_33 = new Class16();

	@OriginalMember(owner = "client!ne", name = "R", descriptor = "J")
	private long aLong118 = 0L;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
	private final int anInt4190;

	@OriginalMember(owner = "client!ne", name = "H", descriptor = "Lclient!r;")
	private final Class171 aClass171_2;

	@OriginalMember(owner = "client!ne", name = "O", descriptor = "Z")
	private boolean aBoolean284;

	@OriginalMember(owner = "client!ne", name = "L", descriptor = "Lclient!aq;")
	private Class16 aClass16_32;

	@OriginalMember(owner = "client!ne", name = "D", descriptor = "I")
	private final int anInt4203;

	@OriginalMember(owner = "client!ne", name = "P", descriptor = "Z")
	private final boolean aBoolean285;

	@OriginalMember(owner = "client!ne", name = "C", descriptor = "Lclient!rb;")
	private final Class172 aClass172_2;

	@OriginalMember(owner = "client!ne", name = "v", descriptor = "Lclient!r;")
	private final Class171 aClass171_1;

	@OriginalMember(owner = "client!ne", name = "I", descriptor = "Lclient!cl;")
	private final Class40 aClass40_3;

	@OriginalMember(owner = "client!ne", name = "z", descriptor = "I")
	private final int anInt4200;

	@OriginalMember(owner = "client!ne", name = "j", descriptor = "Lclient!eo;")
	private Class11_Sub4_Sub1 aClass11_Sub4_Sub1_1;

	@OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(ILclient!r;Lclient!r;Lclient!rb;Lclient!cl;IIZ)V")
	public Class138_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class171 arg1, @OriginalArg(2) Class171 arg2, @OriginalArg(3) Class172 arg3, @OriginalArg(4) Class40 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.anInt4190 = arg0;
		this.aClass171_2 = arg1;
		if (this.aClass171_2 == null) {
			this.aBoolean284 = false;
		} else {
			this.aBoolean284 = true;
			this.aClass16_32 = new Class16();
		}
		this.anInt4203 = arg6;
		this.aBoolean285 = arg7;
		this.aClass172_2 = arg3;
		this.aClass171_1 = arg2;
		this.aClass40_3 = arg4;
		this.anInt4200 = arg5;
		if (this.aClass171_1 != null) {
			this.aClass11_Sub4_Sub1_1 = this.aClass40_3.method588(this.anInt4190, this.aClass171_1);
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Z)I")
	public int method3689() {
		return this.aClass206_1 == null ? 0 : this.aClass206_1.anInt6423;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
	public void method3690() {
		if (this.aClass16_32 == null || this.method3685() == null) {
			return;
		}
		for (@Pc(25) Class11 local25 = this.aClass16_33.method193(); local25 != null; local25 = this.aClass16_33.method188()) {
			@Pc(31) int local31 = (int) local25.aLong215;
			if (local31 < 0 || local31 >= this.aClass206_1.anInt6422 || this.aClass206_1.anIntArray532[local31] == 0) {
				local25.method5701();
			} else {
				if (this.aByteArray63[local31] == 0) {
					this.method3702(local31, 1);
				}
				if (this.aByteArray63[local31] == -1) {
					this.method3702(local31, 2);
				}
				if (this.aByteArray63[local31] == 1) {
					local25.method5701();
				}
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(B)I")
	public int method3692() {
		if (this.aClass206_1 == null) {
			return 0;
		} else if (this.aBoolean284) {
			@Pc(26) Class11 local26 = this.aClass16_32.method193();
			return local26 == null ? 0 : (int) local26.aLong215;
		} else {
			return this.aClass206_1.anInt6423;
		}
	}

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V")
	public void method3693() {
		if (this.aClass16_32 != null) {
			if (this.method3685() == null) {
				return;
			}
			@Pc(29) boolean local29;
			@Pc(34) Class11 local34;
			@Pc(40) int local40;
			@Pc(134) Class11 local134;
			if (this.aBoolean284) {
				local29 = true;
				for (local34 = this.aClass16_32.method193(); local34 != null; local34 = this.aClass16_32.method188()) {
					local40 = (int) local34.aLong215;
					if (this.aByteArray63[local40] == 0) {
						this.method3702(local40, 1);
					}
					if (this.aByteArray63[local40] == 0) {
						local29 = false;
					} else {
						local34.method5701();
					}
				}
				while (this.anInt4207 < this.aClass206_1.anIntArray532.length) {
					if (this.aClass206_1.anIntArray532[this.anInt4207] == 0) {
						this.anInt4207++;
					} else {
						if (this.aClass40_3.anInt749 >= 250) {
							local29 = false;
							break;
						}
						if (this.aByteArray63[this.anInt4207] == 0) {
							this.method3702(this.anInt4207, 1);
						}
						if (this.aByteArray63[this.anInt4207] == 0) {
							local134 = new Class11();
							local134.aLong215 = this.anInt4207;
							this.aClass16_32.method190(local134);
							local29 = false;
						}
						this.anInt4207++;
					}
				}
				if (local29) {
					this.anInt4207 = 0;
					this.aBoolean284 = false;
				}
			} else if (this.aBoolean283) {
				local29 = true;
				for (local34 = this.aClass16_32.method193(); local34 != null; local34 = this.aClass16_32.method188()) {
					local40 = (int) local34.aLong215;
					if (this.aByteArray63[local40] != 1) {
						this.method3702(local40, 2);
					}
					if (this.aByteArray63[local40] == 1) {
						local34.method5701();
					} else {
						local29 = false;
					}
				}
				while (this.anInt4207 < this.aClass206_1.anIntArray532.length) {
					if (this.aClass206_1.anIntArray532[this.anInt4207] == 0) {
						this.anInt4207++;
					} else {
						if (this.aClass172_2.method4568()) {
							local29 = false;
							break;
						}
						if (this.aByteArray63[this.anInt4207] != 1) {
							this.method3702(this.anInt4207, 2);
						}
						if (this.aByteArray63[this.anInt4207] != 1) {
							local134 = new Class11();
							local134.aLong215 = this.anInt4207;
							this.aClass16_32.method190(local134);
							local29 = false;
						}
						this.anInt4207++;
					}
				}
				if (local29) {
					this.aBoolean283 = false;
					this.anInt4207 = 0;
				}
			} else {
				this.aClass16_32 = null;
			}
		}
		if (!this.aBoolean285 || Static268.method4627() < this.aLong118) {
			return;
		}
		for (@Pc(332) Class11_Sub4_Sub1 local332 = (Class11_Sub4_Sub1) this.aClass58_19.method1008(); local332 != null; local332 = (Class11_Sub4_Sub1) this.aClass58_19.method1004()) {
			if (!local332.aBoolean359) {
				if (local332.aBoolean361) {
					if (!local332.aBoolean360) {
						throw new RuntimeException();
					}
					local332.method5701();
				} else {
					local332.aBoolean361 = true;
				}
			}
		}
		this.aLong118 = Static268.method4627() + 1000L;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V")
	@Override
	public void method3682(@OriginalArg(1) int arg0) {
		if (this.aClass171_2 == null) {
			return;
		}
		for (@Pc(18) Class11 local18 = this.aClass16_33.method193(); local18 != null; local18 = this.aClass16_33.method188()) {
			if ((long) arg0 == local18.aLong215) {
				return;
			}
		}
		@Pc(42) Class11 local42 = new Class11();
		local42.aLong215 = arg0;
		this.aClass16_33.method190(local42);
	}

	@OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)I")
	public int method3698() {
		return this.anInt4202;
	}

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V")
	public void method3699() {
		if (this.aClass171_2 != null) {
			this.aBoolean283 = true;
			if (this.aClass16_32 == null) {
				this.aClass16_32 = new Class16();
			}
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)I")
	@Override
	public int method3688(@OriginalArg(0) int arg0) {
		@Pc(19) Class11_Sub4_Sub1 local19 = (Class11_Sub4_Sub1) this.aClass58_19.method1009((long) arg0);
		return local19 == null ? 0 : local19.method4699();
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(Z)I")
	public int method3700() {
		if (this.method3685() == null) {
			return this.aClass11_Sub4_Sub1_1 == null ? 0 : this.aClass11_Sub4_Sub1_1.method4699();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)Lclient!eo;")
	private Class11_Sub4_Sub1 method3702(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class11_Sub4_Sub1 local13 = (Class11_Sub4_Sub1) this.aClass58_19.method1009((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean360 && local13.aBoolean359) {
			local13.method5701();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass171_2 == null || this.aByteArray63[arg0] == -1) {
					if (this.aClass172_2.method4571()) {
						return null;
					}
					local13 = this.aClass172_2.method4566(arg0, true, (byte) 2, this.anInt4190);
				} else {
					local13 = this.aClass40_3.method588(arg0, this.aClass171_2);
				}
			} else if (arg1 == 1) {
				if (this.aClass171_2 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass40_3.method587(this.aClass171_2, arg0);
			} else if (arg1 == 2) {
				if (this.aClass171_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray63[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass172_2.method4568()) {
					return null;
				}
				local13 = this.aClass172_2.method4566(arg0, false, (byte) 2, this.anInt4190);
			} else {
				throw new RuntimeException();
			}
			this.aClass58_19.method1006((long) arg0, local13);
		}
		if (local13.aBoolean359) {
			return null;
		}
		@Pc(161) byte[] local161 = local13.method4696();
		@Pc(190) int local190;
		@Pc(242) Class11_Sub4_Sub1_Sub1 local242;
		if (!(local13 instanceof Class11_Sub4_Sub1_Sub2)) {
			try {
				if (local161 == null || local161.length <= 2) {
					throw new RuntimeException();
				}
				Static132.aCRC32_1.reset();
				Static132.aCRC32_1.update(local161, 0, local161.length - 2);
				local190 = (int) Static132.aCRC32_1.getValue();
				if (local190 != this.aClass206_1.anIntArray533[arg0]) {
					throw new RuntimeException();
				}
				this.aClass172_2.anInt5413 = 0;
				this.aClass172_2.anInt5414 = 0;
			} catch (@Pc(215) RuntimeException local215) {
				this.aClass172_2.method4567();
				local13.method5701();
				if (local13.aBoolean360 && !this.aClass172_2.method4571()) {
					local242 = this.aClass172_2.method4566(arg0, true, (byte) 2, this.anInt4190);
					this.aClass58_19.method1006((long) arg0, local242);
				}
				return null;
			}
			local161[local161.length - 2] = (byte) (this.aClass206_1.anIntArray527[arg0] >>> 8);
			local161[local161.length - 1] = (byte) this.aClass206_1.anIntArray527[arg0];
			if (this.aClass171_2 != null) {
				this.aClass40_3.method592(local161, this.aClass171_2, arg0);
				if (this.aByteArray63[arg0] != 1) {
					this.anInt4202++;
					this.aByteArray63[arg0] = 1;
				}
			}
			if (!local13.aBoolean360) {
				local13.method5701();
			}
			return local13;
		}
		try {
			if (local161 == null || local161.length <= 2) {
				throw new RuntimeException();
			}
			Static132.aCRC32_1.reset();
			Static132.aCRC32_1.update(local161, 0, local161.length - 2);
			local190 = (int) Static132.aCRC32_1.getValue();
			if (local190 != this.aClass206_1.anIntArray533[arg0]) {
				throw new RuntimeException();
			}
			@Pc(377) int local377 = (local161[local161.length - 1] & 0xFF) + ((local161[local161.length - 2] & 0xFF) << 8);
			if (local377 != (this.aClass206_1.anIntArray527[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray63[arg0] != 1) {
				this.anInt4202++;
				this.aByteArray63[arg0] = 1;
			}
			if (!local13.aBoolean360) {
				local13.method5701();
			}
			return local13;
		} catch (@Pc(420) Exception local420) {
			this.aByteArray63[arg0] = -1;
			local13.method5701();
			if (local13.aBoolean360 && !this.aClass172_2.method4571()) {
				local242 = this.aClass172_2.method4566(arg0, true, (byte) 2, this.anInt4190);
				this.aClass58_19.method1006((long) arg0, local242);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "(I)Lclient!vk;")
	@Override
	public Class206 method3685() {
		if (this.aClass206_1 != null) {
			return this.aClass206_1;
		}
		if (this.aClass11_Sub4_Sub1_1 == null) {
			if (this.aClass172_2.method4571()) {
				return null;
			}
			this.aClass11_Sub4_Sub1_1 = this.aClass172_2.method4566(this.anInt4190, true, (byte) 0, 255);
		}
		if (this.aClass11_Sub4_Sub1_1.aBoolean359) {
			return null;
		}
		@Pc(48) byte[] local48 = this.aClass11_Sub4_Sub1_1.method4696();
		if (this.aClass11_Sub4_Sub1_1 instanceof Class11_Sub4_Sub1_Sub2) {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass206_1 = new Class206(local48, this.anInt4200);
				if (this.anInt4203 != this.aClass206_1.anInt6427) {
					throw new RuntimeException();
				}
			} catch (@Pc(142) RuntimeException local142) {
				this.aClass206_1 = null;
				if (this.aClass172_2.method4571()) {
					this.aClass11_Sub4_Sub1_1 = null;
				} else {
					this.aClass11_Sub4_Sub1_1 = this.aClass172_2.method4566(this.anInt4190, true, (byte) 0, 255);
				}
				return null;
			}
		} else {
			try {
				if (local48 == null) {
					throw new RuntimeException();
				}
				this.aClass206_1 = new Class206(local48, this.anInt4200);
			} catch (@Pc(68) RuntimeException local68) {
				this.aClass172_2.method4567();
				this.aClass206_1 = null;
				if (this.aClass172_2.method4571()) {
					this.aClass11_Sub4_Sub1_1 = null;
				} else {
					this.aClass11_Sub4_Sub1_1 = this.aClass172_2.method4566(this.anInt4190, true, (byte) 0, 255);
				}
				return null;
			}
			if (this.aClass171_1 != null) {
				this.aClass40_3.method592(local48, this.aClass171_1, this.anInt4190);
			}
		}
		this.aClass11_Sub4_Sub1_1 = null;
		if (this.aClass171_2 != null) {
			this.anInt4202 = 0;
			this.aByteArray63 = new byte[this.aClass206_1.anInt6422];
		}
		return this.aClass206_1;
	}

	@OriginalMember(owner = "client!ne", name = "b", descriptor = "(II)[B")
	@Override
	public byte[] method3686(@OriginalArg(1) int arg0) {
		@Pc(9) Class11_Sub4_Sub1 local9 = this.method3702(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(25) byte[] local25 = local9.method4696();
			local9.method5701();
			return local25;
		}
	}
}
