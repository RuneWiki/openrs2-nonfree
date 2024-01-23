import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fc")
public final class Class48 {

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "Lclient!ad;")
	private Class5 aClass5_8;

	@OriginalMember(owner = "client!fc", name = "e", descriptor = "Lclient!v;")
	private Class1_Sub1 aClass1_Sub1_27;

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)Lclient!v;")
	public Class1_Sub1 method1146() {
		@Pc(6) Class1_Sub1 local6 = this.aClass1_Sub1_27;
		if (local6 == this.aClass5_8.aClass1_Sub1_5) {
			this.aClass1_Sub1_27 = null;
			return null;
		} else {
			this.aClass1_Sub1_27 = local6.aClass1_Sub1_75;
			return local6;
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!ad;B)V")
	public void method1147(@OriginalArg(0) Class5 arg0) {
		this.aClass5_8 = arg0;
	}

	@OriginalMember(owner = "client!fc", name = "c", descriptor = "(I)Lclient!v;")
	public Class1_Sub1 method1149() {
		@Pc(13) Class1_Sub1 local13 = this.aClass5_8.aClass1_Sub1_5.aClass1_Sub1_75;
		if (this.aClass5_8.aClass1_Sub1_5 == local13) {
			this.aClass1_Sub1_27 = null;
			return null;
		} else {
			this.aClass1_Sub1_27 = local13.aClass1_Sub1_75;
			return local13;
		}
	}
}
