import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gca")
public final class Class3_Sub7_Sub11 extends Class3_Sub7 {

	@OriginalMember(owner = "client!gca", name = "D", descriptor = "Lclient!wa;")
	private Class354 aClass354_13;

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(III)I")
	public int method3007(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass354_13 == null) {
			return arg0;
		} else {
			@Pc(21) Class3_Sub17 local21 = (Class3_Sub17) this.aClass354_13.method7689((long) arg1);
			return local21 == null ? arg0 : local21.anInt3217;
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ZLclient!np;)V")
	public void method3008(@OriginalArg(1) Class3_Sub11 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5175();
			if (local13 == 0) {
				return;
			}
			this.method3011(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILjava/lang/String;Z)Ljava/lang/String;")
	public String method3009(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		if (this.aClass354_13 == null) {
			return arg1;
		} else {
			@Pc(21) Class3_Sub29 local21 = (Class3_Sub29) this.aClass354_13.method7689((long) arg0);
			return local21 == null ? arg1 : local21.aString27;
		}
	}

	@OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lclient!np;BI)V")
	private void method3011(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(2) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(22) int local22 = arg0.method5175();
		@Pc(29) int local29;
		if (this.aClass354_13 == null) {
			local29 = Static371.method5424(local22);
			this.aClass354_13 = new Class354(local29);
		}
		for (local29 = 0; local29 < local22; local29++) {
			@Pc(48) boolean local48 = arg0.method5175() == 1;
			@Pc(52) int local52 = arg0.method5230();
			@Pc(61) Class3 local61;
			if (local48) {
				local61 = new Class3_Sub29(arg0.method5181());
			} else {
				local61 = new Class3_Sub17(arg0.method5186());
			}
			this.aClass354_13.method7691(local61, (long) local52);
		}
	}
}
