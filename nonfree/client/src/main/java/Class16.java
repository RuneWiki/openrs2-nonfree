import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public class Class16 {

	@OriginalMember(owner = "client!kc", name = "k", descriptor = "[I")
	public int[] anIntArray355;

	@OriginalMember(owner = "client!kc", name = "C", descriptor = "Lclient!bl;")
	private Class3_Sub5 aClass3_Sub5_6;

	@OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
	public int anInt5266;

	@OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
	private int anInt5268;

	@OriginalMember(owner = "client!kc", name = "N", descriptor = "I")
	public int anInt5271;

	@OriginalMember(owner = "client!kc", name = "p", descriptor = "Z")
	private boolean aBoolean462 = false;

	@OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
	private final int anInt5258 = 32;

	@OriginalMember(owner = "client!kc", name = "j", descriptor = "J")
	private long aLong157 = Static118.method1934();

	@OriginalMember(owner = "client!kc", name = "H", descriptor = "Z")
	private boolean aBoolean463 = true;

	@OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
	private int anInt5270 = 0;

	@OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
	private int anInt5267 = 0;

	@OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
	private int anInt5265 = 0;

	@OriginalMember(owner = "client!kc", name = "L", descriptor = "[Lclient!bl;")
	private final Class3_Sub5[] aClass3_Sub5Array6 = new Class3_Sub5[8];

	@OriginalMember(owner = "client!kc", name = "M", descriptor = "J")
	private long aLong158 = 0L;

	@OriginalMember(owner = "client!kc", name = "F", descriptor = "[Lclient!bl;")
	private final Class3_Sub5[] aClass3_Sub5Array5 = new Class3_Sub5[8];

	@OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
	private int anInt5269 = 0;

	@OriginalMember(owner = "client!kc", name = "O", descriptor = "J")
	private long aLong159 = 0L;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public final synchronized void method4107() {
		if (Static226.aClass158_1 != null) {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < 2; local5++) {
				if (Static226.aClass158_1.aClass16Array1[local5] == this) {
					Static226.aClass158_1.aClass16Array1[local5] = null;
				}
				if (Static226.aClass158_1.aClass16Array1[local5] != null) {
					local3 = false;
				}
			}
			if (local3) {
				Static226.aClass158_1.aBoolean430 = true;
				while (Static226.aClass158_1.aBoolean431) {
					Static360.method4758(50L);
				}
				Static226.aClass158_1 = null;
			}
		}
		this.method4116();
		this.anIntArray355 = null;
		this.aBoolean462 = true;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
	public final void method4108() {
		this.aBoolean463 = true;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V")
	private void method4110() {
		this.anInt5269 -= 256;
		if (this.anInt5269 < 0) {
			this.anInt5269 = 0;
		}
		if (this.aClass3_Sub5_6 != null) {
			this.aClass3_Sub5_6.method5119(256);
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!bl;I)V")
	public final synchronized void method4113(@OriginalArg(0) Class3_Sub5 arg0) {
		this.aClass3_Sub5_6 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
	public final synchronized void method4114() {
		if (this.aBoolean462) {
			return;
		}
		@Pc(10) long local10 = Static118.method1934();
		try {
			if (local10 > this.aLong157 + 500000L) {
				this.aLong157 = local10 - 500000L;
			}
			while (local10 > this.aLong157 + 5000L) {
				this.method4110();
				this.aLong157 += 256000 / Static232.anInt4442;
			}
		} catch (@Pc(47) Exception local47) {
			this.aLong157 = local10;
		}
		if (this.anIntArray355 == null) {
			return;
		}
		try {
			if (this.aLong159 != 0L) {
				if (this.aLong159 > local10) {
					return;
				}
				this.method4118(this.anInt5266);
				this.aBoolean463 = true;
				this.aLong159 = 0L;
			}
			@Pc(84) int local84 = this.method4121();
			if (this.anInt5270 < this.anInt5265 - local84) {
				this.anInt5270 = this.anInt5265 - local84;
			}
			@Pc(109) int local109 = this.anInt5268 + this.anInt5271;
			if (local109 + 256 > 16384) {
				local109 = 16128;
			}
			if (this.anInt5266 < local109 + 256) {
				this.anInt5266 += 1024;
				if (this.anInt5266 > 16384) {
					this.anInt5266 = 16384;
				}
				this.method4116();
				this.method4118(this.anInt5266);
				local84 = 0;
				if (local109 + 256 > this.anInt5266) {
					local109 = this.anInt5266 - 256;
					this.anInt5268 = local109 - this.anInt5271;
				}
				this.aBoolean463 = true;
			}
			while (local84 < local109) {
				this.method4117(this.anIntArray355);
				this.method4120();
				local84 += 256;
			}
			if (this.aLong158 < local10) {
				if (this.aBoolean463) {
					this.aBoolean463 = false;
				} else if (this.anInt5270 == 0 && this.anInt5267 == 0) {
					this.method4116();
					this.aLong159 = local10 + 2000L;
					return;
				} else {
					this.anInt5268 = Math.min(this.anInt5267, this.anInt5270);
					this.anInt5267 = this.anInt5270;
				}
				this.anInt5270 = 0;
				this.aLong158 = local10 + 2000L;
			}
			this.anInt5265 = local84;
		} catch (@Pc(230) Exception local230) {
			this.method4116();
			this.aLong159 = local10 + 2000L;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method4115(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()V")
	protected void method4116() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([II)V")
	private void method4117(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static324.aBoolean657) {
			local1 = 512;
		}
		Static462.method4612(arg0, 0, local1);
		this.anInt5269 -= 256;
		if (this.aClass3_Sub5_6 != null && this.anInt5269 <= 0) {
			this.anInt5269 += Static232.anInt4442 >> 4;
			Static62.method1246(this.aClass3_Sub5_6);
			this.method4125(this.aClass3_Sub5_6, this.aClass3_Sub5_6.method5118());
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
								@Pc(97) Class3_Sub6 local97 = local93.aClass3_Sub6_5;
								if (local97 == null || local97.anInt1039 <= local61) {
									local93.aBoolean572 = true;
									@Pc(121) int local121 = local93.method5122();
									local45 += local121;
									if (local97 != null) {
										local97.anInt1039 += local121;
									}
									if (local45 >= this.anInt5258) {
										break label103;
									}
									@Pc(140) Class3_Sub5 local140 = local93.method5123();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt6565;
										while (local140 != null) {
											this.method4125(local140, local145 * local140.method5118() >> 8);
											local140 = local93.method5120();
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
		if (this.anInt5269 < 0) {
			this.anInt5269 = 0;
		}
		if (this.aClass3_Sub5_6 != null) {
			this.aClass3_Sub5_6.method5117(arg0, 0, 256);
		}
		this.aLong157 = Static118.method1934();
	}

	@OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)V")
	public void method4118(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "()V")
	protected void method4120() throws Exception {
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "()I")
	protected int method4121() throws Exception {
		return this.anInt5266;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
	public final synchronized void method4122() {
		this.aBoolean463 = true;
		try {
			this.method4124();
		} catch (@Pc(17) Exception local17) {
			this.method4116();
			this.aLong159 = Static118.method1934() + 2000L;
		}
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "()V")
	protected void method4124() throws Exception {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(BLclient!bl;I)V")
	private void method4125(@OriginalArg(1) Class3_Sub5 arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15 = arg1 >> 5;
		@Pc(20) Class3_Sub5 local20 = this.aClass3_Sub5Array5[local15];
		if (local20 == null) {
			this.aClass3_Sub5Array6[local15] = arg0;
		} else {
			local20.aClass3_Sub5_8 = arg0;
		}
		this.aClass3_Sub5Array5[local15] = arg0;
		arg0.anInt6565 = arg1;
	}
}
