import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aj")
public class Class11 {

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "Lclient!mi;")
	private Class6_Sub18 aClass6_Sub18_7;

	@OriginalMember(owner = "client!aj", name = "p", descriptor = "[I")
	public int[] anIntArray550;

	@OriginalMember(owner = "client!aj", name = "E", descriptor = "I")
	private int anInt7643;

	@OriginalMember(owner = "client!aj", name = "G", descriptor = "I")
	public int anInt7645;

	@OriginalMember(owner = "client!aj", name = "K", descriptor = "I")
	public int anInt7648;

	@OriginalMember(owner = "client!aj", name = "f", descriptor = "I")
	private final int anInt7626 = 32;

	@OriginalMember(owner = "client!aj", name = "t", descriptor = "Z")
	private boolean aBoolean533 = false;

	@OriginalMember(owner = "client!aj", name = "m", descriptor = "J")
	private long aLong208 = Static8.method201();

	@OriginalMember(owner = "client!aj", name = "B", descriptor = "[Lclient!mi;")
	private final Class6_Sub18[] aClass6_Sub18Array5 = new Class6_Sub18[8];

	@OriginalMember(owner = "client!aj", name = "D", descriptor = "[Lclient!mi;")
	private final Class6_Sub18[] aClass6_Sub18Array6 = new Class6_Sub18[8];

	@OriginalMember(owner = "client!aj", name = "H", descriptor = "I")
	private int anInt7646 = 0;

	@OriginalMember(owner = "client!aj", name = "I", descriptor = "I")
	private int anInt7647 = 0;

	@OriginalMember(owner = "client!aj", name = "F", descriptor = "I")
	private int anInt7644 = 0;

	@OriginalMember(owner = "client!aj", name = "C", descriptor = "I")
	private int anInt7642 = 0;

	@OriginalMember(owner = "client!aj", name = "J", descriptor = "Z")
	private boolean aBoolean534 = true;

	@OriginalMember(owner = "client!aj", name = "M", descriptor = "J")
	private long aLong210 = 0L;

	@OriginalMember(owner = "client!aj", name = "L", descriptor = "J")
	private long aLong209 = 0L;

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "()V")
	protected void method6281() {
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(IB)V")
	private void method6282() {
		this.anInt7642 -= 256;
		if (this.anInt7642 < 0) {
			this.anInt7642 = 0;
		}
		if (this.aClass6_Sub18_7 != null) {
			this.aClass6_Sub18_7.method6377(256);
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
	public final synchronized void method6283() {
		if (Static513.aClass244_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static513.aClass244_1.aClass11Array1[local7] == this) {
					Static513.aClass244_1.aClass11Array1[local7] = null;
				}
				if (Static513.aClass244_1.aClass11Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static513.aClass244_1.aBoolean460 = true;
				while (Static513.aClass244_1.aBoolean459) {
					Static318.method4952(50L);
				}
				Static513.aClass244_1 = null;
			}
		}
		this.method6281();
		this.anIntArray550 = null;
		this.aBoolean533 = true;
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "()I")
	protected int method6284() throws Exception {
		return this.anInt7645;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILclient!mi;)V")
	public final synchronized void method6285(@OriginalArg(1) Class6_Sub18 arg0) {
		this.aClass6_Sub18_7 = arg0;
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
	public final synchronized void method6286() {
		if (this.aBoolean533) {
			return;
		}
		@Pc(12) long local12 = Static8.method201();
		try {
			if (local12 > this.aLong208 + 500000L) {
				this.aLong208 = local12 - 500000L;
			}
			while (this.aLong208 + 5000L < local12) {
				this.method6282();
				this.aLong208 += 256000 / Static330.anInt6003;
			}
		} catch (@Pc(58) Exception local58) {
			this.aLong208 = local12;
		}
		if (this.anIntArray550 == null) {
			return;
		}
		try {
			if (this.aLong209 != 0L) {
				if (this.aLong209 > local12) {
					return;
				}
				this.method6293(this.anInt7645);
				this.aBoolean534 = true;
				this.aLong209 = 0L;
			}
			@Pc(95) int local95 = this.method6284();
			if (this.anInt7647 - local95 > this.anInt7644) {
				this.anInt7644 = this.anInt7647 - local95;
			}
			@Pc(116) int local116 = this.anInt7643 + this.anInt7648;
			if (local116 + 256 > 16384) {
				local116 = 16128;
			}
			if (local116 + 256 > this.anInt7645) {
				this.anInt7645 += 1024;
				if (this.anInt7645 > 16384) {
					this.anInt7645 = 16384;
				}
				this.method6281();
				this.method6293(this.anInt7645);
				local95 = 0;
				this.aBoolean534 = true;
				if (local116 + 256 > this.anInt7645) {
					local116 = this.anInt7645 - 256;
					this.anInt7643 = local116 - this.anInt7648;
				}
			}
			while (local116 > local95) {
				this.method6294(this.anIntArray550);
				this.method6296();
				local95 += 256;
			}
			if (this.aLong210 < local12) {
				if (this.aBoolean534) {
					this.aBoolean534 = false;
				} else if (this.anInt7644 == 0 && this.anInt7646 == 0) {
					this.method6281();
					this.aLong209 = local12 + 2000L;
					return;
				} else {
					this.anInt7643 = Math.min(this.anInt7646, this.anInt7644);
					this.anInt7646 = this.anInt7644;
				}
				this.anInt7644 = 0;
				this.aLong210 = local12 + 2000L;
			}
			this.anInt7647 = local95;
		} catch (@Pc(259) Exception local259) {
			this.method6281();
			this.aLong209 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
	public final synchronized void method6288() {
		this.aBoolean534 = true;
		try {
			this.method6292();
		} catch (@Pc(17) Exception local17) {
			this.method6281();
			this.aLong209 = Static8.method201() + 2000L;
		}
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method6289(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!aj", name = "c", descriptor = "()V")
	protected void method6292() throws Exception {
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "(I)V")
	public void method6293(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "([II)V")
	private void method6294(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static341.aBoolean438) {
			local1 = 512;
		}
		Static601.method2936(arg0, 0, local1);
		this.anInt7642 -= 256;
		if (this.aClass6_Sub18_7 != null && this.anInt7642 <= 0) {
			this.anInt7642 += Static330.anInt6003 >> 4;
			Static130.method2584(this.aClass6_Sub18_7);
			this.method6298(this.aClass6_Sub18_7.method6373(), this.aClass6_Sub18_7);
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
						@Pc(88) Class6_Sub18 local88 = null;
						@Pc(93) Class6_Sub18 local93 = this.aClass6_Sub18Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class6_Sub19 local97 = local93.aClass6_Sub19_5;
								if (local97 == null || local97.anInt3208 <= local61) {
									local93.aBoolean549 = true;
									@Pc(121) int local121 = local93.method6376();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3208 += local121;
									}
									if (local45 >= this.anInt7626) {
										break label103;
									}
									@Pc(140) Class6_Sub18 local140 = local93.method6374();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt7788;
										while (local140 != null) {
											this.method6298(local145 * local140.method6373() >> 8, local140);
											local140 = local93.method6371();
										}
									}
									@Pc(164) Class6_Sub18 local164 = local93.aClass6_Sub18_8;
									local93.aClass6_Sub18_8 = null;
									if (local88 == null) {
										this.aClass6_Sub18Array6[local56] = local164;
									} else {
										local88.aClass6_Sub18_8 = local164;
									}
									if (local164 == null) {
										this.aClass6_Sub18Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass6_Sub18_8;
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
				@Pc(207) Class6_Sub18 local207 = this.aClass6_Sub18Array6[local56];
				this.aClass6_Sub18Array6[local56] = this.aClass6_Sub18Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class6_Sub18 local221 = local207.aClass6_Sub18_8;
					local207.aClass6_Sub18_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt7642 < 0) {
			this.anInt7642 = 0;
		}
		if (this.aClass6_Sub18_7 != null) {
			this.aClass6_Sub18_7.method6372(arg0, 0, 256);
		}
		this.aLong208 = Static8.method201();
	}

	@OriginalMember(owner = "client!aj", name = "d", descriptor = "()V")
	protected void method6296() throws Exception {
	}

	@OriginalMember(owner = "client!aj", name = "a", descriptor = "(ZILclient!mi;)V")
	private void method6298(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub18 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(17) Class6_Sub18 local17 = this.aClass6_Sub18Array5[local7];
		if (local17 == null) {
			this.aClass6_Sub18Array6[local7] = arg1;
		} else {
			local17.aClass6_Sub18_8 = arg1;
		}
		this.aClass6_Sub18Array5[local7] = arg1;
		arg1.anInt7788 = arg0;
	}
}
