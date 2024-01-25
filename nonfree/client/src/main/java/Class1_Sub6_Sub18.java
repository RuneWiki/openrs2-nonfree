import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tt")
public final class Class1_Sub6_Sub18 extends Class1_Sub6 {

	@OriginalMember(owner = "client!tt", name = "v", descriptor = "Lclient!kea;")
	private Class187 aClass187_38;

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!mo;II)V")
	private void method7119(@OriginalArg(0) Class1_Sub35 arg0, @OriginalArg(1) int arg1) {
		if (arg1 != 249) {
			return;
		}
		@Pc(17) int local17 = arg0.method5750();
		@Pc(24) int local24;
		if (this.aClass187_38 == null) {
			local24 = Static457.method6299(local17);
			this.aClass187_38 = new Class187(local24);
		}
		for (local24 = 0; local24 < local17; local24++) {
			@Pc(43) boolean local43 = arg0.method5750() == 1;
			@Pc(47) int local47 = arg0.method5797();
			@Pc(56) Class1 local56;
			if (local43) {
				local56 = new Class1_Sub3(arg0.method5760());
			} else {
				local56 = new Class1_Sub13(arg0.method5804());
			}
			this.aClass187_38.method3795(local56, (long) local47);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lclient!mo;I)V")
	public void method7120(@OriginalArg(0) Class1_Sub35 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5750();
			if (local5 == 0) {
				return;
			}
			this.method7119(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(IZI)I")
	public int method7122(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (this.aClass187_38 == null) {
			return arg1;
		} else {
			@Pc(21) Class1_Sub13 local21 = (Class1_Sub13) this.aClass187_38.method3797((long) arg0);
			return local21 == null ? arg1 : local21.anInt1812;
		}
	}

	@OriginalMember(owner = "client!tt", name = "a", descriptor = "(Ljava/lang/String;IB)Ljava/lang/String;")
	public String method7125(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		if (this.aClass187_38 == null) {
			return arg0;
		} else {
			@Pc(16) Class1_Sub3 local16 = (Class1_Sub3) this.aClass187_38.method3797((long) arg1);
			return local16 == null ? arg0 : local16.aString3;
		}
	}
}
