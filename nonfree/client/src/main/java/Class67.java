import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!db")
public final class Class67 {

	@OriginalMember(owner = "client!db", name = "f", descriptor = "Lclient!dr;")
	private Class80 aClass80_1;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "Lclient!dg;")
	private Class5_Sub4 aClass5_Sub4_13;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V")
	private Class67() {
	}

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(Lclient!dr;)V")
	public Class67(@OriginalArg(0) Class80 arg0) {
		this.aClass80_1 = arg0;
	}

	@OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)Lclient!dg;")
	public Class5_Sub4 method1346() {
		@Pc(6) Class5_Sub4 local6 = this.aClass5_Sub4_13;
		if (local6 == this.aClass80_1.aClass5_Sub4_14) {
			this.aClass5_Sub4_13 = null;
			return null;
		} else {
			this.aClass5_Sub4_13 = local6.aClass5_Sub4_67;
			return local6;
		}
	}

	@OriginalMember(owner = "client!db", name = "b", descriptor = "(B)Lclient!dg;")
	public Class5_Sub4 method1348() {
		@Pc(13) Class5_Sub4 local13 = this.aClass80_1.aClass5_Sub4_14.aClass5_Sub4_67;
		if (this.aClass80_1.aClass5_Sub4_14 == local13) {
			this.aClass5_Sub4_13 = null;
			return null;
		} else {
			this.aClass5_Sub4_13 = local13.aClass5_Sub4_67;
			return local13;
		}
	}
}
