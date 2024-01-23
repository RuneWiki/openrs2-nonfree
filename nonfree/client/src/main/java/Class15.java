import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public class Class15 {

	@OriginalMember(owner = "client!hn", name = "p", descriptor = "Lclient!jk;")
	private Class1_Sub10 aClass1_Sub10_3;

	@OriginalMember(owner = "client!hn", name = "u", descriptor = "[I")
	public int[] anIntArray184;

	@OriginalMember(owner = "client!hn", name = "C", descriptor = "I")
	public int anInt1672;

	@OriginalMember(owner = "client!hn", name = "D", descriptor = "I")
	private int anInt1673;

	@OriginalMember(owner = "client!hn", name = "H", descriptor = "I")
	public int anInt1676;

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "Z")
	private boolean aBoolean115 = false;

	@OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
	private int anInt1660 = 32;

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "J")
	private long aLong61 = Static258.method3967();

	@OriginalMember(owner = "client!hn", name = "A", descriptor = "Z")
	private boolean aBoolean116 = true;

	@OriginalMember(owner = "client!hn", name = "F", descriptor = "[Lclient!jk;")
	private Class1_Sub10[] aClass1_Sub10Array6 = new Class1_Sub10[8];

	@OriginalMember(owner = "client!hn", name = "z", descriptor = "J")
	private long aLong62 = 0L;

	@OriginalMember(owner = "client!hn", name = "G", descriptor = "I")
	private int anInt1675 = 0;

	@OriginalMember(owner = "client!hn", name = "y", descriptor = "I")
	private int anInt1671 = 0;

	@OriginalMember(owner = "client!hn", name = "J", descriptor = "I")
	private int anInt1678 = 0;

	@OriginalMember(owner = "client!hn", name = "K", descriptor = "J")
	private long aLong63 = 0L;

	@OriginalMember(owner = "client!hn", name = "B", descriptor = "[Lclient!jk;")
	private Class1_Sub10[] aClass1_Sub10Array5 = new Class1_Sub10[8];

	@OriginalMember(owner = "client!hn", name = "L", descriptor = "I")
	private int anInt1679 = 0;

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
	public final synchronized void method1242() {
		if (Static94.aClass184_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static94.aClass184_1.aClass15Array1[local11] == this) {
					Static94.aClass184_1.aClass15Array1[local11] = null;
				}
				if (Static94.aClass184_1.aClass15Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static94.aClass184_1.aBoolean385 = true;
				while (Static94.aClass184_1.aBoolean386) {
					Static312.method4734(50L);
				}
				Static94.aClass184_1 = null;
			}
		}
		this.method1255();
		this.anIntArray184 = null;
		this.aBoolean115 = true;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "([II)V")
	private void method1243(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static263.aBoolean329) {
			local1 = 512;
		}
		Static319.method1425(arg0, 0, local1);
		this.anInt1671 -= 256;
		if (this.aClass1_Sub10_3 != null && this.anInt1671 <= 0) {
			this.anInt1671 += Static230.anInt3026 >> 4;
			Static220.method3471(this.aClass1_Sub10_3);
			this.method1257(this.aClass1_Sub10_3.method4344(), this.aClass1_Sub10_3);
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
						@Pc(91) Class1_Sub10 local91 = null;
						@Pc(96) Class1_Sub10 local96 = this.aClass1_Sub10Array5[local57];
						label100: while (true) {
							while (true) {
								if (local96 == null) {
									break label100;
								}
								@Pc(101) Class1_Sub11 local101 = local96.aClass1_Sub11_5;
								if (local101 == null || local101.anInt2186 <= local62) {
									local96.aBoolean360 = true;
									@Pc(125) int local125 = local96.method4343();
									local45 += local125;
									if (local101 != null) {
										local101.anInt2186 += local125;
									}
									if (local45 >= this.anInt1660) {
										break label106;
									}
									@Pc(145) Class1_Sub10 local145 = local96.method4342();
									if (local145 != null) {
										@Pc(150) int local150 = local96.anInt5717;
										while (local145 != null) {
											this.method1257(local150 * local145.method4344() >> 8, local145);
											local145 = local96.method4339();
										}
									}
									@Pc(169) Class1_Sub10 local169 = local96.aClass1_Sub10_8;
									local96.aClass1_Sub10_8 = null;
									if (local91 == null) {
										this.aClass1_Sub10Array5[local57] = local169;
									} else {
										local91.aClass1_Sub10_8 = local169;
									}
									if (local169 == null) {
										this.aClass1_Sub10Array6[local57] = local91;
									}
									local96 = local169;
								} else {
									local47 |= 0x1 << local57;
									local91 = local96;
									local96 = local96.aClass1_Sub10_8;
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
				@Pc(212) Class1_Sub10 local212 = this.aClass1_Sub10Array5[local49];
				this.aClass1_Sub10Array5[local49] = this.aClass1_Sub10Array6[local49] = null;
				while (local212 != null) {
					@Pc(227) Class1_Sub10 local227 = local212.aClass1_Sub10_8;
					local212.aClass1_Sub10_8 = null;
					local212 = local227;
				}
			}
		}
		if (this.anInt1671 < 0) {
			this.anInt1671 = 0;
		}
		if (this.aClass1_Sub10_3 != null) {
			this.aClass1_Sub10_3.method4345(arg0, 0, 256);
		}
		this.aLong61 = Static258.method3967();
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "()V")
	protected void method1244() throws Exception {
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BI)V")
	private void method1245() {
		this.anInt1671 -= 256;
		if (this.anInt1671 < 0) {
			this.anInt1671 = 0;
		}
		if (this.aClass1_Sub10_3 != null) {
			this.aClass1_Sub10_3.method4341(256);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!jk;I)V")
	public final synchronized void method1246(@OriginalArg(0) Class1_Sub10 arg0) {
		this.aClass1_Sub10_3 = arg0;
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "()I")
	protected int method1247() throws Exception {
		return this.anInt1676;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
	public final synchronized void method1248() {
		if (this.aBoolean115) {
			return;
		}
		@Pc(12) long local12 = Static258.method3967();
		try {
			if (this.aLong61 + 500000L < local12) {
				this.aLong61 = local12 - 500000L;
			}
			while (this.aLong61 + 5000L < local12) {
				this.method1245();
				this.aLong61 += 256000 / Static230.anInt3026;
			}
		} catch (@Pc(48) Exception local48) {
			this.aLong61 = local12;
		}
		if (this.anIntArray184 == null) {
			return;
		}
		try {
			if (this.aLong63 != 0L) {
				if (this.aLong63 > local12) {
					return;
				}
				this.method1258(this.anInt1676);
				this.aLong63 = 0L;
				this.aBoolean116 = true;
			}
			@Pc(79) int local79 = this.method1247();
			if (this.anInt1678 < this.anInt1675 - local79) {
				this.anInt1678 = this.anInt1675 - local79;
			}
			@Pc(106) int local106 = this.anInt1672 + this.anInt1673;
			if (local106 + 256 > 16384) {
				local106 = 16128;
			}
			if (local106 + 256 > this.anInt1676) {
				local79 = 0;
				this.anInt1676 += 1024;
				if (this.anInt1676 > 16384) {
					this.anInt1676 = 16384;
				}
				this.method1255();
				this.method1258(this.anInt1676);
				if (local106 + 256 > this.anInt1676) {
					local106 = this.anInt1676 - 256;
					this.anInt1673 = local106 - this.anInt1672;
				}
				this.aBoolean116 = true;
			}
			while (local106 > local79) {
				local79 += 256;
				this.method1243(this.anIntArray184);
				this.method1254();
			}
			if (this.aLong62 < local12) {
				if (this.aBoolean116) {
					this.aBoolean116 = false;
				} else if (this.anInt1678 == 0 && this.anInt1679 == 0) {
					this.method1255();
					this.aLong63 = local12 + 2000L;
					return;
				} else {
					this.anInt1673 = Math.min(this.anInt1679, this.anInt1678);
					this.anInt1679 = this.anInt1678;
				}
				this.aLong62 = local12 + 2000L;
				this.anInt1678 = 0;
			}
			this.anInt1675 = local79;
		} catch (@Pc(240) Exception local240) {
			this.method1255();
			this.aLong63 = local12 + 2000L;
		}
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)V")
	public final void method1249() {
		this.aBoolean116 = true;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1250(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V")
	public final synchronized void method1251() {
		this.aBoolean116 = true;
		try {
			this.method1244();
		} catch (@Pc(12) Exception local12) {
			this.method1255();
			this.aLong63 = Static258.method3967() + 2000L;
		}
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "()V")
	protected void method1254() throws Exception {
	}

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "()V")
	protected void method1255() {
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IILclient!jk;)V")
	private void method1257(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub10 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(17) Class1_Sub10 local17 = this.aClass1_Sub10Array6[local7];
		if (local17 == null) {
			this.aClass1_Sub10Array5[local7] = arg1;
		} else {
			local17.aClass1_Sub10_8 = arg1;
		}
		this.aClass1_Sub10Array6[local7] = arg1;
		arg1.anInt5717 = arg0;
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V")
	public void method1258(@OriginalArg(0) int arg0) throws Exception {
	}
}
