import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public final class Class327 {

	@OriginalMember(owner = "client!su", name = "h", descriptor = "Lclient!oaa;")
	private final Class132_Sub1_Sub1 aClass132_Sub1_Sub1_11;

	@OriginalMember(owner = "client!su", name = "a", descriptor = "J")
	public final long aLong265;

	@OriginalMember(owner = "client!su", name = "<init>", descriptor = "(Lclient!oaa;JI)V")
	public Class327(@OriginalArg(0) Class132_Sub1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass132_Sub1_Sub1_11 = arg0;
		this.aLong265 = arg1;
	}

	@OriginalMember(owner = "client!su", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass132_Sub1_Sub1_11.method6163(this.aLong265);
		super.finalize();
	}
}
