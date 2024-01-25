import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public final class Class273 {

	@OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
	public final int anInt8193;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "Lclient!wh;")
	private final Class100_Sub3 aClass100_Sub3_36;

	@OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lclient!wh;II)V")
	public Class273(@OriginalArg(0) Class100_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8193 = arg2;
		this.aClass100_Sub3_36 = arg0;
	}

	@OriginalMember(owner = "client!qi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass100_Sub3_36.method8873(this.anInt8193);
		super.finalize();
	}
}
