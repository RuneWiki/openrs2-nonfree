import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ac")
public final class Class4 {

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
	public int anInt23;

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "I")
	public int anInt26;

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
	public int anInt29;

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
	public int anInt31;

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "Z")
	public boolean aBoolean2;

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
	public int anInt32;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
	public int anInt22 = 16777215;

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
	public int anInt27 = 8;

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILclient!lf;)V")
	public void method22(@OriginalArg(1) int arg0, @OriginalArg(2) Class1_Sub14 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method1378();
			if (local9 == 0) {
				return;
			}
			this.method24(arg1, local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!lf;IIB)V")
	private void method24(@OriginalArg(0) Class1_Sub14 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg1 == 1) {
			this.anInt27 = arg0.method1386();
		} else if (arg1 == 2) {
			this.aBoolean2 = true;
		} else if (arg1 == 3) {
			this.anInt31 = arg0.method1356();
			this.anInt26 = arg0.method1356();
			this.anInt23 = arg0.method1356();
		} else if (arg1 == 4) {
			this.anInt32 = arg0.method1378();
		} else if (arg1 == 5) {
			this.anInt29 = arg0.method1386();
		} else if (arg1 == 6) {
			this.anInt22 = arg0.method1352();
		}
	}
}
