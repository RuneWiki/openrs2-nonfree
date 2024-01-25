import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public final class Class187 {

	@OriginalMember(owner = "client!kga", name = "b", descriptor = "Lclient!laa;")
	private final Class126_Sub2_Sub1 aClass126_Sub2_Sub1_6;

	@OriginalMember(owner = "client!kga", name = "f", descriptor = "J")
	public final long aLong145;

	@OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Lclient!laa;J[Lclient!lf;)V")
	public Class187(@OriginalArg(0) Class126_Sub2_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class206[] arg2) {
		this.aClass126_Sub2_Sub1_6 = arg0;
		this.aLong145 = arg1;
	}

	@OriginalMember(owner = "client!kga", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass126_Sub2_Sub1_6.method4917(this.aLong145);
		super.finalize();
	}
}
