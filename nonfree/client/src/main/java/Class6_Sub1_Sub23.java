import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nba")
public final class Class6_Sub1_Sub23 extends Class6_Sub1 {

	@OriginalMember(owner = "client!nba", name = "D", descriptor = "I")
	private int anInt6426 = 4096;

	@OriginalMember(owner = "client!nba", name = "C", descriptor = "I")
	private int anInt6425 = 0;

	@OriginalMember(owner = "client!nba", name = "<init>", descriptor = "()V")
	public Class6_Sub1_Sub23() {
		super(1, true);
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lclient!gga;IB)V")
	@Override
	public void method8962(@OriginalArg(0) Class6_Sub23 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt6425 = arg0.method8363();
		} else if (arg1 == 1) {
			this.anInt6426 = arg0.method8363();
		}
	}

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(IZ)[I")
	@Override
	public int[] method8954(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass135_41.method3057(arg0);
		if (super.aClass135_41.aBoolean210) {
			@Pc(27) int[] local27 = this.method8963(0, arg0);
			for (@Pc(29) int local29 = 0; local29 < Static479.anInt8231; local29++) {
				@Pc(35) int local35 = local27[local29];
				local11[local29] = this.anInt6425 <= local35 && this.anInt6426 >= local35 ? 4096 : 0;
			}
		}
		return local11;
	}
}
