import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public final class Class119 {

	@OriginalMember(owner = "client!l", name = "a", descriptor = "Lclient!mm;")
	private final Class55_Sub1 aClass55_Sub1_28;

	@OriginalMember(owner = "client!l", name = "c", descriptor = "I")
	public final int anInt3484;

	@OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lclient!mm;II)V")
	public Class119(@OriginalArg(0) Class55_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.aClass55_Sub1_28 = arg0;
		this.anInt3484 = arg2;
	}

	@OriginalMember(owner = "client!l", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass55_Sub1_28.method3661(this.anInt3484);
		super.finalize();
	}
}
