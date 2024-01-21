import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!le")
public class Class18 {

	@OriginalMember(owner = "client!le", name = "a", descriptor = "Lclient!be;")
	private Class3_Sub3 aClass3_Sub3_6;

	@OriginalMember(owner = "client!le", name = "d", descriptor = "[I")
	public int[] anIntArray194;

	@OriginalMember(owner = "client!le", name = "s", descriptor = "I")
	public int anInt2299;

	@OriginalMember(owner = "client!le", name = "t", descriptor = "I")
	private int anInt2300;

	@OriginalMember(owner = "client!le", name = "A", descriptor = "I")
	public int anInt2303;

	@OriginalMember(owner = "client!le", name = "l", descriptor = "I")
	private final int anInt2293 = 32;

	@OriginalMember(owner = "client!le", name = "k", descriptor = "J")
	private long aLong62 = Static38.method694();

	@OriginalMember(owner = "client!le", name = "r", descriptor = "J")
	private long aLong63 = 0L;

	@OriginalMember(owner = "client!le", name = "z", descriptor = "Z")
	private boolean aBoolean104 = true;

	@OriginalMember(owner = "client!le", name = "v", descriptor = "[Lclient!be;")
	private final Class3_Sub3[] aClass3_Sub3Array5 = new Class3_Sub3[8];

	@OriginalMember(owner = "client!le", name = "y", descriptor = "[Lclient!be;")
	private final Class3_Sub3[] aClass3_Sub3Array6 = new Class3_Sub3[8];

	@OriginalMember(owner = "client!le", name = "u", descriptor = "I")
	private int anInt2301 = 0;

	@OriginalMember(owner = "client!le", name = "D", descriptor = "I")
	private int anInt2306 = 0;

	@OriginalMember(owner = "client!le", name = "G", descriptor = "J")
	private long aLong64 = 0L;

	@OriginalMember(owner = "client!le", name = "F", descriptor = "I")
	private int anInt2307 = 0;

	@OriginalMember(owner = "client!le", name = "H", descriptor = "I")
	private int anInt2308 = 0;

	@OriginalMember(owner = "client!le", name = "a", descriptor = "()V")
	protected void method1528() throws Exception {
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "()I")
	protected int method1529() throws Exception {
		return this.anInt2299;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(I)V")
	public final synchronized void method1530() {
		if (Static99.aClass7_2 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static99.aClass7_2.aClass18Array1[local11] == this) {
					Static99.aClass7_2.aClass18Array1[local11] = null;
				}
				if (Static99.aClass7_2.aClass18Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static99.aClass7_2.aBoolean10 = true;
				while (Static99.aClass7_2.aBoolean11) {
					Static68.method1266(50L);
				}
				Static99.aClass7_2 = null;
			}
		}
		this.method1538();
		this.anIntArray194 = null;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1531(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "()V")
	protected void method1532() throws Exception {
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "([II)V")
	private void method1533(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static28.aBoolean44) {
			local1 = 512;
		}
		@Pc(9) int local9 = 0;
		@Pc(10) int local10 = local1 - 7;
		while (local9 < local10) {
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
			arg0[local9++] = 0;
		}
		local10 += 7;
		while (local9 < local10) {
			arg0[local9++] = 0;
		}
		this.anInt2307 -= 256;
		if (this.aClass3_Sub3_6 != null && this.anInt2307 <= 0) {
			this.anInt2307 += Static7.anInt420 >> 4;
			Static19.method401(this.aClass3_Sub3_6);
			this.method1540(this.aClass3_Sub3_6.method2058(), this.aClass3_Sub3_6);
			@Pc(98) int local98 = 0;
			@Pc(100) int local100 = 255;
			@Pc(102) int local102 = 7;
			@Pc(109) int local109;
			label110: while (local100 != 0) {
				@Pc(114) int local114;
				if (local102 < 0) {
					local109 = local102 & 0x3;
					local114 = -(local102 >> 2);
				} else {
					local109 = local102;
					local114 = 0;
				}
				for (@Pc(125) int local125 = local100 >>> local109 & 0x11111111; local125 != 0; local125 >>>= 0x4) {
					if ((local125 & 0x1) != 0) {
						local100 &= ~(0x1 << local109);
						@Pc(141) Class3_Sub3 local141 = null;
						@Pc(146) Class3_Sub3 local146 = this.aClass3_Sub3Array5[local109];
						label104: while (true) {
							while (true) {
								if (local146 == null) {
									break label104;
								}
								@Pc(150) Class3_Sub4 local150 = local146.aClass3_Sub4_5;
								if (local150 == null || local150.anInt2497 <= local114) {
									local146.aBoolean171 = true;
									@Pc(174) int local174 = local146.method2063();
									local98 += local174;
									if (local150 != null) {
										local150.anInt2497 += local174;
									}
									if (local98 >= this.anInt2293) {
										break label110;
									}
									@Pc(193) Class3_Sub3 local193 = local146.method2060();
									if (local193 != null) {
										@Pc(198) int local198 = local146.anInt3229;
										while (local193 != null) {
											this.method1540(local198 * local193.method2058() >> 8, local193);
											local193 = local146.method2059();
										}
									}
									@Pc(217) Class3_Sub3 local217 = local146.aClass3_Sub3_8;
									local146.aClass3_Sub3_8 = null;
									if (local141 == null) {
										this.aClass3_Sub3Array5[local109] = local217;
									} else {
										local141.aClass3_Sub3_8 = local217;
									}
									if (local217 == null) {
										this.aClass3_Sub3Array6[local109] = local141;
									}
									local146 = local217;
								} else {
									local100 |= 0x1 << local109;
									local141 = local146;
									local146 = local146.aClass3_Sub3_8;
								}
							}
						}
					}
					local109 += 4;
					local114++;
				}
				local102--;
			}
			for (local109 = 0; local109 < 8; local109++) {
				@Pc(260) Class3_Sub3 local260 = this.aClass3_Sub3Array5[local109];
				this.aClass3_Sub3Array5[local109] = this.aClass3_Sub3Array6[local109] = null;
				while (local260 != null) {
					@Pc(274) Class3_Sub3 local274 = local260.aClass3_Sub3_8;
					local260.aClass3_Sub3_8 = null;
					local260 = local274;
				}
			}
		}
		if (this.anInt2307 < 0) {
			this.anInt2307 = 0;
		}
		if (this.aClass3_Sub3_6 != null) {
			this.aClass3_Sub3_6.method2062(arg0, 0, 256);
		}
		this.aLong62 = Static38.method694();
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
	public final void method1534() {
		this.aBoolean104 = true;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(ILclient!be;)V")
	public final synchronized void method1536(@OriginalArg(1) Class3_Sub3 arg0) {
		this.aClass3_Sub3_6 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(II)V")
	private void method1537() {
		this.anInt2307 -= 256;
		if (this.anInt2307 < 0) {
			this.anInt2307 = 0;
		}
		if (this.aClass3_Sub3_6 != null) {
			this.aClass3_Sub3_6.method2057(256);
		}
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "()V")
	protected void method1538() {
	}

	@OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
	public final synchronized void method1539() {
		if (this.anIntArray194 == null) {
			return;
		}
		@Pc(17) long local17 = Static38.method694();
		try {
			if (this.aLong64 != 0L) {
				if (this.aLong64 > local17) {
					return;
				}
				this.method1542(this.anInt2299);
				this.aLong64 = 0L;
				this.aBoolean104 = true;
			}
			@Pc(43) int local43 = this.method1529();
			if (this.anInt2306 - local43 > this.anInt2301) {
				this.anInt2301 = this.anInt2306 - local43;
			}
			@Pc(69) int local69 = this.anInt2303 + this.anInt2300;
			if (local69 + 256 > 16384) {
				local69 = 16128;
			}
			if (local69 + 256 > this.anInt2299) {
				this.anInt2299 += 1024;
				local43 = 0;
				if (this.anInt2299 > 16384) {
					this.anInt2299 = 16384;
				}
				this.method1538();
				this.method1542(this.anInt2299);
				this.aBoolean104 = true;
				if (this.anInt2299 < local69 + 256) {
					local69 = this.anInt2299 - 256;
					this.anInt2300 = local69 - this.anInt2303;
				}
			}
			while (local43 < local69) {
				this.method1533(this.anIntArray194);
				this.method1532();
				local43 += 256;
			}
			if (local17 > this.aLong63) {
				if (this.aBoolean104) {
					this.aBoolean104 = false;
				} else if (this.anInt2301 == 0 && this.anInt2308 == 0) {
					this.method1538();
					this.aLong64 = local17 + 2000L;
					return;
				} else {
					this.anInt2300 = Math.min(this.anInt2308, this.anInt2301);
					this.anInt2308 = this.anInt2301;
				}
				this.aLong63 = local17 + 2000L;
				this.anInt2301 = 0;
			}
			this.anInt2306 = local43;
		} catch (@Pc(202) Exception local202) {
			this.method1538();
			this.aLong64 = local17 + 2000L;
		}
		try {
			if (local17 > this.aLong62 + 500000L) {
				local17 = this.aLong62;
			}
			while (local17 > this.aLong62 + 5000L) {
				this.method1537();
				this.aLong62 += 256000 / Static7.anInt420;
			}
		} catch (@Pc(253) Exception local253) {
			this.aLong62 = local17;
		}
	}

	@OriginalMember(owner = "client!le", name = "a", descriptor = "(BILclient!be;)V")
	private void method1540(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub3 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class3_Sub3 local12 = this.aClass3_Sub3Array6[local7];
		if (local12 == null) {
			this.aClass3_Sub3Array5[local7] = arg1;
		} else {
			local12.aClass3_Sub3_8 = arg1;
		}
		this.aClass3_Sub3Array6[local7] = arg1;
		arg1.anInt3229 = arg0;
	}

	@OriginalMember(owner = "client!le", name = "b", descriptor = "(B)V")
	public final synchronized void method1541() {
		this.aBoolean104 = true;
		try {
			this.method1528();
		} catch (@Pc(10) Exception local10) {
			this.method1538();
			this.aLong64 = Static38.method694() + 2000L;
		}
	}

	@OriginalMember(owner = "client!le", name = "d", descriptor = "(I)V")
	public void method1542(@OriginalArg(0) int arg0) throws Exception {
	}
}
