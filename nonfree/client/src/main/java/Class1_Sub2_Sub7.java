import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public final class Class1_Sub2_Sub7 extends Class1_Sub2 {

	@OriginalMember(owner = "client!ei", name = "B", descriptor = "Lclient!uf;")
	public Class25_Sub5 aClass25_Sub5_1;

	@OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lclient!uf;)V")
	public Class1_Sub2_Sub7(@OriginalArg(0) Class25_Sub5 arg0) {
		this.aClass25_Sub5_1 = arg0;
	}
}
