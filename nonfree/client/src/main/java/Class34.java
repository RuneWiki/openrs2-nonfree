import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!t")
public class Class34 {

	@OriginalMember(owner = "client!t", name = "b", descriptor = "[I")
	public int[] anIntArray351;

	@OriginalMember(owner = "client!t", name = "i", descriptor = "Lclient!d;")
	private Class2_Sub5 aClass2_Sub5_8;

	@OriginalMember(owner = "client!t", name = "D", descriptor = "I")
	public int anInt2964;

	@OriginalMember(owner = "client!t", name = "E", descriptor = "I")
	public int anInt2965;

	@OriginalMember(owner = "client!t", name = "G", descriptor = "I")
	private int anInt2966;

	@OriginalMember(owner = "client!t", name = "w", descriptor = "I")
	private final int anInt2958 = 32;

	@OriginalMember(owner = "client!t", name = "p", descriptor = "J")
	private long aLong90 = Static125.method2075();

	@OriginalMember(owner = "client!t", name = "C", descriptor = "[Lclient!d;")
	private final Class2_Sub5[] aClass2_Sub5Array5 = new Class2_Sub5[8];

	@OriginalMember(owner = "client!t", name = "I", descriptor = "I")
	private int anInt2968 = 0;

	@OriginalMember(owner = "client!t", name = "K", descriptor = "J")
	private long aLong91 = 0L;

	@OriginalMember(owner = "client!t", name = "B", descriptor = "I")
	private int anInt2963 = 0;

	@OriginalMember(owner = "client!t", name = "H", descriptor = "I")
	private int anInt2967 = 0;

	@OriginalMember(owner = "client!t", name = "F", descriptor = "[Lclient!d;")
	private final Class2_Sub5[] aClass2_Sub5Array6 = new Class2_Sub5[8];

	@OriginalMember(owner = "client!t", name = "M", descriptor = "J")
	private long aLong92 = 0L;

	@OriginalMember(owner = "client!t", name = "L", descriptor = "Z")
	private boolean aBoolean243 = true;

	@OriginalMember(owner = "client!t", name = "J", descriptor = "I")
	private int anInt2969 = 0;

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V")
	public final void method2110() {
		this.aBoolean243 = true;
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V")
	public final synchronized void method2111() {
		this.aBoolean243 = true;
		try {
			this.method2116();
		} catch (@Pc(16) Exception local16) {
			this.method2121();
			this.aLong92 = Static125.method2075() + 2000L;
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IB)V")
	private void method2113() {
		this.anInt2969 -= 256;
		if (this.anInt2969 < 0) {
			this.anInt2969 = 0;
		}
		if (this.aClass2_Sub5_8 != null) {
			this.aClass2_Sub5_8.method1959(256);
		}
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(IILclient!d;)V")
	private void method2114(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub5 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class2_Sub5 local12 = this.aClass2_Sub5Array5[local7];
		if (local12 == null) {
			this.aClass2_Sub5Array6[local7] = arg1;
		} else {
			local12.aClass2_Sub5_7 = arg1;
		}
		this.aClass2_Sub5Array5[local7] = arg1;
		arg1.anInt2714 = arg0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Lclient!d;B)V")
	public final synchronized void method2115(@OriginalArg(0) Class2_Sub5 arg0) {
		this.aClass2_Sub5_8 = arg0;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "()V")
	protected void method2116() throws Exception {
	}

	@OriginalMember(owner = "client!t", name = "b", descriptor = "()V")
	protected void method2118() throws Exception {
	}

	@OriginalMember(owner = "client!t", name = "c", descriptor = "()I")
	protected int method2119() throws Exception {
		return this.anInt2965;
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2120(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!t", name = "d", descriptor = "()V")
	protected void method2121() {
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "([II)V")
	private void method2122(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static34.aBoolean59) {
			local1 = 512;
		}
		Static141.method1908(arg0, 0, local1);
		this.anInt2969 -= 256;
		if (this.aClass2_Sub5_8 != null && this.anInt2969 <= 0) {
			this.anInt2969 += Static68.anInt1863 >> 4;
			Static75.method1246(this.aClass2_Sub5_8);
			this.method2114(this.aClass2_Sub5_8.method1958(), this.aClass2_Sub5_8);
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
						@Pc(88) Class2_Sub5 local88 = null;
						@Pc(93) Class2_Sub5 local93 = this.aClass2_Sub5Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub4 local97 = local93.aClass2_Sub4_5;
								if (local97 == null || local97.anInt2499 <= local61) {
									local93.aBoolean227 = true;
									@Pc(121) int local121 = local93.method1955();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2499 += local121;
									}
									if (local45 >= this.anInt2958) {
										break label103;
									}
									@Pc(140) Class2_Sub5 local140 = local93.method1960();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt2714;
										while (local140 != null) {
											this.method2114(local145 * local140.method1958() >> 8, local140);
											local140 = local93.method1954();
										}
									}
									@Pc(164) Class2_Sub5 local164 = local93.aClass2_Sub5_7;
									local93.aClass2_Sub5_7 = null;
									if (local88 == null) {
										this.aClass2_Sub5Array6[local56] = local164;
									} else {
										local88.aClass2_Sub5_7 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub5Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub5_7;
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
				@Pc(207) Class2_Sub5 local207 = this.aClass2_Sub5Array6[local56];
				this.aClass2_Sub5Array6[local56] = this.aClass2_Sub5Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub5 local221 = local207.aClass2_Sub5_7;
					local207.aClass2_Sub5_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2969 < 0) {
			this.anInt2969 = 0;
		}
		if (this.aClass2_Sub5_8 != null) {
			this.aClass2_Sub5_8.method1957(arg0, 0, 256);
		}
		this.aLong90 = Static125.method2075();
	}

	@OriginalMember(owner = "client!t", name = "e", descriptor = "(I)V")
	public final synchronized void method2123() {
		if (Static36.aClass70_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static36.aClass70_1.aClass34Array1[local7] == this) {
					Static36.aClass70_1.aClass34Array1[local7] = null;
				}
				if (Static36.aClass70_1.aClass34Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static36.aClass70_1.aBoolean207 = true;
				while (Static36.aClass70_1.aBoolean206) {
					Static85.method1582(50L);
				}
				Static36.aClass70_1 = null;
			}
		}
		this.method2121();
		this.anIntArray351 = null;
	}

	@OriginalMember(owner = "client!t", name = "f", descriptor = "(I)V")
	public void method2124(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!t", name = "a", descriptor = "(B)V")
	public final synchronized void method2125() {
		if (this.anIntArray351 == null) {
			return;
		}
		@Pc(12) long local12 = Static125.method2075();
		try {
			if (this.aLong92 != 0L) {
				if (local12 < this.aLong92) {
					return;
				}
				this.method2124(this.anInt2965);
				this.aBoolean243 = true;
				this.aLong92 = 0L;
			}
			@Pc(42) int local42 = this.method2119();
			@Pc(53) int local53 = this.anInt2964 + this.anInt2966;
			if (this.anInt2968 < this.anInt2967 - local42) {
				this.anInt2968 = this.anInt2967 - local42;
			}
			if (local53 + 256 > 16384) {
				local53 = 16128;
			}
			if (this.anInt2965 < local53 + 256) {
				local42 = 0;
				this.anInt2965 += 1024;
				if (this.anInt2965 > 16384) {
					this.anInt2965 = 16384;
				}
				this.method2121();
				this.method2124(this.anInt2965);
				this.aBoolean243 = true;
				if (local53 + 256 > this.anInt2965) {
					local53 = this.anInt2965 - 256;
					this.anInt2966 = local53 - this.anInt2964;
				}
			}
			while (local53 > local42) {
				local42 += 256;
				this.method2122(this.anIntArray351);
				this.method2118();
			}
			if (local12 > this.aLong91) {
				if (this.aBoolean243) {
					this.aBoolean243 = false;
				} else if (this.anInt2968 == 0 && this.anInt2963 == 0) {
					this.method2121();
					this.aLong92 = local12 + 2000L;
					return;
				} else {
					this.anInt2966 = Math.min(this.anInt2963, this.anInt2968);
					this.anInt2963 = this.anInt2968;
				}
				this.aLong91 = local12 + 2000L;
				this.anInt2968 = 0;
			}
			this.anInt2967 = local42;
		} catch (@Pc(212) Exception local212) {
			this.method2121();
			this.aLong92 = local12 + 2000L;
		}
		try {
			if (local12 > this.aLong90 + 500000L) {
				local12 = this.aLong90;
			}
			while (this.aLong90 + 5000L < local12) {
				this.method2113();
				this.aLong90 += 256000 / Static68.anInt1863;
			}
		} catch (@Pc(261) Exception local261) {
			this.aLong90 = local12;
		}
	}
}
