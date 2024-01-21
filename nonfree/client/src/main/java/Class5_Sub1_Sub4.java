import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ch")
public final class Class5_Sub1_Sub4 extends Class5_Sub1 {

	@OriginalMember(owner = "client!ch", name = "N", descriptor = "[I")
	public static final int[] anIntArray40 = new int[4096];

	@OriginalMember(owner = "client!ch", name = "P", descriptor = "I")
	private int anInt569 = 4096;

	@OriginalMember(owner = "client!ch", name = "T", descriptor = "I")
	private int anInt572 = 4096;

	@OriginalMember(owner = "client!ch", name = "V", descriptor = "I")
	private int anInt573 = 4096;

	static {
		for (@Pc(14) int local14 = 0; local14 < 4096; local14++) {
			anIntArray40[local14] = Static107.method1721(local14);
		}
	}

	@OriginalMember(owner = "client!ch", name = "<init>", descriptor = "()V")
	public Class5_Sub1_Sub4() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method3193(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = super.aClass105_41.method3106(arg0);
		if (super.aClass105_41.aBoolean183) {
			@Pc(23) int[][] local23 = this.method3191(0, arg0);
			@Pc(27) int[] local27 = local13[2];
			@Pc(31) int[] local31 = local23[1];
			@Pc(35) int[] local35 = local23[2];
			@Pc(39) int[] local39 = local13[0];
			@Pc(43) int[] local43 = local13[1];
			@Pc(47) int[] local47 = local23[0];
			for (@Pc(49) int local49 = 0; local49 < Static174.anInt3489; local49++) {
				@Pc(55) int local55 = local47[local49];
				@Pc(59) int local59 = local35[local49];
				@Pc(63) int local63 = local31[local49];
				if (local59 == local55 && local63 == local59) {
					local39[local49] = this.anInt572 * local55 >> 12;
					local43[local49] = local59 * this.anInt569 >> 12;
					local27[local49] = local63 * this.anInt573 >> 12;
				} else {
					local39[local49] = this.anInt572;
					local43[local49] = this.anInt569;
					local27[local49] = this.anInt573;
				}
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lclient!ce;II)V")
	@Override
	public void method3190(@OriginalArg(0) Class5_Sub6 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt572 = arg0.method3077();
		} else if (arg1 == 1) {
			this.anInt569 = arg0.method3077();
		} else if (arg1 == 2) {
			this.anInt573 = arg0.method3077();
		}
	}
}
