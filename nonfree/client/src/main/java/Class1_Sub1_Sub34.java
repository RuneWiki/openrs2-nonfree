import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!te")
public final class Class1_Sub1_Sub34 extends Class1_Sub1 {

	@OriginalMember(owner = "client!te", name = "G", descriptor = "[Lclient!kr;")
	public static final Class196[] aClass196Array1 = new Class196[5];

	@OriginalMember(owner = "client!te", name = "z", descriptor = "I")
	private int anInt8712 = 4096;

	@OriginalMember(owner = "client!te", name = "J", descriptor = "I")
	private int anInt8720 = 4096;

	@OriginalMember(owner = "client!te", name = "I", descriptor = "I")
	private int anInt8719 = 4096;

	static {
		for (@Pc(12) int local12 = 0; local12 < aClass196Array1.length; local12++) {
			aClass196Array1[local12] = new Class196();
		}
	}

	@OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub34() {
		super(1, false);
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(BILclient!ac;)V")
	@Override
	public void method7835(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 0) {
			this.anInt8712 = arg1.method7945();
		} else if (arg0 == 1) {
			this.anInt8719 = arg1.method7945();
		} else if (arg0 == 2) {
			this.anInt8720 = arg1.method7945();
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method7832(@OriginalArg(0) int arg0) {
		@Pc(11) int[][] local11 = super.aClass241_41.method5268(arg0);
		if (super.aClass241_41.aBoolean505) {
			@Pc(27) int[][] local27 = this.method7833(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local11[0];
			@Pc(47) int[] local47 = local11[1];
			@Pc(51) int[] local51 = local11[2];
			for (@Pc(53) int local53 = 0; local53 < Static501.anInt8748; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(63) int local63 = local39[local53];
				@Pc(67) int local67 = local35[local53];
				if (local59 == local63 && local63 == local67) {
					local43[local53] = local59 * this.anInt8712 >> 12;
					local47[local53] = this.anInt8719 * local63 >> 12;
					local51[local53] = this.anInt8720 * local67 >> 12;
				} else {
					local43[local53] = this.anInt8712;
					local47[local53] = this.anInt8719;
					local51[local53] = this.anInt8720;
				}
			}
		}
		return local11;
	}
}
