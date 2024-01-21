import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class2_Sub1_Sub37 extends Class2_Sub1 {

	@OriginalMember(owner = "client!wb", name = "cb", descriptor = "I")
	private int anInt4191 = 0;

	@OriginalMember(owner = "client!wb", name = "Z", descriptor = "I")
	private int anInt4189 = 4096;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub37() {
		super(1, true);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!ra;IZ)V")
	@Override
	public void method3264(@OriginalArg(0) Class2_Sub3 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.anInt4191 = arg0.method269();
		} else if (arg1 == 1) {
			this.anInt4189 = arg0.method269();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZI)[I")
	@Override
	public int[] method3256(@OriginalArg(1) int arg0) {
		@Pc(19) int[] local19 = super.aClass52_41.method1596(arg0);
		if (super.aClass52_41.aBoolean103) {
			@Pc(29) int[] local29 = this.method3265(arg0, 0);
			for (@Pc(31) int local31 = 0; local31 < Static135.anInt2897; local31++) {
				@Pc(37) int local37 = local29[local31];
				local19[local31] = this.anInt4191 <= local37 && local37 <= this.anInt4189 ? 4096 : 0;
			}
		}
		return local19;
	}
}
