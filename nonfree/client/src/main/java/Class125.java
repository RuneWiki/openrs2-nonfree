import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public class Class125 {

	@OriginalMember(owner = "client!jl", name = "p", descriptor = "Lclient!vb;")
	private Class1_Sub6 aClass1_Sub6_8;

	@OriginalMember(owner = "client!jl", name = "t", descriptor = "[I")
	public int[] anIntArray508;

	@OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
	public int anInt7413;

	@OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
	private int anInt7414;

	@OriginalMember(owner = "client!jl", name = "C", descriptor = "I")
	public int anInt7415;

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
	private final int anInt7401 = 32;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "Z")
	private boolean aBoolean808 = false;

	@OriginalMember(owner = "client!jl", name = "v", descriptor = "J")
	private long aLong226 = Static27.method359();

	@OriginalMember(owner = "client!jl", name = "w", descriptor = "J")
	private long aLong227 = 0L;

	@OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
	private int anInt7412 = 0;

	@OriginalMember(owner = "client!jl", name = "D", descriptor = "Z")
	private boolean aBoolean810 = true;

	@OriginalMember(owner = "client!jl", name = "F", descriptor = "I")
	private int anInt7417 = 0;

	@OriginalMember(owner = "client!jl", name = "z", descriptor = "[Lclient!vb;")
	private final Class1_Sub6[] aClass1_Sub6Array5 = new Class1_Sub6[8];

	@OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
	private int anInt7416 = 0;

	@OriginalMember(owner = "client!jl", name = "G", descriptor = "J")
	private long aLong228 = 0L;

	@OriginalMember(owner = "client!jl", name = "B", descriptor = "[Lclient!vb;")
	private final Class1_Sub6[] aClass1_Sub6Array6 = new Class1_Sub6[8];

	@OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
	private int anInt7419 = 0;

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "()V")
	protected void method5855() {
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLclient!vb;)V")
	public final synchronized void method5856(@OriginalArg(1) Class1_Sub6 arg0) {
		this.aClass1_Sub6_8 = arg0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V")
	public final synchronized void method5857() {
		if (this.aBoolean808) {
			return;
		}
		@Pc(12) long local12 = Static27.method359();
		try {
			if (this.aLong226 + 500000L < local12) {
				this.aLong226 = local12 - 500000L;
			}
			while (this.aLong226 + 5000L < local12) {
				this.method5864();
				this.aLong226 += 256000 / Static228.anInt4846;
			}
		} catch (@Pc(56) Exception local56) {
			this.aLong226 = local12;
		}
		if (this.anIntArray508 == null) {
			return;
		}
		try {
			if (this.aLong228 != 0L) {
				if (local12 < this.aLong228) {
					return;
				}
				this.method5858(this.anInt7415);
				this.aBoolean810 = true;
				this.aLong228 = 0L;
			}
			@Pc(99) int local99 = this.method5861();
			if (this.anInt7417 - local99 > this.anInt7416) {
				this.anInt7416 = this.anInt7417 - local99;
			}
			@Pc(124) int local124 = this.anInt7414 + this.anInt7413;
			if (local124 + 256 > 16384) {
				local124 = 16128;
			}
			if (local124 + 256 > this.anInt7415) {
				this.anInt7415 += 1024;
				if (this.anInt7415 > 16384) {
					this.anInt7415 = 16384;
				}
				this.method5855();
				local99 = 0;
				this.method5858(this.anInt7415);
				if (local124 + 256 > this.anInt7415) {
					local124 = this.anInt7415 - 256;
					this.anInt7414 = local124 - this.anInt7413;
				}
				this.aBoolean810 = true;
			}
			while (local124 > local99) {
				this.method5862(this.anIntArray508);
				local99 += 256;
				this.method5871();
			}
			if (local12 > this.aLong227) {
				if (this.aBoolean810) {
					this.aBoolean810 = false;
				} else if (this.anInt7416 == 0 && this.anInt7412 == 0) {
					this.method5855();
					this.aLong228 = local12 + 2000L;
					return;
				} else {
					this.anInt7414 = Math.min(this.anInt7412, this.anInt7416);
					this.anInt7412 = this.anInt7416;
				}
				this.anInt7416 = 0;
				this.aLong227 = local12 + 2000L;
			}
			this.anInt7417 = local99;
		} catch (@Pc(261) Exception local261) {
			this.method5855();
			this.aLong228 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
	public void method5858(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "()I")
	protected int method5861() throws Exception {
		return this.anInt7415;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "([II)V")
	private void method5862(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static166.aBoolean323) {
			local1 = 512;
		}
		Static468.method5040(arg0, 0, local1);
		this.anInt7419 -= 256;
		if (this.aClass1_Sub6_8 != null && this.anInt7419 <= 0) {
			this.anInt7419 += Static228.anInt4846 >> 4;
			Static324.method4375(this.aClass1_Sub6_8);
			this.method5867(this.aClass1_Sub6_8, this.aClass1_Sub6_8.method5169());
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
						@Pc(88) Class1_Sub6 local88 = null;
						@Pc(93) Class1_Sub6 local93 = this.aClass1_Sub6Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub25 local97 = local93.aClass1_Sub25_5;
								if (local97 == null || local97.anInt3337 <= local61) {
									local93.aBoolean726 = true;
									@Pc(121) int local121 = local93.method5165();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3337 += local121;
									}
									if (local45 >= this.anInt7401) {
										break label103;
									}
									@Pc(140) Class1_Sub6 local140 = local93.method5167();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt6608;
										while (local140 != null) {
											this.method5867(local140, local145 * local140.method5169() >> 8);
											local140 = local93.method5168();
										}
									}
									@Pc(164) Class1_Sub6 local164 = local93.aClass1_Sub6_7;
									local93.aClass1_Sub6_7 = null;
									if (local88 == null) {
										this.aClass1_Sub6Array5[local56] = local164;
									} else {
										local88.aClass1_Sub6_7 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub6Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub6_7;
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
				@Pc(207) Class1_Sub6 local207 = this.aClass1_Sub6Array5[local56];
				this.aClass1_Sub6Array5[local56] = this.aClass1_Sub6Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub6 local221 = local207.aClass1_Sub6_7;
					local207.aClass1_Sub6_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt7419 < 0) {
			this.anInt7419 = 0;
		}
		if (this.aClass1_Sub6_8 != null) {
			this.aClass1_Sub6_8.method5171(arg0, 0, 256);
		}
		this.aLong226 = Static27.method359();
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V")
	public final synchronized void method5863() {
		if (Static138.aClass118_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static138.aClass118_1.aClass125Array1[local7] == this) {
					Static138.aClass118_1.aClass125Array1[local7] = null;
				}
				if (Static138.aClass118_1.aClass125Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static138.aClass118_1.aBoolean372 = true;
				while (Static138.aClass118_1.aBoolean373) {
					Static223.method4582(50L);
				}
				Static138.aClass118_1 = null;
			}
		}
		this.method5855();
		this.anIntArray508 = null;
		this.aBoolean808 = true;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)V")
	private void method5864() {
		this.anInt7419 -= 256;
		if (this.anInt7419 < 0) {
			this.anInt7419 = 0;
		}
		if (this.aClass1_Sub6_8 != null) {
			this.aClass1_Sub6_8.method5166(256);
		}
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)V")
	public final synchronized void method5866() {
		this.aBoolean810 = true;
		try {
			this.method5870();
		} catch (@Pc(17) Exception local17) {
			this.method5855();
			this.aLong228 = Static27.method359() + 2000L;
		}
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Lclient!vb;II)V")
	private void method5867(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class1_Sub6 local12 = this.aClass1_Sub6Array6[local7];
		if (local12 == null) {
			this.aClass1_Sub6Array5[local7] = arg0;
		} else {
			local12.aClass1_Sub6_7 = arg0;
		}
		this.aClass1_Sub6Array6[local7] = arg0;
		arg0.anInt6608 = arg1;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5868(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V")
	public final void method5869() {
		this.aBoolean810 = true;
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "()V")
	protected void method5870() throws Exception {
	}

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "()V")
	protected void method5871() throws Exception {
	}
}
