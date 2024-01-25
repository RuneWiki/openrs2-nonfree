import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cga")
public final class Class56 {

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "Lclient!eh;")
	private Class2 aClass2_46;

	@OriginalMember(owner = "client!cga", name = "b", descriptor = "Lclient!uh;")
	private Class341 aClass341_22;

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "()V")
	public Class56() {
	}

	@OriginalMember(owner = "client!cga", name = "<init>", descriptor = "(Lclient!uh;)V")
	public Class56(@OriginalArg(0) Class341 arg0) {
		this.aClass341_22 = arg0;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)Lclient!eh;")
	public Class2 method2108() {
		@Pc(8) Class2 local8 = this.aClass341_22.aClass2_271.aClass2_299;
		if (this.aClass341_22.aClass2_271 == local8) {
			this.aClass2_46 = null;
			return null;
		} else {
			this.aClass2_46 = local8.aClass2_299;
			return local8;
		}
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lclient!uh;I)V")
	public void method2109(@OriginalArg(0) Class341 arg0) {
		this.aClass341_22 = arg0;
	}

	@OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)Lclient!eh;")
	public Class2 method2110() {
		@Pc(11) Class2 local11 = this.aClass2_46;
		if (this.aClass341_22.aClass2_271 == local11) {
			this.aClass2_46 = null;
			return null;
		} else {
			this.aClass2_46 = local11.aClass2_299;
			return local11;
		}
	}
}
