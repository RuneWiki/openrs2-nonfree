import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jf")
public final class Class164_Sub1 extends Class164 {

	@OriginalMember(owner = "client!jf", name = "i", descriptor = "[B")
	private byte[] aByteArray55;

	@OriginalMember(owner = "client!jf", name = "u", descriptor = "Lclient!hc;")
	private Class129 aClass129_1;

	@OriginalMember(owner = "client!jf", name = "L", descriptor = "Z")
	private boolean aBoolean378;

	@OriginalMember(owner = "client!jf", name = "F", descriptor = "I")
	private int anInt4962 = 0;

	@OriginalMember(owner = "client!jf", name = "y", descriptor = "Lclient!tq;")
	private final Class305 aClass305_25 = new Class305(16);

	@OriginalMember(owner = "client!jf", name = "J", descriptor = "I")
	private int anInt4964 = 0;

	@OriginalMember(owner = "client!jf", name = "K", descriptor = "Lclient!mfa;")
	private final Class211 aClass211_33 = new Class211();

	@OriginalMember(owner = "client!jf", name = "O", descriptor = "J")
	private long aLong108 = 0L;

	@OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
	private final int anInt4954;

	@OriginalMember(owner = "client!jf", name = "s", descriptor = "Lclient!qn;")
	private final Class266 aClass266_2;

	@OriginalMember(owner = "client!jf", name = "M", descriptor = "Z")
	private boolean aBoolean379;

	@OriginalMember(owner = "client!jf", name = "I", descriptor = "Lclient!mfa;")
	private Class211 aClass211_32;

	@OriginalMember(owner = "client!jf", name = "v", descriptor = "[B")
	private final byte[] aByteArray56;

	@OriginalMember(owner = "client!jf", name = "l", descriptor = "Lclient!qn;")
	private final Class266 aClass266_1;

	@OriginalMember(owner = "client!jf", name = "N", descriptor = "Z")
	private final boolean aBoolean380;

	@OriginalMember(owner = "client!jf", name = "H", descriptor = "I")
	private final int anInt4963;

	@OriginalMember(owner = "client!jf", name = "z", descriptor = "I")
	private final int anInt4957;

	@OriginalMember(owner = "client!jf", name = "w", descriptor = "Lclient!sc;")
	private final Class281 aClass281_1;

	@OriginalMember(owner = "client!jf", name = "B", descriptor = "Lclient!np;")
	private final Class228 aClass228_1;

	@OriginalMember(owner = "client!jf", name = "G", descriptor = "Lclient!qt;")
	private Class6_Sub4_Sub9 aClass6_Sub4_Sub9_1;

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(ILclient!qn;Lclient!qn;Lclient!np;Lclient!sc;I[BIZ)V")
	public Class164_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class266 arg1, @OriginalArg(2) Class266 arg2, @OriginalArg(3) Class228 arg3, @OriginalArg(4) Class281 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.anInt4954 = arg0;
		this.aClass266_2 = arg1;
		if (this.aClass266_2 == null) {
			this.aBoolean379 = false;
		} else {
			this.aBoolean379 = true;
			this.aClass211_32 = new Class211();
		}
		this.aByteArray56 = arg6;
		this.aClass266_1 = arg2;
		this.aBoolean380 = arg8;
		this.anInt4963 = arg5;
		this.anInt4957 = arg7;
		this.aClass281_1 = arg4;
		this.aClass228_1 = arg3;
		if (this.aClass266_1 != null) {
			this.aClass6_Sub4_Sub9_1 = this.aClass281_1.method7110(this.aClass266_1, this.anInt4954);
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
	public void method4269() {
		if (this.aClass211_32 != null) {
			if (this.method4266() == null) {
				return;
			}
			@Pc(25) boolean local25;
			@Pc(30) Class6 local30;
			@Pc(36) int local36;
			@Pc(123) Class6 local123;
			if (this.aBoolean379) {
				local25 = true;
				for (local30 = this.aClass211_32.method5183(); local30 != null; local30 = this.aClass211_32.method5177()) {
					local36 = (int) local30.aLong252;
					if (this.aByteArray55[local36] == 0) {
						this.method4279(local36, 1);
					}
					if (this.aByteArray55[local36] == 0) {
						local25 = false;
					} else {
						local30.method8151();
					}
				}
				while (this.aClass129_1.anIntArray267.length > this.anInt4964) {
					if (this.aClass129_1.anIntArray267[this.anInt4964] == 0) {
						this.anInt4964++;
					} else {
						if (this.aClass281_1.anInt8476 >= 250) {
							local25 = false;
							break;
						}
						if (this.aByteArray55[this.anInt4964] == 0) {
							this.method4279(this.anInt4964, 1);
						}
						if (this.aByteArray55[this.anInt4964] == 0) {
							local123 = new Class6();
							local123.aLong252 = this.anInt4964;
							local25 = false;
							this.aClass211_32.method5173(local123);
						}
						this.anInt4964++;
					}
				}
				if (local25) {
					this.anInt4964 = 0;
					this.aBoolean379 = false;
				}
			} else if (this.aBoolean378) {
				local25 = true;
				for (local30 = this.aClass211_32.method5183(); local30 != null; local30 = this.aClass211_32.method5177()) {
					local36 = (int) local30.aLong252;
					if (this.aByteArray55[local36] != 1) {
						this.method4279(local36, 2);
					}
					if (this.aByteArray55[local36] == 1) {
						local30.method8151();
					} else {
						local25 = false;
					}
				}
				while (this.anInt4964 < this.aClass129_1.anIntArray267.length) {
					if (this.aClass129_1.anIntArray267[this.anInt4964] == 0) {
						this.anInt4964++;
					} else {
						if (this.aClass228_1.method5711()) {
							local25 = false;
							break;
						}
						if (this.aByteArray55[this.anInt4964] != 1) {
							this.method4279(this.anInt4964, 2);
						}
						if (this.aByteArray55[this.anInt4964] != 1) {
							local123 = new Class6();
							local123.aLong252 = this.anInt4964;
							this.aClass211_32.method5173(local123);
							local25 = false;
						}
						this.anInt4964++;
					}
				}
				if (local25) {
					this.anInt4964 = 0;
					this.aBoolean378 = false;
				}
			} else {
				this.aClass211_32 = null;
			}
		}
		if (!this.aBoolean380 || Static174.method3502() < this.aLong108) {
			return;
		}
		for (@Pc(325) Class6_Sub4_Sub9 local325 = (Class6_Sub4_Sub9) this.aClass305_25.method7445(); local325 != null; local325 = (Class6_Sub4_Sub9) this.aClass305_25.method7449()) {
			if (!local325.aBoolean715) {
				if (local325.aBoolean716) {
					if (!local325.aBoolean714) {
						throw new RuntimeException();
					}
					local325.method8151();
				} else {
					local325.aBoolean716 = true;
				}
			}
		}
		this.aLong108 = Static174.method3502() + 1000L;
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(II)[B")
	@Override
	public byte[] method4267(@OriginalArg(0) int arg0) {
		@Pc(16) Class6_Sub4_Sub9 local16 = this.method4279(arg0, 0);
		if (local16 == null) {
			return null;
		} else {
			@Pc(24) byte[] local24 = local16.method8037();
			local16.method8151();
			return local24;
		}
	}

	@OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)I")
	public int method4271() {
		return this.anInt4962;
	}

	@OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V")
	public void method4273() {
		if (this.aClass211_32 == null || this.method4266() == null) {
			return;
		}
		for (@Pc(27) Class6 local27 = this.aClass211_33.method5183(); local27 != null; local27 = this.aClass211_33.method5177()) {
			@Pc(33) int local33 = (int) local27.aLong252;
			if (local33 < 0 || local33 >= this.aClass129_1.anInt4117 || this.aClass129_1.anIntArray267[local33] == 0) {
				local27.method8151();
			} else {
				if (this.aByteArray55[local33] == 0) {
					this.method4279(local33, 1);
				}
				if (this.aByteArray55[local33] == -1) {
					this.method4279(local33, 2);
				}
				if (this.aByteArray55[local33] == 1) {
					local27.method8151();
				}
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)V")
	public void method4274() {
		if (this.aClass266_2 != null) {
			this.aBoolean378 = true;
			if (this.aClass211_32 == null) {
				this.aClass211_32 = new Class211();
			}
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)I")
	public int method4276() {
		if (this.method4266() == null) {
			return this.aClass6_Sub4_Sub9_1 == null ? 0 : this.aClass6_Sub4_Sub9_1.method8038();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)I")
	public int method4277() {
		if (this.aClass129_1 == null) {
			return 0;
		} else if (this.aBoolean379) {
			@Pc(26) Class6 local26 = this.aClass211_32.method5183();
			return local26 == null ? 0 : (int) local26.aLong252;
		} else {
			return this.aClass129_1.anInt4115;
		}
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)Lclient!hc;")
	@Override
	public Class129 method4266() {
		if (this.aClass129_1 != null) {
			return this.aClass129_1;
		}
		if (this.aClass6_Sub4_Sub9_1 == null) {
			if (this.aClass228_1.method5712()) {
				return null;
			}
			this.aClass6_Sub4_Sub9_1 = this.aClass228_1.method5719(true, this.anInt4954, 255, (byte) 0);
		}
		if (this.aClass6_Sub4_Sub9_1.aBoolean715) {
			return null;
		}
		@Pc(49) byte[] local49 = this.aClass6_Sub4_Sub9_1.method8037();
		if (this.aClass6_Sub4_Sub9_1 instanceof Class6_Sub4_Sub9_Sub2) {
			try {
				if (local49 == null) {
					throw new RuntimeException();
				}
				this.aClass129_1 = new Class129(local49, this.anInt4963, this.aByteArray56);
				if (this.aClass129_1.anInt4116 != this.anInt4957) {
					throw new RuntimeException();
				}
			} catch (@Pc(147) RuntimeException local147) {
				this.aClass129_1 = null;
				if (this.aClass228_1.method5712()) {
					this.aClass6_Sub4_Sub9_1 = null;
				} else {
					this.aClass6_Sub4_Sub9_1 = this.aClass228_1.method5719(true, this.anInt4954, 255, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local49 == null) {
					throw new RuntimeException();
				}
				this.aClass129_1 = new Class129(local49, this.anInt4963, this.aByteArray56);
			} catch (@Pc(71) RuntimeException local71) {
				this.aClass228_1.method5707();
				this.aClass129_1 = null;
				if (this.aClass228_1.method5712()) {
					this.aClass6_Sub4_Sub9_1 = null;
				} else {
					this.aClass6_Sub4_Sub9_1 = this.aClass228_1.method5719(true, this.anInt4954, 255, (byte) 0);
				}
				return null;
			}
			if (this.aClass266_1 != null) {
				this.aClass281_1.method7115(local49, this.aClass266_1, this.anInt4954);
			}
		}
		if (this.aClass266_2 != null) {
			this.aByteArray55 = new byte[this.aClass129_1.anInt4117];
			this.anInt4962 = 0;
		}
		this.aClass6_Sub4_Sub9_1 = null;
		return this.aClass129_1;
	}

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "(I)I")
	public int method4278() {
		return this.aClass129_1 == null ? 0 : this.aClass129_1.anInt4115;
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIB)Lclient!qt;")
	private Class6_Sub4_Sub9 method4279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class6_Sub4_Sub9 local13 = (Class6_Sub4_Sub9) this.aClass305_25.method7447((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean714 && local13.aBoolean715) {
			local13.method8151();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass266_2 == null || this.aByteArray55[arg0] == -1) {
					if (this.aClass228_1.method5712()) {
						return null;
					}
					local13 = this.aClass228_1.method5719(true, arg0, this.anInt4954, (byte) 2);
				} else {
					local13 = this.aClass281_1.method7110(this.aClass266_2, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass266_2 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass281_1.method7113(this.aClass266_2, arg0);
			} else if (arg1 == 2) {
				if (this.aClass266_2 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray55[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass228_1.method5711()) {
					return null;
				}
				local13 = this.aClass228_1.method5719(false, arg0, this.anInt4954, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass305_25.method7448((long) arg0, local13);
		}
		if (local13.aBoolean715) {
			return null;
		}
		@Pc(156) byte[] local156 = local13.method8037();
		@Pc(188) int local188;
		@Pc(215) byte[] local215;
		@Pc(224) byte[] local224;
		@Pc(226) int local226;
		@Pc(334) Class6_Sub4_Sub9_Sub1 local334;
		if (!(local13 instanceof Class6_Sub4_Sub9_Sub2)) {
			try {
				label157: {
					if (local156 != null && local156.length > 2) {
						Static439.aCRC32_1.reset();
						Static439.aCRC32_1.update(local156, 0, local156.length - 2);
						local188 = (int) Static439.aCRC32_1.getValue();
						if (local188 != this.aClass129_1.anIntArray270[arg0]) {
							throw new RuntimeException();
						}
						if (this.aClass129_1.aByteArrayArray15 == null || this.aClass129_1.aByteArrayArray15[arg0] == null) {
							break label157;
						}
						local215 = this.aClass129_1.aByteArrayArray15[arg0];
						local224 = Static137.method2579(local156.length - 2, local156, 0);
						local226 = 0;
						while (true) {
							if (local226 >= 64) {
								break label157;
							}
							if (local224[local226] != local215[local226]) {
								throw new RuntimeException();
							}
							local226++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass228_1.anInt6789 = 0;
				this.aClass228_1.anInt6790 = 0;
			} catch (@Pc(442) RuntimeException local442) {
				this.aClass228_1.method5707();
				local13.method8151();
				if (local13.aBoolean714 && !this.aClass228_1.method5712()) {
					local334 = this.aClass228_1.method5719(true, arg0, this.anInt4954, (byte) 2);
					this.aClass305_25.method7448((long) arg0, local334);
				}
				return null;
			}
			local156[local156.length - 2] = (byte) (this.aClass129_1.anIntArray271[arg0] >>> 8);
			local156[local156.length - 1] = (byte) this.aClass129_1.anIntArray271[arg0];
			if (this.aClass266_2 != null) {
				this.aClass281_1.method7115(local156, this.aClass266_2, arg0);
				if (this.aByteArray55[arg0] != 1) {
					this.anInt4962++;
					this.aByteArray55[arg0] = 1;
				}
			}
			if (!local13.aBoolean714) {
				local13.method8151();
			}
			return local13;
		}
		try {
			if (local156 == null || local156.length <= 2) {
				throw new RuntimeException();
			}
			Static439.aCRC32_1.reset();
			Static439.aCRC32_1.update(local156, 0, local156.length - 2);
			local188 = (int) Static439.aCRC32_1.getValue();
			if (local188 != this.aClass129_1.anIntArray270[arg0]) {
				throw new RuntimeException();
			}
			if (this.aClass129_1.aByteArrayArray15 != null && this.aClass129_1.aByteArrayArray15[arg0] != null) {
				local215 = this.aClass129_1.aByteArrayArray15[arg0];
				local224 = Static137.method2579(local156.length - 2, local156, 0);
				for (local226 = 0; local226 < 64; local226++) {
					if (local224[local226] != local215[local226]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(267) int local267 = (local156[local156.length - 1] & 0xFF) + ((local156[local156.length - 2] & 0xFF) << 8);
			if (local267 != (this.aClass129_1.anIntArray271[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray55[arg0] != 1) {
				this.anInt4962++;
				this.aByteArray55[arg0] = 1;
			}
			if (!local13.aBoolean714) {
				local13.method8151();
			}
			return local13;
		} catch (@Pc(308) Exception local308) {
			this.aByteArray55[arg0] = -1;
			local13.method8151();
			if (local13.aBoolean714 && !this.aClass228_1.method5712()) {
				local334 = this.aClass228_1.method5719(true, arg0, this.anInt4954, (byte) 2);
				this.aClass305_25.method7448((long) arg0, local334);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)I")
	@Override
	public int method4265(@OriginalArg(1) int arg0) {
		@Pc(17) Class6_Sub4_Sub9 local17 = (Class6_Sub4_Sub9) this.aClass305_25.method7447((long) arg0);
		return local17 == null ? 0 : local17.method8038();
	}

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)V")
	@Override
	public void method4263(@OriginalArg(1) int arg0) {
		if (this.aClass266_2 == null) {
			return;
		}
		for (@Pc(14) Class6 local14 = this.aClass211_33.method5183(); local14 != null; local14 = this.aClass211_33.method5177()) {
			if (local14.aLong252 == (long) arg0) {
				return;
			}
		}
		@Pc(44) Class6 local44 = new Class6();
		local44.aLong252 = arg0;
		this.aClass211_33.method5173(local44);
	}
}
