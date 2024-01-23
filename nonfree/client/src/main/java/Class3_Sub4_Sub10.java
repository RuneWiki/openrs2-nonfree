import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public final class Class3_Sub4_Sub10 extends Class3_Sub4 {

	@OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
	public int anInt1861;

	@OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
	public int anInt1863;

	@OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
	public int anInt1865;

	@OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
	public int anInt1866;

	@OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
	public int anInt1869;

	@OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
	public int anInt1870;

	@OriginalMember(owner = "client!ha", name = "M", descriptor = "I")
	public int anInt1871;

	@OriginalMember(owner = "client!ha", name = "O", descriptor = "I")
	public int anInt1872;

	@OriginalMember(owner = "client!ha", name = "N", descriptor = "Lclient!go;")
	public Class67 aClass67_1;

	@OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lclient!go;Lclient!em;)V")
	public Class3_Sub4_Sub10(@OriginalArg(0) Class67 arg0, @OriginalArg(1) Class47_Sub1 arg1) {
		this.aClass67_1 = arg0;
	}

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIZI)V")
	public void method1629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		this.anInt1865 = arg1;
		this.anInt1869 = arg2;
		this.anInt1870 = arg0;
	}
}
