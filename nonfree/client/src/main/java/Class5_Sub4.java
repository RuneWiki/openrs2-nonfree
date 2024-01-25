import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public abstract class Class5_Sub4 extends Class5 {

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
	public int anInt5229;

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "Lclient!tea;")
	public Class5_Sub27 aClass5_Sub27_6;

	@OriginalMember(owner = "client!ef", name = "o", descriptor = "Lclient!ef;")
	public Class5_Sub4 aClass5_Sub4_8;

	@OriginalMember(owner = "client!ef", name = "l", descriptor = "Z")
	public volatile boolean aBoolean334 = true;

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "()I")
	public int method4708() {
		return 255;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "([III)V")
	protected final void method4709(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean334) {
			this.method4713(arg0, arg1, arg2);
		} else {
			this.method4712(arg2);
		}
	}

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "()I")
	public abstract int method4710();

	@OriginalMember(owner = "client!ef", name = "d", descriptor = "()Lclient!ef;")
	public abstract Class5_Sub4 method4711();

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public abstract void method4712(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "([III)V")
	public abstract void method4713(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "()Lclient!ef;")
	public abstract Class5_Sub4 method4714();
}
