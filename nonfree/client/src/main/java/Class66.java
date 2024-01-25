import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jd")
public class Class66 {

	@OriginalMember(owner = "client!jd", name = "e", descriptor = "[I")
	public int[] anIntArray615;

	@OriginalMember(owner = "client!jd", name = "g", descriptor = "Lclient!fp;")
	private Class1_Sub19 aClass1_Sub19_8;

	@OriginalMember(owner = "client!jd", name = "A", descriptor = "I")
	public int anInt6857;

	@OriginalMember(owner = "client!jd", name = "D", descriptor = "I")
	public int anInt6858;

	@OriginalMember(owner = "client!jd", name = "E", descriptor = "I")
	private int anInt6859;

	@OriginalMember(owner = "client!jd", name = "f", descriptor = "Z")
	private boolean aBoolean478 = false;

	@OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
	private final int anInt6844 = 32;

	@OriginalMember(owner = "client!jd", name = "k", descriptor = "J")
	private long aLong203 = Static279.method4058();

	@OriginalMember(owner = "client!jd", name = "u", descriptor = "[Lclient!fp;")
	private final Class1_Sub19[] aClass1_Sub19Array5 = new Class1_Sub19[8];

	@OriginalMember(owner = "client!jd", name = "x", descriptor = "I")
	private int anInt6856 = 0;

	@OriginalMember(owner = "client!jd", name = "y", descriptor = "Z")
	private boolean aBoolean479 = true;

	@OriginalMember(owner = "client!jd", name = "z", descriptor = "J")
	private long aLong204 = 0L;

	@OriginalMember(owner = "client!jd", name = "w", descriptor = "I")
	private int anInt6855 = 0;

	@OriginalMember(owner = "client!jd", name = "C", descriptor = "J")
	private long aLong205 = 0L;

	@OriginalMember(owner = "client!jd", name = "F", descriptor = "I")
	private int anInt6860 = 0;

	@OriginalMember(owner = "client!jd", name = "G", descriptor = "I")
	private int anInt6861 = 0;

	@OriginalMember(owner = "client!jd", name = "H", descriptor = "[Lclient!fp;")
	private final Class1_Sub19[] aClass1_Sub19Array6 = new Class1_Sub19[8];

	static {
		new Class7("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
	public void method5620(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "()V")
	protected void method5621() throws Exception {
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "()V")
	protected void method5622() throws Exception {
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "([II)V")
	private void method5623(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static222.aBoolean288) {
			local1 = 512;
		}
		Static468.method4331(arg0, 0, local1);
		this.anInt6860 -= 256;
		if (this.aClass1_Sub19_8 != null && this.anInt6860 <= 0) {
			this.anInt6860 += Static247.anInt7108 >> 4;
			Static368.method5054(this.aClass1_Sub19_8);
			this.method5627(this.aClass1_Sub19_8.method3645(), this.aClass1_Sub19_8);
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
						@Pc(88) Class1_Sub19 local88 = null;
						@Pc(93) Class1_Sub19 local93 = this.aClass1_Sub19Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub20 local97 = local93.aClass1_Sub20_5;
								if (local97 == null || local97.anInt2445 <= local61) {
									local93.aBoolean302 = true;
									@Pc(121) int local121 = local93.method3646();
									local45 += local121;
									if (local97 != null) {
										local97.anInt2445 += local121;
									}
									if (local45 >= this.anInt6844) {
										break label103;
									}
									@Pc(140) Class1_Sub19 local140 = local93.method3649();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt4421;
										while (local140 != null) {
											this.method5627(local145 * local140.method3645() >> 8, local140);
											local140 = local93.method3651();
										}
									}
									@Pc(164) Class1_Sub19 local164 = local93.aClass1_Sub19_7;
									local93.aClass1_Sub19_7 = null;
									if (local88 == null) {
										this.aClass1_Sub19Array5[local56] = local164;
									} else {
										local88.aClass1_Sub19_7 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub19Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub19_7;
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
				@Pc(207) Class1_Sub19 local207 = this.aClass1_Sub19Array5[local56];
				this.aClass1_Sub19Array5[local56] = this.aClass1_Sub19Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub19 local221 = local207.aClass1_Sub19_7;
					local207.aClass1_Sub19_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt6860 < 0) {
			this.anInt6860 = 0;
		}
		if (this.aClass1_Sub19_8 != null) {
			this.aClass1_Sub19_8.method3647(arg0, 0, 256);
		}
		this.aLong203 = Static279.method4058();
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(I)V")
	public final synchronized void method5624() {
		this.aBoolean479 = true;
		try {
			this.method5621();
		} catch (@Pc(14) Exception local14) {
			this.method5625();
			this.aLong204 = Static279.method4058() + 2000L;
		}
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "()V")
	protected void method5625() {
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(IBLclient!fp;)V")
	private void method5627(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub19 arg1) {
		@Pc(15) int local15 = arg0 >> 5;
		@Pc(20) Class1_Sub19 local20 = this.aClass1_Sub19Array6[local15];
		if (local20 == null) {
			this.aClass1_Sub19Array5[local15] = arg1;
		} else {
			local20.aClass1_Sub19_7 = arg1;
		}
		this.aClass1_Sub19Array6[local15] = arg1;
		arg1.anInt4421 = arg0;
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(ZLclient!fp;)V")
	public final synchronized void method5629(@OriginalArg(1) Class1_Sub19 arg0) {
		this.aClass1_Sub19_8 = arg0;
	}

	@OriginalMember(owner = "client!jd", name = "c", descriptor = "(I)V")
	public final synchronized void method5630() {
		if (Static212.aClass81_1 != null) {
			@Pc(11) boolean local11 = true;
			for (@Pc(13) int local13 = 0; local13 < 2; local13++) {
				if (Static212.aClass81_1.aClass66Array1[local13] == this) {
					Static212.aClass81_1.aClass66Array1[local13] = null;
				}
				if (Static212.aClass81_1.aClass66Array1[local13] != null) {
					local11 = false;
				}
			}
			if (local11) {
				Static212.aClass81_1.aBoolean145 = true;
				while (Static212.aClass81_1.aBoolean144) {
					Static224.method3441(50L);
				}
				Static212.aClass81_1 = null;
			}
		}
		this.method5625();
		this.aBoolean478 = true;
		this.anIntArray615 = null;
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(B)V")
	public final synchronized void method5631() {
		if (this.aBoolean478) {
			return;
		}
		@Pc(12) long local12 = Static279.method4058();
		try {
			if (this.aLong203 + 500000L < local12) {
				this.aLong203 = local12 - 500000L;
			}
			while (this.aLong203 + 5000L < local12) {
				this.method5632();
				this.aLong203 += 256000 / Static247.anInt7108;
			}
		} catch (@Pc(52) Exception local52) {
			this.aLong203 = local12;
		}
		if (this.anIntArray615 == null) {
			return;
		}
		try {
			if (this.aLong204 != 0L) {
				if (this.aLong204 > local12) {
					return;
				}
				this.method5620(this.anInt6858);
				this.aBoolean479 = true;
				this.aLong204 = 0L;
			}
			@Pc(89) int local89 = this.method5635();
			if (this.anInt6855 < this.anInt6861 - local89) {
				this.anInt6855 = this.anInt6861 - local89;
			}
			@Pc(110) int local110 = this.anInt6859 + this.anInt6857;
			if (local110 + 256 > 16384) {
				local110 = 16128;
			}
			if (local110 + 256 > this.anInt6858) {
				this.anInt6858 += 1024;
				if (this.anInt6858 > 16384) {
					this.anInt6858 = 16384;
				}
				this.method5625();
				local89 = 0;
				this.method5620(this.anInt6858);
				if (local110 + 256 > this.anInt6858) {
					local110 = this.anInt6858 - 256;
					this.anInt6859 = local110 - this.anInt6857;
				}
				this.aBoolean479 = true;
			}
			while (local89 < local110) {
				this.method5623(this.anIntArray615);
				local89 += 256;
				this.method5622();
			}
			if (local12 > this.aLong205) {
				if (this.aBoolean479) {
					this.aBoolean479 = false;
				} else if (this.anInt6855 == 0 && this.anInt6856 == 0) {
					this.method5625();
					this.aLong204 = local12 + 2000L;
					return;
				} else {
					this.anInt6859 = Math.min(this.anInt6856, this.anInt6855);
					this.anInt6856 = this.anInt6855;
				}
				this.aLong205 = local12 + 2000L;
				this.anInt6855 = 0;
			}
			this.anInt6861 = local89;
		} catch (@Pc(243) Exception local243) {
			this.method5625();
			this.aLong204 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!jd", name = "b", descriptor = "(II)V")
	private void method5632() {
		this.anInt6860 -= 256;
		if (this.anInt6860 < 0) {
			this.anInt6860 = 0;
		}
		if (this.aClass1_Sub19_8 != null) {
			this.aClass1_Sub19_8.method3650(256);
		}
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5633(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z)V")
	public final void method5634() {
		this.aBoolean479 = true;
	}

	@OriginalMember(owner = "client!jd", name = "d", descriptor = "()I")
	protected int method5635() throws Exception {
		return this.anInt6858;
	}
}
