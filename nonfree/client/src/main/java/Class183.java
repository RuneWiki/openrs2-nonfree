import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class183 {

	@OriginalMember(owner = "client!pp", name = "w", descriptor = "Lclient!ld;")
	public static final Class135 aClass135_30;

	@OriginalMember(owner = "client!pp", name = "x", descriptor = "Lclient!iu;")
	private Class111 aClass111_3;

	@OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
	private int anInt5051;

	@OriginalMember(owner = "client!pp", name = "z", descriptor = "J")
	private long aLong151;

	@OriginalMember(owner = "client!pp", name = "G", descriptor = "Lclient!jj;")
	private Class2_Sub2_Sub10_Sub1 aClass2_Sub2_Sub10_Sub1_2;

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "Lclient!wc;")
	private final Class246 aClass246_5 = new Class246();

	@OriginalMember(owner = "client!pp", name = "r", descriptor = "Lclient!wc;")
	private final Class246 aClass246_6 = new Class246();

	@OriginalMember(owner = "client!pp", name = "u", descriptor = "Lclient!wc;")
	private final Class246 aClass246_7 = new Class246();

	@OriginalMember(owner = "client!pp", name = "v", descriptor = "Lclient!wc;")
	private final Class246 aClass246_8 = new Class246();

	@OriginalMember(owner = "client!pp", name = "B", descriptor = "Lclient!bt;")
	private final Class2_Sub4 aClass2_Sub4_7 = new Class2_Sub4(4);

	@OriginalMember(owner = "client!pp", name = "E", descriptor = "B")
	private byte aByte55 = 0;

	@OriginalMember(owner = "client!pp", name = "F", descriptor = "I")
	public volatile int anInt5053 = 0;

	@OriginalMember(owner = "client!pp", name = "D", descriptor = "I")
	public volatile int anInt5052 = 0;

	@OriginalMember(owner = "client!pp", name = "C", descriptor = "Lclient!bt;")
	private final Class2_Sub4 aClass2_Sub4_8 = new Class2_Sub4(8);

	static {
		new Class79("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
		aClass135_30 = new Class135();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V", line = 20)
	private void method4633() {
		if (this.aClass111_3 == null) {
			return;
		}
		try {
			this.aClass2_Sub4_7.anInt5289 = 0;
			this.aClass2_Sub4_7.method4843(6);
			this.aClass2_Sub4_7.method4847(3);
			this.aClass111_3.method2799(4, this.aClass2_Sub4_7.aByteArray73);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass111_3.method2801();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt5052 = -2;
			this.anInt5053++;
			this.aClass111_3 = null;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V", line = 51)
	public void method4634() {
		if (this.aClass111_3 != null) {
			this.aClass111_3.method2803();
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)V", line = 78)
	public void method4636() {
		if (this.aClass111_3 == null) {
			return;
		}
		try {
			this.aClass2_Sub4_7.anInt5289 = 0;
			this.aClass2_Sub4_7.method4843(7);
			this.aClass2_Sub4_7.method4847(0);
			this.aClass111_3.method2799(4, this.aClass2_Sub4_7.aByteArray73);
		} catch (@Pc(34) IOException local34) {
			try {
				this.aClass111_3.method2801();
			} catch (@Pc(40) Exception local40) {
			}
			this.anInt5052 = -2;
			this.aClass111_3 = null;
			this.anInt5053++;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)Z", line = 105)
	public boolean method4637() {
		return this.method4647() >= 20;
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(I)I", line = 116)
	public int method4638() {
		return this.aClass246_5.method6339() + this.aClass246_6.method6339();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(Lclient!iu;ZI)V", line = 140)
	public void method4640(@OriginalArg(0) Class111 arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass111_3 != null) {
			try {
				this.aClass111_3.method2801();
			} catch (@Pc(16) Exception local16) {
			}
			this.aClass111_3 = null;
		}
		this.aClass111_3 = arg0;
		this.method4633();
		this.method4648(arg1);
		this.aClass2_Sub4_8.anInt5289 = 0;
		this.aClass2_Sub2_Sub10_Sub1_2 = null;
		while (true) {
			@Pc(44) Class2_Sub2_Sub10_Sub1 local44 = (Class2_Sub2_Sub10_Sub1) this.aClass246_6.method6340();
			if (local44 == null) {
				while (true) {
					local44 = (Class2_Sub2_Sub10_Sub1) this.aClass246_8.method6340();
					if (local44 == null) {
						if (this.aByte55 != 0) {
							try {
								this.aClass2_Sub4_7.anInt5289 = 0;
								this.aClass2_Sub4_7.method4843(4);
								this.aClass2_Sub4_7.method4843(this.aByte55);
								this.aClass2_Sub4_7.method4844(0);
								this.aClass111_3.method2799(4, this.aClass2_Sub4_7.aByteArray73);
							} catch (@Pc(103) IOException local103) {
								try {
									this.aClass111_3.method2801();
								} catch (@Pc(111) Exception local111) {
								}
								this.aClass111_3 = null;
								this.anInt5052 = -2;
								this.anInt5053++;
							}
						}
						this.anInt5051 = 0;
						this.aLong151 = Static190.method3686();
						return;
					}
					this.aClass246_7.method6342(local44);
				}
			}
			this.aClass246_5.method6342(local44);
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(Z)Z", line = 206)
	public boolean method4641() {
		@Pc(18) int local18;
		if (this.aClass111_3 != null) {
			@Pc(11) long local11 = Static190.method3686();
			local18 = (int) (local11 - this.aLong151);
			this.aLong151 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt5051 += local18;
			if (this.anInt5051 > 30000) {
				try {
					this.aClass111_3.method2801();
				} catch (@Pc(46) Exception local46) {
				}
				this.aClass111_3 = null;
			}
		}
		if (this.aClass111_3 == null) {
			return this.method4638() == 0 && this.method4647() == 0;
		}
		try {
			this.aClass111_3.method2794();
			for (@Pc(74) Class2_Sub2_Sub10_Sub1 local74 = (Class2_Sub2_Sub10_Sub1) this.aClass246_5.method6338(); local74 != null; local74 = (Class2_Sub2_Sub10_Sub1) this.aClass246_5.method6337()) {
				this.aClass2_Sub4_7.anInt5289 = 0;
				this.aClass2_Sub4_7.method4843(1);
				this.aClass2_Sub4_7.method4847((int) local74.aLong215);
				this.aClass111_3.method2799(4, this.aClass2_Sub4_7.aByteArray73);
				this.aClass246_6.method6342(local74);
			}
			for (@Pc(126) Class2_Sub2_Sub10_Sub1 local126 = (Class2_Sub2_Sub10_Sub1) this.aClass246_7.method6338(); local126 != null; local126 = (Class2_Sub2_Sub10_Sub1) this.aClass246_7.method6337()) {
				this.aClass2_Sub4_7.anInt5289 = 0;
				this.aClass2_Sub4_7.method4843(0);
				this.aClass2_Sub4_7.method4847((int) local126.aLong215);
				this.aClass111_3.method2799(4, this.aClass2_Sub4_7.aByteArray73);
				this.aClass246_8.method6342(local126);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(175) int local175 = this.aClass111_3.method2797();
				if (local175 < 0) {
					throw new IOException();
				}
				if (local175 == 0) {
					break;
				}
				this.anInt5051 = 0;
				@Pc(191) byte local191 = 0;
				if (this.aClass2_Sub2_Sub10_Sub1_2 == null) {
					local191 = 8;
				} else if (this.aClass2_Sub2_Sub10_Sub1_2.anInt3079 == 0) {
					local191 = 1;
				}
				@Pc(219) int local219;
				@Pc(243) int local243;
				@Pc(301) int local301;
				if (local191 > 0) {
					local219 = local191 - this.aClass2_Sub4_8.anInt5289;
					if (local175 < local219) {
						local219 = local175;
					}
					this.aClass111_3.method2795(this.aClass2_Sub4_8.aByteArray73, local219, this.aClass2_Sub4_8.anInt5289);
					if (this.aByte55 != 0) {
						for (local243 = 0; local243 < local219; local243++) {
							this.aClass2_Sub4_8.aByteArray73[this.aClass2_Sub4_8.anInt5289 + local243] = (byte) (this.aClass2_Sub4_8.aByteArray73[this.aClass2_Sub4_8.anInt5289 + local243] ^ this.aByte55);
						}
					}
					this.aClass2_Sub4_8.anInt5289 += local219;
					if (this.aClass2_Sub4_8.anInt5289 >= local191) {
						if (this.aClass2_Sub2_Sub10_Sub1_2 == null) {
							this.aClass2_Sub4_8.anInt5289 = 0;
							local243 = this.aClass2_Sub4_8.method4816();
							local301 = this.aClass2_Sub4_8.method4830();
							@Pc(306) int local306 = this.aClass2_Sub4_8.method4816();
							@Pc(311) int local311 = this.aClass2_Sub4_8.method4837();
							@Pc(315) int local315 = local306 & 0x7F;
							@Pc(326) boolean local326 = (local306 & 0x80) != 0;
							@Pc(333) long local333 = (long) ((local243 << 16) + local301);
							@Pc(343) Class2_Sub2_Sub10_Sub1 local343;
							if (local326) {
								for (local343 = (Class2_Sub2_Sub10_Sub1) this.aClass246_8.method6338(); local343 != null && local333 != local343.aLong215; local343 = (Class2_Sub2_Sub10_Sub1) this.aClass246_8.method6337()) {
								}
							} else {
								for (local343 = (Class2_Sub2_Sub10_Sub1) this.aClass246_6.method6338(); local343 != null && local343.aLong215 != local333; local343 = (Class2_Sub2_Sub10_Sub1) this.aClass246_6.method6337()) {
								}
							}
							if (local343 == null) {
								throw new IOException();
							}
							this.aClass2_Sub2_Sub10_Sub1_2 = local343;
							@Pc(399) int local399 = local315 == 0 ? 5 : 9;
							this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3 = new Class2_Sub4(local311 + local399 + this.aClass2_Sub2_Sub10_Sub1_2.aByte27);
							this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.method4843(local315);
							this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.method4814(local311);
							this.aClass2_Sub2_Sub10_Sub1_2.anInt3079 = 8;
							this.aClass2_Sub4_8.anInt5289 = 0;
						} else if (this.aClass2_Sub2_Sub10_Sub1_2.anInt3079 != 0) {
							throw new IOException();
						} else if (this.aClass2_Sub4_8.aByteArray73[0] == -1) {
							this.aClass2_Sub2_Sub10_Sub1_2.anInt3079 = 1;
							this.aClass2_Sub4_8.anInt5289 = 0;
						} else {
							this.aClass2_Sub2_Sub10_Sub1_2 = null;
						}
					}
				} else {
					local219 = this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.aByteArray73.length - this.aClass2_Sub2_Sub10_Sub1_2.aByte27;
					local243 = 512 - this.aClass2_Sub2_Sub10_Sub1_2.anInt3079;
					if (local219 - this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.anInt5289 < local243) {
						local243 = local219 - this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.anInt5289;
					}
					if (local175 < local243) {
						local243 = local175;
					}
					this.aClass111_3.method2795(this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.aByteArray73, local243, this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.anInt5289);
					if (this.aByte55 != 0) {
						for (local301 = 0; local301 < local243; local301++) {
							this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.aByteArray73[local301 + this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.anInt5289] ^= this.aByte55;
						}
					}
					this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.anInt5289 += local243;
					this.aClass2_Sub2_Sub10_Sub1_2.anInt3079 += local243;
					if (local219 == this.aClass2_Sub2_Sub10_Sub1_2.aClass2_Sub4_3.anInt5289) {
						this.aClass2_Sub2_Sub10_Sub1_2.method6144();
						this.aClass2_Sub2_Sub10_Sub1_2.aBoolean416 = false;
						this.aClass2_Sub2_Sub10_Sub1_2 = null;
					} else if (this.aClass2_Sub2_Sub10_Sub1_2.anInt3079 == 512) {
						this.aClass2_Sub2_Sub10_Sub1_2.anInt3079 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(619) IOException local619) {
			try {
				this.aClass111_3.method2801();
			} catch (@Pc(625) Exception local625) {
			}
			this.aClass111_3 = null;
			this.anInt5053++;
			this.anInt5052 = -2;
			return this.method4638() == 0 && this.method4647() == 0;
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZIBBI)Lclient!jj;", line = 502)
	public Class2_Sub2_Sub10_Sub1 method4643(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3) {
		@Pc(16) long local16 = (long) ((arg1 << 16) + arg3);
		@Pc(20) Class2_Sub2_Sub10_Sub1 local20 = new Class2_Sub2_Sub10_Sub1();
		local20.aBoolean418 = arg0;
		local20.aLong215 = local16;
		local20.aByte27 = arg2;
		if (arg0) {
			if (this.method4638() >= 20) {
				throw new RuntimeException();
			}
			this.aClass246_5.method6342(local20);
		} else if (this.method4647() < 20) {
			this.aClass246_7.method6342(local20);
		} else {
			throw new RuntimeException();
		}
		return local20;
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(B)V", line = 543)
	public void method4644() {
		try {
			this.aClass111_3.method2801();
		} catch (@Pc(9) Exception local9) {
		}
		this.anInt5052 = -1;
		this.aClass111_3 = null;
		this.anInt5053++;
		this.aByte55 = (byte) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "(I)Z", line = 560)
	public boolean method4645() {
		return this.method4638() >= 20;
	}

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "(I)V", line = 571)
	public void method4646() {
		if (this.aClass111_3 != null) {
			this.aClass111_3.method2801();
		}
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "(Z)I", line = 587)
	private int method4647() {
		return this.aClass246_7.method6339() + this.aClass246_8.method6339();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZI)V", line = 608)
	public void method4648(@OriginalArg(0) boolean arg0) {
		if (this.aClass111_3 == null) {
			return;
		}
		try {
			this.aClass2_Sub4_7.anInt5289 = 0;
			this.aClass2_Sub4_7.method4843(arg0 ? 2 : 3);
			this.aClass2_Sub4_7.method4847(0);
			this.aClass111_3.method2799(4, this.aClass2_Sub4_7.aByteArray73);
		} catch (@Pc(41) IOException local41) {
			try {
				this.aClass111_3.method2801();
			} catch (@Pc(49) Exception local49) {
			}
			this.anInt5052 = -2;
			this.anInt5053++;
			this.aClass111_3 = null;
		}
	}
}
