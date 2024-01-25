import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public class Class80 {

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "Lclient!eia;")
	private Class8_Sub16 aClass8_Sub16_5;

	@OriginalMember(owner = "client!nc", name = "k", descriptor = "[I")
	public int[] anIntArray210;

	@OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
	private int anInt3969;

	@OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
	public int anInt3971;

	@OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
	public int anInt3972;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "Z")
	private boolean aBoolean285 = false;

	@OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
	private final int anInt3963 = 32;

	@OriginalMember(owner = "client!nc", name = "n", descriptor = "J")
	private long aLong95 = Static342.method5463();

	@OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
	private int anInt3966 = 0;

	@OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
	private int anInt3968 = 0;

	@OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
	private int anInt3967 = 0;

	@OriginalMember(owner = "client!nc", name = "D", descriptor = "[Lclient!eia;")
	private final Class8_Sub16[] aClass8_Sub16Array5 = new Class8_Sub16[8];

	@OriginalMember(owner = "client!nc", name = "E", descriptor = "J")
	private long aLong97 = 0L;

	@OriginalMember(owner = "client!nc", name = "F", descriptor = "[Lclient!eia;")
	private final Class8_Sub16[] aClass8_Sub16Array6 = new Class8_Sub16[8];

	@OriginalMember(owner = "client!nc", name = "A", descriptor = "I")
	private int anInt3970 = 0;

	@OriginalMember(owner = "client!nc", name = "B", descriptor = "Z")
	private boolean aBoolean286 = true;

	@OriginalMember(owner = "client!nc", name = "y", descriptor = "J")
	private long aLong96 = 0L;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "()V")
	protected void method3190() throws Exception {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "([II)V")
	private void method3191(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static343.aBoolean463) {
			local1 = 512;
		}
		Static649.method5531(arg0, 0, local1);
		this.anInt3968 -= 256;
		if (this.aClass8_Sub16_5 != null && this.anInt3968 <= 0) {
			this.anInt3968 += Static345.anInt6689 >> 4;
			Static372.method5827(this.aClass8_Sub16_5);
			this.method3196(this.aClass8_Sub16_5, this.aClass8_Sub16_5.method7432());
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
						@Pc(88) Class8_Sub16 local88 = null;
						@Pc(93) Class8_Sub16 local93 = this.aClass8_Sub16Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class8_Sub9 local97 = local93.aClass8_Sub9_6;
								if (local97 == null || local97.anInt1945 <= local61) {
									local93.aBoolean644 = true;
									@Pc(121) int local121 = local93.method7431();
									local45 += local121;
									if (local97 != null) {
										local97.anInt1945 += local121;
									}
									if (local45 >= this.anInt3963) {
										break label103;
									}
									@Pc(140) Class8_Sub16 local140 = local93.method7434();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt9077;
										while (local140 != null) {
											this.method3196(local140, local145 * local140.method7432() >> 8);
											local140 = local93.method7429();
										}
									}
									@Pc(164) Class8_Sub16 local164 = local93.aClass8_Sub16_9;
									local93.aClass8_Sub16_9 = null;
									if (local88 == null) {
										this.aClass8_Sub16Array5[local56] = local164;
									} else {
										local88.aClass8_Sub16_9 = local164;
									}
									if (local164 == null) {
										this.aClass8_Sub16Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass8_Sub16_9;
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
				@Pc(207) Class8_Sub16 local207 = this.aClass8_Sub16Array5[local56];
				this.aClass8_Sub16Array5[local56] = this.aClass8_Sub16Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class8_Sub16 local221 = local207.aClass8_Sub16_9;
					local207.aClass8_Sub16_9 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt3968 < 0) {
			this.anInt3968 = 0;
		}
		if (this.aClass8_Sub16_5 != null) {
			this.aClass8_Sub16_5.method7430(arg0, 0, 256);
		}
		this.aLong95 = Static342.method5463();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!eia;I)V")
	public final synchronized void method3193(@OriginalArg(0) Class8_Sub16 arg0) {
		this.aClass8_Sub16_5 = arg0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
	public final synchronized void method3195() {
		if (Static364.aClass323_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static364.aClass323_1.aClass80Array1[local7] == this) {
					Static364.aClass323_1.aClass80Array1[local7] = null;
				}
				if (Static364.aClass323_1.aClass80Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static364.aClass323_1.aBoolean658 = true;
				while (Static364.aClass323_1.aBoolean659) {
					Static214.method4061(50L);
				}
				Static364.aClass323_1 = null;
			}
		}
		this.method3203();
		this.anIntArray210 = null;
		this.aBoolean285 = true;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!eia;IB)V")
	private void method3196(@OriginalArg(0) Class8_Sub16 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class8_Sub16 local12 = this.aClass8_Sub16Array6[local7];
		if (local12 == null) {
			this.aClass8_Sub16Array5[local7] = arg0;
		} else {
			local12.aClass8_Sub16_9 = arg0;
		}
		this.aClass8_Sub16Array6[local7] = arg0;
		arg0.anInt9077 = arg1;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "()I")
	protected int method3197() throws Exception {
		return this.anInt3971;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
	public final synchronized void method3198() {
		if (this.aBoolean285) {
			return;
		}
		@Pc(12) long local12 = Static342.method5463();
		try {
			if (this.aLong95 + 6000L < local12) {
				this.aLong95 = local12 - 6000L;
			}
			while (this.aLong95 + 5000L < local12) {
				this.method3205();
				this.aLong95 += 256000 / Static345.anInt6689;
				local12 = Static342.method5463();
			}
		} catch (@Pc(59) Exception local59) {
			this.aLong95 = local12;
		}
		if (this.anIntArray210 == null) {
			return;
		}
		try {
			if (this.aLong96 != 0L) {
				if (this.aLong96 > local12) {
					return;
				}
				this.method3200(this.anInt3971);
				this.aLong96 = 0L;
				this.aBoolean286 = true;
			}
			@Pc(100) int local100 = this.method3197();
			if (this.anInt3970 < this.anInt3967 - local100) {
				this.anInt3970 = this.anInt3967 - local100;
			}
			@Pc(125) int local125 = this.anInt3972 + this.anInt3969;
			if (local125 + 256 > 16384) {
				local125 = 16128;
			}
			if (this.anInt3971 < local125 + 256) {
				this.anInt3971 += 1024;
				if (this.anInt3971 > 16384) {
					this.anInt3971 = 16384;
				}
				this.method3203();
				this.method3200(this.anInt3971);
				local100 = 0;
				if (local125 + 256 > this.anInt3971) {
					local125 = this.anInt3971 - 256;
					this.anInt3969 = local125 - this.anInt3972;
				}
				this.aBoolean286 = true;
			}
			while (local100 < local125) {
				this.method3191(this.anIntArray210);
				local100 += 256;
				this.method3204();
			}
			if (local12 > this.aLong97) {
				if (this.aBoolean286) {
					this.aBoolean286 = false;
				} else if (this.anInt3970 == 0 && this.anInt3966 == 0) {
					this.method3203();
					this.aLong96 = local12 + 2000L;
					return;
				} else {
					this.anInt3969 = Math.min(this.anInt3966, this.anInt3970);
					this.anInt3966 = this.anInt3970;
				}
				this.anInt3970 = 0;
				this.aLong97 = local12 + 2000L;
			}
			this.anInt3967 = local100;
		} catch (@Pc(256) Exception local256) {
			this.method3203();
			this.aLong96 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method3199(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
	public void method3200(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)V")
	public final synchronized void method3202() {
		this.aBoolean286 = true;
		try {
			this.method3190();
		} catch (@Pc(15) Exception local15) {
			this.method3203();
			this.aLong96 = Static342.method5463() + 2000L;
		}
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "()V")
	protected void method3203() {
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "()V")
	protected void method3204() throws Exception {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)V")
	private void method3205() {
		this.anInt3968 -= 256;
		if (this.anInt3968 < 0) {
			this.anInt3968 = 0;
		}
		if (this.aClass8_Sub16_5 != null) {
			this.aClass8_Sub16_5.method7435(256);
		}
	}
}
