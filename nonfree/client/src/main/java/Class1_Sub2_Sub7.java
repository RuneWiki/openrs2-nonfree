import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!s")
public abstract class Class1_Sub2_Sub7 extends Class1_Sub2 {

	@OriginalMember(owner = "client!s", name = "w", descriptor = "[Lclient!ke;")
	public static final Class122[] aClass122Array3 = new Class122[5];

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass122Array3.length; local4++) {
			aClass122Array3[local4] = new Class122();
		}
	}

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V")
	protected Class1_Sub2_Sub7() {
	}

	@OriginalMember(owner = "client!s", name = "e", descriptor = "(I)Z")
	public abstract boolean method4370();

	@OriginalMember(owner = "client!s", name = "f", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4374();
}
