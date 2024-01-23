import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wi")
public final class Class1_Sub4_Sub39 extends Class1_Sub4 {

	@OriginalMember(owner = "client!wi", name = "I", descriptor = "I")
	private int anInt5690 = 4096;

	@OriginalMember(owner = "client!wi", name = "M", descriptor = "I")
	private int anInt5693 = 4096;

	@OriginalMember(owner = "client!wi", name = "K", descriptor = "I")
	private int anInt5692 = 4096;

	@OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
	public Class1_Sub4_Sub39() {
		super(1, false);
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILclient!lf;I)V")
	@Override
	public void method4747(@OriginalArg(1) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt5690 = arg0.method1386();
		} else if (arg1 == 1) {
			this.anInt5693 = arg0.method1386();
		} else if (arg1 == 2) {
			this.anInt5692 = arg0.method1386();
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method4756(@OriginalArg(0) int arg0) {
		@Pc(13) int[][] local13 = this.aClass85_41.method2339(arg0);
		if (this.aClass85_41.aBoolean171) {
			@Pc(23) int[][] local23 = this.method4749(0, arg0);
			@Pc(27) int[] local27 = local23[0];
			@Pc(31) int[] local31 = local23[1];
			@Pc(35) int[] local35 = local13[0];
			@Pc(39) int[] local39 = local13[2];
			@Pc(43) int[] local43 = local23[2];
			@Pc(47) int[] local47 = local13[1];
			for (@Pc(49) int local49 = 0; local49 < Static182.anInt3492; local49++) {
				@Pc(56) int local56 = local27[local49];
				@Pc(60) int local60 = local31[local49];
				@Pc(64) int local64 = local43[local49];
				if (local64 == local56 && local64 == local60) {
					local35[local49] = this.anInt5690 * local56 >> 12;
					local47[local49] = local64 * this.anInt5693 >> 12;
					local39[local49] = this.anInt5692 * local60 >> 12;
				} else {
					local35[local49] = this.anInt5690;
					local47[local49] = this.anInt5693;
					local39[local49] = this.anInt5692;
				}
			}
		}
		return local13;
	}
}
