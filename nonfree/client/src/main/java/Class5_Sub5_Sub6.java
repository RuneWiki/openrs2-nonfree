import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!er")
public final class Class5_Sub5_Sub6 extends Class5_Sub5 {

	@OriginalMember(owner = "client!er", name = "x", descriptor = "Lclient!pl;")
	private Class273 aClass273_7;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;")
	public String method2001(@OriginalArg(0) int arg0, @OriginalArg(2) String arg1) {
		if (this.aClass273_7 == null) {
			return arg1;
		} else {
			@Pc(21) Class5_Sub7 local21 = (Class5_Sub7) this.aClass273_7.method6581((long) arg0);
			return local21 == null ? arg1 : local21.aString19;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!ofa;B)V")
	public void method2003(@OriginalArg(0) Class5_Sub22 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method5966();
			if (local15 == 0) {
				return;
			}
			this.method2005(arg0, local15);
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IBI)I")
	public int method2004(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass273_7 == null) {
			return arg0;
		} else {
			@Pc(21) Class5_Sub41 local21 = (Class5_Sub41) this.aClass273_7.method6581((long) arg1);
			return local21 == null ? arg0 : local21.anInt7600;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(Lclient!ofa;BI)V")
	private void method2005(@OriginalArg(0) Class5_Sub22 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(10) int local10 = arg0.method5966();
		@Pc(17) int local17;
		if (this.aClass273_7 == null) {
			local17 = Static613.method8740(local10);
			this.aClass273_7 = new Class273(local17);
		}
		for (local17 = 0; local17 < local10; local17++) {
			@Pc(36) boolean local36 = arg0.method5966() == 1;
			@Pc(40) int local40 = arg0.method5931();
			@Pc(49) Class5 local49;
			if (local36) {
				local49 = new Class5_Sub7(arg0.method5937());
			} else {
				local49 = new Class5_Sub41(arg0.method5913());
			}
			this.aClass273_7.method6585((long) local40, local49);
		}
	}
}
