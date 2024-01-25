import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fja")
public final class Class117 {

	@OriginalMember(owner = "client!fja", name = "d", descriptor = "J")
	public final long aLong99;

	@OriginalMember(owner = "client!fja", name = "a", descriptor = "Lclient!og;")
	private final Class143_Sub1_Sub2 aClass143_Sub1_Sub2_2;

	@OriginalMember(owner = "client!fja", name = "<init>", descriptor = "(Lclient!og;J[Lclient!ut;)V")
	public Class117(@OriginalArg(0) Class143_Sub1_Sub2 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class362[] arg2) {
		this.aLong99 = arg1;
		this.aClass143_Sub1_Sub2_2 = arg0;
	}

	@OriginalMember(owner = "client!fja", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass143_Sub1_Sub2_2.method6409(this.aLong99);
		super.finalize();
	}
}
