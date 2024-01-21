import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!cb", name = "j", descriptor = "Lclient!o;")
	public Class27 aClass27_1;

	@OriginalMember(owner = "client!cb", name = "k", descriptor = "Lclient!i;")
	public Class16 aClass16_1;

	@OriginalMember(owner = "client!cb", name = "l", descriptor = "Lclient!q;")
	public Class31 aClass31_1;

	@OriginalMember(owner = "client!cb", name = "m", descriptor = "Lclient!h;")
	public Class14 aClass14_1;

	@OriginalMember(owner = "client!cb", name = "n", descriptor = "Lclient!j;")
	public Class18 aClass18_1;

	@OriginalMember(owner = "client!cb", name = "o", descriptor = "Lclient!k;")
	public Class20 aClass20_1;

	@OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
	public int anInt85;

	@OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
	public int anInt86;

	@OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
	public int anInt87;

	@OriginalMember(owner = "client!cb", name = "u", descriptor = "Z")
	public boolean aBoolean31;

	@OriginalMember(owner = "client!cb", name = "v", descriptor = "Z")
	public boolean aBoolean32;

	@OriginalMember(owner = "client!cb", name = "w", descriptor = "Z")
	public boolean aBoolean33;

	@OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
	public int anInt88;

	@OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
	public int anInt89;

	@OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
	public int anInt90;

	@OriginalMember(owner = "client!cb", name = "A", descriptor = "I")
	public int anInt91;

	@OriginalMember(owner = "client!cb", name = "B", descriptor = "Lclient!cb;")
	public Class1_Sub2 aClass1_Sub2_1;

	@OriginalMember(owner = "client!cb", name = "q", descriptor = "[Lclient!p;")
	public Class29[] aClass29Array1 = new Class29[5];

	@OriginalMember(owner = "client!cb", name = "r", descriptor = "[I")
	public int[] anIntArray22 = new int[5];

	@OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
	public int anInt81;

	@OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
	public int anInt84;

	@OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
	public int anInt82;

	@OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
	public int anInt83;

	@OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(III)V")
	public Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt84 = this.anInt81 = arg0;
		this.anInt82 = arg1;
		this.anInt83 = arg2;
	}
}
