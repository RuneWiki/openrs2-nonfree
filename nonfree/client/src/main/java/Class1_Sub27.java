import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public final class Class1_Sub27 extends Class1 {

	@OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
	public int anInt4827;

	@OriginalMember(owner = "client!rd", name = "m", descriptor = "[Lclient!ac;")
	public Class4[] aClass4Array2;

	@OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(I[Lclient!ac;)V")
	public Class1_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) Class4[] arg1) {
		this.anInt4827 = arg0;
		this.aClass4Array2 = arg1;
	}
}
