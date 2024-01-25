import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ah")
public final class Class12 {

	@OriginalMember(owner = "client!ah", name = "h", descriptor = "Z")
	public boolean aBoolean32 = true;

	@OriginalMember(owner = "client!ah", name = "o", descriptor = "I")
	private int anInt539 = -1;

	@OriginalMember(owner = "client!ah", name = "d", descriptor = "I")
	private final int anInt533;

	@OriginalMember(owner = "client!ah", name = "l", descriptor = "Lclient!mw;")
	private final Class218 aClass218_1;

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "I")
	private final int anInt531;

	@OriginalMember(owner = "client!ah", name = "p", descriptor = "Lclient!ap;")
	private final Class9_Sub2 aClass9_Sub2_1;

	@OriginalMember(owner = "client!ah", name = "m", descriptor = "I")
	private final int anInt538;

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "Lclient!fm;")
	private Interface3 anInterface3_1;

	@OriginalMember(owner = "client!ah", name = "q", descriptor = "Lclient!us;")
	private Class14_Sub2 aClass14_Sub2_1;

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "Lclient!kp;")
	private Class132_Sub1 aClass132_Sub1_1;

	@OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Lclient!ap;Lclient!mw;Lclient!mh;IIIII)V")
	public Class12(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) Class218 arg1, @OriginalArg(2) Class62_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt533 = arg6;
		this.aClass218_1 = arg1;
		this.anInt531 = arg7;
		this.aClass9_Sub2_1 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = arg2.anInt9881 * (local35 + local37) + local31;
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray5[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt538 = local27;
		if (local27 <= 0) {
			this.aClass132_Sub1_1 = null;
		} else {
			@Pc(86) Class6_Sub26 local86 = new Class6_Sub26(local27 * 2);
			@Pc(105) int local105;
			@Pc(113) short[] local113;
			@Pc(117) int local117;
			@Pc(103) int local103;
			if (this.aClass9_Sub2_1.aBoolean65) {
				for (local51 = 0; local51 < local25; local51++) {
					local103 = (local51 + local35) * arg2.anInt9881 + local31;
					for (local105 = 0; local105 < local25; local105++) {
						local113 = arg2.aShortArrayArray5[local103++];
						if (local113 != null) {
							for (local117 = 0; local117 < local113.length; local117++) {
								local86.method4962(local113[local117] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local103 = local31 + arg2.anInt9881 * (local35 + local51);
					for (local105 = 0; local105 < local25; local105++) {
						local113 = arg2.aShortArrayArray5[local103++];
						if (local113 != null) {
							for (local117 = 0; local117 < local113.length; local117++) {
								local86.method4993(local113[local117] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface3_1 = this.aClass9_Sub2_1.method807(false, local86.aByteArray65, local86.anInt5769);
			this.aClass14_Sub2_1 = new Class14_Sub2(this.aClass9_Sub2_1, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBLclient!fm;)V")
	private void method619(@OriginalArg(0) int arg0, @OriginalArg(2) Interface3 arg1) {
		if (arg0 != 0) {
			this.method623();
			this.aClass9_Sub2_1.method814(this.aClass132_Sub1_1);
			this.aClass9_Sub2_1.method790(arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(III[B)V")
	public void method620(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		this.aClass14_Sub2_1.method7657(arg0 * this.aClass9_Sub2_1.method749(5123), arg1);
		this.method619(arg0, this.aClass14_Sub2_1);
	}

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "(B)V")
	public void method622() {
		this.method619(this.anInt538, this.anInterface3_1);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(I)V")
	private void method623() {
		if (!this.aBoolean32) {
			return;
		}
		this.aBoolean32 = false;
		@Pc(16) byte[] local16 = this.aClass218_1.aByteArray72;
		@Pc(20) byte[] local20 = this.aClass9_Sub2_1.aByteArray22;
		@Pc(22) int local22 = 0;
		@Pc(26) int local26 = this.aClass218_1.anInt6200;
		@Pc(43) int local43 = this.anInt533 + this.anInt531 * this.aClass218_1.anInt6200;
		@Pc(56) int local56;
		for (@Pc(45) int local45 = -128; local45 < 0; local45++) {
			local22 = (local22 << 8) - local22;
			for (local56 = -128; local56 < 0; local56++) {
				if (local16[local43++] != 0) {
					local22++;
				}
			}
			local43 += local26 - 128;
		}
		if (this.aClass132_Sub1_1 != null && local22 == this.anInt539) {
			this.aBoolean32 = false;
			return;
		}
		this.anInt539 = local22;
		local43 = this.anInt531 * local26 + this.anInt533;
		local56 = 0;
		for (@Pc(112) int local112 = -128; local112 < 0; local112++) {
			for (@Pc(116) int local116 = -128; local116 < 0; local116++) {
				if (local16[local43] == 0) {
					@Pc(131) int local131 = 0;
					if (local16[local43 - 1] != 0) {
						local131++;
					}
					if (local16[local43 + 1] != 0) {
						local131++;
					}
					if (local16[local43 - local26] != 0) {
						local131++;
					}
					if (local16[local43 + local26] != 0) {
						local131++;
					}
					local20[local56++] = (byte) (local131 * 17);
				} else {
					local20[local56++] = 68;
				}
				local43++;
			}
			local43 += this.aClass218_1.anInt6200 - 128;
		}
		if (this.aClass132_Sub1_1 == null) {
			this.aClass132_Sub1_1 = new Class132_Sub1(this.aClass9_Sub2_1, 3553, 6406, 128, 128, false, this.aClass9_Sub2_1.aByteArray22, 6406, false);
			this.aClass132_Sub1_1.method3694(false, false);
			this.aClass132_Sub1_1.method5614(true);
		} else {
			this.aClass132_Sub1_1.method3698(this.aClass9_Sub2_1.aByteArray22, 128, false, 128, 6406);
		}
	}
}
