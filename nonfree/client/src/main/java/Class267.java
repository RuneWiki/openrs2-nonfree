import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public final class Class267 {

	@OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
	public final int anInt7827;

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "Lclient!kga;")
	private final Class44_Sub3 aClass44_Sub3_34;

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(Lclient!kga;II)V")
	public Class267(@OriginalArg(0) Class44_Sub3 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt7827 = arg2;
		this.aClass44_Sub3_34 = arg0;
	}

	@OriginalMember(owner = "client!qb", name = "finalize", descriptor = "()V")
	@Override
	public void finalize() throws Throwable {
		this.aClass44_Sub3_34.method4663(this.anInt7827);
		super.finalize();
	}
}
