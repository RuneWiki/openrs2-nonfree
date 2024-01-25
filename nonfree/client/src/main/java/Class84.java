import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public final class Class84 {

	@OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
	public final int anInt2708;

	@OriginalMember(owner = "client!ed", name = "i", descriptor = "Lclient!er;")
	private final Class31_Sub2 aClass31_Sub2_14;

	@OriginalMember(owner = "client!ed", name = "<init>", descriptor = "(Lclient!er;II)V")
	public Class84(@OriginalArg(0) Class31_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt2708 = arg2;
		this.aClass31_Sub2_14 = arg0;
	}

	@OriginalMember(owner = "client!ed", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass31_Sub2_14.method2578(this.anInt2708);
		super.finalize();
	}
}
