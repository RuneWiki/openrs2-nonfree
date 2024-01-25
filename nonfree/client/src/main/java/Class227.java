import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public final class Class227 {

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "Lclient!kv;")
	private final Class143_Sub2 aClass143_Sub2_29;

	@OriginalMember(owner = "client!lv", name = "e", descriptor = "J")
	public final long aLong172;

	@OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lclient!kv;JI)V")
	public Class227(@OriginalArg(0) Class143_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		this.aClass143_Sub2_29 = arg0;
		this.aLong172 = arg1;
	}

	@OriginalMember(owner = "client!lv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass143_Sub2_29.method4962(this.aLong172);
		super.finalize();
	}
}
