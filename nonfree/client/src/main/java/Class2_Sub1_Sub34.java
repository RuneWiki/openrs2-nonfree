import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class2_Sub1_Sub34 extends Class2_Sub1 {

	@OriginalMember(owner = "client!v", name = "S", descriptor = "I")
	private int anInt5665;

	@OriginalMember(owner = "client!v", name = "T", descriptor = "I")
	private int anInt5666;

	@OriginalMember(owner = "client!v", name = "bb", descriptor = "I")
	private int anInt5672;

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	public Class2_Sub1_Sub34() {
		this(0);
	}

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "(I)V")
	private Class2_Sub1_Sub34(@OriginalArg(0) int arg0) {
		super(0, false);
		this.method4553(arg0);
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(IB)V")
	private void method4553(@OriginalArg(0) int arg0) {
		this.anInt5672 = arg0 >> 12 & 0xFF0;
		this.anInt5665 = (arg0 & 0xFF) << 4;
		this.anInt5666 = arg0 >> 4 & 0xFF0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!wm;II)V")
	@Override
	public void method4938(@OriginalArg(0) Class2_Sub26 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 0) {
			this.method4553(arg0.method4245());
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(II)[[I")
	@Override
	public int[][] method4941(@OriginalArg(0) int arg0) {
		@Pc(17) int[][] local17 = this.aClass150_41.method3894(arg0);
		if (this.aClass150_41.aBoolean405) {
			@Pc(25) int[] local25 = local17[0];
			@Pc(29) int[] local29 = local17[1];
			@Pc(33) int[] local33 = local17[2];
			for (@Pc(35) int local35 = 0; local35 < Static114.anInt1359; local35++) {
				local25[local35] = this.anInt5672;
				local29[local35] = this.anInt5666;
				local33[local35] = this.anInt5665;
			}
		}
		return local17;
	}
}
