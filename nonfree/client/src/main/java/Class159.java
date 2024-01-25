import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lq")
public final class Class159 {

	@OriginalMember(owner = "client!lq", name = "y", descriptor = "I")
	private int anInt4703;

	@OriginalMember(owner = "client!lq", name = "z", descriptor = "Lclient!st;")
	private Class236 aClass236_8;

	@OriginalMember(owner = "client!lq", name = "A", descriptor = "J")
	private long aLong127;

	@OriginalMember(owner = "client!lq", name = "G", descriptor = "Lclient!wk;")
	private Class1_Sub1_Sub6_Sub2 aClass1_Sub1_Sub6_Sub2_1;

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "Lclient!vt;")
	private final Class262 aClass262_4 = new Class262();

	@OriginalMember(owner = "client!lq", name = "p", descriptor = "Lclient!vt;")
	private final Class262 aClass262_5 = new Class262();

	@OriginalMember(owner = "client!lq", name = "w", descriptor = "Lclient!vt;")
	private final Class262 aClass262_6 = new Class262();

	@OriginalMember(owner = "client!lq", name = "x", descriptor = "Lclient!vt;")
	private final Class262 aClass262_7 = new Class262();

	@OriginalMember(owner = "client!lq", name = "B", descriptor = "Lclient!ia;")
	private final Class1_Sub3 aClass1_Sub3_3 = new Class1_Sub3(4);

	@OriginalMember(owner = "client!lq", name = "C", descriptor = "B")
	private byte aByte63 = 0;

	@OriginalMember(owner = "client!lq", name = "F", descriptor = "I")
	public volatile int anInt4705 = 0;

	@OriginalMember(owner = "client!lq", name = "E", descriptor = "I")
	public volatile int anInt4704 = 0;

	@OriginalMember(owner = "client!lq", name = "D", descriptor = "Lclient!ia;")
	private final Class1_Sub3 aClass1_Sub3_4 = new Class1_Sub3(8);

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)V")
	private void method3607() {
		if (this.aClass236_8 == null) {
			return;
		}
		try {
			this.aClass1_Sub3_3.anInt1710 = 0;
			this.aClass1_Sub3_3.method1208(6);
			this.aClass1_Sub3_3.method1219(3);
			this.aClass236_8.method5227(4, this.aClass1_Sub3_3.aByteArray14);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass236_8.method5236();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt4704 = -2;
			this.aClass236_8 = null;
			this.anInt4705++;
		}
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)Z")
	public boolean method3608() {
		@Pc(14) int local14;
		if (this.aClass236_8 != null) {
			@Pc(7) long local7 = Static250.method3737();
			local14 = (int) (local7 - this.aLong127);
			this.aLong127 = local7;
			if (local14 > 200) {
				local14 = 200;
			}
			this.anInt4703 += local14;
			if (this.anInt4703 > 30000) {
				try {
					this.aClass236_8.method5236();
				} catch (@Pc(40) Exception local40) {
				}
				this.aClass236_8 = null;
			}
		}
		if (this.aClass236_8 == null) {
			return this.method3611() == 0 && this.method3613() == 0;
		}
		try {
			this.aClass236_8.method5228();
			for (@Pc(77) Class1_Sub1_Sub6_Sub2 local77 = (Class1_Sub1_Sub6_Sub2) this.aClass262_4.method5882(); local77 != null; local77 = (Class1_Sub1_Sub6_Sub2) this.aClass262_4.method5879()) {
				this.aClass1_Sub3_3.anInt1710 = 0;
				this.aClass1_Sub3_3.method1208(1);
				this.aClass1_Sub3_3.method1219((int) local77.aLong227);
				this.aClass236_8.method5227(4, this.aClass1_Sub3_3.aByteArray14);
				this.aClass262_5.method5876(local77);
			}
			for (@Pc(131) Class1_Sub1_Sub6_Sub2 local131 = (Class1_Sub1_Sub6_Sub2) this.aClass262_6.method5882(); local131 != null; local131 = (Class1_Sub1_Sub6_Sub2) this.aClass262_6.method5879()) {
				this.aClass1_Sub3_3.anInt1710 = 0;
				this.aClass1_Sub3_3.method1208(0);
				this.aClass1_Sub3_3.method1219((int) local131.aLong227);
				this.aClass236_8.method5227(4, this.aClass1_Sub3_3.aByteArray14);
				this.aClass262_7.method5876(local131);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(180) int local180 = this.aClass236_8.method5235();
				if (local180 < 0) {
					throw new IOException();
				}
				if (local180 == 0) {
					break;
				}
				this.anInt4703 = 0;
				@Pc(196) byte local196 = 0;
				if (this.aClass1_Sub1_Sub6_Sub2_1 == null) {
					local196 = 8;
				} else if (this.aClass1_Sub1_Sub6_Sub2_1.anInt7867 == 0) {
					local196 = 1;
				}
				@Pc(225) int local225;
				@Pc(232) int local232;
				@Pc(280) int local280;
				if (local196 <= 0) {
					local225 = this.aClass1_Sub1_Sub6_Sub2_1.aClass1_Sub3_8.aByteArray14.length - this.aClass1_Sub1_Sub6_Sub2_1.aByte104;
					local232 = 512 - this.aClass1_Sub1_Sub6_Sub2_1.anInt7867;
					if (local225 - this.aClass1_Sub1_Sub6_Sub2_1.aClass1_Sub3_8.anInt1710 < local232) {
						local232 = local225 - this.aClass1_Sub1_Sub6_Sub2_1.aClass1_Sub3_8.anInt1710;
					}
					if (local232 > local180) {
						local232 = local180;
					}
					this.aClass236_8.method5226(this.aClass1_Sub1_Sub6_Sub2_1.aClass1_Sub3_8.anInt1710, this.aClass1_Sub1_Sub6_Sub2_1.aClass1_Sub3_8.aByteArray14, local232);
					if (this.aByte63 != 0) {
						for (local280 = 0; local280 < local232; local280++) {
							this.aClass1_Sub1_Sub6_Sub2_1.aClass1_Sub3_8.aByteArray14[local280 + this.aClass1_Sub1_Sub6_Sub2_1.aClass1_Sub3_8.anInt1710] ^= this.aByte63;
						}
					}
					this.aClass1_Sub1_Sub6_Sub2_1.anInt7867 += local232;
					this.aClass1_Sub1_Sub6_Sub2_1.aClass1_Sub3_8.anInt1710 += local232;
					if (this.aClass1_Sub1_Sub6_Sub2_1.aClass1_Sub3_8.anInt1710 == local225) {
						this.aClass1_Sub1_Sub6_Sub2_1.method6125();
						this.aClass1_Sub1_Sub6_Sub2_1.aBoolean512 = false;
						this.aClass1_Sub1_Sub6_Sub2_1 = null;
					} else if (this.aClass1_Sub1_Sub6_Sub2_1.anInt7867 == 512) {
						this.aClass1_Sub1_Sub6_Sub2_1.anInt7867 = 0;
					}
				} else {
					local225 = local196 - this.aClass1_Sub3_4.anInt1710;
					if (local180 < local225) {
						local225 = local180;
					}
					this.aClass236_8.method5226(this.aClass1_Sub3_4.anInt1710, this.aClass1_Sub3_4.aByteArray14, local225);
					if (this.aByte63 != 0) {
						for (local232 = 0; local232 < local225; local232++) {
							this.aClass1_Sub3_4.aByteArray14[this.aClass1_Sub3_4.anInt1710 + local232] = (byte) (this.aClass1_Sub3_4.aByteArray14[this.aClass1_Sub3_4.anInt1710 + local232] ^ this.aByte63);
						}
					}
					this.aClass1_Sub3_4.anInt1710 += local225;
					if (this.aClass1_Sub3_4.anInt1710 >= local196) {
						if (this.aClass1_Sub1_Sub6_Sub2_1 == null) {
							this.aClass1_Sub3_4.anInt1710 = 0;
							local232 = this.aClass1_Sub3_4.method1171();
							local280 = this.aClass1_Sub3_4.method1177();
							@Pc(468) int local468 = this.aClass1_Sub3_4.method1171();
							@Pc(475) int local475 = this.aClass1_Sub3_4.method1188();
							@Pc(479) int local479 = local468 & 0x7F;
							@Pc(487) boolean local487 = (local468 & 0x80) != 0;
							@Pc(494) long local494 = (long) ((local232 << 16) + local280);
							@Pc(504) Class1_Sub1_Sub6_Sub2 local504;
							if (local487) {
								for (local504 = (Class1_Sub1_Sub6_Sub2) this.aClass262_7.method5882(); local504 != null && local494 != local504.aLong227; local504 = (Class1_Sub1_Sub6_Sub2) this.aClass262_7.method5879()) {
								}
							} else {
								for (local504 = (Class1_Sub1_Sub6_Sub2) this.aClass262_5.method5882(); local504 != null && local504.aLong227 != local494; local504 = (Class1_Sub1_Sub6_Sub2) this.aClass262_5.method5879()) {
								}
							}
							if (local504 == null) {
								throw new IOException();
							}
							@Pc(568) int local568 = local479 == 0 ? 5 : 9;
							this.aClass1_Sub1_Sub6_Sub2_1 = local504;
							this.aClass1_Sub1_Sub6_Sub2_1.aClass1_Sub3_8 = new Class1_Sub3(local568 + local475 + this.aClass1_Sub1_Sub6_Sub2_1.aByte104);
							this.aClass1_Sub1_Sub6_Sub2_1.aClass1_Sub3_8.method1208(local479);
							this.aClass1_Sub1_Sub6_Sub2_1.aClass1_Sub3_8.method1197(local475);
							this.aClass1_Sub1_Sub6_Sub2_1.anInt7867 = 8;
							this.aClass1_Sub3_4.anInt1710 = 0;
						} else if (this.aClass1_Sub1_Sub6_Sub2_1.anInt7867 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub3_4.aByteArray14[0] == -1) {
							this.aClass1_Sub1_Sub6_Sub2_1.anInt7867 = 1;
							this.aClass1_Sub3_4.anInt1710 = 0;
						} else {
							this.aClass1_Sub1_Sub6_Sub2_1 = null;
						}
					}
				}
			}
			return true;
		} catch (@Pc(646) IOException local646) {
			try {
				this.aClass236_8.method5236();
			} catch (@Pc(652) Exception local652) {
			}
			this.anInt4705++;
			this.anInt4704 = -2;
			this.aClass236_8 = null;
			return this.method3611() == 0 && this.method3613() == 0;
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(IZIIB)Lclient!wk;")
	public Class1_Sub1_Sub6_Sub2 method3610(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2, @OriginalArg(4) byte arg3) {
		@Pc(10) long local10 = (long) (arg0 + (arg2 << 16));
		@Pc(14) Class1_Sub1_Sub6_Sub2 local14 = new Class1_Sub1_Sub6_Sub2();
		local14.aBoolean511 = arg1;
		local14.aByte104 = arg3;
		local14.aLong227 = local10;
		if (arg1) {
			if (this.method3611() >= 20) {
				throw new RuntimeException();
			}
			this.aClass262_4.method5876(local14);
		} else if (this.method3613() < 20) {
			this.aClass262_6.method5876(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(B)I")
	public int method3611() {
		return this.aClass262_4.method5874() + this.aClass262_5.method5874();
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lclient!st;ZI)V")
	public void method3612(@OriginalArg(0) Class236 arg0, @OriginalArg(1) boolean arg1) {
		if (this.aClass236_8 != null) {
			try {
				this.aClass236_8.method5236();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass236_8 = null;
		}
		this.aClass236_8 = arg0;
		this.method3607();
		this.method3615(arg1);
		this.aClass1_Sub3_4.anInt1710 = 0;
		this.aClass1_Sub1_Sub6_Sub2_1 = null;
		while (true) {
			@Pc(47) Class1_Sub1_Sub6_Sub2 local47 = (Class1_Sub1_Sub6_Sub2) this.aClass262_5.method5880();
			if (local47 == null) {
				while (true) {
					local47 = (Class1_Sub1_Sub6_Sub2) this.aClass262_7.method5880();
					if (local47 == null) {
						if (this.aByte63 != 0) {
							try {
								this.aClass1_Sub3_3.anInt1710 = 0;
								this.aClass1_Sub3_3.method1208(4);
								this.aClass1_Sub3_3.method1208(this.aByte63);
								this.aClass1_Sub3_3.method1227(0);
								this.aClass236_8.method5227(4, this.aClass1_Sub3_3.aByteArray14);
							} catch (@Pc(105) IOException local105) {
								try {
									this.aClass236_8.method5236();
								} catch (@Pc(111) Exception local111) {
								}
								this.anInt4705++;
								this.aClass236_8 = null;
								this.anInt4704 = -2;
							}
						}
						this.anInt4703 = 0;
						this.aLong127 = Static250.method3737();
						return;
					}
					this.aClass262_6.method5876(local47);
				}
			}
			this.aClass262_4.method5876(local47);
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)I")
	private int method3613() {
		return this.aClass262_6.method5874() + this.aClass262_7.method5874();
	}

	@OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)V")
	public void method3614() {
		if (this.aClass236_8 != null) {
			this.aClass236_8.method5229();
		}
	}

	@OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZI)V")
	public void method3615(@OriginalArg(0) boolean arg0) {
		if (this.aClass236_8 == null) {
			return;
		}
		try {
			this.aClass1_Sub3_3.anInt1710 = 0;
			this.aClass1_Sub3_3.method1208(arg0 ? 2 : 3);
			this.aClass1_Sub3_3.method1219(0);
			this.aClass236_8.method5227(4, this.aClass1_Sub3_3.aByteArray14);
		} catch (@Pc(38) IOException local38) {
			try {
				this.aClass236_8.method5236();
			} catch (@Pc(44) Exception local44) {
			}
			this.anInt4704 = -2;
			this.aClass236_8 = null;
			this.anInt4705++;
		}
	}

	@OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)V")
	public void method3616() {
		if (this.aClass236_8 == null) {
			return;
		}
		try {
			this.aClass1_Sub3_3.anInt1710 = 0;
			this.aClass1_Sub3_3.method1208(7);
			this.aClass1_Sub3_3.method1219(0);
			this.aClass236_8.method5227(4, this.aClass1_Sub3_3.aByteArray14);
		} catch (@Pc(36) IOException local36) {
			try {
				this.aClass236_8.method5236();
			} catch (@Pc(42) Exception local42) {
			}
			this.anInt4705++;
			this.anInt4704 = -2;
			this.aClass236_8 = null;
		}
	}

	@OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)Z")
	public boolean method3617() {
		return this.method3611() >= 20;
	}

	@OriginalMember(owner = "client!lq", name = "e", descriptor = "(I)Z")
	public boolean method3618() {
		return this.method3613() >= 20;
	}

	@OriginalMember(owner = "client!lq", name = "f", descriptor = "(I)V")
	public void method3619() {
		if (this.aClass236_8 != null) {
			this.aClass236_8.method5236();
		}
	}

	@OriginalMember(owner = "client!lq", name = "g", descriptor = "(I)V")
	public void method3620() {
		try {
			this.aClass236_8.method5236();
		} catch (@Pc(5) Exception local5) {
		}
		this.anInt4705++;
		this.aClass236_8 = null;
		this.anInt4704 = -1;
		this.aByte63 = (byte) ((double) 1 + Math.random() * 255.0D);
	}
}
