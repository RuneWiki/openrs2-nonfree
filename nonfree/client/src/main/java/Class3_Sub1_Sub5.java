import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bt")
public final class Class3_Sub1_Sub5 extends Class3_Sub1 {

	@OriginalMember(owner = "client!bt", name = "I", descriptor = "I")
	private int anInt1146 = 0;

	@OriginalMember(owner = "client!bt", name = "K", descriptor = "I")
	private int anInt1148 = 4096;

	@OriginalMember(owner = "client!bt", name = "<init>", descriptor = "()V")
	public Class3_Sub1_Sub5() {
		super(1, true);
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(ILclient!fd;I)V")
	@Override
	public void method8372(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub7 arg1) {
		if (arg0 == 0) {
			this.anInt1146 = arg1.method6535();
		} else if (arg0 == 1) {
			this.anInt1148 = arg1.method6535();
		}
	}

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IB)[I")
	@Override
	public int[] method8359(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass313_41.method7619(arg0);
		if (super.aClass313_41.aBoolean787) {
			@Pc(26) int[] local26 = this.method8362(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static131.anInt2935; local28++) {
				@Pc(34) int local34 = local26[local28];
				local11[local28] = local34 >= this.anInt1146 && this.anInt1148 >= local34 ? 4096 : 0;
			}
		}
		return local11;
	}
}
