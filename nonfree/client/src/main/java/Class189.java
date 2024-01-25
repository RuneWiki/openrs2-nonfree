import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!un")
public class Class189 {

	@OriginalMember(owner = "client!un", name = "a", descriptor = "Lclient!vw;")
	private Class6_Sub15 aClass6_Sub15_6;

	@OriginalMember(owner = "client!un", name = "q", descriptor = "[I")
	public int[] anIntArray437;

	@OriginalMember(owner = "client!un", name = "t", descriptor = "I")
	public int anInt6091;

	@OriginalMember(owner = "client!un", name = "u", descriptor = "I")
	public int anInt6092;

	@OriginalMember(owner = "client!un", name = "D", descriptor = "I")
	private int anInt6096;

	@OriginalMember(owner = "client!un", name = "b", descriptor = "Z")
	private boolean aBoolean437 = false;

	@OriginalMember(owner = "client!un", name = "n", descriptor = "I")
	private final int anInt6086 = 32;

	@OriginalMember(owner = "client!un", name = "i", descriptor = "J")
	private long aLong146 = Static416.method5922();

	@OriginalMember(owner = "client!un", name = "s", descriptor = "I")
	private int anInt6090 = 0;

	@OriginalMember(owner = "client!un", name = "x", descriptor = "[Lclient!vw;")
	private final Class6_Sub15[] aClass6_Sub15Array5 = new Class6_Sub15[8];

	@OriginalMember(owner = "client!un", name = "A", descriptor = "[Lclient!vw;")
	private final Class6_Sub15[] aClass6_Sub15Array6 = new Class6_Sub15[8];

	@OriginalMember(owner = "client!un", name = "y", descriptor = "I")
	private int anInt6095 = 0;

	@OriginalMember(owner = "client!un", name = "v", descriptor = "I")
	private int anInt6093 = 0;

	@OriginalMember(owner = "client!un", name = "B", descriptor = "Z")
	private boolean aBoolean438 = true;

	@OriginalMember(owner = "client!un", name = "z", descriptor = "J")
	private long aLong147 = 0L;

	@OriginalMember(owner = "client!un", name = "r", descriptor = "I")
	private int anInt6089 = 0;

	@OriginalMember(owner = "client!un", name = "C", descriptor = "J")
	private long aLong148 = 0L;

	@OriginalMember(owner = "client!un", name = "a", descriptor = "()I")
	protected int method4934() throws Exception {
		return this.anInt6092;
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "()V")
	protected void method4935() throws Exception {
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(IB)V")
	private void method4936() {
		this.anInt6095 -= 256;
		if (this.anInt6095 < 0) {
			this.anInt6095 = 0;
		}
		if (this.aClass6_Sub15_6 != null) {
			this.aClass6_Sub15_6.method7939(256);
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(BLclient!vw;)V")
	public final synchronized void method4937(@OriginalArg(1) Class6_Sub15 arg0) {
		this.aClass6_Sub15_6 = arg0;
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
	public void method4938(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "([II)V")
	private void method4940(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static480.aBoolean552) {
			local1 = 512;
		}
		Static596.method7717(arg0, 0, local1);
		this.anInt6095 -= 256;
		if (this.aClass6_Sub15_6 != null && this.anInt6095 <= 0) {
			this.anInt6095 += Static313.anInt6055 >> 4;
			Static448.method6317(this.aClass6_Sub15_6);
			this.method4943(this.aClass6_Sub15_6.method7938(), this.aClass6_Sub15_6);
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
						@Pc(88) Class6_Sub15 local88 = null;
						@Pc(93) Class6_Sub15 local93 = this.aClass6_Sub15Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class6_Sub6 local97 = local93.aClass6_Sub6_5;
								if (local97 == null || local97.anInt7690 <= local61) {
									local93.aBoolean673 = true;
									@Pc(121) int local121 = local93.method7935();
									local45 += local121;
									if (local97 != null) {
										local97.anInt7690 += local121;
									}
									if (local45 >= this.anInt6086) {
										break label103;
									}
									@Pc(140) Class6_Sub15 local140 = local93.method7934();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt9957;
										while (local140 != null) {
											this.method4943(local145 * local140.method7938() >> 8, local140);
											local140 = local93.method7937();
										}
									}
									@Pc(164) Class6_Sub15 local164 = local93.aClass6_Sub15_8;
									local93.aClass6_Sub15_8 = null;
									if (local88 == null) {
										this.aClass6_Sub15Array5[local56] = local164;
									} else {
										local88.aClass6_Sub15_8 = local164;
									}
									if (local164 == null) {
										this.aClass6_Sub15Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass6_Sub15_8;
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
				@Pc(207) Class6_Sub15 local207 = this.aClass6_Sub15Array5[local56];
				this.aClass6_Sub15Array5[local56] = this.aClass6_Sub15Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class6_Sub15 local221 = local207.aClass6_Sub15_8;
					local207.aClass6_Sub15_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt6095 < 0) {
			this.anInt6095 = 0;
		}
		if (this.aClass6_Sub15_6 != null) {
			this.aClass6_Sub15_6.method7933(arg0, 0, 256);
		}
		this.aLong146 = Static416.method5922();
	}

	@OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V")
	public final synchronized void method4941() {
		if (Static511.aClass347_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static511.aClass347_1.aClass189Array1[local7] == this) {
					Static511.aClass347_1.aClass189Array1[local7] = null;
				}
				if (Static511.aClass347_1.aClass189Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static511.aClass347_1.aBoolean668 = true;
				while (Static511.aClass347_1.aBoolean667) {
					Static183.method3079(50L);
				}
				Static511.aClass347_1 = null;
			}
		}
		this.method4942();
		this.aBoolean437 = true;
		this.anIntArray437 = null;
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "()V")
	protected void method4942() {
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(ILclient!vw;I)V")
	private void method4943(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class6_Sub15 local12 = this.aClass6_Sub15Array6[local7];
		if (local12 == null) {
			this.aClass6_Sub15Array5[local7] = arg1;
		} else {
			local12.aClass6_Sub15_8 = arg1;
		}
		this.aClass6_Sub15Array6[local7] = arg1;
		arg1.anInt9957 = arg0;
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "()V")
	protected void method4944() throws Exception {
	}

	@OriginalMember(owner = "client!un", name = "c", descriptor = "(I)V")
	public final synchronized void method4945() {
		if (this.aBoolean437) {
			return;
		}
		@Pc(12) long local12 = Static416.method5922();
		try {
			if (local12 > this.aLong146 + 500000L) {
				this.aLong146 = local12 - 500000L;
			}
			while (local12 > this.aLong146 + 5000L) {
				this.method4936();
				this.aLong146 += 256000 / Static313.anInt6055;
			}
		} catch (@Pc(52) Exception local52) {
			this.aLong146 = local12;
		}
		if (this.anIntArray437 == null) {
			return;
		}
		try {
			if (this.aLong148 != 0L) {
				if (this.aLong148 > local12) {
					return;
				}
				this.method4938(this.anInt6092);
				this.aLong148 = 0L;
				this.aBoolean438 = true;
			}
			@Pc(91) int local91 = this.method4934();
			if (this.anInt6089 < this.anInt6093 - local91) {
				this.anInt6089 = this.anInt6093 - local91;
			}
			@Pc(111) int local111 = this.anInt6096 + this.anInt6091;
			if (local111 + 256 > 16384) {
				local111 = 16128;
			}
			if (this.anInt6092 < local111 + 256) {
				this.anInt6092 += 1024;
				if (this.anInt6092 > 16384) {
					this.anInt6092 = 16384;
				}
				this.method4942();
				this.method4938(this.anInt6092);
				local91 = 0;
				this.aBoolean438 = true;
				if (this.anInt6092 < local111 + 256) {
					local111 = this.anInt6092 - 256;
					this.anInt6096 = local111 - this.anInt6091;
				}
			}
			while (local111 > local91) {
				this.method4940(this.anIntArray437);
				this.method4935();
				local91 += 256;
			}
			if (this.aLong147 < local12) {
				if (this.aBoolean438) {
					this.aBoolean438 = false;
				} else if (this.anInt6089 == 0 && this.anInt6090 == 0) {
					this.method4942();
					this.aLong148 = local12 + 2000L;
					return;
				} else {
					this.anInt6096 = Math.min(this.anInt6090, this.anInt6089);
					this.anInt6090 = this.anInt6089;
				}
				this.anInt6089 = 0;
				this.aLong147 = local12 + 2000L;
			}
			this.anInt6093 = local91;
		} catch (@Pc(245) Exception local245) {
			this.method4942();
			this.aLong148 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!un", name = "d", descriptor = "(I)V")
	public final synchronized void method4946() {
		this.aBoolean438 = true;
		try {
			this.method4944();
		} catch (@Pc(17) Exception local17) {
			this.method4942();
			this.aLong148 = Static416.method5922() + 2000L;
		}
	}

	@OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method4947(@OriginalArg(0) Component arg0) throws Exception {
	}
}
