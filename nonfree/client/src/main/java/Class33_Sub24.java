import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public final class Class33_Sub24 extends Class33 {

	@OriginalMember(owner = "client!sm", name = "k", descriptor = "Z")
	private boolean aBoolean648 = true;

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(Lclient!cq;)V")
	public Class33_Sub24(@OriginalArg(0) Class2_Sub13 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!sm", name = "<init>", descriptor = "(ILclient!cq;)V")
	public Class33_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(I)I")
	@Override
	protected int method8445() {
		return super.aClass2_Sub13_32.method1377().method3338() ? 2 : 0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)V")
	@Override
	protected void method8442(@OriginalArg(0) int arg0) {
		super.anInt10093 = arg0;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V")
	@Override
	public void method8441() {
		if (!super.aClass2_Sub13_32.method1377().method3338()) {
			super.anInt10093 = 0;
		}
		if (super.anInt10093 < 0 || super.anInt10093 > 5) {
			super.anInt10093 = this.method8445();
		}
	}

	@OriginalMember(owner = "client!sm", name = "b", descriptor = "(II)I")
	@Override
	public int method8443(@OriginalArg(0) int arg0) {
		return super.aClass2_Sub13_32.method1377().method3338() ? 2 : 3;
	}

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(ZI)V")
	public void method7328(@OriginalArg(0) boolean arg0) {
		this.aBoolean648 = arg0;
	}

	@OriginalMember(owner = "client!sm", name = "d", descriptor = "(I)I")
	public int method7329() {
		return super.anInt10093;
	}

	@OriginalMember(owner = "client!sm", name = "e", descriptor = "(I)Z")
	public boolean method7330() {
		return this.aBoolean648;
	}
}
