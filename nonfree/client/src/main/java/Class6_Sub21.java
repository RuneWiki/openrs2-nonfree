import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public final class Class6_Sub21 extends Class6 {

	@OriginalMember(owner = "client!sn", name = "o", descriptor = "Z")
	private boolean aBoolean650 = true;

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(ILclient!ah;)V")
	public Class6_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub5 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lclient!ah;)V")
	public Class6_Sub21(@OriginalArg(0) Class2_Sub5 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(II)V")
	@Override
	protected void method8577(@OriginalArg(0) int arg0) {
		super.anInt10283 = arg0;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(Z)V")
	@Override
	public void method8576() {
		if (!super.aClass2_Sub5_50.method180().method449()) {
			super.anInt10283 = 0;
		}
		if (super.anInt10283 < 0 || super.anInt10283 > 5) {
			super.anInt10283 = this.method8572();
		}
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)I")
	@Override
	public int method8573(@OriginalArg(0) int arg0) {
		return super.aClass2_Sub5_50.method180().method449() ? 2 : 3;
	}

	@OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)Z")
	public boolean method7279() {
		return this.aBoolean650;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(I)I")
	@Override
	protected int method8572() {
		return super.aClass2_Sub5_50.method180().method449() ? 2 : 0;
	}

	@OriginalMember(owner = "client!sn", name = "c", descriptor = "(I)I")
	public int method7280() {
		return super.anInt10283;
	}

	@OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZI)V")
	public void method7281(@OriginalArg(0) boolean arg0) {
		this.aBoolean650 = arg0;
	}
}
