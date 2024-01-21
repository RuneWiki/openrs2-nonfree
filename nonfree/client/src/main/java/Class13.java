import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ce")
public final class Class13 {

	@OriginalMember(owner = "client!ce", name = "j", descriptor = "Lclient!cc;")
	private final Class4_Sub4 aClass4_Sub4_11 = new Class4_Sub4();

	@OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
	public Class13() {
		this.aClass4_Sub4_11.aClass4_Sub4_63 = this.aClass4_Sub4_11;
		this.aClass4_Sub4_11.aClass4_Sub4_64 = this.aClass4_Sub4_11;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)Lclient!cc;")
	public Class4_Sub4 method287() {
		@Pc(3) Class4_Sub4 local3 = this.aClass4_Sub4_11.aClass4_Sub4_64;
		return local3 == this.aClass4_Sub4_11 ? null : local3;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lclient!cc;I)V")
	public void method289(@OriginalArg(0) Class4_Sub4 arg0) {
		if (arg0.aClass4_Sub4_63 != null) {
			arg0.method2094();
		}
		arg0.aClass4_Sub4_63 = this.aClass4_Sub4_11.aClass4_Sub4_63;
		arg0.aClass4_Sub4_64 = this.aClass4_Sub4_11;
		arg0.aClass4_Sub4_63.aClass4_Sub4_64 = arg0;
		arg0.aClass4_Sub4_64.aClass4_Sub4_63 = arg0;
	}

	@OriginalMember(owner = "client!ce", name = "b", descriptor = "(Lclient!cc;I)V")
	public void method291(@OriginalArg(0) Class4_Sub4 arg0) {
		if (arg0.aClass4_Sub4_63 != null) {
			arg0.method2094();
		}
		arg0.aClass4_Sub4_64 = this.aClass4_Sub4_11.aClass4_Sub4_64;
		arg0.aClass4_Sub4_63 = this.aClass4_Sub4_11;
		arg0.aClass4_Sub4_63.aClass4_Sub4_64 = arg0;
		arg0.aClass4_Sub4_64.aClass4_Sub4_63 = arg0;
	}

	@OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)Lclient!cc;")
	public Class4_Sub4 method292() {
		@Pc(3) Class4_Sub4 local3 = this.aClass4_Sub4_11.aClass4_Sub4_64;
		if (local3 == this.aClass4_Sub4_11) {
			return null;
		} else {
			local3.method2094();
			return local3;
		}
	}
}
