import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vc")
public final class Class14_Sub7_Sub36 extends Class14_Sub7 {

	@OriginalMember(owner = "client!vc", name = "L", descriptor = "I")
	private int anInt10457 = 4096;

	@OriginalMember(owner = "client!vc", name = "P", descriptor = "I")
	private int anInt10453 = 4096;

	@OriginalMember(owner = "client!vc", name = "R", descriptor = "I")
	private int anInt10455 = 4096;

	@OriginalMember(owner = "client!vc", name = "<init>", descriptor = "()V")
	public Class14_Sub7_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(ILclient!jc;I)V")
	@Override
	public void method9391(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub21 arg1) {
		if (arg0 == 0) {
			this.anInt10457 = arg1.method7717(-1978450544);
		} else if (arg0 == 1) {
			this.anInt10455 = arg1.method7717(-1978450544);
		} else if (arg0 == 2) {
			this.anInt10453 = arg1.method7717(-1978450544);
		}
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method9388(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass340_41.method8152(arg0);
		if (super.aClass340_41.aBoolean655) {
			@Pc(27) int[][] local27 = this.method9384(arg0, 0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static613.anInt10114; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(63) int local63 = local39[local53];
				@Pc(67) int local67 = local35[local53];
				if (local59 == local63 && local67 == local63) {
					local43[local53] = this.anInt10457 * local59 >> 12;
					local47[local53] = this.anInt10455 * local63 >> 12;
					local51[local53] = this.anInt10453 * local67 >> 12;
				} else {
					local43[local53] = this.anInt10457;
					local47[local53] = this.anInt10455;
					local51[local53] = this.anInt10453;
				}
			}
		}
		return local11;
	}
}
