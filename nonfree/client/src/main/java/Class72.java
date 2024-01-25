import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public final class Class72 {

	@OriginalMember(owner = "client!dl", name = "g", descriptor = "Lclient!ap;")
	private final Class9_Sub2 aClass9_Sub2_4;

	@OriginalMember(owner = "client!dl", name = "i", descriptor = "J")
	public final long aLong51;

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lclient!ap;JI)V")
	public Class72(@OriginalArg(0) Class9_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass9_Sub2_4 = arg0;
		this.aLong51 = arg1;
	}

	@OriginalMember(owner = "client!dl", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass9_Sub2_4.method752(this.aLong51);
		super.finalize();
	}
}
