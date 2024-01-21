import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class Class2_Sub5 extends Class2 {

	@OriginalMember(owner = "client!d", name = "A", descriptor = "Lclient!d;")
	public Class2_Sub5 aClass2_Sub5_7;

	@OriginalMember(owner = "client!d", name = "B", descriptor = "Lclient!ce;")
	public Class2_Sub4 aClass2_Sub4_5;

	@OriginalMember(owner = "client!d", name = "D", descriptor = "I")
	public int anInt2714;

	@OriginalMember(owner = "client!d", name = "C", descriptor = "Z")
	public volatile boolean aBoolean227 = true;

	@OriginalMember(owner = "client!d", name = "a", descriptor = "()Lclient!d;")
	public abstract Class2_Sub5 method1954();

	@OriginalMember(owner = "client!d", name = "b", descriptor = "()I")
	public abstract int method1955();

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([III)V")
	protected final void method1956(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean227) {
			this.method1957(arg0, arg1, arg2);
		} else {
			this.method1959(arg2);
		}
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "([III)V")
	public abstract void method1957(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!d", name = "c", descriptor = "()I")
	public int method1958() {
		return 255;
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "(I)V")
	public abstract void method1959(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!d", name = "d", descriptor = "()Lclient!d;")
	public abstract Class2_Sub5 method1960();
}
