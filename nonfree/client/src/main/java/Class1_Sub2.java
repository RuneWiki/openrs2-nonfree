import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public final class Class1_Sub2 extends Class1 {

	@OriginalMember(owner = "client!aa", name = "t", descriptor = "I")
	public int anInt42;

	@OriginalMember(owner = "client!aa", name = "v", descriptor = "Lclient!me;")
	public Class106 aClass106_1;

	@OriginalMember(owner = "client!aa", name = "w", descriptor = "B")
	public byte aByte1;

	@OriginalMember(owner = "client!aa", name = "y", descriptor = "Lclient!tb;")
	public Class163 aClass163_1;

	@OriginalMember(owner = "client!aa", name = "z", descriptor = "Lclient!ia;")
	public Class73 aClass73_1;

	@OriginalMember(owner = "client!aa", name = "A", descriptor = "I")
	public int anInt45;

	@OriginalMember(owner = "client!aa", name = "B", descriptor = "Z")
	public boolean aBoolean3;

	@OriginalMember(owner = "client!aa", name = "C", descriptor = "Lclient!qa;")
	public Class136 aClass136_1;

	@OriginalMember(owner = "client!aa", name = "D", descriptor = "I")
	public int anInt46;

	@OriginalMember(owner = "client!aa", name = "G", descriptor = "Lclient!ob;")
	public Class119 aClass119_1;

	@OriginalMember(owner = "client!aa", name = "H", descriptor = "Lclient!an;")
	public Class10 aClass10_1;

	@OriginalMember(owner = "client!aa", name = "J", descriptor = "I")
	public int anInt48;

	@OriginalMember(owner = "client!aa", name = "L", descriptor = "I")
	public int anInt50;

	@OriginalMember(owner = "client!aa", name = "M", descriptor = "Z")
	public boolean aBoolean4;

	@OriginalMember(owner = "client!aa", name = "P", descriptor = "Lclient!aa;")
	public Class1_Sub2 aClass1_Sub2_1;

	@OriginalMember(owner = "client!aa", name = "Q", descriptor = "Lclient!vb;")
	public Class179 aClass179_1;

	@OriginalMember(owner = "client!aa", name = "S", descriptor = "Z")
	public boolean aBoolean5;

	@OriginalMember(owner = "client!aa", name = "s", descriptor = "[I")
	public int[] anIntArray2 = new int[5];

	@OriginalMember(owner = "client!aa", name = "N", descriptor = "[Lclient!aj;")
	public Class7[] aClass7Array1 = new Class7[5];

	@OriginalMember(owner = "client!aa", name = "V", descriptor = "I")
	public int anInt54 = 0;

	@OriginalMember(owner = "client!aa", name = "W", descriptor = "I")
	public int anInt55;

	@OriginalMember(owner = "client!aa", name = "F", descriptor = "I")
	public int anInt47;

	@OriginalMember(owner = "client!aa", name = "K", descriptor = "I")
	public int anInt49;

	@OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
	public int anInt43;

	@OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(III)V")
	public Class1_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt55 = arg2;
		this.anInt49 = this.anInt47 = arg0;
		this.anInt43 = arg1;
	}
}
