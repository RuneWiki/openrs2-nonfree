import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class113 {

	@OriginalMember(owner = "client!ff", name = "w", descriptor = "J")
	private long aLong83;

	@OriginalMember(owner = "client!ff", name = "y", descriptor = "Lclient!ij;")
	private Class163 aClass163_2;

	@OriginalMember(owner = "client!ff", name = "z", descriptor = "I")
	private int anInt3004;

	@OriginalMember(owner = "client!ff", name = "E", descriptor = "Lclient!qga;")
	private Class3_Sub5_Sub2_Sub2 aClass3_Sub5_Sub2_Sub2_1;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "Lclient!nc;")
	private final Class243 aClass243_3 = new Class243();

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "Lclient!nc;")
	private final Class243 aClass243_4 = new Class243();

	@OriginalMember(owner = "client!ff", name = "u", descriptor = "Lclient!nc;")
	private final Class243 aClass243_5 = new Class243();

	@OriginalMember(owner = "client!ff", name = "v", descriptor = "Lclient!nc;")
	private final Class243 aClass243_6 = new Class243();

	@OriginalMember(owner = "client!ff", name = "x", descriptor = "Lclient!dt;")
	private final Class3_Sub4 aClass3_Sub4_1 = new Class3_Sub4(4);

	@OriginalMember(owner = "client!ff", name = "B", descriptor = "I")
	public volatile int anInt3005 = 0;

	@OriginalMember(owner = "client!ff", name = "A", descriptor = "B")
	private byte aByte53 = 0;

	@OriginalMember(owner = "client!ff", name = "D", descriptor = "I")
	public volatile int anInt3006 = 0;

	@OriginalMember(owner = "client!ff", name = "C", descriptor = "Lclient!dt;")
	private final Class3_Sub4 aClass3_Sub4_2 = new Class3_Sub4(8);

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)V")
	public void method2589() {
		if (this.aClass163_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub4_1.anInt9739 = 0;
			this.aClass3_Sub4_1.method7948(7);
			this.aClass3_Sub4_1.method7905(0);
			this.aClass163_2.method3825(4, this.aClass3_Sub4_1.aByteArray90);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass163_2.method3822();
			} catch (@Pc(42) Exception local42) {
			}
			this.anInt3005++;
			this.anInt3006 = -2;
			this.aClass163_2 = null;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIBZB)Lclient!qga;")
	public Class3_Sub5_Sub2_Sub2 method2592(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2, @OriginalArg(3) boolean arg3) {
		@Pc(10) long local10 = (long) (arg0 + (arg1 << 16));
		@Pc(14) Class3_Sub5_Sub2_Sub2 local14 = new Class3_Sub5_Sub2_Sub2();
		local14.aByte117 = arg2;
		local14.aBoolean543 = arg3;
		local14.aLong312 = local10;
		if (arg3) {
			if (this.method2595() >= 20) {
				throw new RuntimeException();
			}
			this.aClass243_3.method5457(local14);
		} else if (this.method2601() < 20) {
			this.aClass243_5.method5457(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(B)V")
	private void method2594() {
		if (this.aClass163_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub4_1.anInt9739 = 0;
			this.aClass3_Sub4_1.method7948(6);
			this.aClass3_Sub4_1.method7905(3);
			this.aClass163_2.method3825(4, this.aClass3_Sub4_1.aByteArray90);
		} catch (@Pc(40) IOException local40) {
			try {
				this.aClass163_2.method3822();
			} catch (@Pc(46) Exception local46) {
			}
			this.anInt3006 = -2;
			this.aClass163_2 = null;
			this.anInt3005++;
		}
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(B)I")
	public int method2595() {
		return this.aClass243_3.method5458() + this.aClass243_4.method5458();
	}

	@OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)Z")
	public boolean method2596() {
		return this.method2595() >= 20;
	}

	@OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)Z")
	public boolean method2597() {
		return this.method2601() >= 20;
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(B)Z")
	public boolean method2598() {
		@Pc(17) int local17;
		if (this.aClass163_2 != null) {
			@Pc(11) long local11 = Static15.method380();
			local17 = (int) (local11 - this.aLong83);
			this.aLong83 = local11;
			if (local17 > 200) {
				local17 = 200;
			}
			this.anInt3004 += local17;
			if (this.anInt3004 > 30000) {
				try {
					this.aClass163_2.method3822();
				} catch (@Pc(41) Exception local41) {
				}
				this.aClass163_2 = null;
			}
		}
		if (this.aClass163_2 == null) {
			return this.method2595() == 0 && this.method2601() == 0;
		}
		try {
			this.aClass163_2.method3819();
			for (@Pc(69) Class3_Sub5_Sub2_Sub2 local69 = (Class3_Sub5_Sub2_Sub2) this.aClass243_3.method5459(); local69 != null; local69 = (Class3_Sub5_Sub2_Sub2) this.aClass243_3.method5453()) {
				this.aClass3_Sub4_1.anInt9739 = 0;
				this.aClass3_Sub4_1.method7948(1);
				this.aClass3_Sub4_1.method7905((int) local69.aLong312);
				this.aClass163_2.method3825(4, this.aClass3_Sub4_1.aByteArray90);
				this.aClass243_4.method5457(local69);
			}
			for (@Pc(121) Class3_Sub5_Sub2_Sub2 local121 = (Class3_Sub5_Sub2_Sub2) this.aClass243_5.method5459(); local121 != null; local121 = (Class3_Sub5_Sub2_Sub2) this.aClass243_5.method5453()) {
				this.aClass3_Sub4_1.anInt9739 = 0;
				this.aClass3_Sub4_1.method7948(0);
				this.aClass3_Sub4_1.method7905((int) local121.aLong312);
				this.aClass163_2.method3825(4, this.aClass3_Sub4_1.aByteArray90);
				this.aClass243_6.method5457(local121);
			}
			for (local17 = 0; local17 < 100; local17++) {
				@Pc(170) int local170 = this.aClass163_2.method3821();
				if (local170 < 0) {
					throw new IOException();
				}
				if (local170 == 0) {
					break;
				}
				this.anInt3004 = 0;
				@Pc(189) byte local189 = 0;
				if (this.aClass3_Sub5_Sub2_Sub2_1 == null) {
					local189 = 8;
				} else if (this.aClass3_Sub5_Sub2_Sub2_1.anInt7776 == 0) {
					local189 = 1;
				}
				@Pc(217) int local217;
				@Pc(238) int local238;
				@Pc(295) int local295;
				if (local189 > 0) {
					local217 = local189 - this.aClass3_Sub4_2.anInt9739;
					if (local217 > local170) {
						local217 = local170;
					}
					this.aClass163_2.method3824(this.aClass3_Sub4_2.anInt9739, this.aClass3_Sub4_2.aByteArray90, local217);
					if (this.aByte53 != 0) {
						for (local238 = 0; local238 < local217; local238++) {
							this.aClass3_Sub4_2.aByteArray90[local238 + this.aClass3_Sub4_2.anInt9739] ^= this.aByte53;
						}
					}
					this.aClass3_Sub4_2.anInt9739 += local217;
					if (this.aClass3_Sub4_2.anInt9739 >= local189) {
						if (this.aClass3_Sub5_Sub2_Sub2_1 == null) {
							this.aClass3_Sub4_2.anInt9739 = 0;
							local238 = this.aClass3_Sub4_2.method7954();
							local295 = this.aClass3_Sub4_2.method7951();
							@Pc(300) int local300 = this.aClass3_Sub4_2.method7954();
							@Pc(305) int local305 = this.aClass3_Sub4_2.method7895();
							@Pc(309) int local309 = local300 & 0x7F;
							@Pc(320) boolean local320 = (local300 & 0x80) != 0;
							@Pc(328) long local328 = (long) ((local238 << 16) + local295);
							@Pc(338) Class3_Sub5_Sub2_Sub2 local338;
							if (local320) {
								for (local338 = (Class3_Sub5_Sub2_Sub2) this.aClass243_6.method5459(); local338 != null && local338.aLong312 != local328; local338 = (Class3_Sub5_Sub2_Sub2) this.aClass243_6.method5453()) {
								}
							} else {
								for (local338 = (Class3_Sub5_Sub2_Sub2) this.aClass243_4.method5459(); local338 != null && local338.aLong312 != local328; local338 = (Class3_Sub5_Sub2_Sub2) this.aClass243_4.method5453()) {
								}
							}
							if (local338 == null) {
								throw new IOException();
							}
							@Pc(402) int local402 = local309 == 0 ? 5 : 9;
							this.aClass3_Sub5_Sub2_Sub2_1 = local338;
							this.aClass3_Sub5_Sub2_Sub2_1.aClass3_Sub4_5 = new Class3_Sub4(this.aClass3_Sub5_Sub2_Sub2_1.aByte117 + local402 + local305);
							this.aClass3_Sub5_Sub2_Sub2_1.aClass3_Sub4_5.method7948(local309);
							this.aClass3_Sub5_Sub2_Sub2_1.aClass3_Sub4_5.method7909(local305);
							this.aClass3_Sub4_2.anInt9739 = 0;
							this.aClass3_Sub5_Sub2_Sub2_1.anInt7776 = 8;
						} else if (this.aClass3_Sub5_Sub2_Sub2_1.anInt7776 != 0) {
							throw new IOException();
						} else if (this.aClass3_Sub4_2.aByteArray90[0] == -1) {
							this.aClass3_Sub4_2.anInt9739 = 0;
							this.aClass3_Sub5_Sub2_Sub2_1.anInt7776 = 1;
						} else {
							this.aClass3_Sub5_Sub2_Sub2_1 = null;
						}
					}
				} else {
					local217 = this.aClass3_Sub5_Sub2_Sub2_1.aClass3_Sub4_5.aByteArray90.length - this.aClass3_Sub5_Sub2_Sub2_1.aByte117;
					local238 = 512 - this.aClass3_Sub5_Sub2_Sub2_1.anInt7776;
					if (local238 > local217 - this.aClass3_Sub5_Sub2_Sub2_1.aClass3_Sub4_5.anInt9739) {
						local238 = local217 - this.aClass3_Sub5_Sub2_Sub2_1.aClass3_Sub4_5.anInt9739;
					}
					if (local170 < local238) {
						local238 = local170;
					}
					this.aClass163_2.method3824(this.aClass3_Sub5_Sub2_Sub2_1.aClass3_Sub4_5.anInt9739, this.aClass3_Sub5_Sub2_Sub2_1.aClass3_Sub4_5.aByteArray90, local238);
					if (this.aByte53 != 0) {
						for (local295 = 0; local295 < local238; local295++) {
							this.aClass3_Sub5_Sub2_Sub2_1.aClass3_Sub4_5.aByteArray90[local295 + this.aClass3_Sub5_Sub2_Sub2_1.aClass3_Sub4_5.anInt9739] ^= this.aByte53;
						}
					}
					this.aClass3_Sub5_Sub2_Sub2_1.aClass3_Sub4_5.anInt9739 += local238;
					this.aClass3_Sub5_Sub2_Sub2_1.anInt7776 += local238;
					if (this.aClass3_Sub5_Sub2_Sub2_1.aClass3_Sub4_5.anInt9739 == local217) {
						this.aClass3_Sub5_Sub2_Sub2_1.method9014();
						this.aClass3_Sub5_Sub2_Sub2_1.aBoolean541 = false;
						this.aClass3_Sub5_Sub2_Sub2_1 = null;
					} else if (this.aClass3_Sub5_Sub2_Sub2_1.anInt7776 == 512) {
						this.aClass3_Sub5_Sub2_Sub2_1.anInt7776 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(627) IOException local627) {
			try {
				this.aClass163_2.method3822();
			} catch (@Pc(633) Exception local633) {
			}
			this.aClass163_2 = null;
			this.anInt3005++;
			this.anInt3006 = -2;
			return this.method2595() == 0 && this.method2601() == 0;
		}
	}

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(B)V")
	public void method2599() {
		if (this.aClass163_2 != null) {
			this.aClass163_2.method3823();
		}
	}

	@OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)I")
	private int method2601() {
		return this.aClass243_5.method5458() + this.aClass243_6.method5458();
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!ij;BZ)V")
	public void method2602(@OriginalArg(0) Class163 arg0, @OriginalArg(2) boolean arg1) {
		if (this.aClass163_2 != null) {
			try {
				this.aClass163_2.method3822();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass163_2 = null;
		}
		this.aClass163_2 = arg0;
		this.method2594();
		this.method2604(arg1);
		this.aClass3_Sub5_Sub2_Sub2_1 = null;
		this.aClass3_Sub4_2.anInt9739 = 0;
		while (true) {
			@Pc(48) Class3_Sub5_Sub2_Sub2 local48 = (Class3_Sub5_Sub2_Sub2) this.aClass243_4.method5462();
			if (local48 == null) {
				while (true) {
					local48 = (Class3_Sub5_Sub2_Sub2) this.aClass243_6.method5462();
					if (local48 == null) {
						if (this.aByte53 != 0) {
							try {
								this.aClass3_Sub4_1.anInt9739 = 0;
								this.aClass3_Sub4_1.method7948(4);
								this.aClass3_Sub4_1.method7948(this.aByte53);
								this.aClass3_Sub4_1.method7956(0);
								this.aClass163_2.method3825(4, this.aClass3_Sub4_1.aByteArray90);
							} catch (@Pc(109) IOException local109) {
								try {
									this.aClass163_2.method3822();
								} catch (@Pc(115) Exception local115) {
								}
								this.aClass163_2 = null;
								this.anInt3006 = -2;
								this.anInt3005++;
							}
						}
						this.anInt3004 = 0;
						this.aLong83 = Static15.method380();
						return;
					}
					this.aClass243_5.method5457(local48);
				}
			}
			this.aClass243_3.method5457(local48);
		}
	}

	@OriginalMember(owner = "client!ff", name = "f", descriptor = "(B)V")
	public void method2603() {
		if (this.aClass163_2 != null) {
			this.aClass163_2.method3822();
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZZ)V")
	public void method2604(@OriginalArg(0) boolean arg0) {
		if (this.aClass163_2 == null) {
			return;
		}
		try {
			this.aClass3_Sub4_1.anInt9739 = 0;
			this.aClass3_Sub4_1.method7948(arg0 ? 2 : 3);
			this.aClass3_Sub4_1.method7905(0);
			this.aClass163_2.method3825(4, this.aClass3_Sub4_1.aByteArray90);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass163_2.method3822();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass163_2 = null;
			this.anInt3005++;
			this.anInt3006 = -2;
		}
	}

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "(I)V")
	public void method2605() {
		try {
			this.aClass163_2.method3822();
		} catch (@Pc(9) Exception local9) {
		}
		this.aByte53 = (byte) (int) (Math.random() * 255.0D + 1.0D);
		this.anInt3006 = -1;
		this.anInt3005++;
		this.aClass163_2 = null;
	}
}
