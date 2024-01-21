import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!se")
public final class Class4_Sub1_Sub13 extends Class4_Sub1 {

	@OriginalMember(owner = "client!se", name = "J", descriptor = "[I")
	public int[] anIntArray299;

	@OriginalMember(owner = "client!se", name = "M", descriptor = "[I")
	public int[] anIntArray300;

	@OriginalMember(owner = "client!se", name = "N", descriptor = "[Lclient!ec;")
	public Class22[] aClass22Array21;

	@OriginalMember(owner = "client!se", name = "U", descriptor = "I")
	public int anInt2721;

	@OriginalMember(owner = "client!se", name = "ab", descriptor = "I")
	public int anInt2724;

	@OriginalMember(owner = "client!se", name = "db", descriptor = "I")
	public int anInt2726;

	@OriginalMember(owner = "client!se", name = "I", descriptor = "Lclient!ec;")
	public Class22 aClass22_802 = Static110.aClass22_811;

	@OriginalMember(owner = "client!se", name = "P", descriptor = "I")
	public int anInt2718 = 0;

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(Lclient!jd;I)V")
	public void method1766(@OriginalArg(0) Class4_Sub11 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method719();
			if (local11 == 0) {
				return;
			}
			this.method1770(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!se", name = "a", descriptor = "(IILclient!jd;)V")
	private void method1770(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub11 arg1) {
		if (arg0 == 1) {
			this.anInt2726 = arg1.method719();
		} else if (arg0 == 2) {
			this.anInt2724 = arg1.method719();
		} else if (arg0 == 3) {
			this.aClass22_802 = arg1.method742();
		} else if (arg0 == 4) {
			this.anInt2721 = arg1.method725();
		} else {
			@Pc(59) int local59;
			if (arg0 == 5) {
				this.anInt2718 = arg1.method718();
				this.aClass22Array21 = new Class22[this.anInt2718];
				this.anIntArray299 = new int[this.anInt2718];
				for (local59 = 0; local59 < this.anInt2718; local59++) {
					this.anIntArray299[local59] = arg1.method725();
					this.aClass22Array21[local59] = arg1.method742();
				}
			} else if (arg0 == 6) {
				this.anInt2718 = arg1.method718();
				this.anIntArray300 = new int[this.anInt2718];
				this.anIntArray299 = new int[this.anInt2718];
				for (local59 = 0; local59 < this.anInt2718; local59++) {
					this.anIntArray299[local59] = arg1.method725();
					this.anIntArray300[local59] = arg1.method725();
				}
			}
		}
	}
}
