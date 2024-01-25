import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public final class Class256 {

	@OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
	public final int anInt8001;

	@OriginalMember(owner = "client!pi", name = "c", descriptor = "Lclient!nv;")
	private final Class16_Sub3 aClass16_Sub3_34;

	@OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lclient!nv;II)V")
	public Class256(@OriginalArg(0) Class16_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt8001 = arg2;
		this.aClass16_Sub3_34 = arg0;
	}

	@OriginalMember(owner = "client!pi", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass16_Sub3_34.method6022(this.anInt8001);
		super.finalize();
	}
}
