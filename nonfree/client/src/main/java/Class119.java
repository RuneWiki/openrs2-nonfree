import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!it")
public class Class119 {

	@OriginalMember(owner = "client!it", name = "b", descriptor = "[I")
	public int[] anIntArray603;

	@OriginalMember(owner = "client!it", name = "n", descriptor = "Lclient!me;")
	private Class3_Sub8 aClass3_Sub8_8;

	@OriginalMember(owner = "client!it", name = "C", descriptor = "I")
	public int anInt5529;

	@OriginalMember(owner = "client!it", name = "G", descriptor = "I")
	public int anInt5532;

	@OriginalMember(owner = "client!it", name = "H", descriptor = "I")
	private int anInt5533;

	@OriginalMember(owner = "client!it", name = "j", descriptor = "I")
	private final int anInt5516 = 32;

	@OriginalMember(owner = "client!it", name = "p", descriptor = "Z")
	private boolean aBoolean428 = false;

	@OriginalMember(owner = "client!it", name = "h", descriptor = "J")
	private long aLong202 = Static288.method4512();

	@OriginalMember(owner = "client!it", name = "A", descriptor = "[Lclient!me;")
	private final Class3_Sub8[] aClass3_Sub8Array6 = new Class3_Sub8[8];

	@OriginalMember(owner = "client!it", name = "z", descriptor = "J")
	private long aLong203 = 0L;

	@OriginalMember(owner = "client!it", name = "y", descriptor = "[Lclient!me;")
	private final Class3_Sub8[] aClass3_Sub8Array5 = new Class3_Sub8[8];

	@OriginalMember(owner = "client!it", name = "w", descriptor = "Z")
	private boolean aBoolean429 = true;

	@OriginalMember(owner = "client!it", name = "D", descriptor = "I")
	private int anInt5530 = 0;

	@OriginalMember(owner = "client!it", name = "E", descriptor = "I")
	private int anInt5531 = 0;

	@OriginalMember(owner = "client!it", name = "x", descriptor = "I")
	private int anInt5527 = 0;

	@OriginalMember(owner = "client!it", name = "v", descriptor = "I")
	private int anInt5526 = 0;

	@OriginalMember(owner = "client!it", name = "F", descriptor = "J")
	private long aLong204 = 0L;

	static {
		new Class57("From", "Von:", "De", "De");
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V")
	public void method4978(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "()V")
	protected void method4979() throws Exception {
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "()V")
	protected void method4980() throws Exception {
	}

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V")
	public final synchronized void method4981() {
		if (this.aBoolean428) {
			return;
		}
		@Pc(12) long local12 = Static288.method4512();
		try {
			if (local12 > this.aLong202 + 500000L) {
				this.aLong202 = local12 - 500000L;
			}
			while (this.aLong202 + 5000L < local12) {
				this.method4985();
				this.aLong202 += 256000 / Static374.anInt6244;
			}
		} catch (@Pc(54) Exception local54) {
			this.aLong202 = local12;
		}
		if (this.anIntArray603 == null) {
			return;
		}
		try {
			if (this.aLong203 != 0L) {
				if (local12 < this.aLong203) {
					return;
				}
				this.method4978(this.anInt5529);
				this.aLong203 = 0L;
				this.aBoolean429 = true;
			}
			@Pc(91) int local91 = this.method4995();
			if (this.anInt5530 - local91 > this.anInt5527) {
				this.anInt5527 = this.anInt5530 - local91;
			}
			@Pc(112) int local112 = this.anInt5533 + this.anInt5532;
			if (local112 + 256 > 16384) {
				local112 = 16128;
			}
			if (local112 + 256 > this.anInt5529) {
				this.anInt5529 += 1024;
				if (this.anInt5529 > 16384) {
					this.anInt5529 = 16384;
				}
				this.method4984();
				this.method4978(this.anInt5529);
				local91 = 0;
				this.aBoolean429 = true;
				if (local112 + 256 > this.anInt5529) {
					local112 = this.anInt5529 - 256;
					this.anInt5533 = local112 - this.anInt5532;
				}
			}
			while (local91 < local112) {
				this.method4990(this.anIntArray603);
				this.method4980();
				local91 += 256;
			}
			if (local12 > this.aLong204) {
				if (this.aBoolean429) {
					this.aBoolean429 = false;
				} else if (this.anInt5527 == 0 && this.anInt5531 == 0) {
					this.method4984();
					this.aLong203 = local12 + 2000L;
					return;
				} else {
					this.anInt5533 = Math.min(this.anInt5531, this.anInt5527);
					this.anInt5531 = this.anInt5527;
				}
				this.aLong204 = local12 + 2000L;
				this.anInt5527 = 0;
			}
			this.anInt5530 = local91;
		} catch (@Pc(243) Exception local243) {
			this.method4984();
			this.aLong203 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!it", name = "c", descriptor = "(I)V")
	public final synchronized void method4982() {
		if (Static254.aClass237_2 != null) {
			@Pc(10) boolean local10 = true;
			for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
				if (Static254.aClass237_2.aClass119Array1[local12] == this) {
					Static254.aClass237_2.aClass119Array1[local12] = null;
				}
				if (Static254.aClass237_2.aClass119Array1[local12] != null) {
					local10 = false;
				}
			}
			if (local10) {
				Static254.aClass237_2.aBoolean486 = true;
				while (Static254.aClass237_2.aBoolean485) {
					Static37.method613(50L);
				}
				Static254.aClass237_2 = null;
			}
		}
		this.method4984();
		this.anIntArray603 = null;
		this.aBoolean428 = true;
	}

	@OriginalMember(owner = "client!it", name = "d", descriptor = "(I)V")
	public final void method4983() {
		this.aBoolean429 = true;
	}

	@OriginalMember(owner = "client!it", name = "c", descriptor = "()V")
	protected void method4984() {
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(II)V")
	private void method4985() {
		this.anInt5526 -= 256;
		if (this.anInt5526 < 0) {
			this.anInt5526 = 0;
		}
		if (this.aClass3_Sub8_8 != null) {
			this.aClass3_Sub8_8.method2131(256);
		}
	}

	@OriginalMember(owner = "client!it", name = "e", descriptor = "(I)V")
	public final synchronized void method4986() {
		this.aBoolean429 = true;
		try {
			this.method4979();
		} catch (@Pc(10) Exception local10) {
			this.method4984();
			this.aLong203 = Static288.method4512() + 2000L;
		}
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(ZILclient!me;)V")
	private void method4988(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub8 arg1) {
		@Pc(11) int local11 = arg0 >> 5;
		@Pc(16) Class3_Sub8 local16 = this.aClass3_Sub8Array6[local11];
		if (local16 == null) {
			this.aClass3_Sub8Array5[local11] = arg1;
		} else {
			local16.aClass3_Sub8_5 = arg1;
		}
		this.aClass3_Sub8Array6[local11] = arg1;
		arg1.anInt2544 = arg0;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "([II)V")
	private void method4990(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static340.aBoolean439) {
			local1 = 512;
		}
		Static400.method1876(arg0, 0, local1);
		this.anInt5526 -= 256;
		if (this.aClass3_Sub8_8 != null && this.anInt5526 <= 0) {
			this.anInt5526 += Static374.anInt6244 >> 4;
			Static261.method4204(this.aClass3_Sub8_8);
			this.method4988(this.aClass3_Sub8_8.method2130(), this.aClass3_Sub8_8);
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
						@Pc(88) Class3_Sub8 local88 = null;
						@Pc(93) Class3_Sub8 local93 = this.aClass3_Sub8Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class3_Sub29 local97 = local93.aClass3_Sub29_5;
								if (local97 == null || local97.anInt4130 <= local61) {
									local93.aBoolean191 = true;
									@Pc(121) int local121 = local93.method2125();
									local45 += local121;
									if (local97 != null) {
										local97.anInt4130 += local121;
									}
									if (local45 >= this.anInt5516) {
										break label103;
									}
									@Pc(140) Class3_Sub8 local140 = local93.method2128();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt2544;
										while (local140 != null) {
											this.method4988(local145 * local140.method2130() >> 8, local140);
											local140 = local93.method2126();
										}
									}
									@Pc(164) Class3_Sub8 local164 = local93.aClass3_Sub8_5;
									local93.aClass3_Sub8_5 = null;
									if (local88 == null) {
										this.aClass3_Sub8Array5[local56] = local164;
									} else {
										local88.aClass3_Sub8_5 = local164;
									}
									if (local164 == null) {
										this.aClass3_Sub8Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass3_Sub8_5;
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
				@Pc(207) Class3_Sub8 local207 = this.aClass3_Sub8Array5[local56];
				this.aClass3_Sub8Array5[local56] = this.aClass3_Sub8Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class3_Sub8 local221 = local207.aClass3_Sub8_5;
					local207.aClass3_Sub8_5 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt5526 < 0) {
			this.anInt5526 = 0;
		}
		if (this.aClass3_Sub8_8 != null) {
			this.aClass3_Sub8_8.method2129(arg0, 0, 256);
		}
		this.aLong202 = Static288.method4512();
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(BLclient!me;)V")
	public final synchronized void method4991(@OriginalArg(1) Class3_Sub8 arg0) {
		this.aClass3_Sub8_8 = arg0;
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method4993(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!it", name = "d", descriptor = "()I")
	protected int method4995() throws Exception {
		return this.anInt5529;
	}
}
