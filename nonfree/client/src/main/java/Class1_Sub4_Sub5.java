import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cm")
public final class Class1_Sub4_Sub5 extends Class1_Sub4 {

	@OriginalMember(owner = "client!cm", name = "C", descriptor = "Lclient!or;")
	public final Class11_Sub2_Sub4 aClass11_Sub2_Sub4_1;

	@OriginalMember(owner = "client!cm", name = "<init>", descriptor = "(Lclient!or;)V")
	public Class1_Sub4_Sub5(@OriginalArg(0) Class11_Sub2_Sub4 arg0) {
		this.aClass11_Sub2_Sub4_1 = arg0;
	}
}
