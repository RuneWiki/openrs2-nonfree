import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!po")
public final class Class272 {

	@OriginalMember(owner = "client!po", name = "k", descriptor = "I")
	private int anInt7263 = -1;

	@OriginalMember(owner = "client!po", name = "n", descriptor = "Z")
	public boolean aBoolean554 = true;

	@OriginalMember(owner = "client!po", name = "p", descriptor = "I")
	private final int anInt7266;

	@OriginalMember(owner = "client!po", name = "b", descriptor = "Lclient!nv;")
	private final Class78_Sub1 aClass78_Sub1_15;

	@OriginalMember(owner = "client!po", name = "i", descriptor = "Lclient!g;")
	private final Class110 aClass110_2;

	@OriginalMember(owner = "client!po", name = "u", descriptor = "I")
	private final int anInt7271;

	@OriginalMember(owner = "client!po", name = "m", descriptor = "I")
	public final int anInt7264;

	@OriginalMember(owner = "client!po", name = "j", descriptor = "Lclient!cm;")
	private Interface5 anInterface5_5;

	@OriginalMember(owner = "client!po", name = "a", descriptor = "I")
	private int anInt7257;

	@OriginalMember(owner = "client!po", name = "e", descriptor = "I")
	private int anInt7260;

	@OriginalMember(owner = "client!po", name = "l", descriptor = "Lclient!jea;")
	private Interface13 anInterface13_6;

	@OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lclient!nv;Lclient!g;Lclient!ida;IIIII)V")
	public Class272(@OriginalArg(0) Class78_Sub1 arg0, @OriginalArg(1) Class110 arg1, @OriginalArg(2) Class129_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt7266 = arg6;
		this.aClass78_Sub1_15 = arg0;
		this.aClass110_2 = arg1;
		this.anInt7271 = arg7;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(49) int local49;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			local49 = (local37 + local35) * arg2.anInt8065 + local31;
			for (@Pc(51) int local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray4[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		if (local27 <= 0) {
			this.anInt7264 = 0;
			this.anInterface5_5 = null;
		} else {
			this.anInt7257 = Integer.MIN_VALUE;
			this.anInt7260 = Integer.MAX_VALUE;
			this.anInterface13_6 = this.aClass78_Sub1_15.method6980(false);
			this.anInterface13_6.method5600(local27);
			for (local49 = 0; local49 < 4; local49++) {
				@Pc(115) Buffer local115 = this.anInterface13_6.method5603();
				if (local115 != null) {
					@Pc(123) Stream local123 = this.aClass78_Sub1_15.method6925(local115);
					@Pc(127) int local127;
					@Pc(138) int local138;
					@Pc(140) int local140;
					@Pc(148) short[] local148;
					@Pc(152) int local152;
					@Pc(160) int local160;
					if (Stream.b()) {
						for (local127 = 0; local127 < local25; local127++) {
							local138 = arg2.anInt8065 * (local127 + local35) + local31;
							for (local140 = 0; local140 < local25; local140++) {
								local148 = arg2.aShortArrayArray4[local138++];
								if (local148 != null) {
									for (local152 = 0; local152 < local148.length; local152++) {
										local160 = local148[local152] & 0xFFFF;
										if (this.anInt7260 > local160) {
											this.anInt7260 = local160;
										}
										if (this.anInt7257 < local160) {
											this.anInt7257 = local160;
										}
										local123.b(local160);
									}
								}
							}
						}
					} else {
						for (local127 = 0; local127 < local25; local127++) {
							local138 = local31 + arg2.anInt8065 * (local127 + local35);
							for (local140 = 0; local140 < local25; local140++) {
								local148 = arg2.aShortArrayArray4[local138++];
								if (local148 != null) {
									for (local152 = 0; local152 < local148.length; local152++) {
										local160 = local148[local152] & 0xFFFF;
										if (local160 < this.anInt7260) {
											this.anInt7260 = local160;
										}
										if (this.anInt7257 < local160) {
											this.anInt7257 = local160;
										}
										local123.c(local160);
									}
								}
							}
						}
					}
					local123.a();
					if (this.anInterface13_6.method5602()) {
						break;
					}
				}
			}
			this.anInt7264 = local27 / 3;
		}
	}

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILclient!jea;I)V")
	public void method5837(@OriginalArg(1) Interface13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 0) {
			this.method5839();
			this.aClass78_Sub1_15.method6931(this.anInterface5_5);
			this.aClass78_Sub1_15.method6947(Static302.aClass77_5, this.anInt7257 + 1 - this.anInt7260, this.anInt7260, arg1, 0, arg0);
		}
	}

	@OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V")
	public void method5838() {
		this.method5837(this.anInterface13_6, this.anInt7264);
	}

	@OriginalMember(owner = "client!po", name = "c", descriptor = "(I)V")
	private void method5839() {
		if (!this.aBoolean554) {
			return;
		}
		this.aBoolean554 = false;
		@Pc(16) byte[] local16 = this.aClass110_2.aByteArray14;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = this.aClass110_2.anInt2852;
		@Pc(32) int local32 = this.anInt7266 + this.aClass110_2.anInt2852 * this.anInt7271;
		@Pc(45) int local45;
		for (@Pc(34) int local34 = -128; local34 < 0; local34++) {
			local18 = (local18 << 8) - local18;
			for (local45 = -128; local45 < 0; local45++) {
				if (local16[local32++] != 0) {
					local18++;
				}
			}
			local32 += local22 - 128;
		}
		if (this.anInterface5_5 != null && local18 == this.anInt7263) {
			this.aBoolean554 = false;
			return;
		}
		this.anInt7263 = local18;
		local32 = this.anInt7271 * local22 + this.anInt7266;
		local45 = 0;
		@Pc(115) int local115;
		@Pc(119) int local119;
		@Pc(134) int local134;
		if (!this.aClass78_Sub1_15.method6869(Static243.aClass172_9, Static268.aClass271_7)) {
			if (Static338.anIntArray364 == null) {
				Static338.anIntArray364 = new int[16384];
			}
			@Pc(240) int[] local240 = Static338.anIntArray364;
			for (local115 = -128; local115 < 0; local115++) {
				for (local119 = -128; local119 < 0; local119++) {
					if (local16[local32] == 0) {
						local134 = 0;
						if (local16[local32 - 1] != 0) {
							local134++;
						}
						if (local16[local32 + 1] != 0) {
							local134++;
						}
						if (local16[local32 - local22] != 0) {
							local134++;
						}
						if (local16[local22 + local32] != 0) {
							local134++;
						}
						local240[local45++] = local134 * 17 << 24;
					} else {
						local240[local45++] = 1140850688;
					}
					local32++;
				}
				local32 += this.aClass110_2.anInt2852 - 128;
			}
			if (this.anInterface5_5 == null) {
				this.anInterface5_5 = this.aClass78_Sub1_15.method6874(false, Static338.anIntArray364, 128, 128);
				this.anInterface5_5.method7314(false, false);
			} else {
				this.anInterface5_5.method7318(128, Static338.anIntArray364, 0, 0, 128, 128);
			}
			return;
		}
		if (Static583.aByteArray102 == null) {
			Static583.aByteArray102 = new byte[16384];
		}
		@Pc(113) byte[] local113 = Static583.aByteArray102;
		for (local115 = -128; local115 < 0; local115++) {
			for (local119 = -128; local119 < 0; local119++) {
				if (local16[local32] == 0) {
					local134 = 0;
					if (local16[local32 - 1] != 0) {
						local134++;
					}
					if (local16[local32 + 1] != 0) {
						local134++;
					}
					if (local16[local32 - local22] != 0) {
						local134++;
					}
					if (local16[local32 + local22] != 0) {
						local134++;
					}
					local113[local45++] = (byte) (local134 * 17);
				} else {
					local113[local45++] = 68;
				}
				local32++;
			}
			local32 += this.aClass110_2.anInt2852 - 128;
		}
		if (this.anInterface5_5 == null) {
			this.anInterface5_5 = this.aClass78_Sub1_15.method6923(Static268.aClass271_7, Static583.aByteArray102, 128, false, 128);
			this.anInterface5_5.method7314(false, false);
		} else {
			this.anInterface5_5.method7311(128, 128, Static268.aClass271_7, 128, Static583.aByteArray102);
		}
	}
}
