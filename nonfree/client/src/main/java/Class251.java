import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!og")
public final class Class251 {

	@OriginalMember(owner = "client!og", name = "b", descriptor = "I")
	public int anInt6714;

	@OriginalMember(owner = "client!og", name = "d", descriptor = "I")
	public int anInt6716;

	@OriginalMember(owner = "client!og", name = "e", descriptor = "Z")
	public boolean aBoolean521;

	@OriginalMember(owner = "client!og", name = "i", descriptor = "I")
	public int anInt6719;

	@OriginalMember(owner = "client!og", name = "j", descriptor = "I")
	public int anInt6720;

	@OriginalMember(owner = "client!og", name = "k", descriptor = "I")
	public int anInt6721;

	@OriginalMember(owner = "client!og", name = "m", descriptor = "I")
	public int anInt6723 = 8;

	@OriginalMember(owner = "client!og", name = "c", descriptor = "I")
	public int anInt6715 = 16777215;

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IBLclient!ac;)V")
	private void method5445(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub3 arg1) {
		if (arg0 == 1) {
			this.anInt6723 = arg1.method7945();
		} else if (arg0 == 2) {
			this.aBoolean521 = true;
		} else if (arg0 == 3) {
			this.anInt6716 = arg1.method7975();
			this.anInt6721 = arg1.method7975();
			this.anInt6714 = arg1.method7975();
		} else if (arg0 == 4) {
			this.anInt6719 = arg1.method7974();
			return;
		} else if (arg0 == 5) {
			this.anInt6720 = arg1.method7945();
			return;
		} else if (arg0 == 6) {
			this.anInt6715 = arg1.method7919();
			return;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(BLclient!ac;)V")
	public void method5447(@OriginalArg(1) Class1_Sub3 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method7974();
			if (local9 == 0) {
				return;
			}
			this.method5445(local9, arg0);
		}
	}
}
