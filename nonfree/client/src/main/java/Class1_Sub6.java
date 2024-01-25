import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public abstract class Class1_Sub6 extends Class1 {

	@OriginalMember(owner = "client!pn", name = "n", descriptor = "Lclient!pn;")
	public Class1_Sub6 aClass1_Sub6_5;

	@OriginalMember(owner = "client!pn", name = "o", descriptor = "I")
	public int anInt1712;

	@OriginalMember(owner = "client!pn", name = "p", descriptor = "Lclient!rr;")
	public Class1_Sub12 aClass1_Sub12_5;

	@OriginalMember(owner = "client!pn", name = "m", descriptor = "Z")
	public volatile boolean aBoolean150 = true;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "([III)V")
	public abstract void method1658(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "()I")
	public abstract int method1659();

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "()Lclient!pn;")
	public abstract Class1_Sub6 method1660();

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(I)V")
	public abstract void method1661(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "()I")
	public int method1662() {
		return 255;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "([III)V")
	protected final void method1663(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean150) {
			this.method1658(arg0, arg1, arg2);
		} else {
			this.method1661(arg2);
		}
	}

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "()Lclient!pn;")
	public abstract Class1_Sub6 method1664();
}
