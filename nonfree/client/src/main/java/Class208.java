import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public final class Class208 {

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "I")
	public final int anInt5014;

	@OriginalMember(owner = "client!kf", name = "d", descriptor = "Lclient!mba;")
	private final Class145_Sub1_Sub1 aClass145_Sub1_Sub1_4;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lclient!mba;II)V")
	public Class208(@OriginalArg(0) Class145_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt5014 = arg2;
		this.aClass145_Sub1_Sub1_4 = arg0;
	}

	@OriginalMember(owner = "client!kf", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass145_Sub1_Sub1_4.method5736(this.anInt5014);
		super.finalize();
	}
}
