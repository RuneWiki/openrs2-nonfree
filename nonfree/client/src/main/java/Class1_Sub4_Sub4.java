import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class1_Sub4_Sub4 extends Class1_Sub4 {

	@OriginalMember(owner = "client!bm", name = "I", descriptor = "I")
	private int anInt445 = 0;

	@OriginalMember(owner = "client!bm", name = "O", descriptor = "I")
	private int anInt450 = 4096;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub4() {
		super(1, true);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt445 = arg0.method1386();
		} else if (arg1 == 1) {
			this.anInt450 = arg0.method1386();
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method4746(@OriginalArg(0) int arg0) {
		@Pc(21) int[] local21 = this.aClass7_41.method116(arg0);
		if (this.aClass7_41.aBoolean4) {
			@Pc(31) int[] local31 = this.method4750(arg0, 0);
			for (@Pc(33) int local33 = 0; local33 < Static182.anInt3492; local33++) {
				@Pc(44) int local44 = local31[local33];
				local21[local33] = this.anInt445 <= local44 && local44 <= this.anInt450 ? 4096 : 0;
			}
		}
		return local21;
	}
}
