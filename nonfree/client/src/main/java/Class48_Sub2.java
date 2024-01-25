import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class Class48_Sub2 extends Class48 {

	@OriginalMember(owner = "client!fi", name = "k", descriptor = "Lclient!fi;")
	public Class48_Sub2 aClass48_Sub2_5;

	@OriginalMember(owner = "client!fi", name = "m", descriptor = "Lclient!fi;")
	public Class48_Sub2 aClass48_Sub2_6;

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
	public final void method2514() {
		if (this.aClass48_Sub2_5 != null) {
			this.aClass48_Sub2_5.aClass48_Sub2_6 = this.aClass48_Sub2_6;
			this.aClass48_Sub2_6.aClass48_Sub2_5 = this.aClass48_Sub2_5;
			this.aClass48_Sub2_5 = null;
			this.aClass48_Sub2_6 = null;
		}
	}
}
