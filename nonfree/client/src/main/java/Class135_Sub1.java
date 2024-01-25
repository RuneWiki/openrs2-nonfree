import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kn")
public final class Class135_Sub1 extends Class135 {

	@OriginalMember(owner = "client!kn", name = "n", descriptor = "[B")
	private byte[] aByteArray47;

	@OriginalMember(owner = "client!kn", name = "B", descriptor = "Lclient!dg;")
	private Class55 aClass55_2;

	@OriginalMember(owner = "client!kn", name = "K", descriptor = "Z")
	private boolean aBoolean251;

	@OriginalMember(owner = "client!kn", name = "y", descriptor = "I")
	private int anInt3417 = 0;

	@OriginalMember(owner = "client!kn", name = "A", descriptor = "Lclient!cp;")
	private final Class44 aClass44_19 = new Class44(16);

	@OriginalMember(owner = "client!kn", name = "I", descriptor = "I")
	private int anInt3422 = 0;

	@OriginalMember(owner = "client!kn", name = "J", descriptor = "Lclient!kr;")
	private final Class138 aClass138_24 = new Class138();

	@OriginalMember(owner = "client!kn", name = "Q", descriptor = "J")
	private long aLong132 = 0L;

	@OriginalMember(owner = "client!kn", name = "E", descriptor = "Lclient!rg;")
	private final Class204 aClass204_3;

	@OriginalMember(owner = "client!kn", name = "m", descriptor = "I")
	private final int anInt3408;

	@OriginalMember(owner = "client!kn", name = "O", descriptor = "Z")
	private boolean aBoolean253;

	@OriginalMember(owner = "client!kn", name = "L", descriptor = "Lclient!kr;")
	private Class138 aClass138_25;

	@OriginalMember(owner = "client!kn", name = "P", descriptor = "Z")
	private final boolean aBoolean254;

	@OriginalMember(owner = "client!kn", name = "p", descriptor = "Lclient!rg;")
	private final Class204 aClass204_2;

	@OriginalMember(owner = "client!kn", name = "l", descriptor = "Lclient!ci;")
	private final Class40 aClass40_1;

	@OriginalMember(owner = "client!kn", name = "r", descriptor = "I")
	private final int anInt3411;

	@OriginalMember(owner = "client!kn", name = "s", descriptor = "I")
	private final int anInt3412;

	@OriginalMember(owner = "client!kn", name = "j", descriptor = "Lclient!al;")
	private final Class11 aClass11_1;

	@OriginalMember(owner = "client!kn", name = "t", descriptor = "Lclient!ll;")
	private Class3_Sub7_Sub2 aClass3_Sub7_Sub2_1;

	@OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(ILclient!rg;Lclient!rg;Lclient!al;Lclient!ci;IIZ)V")
	public Class135_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class204 arg1, @OriginalArg(2) Class204 arg2, @OriginalArg(3) Class11 arg3, @OriginalArg(4) Class40 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass204_3 = arg1;
		this.anInt3408 = arg0;
		if (this.aClass204_3 == null) {
			this.aBoolean253 = false;
		} else {
			this.aBoolean253 = true;
			this.aClass138_25 = new Class138();
		}
		this.aBoolean254 = arg7;
		this.aClass204_2 = arg2;
		this.aClass40_1 = arg4;
		this.anInt3411 = arg6;
		this.anInt3412 = arg5;
		this.aClass11_1 = arg3;
		if (this.aClass204_2 != null) {
			this.aClass3_Sub7_Sub2_1 = this.aClass40_1.method693(this.aClass204_2, this.anInt3408);
		}
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)I")
	public int method2986() {
		if (this.aClass55_2 == null) {
			return 0;
		} else if (this.aBoolean253) {
			@Pc(26) Class3 local26 = this.aClass138_25.method3051();
			return local26 == null ? 0 : (int) local26.aLong240;
		} else {
			return this.aClass55_2.anInt1278;
		}
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(B)V")
	public void method2987() {
		if (this.aClass204_3 != null) {
			this.aBoolean251 = true;
			if (this.aClass138_25 == null) {
				this.aClass138_25 = new Class138();
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V")
	public void method2988() {
		if (this.aClass138_25 != null) {
			if (this.method2982() == null) {
				return;
			}
			@Pc(29) boolean local29;
			@Pc(34) Class3 local34;
			@Pc(40) int local40;
			@Pc(123) Class3 local123;
			if (this.aBoolean253) {
				local29 = true;
				for (local34 = this.aClass138_25.method3051(); local34 != null; local34 = this.aClass138_25.method3050()) {
					local40 = (int) local34.aLong240;
					if (this.aByteArray47[local40] == 0) {
						this.method2991(local40, 1);
					}
					if (this.aByteArray47[local40] == 0) {
						local29 = false;
					} else {
						local34.method5700();
					}
				}
				while (this.aClass55_2.anIntArray121.length > this.anInt3422) {
					if (this.aClass55_2.anIntArray121[this.anInt3422] == 0) {
						this.anInt3422++;
					} else {
						if (this.aClass40_1.anInt795 >= 250) {
							local29 = false;
							break;
						}
						if (this.aByteArray47[this.anInt3422] == 0) {
							this.method2991(this.anInt3422, 1);
						}
						if (this.aByteArray47[this.anInt3422] == 0) {
							local123 = new Class3();
							local123.aLong240 = this.anInt3422;
							local29 = false;
							this.aClass138_25.method3053(local123);
						}
						this.anInt3422++;
					}
				}
				if (local29) {
					this.aBoolean253 = false;
					this.anInt3422 = 0;
				}
			} else if (this.aBoolean251) {
				local29 = true;
				for (local34 = this.aClass138_25.method3051(); local34 != null; local34 = this.aClass138_25.method3050()) {
					local40 = (int) local34.aLong240;
					if (this.aByteArray47[local40] != 1) {
						this.method2991(local40, 2);
					}
					if (this.aByteArray47[local40] == 1) {
						local34.method5700();
					} else {
						local29 = false;
					}
				}
				while (this.anInt3422 < this.aClass55_2.anIntArray121.length) {
					if (this.aClass55_2.anIntArray121[this.anInt3422] == 0) {
						this.anInt3422++;
					} else {
						if (this.aClass11_1.method169()) {
							local29 = false;
							break;
						}
						if (this.aByteArray47[this.anInt3422] != 1) {
							this.method2991(this.anInt3422, 2);
						}
						if (this.aByteArray47[this.anInt3422] != 1) {
							local123 = new Class3();
							local123.aLong240 = this.anInt3422;
							local29 = false;
							this.aClass138_25.method3053(local123);
						}
						this.anInt3422++;
					}
				}
				if (local29) {
					this.anInt3422 = 0;
					this.aBoolean251 = false;
				}
			} else {
				this.aClass138_25 = null;
			}
		}
		if (!this.aBoolean254 || Static288.method4512() < this.aLong132) {
			return;
		}
		for (@Pc(318) Class3_Sub7_Sub2 local318 = (Class3_Sub7_Sub2) this.aClass44_19.method950(); local318 != null; local318 = (Class3_Sub7_Sub2) this.aClass44_19.method949()) {
			if (!local318.aBoolean387) {
				if (local318.aBoolean389) {
					if (!local318.aBoolean388) {
						throw new RuntimeException();
					}
					local318.method5700();
				} else {
					local318.aBoolean389 = true;
				}
			}
		}
		this.aLong132 = Static288.method4512() + 1000L;
	}

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)I")
	public int method2989() {
		if (this.method2982() == null) {
			return this.aClass3_Sub7_Sub2_1 == null ? 0 : this.aClass3_Sub7_Sub2_1.method4474();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZI)[B")
	@Override
	public byte[] method2981(@OriginalArg(1) int arg0) {
		@Pc(9) Class3_Sub7_Sub2 local9 = this.method2991(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(23) byte[] local23 = local9.method4473();
			local9.method5700();
			return local23;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)Lclient!ll;")
	private Class3_Sub7_Sub2 method2991(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(20) Class3_Sub7_Sub2 local20 = (Class3_Sub7_Sub2) this.aClass44_19.method942((long) arg0);
		if (local20 != null && arg1 == 0 && !local20.aBoolean388 && local20.aBoolean387) {
			local20.method5700();
			local20 = null;
		}
		if (local20 == null) {
			if (arg1 == 0) {
				if (this.aClass204_3 == null || this.aByteArray47[arg0] == -1) {
					if (this.aClass11_1.method158()) {
						return null;
					}
					local20 = this.aClass11_1.method157(true, arg0, this.anInt3408, (byte) 2);
				} else {
					local20 = this.aClass40_1.method693(this.aClass204_3, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass204_3 == null) {
					throw new RuntimeException();
				}
				local20 = this.aClass40_1.method698(arg0, this.aClass204_3);
			} else if (arg1 == 2) {
				if (this.aClass204_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray47[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass11_1.method169()) {
					return null;
				}
				local20 = this.aClass11_1.method157(false, arg0, this.anInt3408, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass44_19.method948((long) arg0, local20);
		}
		if (local20.aBoolean387) {
			return null;
		}
		@Pc(159) byte[] local159 = local20.method4473();
		@Pc(188) int local188;
		@Pc(234) Class3_Sub7_Sub2_Sub2 local234;
		if (!(local20 instanceof Class3_Sub7_Sub2_Sub1)) {
			try {
				if (local159 == null || local159.length <= 2) {
					throw new RuntimeException();
				}
				Static96.aCRC32_1.reset();
				Static96.aCRC32_1.update(local159, 0, local159.length - 2);
				local188 = (int) Static96.aCRC32_1.getValue();
				if (local188 != this.aClass55_2.anIntArray120[arg0]) {
					throw new RuntimeException();
				}
				this.aClass11_1.anInt177 = 0;
				this.aClass11_1.anInt176 = 0;
			} catch (@Pc(209) RuntimeException local209) {
				this.aClass11_1.method156();
				local20.method5700();
				if (local20.aBoolean388 && !this.aClass11_1.method158()) {
					local234 = this.aClass11_1.method157(true, arg0, this.anInt3408, (byte) 2);
					this.aClass44_19.method948((long) arg0, local234);
				}
				return null;
			}
			local159[local159.length - 2] = (byte) (this.aClass55_2.anIntArray116[arg0] >>> 8);
			local159[local159.length - 1] = (byte) this.aClass55_2.anIntArray116[arg0];
			if (this.aClass204_3 != null) {
				this.aClass40_1.method696(arg0, local159, this.aClass204_3);
				if (this.aByteArray47[arg0] != 1) {
					this.anInt3417++;
					this.aByteArray47[arg0] = 1;
				}
			}
			if (!local20.aBoolean388) {
				local20.method5700();
			}
			return local20;
		}
		try {
			if (local159 == null || local159.length <= 2) {
				throw new RuntimeException();
			}
			Static96.aCRC32_1.reset();
			Static96.aCRC32_1.update(local159, 0, local159.length - 2);
			local188 = (int) Static96.aCRC32_1.getValue();
			if (this.aClass55_2.anIntArray120[arg0] != local188) {
				throw new RuntimeException();
			}
			@Pc(369) int local369 = (local159[local159.length - 1] & 0xFF) + ((local159[local159.length - 2] & 0xFF) << 8);
			if (local369 != (this.aClass55_2.anIntArray116[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray47[arg0] != 1) {
				this.anInt3417++;
				this.aByteArray47[arg0] = 1;
			}
			if (!local20.aBoolean388) {
				local20.method5700();
			}
			return local20;
		} catch (@Pc(408) Exception local408) {
			this.aByteArray47[arg0] = -1;
			local20.method5700();
			if (local20.aBoolean388 && !this.aClass11_1.method158()) {
				local234 = this.aClass11_1.method157(true, arg0, this.anInt3408, (byte) 2);
				this.aClass44_19.method948((long) arg0, local234);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)V")
	public void method2992() {
		if (this.aClass138_25 == null || this.method2982() == null) {
			return;
		}
		for (@Pc(27) Class3 local27 = this.aClass138_24.method3051(); local27 != null; local27 = this.aClass138_24.method3050()) {
			@Pc(33) int local33 = (int) local27.aLong240;
			if (local33 < 0 || this.aClass55_2.anInt1277 <= local33 || this.aClass55_2.anIntArray121[local33] == 0) {
				local27.method5700();
			} else {
				if (this.aByteArray47[local33] == 0) {
					this.method2991(local33, 1);
				}
				if (this.aByteArray47[local33] == -1) {
					this.method2991(local33, 2);
				}
				if (this.aByteArray47[local33] == 1) {
					local27.method5700();
				}
			}
		}
	}

	@OriginalMember(owner = "client!kn", name = "b", descriptor = "(II)V")
	@Override
	public void method2983(@OriginalArg(1) int arg0) {
		if (this.aClass204_3 == null) {
			return;
		}
		for (@Pc(18) Class3 local18 = this.aClass138_24.method3051(); local18 != null; local18 = this.aClass138_24.method3050()) {
			if ((long) arg0 == local18.aLong240) {
				return;
			}
		}
		@Pc(38) Class3 local38 = new Class3();
		local38.aLong240 = arg0;
		this.aClass138_24.method3053(local38);
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)I")
	@Override
	public int method2979(@OriginalArg(1) int arg0) {
		@Pc(11) Class3_Sub7_Sub2 local11 = (Class3_Sub7_Sub2) this.aClass44_19.method942((long) arg0);
		return local11 == null ? 0 : local11.method4474();
	}

	@OriginalMember(owner = "client!kn", name = "e", descriptor = "(I)I")
	public int method2994() {
		return this.anInt3417;
	}

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(B)I")
	public int method2995() {
		return this.aClass55_2 == null ? 0 : this.aClass55_2.anInt1278;
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)Lclient!dg;")
	@Override
	public Class55 method2982() {
		if (this.aClass55_2 != null) {
			return this.aClass55_2;
		}
		if (this.aClass3_Sub7_Sub2_1 == null) {
			if (this.aClass11_1.method158()) {
				return null;
			}
			this.aClass3_Sub7_Sub2_1 = this.aClass11_1.method157(true, this.anInt3408, 255, (byte) 0);
		}
		if (this.aClass3_Sub7_Sub2_1.aBoolean387) {
			return null;
		}
		@Pc(50) byte[] local50 = this.aClass3_Sub7_Sub2_1.method4473();
		if (this.aClass3_Sub7_Sub2_1 instanceof Class3_Sub7_Sub2_Sub1) {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass55_2 = new Class55(local50, this.anInt3412);
				if (this.anInt3411 != this.aClass55_2.anInt1275) {
					throw new RuntimeException();
				}
			} catch (@Pc(83) RuntimeException local83) {
				this.aClass55_2 = null;
				if (this.aClass11_1.method158()) {
					this.aClass3_Sub7_Sub2_1 = null;
				} else {
					this.aClass3_Sub7_Sub2_1 = this.aClass11_1.method157(true, this.anInt3408, 255, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local50 == null) {
					throw new RuntimeException();
				}
				this.aClass55_2 = new Class55(local50, this.anInt3412);
			} catch (@Pc(125) RuntimeException local125) {
				this.aClass11_1.method156();
				this.aClass55_2 = null;
				if (this.aClass11_1.method158()) {
					this.aClass3_Sub7_Sub2_1 = null;
				} else {
					this.aClass3_Sub7_Sub2_1 = this.aClass11_1.method157(true, this.anInt3408, 255, (byte) 0);
				}
				return null;
			}
			if (this.aClass204_2 != null) {
				this.aClass40_1.method696(this.anInt3408, local50, this.aClass204_2);
			}
		}
		if (this.aClass204_3 != null) {
			this.anInt3417 = 0;
			this.aByteArray47 = new byte[this.aClass55_2.anInt1277];
		}
		this.aClass3_Sub7_Sub2_1 = null;
		return this.aClass55_2;
	}
}
