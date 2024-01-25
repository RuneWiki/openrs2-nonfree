import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!im")
public final class Class159 {

	@OriginalMember(owner = "client!im", name = "b", descriptor = "I")
	public int anInt4548 = -1;

	@OriginalMember(owner = "client!im", name = "i", descriptor = "Z")
	public boolean aBoolean304 = false;

	@OriginalMember(owner = "client!im", name = "c", descriptor = "I")
	public int anInt4549 = 1;

	@OriginalMember(owner = "client!im", name = "g", descriptor = "I")
	public int anInt4553 = 64;

	@OriginalMember(owner = "client!im", name = "e", descriptor = "I")
	public int anInt4551 = 2;

	@OriginalMember(owner = "client!im", name = "d", descriptor = "I")
	public int anInt4550 = 64;

	@OriginalMember(owner = "client!im", name = "k", descriptor = "Z")
	public boolean aBoolean305 = false;

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(ILclient!sl;II)V")
	private void method4004(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub3 arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 1) {
			this.anInt4548 = arg1.method4221();
			if (this.anInt4548 == 65535) {
				this.anInt4548 = -1;
				return;
			}
		} else if (arg2 == 2) {
			this.anInt4553 = arg1.method4221() + 1;
			this.anInt4550 = arg1.method4221() + 1;
		} else if (arg2 == 3) {
			arg1.method4254();
			return;
		} else if (arg2 == 4) {
			this.anInt4551 = arg1.method4225();
			return;
		} else if (arg2 == 5) {
			this.anInt4549 = arg1.method4225();
			return;
		} else {
			if (arg2 == 6) {
				this.aBoolean304 = true;
			} else if (arg2 == 7) {
				this.aBoolean305 = true;
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!im", name = "a", descriptor = "(Lclient!sl;IB)V")
	public void method4006(@OriginalArg(0) Class3_Sub3 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(13) int local13 = arg0.method4225();
			if (local13 == 0) {
				return;
			}
			this.method4004(arg1, arg0, local13);
		}
	}
}
