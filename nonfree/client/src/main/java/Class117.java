import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ic")
public final class Class117 {

	@OriginalMember(owner = "client!ic", name = "f", descriptor = "Lclient!ko;")
	private Class142 aClass142_20;

	@OriginalMember(owner = "client!ic", name = "m", descriptor = "Lclient!oo;")
	private Class1 aClass1_108;

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
	public Class117() {
	}

	@OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lclient!ko;)V")
	public Class117(@OriginalArg(0) Class142 arg0) {
		this.aClass142_20 = arg0;
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)Lclient!oo;")
	public Class1 method2532() {
		@Pc(11) Class1 local11 = this.aClass1_108;
		if (local11 == this.aClass142_20.aClass1_143) {
			this.aClass1_108 = null;
			return null;
		} else {
			this.aClass1_108 = local11.aClass1_262;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)Lclient!oo;")
	public Class1 method2533() {
		@Pc(18) Class1 local18 = this.aClass142_20.aClass1_143.aClass1_262;
		if (local18 == this.aClass142_20.aClass1_143) {
			this.aClass1_108 = null;
			return null;
		} else {
			this.aClass1_108 = local18.aClass1_262;
			return local18;
		}
	}

	@OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lclient!ko;B)V")
	public void method2534(@OriginalArg(0) Class142 arg0) {
		this.aClass142_20 = arg0;
	}
}
