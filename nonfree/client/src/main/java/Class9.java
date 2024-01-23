import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public class Class9 {

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "[I")
	public int[] anIntArray562;

	@OriginalMember(owner = "client!bi", name = "h", descriptor = "Lclient!ba;")
	private Class1_Sub3 aClass1_Sub3_8;

	@OriginalMember(owner = "client!bi", name = "D", descriptor = "I")
	private int anInt5578;

	@OriginalMember(owner = "client!bi", name = "K", descriptor = "I")
	public int anInt5582;

	@OriginalMember(owner = "client!bi", name = "L", descriptor = "I")
	public int anInt5583;

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "I")
	private int anInt5558 = 32;

	@OriginalMember(owner = "client!bi", name = "w", descriptor = "Z")
	private boolean aBoolean294 = false;

	@OriginalMember(owner = "client!bi", name = "i", descriptor = "J")
	private long aLong184 = Static294.method4792();

	@OriginalMember(owner = "client!bi", name = "B", descriptor = "J")
	private long aLong185 = 0L;

	@OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
	private int anInt5581 = 0;

	@OriginalMember(owner = "client!bi", name = "G", descriptor = "Z")
	private boolean aBoolean295 = true;

	@OriginalMember(owner = "client!bi", name = "F", descriptor = "I")
	private int anInt5580 = 0;

	@OriginalMember(owner = "client!bi", name = "J", descriptor = "[Lclient!ba;")
	private Class1_Sub3[] aClass1_Sub3Array6 = new Class1_Sub3[8];

	@OriginalMember(owner = "client!bi", name = "N", descriptor = "J")
	private long aLong186 = 0L;

	@OriginalMember(owner = "client!bi", name = "E", descriptor = "I")
	private int anInt5579 = 0;

	@OriginalMember(owner = "client!bi", name = "M", descriptor = "I")
	private int anInt5584 = 0;

	@OriginalMember(owner = "client!bi", name = "H", descriptor = "[Lclient!ba;")
	private Class1_Sub3[] aClass1_Sub3Array5 = new Class1_Sub3[8];

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "()V")
	protected void method4335() throws Exception {
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "()V")
	protected void method4336() {
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(I)V")
	public final synchronized void method4337() {
		this.aBoolean295 = true;
		try {
			this.method4335();
		} catch (@Pc(18) Exception local18) {
			this.method4336();
			this.aLong186 = Static294.method4792() + 2000L;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)V")
	private void method4338() {
		this.anInt5580 -= 256;
		if (this.anInt5580 < 0) {
			this.anInt5580 = 0;
		}
		if (this.aClass1_Sub3_8 != null) {
			this.aClass1_Sub3_8.method2539(256);
		}
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "()V")
	protected void method4339() throws Exception {
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(B)V")
	public final synchronized void method4340() {
		if (this.aBoolean294) {
			return;
		}
		@Pc(12) long local12 = Static294.method4792();
		try {
			if (local12 > this.aLong184 + 500000L) {
				this.aLong184 = local12 - 500000L;
			}
			while (local12 > this.aLong184 + 5000L) {
				this.method4338();
				this.aLong184 += 256000 / Static43.anInt1255;
			}
		} catch (@Pc(57) Exception local57) {
			this.aLong184 = local12;
		}
		if (this.anIntArray562 == null) {
			return;
		}
		try {
			if (this.aLong186 != 0L) {
				if (local12 < this.aLong186) {
					return;
				}
				this.method4343(this.anInt5582);
				this.aBoolean295 = true;
				this.aLong186 = 0L;
			}
			@Pc(93) int local93 = this.method4349();
			@Pc(99) int local99 = this.anInt5578 + this.anInt5583;
			if (local99 + 256 > 16384) {
				local99 = 16128;
			}
			if (this.anInt5584 - local93 > this.anInt5581) {
				this.anInt5581 = this.anInt5584 - local93;
			}
			if (local99 + 256 > this.anInt5582) {
				this.anInt5582 += 1024;
				local93 = 0;
				if (this.anInt5582 > 16384) {
					this.anInt5582 = 16384;
				}
				this.method4336();
				this.method4343(this.anInt5582);
				this.aBoolean295 = true;
				if (local99 + 256 > this.anInt5582) {
					local99 = this.anInt5582 - 256;
					this.anInt5578 = local99 - this.anInt5583;
				}
			}
			while (local99 > local93) {
				this.method4348(this.anIntArray562);
				this.method4339();
				local93 += 256;
			}
			if (this.aLong185 < local12) {
				if (this.aBoolean295) {
					this.aBoolean295 = false;
				} else if (this.anInt5581 == 0 && this.anInt5579 == 0) {
					this.method4336();
					this.aLong186 = local12 + 2000L;
					return;
				} else {
					this.anInt5578 = Math.min(this.anInt5579, this.anInt5581);
					this.anInt5579 = this.anInt5581;
				}
				this.anInt5581 = 0;
				this.aLong185 = local12 + 2000L;
			}
			this.anInt5584 = local93;
		} catch (@Pc(256) Exception local256) {
			this.method4336();
			this.aLong186 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V")
	public final void method4341() {
		this.aBoolean295 = true;
	}

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "(I)V")
	public void method4343(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method4344(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!ba;B)V")
	public final synchronized void method4346(@OriginalArg(0) Class1_Sub3 arg0) {
		this.aClass1_Sub3_8 = arg0;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "([II)V")
	private void method4348(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static199.aBoolean240) {
			local1 = 512;
		}
		Static302.method1375(arg0, 0, local1);
		this.anInt5580 -= 256;
		if (this.aClass1_Sub3_8 != null && this.anInt5580 <= 0) {
			this.anInt5580 += Static43.anInt1255 >> 4;
			Static247.method4246(this.aClass1_Sub3_8);
			this.method4350(this.aClass1_Sub3_8, this.aClass1_Sub3_8.method2538());
			@Pc(45) int local45 = 0;
			@Pc(47) int local47 = 255;
			@Pc(49) int local49 = 7;
			label106: while (local47 != 0) {
				@Pc(57) int local57;
				@Pc(62) int local62;
				if (local49 < 0) {
					local57 = local49 & 0x3;
					local62 = -(local49 >> 2);
				} else {
					local57 = local49;
					local62 = 0;
				}
				for (@Pc(73) int local73 = local47 >>> local57 & 0x11111111; local73 != 0; local73 >>>= 0x4) {
					if ((local73 & 0x1) != 0) {
						local47 &= ~(0x1 << local57);
						@Pc(91) Class1_Sub3 local91 = null;
						@Pc(96) Class1_Sub3 local96 = this.aClass1_Sub3Array5[local57];
						label100: while (true) {
							while (true) {
								if (local96 == null) {
									break label100;
								}
								@Pc(101) Class1_Sub4 local101 = local96.aClass1_Sub4_5;
								if (local101 == null || local101.anInt4838 <= local62) {
									local96.aBoolean169 = true;
									@Pc(125) int local125 = local96.method2541();
									local45 += local125;
									if (local101 != null) {
										local101.anInt4838 += local125;
									}
									if (local45 >= this.anInt5558) {
										break label106;
									}
									@Pc(145) Class1_Sub3 local145 = local96.method2543();
									if (local145 != null) {
										@Pc(150) int local150 = local96.anInt3261;
										while (local145 != null) {
											this.method4350(local145, local150 * local145.method2538() >> 8);
											local145 = local96.method2542();
										}
									}
									@Pc(169) Class1_Sub3 local169 = local96.aClass1_Sub3_7;
									local96.aClass1_Sub3_7 = null;
									if (local91 == null) {
										this.aClass1_Sub3Array5[local57] = local169;
									} else {
										local91.aClass1_Sub3_7 = local169;
									}
									if (local169 == null) {
										this.aClass1_Sub3Array6[local57] = local91;
									}
									local96 = local169;
								} else {
									local47 |= 0x1 << local57;
									local91 = local96;
									local96 = local96.aClass1_Sub3_7;
								}
							}
						}
					}
					local57 += 4;
					local62++;
				}
				local49--;
			}
			for (local49 = 0; local49 < 8; local49++) {
				@Pc(212) Class1_Sub3 local212 = this.aClass1_Sub3Array5[local49];
				this.aClass1_Sub3Array5[local49] = this.aClass1_Sub3Array6[local49] = null;
				while (local212 != null) {
					@Pc(227) Class1_Sub3 local227 = local212.aClass1_Sub3_7;
					local212.aClass1_Sub3_7 = null;
					local212 = local227;
				}
			}
		}
		if (this.anInt5580 < 0) {
			this.anInt5580 = 0;
		}
		if (this.aClass1_Sub3_8 != null) {
			this.aClass1_Sub3_8.method2540(arg0, 0, 256);
		}
		this.aLong184 = Static294.method4792();
	}

	@OriginalMember(owner = "client!bi", name = "d", descriptor = "()I")
	protected int method4349() throws Exception {
		return this.anInt5582;
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!ba;II)V")
	private void method4350(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = arg1 >> 5;
		@Pc(18) Class1_Sub3 local18 = this.aClass1_Sub3Array6[local3];
		if (local18 == null) {
			this.aClass1_Sub3Array5[local3] = arg0;
		} else {
			local18.aClass1_Sub3_7 = arg0;
		}
		this.aClass1_Sub3Array6[local3] = arg0;
		arg0.anInt3261 = arg1;
	}

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)V")
	public final synchronized void method4352() {
		if (Static224.aClass60_1 != null) {
			@Pc(7) boolean local7 = true;
			for (@Pc(9) int local9 = 0; local9 < 2; local9++) {
				if (Static224.aClass60_1.aClass9Array1[local9] == this) {
					Static224.aClass60_1.aClass9Array1[local9] = null;
				}
				if (Static224.aClass60_1.aClass9Array1[local9] != null) {
					local7 = false;
				}
			}
			if (local7) {
				Static224.aClass60_1.aBoolean107 = true;
				while (Static224.aClass60_1.aBoolean106) {
					Static230.method4022(50L);
				}
				Static224.aClass60_1 = null;
			}
		}
		this.method4336();
		this.aBoolean294 = true;
		this.anIntArray562 = null;
	}
}
