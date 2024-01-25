import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public final class Class33_Sub17 extends Class33 {

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(ILclient!cq;)V")
	public Class33_Sub17(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!od", name = "<init>", descriptor = "(Lclient!cq;)V")
	public Class33_Sub17(@OriginalArg(0) Class2_Sub13 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!od", name = "d", descriptor = "(I)I")
	public int method6029() {
		return super.anInt10093;
	}

	@OriginalMember(owner = "client!od", name = "f", descriptor = "(I)Z")
	public boolean method6032() {
		if (super.aClass2_Sub13_32.method1375()) {
			return false;
		} else {
			return super.aClass2_Sub13_32.method1372() == Static239.aClass63_14;
		}
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(I)I")
	@Override
	protected int method8445() {
		return 1;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
	@Override
	public void method8441() {
		if (super.aClass2_Sub13_32.method1372() != Static239.aClass63_14) {
			super.anInt10093 = 1;
		} else if (super.aClass2_Sub13_32.method1375()) {
			super.anInt10093 = 0;
		}
		if (super.anInt10093 != 0 && super.anInt10093 != 1) {
			super.anInt10093 = this.method8445();
		}
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(II)V")
	@Override
	protected void method8442(@OriginalArg(0) int arg0) {
		super.anInt10093 = arg0;
	}

	@OriginalMember(owner = "client!od", name = "b", descriptor = "(II)I")
	@Override
	public int method8443(@OriginalArg(0) int arg0) {
		if (super.aClass2_Sub13_32.method1375()) {
			return 3;
		} else if (super.aClass2_Sub13_32.method1372() == Static239.aClass63_14) {
			return 1;
		} else {
			return 3;
		}
	}
}
