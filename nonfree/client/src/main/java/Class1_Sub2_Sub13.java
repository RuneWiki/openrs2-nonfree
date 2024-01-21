import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class1_Sub2_Sub13 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ie", name = "cb", descriptor = "I")
	private int anInt1932;

	@OriginalMember(owner = "client!ie", name = "hb", descriptor = "I")
	private int anInt1935;

	@OriginalMember(owner = "client!ie", name = "nb", descriptor = "I")
	private int anInt1940;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "(II)V")
	private void method1272(@OriginalArg(1) int arg0) {
		this.anInt1935 = (arg0 & 0xFF) << 4;
		this.anInt1940 = arg0 >> 4 & 0xFF0;
		this.anInt1932 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lclient!jg;II)V")
	@Override
	public void method3120(@OriginalArg(0) Class1_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method1272(arg0.method888());
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3129(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass77_39.method2617(arg0);
		if (super.aClass77_39.aBoolean193) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[2];
			@Pc(32) int[] local32 = local16[1];
			for (@Pc(34) int local34 = 0; local34 < Static110.anInt2825; local34++) {
				local24[local34] = this.anInt1932;
				local32[local34] = this.anInt1940;
				local28[local34] = this.anInt1935;
			}
		}
		return local16;
	}
}
