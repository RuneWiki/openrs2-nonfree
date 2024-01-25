import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public final class Class23_Sub13 extends Class23 {

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(Lclient!ts;)V")
	public Class23_Sub13(@OriginalArg(0) Class3_Sub48 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(ILclient!ts;)V")
	public Class23_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub48 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(II)I")
	@Override
	public int method8502(@OriginalArg(0) int arg0) {
		return super.aClass3_Sub48_31.method7828() ? 3 : 1;
	}

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "(II)V")
	@Override
	protected void method8503(@OriginalArg(1) int arg0) {
		super.anInt10359 = arg0;
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
	@Override
	public void method8506() {
		if (super.aClass3_Sub48_31.method7828()) {
			super.anInt10359 = 0;
		}
		if (super.anInt10359 != 1 && super.anInt10359 != 0) {
			super.anInt10359 = this.method8501();
		}
	}

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "(B)I")
	public int method3796() {
		return super.anInt10359;
	}

	@OriginalMember(owner = "client!gr", name = "b", descriptor = "(B)I")
	@Override
	protected int method8501() {
		return 1;
	}

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "(B)Z")
	public boolean method3798() {
		return !super.aClass3_Sub48_31.method7828();
	}
}
