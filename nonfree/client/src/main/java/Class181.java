import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sg")
public final class Class181 {

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "Z")
	public boolean aBoolean518;

	@OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
	public int anInt5846;

	@OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
	public int anInt5850;

	@OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
	public int anInt5855;

	@OriginalMember(owner = "client!sg", name = "o", descriptor = "I")
	public int anInt5857;

	@OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
	public int anInt5859;

	@OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
	public int anInt5848 = 16777215;

	@OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
	public int anInt5849 = 8;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(Lclient!ef;III)V")
	private void method4924(@OriginalArg(0) Class2_Sub12 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt5849 = arg0.method3104();
		} else if (arg1 == 2) {
			this.aBoolean518 = true;
		} else if (arg1 == 3) {
			this.anInt5850 = arg0.method3108();
			this.anInt5855 = arg0.method3108();
			this.anInt5857 = arg0.method3108();
		} else if (arg1 == 4) {
			this.anInt5859 = arg0.method3124();
		} else if (arg1 == 5) {
			this.anInt5846 = arg0.method3104();
		} else if (arg1 == 6) {
			this.anInt5848 = arg0.method3163();
		}
	}

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(IILclient!ef;)V")
	public void method4929(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub12 arg1) {
		while (true) {
			@Pc(7) int local7 = arg1.method3124();
			if (local7 == 0) {
				return;
			}
			this.method4924(arg1, local7, arg0);
		}
	}
}
