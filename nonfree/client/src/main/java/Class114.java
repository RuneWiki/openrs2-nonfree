import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qn")
public class Class114 {

	@OriginalMember(owner = "client!qn", name = "e", descriptor = "Lclient!mha;")
	private Class6_Sub4 aClass6_Sub4_5;

	@OriginalMember(owner = "client!qn", name = "i", descriptor = "[I")
	public int[] anIntArray219;

	@OriginalMember(owner = "client!qn", name = "u", descriptor = "I")
	public int anInt5164;

	@OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
	public int anInt5169;

	@OriginalMember(owner = "client!qn", name = "C", descriptor = "I")
	private int anInt5170;

	@OriginalMember(owner = "client!qn", name = "n", descriptor = "Z")
	private boolean aBoolean414 = false;

	@OriginalMember(owner = "client!qn", name = "g", descriptor = "I")
	private final int anInt5154 = 32;

	@OriginalMember(owner = "client!qn", name = "j", descriptor = "J")
	private long aLong140 = Static582.method8056();

	@OriginalMember(owner = "client!qn", name = "y", descriptor = "I")
	private int anInt5167 = 0;

	@OriginalMember(owner = "client!qn", name = "x", descriptor = "I")
	private int anInt5166 = 0;

	@OriginalMember(owner = "client!qn", name = "D", descriptor = "[Lclient!mha;")
	private final Class6_Sub4[] aClass6_Sub4Array5 = new Class6_Sub4[8];

	@OriginalMember(owner = "client!qn", name = "B", descriptor = "J")
	private long aLong142 = 0L;

	@OriginalMember(owner = "client!qn", name = "w", descriptor = "I")
	private int anInt5165 = 0;

	@OriginalMember(owner = "client!qn", name = "v", descriptor = "Z")
	private boolean aBoolean415 = true;

	@OriginalMember(owner = "client!qn", name = "t", descriptor = "J")
	private long aLong141 = 0L;

	@OriginalMember(owner = "client!qn", name = "F", descriptor = "[Lclient!mha;")
	private final Class6_Sub4[] aClass6_Sub4Array6 = new Class6_Sub4[8];

	@OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
	private int anInt5168 = 0;

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)V")
	public final synchronized void method4222() {
		this.aBoolean415 = true;
		try {
			this.method4232();
		} catch (@Pc(18) Exception local18) {
			this.method4235();
			this.aLong142 = Static582.method8056() + 2000L;
		}
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(I)V")
	public void method4223(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILclient!mha;I)V")
	private void method4224(@OriginalArg(1) Class6_Sub4 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class6_Sub4 local12 = this.aClass6_Sub4Array6[local7];
		if (local12 == null) {
			this.aClass6_Sub4Array5[local7] = arg0;
		} else {
			local12.aClass6_Sub4_9 = arg0;
		}
		this.aClass6_Sub4Array6[local7] = arg0;
		arg0.anInt10607 = arg1;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(ILclient!mha;)V")
	public final synchronized void method4225(@OriginalArg(1) Class6_Sub4 arg0) {
		this.aClass6_Sub4_5 = arg0;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method4226(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "([II)V")
	private void method4228(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static528.aBoolean739) {
			local1 = 512;
		}
		Static653.method6536(arg0, 0, local1);
		this.anInt5168 -= 256;
		if (this.aClass6_Sub4_5 != null && this.anInt5168 <= 0) {
			this.anInt5168 += Static322.anInt6392 >> 4;
			Static439.method6719(this.aClass6_Sub4_5);
			this.method4224(this.aClass6_Sub4_5, this.aClass6_Sub4_5.method8633());
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
						@Pc(88) Class6_Sub4 local88 = null;
						@Pc(93) Class6_Sub4 local93 = this.aClass6_Sub4Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class6_Sub27 local97 = local93.aClass6_Sub27_6;
								if (local97 == null || local97.anInt5145 <= local61) {
									local93.aBoolean834 = true;
									@Pc(121) int local121 = local93.method8636();
									local45 += local121;
									if (local97 != null) {
										local97.anInt5145 += local121;
									}
									if (local45 >= this.anInt5154) {
										break label103;
									}
									@Pc(140) Class6_Sub4 local140 = local93.method8632();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt10607;
										while (local140 != null) {
											this.method4224(local140, local145 * local140.method8633() >> 8);
											local140 = local93.method8637();
										}
									}
									@Pc(164) Class6_Sub4 local164 = local93.aClass6_Sub4_9;
									local93.aClass6_Sub4_9 = null;
									if (local88 == null) {
										this.aClass6_Sub4Array5[local56] = local164;
									} else {
										local88.aClass6_Sub4_9 = local164;
									}
									if (local164 == null) {
										this.aClass6_Sub4Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass6_Sub4_9;
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
				@Pc(207) Class6_Sub4 local207 = this.aClass6_Sub4Array5[local56];
				this.aClass6_Sub4Array5[local56] = this.aClass6_Sub4Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class6_Sub4 local221 = local207.aClass6_Sub4_9;
					local207.aClass6_Sub4_9 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt5168 < 0) {
			this.anInt5168 = 0;
		}
		if (this.aClass6_Sub4_5 != null) {
			this.aClass6_Sub4_5.method8635(arg0, 0, 256);
		}
		this.aLong140 = Static582.method8056();
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "(B)V")
	public final synchronized void method4229() {
		if (Static333.aClass120_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static333.aClass120_1.aClass114Array1[local7] == this) {
					Static333.aClass120_1.aClass114Array1[local7] = null;
				}
				if (Static333.aClass120_1.aClass114Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static333.aClass120_1.aBoolean333 = true;
				while (Static333.aClass120_1.aBoolean334) {
					Static344.method5698(50L);
				}
				Static333.aClass120_1 = null;
			}
		}
		this.method4235();
		this.anIntArray219 = null;
		this.aBoolean414 = true;
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "()V")
	protected void method4230() throws Exception {
	}

	@OriginalMember(owner = "client!qn", name = "b", descriptor = "()I")
	protected int method4231() throws Exception {
		return this.anInt5164;
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "()V")
	protected void method4232() throws Exception {
	}

	@OriginalMember(owner = "client!qn", name = "a", descriptor = "(II)V")
	private void method4233() {
		this.anInt5168 -= 256;
		if (this.anInt5168 < 0) {
			this.anInt5168 = 0;
		}
		if (this.aClass6_Sub4_5 != null) {
			this.aClass6_Sub4_5.method8631(256);
		}
	}

	@OriginalMember(owner = "client!qn", name = "c", descriptor = "(B)V")
	public final synchronized void method4234() {
		if (this.aBoolean414) {
			return;
		}
		@Pc(12) long local12 = Static582.method8056();
		try {
			if (this.aLong140 + 6000L < local12) {
				this.aLong140 = local12 - 6000L;
			}
			while (this.aLong140 + 5000L < local12) {
				this.method4233();
				this.aLong140 += (long) (256000 / Static322.anInt6392);
				local12 = Static582.method8056();
			}
		} catch (@Pc(51) Exception local51) {
			this.aLong140 = local12;
		}
		if (this.anIntArray219 == null) {
			return;
		}
		try {
			if (this.aLong142 != 0L) {
				if (local12 < this.aLong142) {
					return;
				}
				this.method4223(this.anInt5164);
				this.aLong142 = 0L;
				this.aBoolean415 = true;
			}
			@Pc(91) int local91 = this.method4231();
			if (this.anInt5166 - local91 > this.anInt5165) {
				this.anInt5165 = this.anInt5166 - local91;
			}
			@Pc(115) int local115 = this.anInt5170 + this.anInt5169;
			if (local115 + 256 > 16384) {
				local115 = 16128;
			}
			if (this.anInt5164 < local115 + 256) {
				this.anInt5164 += 1024;
				if (this.anInt5164 > 16384) {
					this.anInt5164 = 16384;
				}
				this.method4235();
				this.method4223(this.anInt5164);
				local91 = 0;
				this.aBoolean415 = true;
				if (this.anInt5164 < local115 + 256) {
					local115 = this.anInt5164 - 256;
					this.anInt5170 = local115 - this.anInt5169;
				}
			}
			while (local115 > local91) {
				this.method4228(this.anIntArray219);
				this.method4230();
				local91 += 256;
			}
			if (this.aLong141 < local12) {
				if (this.aBoolean415) {
					this.aBoolean415 = false;
				} else if (this.anInt5165 == 0 && this.anInt5167 == 0) {
					this.method4235();
					this.aLong142 = local12 + 2000L;
					return;
				} else {
					this.anInt5170 = Math.min(this.anInt5167, this.anInt5165);
					this.anInt5167 = this.anInt5165;
				}
				this.anInt5165 = 0;
				this.aLong141 = local12 + 2000L;
			}
			this.anInt5166 = local91;
		} catch (@Pc(247) Exception local247) {
			this.method4235();
			this.aLong142 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!qn", name = "d", descriptor = "()V")
	protected void method4235() {
	}
}
