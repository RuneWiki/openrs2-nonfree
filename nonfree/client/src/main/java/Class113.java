import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ie")
public final class Class113 {

	@OriginalMember(owner = "client!ie", name = "t", descriptor = "[Lclient!tp;")
	private static final Class236[] aClass236Array1 = new Class236[32];

	@OriginalMember(owner = "client!ie", name = "f", descriptor = "Lclient!pg;")
	private final Class163_Sub2 aClass163_Sub2_20;

	@OriginalMember(owner = "client!ie", name = "d", descriptor = "J")
	public final long aLong104;

	static {
		@Pc(317) Class236[] local317 = Static226.method2968();
		for (@Pc(319) int local319 = 0; local319 < local317.length; local319++) {
			aClass236Array1[local317[local319].anInt6448] = local317[local319];
		}
	}

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!pg;J[Lclient!bc;)V")
	public Class113(@OriginalArg(0) Class163_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class19[] arg2) {
		this.aClass163_Sub2_20 = arg0;
		this.aLong104 = arg1;
	}

	@OriginalMember(owner = "client!ie", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass163_Sub2_20.method4155(this.aLong104);
		super.finalize();
	}
}
