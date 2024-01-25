import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!il")
public class Class88 {

	@OriginalMember(owner = "client!il", name = "c", descriptor = "Lclient!wf;")
	private Class2_Sub11 aClass2_Sub11_6;

	@OriginalMember(owner = "client!il", name = "u", descriptor = "[I")
	public int[] anIntArray244;

	@OriginalMember(owner = "client!il", name = "z", descriptor = "I")
	public int anInt3031;

	@OriginalMember(owner = "client!il", name = "C", descriptor = "I")
	private int anInt3033;

	@OriginalMember(owner = "client!il", name = "G", descriptor = "I")
	public int anInt3036;

	@OriginalMember(owner = "client!il", name = "f", descriptor = "Z")
	private boolean aBoolean279 = false;

	@OriginalMember(owner = "client!il", name = "d", descriptor = "I")
	private final int anInt3015 = 32;

	@OriginalMember(owner = "client!il", name = "h", descriptor = "J")
	private long aLong102 = Static22.method285();

	@OriginalMember(owner = "client!il", name = "y", descriptor = "J")
	private long aLong103 = 0L;

	@OriginalMember(owner = "client!il", name = "B", descriptor = "I")
	private int anInt3032 = 0;

	@OriginalMember(owner = "client!il", name = "E", descriptor = "Z")
	private boolean aBoolean280 = true;

	@OriginalMember(owner = "client!il", name = "D", descriptor = "I")
	private int anInt3034 = 0;

	@OriginalMember(owner = "client!il", name = "I", descriptor = "J")
	private long aLong104 = 0L;

	@OriginalMember(owner = "client!il", name = "H", descriptor = "[Lclient!wf;")
	private final Class2_Sub11[] aClass2_Sub11Array6 = new Class2_Sub11[8];

	@OriginalMember(owner = "client!il", name = "A", descriptor = "[Lclient!wf;")
	private final Class2_Sub11[] aClass2_Sub11Array5 = new Class2_Sub11[8];

	@OriginalMember(owner = "client!il", name = "F", descriptor = "I")
	private int anInt3035 = 0;

	@OriginalMember(owner = "client!il", name = "J", descriptor = "I")
	private int anInt3037 = 0;

	@OriginalMember(owner = "client!il", name = "a", descriptor = "([II)V")
	private void method2706(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static226.aBoolean429) {
			local1 = 512;
		}
		Static369.method2577(arg0, 0, local1);
		this.anInt3032 -= 256;
		if (this.aClass2_Sub11_6 != null && this.anInt3032 <= 0) {
			this.anInt3032 += Static36.anInt551 >> 4;
			Static144.method2740(this.aClass2_Sub11_6);
			this.method2707(this.aClass2_Sub11_6, this.aClass2_Sub11_6.method4943());
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
						@Pc(88) Class2_Sub11 local88 = null;
						@Pc(93) Class2_Sub11 local93 = this.aClass2_Sub11Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub5 local97 = local93.aClass2_Sub5_5;
								if (local97 == null || local97.anInt298 <= local61) {
									local93.aBoolean521 = true;
									@Pc(121) int local121 = local93.method4944();
									local45 += local121;
									if (local97 != null) {
										local97.anInt298 += local121;
									}
									if (local45 >= this.anInt3015) {
										break label103;
									}
									@Pc(140) Class2_Sub11 local140 = local93.method4948();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt5877;
										while (local140 != null) {
											this.method2707(local140, local145 * local140.method4943() >> 8);
											local140 = local93.method4947();
										}
									}
									@Pc(164) Class2_Sub11 local164 = local93.aClass2_Sub11_8;
									local93.aClass2_Sub11_8 = null;
									if (local88 == null) {
										this.aClass2_Sub11Array6[local56] = local164;
									} else {
										local88.aClass2_Sub11_8 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub11Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub11_8;
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
				@Pc(207) Class2_Sub11 local207 = this.aClass2_Sub11Array6[local56];
				this.aClass2_Sub11Array6[local56] = this.aClass2_Sub11Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub11 local221 = local207.aClass2_Sub11_8;
					local207.aClass2_Sub11_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt3032 < 0) {
			this.anInt3032 = 0;
		}
		if (this.aClass2_Sub11_6 != null) {
			this.aClass2_Sub11_6.method4945(arg0, 0, 256);
		}
		this.aLong102 = Static22.method285();
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(ILclient!wf;I)V")
	private void method2707(@OriginalArg(1) Class2_Sub11 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1 >> 5;
		@Pc(16) Class2_Sub11 local16 = this.aClass2_Sub11Array5[local11];
		if (local16 == null) {
			this.aClass2_Sub11Array6[local11] = arg0;
		} else {
			local16.aClass2_Sub11_8 = arg0;
		}
		this.aClass2_Sub11Array5[local11] = arg0;
		arg0.anInt5877 = arg1;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "()I")
	protected int method2708() throws Exception {
		return this.anInt3036;
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "()V")
	protected void method2710() {
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "()V")
	protected void method2711() throws Exception {
	}

	@OriginalMember(owner = "client!il", name = "b", descriptor = "(I)V")
	public final synchronized void method2712() {
		if (Static9.aClass149_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static9.aClass149_1.aClass88Array1[local11] == this) {
					Static9.aClass149_1.aClass88Array1[local11] = null;
				}
				if (Static9.aClass149_1.aClass88Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static9.aClass149_1.aBoolean437 = true;
				while (Static9.aClass149_1.aBoolean438) {
					Static248.method4401(50L);
				}
				Static9.aClass149_1 = null;
			}
		}
		this.method2710();
		this.aBoolean279 = true;
		this.anIntArray244 = null;
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "()V")
	protected void method2713() throws Exception {
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!wf;B)V")
	public final synchronized void method2714(@OriginalArg(0) Class2_Sub11 arg0) {
		this.aClass2_Sub11_6 = arg0;
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(BI)V")
	private void method2715() {
		this.anInt3032 -= 256;
		if (this.anInt3032 < 0) {
			this.anInt3032 = 0;
		}
		if (this.aClass2_Sub11_6 != null) {
			this.aClass2_Sub11_6.method4946(256);
		}
	}

	@OriginalMember(owner = "client!il", name = "c", descriptor = "(I)V")
	public void method2716(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2717(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!il", name = "d", descriptor = "(I)V")
	public final synchronized void method2720() {
		if (this.aBoolean279) {
			return;
		}
		@Pc(12) long local12 = Static22.method285();
		try {
			if (this.aLong102 + 500000L < local12) {
				this.aLong102 = local12 - 500000L;
			}
			while (this.aLong102 + 5000L < local12) {
				this.method2715();
				this.aLong102 += 256000 / Static36.anInt551;
			}
		} catch (@Pc(48) Exception local48) {
			this.aLong102 = local12;
		}
		if (this.anIntArray244 == null) {
			return;
		}
		try {
			if ((long) 0 != this.aLong104) {
				if (local12 < this.aLong104) {
					return;
				}
				this.method2716(this.anInt3036);
				this.aLong104 = 0L;
				this.aBoolean280 = true;
			}
			@Pc(84) int local84 = this.method2708();
			if (this.anInt3034 - local84 > this.anInt3037) {
				this.anInt3037 = this.anInt3034 - local84;
			}
			@Pc(109) int local109 = this.anInt3033 + this.anInt3031;
			if (local109 + 256 > 16384) {
				local109 = 16128;
			}
			if (this.anInt3036 < local109 + 256) {
				this.anInt3036 += 1024;
				if (this.anInt3036 > 16384) {
					this.anInt3036 = 16384;
				}
				this.method2710();
				local84 = 0;
				this.method2716(this.anInt3036);
				if (this.anInt3036 < local109 + 256) {
					local109 = this.anInt3036 - 256;
					this.anInt3033 = local109 - this.anInt3031;
				}
				this.aBoolean280 = true;
			}
			while (local84 < local109) {
				this.method2706(this.anIntArray244);
				this.method2713();
				local84 += 256;
			}
			if (this.aLong103 < local12) {
				if (this.aBoolean280) {
					this.aBoolean280 = false;
				} else if (this.anInt3037 == 0 && this.anInt3035 == 0) {
					this.method2710();
					this.aLong104 = local12 + 2000L;
					return;
				} else {
					this.anInt3033 = Math.min(this.anInt3035, this.anInt3037);
					this.anInt3035 = this.anInt3037;
				}
				this.aLong103 = local12 + 2000L;
				this.anInt3037 = 0;
			}
			this.anInt3034 = local84;
		} catch (@Pc(245) Exception local245) {
			this.method2710();
			this.aLong104 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!il", name = "e", descriptor = "(I)V")
	public final void method2721() {
		this.aBoolean280 = true;
	}

	@OriginalMember(owner = "client!il", name = "f", descriptor = "(I)V")
	public final synchronized void method2723() {
		this.aBoolean280 = true;
		try {
			this.method2711();
		} catch (@Pc(10) Exception local10) {
			this.method2710();
			this.aLong104 = Static22.method285() + 2000L;
		}
	}
}
