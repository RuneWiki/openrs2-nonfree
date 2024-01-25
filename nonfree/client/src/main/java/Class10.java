import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!al")
public final class Class10 {

	@OriginalMember(owner = "client!al", name = "g", descriptor = "I")
	private int anInt180 = -1;

	@OriginalMember(owner = "client!al", name = "r", descriptor = "Z")
	public boolean aBoolean17 = true;

	@OriginalMember(owner = "client!al", name = "p", descriptor = "I")
	private final int anInt185;

	@OriginalMember(owner = "client!al", name = "i", descriptor = "Lclient!pn;")
	private final Class193 aClass193_1;

	@OriginalMember(owner = "client!al", name = "o", descriptor = "I")
	private final int anInt184;

	@OriginalMember(owner = "client!al", name = "k", descriptor = "Lclient!pg;")
	private final Class163_Sub2 aClass163_Sub2_1;

	@OriginalMember(owner = "client!al", name = "j", descriptor = "I")
	private final int anInt182;

	@OriginalMember(owner = "client!al", name = "d", descriptor = "Lclient!fw;")
	private Interface5 anInterface5_1;

	@OriginalMember(owner = "client!al", name = "l", descriptor = "Lclient!td;")
	private Class83_Sub2 aClass83_Sub2_1;

	@OriginalMember(owner = "client!al", name = "n", descriptor = "Lclient!bd;")
	private Class20_Sub1 aClass20_Sub1_1;

	@OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Lclient!pg;Lclient!pn;Lclient!mr;IIIII)V")
	public Class10(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) Class193 arg1, @OriginalArg(2) Class162_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt185 = arg6;
		this.aClass193_1 = arg1;
		this.anInt184 = arg7;
		this.aClass163_Sub2_1 = arg0;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = (local37 + local35) * arg2.anInt4138 + local31;
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray5[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt182 = local27;
		if (local27 <= 0) {
			this.aClass20_Sub1_1 = null;
		} else {
			@Pc(86) Class2_Sub13 local86 = new Class2_Sub13(local27 * 2);
			@Pc(105) int local105;
			@Pc(113) short[] local113;
			@Pc(117) int local117;
			@Pc(103) int local103;
			if (this.aClass163_Sub2_1.aBoolean374) {
				for (local51 = 0; local51 < local25; local51++) {
					local103 = arg2.anInt4138 * (local51 + local35) + local31;
					for (local105 = 0; local105 < local25; local105++) {
						local113 = arg2.aShortArrayArray5[local103++];
						if (local113 != null) {
							for (local117 = 0; local117 < local113.length; local117++) {
								local86.method3568(local113[local117] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local103 = arg2.anInt4138 * (local51 + local35) + local31;
					for (local105 = 0; local105 < local25; local105++) {
						local113 = arg2.aShortArrayArray5[local103++];
						if (local113 != null) {
							for (local117 = 0; local117 < local113.length; local117++) {
								local86.method3540(local113[local117] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface5_1 = this.aClass163_Sub2_1.method4147(local86.aByteArray52, false, local86.anInt4347);
			this.aClass83_Sub2_1 = new Class83_Sub2(this.aClass163_Sub2_1, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "(ILclient!fw;I)V")
	private void method166(@OriginalArg(0) int arg0, @OriginalArg(1) Interface5 arg1) {
		if (arg0 != 0) {
			this.method168();
			this.aClass163_Sub2_1.method4118(this.aClass20_Sub1_1);
			this.aClass163_Sub2_1.method4105(0, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!al", name = "b", descriptor = "(B)V")
	public void method167() {
		this.method166(this.anInt182, this.anInterface5_1);
	}

	@OriginalMember(owner = "client!al", name = "c", descriptor = "(B)V")
	private void method168() {
		if (!this.aBoolean17) {
			return;
		}
		this.aBoolean17 = false;
		@Pc(16) byte[] local16 = this.aClass193_1.aByteArray68;
		@Pc(20) byte[] local20 = this.aClass163_Sub2_1.aByteArray65;
		@Pc(22) int local22 = 0;
		@Pc(32) int local32 = this.aClass193_1.anInt5359;
		@Pc(42) int local42 = this.anInt184 * this.aClass193_1.anInt5359 + this.anInt185;
		@Pc(55) int local55;
		for (@Pc(44) int local44 = -128; local44 < 0; local44++) {
			local22 = (local22 << 8) - local22;
			for (local55 = -128; local55 < 0; local55++) {
				if (local16[local42++] != 0) {
					local22++;
				}
			}
			local42 += local32 - 128;
		}
		if (this.aClass20_Sub1_1 != null && this.anInt180 == local22) {
			this.aBoolean17 = false;
			return;
		}
		this.anInt180 = local22;
		local55 = 0;
		local42 = this.anInt185 + this.anInt184 * local32;
		for (@Pc(111) int local111 = -128; local111 < 0; local111++) {
			for (@Pc(115) int local115 = -128; local115 < 0; local115++) {
				if (local16[local42] == 0) {
					@Pc(133) int local133 = 0;
					if (local16[local42 - 1] != 0) {
						local133++;
					}
					if (local16[local42 + 1] != 0) {
						local133++;
					}
					if (local16[local42 - local32] != 0) {
						local133++;
					}
					if (local16[local32 + local42] != 0) {
						local133++;
					}
					local20[local55++] = (byte) (local133 * 17);
				} else {
					local20[local55++] = 68;
				}
				local42++;
			}
			local42 += this.aClass193_1.anInt5359 - 128;
		}
		if (this.aClass20_Sub1_1 == null) {
			this.aClass20_Sub1_1 = new Class20_Sub1(this.aClass163_Sub2_1, 3553, 6406, 128, 128, false, this.aClass163_Sub2_1.aByteArray65, 6406, false);
			this.aClass20_Sub1_1.method2040(false, false);
			this.aClass20_Sub1_1.method3113(true);
		} else {
			this.aClass20_Sub1_1.method2046(128, 6406, false, 128, this.aClass163_Sub2_1.aByteArray65);
		}
	}

	@OriginalMember(owner = "client!al", name = "a", descriptor = "([BIII)V")
	public void method169(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		this.aClass83_Sub2_1.method5172(arg1 * this.aClass163_Sub2_1.method4136(5123), arg0);
		this.method166(arg1, this.aClass83_Sub2_1);
	}
}
