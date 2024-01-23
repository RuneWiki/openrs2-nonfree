import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vj")
public final class Class1_Sub1_Sub38 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vj", name = "db", descriptor = "I")
	private int anInt4641 = 4096;

	@OriginalMember(owner = "client!vj", name = "mb", descriptor = "I")
	private int anInt4647 = 0;

	@OriginalMember(owner = "client!vj", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub38() {
		super(1, true);
	}

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "(II)[I")
	@Override
	public int[] method3729(@OriginalArg(1) int arg0) {
		@Pc(18) int[] local18 = super.aClass17_41.method474(arg0);
		if (super.aClass17_41.aBoolean24) {
			@Pc(28) int[] local28 = this.method3733(arg0, 0);
			for (@Pc(30) int local30 = 0; local30 < Static157.anInt3431; local30++) {
				@Pc(36) int local36 = local28[local30];
				local18[local30] = local36 >= this.anInt4647 && local36 <= this.anInt4641 ? 4096 : 0;
			}
		}
		return local18;
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lclient!k;BI)V")
	@Override
	public void method3738(@OriginalArg(0) Class1_Sub16 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4647 = arg0.method3805();
		} else if (arg1 == 1) {
			this.anInt4641 = arg0.method3805();
		}
	}
}
