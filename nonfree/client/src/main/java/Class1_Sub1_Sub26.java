import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!q")
public final class Class1_Sub1_Sub26 extends Class1_Sub1 {

	@OriginalMember(owner = "client!q", name = "V", descriptor = "I")
	private int anInt3098 = 4096;

	@OriginalMember(owner = "client!q", name = "fb", descriptor = "I")
	private int anInt3104 = 0;

	@OriginalMember(owner = "client!q", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub26() {
		super(1, true);
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Lclient!ka;BI)V")
	@Override
	public void method3390(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3104 = arg0.method3023();
		} else if (arg1 == 1) {
			this.anInt3098 = arg0.method3023();
		}
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method3394(@OriginalArg(1) int arg0) {
		@Pc(16) int[] local16 = super.aClass43_41.method1185(arg0);
		if (super.aClass43_41.aBoolean106) {
			@Pc(26) int[] local26 = this.method3393(arg0, 0);
			for (@Pc(28) int local28 = 0; local28 < Static107.anInt2321; local28++) {
				@Pc(34) int local34 = local26[local28];
				local16[local28] = local34 >= this.anInt3104 && this.anInt3098 >= local34 ? 4096 : 0;
			}
		}
		return local16;
	}
}
