import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mn")
public final class Class211 {

	@OriginalMember(owner = "client!mn", name = "k", descriptor = "Lclient!vl;")
	private Class2_Sub6 aClass2_Sub6_49;

	@OriginalMember(owner = "client!mn", name = "f", descriptor = "Lclient!vl;")
	public final Class2_Sub6 aClass2_Sub6_48 = new Class2_Sub6();

	@OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V")
	public Class211() {
		this.aClass2_Sub6_48.aClass2_Sub6_65 = this.aClass2_Sub6_48;
		this.aClass2_Sub6_48.aClass2_Sub6_66 = this.aClass2_Sub6_48;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(I)I")
	public int method5999() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class2_Sub6 local11 = this.aClass2_Sub6_48.aClass2_Sub6_66; local11 != this.aClass2_Sub6_48; local11 = local11.aClass2_Sub6_66) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(B)Lclient!vl;")
	public Class2_Sub6 method6000() {
		@Pc(11) Class2_Sub6 local11 = this.aClass2_Sub6_49;
		if (local11 == this.aClass2_Sub6_48) {
			this.aClass2_Sub6_49 = null;
			return null;
		} else {
			this.aClass2_Sub6_49 = local11.aClass2_Sub6_66;
			return local11;
		}
	}

	@OriginalMember(owner = "client!mn", name = "a", descriptor = "(ZLclient!vl;)V")
	public void method6002(@OriginalArg(1) Class2_Sub6 arg0) {
		if (arg0.aClass2_Sub6_65 != null) {
			arg0.method8933();
		}
		arg0.aClass2_Sub6_66 = this.aClass2_Sub6_48;
		arg0.aClass2_Sub6_65 = this.aClass2_Sub6_48.aClass2_Sub6_65;
		arg0.aClass2_Sub6_65.aClass2_Sub6_66 = arg0;
		arg0.aClass2_Sub6_66.aClass2_Sub6_65 = arg0;
	}

	@OriginalMember(owner = "client!mn", name = "b", descriptor = "(I)Lclient!vl;")
	public Class2_Sub6 method6005() {
		@Pc(13) Class2_Sub6 local13 = this.aClass2_Sub6_48.aClass2_Sub6_66;
		if (local13 == this.aClass2_Sub6_48) {
			return null;
		} else {
			local13.method8933();
			return local13;
		}
	}

	@OriginalMember(owner = "client!mn", name = "c", descriptor = "(I)V")
	public void method6006() {
		while (true) {
			@Pc(13) Class2_Sub6 local13 = this.aClass2_Sub6_48.aClass2_Sub6_66;
			if (this.aClass2_Sub6_48 == local13) {
				this.aClass2_Sub6_49 = null;
				return;
			}
			local13.method8933();
		}
	}

	@OriginalMember(owner = "client!mn", name = "d", descriptor = "(I)Lclient!vl;")
	public Class2_Sub6 method6008() {
		@Pc(13) Class2_Sub6 local13 = this.aClass2_Sub6_48.aClass2_Sub6_66;
		if (local13 == this.aClass2_Sub6_48) {
			this.aClass2_Sub6_49 = null;
			return null;
		} else {
			this.aClass2_Sub6_49 = local13.aClass2_Sub6_66;
			return local13;
		}
	}
}
