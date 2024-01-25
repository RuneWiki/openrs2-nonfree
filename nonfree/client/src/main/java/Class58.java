import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!em")
public final class Class58 {

	@OriginalMember(owner = "client!em", name = "b", descriptor = "I")
	private int anInt1815;

	@OriginalMember(owner = "client!em", name = "g", descriptor = "I")
	public int anInt1819;

	@OriginalMember(owner = "client!em", name = "h", descriptor = "I")
	public int anInt1820;

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(BLclient!bk;I)V")
	public void method1603(@OriginalArg(1) Class5_Sub1 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(9) int local9 = arg0.method1832();
			if (local9 == 0) {
				return;
			}
			this.method1605(local9, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(Z)Lclient!cl;")
	public Class37 method1604() {
		@Pc(11) Class37 local11 = (Class37) Static297.aClass66_98.method1939((long) this.anInt1815);
		if (local11 != null) {
			return local11;
		}
		local11 = Static360.method907(Static118.aClass170_53, this.anInt1815, 0);
		if (local11 != null) {
			Static297.aClass66_98.method1936((long) this.anInt1815, local11);
		}
		return local11;
	}

	@OriginalMember(owner = "client!em", name = "a", descriptor = "(IILclient!bk;I)V")
	private void method1605(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class5_Sub1 arg2) {
		if (arg0 == 1) {
			this.anInt1815 = arg2.method1845();
		} else if (arg0 == 2) {
			this.anInt1819 = arg2.method1832();
			this.anInt1820 = arg2.method1832();
		}
	}
}
