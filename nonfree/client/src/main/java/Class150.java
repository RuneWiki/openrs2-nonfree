import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public final class Class150 {

	@OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
	public final int anInt4894;

	@OriginalMember(owner = "client!jm", name = "e", descriptor = "Lclient!ad;")
	private final Class5_Sub1 aClass5_Sub1_19;

	@OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(Lclient!ad;II)V")
	public Class150(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt4894 = arg2;
		this.aClass5_Sub1_19 = arg0;
	}

	@OriginalMember(owner = "client!jm", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass5_Sub1_19.method452(this.anInt4894);
		super.finalize();
	}
}
