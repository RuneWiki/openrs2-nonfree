import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class159 {

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "Z")
	public boolean aBoolean266;

	@OriginalMember(owner = "client!lu", name = "d", descriptor = "I")
	public int anInt4044;

	@OriginalMember(owner = "client!lu", name = "i", descriptor = "I")
	public int anInt4049;

	@OriginalMember(owner = "client!lu", name = "k", descriptor = "I")
	public int anInt4050;

	@OriginalMember(owner = "client!lu", name = "l", descriptor = "I")
	public int anInt4051;

	@OriginalMember(owner = "client!lu", name = "n", descriptor = "I")
	public int anInt4052;

	@OriginalMember(owner = "client!lu", name = "g", descriptor = "I")
	public int anInt4047 = 8;

	@OriginalMember(owner = "client!lu", name = "h", descriptor = "I")
	public int anInt4048 = 16777215;

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ILclient!ha;I)V")
	private void method3702(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub15 arg1) {
		if (arg0 == 1) {
			this.anInt4047 = arg1.method3108();
		} else if (arg0 == 2) {
			this.aBoolean266 = true;
		} else if (arg0 == 3) {
			this.anInt4052 = arg1.method3103();
			this.anInt4049 = arg1.method3103();
			this.anInt4051 = arg1.method3103();
		} else if (arg0 == 4) {
			this.anInt4050 = arg1.method3111();
		} else if (arg0 == 5) {
			this.anInt4044 = arg1.method3108();
		} else if (arg0 == 6) {
			this.anInt4048 = arg1.method3078();
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(Lclient!ha;I)V")
	public void method3703(@OriginalArg(0) Class6_Sub15 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method3111();
			if (local5 == 0) {
				return;
			}
			this.method3702(local5, arg0);
		}
	}
}
