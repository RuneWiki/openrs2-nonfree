import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cr")
public final class Class66 {

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "J")
	public final long aLong65;

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "Lclient!md;")
	private final Class144_Sub1_Sub2 aClass144_Sub1_Sub2_6;

	@OriginalMember(owner = "client!cr", name = "<init>", descriptor = "(Lclient!md;JI)V")
	public Class66(@OriginalArg(0) Class144_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aLong65 = arg1;
		this.aClass144_Sub1_Sub2_6 = arg0;
	}

	@OriginalMember(owner = "client!cr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass144_Sub1_Sub2_6.method5781(this.aLong65);
		super.finalize();
	}
}
