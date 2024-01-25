import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class115 {

	@OriginalMember(owner = "client!i", name = "a", descriptor = "Z")
	public boolean aBoolean216 = true;

	@OriginalMember(owner = "client!i", name = "p", descriptor = "I")
	private int anInt3021 = -1;

	@OriginalMember(owner = "client!i", name = "e", descriptor = "I")
	private final int anInt3016;

	@OriginalMember(owner = "client!i", name = "d", descriptor = "I")
	private final int anInt3015;

	@OriginalMember(owner = "client!i", name = "c", descriptor = "Lclient!bv;")
	private final Class30_Sub1 aClass30_Sub1_21;

	@OriginalMember(owner = "client!i", name = "f", descriptor = "Lclient!tn;")
	private final Class231 aClass231_1;

	@OriginalMember(owner = "client!i", name = "b", descriptor = "I")
	private final int anInt3014;

	@OriginalMember(owner = "client!i", name = "n", descriptor = "Lclient!wg;")
	private Class1_Sub3 aClass1_Sub3_7;

	@OriginalMember(owner = "client!i", name = "m", descriptor = "Lclient!tu;")
	private Interface12 anInterface12_4;

	@OriginalMember(owner = "client!i", name = "h", descriptor = "Lclient!mv;")
	private Class45_Sub2 aClass45_Sub2_1;

	@OriginalMember(owner = "client!i", name = "<init>", descriptor = "(Lclient!bv;Lclient!tn;Lclient!lh;IIIII)V")
	public Class115(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) Class231 arg1, @OriginalArg(2) Class146_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt3016 = arg7;
		this.anInt3015 = arg6;
		this.aClass30_Sub1_21 = arg0;
		this.aClass231_1 = arg1;
		@Pc(25) int local25 = 0x1 << arg5;
		@Pc(27) int local27 = 0;
		@Pc(31) int local31 = arg3 << arg5;
		@Pc(35) int local35 = arg4 << arg5;
		@Pc(51) int local51;
		for (@Pc(37) int local37 = 0; local37 < local25; local37++) {
			@Pc(49) int local49 = local31 + (local35 + local37) * arg2.anInt4730;
			for (local51 = 0; local51 < local25; local51++) {
				@Pc(59) short[] local59 = arg2.aShortArrayArray6[local49++];
				if (local59 != null) {
					local27 += local59.length;
				}
			}
		}
		this.anInt3014 = local27;
		if (local27 <= 0) {
			this.aClass1_Sub3_7 = null;
		} else {
			@Pc(98) Class4_Sub30 local98 = new Class4_Sub30(local27 * 2);
			@Pc(117) int local117;
			@Pc(125) short[] local125;
			@Pc(129) int local129;
			@Pc(115) int local115;
			if (this.aClass30_Sub1_21.aBoolean76) {
				for (local51 = 0; local51 < local25; local51++) {
					local115 = arg2.anInt4730 * (local35 + local51) + local31;
					for (local117 = 0; local117 < local25; local117++) {
						local125 = arg2.aShortArrayArray6[local115++];
						if (local125 != null) {
							for (local129 = 0; local129 < local125.length; local129++) {
								local98.method4846(local125[local129] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local51 = 0; local51 < local25; local51++) {
					local115 = local31 + arg2.anInt4730 * (local35 + local51);
					for (local117 = 0; local117 < local25; local117++) {
						local125 = arg2.aShortArrayArray6[local115++];
						if (local125 != null) {
							for (local129 = 0; local129 < local125.length; local129++) {
								local98.method4874(local125[local129] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface12_4 = this.aClass30_Sub1_21.method945(local98.aByteArray79, false, local98.anInt6244);
			this.aClass45_Sub2_1 = new Class45_Sub2(this.aClass30_Sub1_21, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
	public void method2374() {
		this.method2377(this.anInterface12_4, this.anInt3014);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
	private void method2375() {
		if (!this.aBoolean216) {
			return;
		}
		this.aBoolean216 = false;
		@Pc(24) byte[] local24 = this.aClass231_1.aByteArray87;
		@Pc(26) byte[] local26 = Static115.aByteArray18;
		@Pc(28) int local28 = 0;
		@Pc(32) int local32 = this.aClass231_1.anInt6711;
		@Pc(42) int local42 = this.anInt3015 + this.aClass231_1.anInt6711 * this.anInt3016;
		@Pc(55) int local55;
		for (@Pc(44) int local44 = -128; local44 < 0; local44++) {
			local28 = (local28 << 8) - local28;
			for (local55 = -128; local55 < 0; local55++) {
				if (local24[local42++] != 0) {
					local28++;
				}
			}
			local42 += local32 - 128;
		}
		if (this.aClass1_Sub3_7 != null && this.anInt3021 == local28) {
			this.aBoolean216 = false;
			return;
		}
		this.anInt3021 = local28;
		local42 = this.anInt3016 * local32 + this.anInt3015;
		local55 = 0;
		for (@Pc(107) int local107 = -128; local107 < 0; local107++) {
			for (@Pc(111) int local111 = -128; local111 < 0; local111++) {
				if (local24[local42] == 0) {
					@Pc(119) int local119 = 0;
					if (local24[local42 - 1] != 0) {
						local119++;
					}
					if (local24[local42 + 1] != 0) {
						local119++;
					}
					if (local24[local42 - local32] != 0) {
						local119++;
					}
					if (local24[local32 + local42] != 0) {
						local119++;
					}
					local26[local55++] = (byte) (local119 * 17);
				} else {
					local26[local55++] = 68;
				}
				local42++;
			}
			local42 += this.aClass231_1.anInt6711 - 128;
		}
		if (this.aClass1_Sub3_7 == null) {
			this.aClass1_Sub3_7 = new Class1_Sub3(this.aClass30_Sub1_21, 3553, 6406, 128, 128, false, Static115.aByteArray18, 6406, false);
			this.aClass1_Sub3_7.method3964(false, false);
			this.aClass1_Sub3_7.method4273(true);
		} else {
			this.aClass1_Sub3_7.method3969(Static115.aByteArray18, 6406, 128, false, 128);
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(I[BII)V")
	public void method2376(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		this.aClass45_Sub2_1.method4734(this.aClass30_Sub1_21.method909(5123) * arg1, arg0);
		this.method2377(this.aClass45_Sub2_1, arg1);
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(BLclient!tu;I)V")
	private void method2377(@OriginalArg(1) Interface12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method2375();
			this.aClass30_Sub1_21.method916(this.aClass1_Sub3_7);
			this.aClass30_Sub1_21.method958(0, arg1, arg0);
		}
	}
}
