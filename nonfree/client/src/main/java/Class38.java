import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eq")
public class Class38 {

	@OriginalMember(owner = "client!eq", name = "i", descriptor = "[I")
	public int[] anIntArray141;

	@OriginalMember(owner = "client!eq", name = "p", descriptor = "Lclient!oo;")
	private Class2_Sub1 aClass2_Sub1_6;

	@OriginalMember(owner = "client!eq", name = "z", descriptor = "I")
	public int anInt1836;

	@OriginalMember(owner = "client!eq", name = "C", descriptor = "I")
	private int anInt1838;

	@OriginalMember(owner = "client!eq", name = "J", descriptor = "I")
	public int anInt1841;

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "Z")
	private boolean aBoolean128 = false;

	@OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
	private final int anInt1826 = 32;

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "J")
	private long aLong56 = Static110.method1702();

	@OriginalMember(owner = "client!eq", name = "t", descriptor = "Z")
	private boolean aBoolean129 = true;

	@OriginalMember(owner = "client!eq", name = "v", descriptor = "I")
	private int anInt1833 = 0;

	@OriginalMember(owner = "client!eq", name = "y", descriptor = "[Lclient!oo;")
	private final Class2_Sub1[] aClass2_Sub1Array5 = new Class2_Sub1[8];

	@OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
	private int anInt1832 = 0;

	@OriginalMember(owner = "client!eq", name = "r", descriptor = "J")
	private long aLong57 = 0L;

	@OriginalMember(owner = "client!eq", name = "E", descriptor = "I")
	private int anInt1839 = 0;

	@OriginalMember(owner = "client!eq", name = "H", descriptor = "J")
	private long aLong58 = 0L;

	@OriginalMember(owner = "client!eq", name = "D", descriptor = "[Lclient!oo;")
	private final Class2_Sub1[] aClass2_Sub1Array6 = new Class2_Sub1[8];

	@OriginalMember(owner = "client!eq", name = "G", descriptor = "I")
	private int anInt1840 = 0;

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
	public final synchronized void method1479() {
		this.aBoolean129 = true;
		try {
			this.method1491();
		} catch (@Pc(17) Exception local17) {
			this.method1482();
			this.aLong57 = Static110.method1702() + 2000L;
		}
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)V")
	public final synchronized void method1480() {
		if (this.aBoolean128) {
			return;
		}
		@Pc(12) long local12 = Static110.method1702();
		try {
			if (this.aLong56 + 500000L < local12) {
				this.aLong56 = local12 - 500000L;
			}
			while (local12 > this.aLong56 + 5000L) {
				this.method1492();
				this.aLong56 += 256000 / Static333.anInt5628;
			}
		} catch (@Pc(48) Exception local48) {
			this.aLong56 = local12;
		}
		if (this.anIntArray141 == null) {
			return;
		}
		try {
			if (this.aLong57 != 0L) {
				if (local12 < this.aLong57) {
					return;
				}
				this.method1488(this.anInt1836);
				this.aBoolean129 = true;
				this.aLong57 = 0L;
			}
			@Pc(85) int local85 = this.method1489();
			if (this.anInt1832 - local85 > this.anInt1840) {
				this.anInt1840 = this.anInt1832 - local85;
			}
			@Pc(106) int local106 = this.anInt1841 + this.anInt1838;
			if (local106 + 256 > 16384) {
				local106 = 16128;
			}
			if (this.anInt1836 < local106 + 256) {
				this.anInt1836 += 1024;
				if (this.anInt1836 > 16384) {
					this.anInt1836 = 16384;
				}
				this.method1482();
				local85 = 0;
				this.method1488(this.anInt1836);
				if (local106 + 256 > this.anInt1836) {
					local106 = this.anInt1836 - 256;
					this.anInt1838 = local106 - this.anInt1841;
				}
				this.aBoolean129 = true;
			}
			while (local85 < local106) {
				this.method1486(this.anIntArray141);
				this.method1493();
				local85 += 256;
			}
			if (this.aLong58 < local12) {
				if (this.aBoolean129) {
					this.aBoolean129 = false;
				} else if (this.anInt1840 == 0 && this.anInt1833 == 0) {
					this.method1482();
					this.aLong57 = local12 + 2000L;
					return;
				} else {
					this.anInt1838 = Math.min(this.anInt1833, this.anInt1840);
					this.anInt1833 = this.anInt1840;
				}
				this.aLong58 = local12 + 2000L;
				this.anInt1840 = 0;
			}
			this.anInt1832 = local85;
		} catch (@Pc(236) Exception local236) {
			this.method1482();
			this.aLong57 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "()V")
	protected void method1482() {
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1483(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "(I)V")
	public final synchronized void method1484() {
		if (Static292.aClass5_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static292.aClass5_1.aClass38Array1[local7] == this) {
					Static292.aClass5_1.aClass38Array1[local7] = null;
				}
				if (Static292.aClass5_1.aClass38Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static292.aClass5_1.aBoolean11 = true;
				while (Static292.aClass5_1.aBoolean12) {
					Static429.method5376(50L);
				}
				Static292.aClass5_1 = null;
			}
		}
		this.method1482();
		this.anIntArray141 = null;
		this.aBoolean128 = true;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILclient!oo;I)V")
	private void method1485(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub1 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class2_Sub1 local12 = this.aClass2_Sub1Array5[local7];
		if (local12 == null) {
			this.aClass2_Sub1Array6[local7] = arg1;
		} else {
			local12.aClass2_Sub1_8 = arg1;
		}
		this.aClass2_Sub1Array5[local7] = arg1;
		arg1.anInt4083 = arg0;
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "([II)V")
	private void method1486(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static257.aBoolean291) {
			local1 = 512;
		}
		Static464.method1967(arg0, 0, local1);
		this.anInt1839 -= 256;
		if (this.aClass2_Sub1_6 != null && this.anInt1839 <= 0) {
			this.anInt1839 += Static333.anInt5628 >> 4;
			Static313.method4284(this.aClass2_Sub1_6);
			this.method1485(this.aClass2_Sub1_6.method3225(), this.aClass2_Sub1_6);
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
						@Pc(88) Class2_Sub1 local88 = null;
						@Pc(93) Class2_Sub1 local93 = this.aClass2_Sub1Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub22 local97 = local93.aClass2_Sub22_5;
								if (local97 == null || local97.anInt2620 <= local61) {
									local93.aBoolean288 = true;
									@Pc(121) int local121 = local93.method3223();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2620 += local121;
									}
									if (local45 >= this.anInt1826) {
										break label103;
									}
									@Pc(140) Class2_Sub1 local140 = local93.method3224();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt4083;
										while (local140 != null) {
											this.method1485(local145 * local140.method3225() >> 8, local140);
											local140 = local93.method3226();
										}
									}
									@Pc(164) Class2_Sub1 local164 = local93.aClass2_Sub1_8;
									local93.aClass2_Sub1_8 = null;
									if (local88 == null) {
										this.aClass2_Sub1Array6[local56] = local164;
									} else {
										local88.aClass2_Sub1_8 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub1Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub1_8;
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
				@Pc(207) Class2_Sub1 local207 = this.aClass2_Sub1Array6[local56];
				this.aClass2_Sub1Array6[local56] = this.aClass2_Sub1Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub1 local221 = local207.aClass2_Sub1_8;
					local207.aClass2_Sub1_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt1839 < 0) {
			this.anInt1839 = 0;
		}
		if (this.aClass2_Sub1_6 != null) {
			this.aClass2_Sub1_6.method3229(arg0, 0, 256);
		}
		this.aLong56 = Static110.method1702();
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lclient!oo;B)V")
	public final synchronized void method1487(@OriginalArg(0) Class2_Sub1 arg0) {
		this.aClass2_Sub1_6 = arg0;
	}

	@OriginalMember(owner = "client!eq", name = "e", descriptor = "(I)V")
	public void method1488(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!eq", name = "b", descriptor = "()I")
	protected int method1489() throws Exception {
		return this.anInt1836;
	}

	@OriginalMember(owner = "client!eq", name = "f", descriptor = "(I)V")
	public final void method1490() {
		this.aBoolean129 = true;
	}

	@OriginalMember(owner = "client!eq", name = "c", descriptor = "()V")
	protected void method1491() throws Exception {
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(IB)V")
	private void method1492() {
		this.anInt1839 -= 256;
		if (this.anInt1839 < 0) {
			this.anInt1839 = 0;
		}
		if (this.aClass2_Sub1_6 != null) {
			this.aClass2_Sub1_6.method3228(256);
		}
	}

	@OriginalMember(owner = "client!eq", name = "d", descriptor = "()V")
	protected void method1493() throws Exception {
	}
}
