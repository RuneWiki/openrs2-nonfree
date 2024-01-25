import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ug")
public final class Class243 {

	@OriginalMember(owner = "client!ug", name = "y", descriptor = "Lclient!bw;")
	private Class34 aClass34_4;

	@OriginalMember(owner = "client!ug", name = "z", descriptor = "I")
	private int anInt6616;

	@OriginalMember(owner = "client!ug", name = "A", descriptor = "J")
	private long aLong200;

	@OriginalMember(owner = "client!ug", name = "G", descriptor = "Lclient!fg;")
	private Class2_Sub5_Sub6_Sub1 aClass2_Sub5_Sub6_Sub1_2;

	@OriginalMember(owner = "client!ug", name = "n", descriptor = "Lclient!cn;")
	private final Class44 aClass44_8 = new Class44();

	@OriginalMember(owner = "client!ug", name = "s", descriptor = "Lclient!cn;")
	private final Class44 aClass44_9 = new Class44();

	@OriginalMember(owner = "client!ug", name = "v", descriptor = "Lclient!cn;")
	private final Class44 aClass44_10 = new Class44();

	@OriginalMember(owner = "client!ug", name = "w", descriptor = "Lclient!cn;")
	private final Class44 aClass44_11 = new Class44();

	@OriginalMember(owner = "client!ug", name = "x", descriptor = "Lclient!si;")
	private final Class2_Sub23 aClass2_Sub23_11 = new Class2_Sub23(4);

	@OriginalMember(owner = "client!ug", name = "B", descriptor = "I")
	public volatile int anInt6617 = 0;

	@OriginalMember(owner = "client!ug", name = "D", descriptor = "B")
	private byte aByte97 = 0;

	@OriginalMember(owner = "client!ug", name = "E", descriptor = "I")
	public volatile int anInt6618 = 0;

	@OriginalMember(owner = "client!ug", name = "C", descriptor = "Lclient!si;")
	private final Class2_Sub23 aClass2_Sub23_12 = new Class2_Sub23(8);

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(Z)V")
	private void method5224() {
		if (this.aClass34_4 == null) {
			return;
		}
		try {
			this.aClass2_Sub23_11.anInt6952 = 0;
			this.aClass2_Sub23_11.method5449(6);
			this.aClass2_Sub23_11.method5473(3);
			this.aClass34_4.method606(4, this.aClass2_Sub23_11.aByteArray130);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass34_4.method610();
			} catch (@Pc(42) Exception local42) {
			}
			this.anInt6618 = -2;
			this.anInt6617++;
			this.aClass34_4 = null;
		}
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(I)V")
	public void method5227() {
		try {
			this.aClass34_4.method610();
		} catch (@Pc(9) Exception local9) {
		}
		this.aClass34_4 = null;
		this.anInt6618 = -1;
		this.aByte97 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt6617++;
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)I")
	public int method5229() {
		return this.aClass44_8.method801() + this.aClass44_9.method801();
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(Z)Z")
	public boolean method5230() {
		@Pc(17) int local17;
		if (this.aClass34_4 != null) {
			@Pc(11) long local11 = Static21.method458();
			local17 = (int) (local11 - this.aLong200);
			if (local17 > 200) {
				local17 = 200;
			}
			this.aLong200 = local11;
			this.anInt6616 += local17;
			if (this.anInt6616 > 30000) {
				try {
					this.aClass34_4.method610();
				} catch (@Pc(43) Exception local43) {
				}
				this.aClass34_4 = null;
			}
		}
		if (this.aClass34_4 == null) {
			return this.method5229() == 0 && this.method5232() == 0;
		}
		try {
			this.aClass34_4.method602();
			for (@Pc(77) Class2_Sub5_Sub6_Sub1 local77 = (Class2_Sub5_Sub6_Sub1) this.aClass44_8.method802(); local77 != null; local77 = (Class2_Sub5_Sub6_Sub1) this.aClass44_8.method803()) {
				this.aClass2_Sub23_11.anInt6952 = 0;
				this.aClass2_Sub23_11.method5449(1);
				this.aClass2_Sub23_11.method5473((int) local77.aLong211);
				this.aClass34_4.method606(4, this.aClass2_Sub23_11.aByteArray130);
				this.aClass44_9.method799(local77);
			}
			for (@Pc(123) Class2_Sub5_Sub6_Sub1 local123 = (Class2_Sub5_Sub6_Sub1) this.aClass44_10.method802(); local123 != null; local123 = (Class2_Sub5_Sub6_Sub1) this.aClass44_10.method803()) {
				this.aClass2_Sub23_11.anInt6952 = 0;
				this.aClass2_Sub23_11.method5449(0);
				this.aClass2_Sub23_11.method5473((int) local123.aLong211);
				this.aClass34_4.method606(4, this.aClass2_Sub23_11.aByteArray130);
				this.aClass44_11.method799(local123);
			}
			for (local17 = 0; local17 < 100; local17++) {
				@Pc(172) int local172 = this.aClass34_4.method613();
				if (local172 < 0) {
					throw new IOException();
				}
				if (local172 == 0) {
					break;
				}
				this.anInt6616 = 0;
				@Pc(185) byte local185 = 0;
				if (this.aClass2_Sub5_Sub6_Sub1_2 == null) {
					local185 = 8;
				} else if (this.aClass2_Sub5_Sub6_Sub1_2.anInt2473 == 0) {
					local185 = 1;
				}
				@Pc(206) int local206;
				@Pc(227) int local227;
				@Pc(288) int local288;
				if (local185 > 0) {
					local206 = local185 - this.aClass2_Sub23_12.anInt6952;
					if (local172 < local206) {
						local206 = local172;
					}
					this.aClass34_4.method604(this.aClass2_Sub23_12.anInt6952, this.aClass2_Sub23_12.aByteArray130, local206);
					if (this.aByte97 != 0) {
						for (local227 = 0; local227 < local206; local227++) {
							this.aClass2_Sub23_12.aByteArray130[local227 + this.aClass2_Sub23_12.anInt6952] ^= this.aByte97;
						}
					}
					this.aClass2_Sub23_12.anInt6952 += local206;
					if (local185 <= this.aClass2_Sub23_12.anInt6952) {
						if (this.aClass2_Sub5_Sub6_Sub1_2 == null) {
							this.aClass2_Sub23_12.anInt6952 = 0;
							local227 = this.aClass2_Sub23_12.method5495();
							local288 = this.aClass2_Sub23_12.method5500();
							@Pc(293) int local293 = this.aClass2_Sub23_12.method5495();
							@Pc(298) int local298 = this.aClass2_Sub23_12.method5508();
							@Pc(302) int local302 = local293 & 0x7F;
							@Pc(310) boolean local310 = (local293 & 0x80) != 0;
							@Pc(317) long local317 = (long) (local288 + (local227 << 16));
							@Pc(327) Class2_Sub5_Sub6_Sub1 local327;
							if (local310) {
								for (local327 = (Class2_Sub5_Sub6_Sub1) this.aClass44_11.method802(); local327 != null && local327.aLong211 != local317; local327 = (Class2_Sub5_Sub6_Sub1) this.aClass44_11.method803()) {
								}
							} else {
								for (local327 = (Class2_Sub5_Sub6_Sub1) this.aClass44_9.method802(); local327 != null && local317 != local327.aLong211; local327 = (Class2_Sub5_Sub6_Sub1) this.aClass44_9.method803()) {
								}
							}
							if (local327 == null) {
								throw new IOException();
							}
							@Pc(391) int local391 = local302 == 0 ? 5 : 9;
							this.aClass2_Sub5_Sub6_Sub1_2 = local327;
							this.aClass2_Sub5_Sub6_Sub1_2.aClass2_Sub23_4 = new Class2_Sub23(this.aClass2_Sub5_Sub6_Sub1_2.aByte36 + local298 + local391);
							this.aClass2_Sub5_Sub6_Sub1_2.aClass2_Sub23_4.method5449(local302);
							this.aClass2_Sub5_Sub6_Sub1_2.aClass2_Sub23_4.method5506(local298);
							this.aClass2_Sub5_Sub6_Sub1_2.anInt2473 = 8;
							this.aClass2_Sub23_12.anInt6952 = 0;
						} else if (this.aClass2_Sub5_Sub6_Sub1_2.anInt2473 != 0) {
							throw new IOException();
						} else if (this.aClass2_Sub23_12.aByteArray130[0] == -1) {
							this.aClass2_Sub5_Sub6_Sub1_2.anInt2473 = 1;
							this.aClass2_Sub23_12.anInt6952 = 0;
						} else {
							this.aClass2_Sub5_Sub6_Sub1_2 = null;
						}
					}
				} else {
					local206 = this.aClass2_Sub5_Sub6_Sub1_2.aClass2_Sub23_4.aByteArray130.length - this.aClass2_Sub5_Sub6_Sub1_2.aByte36;
					local227 = 512 - this.aClass2_Sub5_Sub6_Sub1_2.anInt2473;
					if (local206 - this.aClass2_Sub5_Sub6_Sub1_2.aClass2_Sub23_4.anInt6952 < local227) {
						local227 = local206 - this.aClass2_Sub5_Sub6_Sub1_2.aClass2_Sub23_4.anInt6952;
					}
					if (local227 > local172) {
						local227 = local172;
					}
					this.aClass34_4.method604(this.aClass2_Sub5_Sub6_Sub1_2.aClass2_Sub23_4.anInt6952, this.aClass2_Sub5_Sub6_Sub1_2.aClass2_Sub23_4.aByteArray130, local227);
					if (this.aByte97 != 0) {
						for (local288 = 0; local288 < local227; local288++) {
							this.aClass2_Sub5_Sub6_Sub1_2.aClass2_Sub23_4.aByteArray130[this.aClass2_Sub5_Sub6_Sub1_2.aClass2_Sub23_4.anInt6952 + local288] = (byte) (this.aClass2_Sub5_Sub6_Sub1_2.aClass2_Sub23_4.aByteArray130[this.aClass2_Sub5_Sub6_Sub1_2.aClass2_Sub23_4.anInt6952 + local288] ^ this.aByte97);
						}
					}
					this.aClass2_Sub5_Sub6_Sub1_2.aClass2_Sub23_4.anInt6952 += local227;
					this.aClass2_Sub5_Sub6_Sub1_2.anInt2473 += local227;
					if (local206 == this.aClass2_Sub5_Sub6_Sub1_2.aClass2_Sub23_4.anInt6952) {
						this.aClass2_Sub5_Sub6_Sub1_2.method5534();
						this.aClass2_Sub5_Sub6_Sub1_2.aBoolean336 = false;
						this.aClass2_Sub5_Sub6_Sub1_2 = null;
					} else if (this.aClass2_Sub5_Sub6_Sub1_2.anInt2473 == 512) {
						this.aClass2_Sub5_Sub6_Sub1_2.anInt2473 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(609) IOException local609) {
			try {
				this.aClass34_4.method610();
			} catch (@Pc(615) Exception local615) {
			}
			this.anInt6617++;
			this.anInt6618 = -2;
			this.aClass34_4 = null;
			return this.method5229() == 0 && this.method5232() == 0;
		}
	}

	@OriginalMember(owner = "client!ug", name = "c", descriptor = "(Z)Z")
	public boolean method5231() {
		return this.method5229() >= 20;
	}

	@OriginalMember(owner = "client!ug", name = "d", descriptor = "(I)I")
	private int method5232() {
		return this.aClass44_10.method801() + this.aClass44_11.method801();
	}

	@OriginalMember(owner = "client!ug", name = "e", descriptor = "(I)V")
	public void method5233() {
		if (this.aClass34_4 == null) {
			return;
		}
		try {
			this.aClass2_Sub23_11.anInt6952 = 0;
			this.aClass2_Sub23_11.method5449(7);
			this.aClass2_Sub23_11.method5473(0);
			this.aClass34_4.method606(4, this.aClass2_Sub23_11.aByteArray130);
		} catch (@Pc(34) IOException local34) {
			try {
				this.aClass34_4.method610();
			} catch (@Pc(40) Exception local40) {
			}
			this.anInt6617++;
			this.anInt6618 = -2;
			this.aClass34_4 = null;
		}
	}

	@OriginalMember(owner = "client!ug", name = "f", descriptor = "(I)Z")
	public boolean method5235() {
		return this.method5232() >= 20;
	}

	@OriginalMember(owner = "client!ug", name = "g", descriptor = "(I)V")
	public void method5236() {
		if (this.aClass34_4 != null) {
			this.aClass34_4.method612();
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ILclient!bw;Z)V")
	public void method5237(@OriginalArg(1) Class34 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass34_4 != null) {
			try {
				this.aClass34_4.method610();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass34_4 = null;
		}
		this.aClass34_4 = arg0;
		this.method5224();
		this.method5240(arg1);
		this.aClass2_Sub5_Sub6_Sub1_2 = null;
		this.aClass2_Sub23_12.anInt6952 = 0;
		while (true) {
			@Pc(51) Class2_Sub5_Sub6_Sub1 local51 = (Class2_Sub5_Sub6_Sub1) this.aClass44_9.method800();
			if (local51 == null) {
				while (true) {
					local51 = (Class2_Sub5_Sub6_Sub1) this.aClass44_11.method800();
					if (local51 == null) {
						if (this.aByte97 != 0) {
							try {
								this.aClass2_Sub23_11.anInt6952 = 0;
								this.aClass2_Sub23_11.method5449(4);
								this.aClass2_Sub23_11.method5449(this.aByte97);
								this.aClass2_Sub23_11.method5502(0);
								this.aClass34_4.method606(4, this.aClass2_Sub23_11.aByteArray130);
							} catch (@Pc(109) IOException local109) {
								try {
									this.aClass34_4.method610();
								} catch (@Pc(115) Exception local115) {
								}
								this.anInt6618 = -2;
								this.anInt6617++;
								this.aClass34_4 = null;
							}
						}
						this.anInt6616 = 0;
						this.aLong200 = Static21.method458();
						return;
					}
					this.aClass44_10.method799(local51);
				}
			}
			this.aClass44_8.method799(local51);
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIZBI)Lclient!fg;")
	public Class2_Sub5_Sub6_Sub1 method5238(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) int arg3) {
		@Pc(11) long local11 = (long) ((arg0 << 16) + arg3);
		@Pc(15) Class2_Sub5_Sub6_Sub1 local15 = new Class2_Sub5_Sub6_Sub1();
		local15.aByte36 = arg2;
		local15.aLong211 = local11;
		local15.aBoolean337 = arg1;
		if (arg1) {
			if (this.method5229() >= 20) {
				throw new RuntimeException();
			}
			this.aClass44_8.method799(local15);
		} else if (this.method5232() < 20) {
			this.aClass44_10.method799(local15);
		} else {
			throw new RuntimeException();
		}
		return local15;
	}

	@OriginalMember(owner = "client!ug", name = "b", descriptor = "(B)V")
	public void method5239() {
		if (this.aClass34_4 != null) {
			this.aClass34_4.method610();
		}
	}

	@OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZB)V")
	public void method5240(@OriginalArg(0) boolean arg0) {
		if (this.aClass34_4 == null) {
			return;
		}
		try {
			this.aClass2_Sub23_11.anInt6952 = 0;
			this.aClass2_Sub23_11.method5449(arg0 ? 2 : 3);
			this.aClass2_Sub23_11.method5473(0);
			this.aClass34_4.method606(4, this.aClass2_Sub23_11.aByteArray130);
		} catch (@Pc(47) IOException local47) {
			try {
				this.aClass34_4.method610();
			} catch (@Pc(53) Exception local53) {
			}
			this.anInt6617++;
			this.anInt6618 = -2;
			this.aClass34_4 = null;
		}
	}
}
