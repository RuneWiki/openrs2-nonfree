import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uea")
public final class Class371 {

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "[I")
	private final int[] anIntArray722;

	@OriginalMember(owner = "client!uea", name = "c", descriptor = "[I")
	private final int[] anIntArray721;

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Lclient!ika;)V")
	public Class371(@OriginalArg(0) Class3_Sub2 arg0) {
		@Pc(7) int local7 = arg0.method2054();
		this.anIntArray722 = new int[local7];
		this.anIntArray721 = new int[local7];
		for (@Pc(17) int local17 = 0; local17 < local7; local17++) {
			@Pc(23) int local23 = arg0.method2048(255);
			this.anIntArray721[local17] = local23;
			@Pc(32) int local32 = arg0.method2028(-14795);
			@Pc(36) int local36 = arg0.method2028(-14795);
			this.anIntArray722[local17] = (local32 << 16) + local36;
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lclient!ae;BI)V")
	public void method8531(@OriginalArg(0) Class7 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anIntArray722[0];
		arg0.method251(local10 & 0xFFFF, arg1, local10 >>> 16);
		@Pc(24) Class9_Sub1_Sub1_Sub2 local24 = arg0.method249();
		local24.anInt8817 = 0;
		for (@Pc(38) int local38 = this.anIntArray721.length - 1; local38 >= 0; local38--) {
			@Pc(45) int local45 = this.anIntArray721[local38];
			@Pc(50) int local50 = this.anIntArray722[local38];
			local24.anIntArray644[local24.anInt8817] = local50 >> 16;
			local24.anIntArray643[local24.anInt8817] = local50 & 0xFFFF;
			@Pc(68) byte local68 = 1;
			if (local45 == 0) {
				local68 = 0;
			} else if (local45 == 2) {
				local68 = 2;
			}
			local24.aByteArray86[local24.anInt8817] = local68;
			local24.anInt8817++;
		}
	}
}
