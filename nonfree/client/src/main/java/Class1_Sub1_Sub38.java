import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vg")
public final class Class1_Sub1_Sub38 extends Class1_Sub1 {

	@OriginalMember(owner = "client!vg", name = "H", descriptor = "I")
	private int anInt5340;

	@OriginalMember(owner = "client!vg", name = "I", descriptor = "I")
	private int anInt5341;

	@OriginalMember(owner = "client!vg", name = "O", descriptor = "I")
	private int anInt5345;

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub38(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method4446(arg0);
	}

	@OriginalMember(owner = "client!vg", name = "<init>", descriptor = "()V")
	public Class1_Sub1_Sub38() {
		this(0);
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lclient!fh;IZ)V")
	@Override
	public void method4454(@OriginalArg(0) Class1_Sub13 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.method4446(arg0.method1878());
		}
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method4462(@OriginalArg(1) int arg0) {
		@Pc(14) int[][] local14 = this.aClass71_41.method1894(arg0);
		if (this.aClass71_41.aBoolean190) {
			@Pc(22) int[] local22 = local14[0];
			@Pc(26) int[] local26 = local14[1];
			@Pc(30) int[] local30 = local14[2];
			for (@Pc(32) int local32 = 0; local32 < Static6.anInt4960; local32++) {
				local22[local32] = this.anInt5340;
				local26[local32] = this.anInt5345;
				local30[local32] = this.anInt5341;
			}
		}
		return local14;
	}

	@OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)V")
	private void method4446(@OriginalArg(0) int arg0) {
		this.anInt5341 = (arg0 & 0xFF) << 4;
		this.anInt5345 = arg0 >> 4 & 0xFF0;
		this.anInt5340 = arg0 >> 12 & 0xFF0;
	}
}
