import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wn")
public class Class3 {

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "Lclient!md;")
	private Class2_Sub5 aClass2_Sub5_6;

	@OriginalMember(owner = "client!wn", name = "l", descriptor = "[I")
	public int[] anIntArray172;

	@OriginalMember(owner = "client!wn", name = "B", descriptor = "I")
	public int anInt2619;

	@OriginalMember(owner = "client!wn", name = "E", descriptor = "I")
	private int anInt2620;

	@OriginalMember(owner = "client!wn", name = "K", descriptor = "I")
	public int anInt2623;

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "Z")
	private boolean aBoolean201 = false;

	@OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
	private int anInt2606 = 32;

	@OriginalMember(owner = "client!wn", name = "n", descriptor = "J")
	private long aLong134 = Static6.method126();

	@OriginalMember(owner = "client!wn", name = "H", descriptor = "I")
	private int anInt2622 = 0;

	@OriginalMember(owner = "client!wn", name = "F", descriptor = "I")
	private int anInt2621 = 0;

	@OriginalMember(owner = "client!wn", name = "G", descriptor = "Z")
	private boolean aBoolean204 = true;

	@OriginalMember(owner = "client!wn", name = "L", descriptor = "I")
	private int anInt2624 = 0;

	@OriginalMember(owner = "client!wn", name = "M", descriptor = "I")
	private int anInt2625 = 0;

	@OriginalMember(owner = "client!wn", name = "D", descriptor = "[Lclient!md;")
	private Class2_Sub5[] aClass2_Sub5Array5 = new Class2_Sub5[8];

	@OriginalMember(owner = "client!wn", name = "C", descriptor = "J")
	private long aLong135 = 0L;

	@OriginalMember(owner = "client!wn", name = "I", descriptor = "[Lclient!md;")
	private Class2_Sub5[] aClass2_Sub5Array6 = new Class2_Sub5[8];

	@OriginalMember(owner = "client!wn", name = "J", descriptor = "J")
	private long aLong136 = 0L;

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(B)V")
	public final synchronized void method2225() {
		if (Static260.aClass89_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static260.aClass89_1.aClass3Array1[local7] == this) {
					Static260.aClass89_1.aClass3Array1[local7] = null;
				}
				if (Static260.aClass89_1.aClass3Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static260.aClass89_1.aBoolean210 = true;
				while (Static260.aClass89_1.aBoolean207) {
					Static134.method2329(50L);
				}
				Static260.aClass89_1 = null;
			}
		}
		this.method2232();
		this.anIntArray172 = null;
		this.aBoolean201 = true;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2227(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(BLclient!md;)V")
	public final synchronized void method2228(@OriginalArg(1) Class2_Sub5 arg0) {
		this.aClass2_Sub5_6 = arg0;
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(B)V")
	public final void method2229() {
		this.aBoolean204 = true;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "([II)V")
	private void method2230(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static82.aBoolean465) {
			local1 = 512;
		}
		Static301.method298(arg0, 0, local1);
		this.anInt2621 -= 256;
		if (this.aClass2_Sub5_6 != null && this.anInt2621 <= 0) {
			this.anInt2621 += Static110.anInt2380 >> 4;
			Static56.method1094(this.aClass2_Sub5_6);
			this.method2241(this.aClass2_Sub5_6, this.aClass2_Sub5_6.method3545());
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
						@Pc(91) Class2_Sub5 local91 = null;
						@Pc(96) Class2_Sub5 local96 = this.aClass2_Sub5Array6[local57];
						label100: while (true) {
							while (true) {
								if (local96 == null) {
									break label100;
								}
								@Pc(101) Class2_Sub9 local101 = local96.aClass2_Sub9_5;
								if (local101 == null || local101.anInt2253 <= local62) {
									local96.aBoolean357 = true;
									@Pc(125) int local125 = local96.method3549();
									local45 += local125;
									if (local101 != null) {
										local101.anInt2253 += local125;
									}
									if (local45 >= this.anInt2606) {
										break label106;
									}
									@Pc(145) Class2_Sub5 local145 = local96.method3548();
									if (local145 != null) {
										@Pc(150) int local150 = local96.anInt4367;
										while (local145 != null) {
											this.method2241(local145, local150 * local145.method3545() >> 8);
											local145 = local96.method3551();
										}
									}
									@Pc(169) Class2_Sub5 local169 = local96.aClass2_Sub5_8;
									local96.aClass2_Sub5_8 = null;
									if (local91 == null) {
										this.aClass2_Sub5Array6[local57] = local169;
									} else {
										local91.aClass2_Sub5_8 = local169;
									}
									if (local169 == null) {
										this.aClass2_Sub5Array5[local57] = local91;
									}
									local96 = local169;
								} else {
									local47 |= 0x1 << local57;
									local91 = local96;
									local96 = local96.aClass2_Sub5_8;
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
				@Pc(212) Class2_Sub5 local212 = this.aClass2_Sub5Array6[local49];
				this.aClass2_Sub5Array6[local49] = this.aClass2_Sub5Array5[local49] = null;
				while (local212 != null) {
					@Pc(227) Class2_Sub5 local227 = local212.aClass2_Sub5_8;
					local212.aClass2_Sub5_8 = null;
					local212 = local227;
				}
			}
		}
		if (this.anInt2621 < 0) {
			this.anInt2621 = 0;
		}
		if (this.aClass2_Sub5_6 != null) {
			this.aClass2_Sub5_6.method3550(arg0, 0, 256);
		}
		this.aLong134 = Static6.method126();
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "()V")
	protected void method2232() {
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "()V")
	protected void method2233() throws Exception {
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "()I")
	protected int method2235() throws Exception {
		return this.anInt2623;
	}

	@OriginalMember(owner = "client!wn", name = "d", descriptor = "()V")
	protected void method2236() throws Exception {
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(I)V")
	public void method2238(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!wn", name = "b", descriptor = "(II)V")
	private void method2239() {
		this.anInt2621 -= 256;
		if (this.anInt2621 < 0) {
			this.anInt2621 = 0;
		}
		if (this.aClass2_Sub5_6 != null) {
			this.aClass2_Sub5_6.method3546(256);
		}
	}

	@OriginalMember(owner = "client!wn", name = "c", descriptor = "(B)V")
	public final synchronized void method2240() {
		this.aBoolean204 = true;
		try {
			this.method2236();
		} catch (@Pc(10) Exception local10) {
			this.method2232();
			this.aLong136 = Static6.method126() + 2000L;
		}
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Lclient!md;II)V")
	private void method2241(@OriginalArg(0) Class2_Sub5 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(17) Class2_Sub5 local17 = this.aClass2_Sub5Array5[local7];
		if (local17 == null) {
			this.aClass2_Sub5Array6[local7] = arg0;
		} else {
			local17.aClass2_Sub5_8 = arg0;
		}
		this.aClass2_Sub5Array5[local7] = arg0;
		arg0.anInt4367 = arg1;
	}

	@OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)V")
	public final synchronized void method2242() {
		if (this.aBoolean201) {
			return;
		}
		@Pc(12) long local12 = Static6.method126();
		try {
			if (local12 > this.aLong134 + 500000L) {
				this.aLong134 = local12 - 500000L;
			}
			while (local12 > this.aLong134 + 5000L) {
				this.method2239();
				this.aLong134 += 256000 / Static110.anInt2380;
			}
		} catch (@Pc(57) Exception local57) {
			this.aLong134 = local12;
		}
		if (this.anIntArray172 == null) {
			return;
		}
		try {
			if (this.aLong136 != 0L) {
				if (this.aLong136 > local12) {
					return;
				}
				this.method2238(this.anInt2623);
				this.aBoolean204 = true;
				this.aLong136 = 0L;
			}
			@Pc(95) int local95 = this.method2235();
			if (this.anInt2624 - local95 > this.anInt2625) {
				this.anInt2625 = this.anInt2624 - local95;
			}
			@Pc(117) int local117 = this.anInt2619 + this.anInt2620;
			if (local117 + 256 > 16384) {
				local117 = 16128;
			}
			if (local117 + 256 > this.anInt2623) {
				this.anInt2623 += 1024;
				if (this.anInt2623 > 16384) {
					this.anInt2623 = 16384;
				}
				this.method2232();
				local95 = 0;
				this.method2238(this.anInt2623);
				if (local117 + 256 > this.anInt2623) {
					local117 = this.anInt2623 - 256;
					this.anInt2620 = local117 - this.anInt2619;
				}
				this.aBoolean204 = true;
			}
			while (local117 > local95) {
				local95 += 256;
				this.method2230(this.anIntArray172);
				this.method2233();
			}
			if (local12 > this.aLong135) {
				if (this.aBoolean204) {
					this.aBoolean204 = false;
				} else if (this.anInt2625 == 0 && this.anInt2622 == 0) {
					this.method2232();
					this.aLong136 = local12 + 2000L;
					return;
				} else {
					this.anInt2620 = Math.min(this.anInt2622, this.anInt2625);
					this.anInt2622 = this.anInt2625;
				}
				this.aLong135 = local12 + 2000L;
				this.anInt2625 = 0;
			}
			this.anInt2624 = local95;
		} catch (@Pc(262) Exception local262) {
			this.method2232();
			this.aLong136 = local12 + 2000L;
		}
	}
}
