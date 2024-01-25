import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ir")
public class Class94 {

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "[I")
	public int[] anIntArray508;

	@OriginalMember(owner = "client!ir", name = "q", descriptor = "Lclient!j;")
	private Class2_Sub3 aClass2_Sub3_8;

	@OriginalMember(owner = "client!ir", name = "C", descriptor = "I")
	private int anInt6951;

	@OriginalMember(owner = "client!ir", name = "G", descriptor = "I")
	public int anInt6953;

	@OriginalMember(owner = "client!ir", name = "H", descriptor = "I")
	public int anInt6954;

	@OriginalMember(owner = "client!ir", name = "g", descriptor = "Z")
	private boolean aBoolean618 = false;

	@OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
	private final int anInt6937 = 32;

	@OriginalMember(owner = "client!ir", name = "l", descriptor = "J")
	private long aLong214 = Static51.method1197();

	@OriginalMember(owner = "client!ir", name = "B", descriptor = "I")
	private int anInt6950 = 0;

	@OriginalMember(owner = "client!ir", name = "z", descriptor = "Z")
	private boolean aBoolean619 = true;

	@OriginalMember(owner = "client!ir", name = "x", descriptor = "J")
	private long aLong215 = 0L;

	@OriginalMember(owner = "client!ir", name = "D", descriptor = "[Lclient!j;")
	private final Class2_Sub3[] aClass2_Sub3Array5 = new Class2_Sub3[8];

	@OriginalMember(owner = "client!ir", name = "E", descriptor = "I")
	private int anInt6952 = 0;

	@OriginalMember(owner = "client!ir", name = "F", descriptor = "[Lclient!j;")
	private final Class2_Sub3[] aClass2_Sub3Array6 = new Class2_Sub3[8];

	@OriginalMember(owner = "client!ir", name = "I", descriptor = "J")
	private long aLong216 = 0L;

	@OriginalMember(owner = "client!ir", name = "J", descriptor = "I")
	private int anInt6955 = 0;

	@OriginalMember(owner = "client!ir", name = "y", descriptor = "I")
	private int anInt6949 = 0;

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZ)V")
	private void method5965() {
		this.anInt6955 -= 256;
		if (this.anInt6955 < 0) {
			this.anInt6955 = 0;
		}
		if (this.aClass2_Sub3_8 != null) {
			this.aClass2_Sub3_8.method4473(256);
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!j;I)V")
	public final synchronized void method5967(@OriginalArg(0) Class2_Sub3 arg0) {
		this.aClass2_Sub3_8 = arg0;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
	public void method5968(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)V")
	public final void method5969() {
		this.aBoolean619 = true;
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "()V")
	protected void method5970() {
	}

	@OriginalMember(owner = "client!ir", name = "b", descriptor = "()I")
	protected int method5971() throws Exception {
		return this.anInt6953;
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)V")
	public final synchronized void method5972() {
		if (Static290.aClass135_1 != null) {
			@Pc(12) boolean local12 = true;
			for (@Pc(14) int local14 = 0; local14 < 2; local14++) {
				if (Static290.aClass135_1.aClass94Array1[local14] == this) {
					Static290.aClass135_1.aClass94Array1[local14] = null;
				}
				if (Static290.aClass135_1.aClass94Array1[local14] != null) {
					local12 = false;
				}
			}
			if (local12) {
				Static290.aClass135_1.aBoolean365 = true;
				while (Static290.aClass135_1.aBoolean364) {
					Static102.method2276(50L);
				}
				Static290.aClass135_1 = null;
			}
		}
		this.method5970();
		this.aBoolean618 = true;
		this.anIntArray508 = null;
	}

	@OriginalMember(owner = "client!ir", name = "c", descriptor = "()V")
	protected void method5973() throws Exception {
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(B)V")
	public final synchronized void method5974() {
		this.aBoolean619 = true;
		try {
			this.method5978();
		} catch (@Pc(18) Exception local18) {
			this.method5970();
			this.aLong216 = Static51.method1197() + 2000L;
		}
	}

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "(I)V")
	public final synchronized void method5975() {
		if (this.aBoolean618) {
			return;
		}
		@Pc(12) long local12 = Static51.method1197();
		try {
			if (local12 > this.aLong214 + 500000L) {
				this.aLong214 = local12 - 500000L;
			}
			while (this.aLong214 + 5000L < local12) {
				this.method5965();
				this.aLong214 += 256000 / Static65.anInt1429;
			}
		} catch (@Pc(56) Exception local56) {
			this.aLong214 = local12;
		}
		if (this.anIntArray508 == null) {
			return;
		}
		try {
			if (this.aLong216 != 0L) {
				if (this.aLong216 > local12) {
					return;
				}
				this.method5968(this.anInt6953);
				this.aBoolean619 = true;
				this.aLong216 = 0L;
			}
			@Pc(87) int local87 = this.method5971();
			if (this.anInt6949 < this.anInt6952 - local87) {
				this.anInt6949 = this.anInt6952 - local87;
			}
			@Pc(112) int local112 = this.anInt6954 + this.anInt6951;
			if (local112 + 256 > 16384) {
				local112 = 16128;
			}
			if (this.anInt6953 < local112 + 256) {
				this.anInt6953 += 1024;
				if (this.anInt6953 > 16384) {
					this.anInt6953 = 16384;
				}
				this.method5970();
				local87 = 0;
				this.method5968(this.anInt6953);
				if (local112 + 256 > this.anInt6953) {
					local112 = this.anInt6953 - 256;
					this.anInt6951 = local112 - this.anInt6954;
				}
				this.aBoolean619 = true;
			}
			while (local112 > local87) {
				this.method5979(this.anIntArray508);
				local87 += 256;
				this.method5973();
			}
			if (local12 > this.aLong215) {
				if (this.aBoolean619) {
					this.aBoolean619 = false;
				} else if (this.anInt6949 == 0 && this.anInt6950 == 0) {
					this.method5970();
					this.aLong216 = local12 + 2000L;
					return;
				} else {
					this.anInt6951 = Math.min(this.anInt6950, this.anInt6949);
					this.anInt6950 = this.anInt6949;
				}
				this.aLong215 = local12 + 2000L;
				this.anInt6949 = 0;
			}
			this.anInt6952 = local87;
		} catch (@Pc(247) Exception local247) {
			this.method5970();
			this.aLong216 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5977(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ir", name = "d", descriptor = "()V")
	protected void method5978() throws Exception {
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "([II)V")
	private void method5979(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static18.aBoolean55) {
			local1 = 512;
		}
		Static359.method689(arg0, 0, local1);
		this.anInt6955 -= 256;
		if (this.aClass2_Sub3_8 != null && this.anInt6955 <= 0) {
			this.anInt6955 += Static65.anInt1429 >> 4;
			Static253.method5947(this.aClass2_Sub3_8);
			this.method5980(this.aClass2_Sub3_8, this.aClass2_Sub3_8.method4478());
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
						@Pc(88) Class2_Sub3 local88 = null;
						@Pc(93) Class2_Sub3 local93 = this.aClass2_Sub3Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub12 local97 = local93.aClass2_Sub12_5;
								if (local97 == null || local97.anInt6728 <= local61) {
									local93.aBoolean442 = true;
									@Pc(121) int local121 = local93.method4474();
									local45 += local121;
									if (local97 != null) {
										local97.anInt6728 += local121;
									}
									if (local45 >= this.anInt6937) {
										break label103;
									}
									@Pc(140) Class2_Sub3 local140 = local93.method4475();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt4855;
										while (local140 != null) {
											this.method5980(local140, local145 * local140.method4478() >> 8);
											local140 = local93.method4476();
										}
									}
									@Pc(164) Class2_Sub3 local164 = local93.aClass2_Sub3_7;
									local93.aClass2_Sub3_7 = null;
									if (local88 == null) {
										this.aClass2_Sub3Array6[local56] = local164;
									} else {
										local88.aClass2_Sub3_7 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub3Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub3_7;
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
				@Pc(207) Class2_Sub3 local207 = this.aClass2_Sub3Array6[local56];
				this.aClass2_Sub3Array6[local56] = this.aClass2_Sub3Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub3 local221 = local207.aClass2_Sub3_7;
					local207.aClass2_Sub3_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt6955 < 0) {
			this.anInt6955 = 0;
		}
		if (this.aClass2_Sub3_8 != null) {
			this.aClass2_Sub3_8.method4479(arg0, 0, 256);
		}
		this.aLong214 = Static51.method1197();
	}

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(Lclient!j;IB)V")
	private void method5980(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class2_Sub3 local12 = this.aClass2_Sub3Array5[local7];
		if (local12 == null) {
			this.aClass2_Sub3Array6[local7] = arg0;
		} else {
			local12.aClass2_Sub3_7 = arg0;
		}
		this.aClass2_Sub3Array5[local7] = arg0;
		arg0.anInt4855 = arg1;
	}
}
