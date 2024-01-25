import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qb")
public final class Class293_Sub1 extends Class293 {

	@OriginalMember(owner = "client!qb", name = "k", descriptor = "[B")
	private byte[] aByteArray87;

	@OriginalMember(owner = "client!qb", name = "G", descriptor = "Lclient!ai;")
	private Class16 aClass16_1;

	@OriginalMember(owner = "client!qb", name = "L", descriptor = "Z")
	private boolean aBoolean592;

	@OriginalMember(owner = "client!qb", name = "v", descriptor = "I")
	private int anInt8389 = 0;

	@OriginalMember(owner = "client!qb", name = "i", descriptor = "Lclient!fw;")
	private final Class125 aClass125_33 = new Class125(16);

	@OriginalMember(owner = "client!qb", name = "w", descriptor = "I")
	private int anInt8398 = 0;

	@OriginalMember(owner = "client!qb", name = "Q", descriptor = "Lclient!bd;")
	private final Class32 aClass32_55 = new Class32();

	@OriginalMember(owner = "client!qb", name = "F", descriptor = "J")
	private long aLong223 = 0L;

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "Lclient!vw;")
	private final Class384 aClass384_4;

	@OriginalMember(owner = "client!qb", name = "S", descriptor = "I")
	private final int anInt8383;

	@OriginalMember(owner = "client!qb", name = "A", descriptor = "Z")
	private boolean aBoolean591;

	@OriginalMember(owner = "client!qb", name = "P", descriptor = "Lclient!bd;")
	private Class32 aClass32_56;

	@OriginalMember(owner = "client!qb", name = "h", descriptor = "I")
	private final int anInt8381;

	@OriginalMember(owner = "client!qb", name = "B", descriptor = "Z")
	private final boolean aBoolean593;

	@OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
	private final int anInt8390;

	@OriginalMember(owner = "client!qb", name = "p", descriptor = "Lclient!as;")
	private final Class24 aClass24_4;

	@OriginalMember(owner = "client!qb", name = "t", descriptor = "Lclient!uga;")
	private final Class364 aClass364_3;

	@OriginalMember(owner = "client!qb", name = "l", descriptor = "[B")
	private final byte[] aByteArray88;

	@OriginalMember(owner = "client!qb", name = "N", descriptor = "Lclient!vw;")
	private final Class384 aClass384_3;

	@OriginalMember(owner = "client!qb", name = "y", descriptor = "Lclient!jg;")
	private Class14_Sub2_Sub7 aClass14_Sub2_Sub7_1;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(ILclient!vw;Lclient!vw;Lclient!as;Lclient!uga;I[BIZ)V")
	public Class293_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class384 arg1, @OriginalArg(2) Class384 arg2, @OriginalArg(3) Class24 arg3, @OriginalArg(4) Class364 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) byte[] arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8) {
		this.aClass384_4 = arg1;
		this.anInt8383 = arg0;
		if (this.aClass384_4 == null) {
			this.aBoolean591 = false;
		} else {
			this.aBoolean591 = true;
			this.aClass32_56 = new Class32();
		}
		this.anInt8381 = arg5;
		this.aBoolean593 = arg8;
		this.anInt8390 = arg7;
		this.aClass24_4 = arg3;
		this.aClass364_3 = arg4;
		this.aByteArray88 = arg6;
		this.aClass384_3 = arg2;
		if (this.aClass384_3 != null) {
			this.aClass14_Sub2_Sub7_1 = this.aClass364_3.method8652(this.anInt8383, this.aClass384_3);
		}
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)I")
	public int method7313() {
		if (this.method7308() == null) {
			return this.aClass14_Sub2_Sub7_1 == null ? 0 : this.aClass14_Sub2_Sub7_1.method7928();
		} else {
			return 100;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(II)[B")
	@Override
	public byte[] method7306(@OriginalArg(1) int arg0) {
		@Pc(9) Class14_Sub2_Sub7 local9 = this.method7316(arg0, 0);
		if (local9 == null) {
			return null;
		} else {
			@Pc(26) byte[] local26 = local9.method7931();
			local9.method9513();
			return local26;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)Lclient!ai;")
	@Override
	public Class16 method7308() {
		if (this.aClass16_1 != null) {
			return this.aClass16_1;
		}
		if (this.aClass14_Sub2_Sub7_1 == null) {
			if (this.aClass24_4.method369()) {
				return null;
			}
			this.aClass14_Sub2_Sub7_1 = this.aClass24_4.method373(true, this.anInt8383, 255, (byte) 0);
		}
		if (this.aClass14_Sub2_Sub7_1.aBoolean637) {
			return null;
		}
		@Pc(54) byte[] local54 = this.aClass14_Sub2_Sub7_1.method7931();
		if (this.aClass14_Sub2_Sub7_1 instanceof Class14_Sub2_Sub7_Sub1) {
			try {
				if (local54 == null) {
					throw new RuntimeException();
				}
				this.aClass16_1 = new Class16(local54, this.anInt8381, this.aByteArray88);
				if (this.anInt8390 != this.aClass16_1.anInt185) {
					throw new RuntimeException();
				}
			} catch (@Pc(91) RuntimeException local91) {
				this.aClass16_1 = null;
				if (this.aClass24_4.method369()) {
					this.aClass14_Sub2_Sub7_1 = null;
				} else {
					this.aClass14_Sub2_Sub7_1 = this.aClass24_4.method373(true, this.anInt8383, 255, (byte) 0);
				}
				return null;
			}
		} else {
			try {
				if (local54 == null) {
					throw new RuntimeException();
				}
				this.aClass16_1 = new Class16(local54, this.anInt8381, this.aByteArray88);
			} catch (@Pc(140) RuntimeException local140) {
				this.aClass24_4.method375();
				this.aClass16_1 = null;
				if (this.aClass24_4.method369()) {
					this.aClass14_Sub2_Sub7_1 = null;
				} else {
					this.aClass14_Sub2_Sub7_1 = this.aClass24_4.method373(true, this.anInt8383, 255, (byte) 0);
				}
				return null;
			}
			if (this.aClass384_3 != null) {
				this.aClass364_3.method8654(local54, this.aClass384_3, this.anInt8383);
			}
		}
		if (this.aClass384_4 != null) {
			this.aByteArray87 = new byte[this.aClass16_1.anInt182];
			this.anInt8389 = 0;
		}
		this.aClass14_Sub2_Sub7_1 = null;
		return this.aClass16_1;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(I)I")
	public int method7314() {
		return this.aClass16_1 == null ? 0 : this.aClass16_1.anInt189;
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(Z)V")
	public void method7315() {
		if (this.aClass32_56 == null || this.method7308() == null) {
			return;
		}
		for (@Pc(29) Class14 local29 = this.aClass32_55.method584(); local29 != null; local29 = this.aClass32_55.method577()) {
			@Pc(35) int local35 = (int) local29.aLong324;
			if (local35 < 0 || local35 >= this.aClass16_1.anInt182 || this.aClass16_1.anIntArray15[local35] == 0) {
				local29.method9513();
			} else {
				if (this.aByteArray87[local35] == 0) {
					this.method7316(local35, 1);
				}
				if (this.aByteArray87[local35] == -1) {
					this.method7316(local35, 2);
				}
				if (this.aByteArray87[local35] == 1) {
					local29.method9513();
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BII)Lclient!jg;")
	private Class14_Sub2_Sub7 method7316(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(21) Class14_Sub2_Sub7 local21 = (Class14_Sub2_Sub7) this.aClass125_33.method2630((long) arg0);
		if (local21 != null && arg1 == 0 && !local21.aBoolean635 && local21.aBoolean637) {
			local21.method9513();
			local21 = null;
		}
		if (local21 == null) {
			if (arg1 == 0) {
				if (this.aClass384_4 == null || this.aByteArray87[arg0] == -1) {
					if (this.aClass24_4.method369()) {
						return null;
					}
					local21 = this.aClass24_4.method373(true, arg0, this.anInt8383, (byte) 2);
				} else {
					local21 = this.aClass364_3.method8652(arg0, this.aClass384_4);
				}
			} else if (arg1 == 1) {
				if (this.aClass384_4 == null) {
					throw new RuntimeException();
				}
				local21 = this.aClass364_3.method8656(arg0, this.aClass384_4);
			} else if (arg1 == 2) {
				if (this.aClass384_4 == null) {
					throw new RuntimeException();
				}
				if (this.aByteArray87[arg0] != -1) {
					throw new RuntimeException();
				}
				if (this.aClass24_4.method372()) {
					return null;
				}
				local21 = this.aClass24_4.method373(false, arg0, this.anInt8383, (byte) 2);
			} else {
				throw new RuntimeException();
			}
			this.aClass125_33.method2626(local21, (long) arg0);
		}
		if (local21.aBoolean637) {
			return null;
		}
		@Pc(194) byte[] local194 = local21.method7931();
		@Pc(226) int local226;
		@Pc(260) byte[] local260;
		@Pc(269) byte[] local269;
		@Pc(271) int local271;
		@Pc(388) Class14_Sub2_Sub7_Sub2 local388;
		if (!(local21 instanceof Class14_Sub2_Sub7_Sub1)) {
			try {
				label157: {
					if (local194 != null && local194.length > 2) {
						Static174.aCRC32_1.reset();
						Static174.aCRC32_1.update(local194, 0, local194.length - 2);
						local226 = (int) Static174.aCRC32_1.getValue();
						if (this.aClass16_1.anIntArray19[arg0] != local226) {
							throw new RuntimeException();
						}
						if (this.aClass16_1.aByteArrayArray1 == null || this.aClass16_1.aByteArrayArray1[arg0] == null) {
							break label157;
						}
						local260 = this.aClass16_1.aByteArrayArray1[arg0];
						local269 = Static197.method2948(local194.length - 2, local194, 0);
						local271 = 0;
						while (true) {
							if (local271 >= 64) {
								break label157;
							}
							if (local269[local271] != local260[local271]) {
								throw new RuntimeException();
							}
							local271++;
						}
					}
					throw new RuntimeException();
				}
				this.aClass24_4.anInt347 = 0;
				this.aClass24_4.anInt348 = 0;
			} catch (@Pc(499) RuntimeException local499) {
				this.aClass24_4.method375();
				local21.method9513();
				if (local21.aBoolean635 && !this.aClass24_4.method369()) {
					local388 = this.aClass24_4.method373(true, arg0, this.anInt8383, (byte) 2);
					this.aClass125_33.method2626(local388, (long) arg0);
				}
				return null;
			}
			local194[local194.length - 2] = (byte) (this.aClass16_1.anIntArray18[arg0] >>> 8);
			local194[local194.length - 1] = (byte) this.aClass16_1.anIntArray18[arg0];
			if (this.aClass384_4 != null) {
				this.aClass364_3.method8654(local194, this.aClass384_4, arg0);
				if (this.aByteArray87[arg0] != 1) {
					this.anInt8389++;
					this.aByteArray87[arg0] = 1;
				}
			}
			if (!local21.aBoolean635) {
				local21.method9513();
			}
			return local21;
		}
		try {
			if (local194 == null || local194.length <= 2) {
				throw new RuntimeException();
			}
			Static174.aCRC32_1.reset();
			Static174.aCRC32_1.update(local194, 0, local194.length - 2);
			local226 = (int) Static174.aCRC32_1.getValue();
			if (local226 != this.aClass16_1.anIntArray19[arg0]) {
				throw new RuntimeException();
			}
			if (this.aClass16_1.aByteArrayArray1 != null && this.aClass16_1.aByteArrayArray1[arg0] != null) {
				local260 = this.aClass16_1.aByteArrayArray1[arg0];
				local269 = Static197.method2948(local194.length - 2, local194, 0);
				for (local271 = 0; local271 < 64; local271++) {
					if (local260[local271] != local269[local271]) {
						throw new RuntimeException();
					}
				}
			}
			@Pc(312) int local312 = ((local194[local194.length - 2] & 0xFF) << 8) + (local194[local194.length - 1] & 0xFF);
			if ((this.aClass16_1.anIntArray18[arg0] & 0xFFFF) != local312) {
				throw new RuntimeException();
			}
			if (this.aByteArray87[arg0] != 1) {
				this.anInt8389++;
				this.aByteArray87[arg0] = 1;
			}
			if (!local21.aBoolean635) {
				local21.method9513();
			}
			return local21;
		} catch (@Pc(360) Exception local360) {
			this.aByteArray87[arg0] = -1;
			local21.method9513();
			if (local21.aBoolean635 && !this.aClass24_4.method369()) {
				local388 = this.aClass24_4.method373(true, arg0, this.anInt8383, (byte) 2);
				this.aClass125_33.method2626(local388, (long) arg0);
			}
			return null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IZ)V")
	@Override
	public void method7305(@OriginalArg(0) int arg0) {
		if (this.aClass384_4 == null) {
			return;
		}
		for (@Pc(23) Class14 local23 = this.aClass32_55.method584(); local23 != null; local23 = this.aClass32_55.method577()) {
			if ((long) arg0 == local23.aLong324) {
				return;
			}
		}
		@Pc(46) Class14 local46 = new Class14();
		local46.aLong324 = (long) arg0;
		this.aClass32_55.method582(local46);
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(B)I")
	public int method7317() {
		return this.anInt8389;
	}

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "(I)I")
	public int method7319() {
		if (this.aClass16_1 == null) {
			return 0;
		} else if (this.aBoolean591) {
			@Pc(28) Class14 local28 = this.aClass32_56.method584();
			return local28 == null ? 0 : (int) local28.aLong324;
		} else {
			return this.aClass16_1.anInt189;
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(II)I")
	@Override
	public int method7307(@OriginalArg(0) int arg0) {
		@Pc(17) Class14_Sub2_Sub7 local17 = (Class14_Sub2_Sub7) this.aClass125_33.method2630((long) arg0);
		return local17 == null ? 0 : local17.method7928();
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(B)V")
	public void method7321() {
		if (this.aClass32_56 != null) {
			if (this.method7308() == null) {
				return;
			}
			@Pc(42) boolean local42;
			@Pc(47) Class14 local47;
			@Pc(53) int local53;
			@Pc(150) Class14 local150;
			if (this.aBoolean591) {
				local42 = true;
				for (local47 = this.aClass32_56.method584(); local47 != null; local47 = this.aClass32_56.method577()) {
					local53 = (int) local47.aLong324;
					if (this.aByteArray87[local53] == 0) {
						this.method7316(local53, 1);
					}
					if (this.aByteArray87[local53] == 0) {
						local42 = false;
					} else {
						local47.method9513();
					}
				}
				while (this.aClass16_1.anIntArray15.length > this.anInt8398) {
					if (this.aClass16_1.anIntArray15[this.anInt8398] == 0) {
						this.anInt8398++;
					} else {
						if (this.aClass364_3.anInt10122 >= 250) {
							local42 = false;
							break;
						}
						if (this.aByteArray87[this.anInt8398] == 0) {
							this.method7316(this.anInt8398, 1);
						}
						if (this.aByteArray87[this.anInt8398] == 0) {
							local150 = new Class14();
							local150.aLong324 = (long) this.anInt8398;
							local42 = false;
							this.aClass32_56.method582(local150);
						}
						this.anInt8398++;
					}
				}
				if (local42) {
					this.anInt8398 = 0;
					this.aBoolean591 = false;
				}
			} else if (this.aBoolean592) {
				local42 = true;
				for (local47 = this.aClass32_56.method584(); local47 != null; local47 = this.aClass32_56.method577()) {
					local53 = (int) local47.aLong324;
					if (this.aByteArray87[local53] != 1) {
						this.method7316(local53, 2);
					}
					if (this.aByteArray87[local53] == 1) {
						local47.method9513();
					} else {
						local42 = false;
					}
				}
				while (this.anInt8398 < this.aClass16_1.anIntArray15.length) {
					if (this.aClass16_1.anIntArray15[this.anInt8398] == 0) {
						this.anInt8398++;
					} else {
						if (this.aClass24_4.method372()) {
							local42 = false;
							break;
						}
						if (this.aByteArray87[this.anInt8398] != 1) {
							this.method7316(this.anInt8398, 2);
						}
						if (this.aByteArray87[this.anInt8398] != 1) {
							local150 = new Class14();
							local150.aLong324 = (long) this.anInt8398;
							local42 = false;
							this.aClass32_56.method582(local150);
						}
						this.anInt8398++;
					}
				}
				if (local42) {
					this.aBoolean592 = false;
					this.anInt8398 = 0;
				}
			} else {
				this.aClass32_56 = null;
			}
		}
		if (!this.aBoolean593 || this.aLong223 > Static26.method382()) {
			return;
		}
		for (@Pc(370) Class14_Sub2_Sub7 local370 = (Class14_Sub2_Sub7) this.aClass125_33.method2633(); local370 != null; local370 = (Class14_Sub2_Sub7) this.aClass125_33.method2627()) {
			if (!local370.aBoolean637) {
				if (local370.aBoolean638) {
					if (!local370.aBoolean635) {
						throw new RuntimeException();
					}
					local370.method9513();
				} else {
					local370.aBoolean638 = true;
				}
			}
		}
		this.aLong223 = Static26.method382() + 1000L;
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "(I)V")
	public void method7322() {
		if (this.aClass384_4 != null) {
			this.aBoolean592 = true;
			if (this.aClass32_56 == null) {
				this.aClass32_56 = new Class32();
			}
		}
	}
}
