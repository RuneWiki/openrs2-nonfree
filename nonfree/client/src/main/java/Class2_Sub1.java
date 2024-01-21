import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public final class Class2_Sub1 extends Class2 {

	@OriginalMember(owner = "client!aa", name = "z", descriptor = "Lclient!ab;")
	public Class3 aClass3_1;

	@OriginalMember(owner = "client!aa", name = "B", descriptor = "Z")
	public boolean aBoolean3;

	@OriginalMember(owner = "client!aa", name = "E", descriptor = "Z")
	public boolean aBoolean4;

	@OriginalMember(owner = "client!aa", name = "F", descriptor = "I")
	public int anInt28;

	@OriginalMember(owner = "client!aa", name = "G", descriptor = "I")
	public int anInt29;

	@OriginalMember(owner = "client!aa", name = "H", descriptor = "I")
	public int anInt30;

	@OriginalMember(owner = "client!aa", name = "I", descriptor = "Lclient!pb;")
	public Class60 aClass60_1;

	@OriginalMember(owner = "client!aa", name = "J", descriptor = "I")
	public int anInt31;

	@OriginalMember(owner = "client!aa", name = "M", descriptor = "Lclient!aa;")
	public Class2_Sub1 aClass2_Sub1_1;

	@OriginalMember(owner = "client!aa", name = "N", descriptor = "Lclient!tc;")
	public Class71 aClass71_1;

	@OriginalMember(owner = "client!aa", name = "O", descriptor = "Lclient!wd;")
	public Class81 aClass81_1;

	@OriginalMember(owner = "client!aa", name = "P", descriptor = "Lclient!ea;")
	public Class17 aClass17_1;

	@OriginalMember(owner = "client!aa", name = "T", descriptor = "I")
	public int anInt35;

	@OriginalMember(owner = "client!aa", name = "U", descriptor = "Lclient!me;")
	public Class49 aClass49_1;

	@OriginalMember(owner = "client!aa", name = "W", descriptor = "I")
	public int anInt37;

	@OriginalMember(owner = "client!aa", name = "mb", descriptor = "Z")
	public boolean aBoolean5;

	@OriginalMember(owner = "client!aa", name = "C", descriptor = "[I")
	public final int[] anIntArray5 = new int[5];

	@OriginalMember(owner = "client!aa", name = "A", descriptor = "[Lclient!fd;")
	public final Class25[] aClass25Array1 = new Class25[5];

	@OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
	public int anInt36 = 0;

	@OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
	public final int anInt34;

	@OriginalMember(owner = "client!aa", name = "D", descriptor = "I")
	public final int anInt27;

	@OriginalMember(owner = "client!aa", name = "Q", descriptor = "I")
	public int anInt33;

	@OriginalMember(owner = "client!aa", name = "K", descriptor = "I")
	public final int anInt32;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(III)V")
	public Class2_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt34 = arg1;
		this.anInt27 = arg2;
		this.anInt32 = this.anInt33 = arg0;
	}
}
