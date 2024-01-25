import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public class Class30 {

	@OriginalMember(owner = "client!ea", name = "g", descriptor = "Lclient!mq;")
	private Class3_Sub2 aClass3_Sub2_7;

	@OriginalMember(owner = "client!ea", name = "o", descriptor = "[I")
	public int[] anIntArray429;

	@OriginalMember(owner = "client!ea", name = "I", descriptor = "I")
	public int anInt5348;

	@OriginalMember(owner = "client!ea", name = "L", descriptor = "I")
	private int anInt5350;

	@OriginalMember(owner = "client!ea", name = "O", descriptor = "I")
	public int anInt5351;

	@OriginalMember(owner = "client!ea", name = "A", descriptor = "I")
	private final int anInt5343 = 32;

	@OriginalMember(owner = "client!ea", name = "B", descriptor = "Z")
	private boolean aBoolean329 = false;

	@OriginalMember(owner = "client!ea", name = "w", descriptor = "J")
	private long aLong172 = Static53.method898();

	@OriginalMember(owner = "client!ea", name = "E", descriptor = "I")
	private int anInt5345 = 0;

	@OriginalMember(owner = "client!ea", name = "D", descriptor = "J")
	private long aLong173 = 0L;

	@OriginalMember(owner = "client!ea", name = "F", descriptor = "I")
	private int anInt5346 = 0;

	@OriginalMember(owner = "client!ea", name = "H", descriptor = "Z")
	private boolean aBoolean330 = true;

	@OriginalMember(owner = "client!ea", name = "J", descriptor = "[Lclient!mq;")
	private final Class3_Sub2[] aClass3_Sub2Array5 = new Class3_Sub2[8];

	@OriginalMember(owner = "client!ea", name = "K", descriptor = "I")
	private int anInt5349 = 0;

	@OriginalMember(owner = "client!ea", name = "N", descriptor = "[Lclient!mq;")
	private final Class3_Sub2[] aClass3_Sub2Array6 = new Class3_Sub2[8];

	@OriginalMember(owner = "client!ea", name = "G", descriptor = "I")
	private int anInt5347 = 0;

	@OriginalMember(owner = "client!ea", name = "M", descriptor = "J")
	private long aLong174 = 0L;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Z)V")
	public final synchronized void method4510() {
		if (Static240.aClass47_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static240.aClass47_1.aClass30Array1[local7] == this) {
					Static240.aClass47_1.aClass30Array1[local7] = null;
				}
				if (Static240.aClass47_1.aClass30Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static240.aClass47_1.aBoolean67 = true;
				while (Static240.aClass47_1.aBoolean68) {
					Static134.method2241(50L);
				}
				Static240.aClass47_1 = null;
			}
		}
		this.method4514();
		this.aBoolean329 = true;
		this.anIntArray429 = null;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "()I")
	protected int method4511() throws Exception {
		return this.anInt5351;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)V")
	public void method4512(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "([II)V")
	private void method4513(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static272.aBoolean339) {
			local1 = 512;
		}
		Static367.method4030(arg0, 0, local1);
		this.anInt5345 -= 256;
		if (this.aClass3_Sub2_7 != null && this.anInt5345 <= 0) {
			this.anInt5345 += Static244.anInt4835 >> 4;
			Static131.method2232(this.aClass3_Sub2_7);
			this.method4516(this.aClass3_Sub2_7.method5112(), this.aClass3_Sub2_7);
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
						@Pc(88) Class3_Sub2 local88 = null;
						@Pc(93) Class3_Sub2 local93 = this.aClass3_Sub2Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class3_Sub17 local97 = local93.aClass3_Sub17_5;
								if (local97 == null || local97.anInt2520 <= local61) {
									local93.aBoolean413 = true;
									@Pc(121) int local121 = local93.method5113();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2520 += local121;
									}
									if (local45 >= this.anInt5343) {
										break label103;
									}
									@Pc(140) Class3_Sub2 local140 = local93.method5110();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt6010;
										while (local140 != null) {
											this.method4516(local145 * local140.method5112() >> 8, local140);
											local140 = local93.method5111();
										}
									}
									@Pc(164) Class3_Sub2 local164 = local93.aClass3_Sub2_8;
									local93.aClass3_Sub2_8 = null;
									if (local88 == null) {
										this.aClass3_Sub2Array6[local56] = local164;
									} else {
										local88.aClass3_Sub2_8 = local164;
									}
									if (local164 == null) {
										this.aClass3_Sub2Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass3_Sub2_8;
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
				@Pc(207) Class3_Sub2 local207 = this.aClass3_Sub2Array6[local56];
				this.aClass3_Sub2Array6[local56] = this.aClass3_Sub2Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class3_Sub2 local221 = local207.aClass3_Sub2_8;
					local207.aClass3_Sub2_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt5345 < 0) {
			this.anInt5345 = 0;
		}
		if (this.aClass3_Sub2_7 != null) {
			this.aClass3_Sub2_7.method5109(arg0, 0, 256);
		}
		this.aLong172 = Static53.method898();
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "()V")
	protected void method4514() {
	}

	@OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V")
	public final void method4515() {
		this.aBoolean330 = true;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(BILclient!mq;)V")
	private void method4516(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub2 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class3_Sub2 local12 = this.aClass3_Sub2Array5[local7];
		if (local12 == null) {
			this.aClass3_Sub2Array6[local7] = arg1;
		} else {
			local12.aClass3_Sub2_8 = arg1;
		}
		this.aClass3_Sub2Array5[local7] = arg1;
		arg1.anInt6010 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)V")
	private void method4517() {
		this.anInt5345 -= 256;
		if (this.anInt5345 < 0) {
			this.anInt5345 = 0;
		}
		if (this.aClass3_Sub2_7 != null) {
			this.aClass3_Sub2_7.method5108(256);
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!mq;B)V")
	public final synchronized void method4518(@OriginalArg(0) Class3_Sub2 arg0) {
		this.aClass3_Sub2_7 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "()V")
	protected void method4519() throws Exception {
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
	public final synchronized void method4521() {
		this.aBoolean330 = true;
		try {
			this.method4519();
		} catch (@Pc(18) Exception local18) {
			this.method4514();
			this.aLong173 = Static53.method898() + 2000L;
		}
	}

	@OriginalMember(owner = "client!ea", name = "d", descriptor = "()V")
	protected void method4522() throws Exception {
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method4524(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(I)V")
	public final synchronized void method4527() {
		if (this.aBoolean329) {
			return;
		}
		@Pc(12) long local12 = Static53.method898();
		try {
			if (this.aLong172 + (long) 500000 < local12) {
				this.aLong172 = local12 - 500000L;
			}
			while (local12 > this.aLong172 + 5000L) {
				this.method4517();
				this.aLong172 += 256000 / Static244.anInt4835;
			}
		} catch (@Pc(49) Exception local49) {
			this.aLong172 = local12;
		}
		if (this.anIntArray429 == null) {
			return;
		}
		try {
			if (this.aLong173 != 0L) {
				if (this.aLong173 > local12) {
					return;
				}
				this.method4512(this.anInt5351);
				this.aBoolean330 = true;
				this.aLong173 = 0L;
			}
			@Pc(80) int local80 = this.method4511();
			if (this.anInt5347 < this.anInt5346 - local80) {
				this.anInt5347 = this.anInt5346 - local80;
			}
			@Pc(103) int local103 = this.anInt5350 + this.anInt5348;
			if (local103 + 256 > 16384) {
				local103 = 16128;
			}
			if (local103 + 256 > this.anInt5351) {
				this.anInt5351 += 1024;
				if (this.anInt5351 > 16384) {
					this.anInt5351 = 16384;
				}
				this.method4514();
				this.method4512(this.anInt5351);
				local80 = 0;
				this.aBoolean330 = true;
				if (this.anInt5351 < local103 + 256) {
					local103 = this.anInt5351 - 256;
					this.anInt5350 = local103 - this.anInt5348;
				}
			}
			while (local103 > local80) {
				this.method4513(this.anIntArray429);
				local80 += 256;
				this.method4522();
			}
			if (local12 > this.aLong174) {
				if (this.aBoolean330) {
					this.aBoolean330 = false;
				} else if (this.anInt5347 == 0 && this.anInt5349 == 0) {
					this.method4514();
					this.aLong173 = local12 + 2000L;
					return;
				} else {
					this.anInt5350 = Math.min(this.anInt5349, this.anInt5347);
					this.anInt5349 = this.anInt5347;
				}
				this.aLong174 = local12 + 2000L;
				this.anInt5347 = 0;
			}
			this.anInt5346 = local80;
		} catch (@Pc(229) Exception local229) {
			this.method4514();
			this.aLong173 = local12 + 2000L;
		}
	}
}
