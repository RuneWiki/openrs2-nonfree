import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class135 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
	public int anInt4111;

	@OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
	private int anInt4116;

	@OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
	public int anInt4119;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IILclient!fd;)V")
	public void method3411(@OriginalArg(1) int arg0, @OriginalArg(2) Class4_Sub10 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method4666();
			if (local5 == 0) {
				return;
			}
			this.method3412(arg1, local5, arg0);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BLclient!fd;II)V")
	private void method3412(@OriginalArg(1) Class4_Sub10 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt4116 = arg0.method4653();
		} else if (arg1 == 2) {
			this.anInt4119 = arg0.method4666();
			this.anInt4111 = arg0.method4666();
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)Lclient!vn;")
	public Class4_Sub3_Sub14_Sub1 method3414() {
		@Pc(17) Class4_Sub3_Sub14_Sub1 local17 = (Class4_Sub3_Sub14_Sub1) Static240.aClass26_46.method518((long) this.anInt4116);
		if (local17 != null) {
			return local17;
		}
		local17 = Static239.method3728(Static129.aClass58_58, this.anInt4116);
		if (local17 != null) {
			Static240.aClass26_46.method510(local17, (long) this.anInt4116);
		}
		return local17;
	}
}
