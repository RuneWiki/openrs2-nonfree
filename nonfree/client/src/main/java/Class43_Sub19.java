import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public final class Class43_Sub19 extends Class43 {

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(ILclient!lha;)V")
	public Class43_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) Class14_Sub26 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lclient!lha;)V")
	public Class43_Sub19(@OriginalArg(0) Class14_Sub26 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lo", name = "c", descriptor = "(II)I")
	@Override
	public int method8894(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)I")
	@Override
	protected int method8889() {
		return super.aClass14_Sub26_32.method5271() == Static344.aClass80_7 && super.aClass14_Sub26_32.method5276() ? 0 : 1;
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)I")
	public int method5412() {
		return super.anInt10397;
	}

	@OriginalMember(owner = "client!lo", name = "b", descriptor = "(B)V")
	@Override
	public void method8892() {
		super.anInt10397 = this.method8889();
	}

	@OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)V")
	@Override
	protected void method8893(@OriginalArg(1) int arg0) {
		super.anInt10397 = arg0;
	}
}
