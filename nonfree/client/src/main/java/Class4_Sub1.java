import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public abstract class Class4_Sub1 extends Class4 {

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "Lclient!kb;")
	public Class4_Sub1 aClass4_Sub1_8;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "Lclient!qq;")
	public Class4_Sub7 aClass4_Sub7_5;

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
	public int anInt4157;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "Z")
	public volatile boolean aBoolean322 = true;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([III)V")
	public abstract void method3781(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "()I")
	public int method3782() {
		return 255;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public abstract void method3783(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "()Lclient!kb;")
	public abstract Class4_Sub1 method3784();

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "([III)V")
	protected final void method3785(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean322) {
			this.method3781(arg0, arg1, arg2);
		} else {
			this.method3783(arg2);
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "()I")
	public abstract int method3786();

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "()Lclient!kb;")
	public abstract Class4_Sub1 method3787();
}
