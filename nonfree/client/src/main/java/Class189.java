import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kfa")
public final class Class189 {

	@OriginalMember(owner = "client!kfa", name = "e", descriptor = "Lclient!ok;")
	private final Class134_Sub2 aClass134_Sub2_21;

	@OriginalMember(owner = "client!kfa", name = "b", descriptor = "J")
	public final long aLong145;

	@OriginalMember(owner = "client!kfa", name = "<init>", descriptor = "(Lclient!ok;JI)V")
	public Class189(@OriginalArg(0) Class134_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass134_Sub2_21 = arg0;
		this.aLong145 = arg1;
	}

	@OriginalMember(owner = "client!kfa", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass134_Sub2_21.method5248(this.aLong145);
		super.finalize();
	}
}
