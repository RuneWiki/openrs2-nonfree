import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cq")
public final class Class29_Sub5 extends Class29 {

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(Lclient!fs;)V")
	public Class29_Sub5(@OriginalArg(0) Class6_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!cq", name = "<init>", descriptor = "(ILclient!fs;)V")
	public Class29_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!cq", name = "b", descriptor = "(B)I")
	public int method1502() {
		return super.anInt10604;
	}

	@OriginalMember(owner = "client!cq", name = "d", descriptor = "(II)V")
	@Override
	protected void method9000(@OriginalArg(0) int arg0) {
		super.anInt10604 = arg0;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(I)V")
	@Override
	public void method8995() {
		if (super.anInt10604 < 0 && super.anInt10604 > 127) {
			super.anInt10604 = this.method8997();
		}
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(II)I")
	@Override
	public int method8994(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!cq", name = "a", descriptor = "(B)I")
	@Override
	protected int method8997() {
		return 127;
	}
}
