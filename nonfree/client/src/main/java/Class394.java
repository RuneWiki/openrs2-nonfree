import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wja")
public final class Class394 {

	@OriginalMember(owner = "client!wja", name = "i", descriptor = "Lclient!tia;")
	private final Class100_Sub1_Sub2 aClass100_Sub1_Sub2_12;

	@OriginalMember(owner = "client!wja", name = "h", descriptor = "I")
	public final int anInt10800;

	@OriginalMember(owner = "client!wja", name = "<init>", descriptor = "(Lclient!tia;II)V")
	public Class394(@OriginalArg(0) Class100_Sub1_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass100_Sub1_Sub2_12 = arg0;
		this.anInt10800 = arg2;
	}

	@OriginalMember(owner = "client!wja", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass100_Sub1_Sub2_12.method8003(this.anInt10800);
		super.finalize();
	}
}
