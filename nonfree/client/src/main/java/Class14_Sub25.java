import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pq")
public final class Class14_Sub25 extends Class14 {

	@OriginalMember(owner = "client!pq", name = "n", descriptor = "[Lclient!lc;")
	public static final Class126[] aClass126Array1 = new Class126[5];

	@OriginalMember(owner = "client!pq", name = "p", descriptor = "I")
	public final int anInt4867;

	@OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
	public final int anInt4869;

	static {
		for (@Pc(4) int local4 = 0; local4 < aClass126Array1.length; local4++) {
			aClass126Array1[local4] = new Class126();
		}
	}

	@OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(II)V")
	public Class14_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt4867 = arg1;
		this.anInt4869 = arg0;
	}
}
