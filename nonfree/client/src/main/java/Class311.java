import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public final class Class311 {

	@OriginalMember(owner = "client!si", name = "c", descriptor = "Lclient!mr;")
	private final Class45_Sub2_Sub2 aClass45_Sub2_Sub2_11;

	@OriginalMember(owner = "client!si", name = "e", descriptor = "J")
	public final long aLong229;

	@OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lclient!mr;JI)V")
	public Class311(@OriginalArg(0) Class45_Sub2_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass45_Sub2_Sub2_11 = arg0;
		this.aLong229 = arg1;
	}

	@OriginalMember(owner = "client!si", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass45_Sub2_Sub2_11.method5036(this.aLong229);
		super.finalize();
	}
}
