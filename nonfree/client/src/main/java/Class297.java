import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qa")
public final class Class297 {

	@OriginalMember(owner = "client!qa", name = "f", descriptor = "[I")
	private final int[] anIntArray470;

	@OriginalMember(owner = "client!qa", name = "i", descriptor = "[I")
	private final int[] anIntArray471;

	@OriginalMember(owner = "client!qa", name = "<init>", descriptor = "(Lclient!rba;)V")
	public Class297(@OriginalArg(0) Class3_Sub28 arg0) {
		@Pc(7) int local7 = arg0.method5331();
		this.anIntArray470 = new int[local7];
		this.anIntArray471 = new int[local7];
		for (@Pc(17) int local17 = 0; local17 < local7; local17++) {
			@Pc(23) int local23 = arg0.method5322(-38);
			this.anIntArray470[local17] = local23;
			@Pc(32) int local32 = arg0.method5272();
			@Pc(36) int local36 = arg0.method5272();
			this.anIntArray471[local17] = (local32 << 16) + local36;
		}
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!aj;II)V")
	public void method7235(@OriginalArg(0) Class11 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anIntArray471[0];
		arg0.method294(local10 >>> 16, arg1, local10 & 0xFFFF);
		@Pc(32) Class19_Sub1_Sub3_Sub2 local32 = arg0.method295();
		local32.anInt7824 = 0;
		for (@Pc(41) int local41 = this.anIntArray470.length - 1; local41 >= 0; local41--) {
			@Pc(48) int local48 = this.anIntArray470[local41];
			@Pc(53) int local53 = this.anIntArray471[local41];
			local32.anIntArray430[local32.anInt7824] = local53 >> 16;
			local32.lb[local32.anInt7824] = local53 & 0xFFFF;
			@Pc(71) byte local71 = 1;
			if (local48 == 0) {
				local71 = 0;
			} else if (local48 == 2) {
				local71 = 2;
			}
			local32.aByteArray69[local32.anInt7824] = local71;
			local32.anInt7824++;
		}
	}
}
