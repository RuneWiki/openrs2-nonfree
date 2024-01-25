import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wd")
public final class Class269 {

	@OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
	private int anInt7111;

	@OriginalMember(owner = "client!wd", name = "B", descriptor = "J")
	private long aLong228;

	@OriginalMember(owner = "client!wd", name = "C", descriptor = "Lclient!qc;")
	private Class205 aClass205_2;

	@OriginalMember(owner = "client!wd", name = "H", descriptor = "Lclient!wt;")
	private Class1_Sub3_Sub7_Sub2 aClass1_Sub3_Sub7_Sub2_2;

	@OriginalMember(owner = "client!wd", name = "g", descriptor = "Lclient!mq;")
	private final Class163 aClass163_7 = new Class163();

	@OriginalMember(owner = "client!wd", name = "v", descriptor = "Lclient!mq;")
	private final Class163 aClass163_8 = new Class163();

	@OriginalMember(owner = "client!wd", name = "x", descriptor = "Lclient!mq;")
	private final Class163 aClass163_9 = new Class163();

	@OriginalMember(owner = "client!wd", name = "y", descriptor = "Lclient!mq;")
	private final Class163 aClass163_10 = new Class163();

	@OriginalMember(owner = "client!wd", name = "A", descriptor = "Lclient!wm;")
	private final Class1_Sub19 aClass1_Sub19_5 = new Class1_Sub19(4);

	@OriginalMember(owner = "client!wd", name = "E", descriptor = "B")
	private byte aByte95 = 0;

	@OriginalMember(owner = "client!wd", name = "F", descriptor = "I")
	public volatile int anInt7113 = 0;

	@OriginalMember(owner = "client!wd", name = "D", descriptor = "I")
	public volatile int anInt7112 = 0;

	@OriginalMember(owner = "client!wd", name = "G", descriptor = "Lclient!wm;")
	private final Class1_Sub19 aClass1_Sub19_6 = new Class1_Sub19(8);

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)I")
	private int method5746() {
		return this.aClass163_9.method3656() + this.aClass163_10.method3656();
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V")
	public void method5747() {
		if (this.aClass205_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub19_5.anInt3698 = 0;
			this.aClass1_Sub19_5.method2934(7);
			this.aClass1_Sub19_5.method2888(0);
			this.aClass205_2.method4384(4, this.aClass1_Sub19_5.aByteArray38);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass205_2.method4383();
			} catch (@Pc(43) Exception local43) {
			}
			this.anInt7112 = -2;
			this.aClass205_2 = null;
			this.anInt7113++;
		}
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)V")
	public void method5750() {
		if (this.aClass205_2 != null) {
			this.aClass205_2.method4383();
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BIBZI)Lclient!wt;")
	public Class1_Sub3_Sub7_Sub2 method5753(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3) {
		@Pc(18) long local18 = (long) ((arg3 << 16) + arg1);
		@Pc(22) Class1_Sub3_Sub7_Sub2 local22 = new Class1_Sub3_Sub7_Sub2();
		local22.aLong235 = local18;
		local22.aBoolean645 = arg2;
		local22.aByte105 = arg0;
		if (arg2) {
			if (this.method5763() >= 20) {
				throw new RuntimeException();
			}
			this.aClass163_7.method3657(local22);
		} else if (this.method5746() < 20) {
			this.aClass163_9.method3657(local22);
		} else {
			throw new RuntimeException();
		}
		return local22;
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)Z")
	public boolean method5756() {
		return this.method5763() >= 20;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Z")
	public boolean method5757() {
		return this.method5746() >= 20;
	}

	@OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)Z")
	public boolean method5758() {
		@Pc(18) int local18;
		if (this.aClass205_2 != null) {
			@Pc(11) long local11 = Static183.method2674();
			local18 = (int) (local11 - this.aLong228);
			this.aLong228 = local11;
			if (local18 > 200) {
				local18 = 200;
			}
			this.anInt7111 += local18;
			if (this.anInt7111 > 30000) {
				try {
					this.aClass205_2.method4383();
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass205_2 = null;
			}
		}
		if (this.aClass205_2 == null) {
			return this.method5763() == 0 && this.method5746() == 0;
		}
		try {
			this.aClass205_2.method4381();
			for (@Pc(75) Class1_Sub3_Sub7_Sub2 local75 = (Class1_Sub3_Sub7_Sub2) this.aClass163_7.method3658(); local75 != null; local75 = (Class1_Sub3_Sub7_Sub2) this.aClass163_7.method3655()) {
				this.aClass1_Sub19_5.anInt3698 = 0;
				this.aClass1_Sub19_5.method2934(1);
				this.aClass1_Sub19_5.method2888((int) local75.aLong235);
				this.aClass205_2.method4384(4, this.aClass1_Sub19_5.aByteArray38);
				this.aClass163_8.method3657(local75);
			}
			for (@Pc(121) Class1_Sub3_Sub7_Sub2 local121 = (Class1_Sub3_Sub7_Sub2) this.aClass163_9.method3658(); local121 != null; local121 = (Class1_Sub3_Sub7_Sub2) this.aClass163_9.method3655()) {
				this.aClass1_Sub19_5.anInt3698 = 0;
				this.aClass1_Sub19_5.method2934(0);
				this.aClass1_Sub19_5.method2888((int) local121.aLong235);
				this.aClass205_2.method4384(4, this.aClass1_Sub19_5.aByteArray38);
				this.aClass163_10.method3657(local121);
			}
			for (local18 = 0; local18 < 100; local18++) {
				@Pc(170) int local170 = this.aClass205_2.method4382();
				if (local170 < 0) {
					throw new IOException();
				}
				if (local170 == 0) {
					break;
				}
				this.anInt7111 = 0;
				@Pc(189) byte local189 = 0;
				if (this.aClass1_Sub3_Sub7_Sub2_2 == null) {
					local189 = 8;
				} else if (this.aClass1_Sub3_Sub7_Sub2_2.anInt7391 == 0) {
					local189 = 1;
				}
				@Pc(215) int local215;
				@Pc(221) int local221;
				@Pc(268) int local268;
				if (local189 <= 0) {
					local215 = this.aClass1_Sub3_Sub7_Sub2_2.aClass1_Sub19_8.aByteArray38.length - this.aClass1_Sub3_Sub7_Sub2_2.aByte105;
					local221 = 512 - this.aClass1_Sub3_Sub7_Sub2_2.anInt7391;
					if (local215 - this.aClass1_Sub3_Sub7_Sub2_2.aClass1_Sub19_8.anInt3698 < local221) {
						local221 = local215 - this.aClass1_Sub3_Sub7_Sub2_2.aClass1_Sub19_8.anInt3698;
					}
					if (local170 < local221) {
						local221 = local170;
					}
					this.aClass205_2.method4379(local221, this.aClass1_Sub3_Sub7_Sub2_2.aClass1_Sub19_8.aByteArray38, this.aClass1_Sub3_Sub7_Sub2_2.aClass1_Sub19_8.anInt3698);
					if (this.aByte95 != 0) {
						for (local268 = 0; local268 < local221; local268++) {
							this.aClass1_Sub3_Sub7_Sub2_2.aClass1_Sub19_8.aByteArray38[local268 + this.aClass1_Sub3_Sub7_Sub2_2.aClass1_Sub19_8.anInt3698] ^= this.aByte95;
						}
					}
					this.aClass1_Sub3_Sub7_Sub2_2.anInt7391 += local221;
					this.aClass1_Sub3_Sub7_Sub2_2.aClass1_Sub19_8.anInt3698 += local221;
					if (this.aClass1_Sub3_Sub7_Sub2_2.aClass1_Sub19_8.anInt3698 == local215) {
						this.aClass1_Sub3_Sub7_Sub2_2.method5941();
						this.aClass1_Sub3_Sub7_Sub2_2.aBoolean646 = false;
						this.aClass1_Sub3_Sub7_Sub2_2 = null;
					} else if (this.aClass1_Sub3_Sub7_Sub2_2.anInt7391 == 512) {
						this.aClass1_Sub3_Sub7_Sub2_2.anInt7391 = 0;
					}
				} else {
					local215 = local189 - this.aClass1_Sub19_6.anInt3698;
					if (local170 < local215) {
						local215 = local170;
					}
					this.aClass205_2.method4379(local215, this.aClass1_Sub19_6.aByteArray38, this.aClass1_Sub19_6.anInt3698);
					if (this.aByte95 != 0) {
						for (local221 = 0; local221 < local215; local221++) {
							this.aClass1_Sub19_6.aByteArray38[local221 + this.aClass1_Sub19_6.anInt3698] ^= this.aByte95;
						}
					}
					this.aClass1_Sub19_6.anInt3698 += local215;
					if (local189 <= this.aClass1_Sub19_6.anInt3698) {
						if (this.aClass1_Sub3_Sub7_Sub2_2 == null) {
							this.aClass1_Sub19_6.anInt3698 = 0;
							local221 = this.aClass1_Sub19_6.method2915();
							local268 = this.aClass1_Sub19_6.method2896();
							@Pc(444) int local444 = this.aClass1_Sub19_6.method2915();
							@Pc(449) int local449 = this.aClass1_Sub19_6.method2877();
							@Pc(453) int local453 = local444 & 0x7F;
							@Pc(461) boolean local461 = (local444 & 0x80) != 0;
							@Pc(468) long local468 = (long) (local268 + (local221 << 16));
							@Pc(478) Class1_Sub3_Sub7_Sub2 local478;
							if (local461) {
								for (local478 = (Class1_Sub3_Sub7_Sub2) this.aClass163_10.method3658(); local478 != null && local468 != local478.aLong235; local478 = (Class1_Sub3_Sub7_Sub2) this.aClass163_10.method3655()) {
								}
							} else {
								for (local478 = (Class1_Sub3_Sub7_Sub2) this.aClass163_8.method3658(); local478 != null && local478.aLong235 != local468; local478 = (Class1_Sub3_Sub7_Sub2) this.aClass163_8.method3655()) {
								}
							}
							if (local478 == null) {
								throw new IOException();
							}
							@Pc(531) int local531 = local453 == 0 ? 5 : 9;
							this.aClass1_Sub3_Sub7_Sub2_2 = local478;
							this.aClass1_Sub3_Sub7_Sub2_2.aClass1_Sub19_8 = new Class1_Sub19(this.aClass1_Sub3_Sub7_Sub2_2.aByte105 + local531 + local449);
							this.aClass1_Sub3_Sub7_Sub2_2.aClass1_Sub19_8.method2934(local453);
							this.aClass1_Sub3_Sub7_Sub2_2.aClass1_Sub19_8.method2912(local449);
							this.aClass1_Sub3_Sub7_Sub2_2.anInt7391 = 8;
							this.aClass1_Sub19_6.anInt3698 = 0;
						} else if (this.aClass1_Sub3_Sub7_Sub2_2.anInt7391 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub19_6.aByteArray38[0] == -1) {
							this.aClass1_Sub3_Sub7_Sub2_2.anInt7391 = 1;
							this.aClass1_Sub19_6.anInt3698 = 0;
						} else {
							this.aClass1_Sub3_Sub7_Sub2_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(616) IOException local616) {
			try {
				this.aClass205_2.method4383();
			} catch (@Pc(622) Exception local622) {
			}
			this.anInt7112 = -2;
			this.aClass205_2 = null;
			this.anInt7113++;
			return this.method5763() == 0 && this.method5746() == 0;
		}
	}

	@OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
	public void method5759() {
		if (this.aClass205_2 != null) {
			this.aClass205_2.method4380();
		}
	}

	@OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)V")
	private void method5760() {
		if (this.aClass205_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub19_5.anInt3698 = 0;
			this.aClass1_Sub19_5.method2934(6);
			this.aClass1_Sub19_5.method2888(3);
			this.aClass205_2.method4384(4, this.aClass1_Sub19_5.aByteArray38);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass205_2.method4383();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt7112 = -2;
			this.aClass205_2 = null;
			this.anInt7113++;
		}
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lclient!qc;ZB)V")
	public void method5762(@OriginalArg(0) Class205 arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass205_2 != null) {
			try {
				this.aClass205_2.method4383();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass205_2 = null;
		}
		this.aClass205_2 = arg0;
		this.method5760();
		this.method5765(arg1);
		this.aClass1_Sub3_Sub7_Sub2_2 = null;
		this.aClass1_Sub19_6.anInt3698 = 0;
		while (true) {
			@Pc(48) Class1_Sub3_Sub7_Sub2 local48 = (Class1_Sub3_Sub7_Sub2) this.aClass163_8.method3654();
			if (local48 == null) {
				while (true) {
					local48 = (Class1_Sub3_Sub7_Sub2) this.aClass163_10.method3654();
					if (local48 == null) {
						if (this.aByte95 != 0) {
							try {
								this.aClass1_Sub19_5.anInt3698 = 0;
								this.aClass1_Sub19_5.method2934(4);
								this.aClass1_Sub19_5.method2934(this.aByte95);
								this.aClass1_Sub19_5.method2930(0);
								this.aClass205_2.method4384(4, this.aClass1_Sub19_5.aByteArray38);
							} catch (@Pc(109) IOException local109) {
								try {
									this.aClass205_2.method4383();
								} catch (@Pc(115) Exception local115) {
								}
								this.anInt7113++;
								this.aClass205_2 = null;
								this.anInt7112 = -2;
							}
						}
						this.anInt7111 = 0;
						this.aLong228 = Static183.method2674();
						return;
					}
					this.aClass163_9.method3657(local48);
				}
			}
			this.aClass163_7.method3657(local48);
		}
	}

	@OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)I")
	public int method5763() {
		return this.aClass163_7.method3656() + this.aClass163_8.method3656();
	}

	@OriginalMember(owner = "client!wd", name = "f", descriptor = "(I)V")
	public void method5764() {
		try {
			this.aClass205_2.method4383();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt7112 = -1;
		this.aClass205_2 = null;
		this.aByte95 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt7113++;
	}

	@OriginalMember(owner = "client!wd", name = "a", descriptor = "(BZ)V")
	public void method5765(@OriginalArg(1) boolean arg0) {
		if (this.aClass205_2 == null) {
			return;
		}
		try {
			this.aClass1_Sub19_5.anInt3698 = 0;
			this.aClass1_Sub19_5.method2934(arg0 ? 2 : 3);
			this.aClass1_Sub19_5.method2888(0);
			this.aClass205_2.method4384(4, this.aClass1_Sub19_5.aByteArray38);
		} catch (@Pc(43) IOException local43) {
			try {
				this.aClass205_2.method4383();
			} catch (@Pc(49) Exception local49) {
			}
			this.anInt7113++;
			this.aClass205_2 = null;
			this.anInt7112 = -2;
		}
	}
}
