import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public final class Class329 {

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "Lclient!no;")
	private final Class100_Sub1_Sub2 aClass100_Sub1_Sub2_11;

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "J")
	public final long aLong246;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Lclient!no;J[Lclient!fk;)V")
	public Class329(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class102[] arg2) {
		this.aClass100_Sub1_Sub2_11 = arg0;
		this.aLong246 = arg1;
	}

	@OriginalMember(owner = "client!tm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass100_Sub1_Sub2_11.method6168(this.aLong246);
		super.finalize();
	}
}
