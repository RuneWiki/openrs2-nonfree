import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kd")
public final class Class14_Sub1 extends Class14 {

	@OriginalMember(owner = "client!kd", name = "u", descriptor = "[B")
	private byte[] aByteArray32;

	@OriginalMember(owner = "client!kd", name = "x", descriptor = "Lclient!lf;")
	private Class143 aClass143_2;

	@OriginalMember(owner = "client!kd", name = "L", descriptor = "Z")
	private boolean aBoolean211;

	@OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
	private int anInt3437 = 0;

	@OriginalMember(owner = "client!kd", name = "H", descriptor = "Lclient!ew;")
	private final Class72 aClass72_23 = new Class72(16);

	@OriginalMember(owner = "client!kd", name = "K", descriptor = "I")
	private int anInt3442 = 0;

	@OriginalMember(owner = "client!kd", name = "O", descriptor = "Lclient!mg;")
	private final Class156 aClass156_21 = new Class156();

	@OriginalMember(owner = "client!kd", name = "P", descriptor = "J")
	private long aLong112 = 0L;

	@OriginalMember(owner = "client!kd", name = "n", descriptor = "Lclient!ro;")
	private final Class217 aClass217_2;

	@OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
	private final int anInt3441;

	@OriginalMember(owner = "client!kd", name = "N", descriptor = "Z")
	private boolean aBoolean212;

	@OriginalMember(owner = "client!kd", name = "M", descriptor = "Lclient!mg;")
	private Class156 aClass156_20;

	@OriginalMember(owner = "client!kd", name = "Q", descriptor = "Z")
	private final boolean aBoolean213;

	@OriginalMember(owner = "client!kd", name = "k", descriptor = "Lclient!ro;")
	private final Class217 aClass217_1;

	@OriginalMember(owner = "client!kd", name = "J", descriptor = "Lclient!ep;")
	private final Class70 aClass70_2;

	@OriginalMember(owner = "client!kd", name = "v", descriptor = "I")
	private final int anInt3431;

	@OriginalMember(owner = "client!kd", name = "G", descriptor = "I")
	private final int anInt3440;

	@OriginalMember(owner = "client!kd", name = "j", descriptor = "Lclient!gd;")
	private final Class84 aClass84_2;

	@OriginalMember(owner = "client!kd", name = "m", descriptor = "Lclient!tk;")
	private Class2_Sub5_Sub12 aClass2_Sub5_Sub12_1;

	@OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(ILclient!ro;Lclient!ro;Lclient!gd;Lclient!ep;IIZ)V")
	public Class14_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class217 arg1, @OriginalArg(2) Class217 arg2, @OriginalArg(3) Class84 arg3, @OriginalArg(4) Class70 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass217_2 = arg1;
		this.anInt3441 = arg0;
		if (this.aClass217_2 == null) {
			this.aBoolean212 = false;
		} else {
			this.aBoolean212 = true;
			this.aClass156_20 = new Class156();
		}
		this.aBoolean213 = arg7;
		this.aClass217_1 = arg2;
		this.aClass70_2 = arg4;
		this.anInt3431 = arg5;
		this.anInt3440 = arg6;
		this.aClass84_2 = arg3;
		if (this.aClass217_1 != null) {
			this.aClass2_Sub5_Sub12_1 = this.aClass70_2.method1544(this.anInt3441, this.aClass217_1);
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(IB)V")
	@Override
	public void method2726(@OriginalArg(0) int arg0) {
		if (this.aClass217_2 == null) {
			return;
		}
		for (@Pc(20) Class2 local20 = this.aClass156_21.method3155(); local20 != null; local20 = this.aClass156_21.method3150()) {
			if ((long) arg0 == local20.aLong225) {
				return;
			}
		}
		@Pc(40) Class2 local40 = new Class2();
		local40.aLong225 = arg0;
		this.aClass156_21.method3157(local40);
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
	public void method2733() {
		if (this.aClass217_2 != null) {
			this.aBoolean211 = true;
			if (this.aClass156_20 == null) {
				this.aClass156_20 = new Class156();
			}
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)I")
	@Override
	public int method2731(@OriginalArg(1) int arg0) {
		@Pc(11) Class2_Sub5_Sub12 local11 = (Class2_Sub5_Sub12) this.aClass72_23.method1659((long) arg0);
		return local11 == null ? 0 : local11.method3885();
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)I")
	public int method2735() {
		if (this.aClass143_2 == null) {
			return 0;
		} else if (this.aBoolean212) {
			@Pc(29) Class2 local29 = this.aClass156_20.method3155();
			return local29 == null ? 0 : (int) local29.aLong225;
		} else {
			return this.aClass143_2.anInt3688;
		}
	}

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(IB)[B")
	@Override
	public byte[] method2729(@OriginalArg(0) int arg0) {
		@Pc(9) Class2_Sub5_Sub12 local9 = this.method2737(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(25) byte[] local25 = local9.method3887();
			local9.method5703();
			return local25;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)Lclient!tk;")
	private Class2_Sub5_Sub12 method2737(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub5_Sub12 local13 = (Class2_Sub5_Sub12) this.aClass72_23.method1659((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean336 && local13.aBoolean335) {
			local13.method5703();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass217_2 == null || this.aByteArray32[arg0] == -1) {
					if (this.aClass84_2.method1911()) {
						return null;
					}
					local13 = this.aClass84_2.method1910((byte) 2, this.anInt3441, arg0, true);
				} else {
					local13 = this.aClass70_2.method1544(arg0, this.aClass217_2);
				}
			} else if (arg1 == 1) {
				if (this.aClass217_2 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass70_2.method1542(this.aClass217_2, arg0);
			} else if (arg1 == 2) {
				if (this.aClass217_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray32[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass84_2.method1899()) {
					return null;
				}
				local13 = this.aClass84_2.method1910((byte) 2, this.anInt3441, arg0, false);
			} else {
				throw new RuntimeException();
			}
			this.aClass72_23.method1653(local13, (long) arg0);
		}
		if (local13.aBoolean335) {
			return null;
		}
		@Pc(158) byte[] local158 = local13.method3887();
		@Pc(193) int local193;
		@Pc(291) Class2_Sub5_Sub12_Sub2 local291;
		if (!(local13 instanceof Class2_Sub5_Sub12_Sub1)) {
			try {
				if (local158 == null || local158.length <= 2) {
					throw new RuntimeException();
				}
				Static252.aCRC32_1.reset();
				Static252.aCRC32_1.update(local158, 0, local158.length - 2);
				local193 = (int) Static252.aCRC32_1.getValue();
				if (this.aClass143_2.anIntArray316[arg0] != local193) {
					throw new RuntimeException();
				}
				this.aClass84_2.anInt2311 = 0;
				this.aClass84_2.anInt2312 = 0;
			} catch (@Pc(351) RuntimeException local351) {
				this.aClass84_2.method1913();
				local13.method5703();
				if (local13.aBoolean336 && !this.aClass84_2.method1911()) {
					local291 = this.aClass84_2.method1910((byte) 2, this.anInt3441, arg0, true);
					this.aClass72_23.method1653(local291, (long) arg0);
				}
				return null;
			}
			local158[local158.length - 2] = (byte) (this.aClass143_2.anIntArray315[arg0] >>> 8);
			local158[local158.length - 1] = (byte) this.aClass143_2.anIntArray315[arg0];
			if (this.aClass217_2 != null) {
				this.aClass70_2.method1541(arg0, this.aClass217_2, local158);
				if (this.aByteArray32[arg0] != 1) {
					this.anInt3437++;
					this.aByteArray32[arg0] = 1;
				}
			}
			if (!local13.aBoolean336) {
				local13.method5703();
			}
			return local13;
		}
		try {
			if (local158 == null || local158.length <= 2) {
				throw new RuntimeException();
			}
			Static252.aCRC32_1.reset();
			Static252.aCRC32_1.update(local158, 0, local158.length - 2);
			local193 = (int) Static252.aCRC32_1.getValue();
			if (local193 != this.aClass143_2.anIntArray316[arg0]) {
				throw new RuntimeException();
			}
			@Pc(224) int local224 = (local158[local158.length - 1] & 0xFF) + ((local158[local158.length - 2] & 0xFF) << 8);
			if ((this.aClass143_2.anIntArray315[arg0] & 0xFFFF) != local224) {
				throw new RuntimeException();
			}
			if (this.aByteArray32[arg0] != 1) {
				this.anInt3437++;
				this.aByteArray32[arg0] = 1;
			}
			if (!local13.aBoolean336) {
				local13.method5703();
			}
			return local13;
		} catch (@Pc(265) Exception local265) {
			this.aByteArray32[arg0] = -1;
			local13.method5703();
			if (local13.aBoolean336 && !this.aClass84_2.method1911()) {
				local291 = this.aClass84_2.method1910((byte) 2, this.anInt3441, arg0, true);
				this.aClass72_23.method1653(local291, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)V")
	public void method2738() {
		if (this.aClass156_20 != null) {
			if (this.method2727() == null) {
				return;
			}
			@Pc(26) boolean local26;
			@Pc(31) Class2 local31;
			@Pc(37) int local37;
			@Pc(128) Class2 local128;
			if (this.aBoolean212) {
				local26 = true;
				for (local31 = this.aClass156_20.method3155(); local31 != null; local31 = this.aClass156_20.method3150()) {
					local37 = (int) local31.aLong225;
					if (this.aByteArray32[local37] == 0) {
						this.method2737(local37, 1);
					}
					if (this.aByteArray32[local37] == 0) {
						local26 = false;
					} else {
						local31.method5703();
					}
				}
				while (this.anInt3442 < this.aClass143_2.anIntArray312.length) {
					if (this.aClass143_2.anIntArray312[this.anInt3442] == 0) {
						this.anInt3442++;
					} else {
						if (this.aClass70_2.anInt1914 >= 250) {
							local26 = false;
							break;
						}
						if (this.aByteArray32[this.anInt3442] == 0) {
							this.method2737(this.anInt3442, 1);
						}
						if (this.aByteArray32[this.anInt3442] == 0) {
							local128 = new Class2();
							local128.aLong225 = this.anInt3442;
							local26 = false;
							this.aClass156_20.method3157(local128);
						}
						this.anInt3442++;
					}
				}
				if (local26) {
					this.aBoolean212 = false;
					this.anInt3442 = 0;
				}
			} else if (this.aBoolean211) {
				local26 = true;
				for (local31 = this.aClass156_20.method3155(); local31 != null; local31 = this.aClass156_20.method3150()) {
					local37 = (int) local31.aLong225;
					if (this.aByteArray32[local37] != 1) {
						this.method2737(local37, 2);
					}
					if (this.aByteArray32[local37] == 1) {
						local31.method5703();
					} else {
						local26 = false;
					}
				}
				while (this.aClass143_2.anIntArray312.length > this.anInt3442) {
					if (this.aClass143_2.anIntArray312[this.anInt3442] == 0) {
						this.anInt3442++;
					} else {
						if (this.aClass84_2.method1899()) {
							local26 = false;
							break;
						}
						if (this.aByteArray32[this.anInt3442] != 1) {
							this.method2737(this.anInt3442, 2);
						}
						if (this.aByteArray32[this.anInt3442] != 1) {
							local128 = new Class2();
							local128.aLong225 = this.anInt3442;
							local26 = false;
							this.aClass156_20.method3157(local128);
						}
						this.anInt3442++;
					}
				}
				if (local26) {
					this.anInt3442 = 0;
					this.aBoolean211 = false;
				}
			} else {
				this.aClass156_20 = null;
			}
		}
		if (!this.aBoolean213 || this.aLong112 > Static110.method1702()) {
			return;
		}
		for (@Pc(334) Class2_Sub5_Sub12 local334 = (Class2_Sub5_Sub12) this.aClass72_23.method1655(); local334 != null; local334 = (Class2_Sub5_Sub12) this.aClass72_23.method1649()) {
			if (!local334.aBoolean335) {
				if (local334.aBoolean334) {
					if (!local334.aBoolean336) {
						throw new RuntimeException();
					}
					local334.method5703();
				} else {
					local334.aBoolean334 = true;
				}
			}
		}
		this.aLong112 = Static110.method1702() + 1000L;
	}

	@OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)I")
	public int method2739() {
		if (this.method2727() == null) {
			return this.aClass2_Sub5_Sub12_1 == null ? 0 : this.aClass2_Sub5_Sub12_1.method3885();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)Lclient!lf;")
	@Override
	public Class143 method2727() {
		if (this.aClass143_2 != null) {
			return this.aClass143_2;
		}
		if (this.aClass2_Sub5_Sub12_1 == null) {
			if (this.aClass84_2.method1911()) {
				return null;
			}
			this.aClass2_Sub5_Sub12_1 = this.aClass84_2.method1910((byte) 0, 255, this.anInt3441, true);
		}
		if (this.aClass2_Sub5_Sub12_1.aBoolean335) {
			return null;
		}
		@Pc(51) byte[] local51 = this.aClass2_Sub5_Sub12_1.method3887();
		if (this.aClass2_Sub5_Sub12_1 instanceof Class2_Sub5_Sub12_Sub1) {
			try {
				if (local51 == null) {
					throw new RuntimeException();
				}
				this.aClass143_2 = new Class143(local51, this.anInt3431);
				if (this.anInt3440 != this.aClass143_2.anInt3691) {
					throw new RuntimeException();
				}
			} catch (@Pc(80) RuntimeException local80) {
				this.aClass143_2 = null;
				if (this.aClass84_2.method1911()) {
					this.aClass2_Sub5_Sub12_1 = null;
				} else {
					this.aClass2_Sub5_Sub12_1 = this.aClass84_2.method1910((byte) 0, 255, this.anInt3441, true);
				}
				return null;
			}
		} else {
			try {
				if (local51 == null) {
					throw new RuntimeException();
				}
				this.aClass143_2 = new Class143(local51, this.anInt3431);
			} catch (@Pc(122) RuntimeException local122) {
				this.aClass84_2.method1913();
				this.aClass143_2 = null;
				if (this.aClass84_2.method1911()) {
					this.aClass2_Sub5_Sub12_1 = null;
				} else {
					this.aClass2_Sub5_Sub12_1 = this.aClass84_2.method1910((byte) 0, 255, this.anInt3441, true);
				}
				return null;
			}
			if (this.aClass217_1 != null) {
				this.aClass70_2.method1541(this.anInt3441, this.aClass217_1, local51);
			}
		}
		if (this.aClass217_2 != null) {
			this.anInt3437 = 0;
			this.aByteArray32 = new byte[this.aClass143_2.anInt3689];
		}
		this.aClass2_Sub5_Sub12_1 = null;
		return this.aClass143_2;
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)I")
	public int method2740() {
		return this.aClass143_2 == null ? 0 : this.aClass143_2.anInt3688;
	}

	@OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)I")
	public int method2741() {
		return this.anInt3437;
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)V")
	public void method2742() {
		if (this.aClass156_20 == null || this.method2727() == null) {
			return;
		}
		for (@Pc(26) Class2 local26 = this.aClass156_21.method3155(); local26 != null; local26 = this.aClass156_21.method3150()) {
			@Pc(32) int local32 = (int) local26.aLong225;
			if (local32 < 0 || local32 >= this.aClass143_2.anInt3689 || this.aClass143_2.anIntArray312[local32] == 0) {
				local26.method5703();
			} else {
				if (this.aByteArray32[local32] == 0) {
					this.method2737(local32, 1);
				}
				if (this.aByteArray32[local32] == -1) {
					this.method2737(local32, 2);
				}
				if (this.aByteArray32[local32] == 1) {
					local26.method5703();
				}
			}
		}
	}
}
