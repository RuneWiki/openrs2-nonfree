import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!de")
public final class Class6_Sub1_Sub5 extends Class6_Sub1 {

	@OriginalMember(owner = "client!de", name = "I", descriptor = "I")
	private int anInt2166 = 0;

	@OriginalMember(owner = "client!de", name = "G", descriptor = "I")
	private int anInt2164 = 4096;

	@OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub5() {
		super(1, true);
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8159(@OriginalArg(1) int arg0) {
		@Pc(11) int[] local11 = super.aClass187_41.method4597(arg0);
		if (super.aClass187_41.aBoolean403) {
			@Pc(21) int[] local21 = this.method8165(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static289.anInt5549; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = this.anInt2166 <= local29 && this.anInt2164 >= local29 ? 4096 : 0;
			}
		}
		return local11;
	}

	@OriginalMember(owner = "client!de", name = "a", descriptor = "(ILclient!iaa;Z)V")
	@Override
	public void method8167(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub26 arg1) {
		if (arg0 == 0) {
			this.anInt2166 = arg1.method4999();
		} else if (arg0 == 1) {
			this.anInt2164 = arg1.method4999();
		}
	}
}
