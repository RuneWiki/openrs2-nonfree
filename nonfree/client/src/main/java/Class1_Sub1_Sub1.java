import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public final class Class1_Sub1_Sub1 extends Class1_Sub1 {

	@OriginalMember(owner = "client!a", name = "x", descriptor = "I")
	public int anInt31;

	@OriginalMember(owner = "client!a", name = "z", descriptor = "I")
	public int anInt32;

	@OriginalMember(owner = "client!a", name = "B", descriptor = "I")
	public int anInt34;

	@OriginalMember(owner = "client!a", name = "C", descriptor = "I")
	public int anInt35;

	@OriginalMember(owner = "client!a", name = "E", descriptor = "I")
	public int anInt36;

	@OriginalMember(owner = "client!a", name = "F", descriptor = "I")
	public int anInt37;

	@OriginalMember(owner = "client!a", name = "G", descriptor = "I")
	public int anInt38;

	@OriginalMember(owner = "client!a", name = "H", descriptor = "I")
	public int anInt39;

	@OriginalMember(owner = "client!a", name = "D", descriptor = "Lclient!bb;")
	public Class15 aClass15_1;

	@OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Lclient!bb;Lclient!ko;)V")
	public Class1_Sub1_Sub1(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class45_Sub2 arg1) {
		this.aClass15_1 = arg0;
	}

	@OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIZ)V")
	public void method30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		this.anInt31 = arg0;
		this.anInt36 = arg2;
		this.anInt37 = arg1;
	}
}
