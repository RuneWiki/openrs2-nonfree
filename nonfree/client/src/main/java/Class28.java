import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tj")
public class Class28 {

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "Lclient!qd;")
	private Class1_Sub24 aClass1_Sub24_8;

	@OriginalMember(owner = "client!tj", name = "n", descriptor = "[I")
	public int[] anIntArray505;

	@OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
	public int anInt5716;

	@OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
	private int anInt5717;

	@OriginalMember(owner = "client!tj", name = "M", descriptor = "I")
	public int anInt5722;

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "Z")
	private boolean aBoolean386 = false;

	@OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
	private int anInt5700 = 32;

	@OriginalMember(owner = "client!tj", name = "f", descriptor = "J")
	private long aLong211 = Static298.method4535();

	@OriginalMember(owner = "client!tj", name = "y", descriptor = "J")
	private long aLong212 = 0L;

	@OriginalMember(owner = "client!tj", name = "A", descriptor = "J")
	private long aLong213 = 0L;

	@OriginalMember(owner = "client!tj", name = "F", descriptor = "I")
	private int anInt5715 = 0;

	@OriginalMember(owner = "client!tj", name = "C", descriptor = "I")
	private int anInt5713 = 0;

	@OriginalMember(owner = "client!tj", name = "K", descriptor = "I")
	private int anInt5720 = 0;

	@OriginalMember(owner = "client!tj", name = "E", descriptor = "[Lclient!qd;")
	private Class1_Sub24[] aClass1_Sub24Array6 = new Class1_Sub24[8];

	@OriginalMember(owner = "client!tj", name = "O", descriptor = "Z")
	private boolean aBoolean388 = true;

	@OriginalMember(owner = "client!tj", name = "P", descriptor = "I")
	private int anInt5723 = 0;

	@OriginalMember(owner = "client!tj", name = "B", descriptor = "[Lclient!qd;")
	private Class1_Sub24[] aClass1_Sub24Array5 = new Class1_Sub24[8];

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "()V")
	protected void method4763() throws Exception {
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method4765(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "()V")
	protected void method4766() throws Exception {
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "([II)V")
	private void method4768(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static257.aBoolean319) {
			local1 = 512;
		}
		Static319.method1770(arg0, 0, local1);
		this.anInt5715 -= 256;
		if (this.aClass1_Sub24_8 != null && this.anInt5715 <= 0) {
			this.anInt5715 += Static303.anInt5383 >> 4;
			Static114.method2032(this.aClass1_Sub24_8);
			this.method4772(this.aClass1_Sub24_8, this.aClass1_Sub24_8.method4621());
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
						@Pc(91) Class1_Sub24 local91 = null;
						@Pc(96) Class1_Sub24 local96 = this.aClass1_Sub24Array5[local57];
						label100: while (true) {
							while (true) {
								if (local96 == null) {
									break label100;
								}
								@Pc(101) Class1_Sub5 local101 = local96.aClass1_Sub5_5;
								if (local101 == null || local101.anInt1671 <= local62) {
									local96.aBoolean367 = true;
									@Pc(125) int local125 = local96.method4623();
									local45 += local125;
									if (local101 != null) {
										local101.anInt1671 += local125;
									}
									if (local45 >= this.anInt5700) {
										break label106;
									}
									@Pc(145) Class1_Sub24 local145 = local96.method4618();
									if (local145 != null) {
										@Pc(150) int local150 = local96.anInt5428;
										while (local145 != null) {
											this.method4772(local145, local150 * local145.method4621() >> 8);
											local145 = local96.method4622();
										}
									}
									@Pc(169) Class1_Sub24 local169 = local96.aClass1_Sub24_7;
									local96.aClass1_Sub24_7 = null;
									if (local91 == null) {
										this.aClass1_Sub24Array5[local57] = local169;
									} else {
										local91.aClass1_Sub24_7 = local169;
									}
									if (local169 == null) {
										this.aClass1_Sub24Array6[local57] = local91;
									}
									local96 = local169;
								} else {
									local47 |= 0x1 << local57;
									local91 = local96;
									local96 = local96.aClass1_Sub24_7;
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
				@Pc(212) Class1_Sub24 local212 = this.aClass1_Sub24Array5[local49];
				this.aClass1_Sub24Array5[local49] = this.aClass1_Sub24Array6[local49] = null;
				while (local212 != null) {
					@Pc(227) Class1_Sub24 local227 = local212.aClass1_Sub24_7;
					local212.aClass1_Sub24_7 = null;
					local212 = local227;
				}
			}
		}
		if (this.anInt5715 < 0) {
			this.anInt5715 = 0;
		}
		if (this.aClass1_Sub24_8 != null) {
			this.aClass1_Sub24_8.method4624(arg0, 0, 256);
		}
		this.aLong211 = Static298.method4535();
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)V")
	public final synchronized void method4769() {
		this.aBoolean388 = true;
		try {
			this.method4763();
		} catch (@Pc(10) Exception local10) {
			this.method4773();
			this.aLong213 = Static298.method4535() + 2000L;
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!qd;Z)V")
	public final synchronized void method4770(@OriginalArg(0) Class1_Sub24 arg0) {
		this.aClass1_Sub24_8 = arg0;
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V")
	private void method4771() {
		this.anInt5715 -= 256;
		if (this.anInt5715 < 0) {
			this.anInt5715 = 0;
		}
		if (this.aClass1_Sub24_8 != null) {
			this.aClass1_Sub24_8.method4619(256);
		}
	}

	@OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lclient!qd;IB)V")
	private void method4772(@OriginalArg(0) Class1_Sub24 arg0, @OriginalArg(1) int arg1) {
		@Pc(15) int local15 = arg1 >> 5;
		@Pc(20) Class1_Sub24 local20 = this.aClass1_Sub24Array6[local15];
		if (local20 == null) {
			this.aClass1_Sub24Array5[local15] = arg0;
		} else {
			local20.aClass1_Sub24_7 = arg0;
		}
		this.aClass1_Sub24Array6[local15] = arg0;
		arg0.anInt5428 = arg1;
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "()V")
	protected void method4773() {
	}

	@OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)V")
	public final synchronized void method4774() {
		if (Static251.aClass131_1 != null) {
			@Pc(7) boolean local7 = true;
			for (@Pc(9) int local9 = 0; local9 < 2; local9++) {
				if (Static251.aClass131_1.aClass28Array1[local9] == this) {
					Static251.aClass131_1.aClass28Array1[local9] = null;
				}
				if (Static251.aClass131_1.aClass28Array1[local9] != null) {
					local7 = false;
				}
			}
			if (local7) {
				Static251.aClass131_1.aBoolean271 = true;
				while (Static251.aClass131_1.aBoolean270) {
					Static282.method4345(50L);
				}
				Static251.aClass131_1 = null;
			}
		}
		this.method4773();
		this.anIntArray505 = null;
		this.aBoolean386 = true;
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "()I")
	protected int method4775() throws Exception {
		return this.anInt5722;
	}

	@OriginalMember(owner = "client!tj", name = "d", descriptor = "(I)V")
	public void method4776(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!tj", name = "b", descriptor = "(Z)V")
	public final void method4777() {
		this.aBoolean388 = true;
	}

	@OriginalMember(owner = "client!tj", name = "e", descriptor = "(I)V")
	public final synchronized void method4778() {
		if (this.aBoolean386) {
			return;
		}
		@Pc(12) long local12 = Static298.method4535();
		try {
			if (local12 > this.aLong211 + 500000L) {
				this.aLong211 = local12 - 500000L;
			}
			while (this.aLong211 + 5000L < local12) {
				this.method4771();
				this.aLong211 += 256000 / Static303.anInt5383;
			}
		} catch (@Pc(50) Exception local50) {
			this.aLong211 = local12;
		}
		if (this.anIntArray505 == null) {
			return;
		}
		try {
			if (this.aLong213 != 0L) {
				if (this.aLong213 > local12) {
					return;
				}
				this.method4776(this.anInt5722);
				this.aBoolean388 = true;
				this.aLong213 = 0L;
			}
			@Pc(95) int local95 = this.method4775();
			@Pc(101) int local101 = this.anInt5717 + this.anInt5716;
			if (local101 + 256 > 16384) {
				local101 = 16128;
			}
			if (this.anInt5713 < this.anInt5723 - local95) {
				this.anInt5713 = this.anInt5723 - local95;
			}
			if (this.anInt5722 < local101 + 256) {
				local95 = 0;
				this.anInt5722 += 1024;
				if (this.anInt5722 > 16384) {
					this.anInt5722 = 16384;
				}
				this.method4773();
				this.method4776(this.anInt5722);
				if (this.anInt5722 < local101 + 256) {
					local101 = this.anInt5722 - 256;
					this.anInt5717 = local101 - this.anInt5716;
				}
				this.aBoolean388 = true;
			}
			while (local101 > local95) {
				local95 += 256;
				this.method4768(this.anIntArray505);
				this.method4766();
			}
			if (this.aLong212 < local12) {
				if (this.aBoolean388) {
					this.aBoolean388 = false;
				} else if (this.anInt5713 == 0 && this.anInt5720 == 0) {
					this.method4773();
					this.aLong213 = local12 + 2000L;
					return;
				} else {
					this.anInt5717 = Math.min(this.anInt5720, this.anInt5713);
					this.anInt5720 = this.anInt5713;
				}
				this.anInt5713 = 0;
				this.aLong212 = local12 + 2000L;
			}
			this.anInt5723 = local95;
		} catch (@Pc(256) Exception local256) {
			this.method4773();
			this.aLong213 = local12 + 2000L;
		}
	}
}
