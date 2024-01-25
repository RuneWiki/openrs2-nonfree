import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public abstract class Class5_Sub17 extends Class5 {

	@OriginalMember(owner = "client!nf", name = "i", descriptor = "Lclient!nf;")
	public Class5_Sub17 aClass5_Sub17_7;

	@OriginalMember(owner = "client!nf", name = "j", descriptor = "I")
	public int anInt5000;

	@OriginalMember(owner = "client!nf", name = "l", descriptor = "Lclient!rk;")
	public Class5_Sub15 aClass5_Sub15_5;

	@OriginalMember(owner = "client!nf", name = "k", descriptor = "Z")
	public volatile boolean aBoolean383 = true;

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "()I")
	public abstract int method4459();

	@OriginalMember(owner = "client!nf", name = "a", descriptor = "([III)V")
	protected final void method4460(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean383) {
			this.method4464(arg0, arg1, arg2);
		} else {
			this.method4465(arg2);
		}
	}

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "()Lclient!nf;")
	public abstract Class5_Sub17 method4461();

	@OriginalMember(owner = "client!nf", name = "c", descriptor = "()I")
	public int method4462() {
		return 255;
	}

	@OriginalMember(owner = "client!nf", name = "d", descriptor = "()Lclient!nf;")
	public abstract Class5_Sub17 method4463();

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "([III)V")
	public abstract void method4464(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
	public abstract void method4465(@OriginalArg(0) int arg0);
}
