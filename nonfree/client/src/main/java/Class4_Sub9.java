import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public final class Class4_Sub9 extends Class4 {

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(ILclient!w;)V")
	public Class4_Sub9(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub54 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ew", name = "<init>", descriptor = "(Lclient!w;)V")
	public Class4_Sub9(@OriginalArg(0) Class2_Sub54 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9227(@OriginalArg(1) int arg0) {
		super.anInt10787 = arg0;
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(I)I")
	public int method2556() {
		return super.anInt10787;
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(II)I")
	@Override
	public int method9223(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!ew", name = "b", descriptor = "(Z)V")
	@Override
	public void method9225() {
		super.anInt10787 = this.method9221();
	}

	@OriginalMember(owner = "client!ew", name = "a", descriptor = "(Z)I")
	@Override
	protected int method9221() {
		return super.aClass2_Sub54_31.method9544() == Static19.aClass229_3 && super.aClass2_Sub54_31.method9551() ? 0 : 1;
	}
}
