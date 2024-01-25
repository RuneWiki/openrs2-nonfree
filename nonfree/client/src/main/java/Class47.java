import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dh")
public class Class47 {

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "Lclient!rb;")
	private Class5_Sub16 aClass5_Sub16_7;

	@OriginalMember(owner = "client!dh", name = "v", descriptor = "[I")
	public int[] anIntArray576;

	@OriginalMember(owner = "client!dh", name = "z", descriptor = "I")
	public int anInt5933;

	@OriginalMember(owner = "client!dh", name = "B", descriptor = "I")
	public int anInt5934;

	@OriginalMember(owner = "client!dh", name = "F", descriptor = "I")
	private int anInt5936;

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
	private final int anInt5918 = 32;

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "Z")
	private boolean aBoolean491 = false;

	@OriginalMember(owner = "client!dh", name = "i", descriptor = "J")
	private long aLong200 = Static340.method5863();

	@OriginalMember(owner = "client!dh", name = "A", descriptor = "[Lclient!rb;")
	private final Class5_Sub16[] aClass5_Sub16Array5 = new Class5_Sub16[8];

	@OriginalMember(owner = "client!dh", name = "y", descriptor = "J")
	private long aLong201 = 0L;

	@OriginalMember(owner = "client!dh", name = "C", descriptor = "J")
	private long aLong202 = 0L;

	@OriginalMember(owner = "client!dh", name = "D", descriptor = "Z")
	private boolean aBoolean493 = true;

	@OriginalMember(owner = "client!dh", name = "E", descriptor = "I")
	private int anInt5935 = 0;

	@OriginalMember(owner = "client!dh", name = "G", descriptor = "I")
	private int anInt5937 = 0;

	@OriginalMember(owner = "client!dh", name = "I", descriptor = "I")
	private int anInt5939 = 0;

	@OriginalMember(owner = "client!dh", name = "H", descriptor = "I")
	private int anInt5938 = 0;

	@OriginalMember(owner = "client!dh", name = "J", descriptor = "[Lclient!rb;")
	private final Class5_Sub16[] aClass5_Sub16Array6 = new Class5_Sub16[8];

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "()I")
	protected int method5319() throws Exception {
		return this.anInt5933;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILclient!rb;)V")
	private void method5321(@OriginalArg(1) int arg0, @OriginalArg(2) Class5_Sub16 arg1) {
		@Pc(12) int local12 = arg0 >> 5;
		@Pc(17) Class5_Sub16 local17 = this.aClass5_Sub16Array6[local12];
		if (local17 == null) {
			this.aClass5_Sub16Array5[local12] = arg1;
		} else {
			local17.aClass5_Sub16_8 = arg1;
		}
		this.aClass5_Sub16Array6[local12] = arg1;
		arg1.anInt6479 = arg0;
	}

	@OriginalMember(owner = "client!dh", name = "b", descriptor = "()V")
	protected void method5322() {
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "(I)V")
	public final void method5324() {
		this.aBoolean493 = true;
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
	private void method5325() {
		this.anInt5939 -= 256;
		if (this.anInt5939 < 0) {
			this.anInt5939 = 0;
		}
		if (this.aClass5_Sub16_7 != null) {
			this.aClass5_Sub16_7.method5793(256);
		}
	}

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V")
	public final synchronized void method5326() {
		if (this.aBoolean491) {
			return;
		}
		@Pc(10) long local10 = Static340.method5863();
		try {
			if (this.aLong200 + 500000L < local10) {
				this.aLong200 = local10 - 500000L;
			}
			while (local10 > this.aLong200 + 5000L) {
				this.method5325();
				this.aLong200 += 256000 / Static226.anInt4449;
			}
		} catch (@Pc(49) Exception local49) {
			this.aLong200 = local10;
		}
		if (this.anIntArray576 == null) {
			return;
		}
		try {
			if (this.aLong201 != 0L) {
				if (this.aLong201 > local10) {
					return;
				}
				this.method5332(this.anInt5933);
				this.aBoolean493 = true;
				this.aLong201 = 0L;
			}
			@Pc(80) int local80 = this.method5319();
			if (this.anInt5935 - local80 > this.anInt5937) {
				this.anInt5937 = this.anInt5935 - local80;
			}
			@Pc(100) int local100 = this.anInt5936 + this.anInt5934;
			if (local100 + 256 > 16384) {
				local100 = 16128;
			}
			if (this.anInt5933 < local100 + 256) {
				this.anInt5933 += 1024;
				if (this.anInt5933 > 16384) {
					this.anInt5933 = 16384;
				}
				this.method5322();
				local80 = 0;
				this.method5332(this.anInt5933);
				if (local100 + 256 > this.anInt5933) {
					local100 = this.anInt5933 - 256;
					this.anInt5936 = local100 - this.anInt5934;
				}
				this.aBoolean493 = true;
			}
			while (local100 > local80) {
				this.method5328(this.anIntArray576);
				local80 += 256;
				this.method5329();
			}
			if (local10 > this.aLong202) {
				if (this.aBoolean493) {
					this.aBoolean493 = false;
				} else if (this.anInt5937 == 0 && this.anInt5938 == 0) {
					this.method5322();
					this.aLong201 = local10 + 2000L;
					return;
				} else {
					this.anInt5936 = Math.min(this.anInt5938, this.anInt5937);
					this.anInt5938 = this.anInt5937;
				}
				this.anInt5937 = 0;
				this.aLong202 = local10 + 2000L;
			}
			this.anInt5935 = local80;
		} catch (@Pc(232) Exception local232) {
			this.method5322();
			this.aLong201 = local10 + 2000L;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
	public final synchronized void method5327() {
		this.aBoolean493 = true;
		try {
			this.method5334();
		} catch (@Pc(14) Exception local14) {
			this.method5322();
			this.aLong201 = Static340.method5863() + 2000L;
		}
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "([II)V")
	private void method5328(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static188.aBoolean287) {
			local1 = 512;
		}
		Static368.method5426(arg0, 0, local1);
		this.anInt5939 -= 256;
		if (this.aClass5_Sub16_7 != null && this.anInt5939 <= 0) {
			this.anInt5939 += Static226.anInt4449 >> 4;
			Static321.method5575(this.aClass5_Sub16_7);
			this.method5321(this.aClass5_Sub16_7.method5788(), this.aClass5_Sub16_7);
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
						@Pc(88) Class5_Sub16 local88 = null;
						@Pc(93) Class5_Sub16 local93 = this.aClass5_Sub16Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class5_Sub10 local97 = local93.aClass5_Sub10_5;
								if (local97 == null || local97.anInt1038 <= local61) {
									local93.aBoolean550 = true;
									@Pc(121) int local121 = local93.method5792();
									local45 += local121;
									if (local97 != null) {
										local97.anInt1038 += local121;
									}
									if (local45 >= this.anInt5918) {
										break label103;
									}
									@Pc(140) Class5_Sub16 local140 = local93.method5790();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt6479;
										while (local140 != null) {
											this.method5321(local145 * local140.method5788() >> 8, local140);
											local140 = local93.method5791();
										}
									}
									@Pc(164) Class5_Sub16 local164 = local93.aClass5_Sub16_8;
									local93.aClass5_Sub16_8 = null;
									if (local88 == null) {
										this.aClass5_Sub16Array5[local56] = local164;
									} else {
										local88.aClass5_Sub16_8 = local164;
									}
									if (local164 == null) {
										this.aClass5_Sub16Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass5_Sub16_8;
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
				@Pc(207) Class5_Sub16 local207 = this.aClass5_Sub16Array5[local56];
				this.aClass5_Sub16Array5[local56] = this.aClass5_Sub16Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class5_Sub16 local221 = local207.aClass5_Sub16_8;
					local207.aClass5_Sub16_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt5939 < 0) {
			this.anInt5939 = 0;
		}
		if (this.aClass5_Sub16_7 != null) {
			this.aClass5_Sub16_7.method5787(arg0, 0, 256);
		}
		this.aLong200 = Static340.method5863();
	}

	@OriginalMember(owner = "client!dh", name = "c", descriptor = "()V")
	protected void method5329() throws Exception {
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5330(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!dh", name = "e", descriptor = "(I)V")
	public final synchronized void method5331() {
		if (Static314.aClass34_1 != null) {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < 2; local5++) {
				if (Static314.aClass34_1.aClass47Array1[local5] == this) {
					Static314.aClass34_1.aClass47Array1[local5] = null;
				}
				if (Static314.aClass34_1.aClass47Array1[local5] != null) {
					local3 = false;
				}
			}
			if (local3) {
				Static314.aClass34_1.aBoolean50 = true;
				while (Static314.aClass34_1.aBoolean49) {
					Static20.method408(50L);
				}
				Static314.aClass34_1 = null;
			}
		}
		this.method5322();
		this.anIntArray576 = null;
		this.aBoolean491 = true;
	}

	@OriginalMember(owner = "client!dh", name = "f", descriptor = "(I)V")
	public void method5332(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILclient!rb;)V")
	public final synchronized void method5333(@OriginalArg(1) Class5_Sub16 arg0) {
		this.aClass5_Sub16_7 = arg0;
	}

	@OriginalMember(owner = "client!dh", name = "d", descriptor = "()V")
	protected void method5334() throws Exception {
	}
}
