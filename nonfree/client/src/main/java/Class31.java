import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public class Class31 {

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "Lclient!oa;")
	private Class1_Sub19 aClass1_Sub19_5;

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "[I")
	public int[] anIntArray287;

	@OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
	private int anInt2731;

	@OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
	public int anInt2733;

	@OriginalMember(owner = "client!fl", name = "z", descriptor = "I")
	public int anInt2735;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "I")
	private final int anInt2717 = 32;

	@OriginalMember(owner = "client!fl", name = "j", descriptor = "Z")
	private boolean aBoolean173 = false;

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "J")
	private long aLong78 = Static250.method3737();

	@OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
	private int anInt2730 = 0;

	@OriginalMember(owner = "client!fl", name = "w", descriptor = "[Lclient!oa;")
	private final Class1_Sub19[] aClass1_Sub19Array5 = new Class1_Sub19[8];

	@OriginalMember(owner = "client!fl", name = "A", descriptor = "J")
	private long aLong79 = 0L;

	@OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
	private int anInt2729 = 0;

	@OriginalMember(owner = "client!fl", name = "D", descriptor = "J")
	private long aLong80 = 0L;

	@OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
	private int anInt2740 = 0;

	@OriginalMember(owner = "client!fl", name = "G", descriptor = "[Lclient!oa;")
	private final Class1_Sub19[] aClass1_Sub19Array6 = new Class1_Sub19[8];

	@OriginalMember(owner = "client!fl", name = "y", descriptor = "Z")
	private boolean aBoolean174 = true;

	@OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
	private int anInt2742 = 0;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
	public void method2002(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "()I")
	protected int method2003() throws Exception {
		return this.anInt2735;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Lclient!oa;I)V")
	public final synchronized void method2004(@OriginalArg(0) Class1_Sub19 arg0) {
		this.aClass1_Sub19_5 = arg0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLclient!oa;I)V")
	private void method2005(@OriginalArg(1) Class1_Sub19 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 >> 5;
		@Pc(18) Class1_Sub19 local18 = this.aClass1_Sub19Array5[local13];
		if (local18 == null) {
			this.aClass1_Sub19Array6[local13] = arg0;
		} else {
			local18.aClass1_Sub19_8 = arg0;
		}
		this.aClass1_Sub19Array5[local13] = arg0;
		arg0.anInt7648 = arg1;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZ)V")
	private void method2006() {
		this.anInt2729 -= 256;
		if (this.anInt2729 < 0) {
			this.anInt2729 = 0;
		}
		if (this.aClass1_Sub19_5 != null) {
			this.aClass1_Sub19_5.method5802(256);
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2007(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "()V")
	protected void method2008() throws Exception {
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
	public final synchronized void method2009() {
		if (this.aBoolean173) {
			return;
		}
		@Pc(14) long local14 = Static250.method3737();
		try {
			if (this.aLong78 + 500000L < local14) {
				this.aLong78 = local14 - 500000L;
			}
			while (this.aLong78 + 5000L < local14) {
				this.method2006();
				this.aLong78 += 256000 / Static84.anInt2035;
			}
		} catch (@Pc(53) Exception local53) {
			this.aLong78 = local14;
		}
		if (this.anIntArray287 == null) {
			return;
		}
		try {
			if (this.aLong79 != 0L) {
				if (this.aLong79 > local14) {
					return;
				}
				this.method2002(this.anInt2735);
				this.aLong79 = 0L;
				this.aBoolean174 = true;
			}
			@Pc(86) int local86 = this.method2003();
			if (this.anInt2740 < this.anInt2742 - local86) {
				this.anInt2740 = this.anInt2742 - local86;
			}
			@Pc(107) int local107 = this.anInt2731 + this.anInt2733;
			if (local107 + 256 > 16384) {
				local107 = 16128;
			}
			if (local107 + 256 > this.anInt2735) {
				this.anInt2735 += 1024;
				if (this.anInt2735 > 16384) {
					this.anInt2735 = 16384;
				}
				this.method2020();
				local86 = 0;
				this.method2002(this.anInt2735);
				this.aBoolean174 = true;
				if (local107 + 256 > this.anInt2735) {
					local107 = this.anInt2735 - 256;
					this.anInt2731 = local107 - this.anInt2733;
				}
			}
			while (local86 < local107) {
				this.method2016(this.anIntArray287);
				local86 += 256;
				this.method2008();
			}
			if (local14 > this.aLong80) {
				if (this.aBoolean174) {
					this.aBoolean174 = false;
				} else if (this.anInt2740 == 0 && this.anInt2730 == 0) {
					this.method2020();
					this.aLong79 = local14 + 2000L;
					return;
				} else {
					this.anInt2731 = Math.min(this.anInt2730, this.anInt2740);
					this.anInt2730 = this.anInt2740;
				}
				this.aLong80 = local14 + 2000L;
				this.anInt2740 = 0;
			}
			this.anInt2742 = local86;
		} catch (@Pc(231) Exception local231) {
			this.method2020();
			this.aLong79 = local14 + 2000L;
		}
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V")
	public final synchronized void method2010() {
		if (Static125.aClass249_1 != null) {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < 2; local5++) {
				if (Static125.aClass249_1.aClass31Array1[local5] == this) {
					Static125.aClass249_1.aClass31Array1[local5] = null;
				}
				if (Static125.aClass249_1.aClass31Array1[local5] != null) {
					local3 = false;
				}
			}
			if (local3) {
				Static125.aClass249_1.aBoolean472 = true;
				while (Static125.aClass249_1.aBoolean471) {
					Static289.method4249(50L);
				}
				Static125.aClass249_1 = null;
			}
		}
		this.method2020();
		this.aBoolean173 = true;
		this.anIntArray287 = null;
	}

	@OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V")
	public final void method2013() {
		this.aBoolean174 = true;
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "()V")
	protected void method2015() throws Exception {
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "([II)V")
	private void method2016(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static344.aBoolean402) {
			local1 = 512;
		}
		Static469.method6016(arg0, 0, local1);
		this.anInt2729 -= 256;
		if (this.aClass1_Sub19_5 != null && this.anInt2729 <= 0) {
			this.anInt2729 += Static84.anInt2035 >> 4;
			Static435.method5861(this.aClass1_Sub19_5);
			this.method2005(this.aClass1_Sub19_5, this.aClass1_Sub19_5.method5806());
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
						@Pc(88) Class1_Sub19 local88 = null;
						@Pc(93) Class1_Sub19 local93 = this.aClass1_Sub19Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub12 local97 = local93.aClass1_Sub12_5;
								if (local97 == null || local97.anInt4813 <= local61) {
									local93.aBoolean499 = true;
									@Pc(121) int local121 = local93.method5808();
									local45 += local121;
									if (local97 != null) {
										local97.anInt4813 += local121;
									}
									if (local45 >= this.anInt2717) {
										break label103;
									}
									@Pc(140) Class1_Sub19 local140 = local93.method5807();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt7648;
										while (local140 != null) {
											this.method2005(local140, local145 * local140.method5806() >> 8);
											local140 = local93.method5805();
										}
									}
									@Pc(164) Class1_Sub19 local164 = local93.aClass1_Sub19_8;
									local93.aClass1_Sub19_8 = null;
									if (local88 == null) {
										this.aClass1_Sub19Array6[local56] = local164;
									} else {
										local88.aClass1_Sub19_8 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub19Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub19_8;
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
				@Pc(207) Class1_Sub19 local207 = this.aClass1_Sub19Array6[local56];
				this.aClass1_Sub19Array6[local56] = this.aClass1_Sub19Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub19 local221 = local207.aClass1_Sub19_8;
					local207.aClass1_Sub19_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2729 < 0) {
			this.anInt2729 = 0;
		}
		if (this.aClass1_Sub19_5 != null) {
			this.aClass1_Sub19_5.method5803(arg0, 0, 256);
		}
		this.aLong78 = Static250.method3737();
	}

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "(I)V")
	public final synchronized void method2018() {
		this.aBoolean174 = true;
		try {
			this.method2015();
		} catch (@Pc(10) Exception local10) {
			this.method2020();
			this.aLong79 = Static250.method3737() + 2000L;
		}
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "()V")
	protected void method2020() {
	}
}
