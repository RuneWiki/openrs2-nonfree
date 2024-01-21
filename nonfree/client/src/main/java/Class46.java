import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class46 {

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "Lclient!nd;")
	private Class2 aClass2_74;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "Lclient!nd;")
	public final Class2 aClass2_73 = new Class2();

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	public Class46() {
		this.aClass2_73.aClass2_98 = this.aClass2_73;
		this.aClass2_73.aClass2_97 = this.aClass2_73;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)Lclient!nd;")
	public Class2 method1432() {
		@Pc(15) Class2 local15 = this.aClass2_73.aClass2_98;
		if (local15 == this.aClass2_73) {
			return null;
		} else {
			local15.method1820();
			return local15;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)Lclient!nd;")
	public Class2 method1434() {
		@Pc(7) Class2 local7 = this.aClass2_73.aClass2_98;
		if (local7 == this.aClass2_73) {
			this.aClass2_74 = null;
			return null;
		} else {
			this.aClass2_74 = local7.aClass2_98;
			return local7;
		}
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "(B)Lclient!nd;")
	public Class2 method1435() {
		@Pc(14) Class2 local14 = this.aClass2_73.aClass2_97;
		if (this.aClass2_73 == local14) {
			this.aClass2_74 = null;
			return null;
		} else {
			this.aClass2_74 = local14.aClass2_97;
			return local14;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!nd;I)V")
	public void method1437(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_98 != null) {
			arg0.method1820();
		}
		arg0.aClass2_98 = this.aClass2_73.aClass2_98;
		arg0.aClass2_97 = this.aClass2_73;
		arg0.aClass2_98.aClass2_97 = arg0;
		arg0.aClass2_97.aClass2_98 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!nd;)V")
	public void method1438(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_98 != null) {
			arg0.method1820();
		}
		arg0.aClass2_97 = this.aClass2_73.aClass2_97;
		arg0.aClass2_98 = this.aClass2_73;
		arg0.aClass2_98.aClass2_97 = arg0;
		arg0.aClass2_97.aClass2_98 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)V")
	public void method1439() {
		while (true) {
			@Pc(13) Class2 local13 = this.aClass2_73.aClass2_97;
			if (local13 == this.aClass2_73) {
				return;
			}
			local13.method1820();
		}
	}

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "(I)Lclient!nd;")
	public Class2 method1442() {
		@Pc(6) Class2 local6 = this.aClass2_74;
		if (this.aClass2_73 == local6) {
			this.aClass2_74 = null;
			return null;
		} else {
			this.aClass2_74 = local6.aClass2_97;
			return local6;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!nd;Lclient!nd;)V")
	public void method1444(@OriginalArg(1) Class2 arg0, @OriginalArg(2) Class2 arg1) {
		if (arg1.aClass2_98 != null) {
			arg1.method1820();
		}
		arg1.aClass2_97 = arg0;
		arg1.aClass2_98 = arg0.aClass2_98;
		arg1.aClass2_98.aClass2_97 = arg1;
		arg1.aClass2_97.aClass2_98 = arg1;
	}

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)Lclient!nd;")
	public Class2 method1445() {
		@Pc(11) Class2 local11 = this.aClass2_74;
		if (local11 == this.aClass2_73) {
			this.aClass2_74 = null;
			return null;
		} else {
			this.aClass2_74 = local11.aClass2_98;
			return local11;
		}
	}

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "(I)Lclient!nd;")
	public Class2 method1446() {
		@Pc(14) Class2 local14 = this.aClass2_73.aClass2_97;
		if (this.aClass2_73 == local14) {
			return null;
		} else {
			local14.method1820();
			return local14;
		}
	}
}
