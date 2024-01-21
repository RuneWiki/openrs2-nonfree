import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pb")
public final class Class60 {

	@OriginalMember(owner = "client!pb", name = "o", descriptor = "Lclient!hb;")
	private final Class8_Sub1 aClass8_Sub1_52 = new Class8_Sub1();

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
	public Class60() {
		this.aClass8_Sub1_52.aClass8_Sub1_65 = this.aClass8_Sub1_52;
		this.aClass8_Sub1_52.aClass8_Sub1_66 = this.aClass8_Sub1_52;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)Lclient!hb;")
	public Class8_Sub1 method1350() {
		@Pc(3) Class8_Sub1 local3 = this.aClass8_Sub1_52.aClass8_Sub1_66;
		if (local3 == this.aClass8_Sub1_52) {
			return null;
		} else {
			local3.method1952();
			return local3;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)Lclient!hb;")
	public Class8_Sub1 method1351() {
		@Pc(7) Class8_Sub1 local7 = this.aClass8_Sub1_52.aClass8_Sub1_66;
		return local7 == this.aClass8_Sub1_52 ? null : local7;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!hb;I)V")
	public void method1355(@OriginalArg(0) Class8_Sub1 arg0) {
		if (arg0.aClass8_Sub1_65 != null) {
			arg0.method1952();
		}
		arg0.aClass8_Sub1_65 = this.aClass8_Sub1_52;
		arg0.aClass8_Sub1_66 = this.aClass8_Sub1_52.aClass8_Sub1_66;
		arg0.aClass8_Sub1_65.aClass8_Sub1_66 = arg0;
		arg0.aClass8_Sub1_66.aClass8_Sub1_65 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!hb;)V")
	public void method1356(@OriginalArg(1) Class8_Sub1 arg0) {
		if (arg0.aClass8_Sub1_65 != null) {
			arg0.method1952();
		}
		arg0.aClass8_Sub1_65 = this.aClass8_Sub1_52.aClass8_Sub1_65;
		arg0.aClass8_Sub1_66 = this.aClass8_Sub1_52;
		arg0.aClass8_Sub1_65.aClass8_Sub1_66 = arg0;
		arg0.aClass8_Sub1_66.aClass8_Sub1_65 = arg0;
	}
}
