import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public final class Class160 {

	@OriginalMember(owner = "client!ie", name = "e", descriptor = "Lclient!lf;")
	private final Class95_Sub3 aClass95_Sub3_18;

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
	public final int anInt4345;

	@OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lclient!lf;II)V")
	public Class160(@OriginalArg(0) Class95_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass95_Sub3_18 = arg0;
		this.anInt4345 = arg2;
	}

	@OriginalMember(owner = "client!ie", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass95_Sub3_18.method4834(this.anInt4345);
		super.finalize();
	}
}
