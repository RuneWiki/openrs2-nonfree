import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vm")
public class Class122 {

	@OriginalMember(owner = "client!vm", name = "g", descriptor = "[I")
	public int[] anIntArray513;

	@OriginalMember(owner = "client!vm", name = "j", descriptor = "Lclient!rn;")
	private Class3_Sub7 aClass3_Sub7_9;

	@OriginalMember(owner = "client!vm", name = "u", descriptor = "I")
	public int anInt8192;

	@OriginalMember(owner = "client!vm", name = "B", descriptor = "I")
	private int anInt8196;

	@OriginalMember(owner = "client!vm", name = "F", descriptor = "I")
	public int anInt8198;

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "Z")
	private boolean aBoolean696 = false;

	@OriginalMember(owner = "client!vm", name = "r", descriptor = "I")
	private final int anInt8189 = 32;

	@OriginalMember(owner = "client!vm", name = "h", descriptor = "J")
	private long aLong205 = Static444.method6719();

	@OriginalMember(owner = "client!vm", name = "v", descriptor = "J")
	private long aLong206 = 0L;

	@OriginalMember(owner = "client!vm", name = "A", descriptor = "I")
	private int anInt8195 = 0;

	@OriginalMember(owner = "client!vm", name = "C", descriptor = "[Lclient!rn;")
	private final Class3_Sub7[] aClass3_Sub7Array6 = new Class3_Sub7[8];

	@OriginalMember(owner = "client!vm", name = "x", descriptor = "[Lclient!rn;")
	private final Class3_Sub7[] aClass3_Sub7Array5 = new Class3_Sub7[8];

	@OriginalMember(owner = "client!vm", name = "w", descriptor = "Z")
	private boolean aBoolean697 = true;

	@OriginalMember(owner = "client!vm", name = "y", descriptor = "I")
	private int anInt8193 = 0;

	@OriginalMember(owner = "client!vm", name = "D", descriptor = "I")
	private int anInt8197 = 0;

	@OriginalMember(owner = "client!vm", name = "E", descriptor = "J")
	private long aLong207 = 0L;

	@OriginalMember(owner = "client!vm", name = "z", descriptor = "I")
	private int anInt8194 = 0;

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "()V")
	protected void method6801() throws Exception {
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
	public void method6802(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V")
	public final synchronized void method6803() {
		if (this.aBoolean696) {
			return;
		}
		@Pc(12) long local12 = Static444.method6719();
		try {
			if (this.aLong205 + 6000L < local12) {
				this.aLong205 = local12 - 6000L;
			}
			while (local12 > this.aLong205 + 5000L) {
				this.method6814();
				this.aLong205 += 256000 / Static590.anInt9843;
				local12 = Static444.method6719();
			}
		} catch (@Pc(51) Exception local51) {
			this.aLong205 = local12;
		}
		if (this.anIntArray513 == null) {
			return;
		}
		try {
			if (this.aLong206 != 0L) {
				if (local12 < this.aLong206) {
					return;
				}
				this.method6802(this.anInt8192);
				this.aBoolean697 = true;
				this.aLong206 = 0L;
			}
			@Pc(86) int local86 = this.method6809();
			if (this.anInt8195 - local86 > this.anInt8193) {
				this.anInt8193 = this.anInt8195 - local86;
			}
			@Pc(112) int local112 = this.anInt8196 + this.anInt8198;
			if (local112 + 256 > 16384) {
				local112 = 16128;
			}
			if (local112 + 256 > this.anInt8192) {
				this.anInt8192 += 1024;
				if (this.anInt8192 > 16384) {
					this.anInt8192 = 16384;
				}
				this.method6815();
				local86 = 0;
				this.method6802(this.anInt8192);
				this.aBoolean697 = true;
				if (local112 + 256 > this.anInt8192) {
					local112 = this.anInt8192 - 256;
					this.anInt8196 = local112 - this.anInt8198;
				}
			}
			while (local86 < local112) {
				this.method6811(this.anIntArray513);
				this.method6801();
				local86 += 256;
			}
			if (local12 > this.aLong207) {
				if (this.aBoolean697) {
					this.aBoolean697 = false;
				} else if (this.anInt8193 == 0 && this.anInt8197 == 0) {
					this.method6815();
					this.aLong206 = local12 + 2000L;
					return;
				} else {
					this.anInt8196 = Math.min(this.anInt8197, this.anInt8193);
					this.anInt8197 = this.anInt8193;
				}
				this.aLong207 = local12 + 2000L;
				this.anInt8193 = 0;
			}
			this.anInt8195 = local86;
		} catch (@Pc(237) Exception local237) {
			this.method6815();
			this.aLong206 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "(I)V")
	public final synchronized void method6806() {
		this.aBoolean697 = true;
		try {
			this.method6813();
		} catch (@Pc(15) Exception local15) {
			this.method6815();
			this.aLong206 = Static444.method6719() + 2000L;
		}
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILclient!rn;)V")
	public final synchronized void method6808(@OriginalArg(1) Class3_Sub7 arg0) {
		this.aClass3_Sub7_9 = arg0;
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "()I")
	protected int method6809() throws Exception {
		return this.anInt8192;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lclient!rn;II)V")
	private void method6810(@OriginalArg(0) Class3_Sub7 arg0, @OriginalArg(1) int arg1) {
		@Pc(11) int local11 = arg1 >> 5;
		@Pc(16) Class3_Sub7 local16 = this.aClass3_Sub7Array5[local11];
		if (local16 == null) {
			this.aClass3_Sub7Array6[local11] = arg0;
		} else {
			local16.aClass3_Sub7_8 = arg0;
		}
		this.aClass3_Sub7Array5[local11] = arg0;
		arg0.anInt7193 = arg1;
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "([II)V")
	private void method6811(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static457.aBoolean715) {
			local1 = 512;
		}
		Static655.method6403(arg0, 0, local1);
		this.anInt8194 -= 256;
		if (this.aClass3_Sub7_9 != null && this.anInt8194 <= 0) {
			this.anInt8194 += Static590.anInt9843 >> 4;
			Static327.method5498(this.aClass3_Sub7_9);
			this.method6810(this.aClass3_Sub7_9, this.aClass3_Sub7_9.method6001());
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
						@Pc(88) Class3_Sub7 local88 = null;
						@Pc(93) Class3_Sub7 local93 = this.aClass3_Sub7Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class3_Sub12 local97 = local93.aClass3_Sub12_6;
								if (local97 == null || local97.anInt6622 <= local61) {
									local93.aBoolean625 = true;
									@Pc(121) int local121 = local93.method6000();
									local45 += local121;
									if (local97 != null) {
										local97.anInt6622 += local121;
									}
									if (local45 >= this.anInt8189) {
										break label103;
									}
									@Pc(140) Class3_Sub7 local140 = local93.method6005();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt7193;
										while (local140 != null) {
											this.method6810(local140, local145 * local140.method6001() >> 8);
											local140 = local93.method6006();
										}
									}
									@Pc(164) Class3_Sub7 local164 = local93.aClass3_Sub7_8;
									local93.aClass3_Sub7_8 = null;
									if (local88 == null) {
										this.aClass3_Sub7Array6[local56] = local164;
									} else {
										local88.aClass3_Sub7_8 = local164;
									}
									if (local164 == null) {
										this.aClass3_Sub7Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass3_Sub7_8;
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
				@Pc(207) Class3_Sub7 local207 = this.aClass3_Sub7Array6[local56];
				this.aClass3_Sub7Array6[local56] = this.aClass3_Sub7Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class3_Sub7 local221 = local207.aClass3_Sub7_8;
					local207.aClass3_Sub7_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt8194 < 0) {
			this.anInt8194 = 0;
		}
		if (this.aClass3_Sub7_9 != null) {
			this.aClass3_Sub7_9.method6004(arg0, 0, 256);
		}
		this.aLong205 = Static444.method6719();
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method6812(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!vm", name = "c", descriptor = "()V")
	protected void method6813() throws Exception {
	}

	@OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)V")
	private void method6814() {
		this.anInt8194 -= 256;
		if (this.anInt8194 < 0) {
			this.anInt8194 = 0;
		}
		if (this.aClass3_Sub7_9 != null) {
			this.aClass3_Sub7_9.method6002(256);
		}
	}

	@OriginalMember(owner = "client!vm", name = "d", descriptor = "()V")
	protected void method6815() {
	}

	@OriginalMember(owner = "client!vm", name = "b", descriptor = "(B)V")
	public final synchronized void method6816() {
		if (Static596.aClass95_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static596.aClass95_1.aClass122Array1[local11] == this) {
					Static596.aClass95_1.aClass122Array1[local11] = null;
				}
				if (Static596.aClass95_1.aClass122Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static596.aClass95_1.aBoolean317 = true;
				while (Static596.aClass95_1.aBoolean316) {
					Static500.method7308(50L);
				}
				Static596.aClass95_1 = null;
			}
		}
		this.method6815();
		this.anIntArray513 = null;
		this.aBoolean696 = true;
	}
}
