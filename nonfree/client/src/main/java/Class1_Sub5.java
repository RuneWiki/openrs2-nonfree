import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public abstract class Class1_Sub5 extends Class1 {

	@OriginalMember(owner = "client!bc", name = "p", descriptor = "Lclient!va;")
	public Class1_Sub13 aClass1_Sub13_5;

	@OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
	public int anInt2001;

	@OriginalMember(owner = "client!bc", name = "r", descriptor = "Lclient!bc;")
	public Class1_Sub5 aClass1_Sub5_7;

	@OriginalMember(owner = "client!bc", name = "o", descriptor = "Z")
	public volatile boolean aBoolean79 = true;

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "()I")
	public abstract int method1312();

	@OriginalMember(owner = "client!bc", name = "a", descriptor = "([III)V")
	public abstract void method1313(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "()Lclient!bc;")
	public abstract Class1_Sub5 method1314();

	@OriginalMember(owner = "client!bc", name = "b", descriptor = "([III)V")
	protected final void method1315(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean79) {
			this.method1313(arg0, arg1, arg2);
		} else {
			this.method1316(arg2);
		}
	}

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
	public abstract void method1316(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!bc", name = "c", descriptor = "()I")
	public int method1317() {
		return 255;
	}

	@OriginalMember(owner = "client!bc", name = "d", descriptor = "()Lclient!bc;")
	public abstract Class1_Sub5 method1318();
}
