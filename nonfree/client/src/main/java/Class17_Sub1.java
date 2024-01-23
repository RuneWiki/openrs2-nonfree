import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!j")
public final class Class17_Sub1 extends Class17 {

	@OriginalMember(owner = "client!j", name = "q", descriptor = "[B")
	private byte[] aByteArray35;

	@OriginalMember(owner = "client!j", name = "I", descriptor = "Lclient!uj;")
	private Class136 aClass136_2;

	@OriginalMember(owner = "client!j", name = "S", descriptor = "Z")
	private boolean aBoolean153;

	@OriginalMember(owner = "client!j", name = "L", descriptor = "I")
	private int anInt2859 = 0;

	@OriginalMember(owner = "client!j", name = "w", descriptor = "Lclient!vd;")
	private Class140 aClass140_8 = new Class140(16);

	@OriginalMember(owner = "client!j", name = "P", descriptor = "I")
	private int anInt2861 = 0;

	@OriginalMember(owner = "client!j", name = "T", descriptor = "Lclient!ab;")
	private Class3 aClass3_14 = new Class3();

	@OriginalMember(owner = "client!j", name = "V", descriptor = "J")
	private long aLong96 = 0L;

	@OriginalMember(owner = "client!j", name = "z", descriptor = "Lclient!kb;")
	private Class71 aClass71_3;

	@OriginalMember(owner = "client!j", name = "C", descriptor = "I")
	private int anInt2853;

	@OriginalMember(owner = "client!j", name = "Q", descriptor = "Z")
	private boolean aBoolean152;

	@OriginalMember(owner = "client!j", name = "R", descriptor = "Lclient!ab;")
	private Class3 aClass3_13;

	@OriginalMember(owner = "client!j", name = "j", descriptor = "Lclient!bi;")
	private Class18 aClass18_3;

	@OriginalMember(owner = "client!j", name = "o", descriptor = "Lclient!ig;")
	private Class60 aClass60_2;

	@OriginalMember(owner = "client!j", name = "u", descriptor = "I")
	private int anInt2849;

	@OriginalMember(owner = "client!j", name = "U", descriptor = "Z")
	private boolean aBoolean154;

	@OriginalMember(owner = "client!j", name = "A", descriptor = "I")
	private int anInt2851;

	@OriginalMember(owner = "client!j", name = "l", descriptor = "Lclient!kb;")
	private Class71 aClass71_2;

	@OriginalMember(owner = "client!j", name = "H", descriptor = "Lclient!tf;")
	private Class1_Sub2_Sub5 aClass1_Sub2_Sub5_1;

	@OriginalMember(owner = "client!j", name = "<init>", descriptor = "(ILclient!kb;Lclient!kb;Lclient!bi;Lclient!ig;IIZ)V")
	public Class17_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class71 arg1, @OriginalArg(2) Class71 arg2, @OriginalArg(3) Class18 arg3, @OriginalArg(4) Class60 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) boolean arg7) {
		this.aClass71_3 = arg1;
		this.anInt2853 = arg0;
		if (this.aClass71_3 == null) {
			this.aBoolean152 = false;
		} else {
			this.aBoolean152 = true;
			this.aClass3_13 = new Class3();
		}
		this.aClass18_3 = arg3;
		this.aClass60_2 = arg4;
		this.anInt2849 = arg6;
		this.aBoolean154 = arg7;
		this.anInt2851 = arg5;
		this.aClass71_2 = arg2;
		if (this.aClass71_2 != null) {
			this.aClass1_Sub2_Sub5_1 = this.aClass60_2.method2112(this.aClass71_2, this.anInt2853);
		}
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(B)I")
	public int method2191() {
		return this.anInt2859;
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(Z)I")
	public int method2193() {
		if (this.aClass136_2 == null) {
			return 0;
		} else if (this.aBoolean152) {
			@Pc(20) Class1 local20 = this.aClass3_13.method30();
			return local20 == null ? 0 : (int) local20.aLong184;
		} else {
			return this.aClass136_2.anInt5170;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
	public void method2194() {
		if (this.aClass71_3 != null) {
			this.aBoolean153 = true;
			if (this.aClass3_13 == null) {
				this.aClass3_13 = new Class3();
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(Z)V")
	public void method2195() {
		if (this.aClass3_13 != null) {
			if (this.method2181() == null) {
				return;
			}
			@Pc(18) boolean local18;
			@Pc(23) Class1 local23;
			@Pc(29) int local29;
			@Pc(119) Class1 local119;
			if (this.aBoolean152) {
				local18 = true;
				for (local23 = this.aClass3_13.method30(); local23 != null; local23 = this.aClass3_13.method33()) {
					local29 = (int) local23.aLong184;
					if (this.aByteArray35[local29] == 0) {
						this.method2200(local29, 1);
					}
					if (this.aByteArray35[local29] == 0) {
						local18 = false;
					} else {
						local23.method4186();
					}
				}
				while (this.aClass136_2.anIntArray451.length > this.anInt2861) {
					if (this.aClass136_2.anIntArray451[this.anInt2861] == 0) {
						this.anInt2861++;
					} else {
						if (this.aClass60_2.anInt2774 >= 250) {
							local18 = false;
							break;
						}
						if (this.aByteArray35[this.anInt2861] == 0) {
							this.method2200(this.anInt2861, 1);
						}
						if (this.aByteArray35[this.anInt2861] == 0) {
							local18 = false;
							local119 = new Class1();
							local119.aLong184 = this.anInt2861;
							this.aClass3_13.method28(local119);
						}
						this.anInt2861++;
					}
				}
				if (local18) {
					this.anInt2861 = 0;
					this.aBoolean152 = false;
				}
			} else if (this.aBoolean153) {
				local18 = true;
				for (local23 = this.aClass3_13.method30(); local23 != null; local23 = this.aClass3_13.method33()) {
					local29 = (int) local23.aLong184;
					if (this.aByteArray35[local29] != 1) {
						this.method2200(local29, 2);
					}
					if (this.aByteArray35[local29] == 1) {
						local23.method4186();
					} else {
						local18 = false;
					}
				}
				while (this.aClass136_2.anIntArray451.length > this.anInt2861) {
					if (this.aClass136_2.anIntArray451[this.anInt2861] == 0) {
						this.anInt2861++;
					} else {
						if (this.aClass18_3.method438()) {
							local18 = false;
							break;
						}
						if (this.aByteArray35[this.anInt2861] != 1) {
							this.method2200(this.anInt2861, 2);
						}
						if (this.aByteArray35[this.anInt2861] != 1) {
							local119 = new Class1();
							local18 = false;
							local119.aLong184 = this.anInt2861;
							this.aClass3_13.method28(local119);
						}
						this.anInt2861++;
					}
				}
				if (local18) {
					this.anInt2861 = 0;
					this.aBoolean153 = false;
				}
			} else {
				this.aClass3_13 = null;
			}
		}
		if (!this.aBoolean154 || this.aLong96 > Static31.method591()) {
			return;
		}
		for (@Pc(313) Class1_Sub2_Sub5 local313 = (Class1_Sub2_Sub5) this.aClass140_8.method4012(); local313 != null; local313 = (Class1_Sub2_Sub5) this.aClass140_8.method4013()) {
			if (!local313.aBoolean222) {
				if (local313.aBoolean223) {
					if (!local313.aBoolean221) {
						throw new RuntimeException();
					}
					local313.method4186();
				} else {
					local313.aBoolean223 = true;
				}
			}
		}
		this.aLong96 = Static31.method591() + 1000L;
	}

	@OriginalMember(owner = "client!j", name = "d", descriptor = "(B)I")
	public int method2196() {
		if (this.method2181() == null) {
			return this.aClass1_Sub2_Sub5_1 == null ? 0 : this.aClass1_Sub2_Sub5_1.method3390();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(I)I")
	public int method2197() {
		return this.aClass136_2 == null ? 0 : this.aClass136_2.anInt5170;
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)V")
	@Override
	public void method2187(@OriginalArg(0) int arg0) {
		if (this.aClass71_3 == null) {
			return;
		}
		for (@Pc(14) Class1 local14 = this.aClass3_14.method30(); local14 != null; local14 = this.aClass3_14.method33()) {
			if (local14.aLong184 == (long) arg0) {
				return;
			}
		}
		@Pc(34) Class1 local34 = new Class1();
		local34.aLong184 = arg0;
		this.aClass3_14.method28(local34);
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method2184(@OriginalArg(0) int arg0) {
		@Pc(16) Class1_Sub2_Sub5 local16 = this.method2200(arg0, 0);
		if (local16 == null) {
			return null;
		} else {
			@Pc(24) byte[] local24 = local16.method3391();
			local16.method4186();
			return local24;
		}
	}

	@OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
	public void method2199() {
		if (this.aClass3_13 == null || this.method2181() == null) {
			return;
		}
		for (@Pc(27) Class1 local27 = this.aClass3_14.method30(); local27 != null; local27 = this.aClass3_14.method33()) {
			@Pc(33) int local33 = (int) local27.aLong184;
			if (local33 < 0 || this.aClass136_2.anInt5163 <= local33 || this.aClass136_2.anIntArray451[local33] == 0) {
				local27.method4186();
			} else {
				if (this.aByteArray35[local33] == 0) {
					this.method2200(local33, 1);
				}
				if (this.aByteArray35[local33] == -1) {
					this.method2200(local33, 2);
				}
				if (this.aByteArray35[local33] == 1) {
					local27.method4186();
				}
			}
		}
	}

	@OriginalMember(owner = "client!j", name = "b", descriptor = "(IB)I")
	@Override
	public int method2190(@OriginalArg(0) int arg0) {
		@Pc(17) Class1_Sub2_Sub5 local17 = (Class1_Sub2_Sub5) this.aClass140_8.method4014((long) arg0);
		return local17 == null ? 0 : local17.method3390();
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(BII)Lclient!tf;")
	private Class1_Sub2_Sub5 method2200(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class1_Sub2_Sub5 local9 = (Class1_Sub2_Sub5) this.aClass140_8.method4014((long) arg0);
		if (local9 != null && arg1 == 0 && !local9.aBoolean221 && local9.aBoolean222) {
			local9.method4186();
			local9 = null;
		}
		if (local9 == null) {
			if (arg1 == 0) {
				if (this.aClass71_3 == null || this.aByteArray35[arg0] == -1) {
					if (this.aClass18_3.method443()) {
						return null;
					}
					local9 = this.aClass18_3.method444(arg0, true, (byte) 2, this.anInt2853);
				} else {
					local9 = this.aClass60_2.method2112(this.aClass71_3, arg0);
				}
			} else if (arg1 == 1) {
				if (this.aClass71_3 == null) {
					throw new RuntimeException();
				}
				local9 = this.aClass60_2.method2111(this.aClass71_3, arg0);
			} else if (arg1 == 2) {
				if (this.aClass71_3 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray35[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass18_3.method438()) {
					return null;
				}
				local9 = this.aClass18_3.method444(arg0, false, (byte) 2, this.anInt2853);
			} else {
				throw new RuntimeException();
			}
			this.aClass140_8.method4011(local9, (long) arg0);
		}
		if (local9.aBoolean222) {
			return null;
		}
		@Pc(168) byte[] local168 = local9.method3391();
		@Pc(197) int local197;
		@Pc(247) Class1_Sub2_Sub5_Sub2 local247;
		if (!(local9 instanceof Class1_Sub2_Sub5_Sub1)) {
			try {
				if (local168 == null || local168.length <= 2) {
					throw new RuntimeException();
				}
				Static150.aCRC32_3.reset();
				Static150.aCRC32_3.update(local168, 0, local168.length - 2);
				local197 = (int) Static150.aCRC32_3.getValue();
				if (this.aClass136_2.anIntArray454[arg0] != local197) {
					throw new RuntimeException();
				}
				this.aClass18_3.anInt768 = 0;
				this.aClass18_3.anInt769 = 0;
			} catch (@Pc(222) RuntimeException local222) {
				this.aClass18_3.method431();
				local9.method4186();
				if (local9.aBoolean221 && !this.aClass18_3.method443()) {
					local247 = this.aClass18_3.method444(arg0, true, (byte) 2, this.anInt2853);
					this.aClass140_8.method4011(local247, (long) arg0);
				}
				return null;
			}
			local168[local168.length - 2] = (byte) (this.aClass136_2.anIntArray455[arg0] >>> 8);
			local168[local168.length - 1] = (byte) this.aClass136_2.anIntArray455[arg0];
			if (this.aClass71_3 != null) {
				this.aClass60_2.method2110(local168, arg0, this.aClass71_3);
				if (this.aByteArray35[arg0] != 1) {
					this.anInt2859++;
					this.aByteArray35[arg0] = 1;
				}
			}
			if (!local9.aBoolean221) {
				local9.method4186();
			}
			return local9;
		}
		try {
			if (local168 == null || local168.length <= 2) {
				throw new RuntimeException();
			}
			Static150.aCRC32_3.reset();
			Static150.aCRC32_3.update(local168, 0, local168.length - 2);
			local197 = (int) Static150.aCRC32_3.getValue();
			if (this.aClass136_2.anIntArray454[arg0] != local197) {
				throw new RuntimeException();
			}
			@Pc(381) int local381 = ((local168[local168.length - 2] & 0xFF) << 8) + (local168[local168.length - 1] & 0xFF);
			if (local381 != (this.aClass136_2.anIntArray455[arg0] & 0xFFFF)) {
				throw new RuntimeException();
			}
			if (this.aByteArray35[arg0] != 1) {
				this.anInt2859++;
				this.aByteArray35[arg0] = 1;
			}
			if (!local9.aBoolean221) {
				local9.method4186();
			}
			return local9;
		} catch (@Pc(422) Exception local422) {
			this.aByteArray35[arg0] = -1;
			local9.method4186();
			if (local9.aBoolean221 && !this.aClass18_3.method443()) {
				local247 = this.aClass18_3.method444(arg0, true, (byte) 2, this.anInt2853);
				this.aClass140_8.method4011(local247, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!j", name = "a", descriptor = "(B)Lclient!uj;")
	@Override
	public Class136 method2181() {
		if (this.aClass136_2 != null) {
			return this.aClass136_2;
		}
		if (this.aClass1_Sub2_Sub5_1 == null) {
			if (this.aClass18_3.method443()) {
				return null;
			}
			this.aClass1_Sub2_Sub5_1 = this.aClass18_3.method444(this.anInt2853, true, (byte) 0, 255);
		}
		if (this.aClass1_Sub2_Sub5_1.aBoolean222) {
			return null;
		}
		@Pc(51) byte[] local51 = this.aClass1_Sub2_Sub5_1.method3391();
		if (this.aClass1_Sub2_Sub5_1 instanceof Class1_Sub2_Sub5_Sub1) {
			try {
				if (local51 == null) {
					throw new RuntimeException();
				}
				this.aClass136_2 = new Class136(local51, this.anInt2851);
				if (this.aClass136_2.anInt5169 != this.anInt2849) {
					throw new RuntimeException();
				}
			} catch (@Pc(80) RuntimeException local80) {
				this.aClass136_2 = null;
				if (this.aClass18_3.method443()) {
					this.aClass1_Sub2_Sub5_1 = null;
				} else {
					this.aClass1_Sub2_Sub5_1 = this.aClass18_3.method444(this.anInt2853, true, (byte) 0, 255);
				}
				return null;
			}
		} else {
			try {
				if (local51 == null) {
					throw new RuntimeException();
				}
				this.aClass136_2 = new Class136(local51, this.anInt2851);
			} catch (@Pc(122) RuntimeException local122) {
				this.aClass18_3.method431();
				this.aClass136_2 = null;
				if (this.aClass18_3.method443()) {
					this.aClass1_Sub2_Sub5_1 = null;
				} else {
					this.aClass1_Sub2_Sub5_1 = this.aClass18_3.method444(this.anInt2853, true, (byte) 0, 255);
				}
				return null;
			}
			if (this.aClass71_2 != null) {
				this.aClass60_2.method2110(local51, this.anInt2853, this.aClass71_2);
			}
		}
		this.aClass1_Sub2_Sub5_1 = null;
		if (this.aClass71_3 != null) {
			this.aByteArray35 = new byte[this.aClass136_2.anInt5163];
			this.anInt2859 = 0;
		}
		return this.aClass136_2;
	}
}
