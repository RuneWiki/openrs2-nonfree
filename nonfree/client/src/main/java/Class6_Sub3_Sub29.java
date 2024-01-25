import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ra")
public final class Class6_Sub3_Sub29 extends Class6_Sub3 {

	@OriginalMember(owner = "client!ra", name = "L", descriptor = "I")
	private int anInt7764 = 0;

	@OriginalMember(owner = "client!ra", name = "K", descriptor = "I")
	private int anInt7763 = 4096;

	@OriginalMember(owner = "client!ra", name = "<init>", descriptor = "()V")
	public Class6_Sub3_Sub29() {
		super(1, true);
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(ILclient!jr;B)V")
	@Override
	public void method7955(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (arg0 == 0) {
			this.anInt7764 = arg1.method6044();
		} else if (arg0 == 1) {
			this.anInt7763 = arg1.method6044();
		}
	}

	@OriginalMember(owner = "client!ra", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method7954(@OriginalArg(1) int arg0) {
		@Pc(17) int[] local17 = super.aClass137_41.method3408(arg0);
		if (super.aClass137_41.aBoolean306) {
			@Pc(27) int[] local27 = this.method7950(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static35.anInt670; local29++) {
				@Pc(35) int local35 = local27[local29];
				local17[local29] = this.anInt7764 <= local35 && local35 <= this.anInt7763 ? 4096 : 0;
			}
		}
		return local17;
	}
}
