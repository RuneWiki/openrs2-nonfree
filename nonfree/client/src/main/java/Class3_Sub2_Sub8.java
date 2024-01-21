import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
public final class Class3_Sub2_Sub8 extends Class3_Sub2 {

	@OriginalMember(owner = "client!ea", name = "Z", descriptor = "[I")
	public static final int[] anIntArray47 = new int[256];

	@OriginalMember(owner = "client!ea", name = "ab", descriptor = "I")
	private int anInt900 = 0;

	@OriginalMember(owner = "client!ea", name = "gb", descriptor = "I")
	private int anInt904 = 4096;

	static {
		for (@Pc(10) int local10 = 0; local10 < 256; local10++) {
			@Pc(13) int local13 = local10;
			for (@Pc(15) int local15 = 0; local15 < 8; local15++) {
				if ((local13 & 0x1) == 1) {
					local13 = local13 >>> 1 ^ 0xEDB88320;
				} else {
					local13 >>>= 0x1;
				}
			}
			anIntArray47[local10] = local13;
		}
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
	public Class3_Sub2_Sub8() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3337(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt900 = arg0.method1270();
		} else if (arg1 == 1) {
			this.anInt904 = arg0.method1270();
		}
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3334(@OriginalArg(0) int arg0) {
		@Pc(7) int[] local7 = super.aClass2_41.method9(arg0);
		if (super.aClass2_41.aBoolean2) {
			@Pc(17) int[] local17 = this.method3328(0, arg0);
			for (@Pc(19) int local19 = 0; local19 < Static190.anInt3865; local19++) {
				@Pc(25) int local25 = local17[local19];
				local7[local19] = this.anInt900 <= local25 && local25 <= this.anInt904 ? 4096 : 0;
			}
		}
		return local7;
	}
}
