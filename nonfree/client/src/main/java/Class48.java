import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public class Class48 {

	@OriginalMember(owner = "client!fr", name = "m", descriptor = "Lclient!ar;")
	private Class1_Sub6 aClass1_Sub6_4;

	@OriginalMember(owner = "client!fr", name = "u", descriptor = "[I")
	public int[] anIntArray150;

	@OriginalMember(owner = "client!fr", name = "x", descriptor = "I")
	public int anInt1951;

	@OriginalMember(owner = "client!fr", name = "B", descriptor = "I")
	private int anInt1953;

	@OriginalMember(owner = "client!fr", name = "F", descriptor = "I")
	public int anInt1955;

	@OriginalMember(owner = "client!fr", name = "i", descriptor = "I")
	private final int anInt1940 = 32;

	@OriginalMember(owner = "client!fr", name = "k", descriptor = "Z")
	private boolean aBoolean135 = false;

	@OriginalMember(owner = "client!fr", name = "v", descriptor = "J")
	private long aLong74 = Static183.method3462();

	@OriginalMember(owner = "client!fr", name = "z", descriptor = "J")
	private long aLong75 = 0L;

	@OriginalMember(owner = "client!fr", name = "A", descriptor = "I")
	private int anInt1952 = 0;

	@OriginalMember(owner = "client!fr", name = "y", descriptor = "Z")
	private boolean aBoolean136 = true;

	@OriginalMember(owner = "client!fr", name = "w", descriptor = "I")
	private int anInt1950 = 0;

	@OriginalMember(owner = "client!fr", name = "E", descriptor = "I")
	private int anInt1954 = 0;

	@OriginalMember(owner = "client!fr", name = "D", descriptor = "[Lclient!ar;")
	private final Class1_Sub6[] aClass1_Sub6Array5 = new Class1_Sub6[8];

	@OriginalMember(owner = "client!fr", name = "C", descriptor = "J")
	private long aLong76 = 0L;

	@OriginalMember(owner = "client!fr", name = "H", descriptor = "I")
	private int anInt1956 = 0;

	@OriginalMember(owner = "client!fr", name = "G", descriptor = "[Lclient!ar;")
	private final Class1_Sub6[] aClass1_Sub6Array6 = new Class1_Sub6[8];

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "()V")
	protected void method1822() throws Exception {
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "()V")
	protected void method1823() {
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "()I")
	protected int method1824() throws Exception {
		return this.anInt1955;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
	private void method1825() {
		this.anInt1950 -= 256;
		if (this.anInt1950 < 0) {
			this.anInt1950 = 0;
		}
		if (this.aClass1_Sub6_4 != null) {
			this.aClass1_Sub6_4.method4051(256);
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!ar;I)V")
	public final synchronized void method1826(@OriginalArg(0) Class1_Sub6 arg0) {
		this.aClass1_Sub6_4 = arg0;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1829(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)V")
	public final synchronized void method1830() {
		if (this.aBoolean135) {
			return;
		}
		@Pc(12) long local12 = Static183.method3462();
		try {
			if (this.aLong74 + 500000L < local12) {
				this.aLong74 = local12 - 500000L;
			}
			while (local12 > this.aLong74 + 5000L) {
				this.method1825();
				this.aLong74 += 256000 / Static14.anInt4962;
			}
		} catch (@Pc(52) Exception local52) {
			this.aLong74 = local12;
		}
		if (this.anIntArray150 == null) {
			return;
		}
		try {
			if (this.aLong76 != 0L) {
				if (local12 < this.aLong76) {
					return;
				}
				this.method1835(this.anInt1955);
				this.aLong76 = 0L;
				this.aBoolean136 = true;
			}
			@Pc(85) int local85 = this.method1824();
			if (this.anInt1956 - local85 > this.anInt1954) {
				this.anInt1954 = this.anInt1956 - local85;
			}
			@Pc(111) int local111 = this.anInt1953 + this.anInt1951;
			if (local111 + 256 > 16384) {
				local111 = 16128;
			}
			if (this.anInt1955 < local111 + 256) {
				this.anInt1955 += 1024;
				if (this.anInt1955 > 16384) {
					this.anInt1955 = 16384;
				}
				this.method1823();
				this.method1835(this.anInt1955);
				local85 = 0;
				this.aBoolean136 = true;
				if (this.anInt1955 < local111 + 256) {
					local111 = this.anInt1955 - 256;
					this.anInt1953 = local111 - this.anInt1951;
				}
			}
			while (local111 > local85) {
				this.method1838(this.anIntArray150);
				this.method1831();
				local85 += 256;
			}
			if (local12 > this.aLong75) {
				if (this.aBoolean136) {
					this.aBoolean136 = false;
				} else if (this.anInt1954 == 0 && this.anInt1952 == 0) {
					this.method1823();
					this.aLong76 = local12 + 2000L;
					return;
				} else {
					this.anInt1953 = Math.min(this.anInt1952, this.anInt1954);
					this.anInt1952 = this.anInt1954;
				}
				this.anInt1954 = 0;
				this.aLong75 = local12 + 2000L;
			}
			this.anInt1956 = local85;
		} catch (@Pc(238) Exception local238) {
			this.method1823();
			this.aLong76 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "()V")
	protected void method1831() throws Exception {
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(Z)V")
	public final synchronized void method1833() {
		if (Static351.aClass74_2 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static351.aClass74_2.aClass48Array1[local11] == this) {
					Static351.aClass74_2.aClass48Array1[local11] = null;
				}
				if (Static351.aClass74_2.aClass48Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static351.aClass74_2.aBoolean175 = true;
				while (Static351.aClass74_2.aBoolean176) {
					Static135.method2737(50L);
				}
				Static351.aClass74_2 = null;
			}
		}
		this.method1823();
		this.anIntArray150 = null;
		this.aBoolean135 = true;
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(I)V")
	public final void method1834() {
		this.aBoolean136 = true;
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "(I)V")
	public void method1835(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(ILclient!ar;I)V")
	private void method1836(@OriginalArg(1) Class1_Sub6 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1 >> 5;
		@Pc(16) Class1_Sub6 local16 = this.aClass1_Sub6Array5[local11];
		if (local16 == null) {
			this.aClass1_Sub6Array6[local11] = arg0;
		} else {
			local16.aClass1_Sub6_8 = arg0;
		}
		this.aClass1_Sub6Array5[local11] = arg0;
		arg0.anInt4373 = arg1;
	}

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "(I)V")
	public final synchronized void method1837() {
		this.aBoolean136 = true;
		try {
			this.method1822();
		} catch (@Pc(14) Exception local14) {
			this.method1823();
			this.aLong76 = Static183.method3462() + 2000L;
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "([II)V")
	private void method1838(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static100.aBoolean156) {
			local1 = 512;
		}
		Static374.method2831(arg0, 0, local1);
		this.anInt1950 -= 256;
		if (this.aClass1_Sub6_4 != null && this.anInt1950 <= 0) {
			this.anInt1950 += Static14.anInt4962 >> 4;
			Static300.method5232(this.aClass1_Sub6_4);
			this.method1836(this.aClass1_Sub6_4, this.aClass1_Sub6_4.method4053());
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
						@Pc(88) Class1_Sub6 local88 = null;
						@Pc(93) Class1_Sub6 local93 = this.aClass1_Sub6Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub39 local97 = local93.aClass1_Sub39_5;
								if (local97 == null || local97.anInt6074 <= local61) {
									local93.aBoolean325 = true;
									@Pc(121) int local121 = local93.method4057();
									local45 += local121;
									if (local97 != null) {
										local97.anInt6074 += local121;
									}
									if (local45 >= this.anInt1940) {
										break label103;
									}
									@Pc(140) Class1_Sub6 local140 = local93.method4054();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt4373;
										while (local140 != null) {
											this.method1836(local140, local145 * local140.method4053() >> 8);
											local140 = local93.method4056();
										}
									}
									@Pc(164) Class1_Sub6 local164 = local93.aClass1_Sub6_8;
									local93.aClass1_Sub6_8 = null;
									if (local88 == null) {
										this.aClass1_Sub6Array6[local56] = local164;
									} else {
										local88.aClass1_Sub6_8 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub6Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub6_8;
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
				@Pc(207) Class1_Sub6 local207 = this.aClass1_Sub6Array6[local56];
				this.aClass1_Sub6Array6[local56] = this.aClass1_Sub6Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub6 local221 = local207.aClass1_Sub6_8;
					local207.aClass1_Sub6_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt1950 < 0) {
			this.anInt1950 = 0;
		}
		if (this.aClass1_Sub6_4 != null) {
			this.aClass1_Sub6_4.method4055(arg0, 0, 256);
		}
		this.aLong74 = Static183.method3462();
	}
}
