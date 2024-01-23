import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public final class Class8_Sub17 extends Class8 {

	@OriginalMember(owner = "client!kf", name = "n", descriptor = "I")
	public int anInt2755;

	@OriginalMember(owner = "client!kf", name = "o", descriptor = "[Lclient!a;")
	public Class1[] aClass1Array1;

	@OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(I[Lclient!a;)V")
	public Class8_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) Class1[] arg1) {
		this.anInt2755 = arg0;
		this.aClass1Array1 = arg1;
	}
}
