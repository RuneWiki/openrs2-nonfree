import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public final class Class261 {

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "I")
	public final int anInt7683;

	@OriginalMember(owner = "client!rv", name = "g", descriptor = "Lclient!jj;")
	private final Class62_Sub3 aClass62_Sub3_36;

	@OriginalMember(owner = "client!rv", name = "<init>", descriptor = "(Lclient!jj;II)V")
	public Class261(@OriginalArg(0) Class62_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7683 = arg2;
		this.aClass62_Sub3_36 = arg0;
	}

	@OriginalMember(owner = "client!rv", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass62_Sub3_36.method3976(this.anInt7683);
		super.finalize();
	}
}
