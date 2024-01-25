import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public abstract class Class3_Sub5 extends Class3 {

	@OriginalMember(owner = "client!bl", name = "l", descriptor = "Lclient!tf;")
	public Class3_Sub6 aClass3_Sub6_5;

	@OriginalMember(owner = "client!bl", name = "m", descriptor = "I")
	public int anInt6565;

	@OriginalMember(owner = "client!bl", name = "o", descriptor = "Lclient!bl;")
	public Class3_Sub5 aClass3_Sub5_8;

	@OriginalMember(owner = "client!bl", name = "n", descriptor = "Z")
	public volatile boolean aBoolean572 = true;

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "([III)V")
	public abstract void method5117(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bl", name = "a", descriptor = "()I")
	public int method5118() {
		return 255;
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "(I)V")
	public abstract void method5119(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "()Lclient!bl;")
	public abstract Class3_Sub5 method5120();

	@OriginalMember(owner = "client!bl", name = "b", descriptor = "([III)V")
	protected final void method5121(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean572) {
			this.method5117(arg0, arg1, arg2);
		} else {
			this.method5119(arg2);
		}
	}

	@OriginalMember(owner = "client!bl", name = "c", descriptor = "()I")
	public abstract int method5122();

	@OriginalMember(owner = "client!bl", name = "d", descriptor = "()Lclient!bl;")
	public abstract Class3_Sub5 method5123();
}
