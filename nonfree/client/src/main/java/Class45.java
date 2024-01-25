import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eca")
public class Class45 {

	@OriginalMember(owner = "client!eca", name = "z", descriptor = "Lclient!ef;")
	private Class5_Sub4 aClass5_Sub4_9;

	@OriginalMember(owner = "client!eca", name = "y", descriptor = "[I")
	public int[] anIntArray495;

	@OriginalMember(owner = "client!eca", name = "C", descriptor = "I")
	private int anInt8659;

	@OriginalMember(owner = "client!eca", name = "i", descriptor = "I")
	public int anInt8661;

	@OriginalMember(owner = "client!eca", name = "k", descriptor = "I")
	public int anInt8662;

	@OriginalMember(owner = "client!eca", name = "N", descriptor = "Z")
	private boolean aBoolean568 = false;

	@OriginalMember(owner = "client!eca", name = "u", descriptor = "I")
	private final int anInt8645 = 32;

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "J")
	private long aLong251 = Static480.method6763();

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "J")
	private long aLong253 = 0L;

	@OriginalMember(owner = "client!eca", name = "A", descriptor = "J")
	private long aLong252 = 0L;

	@OriginalMember(owner = "client!eca", name = "w", descriptor = "I")
	private int anInt8658 = 0;

	@OriginalMember(owner = "client!eca", name = "e", descriptor = "I")
	private int anInt8657 = 0;

	@OriginalMember(owner = "client!eca", name = "L", descriptor = "[Lclient!ef;")
	private final Class5_Sub4[] aClass5_Sub4Array5 = new Class5_Sub4[8];

	@OriginalMember(owner = "client!eca", name = "x", descriptor = "I")
	private int anInt8656 = 0;

	@OriginalMember(owner = "client!eca", name = "q", descriptor = "Z")
	private boolean aBoolean569 = true;

	@OriginalMember(owner = "client!eca", name = "D", descriptor = "I")
	private int anInt8660 = 0;

	@OriginalMember(owner = "client!eca", name = "F", descriptor = "[Lclient!ef;")
	private final Class5_Sub4[] aClass5_Sub4Array6 = new Class5_Sub4[8];

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "()V")
	protected void method7447() {
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Lclient!ef;II)V")
	private void method7448(@OriginalArg(0) Class5_Sub4 arg0, @OriginalArg(1) int arg1) {
		@Pc(14) int local14 = arg1 >> 5;
		@Pc(19) Class5_Sub4 local19 = this.aClass5_Sub4Array5[local14];
		if (local19 == null) {
			this.aClass5_Sub4Array6[local14] = arg0;
		} else {
			local19.aClass5_Sub4_8 = arg0;
		}
		this.aClass5_Sub4Array5[local14] = arg0;
		arg0.anInt5229 = arg1;
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "()V")
	protected void method7449() throws Exception {
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(II)V")
	private void method7450() {
		this.anInt8660 -= 256;
		if (this.anInt8660 < 0) {
			this.anInt8660 = 0;
		}
		if (this.aClass5_Sub4_9 != null) {
			this.aClass5_Sub4_9.method4712(256);
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "([II)V")
	private void method7452(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static404.aBoolean460) {
			local1 = 512;
		}
		Static693.method8321(arg0, 0, local1);
		this.anInt8660 -= 256;
		if (this.aClass5_Sub4_9 != null && this.anInt8660 <= 0) {
			this.anInt8660 += Static417.anInt7038 >> 4;
			Static416.method6122(0, this.aClass5_Sub4_9);
			this.method7448(this.aClass5_Sub4_9, this.aClass5_Sub4_9.method4708());
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
						@Pc(92) Class5_Sub4 local92 = null;
						@Pc(97) Class5_Sub4 local97 = this.aClass5_Sub4Array6[local58];
						label97: while (true) {
							while (true) {
								if (local97 == null) {
									break label97;
								}
								@Pc(101) Class5_Sub27 local101 = local97.aClass5_Sub27_6;
								if (local101 == null || local101.anInt4765 <= local63) {
									local97.aBoolean334 = true;
									@Pc(127) int local127 = local97.method4710();
									local47 += local127;
									if (local101 != null) {
										local101.anInt4765 += local127;
									}
									if (local47 >= this.anInt8645) {
										break label103;
									}
									@Pc(148) Class5_Sub4 local148 = local97.method4711();
									if (local148 != null) {
										@Pc(153) int local153 = local97.anInt5229;
										while (local148 != null) {
											this.method7448(local148, local153 * local148.method4708() >> 8);
											local148 = local97.method4714();
										}
									}
									@Pc(172) Class5_Sub4 local172 = local97.aClass5_Sub4_8;
									local97.aClass5_Sub4_8 = null;
									if (local92 == null) {
										this.aClass5_Sub4Array6[local58] = local172;
									} else {
										local92.aClass5_Sub4_8 = local172;
									}
									if (local172 == null) {
										this.aClass5_Sub4Array5[local58] = local92;
									}
									local97 = local172;
								} else {
									local49 |= 0x1 << local58;
									local92 = local97;
									local97 = local97.aClass5_Sub4_8;
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
				@Pc(218) Class5_Sub4 local218 = this.aClass5_Sub4Array6[local58];
				this.aClass5_Sub4Array6[local58] = this.aClass5_Sub4Array5[local58] = null;
				while (local218 != null) {
					@Pc(232) Class5_Sub4 local232 = local218.aClass5_Sub4_8;
					local218.aClass5_Sub4_8 = null;
					local218 = local232;
				}
			}
		}
		if (this.anInt8660 < 0) {
			this.anInt8660 = 0;
		}
		if (this.aClass5_Sub4_9 != null) {
			this.aClass5_Sub4_9.method4713(arg0, 0, 256);
		}
		this.aLong251 = Static480.method6763();
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Z)V")
	public final synchronized void method7454() {
		if (this.aBoolean568) {
			return;
		}
		@Pc(13) long local13 = Static480.method6763();
		try {
			if (this.aLong251 + 6000L < local13) {
				this.aLong251 = local13 - 6000L;
			}
			while (local13 > this.aLong251 + 5000L) {
				this.method7450();
				this.aLong251 += (long) (256000 / Static417.anInt7038);
				local13 = Static480.method6763();
			}
		} catch (@Pc(70) Exception local70) {
			this.aLong251 = local13;
		}
		if (this.anIntArray495 == null) {
			return;
		}
		try {
			if (this.aLong252 != 0L) {
				if (local13 < this.aLong252) {
					return;
				}
				this.method7456(this.anInt8661);
				this.aBoolean569 = true;
				this.aLong252 = 0L;
			}
			@Pc(109) int local109 = this.method7460();
			if (this.anInt8657 < this.anInt8658 - local109) {
				this.anInt8657 = this.anInt8658 - local109;
			}
			@Pc(131) int local131 = this.anInt8659 + this.anInt8662;
			if (local131 + 256 > 16384) {
				local131 = 16128;
			}
			if (local131 + 256 > this.anInt8661) {
				this.anInt8661 += 1024;
				if (this.anInt8661 > 16384) {
					this.anInt8661 = 16384;
				}
				this.method7447();
				this.method7456(this.anInt8661);
				local109 = 0;
				if (local131 + 256 > this.anInt8661) {
					local131 = this.anInt8661 - 256;
					this.anInt8659 = local131 - this.anInt8662;
				}
				this.aBoolean569 = true;
			}
			while (local109 < local131) {
				this.method7452(this.anIntArray495);
				this.method7449();
				local109 += 256;
			}
			if (this.aLong253 < local13) {
				if (this.aBoolean569) {
					this.aBoolean569 = false;
				} else if (this.anInt8657 == 0 && this.anInt8656 == 0) {
					this.method7447();
					this.aLong252 = local13 + 2000L;
					return;
				} else {
					this.anInt8659 = Math.min(this.anInt8656, this.anInt8657);
					this.anInt8656 = this.anInt8657;
				}
				this.aLong253 = local13 + 2000L;
				this.anInt8657 = 0;
			}
			this.anInt8658 = local109;
		} catch (@Pc(285) Exception local285) {
			this.method7447();
			this.aLong252 = local13 + 2000L;
		}
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)V")
	public final synchronized void method7455() {
		this.aBoolean569 = true;
		try {
			this.method7458();
		} catch (@Pc(16) Exception local16) {
			this.method7447();
			this.aLong252 = Static480.method6763() + 2000L;
		}
	}

	@OriginalMember(owner = "client!eca", name = "c", descriptor = "(I)V")
	public void method7456(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(BLclient!ef;)V")
	public final synchronized void method7457(@OriginalArg(1) Class5_Sub4 arg0) {
		this.aClass5_Sub4_9 = arg0;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "()V")
	protected void method7458() throws Exception {
	}

	@OriginalMember(owner = "client!eca", name = "d", descriptor = "(I)V")
	public final synchronized void method7459() {
		if (Static205.aClass6_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static205.aClass6_1.aClass45Array1[local11] == this) {
					Static205.aClass6_1.aClass45Array1[local11] = null;
				}
				if (Static205.aClass6_1.aClass45Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static205.aClass6_1.aBoolean7 = true;
				while (Static205.aClass6_1.aBoolean8) {
					Static620.method7045(-4, 50L);
				}
				Static205.aClass6_1 = null;
			}
		}
		this.method7447();
		this.aBoolean568 = true;
		this.anIntArray495 = null;
	}

	@OriginalMember(owner = "client!eca", name = "d", descriptor = "()I")
	protected int method7460() throws Exception {
		return this.anInt8661;
	}

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method7461(@OriginalArg(0) Component arg0) throws Exception {
	}
}
