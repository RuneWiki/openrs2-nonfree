import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public final class Class29_Sub11 extends Class29 {

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lclient!fs;)V")
	public Class29_Sub11(@OriginalArg(0) Class6_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(ILclient!fs;)V")
	public Class29_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
	@Override
	public void method8995() {
		if (super.anInt10604 < 0 || super.anInt10604 > 4) {
			super.anInt10604 = this.method8997();
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)I")
	@Override
	public int method8994(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)I")
	@Override
	protected int method8997() {
		return 0;
	}

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(B)I")
	public int method3250() {
		return super.anInt10604;
	}

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "(II)V")
	@Override
	protected void method9000(@OriginalArg(0) int arg0) {
		super.anInt10604 = arg0;
	}
}
