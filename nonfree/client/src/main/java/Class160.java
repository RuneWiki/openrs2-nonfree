import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class160 {

	@OriginalMember(owner = "client!p", name = "B", descriptor = "J")
	private long aLong156;

	@OriginalMember(owner = "client!p", name = "D", descriptor = "I")
	private int anInt4733;

	@OriginalMember(owner = "client!p", name = "E", descriptor = "Lclient!ee;")
	private Class61 aClass61_4;

	@OriginalMember(owner = "client!p", name = "J", descriptor = "Lclient!uj;")
	private Class7_Sub1_Sub8_Sub2 aClass7_Sub1_Sub8_Sub2_2;

	@OriginalMember(owner = "client!p", name = "k", descriptor = "Lclient!bo;")
	private final Class30 aClass30_5 = new Class30();

	@OriginalMember(owner = "client!p", name = "x", descriptor = "Lclient!bo;")
	private final Class30 aClass30_6 = new Class30();

	@OriginalMember(owner = "client!p", name = "z", descriptor = "Lclient!bo;")
	private final Class30 aClass30_7 = new Class30();

	@OriginalMember(owner = "client!p", name = "A", descriptor = "Lclient!bo;")
	private final Class30 aClass30_8 = new Class30();

	@OriginalMember(owner = "client!p", name = "C", descriptor = "Lclient!ap;")
	private final Class7_Sub3 aClass7_Sub3_6 = new Class7_Sub3(4);

	@OriginalMember(owner = "client!p", name = "F", descriptor = "I")
	public volatile int anInt4734 = 0;

	@OriginalMember(owner = "client!p", name = "H", descriptor = "B")
	private byte aByte47 = 0;

	@OriginalMember(owner = "client!p", name = "I", descriptor = "I")
	public volatile int anInt4735 = 0;

	@OriginalMember(owner = "client!p", name = "G", descriptor = "Lclient!ap;")
	private final Class7_Sub3 aClass7_Sub3_7 = new Class7_Sub3(8);

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
	public void method4103() {
		if (this.aClass61_4 != null) {
			this.aClass61_4.method1381();
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(I)V")
	public void method4105() {
		if (this.aClass61_4 != null) {
			this.aClass61_4.method1376();
		}
	}

	@OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
	public void method4106() {
		try {
			this.aClass61_4.method1376();
		} catch (@Pc(5) Exception local5) {
		}
		this.aByte47 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt4735 = -1;
		this.aClass61_4 = null;
		this.anInt4734++;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)Z")
	public boolean method4109() {
		return this.method4111() >= 20;
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(BZIIB)Lclient!uj;")
	public Class7_Sub1_Sub8_Sub2 method4110(@OriginalArg(0) byte arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) long local11 = (long) ((arg3 << 16) + arg2);
		@Pc(15) Class7_Sub1_Sub8_Sub2 local15 = new Class7_Sub1_Sub8_Sub2();
		local15.aLong222 = local11;
		local15.aBoolean445 = arg1;
		local15.aByte73 = arg0;
		if (arg1) {
			if (this.method4111() >= 20) {
				throw new RuntimeException();
			}
			this.aClass30_5.method515(local15);
		} else if (this.method4113() < 20) {
			this.aClass30_7.method515(local15);
		} else {
			throw new RuntimeException();
		}
		return local15;
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(I)I")
	public int method4111() {
		return this.aClass30_5.method506() + this.aClass30_6.method506();
	}

	@OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V")
	public void method4112() {
		if (this.aClass61_4 == null) {
			return;
		}
		try {
			this.aClass7_Sub3_6.anInt3005 = 0;
			this.aClass7_Sub3_6.method2735(7);
			this.aClass7_Sub3_6.method2787(0);
			this.aClass61_4.method1377(this.aClass7_Sub3_6.aByteArray33, 4);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass61_4.method1376();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt4734++;
			this.aClass61_4 = null;
			this.anInt4735 = -2;
		}
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(B)I")
	private int method4113() {
		return this.aClass30_7.method506() + this.aClass30_8.method506();
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IZ)V")
	public void method4114(@OriginalArg(1) boolean arg0) {
		if (this.aClass61_4 == null) {
			return;
		}
		try {
			this.aClass7_Sub3_6.anInt3005 = 0;
			this.aClass7_Sub3_6.method2735(arg0 ? 2 : 3);
			this.aClass7_Sub3_6.method2787(0);
			this.aClass61_4.method1377(this.aClass7_Sub3_6.aByteArray33, 4);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass61_4.method1376();
			} catch (@Pc(42) Exception local42) {
			}
			this.aClass61_4 = null;
			this.anInt4734++;
			this.anInt4735 = -2;
		}
	}

	@OriginalMember(owner = "client!p", name = "d", descriptor = "(I)Z")
	public boolean method4116() {
		@Pc(16) int local16;
		if (this.aClass61_4 != null) {
			@Pc(9) long local9 = Static335.method5308();
			local16 = (int) (local9 - this.aLong156);
			if (local16 > 200) {
				local16 = 200;
			}
			this.aLong156 = local9;
			this.anInt4733 += local16;
			if (this.anInt4733 > 30000) {
				try {
					this.aClass61_4.method1376();
				} catch (@Pc(44) Exception local44) {
				}
				this.aClass61_4 = null;
			}
		}
		if (this.aClass61_4 == null) {
			return this.method4111() == 0 && this.method4113() == 0;
		}
		try {
			this.aClass61_4.method1383();
			for (@Pc(72) Class7_Sub1_Sub8_Sub2 local72 = (Class7_Sub1_Sub8_Sub2) this.aClass30_5.method505(); local72 != null; local72 = (Class7_Sub1_Sub8_Sub2) this.aClass30_5.method508()) {
				this.aClass7_Sub3_6.anInt3005 = 0;
				this.aClass7_Sub3_6.method2735(1);
				this.aClass7_Sub3_6.method2787((int) local72.aLong222);
				this.aClass61_4.method1377(this.aClass7_Sub3_6.aByteArray33, 4);
				this.aClass30_6.method515(local72);
			}
			for (@Pc(117) Class7_Sub1_Sub8_Sub2 local117 = (Class7_Sub1_Sub8_Sub2) this.aClass30_7.method505(); local117 != null; local117 = (Class7_Sub1_Sub8_Sub2) this.aClass30_7.method508()) {
				this.aClass7_Sub3_6.anInt3005 = 0;
				this.aClass7_Sub3_6.method2735(0);
				this.aClass7_Sub3_6.method2787((int) local117.aLong222);
				this.aClass61_4.method1377(this.aClass7_Sub3_6.aByteArray33, 4);
				this.aClass30_8.method515(local117);
			}
			for (local16 = 0; local16 < 100; local16++) {
				@Pc(164) int local164 = this.aClass61_4.method1372();
				if (local164 < 0) {
					throw new IOException();
				}
				if (local164 == 0) {
					break;
				}
				this.anInt4733 = 0;
				@Pc(177) byte local177 = 0;
				if (this.aClass7_Sub1_Sub8_Sub2_2 == null) {
					local177 = 8;
				} else if (this.aClass7_Sub1_Sub8_Sub2_2.anInt6122 == 0) {
					local177 = 1;
				}
				@Pc(204) int local204;
				@Pc(211) int local211;
				@Pc(262) int local262;
				if (local177 <= 0) {
					local204 = this.aClass7_Sub1_Sub8_Sub2_2.aClass7_Sub3_8.aByteArray33.length - this.aClass7_Sub1_Sub8_Sub2_2.aByte73;
					local211 = 512 - this.aClass7_Sub1_Sub8_Sub2_2.anInt6122;
					if (local204 - this.aClass7_Sub1_Sub8_Sub2_2.aClass7_Sub3_8.anInt3005 < local211) {
						local211 = local204 - this.aClass7_Sub1_Sub8_Sub2_2.aClass7_Sub3_8.anInt3005;
					}
					if (local164 < local211) {
						local211 = local164;
					}
					this.aClass61_4.method1373(this.aClass7_Sub1_Sub8_Sub2_2.aClass7_Sub3_8.anInt3005, this.aClass7_Sub1_Sub8_Sub2_2.aClass7_Sub3_8.aByteArray33, local211);
					if (this.aByte47 != 0) {
						for (local262 = 0; local262 < local211; local262++) {
							this.aClass7_Sub1_Sub8_Sub2_2.aClass7_Sub3_8.aByteArray33[local262 + this.aClass7_Sub1_Sub8_Sub2_2.aClass7_Sub3_8.anInt3005] ^= this.aByte47;
						}
					}
					this.aClass7_Sub1_Sub8_Sub2_2.anInt6122 += local211;
					this.aClass7_Sub1_Sub8_Sub2_2.aClass7_Sub3_8.anInt3005 += local211;
					if (this.aClass7_Sub1_Sub8_Sub2_2.aClass7_Sub3_8.anInt3005 == local204) {
						this.aClass7_Sub1_Sub8_Sub2_2.method5509();
						this.aClass7_Sub1_Sub8_Sub2_2.aBoolean447 = false;
						this.aClass7_Sub1_Sub8_Sub2_2 = null;
					} else if (this.aClass7_Sub1_Sub8_Sub2_2.anInt6122 == 512) {
						this.aClass7_Sub1_Sub8_Sub2_2.anInt6122 = 0;
					}
				} else {
					local204 = local177 - this.aClass7_Sub3_7.anInt3005;
					if (local204 > local164) {
						local204 = local164;
					}
					this.aClass61_4.method1373(this.aClass7_Sub3_7.anInt3005, this.aClass7_Sub3_7.aByteArray33, local204);
					if (this.aByte47 != 0) {
						for (local211 = 0; local211 < local204; local211++) {
							this.aClass7_Sub3_7.aByteArray33[local211 + this.aClass7_Sub3_7.anInt3005] ^= this.aByte47;
						}
					}
					this.aClass7_Sub3_7.anInt3005 += local204;
					if (local177 <= this.aClass7_Sub3_7.anInt3005) {
						if (this.aClass7_Sub1_Sub8_Sub2_2 == null) {
							this.aClass7_Sub3_7.anInt3005 = 0;
							local211 = this.aClass7_Sub3_7.method2772();
							local262 = this.aClass7_Sub3_7.method2764();
							@Pc(442) int local442 = this.aClass7_Sub3_7.method2772();
							@Pc(447) int local447 = this.aClass7_Sub3_7.method2767();
							@Pc(451) int local451 = local442 & 0x7F;
							@Pc(459) boolean local459 = (local442 & 0x80) != 0;
							@Pc(466) long local466 = (long) ((local211 << 16) + local262);
							@Pc(476) Class7_Sub1_Sub8_Sub2 local476;
							if (local459) {
								for (local476 = (Class7_Sub1_Sub8_Sub2) this.aClass30_8.method505(); local476 != null && local476.aLong222 != local466; local476 = (Class7_Sub1_Sub8_Sub2) this.aClass30_8.method508()) {
								}
							} else {
								for (local476 = (Class7_Sub1_Sub8_Sub2) this.aClass30_6.method505(); local476 != null && local476.aLong222 != local466; local476 = (Class7_Sub1_Sub8_Sub2) this.aClass30_6.method508()) {
								}
							}
							if (local476 == null) {
								throw new IOException();
							}
							this.aClass7_Sub1_Sub8_Sub2_2 = local476;
							@Pc(532) int local532 = local451 == 0 ? 5 : 9;
							this.aClass7_Sub1_Sub8_Sub2_2.aClass7_Sub3_8 = new Class7_Sub3(local532 + local447 + this.aClass7_Sub1_Sub8_Sub2_2.aByte73);
							this.aClass7_Sub1_Sub8_Sub2_2.aClass7_Sub3_8.method2735(local451);
							this.aClass7_Sub1_Sub8_Sub2_2.aClass7_Sub3_8.method2765(local447);
							this.aClass7_Sub1_Sub8_Sub2_2.anInt6122 = 8;
							this.aClass7_Sub3_7.anInt3005 = 0;
						} else if (this.aClass7_Sub1_Sub8_Sub2_2.anInt6122 != 0) {
							throw new IOException();
						} else if (this.aClass7_Sub3_7.aByteArray33[0] == -1) {
							this.aClass7_Sub1_Sub8_Sub2_2.anInt6122 = 1;
							this.aClass7_Sub3_7.anInt3005 = 0;
						} else {
							this.aClass7_Sub1_Sub8_Sub2_2 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(612) IOException local612) {
			try {
				this.aClass61_4.method1376();
			} catch (@Pc(618) Exception local618) {
			}
			this.aClass61_4 = null;
			this.anInt4734++;
			this.anInt4735 = -2;
			return this.method4111() == 0 && this.method4113() == 0;
		}
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V")
	private void method4117() {
		if (this.aClass61_4 == null) {
			return;
		}
		try {
			this.aClass7_Sub3_6.anInt3005 = 0;
			this.aClass7_Sub3_6.method2735(6);
			this.aClass7_Sub3_6.method2787(3);
			this.aClass61_4.method1377(this.aClass7_Sub3_6.aByteArray33, 4);
		} catch (@Pc(32) IOException local32) {
			try {
				this.aClass61_4.method1376();
			} catch (@Pc(38) Exception local38) {
			}
			this.aClass61_4 = null;
			this.anInt4734++;
			this.anInt4735 = -2;
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(IZLclient!ee;)V")
	public void method4118(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class61 arg1) {
		if (this.aClass61_4 != null) {
			try {
				this.aClass61_4.method1376();
			} catch (@Pc(10) Exception local10) {
			}
			this.aClass61_4 = null;
		}
		this.aClass61_4 = arg1;
		this.method4117();
		this.method4114(arg0);
		this.aClass7_Sub1_Sub8_Sub2_2 = null;
		this.aClass7_Sub3_7.anInt3005 = 0;
		while (true) {
			@Pc(44) Class7_Sub1_Sub8_Sub2 local44 = (Class7_Sub1_Sub8_Sub2) this.aClass30_6.method514();
			if (local44 == null) {
				while (true) {
					local44 = (Class7_Sub1_Sub8_Sub2) this.aClass30_8.method514();
					if (local44 == null) {
						if (this.aByte47 != 0) {
							try {
								this.aClass7_Sub3_6.anInt3005 = 0;
								this.aClass7_Sub3_6.method2735(4);
								this.aClass7_Sub3_6.method2735(this.aByte47);
								this.aClass7_Sub3_6.method2788(0);
								this.aClass61_4.method1377(this.aClass7_Sub3_6.aByteArray33, 4);
							} catch (@Pc(105) IOException local105) {
								try {
									this.aClass61_4.method1376();
								} catch (@Pc(111) Exception local111) {
								}
								this.aClass61_4 = null;
								this.anInt4734++;
								this.anInt4735 = -2;
							}
						}
						this.anInt4733 = 0;
						this.aLong156 = Static335.method5308();
						return;
					}
					this.aClass30_7.method515(local44);
				}
			}
			this.aClass30_5.method515(local44);
		}
	}

	@OriginalMember(owner = "client!p", name = "e", descriptor = "(B)Z")
	public boolean method4119() {
		return this.method4113() >= 20;
	}
}
