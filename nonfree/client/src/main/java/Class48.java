import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cp")
public final class Class48 {

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
	public int anInt1875 = 2048;

	@OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
	public int anInt1877 = 2048;

	@OriginalMember(owner = "client!cp", name = "g", descriptor = "I")
	public int anInt1880 = 0;

	@OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
	public int anInt1878 = 0;

	static {
		new Class114("You can't report yourself!", "Du kannst dich nicht selbst melden!", "Vous ne pouvez pas vous signaler vous-même !", "Você não pode denunciar a si próprio!");
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILclient!gw;B)V")
	private void method1812(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub13 arg1) {
		if (arg0 == 1) {
			this.anInt1880 = arg1.method3043();
		} else if (arg0 == 2) {
			this.anInt1875 = arg1.method3056();
		} else if (arg0 == 3) {
			this.anInt1877 = arg1.method3056();
		} else if (arg0 == 4) {
			this.anInt1878 = arg1.method3058();
		}
	}

	@OriginalMember(owner = "client!cp", name = "a", descriptor = "(BLclient!gw;)V")
	public void method1813(@OriginalArg(1) Class1_Sub13 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method3043();
			if (local3 == 0) {
				return;
			}
			this.method1812(local3, arg0);
		}
	}
}
