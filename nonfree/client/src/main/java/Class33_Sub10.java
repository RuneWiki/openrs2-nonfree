import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ip")
public final class Class33_Sub10 extends Class33 {

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(ILclient!cq;)V")
	public Class33_Sub10(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		super(arg1);
	}

	@OriginalMember(owner = "client!ip", name = "<init>", descriptor = "(Lclient!cq;)V")
	public Class33_Sub10(@OriginalArg(0) Class2_Sub13 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(I)V")
	@Override
	public void method8441() {
		if (super.aClass2_Sub13_32.aClass33_Sub21_1.method6747() && super.anInt10093 == 2) {
			super.anInt10093 = 1;
		}
		if (super.anInt10093 < 0 || super.anInt10093 > 2) {
			super.anInt10093 = this.method8445();
		}
	}

	@OriginalMember(owner = "client!ip", name = "d", descriptor = "(I)I")
	public int method4036() {
		return super.anInt10093;
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(I)I")
	@Override
	protected int method8445() {
		return 2;
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(II)I")
	@Override
	public int method8443(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(II)V")
	@Override
	protected void method8442(@OriginalArg(0) int arg0) {
		super.anInt10093 = arg0;
	}
}
