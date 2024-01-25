import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public abstract class Class3_Sub2 extends Class3 {

	@OriginalMember(owner = "client!mq", name = "k", descriptor = "I")
	public int anInt6010;

	@OriginalMember(owner = "client!mq", name = "m", descriptor = "Lclient!mq;")
	public Class3_Sub2 aClass3_Sub2_8;

	@OriginalMember(owner = "client!mq", name = "n", descriptor = "Lclient!fe;")
	public Class3_Sub17 aClass3_Sub17_5;

	@OriginalMember(owner = "client!mq", name = "l", descriptor = "Z")
	public volatile boolean aBoolean413 = true;

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "([III)V")
	protected final void method5107(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean413) {
			this.method5109(arg0, arg1, arg2);
		} else {
			this.method5108(arg2);
		}
	}

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)V")
	public abstract void method5108(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "([III)V")
	public abstract void method5109(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "()Lclient!mq;")
	public abstract Class3_Sub2 method5110();

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "()Lclient!mq;")
	public abstract Class3_Sub2 method5111();

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "()I")
	public int method5112() {
		return 255;
	}

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "()I")
	public abstract int method5113();
}
