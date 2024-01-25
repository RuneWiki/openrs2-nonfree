import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class100 {

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "Lclient!ge;")
	private final Class81_Sub1 aClass81_Sub1_21;

	@OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
	public final int anInt2385;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!ge;I[Lclient!hc;)V")
	public Class100(@OriginalArg(0) Class81_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class89[] arg2) {
		this.aClass81_Sub1_21 = arg0;
		this.anInt2385 = arg1;
	}

	@OriginalMember(owner = "client!ie", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass81_Sub1_21.method1977(this.anInt2385);
		super.finalize();
	}
}
