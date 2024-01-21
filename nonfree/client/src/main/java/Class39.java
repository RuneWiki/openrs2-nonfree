import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public class Class39 {

	@OriginalMember(owner = "client!kc", name = "D", descriptor = "[I")
	public int[] anIntArray234;

	@OriginalMember(owner = "client!kc", name = "O", descriptor = "Lclient!oc;")
	private Class4_Sub2 aClass4_Sub2_8;

	@OriginalMember(owner = "client!kc", name = "T", descriptor = "I")
	public int anInt2348;

	@OriginalMember(owner = "client!kc", name = "U", descriptor = "I")
	private int anInt2349;

	@OriginalMember(owner = "client!kc", name = "Z", descriptor = "I")
	public int anInt2353;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
	private final int anInt2332 = 32;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "J")
	private long aLong79 = Static16.method286();

	@OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
	private int anInt2347 = 0;

	@OriginalMember(owner = "client!kc", name = "Y", descriptor = "[Lclient!oc;")
	private final Class4_Sub2[] aClass4_Sub2Array6 = new Class4_Sub2[8];

	@OriginalMember(owner = "client!kc", name = "Q", descriptor = "[Lclient!oc;")
	private final Class4_Sub2[] aClass4_Sub2Array5 = new Class4_Sub2[8];

	@OriginalMember(owner = "client!kc", name = "R", descriptor = "Z")
	private boolean aBoolean108 = true;

	@OriginalMember(owner = "client!kc", name = "ab", descriptor = "I")
	private int anInt2354 = 0;

	@OriginalMember(owner = "client!kc", name = "bb", descriptor = "J")
	private long aLong81 = 0L;

	@OriginalMember(owner = "client!kc", name = "W", descriptor = "I")
	private int anInt2351 = 0;

	@OriginalMember(owner = "client!kc", name = "P", descriptor = "J")
	private long aLong80 = 0L;

	@OriginalMember(owner = "client!kc", name = "X", descriptor = "I")
	private int anInt2352 = 0;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()V")
	protected void method1676() throws Exception {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public void method1677(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
	public final void method1679() {
		this.aBoolean108 = true;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1680(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "()V")
	protected void method1681() throws Exception {
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(BI)V")
	private void method1682() {
		this.anInt2354 -= 256;
		if (this.anInt2354 < 0) {
			this.anInt2354 = 0;
		}
		if (this.aClass4_Sub2_8 != null) {
			this.aClass4_Sub2_8.method964(256);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!oc;)V")
	public final synchronized void method1683(@OriginalArg(1) Class4_Sub2 arg0) {
		this.aClass4_Sub2_8 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)V")
	public final synchronized void method1684() {
		if (this.anIntArray234 == null) {
			return;
		}
		@Pc(19) long local19 = Static16.method286();
		try {
			if (this.aLong80 != 0L) {
				if (this.aLong80 > local19) {
					return;
				}
				this.method1677(this.anInt2348);
				this.aBoolean108 = true;
				this.aLong80 = 0L;
			}
			@Pc(47) int local47 = this.method1687();
			@Pc(53) int local53 = this.anInt2349 + this.anInt2353;
			if (local53 + 256 > 16384) {
				local53 = 16128;
			}
			if (this.anInt2351 < this.anInt2352 - local47) {
				this.anInt2351 = this.anInt2352 - local47;
			}
			if (local53 + 256 > this.anInt2348) {
				this.anInt2348 += 1024;
				local47 = 0;
				if (this.anInt2348 > 16384) {
					this.anInt2348 = 16384;
				}
				this.method1688();
				this.method1677(this.anInt2348);
				if (this.anInt2348 < local53 + 256) {
					local53 = this.anInt2348 - 256;
					this.anInt2349 = local53 - this.anInt2353;
				}
				this.aBoolean108 = true;
			}
			while (local53 > local47) {
				local47 += 256;
				this.method1685(this.anIntArray234);
				this.method1676();
			}
			if (this.aLong81 < local19) {
				if (this.aBoolean108) {
					this.aBoolean108 = false;
				} else if (this.anInt2351 == 0 && this.anInt2347 == 0) {
					this.method1688();
					this.aLong80 = local19 + 2000L;
					return;
				} else {
					this.anInt2349 = Math.min(this.anInt2347, this.anInt2351);
					this.anInt2347 = this.anInt2351;
				}
				this.anInt2351 = 0;
				this.aLong81 = local19 + 2000L;
			}
			this.anInt2352 = local47;
		} catch (@Pc(192) Exception local192) {
			this.method1688();
			this.aLong80 = local19 + 2000L;
		}
		try {
			if (this.aLong79 + 500000L < local19) {
				local19 = this.aLong79;
			}
			while (local19 > this.aLong79 + 5000L) {
				this.method1682();
				this.aLong79 += 256000 / Static31.anInt846;
			}
		} catch (@Pc(237) Exception local237) {
			this.aLong79 = local19;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([II)V")
	private void method1685(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static70.aBoolean68) {
			local1 = 512;
		}
		Static135.method1052(arg0, 0, local1);
		this.anInt2354 -= 256;
		if (this.aClass4_Sub2_8 != null && this.anInt2354 <= 0) {
			this.anInt2354 += Static31.anInt846 >> 4;
			Static19.method339(this.aClass4_Sub2_8);
			this.method1690(this.aClass4_Sub2_8.method963(), this.aClass4_Sub2_8);
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
						@Pc(88) Class4_Sub2 local88 = null;
						@Pc(93) Class4_Sub2 local93 = this.aClass4_Sub2Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class4_Sub1 local97 = local93.aClass4_Sub1_5;
								if (local97 == null || local97.anInt1053 <= local61) {
									local93.aBoolean47 = true;
									@Pc(121) int local121 = local93.method965();
									local45 += local121;
									if (local97 != null) {
										local97.anInt1053 += local121;
									}
									if (local45 >= this.anInt2332) {
										break label103;
									}
									@Pc(140) Class4_Sub2 local140 = local93.method969();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt1325;
										while (local140 != null) {
											this.method1690(local145 * local140.method963() >> 8, local140);
											local140 = local93.method967();
										}
									}
									@Pc(164) Class4_Sub2 local164 = local93.aClass4_Sub2_5;
									local93.aClass4_Sub2_5 = null;
									if (local88 == null) {
										this.aClass4_Sub2Array6[local56] = local164;
									} else {
										local88.aClass4_Sub2_5 = local164;
									}
									if (local164 == null) {
										this.aClass4_Sub2Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass4_Sub2_5;
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
				@Pc(207) Class4_Sub2 local207 = this.aClass4_Sub2Array6[local56];
				this.aClass4_Sub2Array6[local56] = this.aClass4_Sub2Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class4_Sub2 local221 = local207.aClass4_Sub2_5;
					local207.aClass4_Sub2_5 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2354 < 0) {
			this.anInt2354 = 0;
		}
		if (this.aClass4_Sub2_8 != null) {
			this.aClass4_Sub2_8.method968(arg0, 0, 256);
		}
		this.aLong79 = Static16.method286();
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V")
	public final synchronized void method1686() {
		this.aBoolean108 = true;
		try {
			this.method1681();
		} catch (@Pc(14) Exception local14) {
			this.method1688();
			this.aLong80 = Static16.method286() + 2000L;
		}
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "()I")
	protected int method1687() throws Exception {
		return this.anInt2348;
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "()V")
	protected void method1688() {
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
	public final synchronized void method1689() {
		if (Static99.aClass81_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static99.aClass81_1.aClass39Array1[local7] == this) {
					Static99.aClass81_1.aClass39Array1[local7] = null;
				}
				if (Static99.aClass81_1.aClass39Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static99.aClass81_1.aBoolean126 = true;
				while (Static99.aClass81_1.aBoolean127) {
					Static13.method278(50L);
				}
				Static99.aClass81_1 = null;
			}
		}
		this.method1688();
		this.anIntArray234 = null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILclient!oc;I)V")
	private void method1690(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub2 arg1) {
		@Pc(11) int local11 = arg0 >> 5;
		@Pc(16) Class4_Sub2 local16 = this.aClass4_Sub2Array5[local11];
		if (local16 == null) {
			this.aClass4_Sub2Array6[local11] = arg1;
		} else {
			local16.aClass4_Sub2_5 = arg1;
		}
		this.aClass4_Sub2Array5[local11] = arg1;
		arg1.anInt1325 = arg0;
	}
}
