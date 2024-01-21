import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ld")
public class Class43 {

	@OriginalMember(owner = "client!ld", name = "t", descriptor = "[I")
	public int[] anIntArray337;

	@OriginalMember(owner = "client!ld", name = "A", descriptor = "Lclient!da;")
	private Class3_Sub3 aClass3_Sub3_7;

	@OriginalMember(owner = "client!ld", name = "L", descriptor = "I")
	private int anInt2807;

	@OriginalMember(owner = "client!ld", name = "M", descriptor = "I")
	public int anInt2808;

	@OriginalMember(owner = "client!ld", name = "S", descriptor = "I")
	public int anInt2811;

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
	private final int anInt2786 = 32;

	@OriginalMember(owner = "client!ld", name = "l", descriptor = "J")
	private long aLong87 = Static87.method1625();

	@OriginalMember(owner = "client!ld", name = "P", descriptor = "[Lclient!da;")
	private final Class3_Sub3[] aClass3_Sub3Array6 = new Class3_Sub3[8];

	@OriginalMember(owner = "client!ld", name = "K", descriptor = "I")
	private int anInt2806 = 0;

	@OriginalMember(owner = "client!ld", name = "Q", descriptor = "Z")
	private boolean aBoolean158 = true;

	@OriginalMember(owner = "client!ld", name = "J", descriptor = "[Lclient!da;")
	private final Class3_Sub3[] aClass3_Sub3Array5 = new Class3_Sub3[8];

	@OriginalMember(owner = "client!ld", name = "R", descriptor = "I")
	private int anInt2810 = 0;

	@OriginalMember(owner = "client!ld", name = "O", descriptor = "J")
	private long aLong88 = 0L;

	@OriginalMember(owner = "client!ld", name = "U", descriptor = "J")
	private long aLong89 = 0L;

	@OriginalMember(owner = "client!ld", name = "W", descriptor = "I")
	private int anInt2813 = 0;

	@OriginalMember(owner = "client!ld", name = "N", descriptor = "I")
	private int anInt2809 = 0;

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
	public final void method1909() {
		this.aBoolean158 = true;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "()V")
	protected void method1910() throws Exception {
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)V")
	public final synchronized void method1911() {
		this.aBoolean158 = true;
		try {
			this.method1910();
		} catch (@Pc(10) Exception local10) {
			this.method1920();
			this.aLong88 = Static87.method1625() + 2000L;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(ILclient!da;)V")
	public final synchronized void method1912(@OriginalArg(1) Class3_Sub3 arg0) {
		this.aClass3_Sub3_7 = arg0;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
	public final synchronized void method1914() {
		if (this.anIntArray337 == null) {
			return;
		}
		@Pc(20) long local20 = Static87.method1625();
		try {
			if (this.aLong88 != 0L) {
				if (this.aLong88 > local20) {
					return;
				}
				this.method1923(this.anInt2811);
				this.aLong88 = 0L;
				this.aBoolean158 = true;
			}
			@Pc(48) int local48 = this.method1919();
			if (this.anInt2809 - local48 > this.anInt2810) {
				this.anInt2810 = this.anInt2809 - local48;
			}
			@Pc(72) int local72 = this.anInt2807 + this.anInt2808;
			if (local72 + 256 > 16384) {
				local72 = 16128;
			}
			if (this.anInt2811 < local72 + 256) {
				this.anInt2811 += 1024;
				if (this.anInt2811 > 16384) {
					this.anInt2811 = 16384;
				}
				this.method1920();
				this.method1923(this.anInt2811);
				if (local72 + 256 > this.anInt2811) {
					local72 = this.anInt2811 - 256;
					this.anInt2807 = local72 - this.anInt2808;
				}
				this.aBoolean158 = true;
				local48 = 0;
			}
			while (local48 < local72) {
				local48 += 256;
				this.method1922(this.anIntArray337);
				this.method1925();
			}
			if (local20 > this.aLong89) {
				if (this.aBoolean158) {
					this.aBoolean158 = false;
				} else if (this.anInt2810 == 0 && this.anInt2813 == 0) {
					this.method1920();
					this.aLong88 = local20 + 2000L;
					return;
				} else {
					this.anInt2807 = Math.min(this.anInt2813, this.anInt2810);
					this.anInt2813 = this.anInt2810;
				}
				this.aLong89 = local20 + 2000L;
				this.anInt2810 = 0;
			}
			this.anInt2809 = local48;
		} catch (@Pc(203) Exception local203) {
			this.method1920();
			this.aLong88 = local20 + 2000L;
		}
		try {
			if (this.aLong87 + 500000L < local20) {
				local20 = this.aLong87;
			}
			while (local20 > this.aLong87 + 5000L) {
				this.method1924();
				this.aLong87 += 256000 / Static110.anInt2948;
			}
		} catch (@Pc(248) Exception local248) {
			this.aLong87 = local20;
		}
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1916(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lclient!da;II)V")
	private void method1917(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 >> 5;
		@Pc(19) Class3_Sub3 local19 = this.aClass3_Sub3Array6[local14];
		if (local19 == null) {
			this.aClass3_Sub3Array5[local14] = arg0;
		} else {
			local19.aClass3_Sub3_8 = arg0;
		}
		this.aClass3_Sub3Array6[local14] = arg0;
		arg0.anInt3144 = arg1;
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
	public final synchronized void method1918() {
		if (Static75.aClass50_1 != null) {
			@Pc(12) boolean local12 = true;
			for (@Pc(14) int local14 = 0; local14 < 2; local14++) {
				if (Static75.aClass50_1.aClass43Array1[local14] == this) {
					Static75.aClass50_1.aClass43Array1[local14] = null;
				}
				if (Static75.aClass50_1.aClass43Array1[local14] != null) {
					local12 = false;
				}
			}
			if (local12) {
				Static75.aClass50_1.aBoolean123 = true;
				while (Static75.aClass50_1.aBoolean122) {
					Static40.method783(50L);
				}
				Static75.aClass50_1 = null;
			}
		}
		this.method1920();
		this.anIntArray337 = null;
	}

	@OriginalMember(owner = "client!ld", name = "b", descriptor = "()I")
	protected int method1919() throws Exception {
		return this.anInt2811;
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "()V")
	protected void method1920() {
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "([II)V")
	private void method1922(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static31.aBoolean156) {
			local1 = 512;
		}
		Static135.method732(arg0, 0, local1);
		this.anInt2806 -= 256;
		if (this.aClass3_Sub3_7 != null && this.anInt2806 <= 0) {
			this.anInt2806 += Static110.anInt2948 >> 4;
			Static7.method111(this.aClass3_Sub3_7);
			this.method1917(this.aClass3_Sub3_7, this.aClass3_Sub3_7.method2149());
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
						@Pc(88) Class3_Sub3 local88 = null;
						@Pc(93) Class3_Sub3 local93 = this.aClass3_Sub3Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class3_Sub5 local97 = local93.aClass3_Sub5_5;
								if (local97 == null || local97.anInt2119 <= local61) {
									local93.aBoolean174 = true;
									@Pc(121) int local121 = local93.method2144();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2119 += local121;
									}
									if (local45 >= this.anInt2786) {
										break label103;
									}
									@Pc(140) Class3_Sub3 local140 = local93.method2145();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt3144;
										while (local140 != null) {
											this.method1917(local140, local145 * local140.method2149() >> 8);
											local140 = local93.method2147();
										}
									}
									@Pc(164) Class3_Sub3 local164 = local93.aClass3_Sub3_8;
									local93.aClass3_Sub3_8 = null;
									if (local88 == null) {
										this.aClass3_Sub3Array5[local56] = local164;
									} else {
										local88.aClass3_Sub3_8 = local164;
									}
									if (local164 == null) {
										this.aClass3_Sub3Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass3_Sub3_8;
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
				@Pc(207) Class3_Sub3 local207 = this.aClass3_Sub3Array5[local56];
				this.aClass3_Sub3Array5[local56] = this.aClass3_Sub3Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class3_Sub3 local221 = local207.aClass3_Sub3_8;
					local207.aClass3_Sub3_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2806 < 0) {
			this.anInt2806 = 0;
		}
		if (this.aClass3_Sub3_7 != null) {
			this.aClass3_Sub3_7.method2146(arg0, 0, 256);
		}
		this.aLong87 = Static87.method1625();
	}

	@OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)V")
	public void method1923(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)V")
	private void method1924() {
		this.anInt2806 -= 256;
		if (this.anInt2806 < 0) {
			this.anInt2806 = 0;
		}
		if (this.aClass3_Sub3_7 != null) {
			this.aClass3_Sub3_7.method2148(256);
		}
	}

	@OriginalMember(owner = "client!ld", name = "d", descriptor = "()V")
	protected void method1925() throws Exception {
	}
}
