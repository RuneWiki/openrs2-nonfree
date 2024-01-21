import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public class Class10 {

	@OriginalMember(owner = "client!ce", name = "o", descriptor = "Lclient!kf;")
	private Class6_Sub6 aClass6_Sub6_7;

	@OriginalMember(owner = "client!ce", name = "q", descriptor = "[I")
	public int[] anIntArray287;

	@OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
	public int anInt2647;

	@OriginalMember(owner = "client!ce", name = "C", descriptor = "I")
	public int anInt2649;

	@OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
	private int anInt2651;

	@OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
	private final int anInt2632 = 32;

	@OriginalMember(owner = "client!ce", name = "n", descriptor = "J")
	private long aLong69 = Static89.method1607();

	@OriginalMember(owner = "client!ce", name = "v", descriptor = "Z")
	private boolean aBoolean143 = true;

	@OriginalMember(owner = "client!ce", name = "z", descriptor = "[Lclient!kf;")
	private final Class6_Sub6[] aClass6_Sub6Array5 = new Class6_Sub6[8];

	@OriginalMember(owner = "client!ce", name = "y", descriptor = "J")
	private long aLong70 = 0L;

	@OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
	private int anInt2648 = 0;

	@OriginalMember(owner = "client!ce", name = "D", descriptor = "I")
	private int anInt2650 = 0;

	@OriginalMember(owner = "client!ce", name = "cb", descriptor = "I")
	private int anInt2652 = 0;

	@OriginalMember(owner = "client!ce", name = "O", descriptor = "J")
	private long aLong71 = 0L;

	@OriginalMember(owner = "client!ce", name = "x", descriptor = "I")
	private int anInt2646 = 0;

	@OriginalMember(owner = "client!ce", name = "E", descriptor = "[Lclient!kf;")
	private final Class6_Sub6[] aClass6_Sub6Array6 = new Class6_Sub6[8];

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "([II)V")
	private void method1711(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static52.aBoolean78) {
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
		this.anInt2646 -= 256;
		if (this.aClass6_Sub6_7 != null && this.anInt2646 <= 0) {
			this.anInt2646 += Static73.anInt2059 >> 4;
			Static66.method2126(this.aClass6_Sub6_7);
			this.method1717(this.aClass6_Sub6_7.method1916(), this.aClass6_Sub6_7);
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
						@Pc(141) Class6_Sub6 local141 = null;
						@Pc(146) Class6_Sub6 local146 = this.aClass6_Sub6Array6[local109];
						label104: while (true) {
							while (true) {
								if (local146 == null) {
									break label104;
								}
								@Pc(150) Class6_Sub11 local150 = local146.aClass6_Sub11_5;
								if (local150 == null || local150.anInt2864 <= local114) {
									local146.aBoolean157 = true;
									@Pc(174) int local174 = local146.method1919();
									local98 += local174;
									if (local150 != null) {
										local150.anInt2864 += local174;
									}
									if (local98 >= this.anInt2632) {
										break label110;
									}
									@Pc(193) Class6_Sub6 local193 = local146.method1913();
									if (local193 != null) {
										@Pc(198) int local198 = local146.anInt2915;
										while (local193 != null) {
											this.method1717(local198 * local193.method1916() >> 8, local193);
											local193 = local146.method1918();
										}
									}
									@Pc(217) Class6_Sub6 local217 = local146.aClass6_Sub6_8;
									local146.aClass6_Sub6_8 = null;
									if (local141 == null) {
										this.aClass6_Sub6Array6[local109] = local217;
									} else {
										local141.aClass6_Sub6_8 = local217;
									}
									if (local217 == null) {
										this.aClass6_Sub6Array5[local109] = local141;
									}
									local146 = local217;
								} else {
									local100 |= 0x1 << local109;
									local141 = local146;
									local146 = local146.aClass6_Sub6_8;
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
				@Pc(260) Class6_Sub6 local260 = this.aClass6_Sub6Array6[local109];
				this.aClass6_Sub6Array6[local109] = this.aClass6_Sub6Array5[local109] = null;
				while (local260 != null) {
					@Pc(274) Class6_Sub6 local274 = local260.aClass6_Sub6_8;
					local260.aClass6_Sub6_8 = null;
					local260 = local274;
				}
			}
		}
		if (this.anInt2646 < 0) {
			this.anInt2646 = 0;
		}
		if (this.aClass6_Sub6_7 != null) {
			this.aClass6_Sub6_7.method1915(arg0, 0, 256);
		}
		this.aLong69 = Static89.method1607();
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "()V")
	protected void method1712() throws Exception {
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "()I")
	protected int method1713() throws Exception {
		return this.anInt2649;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1714(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
	public final void method1715() {
		this.aBoolean143 = true;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(ILclient!kf;Z)V")
	private void method1717(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub6 arg1) {
		@Pc(11) int local11 = arg0 >> 5;
		@Pc(16) Class6_Sub6 local16 = this.aClass6_Sub6Array5[local11];
		if (local16 == null) {
			this.aClass6_Sub6Array6[local11] = arg1;
		} else {
			local16.aClass6_Sub6_8 = arg1;
		}
		this.aClass6_Sub6Array5[local11] = arg1;
		arg1.anInt2915 = arg0;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
	public final synchronized void method1718() {
		if (Static71.aClass38_1 != null) {
			@Pc(14) boolean local14 = true;
			for (@Pc(16) int local16 = 0; local16 < 2; local16++) {
				if (Static71.aClass38_1.aClass10Array1[local16] == this) {
					Static71.aClass38_1.aClass10Array1[local16] = null;
				}
				if (Static71.aClass38_1.aClass10Array1[local16] != null) {
					local14 = false;
				}
			}
			if (local14) {
				Static71.aClass38_1.aBoolean94 = true;
				while (Static71.aClass38_1.aBoolean93) {
					Static53.method2063(50L);
				}
				Static71.aClass38_1 = null;
			}
		}
		this.method1722();
		this.anIntArray287 = null;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V")
	public void method1719(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!kf;I)V")
	public final synchronized void method1720(@OriginalArg(0) Class6_Sub6 arg0) {
		this.aClass6_Sub6_7 = arg0;
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)V")
	public final synchronized void method1721() {
		this.aBoolean143 = true;
		try {
			this.method1712();
		} catch (@Pc(13) Exception local13) {
			this.method1722();
			this.aLong71 = Static89.method1607() + 2000L;
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "()V")
	protected void method1722() {
	}

	@OriginalMember(owner = "client!ce", name = "d", descriptor = "()V")
	protected void method1724() throws Exception {
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)V")
	private void method1725() {
		this.anInt2646 -= 256;
		if (this.anInt2646 < 0) {
			this.anInt2646 = 0;
		}
		if (this.aClass6_Sub6_7 != null) {
			this.aClass6_Sub6_7.method1917(256);
		}
	}

	@OriginalMember(owner = "client!ce", name = "c", descriptor = "(I)V")
	public final synchronized void method1726() {
		if (this.anIntArray287 == null) {
			return;
		}
		@Pc(16) long local16 = Static89.method1607();
		try {
			if (this.aLong71 != 0L) {
				if (local16 < this.aLong71) {
					return;
				}
				this.method1719(this.anInt2649);
				this.aLong71 = 0L;
				this.aBoolean143 = true;
			}
			@Pc(42) int local42 = this.method1713();
			@Pc(49) int local49 = this.anInt2647 + this.anInt2651;
			if (local49 + 256 > 16384) {
				local49 = 16128;
			}
			if (this.anInt2652 - local42 > this.anInt2650) {
				this.anInt2650 = this.anInt2652 - local42;
			}
			if (this.anInt2649 < local49 + 256) {
				this.anInt2649 += 1024;
				if (this.anInt2649 > 16384) {
					this.anInt2649 = 16384;
				}
				this.method1722();
				local42 = 0;
				this.method1719(this.anInt2649);
				if (local49 + 256 > this.anInt2649) {
					local49 = this.anInt2649 - 256;
					this.anInt2651 = local49 - this.anInt2647;
				}
				this.aBoolean143 = true;
			}
			while (local49 > local42) {
				this.method1711(this.anIntArray287);
				this.method1724();
				local42 += 256;
			}
			if (this.aLong70 < local16) {
				if (this.aBoolean143) {
					this.aBoolean143 = false;
				} else if (this.anInt2650 == 0 && this.anInt2648 == 0) {
					this.method1722();
					this.aLong71 = local16 + 2000L;
					return;
				} else {
					this.anInt2651 = Math.min(this.anInt2648, this.anInt2650);
					this.anInt2648 = this.anInt2650;
				}
				this.aLong70 = local16 + 2000L;
				this.anInt2650 = 0;
			}
			this.anInt2652 = local42;
		} catch (@Pc(195) Exception local195) {
			this.method1722();
			this.aLong71 = local16 + 2000L;
		}
		try {
			if (this.aLong69 + 500000L < local16) {
				local16 = this.aLong69;
			}
			while (this.aLong69 + 5000L < local16) {
				this.method1725();
				this.aLong69 += 256000 / Static73.anInt2059;
			}
		} catch (@Pc(240) Exception local240) {
			this.aLong69 = local16;
		}
	}
}
