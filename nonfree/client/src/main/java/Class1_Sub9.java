import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public abstract class Class1_Sub9 extends Class1 {

	@OriginalMember(owner = "client!cv", name = "n", descriptor = "I")
	public int anInt6256;

	@OriginalMember(owner = "client!cv", name = "p", descriptor = "Lclient!cv;")
	public Class1_Sub9 aClass1_Sub9_8;

	@OriginalMember(owner = "client!cv", name = "q", descriptor = "Lclient!il;")
	public Class1_Sub8 aClass1_Sub8_5;

	@OriginalMember(owner = "client!cv", name = "o", descriptor = "Z")
	public volatile boolean aBoolean550 = true;

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "()I")
	public int method5010() {
		return 255;
	}

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "()I")
	public abstract int method5011();

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "([III)V")
	public abstract void method5012(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!cv", name = "c", descriptor = "()Lclient!cv;")
	public abstract Class1_Sub9 method5013();

	@OriginalMember(owner = "client!cv", name = "d", descriptor = "()Lclient!cv;")
	public abstract Class1_Sub9 method5014();

	@OriginalMember(owner = "client!cv", name = "b", descriptor = "([III)V")
	protected final void method5015(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean550) {
			this.method5012(arg0, arg1, arg2);
		} else {
			this.method5016(arg2);
		}
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)V")
	public abstract void method5016(@OriginalArg(0) int arg0);
}
