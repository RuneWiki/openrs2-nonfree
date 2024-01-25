import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bo")
public final class Class31 {

	@OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
	public int anInt668;

	@OriginalMember(owner = "client!bo", name = "c", descriptor = "I")
	public int anInt669;

	@OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
	public int anInt670;

	@OriginalMember(owner = "client!bo", name = "i", descriptor = "Z")
	public boolean aBoolean20;

	@OriginalMember(owner = "client!bo", name = "j", descriptor = "I")
	public int anInt675;

	@OriginalMember(owner = "client!bo", name = "k", descriptor = "I")
	public int anInt676;

	@OriginalMember(owner = "client!bo", name = "h", descriptor = "I")
	public int anInt674 = 8;

	@OriginalMember(owner = "client!bo", name = "l", descriptor = "I")
	public int anInt677 = 16777215;

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!lh;I)V")
	private void method621(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1 arg1) {
		if (arg0 == 1) {
			this.anInt674 = arg1.method4093();
		} else if (arg0 == 2) {
			this.aBoolean20 = true;
		} else if (arg0 == 3) {
			this.anInt669 = arg1.method4100();
			this.anInt670 = arg1.method4100();
			this.anInt668 = arg1.method4100();
		} else if (arg0 == 4) {
			this.anInt676 = arg1.method4130();
		} else if (arg0 == 5) {
			this.anInt675 = arg1.method4093();
		} else if (arg0 == 6) {
			this.anInt677 = arg1.method4142();
		}
	}

	@OriginalMember(owner = "client!bo", name = "a", descriptor = "(ILclient!lh;)V")
	public void method623(@OriginalArg(1) Class1_Sub1 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method4130();
			if (local5 == 0) {
				return;
			}
			this.method621(local5, arg0);
		}
	}
}
