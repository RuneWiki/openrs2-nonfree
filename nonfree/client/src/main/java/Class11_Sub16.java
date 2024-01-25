import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public final class Class11_Sub16 extends Class11 {

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lclient!up;)V")
	public Class11_Sub16(@OriginalArg(0) Class5_Sub46 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(ILclient!up;)V")
	public Class11_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) Class5_Sub46 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)I")
	@Override
	public int method8533(@OriginalArg(1) int arg0) {
		if (super.aClass5_Sub46_30.method8187()) {
			return 3;
		} else if (super.aClass5_Sub46_30.method8186() == Static191.aClass235_2) {
			return 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(Z)I")
	public int method4417() {
		return super.anInt10053;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZI)V")
	@Override
	protected void method8538(@OriginalArg(1) int arg0) {
		super.anInt10053 = arg0;
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V")
	@Override
	public void method8534() {
		if (super.aClass5_Sub46_30.method8186() != Static191.aClass235_2) {
			super.anInt10053 = 1;
		} else if (super.aClass5_Sub46_30.method8187()) {
			super.anInt10053 = 0;
		}
		if (super.anInt10053 != 0 && super.anInt10053 != 1) {
			super.anInt10053 = this.method8535();
		}
	}

	@OriginalMember(owner = "client!kv", name = "b", descriptor = "(I)Z")
	public boolean method4420() {
		if (super.aClass5_Sub46_30.method8187()) {
			return false;
		} else {
			return super.aClass5_Sub46_30.method8186() == Static191.aClass235_2;
		}
	}

	@OriginalMember(owner = "client!kv", name = "a", descriptor = "(Z)I")
	@Override
	protected int method8535() {
		return 1;
	}
}
