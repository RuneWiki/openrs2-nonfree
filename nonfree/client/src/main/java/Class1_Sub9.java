import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public final class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
	public int anInt468;

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "[Lclient!fc;")
	public Class43[] aClass43Array1;

	@OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(I[Lclient!fc;)V")
	public Class1_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) Class43[] arg1) {
		this.anInt468 = arg0;
		this.aClass43Array1 = arg1;
	}
}
