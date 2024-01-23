import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ke")
public final class Class98 {

	@OriginalMember(owner = "client!ke", name = "c", descriptor = "Lclient!wg;")
	private Class189 aClass189_2;

	@OriginalMember(owner = "client!ke", name = "j", descriptor = "Lclient!ph;")
	private Class1_Sub5 aClass1_Sub5_29;

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lclient!wg;I)V")
	public void method2471(@OriginalArg(0) Class189 arg0) {
		this.aClass189_2 = arg0;
	}

	@OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)Lclient!ph;")
	public Class1_Sub5 method2472() {
		@Pc(14) Class1_Sub5 local14 = this.aClass1_Sub5_29;
		if (this.aClass189_2.aClass1_Sub5_74 == local14) {
			this.aClass1_Sub5_29 = null;
			return null;
		} else {
			this.aClass1_Sub5_29 = local14.aClass1_Sub5_73;
			return local14;
		}
	}

	@OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)Lclient!ph;")
	public Class1_Sub5 method2473() {
		@Pc(4) Class1_Sub5 local4 = this.aClass189_2.aClass1_Sub5_74.aClass1_Sub5_73;
		if (this.aClass189_2.aClass1_Sub5_74 == local4) {
			this.aClass1_Sub5_29 = null;
			return null;
		} else {
			this.aClass1_Sub5_29 = local4.aClass1_Sub5_73;
			return local4;
		}
	}
}
