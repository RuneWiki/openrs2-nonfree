import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sha")
public final class Class36_Sub24 extends Class36 {

	@OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class36_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub25 arg1) {
		super(arg1);
	}

	@OriginalMember(owner = "client!sha", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class36_Sub24(@OriginalArg(0) Class8_Sub25 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8465(@OriginalArg(0) int arg0) {
		super.anInt10496 = arg0;
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(B)V")
	@Override
	public void method8463() {
		if (super.anInt10496 != 1 && super.anInt10496 != 0) {
			super.anInt10496 = this.method8464();
		}
	}

	@OriginalMember(owner = "client!sha", name = "a", descriptor = "(I)I")
	public int method7400() {
		return super.anInt10496;
	}

	@OriginalMember(owner = "client!sha", name = "b", descriptor = "(B)I")
	@Override
	protected int method8464() {
		return 1;
	}

	@OriginalMember(owner = "client!sha", name = "b", descriptor = "(II)I")
	@Override
	public int method8466(@OriginalArg(0) int arg0) {
		return 1;
	}
}
