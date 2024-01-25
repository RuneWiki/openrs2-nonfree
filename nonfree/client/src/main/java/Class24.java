import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dc")
public class Class24 {

	@OriginalMember(owner = "client!dc", name = "e", descriptor = "Lclient!ega;")
	private Class3_Sub14 aClass3_Sub14_3;

	@OriginalMember(owner = "client!dc", name = "j", descriptor = "[I")
	public int[] anIntArray66;

	@OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
	private int anInt1062;

	@OriginalMember(owner = "client!dc", name = "C", descriptor = "I")
	public int anInt1067;

	@OriginalMember(owner = "client!dc", name = "F", descriptor = "I")
	public int anInt1069;

	@OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
	private final int anInt1058 = 32;

	@OriginalMember(owner = "client!dc", name = "q", descriptor = "Z")
	private boolean aBoolean81 = false;

	@OriginalMember(owner = "client!dc", name = "t", descriptor = "J")
	private long aLong43 = Static376.method6088();

	@OriginalMember(owner = "client!dc", name = "x", descriptor = "J")
	private long aLong45 = 0L;

	@OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
	private int anInt1063 = 0;

	@OriginalMember(owner = "client!dc", name = "v", descriptor = "J")
	private long aLong44 = 0L;

	@OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
	private int anInt1064 = 0;

	@OriginalMember(owner = "client!dc", name = "B", descriptor = "I")
	private int anInt1066 = 0;

	@OriginalMember(owner = "client!dc", name = "D", descriptor = "[Lclient!ega;")
	private final Class3_Sub14[] aClass3_Sub14Array6 = new Class3_Sub14[8];

	@OriginalMember(owner = "client!dc", name = "u", descriptor = "[Lclient!ega;")
	private final Class3_Sub14[] aClass3_Sub14Array5 = new Class3_Sub14[8];

	@OriginalMember(owner = "client!dc", name = "G", descriptor = "Z")
	private boolean aBoolean82 = true;

	@OriginalMember(owner = "client!dc", name = "A", descriptor = "I")
	private int anInt1065 = 0;

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
	public final synchronized void method1125() {
		if (Static547.aClass250_1 != null) {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < 2; local5++) {
				if (Static547.aClass250_1.aClass24Array1[local5] == this) {
					Static547.aClass250_1.aClass24Array1[local5] = null;
				}
				if (Static547.aClass250_1.aClass24Array1[local5] != null) {
					local3 = false;
				}
			}
			if (local3) {
				Static547.aClass250_1.aBoolean637 = true;
				while (Static547.aClass250_1.aBoolean636) {
					Static1.method125(50L);
				}
				Static547.aClass250_1 = null;
			}
		}
		this.method1129();
		this.anIntArray66 = null;
		this.aBoolean81 = true;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(BLclient!ega;)V")
	public final synchronized void method1126(@OriginalArg(1) Class3_Sub14 arg0) {
		this.aClass3_Sub14_3 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
	public void method1127(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "([II)V")
	private void method1128(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static124.aBoolean223) {
			local1 = 512;
		}
		Static602.method4667(arg0, 0, local1);
		this.anInt1064 -= 256;
		if (this.aClass3_Sub14_3 != null && this.anInt1064 <= 0) {
			this.anInt1064 += Static149.anInt2863 >> 4;
			Static380.method6128(this.aClass3_Sub14_3);
			this.method1132(this.aClass3_Sub14_3.method7818(), this.aClass3_Sub14_3);
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
						@Pc(88) Class3_Sub14 local88 = null;
						@Pc(93) Class3_Sub14 local93 = this.aClass3_Sub14Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class3_Sub6 local97 = local93.aClass3_Sub6_5;
								if (local97 == null || local97.anInt1101 <= local61) {
									local93.aBoolean807 = true;
									@Pc(121) int local121 = local93.method7820();
									local45 += local121;
									if (local97 != null) {
										local97.anInt1101 += local121;
									}
									if (local45 >= this.anInt1058) {
										break label103;
									}
									@Pc(140) Class3_Sub14 local140 = local93.method7822();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt9630;
										while (local140 != null) {
											this.method1132(local145 * local140.method7818() >> 8, local140);
											local140 = local93.method7819();
										}
									}
									@Pc(164) Class3_Sub14 local164 = local93.aClass3_Sub14_8;
									local93.aClass3_Sub14_8 = null;
									if (local88 == null) {
										this.aClass3_Sub14Array6[local56] = local164;
									} else {
										local88.aClass3_Sub14_8 = local164;
									}
									if (local164 == null) {
										this.aClass3_Sub14Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass3_Sub14_8;
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
				@Pc(207) Class3_Sub14 local207 = this.aClass3_Sub14Array6[local56];
				this.aClass3_Sub14Array6[local56] = this.aClass3_Sub14Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class3_Sub14 local221 = local207.aClass3_Sub14_8;
					local207.aClass3_Sub14_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt1064 < 0) {
			this.anInt1064 = 0;
		}
		if (this.aClass3_Sub14_3 != null) {
			this.aClass3_Sub14_3.method7823(arg0, 0, 256);
		}
		this.aLong43 = Static376.method6088();
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "()V")
	protected void method1129() {
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "()I")
	protected int method1130() throws Exception {
		return this.anInt1067;
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1131(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IILclient!ega;)V")
	private void method1132(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub14 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class3_Sub14 local12 = this.aClass3_Sub14Array5[local7];
		if (local12 == null) {
			this.aClass3_Sub14Array6[local7] = arg1;
		} else {
			local12.aClass3_Sub14_8 = arg1;
		}
		this.aClass3_Sub14Array5[local7] = arg1;
		arg1.anInt9630 = arg0;
	}

	@OriginalMember(owner = "client!dc", name = "c", descriptor = "()V")
	protected void method1133() throws Exception {
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)V")
	private void method1135() {
		this.anInt1064 -= 256;
		if (this.anInt1064 < 0) {
			this.anInt1064 = 0;
		}
		if (this.aClass3_Sub14_3 != null) {
			this.aClass3_Sub14_3.method7821(256);
		}
	}

	@OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
	public final synchronized void method1136() {
		this.aBoolean82 = true;
		try {
			this.method1141();
		} catch (@Pc(10) Exception local10) {
			this.method1129();
			this.aLong44 = Static376.method6088() + 2000L;
		}
	}

	@OriginalMember(owner = "client!dc", name = "b", descriptor = "(B)V")
	public final synchronized void method1139() {
		if (this.aBoolean81) {
			return;
		}
		@Pc(10) long local10 = Static376.method6088();
		try {
			if (local10 > this.aLong43 + 500000L) {
				this.aLong43 = local10 - 500000L;
			}
			while (this.aLong43 + 5000L < local10) {
				this.method1135();
				this.aLong43 += 256000 / Static149.anInt2863;
			}
		} catch (@Pc(45) Exception local45) {
			this.aLong43 = local10;
		}
		if (this.anIntArray66 == null) {
			return;
		}
		try {
			if (this.aLong44 != 0L) {
				if (local10 < this.aLong44) {
					return;
				}
				this.method1127(this.anInt1067);
				this.aLong44 = 0L;
				this.aBoolean82 = true;
			}
			@Pc(86) int local86 = this.method1130();
			if (this.anInt1065 < this.anInt1063 - local86) {
				this.anInt1065 = this.anInt1063 - local86;
			}
			@Pc(107) int local107 = this.anInt1069 + this.anInt1062;
			if (local107 + 256 > 16384) {
				local107 = 16128;
			}
			if (local107 + 256 > this.anInt1067) {
				this.anInt1067 += 1024;
				if (this.anInt1067 > 16384) {
					this.anInt1067 = 16384;
				}
				this.method1129();
				this.method1127(this.anInt1067);
				local86 = 0;
				if (this.anInt1067 < local107 + 256) {
					local107 = this.anInt1067 - 256;
					this.anInt1062 = local107 - this.anInt1069;
				}
				this.aBoolean82 = true;
			}
			while (local86 < local107) {
				this.method1128(this.anIntArray66);
				this.method1133();
				local86 += 256;
			}
			if (this.aLong45 < local10) {
				if (this.aBoolean82) {
					this.aBoolean82 = false;
				} else if (this.anInt1065 == 0 && this.anInt1066 == 0) {
					this.method1129();
					this.aLong44 = local10 + 2000L;
					return;
				} else {
					this.anInt1062 = Math.min(this.anInt1066, this.anInt1065);
					this.anInt1066 = this.anInt1065;
				}
				this.anInt1065 = 0;
				this.aLong45 = local10 + 2000L;
			}
			this.anInt1063 = local86;
		} catch (@Pc(228) Exception local228) {
			this.method1129();
			this.aLong44 = local10 + 2000L;
		}
	}

	@OriginalMember(owner = "client!dc", name = "d", descriptor = "()V")
	protected void method1141() throws Exception {
	}
}
