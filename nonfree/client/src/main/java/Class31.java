import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class31 {

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
	public int anInt664;

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
	public int anInt666;

	@OriginalMember(owner = "client!bf", name = "d", descriptor = "I")
	public int anInt667;

	@OriginalMember(owner = "client!bf", name = "e", descriptor = "Z")
	public boolean aBoolean31;

	@OriginalMember(owner = "client!bf", name = "g", descriptor = "I")
	public int anInt669;

	@OriginalMember(owner = "client!bf", name = "l", descriptor = "I")
	public int anInt674;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "I")
	public int anInt672 = 8;

	@OriginalMember(owner = "client!bf", name = "k", descriptor = "I")
	public int anInt673 = 16777215;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!gk;)V")
	public void method570(@OriginalArg(1) Class2_Sub7 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4464();
			if (local5 == 0) {
				return;
			}
			this.method572(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!gk;B)V")
	private void method572(@OriginalArg(0) int arg0, @OriginalArg(1) Class2_Sub7 arg1) {
		if (arg0 == 1) {
			this.anInt672 = arg1.method4518();
		} else if (arg0 == 2) {
			this.aBoolean31 = true;
		} else if (arg0 == 3) {
			this.anInt666 = arg1.method4478();
			this.anInt674 = arg1.method4478();
			this.anInt664 = arg1.method4478();
		} else if (arg0 == 4) {
			this.anInt667 = arg1.method4464();
		} else if (arg0 == 5) {
			this.anInt669 = arg1.method4518();
		} else if (arg0 == 6) {
			this.anInt673 = arg1.method4503();
		}
	}
}
