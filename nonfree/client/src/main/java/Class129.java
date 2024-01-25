import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public final class Class129 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "Lclient!ck;")
	private final Class33_Sub1_Sub1 aClass33_Sub1_Sub1_3;

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
	public final int anInt4771;

	@OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lclient!ck;II)V")
	public Class129(@OriginalArg(0) Class33_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass33_Sub1_Sub1_3 = arg0;
		this.anInt4771 = arg2;
	}

	@OriginalMember(owner = "client!hg", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass33_Sub1_Sub1_3.method1733(this.anInt4771);
		super.finalize();
	}
}
