import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mba")
public final class Class33_Sub16 extends Class33 {

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(ILclient!cq;)V")
	public Class33_Sub16(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lclient!cq;)V")
	public Class33_Sub16(@OriginalArg(0) Class2_Sub13 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!mba", name = "d", descriptor = "(I)I")
	public int method5227() {
		return super.anInt10093;
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(II)I")
	@Override
	public int method8443(@OriginalArg(0) int arg0) {
		@Pc(10) int local10 = super.aClass2_Sub13_32.method1377().method3341();
		if (local10 < 96) {
			return 3;
		} else if (arg0 > 1 && local10 < 128) {
			return 3;
		} else if (arg0 > 3 && local10 < 192) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!mba", name = "b", descriptor = "(I)I")
	@Override
	protected int method8445() {
		return 0;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(II)V")
	@Override
	protected void method8442(@OriginalArg(0) int arg0) {
		super.anInt10093 = arg0;
	}

	@OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)V")
	@Override
	public void method8441() {
		@Pc(10) int local10 = super.aClass2_Sub13_32.method1377().method3341();
		if (local10 < 96) {
			super.anInt10093 = 0;
		}
		if (super.anInt10093 > 1 && local10 < 128) {
			super.anInt10093 = 1;
		}
		if (super.anInt10093 > 2 && local10 < 192) {
			super.anInt10093 = 2;
		}
		if (super.anInt10093 < 0 || super.anInt10093 > 3) {
			super.anInt10093 = this.method8445();
		}
	}

	@OriginalMember(owner = "client!mba", name = "e", descriptor = "(I)Z")
	public boolean method5234() {
		@Pc(18) int local18 = super.aClass2_Sub13_32.method1377().method3341();
		return local18 >= 96;
	}
}
