import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!li")
public final class Class189 {

	@OriginalMember(owner = "client!li", name = "d", descriptor = "Z")
	public boolean aBoolean421 = true;

	@OriginalMember(owner = "client!li", name = "n", descriptor = "I")
	private int anInt5503 = -1;

	@OriginalMember(owner = "client!li", name = "i", descriptor = "Lclient!gi;")
	private final Class42_Sub3 aClass42_Sub3_18;

	@OriginalMember(owner = "client!li", name = "k", descriptor = "I")
	private final int anInt5500;

	@OriginalMember(owner = "client!li", name = "j", descriptor = "I")
	private final int anInt5499;

	@OriginalMember(owner = "client!li", name = "f", descriptor = "Lclient!wh;")
	private final Class315 aClass315_1;

	@OriginalMember(owner = "client!li", name = "b", descriptor = "I")
	private final int anInt5496;

	@OriginalMember(owner = "client!li", name = "e", descriptor = "Lclient!ob;")
	private Class79_Sub2 aClass79_Sub2_3;

	@OriginalMember(owner = "client!li", name = "c", descriptor = "Lclient!ah;")
	private Interface2 anInterface2_3;

	@OriginalMember(owner = "client!li", name = "p", descriptor = "Lclient!uba;")
	private Class168_Sub2 aClass168_Sub2_1;

	@OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lclient!gi;Lclient!wh;Lclient!ql;IIIII)V")
	public Class189(@OriginalArg(0) Class42_Sub3 arg0, @OriginalArg(1) Class315 arg1, @OriginalArg(2) Class215_Sub2 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.aClass42_Sub3_18 = arg0;
		this.anInt5500 = arg6;
		this.anInt5499 = arg7;
		this.aClass315_1 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = local31 + arg2.anInt9452 * (local35 + local37);
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray7[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt5496 = local27;
		if (local27 <= 0) {
			this.aClass79_Sub2_3 = null;
		} else {
			@Pc(94) Class12_Sub8 local94 = new Class12_Sub8(local27 * 2);
			@Pc(115) int local115;
			@Pc(123) short[] local123;
			@Pc(127) int local127;
			@Pc(113) int local113;
			if (this.aClass42_Sub3_18.aBoolean292) {
				for (local51 = 0; local51 < local25; local51++) {
					local113 = local31 + arg2.anInt9452 * (local35 + local51);
					for (local115 = 0; local115 < local25; local115++) {
						local123 = arg2.aShortArrayArray7[local113++];
						if (local123 != null) {
							for (local127 = 0; local127 < local123.length; local127++) {
								local94.method5190(local123[local127] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local113 = arg2.anInt9452 * (local35 + local51) + local31;
					for (local115 = 0; local115 < local25; local115++) {
						local123 = arg2.aShortArrayArray7[local113++];
						if (local123 != null) {
							for (local127 = 0; local127 < local123.length; local127++) {
								local94.method5201(local123[local127] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface2_3 = this.aClass42_Sub3_18.method3252(local94.anInt6217, false, local94.aByteArray82);
			this.aClass168_Sub2_1 = new Class168_Sub2(this.aClass42_Sub3_18, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "([BIII)V")
	public void method4636(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		this.aClass168_Sub2_1.method7247(arg0, this.aClass42_Sub3_18.method3205(5123) * arg1);
		this.method4638(arg1, this.aClass168_Sub2_1);
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IILclient!ah;)V")
	private void method4638(@OriginalArg(1) int arg0, @OriginalArg(2) Interface2 arg1) {
		if (arg0 != 0) {
			this.method4639();
			this.aClass42_Sub3_18.method3219(this.aClass79_Sub2_3);
			this.aClass42_Sub3_18.method3227(arg1, arg0, 0);
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
	private void method4639() {
		if (!this.aBoolean421) {
			return;
		}
		this.aBoolean421 = false;
		@Pc(22) byte[] local22 = this.aClass315_1.aByteArray115;
		@Pc(26) byte[] local26 = this.aClass42_Sub3_18.aByteArray42;
		@Pc(28) int local28 = 0;
		@Pc(32) int local32 = this.aClass315_1.anInt9529;
		@Pc(42) int local42 = this.anInt5500 + this.anInt5499 * this.aClass315_1.anInt9529;
		@Pc(54) int local54;
		for (@Pc(44) int local44 = -128; local44 < 0; local44++) {
			local28 = (local28 << 8) - local28;
			for (local54 = -128; local54 < 0; local54++) {
				if (local22[local42++] != 0) {
					local28++;
				}
			}
			local42 += local32 - 128;
		}
		if (this.aClass79_Sub2_3 != null && this.anInt5503 == local28) {
			this.aBoolean421 = false;
			return;
		}
		this.anInt5503 = local28;
		local54 = 0;
		local42 = local32 * this.anInt5499 + this.anInt5500;
		for (@Pc(110) int local110 = -128; local110 < 0; local110++) {
			for (@Pc(114) int local114 = -128; local114 < 0; local114++) {
				if (local22[local42] == 0) {
					@Pc(132) int local132 = 0;
					if (local22[local42 - 1] != 0) {
						local132++;
					}
					if (local22[local42 + 1] != 0) {
						local132++;
					}
					if (local22[local42 - local32] != 0) {
						local132++;
					}
					if (local22[local42 + local32] != 0) {
						local132++;
					}
					local26[local54++] = (byte) (local132 * 17);
				} else {
					local26[local54++] = 68;
				}
				local42++;
			}
			local42 += this.aClass315_1.anInt9529 - 128;
		}
		if (this.aClass79_Sub2_3 == null) {
			this.aClass79_Sub2_3 = new Class79_Sub2(this.aClass42_Sub3_18, 3553, 6406, 128, 128, false, this.aClass42_Sub3_18.aByteArray42, 6406, false);
			this.aClass79_Sub2_3.method2529(false, false);
			this.aClass79_Sub2_3.method5278(true);
		} else {
			this.aClass79_Sub2_3.method2528(128, 6406, false, this.aClass42_Sub3_18.aByteArray42, 128);
		}
	}

	@OriginalMember(owner = "client!li", name = "b", descriptor = "(B)V")
	public void method4640() {
		this.method4638(this.anInt5496, this.anInterface2_3);
	}
}
