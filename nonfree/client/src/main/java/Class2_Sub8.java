import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public abstract class Class2_Sub8 extends Class2 {

	@OriginalMember(owner = "client!jba", name = "p", descriptor = "Lclient!jba;")
	public Class2_Sub8 aClass2_Sub8_9;

	@OriginalMember(owner = "client!jba", name = "q", descriptor = "I")
	public int anInt10583;

	@OriginalMember(owner = "client!jba", name = "r", descriptor = "Lclient!ji;")
	public Class2_Sub29 aClass2_Sub29_6;

	@OriginalMember(owner = "client!jba", name = "o", descriptor = "Z")
	public volatile boolean aBoolean723 = true;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "([III)V")
	protected final void method8814(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean723) {
			this.method8816(arg0, arg1, arg2);
		} else {
			this.method8818(arg2);
		}
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "()Lclient!jba;")
	public abstract Class2_Sub8 method8815();

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "([III)V")
	public abstract void method8816(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!jba", name = "b", descriptor = "()Lclient!jba;")
	public abstract Class2_Sub8 method8817();

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(I)V")
	public abstract void method8818(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jba", name = "c", descriptor = "()I")
	public int method8819() {
		return 255;
	}

	@OriginalMember(owner = "client!jba", name = "d", descriptor = "()I")
	public abstract int method8820();
}
