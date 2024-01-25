import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class1_Sub1_Sub13 extends Class1_Sub1 {

	@OriginalMember(owner = "client!fl", name = "H", descriptor = "I")
	private int anInt2828 = 4096;

	@OriginalMember(owner = "client!fl", name = "C", descriptor = "I")
	private int anInt2825 = 0;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub13() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method7888(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass26_41.method788(arg0);
		if (super.aClass26_41.aBoolean77) {
			@Pc(26) int[] local26 = this.method7882(0, arg0);
			for (@Pc(28) int local28 = 0; local28 < Static87.anInt1964; local28++) {
				@Pc(34) int local34 = local26[local28];
				local16[local28] = local34 >= this.anInt2825 && local34 <= this.anInt2828 ? 4096 : 0;
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILclient!io;I)V")
	@Override
	public void method7881(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub20 arg1) {
		if (arg0 == 0) {
			this.anInt2825 = arg1.method4426();
		} else if (arg0 == 1) {
			this.anInt2828 = arg1.method4426();
		}
	}
}
