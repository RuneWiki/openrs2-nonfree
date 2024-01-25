import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public final class Class14_Sub8 extends Class14 {

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(Lclient!dh;)V")
	public Class14_Sub8(@OriginalArg(0) Class2_Sub13 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(ILclient!dh;)V")
	public Class14_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(II)I")
	@Override
	public int method9033(@OriginalArg(1) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(Z)V")
	@Override
	public void method9035() {
		if (super.anInt10835 != 1 && super.anInt10835 != 0) {
			super.anInt10835 = this.method9029();
		}
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(I)I")
	@Override
	protected int method9029() {
		return 1;
	}

	@OriginalMember(owner = "client!fs", name = "d", descriptor = "(I)I")
	public int method3544() {
		return super.anInt10835;
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(II)V")
	@Override
	protected void method9031(@OriginalArg(1) int arg0) {
		super.anInt10835 = arg0;
	}
}
