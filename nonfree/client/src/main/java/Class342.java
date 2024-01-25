import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!taa")
public final class Class342 {

	@OriginalMember(owner = "client!taa", name = "f", descriptor = "J")
	public final long aLong263;

	@OriginalMember(owner = "client!taa", name = "a", descriptor = "Lclient!tia;")
	private final Class100_Sub1_Sub2 aClass100_Sub1_Sub2_10;

	@OriginalMember(owner = "client!taa", name = "<init>", descriptor = "(Lclient!tia;JI)V")
	public Class342(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong263 = arg1;
		this.aClass100_Sub1_Sub2_10 = arg0;
	}

	@OriginalMember(owner = "client!taa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass100_Sub1_Sub2_10.method7995(this.aLong263);
		super.finalize();
	}
}
