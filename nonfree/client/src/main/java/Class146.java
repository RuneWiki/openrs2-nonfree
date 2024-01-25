import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public class Class146 {

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "[I")
	public int[] anIntArray555;

	@OriginalMember(owner = "client!nm", name = "h", descriptor = "Lclient!ps;")
	private Class5_Sub15 aClass5_Sub15_6;

	@OriginalMember(owner = "client!nm", name = "z", descriptor = "I")
	public int anInt7105;

	@OriginalMember(owner = "client!nm", name = "B", descriptor = "I")
	public int anInt7106;

	@OriginalMember(owner = "client!nm", name = "F", descriptor = "I")
	private int anInt7108;

	@OriginalMember(owner = "client!nm", name = "j", descriptor = "Z")
	private boolean aBoolean500 = false;

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
	private final int anInt7093 = 32;

	@OriginalMember(owner = "client!nm", name = "p", descriptor = "J")
	private long aLong192 = Static105.method2132();

	@OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
	private int anInt7100 = 0;

	@OriginalMember(owner = "client!nm", name = "u", descriptor = "[Lclient!ps;")
	private final Class5_Sub15[] aClass5_Sub15Array5 = new Class5_Sub15[8];

	@OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
	private int anInt7101 = 0;

	@OriginalMember(owner = "client!nm", name = "A", descriptor = "J")
	private long aLong193 = 0L;

	@OriginalMember(owner = "client!nm", name = "y", descriptor = "I")
	private int anInt7104 = 0;

	@OriginalMember(owner = "client!nm", name = "C", descriptor = "[Lclient!ps;")
	private final Class5_Sub15[] aClass5_Sub15Array6 = new Class5_Sub15[8];

	@OriginalMember(owner = "client!nm", name = "D", descriptor = "Z")
	private boolean aBoolean501 = true;

	@OriginalMember(owner = "client!nm", name = "G", descriptor = "J")
	private long aLong194 = 0L;

	@OriginalMember(owner = "client!nm", name = "E", descriptor = "I")
	private int anInt7107 = 0;

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "()V")
	protected void method5754() throws Exception {
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
	public void method5755(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(B)V")
	public final synchronized void method5758() {
		if (Static437.aClass46_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static437.aClass46_1.aClass146Array1[local7] == this) {
					Static437.aClass46_1.aClass146Array1[local7] = null;
				}
				if (Static437.aClass46_1.aClass146Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static437.aClass46_1.aBoolean64 = true;
				while (Static437.aClass46_1.aBoolean65) {
					Static213.method3465(50L);
				}
				Static437.aClass46_1 = null;
			}
		}
		this.method5759();
		this.anIntArray555 = null;
		this.aBoolean500 = true;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "()V")
	protected void method5759() {
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
	public final synchronized void method5760() {
		this.aBoolean501 = true;
		try {
			this.method5754();
		} catch (@Pc(15) Exception local15) {
			this.method5759();
			this.aLong194 = Static105.method2132() + 2000L;
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(BLclient!ps;)V")
	public final synchronized void method5761(@OriginalArg(1) Class5_Sub15 arg0) {
		this.aClass5_Sub15_6 = arg0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5762(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILclient!ps;I)V")
	private void method5763(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub15 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class5_Sub15 local12 = this.aClass5_Sub15Array5[local7];
		if (local12 == null) {
			this.aClass5_Sub15Array6[local7] = arg1;
		} else {
			local12.aClass5_Sub15_8 = arg1;
		}
		this.aClass5_Sub15Array5[local7] = arg1;
		arg1.anInt8006 = arg0;
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "()I")
	protected int method5764() throws Exception {
		return this.anInt7106;
	}

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "(B)V")
	public final synchronized void method5765() {
		if (this.aBoolean500) {
			return;
		}
		@Pc(16) long local16 = Static105.method2132();
		try {
			if (this.aLong192 + 500000L < local16) {
				this.aLong192 = local16 - 500000L;
			}
			while (this.aLong192 + 5000L < local16) {
				this.method5767();
				this.aLong192 += 256000 / Static527.anInt8915;
			}
		} catch (@Pc(60) Exception local60) {
			this.aLong192 = local16;
		}
		if (this.anIntArray555 == null) {
			return;
		}
		try {
			if (this.aLong194 != 0L) {
				if (this.aLong194 > local16) {
					return;
				}
				this.method5755(this.anInt7106);
				this.aBoolean501 = true;
				this.aLong194 = 0L;
			}
			@Pc(91) int local91 = this.method5764();
			if (this.anInt7104 < this.anInt7107 - local91) {
				this.anInt7104 = this.anInt7107 - local91;
			}
			@Pc(117) int local117 = this.anInt7105 + this.anInt7108;
			if (local117 + 256 > 16384) {
				local117 = 16128;
			}
			if (this.anInt7106 < local117 + 256) {
				this.anInt7106 += 1024;
				if (this.anInt7106 > 16384) {
					this.anInt7106 = 16384;
				}
				this.method5759();
				local91 = 0;
				this.method5755(this.anInt7106);
				this.aBoolean501 = true;
				if (this.anInt7106 < local117 + 256) {
					local117 = this.anInt7106 - 256;
					this.anInt7108 = local117 - this.anInt7105;
				}
			}
			while (local117 > local91) {
				this.method5768(this.anIntArray555);
				this.method5766();
				local91 += 256;
			}
			if (local16 > this.aLong193) {
				if (this.aBoolean501) {
					this.aBoolean501 = false;
				} else if (this.anInt7104 == 0 && this.anInt7100 == 0) {
					this.method5759();
					this.aLong194 = local16 + 2000L;
					return;
				} else {
					this.anInt7108 = Math.min(this.anInt7100, this.anInt7104);
					this.anInt7100 = this.anInt7104;
				}
				this.anInt7104 = 0;
				this.aLong193 = local16 + 2000L;
			}
			this.anInt7107 = local91;
		} catch (@Pc(255) Exception local255) {
			this.method5759();
			this.aLong194 = local16 + 2000L;
		}
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "()V")
	protected void method5766() throws Exception {
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IZ)V")
	private void method5767() {
		this.anInt7101 -= 256;
		if (this.anInt7101 < 0) {
			this.anInt7101 = 0;
		}
		if (this.aClass5_Sub15_6 != null) {
			this.aClass5_Sub15_6.method6505(256);
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([II)V")
	private void method5768(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static543.aBoolean438) {
			local1 = 512;
		}
		Static553.method2528(arg0, 0, local1);
		this.anInt7101 -= 256;
		if (this.aClass5_Sub15_6 != null && this.anInt7101 <= 0) {
			this.anInt7101 += Static527.anInt8915 >> 4;
			Static34.method813(this.aClass5_Sub15_6);
			this.method5763(this.aClass5_Sub15_6.method6509(), this.aClass5_Sub15_6);
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
						@Pc(88) Class5_Sub15 local88 = null;
						@Pc(93) Class5_Sub15 local93 = this.aClass5_Sub15Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class5_Sub5 local97 = local93.aClass5_Sub5_5;
								if (local97 == null || local97.anInt481 <= local61) {
									local93.aBoolean572 = true;
									@Pc(121) int local121 = local93.method6508();
									local45 += local121;
									if (local97 != null) {
										local97.anInt481 += local121;
									}
									if (local45 >= this.anInt7093) {
										break label103;
									}
									@Pc(140) Class5_Sub15 local140 = local93.method6506();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt8006;
										while (local140 != null) {
											this.method5763(local145 * local140.method6509() >> 8, local140);
											local140 = local93.method6511();
										}
									}
									@Pc(164) Class5_Sub15 local164 = local93.aClass5_Sub15_8;
									local93.aClass5_Sub15_8 = null;
									if (local88 == null) {
										this.aClass5_Sub15Array6[local56] = local164;
									} else {
										local88.aClass5_Sub15_8 = local164;
									}
									if (local164 == null) {
										this.aClass5_Sub15Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass5_Sub15_8;
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
				@Pc(207) Class5_Sub15 local207 = this.aClass5_Sub15Array6[local56];
				this.aClass5_Sub15Array6[local56] = this.aClass5_Sub15Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class5_Sub15 local221 = local207.aClass5_Sub15_8;
					local207.aClass5_Sub15_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt7101 < 0) {
			this.anInt7101 = 0;
		}
		if (this.aClass5_Sub15_6 != null) {
			this.aClass5_Sub15_6.method6510(arg0, 0, 256);
		}
		this.aLong192 = Static105.method2132();
	}
}
