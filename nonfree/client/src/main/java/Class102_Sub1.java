import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public final class Class102_Sub1 extends Class102 {

	@OriginalMember(owner = "client!tj", name = "m", descriptor = "Lclient!gr;")
	private Class129 aClass129_2;

	@OriginalMember(owner = "client!tj", name = "p", descriptor = "[B")
	private byte[] aByteArray90;

	@OriginalMember(owner = "client!tj", name = "Q", descriptor = "Z")
	private boolean aBoolean693;

	@OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
	private int anInt8217 = 0;

	@OriginalMember(owner = "client!tj", name = "H", descriptor = "Lclient!efa;")
	private final Class90 aClass90_36 = new Class90(16);

	@OriginalMember(owner = "client!tj", name = "O", descriptor = "I")
	private int anInt8223 = 0;

	@OriginalMember(owner = "client!tj", name = "R", descriptor = "Lclient!dc;")
	private final Class70 aClass70_55 = new Class70();

	@OriginalMember(owner = "client!tj", name = "T", descriptor = "J")
	private long aLong234 = 0L;

	@OriginalMember(owner = "client!tj", name = "B", descriptor = "Lclient!nr;")
	private final Class245 aClass245_6;

	@OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
	private final int anInt8218;

	@OriginalMember(owner = "client!tj", name = "S", descriptor = "Z")
	private boolean aBoolean694;

	@OriginalMember(owner = "client!tj", name = "P", descriptor = "Lclient!dc;")
	private Class70 aClass70_54;

	@OriginalMember(owner = "client!tj", name = "U", descriptor = "Z")
	private final boolean aBoolean695;

	@OriginalMember(owner = "client!tj", name = "G", descriptor = "Lclient!oaa;")
	private final Class249 aClass249_3;

	@OriginalMember(owner = "client!tj", name = "L", descriptor = "[B")
	private final byte[] aByteArray91;

	@OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
	private final int anInt8205;

	@OriginalMember(owner = "client!tj", name = "y", descriptor = "Lclient!nr;")
	private final Class245 aClass245_5;

	@OriginalMember(owner = "client!tj", name = "i", descriptor = "Lclient!jq;")
	private final Class181 aClass181_3;

	@OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
	private final int anInt8203;

	@OriginalMember(owner = "client!tj", name = "N", descriptor = "Lclient!cm;")
	private Class2_Sub2_Sub2 aClass2_Sub2_Sub2_1;

	@OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(ILclient!nr;Lclient!nr;Lclient!oaa;Lclient!jq;I[BIZ)V")
	public Class102_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class245 arg1, @OriginalArg(2) Class245 arg2, @OriginalArg(3) Class249 arg3, @OriginalArg(4) Class181 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.aClass245_6 = arg1;
		this.anInt8218 = arg0;
		if (this.aClass245_6 == null) {
			this.aBoolean694 = false;
		} else {
			this.aBoolean694 = true;
			this.aClass70_54 = new Class70();
		}
		this.aBoolean695 = arg8;
		this.aClass249_3 = arg3;
		this.aByteArray91 = arg6;
		this.anInt8205 = arg7;
		this.aClass245_5 = arg2;
		this.aClass181_3 = arg4;
		this.anInt8203 = arg5;
		if (this.aClass245_5 != null) {
			this.aClass2_Sub2_Sub2_1 = this.aClass181_3.method3660(this.aClass245_5, this.anInt8218);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)I")
	@Override
	public int method6629(@OriginalArg(0) int arg0) {
		@Pc(16) Class2_Sub2_Sub2 local16 = (Class2_Sub2_Sub2) this.aClass90_36.method1685((long) arg0);
		return local16 == null ? 0 : local16.method4254();
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)V")
	public void method6635() {
		if (this.aClass70_54 == null || this.method6631() == null) {
			return;
		}
		for (@Pc(23) Class2 local23 = this.aClass70_55.method1264(); local23 != null; local23 = this.aClass70_55.method1261()) {
			@Pc(29) int local29 = (int) local23.aLong268;
			if (local29 < 0 || local29 >= this.aClass129_2.anInt2679 || this.aClass129_2.anIntArray227[local29] == 0) {
				local23.method7657();
			} else {
				if (this.aByteArray90[local29] == 0) {
					this.method6636(local29, 1);
				}
				if (this.aByteArray90[local29] == -1) {
					this.method6636(local29, 2);
				}
				if (this.aByteArray90[local29] == 1) {
					local23.method7657();
				}
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)Lclient!cm;")
	private Class2_Sub2_Sub2 method6636(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class2_Sub2_Sub2 local13 = (Class2_Sub2_Sub2) this.aClass90_36.method1685((long) arg0);
		if (local13 != null && arg1 == 0 && !local13.aBoolean391 && local13.aBoolean390) {
			local13.method7657();
			local13 = null;
		}
		if (local13 == null) {
			if (arg1 == 0) {
				if (this.aClass245_6 == null || this.aByteArray90[arg0] == -1) {
					if (this.aClass249_3.method5217()) {
						return null;
					}
					local13 = this.aClass249_3.method5230(arg0, true, this.anInt8218, (byte) 2);
				} else {
					local13 = this.aClass181_3.method3660(this.aClass245_6, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass245_6 == null) {
					throw new RuntimeException();
				}
				local13 = this.aClass181_3.method3659(this.aClass245_6, arg0);
			} else if (arg1 == 2) {
				if (this.aClass245_6 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray90[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass249_3.method5223()) {
					return null;
				}
				local13 = this.aClass249_3.method5230(arg0, false, this.anInt8218, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass90_36.method1684(local13, (long) arg0);
		}
		if (local13.aBoolean390) {
			return null;
		}
		@Pc(160) byte[] local160 = local13.method4255();
		@Pc(187) int local187;
		@Pc(218) byte[] local218;
		@Pc(227) byte[] local227;
		@Pc(229) int local229;
		@Pc(341) Class2_Sub2_Sub2_Sub2 local341;
		if (!(local13 instanceof Class2_Sub2_Sub2_Sub1)) {
			try {
				label157: {
					if (local160 != null && local160.length > 2) {
						Static265.aCRC32_1.reset();
						Static265.aCRC32_1.update(local160, 0, local160.length - 2);
						local187 = (int) Static265.aCRC32_1.getValue();
						if (this.aClass129_2.anIntArray225[arg0] != local187) {
							throw new RuntimeException();
						}
						if (this.aClass129_2.aByteArrayArray7 == null || this.aClass129_2.aByteArrayArray7[arg0] == null) {
							break label157;
						}
						local218 = this.aClass129_2.aByteArrayArray7[arg0];
						local227 = Static531.method6992(local160.length - 2, 0, local160);
						local229 = 0;
						while (true) {
							if (local229 >= 64) {
								break label157;
							}
							if (local227[local229] != local218[local229]) {
								throw new RuntimeException();
							}
							local229++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass249_3.anInt6251 = 0;
				this.aClass249_3.anInt6250 = 0;
			} catch (@Pc(445) RuntimeException local445) {
				this.aClass249_3.method5219();
				local13.method7657();
				if (local13.aBoolean391 && !this.aClass249_3.method5217()) {
					local341 = this.aClass249_3.method5230(arg0, true, this.anInt8218, (byte) 2);
					this.aClass90_36.method1684(local341, (long) arg0);
				}
				return null;
			}
			local160[local160.length - 2] = (byte) (this.aClass129_2.anIntArray222[arg0] >>> 8);
			local160[local160.length - 1] = (byte) this.aClass129_2.anIntArray222[arg0];
			if (this.aClass245_6 != null) {
				this.aClass181_3.method3658(arg0, local160, this.aClass245_6);
				if (this.aByteArray90[arg0] != 1) {
					this.anInt8217++;
					this.aByteArray90[arg0] = 1;
				}
			}
			if (!local13.aBoolean391) {
				local13.method7657();
			}
			return local13;
		}
		try {
			if (local160 == null || local160.length <= 2) {
				throw new RuntimeException();
			}
			Static265.aCRC32_1.reset();
			Static265.aCRC32_1.update(local160, 0, local160.length - 2);
			local187 = (int) Static265.aCRC32_1.getValue();
			if (local187 != this.aClass129_2.anIntArray225[arg0]) {
				throw new RuntimeException();
			}
			if (this.aClass129_2.aByteArrayArray7 != null && this.aClass129_2.aByteArrayArray7[arg0] != null) {
				local218 = this.aClass129_2.aByteArrayArray7[arg0];
				local227 = Static531.method6992(local160.length - 2, 0, local160);
				for (local229 = 0; local229 < 64; local229++) {
					if (local218[local229] != local227[local229]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(270) int local270 = (local160[local160.length - 1] & 0xFF) + ((local160[local160.length - 2] & 0xFF) << 8);
			if ((this.aClass129_2.anIntArray222[arg0] & 0xFFFF) != local270) {
				throw new RuntimeException();
			}
			if (this.aByteArray90[arg0] != 1) {
				this.anInt8217++;
				this.aByteArray90[arg0] = 1;
			}
			if (!local13.aBoolean391) {
				local13.method7657();
			}
			return local13;
		} catch (@Pc(313) Exception local313) {
			this.aByteArray90[arg0] = -1;
			local13.method7657();
			if (local13.aBoolean391 && !this.aClass249_3.method5217()) {
				local341 = this.aClass249_3.method5230(arg0, true, this.anInt8218, (byte) 2);
				this.aClass90_36.method1684(local341, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)I")
	public int method6637() {
		if (this.method6631() == null) {
			return this.aClass2_Sub2_Sub2_1 == null ? 0 : this.aClass2_Sub2_Sub2_1.method4254();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(B)I")
	public int method6639() {
		if (this.aClass129_2 == null) {
			return 0;
		} else if (this.aBoolean694) {
			@Pc(20) Class2 local20 = this.aClass70_54.method1264();
			return local20 == null ? 0 : (int) local20.aLong268;
		} else {
			return this.aClass129_2.anInt2685;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method6630(@OriginalArg(0) int arg0) {
		@Pc(9) Class2_Sub2_Sub2 local9 = this.method6636(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(17) byte[] local17 = local9.method4255();
			local9.method7657();
			return local17;
		}
	}

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "(B)V")
	public void method6642() {
		if (this.aClass245_6 != null) {
			this.aBoolean693 = true;
			if (this.aClass70_54 == null) {
				this.aClass70_54 = new Class70();
			}
		}
	}

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "(B)I")
	public int method6644() {
		return this.anInt8217;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V")
	public void method6645() {
		if (this.aClass70_54 != null) {
			if (this.method6631() == null) {
				return;
			}
			@Pc(21) boolean local21;
			@Pc(26) Class2 local26;
			@Pc(32) int local32;
			@Pc(120) Class2 local120;
			if (this.aBoolean694) {
				local21 = true;
				for (local26 = this.aClass70_54.method1264(); local26 != null; local26 = this.aClass70_54.method1261()) {
					local32 = (int) local26.aLong268;
					if (this.aByteArray90[local32] == 0) {
						this.method6636(local32, 1);
					}
					if (this.aByteArray90[local32] == 0) {
						local21 = false;
					} else {
						local26.method7657();
					}
				}
				while (this.aClass129_2.anIntArray227.length > this.anInt8223) {
					if (this.aClass129_2.anIntArray227[this.anInt8223] == 0) {
						this.anInt8223++;
					} else {
						if (this.aClass181_3.anInt4295 >= 250) {
							local21 = false;
							break;
						}
						if (this.aByteArray90[this.anInt8223] == 0) {
							this.method6636(this.anInt8223, 1);
						}
						if (this.aByteArray90[this.anInt8223] == 0) {
							local120 = new Class2();
							local120.aLong268 = this.anInt8223;
							local21 = false;
							this.aClass70_54.method1269(local120);
						}
						this.anInt8223++;
					}
				}
				if (local21) {
					this.aBoolean694 = false;
					this.anInt8223 = 0;
				}
			} else if (this.aBoolean693) {
				local21 = true;
				for (local26 = this.aClass70_54.method1264(); local26 != null; local26 = this.aClass70_54.method1261()) {
					local32 = (int) local26.aLong268;
					if (this.aByteArray90[local32] != 1) {
						this.method6636(local32, 2);
					}
					if (this.aByteArray90[local32] == 1) {
						local26.method7657();
					} else {
						local21 = false;
					}
				}
				while (this.anInt8223 < this.aClass129_2.anIntArray227.length) {
					if (this.aClass129_2.anIntArray227[this.anInt8223] == 0) {
						this.anInt8223++;
					} else {
						if (this.aClass249_3.method5223()) {
							local21 = false;
							break;
						}
						if (this.aByteArray90[this.anInt8223] != 1) {
							this.method6636(this.anInt8223, 2);
						}
						if (this.aByteArray90[this.anInt8223] != 1) {
							local120 = new Class2();
							local120.aLong268 = this.anInt8223;
							this.aClass70_54.method1269(local120);
							local21 = false;
						}
						this.anInt8223++;
					}
				}
				if (local21) {
					this.aBoolean693 = false;
					this.anInt8223 = 0;
				}
			} else {
				this.aClass70_54 = null;
			}
		}
		if (!this.aBoolean695 || this.aLong234 > Static362.method5133()) {
			return;
		}
		for (@Pc(319) Class2_Sub2_Sub2 local319 = (Class2_Sub2_Sub2) this.aClass90_36.method1676(); local319 != null; local319 = (Class2_Sub2_Sub2) this.aClass90_36.method1680()) {
			if (!local319.aBoolean390) {
				if (local319.aBoolean392) {
					if (!local319.aBoolean391) {
						throw new RuntimeException();
					}
					local319.method7657();
				} else {
					local319.aBoolean392 = true;
				}
			}
		}
		this.aLong234 = Static362.method5133() + 1000L;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)Lclient!gr;")
	@Override
	public Class129 method6631() {
		if (this.aClass129_2 != null) {
			return this.aClass129_2;
		}
		if (this.aClass2_Sub2_Sub2_1 == null) {
			if (this.aClass249_3.method5217()) {
				return null;
			}
			this.aClass2_Sub2_Sub2_1 = this.aClass249_3.method5230(this.anInt8218, true, 255, (byte) 0);
		}
		if (this.aClass2_Sub2_Sub2_1.aBoolean390) {
			return null;
		}
		@Pc(47) byte[] local47 = this.aClass2_Sub2_Sub2_1.method4255();
		if (this.aClass2_Sub2_Sub2_1 instanceof Class2_Sub2_Sub2_Sub1) {
			try {
				if (local47 == null) {
					throw new RuntimeException();
				}
				this.aClass129_2 = new Class129(local47, this.anInt8203, this.aByteArray91);
				if (this.anInt8205 != this.aClass129_2.anInt2680) {
					throw new RuntimeException();
				}
			} catch (@Pc(82) RuntimeException local82) {
				this.aClass129_2 = null;
				if (this.aClass249_3.method5217()) {
					this.aClass2_Sub2_Sub2_1 = null;
				} else {
					this.aClass2_Sub2_Sub2_1 = this.aClass249_3.method5230(this.anInt8218, true, 255, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local47 == null) {
					throw new RuntimeException();
				}
				this.aClass129_2 = new Class129(local47, this.anInt8203, this.aByteArray91);
			} catch (@Pc(126) RuntimeException local126) {
				this.aClass249_3.method5219();
				this.aClass129_2 = null;
				if (this.aClass249_3.method5217()) {
					this.aClass2_Sub2_Sub2_1 = null;
				} else {
					this.aClass2_Sub2_Sub2_1 = this.aClass249_3.method5230(this.anInt8218, true, 255, (byte) 0);
				}
				return null;
			}
			if (this.aClass245_5 != null) {
				this.aClass181_3.method3658(this.anInt8218, local47, this.aClass245_5);
			}
		}
		if (this.aClass245_6 != null) {
			this.anInt8217 = 0;
			this.aByteArray90 = new byte[this.aClass129_2.anInt2679];
		}
		this.aClass2_Sub2_Sub2_1 = null;
		return this.aClass129_2;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)V")
	@Override
	public void method6628(@OriginalArg(1) int arg0) {
		if (this.aClass245_6 == null) {
			return;
		}
		for (@Pc(14) Class2 local14 = this.aClass70_55.method1264(); local14 != null; local14 = this.aClass70_55.method1261()) {
			if (local14.aLong268 == (long) arg0) {
				return;
			}
		}
		@Pc(41) Class2 local41 = new Class2();
		local41.aLong268 = arg0;
		this.aClass70_55.method1269(local41);
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)I")
	public int method6647() {
		return this.aClass129_2 == null ? 0 : this.aClass129_2.anInt2685;
	}
}
