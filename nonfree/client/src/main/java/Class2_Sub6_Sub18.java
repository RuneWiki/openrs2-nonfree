import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public final class Class2_Sub6_Sub18 extends Class2_Sub6 {

	@OriginalMember(owner = "client!raa", name = "w", descriptor = "Lclient!lba;")
	private Class218 aClass218_38;

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ILclient!et;)V")
	public void method7544(@OriginalArg(1) Class2_Sub20 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8581(-17416);
			if (local5 == 0) {
				return;
			}
			this.method7546(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZILclient!et;)V")
	private void method7546(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 != 249) {
			return;
		}
		@Pc(10) int local10 = arg1.method8581(-17416);
		@Pc(17) int local17;
		if (this.aClass218_38 == null) {
			local17 = Static330.method4577(local10);
			this.aClass218_38 = new Class218(local17);
		}
		for (local17 = 0; local17 < local10; local17++) {
			@Pc(39) boolean local39 = arg1.method8581(-17416) == 1;
			@Pc(43) int local43 = arg1.method8583();
			@Pc(52) Class2 local52;
			if (local39) {
				local52 = new Class2_Sub47(arg1.method8553());
			} else {
				local52 = new Class2_Sub2(arg1.method8555(-9372));
			}
			this.aClass218_38.method5099(local52, (long) local43);
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(IBI)I")
	public int method7548(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass218_38 == null) {
			return arg0;
		} else {
			@Pc(23) Class2_Sub2 local23 = (Class2_Sub2) this.aClass218_38.method5095((long) arg1, 0);
			return local23 == null ? arg0 : local23.anInt41;
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Ljava/lang/String;IZ)Ljava/lang/String;")
	public String method7549(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass218_38 == null) {
			return arg0;
		} else {
			@Pc(24) Class2_Sub47 local24 = (Class2_Sub47) this.aClass218_38.method5095((long) arg1, 0);
			return local24 == null ? arg0 : local24.aString88;
		}
	}
}
