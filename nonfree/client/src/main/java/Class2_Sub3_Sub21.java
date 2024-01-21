import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class2_Sub3_Sub21 extends Class2_Sub3 {

	@OriginalMember(owner = "client!q", name = "nb", descriptor = "I")
	private int anInt3074;

	@OriginalMember(owner = "client!q", name = "pb", descriptor = "I")
	private int anInt3075;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method2889(@OriginalArg(1) int arg0) {
		@Pc(15) int[] local15 = super.aClass33_39.method1306(arg0);
		if (super.aClass33_39.aBoolean93) {
			@Pc(25) int[] local25 = this.method2901(0, arg0);
			for (@Pc(27) int local27 = 0; local27 < Static54.anInt1423; local27++) {
				@Pc(33) int local33 = local25[local27];
				local15[local27] = this.anInt3074 <= local33 && local33 <= this.anInt3075 ? 4096 : 0;
			}
		}
		return local15;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(IBLclient!ab;)V")
	@Override
	public void method2904(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub2 arg1) {
		if (arg0 == 0) {
			this.anInt3074 = arg1.method1680();
		} else if (arg0 == 1) {
			this.anInt3075 = arg1.method1680();
		}
	}
}
