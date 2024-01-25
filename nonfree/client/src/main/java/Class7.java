import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uc")
public class Class7 {

	@OriginalMember(owner = "client!uc", name = "j", descriptor = "[I")
	public int[] anIntArray527;

	@OriginalMember(owner = "client!uc", name = "l", descriptor = "Lclient!tf;")
	private Class1_Sub1 aClass1_Sub1_8;

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
	private int anInt6628;

	@OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
	public int anInt6631;

	@OriginalMember(owner = "client!uc", name = "I", descriptor = "I")
	public int anInt6632;

	@OriginalMember(owner = "client!uc", name = "e", descriptor = "Z")
	private boolean aBoolean652 = false;

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
	private final int anInt6623 = 32;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "J")
	private long aLong205 = Static162.method3252();

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
	private int anInt6626 = 0;

	@OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
	private int anInt6629 = 0;

	@OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
	private int anInt6630 = 0;

	@OriginalMember(owner = "client!uc", name = "C", descriptor = "J")
	private long aLong206 = 0L;

	@OriginalMember(owner = "client!uc", name = "x", descriptor = "[Lclient!tf;")
	private final Class1_Sub1[] aClass1_Sub1Array5 = new Class1_Sub1[8];

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "J")
	private long aLong207 = 0L;

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
	private int anInt6627 = 0;

	@OriginalMember(owner = "client!uc", name = "H", descriptor = "[Lclient!tf;")
	private final Class1_Sub1[] aClass1_Sub1Array6 = new Class1_Sub1[8];

	@OriginalMember(owner = "client!uc", name = "G", descriptor = "Z")
	private boolean aBoolean653 = true;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILclient!tf;)V")
	private void method5543(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(16) Class1_Sub1 local16 = this.aClass1_Sub1Array6[local7];
		if (local16 == null) {
			this.aClass1_Sub1Array5[local7] = arg1;
		} else {
			local16.aClass1_Sub1_7 = arg1;
		}
		this.aClass1_Sub1Array6[local7] = arg1;
		arg1.anInt5884 = arg0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
	public void method5544(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "()I")
	protected int method5546() throws Exception {
		return this.anInt6631;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "()V")
	protected void method5547() throws Exception {
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
	public final synchronized void method5548() {
		if (Static73.aClass37_1 != null) {
			@Pc(15) boolean local15 = true;
			for (@Pc(17) int local17 = 0; local17 < 2; local17++) {
				if (Static73.aClass37_1.aClass7Array1[local17] == this) {
					Static73.aClass37_1.aClass7Array1[local17] = null;
				}
				if (Static73.aClass37_1.aClass7Array1[local17] != null) {
					local15 = false;
				}
			}
			if (local15) {
				Static73.aClass37_1.aBoolean148 = true;
				while (Static73.aClass37_1.aBoolean149) {
					Static190.method3690(50L);
				}
				Static73.aClass37_1 = null;
			}
		}
		this.method5550();
		this.anIntArray527 = null;
		this.aBoolean652 = true;
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "()V")
	protected void method5550() {
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)V")
	private void method5552() {
		this.anInt6629 -= 256;
		if (this.anInt6629 < 0) {
			this.anInt6629 = 0;
		}
		if (this.aClass1_Sub1_8 != null) {
			this.aClass1_Sub1_8.method5034(256);
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method5554(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!tf;I)V")
	public final synchronized void method5555(@OriginalArg(0) Class1_Sub1 arg0) {
		this.aClass1_Sub1_8 = arg0;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "([II)V")
	private void method5556(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static330.aBoolean615) {
			local1 = 512;
		}
		Static361.method1336(arg0, 0, local1);
		this.anInt6629 -= 256;
		if (this.aClass1_Sub1_8 != null && this.anInt6629 <= 0) {
			this.anInt6629 += Static38.anInt1250 >> 4;
			Static147.method2936(this.aClass1_Sub1_8);
			this.method5543(this.aClass1_Sub1_8.method5030(), this.aClass1_Sub1_8);
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
						@Pc(88) Class1_Sub1 local88 = null;
						@Pc(93) Class1_Sub1 local93 = this.aClass1_Sub1Array5[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class1_Sub15 local97 = local93.aClass1_Sub15_5;
								if (local97 == null || local97.anInt6344 <= local61) {
									local93.aBoolean566 = true;
									@Pc(121) int local121 = local93.method5031();
									local45 += local121;
									if (local97 != null) {
										local97.anInt6344 += local121;
									}
									if (local45 >= this.anInt6623) {
										break label103;
									}
									@Pc(140) Class1_Sub1 local140 = local93.method5029();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt5884;
										while (local140 != null) {
											this.method5543(local145 * local140.method5030() >> 8, local140);
											local140 = local93.method5033();
										}
									}
									@Pc(164) Class1_Sub1 local164 = local93.aClass1_Sub1_7;
									local93.aClass1_Sub1_7 = null;
									if (local88 == null) {
										this.aClass1_Sub1Array5[local56] = local164;
									} else {
										local88.aClass1_Sub1_7 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub1Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub1_7;
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
				@Pc(207) Class1_Sub1 local207 = this.aClass1_Sub1Array5[local56];
				this.aClass1_Sub1Array5[local56] = this.aClass1_Sub1Array6[local56] = null;
				while (local207 != null) {
					@Pc(221) Class1_Sub1 local221 = local207.aClass1_Sub1_7;
					local207.aClass1_Sub1_7 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt6629 < 0) {
			this.anInt6629 = 0;
		}
		if (this.aClass1_Sub1_8 != null) {
			this.aClass1_Sub1_8.method5028(arg0, 0, 256);
		}
		this.aLong205 = Static162.method3252();
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "()V")
	protected void method5557() throws Exception {
	}

	@OriginalMember(owner = "client!uc", name = "c", descriptor = "(B)V")
	public final synchronized void method5558() {
		this.aBoolean653 = true;
		try {
			this.method5557();
		} catch (@Pc(14) Exception local14) {
			this.method5550();
			this.aLong207 = Static162.method3252() + 2000L;
		}
	}

	@OriginalMember(owner = "client!uc", name = "d", descriptor = "(B)V")
	public final void method5559() {
		this.aBoolean653 = true;
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(I)V")
	public final synchronized void method5560() {
		if (this.aBoolean652) {
			return;
		}
		@Pc(18) long local18 = Static162.method3252();
		try {
			if (local18 > this.aLong205 + 500000L) {
				this.aLong205 = local18 - 500000L;
			}
			while (this.aLong205 + 5000L < local18) {
				this.method5552();
				this.aLong205 += 256000 / Static38.anInt1250;
			}
		} catch (@Pc(64) Exception local64) {
			this.aLong205 = local18;
		}
		if (this.anIntArray527 == null) {
			return;
		}
		try {
			if (this.aLong207 != 0L) {
				if (local18 < this.aLong207) {
					return;
				}
				this.method5544(this.anInt6631);
				this.aLong207 = 0L;
				this.aBoolean653 = true;
			}
			@Pc(99) int local99 = this.method5546();
			if (this.anInt6626 - local99 > this.anInt6630) {
				this.anInt6630 = this.anInt6626 - local99;
			}
			@Pc(120) int local120 = this.anInt6628 + this.anInt6632;
			if (local120 + 256 > 16384) {
				local120 = 16128;
			}
			if (local120 + 256 > this.anInt6631) {
				this.anInt6631 += 1024;
				if (this.anInt6631 > 16384) {
					this.anInt6631 = 16384;
				}
				this.method5550();
				local99 = 0;
				this.method5544(this.anInt6631);
				this.aBoolean653 = true;
				if (local120 + 256 > this.anInt6631) {
					local120 = this.anInt6631 - 256;
					this.anInt6628 = local120 - this.anInt6632;
				}
			}
			while (local120 > local99) {
				this.method5556(this.anIntArray527);
				this.method5547();
				local99 += 256;
			}
			if (local18 > this.aLong206) {
				if (this.aBoolean653) {
					this.aBoolean653 = false;
				} else if (this.anInt6630 == 0 && this.anInt6627 == 0) {
					this.method5550();
					this.aLong207 = local18 + 2000L;
					return;
				} else {
					this.anInt6628 = Math.min(this.anInt6627, this.anInt6630);
					this.anInt6627 = this.anInt6630;
				}
				this.anInt6630 = 0;
				this.aLong206 = local18 + 2000L;
			}
			this.anInt6626 = local99;
		} catch (@Pc(248) Exception local248) {
			this.method5550();
			this.aLong207 = local18 + 2000L;
		}
	}
}
