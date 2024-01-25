import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gq")
public class Class89 {

	@OriginalMember(owner = "client!gq", name = "g", descriptor = "[I")
	public int[] anIntArray573;

	@OriginalMember(owner = "client!gq", name = "x", descriptor = "Lclient!rk;")
	private Class2_Sub11 aClass2_Sub11_8;

	@OriginalMember(owner = "client!gq", name = "B", descriptor = "I")
	private int anInt6777;

	@OriginalMember(owner = "client!gq", name = "E", descriptor = "I")
	public int anInt6779;

	@OriginalMember(owner = "client!gq", name = "F", descriptor = "I")
	public int anInt6780;

	@OriginalMember(owner = "client!gq", name = "o", descriptor = "I")
	private final int anInt6769 = 32;

	@OriginalMember(owner = "client!gq", name = "w", descriptor = "Z")
	private boolean aBoolean477 = false;

	@OriginalMember(owner = "client!gq", name = "q", descriptor = "J")
	private long aLong196 = Static101.method1805();

	@OriginalMember(owner = "client!gq", name = "z", descriptor = "I")
	private int anInt6775 = 0;

	@OriginalMember(owner = "client!gq", name = "y", descriptor = "Z")
	private boolean aBoolean478 = true;

	@OriginalMember(owner = "client!gq", name = "A", descriptor = "I")
	private int anInt6776 = 0;

	@OriginalMember(owner = "client!gq", name = "D", descriptor = "I")
	private int anInt6778 = 0;

	@OriginalMember(owner = "client!gq", name = "H", descriptor = "J")
	private long aLong198 = 0L;

	@OriginalMember(owner = "client!gq", name = "G", descriptor = "J")
	private long aLong197 = 0L;

	@OriginalMember(owner = "client!gq", name = "J", descriptor = "[Lclient!rk;")
	private final Class2_Sub11[] aClass2_Sub11Array6 = new Class2_Sub11[8];

	@OriginalMember(owner = "client!gq", name = "I", descriptor = "[Lclient!rk;")
	private final Class2_Sub11[] aClass2_Sub11Array5 = new Class2_Sub11[8];

	@OriginalMember(owner = "client!gq", name = "K", descriptor = "I")
	private int anInt6781 = 0;

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(BLclient!rk;I)V")
	private void method5852(@OriginalArg(1) Class2_Sub11 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 >> 5;
		@Pc(18) Class2_Sub11 local18 = this.aClass2_Sub11Array6[local13];
		if (local18 == null) {
			this.aClass2_Sub11Array5[local13] = arg0;
		} else {
			local18.aClass2_Sub11_6 = arg0;
		}
		this.aClass2_Sub11Array6[local13] = arg0;
		arg0.anInt5555 = arg1;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(B)V")
	public final synchronized void method5853() {
		if (this.aBoolean477) {
			return;
		}
		@Pc(14) long local14 = Static101.method1805();
		try {
			if (this.aLong196 + 500000L < local14) {
				this.aLong196 = local14 - 500000L;
			}
			while (this.aLong196 + 5000L < local14) {
				this.method5859();
				this.aLong196 += 256000 / Static392.anInt7144;
			}
		} catch (@Pc(54) Exception local54) {
			this.aLong196 = local14;
		}
		if (this.anIntArray573 == null) {
			return;
		}
		try {
			if (this.aLong198 != 0L) {
				if (local14 < this.aLong198) {
					return;
				}
				this.method5868(this.anInt6780);
				this.aBoolean478 = true;
				this.aLong198 = 0L;
			}
			@Pc(87) int local87 = this.method5854();
			if (this.anInt6778 < this.anInt6776 - local87) {
				this.anInt6778 = this.anInt6776 - local87;
			}
			@Pc(108) int local108 = this.anInt6777 + this.anInt6779;
			if (local108 + 256 > 16384) {
				local108 = 16128;
			}
			if (this.anInt6780 < local108 + 256) {
				this.anInt6780 += 1024;
				if (this.anInt6780 > 16384) {
					this.anInt6780 = 16384;
				}
				this.method5855();
				local87 = 0;
				this.method5868(this.anInt6780);
				this.aBoolean478 = true;
				if (this.anInt6780 < local108 + 256) {
					local108 = this.anInt6780 - 256;
					this.anInt6777 = local108 - this.anInt6779;
				}
			}
			while (local87 < local108) {
				this.method5858(this.anIntArray573);
				local87 += 256;
				this.method5857();
			}
			if (this.aLong197 < local14) {
				if (this.aBoolean478) {
					this.aBoolean478 = false;
				} else if (this.anInt6778 == 0 && this.anInt6775 == 0) {
					this.method5855();
					this.aLong198 = local14 + 2000L;
					return;
				} else {
					this.anInt6777 = Math.min(this.anInt6775, this.anInt6778);
					this.anInt6775 = this.anInt6778;
				}
				this.anInt6778 = 0;
				this.aLong197 = local14 + 2000L;
			}
			this.anInt6776 = local87;
		} catch (@Pc(245) Exception local245) {
			this.method5855();
			this.aLong198 = local14 + 2000L;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "()I")
	protected int method5854() throws Exception {
		return this.anInt6780;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "()V")
	protected void method5855() {
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "()V")
	protected void method5857() throws Exception {
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "([II)V")
	private void method5858(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static291.aBoolean399) {
			local1 = 512;
		}
		Static394.method2441(arg0, 0, local1);
		this.anInt6781 -= 256;
		if (this.aClass2_Sub11_8 != null && this.anInt6781 <= 0) {
			this.anInt6781 += Static392.anInt7144 >> 4;
			Static214.method3837(this.aClass2_Sub11_8);
			this.method5852(this.aClass2_Sub11_8, this.aClass2_Sub11_8.method4873());
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
						@Pc(88) Class2_Sub11 local88 = null;
						@Pc(93) Class2_Sub11 local93 = this.aClass2_Sub11Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class2_Sub20 local97 = local93.aClass2_Sub20_5;
								if (local97 == null || local97.anInt3403 <= local61) {
									local93.aBoolean410 = true;
									@Pc(121) int local121 = local93.method4876();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3403 += local121;
									}
									if (local45 >= this.anInt6769) {
										break label103;
									}
									@Pc(140) Class2_Sub11 local140 = local93.method4871();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt5555;
										while (local140 != null) {
											this.method5852(local140, local145 * local140.method4873() >> 8);
											local140 = local93.method4872();
										}
									}
									@Pc(164) Class2_Sub11 local164 = local93.aClass2_Sub11_6;
									local93.aClass2_Sub11_6 = null;
									if (local88 == null) {
										this.aClass2_Sub11Array5[local56] = local164;
									} else {
										local88.aClass2_Sub11_6 = local164;
									}
									if (local164 == null) {
										this.aClass2_Sub11Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass2_Sub11_6;
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
				@Pc(207) Class2_Sub11 local207 = this.aClass2_Sub11Array5[local56];
				this.aClass2_Sub11Array5[local56] = this.aClass2_Sub11Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class2_Sub11 local221 = local207.aClass2_Sub11_6;
					local207.aClass2_Sub11_6 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt6781 < 0) {
			this.anInt6781 = 0;
		}
		if (this.aClass2_Sub11_8 != null) {
			this.aClass2_Sub11_8.method4877(arg0, 0, 256);
		}
		this.aLong196 = Static101.method1805();
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(IB)V")
	private void method5859() {
		this.anInt6781 -= 256;
		if (this.anInt6781 < 0) {
			this.anInt6781 = 0;
		}
		if (this.aClass2_Sub11_8 != null) {
			this.aClass2_Sub11_8.method4875(256);
		}
	}

	@OriginalMember(owner = "client!gq", name = "d", descriptor = "()V")
	protected void method5860() throws Exception {
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V")
	public final synchronized void method5863() {
		if (Static178.aClass46_1 != null) {
			@Pc(5) boolean local5 = true;
			for (@Pc(7) int local7 = 0; local7 < 2; local7++) {
				if (Static178.aClass46_1.aClass89Array1[local7] == this) {
					Static178.aClass46_1.aClass89Array1[local7] = null;
				}
				if (Static178.aClass46_1.aClass89Array1[local7] != null) {
					local5 = false;
				}
			}
			if (local5) {
				Static178.aClass46_1.aBoolean91 = true;
				while (Static178.aClass46_1.aBoolean90) {
					Static215.method3855(50L);
				}
				Static178.aClass46_1 = null;
			}
		}
		this.method5855();
		this.aBoolean477 = true;
		this.anIntArray573 = null;
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lclient!rk;B)V")
	public final synchronized void method5864(@OriginalArg(0) Class2_Sub11 arg0) {
		this.aClass2_Sub11_8 = arg0;
	}

	@OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V")
	public final synchronized void method5865() {
		this.aBoolean478 = true;
		try {
			this.method5860();
		} catch (@Pc(14) Exception local14) {
			this.method5855();
			this.aLong198 = Static101.method1805() + 2000L;
		}
	}

	@OriginalMember(owner = "client!gq", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5866(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(B)V")
	public final void method5867() {
		this.aBoolean478 = true;
	}

	@OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)V")
	public void method5868(@OriginalArg(0) int arg0) throws Exception {
	}
}
