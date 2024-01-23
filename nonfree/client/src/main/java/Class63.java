import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hb")
public final class Class63 {

	@OriginalMember(owner = "client!hb", name = "e", descriptor = "I")
	private int anInt2015;

	@OriginalMember(owner = "client!hb", name = "h", descriptor = "I")
	public int anInt2018;

	@OriginalMember(owner = "client!hb", name = "r", descriptor = "I")
	public int anInt2027;

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(I)Lclient!ch;")
	public Class1_Sub2_Sub1_Sub2 method1809() {
		@Pc(11) Class1_Sub2_Sub1_Sub2 local11 = (Class1_Sub2_Sub1_Sub2) Static191.aClass187_100.method4527((long) this.anInt2015);
		if (local11 != null) {
			return local11;
		}
		local11 = Static279.method4316(this.anInt2015, Static235.aClass121_129);
		if (local11 != null) {
			Static191.aClass187_100.method4524((long) this.anInt2015, local11);
		}
		return local11;
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(Lclient!lf;II)V")
	public void method1814(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(11) int local11 = arg0.method1378();
			if (local11 == 0) {
				return;
			}
			this.method1816(local11, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!hb", name = "a", descriptor = "(IILclient!lf;I)V")
	private void method1816(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub14 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt2015 = arg1.method1386();
		} else if (arg0 == 2) {
			this.anInt2027 = arg1.method1378();
			this.anInt2018 = arg1.method1378();
		}
	}
}
