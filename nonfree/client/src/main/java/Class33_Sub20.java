import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public final class Class33_Sub20 extends Class33 {

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(ILclient!cq;)V")
	public Class33_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub13 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lclient!cq;)V")
	public Class33_Sub20(@OriginalArg(0) Class2_Sub13 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)I")
	@Override
	protected int method8445() {
		return 1;
	}

	@OriginalMember(owner = "client!pm", name = "b", descriptor = "(II)I")
	@Override
	public int method8443(@OriginalArg(0) int arg0) {
		if (super.aClass2_Sub13_32.method1375()) {
			return 3;
		} else if (arg0 == 0 || super.aClass2_Sub13_32.aClass33_Sub18_1.method6344() == 1) {
			return 1;
		} else {
			return 2;
		}
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)V")
	@Override
	protected void method8442(@OriginalArg(0) int arg0) {
		super.anInt10093 = arg0;
	}

	@OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
	@Override
	public void method8441() {
		if (super.aClass2_Sub13_32.method1375()) {
			super.anInt10093 = 0;
		}
		if (super.anInt10093 < 0 && super.anInt10093 > 2) {
			super.anInt10093 = this.method8445();
		}
	}

	@OriginalMember(owner = "client!pm", name = "d", descriptor = "(I)Z")
	public boolean method6513() {
		return !super.aClass2_Sub13_32.method1375();
	}

	@OriginalMember(owner = "client!pm", name = "f", descriptor = "(I)I")
	public int method6515() {
		return super.anInt10093;
	}
}
