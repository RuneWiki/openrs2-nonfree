import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hq")
public final class Class2_Sub7_Sub5 extends Class2_Sub7 {

	@OriginalMember(owner = "client!hq", name = "y", descriptor = "Lclient!tba;")
	private Class323 aClass323_15;

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILclient!sl;I)V")
	private void method3599(@OriginalArg(1) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(16) int local16 = arg0.method2859();
		@Pc(23) int local23;
		if (this.aClass323_15 == null) {
			local23 = Static613.method8565(local16);
			this.aClass323_15 = new Class323(local23);
		}
		for (local23 = 0; local23 < local16; local23++) {
			@Pc(41) boolean local41 = arg0.method2859() == 1;
			@Pc(45) int local45 = arg0.method2835();
			@Pc(54) Class2 local54;
			if (local41) {
				local54 = new Class2_Sub33(arg0.method2833());
			} else {
				local54 = new Class2_Sub41(arg0.method2881());
			}
			this.aClass323_15.method7477(local54, (long) local45);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIZ)I")
	public int method3600(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (this.aClass323_15 == null) {
			return arg0;
		} else {
			@Pc(25) Class2_Sub41 local25 = (Class2_Sub41) this.aClass323_15.method7484((long) arg1);
			return local25 == null ? arg0 : local25.anInt9197;
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILclient!sl;)V")
	public void method3602(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(10) int local10 = arg0.method2859();
			if (local10 == 0) {
				return;
			}
			this.method3599(arg0, local10);
		}
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(Ljava/lang/String;BI)Ljava/lang/String;")
	public String method3603(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass323_15 == null) {
			return arg0;
		} else {
			@Pc(16) Class2_Sub33 local16 = (Class2_Sub33) this.aClass323_15.method7484((long) arg1);
			return local16 == null ? arg0 : local16.aString60;
		}
	}
}
