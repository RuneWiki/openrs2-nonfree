import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public abstract class Class3_Sub12 extends Class3 {

	@OriginalMember(owner = "client!pp", name = "k", descriptor = "Lclient!wd;")
	public Class3_Sub39 aClass3_Sub39_6;

	@OriginalMember(owner = "client!pp", name = "l", descriptor = "Lclient!pp;")
	public Class3_Sub12 aClass3_Sub12_9;

	@OriginalMember(owner = "client!pp", name = "m", descriptor = "I")
	public int anInt10849;

	@OriginalMember(owner = "client!pp", name = "n", descriptor = "Z")
	public volatile boolean aBoolean751 = true;

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
	public abstract void method8942(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "()I")
	public int method8943() {
		return 255;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "([III)V")
	protected final void method8944(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean751) {
			this.method8948(arg0, arg1, arg2);
		} else {
			this.method8942(arg2);
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "()Lclient!pp;")
	public abstract Class3_Sub12 method8945();

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "()Lclient!pp;")
	public abstract Class3_Sub12 method8946();

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "()I")
	public abstract int method8947();

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "([III)V")
	public abstract void method8948(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);
}
