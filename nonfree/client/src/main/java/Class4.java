import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public class Class4 {

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "Lclient!ad;")
	private Class2_Sub2 aClass2_Sub2_6;

	@OriginalMember(owner = "client!ac", name = "O", descriptor = "[I")
	public int[] anIntArray158;

	@OriginalMember(owner = "client!ac", name = "S", descriptor = "I")
	public int anInt1244;

	@OriginalMember(owner = "client!ac", name = "X", descriptor = "I")
	private int anInt1246;

	@OriginalMember(owner = "client!ac", name = "Y", descriptor = "I")
	public int anInt1247;

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
	private final int anInt1230 = 32;

	@OriginalMember(owner = "client!ac", name = "A", descriptor = "J")
	private long aLong41 = Static78.method1296();

	@OriginalMember(owner = "client!ac", name = "P", descriptor = "I")
	private int anInt1242 = 0;

	@OriginalMember(owner = "client!ac", name = "T", descriptor = "I")
	private int anInt1245 = 0;

	@OriginalMember(owner = "client!ac", name = "R", descriptor = "J")
	private long aLong42 = 0L;

	@OriginalMember(owner = "client!ac", name = "Q", descriptor = "I")
	private int anInt1243 = 0;

	@OriginalMember(owner = "client!ac", name = "V", descriptor = "[Lclient!ad;")
	private final Class2_Sub2[] aClass2_Sub2Array6 = new Class2_Sub2[8];

	@OriginalMember(owner = "client!ac", name = "W", descriptor = "J")
	private long aLong43 = 0L;

	@OriginalMember(owner = "client!ac", name = "Z", descriptor = "Z")
	private boolean aBoolean50 = true;

	@OriginalMember(owner = "client!ac", name = "U", descriptor = "[Lclient!ad;")
	private final Class2_Sub2[] aClass2_Sub2Array5 = new Class2_Sub2[8];

	@OriginalMember(owner = "client!ac", name = "ab", descriptor = "I")
	private int anInt1248 = 0;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
	public final synchronized void method857() {
		if (this.anIntArray158 == null) {
			return;
		}
		@Pc(12) long local12 = Static78.method1296();
		try {
			if (this.aLong43 != 0L) {
				if (local12 < this.aLong43) {
					return;
				}
				this.method864(this.anInt1244);
				this.aBoolean50 = true;
				this.aLong43 = 0L;
			}
			@Pc(40) int local40 = this.method869();
			@Pc(46) int local46 = this.anInt1246 + this.anInt1247;
			if (local46 + 256 > 16384) {
				local46 = 16128;
			}
			if (this.anInt1242 < this.anInt1245 - local40) {
				this.anInt1242 = this.anInt1245 - local40;
			}
			if (local46 + 256 > this.anInt1244) {
				this.anInt1244 += 1024;
				local40 = 0;
				if (this.anInt1244 > 16384) {
					this.anInt1244 = 16384;
				}
				this.method865();
				this.method864(this.anInt1244);
				this.aBoolean50 = true;
				if (this.anInt1244 < local46 + 256) {
					local46 = this.anInt1244 - 256;
					this.anInt1246 = local46 - this.anInt1247;
				}
			}
			while (local46 > local40) {
				local40 += 256;
				this.method871(this.anIntArray158);
				this.method870();
			}
			if (this.aLong42 < local12) {
				if (this.aBoolean50) {
					this.aBoolean50 = false;
				} else if (this.anInt1242 == 0 && this.anInt1248 == 0) {
					this.method865();
					this.aLong43 = local12 + 2000L;
					return;
				} else {
					this.anInt1246 = Math.min(this.anInt1248, this.anInt1242);
					this.anInt1248 = this.anInt1242;
				}
				this.aLong42 = local12 + 2000L;
				this.anInt1242 = 0;
			}
			this.anInt1245 = local40;
		} catch (@Pc(202) Exception local202) {
			this.method865();
			this.aLong43 = local12 + 2000L;
		}
		try {
			if (this.aLong41 + 500000L < local12) {
				local12 = this.aLong41;
			}
			while (local12 > this.aLong41 + 5000L) {
				this.method868();
				this.aLong41 += 256000 / Static107.anInt2405;
			}
		} catch (@Pc(247) Exception local247) {
			this.aLong41 = local12;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(BLclient!ad;)V")
	public final synchronized void method859(@OriginalArg(1) Class2_Sub2 arg0) {
		this.aClass2_Sub2_6 = arg0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!ad;II)V")
	private void method861(@OriginalArg(0) Class2_Sub2 arg0, @OriginalArg(2) int arg1) {
		@Pc(11) int local11 = arg1 >> 5;
		@Pc(16) Class2_Sub2 local16 = this.aClass2_Sub2Array6[local11];
		if (local16 == null) {
			this.aClass2_Sub2Array5[local11] = arg0;
		} else {
			local16.aClass2_Sub2_8 = arg0;
		}
		this.aClass2_Sub2Array6[local11] = arg0;
		arg0.anInt2439 = arg1;
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)V")
	public final void method862() {
		this.aBoolean50 = true;
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)V")
	public void method864(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "()V")
	protected void method865() {
	}

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)V")
	public final synchronized void method866() {
		if (Static37.aClass29_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static37.aClass29_1.aClass4Array1[local11] == this) {
					Static37.aClass29_1.aClass4Array1[local11] = null;
				}
				if (Static37.aClass29_1.aClass4Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static37.aClass29_1.aBoolean35 = true;
				while (Static37.aClass29_1.aBoolean34) {
					Static81.method1325(50L);
				}
				Static37.aClass29_1 = null;
			}
		}
		this.method865();
		this.anIntArray158 = null;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)V")
	private void method868() {
		this.anInt1243 -= 256;
		if (this.anInt1243 < 0) {
			this.anInt1243 = 0;
		}
		if (this.aClass2_Sub2_6 != null) {
			this.aClass2_Sub2_6.method1765(256);
		}
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "()I")
	protected int method869() throws Exception {
		return this.anInt1244;
	}

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "()V")
	protected void method870() throws Exception {
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "([II)V")
	private void method871(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static28.aBoolean29) {
			local1 = 512;
		}
		Static135.method358(arg0, 0, local1);
		this.anInt1243 -= 256;
		if (this.aClass2_Sub2_6 != null && this.anInt1243 <= 0) {
			this.anInt1243 += Static107.anInt2405 >> 4;
			Static105.method1710(this.aClass2_Sub2_6);
			this.method861(this.aClass2_Sub2_6, this.aClass2_Sub2_6.method1767());
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
						@Pc(88) Class2_Sub2 local88 = null;
						@Pc(93) Class2_Sub2 local93 = this.aClass2_Sub2Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub5 local97 = local93.aClass2_Sub5_5;
								if (local97 == null || local97.anInt1042 <= local61) {
									local93.aBoolean100 = true;
									@Pc(121) int local121 = local93.method1763();
									local45 += local121;
									if (local97 != null) {
										local97.anInt1042 += local121;
									}
									if (local45 >= this.anInt1230) {
										break label103;
									}
									@Pc(140) Class2_Sub2 local140 = local93.method1769();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt2439;
										while (local140 != null) {
											this.method861(local140, local145 * local140.method1767() >> 8);
											local140 = local93.method1766();
										}
									}
									@Pc(164) Class2_Sub2 local164 = local93.aClass2_Sub2_8;
									local93.aClass2_Sub2_8 = null;
									if (local88 == null) {
										this.aClass2_Sub2Array5[local56] = local164;
									} else {
										local88.aClass2_Sub2_8 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub2Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub2_8;
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
				@Pc(207) Class2_Sub2 local207 = this.aClass2_Sub2Array5[local56];
				this.aClass2_Sub2Array5[local56] = this.aClass2_Sub2Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub2 local221 = local207.aClass2_Sub2_8;
					local207.aClass2_Sub2_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt1243 < 0) {
			this.anInt1243 = 0;
		}
		if (this.aClass2_Sub2_6 != null) {
			this.aClass2_Sub2_6.method1764(arg0, 0, 256);
		}
		this.aLong41 = Static78.method1296();
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method873(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "()V")
	protected void method874() throws Exception {
	}

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "(I)V")
	public final synchronized void method875() {
		this.aBoolean50 = true;
		try {
			this.method874();
		} catch (@Pc(16) Exception local16) {
			this.method865();
			this.aLong43 = Static78.method1296() + 2000L;
		}
	}
}
