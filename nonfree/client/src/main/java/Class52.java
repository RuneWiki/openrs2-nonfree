import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vi")
public class Class52 {

	@OriginalMember(owner = "client!vi", name = "f", descriptor = "[I")
	public int[] anIntArray462;

	@OriginalMember(owner = "client!vi", name = "k", descriptor = "Lclient!an;")
	private Class1_Sub5 aClass1_Sub5_6;

	@OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
	public int anInt5262;

	@OriginalMember(owner = "client!vi", name = "H", descriptor = "I")
	public int anInt5270;

	@OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
	private int anInt5271;

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "I")
	private int anInt5250 = 32;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "Z")
	private boolean aBoolean391 = false;

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "J")
	private long aLong186 = Static294.method4413();

	@OriginalMember(owner = "client!vi", name = "s", descriptor = "I")
	private int anInt5260 = 0;

	@OriginalMember(owner = "client!vi", name = "t", descriptor = "[Lclient!an;")
	private Class1_Sub5[] aClass1_Sub5Array5 = new Class1_Sub5[8];

	@OriginalMember(owner = "client!vi", name = "B", descriptor = "J")
	private long aLong187 = 0L;

	@OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
	private int anInt5261 = 0;

	@OriginalMember(owner = "client!vi", name = "D", descriptor = "J")
	private long aLong188 = 0L;

	@OriginalMember(owner = "client!vi", name = "w", descriptor = "[Lclient!an;")
	private Class1_Sub5[] aClass1_Sub5Array6 = new Class1_Sub5[8];

	@OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
	private int anInt5269 = 0;

	@OriginalMember(owner = "client!vi", name = "E", descriptor = "I")
	private int anInt5267 = 0;

	@OriginalMember(owner = "client!vi", name = "I", descriptor = "Z")
	private boolean aBoolean392 = true;

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "([II)V")
	private void method4068(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static166.aBoolean261) {
			local1 = 512;
		}
		Static304.method2605(arg0, 0, local1);
		this.anInt5267 -= 256;
		if (this.aClass1_Sub5_6 != null && this.anInt5267 <= 0) {
			this.anInt5267 += Static13.anInt256 >> 4;
			Static152.method2617(this.aClass1_Sub5_6);
			this.method4070(this.aClass1_Sub5_6, this.aClass1_Sub5_6.method4371());
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
						@Pc(91) Class1_Sub5 local91 = null;
						@Pc(96) Class1_Sub5 local96 = this.aClass1_Sub5Array5[local57];
						label100: while (true) {
							while (true) {
								if (local96 == null) {
									break label100;
								}
								@Pc(101) Class1_Sub10 local101 = local96.aClass1_Sub10_5;
								if (local101 == null || local101.anInt647 <= local62) {
									local96.aBoolean433 = true;
									@Pc(125) int local125 = local96.method4373();
									local45 += local125;
									if (local101 != null) {
										local101.anInt647 += local125;
									}
									if (local45 >= this.anInt5250) {
										break label106;
									}
									@Pc(145) Class1_Sub5 local145 = local96.method4370();
									if (local145 != null) {
										@Pc(150) int local150 = local96.anInt5510;
										while (local145 != null) {
											this.method4070(local145, local150 * local145.method4371() >> 8);
											local145 = local96.method4375();
										}
									}
									@Pc(169) Class1_Sub5 local169 = local96.aClass1_Sub5_8;
									local96.aClass1_Sub5_8 = null;
									if (local91 == null) {
										this.aClass1_Sub5Array5[local57] = local169;
									} else {
										local91.aClass1_Sub5_8 = local169;
									}
									if (local169 == null) {
										this.aClass1_Sub5Array6[local57] = local91;
									}
									local96 = local169;
								} else {
									local47 |= 0x1 << local57;
									local91 = local96;
									local96 = local96.aClass1_Sub5_8;
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
				@Pc(212) Class1_Sub5 local212 = this.aClass1_Sub5Array5[local49];
				this.aClass1_Sub5Array5[local49] = this.aClass1_Sub5Array6[local49] = null;
				while (local212 != null) {
					@Pc(227) Class1_Sub5 local227 = local212.aClass1_Sub5_8;
					local212.aClass1_Sub5_8 = null;
					local212 = local227;
				}
			}
		}
		if (this.anInt5267 < 0) {
			this.anInt5267 = 0;
		}
		if (this.aClass1_Sub5_6 != null) {
			this.aClass1_Sub5_6.method4374(arg0, 0, 256);
		}
		this.aLong186 = Static294.method4413();
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "()I")
	protected int method4069() throws Exception {
		return this.anInt5270;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lclient!an;II)V")
	private void method4070(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = arg1 >> 5;
		@Pc(12) Class1_Sub5 local12 = this.aClass1_Sub5Array6[local7];
		if (local12 == null) {
			this.aClass1_Sub5Array5[local7] = arg0;
		} else {
			local12.aClass1_Sub5_8 = arg0;
		}
		this.aClass1_Sub5Array6[local7] = arg0;
		arg0.anInt5510 = arg1;
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "()V")
	protected void method4071() {
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "()V")
	protected void method4073() throws Exception {
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(II)V")
	private void method4074() {
		this.anInt5267 -= 256;
		if (this.anInt5267 < 0) {
			this.anInt5267 = 0;
		}
		if (this.aClass1_Sub5_6 != null) {
			this.aClass1_Sub5_6.method4372(256);
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)V")
	public final synchronized void method4075() {
		this.aBoolean392 = true;
		try {
			this.method4073();
		} catch (@Pc(16) Exception local16) {
			this.method4071();
			this.aLong187 = Static294.method4413() + 2000L;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)V")
	public final synchronized void method4077() {
		if (this.aBoolean391) {
			return;
		}
		@Pc(12) long local12 = Static294.method4413();
		try {
			if (local12 > this.aLong186 + 500000L) {
				this.aLong186 = local12 - 500000L;
			}
			while (local12 > this.aLong186 + 5000L) {
				this.method4074();
				this.aLong186 += 256000 / Static13.anInt256;
			}
		} catch (@Pc(53) Exception local53) {
			this.aLong186 = local12;
		}
		if (this.anIntArray462 == null) {
			return;
		}
		try {
			if (this.aLong187 != 0L) {
				if (this.aLong187 > local12) {
					return;
				}
				this.method4082(this.anInt5270);
				this.aBoolean392 = true;
				this.aLong187 = 0L;
			}
			@Pc(94) int local94 = this.method4069();
			if (this.anInt5260 < this.anInt5261 - local94) {
				this.anInt5260 = this.anInt5261 - local94;
			}
			@Pc(120) int local120 = this.anInt5262 + this.anInt5271;
			if (local120 + 256 > 16384) {
				local120 = 16128;
			}
			if (local120 + 256 > this.anInt5270) {
				local94 = 0;
				this.anInt5270 += 1024;
				if (this.anInt5270 > 16384) {
					this.anInt5270 = 16384;
				}
				this.method4071();
				this.method4082(this.anInt5270);
				if (local120 + 256 > this.anInt5270) {
					local120 = this.anInt5270 - 256;
					this.anInt5271 = local120 - this.anInt5262;
				}
				this.aBoolean392 = true;
			}
			while (local94 < local120) {
				local94 += 256;
				this.method4068(this.anIntArray462);
				this.method4081();
			}
			if (local12 > this.aLong188) {
				if (this.aBoolean392) {
					this.aBoolean392 = false;
				} else if (this.anInt5260 == 0 && this.anInt5269 == 0) {
					this.method4071();
					this.aLong187 = local12 + 2000L;
					return;
				} else {
					this.anInt5271 = Math.min(this.anInt5269, this.anInt5260);
					this.anInt5269 = this.anInt5260;
				}
				this.anInt5260 = 0;
				this.aLong188 = local12 + 2000L;
			}
			this.anInt5261 = local94;
		} catch (@Pc(254) Exception local254) {
			this.method4071();
			this.aLong187 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(ZLclient!an;)V")
	public final synchronized void method4078(@OriginalArg(1) Class1_Sub5 arg0) {
		this.aClass1_Sub5_6 = arg0;
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method4079(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!vi", name = "c", descriptor = "(B)V")
	public final void method4080() {
		this.aBoolean392 = true;
	}

	@OriginalMember(owner = "client!vi", name = "d", descriptor = "()V")
	protected void method4081() throws Exception {
	}

	@OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)V")
	public void method4082(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)V")
	public final synchronized void method4083() {
		if (Static1.aClass104_2 != null) {
			@Pc(10) boolean local10 = true;
			for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
				if (Static1.aClass104_2.aClass52Array1[local12] == this) {
					Static1.aClass104_2.aClass52Array1[local12] = null;
				}
				if (Static1.aClass104_2.aClass52Array1[local12] != null) {
					local10 = false;
				}
			}
			if (local10) {
				Static1.aClass104_2.aBoolean254 = true;
				while (Static1.aClass104_2.aBoolean253) {
					Static48.method934(50L);
				}
				Static1.aClass104_2 = null;
			}
		}
		this.method4071();
		this.aBoolean391 = true;
		this.anIntArray462 = null;
	}
}
