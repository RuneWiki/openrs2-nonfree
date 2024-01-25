import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gda")
public final class Class11_Sub13 extends Class11 {

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(Lclient!gl;)V")
	public Class11_Sub13(@OriginalArg(0) Class2_Sub30 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!gda", name = "<init>", descriptor = "(ILclient!gl;)V")
	public Class11_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub30 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(IB)I")
	@Override
	public int method9614(@OriginalArg(0) int arg0) {
		@Pc(12) int local12 = super.aClass2_Sub30_32.method2981().method7171();
		if (local12 < 96) {
			return 3;
		} else if (arg0 > 1 && local12 < 128) {
			return 3;
		} else if (arg0 > 3 && local12 < 192) {
			return 3;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(I)V")
	@Override
	public void method9616() {
		@Pc(10) int local10 = super.aClass2_Sub30_32.method2981().method7171();
		if (local10 < 96) {
			super.anInt11012 = 0;
		}
		if (super.anInt11012 > 1 && local10 < 128) {
			super.anInt11012 = 1;
		}
		if (super.anInt11012 > 2 && local10 < 192) {
			super.anInt11012 = 2;
		}
		if (super.anInt11012 < 0 || super.anInt11012 > 3) {
			super.anInt11012 = this.method9617();
		}
	}

	@OriginalMember(owner = "client!gda", name = "b", descriptor = "(I)I")
	@Override
	protected int method9617() {
		return 0;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(II)V")
	@Override
	protected void method9613(@OriginalArg(1) int arg0) {
		super.anInt11012 = arg0;
	}

	@OriginalMember(owner = "client!gda", name = "c", descriptor = "(I)I")
	public int method2809() {
		return super.anInt11012;
	}

	@OriginalMember(owner = "client!gda", name = "a", descriptor = "(Z)Z")
	public boolean method2810() {
		@Pc(10) int local10 = super.aClass2_Sub30_32.method2981().method7171();
		return local10 >= 96;
	}
}
