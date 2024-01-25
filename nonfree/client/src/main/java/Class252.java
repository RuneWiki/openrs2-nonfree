import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public final class Class252 {

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "Lclient!lv;")
	public Class7_Sub31_Sub1 aClass7_Sub31_Sub1_2;

	@OriginalMember(owner = "client!uu", name = "b", descriptor = "Lclient!bf;")
	public Class23 aClass23_1;

	@OriginalMember(owner = "client!uu", name = "g", descriptor = "Lclient!pj;")
	public Class7_Sub35 aClass7_Sub35_1;

	@OriginalMember(owner = "client!uu", name = "j", descriptor = "Lclient!td;")
	public Class7_Sub8_Sub4 aClass7_Sub8_Sub4_4;

	@OriginalMember(owner = "client!uu", name = "m", descriptor = "I")
	public final int anInt6621;

	@OriginalMember(owner = "client!uu", name = "c", descriptor = "I")
	public final int anInt6616;

	@OriginalMember(owner = "client!uu", name = "i", descriptor = "I")
	public final int anInt6619;

	@OriginalMember(owner = "client!uu", name = "k", descriptor = "I")
	public int anInt6620;

	@OriginalMember(owner = "client!uu", name = "l", descriptor = "B")
	public final byte aByte90;

	@OriginalMember(owner = "client!uu", name = "f", descriptor = "I")
	public final int anInt6618;

	@OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(BIIIII)V")
	public Class252(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt6621 = arg4;
		this.anInt6616 = arg1;
		this.anInt6619 = arg5;
		this.anInt6620 = arg3;
		this.aByte90 = arg0;
		this.anInt6618 = arg2;
	}
}
