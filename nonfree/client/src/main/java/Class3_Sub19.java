import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public abstract class Class3_Sub19 extends Class3 {

	@OriginalMember(owner = "client!pb", name = "p", descriptor = "Lclient!pb;")
	public Class3_Sub19 aClass3_Sub19_8;

	@OriginalMember(owner = "client!pb", name = "q", descriptor = "Lclient!ua;")
	public Class3_Sub24 aClass3_Sub24_5;

	@OriginalMember(owner = "client!pb", name = "s", descriptor = "I")
	public int anInt4183;

	@OriginalMember(owner = "client!pb", name = "r", descriptor = "Z")
	public volatile boolean aBoolean187 = true;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "()I")
	public abstract int method3244();

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "([III)V")
	protected final void method3245(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean187) {
			this.method3249(arg0, arg1, arg2);
		} else {
			this.method3248(arg2);
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "()Lclient!pb;")
	public abstract Class3_Sub19 method3246();

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "()Lclient!pb;")
	public abstract Class3_Sub19 method3247();

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
	public abstract void method3248(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "([III)V")
	public abstract void method3249(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "()I")
	public int method3250() {
		return 255;
	}
}
