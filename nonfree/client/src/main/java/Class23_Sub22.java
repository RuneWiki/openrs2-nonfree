import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public final class Class23_Sub22 extends Class23 {

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(ILclient!ts;)V")
	public Class23_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub48 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(Lclient!ts;)V")
	public Class23_Sub22(@OriginalArg(0) Class3_Sub48 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(II)I")
	@Override
	public int method8502(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!nr", name = "a", descriptor = "(I)V")
	@Override
	public void method8506() {
		if (super.aClass3_Sub48_31.method7829() == Static518.aClass62_15) {
			super.anInt10359 = 2;
		}
		if (super.anInt10359 < 0 || super.anInt10359 > 2) {
			super.anInt10359 = this.method8501();
		}
	}

	@OriginalMember(owner = "client!nr", name = "d", descriptor = "(B)I")
	public int method6092() {
		return super.anInt10359;
	}

	@OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)I")
	@Override
	protected int method8501() {
		return 1;
	}

	@OriginalMember(owner = "client!nr", name = "c", descriptor = "(II)V")
	@Override
	protected void method8503(@OriginalArg(1) int arg0) {
		super.anInt10359 = arg0;
	}
}
