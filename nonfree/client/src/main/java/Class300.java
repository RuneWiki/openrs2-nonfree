import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public final class Class300 {

	@OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
	public final int anInt8054;

	@OriginalMember(owner = "client!rd", name = "c", descriptor = "Lclient!rda;")
	private final Class126_Sub3 aClass126_Sub3_31;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lclient!rda;II)V")
	public Class300(@OriginalArg(0) Class126_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8054 = arg2;
		this.aClass126_Sub3_31 = arg0;
	}

	@OriginalMember(owner = "client!rd", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass126_Sub3_31.method7071(this.anInt8054);
		super.finalize();
	}
}
