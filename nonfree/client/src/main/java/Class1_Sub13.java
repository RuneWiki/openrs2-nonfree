import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public final class Class1_Sub13 extends Class1 {

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
	public int anInt1889;

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "[Lclient!dn;")
	public Class41[] aClass41Array1;

	@OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(I[Lclient!dn;)V")
	public Class1_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) Class41[] arg1) {
		this.anInt1889 = arg0;
		this.aClass41Array1 = arg1;
	}
}
