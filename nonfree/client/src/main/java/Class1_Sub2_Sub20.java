import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lr")
public final class Class1_Sub2_Sub20 extends Class1_Sub2 {

	@OriginalMember(owner = "client!lr", name = "L", descriptor = "I")
	private int anInt4168 = 4096;

	@OriginalMember(owner = "client!lr", name = "M", descriptor = "I")
	private int anInt4169 = 4096;

	@OriginalMember(owner = "client!lr", name = "J", descriptor = "I")
	private int anInt4167 = 4096;

	@OriginalMember(owner = "client!lr", name = "<init>", descriptor = "()V")
	public Class1_Sub2_Sub20() {
		super(1, false);
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(ILclient!ti;I)V")
	@Override
	public void method5863(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt4167 = arg0.method4498();
		} else if (arg1 == 1) {
			this.anInt4169 = arg0.method4498();
		} else if (arg1 == 2) {
			this.anInt4168 = arg0.method4498();
		}
	}

	@OriginalMember(owner = "client!lr", name = "a", descriptor = "(BI)[[I")
	@Override
	public int[][] method5865(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass190_41.method4096(arg0);
		if (super.aClass190_41.aBoolean401) {
			@Pc(27) int[][] local27 = this.method5867(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static410.anInt7198; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(63) int local63 = local39[local53];
				@Pc(67) int local67 = local35[local53];
				if (local63 == local59 && local63 == local67) {
					local43[local53] = local59 * this.anInt4167 >> 12;
					local47[local53] = this.anInt4169 * local63 >> 12;
					local51[local53] = this.anInt4168 * local67 >> 12;
				} else {
					local43[local53] = this.anInt4167;
					local47[local53] = this.anInt4169;
					local51[local53] = this.anInt4168;
				}
			}
		}
		return local17;
	}
}
