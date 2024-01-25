import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bk")
public final class Class42 {

	@OriginalMember(owner = "client!bk", name = "b", descriptor = "[I")
	private final int[] anIntArray82;

	@OriginalMember(owner = "client!bk", name = "g", descriptor = "[I")
	private final int[] anIntArray81;

	@OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(Lclient!et;)V")
	public Class42(@OriginalArg(0) Class2_Sub20 arg0) {
		@Pc(7) int local7 = arg0.method8592(255);
		this.anIntArray82 = new int[local7];
		this.anIntArray81 = new int[local7];
		for (@Pc(17) int local17 = 0; local17 < local7; local17++) {
			@Pc(23) int local23 = arg0.method8581(-17416);
			this.anIntArray81[local17] = local23;
			@Pc(32) int local32 = arg0.method8575();
			@Pc(36) int local36 = arg0.method8575();
			this.anIntArray82[local17] = (local32 << 16) + local36;
		}
	}

	@OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLclient!ch;I)V")
	public void method755(@OriginalArg(1) Class61 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) int local10 = this.anIntArray82[0];
		arg0.method1236(local10 & 0xFFFF, local10 >>> 16, arg1);
		@Pc(24) Class4_Sub2_Sub1_Sub2 local24 = arg0.method1238();
		local24.anInt2371 = 0;
		for (@Pc(40) int local40 = this.anIntArray81.length - 1; local40 >= 0; local40--) {
			@Pc(47) int local47 = this.anIntArray81[local40];
			@Pc(52) int local52 = this.anIntArray82[local40];
			local24.anIntArray183[local24.anInt2371] = local52 >> 16;
			local24.anIntArray182[local24.anInt2371] = local52 & 0xFFFF;
			@Pc(70) byte local70 = 1;
			if (local47 == 0) {
				local70 = 0;
			} else if (local47 == 2) {
				local70 = 2;
			}
			local24.aByteArray27[local24.anInt2371] = local70;
			local24.anInt2371++;
		}
	}
}
