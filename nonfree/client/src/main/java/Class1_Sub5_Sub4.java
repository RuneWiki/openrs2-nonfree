import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bm")
public final class Class1_Sub5_Sub4 extends Class1_Sub5 {

	@OriginalMember(owner = "client!bm", name = "N", descriptor = "I")
	private int anInt531 = 0;

	@OriginalMember(owner = "client!bm", name = "S", descriptor = "I")
	private int anInt535 = 4096;

	@OriginalMember(owner = "client!bm", name = "<init>", descriptor = "()V")
	public Class1_Sub5_Sub4() {
		super(1, true);
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lclient!nj;II)V")
	@Override
	public void method5814(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt531 = arg0.method5715();
		} else if (arg1 == 1) {
			this.anInt535 = arg0.method5715();
		}
	}

	@OriginalMember(owner = "client!bm", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method5805(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass214_41.method5651(arg0);
		if (super.aClass214_41.aBoolean544) {
			@Pc(28) int[] local28 = this.method5802(0, arg0);
			for (@Pc(30) int local30 = 0; local30 < Static75.anInt1566; local30++) {
				@Pc(36) int local36 = local28[local30];
				local11[local30] = local36 >= this.anInt531 && this.anInt535 >= local36 ? 4096 : 0;
			}
		}
		return local11;
	}
}
