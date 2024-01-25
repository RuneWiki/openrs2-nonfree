import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aq")
public final class Class12 {

	@OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
	private int anInt277 = -1;

	@OriginalMember(owner = "client!aq", name = "d", descriptor = "Z")
	public boolean aBoolean24 = true;

	@OriginalMember(owner = "client!aq", name = "i", descriptor = "I")
	private final int anInt278;

	@OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
	private final int anInt280;

	@OriginalMember(owner = "client!aq", name = "h", descriptor = "Lclient!wd;")
	private final Class213 aClass213_1;

	@OriginalMember(owner = "client!aq", name = "c", descriptor = "Lclient!ig;")
	private final Class47_Sub2 aClass47_Sub2_3;

	@OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
	private final int anInt279;

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "Lclient!hf;")
	private Class52_Sub1 aClass52_Sub1_1;

	@OriginalMember(owner = "client!aq", name = "f", descriptor = "Lclient!is;")
	private Interface6 anInterface6_1;

	@OriginalMember(owner = "client!aq", name = "b", descriptor = "Lclient!pg;")
	private Class66_Sub2 aClass66_Sub2_1;

	@OriginalMember(owner = "client!aq", name = "<init>", descriptor = "(Lclient!ig;Lclient!wd;Lclient!er;IIIII)V")
	public Class12(@OriginalArg(0) Class47_Sub2 arg0, @OriginalArg(1) Class213 arg1, @OriginalArg(2) Class60_Sub1 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		this.anInt278 = arg6;
		this.anInt280 = arg7;
		this.aClass213_1 = arg1;
		this.aClass47_Sub2_3 = arg0;
		@Pc(23) int local23 = 0x1 << arg5;
		@Pc(25) int local25 = 0;
		@Pc(29) int local29 = arg3 << arg5;
		@Pc(33) int local33 = arg4 << arg5;
		@Pc(48) int local48;
		@Pc(50) int local50;
		for (@Pc(35) int local35 = 0; local35 < local23; local35++) {
			local48 = arg2.anInt2567 * (local35 + local33) + local29;
			for (local50 = 0; local50 < local23; local50++) {
				@Pc(63) short[] local63 = arg2.aShortArrayArray2[local48++];
				if (local63 != null) {
					local25 += local63.length;
				}
			}
		}
		this.anInt279 = local25;
		if (local25 <= 0) {
			this.aClass52_Sub1_1 = null;
		} else {
			@Pc(95) Class4_Sub11 local95 = new Class4_Sub11(local25 * 2);
			@Pc(125) short[] local125;
			@Pc(131) int local131;
			@Pc(116) int local116;
			if (this.aClass47_Sub2_3.aBoolean235) {
				for (local48 = 0; local48 < local23; local48++) {
					local50 = arg2.anInt2567 * (local33 + local48) + local29;
					for (local116 = 0; local116 < local23; local116++) {
						local125 = arg2.aShortArrayArray2[local50++];
						if (local125 != null) {
							for (local131 = 0; local131 < local125.length; local131++) {
								local95.method3402(local125[local131] & 0xFFFF);
							}
						}
					}
				}
			} else {
				for (local48 = 0; local48 < local23; local48++) {
					local50 = local29 + arg2.anInt2567 * (local33 + local48);
					for (local116 = 0; local116 < local23; local116++) {
						local125 = arg2.aShortArrayArray2[local50++];
						if (local125 != null) {
							for (local131 = 0; local131 < local125.length; local131++) {
								local95.method3430(local125[local131] & 0xFFFF);
							}
						}
					}
				}
			}
			this.anInterface6_1 = this.aClass47_Sub2_3.method2819(local95.aByteArray55, local95.anInt3768, false);
			this.aClass66_Sub2_1 = new Class66_Sub2(this.aClass47_Sub2_3, 5123, null, 1);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V")
	public void method258() {
		this.method260(this.anInterface6_1, this.anInt279);
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V")
	private void method259() {
		if (!this.aBoolean24) {
			return;
		}
		this.aBoolean24 = false;
		@Pc(11) byte[] local11 = this.aClass213_1.aByteArray95;
		@Pc(13) byte[] local13 = Static14.aByteArray3;
		@Pc(15) int local15 = 0;
		@Pc(19) int local19 = this.aClass213_1.anInt6573;
		@Pc(29) int local29 = this.aClass213_1.anInt6573 * this.anInt280 + this.anInt278;
		@Pc(31) int local31;
		@Pc(42) int local42;
		for (local31 = -128; local31 < 0; local31++) {
			local15 = (local15 << 8) - local15;
			for (local42 = -128; local42 < 0; local42++) {
				if (local11[local29++] != 0) {
					local15++;
				}
			}
			local29 += local19 - 128;
		}
		if (this.aClass52_Sub1_1 != null && this.anInt277 == local15) {
			this.aBoolean24 = false;
			return;
		}
		this.anInt277 = local15;
		local29 = this.anInt278 + local19 * this.anInt280;
		local31 = 0;
		for (local42 = -128; local42 < 0; local42++) {
			for (@Pc(109) int local109 = -128; local109 < 0; local109++) {
				if (local11[local29] == 0) {
					@Pc(123) int local123 = 0;
					if (local11[local29 - 1] != 0) {
						local123++;
					}
					if (local11[local29 + 1] != 0) {
						local123++;
					}
					if (local11[local29 - local19] != 0) {
						local123++;
					}
					if (local11[local29 + local19] != 0) {
						local123++;
					}
					local13[local31++] = (byte) (local123 * 17);
				} else {
					local13[local31++] = 68;
				}
				local29++;
			}
			local29 += this.aClass213_1.anInt6573 - 128;
		}
		if (this.aClass52_Sub1_1 == null) {
			this.aClass52_Sub1_1 = new Class52_Sub1(this.aClass47_Sub2_3, 3553, 6406, 128, 128, false, Static14.aByteArray3, 6406, false);
			this.aClass52_Sub1_1.method4734(false, false);
			this.aClass52_Sub1_1.method5604(true);
		} else {
			this.aClass52_Sub1_1.method4731(128, 128, Static14.aByteArray3, 6406, false);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(ILclient!is;I)V")
	private void method260(@OriginalArg(1) Interface6 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 0) {
			this.method259();
			this.aClass47_Sub2_3.method2772(this.aClass52_Sub1_1);
			this.aClass47_Sub2_3.method2818(arg0, 0, arg1);
		}
	}

	@OriginalMember(owner = "client!aq", name = "a", descriptor = "(II[BI)V")
	public void method261(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		this.aClass66_Sub2_1.method4258(arg1, this.aClass47_Sub2_3.method2831(5123) * arg0);
		this.method260(this.aClass66_Sub2_1, arg0);
	}
}
