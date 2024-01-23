import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gf")
public class Class40 {

	@OriginalMember(owner = "client!gf", name = "n", descriptor = "[I")
	public int[] anIntArray744;

	@OriginalMember(owner = "client!gf", name = "q", descriptor = "Lclient!lc;")
	private Class2_Sub21 aClass2_Sub21_7;

	@OriginalMember(owner = "client!gf", name = "V", descriptor = "I")
	public int anInt4692;

	@OriginalMember(owner = "client!gf", name = "W", descriptor = "I")
	private int anInt4693;

	@OriginalMember(owner = "client!gf", name = "Z", descriptor = "I")
	public int anInt4694;

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "I")
	private int anInt4676 = 32;

	@OriginalMember(owner = "client!gf", name = "J", descriptor = "J")
	private long aLong177 = Static111.method1911();

	@OriginalMember(owner = "client!gf", name = "Q", descriptor = "[Lclient!lc;")
	private Class2_Sub21[] aClass2_Sub21Array5 = new Class2_Sub21[8];

	@OriginalMember(owner = "client!gf", name = "O", descriptor = "J")
	private long aLong178 = 0L;

	@OriginalMember(owner = "client!gf", name = "T", descriptor = "[Lclient!lc;")
	private Class2_Sub21[] aClass2_Sub21Array6 = new Class2_Sub21[8];

	@OriginalMember(owner = "client!gf", name = "U", descriptor = "J")
	private long aLong179 = 0L;

	@OriginalMember(owner = "client!gf", name = "S", descriptor = "I")
	private int anInt4691 = 0;

	@OriginalMember(owner = "client!gf", name = "ab", descriptor = "I")
	private int anInt4695 = 0;

	@OriginalMember(owner = "client!gf", name = "cb", descriptor = "I")
	private int anInt4697 = 0;

	@OriginalMember(owner = "client!gf", name = "bb", descriptor = "I")
	private int anInt4696 = 0;

	@OriginalMember(owner = "client!gf", name = "Y", descriptor = "Z")
	private boolean aBoolean201 = true;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "()V")
	protected void method3704() throws Exception {
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
	private void method3705() {
		this.anInt4691 -= 256;
		if (this.anInt4691 < 0) {
			this.anInt4691 = 0;
		}
		if (this.aClass2_Sub21_7 != null) {
			this.aClass2_Sub21_7.method3845(256);
		}
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
	public void method3706(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "(I)V")
	public final synchronized void method3707() {
		if (this.anIntArray744 == null) {
			return;
		}
		@Pc(10) long local10 = Static111.method1911();
		try {
			if (this.aLong178 != 0L) {
				if (local10 < this.aLong178) {
					return;
				}
				this.method3706(this.anInt4694);
				this.aLong178 = 0L;
				this.aBoolean201 = true;
			}
			@Pc(38) int local38 = this.method3709();
			if (this.anInt4695 < this.anInt4696 - local38) {
				this.anInt4695 = this.anInt4696 - local38;
			}
			@Pc(59) int local59 = this.anInt4692 + this.anInt4693;
			if (local59 + 256 > 16384) {
				local59 = 16128;
			}
			if (this.anInt4694 < local59 + 256) {
				local38 = 0;
				this.anInt4694 += 1024;
				if (this.anInt4694 > 16384) {
					this.anInt4694 = 16384;
				}
				this.method3716();
				this.method3706(this.anInt4694);
				if (this.anInt4694 < local59 + 256) {
					local59 = this.anInt4694 - 256;
					this.anInt4693 = local59 - this.anInt4692;
				}
				this.aBoolean201 = true;
			}
			while (local59 > local38) {
				this.method3717(this.anIntArray744);
				local38 += 256;
				this.method3704();
			}
			if (this.aLong179 < local10) {
				if (this.aBoolean201) {
					this.aBoolean201 = false;
				} else if (this.anInt4695 == 0 && this.anInt4697 == 0) {
					this.method3716();
					this.aLong178 = local10 + 2000L;
					return;
				} else {
					this.anInt4693 = Math.min(this.anInt4697, this.anInt4695);
					this.anInt4697 = this.anInt4695;
				}
				this.anInt4695 = 0;
				this.aLong179 = local10 + 2000L;
			}
			this.anInt4696 = local38;
		} catch (@Pc(203) Exception local203) {
			this.method3716();
			this.aLong178 = local10 + 2000L;
		}
		try {
			if (this.aLong177 + 500000L < local10) {
				local10 = this.aLong177;
			}
			while (local10 > this.aLong177 + 5000L) {
				this.method3705();
				this.aLong177 += 256000 / Static161.anInt3727;
			}
		} catch (@Pc(247) Exception local247) {
			this.aLong177 = local10;
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILclient!lc;)V")
	public final synchronized void method3708(@OriginalArg(1) Class2_Sub21 arg0) {
		this.aClass2_Sub21_7 = arg0;
	}

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "()I")
	protected int method3709() throws Exception {
		return this.anInt4694;
	}

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "(I)V")
	public final synchronized void method3710() {
		if (Static13.aClass50_1 != null) {
			@Pc(11) boolean local11 = true;
			for (@Pc(13) int local13 = 0; local13 < 2; local13++) {
				if (Static13.aClass50_1.aClass40Array1[local13] == this) {
					Static13.aClass50_1.aClass40Array1[local13] = null;
				}
				if (Static13.aClass50_1.aClass40Array1[local13] != null) {
					local11 = false;
				}
			}
			if (local11) {
				Static13.aClass50_1.aBoolean81 = true;
				while (Static13.aClass50_1.aBoolean79) {
					Static156.method2805(50L);
				}
				Static13.aClass50_1 = null;
			}
		}
		this.method3716();
		this.anIntArray744 = null;
	}

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "(I)V")
	public final void method3712() {
		this.aBoolean201 = true;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Lclient!lc;IB)V")
	private void method3713(@OriginalArg(0) Class2_Sub21 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class2_Sub21 local12 = this.aClass2_Sub21Array5[local7];
		if (local12 == null) {
			this.aClass2_Sub21Array6[local7] = arg0;
		} else {
			local12.aClass2_Sub21_8 = arg0;
		}
		this.aClass2_Sub21Array5[local7] = arg0;
		arg0.anInt4780 = arg1;
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method3714(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "(I)V")
	public final synchronized void method3715() {
		this.aBoolean201 = true;
		try {
			this.method3718();
		} catch (@Pc(18) Exception local18) {
			this.method3716();
			this.aLong178 = Static111.method1911() + 2000L;
		}
	}

	@OriginalMember(owner = "client!gf", name = "c", descriptor = "()V")
	protected void method3716() {
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "([II)V")
	private void method3717(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static40.aBoolean26) {
			local1 = 512;
		}
		Static231.method2213(arg0, 0, local1);
		this.anInt4691 -= 256;
		if (this.aClass2_Sub21_7 != null && this.anInt4691 <= 0) {
			this.anInt4691 += Static161.anInt3727 >> 4;
			Static87.method1550(this.aClass2_Sub21_7);
			this.method3713(this.aClass2_Sub21_7, this.aClass2_Sub21_7.method3841());
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
						@Pc(88) Class2_Sub21 local88 = null;
						@Pc(93) Class2_Sub21 local93 = this.aClass2_Sub21Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub22 local97 = local93.aClass2_Sub22_5;
								if (local97 == null || local97.anInt2516 <= local61) {
									local93.aBoolean206 = true;
									@Pc(121) int local121 = local93.method3843();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2516 += local121;
									}
									if (local45 >= this.anInt4676) {
										break label103;
									}
									@Pc(140) Class2_Sub21 local140 = local93.method3840();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt4780;
										while (local140 != null) {
											this.method3713(local140, local145 * local140.method3841() >> 8);
											local140 = local93.method3842();
										}
									}
									@Pc(164) Class2_Sub21 local164 = local93.aClass2_Sub21_8;
									local93.aClass2_Sub21_8 = null;
									if (local88 == null) {
										this.aClass2_Sub21Array6[local56] = local164;
									} else {
										local88.aClass2_Sub21_8 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub21Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub21_8;
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
				@Pc(207) Class2_Sub21 local207 = this.aClass2_Sub21Array6[local56];
				this.aClass2_Sub21Array6[local56] = this.aClass2_Sub21Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub21 local221 = local207.aClass2_Sub21_8;
					local207.aClass2_Sub21_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt4691 < 0) {
			this.anInt4691 = 0;
		}
		if (this.aClass2_Sub21_7 != null) {
			this.aClass2_Sub21_7.method3844(arg0, 0, 256);
		}
		this.aLong177 = Static111.method1911();
	}

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "()V")
	protected void method3718() throws Exception {
	}
}
