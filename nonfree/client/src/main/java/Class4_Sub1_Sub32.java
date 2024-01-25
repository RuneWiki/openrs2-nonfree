import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class4_Sub1_Sub32 extends Class4_Sub1 {

	@OriginalMember(owner = "client!tb", name = "D", descriptor = "I")
	private int anInt9024 = 0;

	@OriginalMember(owner = "client!tb", name = "F", descriptor = "I")
	private int anInt9026 = 4096;

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	public Class4_Sub1_Sub32() {
		super(1, true);
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(IBLclient!un;)V")
	@Override
	public void method8389(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 0) {
			this.anInt9024 = arg1.method4936();
		} else if (arg0 == 1) {
			this.anInt9026 = arg1.method4936();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8384(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass185_41.method4444(arg0);
		if (super.aClass185_41.aBoolean366) {
			@Pc(29) int[] local29 = this.method8392(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static376.anInt7260; local31++) {
				@Pc(37) int local37 = local29[local31];
				local11[local31] = this.anInt9024 <= local37 && local37 <= this.anInt9026 ? 4096 : 0;
			}
		}
		return local11;
	}
}
