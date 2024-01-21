import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fb")
public final class Class2_Sub2_Sub6 extends Class2_Sub2 {

	@OriginalMember(owner = "client!fb", name = "cb", descriptor = "I")
	public int anInt812;

	@OriginalMember(owner = "client!fb", name = "ib", descriptor = "[I")
	public int[] anIntArray94;

	@OriginalMember(owner = "client!fb", name = "kb", descriptor = "I")
	public int anInt815;

	@OriginalMember(owner = "client!fb", name = "lb", descriptor = "[Lclient!u;")
	public Class74[] aClass74Array6;

	@OriginalMember(owner = "client!fb", name = "ob", descriptor = "[I")
	public int[] anIntArray95;

	@OriginalMember(owner = "client!fb", name = "rb", descriptor = "I")
	public int anInt818;

	@OriginalMember(owner = "client!fb", name = "hb", descriptor = "I")
	public int anInt814 = 0;

	@OriginalMember(owner = "client!fb", name = "vb", descriptor = "Lclient!u;")
	public Class74 aClass74_607 = Static4.aClass74_39;

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lclient!ic;Z)V")
	public void method589(@OriginalArg(0) Class2_Sub10 arg0) {
		while (true) {
			@Pc(15) int local15 = arg0.method1514();
			if (local15 == 0) {
				return;
			}
			this.method590(local15, arg0);
		}
	}

	@OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZILclient!ic;)V")
	private void method590(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub10 arg1) {
		if (arg0 == 1) {
			this.anInt815 = arg1.method1514();
		} else if (arg0 == 2) {
			this.anInt812 = arg1.method1514();
		} else if (arg0 == 3) {
			this.aClass74_607 = arg1.method1530();
			return;
		} else if (arg0 == 4) {
			this.anInt818 = arg1.method1532();
			return;
		} else {
			@Pc(58) int local58;
			if (arg0 == 5) {
				this.anInt814 = arg1.method1517();
				this.anIntArray94 = new int[this.anInt814];
				this.aClass74Array6 = new Class74[this.anInt814];
				for (local58 = 0; local58 < this.anInt814; local58++) {
					this.anIntArray94[local58] = arg1.method1532();
					this.aClass74Array6[local58] = arg1.method1530();
				}
				return;
			}
			if (arg0 == 6) {
				this.anInt814 = arg1.method1517();
				this.anIntArray94 = new int[this.anInt814];
				this.anIntArray95 = new int[this.anInt814];
				for (local58 = 0; local58 < this.anInt814; local58++) {
					this.anIntArray94[local58] = arg1.method1532();
					this.anIntArray95[local58] = arg1.method1532();
				}
				return;
			}
		}
	}
}
