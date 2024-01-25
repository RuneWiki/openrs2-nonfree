import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hia")
public class Class70 {

	@OriginalMember(owner = "client!hia", name = "o", descriptor = "[I")
	public int[] anIntArray742;

	@OriginalMember(owner = "client!hia", name = "d", descriptor = "Lclient!gm;")
	private Class2_Sub23 aClass2_Sub23_9;

	@OriginalMember(owner = "client!hia", name = "e", descriptor = "I")
	public int anInt10694;

	@OriginalMember(owner = "client!hia", name = "q", descriptor = "I")
	public int anInt10695;

	@OriginalMember(owner = "client!hia", name = "x", descriptor = "I")
	private int anInt10700;

	@OriginalMember(owner = "client!hia", name = "D", descriptor = "I")
	private final int anInt10682 = 32;

	@OriginalMember(owner = "client!hia", name = "g", descriptor = "Z")
	private boolean aBoolean918 = false;

	@OriginalMember(owner = "client!hia", name = "s", descriptor = "J")
	private long aLong336 = Static567.method7863();

	@OriginalMember(owner = "client!hia", name = "A", descriptor = "I")
	private int anInt10696 = 0;

	@OriginalMember(owner = "client!hia", name = "E", descriptor = "[Lclient!gm;")
	private final Class2_Sub23[] aClass2_Sub23Array6 = new Class2_Sub23[8];

	@OriginalMember(owner = "client!hia", name = "u", descriptor = "Z")
	private boolean aBoolean919 = true;

	@OriginalMember(owner = "client!hia", name = "l", descriptor = "J")
	private long aLong337 = 0L;

	@OriginalMember(owner = "client!hia", name = "H", descriptor = "[Lclient!gm;")
	private final Class2_Sub23[] aClass2_Sub23Array5 = new Class2_Sub23[8];

	@OriginalMember(owner = "client!hia", name = "r", descriptor = "J")
	private long aLong338 = 0L;

	@OriginalMember(owner = "client!hia", name = "t", descriptor = "I")
	private int anInt10702 = 0;

	@OriginalMember(owner = "client!hia", name = "k", descriptor = "I")
	private int anInt10703 = 0;

	@OriginalMember(owner = "client!hia", name = "m", descriptor = "I")
	private int anInt10704 = 0;

	@OriginalMember(owner = "client!hia", name = "b", descriptor = "(I)V")
	public final synchronized void method9352() {
		if (Static393.aClass339_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static393.aClass339_1.aClass70Array1[local11] == this) {
					Static393.aClass339_1.aClass70Array1[local11] = null;
				}
				if (Static393.aClass339_1.aClass70Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static393.aClass339_1.aBoolean792 = true;
				while (Static393.aClass339_1.aBoolean793) {
					Static570.method7907(50L);
				}
				Static393.aClass339_1 = null;
			}
		}
		this.method9355();
		this.anIntArray742 = null;
		this.aBoolean918 = true;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "([II)V")
	private void method9353(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static42.aBoolean76) {
			local1 = 512;
		}
		Static728.method272(arg0, 0, local1);
		this.anInt10703 -= 256;
		if (this.aClass2_Sub23_9 != null && this.anInt10703 <= 0) {
			this.anInt10703 += Static24.anInt294 >> 4;
			Static412.method6063(this.aClass2_Sub23_9);
			this.method9358(this.aClass2_Sub23_9.method7672(), this.aClass2_Sub23_9);
			@Pc(47) int local47 = 0;
			@Pc(49) int local49 = 255;
			@Pc(51) int local51 = 7;
			@Pc(58) int local58;
			label103: while (local49 != 0) {
				@Pc(63) int local63;
				if (local51 < 0) {
					local58 = local51 & 0x3;
					local63 = -(local51 >> 2);
				} else {
					local58 = local51;
					local63 = 0;
				}
				for (@Pc(74) int local74 = local49 >>> local58 & 0x11111111; local74 != 0; local74 >>>= 0x4) {
					if ((local74 & 0x1) != 0) {
						local49 &= ~(0x1 << local58);
						@Pc(92) Class2_Sub23 local92 = null;
						@Pc(97) Class2_Sub23 local97 = this.aClass2_Sub23Array6[local58];
						label97: while (true) {
							while (true) {
								if (local97 == null) {
									break label97;
								}
								@Pc(101) Class2_Sub4 local101 = local97.aClass2_Sub4_6;
								if (local101 == null || local101.anInt8531 <= local63) {
									local97.aBoolean739 = true;
									@Pc(127) int local127 = local97.method7674();
									local47 += local127;
									if (local101 != null) {
										local101.anInt8531 += local127;
									}
									if (local47 >= this.anInt10682) {
										break label103;
									}
									@Pc(148) Class2_Sub23 local148 = local97.method7676();
									if (local148 != null) {
										@Pc(153) int local153 = local97.anInt8655;
										while (local148 != null) {
											this.method9358(local153 * local148.method7672() >> 8, local148);
											local148 = local97.method7677();
										}
									}
									@Pc(172) Class2_Sub23 local172 = local97.aClass2_Sub23_8;
									local97.aClass2_Sub23_8 = null;
									if (local92 == null) {
										this.aClass2_Sub23Array6[local58] = local172;
									} else {
										local92.aClass2_Sub23_8 = local172;
									}
									if (local172 == null) {
										this.aClass2_Sub23Array5[local58] = local92;
									}
									local97 = local172;
								} else {
									local49 |= 0x1 << local58;
									local92 = local97;
									local97 = local97.aClass2_Sub23_8;
								}
							}
						}
					}
					local58 += 4;
					local63++;
				}
				local51--;
			}
			for (local58 = 0; local58 < 8; local58++) {
				@Pc(218) Class2_Sub23 local218 = this.aClass2_Sub23Array6[local58];
				this.aClass2_Sub23Array6[local58] = this.aClass2_Sub23Array5[local58] = null;
				while (local218 != null) {
					@Pc(232) Class2_Sub23 local232 = local218.aClass2_Sub23_8;
					local218.aClass2_Sub23_8 = null;
					local218 = local232;
				}
			}
		}
		if (this.anInt10703 < 0) {
			this.anInt10703 = 0;
		}
		if (this.aClass2_Sub23_9 != null) {
			this.aClass2_Sub23_9.method7675(arg0, 0, 256);
		}
		this.aLong336 = Static567.method7863();
	}

	@OriginalMember(owner = "client!hia", name = "b", descriptor = "()V")
	protected void method9354() throws Exception {
	}

	@OriginalMember(owner = "client!hia", name = "d", descriptor = "()V")
	protected void method9355() {
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(B)V")
	public final synchronized void method9357() {
		this.aBoolean919 = true;
		try {
			this.method9359();
		} catch (@Pc(18) Exception local18) {
			this.method9355();
			this.aLong338 = Static567.method7863() + 2000L;
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(BILclient!gm;)V")
	private void method9358(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub23 arg1) {
		@Pc(7) int local7 = arg0 >> 5;
		@Pc(19) Class2_Sub23 local19 = this.aClass2_Sub23Array5[local7];
		if (local19 == null) {
			this.aClass2_Sub23Array6[local7] = arg1;
		} else {
			local19.aClass2_Sub23_8 = arg1;
		}
		this.aClass2_Sub23Array5[local7] = arg1;
		arg1.anInt8655 = arg0;
	}

	@OriginalMember(owner = "client!hia", name = "c", descriptor = "()V")
	protected void method9359() throws Exception {
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(I)V")
	public void method9360(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method9361(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(Z)V")
	public final synchronized void method9362() {
		if (this.aBoolean918) {
			return;
		}
		@Pc(13) long local13 = Static567.method7863();
		try {
			if (local13 > this.aLong336 + 6000L) {
				this.aLong336 = local13 - 6000L;
			}
			while (this.aLong336 + 5000L < local13) {
				this.method9363();
				this.aLong336 += (long) (256000 / Static24.anInt294);
				local13 = Static567.method7863();
			}
		} catch (@Pc(62) Exception local62) {
			this.aLong336 = local13;
		}
		if (this.anIntArray742 == null) {
			return;
		}
		try {
			if (this.aLong338 != 0L) {
				if (this.aLong338 > local13) {
					return;
				}
				this.method9360(this.anInt10694);
				this.aLong338 = 0L;
				this.aBoolean919 = true;
			}
			@Pc(99) int local99 = this.method9364();
			if (this.anInt10702 - local99 > this.anInt10696) {
				this.anInt10696 = this.anInt10702 - local99;
			}
			@Pc(129) int local129 = this.anInt10695 + this.anInt10700;
			if (local129 + 256 > 16384) {
				local129 = 16128;
			}
			if (local129 + 256 > this.anInt10694) {
				this.anInt10694 += 1024;
				if (this.anInt10694 > 16384) {
					this.anInt10694 = 16384;
				}
				this.method9355();
				this.method9360(this.anInt10694);
				local99 = 0;
				this.aBoolean919 = true;
				if (this.anInt10694 < local129 + 256) {
					local129 = this.anInt10694 - 256;
					this.anInt10700 = local129 - this.anInt10695;
				}
			}
			while (local99 < local129) {
				this.method9353(this.anIntArray742);
				this.method9354();
				local99 += 256;
			}
			if (this.aLong337 < local13) {
				if (this.aBoolean919) {
					this.aBoolean919 = false;
				} else if (this.anInt10696 == 0 && this.anInt10704 == 0) {
					this.method9355();
					this.aLong338 = local13 + 2000L;
					return;
				} else {
					this.anInt10700 = Math.min(this.anInt10704, this.anInt10696);
					this.anInt10704 = this.anInt10696;
				}
				this.anInt10696 = 0;
				this.aLong337 = local13 + 2000L;
			}
			this.anInt10702 = local99;
		} catch (@Pc(284) Exception local284) {
			this.method9355();
			this.aLong338 = local13 + 2000L;
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(II)V")
	private void method9363() {
		this.anInt10703 -= 256;
		if (this.anInt10703 < 0) {
			this.anInt10703 = 0;
		}
		if (this.aClass2_Sub23_9 != null) {
			this.aClass2_Sub23_9.method7671(256);
		}
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "()I")
	protected int method9364() throws Exception {
		return this.anInt10694;
	}

	@OriginalMember(owner = "client!hia", name = "a", descriptor = "(Lclient!gm;I)V")
	public final synchronized void method9365(@OriginalArg(0) Class2_Sub23 arg0) {
		this.aClass2_Sub23_9 = arg0;
	}
}
