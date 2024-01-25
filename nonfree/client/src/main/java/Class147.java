import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class147 {

	@OriginalMember(owner = "client!im", name = "b", descriptor = "I")
	public int anInt4017 = 1;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "Z")
	public boolean aBoolean243 = false;

	@OriginalMember(owner = "client!im", name = "i", descriptor = "I")
	public int anInt4021 = -1;

	@OriginalMember(owner = "client!im", name = "k", descriptor = "Z")
	public boolean aBoolean244 = false;

	@OriginalMember(owner = "client!im", name = "j", descriptor = "I")
	public int anInt4022 = 64;

	@OriginalMember(owner = "client!im", name = "n", descriptor = "I")
	public int anInt4025 = 64;

	@OriginalMember(owner = "client!im", name = "l", descriptor = "I")
	public int anInt4023 = 2;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(IILclient!co;I)V")
	private void method3446(@OriginalArg(0) int arg0, @OriginalArg(2) Class5_Sub3 arg1, @OriginalArg(3) int arg2) {
		if (arg0 == 1) {
			this.anInt4021 = arg1.method4227();
			if (this.anInt4021 == 65535) {
				this.anInt4021 = -1;
				return;
			}
		} else if (arg0 == 2) {
			this.anInt4022 = arg1.method4227() + 1;
			this.anInt4025 = arg1.method4227() + 1;
			return;
		} else if (arg0 == 3) {
			arg1.method4196();
			return;
		} else if (arg0 == 4) {
			this.anInt4023 = arg1.method4220();
			return;
		} else if (arg0 == 5) {
			this.anInt4017 = arg1.method4220();
		} else {
			if (arg0 == 6) {
				this.aBoolean243 = true;
			} else if (arg0 == 7) {
				this.aBoolean244 = true;
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILclient!co;I)V")
	public void method3449(@OriginalArg(1) Class5_Sub3 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method4220();
			if (local5 == 0) {
				return;
			}
			this.method3446(local5, arg0, arg1);
		}
	}
}
