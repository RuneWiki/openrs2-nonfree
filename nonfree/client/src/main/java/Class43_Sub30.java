import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vaa")
public final class Class43_Sub30 extends Class43 {

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(ILclient!lha;)V")
	public Class43_Sub30(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub26 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!vaa", name = "<init>", descriptor = "(Lclient!lha;)V")
	public Class43_Sub30(@OriginalArg(0) Class14_Sub26 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!vaa", name = "b", descriptor = "(B)V")
	@Override
	public void method8892() {
		super.anInt10397 = this.method8889();
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(I)I")
	@Override
	protected int method8889() {
		return super.aClass14_Sub26_32.method5276() ? 1 : 0;
	}

	@OriginalMember(owner = "client!vaa", name = "c", descriptor = "(II)I")
	@Override
	public int method8894(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(Z)I")
	public int method8896() {
		return super.anInt10397;
	}

	@OriginalMember(owner = "client!vaa", name = "a", descriptor = "(II)V")
	@Override
	protected void method8893(@OriginalArg(1) int arg0) {
		super.anInt10397 = arg0;
	}
}
