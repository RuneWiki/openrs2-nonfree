import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kf")
public class Class22 {

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "[I")
	public int[] anIntArray210;

	@OriginalMember(owner = "client!kf", name = "m", descriptor = "Lclient!wc;")
	private Class2_Sub16 aClass2_Sub16_3;

	@OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
	public int anInt1584;

	@OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
	public int anInt1586;

	@OriginalMember(owner = "client!kf", name = "K", descriptor = "I")
	private int anInt1589;

	@OriginalMember(owner = "client!kf", name = "h", descriptor = "I")
	private final int anInt1569 = 32;

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "J")
	private long aLong62 = Static10.method244();

	@OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
	private int anInt1582 = 0;

	@OriginalMember(owner = "client!kf", name = "z", descriptor = "J")
	private long aLong63 = 0L;

	@OriginalMember(owner = "client!kf", name = "F", descriptor = "Z")
	private boolean aBoolean61 = true;

	@OriginalMember(owner = "client!kf", name = "B", descriptor = "J")
	private long aLong64 = 0L;

	@OriginalMember(owner = "client!kf", name = "y", descriptor = "[Lclient!wc;")
	private final Class2_Sub16[] aClass2_Sub16Array5 = new Class2_Sub16[8];

	@OriginalMember(owner = "client!kf", name = "I", descriptor = "I")
	private int anInt1588 = 0;

	@OriginalMember(owner = "client!kf", name = "J", descriptor = "[Lclient!wc;")
	private final Class2_Sub16[] aClass2_Sub16Array6 = new Class2_Sub16[8];

	@OriginalMember(owner = "client!kf", name = "N", descriptor = "I")
	private int anInt1592 = 0;

	@OriginalMember(owner = "client!kf", name = "M", descriptor = "I")
	private int anInt1591 = 0;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V")
	public final synchronized void method1080() {
		this.aBoolean61 = true;
		try {
			this.method1094();
		} catch (@Pc(10) Exception local10) {
			this.method1090();
			this.aLong64 = Static10.method244() + 2000L;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)V")
	private void method1081() {
		this.anInt1591 -= 256;
		if (this.anInt1591 < 0) {
			this.anInt1591 = 0;
		}
		if (this.aClass2_Sub16_3 != null) {
			this.aClass2_Sub16_3.method1916(256);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)V")
	public final void method1082() {
		this.aBoolean61 = true;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "()V")
	protected void method1084() throws Exception {
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(I)V")
	public void method1085(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(B)V")
	public final synchronized void method1086() {
		if (Static18.aClass30_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static18.aClass30_1.aClass22Array1[local11] == this) {
					Static18.aClass30_1.aClass22Array1[local11] = null;
				}
				if (Static18.aClass30_1.aClass22Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static18.aClass30_1.aBoolean35 = true;
				while (Static18.aClass30_1.aBoolean36) {
					Static80.method1260(50L);
				}
				Static18.aClass30_1 = null;
			}
		}
		this.method1090();
		this.anIntArray210 = null;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "(Z)V")
	public final synchronized void method1087() {
		if (this.anIntArray210 == null) {
			return;
		}
		@Pc(12) long local12 = Static10.method244();
		try {
			if (this.aLong64 != 0L) {
				if (this.aLong64 > local12) {
					return;
				}
				this.method1085(this.anInt1584);
				this.aBoolean61 = true;
				this.aLong64 = 0L;
			}
			@Pc(41) int local41 = this.method1089();
			if (this.anInt1592 - local41 > this.anInt1588) {
				this.anInt1588 = this.anInt1592 - local41;
			}
			@Pc(66) int local66 = this.anInt1589 + this.anInt1586;
			if (local66 + 256 > 16384) {
				local66 = 16128;
			}
			if (local66 + 256 > this.anInt1584) {
				this.anInt1584 += 1024;
				if (this.anInt1584 > 16384) {
					this.anInt1584 = 16384;
				}
				this.method1090();
				local41 = 0;
				this.method1085(this.anInt1584);
				if (this.anInt1584 < local66 + 256) {
					local66 = this.anInt1584 - 256;
					this.anInt1589 = local66 - this.anInt1586;
				}
				this.aBoolean61 = true;
			}
			while (local66 > local41) {
				this.method1092(this.anIntArray210);
				this.method1084();
				local41 += 256;
			}
			if (this.aLong63 < local12) {
				if (this.aBoolean61) {
					this.aBoolean61 = false;
				} else if (this.anInt1588 == 0 && this.anInt1582 == 0) {
					this.method1090();
					this.aLong64 = local12 + 2000L;
					return;
				} else {
					this.anInt1589 = Math.min(this.anInt1582, this.anInt1588);
					this.anInt1582 = this.anInt1588;
				}
				this.anInt1588 = 0;
				this.aLong63 = local12 + 2000L;
			}
			this.anInt1592 = local41;
		} catch (@Pc(200) Exception local200) {
			this.method1090();
			this.aLong64 = local12 + 2000L;
		}
		try {
			if (local12 > this.aLong62 + 500000L) {
				local12 = this.aLong62;
			}
			while (local12 > this.aLong62 + 5000L) {
				this.method1081();
				this.aLong62 += 256000 / Static119.anInt2551;
			}
		} catch (@Pc(245) Exception local245) {
			this.aLong62 = local12;
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!wc;)V")
	public final synchronized void method1088(@OriginalArg(1) Class2_Sub16 arg0) {
		this.aClass2_Sub16_3 = arg0;
	}

	@OriginalMember(owner = "client!kf", name = "b", descriptor = "()I")
	protected int method1089() throws Exception {
		return this.anInt1584;
	}

	@OriginalMember(owner = "client!kf", name = "c", descriptor = "()V")
	protected void method1090() {
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!wc;B)V")
	private void method1091(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub16 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class2_Sub16 local12 = this.aClass2_Sub16Array6[local7];
		if (local12 == null) {
			this.aClass2_Sub16Array5[local7] = arg1;
		} else {
			local12.aClass2_Sub16_8 = arg1;
		}
		this.aClass2_Sub16Array6[local7] = arg1;
		arg1.anInt2848 = arg0;
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([II)V")
	private void method1092(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static106.aBoolean99) {
			local1 = 512;
		}
		Static133.method957(arg0, 0, local1);
		this.anInt1591 -= 256;
		if (this.aClass2_Sub16_3 != null && this.anInt1591 <= 0) {
			this.anInt1591 += Static119.anInt2551 >> 4;
			Static128.method1938(this.aClass2_Sub16_3);
			this.method1091(this.aClass2_Sub16_3.method1910(), this.aClass2_Sub16_3);
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
						@Pc(88) Class2_Sub16 local88 = null;
						@Pc(93) Class2_Sub16 local93 = this.aClass2_Sub16Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub14 local97 = local93.aClass2_Sub14_5;
								if (local97 == null || local97.anInt1407 <= local61) {
									local93.aBoolean131 = true;
									@Pc(121) int local121 = local93.method1914();
									local45 += local121;
									if (local97 != null) {
										local97.anInt1407 += local121;
									}
									if (local45 >= this.anInt1569) {
										break label103;
									}
									@Pc(140) Class2_Sub16 local140 = local93.method1912();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt2848;
										while (local140 != null) {
											this.method1091(local145 * local140.method1910() >> 8, local140);
											local140 = local93.method1911();
										}
									}
									@Pc(164) Class2_Sub16 local164 = local93.aClass2_Sub16_8;
									local93.aClass2_Sub16_8 = null;
									if (local88 == null) {
										this.aClass2_Sub16Array5[local56] = local164;
									} else {
										local88.aClass2_Sub16_8 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub16Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub16_8;
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
				@Pc(207) Class2_Sub16 local207 = this.aClass2_Sub16Array5[local56];
				this.aClass2_Sub16Array5[local56] = this.aClass2_Sub16Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub16 local221 = local207.aClass2_Sub16_8;
					local207.aClass2_Sub16_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt1591 < 0) {
			this.anInt1591 = 0;
		}
		if (this.aClass2_Sub16_3 != null) {
			this.aClass2_Sub16_3.method1913(arg0, 0, 256);
		}
		this.aLong62 = Static10.method244();
	}

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "()V")
	protected void method1094() throws Exception {
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1096(@OriginalArg(0) Component arg0) throws Exception {
	}
}
