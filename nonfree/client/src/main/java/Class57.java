import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public class Class57 {

	@OriginalMember(owner = "client!ve", name = "q", descriptor = "[I")
	public int[] anIntArray493;

	@OriginalMember(owner = "client!ve", name = "F", descriptor = "Lclient!h;")
	private Class1_Sub3 aClass1_Sub3_7;

	@OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
	public int anInt2912;

	@OriginalMember(owner = "client!ve", name = "L", descriptor = "I")
	public int anInt2915;

	@OriginalMember(owner = "client!ve", name = "O", descriptor = "I")
	private int anInt2916;

	@OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
	private final int anInt2911 = 32;

	@OriginalMember(owner = "client!ve", name = "o", descriptor = "J")
	private long aLong180 = Static26.method596();

	@OriginalMember(owner = "client!ve", name = "H", descriptor = "[Lclient!h;")
	private final Class1_Sub3[] aClass1_Sub3Array5 = new Class1_Sub3[8];

	@OriginalMember(owner = "client!ve", name = "M", descriptor = "J")
	private long aLong182 = 0L;

	@OriginalMember(owner = "client!ve", name = "J", descriptor = "I")
	private int anInt2913 = 0;

	@OriginalMember(owner = "client!ve", name = "I", descriptor = "J")
	private long aLong181 = 0L;

	@OriginalMember(owner = "client!ve", name = "N", descriptor = "[Lclient!h;")
	private final Class1_Sub3[] aClass1_Sub3Array6 = new Class1_Sub3[8];

	@OriginalMember(owner = "client!ve", name = "Q", descriptor = "I")
	private int anInt2918 = 0;

	@OriginalMember(owner = "client!ve", name = "P", descriptor = "I")
	private int anInt2917 = 0;

	@OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
	private int anInt2914 = 0;

	@OriginalMember(owner = "client!ve", name = "R", descriptor = "Z")
	private boolean aBoolean130 = true;

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "()I")
	protected int method2002() throws Exception {
		return this.anInt2912;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lclient!h;I)V")
	public final synchronized void method2003(@OriginalArg(0) Class1_Sub3 arg0) {
		this.aClass1_Sub3_7 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "([II)V")
	private void method2005(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static10.aBoolean6) {
			local1 = 512;
		}
		Static132.method847(arg0, 0, local1);
		this.anInt2918 -= 256;
		if (this.aClass1_Sub3_7 != null && this.anInt2918 <= 0) {
			this.anInt2918 += Static81.anInt1802 >> 4;
			Static99.method1651(this.aClass1_Sub3_7);
			this.method2009(this.aClass1_Sub3_7, this.aClass1_Sub3_7.method2027());
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
						@Pc(88) Class1_Sub3 local88 = null;
						@Pc(93) Class1_Sub3 local93 = this.aClass1_Sub3Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub14 local97 = local93.aClass1_Sub14_5;
								if (local97 == null || local97.anInt2049 <= local61) {
									local93.aBoolean131 = true;
									@Pc(121) int local121 = local93.method2029();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2049 += local121;
									}
									if (local45 >= this.anInt2911) {
										break label103;
									}
									@Pc(140) Class1_Sub3 local140 = local93.method2026();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt2929;
										while (local140 != null) {
											this.method2009(local140, local145 * local140.method2027() >> 8);
											local140 = local93.method2032();
										}
									}
									@Pc(164) Class1_Sub3 local164 = local93.aClass1_Sub3_8;
									local93.aClass1_Sub3_8 = null;
									if (local88 == null) {
										this.aClass1_Sub3Array5[local56] = local164;
									} else {
										local88.aClass1_Sub3_8 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub3Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub3_8;
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
				@Pc(207) Class1_Sub3 local207 = this.aClass1_Sub3Array5[local56];
				this.aClass1_Sub3Array5[local56] = this.aClass1_Sub3Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub3 local221 = local207.aClass1_Sub3_8;
					local207.aClass1_Sub3_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt2918 < 0) {
			this.anInt2918 = 0;
		}
		if (this.aClass1_Sub3_7 != null) {
			this.aClass1_Sub3_7.method2030(arg0, 0, 256);
		}
		this.aLong180 = Static26.method596();
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)V")
	private void method2006() {
		this.anInt2918 -= 256;
		if (this.anInt2918 < 0) {
			this.anInt2918 = 0;
		}
		if (this.aClass1_Sub3_7 != null) {
			this.aClass1_Sub3_7.method2028(256);
		}
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V")
	public final void method2007() {
		this.aBoolean130 = true;
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "()V")
	protected void method2008() throws Exception {
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILclient!h;I)V")
	private void method2009(@OriginalArg(1) Class1_Sub3 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1 >> 5;
		@Pc(16) Class1_Sub3 local16 = this.aClass1_Sub3Array6[local11];
		if (local16 == null) {
			this.aClass1_Sub3Array5[local11] = arg0;
		} else {
			local16.aClass1_Sub3_8 = arg0;
		}
		this.aClass1_Sub3Array6[local11] = arg0;
		arg0.anInt2929 = arg1;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)V")
	public void method2011(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "()V")
	protected void method2012() throws Exception {
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)V")
	public final synchronized void method2014() {
		this.aBoolean130 = true;
		try {
			this.method2012();
		} catch (@Pc(14) Exception local14) {
			this.method2017();
			this.aLong182 = Static26.method596() + 2000L;
		}
	}

	@OriginalMember(owner = "client!ve", name = "c", descriptor = "(I)V")
	public final synchronized void method2015() {
		if (this.anIntArray493 == null) {
			return;
		}
		@Pc(12) long local12 = Static26.method596();
		try {
			if (this.aLong182 != 0L) {
				if (this.aLong182 > local12) {
					return;
				}
				this.method2011(this.anInt2912);
				this.aLong182 = 0L;
				this.aBoolean130 = true;
			}
			@Pc(38) int local38 = this.method2002();
			@Pc(44) int local44 = this.anInt2915 + this.anInt2916;
			if (local44 + 256 > 16384) {
				local44 = 16128;
			}
			if (this.anInt2917 < this.anInt2914 - local38) {
				this.anInt2917 = this.anInt2914 - local38;
			}
			if (this.anInt2912 < local44 + 256) {
				this.anInt2912 += 1024;
				if (this.anInt2912 > 16384) {
					this.anInt2912 = 16384;
				}
				local38 = 0;
				this.method2017();
				this.method2011(this.anInt2912);
				this.aBoolean130 = true;
				if (this.anInt2912 < local44 + 256) {
					local44 = this.anInt2912 - 256;
					this.anInt2916 = local44 - this.anInt2915;
				}
			}
			while (local38 < local44) {
				this.method2005(this.anIntArray493);
				local38 += 256;
				this.method2008();
			}
			if (this.aLong181 < local12) {
				if (this.aBoolean130) {
					this.aBoolean130 = false;
				} else if (this.anInt2917 == 0 && this.anInt2913 == 0) {
					this.method2017();
					this.aLong182 = local12 + 2000L;
					return;
				} else {
					this.anInt2916 = Math.min(this.anInt2913, this.anInt2917);
					this.anInt2913 = this.anInt2917;
				}
				this.anInt2917 = 0;
				this.aLong181 = local12 + 2000L;
			}
			this.anInt2914 = local38;
		} catch (@Pc(186) Exception local186) {
			this.method2017();
			this.aLong182 = local12 + 2000L;
		}
		try {
			if (local12 > this.aLong180 + 500000L) {
				local12 = this.aLong180;
			}
			while (local12 > this.aLong180 + 5000L) {
				this.method2006();
				this.aLong180 += 256000 / Static81.anInt1802;
			}
		} catch (@Pc(239) Exception local239) {
			this.aLong180 = local12;
		}
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method2016(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "()V")
	protected void method2017() {
	}

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "(I)V")
	public final synchronized void method2018() {
		if (Static38.aClass21_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static38.aClass21_1.aClass57Array1[local11] == this) {
					Static38.aClass21_1.aClass57Array1[local11] = null;
				}
				if (Static38.aClass21_1.aClass57Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static38.aClass21_1.aBoolean26 = true;
				while (Static38.aClass21_1.aBoolean23) {
					Static53.method1782(50L);
				}
				Static38.aClass21_1 = null;
			}
		}
		this.method2017();
		this.anIntArray493 = null;
	}
}
