import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public final class Class94 {

	@OriginalMember(owner = "client!gl", name = "y", descriptor = "Lclient!mr;")
	private Class161 aClass161_1;

	@OriginalMember(owner = "client!gl", name = "z", descriptor = "J")
	private long aLong72;

	@OriginalMember(owner = "client!gl", name = "B", descriptor = "I")
	private int anInt2297;

	@OriginalMember(owner = "client!gl", name = "G", descriptor = "Lclient!wf;")
	private Class1_Sub2_Sub7_Sub2 aClass1_Sub2_Sub7_Sub2_1;

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "Lclient!cs;")
	private final Class42 aClass42_4 = new Class42();

	@OriginalMember(owner = "client!gl", name = "p", descriptor = "Lclient!cs;")
	private final Class42 aClass42_5 = new Class42();

	@OriginalMember(owner = "client!gl", name = "v", descriptor = "Lclient!cs;")
	private final Class42 aClass42_6 = new Class42();

	@OriginalMember(owner = "client!gl", name = "x", descriptor = "Lclient!cs;")
	private final Class42 aClass42_7 = new Class42();

	@OriginalMember(owner = "client!gl", name = "A", descriptor = "Lclient!lh;")
	private final Class1_Sub1 aClass1_Sub1_2 = new Class1_Sub1(4);

	@OriginalMember(owner = "client!gl", name = "D", descriptor = "I")
	public volatile int anInt2299 = 0;

	@OriginalMember(owner = "client!gl", name = "F", descriptor = "B")
	private byte aByte28 = 0;

	@OriginalMember(owner = "client!gl", name = "C", descriptor = "I")
	public volatile int anInt2298 = 0;

	@OriginalMember(owner = "client!gl", name = "E", descriptor = "Lclient!lh;")
	private final Class1_Sub1 aClass1_Sub1_3 = new Class1_Sub1(8);

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
	private void method1901() {
		if (this.aClass161_1 == null) {
			return;
		}
		try {
			this.aClass1_Sub1_2.anInt5056 = 0;
			this.aClass1_Sub1_2.method4115(6);
			this.aClass1_Sub1_2.method4119(3);
			this.aClass161_1.method3763(this.aClass1_Sub1_2.aByteArray66, 4);
		} catch (@Pc(37) IOException local37) {
			try {
				this.aClass161_1.method3764();
			} catch (@Pc(43) Exception local43) {
			}
			this.anInt2298 = -2;
			this.anInt2299++;
			this.aClass161_1 = null;
		}
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(I)Z")
	public boolean method1902() {
		return this.method1906() >= 20;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)Z")
	public boolean method1903() {
		return this.method1914() >= 20;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZILclient!mr;)V")
	public void method1905(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class161 arg1) {
		if (this.aClass161_1 != null) {
			try {
				this.aClass161_1.method3764();
			} catch (@Pc(14) Exception local14) {
			}
			this.aClass161_1 = null;
		}
		this.aClass161_1 = arg1;
		this.method1901();
		this.method1916(arg0);
		this.aClass1_Sub1_3.anInt5056 = 0;
		this.aClass1_Sub2_Sub7_Sub2_1 = null;
		while (true) {
			@Pc(48) Class1_Sub2_Sub7_Sub2 local48 = (Class1_Sub2_Sub7_Sub2) this.aClass42_5.method1067();
			if (local48 == null) {
				while (true) {
					local48 = (Class1_Sub2_Sub7_Sub2) this.aClass42_7.method1067();
					if (local48 == null) {
						if (this.aByte28 != 0) {
							try {
								this.aClass1_Sub1_2.anInt5056 = 0;
								this.aClass1_Sub1_2.method4115(4);
								this.aClass1_Sub1_2.method4115(this.aByte28);
								this.aClass1_Sub1_2.method4101(0);
								this.aClass161_1.method3763(this.aClass1_Sub1_2.aByteArray66, 4);
							} catch (@Pc(106) IOException local106) {
								try {
									this.aClass161_1.method3764();
								} catch (@Pc(112) Exception local112) {
								}
								this.anInt2299++;
								this.anInt2298 = -2;
								this.aClass161_1 = null;
							}
						}
						this.anInt2297 = 0;
						this.aLong72 = Static101.method1557();
						return;
					}
					this.aClass42_6.method1068(local48);
				}
			}
			this.aClass42_4.method1068(local48);
		}
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)I")
	private int method1906() {
		return this.aClass42_6.method1064() + this.aClass42_7.method1064();
	}

	@OriginalMember(owner = "client!gl", name = "d", descriptor = "(I)V")
	public void method1907() {
		try {
			this.aClass161_1.method3764();
		} catch (@Pc(5) Exception local5) {
		}
		this.aByte28 = (byte) (Math.random() * 255.0D + 1.0D);
		this.anInt2298 = -1;
		this.aClass161_1 = null;
		this.anInt2299++;
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIZB)Lclient!wf;")
	public Class1_Sub2_Sub7_Sub2 method1908(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) byte arg3) {
		@Pc(10) long local10 = (long) (arg1 + (arg0 << 16));
		@Pc(14) Class1_Sub2_Sub7_Sub2 local14 = new Class1_Sub2_Sub7_Sub2();
		local14.aByte103 = arg3;
		local14.aLong221 = local10;
		local14.aBoolean482 = arg2;
		if (arg2) {
			if (this.method1914() >= 20) {
				throw new RuntimeException();
			}
			this.aClass42_4.method1068(local14);
		} else if (this.method1906() < 20) {
			this.aClass42_6.method1068(local14);
		} else {
			throw new RuntimeException();
		}
		return local14;
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)V")
	public void method1910() {
		if (this.aClass161_1 == null) {
			return;
		}
		try {
			this.aClass1_Sub1_2.anInt5056 = 0;
			this.aClass1_Sub1_2.method4115(7);
			this.aClass1_Sub1_2.method4119(0);
			this.aClass161_1.method3763(this.aClass1_Sub1_2.aByteArray66, 4);
		} catch (@Pc(43) IOException local43) {
			try {
				this.aClass161_1.method3764();
			} catch (@Pc(49) Exception local49) {
			}
			this.aClass161_1 = null;
			this.anInt2299++;
			this.anInt2298 = -2;
		}
	}

	@OriginalMember(owner = "client!gl", name = "e", descriptor = "(I)V")
	public void method1911() {
		if (this.aClass161_1 != null) {
			this.aClass161_1.method3764();
		}
	}

	@OriginalMember(owner = "client!gl", name = "g", descriptor = "(I)Z")
	public boolean method1913() {
		@Pc(14) int local14;
		if (this.aClass161_1 != null) {
			@Pc(7) long local7 = Static101.method1557();
			local14 = (int) (local7 - this.aLong72);
			if (local14 > 200) {
				local14 = 200;
			}
			this.aLong72 = local7;
			this.anInt2297 += local14;
			if (this.anInt2297 > 30000) {
				try {
					this.aClass161_1.method3764();
				} catch (@Pc(40) Exception local40) {
				}
				this.aClass161_1 = null;
			}
		}
		if (this.aClass161_1 == null) {
			return this.method1914() == 0 && this.method1906() == 0;
		}
		try {
			this.aClass161_1.method3761();
			for (@Pc(84) Class1_Sub2_Sub7_Sub2 local84 = (Class1_Sub2_Sub7_Sub2) this.aClass42_4.method1061(); local84 != null; local84 = (Class1_Sub2_Sub7_Sub2) this.aClass42_4.method1063()) {
				this.aClass1_Sub1_2.anInt5056 = 0;
				this.aClass1_Sub1_2.method4115(1);
				this.aClass1_Sub1_2.method4119((int) local84.aLong221);
				this.aClass161_1.method3763(this.aClass1_Sub1_2.aByteArray66, 4);
				this.aClass42_5.method1068(local84);
			}
			for (@Pc(130) Class1_Sub2_Sub7_Sub2 local130 = (Class1_Sub2_Sub7_Sub2) this.aClass42_6.method1061(); local130 != null; local130 = (Class1_Sub2_Sub7_Sub2) this.aClass42_6.method1063()) {
				this.aClass1_Sub1_2.anInt5056 = 0;
				this.aClass1_Sub1_2.method4115(0);
				this.aClass1_Sub1_2.method4119((int) local130.aLong221);
				this.aClass161_1.method3763(this.aClass1_Sub1_2.aByteArray66, 4);
				this.aClass42_7.method1068(local130);
			}
			for (local14 = 0; local14 < 100; local14++) {
				@Pc(185) int local185 = this.aClass161_1.method3765();
				if (local185 < 0) {
					throw new IOException();
				}
				if (local185 == 0) {
					break;
				}
				this.anInt2297 = 0;
				@Pc(201) byte local201 = 0;
				if (this.aClass1_Sub2_Sub7_Sub2_1 == null) {
					local201 = 8;
				} else if (this.aClass1_Sub2_Sub7_Sub2_1.anInt7602 == 0) {
					local201 = 1;
				}
				@Pc(229) int local229;
				@Pc(250) int local250;
				@Pc(309) int local309;
				if (local201 > 0) {
					local229 = local201 - this.aClass1_Sub1_3.anInt5056;
					if (local185 < local229) {
						local229 = local185;
					}
					this.aClass161_1.method3769(local229, this.aClass1_Sub1_3.anInt5056, this.aClass1_Sub1_3.aByteArray66);
					if (this.aByte28 != 0) {
						for (local250 = 0; local250 < local229; local250++) {
							this.aClass1_Sub1_3.aByteArray66[local250 + this.aClass1_Sub1_3.anInt5056] ^= this.aByte28;
						}
					}
					this.aClass1_Sub1_3.anInt5056 += local229;
					if (local201 <= this.aClass1_Sub1_3.anInt5056) {
						if (this.aClass1_Sub2_Sub7_Sub2_1 == null) {
							this.aClass1_Sub1_3.anInt5056 = 0;
							local250 = this.aClass1_Sub1_3.method4130();
							local309 = this.aClass1_Sub1_3.method4093();
							@Pc(316) int local316 = this.aClass1_Sub1_3.method4130();
							@Pc(321) int local321 = this.aClass1_Sub1_3.method4087();
							@Pc(325) int local325 = local316 & 0x7F;
							@Pc(336) boolean local336 = (local316 & 0x80) != 0;
							@Pc(344) long local344 = (long) ((local250 << 16) + local309);
							@Pc(354) Class1_Sub2_Sub7_Sub2 local354;
							if (local336) {
								for (local354 = (Class1_Sub2_Sub7_Sub2) this.aClass42_7.method1061(); local354 != null && local344 != local354.aLong221; local354 = (Class1_Sub2_Sub7_Sub2) this.aClass42_7.method1063()) {
								}
							} else {
								for (local354 = (Class1_Sub2_Sub7_Sub2) this.aClass42_5.method1061(); local354 != null && local344 != local354.aLong221; local354 = (Class1_Sub2_Sub7_Sub2) this.aClass42_5.method1063()) {
								}
							}
							if (local354 == null) {
								throw new IOException();
							}
							this.aClass1_Sub2_Sub7_Sub2_1 = local354;
							@Pc(423) int local423 = local325 == 0 ? 5 : 9;
							this.aClass1_Sub2_Sub7_Sub2_1.aClass1_Sub1_8 = new Class1_Sub1(this.aClass1_Sub2_Sub7_Sub2_1.aByte103 + local423 + local321);
							this.aClass1_Sub2_Sub7_Sub2_1.aClass1_Sub1_8.method4115(local325);
							this.aClass1_Sub2_Sub7_Sub2_1.aClass1_Sub1_8.method4105(local321);
							this.aClass1_Sub2_Sub7_Sub2_1.anInt7602 = 8;
							this.aClass1_Sub1_3.anInt5056 = 0;
						} else if (this.aClass1_Sub2_Sub7_Sub2_1.anInt7602 != 0) {
							throw new IOException();
						} else if (this.aClass1_Sub1_3.aByteArray66[0] == -1) {
							this.aClass1_Sub1_3.anInt5056 = 0;
							this.aClass1_Sub2_Sub7_Sub2_1.anInt7602 = 1;
						} else {
							this.aClass1_Sub2_Sub7_Sub2_1 = null;
						}
					}
				} else {
					local229 = this.aClass1_Sub2_Sub7_Sub2_1.aClass1_Sub1_8.aByteArray66.length - this.aClass1_Sub2_Sub7_Sub2_1.aByte103;
					local250 = 512 - this.aClass1_Sub2_Sub7_Sub2_1.anInt7602;
					if (local229 - this.aClass1_Sub2_Sub7_Sub2_1.aClass1_Sub1_8.anInt5056 < local250) {
						local250 = local229 - this.aClass1_Sub2_Sub7_Sub2_1.aClass1_Sub1_8.anInt5056;
					}
					if (local250 > local185) {
						local250 = local185;
					}
					this.aClass161_1.method3769(local250, this.aClass1_Sub2_Sub7_Sub2_1.aClass1_Sub1_8.anInt5056, this.aClass1_Sub2_Sub7_Sub2_1.aClass1_Sub1_8.aByteArray66);
					if (this.aByte28 != 0) {
						for (local309 = 0; local309 < local250; local309++) {
							this.aClass1_Sub2_Sub7_Sub2_1.aClass1_Sub1_8.aByteArray66[this.aClass1_Sub2_Sub7_Sub2_1.aClass1_Sub1_8.anInt5056 + local309] ^= this.aByte28;
						}
					}
					this.aClass1_Sub2_Sub7_Sub2_1.anInt7602 += local250;
					this.aClass1_Sub2_Sub7_Sub2_1.aClass1_Sub1_8.anInt5056 += local250;
					if (local229 == this.aClass1_Sub2_Sub7_Sub2_1.aClass1_Sub1_8.anInt5056) {
						this.aClass1_Sub2_Sub7_Sub2_1.method5883();
						this.aClass1_Sub2_Sub7_Sub2_1.aBoolean481 = false;
						this.aClass1_Sub2_Sub7_Sub2_1 = null;
					} else if (this.aClass1_Sub2_Sub7_Sub2_1.anInt7602 == 512) {
						this.aClass1_Sub2_Sub7_Sub2_1.anInt7602 = 0;
					}
				}
			}
			return true;
		} catch (@Pc(645) IOException local645) {
			try {
				this.aClass161_1.method3764();
			} catch (@Pc(651) Exception local651) {
			}
			this.anInt2298 = -2;
			this.anInt2299++;
			this.aClass161_1 = null;
			return this.method1914() == 0 && this.method1906() == 0;
		}
	}

	@OriginalMember(owner = "client!gl", name = "b", descriptor = "(Z)I")
	public int method1914() {
		return this.aClass42_4.method1064() + this.aClass42_5.method1064();
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(B)V")
	public void method1915() {
		if (this.aClass161_1 != null) {
			this.aClass161_1.method3762();
		}
	}

	@OriginalMember(owner = "client!gl", name = "a", descriptor = "(ZB)V")
	public void method1916(@OriginalArg(0) boolean arg0) {
		if (this.aClass161_1 == null) {
			return;
		}
		try {
			this.aClass1_Sub1_2.anInt5056 = 0;
			this.aClass1_Sub1_2.method4115(arg0 ? 2 : 3);
			this.aClass1_Sub1_2.method4119(0);
			this.aClass161_1.method3763(this.aClass1_Sub1_2.aByteArray66, 4);
		} catch (@Pc(42) IOException local42) {
			try {
				this.aClass161_1.method3764();
			} catch (@Pc(50) Exception local50) {
			}
			this.aClass161_1 = null;
			this.anInt2299++;
			this.anInt2298 = -2;
		}
	}
}
