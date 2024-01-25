import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dca")
public final class Class12_Sub4_Sub2 extends Class12_Sub4 {

	@OriginalMember(owner = "client!dca", name = "D", descriptor = "Lclient!dea;")
	private Class68 aClass68_15;

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
	public String method1870(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		if (this.aClass68_15 == null) {
			return arg0;
		} else {
			@Pc(21) Class12_Sub16 local21 = (Class12_Sub16) this.aClass68_15.method1917((long) arg1);
			return local21 == null ? arg0 : local21.aString30;
		}
	}

	@OriginalMember(owner = "client!dca", name = "b", descriptor = "(III)I")
	public int method1871(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass68_15 == null) {
			return arg0;
		} else {
			@Pc(21) Class12_Sub18 local21 = (Class12_Sub18) this.aClass68_15.method1917((long) arg1);
			return local21 == null ? arg0 : local21.anInt3978;
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(BLclient!daa;)V")
	public void method1872(@OriginalArg(1) Class12_Sub8 arg0) {
		while (true) {
			@Pc(18) int local18 = arg0.method5216();
			if (local18 == 0) {
				return;
			}
			this.method1874(arg0, local18);
		}
	}

	@OriginalMember(owner = "client!dca", name = "a", descriptor = "(Lclient!daa;II)V")
	private void method1874(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(12) int local12 = arg0.method5216();
		@Pc(19) int local19;
		if (this.aClass68_15 == null) {
			local19 = Static37.method6277(local12);
			this.aClass68_15 = new Class68(local19);
		}
		for (local19 = 0; local19 < local12; local19++) {
			@Pc(40) boolean local40 = arg0.method5216() == 1;
			@Pc(44) int local44 = arg0.method5195();
			@Pc(53) Class12 local53;
			if (local40) {
				local53 = new Class12_Sub16(arg0.method5206());
			} else {
				local53 = new Class12_Sub18(arg0.method5225());
			}
			this.aClass68_15.method1916(local53, (long) local44);
		}
	}
}
