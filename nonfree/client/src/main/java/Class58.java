import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cl")
public class Class58 {

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "[I")
	public int[] anIntArray373;

	@OriginalMember(owner = "client!cl", name = "g", descriptor = "Lclient!eq;")
	private Class3_Sub16 aClass3_Sub16_5;

	@OriginalMember(owner = "client!cl", name = "x", descriptor = "I")
	public int anInt6612;

	@OriginalMember(owner = "client!cl", name = "F", descriptor = "I")
	public int anInt6616;

	@OriginalMember(owner = "client!cl", name = "G", descriptor = "I")
	private int anInt6617;

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "I")
	private final int anInt6600 = 32;

	@OriginalMember(owner = "client!cl", name = "m", descriptor = "Z")
	private boolean aBoolean464 = false;

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "J")
	private long aLong179 = Static96.method2000();

	@OriginalMember(owner = "client!cl", name = "y", descriptor = "I")
	private int anInt6613 = 0;

	@OriginalMember(owner = "client!cl", name = "D", descriptor = "I")
	private int anInt6614 = 0;

	@OriginalMember(owner = "client!cl", name = "E", descriptor = "I")
	private int anInt6615 = 0;

	@OriginalMember(owner = "client!cl", name = "H", descriptor = "J")
	private long aLong182 = 0L;

	@OriginalMember(owner = "client!cl", name = "B", descriptor = "J")
	private long aLong181 = 0L;

	@OriginalMember(owner = "client!cl", name = "C", descriptor = "[Lclient!eq;")
	private final Class3_Sub16[] aClass3_Sub16Array6 = new Class3_Sub16[8];

	@OriginalMember(owner = "client!cl", name = "I", descriptor = "I")
	private int anInt6618 = 0;

	@OriginalMember(owner = "client!cl", name = "z", descriptor = "[Lclient!eq;")
	private final Class3_Sub16[] aClass3_Sub16Array5 = new Class3_Sub16[8];

	@OriginalMember(owner = "client!cl", name = "A", descriptor = "Z")
	private boolean aBoolean466 = true;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)V")
	public final synchronized void method5313() {
		if (Static205.aClass295_1 != null) {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < 2; local15++) {
				if (Static205.aClass295_1.aClass58Array1[local15] == this) {
					Static205.aClass295_1.aClass58Array1[local15] = null;
				}
				if (Static205.aClass295_1.aClass58Array1[local15] != null) {
					local13 = false;
				}
			}
			if (local13) {
				Static205.aClass295_1.aBoolean570 = true;
				while (Static205.aClass295_1.aBoolean569) {
					Static373.method5240(50L);
				}
				Static205.aClass295_1 = null;
			}
		}
		this.method5324();
		this.anIntArray373 = null;
		this.aBoolean464 = true;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZ)V")
	private void method5314() {
		this.anInt6613 -= 256;
		if (this.anInt6613 < 0) {
			this.anInt6613 = 0;
		}
		if (this.aClass3_Sub16_5 != null) {
			this.aClass3_Sub16_5.method7751(256);
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!eq;II)V")
	private void method5315(@OriginalArg(0) Class3_Sub16 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1 >> 5;
		@Pc(16) Class3_Sub16 local16 = this.aClass3_Sub16Array5[local11];
		if (local16 == null) {
			this.aClass3_Sub16Array6[local11] = arg0;
		} else {
			local16.aClass3_Sub16_8 = arg0;
		}
		this.aClass3_Sub16Array5[local11] = arg0;
		arg0.anInt9861 = arg1;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "()V")
	protected void method5316() throws Exception {
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5317(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "([II)V")
	private void method5319(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static102.aBoolean181) {
			local1 = 512;
		}
		Static604.method6227(arg0, 0, local1);
		this.anInt6613 -= 256;
		if (this.aClass3_Sub16_5 != null && this.anInt6613 <= 0) {
			this.anInt6613 += Static180.anInt3952 >> 4;
			Static261.method4019(this.aClass3_Sub16_5);
			this.method5315(this.aClass3_Sub16_5, this.aClass3_Sub16_5.method7753());
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
						@Pc(88) Class3_Sub16 local88 = null;
						@Pc(93) Class3_Sub16 local93 = this.aClass3_Sub16Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class3_Sub17 local97 = local93.aClass3_Sub17_5;
								if (local97 == null || local97.anInt7873 <= local61) {
									local93.aBoolean650 = true;
									@Pc(121) int local121 = local93.method7749();
									local45 += local121;
									if (local97 != null) {
										local97.anInt7873 += local121;
									}
									if (local45 >= this.anInt6600) {
										break label103;
									}
									@Pc(140) Class3_Sub16 local140 = local93.method7752();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt9861;
										while (local140 != null) {
											this.method5315(local140, local145 * local140.method7753() >> 8);
											local140 = local93.method7748();
										}
									}
									@Pc(164) Class3_Sub16 local164 = local93.aClass3_Sub16_8;
									local93.aClass3_Sub16_8 = null;
									if (local88 == null) {
										this.aClass3_Sub16Array6[local56] = local164;
									} else {
										local88.aClass3_Sub16_8 = local164;
									}
									if (local164 == null) {
										this.aClass3_Sub16Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass3_Sub16_8;
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
				@Pc(207) Class3_Sub16 local207 = this.aClass3_Sub16Array6[local56];
				this.aClass3_Sub16Array6[local56] = this.aClass3_Sub16Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class3_Sub16 local221 = local207.aClass3_Sub16_8;
					local207.aClass3_Sub16_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt6613 < 0) {
			this.anInt6613 = 0;
		}
		if (this.aClass3_Sub16_5 != null) {
			this.aClass3_Sub16_5.method7754(arg0, 0, 256);
		}
		this.aLong179 = Static96.method2000();
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "()V")
	protected void method5320() throws Exception {
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "()I")
	protected int method5322() throws Exception {
		return this.anInt6612;
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
	public final synchronized void method5323() {
		if (this.aBoolean464) {
			return;
		}
		@Pc(12) long local12 = Static96.method2000();
		try {
			if (this.aLong179 + 500000L < local12) {
				this.aLong179 = local12 - 500000L;
			}
			while (local12 > this.aLong179 + 5000L) {
				this.method5314();
				this.aLong179 += 256000 / Static180.anInt3952;
			}
		} catch (@Pc(56) Exception local56) {
			this.aLong179 = local12;
		}
		if (this.anIntArray373 == null) {
			return;
		}
		try {
			if (this.aLong182 != 0L) {
				if (this.aLong182 > local12) {
					return;
				}
				this.method5325(this.anInt6612);
				this.aBoolean466 = true;
				this.aLong182 = 0L;
			}
			@Pc(91) int local91 = this.method5322();
			if (this.anInt6615 - local91 > this.anInt6618) {
				this.anInt6618 = this.anInt6615 - local91;
			}
			@Pc(112) int local112 = this.anInt6617 + this.anInt6616;
			if (local112 + 256 > 16384) {
				local112 = 16128;
			}
			if (this.anInt6612 < local112 + 256) {
				this.anInt6612 += 1024;
				if (this.anInt6612 > 16384) {
					this.anInt6612 = 16384;
				}
				this.method5324();
				local91 = 0;
				this.method5325(this.anInt6612);
				this.aBoolean466 = true;
				if (local112 + 256 > this.anInt6612) {
					local112 = this.anInt6612 - 256;
					this.anInt6617 = local112 - this.anInt6616;
				}
			}
			while (local91 < local112) {
				this.method5319(this.anIntArray373);
				this.method5316();
				local91 += 256;
			}
			if (this.aLong181 < local12) {
				if (this.aBoolean466) {
					this.aBoolean466 = false;
				} else if (this.anInt6618 == 0 && this.anInt6614 == 0) {
					this.method5324();
					this.aLong182 = local12 + 2000L;
					return;
				} else {
					this.anInt6617 = Math.min(this.anInt6614, this.anInt6618);
					this.anInt6614 = this.anInt6618;
				}
				this.aLong181 = local12 + 2000L;
				this.anInt6618 = 0;
			}
			this.anInt6615 = local91;
		} catch (@Pc(241) Exception local241) {
			this.method5324();
			this.aLong182 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!cl", name = "d", descriptor = "()V")
	protected void method5324() {
	}

	@OriginalMember(owner = "client!cl", name = "c", descriptor = "(I)V")
	public void method5325(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(Z)V")
	public final synchronized void method5326() {
		this.aBoolean466 = true;
		try {
			this.method5320();
		} catch (@Pc(17) Exception local17) {
			this.method5324();
			this.aLong182 = Static96.method2000() + 2000L;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!eq;B)V")
	public final synchronized void method5327(@OriginalArg(0) Class3_Sub16 arg0) {
		this.aClass3_Sub16_5 = arg0;
	}
}
