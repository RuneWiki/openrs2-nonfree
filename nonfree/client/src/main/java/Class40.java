import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class40 {

	@OriginalMember(owner = "client!dl", name = "C", descriptor = "Lclient!ag;")
	private Class7 aClass7_1;

	@OriginalMember(owner = "client!dl", name = "E", descriptor = "I")
	private int anInt953;

	@OriginalMember(owner = "client!dl", name = "F", descriptor = "J")
	private long aLong46;

	@OriginalMember(owner = "client!dl", name = "K", descriptor = "Lclient!hl;")
	private Class1_Sub1_Sub11_Sub1 aClass1_Sub1_Sub11_Sub1_1;

	@OriginalMember(owner = "client!dl", name = "x", descriptor = "Lclient!ad;")
	private Class5 aClass5_2 = new Class5();

	@OriginalMember(owner = "client!dl", name = "y", descriptor = "Lclient!ad;")
	private Class5 aClass5_3 = new Class5();

	@OriginalMember(owner = "client!dl", name = "z", descriptor = "Lclient!ad;")
	private Class5 aClass5_4 = new Class5();

	@OriginalMember(owner = "client!dl", name = "B", descriptor = "Lclient!ad;")
	private Class5 aClass5_5 = new Class5();

	@OriginalMember(owner = "client!dl", name = "D", descriptor = "Lclient!sb;")
	private Class1_Sub14 aClass1_Sub14_1 = new Class1_Sub14(4);

	@OriginalMember(owner = "client!dl", name = "I", descriptor = "I")
	public volatile int anInt955 = 0;

	@OriginalMember(owner = "client!dl", name = "H", descriptor = "I")
	public volatile int anInt954 = 0;

	@OriginalMember(owner = "client!dl", name = "G", descriptor = "B")
	private byte aByte2 = 0;

	@OriginalMember(owner = "client!dl", name = "J", descriptor = "Lclient!sb;")
	private Class1_Sub14 aClass1_Sub14_2 = new Class1_Sub14(8);

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZ)V")
	public void method852(@OriginalArg(1) boolean arg0) {
		if (this.aClass7_1 == null) {
			return;
		}
		try {
			this.aClass1_Sub14_1.anInt3290 = 0;
			this.aClass1_Sub14_1.method2631(arg0 ? 2 : 3);
			this.aClass1_Sub14_1.method2643(0);
			this.aClass7_1.method108(this.aClass1_Sub14_1.aByteArray34, 4);
		} catch (@Pc(44) IOException local44) {
			try {
				this.aClass7_1.method105();
			} catch (@Pc(50) Exception local50) {
			}
			this.anInt955++;
			this.aClass7_1 = null;
			this.anInt954 = -2;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIBZ)Lclient!hl;")
	public Class1_Sub1_Sub11_Sub1 method853(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte arg2, @OriginalArg(4) boolean arg3) {
		@Pc(6) long local6 = (long) (arg0 + (arg1 << 16));
		@Pc(20) Class1_Sub1_Sub11_Sub1 local20 = new Class1_Sub1_Sub11_Sub1();
		local20.aBoolean339 = arg3;
		local20.aByte7 = arg2;
		local20.aLong224 = local6;
		if (arg3) {
			if (this.method864() >= 20) {
				throw new RuntimeException();
			}
			this.aClass5_2.method48(local20);
		} else if (this.method866() < 20) {
			this.aClass5_4.method48(local20);
		} else {
			throw new RuntimeException();
		}
		return local20;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V")
	public void method854() {
		if (this.aClass7_1 != null) {
			this.aClass7_1.method111();
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V")
	public void method857() {
		if (this.aClass7_1 == null) {
			return;
		}
		try {
			this.aClass1_Sub14_1.anInt3290 = 0;
			this.aClass1_Sub14_1.method2631(7);
			this.aClass1_Sub14_1.method2643(0);
			this.aClass7_1.method108(this.aClass1_Sub14_1.aByteArray34, 4);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass7_1.method105();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt955++;
			this.aClass7_1 = null;
			this.anInt954 = -2;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)Z")
	public boolean method858() {
		if (this.aClass7_1 != null) {
			@Pc(7) long local7 = Static135.method2186();
			@Pc(14) int local14 = (int) (local7 - this.aLong46);
			this.aLong46 = local7;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt953 += local14;
			if (this.anInt953 > 30000) {
				try {
					this.aClass7_1.method105();
				} catch (@Pc(42) Exception local42) {
				}
				this.aClass7_1 = null;
			}
		}
		if (this.aClass7_1 == null) {
			return this.method864() == 0 && this.method866() == 0;
		}
		try {
			this.aClass7_1.method101();
			@Pc(80) Class1_Sub1_Sub11_Sub1 local80;
			for (local80 = (Class1_Sub1_Sub11_Sub1) this.aClass5_2.method49(); local80 != null; local80 = (Class1_Sub1_Sub11_Sub1) this.aClass5_2.method51()) {
				this.aClass1_Sub14_1.anInt3290 = 0;
				this.aClass1_Sub14_1.method2631(1);
				this.aClass1_Sub14_1.method2643((int) local80.aLong224);
				this.aClass7_1.method108(this.aClass1_Sub14_1.aByteArray34, 4);
				this.aClass5_3.method48(local80);
			}
			for (local80 = (Class1_Sub1_Sub11_Sub1) this.aClass5_4.method49(); local80 != null; local80 = (Class1_Sub1_Sub11_Sub1) this.aClass5_4.method51()) {
				this.aClass1_Sub14_1.anInt3290 = 0;
				this.aClass1_Sub14_1.method2631(0);
				this.aClass1_Sub14_1.method2643((int) local80.aLong224);
				this.aClass7_1.method108(this.aClass1_Sub14_1.aByteArray34, 4);
				this.aClass5_5.method48(local80);
			}
			for (@Pc(170) int local170 = 0; local170 < 100; local170++) {
				@Pc(180) int local180 = this.aClass7_1.method104();
				if (local180 < 0) {
					throw new IOException();
				}
				if (local180 == 0) {
					break;
				}
				this.anInt953 = 0;
				@Pc(197) byte local197 = 0;
				if (this.aClass1_Sub1_Sub11_Sub1_1 == null) {
					local197 = 8;
				} else if (this.aClass1_Sub1_Sub11_Sub1_1.anInt2012 == 0) {
					local197 = 1;
				}
				@Pc(220) int local220;
				@Pc(247) int local247;
				@Pc(315) int local315;
				if (local197 > 0) {
					local220 = local197 - this.aClass1_Sub14_2.anInt3290;
					if (local180 < local220) {
						local220 = local180;
					}
					this.aClass7_1.method102(this.aClass1_Sub14_2.aByteArray34, this.aClass1_Sub14_2.anInt3290, local220);
					if (this.aByte2 != 0) {
						for (local247 = 0; local247 < local220; local247++) {
							this.aClass1_Sub14_2.aByteArray34[this.aClass1_Sub14_2.anInt3290 + local247] = (byte) (this.aClass1_Sub14_2.aByteArray34[this.aClass1_Sub14_2.anInt3290 + local247] ^ this.aByte2);
						}
					}
					this.aClass1_Sub14_2.anInt3290 += local220;
					if (this.aClass1_Sub14_2.anInt3290 >= local197) {
						if (this.aClass1_Sub1_Sub11_Sub1_1 == null) {
							this.aClass1_Sub14_2.anInt3290 = 0;
							local247 = this.aClass1_Sub14_2.method2595();
							local315 = this.aClass1_Sub14_2.method2593();
							@Pc(320) int local320 = this.aClass1_Sub14_2.method2595();
							@Pc(325) int local325 = this.aClass1_Sub14_2.method2647();
							@Pc(329) int local329 = local320 & 0x7F;
							@Pc(336) long local336 = (long) (local315 + (local247 << 16));
							@Pc(345) boolean local345 = (local320 & 0x80) != 0;
							@Pc(355) Class1_Sub1_Sub11_Sub1 local355;
							if (local345) {
								for (local355 = (Class1_Sub1_Sub11_Sub1) this.aClass5_5.method49(); local355 != null && local336 != local355.aLong224; local355 = (Class1_Sub1_Sub11_Sub1) this.aClass5_5.method51()) {
								}
							} else {
								for (local355 = (Class1_Sub1_Sub11_Sub1) this.aClass5_3.method49(); local355 != null && local336 != local355.aLong224; local355 = (Class1_Sub1_Sub11_Sub1) this.aClass5_3.method51()) {
								}
							}
							if (local355 == null) {
								throw new IOException();
							}
							@Pc(412) int local412 = local329 == 0 ? 5 : 9;
							this.aClass1_Sub1_Sub11_Sub1_1 = local355;
							this.aClass1_Sub1_Sub11_Sub1_1.aClass1_Sub14_4 = new Class1_Sub14(this.aClass1_Sub1_Sub11_Sub1_1.aByte7 + local412 + local325);
							this.aClass1_Sub1_Sub11_Sub1_1.aClass1_Sub14_4.method2631(local329);
							this.aClass1_Sub1_Sub11_Sub1_1.aClass1_Sub14_4.method2630(local325);
							this.aClass1_Sub14_2.anInt3290 = 0;
							this.aClass1_Sub1_Sub11_Sub1_1.anInt2012 = 8;
						} else if (this.aClass1_Sub1_Sub11_Sub1_1.anInt2012 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub14_2.aByteArray34[0] == -1) {
							this.aClass1_Sub1_Sub11_Sub1_1.anInt2012 = 1;
							this.aClass1_Sub14_2.anInt3290 = 0;
						} else {
							this.aClass1_Sub1_Sub11_Sub1_1 = null;
						}
					}
				} else {
					local220 = this.aClass1_Sub1_Sub11_Sub1_1.aClass1_Sub14_4.aByteArray34.length - this.aClass1_Sub1_Sub11_Sub1_1.aByte7;
					local247 = 512 - this.aClass1_Sub1_Sub11_Sub1_1.anInt2012;
					if (local220 - this.aClass1_Sub1_Sub11_Sub1_1.aClass1_Sub14_4.anInt3290 < local247) {
						local247 = local220 - this.aClass1_Sub1_Sub11_Sub1_1.aClass1_Sub14_4.anInt3290;
					}
					if (local180 < local247) {
						local247 = local180;
					}
					this.aClass7_1.method102(this.aClass1_Sub1_Sub11_Sub1_1.aClass1_Sub14_4.aByteArray34, this.aClass1_Sub1_Sub11_Sub1_1.aClass1_Sub14_4.anInt3290, local247);
					if (this.aByte2 != 0) {
						for (local315 = 0; local315 < local247; local315++) {
							this.aClass1_Sub1_Sub11_Sub1_1.aClass1_Sub14_4.aByteArray34[local315 + this.aClass1_Sub1_Sub11_Sub1_1.aClass1_Sub14_4.anInt3290] ^= this.aByte2;
						}
					}
					this.aClass1_Sub1_Sub11_Sub1_1.anInt2012 += local247;
					this.aClass1_Sub1_Sub11_Sub1_1.aClass1_Sub14_4.anInt3290 += local247;
					if (this.aClass1_Sub1_Sub11_Sub1_1.aClass1_Sub14_4.anInt3290 == local220) {
						this.aClass1_Sub1_Sub11_Sub1_1.method4617();
						this.aClass1_Sub1_Sub11_Sub1_1.aBoolean340 = false;
						this.aClass1_Sub1_Sub11_Sub1_1 = null;
					} else if (this.aClass1_Sub1_Sub11_Sub1_1.anInt2012 == 512) {
						this.aClass1_Sub1_Sub11_Sub1_1.anInt2012 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(634) IOException local634) {
			try {
				this.aClass7_1.method105();
			} catch (@Pc(640) Exception local640) {
			}
			this.anInt955++;
			this.aClass7_1 = null;
			this.anInt954 = -2;
			return this.method864() == 0 && this.method866() == 0;
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(I)Z")
	public boolean method859() {
		return this.method866() >= 20;
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "(I)V")
	public void method860() {
		if (this.aClass7_1 != null) {
			this.aClass7_1.method105();
		}
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)V")
	public void method862() {
		try {
			this.aClass7_1.method105();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt955++;
		this.aClass7_1 = null;
		this.anInt954 = -1;
		this.aByte2 = (byte) (Math.random() * 255.0D + 1.0D);
	}

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "(I)V")
	private void method863() {
		if (this.aClass7_1 == null) {
			return;
		}
		try {
			this.aClass1_Sub14_1.anInt3290 = 0;
			this.aClass1_Sub14_1.method2631(6);
			this.aClass1_Sub14_1.method2643(3);
			this.aClass7_1.method108(this.aClass1_Sub14_1.aByteArray34, 4);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass7_1.method105();
			} catch (@Pc(43) Exception local43) {
			}
			this.aClass7_1 = null;
			this.anInt954 = -2;
			this.anInt955++;
		}
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "(B)I")
	public int method864() {
		return this.aClass5_2.method52() + this.aClass5_3.method52();
	}

	@OriginalMember(owner = "client!dl", name = "e", descriptor = "(I)I")
	private int method866() {
		return this.aClass5_4.method52() + this.aClass5_5.method52();
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILclient!ag;Z)V")
	public void method867(@OriginalArg(1) Class7 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass7_1 != null) {
			try {
				this.aClass7_1.method105();
			} catch (@Pc(11) Exception local11) {
			}
			this.aClass7_1 = null;
		}
		this.aClass7_1 = arg0;
		this.method863();
		this.method852(arg1);
		this.aClass1_Sub1_Sub11_Sub1_1 = null;
		this.aClass1_Sub14_2.anInt3290 = 0;
		while (true) {
			@Pc(48) Class1_Sub1_Sub11_Sub1 local48 = (Class1_Sub1_Sub11_Sub1) this.aClass5_3.method53();
			if (local48 == null) {
				while (true) {
					local48 = (Class1_Sub1_Sub11_Sub1) this.aClass5_5.method53();
					if (local48 == null) {
						if (this.aByte2 != 0) {
							try {
								this.aClass1_Sub14_1.anInt3290 = 0;
								this.aClass1_Sub14_1.method2631(4);
								this.aClass1_Sub14_1.method2631(this.aByte2);
								this.aClass1_Sub14_1.method2637(0);
								this.aClass7_1.method108(this.aClass1_Sub14_1.aByteArray34, 4);
							} catch (@Pc(114) IOException local114) {
								try {
									this.aClass7_1.method105();
								} catch (@Pc(120) Exception local120) {
								}
								this.anInt954 = -2;
								this.anInt955++;
								this.aClass7_1 = null;
							}
						}
						this.anInt953 = 0;
						this.aLong46 = Static135.method2186();
						return;
					}
					this.aClass5_4.method48(local48);
				}
			}
			this.aClass5_2.method48(local48);
		}
	}

	@OriginalMember(owner = "client!dl", name = "d", descriptor = "(B)Z")
	public boolean method868() {
		return this.method864() >= 20;
	}
}
