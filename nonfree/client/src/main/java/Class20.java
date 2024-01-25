import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bd")
public final class Class20 {

	@OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
	public int anInt761;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
	public int anInt762;

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "Z")
	public boolean aBoolean35;

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
	public int anInt765;

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
	public int anInt767;

	@OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
	public int anInt769;

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
	public int anInt764 = 16777215;

	@OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
	public int anInt766 = 8;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILclient!ae;)V")
	public void method655(@OriginalArg(1) Class6_Sub1 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method6433();
			if (local11 == 0) {
				return;
			}
			this.method659(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(BILclient!ae;)V")
	private void method659(@OriginalArg(1) int arg0, @OriginalArg(2) Class6_Sub1 arg1) {
		if (arg0 == 1) {
			this.anInt766 = arg1.method6485();
		} else if (arg0 == 2) {
			this.aBoolean35 = true;
		} else if (arg0 == 3) {
			this.anInt765 = arg1.method6428();
			this.anInt769 = arg1.method6428();
			this.anInt767 = arg1.method6428();
		} else if (arg0 == 4) {
			this.anInt761 = arg1.method6433();
		} else if (arg0 == 5) {
			this.anInt762 = arg1.method6485();
		} else if (arg0 == 6) {
			this.anInt764 = arg1.method6435();
		}
	}
}
