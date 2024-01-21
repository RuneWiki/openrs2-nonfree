import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!i")
public final class Class1_Sub1_Sub19 extends Class1_Sub1 {

	@OriginalMember(owner = "client!i", name = "R", descriptor = "I")
	private int anInt2033;

	@OriginalMember(owner = "client!i", name = "Y", descriptor = "I")
	private int anInt2035;

	@OriginalMember(owner = "client!i", name = "ab", descriptor = "I")
	private int anInt2037;

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3006(@OriginalArg(0) int arg0) {
		@Pc(12) int[][] local12 = super.aClass40_41.method1589(arg0);
		if (super.aClass40_41.aBoolean168) {
			@Pc(24) int[] local24 = local12[0];
			@Pc(28) int[] local28 = local12[1];
			@Pc(32) int[] local32 = local12[2];
			for (@Pc(34) int local34 = 0; local34 < Static65.anInt1933; local34++) {
				local24[local34] = this.anInt2033;
				local28[local34] = this.anInt2035;
				local32[local34] = this.anInt2037;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IILclient!ce;)V")
	@Override
	public void method3011(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub8 arg1) {
		if (arg0 == 0) {
			this.method1485(arg1.method1618());
		}
	}

	@OriginalMember(owner = "client!i", name = "b", descriptor = "(II)V")
	private void method1485(@OriginalArg(1) int arg0) {
		this.anInt2035 = arg0 >> 4 & 0xFF0;
		this.anInt2037 = (arg0 & 0xFF) << 4;
		this.anInt2033 = arg0 >> 12 & 0xFF0;
	}
}
