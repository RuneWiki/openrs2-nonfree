import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bi")
public final class Class24 {

	@OriginalMember(owner = "client!bi", name = "e", descriptor = "I")
	public int anInt590 = 64;

	@OriginalMember(owner = "client!bi", name = "g", descriptor = "I")
	public int anInt592 = 2;

	@OriginalMember(owner = "client!bi", name = "f", descriptor = "I")
	public int anInt591 = 1;

	@OriginalMember(owner = "client!bi", name = "c", descriptor = "I")
	public int anInt588 = -1;

	@OriginalMember(owner = "client!bi", name = "j", descriptor = "I")
	public int anInt595 = 64;

	@OriginalMember(owner = "client!bi", name = "k", descriptor = "Z")
	public boolean aBoolean58 = false;

	@OriginalMember(owner = "client!bi", name = "b", descriptor = "Z")
	public boolean aBoolean57 = false;

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILclient!sv;I)V")
	private void method462(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub13 arg2) {
		if (arg0 == 1) {
			this.anInt588 = arg2.method3555();
			if (this.anInt588 == 65535) {
				this.anInt588 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt590 = arg2.method3555() + 1;
			this.anInt595 = arg2.method3555() + 1;
		} else if (arg0 == 3) {
			arg2.method3605();
		} else if (arg0 == 4) {
			this.anInt592 = arg2.method3580();
		} else if (arg0 == 5) {
			this.anInt591 = arg2.method3580();
		} else if (arg0 == 6) {
			this.aBoolean58 = true;
		} else if (arg0 == 7) {
			this.aBoolean57 = true;
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILclient!sv;)V")
	public void method464(@OriginalArg(0) int arg0, @OriginalArg(2) Class2_Sub13 arg1) {
		while (true) {
			@Pc(11) int local11 = arg1.method3580();
			if (local11 == 0) {
				return;
			}
			this.method462(local11, arg0, arg1);
		}
	}
}
