import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ha")
public class Class29 {

	@OriginalMember(owner = "client!ha", name = "j", descriptor = "[I")
	public int[] anIntArray279;

	@OriginalMember(owner = "client!ha", name = "z", descriptor = "Lclient!kb;")
	private Class2_Sub2 aClass2_Sub2_6;

	@OriginalMember(owner = "client!ha", name = "Q", descriptor = "I")
	public int anInt2098;

	@OriginalMember(owner = "client!ha", name = "R", descriptor = "I")
	public int anInt2099;

	@OriginalMember(owner = "client!ha", name = "V", descriptor = "I")
	private int anInt2102;

	@OriginalMember(owner = "client!ha", name = "p", descriptor = "I")
	private final int anInt2084 = 32;

	@OriginalMember(owner = "client!ha", name = "y", descriptor = "J")
	private long aLong64 = Static49.method877();

	@OriginalMember(owner = "client!ha", name = "J", descriptor = "J")
	private long aLong66 = 0L;

	@OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
	private int anInt2094 = 0;

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "[Lclient!kb;")
	private final Class2_Sub2[] aClass2_Sub2Array6 = new Class2_Sub2[8];

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "I")
	private int anInt2095 = 0;

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "[Lclient!kb;")
	private final Class2_Sub2[] aClass2_Sub2Array5 = new Class2_Sub2[8];

	@OriginalMember(owner = "client!ha", name = "I", descriptor = "J")
	private long aLong65 = 0L;

	@OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
	private int anInt2096 = 0;

	@OriginalMember(owner = "client!ha", name = "T", descriptor = "I")
	private int anInt2100 = 0;

	@OriginalMember(owner = "client!ha", name = "O", descriptor = "Z")
	private boolean aBoolean158 = true;

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "()V")
	protected void method1265() throws Exception {
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lclient!kb;B)V")
	public final synchronized void method1266(@OriginalArg(0) Class2_Sub2 arg0) {
		this.aClass2_Sub2_6 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "([II)V")
	private void method1267(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static36.aBoolean74) {
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
		this.anInt2100 -= 256;
		if (this.aClass2_Sub2_6 != null && this.anInt2100 <= 0) {
			this.anInt2100 += Static35.anInt1167 >> 4;
			Static35.method625(this.aClass2_Sub2_6);
			this.method1275(this.aClass2_Sub2_6, this.aClass2_Sub2_6.method1519());
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
						@Pc(141) Class2_Sub2 local141 = null;
						@Pc(146) Class2_Sub2 local146 = this.aClass2_Sub2Array6[local109];
						label104: while (true) {
							while (true) {
								if (local146 == null) {
									break label104;
								}
								@Pc(150) Class2_Sub16 local150 = local146.aClass2_Sub16_5;
								if (local150 == null || local150.anInt2503 <= local114) {
									local146.aBoolean184 = true;
									@Pc(174) int local174 = local146.method1520();
									local98 += local174;
									if (local150 != null) {
										local150.anInt2503 += local174;
									}
									if (local98 >= this.anInt2084) {
										break label110;
									}
									@Pc(193) Class2_Sub2 local193 = local146.method1521();
									if (local193 != null) {
										@Pc(198) int local198 = local146.anInt2516;
										while (local193 != null) {
											this.method1275(local193, local198 * local193.method1519() >> 8);
											local193 = local146.method1518();
										}
									}
									@Pc(217) Class2_Sub2 local217 = local146.aClass2_Sub2_8;
									local146.aClass2_Sub2_8 = null;
									if (local141 == null) {
										this.aClass2_Sub2Array6[local109] = local217;
									} else {
										local141.aClass2_Sub2_8 = local217;
									}
									if (local217 == null) {
										this.aClass2_Sub2Array5[local109] = local141;
									}
									local146 = local217;
								} else {
									local100 |= 0x1 << local109;
									local141 = local146;
									local146 = local146.aClass2_Sub2_8;
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
				@Pc(260) Class2_Sub2 local260 = this.aClass2_Sub2Array6[local109];
				this.aClass2_Sub2Array6[local109] = this.aClass2_Sub2Array5[local109] = null;
				while (local260 != null) {
					@Pc(274) Class2_Sub2 local274 = local260.aClass2_Sub2_8;
					local260.aClass2_Sub2_8 = null;
					local260 = local274;
				}
			}
		}
		if (this.anInt2100 < 0) {
			this.anInt2100 = 0;
		}
		if (this.aClass2_Sub2_6 != null) {
			this.aClass2_Sub2_6.method1524(arg0, 0, 256);
		}
		this.aLong64 = Static49.method877();
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1268(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "()V")
	protected void method1269() throws Exception {
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZI)V")
	private void method1271() {
		this.anInt2100 -= 256;
		if (this.anInt2100 < 0) {
			this.anInt2100 = 0;
		}
		if (this.aClass2_Sub2_6 != null) {
			this.aClass2_Sub2_6.method1523(256);
		}
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
	public final synchronized void method1272() {
		if (this.anIntArray279 == null) {
			return;
		}
		@Pc(12) long local12 = Static49.method877();
		try {
			if (this.aLong65 != 0L) {
				if (this.aLong65 > local12) {
					return;
				}
				this.method1279(this.anInt2098);
				this.aLong65 = 0L;
				this.aBoolean158 = true;
			}
			@Pc(50) int local50 = this.method1277();
			if (this.anInt2095 < this.anInt2094 - local50) {
				this.anInt2095 = this.anInt2094 - local50;
			}
			@Pc(75) int local75 = this.anInt2102 + this.anInt2099;
			if (local75 + 256 > 16384) {
				local75 = 16128;
			}
			if (local75 + 256 > this.anInt2098) {
				local50 = 0;
				this.anInt2098 += 1024;
				if (this.anInt2098 > 16384) {
					this.anInt2098 = 16384;
				}
				this.method1273();
				this.method1279(this.anInt2098);
				this.aBoolean158 = true;
				if (this.anInt2098 < local75 + 256) {
					local75 = this.anInt2098 - 256;
					this.anInt2102 = local75 - this.anInt2099;
				}
			}
			while (local50 < local75) {
				local50 += 256;
				this.method1267(this.anIntArray279);
				this.method1269();
			}
			if (local12 > this.aLong66) {
				if (this.aBoolean158) {
					this.aBoolean158 = false;
				} else if (this.anInt2095 == 0 && this.anInt2096 == 0) {
					this.method1273();
					this.aLong65 = local12 + 2000L;
					return;
				} else {
					this.anInt2102 = Math.min(this.anInt2096, this.anInt2095);
					this.anInt2096 = this.anInt2095;
				}
				this.aLong66 = local12 + 2000L;
				this.anInt2095 = 0;
			}
			this.anInt2094 = local50;
		} catch (@Pc(209) Exception local209) {
			this.method1273();
			this.aLong65 = local12 + 2000L;
		}
		try {
			if (this.aLong64 + 500000L < local12) {
				local12 = this.aLong64;
			}
			while (this.aLong64 + 5000L < local12) {
				this.method1271();
				this.aLong64 += 256000 / Static35.anInt1167;
			}
		} catch (@Pc(250) Exception local250) {
			this.aLong64 = local12;
		}
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "()V")
	protected void method1273() {
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
	public final void method1274() {
		this.aBoolean158 = true;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLclient!kb;I)V")
	private void method1275(@OriginalArg(1) Class2_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(3) int local3 = arg1 >> 5;
		@Pc(8) Class2_Sub2 local8 = this.aClass2_Sub2Array5[local3];
		if (local8 == null) {
			this.aClass2_Sub2Array6[local3] = arg0;
		} else {
			local8.aClass2_Sub2_8 = arg0;
		}
		this.aClass2_Sub2Array5[local3] = arg0;
		arg0.anInt2516 = arg1;
	}

	@OriginalMember(owner = "client!ha", name = "b", descriptor = "(B)V")
	public final synchronized void method1276() {
		this.aBoolean158 = true;
		try {
			this.method1265();
		} catch (@Pc(15) Exception local15) {
			this.method1273();
			this.aLong65 = Static49.method877() + 2000L;
		}
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "()I")
	protected int method1277() throws Exception {
		return this.anInt2098;
	}

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
	public final synchronized void method1278() {
		if (Static20.aClass66_1 != null) {
			@Pc(13) boolean local13 = true;
			for (@Pc(15) int local15 = 0; local15 < 2; local15++) {
				if (Static20.aClass66_1.aClass29Array1[local15] == this) {
					Static20.aClass66_1.aClass29Array1[local15] = null;
				}
				if (Static20.aClass66_1.aClass29Array1[local15] != null) {
					local13 = false;
				}
			}
			if (local13) {
				Static20.aClass66_1.aBoolean200 = true;
				while (Static20.aClass66_1.aBoolean201) {
					Static62.method1070(50L);
				}
				Static20.aClass66_1 = null;
			}
		}
		this.method1273();
		this.anIntArray279 = null;
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
	public void method1279(@OriginalArg(0) int arg0) throws Exception {
	}
}
