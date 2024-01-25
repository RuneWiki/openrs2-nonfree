import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public final class Class12 {

	@OriginalMember(owner = "client!am", name = "a", descriptor = "I")
	public int anInt181;

	@OriginalMember(owner = "client!am", name = "b", descriptor = "I")
	public int anInt182;

	@OriginalMember(owner = "client!am", name = "g", descriptor = "I")
	public int anInt184;

	@OriginalMember(owner = "client!am", name = "m", descriptor = "Lclient!mu;")
	public Class127 aClass127_1;

	@OriginalMember(owner = "client!am", name = "n", descriptor = "Lclient!am;")
	public Class12 aClass12_1;

	@OriginalMember(owner = "client!am", name = "k", descriptor = "I")
	public final int anInt187;

	@OriginalMember(owner = "client!am", name = "j", descriptor = "I")
	public final int anInt186;

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(II)V")
	public Class12(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt187 = arg0;
		this.anInt186 = arg1;
	}

	@OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lclient!am;I)V")
	public Class12(@OriginalArg(0) Class12 arg0, @OriginalArg(1) int arg1) {
		this.aClass12_1 = arg0;
		this.aClass127_1 = this.aClass12_1.aClass127_1;
		this.anInt186 = this.aClass12_1.anInt186 + arg1;
		this.anInt187 = this.aClass12_1.anInt187;
	}
}
