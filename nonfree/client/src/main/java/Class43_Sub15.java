import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public final class Class43_Sub15 extends Class43 {

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(Lclient!lha;)V")
	public Class43_Sub15(@OriginalArg(0) Class14_Sub26 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!jb", name = "<init>", descriptor = "(ILclient!lha;)V")
	public Class43_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub26 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(Z)I")
	public int method4526() {
		return super.anInt10397;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)I")
	@Override
	protected int method8889() {
		return super.aClass14_Sub26_32.method5272().method8399() ? 3 : 2;
	}

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "(B)V")
	@Override
	public void method8892() {
		if (super.anInt10397 < 1 || super.anInt10397 > 3) {
			super.anInt10397 = this.method8889();
		}
	}

	@OriginalMember(owner = "client!jb", name = "c", descriptor = "(II)I")
	@Override
	public int method8894(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)V")
	@Override
	protected void method8893(@OriginalArg(1) int arg0) {
		super.anInt10397 = arg0;
	}
}
