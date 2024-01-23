import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public final class Class1_Sub25 extends Class1 {

	@OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
	public int anInt5127;

	@OriginalMember(owner = "client!sf", name = "o", descriptor = "[Lclient!ul;")
	public Class175[] aClass175Array1;

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "(I[Lclient!ul;)V")
	public Class1_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) Class175[] arg1) {
		this.anInt5127 = arg0;
		this.aClass175Array1 = arg1;
	}
}
