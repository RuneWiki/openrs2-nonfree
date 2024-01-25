import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public final class Class102 {

	@OriginalMember(owner = "client!fk", name = "c", descriptor = "J")
	public final long aLong84;

	@OriginalMember(owner = "client!fk", name = "g", descriptor = "Lclient!no;")
	private final Class100_Sub1_Sub2 aClass100_Sub1_Sub2_2;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!no;JI)V")
	public Class102(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong84 = arg1;
		this.aClass100_Sub1_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!fk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass100_Sub1_Sub2_2.method6168(this.aLong84);
		super.finalize();
	}
}
