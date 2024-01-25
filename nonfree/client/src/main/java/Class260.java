import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ob")
public final class Class260 {

	@OriginalMember(owner = "client!ob", name = "v", descriptor = "J")
	private long aLong193;

	@OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
	private int anInt6702;

	@OriginalMember(owner = "client!ob", name = "y", descriptor = "Lclient!wo;")
	private Class390 aClass390_2;

	@OriginalMember(owner = "client!ob", name = "D", descriptor = "Lclient!kc;")
	private Class4_Sub5_Sub2_Sub1 aClass4_Sub5_Sub2_Sub1_2;

	@OriginalMember(owner = "client!ob", name = "h", descriptor = "Lclient!ut;")
	private final Class367 aClass367_6 = new Class367();

	@OriginalMember(owner = "client!ob", name = "p", descriptor = "Lclient!ut;")
	private final Class367 aClass367_7 = new Class367();

	@OriginalMember(owner = "client!ob", name = "q", descriptor = "Lclient!ut;")
	private final Class367 aClass367_8 = new Class367();

	@OriginalMember(owner = "client!ob", name = "t", descriptor = "Lclient!ut;")
	private final Class367 aClass367_9 = new Class367();

	@OriginalMember(owner = "client!ob", name = "w", descriptor = "Lclient!es;")
	private final Class4_Sub11 aClass4_Sub11_9 = new Class4_Sub11(4);

	@OriginalMember(owner = "client!ob", name = "C", descriptor = "B")
	private byte aByte91 = 0;

	@OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
	public volatile int anInt6703 = 0;

	@OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
	public volatile int anInt6704 = 0;

	@OriginalMember(owner = "client!ob", name = "B", descriptor = "Lclient!es;")
	private final Class4_Sub11 aClass4_Sub11_10 = new Class4_Sub11(8);

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
	public void method5874() {
		if (this.aClass390_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub11_9.anInt10466 = 0;
			this.aClass4_Sub11_9.method8822(7);
			this.aClass4_Sub11_9.method8892(0);
			this.aClass390_2.method8929(this.aClass4_Sub11_9.aByteArray107, 4);
		} catch (@Pc(39) IOException local39) {
			try {
				this.aClass390_2.method8926();
			} catch (@Pc(45) Exception local45) {
			}
			this.anInt6703++;
			this.anInt6704 = -2;
			this.aClass390_2 = null;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
	public void method5875() {
		if (this.aClass390_2 != null) {
			this.aClass390_2.method8926();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!wo;ZB)V")
	public void method5876(@OriginalArg(0) Class390 arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass390_2 != null) {
			try {
				this.aClass390_2.method8926();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass390_2 = null;
		}
		this.aClass390_2 = arg0;
		this.method5882();
		this.method5884(arg1);
		this.aClass4_Sub11_10.anInt10466 = 0;
		this.aClass4_Sub5_Sub2_Sub1_2 = null;
		while (true) {
			@Pc(44) Class4_Sub5_Sub2_Sub1 local44 = (Class4_Sub5_Sub2_Sub1) this.aClass367_7.method8311();
			if (local44 == null) {
				while (true) {
					local44 = (Class4_Sub5_Sub2_Sub1) this.aClass367_9.method8311();
					if (local44 == null) {
						if (this.aByte91 != 0) {
							try {
								this.aClass4_Sub11_9.anInt10466 = 0;
								this.aClass4_Sub11_9.method8822(4);
								this.aClass4_Sub11_9.method8822(this.aByte91);
								this.aClass4_Sub11_9.method8838(0);
								this.aClass390_2.method8929(this.aClass4_Sub11_9.aByteArray107, 4);
							} catch (@Pc(109) IOException local109) {
								try {
									this.aClass390_2.method8926();
								} catch (@Pc(115) Exception local115) {
								}
								this.aClass390_2 = null;
								this.anInt6703++;
								this.anInt6704 = -2;
							}
						}
						this.anInt6702 = 0;
						this.aLong193 = Static429.method5935();
						return;
					}
					this.aClass367_8.method8310(local44);
				}
			}
			this.aClass367_6.method8310(local44);
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)Z")
	public boolean method5877() {
		return this.method5881() >= 20;
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V")
	public void method5878() {
		try {
			this.aClass390_2.method8926();
		} catch (@Pc(9) Exception local9) {
		}
		this.anInt6704 = -1;
		this.aClass390_2 = null;
		this.anInt6703++;
		this.aByte91 = (byte) (int) (Math.random() * (double) 255 + 1.0D);
	}

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)Z")
	public boolean method5879() {
		return this.method5887() >= 20;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZBBI)Lclient!kc;")
	public Class4_Sub5_Sub2_Sub1 method5880(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3) {
		@Pc(15) long local15 = (long) ((arg3 << 16) + arg0);
		@Pc(19) Class4_Sub5_Sub2_Sub1 local19 = new Class4_Sub5_Sub2_Sub1();
		local19.aBoolean537 = arg1;
		local19.aLong306 = local15;
		local19.aByte74 = arg2;
		if (arg1) {
			if (this.method5887() >= 20) {
				throw new RuntimeException();
			}
			this.aClass367_6.method8310(local19);
		} else if (this.method5881() < 20) {
			this.aClass367_8.method8310(local19);
		} else {
			throw new RuntimeException();
		}
		return local19;
	}

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)I")
	private int method5881() {
		return this.aClass367_8.method8306() + this.aClass367_9.method8306();
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V")
	private void method5882() {
		if (this.aClass390_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub11_9.anInt10466 = 0;
			this.aClass4_Sub11_9.method8822(6);
			this.aClass4_Sub11_9.method8892(3);
			this.aClass390_2.method8929(this.aClass4_Sub11_9.aByteArray107, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass390_2.method8926();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt6703++;
			this.aClass390_2 = null;
			this.anInt6704 = -2;
		}
	}

	@OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V")
	public void method5883() {
		if (this.aClass390_2 != null) {
			this.aClass390_2.method8925();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZ)V")
	public void method5884(@OriginalArg(1) boolean arg0) {
		if (this.aClass390_2 == null) {
			return;
		}
		try {
			this.aClass4_Sub11_9.anInt10466 = 0;
			this.aClass4_Sub11_9.method8822(arg0 ? 2 : 3);
			this.aClass4_Sub11_9.method8892(0);
			this.aClass390_2.method8929(this.aClass4_Sub11_9.aByteArray107, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass390_2.method8926();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt6704 = -2;
			this.aClass390_2 = null;
			this.anInt6703++;
		}
	}

	@OriginalMember(owner = "client!ob", name = "g", descriptor = "(I)Z")
	public boolean method5885() {
		@Pc(14) int local14;
		if (this.aClass390_2 != null) {
			@Pc(7) long local7 = Static429.method5935();
			local14 = (int) (local7 - this.aLong193);
			if (local14 > 200) {
				local14 = 200;
			}
			this.aLong193 = local7;
			this.anInt6702 += local14;
			if (this.anInt6702 > 30000) {
				try {
					this.aClass390_2.method8926();
				} catch (@Pc(40) Exception local40) {
				}
				this.aClass390_2 = null;
			}
		}
		if (this.aClass390_2 == null) {
			return this.method5887() == 0 && this.method5881() == 0;
		}
		try {
			this.aClass390_2.method8928();
			for (@Pc(78) Class4_Sub5_Sub2_Sub1 local78 = (Class4_Sub5_Sub2_Sub1) this.aClass367_6.method8308(); local78 != null; local78 = (Class4_Sub5_Sub2_Sub1) this.aClass367_6.method8309()) {
				this.aClass4_Sub11_9.anInt10466 = 0;
				this.aClass4_Sub11_9.method8822(1);
				this.aClass4_Sub11_9.method8892((int) local78.aLong306);
				this.aClass390_2.method8929(this.aClass4_Sub11_9.aByteArray107, 4);
				this.aClass367_7.method8310(local78);
			}
			for (@Pc(135) Class4_Sub5_Sub2_Sub1 local135 = (Class4_Sub5_Sub2_Sub1) this.aClass367_8.method8308(); local135 != null; local135 = (Class4_Sub5_Sub2_Sub1) this.aClass367_8.method8309()) {
				this.aClass4_Sub11_9.anInt10466 = 0;
				this.aClass4_Sub11_9.method8822(0);
				this.aClass4_Sub11_9.method8892((int) local135.aLong306);
				this.aClass390_2.method8929(this.aClass4_Sub11_9.aByteArray107, 4);
				this.aClass367_9.method8310(local135);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(190) int local190 = this.aClass390_2.method8927();
				if (local190 < 0) {
					throw new IOException();
				}
				if (local190 == 0) {
					break;
				}
				this.anInt6702 = 0;
				@Pc(206) byte local206 = 0;
				if (this.aClass4_Sub5_Sub2_Sub1_2 == null) {
					local206 = 8;
				} else if (this.aClass4_Sub5_Sub2_Sub1_2.anInt4774 == 0) {
					local206 = 1;
				}
				@Pc(235) int local235;
				@Pc(242) int local242;
				@Pc(284) int local284;
				if (local206 <= 0) {
					local235 = this.aClass4_Sub5_Sub2_Sub1_2.aClass4_Sub11_8.aByteArray107.length - this.aClass4_Sub5_Sub2_Sub1_2.aByte74;
					local242 = 512 - this.aClass4_Sub5_Sub2_Sub1_2.anInt4774;
					if (local242 > local235 - this.aClass4_Sub5_Sub2_Sub1_2.aClass4_Sub11_8.anInt10466) {
						local242 = local235 - this.aClass4_Sub5_Sub2_Sub1_2.aClass4_Sub11_8.anInt10466;
					}
					if (local242 > local190) {
						local242 = local190;
					}
					this.aClass390_2.method8930(local242, this.aClass4_Sub5_Sub2_Sub1_2.aClass4_Sub11_8.anInt10466, this.aClass4_Sub5_Sub2_Sub1_2.aClass4_Sub11_8.aByteArray107);
					if (this.aByte91 != 0) {
						for (local284 = 0; local284 < local242; local284++) {
							this.aClass4_Sub5_Sub2_Sub1_2.aClass4_Sub11_8.aByteArray107[local284 + this.aClass4_Sub5_Sub2_Sub1_2.aClass4_Sub11_8.anInt10466] ^= this.aByte91;
						}
					}
					this.aClass4_Sub5_Sub2_Sub1_2.aClass4_Sub11_8.anInt10466 += local242;
					this.aClass4_Sub5_Sub2_Sub1_2.anInt4774 += local242;
					if (this.aClass4_Sub5_Sub2_Sub1_2.aClass4_Sub11_8.anInt10466 == local235) {
						this.aClass4_Sub5_Sub2_Sub1_2.method8990();
						this.aClass4_Sub5_Sub2_Sub1_2.aBoolean535 = false;
						this.aClass4_Sub5_Sub2_Sub1_2 = null;
					} else if (this.aClass4_Sub5_Sub2_Sub1_2.anInt4774 == 512) {
						this.aClass4_Sub5_Sub2_Sub1_2.anInt4774 = 0;
					}
				} else {
					local235 = local206 - this.aClass4_Sub11_10.anInt10466;
					if (local190 < local235) {
						local235 = local190;
					}
					this.aClass390_2.method8930(local235, this.aClass4_Sub11_10.anInt10466, this.aClass4_Sub11_10.aByteArray107);
					if (this.aByte91 != 0) {
						for (local242 = 0; local242 < local235; local242++) {
							this.aClass4_Sub11_10.aByteArray107[local242 + this.aClass4_Sub11_10.anInt10466] ^= this.aByte91;
						}
					}
					this.aClass4_Sub11_10.anInt10466 += local235;
					if (this.aClass4_Sub11_10.anInt10466 >= local206) {
						if (this.aClass4_Sub5_Sub2_Sub1_2 == null) {
							this.aClass4_Sub11_10.anInt10466 = 0;
							local242 = this.aClass4_Sub11_10.method8865();
							local284 = this.aClass4_Sub11_10.method8859();
							@Pc(469) int local469 = this.aClass4_Sub11_10.method8865();
							@Pc(474) int local474 = this.aClass4_Sub11_10.method8850();
							@Pc(478) int local478 = local469 & 0x7F;
							@Pc(486) boolean local486 = (local469 & 0x80) != 0;
							@Pc(493) long local493 = (long) ((local242 << 16) + local284);
							@Pc(503) Class4_Sub5_Sub2_Sub1 local503;
							if (local486) {
								for (local503 = (Class4_Sub5_Sub2_Sub1) this.aClass367_9.method8308(); local503 != null && local493 != local503.aLong306; local503 = (Class4_Sub5_Sub2_Sub1) this.aClass367_9.method8309()) {
								}
							} else {
								for (local503 = (Class4_Sub5_Sub2_Sub1) this.aClass367_7.method8308(); local503 != null && local493 != local503.aLong306; local503 = (Class4_Sub5_Sub2_Sub1) this.aClass367_7.method8309()) {
								}
							}
							if (local503 == null) {
								throw new IOException();
							}
							@Pc(556) int local556 = local478 == 0 ? 5 : 9;
							this.aClass4_Sub5_Sub2_Sub1_2 = local503;
							this.aClass4_Sub5_Sub2_Sub1_2.aClass4_Sub11_8 = new Class4_Sub11(local556 + local474 + this.aClass4_Sub5_Sub2_Sub1_2.aByte74);
							this.aClass4_Sub5_Sub2_Sub1_2.aClass4_Sub11_8.method8822(local478);
							this.aClass4_Sub5_Sub2_Sub1_2.aClass4_Sub11_8.method8860(local474);
							this.aClass4_Sub11_10.anInt10466 = 0;
							this.aClass4_Sub5_Sub2_Sub1_2.anInt4774 = 8;
						} else if (this.aClass4_Sub5_Sub2_Sub1_2.anInt4774 != 0) {
							throw new IOException();
						} else if (this.aClass4_Sub11_10.aByteArray107[0] == -1) {
							this.aClass4_Sub11_10.anInt10466 = 0;
							this.aClass4_Sub5_Sub2_Sub1_2.anInt4774 = 1;
						} else {
							this.aClass4_Sub5_Sub2_Sub1_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(636) IOException local636) {
			try {
				this.aClass390_2.method8926();
			} catch (@Pc(642) Exception local642) {
			}
			this.anInt6704 = -2;
			this.aClass390_2 = null;
			this.anInt6703++;
			return this.method5887() == 0 && this.method5881() == 0;
		}
	}

	@OriginalMember(owner = "client!ob", name = "i", descriptor = "(I)I")
	public int method5887() {
		return this.aClass367_6.method8306() + this.aClass367_7.method8306();
	}
}
