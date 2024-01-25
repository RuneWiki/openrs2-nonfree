import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public class Class14 {

	@OriginalMember(owner = "client!n", name = "g", descriptor = "Lclient!uh;")
	private Class1_Sub7 aClass1_Sub7_8;

	@OriginalMember(owner = "client!n", name = "m", descriptor = "[I")
	public int[] anIntArray682;

	@OriginalMember(owner = "client!n", name = "v", descriptor = "I")
	public int anInt5692;

	@OriginalMember(owner = "client!n", name = "y", descriptor = "I")
	private int anInt5694;

	@OriginalMember(owner = "client!n", name = "E", descriptor = "I")
	public int anInt5699;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "Z")
	private boolean aBoolean524 = false;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "I")
	private final int anInt5678 = 32;

	@OriginalMember(owner = "client!n", name = "e", descriptor = "J")
	private long aLong175 = Static378.method5293();

	@OriginalMember(owner = "client!n", name = "r", descriptor = "I")
	private int anInt5689 = 0;

	@OriginalMember(owner = "client!n", name = "s", descriptor = "I")
	private int anInt5690 = 0;

	@OriginalMember(owner = "client!n", name = "u", descriptor = "Z")
	private boolean aBoolean525 = true;

	@OriginalMember(owner = "client!n", name = "A", descriptor = "[Lclient!uh;")
	private final Class1_Sub7[] aClass1_Sub7Array5 = new Class1_Sub7[8];

	@OriginalMember(owner = "client!n", name = "w", descriptor = "J")
	private long aLong176 = 0L;

	@OriginalMember(owner = "client!n", name = "H", descriptor = "[Lclient!uh;")
	private final Class1_Sub7[] aClass1_Sub7Array6 = new Class1_Sub7[8];

	@OriginalMember(owner = "client!n", name = "G", descriptor = "I")
	private int anInt5700 = 0;

	@OriginalMember(owner = "client!n", name = "F", descriptor = "J")
	private long aLong177 = 0L;

	@OriginalMember(owner = "client!n", name = "x", descriptor = "I")
	private int anInt5693 = 0;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "()V")
	protected void method4886() throws Exception {
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "()V")
	protected void method4887() {
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	public final synchronized void method4888() {
		if (this.aBoolean524) {
			return;
		}
		@Pc(12) long local12 = Static378.method5293();
		try {
			if (this.aLong175 + 500000L < local12) {
				this.aLong175 = local12 - 500000L;
			}
			while (this.aLong175 + 5000L < local12) {
				this.method4899();
				this.aLong175 += 256000 / Static212.anInt3652;
			}
		} catch (@Pc(52) Exception local52) {
			this.aLong175 = local12;
		}
		if (this.anIntArray682 == null) {
			return;
		}
		try {
			if (this.aLong176 != 0L) {
				if (this.aLong176 > local12) {
					return;
				}
				this.method4895(this.anInt5692);
				this.aLong176 = 0L;
				this.aBoolean525 = true;
			}
			@Pc(85) int local85 = this.method4889();
			if (this.anInt5689 < this.anInt5693 - local85) {
				this.anInt5689 = this.anInt5693 - local85;
			}
			@Pc(110) int local110 = this.anInt5694 + this.anInt5699;
			if (local110 + 256 > 16384) {
				local110 = 16128;
			}
			if (local110 + 256 > this.anInt5692) {
				this.anInt5692 += 1024;
				if (this.anInt5692 > 16384) {
					this.anInt5692 = 16384;
				}
				this.method4887();
				this.method4895(this.anInt5692);
				local85 = 0;
				this.aBoolean525 = true;
				if (this.anInt5692 < local110 + 256) {
					local110 = this.anInt5692 - 256;
					this.anInt5694 = local110 - this.anInt5699;
				}
			}
			while (local110 > local85) {
				this.method4892(this.anIntArray682);
				this.method4886();
				local85 += 256;
			}
			if (this.aLong177 < local12) {
				if (this.aBoolean525) {
					this.aBoolean525 = false;
				} else if (this.anInt5689 == 0 && this.anInt5700 == 0) {
					this.method4887();
					this.aLong176 = local12 + 2000L;
					return;
				} else {
					this.anInt5694 = Math.min(this.anInt5700, this.anInt5689);
					this.anInt5700 = this.anInt5689;
				}
				this.aLong177 = local12 + 2000L;
				this.anInt5689 = 0;
			}
			this.anInt5693 = local85;
		} catch (@Pc(253) Exception local253) {
			this.method4887();
			this.aLong176 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "()I")
	protected int method4889() throws Exception {
		return this.anInt5692;
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "()V")
	protected void method4890() throws Exception {
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!uh;II)V")
	private void method4891(@OriginalArg(0) Class1_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class1_Sub7 local12 = this.aClass1_Sub7Array5[local7];
		if (local12 == null) {
			this.aClass1_Sub7Array6[local7] = arg0;
		} else {
			local12.aClass1_Sub7_7 = arg0;
		}
		this.aClass1_Sub7Array5[local7] = arg0;
		arg0.anInt5011 = arg1;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([II)V")
	private void method4892(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static250.aBoolean432) {
			local1 = 512;
		}
		Static404.method4343(arg0, 0, local1);
		this.anInt5690 -= 256;
		if (this.aClass1_Sub7_8 != null && this.anInt5690 <= 0) {
			this.anInt5690 += Static212.anInt3652 >> 4;
			Static3.method13(this.aClass1_Sub7_8);
			this.method4891(this.aClass1_Sub7_8, this.aClass1_Sub7_8.method4406());
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = 255;
			@Pc(49) int local49 = 7;
			@Pc(56) int local56;
			label103: while (local47 != 0) {
				@Pc(61) int local61;
				if (local49 < 0) {
					local56 = local49 & 0x3;
					local61 = -(local49 >> 2);
				} else {
					local56 = local49;
					local61 = 0;
				}
				for (@Pc(72) int local72 = local47 >>> local56 & 0x11111111; local72 != 0; local72 >>>= 0x4) {
					if ((local72 & 0x1) != 0) {
						local47 &= ~(0x1 << local56);
						@Pc(88) Class1_Sub7 local88 = null;
						@Pc(93) Class1_Sub7 local93 = this.aClass1_Sub7Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub31 local97 = local93.aClass1_Sub31_5;
								if (local97 == null || local97.anInt5824 <= local61) {
									local93.aBoolean477 = true;
									@Pc(121) int local121 = local93.method4409();
									local45 += local121;
									if (local97 != null) {
										local97.anInt5824 += local121;
									}
									if (local45 >= this.anInt5678) {
										break label103;
									}
									@Pc(140) Class1_Sub7 local140 = local93.method4407();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt5011;
										while (local140 != null) {
											this.method4891(local140, local145 * local140.method4406() >> 8);
											local140 = local93.method4408();
										}
									}
									@Pc(164) Class1_Sub7 local164 = local93.aClass1_Sub7_7;
									local93.aClass1_Sub7_7 = null;
									if (local88 == null) {
										this.aClass1_Sub7Array6[local56] = local164;
									} else {
										local88.aClass1_Sub7_7 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub7Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub7_7;
								}
							}
						}
					}
					local56 += 4;
					local61++;
				}
				local49--;
			}
			for (local56 = 0; local56 < 8; local56++) {
				@Pc(207) Class1_Sub7 local207 = this.aClass1_Sub7Array6[local56];
				this.aClass1_Sub7Array6[local56] = this.aClass1_Sub7Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub7 local221 = local207.aClass1_Sub7_7;
					local207.aClass1_Sub7_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt5690 < 0) {
			this.anInt5690 = 0;
		}
		if (this.aClass1_Sub7_8 != null) {
			this.aClass1_Sub7_8.method4404(arg0, 0, 256);
		}
		this.aLong175 = Static378.method5293();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
	public final synchronized void method4893() {
		if (Static10.aClass209_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static10.aClass209_1.aClass14Array1[local7] == this) {
					Static10.aClass209_1.aClass14Array1[local7] = null;
				}
				if (Static10.aClass209_1.aClass14Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static10.aClass209_1.aBoolean511 = true;
				while (Static10.aClass209_1.aBoolean512) {
					Static57.method5056(50L);
				}
				Static10.aClass209_1 = null;
			}
		}
		this.method4887();
		this.aBoolean524 = true;
		this.anIntArray682 = null;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!uh;I)V")
	public final synchronized void method4894(@OriginalArg(0) Class1_Sub7 arg0) {
		this.aClass1_Sub7_8 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
	public void method4895(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
	public final void method4896() {
		this.aBoolean525 = true;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V")
	public final synchronized void method4897() {
		this.aBoolean525 = true;
		try {
			this.method4890();
		} catch (@Pc(10) Exception local10) {
			this.method4887();
			this.aLong176 = Static378.method5293() + 2000L;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
	private void method4899() {
		this.anInt5690 -= 256;
		if (this.anInt5690 < 0) {
			this.anInt5690 = 0;
		}
		if (this.aClass1_Sub7_8 != null) {
			this.aClass1_Sub7_8.method4405(256);
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method4902(@OriginalArg(0) Component arg0) throws Exception {
	}
}
