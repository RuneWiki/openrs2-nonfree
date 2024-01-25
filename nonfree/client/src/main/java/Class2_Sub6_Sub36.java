import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ud")
public final class Class2_Sub6_Sub36 extends Class2_Sub6 {

	@OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
	private int anInt6176 = 0;

	@OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
	private int anInt6177 = 4096;

	static {
		new Class221(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
	}

	@OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
	public Class2_Sub6_Sub36() {
		super(1, false);
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lclient!lk;II)V")
	@Override
	public void method5637(@OriginalArg(0) Class2_Sub13 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt6176 = arg0.method4245();
		} else if (arg1 == 1) {
			this.anInt6177 = arg0.method4245();
		} else if (arg1 == 2) {
			super.aBoolean491 = arg0.method4240() == 1;
		}
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(BI)[I")
	@Override
	public int[] method5642(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass166_41.method3993(arg0);
		if (super.aClass166_41.aBoolean336) {
			@Pc(26) int[] local26 = this.method5635(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static151.anInt2711; local28++) {
				@Pc(34) int local34 = local26[local28];
				if (local34 < this.anInt6176) {
					local16[local28] = this.anInt6176;
				} else if (this.anInt6177 < local34) {
					local16[local28] = this.anInt6177;
				} else {
					local16[local28] = local34;
				}
			}
		}
		return local16;
	}

	@OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)[[I")
	@Override
	public int[][] method5641(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = super.aClass208_41.method4986(arg0);
		if (super.aClass208_41.aBoolean443) {
			@Pc(27) int[][] local27 = this.method5640(0, arg0);
			@Pc(31) int[] local31 = local27[0];
			@Pc(35) int[] local35 = local27[1];
			@Pc(39) int[] local39 = local27[2];
			@Pc(43) int[] local43 = local17[0];
			@Pc(47) int[] local47 = local17[1];
			@Pc(51) int[] local51 = local17[2];
			for (@Pc(53) int local53 = 0; local53 < Static151.anInt2711; local53++) {
				@Pc(59) int local59 = local31[local53];
				@Pc(63) int local63 = local35[local53];
				@Pc(67) int local67 = local39[local53];
				if (this.anInt6176 > local59) {
					local43[local53] = this.anInt6176;
				} else if (this.anInt6177 >= local59) {
					local43[local53] = local59;
				} else {
					local43[local53] = this.anInt6177;
				}
				if (this.anInt6176 > local63) {
					local47[local53] = this.anInt6176;
				} else if (this.anInt6177 < local63) {
					local47[local53] = this.anInt6177;
				} else {
					local47[local53] = local63;
				}
				if (this.anInt6176 > local67) {
					local51[local53] = this.anInt6176;
				} else if (this.anInt6177 < local67) {
					local51[local53] = this.anInt6177;
				} else {
					local51[local53] = local67;
				}
			}
		}
		return local17;
	}
}
