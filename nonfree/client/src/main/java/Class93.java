import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!en")
public class Class93 {

	@OriginalMember(owner = "client!en", name = "j", descriptor = "Lclient!aca;")
	private Class5_Sub1 aClass5_Sub1_6;

	@OriginalMember(owner = "client!en", name = "m", descriptor = "[I")
	public int[] anIntArray382;

	@OriginalMember(owner = "client!en", name = "t", descriptor = "I")
	public int anInt7206;

	@OriginalMember(owner = "client!en", name = "v", descriptor = "I")
	private int anInt7208;

	@OriginalMember(owner = "client!en", name = "x", descriptor = "I")
	public int anInt7209;

	@OriginalMember(owner = "client!en", name = "f", descriptor = "Z")
	private boolean aBoolean512 = false;

	@OriginalMember(owner = "client!en", name = "r", descriptor = "I")
	private final int anInt7205 = 32;

	@OriginalMember(owner = "client!en", name = "s", descriptor = "J")
	private long aLong182 = Static95.method1587();

	@OriginalMember(owner = "client!en", name = "z", descriptor = "Z")
	private boolean aBoolean514 = true;

	@OriginalMember(owner = "client!en", name = "B", descriptor = "[Lclient!aca;")
	private final Class5_Sub1[] aClass5_Sub1Array5 = new Class5_Sub1[8];

	@OriginalMember(owner = "client!en", name = "y", descriptor = "J")
	private long aLong184 = 0L;

	@OriginalMember(owner = "client!en", name = "F", descriptor = "[Lclient!aca;")
	private final Class5_Sub1[] aClass5_Sub1Array6 = new Class5_Sub1[8];

	@OriginalMember(owner = "client!en", name = "u", descriptor = "I")
	private int anInt7207 = 0;

	@OriginalMember(owner = "client!en", name = "w", descriptor = "J")
	private long aLong183 = 0L;

	@OriginalMember(owner = "client!en", name = "D", descriptor = "I")
	private int anInt7212 = 0;

	@OriginalMember(owner = "client!en", name = "H", descriptor = "I")
	private int anInt7215 = 0;

	@OriginalMember(owner = "client!en", name = "E", descriptor = "I")
	private int anInt7213 = 0;

	@OriginalMember(owner = "client!en", name = "a", descriptor = "()V")
	protected void method6356() throws Exception {
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
	public final synchronized void method6357() {
		if (Static256.aClass69_1 != null) {
			@Pc(9) boolean local9 = true;
			for (@Pc(11) int local11 = 0; local11 < 2; local11++) {
				if (Static256.aClass69_1.aClass93Array1[local11] == this) {
					Static256.aClass69_1.aClass93Array1[local11] = null;
				}
				if (Static256.aClass69_1.aClass93Array1[local11] != null) {
					local9 = false;
				}
			}
			if (local9) {
				Static256.aClass69_1.aBoolean123 = true;
				while (Static256.aClass69_1.aBoolean122) {
					Static314.method4821(50L);
				}
				Static256.aClass69_1 = null;
			}
		}
		this.method6360();
		this.aBoolean512 = true;
		this.anIntArray382 = null;
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "()V")
	protected void method6360() {
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "()V")
	protected void method6361() throws Exception {
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/awt/Component;)V")
	public void method6362(@OriginalArg(0) Component arg0) throws Exception {
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZLclient!aca;)V")
	public final synchronized void method6363(@OriginalArg(1) Class5_Sub1 arg0) {
		this.aClass5_Sub1_6 = arg0;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(ZI)V")
	private void method6364() {
		this.anInt7215 -= 256;
		if (this.anInt7215 < 0) {
			this.anInt7215 = 0;
		}
		if (this.aClass5_Sub1_6 != null) {
			this.aClass5_Sub1_6.method8287(256);
		}
	}

	@OriginalMember(owner = "client!en", name = "d", descriptor = "()I")
	protected int method6365() throws Exception {
		return this.anInt7206;
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "([II)V")
	private void method6366(@OriginalArg(0) int[] arg0) {
		@Pc(1) short local1 = 256;
		if (Static21.aBoolean12) {
			local1 = 512;
		}
		Static652.method4546(arg0, 0, local1);
		this.anInt7215 -= 256;
		if (this.aClass5_Sub1_6 != null && this.anInt7215 <= 0) {
			this.anInt7215 += Static491.anInt8290 >> 4;
			Static609.method8686(this.aClass5_Sub1_6);
			this.method6370(this.aClass5_Sub1_6, this.aClass5_Sub1_6.method8288());
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
						@Pc(88) Class5_Sub1 local88 = null;
						@Pc(93) Class5_Sub1 local93 = this.aClass5_Sub1Array6[local56];
						label97: while (true) {
							while (true) {
								if (local93 == null) {
									break label97;
								}
								@Pc(97) Class5_Sub37 local97 = local93.aClass5_Sub37_6;
								if (local97 == null || local97.anInt8934 <= local61) {
									local93.aBoolean693 = true;
									@Pc(121) int local121 = local93.method8284();
									local45 += local121;
									if (local97 != null) {
										local97.anInt8934 += local121;
									}
									if (local45 >= this.anInt7205) {
										break label103;
									}
									@Pc(140) Class5_Sub1 local140 = local93.method8282();
									if (local140 != null) {
										@Pc(145) int local145 = local93.anInt9642;
										while (local140 != null) {
											this.method6370(local140, local145 * local140.method8288() >> 8);
											local140 = local93.method8285();
										}
									}
									@Pc(164) Class5_Sub1 local164 = local93.aClass5_Sub1_9;
									local93.aClass5_Sub1_9 = null;
									if (local88 == null) {
										this.aClass5_Sub1Array6[local56] = local164;
									} else {
										local88.aClass5_Sub1_9 = local164;
									}
									if (local164 == null) {
										this.aClass5_Sub1Array5[local56] = local88;
									}
									local93 = local164;
								} else {
									local47 |= 0x1 << local56;
									local88 = local93;
									local93 = local93.aClass5_Sub1_9;
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
				@Pc(207) Class5_Sub1 local207 = this.aClass5_Sub1Array6[local56];
				this.aClass5_Sub1Array6[local56] = this.aClass5_Sub1Array5[local56] = null;
				while (local207 != null) {
					@Pc(221) Class5_Sub1 local221 = local207.aClass5_Sub1_9;
					local207.aClass5_Sub1_9 = null;
					local207 = local221;
				}
			}
		}
		if (this.anInt7215 < 0) {
			this.anInt7215 = 0;
		}
		if (this.aClass5_Sub1_6 != null) {
			this.aClass5_Sub1_6.method8283(arg0, 0, 256);
		}
		this.aLong182 = Static95.method1587();
	}

	@OriginalMember(owner = "client!en", name = "b", descriptor = "(B)V")
	public final synchronized void method6367() {
		this.aBoolean514 = true;
		try {
			this.method6361();
		} catch (@Pc(16) Exception local16) {
			this.method6360();
			this.aLong183 = Static95.method1587() + 2000L;
		}
	}

	@OriginalMember(owner = "client!en", name = "a", descriptor = "(Lclient!aca;II)V")
	private void method6370(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		@Pc(13) int local13 = arg1 >> 5;
		@Pc(18) Class5_Sub1 local18 = this.aClass5_Sub1Array5[local13];
		if (local18 == null) {
			this.aClass5_Sub1Array6[local13] = arg0;
		} else {
			local18.aClass5_Sub1_9 = arg0;
		}
		this.aClass5_Sub1Array5[local13] = arg0;
		arg0.anInt9642 = arg1;
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(I)V")
	public void method6371(@OriginalArg(0) int arg0) throws Exception {
	}

	@OriginalMember(owner = "client!en", name = "c", descriptor = "(B)V")
	public final synchronized void method6372() {
		if (this.aBoolean512) {
			return;
		}
		@Pc(12) long local12 = Static95.method1587();
		try {
			if (this.aLong182 + 6000L < local12) {
				this.aLong182 = local12 - 6000L;
			}
			while (local12 > this.aLong182 + 5000L) {
				this.method6364();
				this.aLong182 += 256000 / Static491.anInt8290;
				local12 = Static95.method1587();
			}
		} catch (@Pc(55) Exception local55) {
			this.aLong182 = local12;
		}
		if (this.anIntArray382 == null) {
			return;
		}
		try {
			if (this.aLong183 != 0L) {
				if (this.aLong183 > local12) {
					return;
				}
				this.method6371(this.anInt7206);
				this.aBoolean514 = true;
				this.aLong183 = 0L;
			}
			@Pc(92) int local92 = this.method6365();
			if (this.anInt7213 < this.anInt7207 - local92) {
				this.anInt7213 = this.anInt7207 - local92;
			}
			@Pc(113) int local113 = this.anInt7208 + this.anInt7209;
			if (local113 + 256 > 16384) {
				local113 = 16128;
			}
			if (local113 + 256 > this.anInt7206) {
				this.anInt7206 += 1024;
				if (this.anInt7206 > 16384) {
					this.anInt7206 = 16384;
				}
				this.method6360();
				this.method6371(this.anInt7206);
				local92 = 0;
				if (local113 + 256 > this.anInt7206) {
					local113 = this.anInt7206 - 256;
					this.anInt7208 = local113 - this.anInt7209;
				}
				this.aBoolean514 = true;
			}
			while (local113 > local92) {
				this.method6366(this.anIntArray382);
				this.method6356();
				local92 += 256;
			}
			if (local12 > this.aLong184) {
				if (this.aBoolean514) {
					this.aBoolean514 = false;
				} else if (this.anInt7213 == 0 && this.anInt7212 == 0) {
					this.method6360();
					this.aLong183 = local12 + 2000L;
					return;
				} else {
					this.anInt7208 = Math.min(this.anInt7212, this.anInt7213);
					this.anInt7212 = this.anInt7213;
				}
				this.aLong184 = local12 + 2000L;
				this.anInt7213 = 0;
			}
			this.anInt7207 = local92;
		} catch (@Pc(248) Exception local248) {
			this.method6360();
			this.aLong183 = local12 + 2000L;
		}
	}
}
