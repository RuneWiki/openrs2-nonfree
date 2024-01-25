import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public class Class104 {

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "Lclient!ft;")
	private Class2_Sub12 aClass2_Sub12_8;

	@OriginalMember(owner = "client!lr", name = "p", descriptor = "[I")
	public int[] anIntArray768;

	@OriginalMember(owner = "client!lr", name = "A", descriptor = "I")
	public int anInt9407;

	@OriginalMember(owner = "client!lr", name = "G", descriptor = "I")
	public int anInt9410;

	@OriginalMember(owner = "client!lr", name = "L", descriptor = "I")
	private int anInt9413;

	@OriginalMember(owner = "client!lr", name = "t", descriptor = "Z")
	private boolean aBoolean678 = false;

	@OriginalMember(owner = "client!lr", name = "w", descriptor = "I")
	private final int anInt9403 = 32;

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "J")
	private long aLong242 = Static143.method2502();

	@OriginalMember(owner = "client!lr", name = "D", descriptor = "I")
	private int anInt9408 = 0;

	@OriginalMember(owner = "client!lr", name = "F", descriptor = "I")
	private int anInt9409 = 0;

	@OriginalMember(owner = "client!lr", name = "E", descriptor = "[Lclient!ft;")
	private final Class2_Sub12[] aClass2_Sub12Array5 = new Class2_Sub12[8];

	@OriginalMember(owner = "client!lr", name = "C", descriptor = "J")
	private long aLong244 = 0L;

	@OriginalMember(owner = "client!lr", name = "I", descriptor = "Z")
	private boolean aBoolean679 = true;

	@OriginalMember(owner = "client!lr", name = "B", descriptor = "J")
	private long aLong243 = 0L;

	@OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
	private int anInt9412 = 0;

	@OriginalMember(owner = "client!lr", name = "K", descriptor = "[Lclient!ft;")
	private final Class2_Sub12[] aClass2_Sub12Array6 = new Class2_Sub12[8];

	@OriginalMember(owner = "client!lr", name = "H", descriptor = "I")
	private int anInt9411 = 0;

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(II)V")
	private void method7805() {
		this.anInt9412 -= 256;
		if (this.anInt9412 < 0) {
			this.anInt9412 = 0;
		}
		if (this.aClass2_Sub12_8 != null) {
			this.aClass2_Sub12_8.method7193(256);
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(I)V")
	public final synchronized void method7806() {
		this.aBoolean679 = true;
		try {
			this.method7820();
		} catch (@Pc(18) Exception local18) {
			this.method7811();
			this.aLong244 = Static143.method2502() + 2000L;
		}
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "(I)V")
	public final synchronized void method7807() {
		if (this.aBoolean678) {
			return;
		}
		@Pc(12) long local12 = Static143.method2502();
		try {
			if (this.aLong242 + 500000L < local12) {
				this.aLong242 = local12 - 500000L;
			}
			while (local12 > this.aLong242 + 5000L) {
				this.method7805();
				this.aLong242 += 256000 / Static302.anInt5530;
			}
		} catch (@Pc(56) Exception local56) {
			this.aLong242 = local12;
		}
		if (this.anIntArray768 == null) {
			return;
		}
		try {
			if (this.aLong244 != 0L) {
				if (local12 < this.aLong244) {
					return;
				}
				this.method7819(this.anInt9407);
				this.aLong244 = 0L;
				this.aBoolean679 = true;
			}
			@Pc(97) int local97 = this.method7808();
			if (this.anInt9409 < this.anInt9408 - local97) {
				this.anInt9409 = this.anInt9408 - local97;
			}
			@Pc(118) int local118 = this.anInt9410 + this.anInt9413;
			if (local118 + 256 > 16384) {
				local118 = 16128;
			}
			if (local118 + 256 > this.anInt9407) {
				this.anInt9407 += 1024;
				if (this.anInt9407 > 16384) {
					this.anInt9407 = 16384;
				}
				this.method7811();
				this.method7819(this.anInt9407);
				local97 = 0;
				if (local118 + 256 > this.anInt9407) {
					local118 = this.anInt9407 - 256;
					this.anInt9413 = local118 - this.anInt9410;
				}
				this.aBoolean679 = true;
			}
			while (local118 > local97) {
				this.method7817(this.anIntArray768);
				this.method7812();
				local97 += 256;
			}
			if (local12 > this.aLong243) {
				if (this.aBoolean679) {
					this.aBoolean679 = false;
				} else if (this.anInt9409 == 0 && this.anInt9411 == 0) {
					this.method7811();
					this.aLong244 = local12 + 2000L;
					return;
				} else {
					this.anInt9413 = Math.min(this.anInt9411, this.anInt9409);
					this.anInt9411 = this.anInt9409;
				}
				this.anInt9409 = 0;
				this.aLong243 = local12 + 2000L;
			}
			this.anInt9408 = local97;
		} catch (@Pc(254) Exception local254) {
			this.method7811();
			this.aLong244 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "()I")
	protected int method7808() throws Exception {
		return this.anInt9407;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(IILclient!ft;)V")
	private void method7809(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(18) Class2_Sub12 local18 = this.aClass2_Sub12Array5[local7];
		if (local18 == null) {
			this.aClass2_Sub12Array6[local7] = arg1;
		} else {
			local18.aClass2_Sub12_7 = arg1;
		}
		this.aClass2_Sub12Array5[local7] = arg1;
		arg1.anInt8578 = arg0;
	}

	@OriginalMember(owner = "client!lr", name = "b", descriptor = "()V")
	protected void method7811() {
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "()V")
	protected void method7812() throws Exception {
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!ft;)V")
	public final synchronized void method7813(@OriginalArg(1) Class2_Sub12 arg0) {
		this.aClass2_Sub12_8 = arg0;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method7814(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(B)V")
	public final synchronized void method7816() {
		if (Static216.aClass194_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static216.aClass194_1.aClass104Array1[local7] == this) {
					Static216.aClass194_1.aClass104Array1[local7] = null;
				}
				if (Static216.aClass194_1.aClass104Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static216.aClass194_1.aBoolean417 = true;
				while (Static216.aClass194_1.aBoolean418) {
					Static379.method5233(50L);
				}
				Static216.aClass194_1 = null;
			}
		}
		this.method7811();
		this.aBoolean678 = true;
		this.anIntArray768 = null;
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "([II)V")
	private void method7817(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static313.aBoolean513) {
			local1 = 512;
		}
		Static553.method3368(arg0, 0, local1);
		this.anInt9412 -= 256;
		if (this.aClass2_Sub12_8 != null && this.anInt9412 <= 0) {
			this.anInt9412 += Static302.anInt5530 >> 4;
			Static468.method7052(this.aClass2_Sub12_8);
			this.method7809(this.aClass2_Sub12_8.method7197(), this.aClass2_Sub12_8);
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
						@Pc(88) Class2_Sub12 local88 = null;
						@Pc(93) Class2_Sub12 local93 = this.aClass2_Sub12Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub31 local97 = local93.aClass2_Sub31_5;
								if (local97 == null || local97.anInt5383 <= local61) {
									local93.aBoolean617 = true;
									@Pc(121) int local121 = local93.method7191();
									local45 += local121;
									if (local97 != null) {
										local97.anInt5383 += local121;
									}
									if (local45 >= this.anInt9403) {
										break label103;
									}
									@Pc(140) Class2_Sub12 local140 = local93.method7195();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt8578;
										while (local140 != null) {
											this.method7809(local145 * local140.method7197() >> 8, local140);
											local140 = local93.method7196();
										}
									}
									@Pc(164) Class2_Sub12 local164 = local93.aClass2_Sub12_7;
									local93.aClass2_Sub12_7 = null;
									if (local88 == null) {
										this.aClass2_Sub12Array6[local56] = local164;
									} else {
										local88.aClass2_Sub12_7 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub12Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub12_7;
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
				@Pc(207) Class2_Sub12 local207 = this.aClass2_Sub12Array6[local56];
				this.aClass2_Sub12Array6[local56] = this.aClass2_Sub12Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub12 local221 = local207.aClass2_Sub12_7;
					local207.aClass2_Sub12_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt9412 < 0) {
			this.anInt9412 = 0;
		}
		if (this.aClass2_Sub12_8 != null) {
			this.aClass2_Sub12_8.method7192(arg0, 0, 256);
		}
		this.aLong242 = Static143.method2502();
	}

	@OriginalMember(owner = "client!lr", name = "c", descriptor = "(I)V")
	public void method7819(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!lr", name = "d", descriptor = "()V")
	protected void method7820() throws Exception {
	}
}
