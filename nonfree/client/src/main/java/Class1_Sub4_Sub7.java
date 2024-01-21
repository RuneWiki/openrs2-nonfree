import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gd")
public final class Class1_Sub4_Sub7 extends Class1_Sub4 {

	@OriginalMember(owner = "client!gd", name = "Z", descriptor = "I")
	private int anInt1715;

	@OriginalMember(owner = "client!gd", name = "jb", descriptor = "I")
	private int anInt1719;

	@OriginalMember(owner = "client!gd", name = "nb", descriptor = "I")
	private int anInt1722;

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lclient!hc;IZ)V")
	@Override
	public void method3205(@OriginalArg(0) Class1_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.method1131(arg0.method501());
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method3214(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass35_38.method1569(arg0);
		if (super.aClass35_38.aBoolean89) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[2];
			@Pc(32) int[] local32 = local16[1];
			for (@Pc(34) int local34 = 0; local34 < Static73.anInt1888; local34++) {
				local24[local34] = this.anInt1715;
				local32[local34] = this.anInt1719;
				local28[local34] = this.anInt1722;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!gd", name = "c", descriptor = "(II)V")
	private void method1131(@OriginalArg(1) int arg0) {
		this.anInt1722 = (arg0 & 0xFF) << 4;
		this.anInt1715 = arg0 >> 12 & 0xFF0;
		this.anInt1719 = arg0 >> 4 & 0xFF0;
	}
}
