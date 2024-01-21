import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tf")
public final class Class3_Sub1_Sub32 extends Class3_Sub1 {

	@OriginalMember(owner = "client!tf", name = "jb", descriptor = "I")
	private int anInt3767;

	@OriginalMember(owner = "client!tf", name = "kb", descriptor = "I")
	private int anInt3768;

	@OriginalMember(owner = "client!tf", name = "lb", descriptor = "I")
	private int anInt3769;

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V")
	private void method2878(@OriginalArg(0) int arg0) {
		this.anInt3769 = arg0 >> 4 & 0xFF0;
		this.anInt3767 = arg0 >> 12 & 0xFF0;
		this.anInt3768 = (arg0 & 0xFF) << 4;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(IZ)[[I")
	@Override
	public int[][] method3121(@OriginalArg(0) int arg0) {
		@Pc(16) int[][] local16 = super.aClass2_39.method10(arg0);
		if (super.aClass2_39.aBoolean1) {
			@Pc(24) int[] local24 = local16[2];
			@Pc(28) int[] local28 = local16[0];
			@Pc(32) int[] local32 = local16[1];
			for (@Pc(34) int local34 = 0; local34 < Static129.anInt3285; local34++) {
				local28[local34] = this.anInt3767;
				local32[local34] = this.anInt3769;
				local24[local34] = this.anInt3768;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!tf", name = "a", descriptor = "(ILclient!hd;I)V")
	@Override
	public void method3118(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub8 arg1) {
		if (arg0 == 0) {
			this.method2878(arg1.method1554());
		}
	}
}
