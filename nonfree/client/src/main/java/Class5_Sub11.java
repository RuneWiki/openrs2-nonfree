import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public abstract class Class5_Sub11 extends Class5 {

	@OriginalMember(owner = "client!f", name = "o", descriptor = "I")
	public int anInt3786;

	@OriginalMember(owner = "client!f", name = "q", descriptor = "Lclient!f;")
	public Class5_Sub11 aClass5_Sub11_7;

	@OriginalMember(owner = "client!f", name = "r", descriptor = "Lclient!ec;")
	public Class5_Sub7 aClass5_Sub7_5;

	@OriginalMember(owner = "client!f", name = "p", descriptor = "Z")
	public volatile boolean aBoolean171 = true;

	@OriginalMember(owner = "client!f", name = "a", descriptor = "()I")
	public abstract int method2864();

	@OriginalMember(owner = "client!f", name = "b", descriptor = "()Lclient!f;")
	public abstract Class5_Sub11 method2865();

	@OriginalMember(owner = "client!f", name = "c", descriptor = "()Lclient!f;")
	public abstract Class5_Sub11 method2866();

	@OriginalMember(owner = "client!f", name = "a", descriptor = "([III)V")
	protected final void method2867(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean171) {
			this.method2869(arg0, arg1, arg2);
		} else {
			this.method2870(arg2);
		}
	}

	@OriginalMember(owner = "client!f", name = "d", descriptor = "()I")
	public int method2868() {
		return 255;
	}

	@OriginalMember(owner = "client!f", name = "b", descriptor = "([III)V")
	public abstract void method2869(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
	public abstract void method2870(@OriginalArg(0) int arg0);
}
