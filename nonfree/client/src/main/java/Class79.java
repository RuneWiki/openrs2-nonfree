import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public final class Class79 {

	@OriginalMember(owner = "client!fk", name = "d", descriptor = "J")
	public final long aLong60;

	@OriginalMember(owner = "client!fk", name = "b", descriptor = "Lclient!bv;")
	private final Class30_Sub1 aClass30_Sub1_17;

	@OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lclient!bv;JI)V")
	public Class79(@OriginalArg(0) Class30_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong60 = arg1;
		this.aClass30_Sub1_17 = arg0;
	}

	@OriginalMember(owner = "client!fk", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass30_Sub1_17.method949(this.aLong60);
		super.finalize();
	}
}
