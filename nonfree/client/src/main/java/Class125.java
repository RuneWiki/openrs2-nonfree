import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public final class Class125 {

	@OriginalMember(owner = "client!gt", name = "e", descriptor = "Lclient!via;")
	public Class2_Sub8_Sub5 aClass2_Sub8_Sub5_1;

	@OriginalMember(owner = "client!gt", name = "l", descriptor = "Lclient!ck;")
	public Class61 aClass61_1;

	@OriginalMember(owner = "client!gt", name = "r", descriptor = "Lclient!ob;")
	public Class2_Sub29_Sub1 aClass2_Sub29_Sub1_1;

	@OriginalMember(owner = "client!gt", name = "u", descriptor = "Lclient!hp;")
	public Class2_Sub22 aClass2_Sub22_1;

	@OriginalMember(owner = "client!gt", name = "f", descriptor = "I")
	public final int anInt4513;

	@OriginalMember(owner = "client!gt", name = "m", descriptor = "I")
	public final int anInt4517;

	@OriginalMember(owner = "client!gt", name = "q", descriptor = "I")
	public int anInt4519;

	@OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
	public final int anInt4514;

	@OriginalMember(owner = "client!gt", name = "n", descriptor = "I")
	public final int anInt4518;

	@OriginalMember(owner = "client!gt", name = "i", descriptor = "B")
	public final byte aByte72;

	@OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
	public final int anInt4511;

	@OriginalMember(owner = "client!gt", name = "a", descriptor = "Lclient!ga;")
	public final Class3_Sub1 aClass3_Sub1_14;

	@OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(BIIIIIILclient!ga;)V")
	public Class125(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) Class3_Sub1 arg7) {
		this.anInt4513 = arg2;
		this.anInt4517 = arg4;
		this.anInt4519 = arg3;
		this.anInt4514 = arg5;
		this.anInt4518 = arg1;
		this.aByte72 = arg0;
		this.anInt4511 = arg6;
		this.aClass3_Sub1_14 = arg7;
	}

	@OriginalMember(owner = "client!gt", name = "c", descriptor = "(B)Z")
	public boolean method3953() {
		return this.aByte72 == 2 || this.aByte72 == 3;
	}
}
