import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public abstract class Class1_Sub19 extends Class1 {

	@OriginalMember(owner = "client!oa", name = "n", descriptor = "Lclient!oa;")
	public Class1_Sub19 aClass1_Sub19_8;

	@OriginalMember(owner = "client!oa", name = "o", descriptor = "Lclient!dd;")
	public Class1_Sub12 aClass1_Sub12_5;

	@OriginalMember(owner = "client!oa", name = "p", descriptor = "I")
	public int anInt7648;

	@OriginalMember(owner = "client!oa", name = "q", descriptor = "Z")
	public volatile boolean aBoolean499 = true;

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "(I)V")
	public abstract void method5802(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "([III)V")
	public abstract void method5803(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "([III)V")
	protected final void method5804(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean499) {
			this.method5803(arg0, arg1, arg2);
		} else {
			this.method5802(arg2);
		}
	}

	@OriginalMember(owner = "client!oa", name = "a", descriptor = "()Lclient!oa;")
	public abstract Class1_Sub19 method5805();

	@OriginalMember(owner = "client!oa", name = "b", descriptor = "()I")
	public int method5806() {
		return 255;
	}

	@OriginalMember(owner = "client!oa", name = "c", descriptor = "()Lclient!oa;")
	public abstract Class1_Sub19 method5807();

	@OriginalMember(owner = "client!oa", name = "d", descriptor = "()I")
	public abstract int method5808();
}
