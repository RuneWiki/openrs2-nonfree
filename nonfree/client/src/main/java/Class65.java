import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cg")
public final class Class65 {

	@OriginalMember(owner = "client!cg", name = "r", descriptor = "J")
	private long aLong35;

	@OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
	private int anInt1147;

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "Lclient!iea;")
	private Class170 aClass170_1;

	@OriginalMember(owner = "client!cg", name = "G", descriptor = "Lclient!ih;")
	private Class5_Sub5_Sub7_Sub1 aClass5_Sub5_Sub7_Sub1_1;

	@OriginalMember(owner = "client!cg", name = "w", descriptor = "Lclient!gq;")
	private final Class149 aClass149_1 = new Class149();

	@OriginalMember(owner = "client!cg", name = "D", descriptor = "Lclient!gq;")
	private final Class149 aClass149_2 = new Class149();

	@OriginalMember(owner = "client!cg", name = "i", descriptor = "Lclient!gq;")
	private final Class149 aClass149_3 = new Class149();

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "Lclient!gq;")
	private final Class149 aClass149_4 = new Class149();

	@OriginalMember(owner = "client!cg", name = "x", descriptor = "Lclient!ib;")
	private final Class5_Sub23 aClass5_Sub23_1 = new Class5_Sub23(4);

	@OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
	public volatile int anInt1148 = 0;

	@OriginalMember(owner = "client!cg", name = "q", descriptor = "B")
	private byte aByte23 = 0;

	@OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
	public volatile int anInt1149 = 0;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "Lclient!ib;")
	private final Class5_Sub23 aClass5_Sub23_2 = new Class5_Sub23(8);

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)Z")
	public boolean method1125() {
		return this.method1136() >= 20;
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)Z")
	public boolean method1126() {
		return this.method1131() >= 20;
	}

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)V")
	public void method1127() {
		if (this.aClass170_1 != null) {
			this.aClass170_1.method3637();
		}
	}

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)V")
	public void method1128() {
		if (this.aClass170_1 != null) {
			this.aClass170_1.method3644();
		}
	}

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)Z")
	public boolean method1129() {
		@Pc(13) int local13;
		if (this.aClass170_1 != null) {
			@Pc(7) long local7 = Static515.method7499(97);
			local13 = (int) (local7 - this.aLong35);
			if (local13 > 200) {
				local13 = 200;
			}
			this.aLong35 = local7;
			this.anInt1147 += local13;
			if (this.anInt1147 > 30000) {
				try {
					this.aClass170_1.method3637();
				} catch (@Pc(37) Exception local37) {
				}
				this.aClass170_1 = null;
			}
		}
		if (this.aClass170_1 == null) {
			return this.method1131() == 0 && this.method1136() == 0;
		}
		try {
			this.aClass170_1.method3639();
			for (@Pc(76) Class5_Sub5_Sub7_Sub1 local76 = (Class5_Sub5_Sub7_Sub1) this.aClass149_1.method2890(); local76 != null; local76 = (Class5_Sub5_Sub7_Sub1) this.aClass149_1.method2894()) {
				this.aClass5_Sub23_1.anInt9869 = 0;
				this.aClass5_Sub23_1.method8502(1);
				this.aClass5_Sub23_1.method8522((int) local76.aLong312);
				this.aClass170_1.method3641(this.aClass5_Sub23_1.aByteArray102, 4);
				this.aClass149_2.method2889(local76);
			}
			if (200 != 200) {
				this.aClass170_1 = null;
			}
			for (@Pc(136) Class5_Sub5_Sub7_Sub1 local136 = (Class5_Sub5_Sub7_Sub1) this.aClass149_3.method2890(); local136 != null; local136 = (Class5_Sub5_Sub7_Sub1) this.aClass149_3.method2894()) {
				this.aClass5_Sub23_1.anInt9869 = 0;
				this.aClass5_Sub23_1.method8502(0);
				this.aClass5_Sub23_1.method8522((int) local136.aLong312);
				this.aClass170_1.method3641(this.aClass5_Sub23_1.aByteArray102, 4);
				this.aClass149_4.method2889(local136);
			}
			for (local13 = 0; local13 < 100; local13++) {
				@Pc(191) int local191 = this.aClass170_1.method3640();
				if (local191 < 0) {
					throw new IOException();
				}
				if (local191 == 0) {
					break;
				}
				this.anInt1147 = 0;
				@Pc(207) byte local207 = 0;
				if (this.aClass5_Sub5_Sub7_Sub1_1 == null) {
					local207 = 8;
				} else if (this.aClass5_Sub5_Sub7_Sub1_1.anInt4302 == 0) {
					local207 = 1;
				}
				@Pc(234) int local234;
				@Pc(258) int local258;
				@Pc(330) int local330;
				if (local207 > 0) {
					local234 = local207 - this.aClass5_Sub23_2.anInt9869;
					if (local234 > local191) {
						local234 = local191;
					}
					this.aClass170_1.method3642(this.aClass5_Sub23_2.aByteArray102, local234, this.aClass5_Sub23_2.anInt9869);
					if (this.aByte23 != 0) {
						for (local258 = 0; local258 < local234; local258++) {
							this.aClass5_Sub23_2.aByteArray102[this.aClass5_Sub23_2.anInt9869 + local258] = (byte) (this.aClass5_Sub23_2.aByteArray102[this.aClass5_Sub23_2.anInt9869 + local258] ^ this.aByte23);
						}
					}
					this.aClass5_Sub23_2.anInt9869 += local234;
					if (local207 <= this.aClass5_Sub23_2.anInt9869) {
						if (this.aClass5_Sub5_Sub7_Sub1_1 == null) {
							this.aClass5_Sub23_2.anInt9869 = 0;
							local258 = this.aClass5_Sub23_2.method8529();
							local330 = this.aClass5_Sub23_2.method8519();
							@Pc(335) int local335 = this.aClass5_Sub23_2.method8529();
							@Pc(340) int local340 = this.aClass5_Sub23_2.method8527();
							@Pc(344) int local344 = local335 & 0x7F;
							@Pc(356) boolean local356 = (local335 & 0x80) != 0;
							@Pc(363) long local363 = (long) ((local258 << 16) + local330);
							@Pc(373) Class5_Sub5_Sub7_Sub1 local373;
							if (local356) {
								for (local373 = (Class5_Sub5_Sub7_Sub1) this.aClass149_4.method2890(); local373 != null && local363 != local373.aLong312; local373 = (Class5_Sub5_Sub7_Sub1) this.aClass149_4.method2894()) {
								}
							} else {
								for (local373 = (Class5_Sub5_Sub7_Sub1) this.aClass149_2.method2890(); local373 != null && local363 != local373.aLong312; local373 = (Class5_Sub5_Sub7_Sub1) this.aClass149_2.method2894()) {
								}
							}
							if (local373 == null) {
								throw new IOException();
							}
							@Pc(458) int local458 = local344 == 0 ? 5 : 9;
							this.aClass5_Sub5_Sub7_Sub1_1 = local373;
							this.aClass5_Sub5_Sub7_Sub1_1.aClass5_Sub23_3 = new Class5_Sub23(this.aClass5_Sub5_Sub7_Sub1_1.aByte64 + local458 + local340);
							this.aClass5_Sub5_Sub7_Sub1_1.aClass5_Sub23_3.method8502(local344);
							this.aClass5_Sub5_Sub7_Sub1_1.aClass5_Sub23_3.method8486(local340);
							this.aClass5_Sub23_2.anInt9869 = 0;
							this.aClass5_Sub5_Sub7_Sub1_1.anInt4302 = 8;
						} else if (this.aClass5_Sub5_Sub7_Sub1_1.anInt4302 != 0) {
							throw new IOException();
						} else if (this.aClass5_Sub23_2.aByteArray102[0] == -1) {
							this.aClass5_Sub23_2.anInt9869 = 0;
							this.aClass5_Sub5_Sub7_Sub1_1.anInt4302 = 1;
						} else {
							this.aClass5_Sub5_Sub7_Sub1_1 = null;
						}
					}
				} else {
					local234 = this.aClass5_Sub5_Sub7_Sub1_1.aClass5_Sub23_3.aByteArray102.length - this.aClass5_Sub5_Sub7_Sub1_1.aByte64;
					local258 = 512 - this.aClass5_Sub5_Sub7_Sub1_1.anInt4302;
					if (local234 - this.aClass5_Sub5_Sub7_Sub1_1.aClass5_Sub23_3.anInt9869 < local258) {
						local258 = local234 - this.aClass5_Sub5_Sub7_Sub1_1.aClass5_Sub23_3.anInt9869;
					}
					if (local191 < local258) {
						local258 = local191;
					}
					this.aClass170_1.method3642(this.aClass5_Sub5_Sub7_Sub1_1.aClass5_Sub23_3.aByteArray102, local258, this.aClass5_Sub5_Sub7_Sub1_1.aClass5_Sub23_3.anInt9869);
					if (this.aByte23 != 0) {
						for (local330 = 0; local330 < local258; local330++) {
							this.aClass5_Sub5_Sub7_Sub1_1.aClass5_Sub23_3.aByteArray102[local330 + this.aClass5_Sub5_Sub7_Sub1_1.aClass5_Sub23_3.anInt9869] ^= this.aByte23;
						}
					}
					this.aClass5_Sub5_Sub7_Sub1_1.aClass5_Sub23_3.anInt9869 += local258;
					this.aClass5_Sub5_Sub7_Sub1_1.anInt4302 += local258;
					if (local234 == this.aClass5_Sub5_Sub7_Sub1_1.aClass5_Sub23_3.anInt9869) {
						this.aClass5_Sub5_Sub7_Sub1_1.method9186();
						this.aClass5_Sub5_Sub7_Sub1_1.aBoolean613 = false;
						this.aClass5_Sub5_Sub7_Sub1_1 = null;
					} else if (this.aClass5_Sub5_Sub7_Sub1_1.anInt4302 == 512) {
						this.aClass5_Sub5_Sub7_Sub1_1.anInt4302 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(698) IOException local698) {
			try {
				this.aClass170_1.method3637();
			} catch (@Pc(704) Exception local704) {
			}
			this.anInt1149 = -2;
			this.anInt1148++;
			this.aClass170_1 = null;
			return this.method1131() == 0 && this.method1136() == 0;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)I")
	public int method1131() {
		return this.aClass149_1.method2893() + this.aClass149_2.method2893();
	}

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)V")
	private void method1132() {
		if (this.aClass170_1 == null) {
			return;
		}
		try {
			this.aClass5_Sub23_1.anInt9869 = 0;
			this.aClass5_Sub23_1.method8502(6);
			this.aClass5_Sub23_1.method8522(3);
			this.aClass170_1.method3641(this.aClass5_Sub23_1.aByteArray102, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass170_1.method3637();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt1148++;
			this.anInt1149 = -2;
			this.aClass170_1 = null;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BZ)V")
	public void method1133(@OriginalArg(1) boolean arg0) {
		if (this.aClass170_1 == null) {
			return;
		}
		try {
			this.aClass5_Sub23_1.anInt9869 = 0;
			this.aClass5_Sub23_1.method8502(arg0 ? 2 : 3);
			this.aClass5_Sub23_1.method8522(0);
			this.aClass170_1.method3641(this.aClass5_Sub23_1.aByteArray102, 4);
		} catch (@Pc(48) IOException local48) {
			try {
				this.aClass170_1.method3637();
			} catch (@Pc(54) Exception local54) {
			}
			this.anInt1149 = -2;
			this.aClass170_1 = null;
			this.anInt1148++;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!iea;ZI)V")
	public void method1134(@OriginalArg(0) Class170 arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass170_1 != null) {
			try {
				this.aClass170_1.method3637();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass170_1 = null;
		}
		this.aClass170_1 = arg0;
		this.method1132();
		this.method1133(arg1);
		this.aClass5_Sub23_2.anInt9869 = 0;
		this.aClass5_Sub5_Sub7_Sub1_1 = null;
		while (true) {
			@Pc(40) Class5_Sub5_Sub7_Sub1 local40 = (Class5_Sub5_Sub7_Sub1) this.aClass149_2.method2886();
			if (local40 == null) {
				while (true) {
					local40 = (Class5_Sub5_Sub7_Sub1) this.aClass149_4.method2886();
					if (local40 == null) {
						if (this.aByte23 != 0) {
							try {
								this.aClass5_Sub23_1.anInt9869 = 0;
								this.aClass5_Sub23_1.method8502(4);
								this.aClass5_Sub23_1.method8502(this.aByte23);
								this.aClass5_Sub23_1.method8480(0);
								this.aClass170_1.method3641(this.aClass5_Sub23_1.aByteArray102, 4);
							} catch (@Pc(112) IOException local112) {
								try {
									this.aClass170_1.method3637();
								} catch (@Pc(118) Exception local118) {
								}
								this.anInt1148++;
								this.anInt1149 = -2;
								this.aClass170_1 = null;
							}
						}
						this.anInt1147 = 0;
						this.aLong35 = Static515.method7499(117);
						return;
					}
					this.aClass149_3.method2889(local40);
				}
			}
			this.aClass149_1.method2889(local40);
		}
	}

	@OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)I")
	private int method1136() {
		return this.aClass149_3.method2893() + this.aClass149_4.method2893();
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
	public void method1137() {
		try {
			this.aClass170_1.method3637();
		} catch (@Pc(5) Exception local5) {
		}
		this.aByte23 = (byte) (int) (Math.random() * 255.0D + 1.0D);
		this.aClass170_1 = null;
		this.anInt1149 = -1;
		this.anInt1148++;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZIIIB)Lclient!ih;")
	public Class5_Sub5_Sub7_Sub1 method1138(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(10) long local10 = (long) (arg2 + (arg1 << 16));
		@Pc(14) Class5_Sub5_Sub7_Sub1 local14 = new Class5_Sub5_Sub7_Sub1();
		local14.aBoolean615 = arg0;
		local14.aLong312 = local10;
		local14.aByte64 = arg3;
		if (arg0) {
			if (this.method1131() >= 20) {
				throw new RuntimeException();
			}
			this.aClass149_1.method2889(local14);
		} else if (this.method1136() < 20) {
			this.aClass149_3.method2889(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!cg", name = "h", descriptor = "(I)V")
	public void method1139() {
		if (this.aClass170_1 == null) {
			return;
		}
		try {
			this.aClass5_Sub23_1.anInt9869 = 0;
			this.aClass5_Sub23_1.method8502(7);
			this.aClass5_Sub23_1.method8522(0);
			this.aClass170_1.method3641(this.aClass5_Sub23_1.aByteArray102, 4);
		} catch (@Pc(33) IOException local33) {
			try {
				this.aClass170_1.method3637();
			} catch (@Pc(39) Exception local39) {
			}
			this.anInt1148++;
			this.anInt1149 = -2;
			this.aClass170_1 = null;
		}
	}
}
