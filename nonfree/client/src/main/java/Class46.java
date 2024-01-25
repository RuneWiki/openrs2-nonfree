import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public final class Class46 {

	@OriginalMember(owner = "client!db", name = "a", descriptor = "Lclient!si;")
	public Class4_Sub14_Sub4 aClass4_Sub14_Sub4_1;

	@OriginalMember(owner = "client!db", name = "c", descriptor = "Lclient!cd;")
	public Class38 aClass38_1;

	@OriginalMember(owner = "client!db", name = "f", descriptor = "Lclient!pu;")
	public Class4_Sub35 aClass4_Sub35_1;

	@OriginalMember(owner = "client!db", name = "j", descriptor = "Lclient!jc;")
	public Class4_Sub15_Sub1 aClass4_Sub15_Sub1_1;

	@OriginalMember(owner = "client!db", name = "i", descriptor = "I")
	public final int anInt1157;

	@OriginalMember(owner = "client!db", name = "e", descriptor = "I")
	public final int anInt1154;

	@OriginalMember(owner = "client!db", name = "m", descriptor = "B")
	public final byte aByte19;

	@OriginalMember(owner = "client!db", name = "k", descriptor = "I")
	public final int anInt1158;

	@OriginalMember(owner = "client!db", name = "h", descriptor = "I")
	public int anInt1156;

	@OriginalMember(owner = "client!db", name = "b", descriptor = "I")
	public final int anInt1153;

	@OriginalMember(owner = "client!db", name = "<init>", descriptor = "(BIIIII)V")
	public Class46(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt1157 = arg2;
		this.anInt1154 = arg4;
		this.aByte19 = arg0;
		this.anInt1158 = arg5;
		this.anInt1156 = arg3;
		this.anInt1153 = arg1;
	}
}
