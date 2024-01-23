import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public final class Class78 {

	@OriginalMember(owner = "client!ho", name = "j", descriptor = "I")
	public int anInt2253;

	@OriginalMember(owner = "client!ho", name = "b", descriptor = "[Lclient!bb;")
	public Class1_Sub5_Sub1[] aClass1_Sub5_Sub1Array1;

	@OriginalMember(owner = "client!ho", name = "e", descriptor = "[I")
	public int[] anIntArray157;

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(I)V")
	public Class78(@OriginalArg(0) int arg0) {
		this.anInt2253 = arg0;
		this.aClass1_Sub5_Sub1Array1 = new Class1_Sub5_Sub1[this.anInt2253];
		this.anIntArray157 = new int[this.anInt2253];
	}
}
