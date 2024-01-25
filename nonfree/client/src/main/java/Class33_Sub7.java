import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public final class Class33_Sub7 extends Class33 {

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lclient!cq;)V")
	public Class33_Sub7(@OriginalArg(0) Class2_Sub13 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(ILclient!cq;)V")
	public Class33_Sub7(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V")
	@Override
	public void method8441() {
		if (super.anInt10093 < 1 || super.anInt10093 > 3) {
			super.anInt10093 = this.method8445();
		}
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(II)I")
	@Override
	public int method8443(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)I")
	@Override
	protected int method8445() {
		return super.aClass2_Sub13_32.method1377().method3337() ? 3 : 2;
	}

	@OriginalMember(owner = "client!gd", name = "d", descriptor = "(I)I")
	public int method3189() {
		return super.anInt10093;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(II)V")
	@Override
	protected void method8442(@OriginalArg(0) int arg0) {
		super.anInt10093 = arg0;
	}
}
