import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sh")
public class Class64 {

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "[I")
	public int[] anIntArray115;

	@OriginalMember(owner = "client!sh", name = "i", descriptor = "Lclient!qp;")
	private Class6_Sub8 aClass6_Sub8_5;

	@OriginalMember(owner = "client!sh", name = "B", descriptor = "I")
	public int anInt1968;

	@OriginalMember(owner = "client!sh", name = "C", descriptor = "I")
	public int anInt1969;

	@OriginalMember(owner = "client!sh", name = "J", descriptor = "I")
	private int anInt1971;

	@OriginalMember(owner = "client!sh", name = "p", descriptor = "Z")
	private boolean aBoolean118 = false;

	@OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
	private final int anInt1958 = 32;

	@OriginalMember(owner = "client!sh", name = "k", descriptor = "J")
	private long aLong67 = Static566.method7936();

	@OriginalMember(owner = "client!sh", name = "x", descriptor = "I")
	private int anInt1965 = 0;

	@OriginalMember(owner = "client!sh", name = "z", descriptor = "J")
	private long aLong68 = 0L;

	@OriginalMember(owner = "client!sh", name = "F", descriptor = "[Lclient!qp;")
	private final Class6_Sub8[] aClass6_Sub8Array5 = new Class6_Sub8[8];

	@OriginalMember(owner = "client!sh", name = "D", descriptor = "Z")
	private boolean aBoolean119 = true;

	@OriginalMember(owner = "client!sh", name = "H", descriptor = "[Lclient!qp;")
	private final Class6_Sub8[] aClass6_Sub8Array6 = new Class6_Sub8[8];

	@OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
	private int anInt1967 = 0;

	@OriginalMember(owner = "client!sh", name = "y", descriptor = "I")
	private int anInt1966 = 0;

	@OriginalMember(owner = "client!sh", name = "E", descriptor = "I")
	private int anInt1970 = 0;

	@OriginalMember(owner = "client!sh", name = "I", descriptor = "J")
	private long aLong69 = 0L;

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "()V")
	protected void method1727() {
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLclient!qp;)V")
	public final synchronized void method1730(@OriginalArg(1) Class6_Sub8 arg0) {
		this.aClass6_Sub8_5 = arg0;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZ)V")
	private void method1731() {
		this.anInt1970 -= 256;
		if (this.anInt1970 < 0) {
			this.anInt1970 = 0;
		}
		if (this.aClass6_Sub8_5 != null) {
			this.aClass6_Sub8_5.method9119(256);
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
	public final synchronized void method1732() {
		if (this.aBoolean118) {
			return;
		}
		@Pc(12) long local12 = Static566.method7936();
		try {
			if (this.aLong67 + 6000L < local12) {
				this.aLong67 = local12 - 6000L;
			}
			while (this.aLong67 + 5000L < local12) {
				this.method1731();
				this.aLong67 += (long) (256000 / Static328.anInt8868);
				local12 = Static566.method7936();
			}
		} catch (@Pc(51) Exception local51) {
			this.aLong67 = local12;
		}
		if (this.anIntArray115 == null) {
			return;
		}
		try {
			if (this.aLong69 != 0L) {
				if (local12 < this.aLong69) {
					return;
				}
				this.method1740(this.anInt1968);
				this.aLong69 = 0L;
				this.aBoolean119 = true;
			}
			@Pc(86) int local86 = this.method1736();
			if (this.anInt1965 < this.anInt1967 - local86) {
				this.anInt1965 = this.anInt1967 - local86;
			}
			@Pc(111) int local111 = this.anInt1969 + this.anInt1971;
			if (local111 + 256 > 16384) {
				local111 = 16128;
			}
			if (this.anInt1968 < local111 + 256) {
				this.anInt1968 += 1024;
				if (this.anInt1968 > 16384) {
					this.anInt1968 = 16384;
				}
				this.method1727();
				local86 = 0;
				this.method1740(this.anInt1968);
				if (local111 + 256 > this.anInt1968) {
					local111 = this.anInt1968 - 256;
					this.anInt1971 = local111 - this.anInt1969;
				}
				this.aBoolean119 = true;
			}
			while (local111 > local86) {
				this.method1742(this.anIntArray115);
				local86 += 256;
				this.method1737();
			}
			if (local12 > this.aLong68) {
				if (this.aBoolean119) {
					this.aBoolean119 = false;
				} else if (this.anInt1965 == 0 && this.anInt1966 == 0) {
					this.method1727();
					this.aLong69 = local12 + 2000L;
					return;
				} else {
					this.anInt1971 = Math.min(this.anInt1966, this.anInt1965);
					this.anInt1966 = this.anInt1965;
				}
				this.aLong68 = local12 + 2000L;
				this.anInt1965 = 0;
			}
			this.anInt1967 = local86;
		} catch (@Pc(232) Exception local232) {
			this.method1727();
			this.aLong69 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1733(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
	public final synchronized void method1735() {
		if (Static536.aClass69_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static536.aClass69_1.aClass64Array1[local7] == this) {
					Static536.aClass69_1.aClass64Array1[local7] = null;
				}
				if (Static536.aClass69_1.aClass64Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static536.aClass69_1.aBoolean120 = true;
				while (Static536.aClass69_1.aBoolean121) {
					Static520.method7923(50L);
				}
				Static536.aClass69_1 = null;
			}
		}
		this.method1727();
		this.anIntArray115 = null;
		this.aBoolean118 = true;
	}

	@OriginalMember(owner = "client!sh", name = "b", descriptor = "()I")
	protected int method1736() throws Exception {
		return this.anInt1968;
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "()V")
	protected void method1737() throws Exception {
	}

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "()V")
	protected void method1738() throws Exception {
	}

	@OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V")
	public final synchronized void method1739() {
		this.aBoolean119 = true;
		try {
			this.method1738();
		} catch (@Pc(14) Exception local14) {
			this.method1727();
			this.aLong69 = Static566.method7936() + 2000L;
		}
	}

	@OriginalMember(owner = "client!sh", name = "d", descriptor = "(I)V")
	public void method1740(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lclient!qp;II)V")
	private void method1741(@OriginalArg(0) Class6_Sub8 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class6_Sub8 local12 = this.aClass6_Sub8Array6[local7];
		if (local12 == null) {
			this.aClass6_Sub8Array5[local7] = arg0;
		} else {
			local12.aClass6_Sub8_9 = arg0;
		}
		this.aClass6_Sub8Array6[local7] = arg0;
		arg0.anInt10800 = arg1;
	}

	@OriginalMember(owner = "client!sh", name = "a", descriptor = "([II)V")
	private void method1742(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static555.aBoolean676) {
			local1 = 512;
		}
		Static679.method1570(arg0, 0, local1);
		this.anInt1970 -= 256;
		if (this.aClass6_Sub8_5 != null && this.anInt1970 <= 0) {
			this.anInt1970 += Static328.anInt8868 >> 4;
			Static222.method3226(this.aClass6_Sub8_5);
			this.method1741(this.aClass6_Sub8_5, this.aClass6_Sub8_5.method9123());
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
						@Pc(88) Class6_Sub8 local88 = null;
						@Pc(93) Class6_Sub8 local93 = this.aClass6_Sub8Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class6_Sub21 local97 = local93.aClass6_Sub21_6;
								if (local97 == null || local97.anInt2709 <= local61) {
									local93.aBoolean744 = true;
									@Pc(121) int local121 = local93.method9125();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2709 += local121;
									}
									if (local45 >= this.anInt1958) {
										break label103;
									}
									@Pc(140) Class6_Sub8 local140 = local93.method9121();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt10800;
										while (local140 != null) {
											this.method1741(local140, local145 * local140.method9123() >> 8);
											local140 = local93.method9124();
										}
									}
									@Pc(164) Class6_Sub8 local164 = local93.aClass6_Sub8_9;
									local93.aClass6_Sub8_9 = null;
									if (local88 == null) {
										this.aClass6_Sub8Array5[local56] = local164;
									} else {
										local88.aClass6_Sub8_9 = local164;
									}
									if (local164 == null) {
										this.aClass6_Sub8Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass6_Sub8_9;
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
				@Pc(207) Class6_Sub8 local207 = this.aClass6_Sub8Array5[local56];
				this.aClass6_Sub8Array5[local56] = this.aClass6_Sub8Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class6_Sub8 local221 = local207.aClass6_Sub8_9;
					local207.aClass6_Sub8_9 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt1970 < 0) {
			this.anInt1970 = 0;
		}
		if (this.aClass6_Sub8_5 != null) {
			this.aClass6_Sub8_5.method9120(arg0, 0, 256);
		}
		this.aLong67 = Static566.method7936();
	}
}
