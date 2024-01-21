import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public class Class3 {

	@OriginalMember(owner = "client!n", name = "q", descriptor = "Lclient!af;")
	private Class2_Sub2 aClass2_Sub2_3;

	@OriginalMember(owner = "client!n", name = "t", descriptor = "[I")
	public int[] anIntArray14;

	@OriginalMember(owner = "client!n", name = "z", descriptor = "I")
	public int anInt159;

	@OriginalMember(owner = "client!n", name = "B", descriptor = "I")
	private int anInt161;

	@OriginalMember(owner = "client!n", name = "L", descriptor = "I")
	public int anInt166;

	@OriginalMember(owner = "client!n", name = "u", descriptor = "I")
	private final int anInt155 = 32;

	@OriginalMember(owner = "client!n", name = "r", descriptor = "J")
	private long aLong10 = Static104.method1634();

	@OriginalMember(owner = "client!n", name = "A", descriptor = "I")
	private int anInt160 = 0;

	@OriginalMember(owner = "client!n", name = "D", descriptor = "J")
	private long aLong11 = 0L;

	@OriginalMember(owner = "client!n", name = "H", descriptor = "[Lclient!af;")
	private final Class2_Sub2[] aClass2_Sub2Array5 = new Class2_Sub2[8];

	@OriginalMember(owner = "client!n", name = "E", descriptor = "I")
	private int anInt163 = 0;

	@OriginalMember(owner = "client!n", name = "G", descriptor = "Z")
	private boolean aBoolean10 = true;

	@OriginalMember(owner = "client!n", name = "F", descriptor = "I")
	private int anInt164 = 0;

	@OriginalMember(owner = "client!n", name = "I", descriptor = "I")
	private int anInt165 = 0;

	@OriginalMember(owner = "client!n", name = "J", descriptor = "[Lclient!af;")
	private final Class2_Sub2[] aClass2_Sub2Array6 = new Class2_Sub2[8];

	@OriginalMember(owner = "client!n", name = "K", descriptor = "J")
	private long aLong12 = 0L;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Lclient!af;B)V")
	public final synchronized void method96(@OriginalArg(0) Class2_Sub2 arg0) {
		this.aClass2_Sub2_3 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
	public final void method97() {
		this.aBoolean10 = true;
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
	public void method98(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "()V")
	protected void method99() {
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
	private void method100() {
		this.anInt164 -= 256;
		if (this.anInt164 < 0) {
			this.anInt164 = 0;
		}
		if (this.aClass2_Sub2_3 != null) {
			this.aClass2_Sub2_3.method2850(256);
		}
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
	public final synchronized void method101() {
		if (Static134.aClass89_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static134.aClass89_1.aClass3Array1[local7] == this) {
					Static134.aClass89_1.aClass3Array1[local7] = null;
				}
				if (Static134.aClass89_1.aClass3Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static134.aClass89_1.aBoolean159 = true;
				while (Static134.aClass89_1.aBoolean160) {
					Static117.method1813(50L);
				}
				Static134.aClass89_1 = null;
			}
		}
		this.method99();
		this.anIntArray14 = null;
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
	public final synchronized void method102() {
		if (this.anIntArray14 == null) {
			return;
		}
		@Pc(12) long local12 = Static104.method1634();
		try {
			if (this.aLong12 != 0L) {
				if (local12 < this.aLong12) {
					return;
				}
				this.method98(this.anInt166);
				this.aLong12 = 0L;
				this.aBoolean10 = true;
			}
			@Pc(42) int local42 = this.method111();
			if (this.anInt165 < this.anInt160 - local42) {
				this.anInt165 = this.anInt160 - local42;
			}
			@Pc(68) int local68 = this.anInt159 + this.anInt161;
			if (local68 + 256 > 16384) {
				local68 = 16128;
			}
			if (this.anInt166 < local68 + 256) {
				local42 = 0;
				this.anInt166 += 1024;
				if (this.anInt166 > 16384) {
					this.anInt166 = 16384;
				}
				this.method99();
				this.method98(this.anInt166);
				if (local68 + 256 > this.anInt166) {
					local68 = this.anInt166 - 256;
					this.anInt161 = local68 - this.anInt159;
				}
				this.aBoolean10 = true;
			}
			while (local42 < local68) {
				this.method107(this.anIntArray14);
				local42 += 256;
				this.method104();
			}
			if (local12 > this.aLong11) {
				if (this.aBoolean10) {
					this.aBoolean10 = false;
				} else if (this.anInt165 == 0 && this.anInt163 == 0) {
					this.method99();
					this.aLong12 = local12 + 2000L;
					return;
				} else {
					this.anInt161 = Math.min(this.anInt163, this.anInt165);
					this.anInt163 = this.anInt165;
				}
				this.aLong11 = local12 + 2000L;
				this.anInt165 = 0;
			}
			this.anInt160 = local42;
		} catch (@Pc(196) Exception local196) {
			this.method99();
			this.aLong12 = local12 + 2000L;
		}
		try {
			if (local12 > this.aLong10 + 500000L) {
				local12 = this.aLong10;
			}
			while (local12 > this.aLong10 + 5000L) {
				this.method100();
				this.aLong10 += 256000 / Static88.anInt1852;
			}
		} catch (@Pc(241) Exception local241) {
			this.aLong10 = local12;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method103(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!n", name = "b", descriptor = "()V")
	protected void method104() throws Exception {
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
	public final synchronized void method105() {
		this.aBoolean10 = true;
		try {
			this.method109();
		} catch (@Pc(12) Exception local12) {
			this.method99();
			this.aLong12 = Static104.method1634() + 2000L;
		}
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "([II)V")
	private void method107(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static29.aBoolean31) {
			local1 = 512;
		}
		Static220.method1005(arg0, 0, local1);
		this.anInt164 -= 256;
		if (this.aClass2_Sub2_3 != null && this.anInt164 <= 0) {
			this.anInt164 += Static88.anInt1852 >> 4;
			Static77.method2466(this.aClass2_Sub2_3);
			this.method108(this.aClass2_Sub2_3.method2852(), this.aClass2_Sub2_3);
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
						@Pc(88) Class2_Sub2 local88 = null;
						@Pc(93) Class2_Sub2 local93 = this.aClass2_Sub2Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub20 local97 = local93.aClass2_Sub20_5;
								if (local97 == null || local97.anInt3408 <= local61) {
									local93.aBoolean181 = true;
									@Pc(121) int local121 = local93.method2849();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3408 += local121;
									}
									if (local45 >= this.anInt155) {
										break label103;
									}
									@Pc(140) Class2_Sub2 local140 = local93.method2848();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt4098;
										while (local140 != null) {
											this.method108(local145 * local140.method2852() >> 8, local140);
											local140 = local93.method2847();
										}
									}
									@Pc(164) Class2_Sub2 local164 = local93.aClass2_Sub2_8;
									local93.aClass2_Sub2_8 = null;
									if (local88 == null) {
										this.aClass2_Sub2Array6[local56] = local164;
									} else {
										local88.aClass2_Sub2_8 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub2Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub2_8;
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
				@Pc(207) Class2_Sub2 local207 = this.aClass2_Sub2Array6[local56];
				this.aClass2_Sub2Array6[local56] = this.aClass2_Sub2Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub2 local221 = local207.aClass2_Sub2_8;
					local207.aClass2_Sub2_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt164 < 0) {
			this.anInt164 = 0;
		}
		if (this.aClass2_Sub2_3 != null) {
			this.aClass2_Sub2_3.method2853(arg0, 0, 256);
		}
		this.aLong10 = Static104.method1634();
	}

	@OriginalMember(owner = "client!n", name = "a", descriptor = "(IILclient!af;)V")
	private void method108(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class2_Sub2 local12 = this.aClass2_Sub2Array5[local7];
		if (local12 == null) {
			this.aClass2_Sub2Array6[local7] = arg1;
		} else {
			local12.aClass2_Sub2_8 = arg1;
		}
		this.aClass2_Sub2Array5[local7] = arg1;
		arg1.anInt4098 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "c", descriptor = "()V")
	protected void method109() throws Exception {
	}

	@OriginalMember(owner = "client!n", name = "d", descriptor = "()I")
	protected int method111() throws Exception {
		return this.anInt166;
	}
}
