import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public class Class12 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "[I")
	public int[] anIntArray290;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "Lclient!sd;")
	private Class5_Sub5 aClass5_Sub5_7;

	@OriginalMember(owner = "client!gb", name = "G", descriptor = "I")
	public int anInt2303;

	@OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
	public int anInt2304;

	@OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
	private int anInt2307;

	@OriginalMember(owner = "client!gb", name = "z", descriptor = "I")
	private final int anInt2299 = 32;

	@OriginalMember(owner = "client!gb", name = "f", descriptor = "J")
	private long aLong73 = Static102.method1742();

	@OriginalMember(owner = "client!gb", name = "H", descriptor = "[Lclient!sd;")
	private final Class5_Sub5[] aClass5_Sub5Array6 = new Class5_Sub5[8];

	@OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
	private int anInt2302 = 0;

	@OriginalMember(owner = "client!gb", name = "K", descriptor = "I")
	private int anInt2305 = 0;

	@OriginalMember(owner = "client!gb", name = "I", descriptor = "J")
	private long aLong74 = 0L;

	@OriginalMember(owner = "client!gb", name = "F", descriptor = "[Lclient!sd;")
	private final Class5_Sub5[] aClass5_Sub5Array5 = new Class5_Sub5[8];

	@OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
	private int anInt2308 = 0;

	@OriginalMember(owner = "client!gb", name = "N", descriptor = "J")
	private long aLong75 = 0L;

	@OriginalMember(owner = "client!gb", name = "P", descriptor = "Z")
	private boolean aBoolean81 = true;

	@OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
	private int anInt2306 = 0;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
	private void method1510() {
		this.anInt2302 -= 256;
		if (this.anInt2302 < 0) {
			this.anInt2302 = 0;
		}
		if (this.aClass5_Sub5_7 != null) {
			this.aClass5_Sub5_7.method1556(256);
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
	public final void method1511() {
		this.aBoolean81 = true;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(B)V")
	public final synchronized void method1512() {
		if (this.anIntArray290 == null) {
			return;
		}
		@Pc(12) long local12 = Static102.method1742();
		try {
			if (this.aLong74 != 0L) {
				if (local12 < this.aLong74) {
					return;
				}
				this.method1513(this.anInt2304);
				this.aLong74 = 0L;
				this.aBoolean81 = true;
			}
			@Pc(36) int local36 = this.method1524();
			if (this.anInt2305 - local36 > this.anInt2308) {
				this.anInt2308 = this.anInt2305 - local36;
			}
			@Pc(57) int local57 = this.anInt2303 + this.anInt2307;
			if (local57 + 256 > 16384) {
				local57 = 16128;
			}
			if (local57 + 256 > this.anInt2304) {
				this.anInt2304 += 1024;
				if (this.anInt2304 > 16384) {
					this.anInt2304 = 16384;
				}
				local36 = 0;
				this.method1525();
				this.method1513(this.anInt2304);
				if (this.anInt2304 < local57 + 256) {
					local57 = this.anInt2304 - 256;
					this.anInt2307 = local57 - this.anInt2303;
				}
				this.aBoolean81 = true;
			}
			while (local36 < local57) {
				this.method1518(this.anIntArray290);
				local36 += 256;
				this.method1519();
			}
			if (this.aLong75 < local12) {
				if (this.aBoolean81) {
					this.aBoolean81 = false;
				} else if (this.anInt2308 == 0 && this.anInt2306 == 0) {
					this.method1525();
					this.aLong74 = local12 + 2000L;
					return;
				} else {
					this.anInt2307 = Math.min(this.anInt2306, this.anInt2308);
					this.anInt2306 = this.anInt2308;
				}
				this.aLong75 = local12 + 2000L;
				this.anInt2308 = 0;
			}
			this.anInt2305 = local36;
		} catch (@Pc(189) Exception local189) {
			this.method1525();
			this.aLong74 = local12 + 2000L;
		}
		try {
			if (this.aLong73 + 500000L < local12) {
				local12 = this.aLong73;
			}
			while (local12 > this.aLong73 + 5000L) {
				this.method1510();
				this.aLong73 += 256000 / Static78.anInt1981;
			}
		} catch (@Pc(238) Exception local238) {
			this.aLong73 = local12;
		}
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)V")
	public void method1513(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!sd;)V")
	public final synchronized void method1514(@OriginalArg(1) Class5_Sub5 arg0) {
		this.aClass5_Sub5_7 = arg0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1516(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
	public final synchronized void method1517() {
		if (Static61.aClass72_1 != null) {
			@Pc(15) boolean local15 = true;
			for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
				if (Static61.aClass72_1.aClass12Array1[local17] == this) {
					Static61.aClass72_1.aClass12Array1[local17] = null;
				}
				if (Static61.aClass72_1.aClass12Array1[local17] != null) {
					local15 = false;
				}
			}
			if (local15) {
				Static61.aClass72_1.aBoolean106 = true;
				while (Static61.aClass72_1.aBoolean107) {
					Static118.method1893(50L);
				}
				Static61.aClass72_1 = null;
			}
		}
		this.method1525();
		this.anIntArray290 = null;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "([II)V")
	private void method1518(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static37.aBoolean28) {
			local1 = 512;
		}
		Static136.method892(arg0, 0, local1);
		this.anInt2302 -= 256;
		if (this.aClass5_Sub5_7 != null && this.anInt2302 <= 0) {
			this.anInt2302 += Static78.anInt1981 >> 4;
			Static4.method1687(this.aClass5_Sub5_7);
			this.method1526(this.aClass5_Sub5_7.method1559(), this.aClass5_Sub5_7);
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
						@Pc(88) Class5_Sub5 local88 = null;
						@Pc(93) Class5_Sub5 local93 = this.aClass5_Sub5Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class5_Sub21 local97 = local93.aClass5_Sub21_5;
								if (local97 == null || local97.anInt2644 <= local61) {
									local93.aBoolean82 = true;
									@Pc(121) int local121 = local93.method1557();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2644 += local121;
									}
									if (local45 >= this.anInt2299) {
										break label103;
									}
									@Pc(140) Class5_Sub5 local140 = local93.method1558();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt2356;
										while (local140 != null) {
											this.method1526(local145 * local140.method1559() >> 8, local140);
											local140 = local93.method1560();
										}
									}
									@Pc(164) Class5_Sub5 local164 = local93.aClass5_Sub5_8;
									local93.aClass5_Sub5_8 = null;
									if (local88 == null) {
										this.aClass5_Sub5Array5[local56] = local164;
									} else {
										local88.aClass5_Sub5_8 = local164;
									}
									if (local164 == null) {
										this.aClass5_Sub5Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass5_Sub5_8;
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
				@Pc(207) Class5_Sub5 local207 = this.aClass5_Sub5Array5[local56];
				this.aClass5_Sub5Array5[local56] = this.aClass5_Sub5Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class5_Sub5 local221 = local207.aClass5_Sub5_8;
					local207.aClass5_Sub5_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2302 < 0) {
			this.anInt2302 = 0;
		}
		if (this.aClass5_Sub5_7 != null) {
			this.aClass5_Sub5_7.method1561(arg0, 0, 256);
		}
		this.aLong73 = Static102.method1742();
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "()V")
	protected void method1519() throws Exception {
	}

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "()V")
	protected void method1522() throws Exception {
	}

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "(I)V")
	public final synchronized void method1523() {
		this.aBoolean81 = true;
		try {
			this.method1522();
		} catch (@Pc(15) Exception local15) {
			this.method1525();
			this.aLong74 = Static102.method1742() + 2000L;
		}
	}

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "()I")
	protected int method1524() throws Exception {
		return this.anInt2304;
	}

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "()V")
	protected void method1525() {
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!sd;I)V")
	private void method1526(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub5 arg1) {
		@Pc(12) int local12 = arg0 >> 5;
		@Pc(17) Class5_Sub5 local17 = this.aClass5_Sub5Array6[local12];
		if (local17 == null) {
			this.aClass5_Sub5Array5[local12] = arg1;
		} else {
			local17.aClass5_Sub5_8 = arg1;
		}
		this.aClass5_Sub5Array6[local12] = arg1;
		arg1.anInt2356 = arg0;
	}
}
