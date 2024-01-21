import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public class Class26 {

	@OriginalMember(owner = "client!ha", name = "i", descriptor = "[I")
	public int[] anIntArray421;

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "Lclient!qf;")
	private Class1_Sub8 aClass1_Sub8_8;

	@OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
	public int anInt2778;

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
	public int anInt2779;

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "I")
	private int anInt2783;

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
	private final int anInt2771 = 32;

	@OriginalMember(owner = "client!ha", name = "u", descriptor = "J")
	private long aLong89 = Static124.method2079();

	@OriginalMember(owner = "client!ha", name = "A", descriptor = "Z")
	private boolean aBoolean223 = true;

	@OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
	private int anInt2776 = 0;

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "J")
	private long aLong90 = 0L;

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
	private int anInt2780 = 0;

	@OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
	private int anInt2781 = 0;

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "[Lclient!qf;")
	private final Class1_Sub8[] aClass1_Sub8Array5 = new Class1_Sub8[8];

	@OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
	private int anInt2782 = 0;

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "J")
	private long aLong91 = 0L;

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "[Lclient!qf;")
	private final Class1_Sub8[] aClass1_Sub8Array6 = new Class1_Sub8[8];

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()I")
	protected int method1922() throws Exception {
		return this.anInt2778;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "()V")
	protected void method1923() throws Exception {
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BILclient!qf;)V")
	private void method1924(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		@Pc(11) int local11 = arg0 >> 5;
		@Pc(16) Class1_Sub8 local16 = this.aClass1_Sub8Array5[local11];
		if (local16 == null) {
			this.aClass1_Sub8Array6[local11] = arg1;
		} else {
			local16.aClass1_Sub8_7 = arg1;
		}
		this.aClass1_Sub8Array5[local11] = arg1;
		arg1.anInt2401 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public final synchronized void method1925() {
		if (Static88.aClass3_1 != null) {
			@Pc(11) boolean local11 = true;
			for (@Pc(13) int local13 = 0; local13 < 2; local13++) {
				if (Static88.aClass3_1.aClass26Array1[local13] == this) {
					Static88.aClass3_1.aClass26Array1[local13] = null;
				}
				if (Static88.aClass3_1.aClass26Array1[local13] != null) {
					local11 = false;
				}
			}
			if (local11) {
				Static88.aClass3_1.aBoolean24 = true;
				while (Static88.aClass3_1.aBoolean23) {
					Static96.method1616(50L);
				}
				Static88.aClass3_1 = null;
			}
		}
		this.method1933();
		this.anIntArray421 = null;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V")
	public final void method1926() {
		this.aBoolean223 = true;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLclient!qf;)V")
	public final synchronized void method1927(@OriginalArg(1) Class1_Sub8 arg0) {
		this.aClass1_Sub8_8 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
	public void method1928(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
	public final synchronized void method1930() {
		if (this.anIntArray421 == null) {
			return;
		}
		@Pc(12) long local12 = Static124.method2079();
		try {
			if (this.aLong90 != 0L) {
				if (local12 < this.aLong90) {
					return;
				}
				this.method1928(this.anInt2778);
				this.aLong90 = 0L;
				this.aBoolean223 = true;
			}
			@Pc(40) int local40 = this.method1922();
			if (this.anInt2781 < this.anInt2776 - local40) {
				this.anInt2781 = this.anInt2776 - local40;
			}
			@Pc(61) int local61 = this.anInt2779 + this.anInt2783;
			if (local61 + 256 > 16384) {
				local61 = 16128;
			}
			if (this.anInt2778 < local61 + 256) {
				local40 = 0;
				this.anInt2778 += 1024;
				if (this.anInt2778 > 16384) {
					this.anInt2778 = 16384;
				}
				this.method1933();
				this.method1928(this.anInt2778);
				this.aBoolean223 = true;
				if (local61 + 256 > this.anInt2778) {
					local61 = this.anInt2778 - 256;
					this.anInt2783 = local61 - this.anInt2779;
				}
			}
			while (local40 < local61) {
				local40 += 256;
				this.method1932(this.anIntArray421);
				this.method1923();
			}
			if (local12 > this.aLong91) {
				if (this.aBoolean223) {
					this.aBoolean223 = false;
				} else if (this.anInt2781 == 0 && this.anInt2780 == 0) {
					this.method1933();
					this.aLong90 = local12 + 2000L;
					return;
				} else {
					this.anInt2783 = Math.min(this.anInt2780, this.anInt2781);
					this.anInt2780 = this.anInt2781;
				}
				this.anInt2781 = 0;
				this.aLong91 = local12 + 2000L;
			}
			this.anInt2776 = local40;
		} catch (@Pc(197) Exception local197) {
			this.method1933();
			this.aLong90 = local12 + 2000L;
		}
		try {
			if (this.aLong89 + 500000L < local12) {
				local12 = this.aLong89;
			}
			while (this.aLong89 + 5000L < local12) {
				this.method1935();
				this.aLong89 += 256000 / Static44.anInt1243;
			}
		} catch (@Pc(246) Exception local246) {
			this.aLong89 = local12;
		}
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "()V")
	protected void method1931() throws Exception {
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([II)V")
	private void method1932(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static18.aBoolean56) {
			local1 = 512;
		}
		Static136.method1940(arg0, 0, local1);
		this.anInt2782 -= 256;
		if (this.aClass1_Sub8_8 != null && this.anInt2782 <= 0) {
			this.anInt2782 += Static44.anInt1243 >> 4;
			Static85.method1433(this.aClass1_Sub8_8);
			this.method1924(this.aClass1_Sub8_8.method1735(), this.aClass1_Sub8_8);
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
						@Pc(88) Class1_Sub8 local88 = null;
						@Pc(93) Class1_Sub8 local93 = this.aClass1_Sub8Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub16 local97 = local93.aClass1_Sub16_5;
								if (local97 == null || local97.anInt2189 <= local61) {
									local93.aBoolean196 = true;
									@Pc(121) int local121 = local93.method1733();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2189 += local121;
									}
									if (local45 >= this.anInt2771) {
										break label103;
									}
									@Pc(140) Class1_Sub8 local140 = local93.method1734();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt2401;
										while (local140 != null) {
											this.method1924(local145 * local140.method1735() >> 8, local140);
											local140 = local93.method1738();
										}
									}
									@Pc(164) Class1_Sub8 local164 = local93.aClass1_Sub8_7;
									local93.aClass1_Sub8_7 = null;
									if (local88 == null) {
										this.aClass1_Sub8Array6[local56] = local164;
									} else {
										local88.aClass1_Sub8_7 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub8Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub8_7;
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
				@Pc(207) Class1_Sub8 local207 = this.aClass1_Sub8Array6[local56];
				this.aClass1_Sub8Array6[local56] = this.aClass1_Sub8Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub8 local221 = local207.aClass1_Sub8_7;
					local207.aClass1_Sub8_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2782 < 0) {
			this.anInt2782 = 0;
		}
		if (this.aClass1_Sub8_8 != null) {
			this.aClass1_Sub8_8.method1736(arg0, 0, 256);
		}
		this.aLong89 = Static124.method2079();
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "()V")
	protected void method1933() {
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V")
	private void method1935() {
		this.anInt2782 -= 256;
		if (this.anInt2782 < 0) {
			this.anInt2782 = 0;
		}
		if (this.aClass1_Sub8_8 != null) {
			this.aClass1_Sub8_8.method1739(256);
		}
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
	public final synchronized void method1936() {
		this.aBoolean223 = true;
		try {
			this.method1931();
		} catch (@Pc(14) Exception local14) {
			this.method1933();
			this.aLong90 = Static124.method2079() + 2000L;
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1937(@OriginalArg(0) Component arg0) throws Exception {
	}
}
