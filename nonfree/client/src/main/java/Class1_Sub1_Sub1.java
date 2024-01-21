import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!af")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!af", name = "ib", descriptor = "I")
	private int anInt174 = 0;

	@OriginalMember(owner = "client!af", name = "mb", descriptor = "I")
	private int anInt178 = 4096;

	@OriginalMember(owner = "client!af", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub1() {
		super(1, true);
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method3310(@OriginalArg(1) int arg0) {
		@Pc(12) int[] local12 = super.aClass80_41.method2876(arg0);
		if (super.aClass80_41.aBoolean151) {
			@Pc(26) int[] local26 = this.method3303(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static176.anInt3921; local28++) {
				@Pc(34) int local34 = local26[local28];
				local12[local28] = local34 >= this.anInt174 && this.anInt178 >= local34 ? 4096 : 0;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!af", name = "a", descriptor = "(IILclient!wa;)V")
	@Override
	public void method3312(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		if (arg0 == 0) {
			this.anInt174 = arg1.method1753();
		} else if (arg0 == 1) {
			this.anInt178 = arg1.method1753();
		}
	}
}
