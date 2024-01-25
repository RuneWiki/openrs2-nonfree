import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!haa")
public final class Class4_Sub13 extends Class4 {

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(ILclient!w;)V")
	public Class4_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub54 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!haa", name = "<init>", descriptor = "(Lclient!w;)V")
	public Class4_Sub13(@OriginalArg(0) Class2_Sub54 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(Z)V")
	@Override
	public void method9225() {
		if (super.anInt10787 != 1 && super.anInt10787 != 0) {
			super.anInt10787 = this.method9221();
		}
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(BI)V")
	@Override
	protected void method9227(@OriginalArg(1) int arg0) {
		super.anInt10787 = arg0;
	}

	@OriginalMember(owner = "client!haa", name = "a", descriptor = "(Z)I")
	@Override
	protected int method9221() {
		return 1;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(II)I")
	@Override
	public int method9223(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!haa", name = "b", descriptor = "(I)I")
	public int method3956() {
		return super.anInt10787;
	}
}
