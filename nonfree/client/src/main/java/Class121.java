import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!on")
public class Class121 {

	@OriginalMember(owner = "client!on", name = "o", descriptor = "[I")
	public int[] anIntArray462;

	@OriginalMember(owner = "client!on", name = "r", descriptor = "Lclient!ro;")
	private Class1_Sub7 aClass1_Sub7_6;

	@OriginalMember(owner = "client!on", name = "y", descriptor = "I")
	public int anInt4167;

	@OriginalMember(owner = "client!on", name = "z", descriptor = "I")
	private int anInt4168;

	@OriginalMember(owner = "client!on", name = "F", descriptor = "I")
	public int anInt4172;

	@OriginalMember(owner = "client!on", name = "b", descriptor = "Z")
	private boolean aBoolean375 = false;

	@OriginalMember(owner = "client!on", name = "k", descriptor = "I")
	private int anInt4158 = 32;

	@OriginalMember(owner = "client!on", name = "d", descriptor = "J")
	private long aLong156 = Static244.method3859();

	@OriginalMember(owner = "client!on", name = "v", descriptor = "J")
	private long aLong157 = 0L;

	@OriginalMember(owner = "client!on", name = "u", descriptor = "[Lclient!ro;")
	private Class1_Sub7[] aClass1_Sub7Array5 = new Class1_Sub7[8];

	@OriginalMember(owner = "client!on", name = "w", descriptor = "I")
	private int anInt4166 = 0;

	@OriginalMember(owner = "client!on", name = "G", descriptor = "I")
	private int anInt4173 = 0;

	@OriginalMember(owner = "client!on", name = "x", descriptor = "J")
	private long aLong158 = 0L;

	@OriginalMember(owner = "client!on", name = "E", descriptor = "[Lclient!ro;")
	private Class1_Sub7[] aClass1_Sub7Array6 = new Class1_Sub7[8];

	@OriginalMember(owner = "client!on", name = "D", descriptor = "I")
	private int anInt4171 = 0;

	@OriginalMember(owner = "client!on", name = "C", descriptor = "I")
	private int anInt4170 = 0;

	@OriginalMember(owner = "client!on", name = "B", descriptor = "Z")
	private boolean aBoolean376 = true;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "()V")
	protected void method3573() {
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "()V")
	protected void method3574() throws Exception {
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V")
	public final synchronized void method3575() {
		if (this.aBoolean375) {
			return;
		}
		@Pc(13) long local13 = Static244.method3859();
		try {
			if (local13 > this.aLong156 + 500000L) {
				this.aLong156 = local13 - 500000L;
			}
			while (this.aLong156 + 5000L < local13) {
				this.method3584();
				this.aLong156 += 256000 / Static69.anInt1498;
			}
		} catch (@Pc(50) Exception local50) {
			this.aLong156 = local13;
		}
		if (this.anIntArray462 == null) {
			return;
		}
		try {
			if (this.aLong157 != 0L) {
				if (local13 < this.aLong157) {
					return;
				}
				this.method3578(this.anInt4172);
				this.aLong157 = 0L;
				this.aBoolean376 = true;
			}
			@Pc(82) int local82 = this.method3582();
			if (this.anInt4166 - local82 > this.anInt4170) {
				this.anInt4170 = this.anInt4166 - local82;
			}
			@Pc(111) int local111 = this.anInt4168 + this.anInt4167;
			if (local111 + 256 > 16384) {
				local111 = 16128;
			}
			if (local111 + 256 > this.anInt4172) {
				local82 = 0;
				this.anInt4172 += 1024;
				if (this.anInt4172 > 16384) {
					this.anInt4172 = 16384;
				}
				this.method3573();
				this.method3578(this.anInt4172);
				if (this.anInt4172 < local111 + 256) {
					local111 = this.anInt4172 - 256;
					this.anInt4168 = local111 - this.anInt4167;
				}
				this.aBoolean376 = true;
			}
			while (local82 < local111) {
				this.method3579(this.anIntArray462);
				this.method3587();
				local82 += 256;
			}
			if (local13 > this.aLong158) {
				if (this.aBoolean376) {
					this.aBoolean376 = false;
				} else if (this.anInt4170 == 0 && this.anInt4173 == 0) {
					this.method3573();
					this.aLong157 = local13 + 2000L;
					return;
				} else {
					this.anInt4168 = Math.min(this.anInt4173, this.anInt4170);
					this.anInt4173 = this.anInt4170;
				}
				this.anInt4170 = 0;
				this.aLong158 = local13 + 2000L;
			}
			this.anInt4166 = local82;
		} catch (@Pc(245) Exception local245) {
			this.method3573();
			this.aLong157 = local13 + 2000L;
		}
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V")
	public final synchronized void method3576() {
		if (Static17.aClass158_1 != null) {
			@Pc(10) boolean local10 = true;
			for (@Pc(12) int local12 = 0; local12 < 2; local12++) {
				if (Static17.aClass158_1.aClass121Array1[local12] == this) {
					Static17.aClass158_1.aClass121Array1[local12] = null;
				}
				if (Static17.aClass158_1.aClass121Array1[local12] != null) {
					local10 = false;
				}
			}
			if (local10) {
				Static17.aClass158_1.aBoolean456 = true;
				while (Static17.aClass158_1.aBoolean455) {
					Static16.method242(50L);
				}
				Static17.aClass158_1 = null;
			}
		}
		this.method3573();
		this.aBoolean375 = true;
		this.anIntArray462 = null;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method3577(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!on", name = "d", descriptor = "(I)V")
	public void method3578(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "([II)V")
	private void method3579(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static292.aBoolean497) {
			local1 = 512;
		}
		Static317.method1047(arg0, 0, local1);
		this.anInt4171 -= 256;
		if (this.aClass1_Sub7_6 != null && this.anInt4171 <= 0) {
			this.anInt4171 += Static69.anInt1498 >> 4;
			Static81.method1673(this.aClass1_Sub7_6);
			this.method3585(this.aClass1_Sub7_6.method3723(), this.aClass1_Sub7_6);
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
						@Pc(91) Class1_Sub7 local91 = null;
						@Pc(96) Class1_Sub7 local96 = this.aClass1_Sub7Array6[local57];
						label100: while (true) {
							while (true) {
								if (local96 == null) {
									break label100;
								}
								@Pc(101) Class1_Sub23 local101 = local96.aClass1_Sub23_5;
								if (local101 == null || local101.anInt4000 <= local62) {
									local96.aBoolean393 = true;
									@Pc(125) int local125 = local96.method3728();
									local45 += local125;
									if (local101 != null) {
										local101.anInt4000 += local125;
									}
									if (local45 >= this.anInt4158) {
										break label106;
									}
									@Pc(145) Class1_Sub7 local145 = local96.method3724();
									if (local145 != null) {
										@Pc(150) int local150 = local96.anInt4342;
										while (local145 != null) {
											this.method3585(local150 * local145.method3723() >> 8, local145);
											local145 = local96.method3722();
										}
									}
									@Pc(169) Class1_Sub7 local169 = local96.aClass1_Sub7_8;
									local96.aClass1_Sub7_8 = null;
									if (local91 == null) {
										this.aClass1_Sub7Array6[local57] = local169;
									} else {
										local91.aClass1_Sub7_8 = local169;
									}
									if (local169 == null) {
										this.aClass1_Sub7Array5[local57] = local91;
									}
									local96 = local169;
								} else {
									local47 |= 0x1 << local57;
									local91 = local96;
									local96 = local96.aClass1_Sub7_8;
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
				@Pc(212) Class1_Sub7 local212 = this.aClass1_Sub7Array6[local49];
				this.aClass1_Sub7Array6[local49] = this.aClass1_Sub7Array5[local49] = null;
				while (local212 != null) {
					@Pc(227) Class1_Sub7 local227 = local212.aClass1_Sub7_8;
					local212.aClass1_Sub7_8 = null;
					local212 = local227;
				}
			}
		}
		if (this.anInt4171 < 0) {
			this.anInt4171 = 0;
		}
		if (this.aClass1_Sub7_6 != null) {
			this.aClass1_Sub7_6.method3725(arg0, 0, 256);
		}
		this.aLong156 = Static244.method3859();
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Z)V")
	public final synchronized void method3580() {
		this.aBoolean376 = true;
		try {
			this.method3574();
		} catch (@Pc(15) Exception local15) {
			this.method3573();
			this.aLong157 = Static244.method3859() + 2000L;
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(Lclient!ro;I)V")
	public final synchronized void method3581(@OriginalArg(0) Class1_Sub7 arg0) {
		this.aClass1_Sub7_6 = arg0;
	}

	@OriginalMember(owner = "client!on", name = "c", descriptor = "()I")
	protected int method3582() throws Exception {
		return this.anInt4172;
	}

	@OriginalMember(owner = "client!on", name = "b", descriptor = "(Z)V")
	public final void method3583() {
		this.aBoolean376 = true;
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(II)V")
	private void method3584() {
		this.anInt4171 -= 256;
		if (this.anInt4171 < 0) {
			this.anInt4171 = 0;
		}
		if (this.aClass1_Sub7_6 != null) {
			this.aClass1_Sub7_6.method3726(256);
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IILclient!ro;)V")
	private void method3585(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub7 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class1_Sub7 local12 = this.aClass1_Sub7Array5[local7];
		if (local12 == null) {
			this.aClass1_Sub7Array6[local7] = arg1;
		} else {
			local12.aClass1_Sub7_8 = arg1;
		}
		this.aClass1_Sub7Array5[local7] = arg1;
		arg1.anInt4342 = arg0;
	}

	@OriginalMember(owner = "client!on", name = "d", descriptor = "()V")
	protected void method3587() throws Exception {
	}
}
