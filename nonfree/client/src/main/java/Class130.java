import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public class Class130 {

	@OriginalMember(owner = "client!on", name = "j", descriptor = "[I")
	public int[] anIntArray451;

	@OriginalMember(owner = "client!on", name = "t", descriptor = "Lclient!sc;")
	private Class10_Sub7 aClass10_Sub7_6;

	@OriginalMember(owner = "client!on", name = "v", descriptor = "I")
	public int anInt4523;

	@OriginalMember(owner = "client!on", name = "A", descriptor = "I")
	public int anInt4526;

	@OriginalMember(owner = "client!on", name = "D", descriptor = "I")
	private int anInt4528;

	@OriginalMember(owner = "client!on", name = "l", descriptor = "Z")
	private boolean aBoolean301 = false;

	@OriginalMember(owner = "client!on", name = "p", descriptor = "I")
	private final int anInt4519 = 32;

	@OriginalMember(owner = "client!on", name = "h", descriptor = "J")
	private long aLong149 = Static220.method3314();

	@OriginalMember(owner = "client!on", name = "u", descriptor = "J")
	private long aLong150 = 0L;

	@OriginalMember(owner = "client!on", name = "x", descriptor = "[Lclient!sc;")
	private final Class10_Sub7[] aClass10_Sub7Array5 = new Class10_Sub7[8];

	@OriginalMember(owner = "client!on", name = "C", descriptor = "J")
	private long aLong151 = 0L;

	@OriginalMember(owner = "client!on", name = "B", descriptor = "I")
	private int anInt4527 = 0;

	@OriginalMember(owner = "client!on", name = "w", descriptor = "I")
	private int anInt4524 = 0;

	@OriginalMember(owner = "client!on", name = "z", descriptor = "I")
	private int anInt4525 = 0;

	@OriginalMember(owner = "client!on", name = "y", descriptor = "[Lclient!sc;")
	private final Class10_Sub7[] aClass10_Sub7Array6 = new Class10_Sub7[8];

	@OriginalMember(owner = "client!on", name = "E", descriptor = "I")
	private int anInt4529 = 0;

	@OriginalMember(owner = "client!on", name = "F", descriptor = "Z")
	private boolean aBoolean302 = true;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "([II)V")
	private void method3633(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static324.aBoolean365) {
			local1 = 512;
		}
		Static468.method4354(arg0, 0, local1);
		this.anInt4527 -= 256;
		if (this.aClass10_Sub7_6 != null && this.anInt4527 <= 0) {
			this.anInt4527 += Static438.anInt7333 >> 4;
			Static366.method4934(this.aClass10_Sub7_6);
			this.method3646(this.aClass10_Sub7_6.method4814(), this.aClass10_Sub7_6);
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
						@Pc(88) Class10_Sub7 local88 = null;
						@Pc(93) Class10_Sub7 local93 = this.aClass10_Sub7Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class10_Sub25 local97 = local93.aClass10_Sub25_5;
								if (local97 == null || local97.anInt7554 <= local61) {
									local93.aBoolean394 = true;
									@Pc(121) int local121 = local93.method4819();
									local45 += local121;
									if (local97 != null) {
										local97.anInt7554 += local121;
									}
									if (local45 >= this.anInt4519) {
										break label103;
									}
									@Pc(140) Class10_Sub7 local140 = local93.method4818();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt6097;
										while (local140 != null) {
											this.method3646(local145 * local140.method4814() >> 8, local140);
											local140 = local93.method4816();
										}
									}
									@Pc(164) Class10_Sub7 local164 = local93.aClass10_Sub7_8;
									local93.aClass10_Sub7_8 = null;
									if (local88 == null) {
										this.aClass10_Sub7Array6[local56] = local164;
									} else {
										local88.aClass10_Sub7_8 = local164;
									}
									if (local164 == null) {
										this.aClass10_Sub7Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass10_Sub7_8;
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
				@Pc(207) Class10_Sub7 local207 = this.aClass10_Sub7Array6[local56];
				this.aClass10_Sub7Array6[local56] = this.aClass10_Sub7Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class10_Sub7 local221 = local207.aClass10_Sub7_8;
					local207.aClass10_Sub7_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt4527 < 0) {
			this.anInt4527 = 0;
		}
		if (this.aClass10_Sub7_6 != null) {
			this.aClass10_Sub7_6.method4813(arg0, 0, 256);
		}
		this.aLong149 = Static220.method3314();
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ZI)V")
	private void method3634() {
		this.anInt4527 -= 256;
		if (this.anInt4527 < 0) {
			this.anInt4527 = 0;
		}
		if (this.aClass10_Sub7_6 != null) {
			this.aClass10_Sub7_6.method4817(256);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(B)V")
	public final synchronized void method3636() {
		if (Static358.aClass175_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static358.aClass175_1.aClass130Array1[local11] == this) {
					Static358.aClass175_1.aClass130Array1[local11] = null;
				}
				if (Static358.aClass175_1.aClass130Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static358.aClass175_1.aBoolean326 = true;
				while (Static358.aClass175_1.aBoolean327) {
					Static328.method5696(50L);
				}
				Static358.aClass175_1 = null;
			}
		}
		this.method3637();
		this.aBoolean301 = true;
		this.anIntArray451 = null;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "()V")
	protected void method3637() {
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method3638(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "()V")
	protected void method3639() throws Exception {
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "()I")
	protected int method3640() throws Exception {
		return this.anInt4523;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ILclient!sc;)V")
	public final synchronized void method3641(@OriginalArg(1) Class10_Sub7 arg0) {
		this.aClass10_Sub7_6 = arg0;
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(B)V")
	public final synchronized void method3642() {
		if (this.aBoolean301) {
			return;
		}
		@Pc(12) long local12 = Static220.method3314();
		try {
			if (local12 > this.aLong149 + 500000L) {
				this.aLong149 = local12 - 500000L;
			}
			while (this.aLong149 + 5000L < local12) {
				this.method3634();
				this.aLong149 += 256000 / Static438.anInt7333;
			}
		} catch (@Pc(52) Exception local52) {
			this.aLong149 = local12;
		}
		if (this.anIntArray451 == null) {
			return;
		}
		try {
			if (this.aLong150 != 0L) {
				if (local12 < this.aLong150) {
					return;
				}
				this.method3647(this.anInt4523);
				this.aLong150 = 0L;
				this.aBoolean302 = true;
			}
			@Pc(95) int local95 = this.method3640();
			if (this.anInt4524 < this.anInt4529 - local95) {
				this.anInt4524 = this.anInt4529 - local95;
			}
			@Pc(120) int local120 = this.anInt4526 + this.anInt4528;
			if (local120 + 256 > 16384) {
				local120 = 16128;
			}
			if (local120 + 256 > this.anInt4523) {
				this.anInt4523 += 1024;
				if (this.anInt4523 > 16384) {
					this.anInt4523 = 16384;
				}
				this.method3637();
				this.method3647(this.anInt4523);
				local95 = 0;
				this.aBoolean302 = true;
				if (local120 + 256 > this.anInt4523) {
					local120 = this.anInt4523 - 256;
					this.anInt4528 = local120 - this.anInt4526;
				}
			}
			while (local95 < local120) {
				this.method3633(this.anIntArray451);
				this.method3645();
				local95 += 256;
			}
			if (this.aLong151 < local12) {
				if (this.aBoolean302) {
					this.aBoolean302 = false;
				} else if (this.anInt4524 == 0 && this.anInt4525 == 0) {
					this.method3637();
					this.aLong150 = local12 + 2000L;
					return;
				} else {
					this.anInt4528 = Math.min(this.anInt4525, this.anInt4524);
					this.anInt4525 = this.anInt4524;
				}
				this.anInt4524 = 0;
				this.aLong151 = local12 + 2000L;
			}
			this.anInt4529 = local95;
		} catch (@Pc(257) Exception local257) {
			this.method3637();
			this.aLong150 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V")
	public final synchronized void method3643() {
		this.aBoolean302 = true;
		try {
			this.method3639();
		} catch (@Pc(10) Exception local10) {
			this.method3637();
			this.aLong150 = Static220.method3314() + 2000L;
		}
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(B)V")
	public final void method3644() {
		this.aBoolean302 = true;
	}

	@OriginalMember(owner = "client!on", name = "d", descriptor = "()V")
	protected void method3645() throws Exception {
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(ILclient!sc;I)V")
	private void method3646(@OriginalArg(0) int arg0, @OriginalArg(1) Class10_Sub7 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(18) Class10_Sub7 local18 = this.aClass10_Sub7Array5[local7];
		if (local18 == null) {
			this.aClass10_Sub7Array6[local7] = arg1;
		} else {
			local18.aClass10_Sub7_8 = arg1;
		}
		this.aClass10_Sub7Array5[local7] = arg1;
		arg1.anInt6097 = arg0;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
	public void method3647(@OriginalArg(0) int arg0) throws Exception {
	}
}
