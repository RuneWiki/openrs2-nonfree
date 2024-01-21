import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bc")
public class Class9 {

	@OriginalMember(owner = "client!bc", name = "e", descriptor = "Lclient!f;")
	private Class5_Sub11 aClass5_Sub11_8;

	@OriginalMember(owner = "client!bc", name = "g", descriptor = "[I")
	public int[] anIntArray408;

	@OriginalMember(owner = "client!bc", name = "x", descriptor = "I")
	private int anInt3881;

	@OriginalMember(owner = "client!bc", name = "y", descriptor = "I")
	public int anInt3882;

	@OriginalMember(owner = "client!bc", name = "G", descriptor = "I")
	public int anInt3886;

	@OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
	private final int anInt3872 = 32;

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "J")
	private long aLong232 = Static188.method2822();

	@OriginalMember(owner = "client!bc", name = "A", descriptor = "I")
	private int anInt3883 = 0;

	@OriginalMember(owner = "client!bc", name = "E", descriptor = "I")
	private int anInt3885 = 0;

	@OriginalMember(owner = "client!bc", name = "B", descriptor = "[Lclient!f;")
	private final Class5_Sub11[] aClass5_Sub11Array5 = new Class5_Sub11[8];

	@OriginalMember(owner = "client!bc", name = "H", descriptor = "I")
	private int anInt3887 = 0;

	@OriginalMember(owner = "client!bc", name = "C", descriptor = "I")
	private int anInt3884 = 0;

	@OriginalMember(owner = "client!bc", name = "I", descriptor = "J")
	private long aLong234 = 0L;

	@OriginalMember(owner = "client!bc", name = "D", descriptor = "[Lclient!f;")
	private final Class5_Sub11[] aClass5_Sub11Array6 = new Class5_Sub11[8];

	@OriginalMember(owner = "client!bc", name = "F", descriptor = "J")
	private long aLong233 = 0L;

	@OriginalMember(owner = "client!bc", name = "z", descriptor = "Z")
	private boolean aBoolean176 = true;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
	public final synchronized void method2927() {
		this.aBoolean176 = true;
		try {
			this.method2938();
		} catch (@Pc(10) Exception local10) {
			this.method2939();
			this.aLong233 = Static188.method2822() + 2000L;
		}
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
	public final synchronized void method2928() {
		if (Static56.aClass38_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static56.aClass38_1.aClass9Array1[local11] == this) {
					Static56.aClass38_1.aClass9Array1[local11] = null;
				}
				if (Static56.aClass38_1.aClass9Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static56.aClass38_1.aBoolean72 = true;
				while (Static56.aClass38_1.aBoolean73) {
					Static210.method739(50L);
				}
				Static56.aClass38_1 = null;
			}
		}
		this.method2939();
		this.anIntArray408 = null;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BILclient!f;)V")
	private void method2929(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub11 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class5_Sub11 local12 = this.aClass5_Sub11Array5[local7];
		if (local12 == null) {
			this.aClass5_Sub11Array6[local7] = arg1;
		} else {
			local12.aClass5_Sub11_7 = arg1;
		}
		this.aClass5_Sub11Array5[local7] = arg1;
		arg1.anInt3786 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)V")
	private void method2930() {
		this.anInt3885 -= 256;
		if (this.anInt3885 < 0) {
			this.anInt3885 = 0;
		}
		if (this.aClass5_Sub11_8 != null) {
			this.aClass5_Sub11_8.method2870(256);
		}
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
	public final void method2933() {
		this.aBoolean176 = true;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Lclient!f;I)V")
	public final synchronized void method2934(@OriginalArg(0) Class5_Sub11 arg0) {
		this.aClass5_Sub11_8 = arg0;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "()V")
	protected void method2935() throws Exception {
	}

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "()I")
	protected int method2936() throws Exception {
		return this.anInt3882;
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2937(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "()V")
	protected void method2938() throws Exception {
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "()V")
	protected void method2939() {
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
	public final synchronized void method2941() {
		if (this.anIntArray408 == null) {
			return;
		}
		@Pc(12) long local12 = Static188.method2822();
		try {
			if (this.aLong233 != 0L) {
				if (this.aLong233 > local12) {
					return;
				}
				this.method2942(this.anInt3882);
				this.aLong233 = 0L;
				this.aBoolean176 = true;
			}
			@Pc(38) int local38 = this.method2936();
			@Pc(44) int local44 = this.anInt3886 + this.anInt3881;
			if (local44 + 256 > 16384) {
				local44 = 16128;
			}
			if (this.anInt3884 - local38 > this.anInt3883) {
				this.anInt3883 = this.anInt3884 - local38;
			}
			if (local44 + 256 > this.anInt3882) {
				this.anInt3882 += 1024;
				local38 = 0;
				if (this.anInt3882 > 16384) {
					this.anInt3882 = 16384;
				}
				this.method2939();
				this.method2942(this.anInt3882);
				this.aBoolean176 = true;
				if (this.anInt3882 < local44 + 256) {
					local44 = this.anInt3882 - 256;
					this.anInt3881 = local44 - this.anInt3886;
				}
			}
			while (local44 > local38) {
				this.method2943(this.anIntArray408);
				this.method2935();
				local38 += 256;
			}
			if (this.aLong234 < local12) {
				if (this.aBoolean176) {
					this.aBoolean176 = false;
				} else if (this.anInt3883 == 0 && this.anInt3887 == 0) {
					this.method2939();
					this.aLong233 = local12 + 2000L;
					return;
				} else {
					this.anInt3881 = Math.min(this.anInt3887, this.anInt3883);
					this.anInt3887 = this.anInt3883;
				}
				this.aLong234 = local12 + 2000L;
				this.anInt3883 = 0;
			}
			this.anInt3884 = local38;
		} catch (@Pc(208) Exception local208) {
			this.method2939();
			this.aLong233 = local12 + 2000L;
		}
		try {
			if (local12 > this.aLong232 + 500000L) {
				local12 = this.aLong232;
			}
			while (local12 > this.aLong232 + 5000L) {
				this.method2930();
				this.aLong232 += 256000 / Static62.anInt1362;
			}
		} catch (@Pc(257) Exception local257) {
			this.aLong232 = local12;
		}
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
	public void method2942(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([II)V")
	private void method2943(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static30.aBoolean37) {
			local1 = 512;
		}
		Static220.method49(arg0, 0, local1);
		this.anInt3885 -= 256;
		if (this.aClass5_Sub11_8 != null && this.anInt3885 <= 0) {
			this.anInt3885 += Static62.anInt1362 >> 4;
			Static31.method514(this.aClass5_Sub11_8);
			this.method2929(this.aClass5_Sub11_8.method2868(), this.aClass5_Sub11_8);
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
						@Pc(88) Class5_Sub11 local88 = null;
						@Pc(93) Class5_Sub11 local93 = this.aClass5_Sub11Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class5_Sub7 local97 = local93.aClass5_Sub7_5;
								if (local97 == null || local97.anInt2686 <= local61) {
									local93.aBoolean171 = true;
									@Pc(121) int local121 = local93.method2864();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2686 += local121;
									}
									if (local45 >= this.anInt3872) {
										break label103;
									}
									@Pc(140) Class5_Sub11 local140 = local93.method2866();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt3786;
										while (local140 != null) {
											this.method2929(local145 * local140.method2868() >> 8, local140);
											local140 = local93.method2865();
										}
									}
									@Pc(164) Class5_Sub11 local164 = local93.aClass5_Sub11_7;
									local93.aClass5_Sub11_7 = null;
									if (local88 == null) {
										this.aClass5_Sub11Array6[local56] = local164;
									} else {
										local88.aClass5_Sub11_7 = local164;
									}
									if (local164 == null) {
										this.aClass5_Sub11Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass5_Sub11_7;
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
				@Pc(207) Class5_Sub11 local207 = this.aClass5_Sub11Array6[local56];
				this.aClass5_Sub11Array6[local56] = this.aClass5_Sub11Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class5_Sub11 local221 = local207.aClass5_Sub11_7;
					local207.aClass5_Sub11_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt3885 < 0) {
			this.anInt3885 = 0;
		}
		if (this.aClass5_Sub11_8 != null) {
			this.aClass5_Sub11_8.method2869(arg0, 0, 256);
		}
		this.aLong232 = Static188.method2822();
	}
}
