import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public final class Class163 {

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
	public static int anInt4321 = -1;

	@OriginalMember(owner = "client!nm", name = "k", descriptor = "Lclient!h;")
	public static final Class89 aClass89_167 = new Class89(4, 1);

	@OriginalMember(owner = "client!nm", name = "n", descriptor = "Z")
	public static boolean aBoolean299 = false;

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
	public int anInt4322;

	@OriginalMember(owner = "client!nm", name = "g", descriptor = "Lclient!on;")
	public Class14 aClass14_5;

	@OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
	public int anInt4328;

	@OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
	public int anInt4330;

	@OriginalMember(owner = "client!nm", name = "o", descriptor = "Lclient!nm;")
	public Class163 aClass163_2;

	@OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
	public final int anInt4323;

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
	public final int anInt4326;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(II)V", line = 181)
	public Class163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4323 = arg0;
		this.anInt4326 = arg1;
	}

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lclient!nm;I)V", line = 189)
	public Class163(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int arg1) {
		this.aClass163_2 = arg0;
		this.anInt4326 = arg1 + this.aClass163_2.anInt4326;
		this.aClass14_5 = this.aClass163_2.aClass14_5;
		this.anInt4323 = this.aClass163_2.anInt4323;
	}
}
