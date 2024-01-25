import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class118 {

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "Lclient!lq;")
	private Class14 aClass14_119;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "Lclient!ok;")
	private Class262 aClass262_16;

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
	public Class118() {
	}

	@OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Lclient!ok;)V")
	public Class118(@OriginalArg(0) Class262 arg0) {
		this.aClass262_16 = arg0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!ok;)V")
	public void method2830(@OriginalArg(1) Class262 arg0) {
		this.aClass262_16 = arg0;
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)Lclient!lq;")
	public Class14 method2831() {
		@Pc(8) Class14 local8 = this.aClass262_16.aClass14_230.aClass14_338;
		if (local8 == this.aClass262_16.aClass14_230) {
			this.aClass14_119 = null;
			return null;
		} else {
			this.aClass14_119 = local8.aClass14_338;
			return local8;
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)Lclient!lq;")
	public Class14 method2832() {
		@Pc(11) Class14 local11 = this.aClass14_119;
		if (local11 == this.aClass262_16.aClass14_230) {
			this.aClass14_119 = null;
			return null;
		} else {
			this.aClass14_119 = local11.aClass14_338;
			return local11;
		}
	}
}
