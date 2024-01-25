import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dba")
public final class Class69 {

	@OriginalMember(owner = "client!dba", name = "f", descriptor = "I")
	public int anInt1763;

	@OriginalMember(owner = "client!dba", name = "g", descriptor = "I")
	public int anInt1764;

	@OriginalMember(owner = "client!dba", name = "i", descriptor = "I")
	public int anInt1766;

	@OriginalMember(owner = "client!dba", name = "j", descriptor = "Z")
	public boolean aBoolean128;

	@OriginalMember(owner = "client!dba", name = "m", descriptor = "I")
	public int anInt1769;

	@OriginalMember(owner = "client!dba", name = "o", descriptor = "I")
	public int anInt1771;

	@OriginalMember(owner = "client!dba", name = "e", descriptor = "I")
	public int anInt1762 = 16777215;

	@OriginalMember(owner = "client!dba", name = "p", descriptor = "I")
	public int anInt1772 = 8;

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(ILclient!es;)V")
	public void method1274(@OriginalArg(1) Class2_Sub15 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method4325();
			if (local7 == 0) {
				return;
			}
			this.method1276(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!dba", name = "a", descriptor = "(BLclient!es;I)V")
	private void method1276(@OriginalArg(1) Class2_Sub15 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1772 = arg0.method4294();
		} else if (arg1 == 2) {
			this.aBoolean128 = true;
		} else if (arg1 == 3) {
			this.anInt1769 = arg0.method4334();
			this.anInt1771 = arg0.method4334();
			this.anInt1766 = arg0.method4334();
		} else if (arg1 == 4) {
			this.anInt1764 = arg0.method4325();
		} else if (arg1 == 5) {
			this.anInt1763 = arg0.method4294();
		} else if (arg1 == 6) {
			this.anInt1762 = arg0.method4341();
		}
	}
}
