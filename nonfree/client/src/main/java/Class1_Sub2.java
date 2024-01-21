import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "Lclient!o;")
	public Class24 aClass24_1;

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "Lclient!i;")
	public Class16 aClass16_1;

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "Lclient!q;")
	public Class28 aClass28_1;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "Lclient!h;")
	public Class14 aClass14_1;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "Lclient!j;")
	public Class18 aClass18_1;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "Lclient!k;")
	public Class20 aClass20_1;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
	public int anInt55;

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
	public int anInt56;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
	public int anInt57;

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "Z")
	public boolean aBoolean21;

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "Z")
	public boolean aBoolean22;

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "Z")
	public boolean aBoolean23;

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
	public int anInt58;

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
	public int anInt59;

	@OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
	public int anInt60;

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
	public int anInt61;

	@OriginalMember(owner = "client!cb", name = "A", descriptor = "Lclient!cb;")
	public Class1_Sub2 aClass1_Sub2_1;

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "[Lclient!p;")
	public Class26[] aClass26Array1 = new Class26[5];

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "[I")
	public int[] anIntArray14 = new int[5];

	@OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
	public int anInt51;

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
	public int anInt54;

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
	public int anInt52;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
	public int anInt53;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(III)V")
	public Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt54 = this.anInt51 = arg0;
		this.anInt52 = arg1;
		this.anInt53 = arg2;
	}
}
