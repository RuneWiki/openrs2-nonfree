import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ai")
public final class Class4 {

	@OriginalMember(owner = "client!ai", name = "f", descriptor = "Lclient!od;")
	private final Class2_Sub4 aClass2_Sub4_11 = new Class2_Sub4();

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
	public Class4() {
		this.aClass2_Sub4_11.aClass2_Sub4_69 = this.aClass2_Sub4_11;
		this.aClass2_Sub4_11.aClass2_Sub4_70 = this.aClass2_Sub4_11;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(ILclient!od;)V")
	public void method320(@OriginalArg(1) Class2_Sub4 arg0) {
		if (arg0.aClass2_Sub4_70 != null) {
			arg0.method2853();
		}
		arg0.aClass2_Sub4_70 = this.aClass2_Sub4_11.aClass2_Sub4_70;
		arg0.aClass2_Sub4_69 = this.aClass2_Sub4_11;
		arg0.aClass2_Sub4_70.aClass2_Sub4_69 = arg0;
		arg0.aClass2_Sub4_69.aClass2_Sub4_70 = arg0;
	}

	@OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lclient!od;I)V")
	public void method322(@OriginalArg(0) Class2_Sub4 arg0) {
		if (arg0.aClass2_Sub4_70 != null) {
			arg0.method2853();
		}
		arg0.aClass2_Sub4_70 = this.aClass2_Sub4_11;
		arg0.aClass2_Sub4_69 = this.aClass2_Sub4_11.aClass2_Sub4_69;
		arg0.aClass2_Sub4_70.aClass2_Sub4_69 = arg0;
		arg0.aClass2_Sub4_69.aClass2_Sub4_70 = arg0;
	}

	@OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)Lclient!od;")
	public Class2_Sub4 method325() {
		@Pc(7) Class2_Sub4 local7 = this.aClass2_Sub4_11.aClass2_Sub4_69;
		if (this.aClass2_Sub4_11 == local7) {
			return null;
		} else {
			local7.method2853();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)Lclient!od;")
	public Class2_Sub4 method326() {
		@Pc(14) Class2_Sub4 local14 = this.aClass2_Sub4_11.aClass2_Sub4_69;
		return this.aClass2_Sub4_11 == local14 ? null : local14;
	}
}
