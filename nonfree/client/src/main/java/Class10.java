import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public class Class10 {

	@OriginalMember(owner = "client!kc", name = "w", descriptor = "Lclient!ja;")
	private Class1_Sub1 aClass1_Sub1_7;

	@OriginalMember(owner = "client!kc", name = "x", descriptor = "[I")
	public int[] anIntArray291;

	@OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
	private int anInt1771;

	@OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
	public int anInt1772;

	@OriginalMember(owner = "client!kc", name = "R", descriptor = "I")
	public int anInt1776;

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
	private final int anInt1759 = 32;

	@OriginalMember(owner = "client!kc", name = "g", descriptor = "J")
	private long aLong56 = Static52.method906();

	@OriginalMember(owner = "client!kc", name = "H", descriptor = "J")
	private long aLong57 = 0L;

	@OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
	private int anInt1773 = 0;

	@OriginalMember(owner = "client!kc", name = "J", descriptor = "J")
	private long aLong58 = 0L;

	@OriginalMember(owner = "client!kc", name = "L", descriptor = "[Lclient!ja;")
	private final Class1_Sub1[] aClass1_Sub1Array5 = new Class1_Sub1[8];

	@OriginalMember(owner = "client!kc", name = "M", descriptor = "[Lclient!ja;")
	private final Class1_Sub1[] aClass1_Sub1Array6 = new Class1_Sub1[8];

	@OriginalMember(owner = "client!kc", name = "T", descriptor = "Z")
	private boolean aBoolean61 = true;

	@OriginalMember(owner = "client!kc", name = "S", descriptor = "I")
	private int anInt1777 = 0;

	@OriginalMember(owner = "client!kc", name = "U", descriptor = "I")
	private int anInt1778 = 0;

	@OriginalMember(owner = "client!kc", name = "Q", descriptor = "I")
	private int anInt1775 = 0;

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	public final synchronized void method1289() {
		this.aBoolean61 = true;
		try {
			this.method1293();
		} catch (@Pc(18) Exception local18) {
			this.method1304();
			this.aLong57 = Static52.method906() + 2000L;
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "([II)V")
	private void method1291(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static69.aBoolean49) {
			local1 = 512;
		}
		Static138.method1879(arg0, 0, local1);
		this.anInt1775 -= 256;
		if (this.aClass1_Sub1_7 != null && this.anInt1775 <= 0) {
			this.anInt1775 += Static45.anInt2755 >> 4;
			Static97.method1635(this.aClass1_Sub1_7);
			this.method1296(this.aClass1_Sub1_7.method1361(), this.aClass1_Sub1_7);
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
								@Pc(97) Class1_Sub9 local97 = local93.aClass1_Sub9_5;
								if (local97 == null || local97.anInt3154 <= local61) {
									local93.aBoolean63 = true;
									@Pc(121) int local121 = local93.method1360();
									local45 += local121;
									if (local97 != null) {
										local97.anInt3154 += local121;
									}
									if (local45 >= this.anInt1759) {
										break label103;
									}
									@Pc(140) Class1_Sub1 local140 = local93.method1362();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt1860;
										while (local140 != null) {
											this.method1296(local145 * local140.method1361() >> 8, local140);
											local140 = local93.method1357();
										}
									}
									@Pc(164) Class1_Sub1 local164 = local93.aClass1_Sub1_8;
									local93.aClass1_Sub1_8 = null;
									if (local88 == null) {
										this.aClass1_Sub1Array5[local56] = local164;
									} else {
										local88.aClass1_Sub1_8 = local164;
									}
									if (local164 == null) {
										this.aClass1_Sub1Array6[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass1_Sub1_8;
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
					@Pc(221) Class1_Sub1 local221 = local207.aClass1_Sub1_8;
					local207.aClass1_Sub1_8 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt1775 < 0) {
			this.anInt1775 = 0;
		}
		if (this.aClass1_Sub1_7 != null) {
			this.aClass1_Sub1_7.method1359(arg0, 0, 256);
		}
		this.aLong56 = Static52.method906();
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()I")
	protected int method1292() throws Exception {
		return this.anInt1772;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "()V")
	protected void method1293() throws Exception {
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)V")
	public void method1294(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IILclient!ja;)V")
	private void method1296(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(12) Class1_Sub1 local12 = this.aClass1_Sub1Array6[local7];
		if (local12 == null) {
			this.aClass1_Sub1Array5[local7] = arg1;
		} else {
			local12.aClass1_Sub1_8 = arg1;
		}
		this.aClass1_Sub1Array6[local7] = arg1;
		arg1.anInt1860 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!ja;B)V")
	public final synchronized void method1297(@OriginalArg(0) Class1_Sub1 arg0) {
		this.aClass1_Sub1_7 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method1298(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
	public final void method1299() {
		this.aBoolean61 = true;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)V")
	public final synchronized void method1301() {
		if (this.anIntArray291 == null) {
			return;
		}
		@Pc(12) long local12 = Static52.method906();
		try {
			if (this.aLong57 != 0L) {
				if (local12 < this.aLong57) {
					return;
				}
				this.method1294(this.anInt1772);
				this.aBoolean61 = true;
				this.aLong57 = 0L;
			}
			@Pc(36) int local36 = this.method1292();
			if (this.anInt1773 < this.anInt1778 - local36) {
				this.anInt1773 = this.anInt1778 - local36;
			}
			@Pc(61) int local61 = this.anInt1776 + this.anInt1771;
			if (local61 + 256 > 16384) {
				local61 = 16128;
			}
			if (local61 + 256 > this.anInt1772) {
				this.anInt1772 += 1024;
				if (this.anInt1772 > 16384) {
					this.anInt1772 = 16384;
				}
				this.method1304();
				local36 = 0;
				this.method1294(this.anInt1772);
				this.aBoolean61 = true;
				if (local61 + 256 > this.anInt1772) {
					local61 = this.anInt1772 - 256;
					this.anInt1771 = local61 - this.anInt1776;
				}
			}
			while (local61 > local36) {
				this.method1291(this.anIntArray291);
				this.method1302();
				local36 += 256;
			}
			if (this.aLong58 < local12) {
				if (this.aBoolean61) {
					this.aBoolean61 = false;
				} else if (this.anInt1773 == 0 && this.anInt1777 == 0) {
					this.method1304();
					this.aLong57 = local12 + 2000L;
					return;
				} else {
					this.anInt1771 = Math.min(this.anInt1777, this.anInt1773);
					this.anInt1777 = this.anInt1773;
				}
				this.aLong58 = local12 + 2000L;
				this.anInt1773 = 0;
			}
			this.anInt1778 = local36;
		} catch (@Pc(192) Exception local192) {
			this.method1304();
			this.aLong57 = local12 + 2000L;
		}
		try {
			if (local12 > this.aLong56 + 500000L) {
				local12 = this.aLong56;
			}
			while (local12 > this.aLong56 + 5000L) {
				this.method1305();
				this.aLong56 += 256000 / Static45.anInt2755;
			}
		} catch (@Pc(238) Exception local238) {
			this.aLong56 = local12;
		}
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "()V")
	protected void method1302() throws Exception {
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(Z)V")
	public final synchronized void method1303() {
		if (Static64.aClass47_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static64.aClass47_1.aClass10Array1[local11] == this) {
					Static64.aClass47_1.aClass10Array1[local11] = null;
				}
				if (Static64.aClass47_1.aClass10Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static64.aClass47_1.aBoolean50 = true;
				while (Static64.aClass47_1.aBoolean51) {
					Static70.method1226(50L);
				}
				Static64.aClass47_1 = null;
			}
		}
		this.method1304();
		this.anIntArray291 = null;
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "()V")
	protected void method1304() {
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
	private void method1305() {
		this.anInt1775 -= 256;
		if (this.anInt1775 < 0) {
			this.anInt1775 = 0;
		}
		if (this.aClass1_Sub1_7 != null) {
			this.aClass1_Sub1_7.method1358(256);
		}
	}
}
