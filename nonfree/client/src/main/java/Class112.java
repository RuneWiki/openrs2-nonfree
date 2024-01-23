import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nc")
public class Class112 {

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "[I")
	public int[] anIntArray448;

	@OriginalMember(owner = "client!nc", name = "t", descriptor = "Lclient!mj;")
	private Class4_Sub6 aClass4_Sub6_8;

	@OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
	private int anInt5580;

	@OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
	public int anInt5581;

	@OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
	public int anInt5584;

	@OriginalMember(owner = "client!nc", name = "i", descriptor = "Z")
	private boolean aBoolean381 = false;

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
	private int anInt5568 = 32;

	@OriginalMember(owner = "client!nc", name = "s", descriptor = "J")
	private long aLong194 = Static61.method1150();

	@OriginalMember(owner = "client!nc", name = "A", descriptor = "[Lclient!mj;")
	private Class4_Sub6[] aClass4_Sub6Array5 = new Class4_Sub6[8];

	@OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
	private int anInt5579 = 0;

	@OriginalMember(owner = "client!nc", name = "C", descriptor = "J")
	private long aLong195 = 0L;

	@OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
	private int anInt5582 = 0;

	@OriginalMember(owner = "client!nc", name = "H", descriptor = "Z")
	private boolean aBoolean382 = true;

	@OriginalMember(owner = "client!nc", name = "E", descriptor = "[Lclient!mj;")
	private Class4_Sub6[] aClass4_Sub6Array6 = new Class4_Sub6[8];

	@OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
	private int anInt5585 = 0;

	@OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
	private int anInt5583 = 0;

	@OriginalMember(owner = "client!nc", name = "K", descriptor = "J")
	private long aLong196 = 0L;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method4448(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "()I")
	protected int method4449() throws Exception {
		return this.anInt5581;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "()V")
	protected void method4450() throws Exception {
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "()V")
	protected void method4451() throws Exception {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
	public final synchronized void method4452() {
		this.aBoolean382 = true;
		try {
			this.method4451();
		} catch (@Pc(14) Exception local14) {
			this.method4460();
			this.aLong195 = Static61.method1150() + 2000L;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "([II)V")
	private void method4454(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static155.aBoolean207) {
			local1 = 512;
		}
		Static317.method3200(arg0, 0, local1);
		this.anInt5582 -= 256;
		if (this.aClass4_Sub6_8 != null && this.anInt5582 <= 0) {
			this.anInt5582 += Static75.anInt1523 >> 4;
			Static214.method4435(this.aClass4_Sub6_8);
			this.method4459(this.aClass4_Sub6_8.method3722(), this.aClass4_Sub6_8);
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
						@Pc(91) Class4_Sub6 local91 = null;
						@Pc(96) Class4_Sub6 local96 = this.aClass4_Sub6Array6[local57];
						label100: while (true) {
							while (true) {
								if (local96 == null) {
									break label100;
								}
								@Pc(101) Class4_Sub5 local101 = local96.aClass4_Sub5_5;
								if (local101 == null || local101.anInt4734 <= local62) {
									local96.aBoolean298 = true;
									@Pc(125) int local125 = local96.method3724();
									local45 += local125;
									if (local101 != null) {
										local101.anInt4734 += local125;
									}
									if (local45 >= this.anInt5568) {
										break label106;
									}
									@Pc(145) Class4_Sub6 local145 = local96.method3727();
									if (local145 != null) {
										@Pc(150) int local150 = local96.anInt4782;
										while (local145 != null) {
											this.method4459(local150 * local145.method3722() >> 8, local145);
											local145 = local96.method3725();
										}
									}
									@Pc(169) Class4_Sub6 local169 = local96.aClass4_Sub6_7;
									local96.aClass4_Sub6_7 = null;
									if (local91 == null) {
										this.aClass4_Sub6Array6[local57] = local169;
									} else {
										local91.aClass4_Sub6_7 = local169;
									}
									if (local169 == null) {
										this.aClass4_Sub6Array5[local57] = local91;
									}
									local96 = local169;
								} else {
									local47 |= 0x1 << local57;
									local91 = local96;
									local96 = local96.aClass4_Sub6_7;
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
				@Pc(212) Class4_Sub6 local212 = this.aClass4_Sub6Array6[local49];
				this.aClass4_Sub6Array6[local49] = this.aClass4_Sub6Array5[local49] = null;
				while (local212 != null) {
					@Pc(227) Class4_Sub6 local227 = local212.aClass4_Sub6_7;
					local212.aClass4_Sub6_7 = null;
					local212 = local227;
				}
			}
		}
		if (this.anInt5582 < 0) {
			this.anInt5582 = 0;
		}
		if (this.aClass4_Sub6_8 != null) {
			this.aClass4_Sub6_8.method3723(arg0, 0, 256);
		}
		this.aLong194 = Static61.method1150();
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!mj;I)V")
	public final synchronized void method4455(@OriginalArg(0) Class4_Sub6 arg0) {
		this.aClass4_Sub6_8 = arg0;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public void method4457(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILclient!mj;)V")
	private void method4459(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub6 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class4_Sub6 local12 = this.aClass4_Sub6Array5[local7];
		if (local12 == null) {
			this.aClass4_Sub6Array6[local7] = arg1;
		} else {
			local12.aClass4_Sub6_7 = arg1;
		}
		this.aClass4_Sub6Array5[local7] = arg1;
		arg1.anInt4782 = arg0;
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "()V")
	protected void method4460() {
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)V")
	private void method4461() {
		this.anInt5582 -= 256;
		if (this.anInt5582 < 0) {
			this.anInt5582 = 0;
		}
		if (this.aClass4_Sub6_8 != null) {
			this.aClass4_Sub6_8.method3728(256);
		}
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(Z)V")
	public final synchronized void method4462() {
		if (this.aBoolean381) {
			return;
		}
		@Pc(12) long local12 = Static61.method1150();
		try {
			if (this.aLong194 + 500000L < local12) {
				this.aLong194 = local12 - 500000L;
			}
			while (local12 > this.aLong194 + 5000L) {
				this.method4461();
				this.aLong194 += 256000 / Static75.anInt1523;
			}
		} catch (@Pc(53) Exception local53) {
			this.aLong194 = local12;
		}
		if (this.anIntArray448 == null) {
			return;
		}
		try {
			if (this.aLong195 != 0L) {
				if (local12 < this.aLong195) {
					return;
				}
				this.method4457(this.anInt5581);
				this.aLong195 = 0L;
				this.aBoolean382 = true;
			}
			@Pc(97) int local97 = this.method4449();
			if (this.anInt5583 < this.anInt5585 - local97) {
				this.anInt5583 = this.anInt5585 - local97;
			}
			@Pc(119) int local119 = this.anInt5580 + this.anInt5584;
			if (local119 + 256 > 16384) {
				local119 = 16128;
			}
			if (this.anInt5581 < local119 + 256) {
				local97 = 0;
				this.anInt5581 += 1024;
				if (this.anInt5581 > 16384) {
					this.anInt5581 = 16384;
				}
				this.method4460();
				this.method4457(this.anInt5581);
				this.aBoolean382 = true;
				if (local119 + 256 > this.anInt5581) {
					local119 = this.anInt5581 - 256;
					this.anInt5580 = local119 - this.anInt5584;
				}
			}
			while (local97 < local119) {
				local97 += 256;
				this.method4454(this.anIntArray448);
				this.method4450();
			}
			if (local12 > this.aLong196) {
				if (this.aBoolean382) {
					this.aBoolean382 = false;
				} else if (this.anInt5583 == 0 && this.anInt5579 == 0) {
					this.method4460();
					this.aLong195 = local12 + 2000L;
					return;
				} else {
					this.anInt5580 = Math.min(this.anInt5579, this.anInt5583);
					this.anInt5579 = this.anInt5583;
				}
				this.anInt5583 = 0;
				this.aLong196 = local12 + 2000L;
			}
			this.anInt5585 = local97;
		} catch (@Pc(256) Exception local256) {
			this.method4460();
			this.aLong195 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(B)V")
	public final synchronized void method4463() {
		if (Static309.aClass59_2 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static309.aClass59_2.aClass112Array1[local11] == this) {
					Static309.aClass59_2.aClass112Array1[local11] = null;
				}
				if (Static309.aClass59_2.aClass112Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static309.aClass59_2.aBoolean107 = true;
				while (Static309.aClass59_2.aBoolean106) {
					Static193.method3169(50L);
				}
				Static309.aClass59_2 = null;
			}
		}
		this.method4460();
		this.aBoolean381 = true;
		this.anIntArray448 = null;
	}

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "(B)V")
	public final void method4464() {
		this.aBoolean382 = true;
	}
}
