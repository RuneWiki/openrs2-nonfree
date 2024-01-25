import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class2_Sub2_Sub35 extends Class2_Sub2 {

	@OriginalMember(owner = "client!tp", name = "O", descriptor = "I")
	private int anInt6874;

	@OriginalMember(owner = "client!tp", name = "S", descriptor = "I")
	private int anInt6878;

	@OriginalMember(owner = "client!tp", name = "U", descriptor = "I")
	private int anInt6879;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(I)V")
	private Class2_Sub2_Sub35(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method5500(arg0);
	}

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "()V")
	public Class2_Sub2_Sub35() {
		this(0);
	}

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "(II)V")
	private void method5500(@OriginalArg(1) int arg0) {
		this.anInt6879 = (arg0 & 0xFF) << 4;
		this.anInt6874 = arg0 >> 4 & 0xFF0;
		this.anInt6878 = arg0 >> 12 & 0xFF0;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)[[I")
	@Override
	public int[][] method6271(@OriginalArg(1) int arg0) {
		@Pc(13) int[][] local13 = super.aClass114_41.method2346(arg0);
		if (super.aClass114_41.aBoolean180) {
			@Pc(26) int[] local26 = local13[0];
			@Pc(30) int[] local30 = local13[1];
			@Pc(34) int[] local34 = local13[2];
			for (@Pc(36) int local36 = 0; local36 < Static398.anInt6955; local36++) {
				local26[local36] = this.anInt6878;
				local30[local36] = this.anInt6874;
				local34[local36] = this.anInt6879;
			}
		}
		return local13;
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lclient!hw;BI)V")
	@Override
	public void method6273(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.method5500(arg0.method6145());
		}
	}
}
