import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hga")
public final class Class137 {

	@OriginalMember(owner = "client!hga", name = "e", descriptor = "Lclient!fr;")
	private Class1_Sub6 aClass1_Sub6_20 = new Class1_Sub6();

	@OriginalMember(owner = "client!hga", name = "l", descriptor = "Lclient!gm;")
	private final Class125 aClass125_6 = new Class125();

	@OriginalMember(owner = "client!hga", name = "o", descriptor = "I")
	private final int anInt3555;

	@OriginalMember(owner = "client!hga", name = "h", descriptor = "I")
	private int anInt3551;

	@OriginalMember(owner = "client!hga", name = "j", descriptor = "Lclient!kea;")
	private final Class187 aClass187_15;

	@OriginalMember(owner = "client!hga", name = "<init>", descriptor = "(I)V")
	public Class137(@OriginalArg(0) int arg0) {
		this.anInt3555 = arg0;
		this.anInt3551 = arg0;
		@Pc(19) int local19;
		for (local19 = 1; local19 + local19 < arg0; local19 += local19) {
		}
		this.aClass187_15 = new Class187(local19);
	}

	@OriginalMember(owner = "client!hga", name = "b", descriptor = "(I)V")
	public void method2923() {
		this.aClass125_6.method2420();
		this.aClass187_15.method3801();
		this.aClass1_Sub6_20 = new Class1_Sub6();
		this.anInt3551 = this.anInt3555;
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(JBLclient!fr;)V")
	public void method2928(@OriginalArg(0) long arg0, @OriginalArg(2) Class1_Sub6 arg1) {
		if (this.anInt3551 == 0) {
			@Pc(25) Class1_Sub6 local25 = this.aClass125_6.method2421();
			local25.method7859();
			local25.method7811();
			if (local25 == this.aClass1_Sub6_20) {
				local25 = this.aClass125_6.method2421();
				local25.method7859();
				local25.method7811();
			}
		} else {
			this.anInt3551--;
		}
		this.aClass187_15.method3795(arg1, arg0);
		this.aClass125_6.method2426(arg1);
	}

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(JB)Lclient!fr;")
	public Class1_Sub6 method2930(@OriginalArg(0) long arg0) {
		@Pc(10) Class1_Sub6 local10 = (Class1_Sub6) this.aClass187_15.method3797(arg0);
		if (local10 != null) {
			this.aClass125_6.method2426(local10);
		}
		return local10;
	}
}
