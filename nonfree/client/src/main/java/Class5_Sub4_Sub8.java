import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gia")
public final class Class5_Sub4_Sub8 extends Class5_Sub4 {

	@OriginalMember(owner = "client!gia", name = "z", descriptor = "Lclient!du;")
	private Class81 aClass81_29;

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(ILclient!ee;)V")
	public void method2971(@OriginalArg(1) Class5_Sub12 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8645();
			if (local9 == 0) {
				return;
			}
			this.method2973(arg0, local9);
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(ILclient!ee;I)V")
	private void method2973(@OriginalArg(1) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(15) int local15 = arg0.method8645();
		@Pc(22) int local22;
		if (this.aClass81_29 == null) {
			local22 = Static522.method6795(local15);
			this.aClass81_29 = new Class81(local22);
		}
		for (local22 = 0; local22 < local15; local22++) {
			@Pc(43) boolean local43 = arg0.method8645() == 1;
			@Pc(47) int local47 = arg0.method8657();
			@Pc(56) Class5 local56;
			if (local43) {
				local56 = new Class5_Sub36(arg0.method8617());
			} else {
				local56 = new Class5_Sub41(arg0.method8623());
			}
			this.aClass81_29.method1607(local56, (long) local47);
		}
	}

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IBLjava/lang/String;)Ljava/lang/String;")
	public String method2974(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass81_29 == null) {
			return arg1;
		} else {
			@Pc(21) Class5_Sub36 local21 = (Class5_Sub36) this.aClass81_29.method1599((long) arg0);
			return local21 == null ? arg1 : local21.aString106;
		}
	}

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "(III)I")
	public int method2978(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass81_29 == null) {
			return arg0;
		} else {
			@Pc(16) Class5_Sub41 local16 = (Class5_Sub41) this.aClass81_29.method1599((long) arg1);
			return local16 == null ? arg0 : local16.anInt7411;
		}
	}
}
