import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ee")
public final class Class63 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
	public int anInt1786;

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
	public int anInt1788;

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "Z")
	public boolean aBoolean136;

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
	public int anInt1790;

	@OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
	public int anInt1792;

	@OriginalMember(owner = "client!ee", name = "m", descriptor = "I")
	public int anInt1796;

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
	public int anInt1791 = 8;

	@OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
	public int anInt1794 = 16777215;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(Lclient!vt;BI)V")
	private void method1415(@OriginalArg(0) Class2_Sub24 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1791 = arg0.method5753();
		} else if (arg1 == 2) {
			this.aBoolean136 = true;
		} else if (arg1 == 3) {
			this.anInt1790 = arg0.method5743();
			this.anInt1796 = arg0.method5743();
			this.anInt1792 = arg0.method5743();
		} else if (arg1 == 4) {
			this.anInt1788 = arg0.method5732();
		} else if (arg1 == 5) {
			this.anInt1786 = arg0.method5753();
		} else if (arg1 == 6) {
			this.anInt1794 = arg0.method5736();
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(ILclient!vt;)V")
	public void method1417(@OriginalArg(1) Class2_Sub24 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5732();
			if (local5 == 0) {
				return;
			}
			this.method1415(arg0, local5);
		}
	}
}
