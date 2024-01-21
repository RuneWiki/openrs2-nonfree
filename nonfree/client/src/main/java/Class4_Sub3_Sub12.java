import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fi")
public final class Class4_Sub3_Sub12 extends Class4_Sub3 {

	@OriginalMember(owner = "client!fi", name = "U", descriptor = "I")
	private int anInt1359;

	@OriginalMember(owner = "client!fi", name = "Y", descriptor = "I")
	private int anInt1362;

	@OriginalMember(owner = "client!fi", name = "eb", descriptor = "I")
	private int anInt1364;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method3158(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass39_41.method1506(arg0);
		if (super.aClass39_41.aBoolean84) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static134.anInt3188; local34++) {
				local24[local34] = this.anInt1359;
				local28[local34] = this.anInt1364;
				local32[local34] = this.anInt1362;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(II)V")
	private void method1052(@OriginalArg(1) int arg0) {
		this.anInt1364 = arg0 >> 4 & 0xFF0;
		this.anInt1362 = (arg0 & 0xFF) << 4;
		this.anInt1359 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILclient!h;I)V")
	@Override
	public void method3157(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.method1052(arg1.method1225());
		}
	}
}
