import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public final class Class176 {

	@OriginalMember(owner = "client!jr", name = "a", descriptor = "Lclient!sb;")
	private final Class95_Sub3_Sub2 aClass95_Sub3_Sub2_5;

	@OriginalMember(owner = "client!jr", name = "f", descriptor = "J")
	public final long aLong124;

	@OriginalMember(owner = "client!jr", name = "<init>", descriptor = "(Lclient!sb;JI)V")
	public Class176(@OriginalArg(0) Class95_Sub3_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass95_Sub3_Sub2_5 = arg0;
		this.aLong124 = arg1;
	}

	@OriginalMember(owner = "client!jr", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass95_Sub3_Sub2_5.method7155(this.aLong124);
		super.finalize();
	}
}
