import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "Lclient!n;")
	public Class22 aClass22_1;

	@OriginalMember(owner = "client!bb", name = "j", descriptor = "Lclient!h;")
	public Class14 aClass14_1;

	@OriginalMember(owner = "client!bb", name = "k", descriptor = "Lclient!p;")
	public Class26 aClass26_1;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "Lclient!g;")
	public Class12 aClass12_1;

	@OriginalMember(owner = "client!bb", name = "m", descriptor = "Lclient!i;")
	public Class16 aClass16_1;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "Lclient!j;")
	public Class18 aClass18_1;

	@OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
	public int anInt43;

	@OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
	public int anInt44;

	@OriginalMember(owner = "client!bb", name = "s", descriptor = "I")
	public int anInt45;

	@OriginalMember(owner = "client!bb", name = "t", descriptor = "Z")
	public boolean aBoolean8;

	@OriginalMember(owner = "client!bb", name = "u", descriptor = "Z")
	public boolean aBoolean9;

	@OriginalMember(owner = "client!bb", name = "v", descriptor = "Z")
	public boolean aBoolean10;

	@OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
	public int anInt46;

	@OriginalMember(owner = "client!bb", name = "x", descriptor = "I")
	public int anInt47;

	@OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
	public int anInt48;

	@OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
	public int anInt49;

	@OriginalMember(owner = "client!bb", name = "A", descriptor = "Lclient!bb;")
	public Class1_Sub2 aClass1_Sub2_1;

	@OriginalMember(owner = "client!bb", name = "p", descriptor = "[Lclient!o;")
	public Class24[] aClass24Array1 = new Class24[5];

	@OriginalMember(owner = "client!bb", name = "q", descriptor = "[I")
	public int[] anIntArray3 = new int[5];

	@OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
	public int anInt39;

	@OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
	public int anInt42;

	@OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
	public int anInt40;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
	public int anInt41;

	@OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(III)V")
	public Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt42 = this.anInt39 = arg0;
		this.anInt40 = arg1;
		this.anInt41 = arg2;
	}
}
