import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public class Class21 {

	@OriginalMember(owner = "client!fc", name = "g", descriptor = "[I")
	public int[] anIntArray187;

	@OriginalMember(owner = "client!fc", name = "r", descriptor = "Lclient!qa;")
	private Class2_Sub8 aClass2_Sub8_6;

	@OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
	private int anInt1937;

	@OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
	public int anInt1938;

	@OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
	public int anInt1942;

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
	private final int anInt1921 = 32;

	@OriginalMember(owner = "client!fc", name = "v", descriptor = "J")
	private long aLong66 = Static177.method2758();

	@OriginalMember(owner = "client!fc", name = "A", descriptor = "Z")
	private boolean aBoolean95 = true;

	@OriginalMember(owner = "client!fc", name = "F", descriptor = "[Lclient!qa;")
	private final Class2_Sub8[] aClass2_Sub8Array5 = new Class2_Sub8[8];

	@OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
	private int anInt1941 = 0;

	@OriginalMember(owner = "client!fc", name = "J", descriptor = "J")
	private long aLong67 = 0L;

	@OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
	private int anInt1943 = 0;

	@OriginalMember(owner = "client!fc", name = "K", descriptor = "J")
	private long aLong68 = 0L;

	@OriginalMember(owner = "client!fc", name = "L", descriptor = "[Lclient!qa;")
	private final Class2_Sub8[] aClass2_Sub8Array6 = new Class2_Sub8[8];

	@OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
	private int anInt1939 = 0;

	@OriginalMember(owner = "client!fc", name = "S", descriptor = "I")
	private int anInt1944 = 0;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public void method1335(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "()V")
	protected void method1336() throws Exception {
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "()I")
	protected int method1338() throws Exception {
		return this.anInt1942;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "()V")
	protected void method1339() {
	}

	@OriginalMember(owner = "client!fc", name = "b", descriptor = "(I)V")
	public final void method1340() {
		this.aBoolean95 = true;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
	public final synchronized void method1341() {
		if (this.anIntArray187 == null) {
			return;
		}
		@Pc(12) long local12 = Static177.method2758();
		try {
			if (this.aLong67 != 0L) {
				if (local12 < this.aLong67) {
					return;
				}
				this.method1335(this.anInt1942);
				this.aBoolean95 = true;
				this.aLong67 = 0L;
			}
			@Pc(48) int local48 = this.method1338();
			@Pc(54) int local54 = this.anInt1937 + this.anInt1938;
			if (this.anInt1944 - local48 > this.anInt1939) {
				this.anInt1939 = this.anInt1944 - local48;
			}
			if (local54 + 256 > 16384) {
				local54 = 16128;
			}
			if (local54 + 256 > this.anInt1942) {
				this.anInt1942 += 1024;
				local48 = 0;
				if (this.anInt1942 > 16384) {
					this.anInt1942 = 16384;
				}
				this.method1339();
				this.method1335(this.anInt1942);
				this.aBoolean95 = true;
				if (this.anInt1942 < local54 + 256) {
					local54 = this.anInt1942 - 256;
					this.anInt1937 = local54 - this.anInt1938;
				}
			}
			while (local54 > local48) {
				local48 += 256;
				this.method1346(this.anIntArray187);
				this.method1345();
			}
			if (this.aLong68 < local12) {
				if (this.aBoolean95) {
					this.aBoolean95 = false;
				} else if (this.anInt1939 == 0 && this.anInt1943 == 0) {
					this.method1339();
					this.aLong67 = local12 + 2000L;
					return;
				} else {
					this.anInt1937 = Math.min(this.anInt1943, this.anInt1939);
					this.anInt1943 = this.anInt1939;
				}
				this.aLong68 = local12 + 2000L;
				this.anInt1939 = 0;
			}
			this.anInt1944 = local48;
		} catch (@Pc(203) Exception local203) {
			this.method1339();
			this.aLong67 = local12 + 2000L;
		}
		try {
			if (local12 > this.aLong66 + 500000L) {
				local12 = this.aLong66;
			}
			while (this.aLong66 + 5000L < local12) {
				this.method1349();
				this.aLong66 += 256000 / Static113.anInt2749;
			}
		} catch (@Pc(244) Exception local244) {
			this.aLong66 = local12;
		}
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)V")
	public final synchronized void method1342() {
		this.aBoolean95 = true;
		try {
			this.method1336();
		} catch (@Pc(6) Exception local6) {
			this.method1339();
			this.aLong67 = Static177.method2758() + 2000L;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILclient!qa;I)V")
	private void method1343(@OriginalArg(1) Class2_Sub8 arg0, @OriginalArg(2) int arg1) {
		@Pc(6) int local6 = arg1 >> 5;
		@Pc(11) Class2_Sub8 local11 = this.aClass2_Sub8Array5[local6];
		if (local11 == null) {
			this.aClass2_Sub8Array6[local6] = arg0;
		} else {
			local11.aClass2_Sub8_8 = arg0;
		}
		this.aClass2_Sub8Array5[local6] = arg0;
		arg0.anInt3168 = arg1;
	}

	@OriginalMember(owner = "client!fc", name = "d", descriptor = "()V")
	protected void method1345() throws Exception {
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "([II)V")
	private void method1346(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static114.aBoolean125) {
			local1 = 512;
		}
		Static184.method1641(arg0, 0, local1);
		this.anInt1941 -= 256;
		if (this.aClass2_Sub8_6 != null && this.anInt1941 <= 0) {
			this.anInt1941 += Static113.anInt2749 >> 4;
			Static77.method1382(this.aClass2_Sub8_6);
			this.method1343(this.aClass2_Sub8_6, this.aClass2_Sub8_6.method2177());
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
						@Pc(88) Class2_Sub8 local88 = null;
						@Pc(93) Class2_Sub8 local93 = this.aClass2_Sub8Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub18 local97 = local93.aClass2_Sub18_5;
								if (local97 == null || local97.anInt2661 <= local61) {
									local93.aBoolean142 = true;
									@Pc(121) int local121 = local93.method2183();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2661 += local121;
									}
									if (local45 >= this.anInt1921) {
										break label103;
									}
									@Pc(140) Class2_Sub8 local140 = local93.method2178();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt3168;
										while (local140 != null) {
											this.method1343(local140, local145 * local140.method2177() >> 8);
											local140 = local93.method2179();
										}
									}
									@Pc(164) Class2_Sub8 local164 = local93.aClass2_Sub8_8;
									local93.aClass2_Sub8_8 = null;
									if (local88 == null) {
										this.aClass2_Sub8Array6[local56] = local164;
									} else {
										local88.aClass2_Sub8_8 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub8Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub8_8;
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
				@Pc(207) Class2_Sub8 local207 = this.aClass2_Sub8Array6[local56];
				this.aClass2_Sub8Array6[local56] = this.aClass2_Sub8Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub8 local221 = local207.aClass2_Sub8_8;
					local207.aClass2_Sub8_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt1941 < 0) {
			this.anInt1941 = 0;
		}
		if (this.aClass2_Sub8_6 != null) {
			this.aClass2_Sub8_6.method2180(arg0, 0, 256);
		}
		this.aLong66 = Static177.method2758();
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(BLclient!qa;)V")
	public final synchronized void method1347(@OriginalArg(1) Class2_Sub8 arg0) {
		this.aClass2_Sub8_6 = arg0;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)V")
	public final synchronized void method1348() {
		if (Static176.aClass58_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static176.aClass58_1.aClass21Array1[local11] == this) {
					Static176.aClass58_1.aClass21Array1[local11] = null;
				}
				if (Static176.aClass58_1.aClass21Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static176.aClass58_1.aBoolean132 = true;
				while (Static176.aClass58_1.aBoolean133) {
					Static176.method2744(50L);
				}
				Static176.aClass58_1 = null;
			}
		}
		this.method1339();
		this.anIntArray187 = null;
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)V")
	private void method1349() {
		this.anInt1941 -= 256;
		if (this.anInt1941 < 0) {
			this.anInt1941 = 0;
		}
		if (this.aClass2_Sub8_6 != null) {
			this.aClass2_Sub8_6.method2182(256);
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1350(@OriginalArg(0) Component arg0) throws Exception {
	}
}
