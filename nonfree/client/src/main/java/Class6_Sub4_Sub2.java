import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bha")
public final class Class6_Sub4_Sub2 extends Class6_Sub4 {

	@OriginalMember(owner = "client!bha", name = "D", descriptor = "I")
	private int anInt893 = 4096;

	@OriginalMember(owner = "client!bha", name = "F", descriptor = "I")
	private int anInt895 = 4096;

	@OriginalMember(owner = "client!bha", name = "I", descriptor = "I")
	private int anInt897 = 4096;

	@OriginalMember(owner = "client!bha", name = "<init>", descriptor = "()V")
	public Class6_Sub4_Sub2() {
		super(1, false);
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(IILclient!rg;)V")
	@Override
	public void method8314(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub40 arg1) {
		if (arg0 == 0) {
			this.anInt897 = arg1.method8571();
		} else if (arg0 == 1) {
			this.anInt893 = arg1.method8571();
		} else if (arg0 == 2) {
			this.anInt895 = arg1.method8571();
		}
	}

	@OriginalMember(owner = "client!bha", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method8320(@OriginalArg(1) int arg0) {
		@Pc(17) int[][] local17 = super.aClass307_41.method7792(arg0);
		if (super.aClass307_41.aBoolean613) {
			@Pc(27) int[][] local27 = this.method8319(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static6.anInt111; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(63) int local63 = local39[local53];
				@Pc(67) int local67 = local35[local53];
				if (local59 == local63 && local63 == local67) {
					local43[local53] = this.anInt897 * local59 >> 12;
					local47[local53] = local63 * this.anInt893 >> 12;
					local51[local53] = this.anInt895 * local67 >> 12;
				} else {
					local43[local53] = this.anInt897;
					local47[local53] = this.anInt893;
					local51[local53] = this.anInt895;
				}
			}
		}
		return local17;
	}
}
