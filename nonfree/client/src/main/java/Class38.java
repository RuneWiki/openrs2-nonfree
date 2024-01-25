import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sm")
public abstract class Class38 {

	@OriginalMember(owner = "client!sm", name = "c", descriptor = "[Lclient!bc;")
	public static final Class22[] aClass22Array3 = new Class22[5];

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass22Array3.length; local4++) {
			aClass22Array3[local4] = new Class22();
		}
	}

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V")
	protected Class38() {
	}
}
