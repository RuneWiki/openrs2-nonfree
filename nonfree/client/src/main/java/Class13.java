import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class13 {

	@OriginalMember(owner = "client!b", name = "b", descriptor = "I")
	public int anInt512;

	@OriginalMember(owner = "client!b", name = "d", descriptor = "I")
	public int anInt513;

	@OriginalMember(owner = "client!b", name = "e", descriptor = "I")
	private int anInt514;

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZILclient!ql;)V")
	public void method237(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub13 arg1) {
		while (true) {
			@Pc(13) int local13 = arg1.method1772();
			if (local13 == 0) {
				return;
			}
			this.method238(arg0, local13, arg1);
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IIBLclient!ql;)V")
	private void method238(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub13 arg2) {
		if (arg1 == 1) {
			this.anInt514 = arg2.method1764();
		} else if (arg1 == 2) {
			this.anInt512 = arg2.method1772();
			this.anInt513 = arg2.method1772();
			return;
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)Lclient!q;")
	public Class1_Sub2_Sub4_Sub1 method239() {
		@Pc(7) Class1_Sub2_Sub4_Sub1 local7 = (Class1_Sub2_Sub4_Sub1) Static257.aClass79_38.method2483((long) this.anInt514);
		if (local7 != null) {
			return local7;
		}
		local7 = Static228.method3807(this.anInt514, Static82.aClass51_26);
		if (local7 != null) {
			Static257.aClass79_38.method2486(local7, (long) this.anInt514);
		}
		return local7;
	}
}
