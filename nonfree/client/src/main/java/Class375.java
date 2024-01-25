import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wo")
public final class Class375 {

	@OriginalMember(owner = "client!wo", name = "k", descriptor = "Lclient!cca;")
	private Class2 aClass2_68;

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "Lclient!cca;")
	private final Class2 aClass2_67 = new Class2();

	@OriginalMember(owner = "client!wo", name = "<init>", descriptor = "()V")
	public Class375() {
		this.aClass2_67.aClass2_65 = this.aClass2_67;
		this.aClass2_67.aClass2_66 = this.aClass2_67;
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)Lclient!cca;")
	public Class2 method8633() {
		@Pc(7) Class2 local7 = this.aClass2_67.aClass2_65;
		if (this.aClass2_67 == local7) {
			return null;
		} else {
			local7.method8558();
			return local7;
		}
	}

	@OriginalMember(owner = "client!wo", name = "c", descriptor = "(I)Z")
	public boolean method8634() {
		return this.aClass2_67 == this.aClass2_67.aClass2_65;
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)Lclient!cca;")
	public Class2 method8635() {
		@Pc(6) Class2 local6 = this.aClass2_68;
		if (local6 == this.aClass2_67) {
			this.aClass2_68 = null;
			return null;
		} else {
			this.aClass2_68 = local6.aClass2_65;
			return local6;
		}
	}

	@OriginalMember(owner = "client!wo", name = "b", descriptor = "(B)V")
	public void method8637() {
		while (true) {
			@Pc(13) Class2 local13 = this.aClass2_67.aClass2_65;
			if (local13 == this.aClass2_67) {
				this.aClass2_68 = null;
				return;
			}
			local13.method8558();
		}
	}

	@OriginalMember(owner = "client!wo", name = "d", descriptor = "(I)Lclient!cca;")
	public Class2 method8638() {
		@Pc(15) Class2 local15 = this.aClass2_67.aClass2_65;
		if (this.aClass2_67 == local15) {
			this.aClass2_68 = null;
			return null;
		} else {
			this.aClass2_68 = local15.aClass2_65;
			return local15;
		}
	}

	@OriginalMember(owner = "client!wo", name = "a", descriptor = "(ILclient!cca;)V")
	public void method8639(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_66 != null) {
			arg0.method8558();
		}
		arg0.aClass2_65 = this.aClass2_67;
		arg0.aClass2_66 = this.aClass2_67.aClass2_66;
		arg0.aClass2_66.aClass2_65 = arg0;
		arg0.aClass2_65.aClass2_66 = arg0;
	}

	@OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)Lclient!cca;")
	public Class2 method8640() {
		@Pc(7) Class2 local7 = this.aClass2_67.aClass2_66;
		if (this.aClass2_67 == local7) {
			this.aClass2_68 = null;
			return null;
		} else {
			this.aClass2_68 = local7.aClass2_66;
			return local7;
		}
	}

	@OriginalMember(owner = "client!wo", name = "f", descriptor = "(I)I")
	public int method8641() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class2 local11 = this.aClass2_67.aClass2_65; local11 != this.aClass2_67; local11 = local11.aClass2_65) {
			local7++;
		}
		return local7;
	}
}
