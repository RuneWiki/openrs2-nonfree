import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uh")
public final class Class85 {

	@OriginalMember(owner = "client!uh", name = "c", descriptor = "Lclient!qe;")
	private final Class2_Sub2 aClass2_Sub2_60 = new Class2_Sub2();

	@OriginalMember(owner = "client!uh", name = "<init>", descriptor = "()V")
	public Class85() {
		this.aClass2_Sub2_60.aClass2_Sub2_70 = this.aClass2_Sub2_60;
		this.aClass2_Sub2_60.aClass2_Sub2_69 = this.aClass2_Sub2_60;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(B)Lclient!qe;")
	public Class2_Sub2 method2757() {
		@Pc(3) Class2_Sub2 local3 = this.aClass2_Sub2_60.aClass2_Sub2_69;
		if (local3 == this.aClass2_Sub2_60) {
			return null;
		} else {
			local3.method2900();
			return local3;
		}
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lclient!qe;I)V")
	public void method2758(@OriginalArg(0) Class2_Sub2 arg0) {
		if (arg0.aClass2_Sub2_70 != null) {
			arg0.method2900();
		}
		arg0.aClass2_Sub2_69 = this.aClass2_Sub2_60;
		arg0.aClass2_Sub2_70 = this.aClass2_Sub2_60.aClass2_Sub2_70;
		arg0.aClass2_Sub2_70.aClass2_Sub2_69 = arg0;
		arg0.aClass2_Sub2_69.aClass2_Sub2_70 = arg0;
	}

	@OriginalMember(owner = "client!uh", name = "a", descriptor = "(ILclient!qe;)V")
	public void method2761(@OriginalArg(1) Class2_Sub2 arg0) {
		if (arg0.aClass2_Sub2_70 != null) {
			arg0.method2900();
		}
		arg0.aClass2_Sub2_69 = this.aClass2_Sub2_60.aClass2_Sub2_69;
		arg0.aClass2_Sub2_70 = this.aClass2_Sub2_60;
		arg0.aClass2_Sub2_70.aClass2_Sub2_69 = arg0;
		arg0.aClass2_Sub2_69.aClass2_Sub2_70 = arg0;
	}

	@OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)Lclient!qe;")
	public Class2_Sub2 method2763() {
		@Pc(10) Class2_Sub2 local10 = this.aClass2_Sub2_60.aClass2_Sub2_69;
		return local10 == this.aClass2_Sub2_60 ? null : local10;
	}
}
