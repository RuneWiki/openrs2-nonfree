import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public final class Class8_Sub19 extends Class8 {

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(ILclient!hd;)V")
	public Class8_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub20 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Lclient!hd;)V")
	public Class8_Sub19(@OriginalArg(0) Class4_Sub20 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(Z)I")
	@Override
	protected int method8383() {
		return 1;
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(BI)V")
	@Override
	protected void method8382(@OriginalArg(1) int arg0) {
		super.anInt9788 = arg0;
	}

	@OriginalMember(owner = "client!qj", name = "c", descriptor = "(B)Z")
	public boolean method6695() {
		return !super.aClass4_Sub20_31.method3139();
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)V")
	@Override
	public void method8386() {
		if (super.aClass4_Sub20_31.method3139()) {
			super.anInt9788 = 0;
		}
		if (super.anInt9788 != 1 && super.anInt9788 != 0) {
			super.anInt9788 = this.method8383();
		}
	}

	@OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)I")
	public int method6698() {
		return super.anInt9788;
	}

	@OriginalMember(owner = "client!qj", name = "b", descriptor = "(II)I")
	@Override
	public int method8387(@OriginalArg(1) int arg0) {
		return super.aClass4_Sub20_31.method3139() ? 3 : 1;
	}
}
