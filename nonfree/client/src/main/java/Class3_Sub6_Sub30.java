import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!su")
public final class Class3_Sub6_Sub30 extends Class3_Sub6 {

	@OriginalMember(owner = "client!su", name = "Q", descriptor = "I")
	private int anInt8638 = 4096;

	@OriginalMember(owner = "client!su", name = "R", descriptor = "I")
	private int anInt8639 = 4096;

	@OriginalMember(owner = "client!su", name = "S", descriptor = "I")
	private int anInt8640 = 4096;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub30() {
		super(1, false);
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method8006(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass339_41.method7670(arg0);
		if (super.aClass339_41.aBoolean647) {
			@Pc(27) int[][] local27 = this.method8005(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static481.anInt8358; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(63) int local63 = local39[local53];
				@Pc(67) int local67 = local35[local53];
				if (local59 == local63 && local67 == local63) {
					local43[local53] = this.anInt8639 * local59 >> 12;
					local47[local53] = this.anInt8640 * local63 >> 12;
					local51[local53] = this.anInt8638 * local67 >> 12;
				} else {
					local43[local53] = this.anInt8639;
					local47[local53] = this.anInt8640;
					local51[local53] = this.anInt8638;
				}
			}
		}
		return local17;
	}

	@OriginalMember(owner = "client!su", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt8639 = arg0.method6811();
		} else if (arg1 == 1) {
			this.anInt8640 = arg0.method6811();
		} else if (arg1 == 2) {
			this.anInt8638 = arg0.method6811();
		}
	}
}
