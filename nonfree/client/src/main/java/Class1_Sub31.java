import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public final class Class1_Sub31 extends Class1 {

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
	public int anInt6185 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
	public int anInt6187 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
	public int anInt6186 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wg", name = "w", descriptor = "I")
	public int anInt6189 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
	public int anInt6191 = Integer.MIN_VALUE;

	@OriginalMember(owner = "client!wg", name = "C", descriptor = "I")
	public int anInt6193 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wg", name = "B", descriptor = "I")
	public int anInt6192 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wg", name = "L", descriptor = "I")
	public int anInt6197 = Integer.MAX_VALUE;

	@OriginalMember(owner = "client!wg", name = "r", descriptor = "Lclient!jn;")
	public Class1_Sub3_Sub11 aClass1_Sub3_Sub11_1;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(Lclient!jn;)V")
	public Class1_Sub31(@OriginalArg(0) Class1_Sub3_Sub11 arg0) {
		this.aClass1_Sub3_Sub11_1 = arg0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(BII)Z")
	public boolean method4685(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (this.anInt6193 <= arg0 && arg0 <= this.anInt6191 && this.anInt6192 <= arg1 && this.anInt6186 >= arg1) {
			return true;
		} else {
			return this.anInt6185 <= arg0 && arg0 <= this.anInt6187 && this.anInt6197 <= arg1 && arg1 <= this.anInt6189;
		}
	}
}
