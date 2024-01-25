import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gw")
public class Class127 {

	@OriginalMember(owner = "client!gw", name = "o", descriptor = "[I")
	public int[] anIntArray739;

	@OriginalMember(owner = "client!gw", name = "q", descriptor = "Lclient!sia;")
	private Class3_Sub1 aClass3_Sub1_9;

	@OriginalMember(owner = "client!gw", name = "u", descriptor = "I")
	public int anInt8652;

	@OriginalMember(owner = "client!gw", name = "E", descriptor = "I")
	private int anInt8658;

	@OriginalMember(owner = "client!gw", name = "H", descriptor = "I")
	public int anInt8660;

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "I")
	private final int anInt8640 = 32;

	@OriginalMember(owner = "client!gw", name = "f", descriptor = "Z")
	private boolean aBoolean673 = false;

	@OriginalMember(owner = "client!gw", name = "s", descriptor = "J")
	private long aLong250 = Static524.method7320();

	@OriginalMember(owner = "client!gw", name = "w", descriptor = "I")
	private int anInt8654 = 0;

	@OriginalMember(owner = "client!gw", name = "v", descriptor = "I")
	private int anInt8653 = 0;

	@OriginalMember(owner = "client!gw", name = "z", descriptor = "J")
	private long aLong251 = 0L;

	@OriginalMember(owner = "client!gw", name = "t", descriptor = "I")
	private int anInt8651 = 0;

	@OriginalMember(owner = "client!gw", name = "B", descriptor = "[Lclient!sia;")
	private final Class3_Sub1[] aClass3_Sub1Array6 = new Class3_Sub1[8];

	@OriginalMember(owner = "client!gw", name = "D", descriptor = "Z")
	private boolean aBoolean674 = true;

	@OriginalMember(owner = "client!gw", name = "C", descriptor = "I")
	private int anInt8657 = 0;

	@OriginalMember(owner = "client!gw", name = "G", descriptor = "J")
	private long aLong252 = 0L;

	@OriginalMember(owner = "client!gw", name = "y", descriptor = "[Lclient!sia;")
	private final Class3_Sub1[] aClass3_Sub1Array5 = new Class3_Sub1[8];

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "()I")
	protected int method7557() throws Exception {
		return this.anInt8652;
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "()V")
	protected void method7558() throws Exception {
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "()V")
	protected void method7559() {
	}

	@OriginalMember(owner = "client!gw", name = "d", descriptor = "()V")
	protected void method7560() throws Exception {
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
	public void method7561(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "([II)V")
	private void method7562(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static219.aBoolean313) {
			local1 = 512;
		}
		Static684.method5325(arg0, 0, local1);
		this.anInt8654 -= 256;
		if (this.aClass3_Sub1_9 != null && this.anInt8654 <= 0) {
			this.anInt8654 += Static348.anInt5701 >> 4;
			Static563.method7990(this.aClass3_Sub1_9);
			this.method7569(this.aClass3_Sub1_9, this.aClass3_Sub1_9.method5781());
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
						@Pc(88) Class3_Sub1 local88 = null;
						@Pc(93) Class3_Sub1 local93 = this.aClass3_Sub1Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class3_Sub35 local97 = local93.aClass3_Sub35_6;
								if (local97 == null || local97.anInt5393 <= local61) {
									local93.aBoolean455 = true;
									@Pc(121) int local121 = local93.method5780();
									local45 += local121;
									if (local97 != null) {
										local97.anInt5393 += local121;
									}
									if (local45 >= this.anInt8640) {
										break label103;
									}
									@Pc(140) Class3_Sub1 local140 = local93.method5778();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt6480;
										while (local140 != null) {
											this.method7569(local140, local145 * local140.method5781() >> 8);
											local140 = local93.method5782();
										}
									}
									@Pc(164) Class3_Sub1 local164 = local93.aClass3_Sub1_8;
									local93.aClass3_Sub1_8 = null;
									if (local88 == null) {
										this.aClass3_Sub1Array5[local56] = local164;
									} else {
										local88.aClass3_Sub1_8 = local164;
									}
									if (local164 == null) {
										this.aClass3_Sub1Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass3_Sub1_8;
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
				@Pc(207) Class3_Sub1 local207 = this.aClass3_Sub1Array5[local56];
				this.aClass3_Sub1Array5[local56] = this.aClass3_Sub1Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class3_Sub1 local221 = local207.aClass3_Sub1_8;
					local207.aClass3_Sub1_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt8654 < 0) {
			this.anInt8654 = 0;
		}
		if (this.aClass3_Sub1_9 != null) {
			this.aClass3_Sub1_9.method5783(arg0, 0, 256);
		}
		this.aLong250 = Static524.method7320();
	}

	@OriginalMember(owner = "client!gw", name = "b", descriptor = "(I)V")
	public final synchronized void method7563() {
		this.aBoolean674 = true;
		try {
			this.method7560();
		} catch (@Pc(16) Exception local16) {
			this.method7559();
			this.aLong252 = Static524.method7320() + 2000L;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(B)V")
	public final synchronized void method7564() {
		if (this.aBoolean673) {
			return;
		}
		@Pc(10) long local10 = Static524.method7320();
		try {
			if (local10 > this.aLong250 + 6000L) {
				this.aLong250 = local10 - 6000L;
			}
			while (this.aLong250 + 5000L < local10) {
				this.method7566();
				this.aLong250 += (long) (256000 / Static348.anInt5701);
				local10 = Static524.method7320();
			}
		} catch (@Pc(52) Exception local52) {
			this.aLong250 = local10;
		}
		if (this.anIntArray739 == null) {
			return;
		}
		try {
			if (this.aLong252 != 0L) {
				if (local10 < this.aLong252) {
					return;
				}
				this.method7561(this.anInt8652);
				this.aLong252 = 0L;
				this.aBoolean674 = true;
			}
			@Pc(85) int local85 = this.method7557();
			if (this.anInt8651 < this.anInt8657 - local85) {
				this.anInt8651 = this.anInt8657 - local85;
			}
			@Pc(109) int local109 = this.anInt8658 + this.anInt8660;
			if (local109 + 256 > 16384) {
				local109 = 16128;
			}
			if (this.anInt8652 < local109 + 256) {
				this.anInt8652 += 1024;
				if (this.anInt8652 > 16384) {
					this.anInt8652 = 16384;
				}
				this.method7559();
				this.method7561(this.anInt8652);
				local85 = 0;
				this.aBoolean674 = true;
				if (this.anInt8652 < local109 + 256) {
					local109 = this.anInt8652 - 256;
					this.anInt8658 = local109 - this.anInt8660;
				}
			}
			while (local85 < local109) {
				this.method7562(this.anIntArray739);
				local85 += 256;
				this.method7558();
			}
			if (this.aLong251 < local10) {
				if (this.aBoolean674) {
					this.aBoolean674 = false;
				} else if (this.anInt8651 == 0 && this.anInt8653 == 0) {
					this.method7559();
					this.aLong252 = local10 + 2000L;
					return;
				} else {
					this.anInt8658 = Math.min(this.anInt8653, this.anInt8651);
					this.anInt8653 = this.anInt8651;
				}
				this.anInt8651 = 0;
				this.aLong251 = local10 + 2000L;
			}
			this.anInt8657 = local85;
		} catch (@Pc(246) Exception local246) {
			this.method7559();
			this.aLong252 = local10 + 2000L;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!sia;B)V")
	public final synchronized void method7565(@OriginalArg(0) Class3_Sub1 arg0) {
		this.aClass3_Sub1_9 = arg0;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)V")
	private void method7566() {
		this.anInt8654 -= 256;
		if (this.anInt8654 < 0) {
			this.anInt8654 = 0;
		}
		if (this.aClass3_Sub1_9 != null) {
			this.aClass3_Sub1_9.method5779(256);
		}
	}

	@OriginalMember(owner = "client!gw", name = "c", descriptor = "(I)V")
	public final synchronized void method7567() {
		if (Static601.aClass162_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static601.aClass162_1.aClass127Array1[local11] == this) {
					Static601.aClass162_1.aClass127Array1[local11] = null;
				}
				if (Static601.aClass162_1.aClass127Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static601.aClass162_1.aBoolean351 = true;
				while (Static601.aClass162_1.aBoolean352) {
					Static373.method5403(50L);
				}
				Static601.aClass162_1 = null;
			}
		}
		this.method7559();
		this.anIntArray739 = null;
		this.aBoolean673 = true;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!sia;II)V")
	private void method7569(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class3_Sub1 local12 = this.aClass3_Sub1Array6[local7];
		if (local12 == null) {
			this.aClass3_Sub1Array5[local7] = arg0;
		} else {
			local12.aClass3_Sub1_8 = arg0;
		}
		this.aClass3_Sub1Array6[local7] = arg0;
		arg0.anInt6480 = arg1;
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method7572(@OriginalArg(0) Component arg0) throws Exception {
	}
}
