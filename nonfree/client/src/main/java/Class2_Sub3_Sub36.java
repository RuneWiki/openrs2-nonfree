import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wa")
public final class Class2_Sub3_Sub36 extends Class2_Sub3 {

	@OriginalMember(owner = "client!wa", name = "gb", descriptor = "I")
	private int anInt3951;

	@OriginalMember(owner = "client!wa", name = "ib", descriptor = "I")
	private int anInt3953;

	@OriginalMember(owner = "client!wa", name = "nb", descriptor = "I")
	private int anInt3956;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.method2784(arg1.method1654());
		}
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method2894(@OriginalArg(0) int arg0) {
		@Pc(18) int[][] local18 = super.aClass12_39.method485(arg0);
		if (super.aClass12_39.aBoolean24) {
			@Pc(26) int[] local26 = local18[0];
			@Pc(30) int[] local30 = local18[1];
			@Pc(34) int[] local34 = local18[2];
			for (@Pc(36) int local36 = 0; local36 < Static54.anInt1423; local36++) {
				local26[local36] = this.anInt3953;
				local30[local36] = this.anInt3951;
				local34[local36] = this.anInt3956;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "(BI)V")
	private void method2784(@OriginalArg(1) int arg0) {
		this.anInt3953 = arg0 >> 12 & 0xFF0;
		this.anInt3956 = (arg0 & 0xFF) << 4;
		this.anInt3951 = arg0 >> 4 & 0xFF0;
	}
}
