import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dj")
public final class Class15_Sub7 extends Class15 {

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(ILclient!hb;)V")
	public Class15_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		super(arg1);
	}

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(Lclient!hb;)V")
	public Class15_Sub7(@OriginalArg(0) Class6_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(I)I")
	public int method1752() {
		return super.anInt10701;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(II)V")
	@Override
	protected void method8985(@OriginalArg(1) int arg0) {
		super.anInt10701 = arg0;
	}

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "(B)V")
	@Override
	public void method8989() {
		if (super.anInt10701 != 1 && super.anInt10701 != 0) {
			super.anInt10701 = this.method8986();
		}
	}

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "(B)I")
	@Override
	protected int method8986() {
		return 1;
	}

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "(II)I")
	@Override
	public int method8990(@OriginalArg(1) int arg0) {
		return 1;
	}
}
