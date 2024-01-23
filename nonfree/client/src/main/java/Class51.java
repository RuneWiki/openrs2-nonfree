import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public class Class51 {

	@OriginalMember(owner = "client!fl", name = "m", descriptor = "Lclient!fb;")
	private Class4_Sub9 aClass4_Sub9_8;

	@OriginalMember(owner = "client!fl", name = "B", descriptor = "[I")
	public int[] anIntArray358;

	@OriginalMember(owner = "client!fl", name = "G", descriptor = "I")
	private int anInt4036;

	@OriginalMember(owner = "client!fl", name = "K", descriptor = "I")
	public int anInt4040;

	@OriginalMember(owner = "client!fl", name = "N", descriptor = "I")
	public int anInt4041;

	@OriginalMember(owner = "client!fl", name = "k", descriptor = "Z")
	private boolean aBoolean263 = false;

	@OriginalMember(owner = "client!fl", name = "o", descriptor = "I")
	private int anInt4022 = 32;

	@OriginalMember(owner = "client!fl", name = "F", descriptor = "J")
	private long aLong144 = Static133.method2163();

	@OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
	private int anInt4037 = 0;

	@OriginalMember(owner = "client!fl", name = "I", descriptor = "I")
	private int anInt4038 = 0;

	@OriginalMember(owner = "client!fl", name = "J", descriptor = "I")
	private int anInt4039 = 0;

	@OriginalMember(owner = "client!fl", name = "L", descriptor = "J")
	private long aLong145 = 0L;

	@OriginalMember(owner = "client!fl", name = "M", descriptor = "[Lclient!fb;")
	private Class4_Sub9[] aClass4_Sub9Array5 = new Class4_Sub9[8];

	@OriginalMember(owner = "client!fl", name = "Q", descriptor = "J")
	private long aLong146 = 0L;

	@OriginalMember(owner = "client!fl", name = "O", descriptor = "[Lclient!fb;")
	private Class4_Sub9[] aClass4_Sub9Array6 = new Class4_Sub9[8];

	@OriginalMember(owner = "client!fl", name = "P", descriptor = "I")
	private int anInt4042 = 0;

	@OriginalMember(owner = "client!fl", name = "R", descriptor = "Z")
	private boolean aBoolean264 = true;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
	public final synchronized void method3268() {
		if (Static165.aClass96_1 != null) {
			@Pc(6) boolean local6 = true;
			for (@Pc(8) int local8 = 0; local8 < 2; local8++) {
				if (Static165.aClass96_1.aClass51Array1[local8] == this) {
					Static165.aClass96_1.aClass51Array1[local8] = null;
				}
				if (Static165.aClass96_1.aClass51Array1[local8] != null) {
					local6 = false;
				}
			}
			if (local6) {
				Static165.aClass96_1.aBoolean194 = true;
				while (Static165.aClass96_1.aBoolean195) {
					Static122.method2061(50L);
				}
				Static165.aClass96_1 = null;
			}
		}
		this.method3277();
		this.anIntArray358 = null;
		this.aBoolean263 = true;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "()V")
	protected void method3269() throws Exception {
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "()V")
	protected void method3270() throws Exception {
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "()I")
	protected int method3271() throws Exception {
		return this.anInt4041;
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
	public final synchronized void method3272() {
		this.aBoolean264 = true;
		try {
			this.method3270();
		} catch (@Pc(16) Exception local16) {
			this.method3277();
			this.aLong145 = Static133.method2163() + 2000L;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "([II)V")
	private void method3273(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static14.aBoolean153) {
			local1 = 512;
		}
		Static307.method3246(arg0, 0, local1);
		this.anInt4037 -= 256;
		if (this.aClass4_Sub9_8 != null && this.anInt4037 <= 0) {
			this.anInt4037 += Static79.anInt1529 >> 4;
			Static145.method2344(this.aClass4_Sub9_8);
			this.method3278(this.aClass4_Sub9_8, this.aClass4_Sub9_8.method1464());
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = 255;
			@Pc(49) int local49 = 7;
			label106: while (local47 != 0) {
				@Pc(57) int local57;
				@Pc(62) int local62;
				if (local49 < 0) {
					local57 = local49 & 0x3;
					local62 = -(local49 >> 2);
				} else {
					local57 = local49;
					local62 = 0;
				}
				for (@Pc(73) int local73 = local47 >>> local57 & 0x11111111; local73 != 0; local73 >>>= 0x4) {
					if ((local73 & 0x1) != 0) {
						local47 &= ~(0x1 << local57);
						@Pc(91) Class4_Sub9 local91 = null;
						@Pc(96) Class4_Sub9 local96 = this.aClass4_Sub9Array5[local57];
						label100: while (true) {
							while (true) {
								if (local96 == null) {
									break label100;
								}
								@Pc(101) Class4_Sub15 local101 = local96.aClass4_Sub15_5;
								if (local101 == null || local101.anInt1903 <= local62) {
									local96.aBoolean142 = true;
									@Pc(125) int local125 = local96.method1467();
									local45 += local125;
									if (local101 != null) {
										local101.anInt1903 += local125;
									}
									if (local45 >= this.anInt4022) {
										break label106;
									}
									@Pc(145) Class4_Sub9 local145 = local96.method1468();
									if (local145 != null) {
										@Pc(150) int local150 = local96.anInt1887;
										while (local145 != null) {
											this.method3278(local145, local150 * local145.method1464() >> 8);
											local145 = local96.method1463();
										}
									}
									@Pc(169) Class4_Sub9 local169 = local96.aClass4_Sub9_6;
									local96.aClass4_Sub9_6 = null;
									if (local91 == null) {
										this.aClass4_Sub9Array5[local57] = local169;
									} else {
										local91.aClass4_Sub9_6 = local169;
									}
									if (local169 == null) {
										this.aClass4_Sub9Array6[local57] = local91;
									}
									local96 = local169;
								} else {
									local47 |= 0x1 << local57;
									local91 = local96;
									local96 = local96.aClass4_Sub9_6;
								}
							}
						}
					}
					local57 += 4;
					local62++;
				}
				local49--;
			}
			for (local49 = 0; local49 < 8; local49++) {
				@Pc(212) Class4_Sub9 local212 = this.aClass4_Sub9Array5[local49];
				this.aClass4_Sub9Array5[local49] = this.aClass4_Sub9Array6[local49] = null;
				while (local212 != null) {
					@Pc(227) Class4_Sub9 local227 = local212.aClass4_Sub9_6;
					local212.aClass4_Sub9_6 = null;
					local212 = local227;
				}
			}
		}
		if (this.anInt4037 < 0) {
			this.anInt4037 = 0;
		}
		if (this.aClass4_Sub9_8 != null) {
			this.aClass4_Sub9_8.method1469(arg0, 0, 256);
		}
		this.aLong144 = Static133.method2163();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
	private void method3276() {
		this.anInt4037 -= 256;
		if (this.anInt4037 < 0) {
			this.anInt4037 = 0;
		}
		if (this.aClass4_Sub9_8 != null) {
			this.aClass4_Sub9_8.method1465(256);
		}
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "()V")
	protected void method3277() {
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BLclient!fb;I)V")
	private void method3278(@OriginalArg(1) Class4_Sub9 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1 >> 5;
		@Pc(20) Class4_Sub9 local20 = this.aClass4_Sub9Array6[local11];
		if (local20 == null) {
			this.aClass4_Sub9Array5[local11] = arg0;
		} else {
			local20.aClass4_Sub9_6 = arg0;
		}
		this.aClass4_Sub9Array6[local11] = arg0;
		arg0.anInt1887 = arg1;
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V")
	public final void method3280() {
		this.aBoolean264 = true;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILclient!fb;)V")
	public final synchronized void method3283(@OriginalArg(1) Class4_Sub9 arg0) {
		this.aClass4_Sub9_8 = arg0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method3284(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "(I)V")
	public void method3285(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!fl", name = "g", descriptor = "(I)V")
	public final synchronized void method3286() {
		if (this.aBoolean263) {
			return;
		}
		@Pc(13) long local13 = Static133.method2163();
		try {
			if (this.aLong144 + 500000L < local13) {
				this.aLong144 = local13 - 500000L;
			}
			while (this.aLong144 + 5000L < local13) {
				this.method3276();
				this.aLong144 += 256000 / Static79.anInt1529;
			}
		} catch (@Pc(60) Exception local60) {
			this.aLong144 = local13;
		}
		if (this.anIntArray358 == null) {
			return;
		}
		try {
			if (this.aLong145 != 0L) {
				if (local13 < this.aLong145) {
					return;
				}
				this.method3285(this.anInt4041);
				this.aBoolean264 = true;
				this.aLong145 = 0L;
			}
			@Pc(95) int local95 = this.method3271();
			if (this.anInt4038 < this.anInt4042 - local95) {
				this.anInt4038 = this.anInt4042 - local95;
			}
			@Pc(117) int local117 = this.anInt4036 + this.anInt4040;
			if (local117 + 256 > 16384) {
				local117 = 16128;
			}
			if (local117 + 256 > this.anInt4041) {
				local95 = 0;
				this.anInt4041 += 1024;
				if (this.anInt4041 > 16384) {
					this.anInt4041 = 16384;
				}
				this.method3277();
				this.method3285(this.anInt4041);
				if (local117 + 256 > this.anInt4041) {
					local117 = this.anInt4041 - 256;
					this.anInt4036 = local117 - this.anInt4040;
				}
				this.aBoolean264 = true;
			}
			while (local95 < local117) {
				local95 += 256;
				this.method3273(this.anIntArray358);
				this.method3269();
			}
			if (this.aLong146 < local13) {
				if (this.aBoolean264) {
					this.aBoolean264 = false;
				} else if (this.anInt4038 == 0 && this.anInt4039 == 0) {
					this.method3277();
					this.aLong145 = local13 + 2000L;
					return;
				} else {
					this.anInt4036 = Math.min(this.anInt4039, this.anInt4038);
					this.anInt4039 = this.anInt4038;
				}
				this.aLong146 = local13 + 2000L;
				this.anInt4038 = 0;
			}
			this.anInt4042 = local95;
		} catch (@Pc(251) Exception local251) {
			this.method3277();
			this.aLong145 = local13 + 2000L;
		}
	}
}
