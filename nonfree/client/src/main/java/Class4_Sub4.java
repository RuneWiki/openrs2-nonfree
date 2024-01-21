import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public abstract class Class4_Sub4 extends Class4 {

	@OriginalMember(owner = "client!fd", name = "r", descriptor = "Lclient!fd;")
	public Class4_Sub4 aClass4_Sub4_8;

	@OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
	public int anInt2546;

	@OriginalMember(owner = "client!fd", name = "t", descriptor = "Lclient!ne;")
	public Class4_Sub13 aClass4_Sub13_5;

	@OriginalMember(owner = "client!fd", name = "u", descriptor = "Z")
	public volatile boolean aBoolean227 = true;

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "()I")
	public abstract int method1635();

	@OriginalMember(owner = "client!fd", name = "a", descriptor = "([III)V")
	protected final void method1636(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean227) {
			this.method1637(arg0, arg1, arg2);
		} else {
			this.method1639(arg2);
		}
	}

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "([III)V")
	public abstract void method1637(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!fd", name = "b", descriptor = "()Lclient!fd;")
	public abstract Class4_Sub4 method1638();

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "(I)V")
	public abstract void method1639(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fd", name = "c", descriptor = "()Lclient!fd;")
	public abstract Class4_Sub4 method1640();

	@OriginalMember(owner = "client!fd", name = "d", descriptor = "()I")
	public int method1641() {
		return 255;
	}
}
