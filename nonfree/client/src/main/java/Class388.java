import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vl")
public final class Class388 {

	@OriginalMember(owner = "client!vl", name = "j", descriptor = "Lclient!no;")
	private Class2_Sub6 aClass2_Sub6_67;

	@OriginalMember(owner = "client!vl", name = "i", descriptor = "Lclient!no;")
	public final Class2_Sub6 aClass2_Sub6_66 = new Class2_Sub6();

	@OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V")
	public Class388() {
		this.aClass2_Sub6_66.aClass2_Sub6_63 = this.aClass2_Sub6_66;
		this.aClass2_Sub6_66.aClass2_Sub6_64 = this.aClass2_Sub6_66;
	}

	@OriginalMember(owner = "client!vl", name = "b", descriptor = "(I)I")
	public int method9210() {
		@Pc(7) int local7 = 0;
		@Pc(17) Class2_Sub6 local17 = this.aClass2_Sub6_66.aClass2_Sub6_64;
		while (this.aClass2_Sub6_66 != local17) {
			local17 = local17.aClass2_Sub6_64;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!vl", name = "d", descriptor = "(I)V")
	public void method9211() {
		while (true) {
			@Pc(5) Class2_Sub6 local5 = this.aClass2_Sub6_66.aClass2_Sub6_64;
			if (local5 == this.aClass2_Sub6_66) {
				this.aClass2_Sub6_67 = null;
				return;
			}
			local5.method8698();
		}
	}

	@OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)Lclient!no;")
	public Class2_Sub6 method9212() {
		@Pc(6) Class2_Sub6 local6 = this.aClass2_Sub6_67;
		if (local6 == this.aClass2_Sub6_66) {
			this.aClass2_Sub6_67 = null;
			return null;
		} else {
			this.aClass2_Sub6_67 = local6.aClass2_Sub6_64;
			return local6;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(I)Lclient!no;")
	public Class2_Sub6 method9213() {
		@Pc(16) Class2_Sub6 local16 = this.aClass2_Sub6_66.aClass2_Sub6_64;
		if (this.aClass2_Sub6_66 == local16) {
			this.aClass2_Sub6_67 = null;
			return null;
		} else {
			this.aClass2_Sub6_67 = local16.aClass2_Sub6_64;
			return local16;
		}
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(ILclient!no;)V")
	public void method9215(@OriginalArg(1) Class2_Sub6 arg0) {
		if (arg0.aClass2_Sub6_63 != null) {
			arg0.method8698();
		}
		arg0.aClass2_Sub6_64 = this.aClass2_Sub6_66;
		arg0.aClass2_Sub6_63 = this.aClass2_Sub6_66.aClass2_Sub6_63;
		arg0.aClass2_Sub6_63.aClass2_Sub6_64 = arg0;
		arg0.aClass2_Sub6_64.aClass2_Sub6_63 = arg0;
	}

	@OriginalMember(owner = "client!vl", name = "a", descriptor = "(Z)Lclient!no;")
	public Class2_Sub6 method9216() {
		@Pc(13) Class2_Sub6 local13 = this.aClass2_Sub6_66.aClass2_Sub6_64;
		if (local13 == this.aClass2_Sub6_66) {
			return null;
		} else {
			local13.method8698();
			return local13;
		}
	}
}
