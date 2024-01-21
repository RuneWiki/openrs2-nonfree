import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fe")
public class Class1 {

	@OriginalMember(owner = "client!fe", name = "o", descriptor = "[I")
	public int[] anIntArray263;

	@OriginalMember(owner = "client!fe", name = "E", descriptor = "Lclient!hb;")
	private Class3_Sub10 aClass3_Sub10_6;

	@OriginalMember(owner = "client!fe", name = "F", descriptor = "I")
	public int anInt2003;

	@OriginalMember(owner = "client!fe", name = "M", descriptor = "I")
	private int anInt2006;

	@OriginalMember(owner = "client!fe", name = "N", descriptor = "I")
	public int anInt2007;

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
	private final int anInt1984 = 32;

	@OriginalMember(owner = "client!fe", name = "s", descriptor = "J")
	private long aLong66 = Static89.method1462();

	@OriginalMember(owner = "client!fe", name = "G", descriptor = "I")
	private int anInt2004 = 0;

	@OriginalMember(owner = "client!fe", name = "H", descriptor = "Z")
	private boolean aBoolean73 = true;

	@OriginalMember(owner = "client!fe", name = "L", descriptor = "J")
	private long aLong67 = 0L;

	@OriginalMember(owner = "client!fe", name = "K", descriptor = "[Lclient!hb;")
	private final Class3_Sub10[] aClass3_Sub10Array5 = new Class3_Sub10[8];

	@OriginalMember(owner = "client!fe", name = "J", descriptor = "I")
	private int anInt2005 = 0;

	@OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
	private int anInt2008 = 0;

	@OriginalMember(owner = "client!fe", name = "P", descriptor = "I")
	private int anInt2009 = 0;

	@OriginalMember(owner = "client!fe", name = "R", descriptor = "J")
	private long aLong68 = 0L;

	@OriginalMember(owner = "client!fe", name = "Q", descriptor = "[Lclient!hb;")
	private final Class3_Sub10[] aClass3_Sub10Array6 = new Class3_Sub10[8];

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(BILclient!hb;)V")
	private void method1385(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub10 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class3_Sub10 local12 = this.aClass3_Sub10Array6[local7];
		if (local12 == null) {
			this.aClass3_Sub10Array5[local7] = arg1;
		} else {
			local12.aClass3_Sub10_8 = arg1;
		}
		this.aClass3_Sub10Array6[local7] = arg1;
		arg1.anInt2735 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "()V")
	protected void method1386() {
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "()V")
	protected void method1387() throws Exception {
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)V")
	private void method1388() {
		this.anInt2009 -= 256;
		if (this.anInt2009 < 0) {
			this.anInt2009 = 0;
		}
		if (this.aClass3_Sub10_6 != null) {
			this.aClass3_Sub10_6.method1865(256);
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1389(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "()V")
	protected void method1390() throws Exception {
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V")
	public final synchronized void method1391() {
		if (Static80.aClass69_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static80.aClass69_1.aClass1Array1[local7] == this) {
					Static80.aClass69_1.aClass1Array1[local7] = null;
				}
				if (Static80.aClass69_1.aClass1Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static80.aClass69_1.aBoolean98 = true;
				while (Static80.aClass69_1.aBoolean97) {
					Static40.method822(50L);
				}
				Static80.aClass69_1 = null;
			}
		}
		this.method1386();
		this.anIntArray263 = null;
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "()I")
	protected int method1392() throws Exception {
		return this.anInt2007;
	}

	@OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)V")
	public void method1395(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!fe", name = "c", descriptor = "(I)V")
	public final void method1396() {
		this.aBoolean73 = true;
	}

	@OriginalMember(owner = "client!fe", name = "d", descriptor = "(I)V")
	public final synchronized void method1397() {
		if (this.anIntArray263 == null) {
			return;
		}
		@Pc(12) long local12 = Static89.method1462();
		try {
			if (this.aLong67 != 0L) {
				if (this.aLong67 > local12) {
					return;
				}
				this.method1395(this.anInt2007);
				this.aBoolean73 = true;
				this.aLong67 = 0L;
			}
			@Pc(36) int local36 = this.method1392();
			if (this.anInt2008 - local36 > this.anInt2005) {
				this.anInt2005 = this.anInt2008 - local36;
			}
			@Pc(58) int local58 = this.anInt2003 + this.anInt2006;
			if (local58 + 256 > 16384) {
				local58 = 16128;
			}
			if (local58 + 256 > this.anInt2007) {
				this.anInt2007 += 1024;
				local36 = 0;
				if (this.anInt2007 > 16384) {
					this.anInt2007 = 16384;
				}
				this.method1386();
				this.method1395(this.anInt2007);
				this.aBoolean73 = true;
				if (this.anInt2007 < local58 + 256) {
					local58 = this.anInt2007 - 256;
					this.anInt2006 = local58 - this.anInt2003;
				}
			}
			while (local36 < local58) {
				this.method1401(this.anIntArray263);
				local36 += 256;
				this.method1390();
			}
			if (this.aLong68 < local12) {
				if (this.aBoolean73) {
					this.aBoolean73 = false;
				} else if (this.anInt2005 == 0 && this.anInt2004 == 0) {
					this.method1386();
					this.aLong67 = local12 + 2000L;
					return;
				} else {
					this.anInt2006 = Math.min(this.anInt2004, this.anInt2005);
					this.anInt2004 = this.anInt2005;
				}
				this.aLong68 = local12 + 2000L;
				this.anInt2005 = 0;
			}
			this.anInt2008 = local36;
		} catch (@Pc(186) Exception local186) {
			this.method1386();
			this.aLong67 = local12 + 2000L;
		}
		try {
			if (local12 > this.aLong66 + 500000L) {
				local12 = this.aLong66;
			}
			while (this.aLong66 + 5000L < local12) {
				this.method1388();
				this.aLong66 += 256000 / Static38.anInt1141;
			}
		} catch (@Pc(231) Exception local231) {
			this.aLong66 = local12;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
	public final synchronized void method1398() {
		this.aBoolean73 = true;
		try {
			this.method1387();
		} catch (@Pc(14) Exception local14) {
			this.method1386();
			this.aLong67 = Static89.method1462() + 2000L;
		}
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lclient!hb;I)V")
	public final synchronized void method1400(@OriginalArg(0) Class3_Sub10 arg0) {
		this.aClass3_Sub10_6 = arg0;
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "([II)V")
	private void method1401(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static49.aBoolean48) {
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
		this.anInt2009 -= 256;
		if (this.aClass3_Sub10_6 != null && this.anInt2009 <= 0) {
			this.anInt2009 += Static38.anInt1141 >> 4;
			Static76.method1260(this.aClass3_Sub10_6);
			this.method1385(this.aClass3_Sub10_6.method1864(), this.aClass3_Sub10_6);
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
						@Pc(141) Class3_Sub10 local141 = null;
						@Pc(146) Class3_Sub10 local146 = this.aClass3_Sub10Array5[local109];
						label104: while (true) {
							while (true) {
								if (local146 == null) {
									break label104;
								}
								@Pc(150) Class3_Sub2 local150 = local146.aClass3_Sub2_5;
								if (local150 == null || local150.anInt2451 <= local114) {
									local146.aBoolean124 = true;
									@Pc(174) int local174 = local146.method1866();
									local98 += local174;
									if (local150 != null) {
										local150.anInt2451 += local174;
									}
									if (local98 >= this.anInt1984) {
										break label110;
									}
									@Pc(193) Class3_Sub10 local193 = local146.method1867();
									if (local193 != null) {
										@Pc(198) int local198 = local146.anInt2735;
										while (local193 != null) {
											this.method1385(local198 * local193.method1864() >> 8, local193);
											local193 = local146.method1869();
										}
									}
									@Pc(217) Class3_Sub10 local217 = local146.aClass3_Sub10_8;
									local146.aClass3_Sub10_8 = null;
									if (local141 == null) {
										this.aClass3_Sub10Array5[local109] = local217;
									} else {
										local141.aClass3_Sub10_8 = local217;
									}
									if (local217 == null) {
										this.aClass3_Sub10Array6[local109] = local141;
									}
									local146 = local217;
								} else {
									local100 |= 0x1 << local109;
									local141 = local146;
									local146 = local146.aClass3_Sub10_8;
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
				@Pc(260) Class3_Sub10 local260 = this.aClass3_Sub10Array5[local109];
				this.aClass3_Sub10Array5[local109] = this.aClass3_Sub10Array6[local109] = null;
				while (local260 != null) {
					@Pc(274) Class3_Sub10 local274 = local260.aClass3_Sub10_8;
					local260.aClass3_Sub10_8 = null;
					local260 = local274;
				}
			}
		}
		if (this.anInt2009 < 0) {
			this.anInt2009 = 0;
		}
		if (this.aClass3_Sub10_6 != null) {
			this.aClass3_Sub10_6.method1870(arg0, 0, 256);
		}
		this.aLong66 = Static89.method1462();
	}
}
