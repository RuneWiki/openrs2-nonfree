import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hd")
public class Class15 implements Runnable {

	@OriginalMember(owner = "client!hd", name = "q", descriptor = "[I")
	public int[] anIntArray316;

	@OriginalMember(owner = "client!hd", name = "z", descriptor = "Lclient!u;")
	private Class5_Sub7 aClass5_Sub7_6;

	@OriginalMember(owner = "client!hd", name = "M", descriptor = "I")
	public int anInt2285;

	@OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
	private int anInt2287;

	@OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
	public int anInt2288;

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
	private final int anInt2259 = 32;

	@OriginalMember(owner = "client!hd", name = "H", descriptor = "J")
	private long aLong102 = Static62.method1228();

	@OriginalMember(owner = "client!hd", name = "I", descriptor = "I")
	public volatile int anInt2283 = 0;

	@OriginalMember(owner = "client!hd", name = "K", descriptor = "I")
	private int anInt2284 = 0;

	@OriginalMember(owner = "client!hd", name = "J", descriptor = "J")
	private long aLong103 = 0L;

	@OriginalMember(owner = "client!hd", name = "O", descriptor = "J")
	private long aLong104 = 0L;

	@OriginalMember(owner = "client!hd", name = "N", descriptor = "I")
	private int anInt2286 = 0;

	@OriginalMember(owner = "client!hd", name = "T", descriptor = "[Lclient!u;")
	private final Class5_Sub7[] aClass5_Sub7Array6 = new Class5_Sub7[8];

	@OriginalMember(owner = "client!hd", name = "Q", descriptor = "Z")
	private boolean aBoolean105 = true;

	@OriginalMember(owner = "client!hd", name = "S", descriptor = "I")
	private int anInt2289 = 0;

	@OriginalMember(owner = "client!hd", name = "L", descriptor = "[Lclient!u;")
	private final Class5_Sub7[] aClass5_Sub7Array5 = new Class5_Sub7[8];

	@OriginalMember(owner = "client!hd", name = "U", descriptor = "I")
	private int anInt2290 = 0;

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)V")
	public final void method1520() {
		if (this.anInt2283 == 1) {
			this.anInt2283 = 2;
			while (this.anInt2283 == 2) {
				Static17.method318(50L);
			}
		}
		this.method1533();
		this.anIntArray316 = null;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "()V")
	protected void method1521() throws Exception {
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(IZ)V")
	private void method1523() {
		this.anInt2290 -= 256;
		if (this.anInt2290 < 0) {
			this.anInt2290 = 0;
		}
		if (this.aClass5_Sub7_6 != null) {
			this.aClass5_Sub7_6.method2023(256);
		}
	}

	@OriginalMember(owner = "client!hd", name = "run", descriptor = "()V")
	@Override
	public final void run() {
		while (true) {
			try {
				if (this.anInt2283 == 1) {
					this.method1530();
					Static17.method318(5L);
					continue;
				}
			} catch (@Pc(21) Exception local21) {
				Static53.method1609(null, local21);
			}
			this.anInt2283 = 0;
			return;
		}
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "([II)V")
	private void method1524(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static33.aBoolean47) {
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
		this.anInt2290 -= 256;
		if (this.aClass5_Sub7_6 != null && this.anInt2290 <= 0) {
			this.anInt2290 += Static1.anInt3 >> 4;
			Static54.method1133(this.aClass5_Sub7_6);
			this.method1535(this.aClass5_Sub7_6, this.aClass5_Sub7_6.method2022());
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
						@Pc(141) Class5_Sub7 local141 = null;
						@Pc(146) Class5_Sub7 local146 = this.aClass5_Sub7Array5[local109];
						label104: while (true) {
							while (true) {
								if (local146 == null) {
									break label104;
								}
								@Pc(150) Class5_Sub5 local150 = local146.aClass5_Sub5_5;
								if (local150 == null || local150.anInt772 <= local114) {
									local146.aBoolean128 = true;
									@Pc(174) int local174 = local146.method2021();
									local98 += local174;
									if (local150 != null) {
										local150.anInt772 += local174;
									}
									if (local98 >= this.anInt2259) {
										break label110;
									}
									@Pc(193) Class5_Sub7 local193 = local146.method2024();
									if (local193 != null) {
										@Pc(198) int local198 = local146.anInt2932;
										while (local193 != null) {
											this.method1535(local193, local198 * local193.method2022() >> 8);
											local193 = local146.method2026();
										}
									}
									@Pc(217) Class5_Sub7 local217 = local146.aClass5_Sub7_8;
									local146.aClass5_Sub7_8 = null;
									if (local141 == null) {
										this.aClass5_Sub7Array5[local109] = local217;
									} else {
										local141.aClass5_Sub7_8 = local217;
									}
									if (local217 == null) {
										this.aClass5_Sub7Array6[local109] = local141;
									}
									local146 = local217;
								} else {
									local100 |= 0x1 << local109;
									local141 = local146;
									local146 = local146.aClass5_Sub7_8;
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
				@Pc(260) Class5_Sub7 local260 = this.aClass5_Sub7Array5[local109];
				this.aClass5_Sub7Array5[local109] = this.aClass5_Sub7Array6[local109] = null;
				while (local260 != null) {
					@Pc(274) Class5_Sub7 local274 = local260.aClass5_Sub7_8;
					local260.aClass5_Sub7_8 = null;
					local260 = local274;
				}
			}
		}
		if (this.anInt2290 < 0) {
			this.anInt2290 = 0;
		}
		if (this.aClass5_Sub7_6 != null) {
			this.aClass5_Sub7_6.method2025(arg0, 0, 256);
		}
		this.aLong102 = Static62.method1228();
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(ILclient!u;)V")
	public final synchronized void method1526(@OriginalArg(1) Class5_Sub7 arg0) {
		this.aClass5_Sub7_6 = arg0;
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "(I)V")
	public final void method1527() {
		this.aBoolean105 = true;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
	public final synchronized void method1530() {
		@Pc(2) long local2 = Static62.method1228();
		try {
			if (this.aLong104 != 0L) {
				if (this.aLong104 > local2) {
					return;
				}
				this.method1532(this.anInt2285);
				this.aBoolean105 = true;
				this.aLong104 = 0L;
			}
			@Pc(32) int local32 = this.method1538();
			if (this.anInt2289 < this.anInt2286 - local32) {
				this.anInt2289 = this.anInt2286 - local32;
			}
			@Pc(56) int local56 = this.anInt2288 + this.anInt2287;
			if (local56 + 256 > 16384) {
				local56 = 16128;
			}
			if (this.anInt2285 < local56 + 256) {
				local32 = 0;
				this.anInt2285 += 1024;
				if (this.anInt2285 > 16384) {
					this.anInt2285 = 16384;
				}
				this.method1533();
				this.method1532(this.anInt2285);
				if (local56 + 256 > this.anInt2285) {
					local56 = this.anInt2285 - 256;
					this.anInt2287 = local56 - this.anInt2288;
				}
				this.aBoolean105 = true;
			}
			while (local32 < local56) {
				this.method1524(this.anIntArray316);
				local32 += 256;
				this.method1521();
			}
			if (this.aLong103 < local2) {
				if (this.aBoolean105) {
					this.aBoolean105 = false;
				} else if (this.anInt2289 == 0 && this.anInt2284 == 0) {
					this.method1533();
					this.aLong104 = local2 + 2000L;
					return;
				} else {
					this.anInt2287 = Math.min(this.anInt2284, this.anInt2289);
					this.anInt2284 = this.anInt2289;
				}
				this.anInt2289 = 0;
				this.aLong103 = local2 + 2000L;
			}
			this.anInt2286 = local32;
		} catch (@Pc(187) Exception local187) {
			this.method1533();
			this.aLong104 = local2 + 2000L;
		}
		try {
			if (this.aLong102 + 500000L < local2) {
				local2 = this.aLong102;
			}
			while (local2 > this.aLong102 + 5000L) {
				this.method1523();
				this.aLong102 += 256000 / Static1.anInt3;
			}
		} catch (@Pc(231) Exception local231) {
			this.aLong102 = local2;
		}
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
	public final synchronized void method1531() {
		this.aBoolean105 = true;
		try {
			this.method1537();
		} catch (@Pc(14) Exception local14) {
			this.method1533();
			this.aLong104 = Static62.method1228() + 2000L;
		}
	}

	@OriginalMember(owner = "client!hd", name = "f", descriptor = "(I)V")
	public void method1532(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!hd", name = "b", descriptor = "()V")
	protected void method1533() {
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(BLclient!u;I)V")
	private void method1535(@OriginalArg(1) Class5_Sub7 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class5_Sub7 local12 = this.aClass5_Sub7Array6[local7];
		if (local12 == null) {
			this.aClass5_Sub7Array5[local7] = arg0;
		} else {
			local12.aClass5_Sub7_8 = arg0;
		}
		this.aClass5_Sub7Array6[local7] = arg0;
		arg0.anInt2932 = arg1;
	}

	@OriginalMember(owner = "client!hd", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1536(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!hd", name = "c", descriptor = "()V")
	protected void method1537() throws Exception {
	}

	@OriginalMember(owner = "client!hd", name = "d", descriptor = "()I")
	protected int method1538() throws Exception {
		return this.anInt2285;
	}
}
