import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public abstract class Class10_Sub7 extends Class10 {

	@OriginalMember(owner = "client!sc", name = "k", descriptor = "Lclient!sc;")
	public Class10_Sub7 aClass10_Sub7_8;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
	public int anInt6097;

	@OriginalMember(owner = "client!sc", name = "m", descriptor = "Lclient!kf;")
	public Class10_Sub25 aClass10_Sub25_5;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "Z")
	public volatile boolean aBoolean394 = true;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "([III)V")
	public abstract void method4813(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "()I")
	public int method4814() {
		return 255;
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "([III)V")
	protected final void method4815(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean394) {
			this.method4813(arg0, arg1, arg2);
		} else {
			this.method4817(arg2);
		}
	}

	@OriginalMember(owner = "client!sc", name = "b", descriptor = "()Lclient!sc;")
	public abstract Class10_Sub7 method4816();

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(I)V")
	public abstract void method4817(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!sc", name = "c", descriptor = "()Lclient!sc;")
	public abstract Class10_Sub7 method4818();

	@OriginalMember(owner = "client!sc", name = "d", descriptor = "()I")
	public abstract int method4819();
}
