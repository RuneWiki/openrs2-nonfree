import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fm")
public final class Class58 {

	@OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
	public int anInt1893;

	@OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
	private int anInt1895;

	@OriginalMember(owner = "client!fm", name = "j", descriptor = "I")
	public int anInt1898;

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIILclient!im;)V")
	private void method1422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class1_Sub16 arg2) {
		if (arg1 == 1) {
			this.anInt1895 = arg2.method2652();
		} else if (arg1 == 2) {
			this.anInt1893 = arg2.method2655();
			this.anInt1898 = arg2.method2655();
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(IILclient!im;)V")
	public void method1424(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub16 arg1) {
		while (true) {
			@Pc(7) int local7 = arg1.method2655();
			if (local7 == 0) {
				return;
			}
			this.method1422(arg0, local7, arg1);
		}
	}

	@OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)Lclient!n;")
	public Class1_Sub2_Sub14_Sub1 method1425() {
		@Pc(11) Class1_Sub2_Sub14_Sub1 local11 = (Class1_Sub2_Sub14_Sub1) Static131.aClass155_27.method4358((long) this.anInt1895);
		if (local11 != null) {
			return local11;
		}
		local11 = Static57.method1137(this.anInt1895, Static272.aClass83_191);
		if (local11 != null) {
			Static131.aClass155_27.method4360((long) this.anInt1895, local11);
		}
		return local11;
	}
}
