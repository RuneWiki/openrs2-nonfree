import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ek")
public final class Class95 {

	@OriginalMember(owner = "client!ek", name = "f", descriptor = "I")
	private int anInt2423 = -1;

	@OriginalMember(owner = "client!ek", name = "m", descriptor = "Z")
	public boolean aBoolean170 = true;

	@OriginalMember(owner = "client!ek", name = "o", descriptor = "Lclient!pc;")
	private final Class33_Sub3 aClass33_Sub3_7;

	@OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
	private final int anInt2428;

	@OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
	private final int anInt2425;

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "Lclient!mj;")
	private final Class233 aClass233_2;

	@OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
	private final int anInt2421;

	@OriginalMember(owner = "client!ek", name = "c", descriptor = "Lclient!bia;")
	private Interface5 anInterface5_3;

	@OriginalMember(owner = "client!ek", name = "j", descriptor = "Lclient!vb;")
	private Class322_Sub2 aClass322_Sub2_1;

	@OriginalMember(owner = "client!ek", name = "r", descriptor = "Lclient!ld;")
	private Class116_Sub2 aClass116_Sub2_1;

	@OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lclient!pc;Lclient!mj;Lclient!cea;IIIII)V")
	public Class95(@OriginalArg(0) Class33_Sub3 arg0, @OriginalArg(1) Class233 arg1, @OriginalArg(2) Class42_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass33_Sub3_7 = arg0;
		this.anInt2428 = arg7;
		this.anInt2425 = arg6;
		this.aClass233_2 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = (local37 + local35) * arg2.anInt8638 + local31;
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray5[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt2421 = local27;
		if (local27 <= 0) {
			this.aClass116_Sub2_1 = null;
		} else {
			@Pc(93) Class4_Sub11 local93 = new Class4_Sub11(local27 * 2);
			@Pc(114) int local114;
			@Pc(122) short[] local122;
			@Pc(126) int local126;
			@Pc(112) int local112;
			if (this.aClass33_Sub3_7.aBoolean555) {
				for (local51 = 0; local51 < local25; local51++) {
					local112 = arg2.anInt8638 * (local35 + local51) + local31;
					for (local114 = 0; local114 < local25; local114++) {
						local122 = arg2.aShortArrayArray5[local112++];
						if (local122 != null) {
							for (local126 = 0; local126 < local122.length; local126++) {
								local93.method8838(local122[local126] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local112 = local31 + arg2.anInt8638 * (local51 + local35);
					for (local114 = 0; local114 < local25; local114++) {
						local122 = arg2.aShortArrayArray5[local112++];
						if (local122 != null) {
							for (local126 = 0; local126 < local122.length; local126++) {
								local93.method8848(local122[local126] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface5_3 = this.aClass33_Sub3_7.method6352(local93.anInt10466, local93.aByteArray107, false);
			this.aClass322_Sub2_1 = new Class322_Sub2(this.aClass33_Sub3_7, 5123, (byte[]) null, 1);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V")
	public void method2326() {
		this.method2327(this.anInt2421, this.anInterface5_3);
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILclient!bia;Z)V")
	private void method2327(@OriginalArg(0) int arg0, @OriginalArg(1) Interface5 arg1) {
		if (arg0 != 0) {
			this.method2330();
			this.aClass33_Sub3_7.method6340(this.aClass116_Sub2_1);
			this.aClass33_Sub3_7.method6348(0, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!ek", name = "a", descriptor = "(BI[BI)V")
	public void method2329(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		this.aClass322_Sub2_1.method8458(this.aClass33_Sub3_7.method6350(5123) * arg0, arg1);
		this.method2327(arg0, this.aClass322_Sub2_1);
	}

	@OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
	private void method2330() {
		if (!this.aBoolean170) {
			return;
		}
		this.aBoolean170 = false;
		@Pc(16) byte[] local16 = this.aClass233_2.aByteArray56;
		@Pc(20) byte[] local20 = this.aClass33_Sub3_7.aByteArray68;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass233_2.anInt5604;
		@Pc(42) int local42 = this.anInt2428 * this.aClass233_2.anInt5604 + this.anInt2425;
		@Pc(55) int local55;
		for (@Pc(44) int local44 = -128; local44 < 0; local44++) {
			local22 = (local22 << 8) - local22;
			for (local55 = -128; local55 < 0; local55++) {
				if (local16[local42++] != 0) {
					local22++;
				}
			}
			local42 += local26 - 128;
		}
		if (this.aClass116_Sub2_1 != null && this.anInt2423 == local22) {
			this.aBoolean170 = false;
			return;
		}
		this.anInt2423 = local22;
		local55 = 0;
		local42 = this.anInt2428 * local26 + this.anInt2425;
		for (@Pc(104) int local104 = -128; local104 < 0; local104++) {
			for (@Pc(108) int local108 = -128; local108 < 0; local108++) {
				if (local16[local42] == 0) {
					@Pc(126) int local126 = 0;
					if (local16[local42 - 1] != 0) {
						local126++;
					}
					if (local16[local42 + 1] != 0) {
						local126++;
					}
					if (local16[local42 - local26] != 0) {
						local126++;
					}
					if (local16[local42 + local26] != 0) {
						local126++;
					}
					local20[local55++] = (byte) (local126 * 17);
				} else {
					local20[local55++] = 68;
				}
				local42++;
			}
			local42 += this.aClass233_2.anInt5604 - 128;
		}
		if (this.aClass116_Sub2_1 == null) {
			this.aClass116_Sub2_1 = new Class116_Sub2(this.aClass33_Sub3_7, 3553, 6406, 128, 128, false, this.aClass33_Sub3_7.aByteArray68, 6406, false);
			this.aClass116_Sub2_1.method6838(false, false);
			this.aClass116_Sub2_1.method8346(true);
		} else {
			this.aClass116_Sub2_1.method6836(6406, false, this.aClass33_Sub3_7.aByteArray68, 128, 128);
		}
	}
}
