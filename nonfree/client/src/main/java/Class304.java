import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rn")
public final class Class304 {

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "Lclient!ww;")
	private Class2_Sub2 aClass2_Sub2_60;

	@OriginalMember(owner = "client!rn", name = "d", descriptor = "Lclient!dm;")
	private Class75 aClass75_12;

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "()V")
	private Class304() {
	}

	@OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lclient!dm;)V")
	public Class304(@OriginalArg(0) Class75 arg0) {
		this.aClass75_12 = arg0;
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)Lclient!ww;")
	public Class2_Sub2 method6885() {
		@Pc(13) Class2_Sub2 local13 = this.aClass75_12.aClass2_Sub2_26.aClass2_Sub2_67;
		if (local13 == this.aClass75_12.aClass2_Sub2_26) {
			this.aClass2_Sub2_60 = null;
			return null;
		} else {
			this.aClass2_Sub2_60 = local13.aClass2_Sub2_67;
			return local13;
		}
	}

	@OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Lclient!ww;")
	public Class2_Sub2 method6886() {
		@Pc(6) Class2_Sub2 local6 = this.aClass2_Sub2_60;
		if (this.aClass75_12.aClass2_Sub2_26 == local6) {
			this.aClass2_Sub2_60 = null;
			return null;
		} else {
			this.aClass2_Sub2_60 = local6.aClass2_Sub2_67;
			return local6;
		}
	}
}
