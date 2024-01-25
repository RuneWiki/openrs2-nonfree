import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dm")
public final class Class77 {

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "I")
	public int anInt1995;

	@OriginalMember(owner = "client!dm", name = "b", descriptor = "Lclient!kba;")
	public Class189 aClass189_1;

	@OriginalMember(owner = "client!dm", name = "h", descriptor = "I")
	public int anInt1999;

	@OriginalMember(owner = "client!dm", name = "k", descriptor = "I")
	private int anInt2002;

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(B)Lclient!gu;")
	public synchronized Class131 method1645() {
		@Pc(13) Class131 local13 = (Class131) this.aClass189_1.aClass87_122.method1805((long) this.anInt2002);
		if (local13 != null) {
			return local13;
		}
		local13 = Static649.method2888(this.aClass189_1.aClass207_59, this.anInt2002, 0);
		if (local13 != null) {
			this.aClass189_1.aClass87_122.method1792((long) this.anInt2002, local13);
		}
		return local13;
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(ILclient!ofa;)V")
	public void method1646(@OriginalArg(1) Class5_Sub22 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5966();
			if (local9 == 0) {
				return;
			}
			this.method1649(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!dm", name = "a", descriptor = "(IILclient!ofa;)V")
	private void method1649(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub22 arg1) {
		if (arg0 == 1) {
			this.anInt2002 = arg1.method5968();
		} else if (arg0 == 2) {
			this.anInt1999 = arg1.method5966();
			this.anInt1995 = arg1.method5966();
		}
	}
}
