import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wca")
public final class Class388 {

	@OriginalMember(owner = "client!wca", name = "c", descriptor = "Lclient!rba;")
	private Class5_Sub1 aClass5_Sub1_67;

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "Lclient!rba;")
	public final Class5_Sub1 aClass5_Sub1_66 = new Class5_Sub1();

	@OriginalMember(owner = "client!wca", name = "<init>", descriptor = "()V")
	public Class388() {
		this.aClass5_Sub1_66.aClass5_Sub1_65 = this.aClass5_Sub1_66;
		this.aClass5_Sub1_66.aClass5_Sub1_64 = this.aClass5_Sub1_66;
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(I)V")
	public void method9021() {
		while (true) {
			@Pc(11) Class5_Sub1 local11 = this.aClass5_Sub1_66.aClass5_Sub1_65;
			if (local11 == this.aClass5_Sub1_66) {
				this.aClass5_Sub1_67 = null;
				return;
			}
			local11.method8955();
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Lclient!rba;B)V")
	public void method9022(@OriginalArg(0) Class5_Sub1 arg0) {
		if (arg0.aClass5_Sub1_64 != null) {
			arg0.method8955();
		}
		arg0.aClass5_Sub1_65 = this.aClass5_Sub1_66;
		arg0.aClass5_Sub1_64 = this.aClass5_Sub1_66.aClass5_Sub1_64;
		arg0.aClass5_Sub1_64.aClass5_Sub1_65 = arg0;
		arg0.aClass5_Sub1_65.aClass5_Sub1_64 = arg0;
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(I)Lclient!rba;")
	public Class5_Sub1 method9024() {
		@Pc(13) Class5_Sub1 local13 = this.aClass5_Sub1_67;
		if (local13 == this.aClass5_Sub1_66) {
			this.aClass5_Sub1_67 = null;
			return null;
		} else {
			this.aClass5_Sub1_67 = local13.aClass5_Sub1_65;
			return local13;
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(Z)I")
	public int method9026() {
		@Pc(13) int local13 = 0;
		@Pc(17) Class5_Sub1 local17 = this.aClass5_Sub1_66.aClass5_Sub1_65;
		while (this.aClass5_Sub1_66 != local17) {
			local17 = local17.aClass5_Sub1_65;
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!wca", name = "b", descriptor = "(B)Lclient!rba;")
	public Class5_Sub1 method9027() {
		@Pc(7) Class5_Sub1 local7 = this.aClass5_Sub1_66.aClass5_Sub1_65;
		if (this.aClass5_Sub1_66 == local7) {
			this.aClass5_Sub1_67 = null;
			return null;
		} else {
			this.aClass5_Sub1_67 = local7.aClass5_Sub1_65;
			return local7;
		}
	}

	@OriginalMember(owner = "client!wca", name = "a", descriptor = "(B)Lclient!rba;")
	public Class5_Sub1 method9029() {
		@Pc(15) Class5_Sub1 local15 = this.aClass5_Sub1_66.aClass5_Sub1_65;
		if (this.aClass5_Sub1_66 == local15) {
			return null;
		} else {
			local15.method8955();
			return local15;
		}
	}
}
