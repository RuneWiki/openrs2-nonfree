import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
	public int anInt15;

	@OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
	public int anInt17;

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "Z")
	public boolean aBoolean1;

	@OriginalMember(owner = "client!ab", name = "y", descriptor = "I")
	public int anInt21;

	@OriginalMember(owner = "client!ab", name = "z", descriptor = "I")
	public int anInt22;

	@OriginalMember(owner = "client!ab", name = "A", descriptor = "Lclient!ab;")
	public Class2_Sub1 aClass2_Sub1_1;

	@OriginalMember(owner = "client!ab", name = "B", descriptor = "Z")
	public boolean aBoolean2;

	@OriginalMember(owner = "client!ab", name = "C", descriptor = "I")
	public int anInt23;

	@OriginalMember(owner = "client!ab", name = "D", descriptor = "Lclient!ei;")
	public Class26 aClass26_1;

	@OriginalMember(owner = "client!ab", name = "H", descriptor = "Lclient!ba;")
	public Class7 aClass7_1;

	@OriginalMember(owner = "client!ab", name = "J", descriptor = "Z")
	public boolean aBoolean3;

	@OriginalMember(owner = "client!ab", name = "K", descriptor = "Lclient!la;")
	public Class47 aClass47_1;

	@OriginalMember(owner = "client!ab", name = "L", descriptor = "Lclient!nf;")
	public Class59 aClass59_1;

	@OriginalMember(owner = "client!ab", name = "M", descriptor = "Lclient!eb;")
	public Class21 aClass21_1;

	@OriginalMember(owner = "client!ab", name = "O", descriptor = "Lclient!dg;")
	public Class17 aClass17_1;

	@OriginalMember(owner = "client!ab", name = "P", descriptor = "I")
	public int anInt27;

	@OriginalMember(owner = "client!ab", name = "x", descriptor = "I")
	public int anInt20 = 0;

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "[Lclient!ed;")
	public final Class22[] aClass22Array1 = new Class22[5];

	@OriginalMember(owner = "client!ab", name = "E", descriptor = "[I")
	public final int[] anIntArray2 = new int[5];

	@OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
	public final int anInt19;

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
	public int anInt18;

	@OriginalMember(owner = "client!ab", name = "F", descriptor = "I")
	public final int anInt24;

	@OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
	public final int anInt13;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(III)V")
	public Class2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt19 = arg1;
		this.anInt24 = this.anInt18 = arg0;
		this.anInt13 = arg2;
	}
}
