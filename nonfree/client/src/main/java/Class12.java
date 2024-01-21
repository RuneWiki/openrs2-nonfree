import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eh")
public class Class12 {

	@OriginalMember(owner = "client!eh", name = "i", descriptor = "Lclient!le;")
	private Class3_Sub5 aClass3_Sub5_7;

	@OriginalMember(owner = "client!eh", name = "k", descriptor = "[I")
	public int[] anIntArray418;

	@OriginalMember(owner = "client!eh", name = "E", descriptor = "I")
	private int anInt3694;

	@OriginalMember(owner = "client!eh", name = "F", descriptor = "I")
	public int anInt3695;

	@OriginalMember(owner = "client!eh", name = "O", descriptor = "I")
	public int anInt3699;

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
	private final int anInt3678 = 32;

	@OriginalMember(owner = "client!eh", name = "n", descriptor = "J")
	private long aLong131 = Static150.method2481();

	@OriginalMember(owner = "client!eh", name = "H", descriptor = "I")
	private int anInt3696 = 0;

	@OriginalMember(owner = "client!eh", name = "I", descriptor = "J")
	private long aLong132 = 0L;

	@OriginalMember(owner = "client!eh", name = "A", descriptor = "I")
	private int anInt3691 = 0;

	@OriginalMember(owner = "client!eh", name = "J", descriptor = "J")
	private long aLong133 = 0L;

	@OriginalMember(owner = "client!eh", name = "K", descriptor = "I")
	private int anInt3697 = 0;

	@OriginalMember(owner = "client!eh", name = "G", descriptor = "Z")
	private boolean aBoolean158 = true;

	@OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
	private int anInt3698 = 0;

	@OriginalMember(owner = "client!eh", name = "N", descriptor = "[Lclient!le;")
	private final Class3_Sub5[] aClass3_Sub5Array6 = new Class3_Sub5[8];

	@OriginalMember(owner = "client!eh", name = "M", descriptor = "[Lclient!le;")
	private final Class3_Sub5[] aClass3_Sub5Array5 = new Class3_Sub5[8];

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2656(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
	public void method2658(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!le;II)V")
	private void method2659(@OriginalArg(0) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class3_Sub5 local12 = this.aClass3_Sub5Array5[local7];
		if (local12 == null) {
			this.aClass3_Sub5Array6[local7] = arg0;
		} else {
			local12.aClass3_Sub5_8 = arg0;
		}
		this.aClass3_Sub5Array5[local7] = arg0;
		arg0.anInt3850 = arg1;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "([II)V")
	private void method2661(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static3.aBoolean5) {
			local1 = 512;
		}
		Static184.method1307(arg0, 0, local1);
		this.anInt3691 -= 256;
		if (this.aClass3_Sub5_7 != null && this.anInt3691 <= 0) {
			this.anInt3691 += Static149.anInt3584 >> 4;
			Static90.method1501(this.aClass3_Sub5_7);
			this.method2659(this.aClass3_Sub5_7, this.aClass3_Sub5_7.method2772());
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
						@Pc(88) Class3_Sub5 local88 = null;
						@Pc(93) Class3_Sub5 local93 = this.aClass3_Sub5Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class3_Sub9 local97 = local93.aClass3_Sub9_5;
								if (local97 == null || local97.anInt3889 <= local61) {
									local93.aBoolean167 = true;
									@Pc(121) int local121 = local93.method2770();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3889 += local121;
									}
									if (local45 >= this.anInt3678) {
										break label103;
									}
									@Pc(140) Class3_Sub5 local140 = local93.method2774();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt3850;
										while (local140 != null) {
											this.method2659(local140, local145 * local140.method2772() >> 8);
											local140 = local93.method2775();
										}
									}
									@Pc(164) Class3_Sub5 local164 = local93.aClass3_Sub5_8;
									local93.aClass3_Sub5_8 = null;
									if (local88 == null) {
										this.aClass3_Sub5Array6[local56] = local164;
									} else {
										local88.aClass3_Sub5_8 = local164;
									}
									if (local164 == null) {
										this.aClass3_Sub5Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass3_Sub5_8;
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
				@Pc(207) Class3_Sub5 local207 = this.aClass3_Sub5Array6[local56];
				this.aClass3_Sub5Array6[local56] = this.aClass3_Sub5Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class3_Sub5 local221 = local207.aClass3_Sub5_8;
					local207.aClass3_Sub5_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt3691 < 0) {
			this.anInt3691 = 0;
		}
		if (this.aClass3_Sub5_7 != null) {
			this.aClass3_Sub5_7.method2773(arg0, 0, 256);
		}
		this.aLong131 = Static150.method2481();
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "()I")
	protected int method2662() throws Exception {
		return this.anInt3699;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "()V")
	protected void method2663() throws Exception {
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "()V")
	protected void method2664() throws Exception {
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V")
	private void method2665() {
		this.anInt3691 -= 256;
		if (this.anInt3691 < 0) {
			this.anInt3691 = 0;
		}
		if (this.aClass3_Sub5_7 != null) {
			this.aClass3_Sub5_7.method2769(256);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!le;B)V")
	public final synchronized void method2666(@OriginalArg(0) Class3_Sub5 arg0) {
		this.aClass3_Sub5_7 = arg0;
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)V")
	public final synchronized void method2667() {
		if (this.anIntArray418 == null) {
			return;
		}
		@Pc(12) long local12 = Static150.method2481();
		try {
			if (this.aLong132 != 0L) {
				if (local12 < this.aLong132) {
					return;
				}
				this.method2658(this.anInt3699);
				this.aLong132 = 0L;
				this.aBoolean158 = true;
			}
			@Pc(38) int local38 = this.method2662();
			@Pc(44) int local44 = this.anInt3694 + this.anInt3695;
			if (this.anInt3697 < this.anInt3698 - local38) {
				this.anInt3697 = this.anInt3698 - local38;
			}
			if (local44 + 256 > 16384) {
				local44 = 16128;
			}
			if (local44 + 256 > this.anInt3699) {
				local38 = 0;
				this.anInt3699 += 1024;
				if (this.anInt3699 > 16384) {
					this.anInt3699 = 16384;
				}
				this.method2668();
				this.method2658(this.anInt3699);
				this.aBoolean158 = true;
				if (local44 + 256 > this.anInt3699) {
					local44 = this.anInt3699 - 256;
					this.anInt3694 = local44 - this.anInt3695;
				}
			}
			while (local44 > local38) {
				this.method2661(this.anIntArray418);
				this.method2663();
				local38 += 256;
			}
			if (local12 > this.aLong133) {
				if (this.aBoolean158) {
					this.aBoolean158 = false;
				} else if (this.anInt3697 == 0 && this.anInt3696 == 0) {
					this.method2668();
					this.aLong132 = local12 + 2000L;
					return;
				} else {
					this.anInt3694 = Math.min(this.anInt3696, this.anInt3697);
					this.anInt3696 = this.anInt3697;
				}
				this.aLong133 = local12 + 2000L;
				this.anInt3697 = 0;
			}
			this.anInt3698 = local38;
		} catch (@Pc(202) Exception local202) {
			this.method2668();
			this.aLong132 = local12 + 2000L;
		}
		try {
			if (this.aLong131 + 500000L < local12) {
				local12 = this.aLong131;
			}
			while (local12 > this.aLong131 + 5000L) {
				this.method2665();
				this.aLong131 += 256000 / Static149.anInt3584;
			}
		} catch (@Pc(251) Exception local251) {
			this.aLong131 = local12;
		}
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "()V")
	protected void method2668() {
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(I)V")
	public final void method2669() {
		this.aBoolean158 = true;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V")
	public final synchronized void method2670() {
		this.aBoolean158 = true;
		try {
			this.method2664();
		} catch (@Pc(10) Exception local10) {
			this.method2668();
			this.aLong132 = Static150.method2481() + 2000L;
		}
	}

	@OriginalMember(owner = "client!eh", name = "e", descriptor = "(I)V")
	public final synchronized void method2671() {
		if (Static89.aClass34_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static89.aClass34_1.aClass12Array1[local11] == this) {
					Static89.aClass34_1.aClass12Array1[local11] = null;
				}
				if (Static89.aClass34_1.aClass12Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static89.aClass34_1.aBoolean61 = true;
				while (Static89.aClass34_1.aBoolean62) {
					Static35.method627(50L);
				}
				Static89.aClass34_1 = null;
			}
		}
		this.method2668();
		this.anIntArray418 = null;
	}
}
