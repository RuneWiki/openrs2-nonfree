import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iv")
public class Class34 {

	@OriginalMember(owner = "client!iv", name = "o", descriptor = "[I")
	public int[] anIntArray335;

	@OriginalMember(owner = "client!iv", name = "p", descriptor = "Lclient!fja;")
	private Class2_Sub26 aClass2_Sub26_6;

	@OriginalMember(owner = "client!iv", name = "y", descriptor = "I")
	public int anInt7065;

	@OriginalMember(owner = "client!iv", name = "D", descriptor = "I")
	private int anInt7067;

	@OriginalMember(owner = "client!iv", name = "G", descriptor = "I")
	public int anInt7070;

	@OriginalMember(owner = "client!iv", name = "i", descriptor = "I")
	private final int anInt7055 = 32;

	@OriginalMember(owner = "client!iv", name = "s", descriptor = "Z")
	private boolean aBoolean535 = false;

	@OriginalMember(owner = "client!iv", name = "j", descriptor = "J")
	private long aLong187 = Static99.method1701();

	@OriginalMember(owner = "client!iv", name = "u", descriptor = "J")
	private long aLong188 = 0L;

	@OriginalMember(owner = "client!iv", name = "w", descriptor = "I")
	private int anInt7063 = 0;

	@OriginalMember(owner = "client!iv", name = "v", descriptor = "Z")
	private boolean aBoolean536 = true;

	@OriginalMember(owner = "client!iv", name = "C", descriptor = "J")
	private long aLong189 = 0L;

	@OriginalMember(owner = "client!iv", name = "B", descriptor = "[Lclient!fja;")
	private final Class2_Sub26[] aClass2_Sub26Array6 = new Class2_Sub26[8];

	@OriginalMember(owner = "client!iv", name = "A", descriptor = "I")
	private int anInt7066 = 0;

	@OriginalMember(owner = "client!iv", name = "x", descriptor = "I")
	private int anInt7064 = 0;

	@OriginalMember(owner = "client!iv", name = "z", descriptor = "[Lclient!fja;")
	private final Class2_Sub26[] aClass2_Sub26Array5 = new Class2_Sub26[8];

	@OriginalMember(owner = "client!iv", name = "F", descriptor = "I")
	private int anInt7069 = 0;

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "()V")
	protected void method6321() throws Exception {
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lclient!fja;II)V")
	private void method6322(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(16) Class2_Sub26 local16 = this.aClass2_Sub26Array6[local7];
		if (local16 == null) {
			this.aClass2_Sub26Array5[local7] = arg0;
		} else {
			local16.aClass2_Sub26_9 = arg0;
		}
		this.aClass2_Sub26Array6[local7] = arg0;
		arg0.anInt11395 = arg1;
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V")
	public void method6324(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(BLclient!fja;)V")
	public final synchronized void method6325(@OriginalArg(1) Class2_Sub26 arg0) {
		this.aClass2_Sub26_6 = arg0;
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "()V")
	protected void method6326() {
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "([II)V")
	private void method6327(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static41.aBoolean53) {
			local1 = 512;
		}
		Static679.method4126(arg0, 0, local1);
		this.anInt7066 -= 256;
		if (this.aClass2_Sub26_6 != null && this.anInt7066 <= 0) {
			this.anInt7066 += Static237.anInt4718 >> 4;
			Static455.method7300(this.aClass2_Sub26_6);
			this.method6322(this.aClass2_Sub26_6, this.aClass2_Sub26_6.method9757());
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
						@Pc(88) Class2_Sub26 local88 = null;
						@Pc(93) Class2_Sub26 local93 = this.aClass2_Sub26Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub44 local97 = local93.aClass2_Sub44_6;
								if (local97 == null || local97.anInt10348 <= local61) {
									local93.aBoolean805 = true;
									@Pc(121) int local121 = local93.method9756();
									local45 += local121;
									if (local97 != null) {
										local97.anInt10348 += local121;
									}
									if (local45 >= this.anInt7055) {
										break label103;
									}
									@Pc(140) Class2_Sub26 local140 = local93.method9761();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt11395;
										while (local140 != null) {
											this.method6322(local140, local145 * local140.method9757() >> 8);
											local140 = local93.method9758();
										}
									}
									@Pc(164) Class2_Sub26 local164 = local93.aClass2_Sub26_9;
									local93.aClass2_Sub26_9 = null;
									if (local88 == null) {
										this.aClass2_Sub26Array5[local56] = local164;
									} else {
										local88.aClass2_Sub26_9 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub26Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub26_9;
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
				@Pc(207) Class2_Sub26 local207 = this.aClass2_Sub26Array5[local56];
				this.aClass2_Sub26Array5[local56] = this.aClass2_Sub26Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub26 local221 = local207.aClass2_Sub26_9;
					local207.aClass2_Sub26_9 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt7066 < 0) {
			this.anInt7066 = 0;
		}
		if (this.aClass2_Sub26_6 != null) {
			this.aClass2_Sub26_6.method9760(arg0, 0, 256);
		}
		this.aLong187 = Static99.method1701();
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)V")
	public final synchronized void method6328() {
		if (this.aBoolean535) {
			return;
		}
		@Pc(12) long local12 = Static99.method1701();
		try {
			if (local12 > this.aLong187 + 6000L) {
				this.aLong187 = local12 - 6000L;
			}
			while (this.aLong187 + 5000L < local12) {
				this.method6329();
				this.aLong187 += (long) (256000 / Static237.anInt4718);
				local12 = Static99.method1701();
			}
		} catch (@Pc(55) Exception local55) {
			this.aLong187 = local12;
		}
		if (this.anIntArray335 == null) {
			return;
		}
		try {
			if (this.aLong189 != 0L) {
				if (local12 < this.aLong189) {
					return;
				}
				this.method6324(this.anInt7070);
				this.aLong189 = 0L;
				this.aBoolean536 = true;
			}
			@Pc(90) int local90 = this.method6334();
			if (this.anInt7063 - local90 > this.anInt7069) {
				this.anInt7069 = this.anInt7063 - local90;
			}
			@Pc(115) int local115 = this.anInt7067 + this.anInt7065;
			if (local115 + 256 > 16384) {
				local115 = 16128;
			}
			if (local115 + 256 > this.anInt7070) {
				this.anInt7070 += 1024;
				if (this.anInt7070 > 16384) {
					this.anInt7070 = 16384;
				}
				this.method6326();
				local90 = 0;
				this.method6324(this.anInt7070);
				if (local115 + 256 > this.anInt7070) {
					local115 = this.anInt7070 - 256;
					this.anInt7067 = local115 - this.anInt7065;
				}
				this.aBoolean536 = true;
			}
			while (local115 > local90) {
				this.method6327(this.anIntArray335);
				this.method6335();
				local90 += 256;
			}
			if (local12 > this.aLong188) {
				if (this.aBoolean536) {
					this.aBoolean536 = false;
				} else if (this.anInt7069 == 0 && this.anInt7064 == 0) {
					this.method6326();
					this.aLong189 = local12 + 2000L;
					return;
				} else {
					this.anInt7067 = Math.min(this.anInt7064, this.anInt7069);
					this.anInt7064 = this.anInt7069;
				}
				this.aLong188 = local12 + 2000L;
				this.anInt7069 = 0;
			}
			this.anInt7063 = local90;
		} catch (@Pc(250) Exception local250) {
			this.method6326();
			this.aLong189 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(BI)V")
	private void method6329() {
		this.anInt7066 -= 256;
		if (this.anInt7066 < 0) {
			this.anInt7066 = 0;
		}
		if (this.aClass2_Sub26_6 != null) {
			this.aClass2_Sub26_6.method9759(256);
		}
	}

	@OriginalMember(owner = "client!iv", name = "b", descriptor = "(B)V")
	public final synchronized void method6330() {
		this.aBoolean536 = true;
		try {
			this.method6321();
		} catch (@Pc(18) Exception local18) {
			this.method6326();
			this.aLong189 = Static99.method1701() + 2000L;
		}
	}

	@OriginalMember(owner = "client!iv", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method6332(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "(B)V")
	public final synchronized void method6333() {
		if (Static385.aClass350_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static385.aClass350_1.aClass34Array1[local11] == this) {
					Static385.aClass350_1.aClass34Array1[local11] = null;
				}
				if (Static385.aClass350_1.aClass34Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static385.aClass350_1.aBoolean733 = true;
				while (Static385.aClass350_1.aBoolean734) {
					Static650.method9565(50L);
				}
				Static385.aClass350_1 = null;
			}
		}
		this.method6326();
		this.aBoolean535 = true;
		this.anIntArray335 = null;
	}

	@OriginalMember(owner = "client!iv", name = "c", descriptor = "()I")
	protected int method6334() throws Exception {
		return this.anInt7070;
	}

	@OriginalMember(owner = "client!iv", name = "d", descriptor = "()V")
	protected void method6335() throws Exception {
	}
}
