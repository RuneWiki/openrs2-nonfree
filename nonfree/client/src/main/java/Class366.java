import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uea")
public final class Class366 {

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "Z")
	public boolean aBoolean839;

	@OriginalMember(owner = "client!uea", name = "d", descriptor = "I")
	public int anInt9837;

	@OriginalMember(owner = "client!uea", name = "h", descriptor = "I")
	public int anInt9840;

	@OriginalMember(owner = "client!uea", name = "f", descriptor = "I")
	public int anInt9843;

	@OriginalMember(owner = "client!uea", name = "e", descriptor = "I")
	public int anInt9844;

	@OriginalMember(owner = "client!uea", name = "q", descriptor = "I")
	public int anInt9845;

	@OriginalMember(owner = "client!uea", name = "r", descriptor = "I")
	public int anInt9847;

	@OriginalMember(owner = "client!uea", name = "j", descriptor = "I")
	public int anInt9848;

	@OriginalMember(owner = "client!uea", name = "k", descriptor = "I")
	public int anInt9849;

	@OriginalMember(owner = "client!uea", name = "o", descriptor = "I")
	public int anInt9838 = 16777215;

	@OriginalMember(owner = "client!uea", name = "m", descriptor = "I")
	public int anInt9850 = 8;

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(Lclient!et;I)V")
	public void method8682(@OriginalArg(0) Class2_Sub20 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method8581(-17416);
			if (local9 == 0) {
				return;
			}
			this.method8683(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "(IBLclient!et;)V")
	private void method8683(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub20 arg1) {
		if (arg0 == 1) {
			this.anInt9850 = arg1.method8575();
		} else if (arg0 == 2) {
			this.aBoolean839 = true;
		} else if (arg0 == 3) {
			this.anInt9837 = arg1.method8598();
			this.anInt9843 = arg1.method8598();
			this.anInt9847 = arg1.method8598();
		} else if (arg0 == 4) {
			this.anInt9844 = arg1.method8581(-17416);
		} else if (arg0 == 5) {
			this.anInt9849 = arg1.method8575();
		} else if (arg0 == 6) {
			this.anInt9838 = arg1.method8583();
		} else if (arg0 == 7) {
			this.anInt9840 = arg1.method8598();
			this.anInt9848 = arg1.method8598();
			this.anInt9845 = arg1.method8598();
			return;
		}
	}
}
