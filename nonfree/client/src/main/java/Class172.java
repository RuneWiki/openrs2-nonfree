import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public final class Class172 {

	@OriginalMember(owner = "client!to", name = "t", descriptor = "I")
	public int anInt5300;

	@OriginalMember(owner = "client!to", name = "q", descriptor = "[I")
	public int[] anIntArray489;

	@OriginalMember(owner = "client!to", name = "g", descriptor = "[Lclient!gi;")
	public Class1_Sub1_Sub10[] aClass1_Sub1_Sub10Array1;

	@OriginalMember(owner = "client!to", name = "<init>", descriptor = "(I)V")
	public Class172(@OriginalArg(0) int arg0) {
		this.anInt5300 = arg0;
		this.anIntArray489 = new int[this.anInt5300];
		this.aClass1_Sub1_Sub10Array1 = new Class1_Sub1_Sub10[this.anInt5300];
	}
}
