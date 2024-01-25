import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ka")
public final class Class168 {

	@OriginalMember(owner = "client!ka", name = "e", descriptor = "Z")
	public boolean aBoolean347 = true;

	@OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
	private int anInt5020 = -1;

	@OriginalMember(owner = "client!ka", name = "q", descriptor = "Lclient!jj;")
	private final Class62_Sub3 aClass62_Sub3_16;

	@OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
	private final int anInt5010;

	@OriginalMember(owner = "client!ka", name = "m", descriptor = "Lclient!mr;")
	private final Class202 aClass202_1;

	@OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
	private final int anInt5016;

	@OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
	private final int anInt5018;

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "Lclient!hp;")
	private Class4_Sub2 aClass4_Sub2_2;

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "Lclient!gw;")
	private Interface6 anInterface6_4;

	@OriginalMember(owner = "client!ka", name = "j", descriptor = "Lclient!rca;")
	private Class113_Sub2 aClass113_Sub2_2;

	@OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lclient!jj;Lclient!mr;Lclient!vh;IIIII)V")
	public Class168(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) Class202 arg1, @OriginalArg(2) Class131_Sub3 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass62_Sub3_16 = arg0;
		this.anInt5010 = arg7;
		this.aClass202_1 = arg1;
		this.anInt5016 = arg6;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(50) int local50;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(48) int local48 = local31 + (local35 + local37) * arg2.anInt8873;
			for (local50 = 0; local50 < local25; local50++) {
				@Pc(58) short[] local58 = arg2.aShortArrayArray9[local48++];
				if (local58 != null) {
					local27 += local58.length;
				}
			}
		}
		this.anInt5018 = local27;
		if (local27 <= 0) {
			this.aClass4_Sub2_2 = null;
		} else {
			@Pc(97) Class5_Sub3 local97 = new Class5_Sub3(local27 * 2);
			@Pc(117) int local117;
			@Pc(125) short[] local125;
			@Pc(129) int local129;
			@Pc(115) int local115;
			if (this.aClass62_Sub3_16.aBoolean278) {
				for (local50 = 0; local50 < local25; local50++) {
					local115 = local31 + arg2.anInt8873 * (local50 + local35);
					for (local117 = 0; local117 < local25; local117++) {
						local125 = arg2.aShortArrayArray9[local115++];
						if (local125 != null) {
							for (local129 = 0; local129 < local125.length; local129++) {
								local97.method4181(local125[local129] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local50 = 0; local50 < local25; local50++) {
					local115 = (local35 + local50) * arg2.anInt8873 + local31;
					for (local117 = 0; local117 < local25; local117++) {
						local125 = arg2.aShortArrayArray9[local115++];
						if (local125 != null) {
							for (local129 = 0; local129 < local125.length; local129++) {
								local97.method4195(local125[local129] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface6_4 = this.aClass62_Sub3_16.method3953(local97.aByteArray66, false, local97.anInt4960);
			this.aClass113_Sub2_2 = new Class113_Sub2(this.aClass62_Sub3_16, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)V")
	private void method4241() {
		if (!this.aBoolean347) {
			return;
		}
		this.aBoolean347 = false;
		@Pc(16) byte[] local16 = this.aClass202_1.aByteArray82;
		@Pc(20) byte[] local20 = this.aClass62_Sub3_16.aByteArray56;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass202_1.anInt6123;
		@Pc(41) int local41 = this.anInt5016 + this.aClass202_1.anInt6123 * this.anInt5010;
		@Pc(54) int local54;
		for (@Pc(43) int local43 = -128; local43 < 0; local43++) {
			local22 = (local22 << 8) - local22;
			for (local54 = -128; local54 < 0; local54++) {
				if (local16[local41++] != 0) {
					local22++;
				}
			}
			local41 += local26 - 128;
		}
		if (this.aClass4_Sub2_2 != null && local22 == this.anInt5020) {
			this.aBoolean347 = false;
			return;
		}
		this.anInt5020 = local22;
		local41 = this.anInt5010 * local26 + this.anInt5016;
		local54 = 0;
		for (@Pc(100) int local100 = -128; local100 < 0; local100++) {
			for (@Pc(104) int local104 = -128; local104 < 0; local104++) {
				if (local16[local41] == 0) {
					@Pc(122) int local122 = 0;
					if (local16[local41 - 1] != 0) {
						local122++;
					}
					if (local16[local41 + 1] != 0) {
						local122++;
					}
					if (local16[local41 - local26] != 0) {
						local122++;
					}
					if (local16[local26 + local41] != 0) {
						local122++;
					}
					local20[local54++] = (byte) (local122 * 17);
				} else {
					local20[local54++] = 68;
				}
				local41++;
			}
			local41 += this.aClass202_1.anInt6123 - 128;
		}
		if (this.aClass4_Sub2_2 == null) {
			this.aClass4_Sub2_2 = new Class4_Sub2(this.aClass62_Sub3_16, 3553, 6406, 128, 128, false, this.aClass62_Sub3_16.aByteArray56, 6406, false);
			this.aClass4_Sub2_2.method5467(false, false);
			this.aClass4_Sub2_2.method5502(true);
		} else {
			this.aClass4_Sub2_2.method5465(this.aClass62_Sub3_16.aByteArray56, 128, false, 128, 6406);
		}
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)V")
	public void method4244() {
		this.method4246(this.anInterface6_4, this.anInt5018);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(I[BZI)V")
	public void method4245(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		this.aClass113_Sub2_2.method6017(arg0 * this.aClass62_Sub3_16.method3947(5123), arg1);
		this.method4246(this.aClass113_Sub2_2, arg0);
	}

	@OriginalMember(owner = "client!ka", name = "a", descriptor = "(Lclient!gw;BI)V")
	private void method4246(@OriginalArg(0) Interface6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method4241();
			this.aClass62_Sub3_16.method4007(this.aClass4_Sub2_2);
			this.aClass62_Sub3_16.method3938(arg0, 0, arg1);
		}
	}
}
