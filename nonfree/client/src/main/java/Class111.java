import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nb")
public class Class111 {

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "[I")
	public int[] anIntArray473;

	@OriginalMember(owner = "client!nb", name = "o", descriptor = "Lclient!kn;")
	private Class8_Sub8 aClass8_Sub8_8;

	@OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
	public int anInt5514;

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
	public int anInt5516;

	@OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
	private int anInt5519;

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "Z")
	private boolean aBoolean462 = false;

	@OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
	private int anInt5504 = 32;

	@OriginalMember(owner = "client!nb", name = "t", descriptor = "J")
	private long aLong197 = Static71.method1143();

	@OriginalMember(owner = "client!nb", name = "y", descriptor = "[Lclient!kn;")
	private Class8_Sub8[] aClass8_Sub8Array5 = new Class8_Sub8[8];

	@OriginalMember(owner = "client!nb", name = "I", descriptor = "J")
	private long aLong199 = 0L;

	@OriginalMember(owner = "client!nb", name = "H", descriptor = "[Lclient!kn;")
	private Class8_Sub8[] aClass8_Sub8Array6 = new Class8_Sub8[8];

	@OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
	private int anInt5513 = 0;

	@OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
	private int anInt5515 = 0;

	@OriginalMember(owner = "client!nb", name = "D", descriptor = "Z")
	private boolean aBoolean463 = true;

	@OriginalMember(owner = "client!nb", name = "z", descriptor = "J")
	private long aLong198 = 0L;

	@OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
	private int anInt5520 = 0;

	@OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
	private int anInt5521 = 0;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
	public void method4139(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
	public final synchronized void method4140() {
		this.aBoolean463 = true;
		try {
			this.method4154();
		} catch (@Pc(18) Exception local18) {
			this.method4148();
			this.aLong199 = Static71.method1143() + 2000L;
		}
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "(BI)V")
	private void method4142() {
		this.anInt5515 -= 256;
		if (this.anInt5515 < 0) {
			this.anInt5515 = 0;
		}
		if (this.aClass8_Sub8_8 != null) {
			this.aClass8_Sub8_8.method3705(256);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "()V")
	protected void method4143() throws Exception {
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BILclient!kn;)V")
	private void method4144(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub8 arg1) {
		@Pc(13) int local13 = arg0 >> 5;
		@Pc(18) Class8_Sub8 local18 = this.aClass8_Sub8Array6[local13];
		if (local18 == null) {
			this.aClass8_Sub8Array5[local13] = arg1;
		} else {
			local18.aClass8_Sub8_7 = arg1;
		}
		this.aClass8_Sub8Array6[local13] = arg1;
		arg1.anInt4941 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
	public final synchronized void method4146() {
		if (Static246.aClass154_1 != null) {
			@Pc(11) boolean local11 = true;
			for (@Pc(13) int local13 = 0; local13 < 2; local13++) {
				if (Static246.aClass154_1.aClass111Array1[local13] == this) {
					Static246.aClass154_1.aClass111Array1[local13] = null;
				}
				if (Static246.aClass154_1.aClass111Array1[local13] != null) {
					local11 = false;
				}
			}
			if (local11) {
				Static246.aClass154_1.aBoolean392 = true;
				while (Static246.aClass154_1.aBoolean391) {
					Static162.method2645(50L);
				}
				Static246.aClass154_1 = null;
			}
		}
		this.method4148();
		this.aBoolean462 = true;
		this.anIntArray473 = null;
	}

	@OriginalMember(owner = "client!nb", name = "b", descriptor = "()V")
	protected void method4148() {
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLclient!kn;)V")
	public final synchronized void method4150(@OriginalArg(1) Class8_Sub8 arg0) {
		this.aClass8_Sub8_8 = arg0;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method4152(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)V")
	public final void method4153() {
		this.aBoolean463 = true;
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "()V")
	protected void method4154() throws Exception {
	}

	@OriginalMember(owner = "client!nb", name = "d", descriptor = "()I")
	protected int method4155() throws Exception {
		return this.anInt5516;
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "([II)V")
	private void method4158(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static81.aBoolean130) {
			local1 = 512;
		}
		Static301.method496(arg0, 0, local1);
		this.anInt5515 -= 256;
		if (this.aClass8_Sub8_8 != null && this.anInt5515 <= 0) {
			this.anInt5515 += Static264.anInt5577 >> 4;
			Static97.method1544(this.aClass8_Sub8_8);
			this.method4144(this.aClass8_Sub8_8.method3708(), this.aClass8_Sub8_8);
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
						@Pc(91) Class8_Sub8 local91 = null;
						@Pc(96) Class8_Sub8 local96 = this.aClass8_Sub8Array5[local57];
						label100: while (true) {
							while (true) {
								if (local96 == null) {
									break label100;
								}
								@Pc(101) Class8_Sub20 local101 = local96.aClass8_Sub20_5;
								if (local101 == null || local101.anInt4697 <= local62) {
									local96.aBoolean397 = true;
									@Pc(125) int local125 = local96.method3709();
									local45 += local125;
									if (local101 != null) {
										local101.anInt4697 += local125;
									}
									if (local45 >= this.anInt5504) {
										break label106;
									}
									@Pc(145) Class8_Sub8 local145 = local96.method3706();
									if (local145 != null) {
										@Pc(150) int local150 = local96.anInt4941;
										while (local145 != null) {
											this.method4144(local150 * local145.method3708() >> 8, local145);
											local145 = local96.method3704();
										}
									}
									@Pc(169) Class8_Sub8 local169 = local96.aClass8_Sub8_7;
									local96.aClass8_Sub8_7 = null;
									if (local91 == null) {
										this.aClass8_Sub8Array5[local57] = local169;
									} else {
										local91.aClass8_Sub8_7 = local169;
									}
									if (local169 == null) {
										this.aClass8_Sub8Array6[local57] = local91;
									}
									local96 = local169;
								} else {
									local47 |= 0x1 << local57;
									local91 = local96;
									local96 = local96.aClass8_Sub8_7;
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
				@Pc(212) Class8_Sub8 local212 = this.aClass8_Sub8Array5[local49];
				this.aClass8_Sub8Array5[local49] = this.aClass8_Sub8Array6[local49] = null;
				while (local212 != null) {
					@Pc(227) Class8_Sub8 local227 = local212.aClass8_Sub8_7;
					local212.aClass8_Sub8_7 = null;
					local212 = local227;
				}
			}
		}
		if (this.anInt5515 < 0) {
			this.anInt5515 = 0;
		}
		if (this.aClass8_Sub8_8 != null) {
			this.aClass8_Sub8_8.method3707(arg0, 0, 256);
		}
		this.aLong197 = Static71.method1143();
	}

	@OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V")
	public final synchronized void method4159() {
		if (this.aBoolean462) {
			return;
		}
		@Pc(19) long local19 = Static71.method1143();
		try {
			if (local19 > this.aLong197 + 500000L) {
				this.aLong197 = local19 - 500000L;
			}
			while (this.aLong197 + 5000L < local19) {
				this.method4142();
				this.aLong197 += 256000 / Static264.anInt5577;
			}
		} catch (@Pc(60) Exception local60) {
			this.aLong197 = local19;
		}
		if (this.anIntArray473 == null) {
			return;
		}
		try {
			if (this.aLong199 != 0L) {
				if (local19 < this.aLong199) {
					return;
				}
				this.method4139(this.anInt5516);
				this.aLong199 = 0L;
				this.aBoolean463 = true;
			}
			@Pc(93) int local93 = this.method4155();
			@Pc(100) int local100 = this.anInt5514 + this.anInt5519;
			if (this.anInt5520 - local93 > this.anInt5521) {
				this.anInt5521 = this.anInt5520 - local93;
			}
			if (local100 + 256 > 16384) {
				local100 = 16128;
			}
			if (local100 + 256 > this.anInt5516) {
				this.anInt5516 += 1024;
				local93 = 0;
				if (this.anInt5516 > 16384) {
					this.anInt5516 = 16384;
				}
				this.method4148();
				this.method4139(this.anInt5516);
				if (local100 + 256 > this.anInt5516) {
					local100 = this.anInt5516 - 256;
					this.anInt5519 = local100 - this.anInt5514;
				}
				this.aBoolean463 = true;
			}
			while (local93 < local100) {
				local93 += 256;
				this.method4158(this.anIntArray473);
				this.method4143();
			}
			if (this.aLong198 < local19) {
				if (this.aBoolean463) {
					this.aBoolean463 = false;
				} else if (this.anInt5521 == 0 && this.anInt5513 == 0) {
					this.method4148();
					this.aLong199 = local19 + 2000L;
					return;
				} else {
					this.anInt5519 = Math.min(this.anInt5513, this.anInt5521);
					this.anInt5513 = this.anInt5521;
				}
				this.aLong198 = local19 + 2000L;
				this.anInt5521 = 0;
			}
			this.anInt5520 = local93;
		} catch (@Pc(248) Exception local248) {
			this.method4148();
			this.aLong199 = local19 + 2000L;
		}
	}
}
