import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hba")
public final class Class36_Sub8 extends Class36 {

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(Lclient!gn;)V")
	public Class36_Sub8(@OriginalArg(0) Class8_Sub25 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!hba", name = "<init>", descriptor = "(ILclient!gn;)V")
	public Class36_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) Class8_Sub25 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(B)I")
	@Override
	protected int method8464() {
		return super.aClass8_Sub25_31.method3469().method4885() > 1 ? 4 : 2;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(IZ)V")
	@Override
	protected void method8465(@OriginalArg(0) int arg0) {
		super.anInt10496 = arg0;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(I)I")
	public int method3635() {
		return super.anInt10496;
	}

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(B)V")
	@Override
	public void method8463() {
		if (super.anInt10496 < 0 && super.anInt10496 > 4) {
			super.anInt10496 = this.method8464();
		}
	}

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "(II)I")
	@Override
	public int method8466(@OriginalArg(0) int arg0) {
		return 1;
	}
}
