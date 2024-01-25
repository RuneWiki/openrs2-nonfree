import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!md")
public final class Class200 {

	@OriginalMember(owner = "client!md", name = "g", descriptor = "[Lclient!qe;")
	public static final Class269[] aClass269Array1 = new Class269[5];

	@OriginalMember(owner = "client!md", name = "e", descriptor = "Lclient!bea;")
	private final Class31_Sub1_Sub1 aClass31_Sub1_Sub1_8;

	@OriginalMember(owner = "client!md", name = "c", descriptor = "J")
	public final long aLong164;

	static {
		for (@Pc(12) int local12 = 0; local12 < aClass269Array1.length; local12++) {
			aClass269Array1[local12] = new Class269();
		}
	}

	@OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lclient!bea;J[Lclient!dg;)V")
	public Class200(@OriginalArg(0) Class31_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class67[] arg2) {
		this.aClass31_Sub1_Sub1_8 = arg0;
		this.aLong164 = arg1;
	}

	@OriginalMember(owner = "client!md", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass31_Sub1_Sub1_8.method1016(this.aLong164);
		super.finalize();
	}
}
