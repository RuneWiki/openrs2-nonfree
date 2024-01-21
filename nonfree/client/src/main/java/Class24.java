import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public class Class24 {

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "[I")
	public int[] anIntArray344;

	@OriginalMember(owner = "client!nb", name = "p", descriptor = "Lclient!m;")
	private Class1_Sub9 aClass1_Sub9_6;

	@OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
	private int anInt2141;

	@OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
	public int anInt2142;

	@OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
	public int anInt2144;

	@OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
	private final int anInt2135 = 32;

	@OriginalMember(owner = "client!nb", name = "m", descriptor = "J")
	private long aLong81 = Static54.method1236();

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
	private int anInt2139 = 0;

	@OriginalMember(owner = "client!nb", name = "G", descriptor = "J")
	private long aLong82 = 0L;

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
	private int anInt2140 = 0;

	@OriginalMember(owner = "client!nb", name = "E", descriptor = "[Lclient!m;")
	private final Class1_Sub9[] aClass1_Sub9Array5 = new Class1_Sub9[8];

	@OriginalMember(owner = "client!nb", name = "I", descriptor = "J")
	private long aLong83 = 0L;

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
	private int anInt2138 = 0;

	@OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
	private int anInt2143 = 0;

	@OriginalMember(owner = "client!nb", name = "M", descriptor = "Z")
	private boolean aBoolean88 = true;

	@OriginalMember(owner = "client!nb", name = "O", descriptor = "[Lclient!m;")
	private final Class1_Sub9[] aClass1_Sub9Array6 = new Class1_Sub9[8];

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Z)V")
	public final void method1456() {
		this.aBoolean88 = true;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
	public final synchronized void method1457() {
		if (this.anIntArray344 == null) {
			return;
		}
		@Pc(12) long local12 = Static54.method1236();
		try {
			if (this.aLong83 != 0L) {
				if (local12 < this.aLong83) {
					return;
				}
				this.method1466(this.anInt2142);
				this.aLong83 = 0L;
				this.aBoolean88 = true;
			}
			@Pc(36) int local36 = this.method1458();
			if (this.anInt2143 < this.anInt2140 - local36) {
				this.anInt2143 = this.anInt2140 - local36;
			}
			@Pc(57) int local57 = this.anInt2141 + this.anInt2144;
			if (local57 + 256 > 16384) {
				local57 = 16128;
			}
			if (this.anInt2142 < local57 + 256) {
				this.anInt2142 += 1024;
				if (this.anInt2142 > 16384) {
					this.anInt2142 = 16384;
				}
				local36 = 0;
				this.method1467();
				this.method1466(this.anInt2142);
				this.aBoolean88 = true;
				if (local57 + 256 > this.anInt2142) {
					local57 = this.anInt2142 - 256;
					this.anInt2141 = local57 - this.anInt2144;
				}
			}
			while (local36 < local57) {
				this.method1469(this.anIntArray344);
				this.method1463();
				local36 += 256;
			}
			if (this.aLong82 < local12) {
				if (this.aBoolean88) {
					this.aBoolean88 = false;
				} else if (this.anInt2143 == 0 && this.anInt2138 == 0) {
					this.method1467();
					this.aLong83 = local12 + 2000L;
					return;
				} else {
					this.anInt2141 = Math.min(this.anInt2138, this.anInt2143);
					this.anInt2138 = this.anInt2143;
				}
				this.aLong82 = local12 + 2000L;
				this.anInt2143 = 0;
			}
			this.anInt2140 = local36;
		} catch (@Pc(183) Exception local183) {
			this.method1467();
			this.aLong83 = local12 + 2000L;
		}
		try {
			if (this.aLong81 + 500000L < local12) {
				local12 = this.aLong81;
			}
			while (this.aLong81 + 5000L < local12) {
				this.method1461();
				this.aLong81 += 256000 / Static39.anInt1014;
			}
		} catch (@Pc(236) Exception local236) {
			this.aLong81 = local12;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "()I")
	protected int method1458() throws Exception {
		return this.anInt2142;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1460(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)V")
	private void method1461() {
		this.anInt2139 -= 256;
		if (this.anInt2139 < 0) {
			this.anInt2139 = 0;
		}
		if (this.aClass1_Sub9_6 != null) {
			this.aClass1_Sub9_6.method1553(256);
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "()V")
	protected void method1463() throws Exception {
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)V")
	public final synchronized void method1464() {
		if (Static66.aClass14_2 != null) {
			@Pc(11) boolean local11 = true;
			for (@Pc(13) int local13 = 0; local13 < 2; local13++) {
				if (Static66.aClass14_2.aClass24Array1[local13] == this) {
					Static66.aClass14_2.aClass24Array1[local13] = null;
				}
				if (Static66.aClass14_2.aClass24Array1[local13] != null) {
					local11 = false;
				}
			}
			if (local11) {
				Static66.aClass14_2.aBoolean26 = true;
				while (Static66.aClass14_2.aBoolean27) {
					Static13.method399(50L);
				}
				Static66.aClass14_2 = null;
			}
		}
		this.method1467();
		this.anIntArray344 = null;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "()V")
	protected void method1465() throws Exception {
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	public void method1466(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "()V")
	protected void method1467() {
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lclient!m;II)V")
	private void method1468(@OriginalArg(0) Class1_Sub9 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 >> 5;
		@Pc(18) Class1_Sub9 local18 = this.aClass1_Sub9Array5[local13];
		if (local18 == null) {
			this.aClass1_Sub9Array6[local13] = arg0;
		} else {
			local18.aClass1_Sub9_8 = arg0;
		}
		this.aClass1_Sub9Array5[local13] = arg0;
		arg0.anInt2258 = arg1;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([II)V")
	private void method1469(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static59.aBoolean73) {
			local1 = 512;
		}
		Static139.method1492(arg0, 0, local1);
		this.anInt2139 -= 256;
		if (this.aClass1_Sub9_6 != null && this.anInt2139 <= 0) {
			this.anInt2139 += Static39.anInt1014 >> 4;
			Static60.method1297(this.aClass1_Sub9_6);
			this.method1468(this.aClass1_Sub9_6, this.aClass1_Sub9_6.method1550());
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
						@Pc(88) Class1_Sub9 local88 = null;
						@Pc(93) Class1_Sub9 local93 = this.aClass1_Sub9Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub14 local97 = local93.aClass1_Sub14_5;
								if (local97 == null || local97.anInt2720 <= local61) {
									local93.aBoolean94 = true;
									@Pc(121) int local121 = local93.method1551();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2720 += local121;
									}
									if (local45 >= this.anInt2135) {
										break label103;
									}
									@Pc(140) Class1_Sub9 local140 = local93.method1549();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt2258;
										while (local140 != null) {
											this.method1468(local140, local145 * local140.method1550() >> 8);
											local140 = local93.method1552();
										}
									}
									@Pc(164) Class1_Sub9 local164 = local93.aClass1_Sub9_8;
									local93.aClass1_Sub9_8 = null;
									if (local88 == null) {
										this.aClass1_Sub9Array6[local56] = local164;
									} else {
										local88.aClass1_Sub9_8 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub9Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub9_8;
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
				@Pc(207) Class1_Sub9 local207 = this.aClass1_Sub9Array6[local56];
				this.aClass1_Sub9Array6[local56] = this.aClass1_Sub9Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub9 local221 = local207.aClass1_Sub9_8;
					local207.aClass1_Sub9_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2139 < 0) {
			this.anInt2139 = 0;
		}
		if (this.aClass1_Sub9_6 != null) {
			this.aClass1_Sub9_6.method1554(arg0, 0, 256);
		}
		this.aLong81 = Static54.method1236();
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
	public final synchronized void method1470() {
		this.aBoolean88 = true;
		try {
			this.method1465();
		} catch (@Pc(18) Exception local18) {
			this.method1467();
			this.aLong83 = Static54.method1236() + 2000L;
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILclient!m;)V")
	public final synchronized void method1471(@OriginalArg(1) Class1_Sub9 arg0) {
		this.aClass1_Sub9_6 = arg0;
	}
}
