import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ji")
public final class Class3_Sub5_Sub15 extends Class3_Sub5 {

	@OriginalMember(owner = "client!ji", name = "O", descriptor = "I")
	private int anInt1812;

	@OriginalMember(owner = "client!ji", name = "Y", descriptor = "I")
	private int anInt1819;

	@OriginalMember(owner = "client!ji", name = "bb", descriptor = "I")
	private int anInt1822;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(IILclient!mb;)V")
	@Override
	public void method3169(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub17 arg1) {
		if (arg0 == 0) {
			this.method1271(arg1.method2136());
		}
	}

	@OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method3172(@OriginalArg(1) int arg0) {
		@Pc(16) int[][] local16 = super.aClass89_41.method2876(arg0);
		if (super.aClass89_41.aBoolean160) {
			@Pc(24) int[] local24 = local16[0];
			@Pc(28) int[] local28 = local16[1];
			@Pc(32) int[] local32 = local16[2];
			for (@Pc(34) int local34 = 0; local34 < Static104.anInt2195; local34++) {
				local24[local34] = this.anInt1812;
				local28[local34] = this.anInt1822;
				local32[local34] = this.anInt1819;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BI)V")
	private void method1271(@OriginalArg(1) int arg0) {
		this.anInt1822 = arg0 >> 4 & 0xFF0;
		this.anInt1819 = (arg0 & 0xFF) << 4;
		this.anInt1812 = arg0 >> 12 & 0xFF0;
	}
}
