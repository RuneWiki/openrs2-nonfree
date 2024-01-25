import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public final class Class163 {

	@OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
	public int anInt4038;

	@OriginalMember(owner = "client!jq", name = "c", descriptor = "Lclient!jq;")
	public Class163 aClass163_1;

	@OriginalMember(owner = "client!jq", name = "f", descriptor = "I")
	public int anInt4039;

	@OriginalMember(owner = "client!jq", name = "h", descriptor = "I")
	public int anInt4041;

	@OriginalMember(owner = "client!jq", name = "i", descriptor = "I")
	public int anInt4042;

	@OriginalMember(owner = "client!jq", name = "j", descriptor = "I")
	public int anInt4043;

	@OriginalMember(owner = "client!jq", name = "n", descriptor = "I")
	public int anInt4047;

	@OriginalMember(owner = "client!jq", name = "o", descriptor = "I")
	public int anInt4048;

	@OriginalMember(owner = "client!jq", name = "t", descriptor = "I")
	public int anInt4051;

	@OriginalMember(owner = "client!jq", name = "u", descriptor = "I")
	public int anInt4052;

	@OriginalMember(owner = "client!jq", name = "p", descriptor = "I")
	public final int anInt4049;

	@OriginalMember(owner = "client!jq", name = "r", descriptor = "B")
	public final byte aByte53;

	@OriginalMember(owner = "client!jq", name = "g", descriptor = "I")
	private final int anInt4040;

	@OriginalMember(owner = "client!jq", name = "k", descriptor = "I")
	public final int anInt4044;

	@OriginalMember(owner = "client!jq", name = "l", descriptor = "I")
	public final int anInt4045;

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(IIIIB)V")
	public Class163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) byte arg4) {
		this.anInt4049 = arg1;
		this.aByte53 = arg4;
		this.anInt4040 = arg0;
		this.anInt4044 = arg2;
		this.anInt4045 = arg3;
	}

	@OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lclient!jq;I)V")
	public Class163(@OriginalArg(0) Class163 arg0, @OriginalArg(1) int arg1) {
		this.aClass163_1 = arg0;
		this.anInt4049 = this.aClass163_1.anInt4049 + arg1;
		this.anInt4045 = arg1 + this.aClass163_1.anInt4045;
		this.anInt4040 = this.aClass163_1.anInt4040;
		this.anInt4044 = this.aClass163_1.anInt4044 + arg1;
		this.aByte53 = this.aClass163_1.aByte53;
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(IIII)Lclient!jq;")
	public Class163 method3499(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		return new Class163(this.anInt4040, arg2, arg0, arg1, this.aByte53);
	}

	@OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)Lclient!pca;")
	public Class242 method3500() {
		return Static254.method3577(this.anInt4040);
	}
}
