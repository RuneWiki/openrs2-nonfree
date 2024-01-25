import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jc")
public final class Class126 {

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "I")
	public int anInt3605;

	@OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
	public int anInt3607;

	@OriginalMember(owner = "client!jc", name = "g", descriptor = "Lclient!fu;")
	public Class83 aClass83_2;

	@OriginalMember(owner = "client!jc", name = "i", descriptor = "I")
	private int anInt3611;

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILclient!ae;)V")
	public void method2975(@OriginalArg(1) Class6_Sub1 arg0) {
		while (true) {
			@Pc(16) int local16 = arg0.method6433();
			if (local16 == 0) {
				return;
			}
			this.method2976(arg0, local16);
		}
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(Lclient!ae;BI)V")
	private void method2976(@OriginalArg(0) Class6_Sub1 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt3611 = arg0.method6485();
		} else if (arg1 == 2) {
			this.anInt3607 = arg0.method6433();
			this.anInt3605 = arg0.method6433();
			return;
		}
	}

	@OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)Lclient!pi;")
	public synchronized Class194 method2980() {
		@Pc(13) Class194 local13 = (Class194) this.aClass83_2.aClass44_11.method1353((long) this.anInt3611);
		if (local13 != null) {
			return local13;
		}
		local13 = Static458.method4494(this.aClass83_2.aClass100_22, this.anInt3611, 0);
		if (local13 != null) {
			this.aClass83_2.aClass44_11.method1349(local13, (long) this.anInt3611);
		}
		return local13;
	}
}
