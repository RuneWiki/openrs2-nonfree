import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qe")
public final class Class203 {

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
	public int anInt5853 = 64;

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
	public int anInt5856 = -1;

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
	public int anInt5859 = 2;

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "Z")
	public boolean aBoolean438 = false;

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "Z")
	public boolean aBoolean439 = false;

	@OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
	public int anInt5860 = 1;

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
	public int anInt5857 = 64;

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILclient!wn;II)V")
	private void method4865(@OriginalArg(1) Class4_Sub20 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt5856 = arg0.method4560();
			if (this.anInt5856 == 65535) {
				this.anInt5856 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt5853 = arg0.method4560() + 1;
			this.anInt5857 = arg0.method4560() + 1;
		} else if (arg1 == 3) {
			arg0.method4576();
		} else if (arg1 == 4) {
			this.anInt5859 = arg0.method4614();
		} else if (arg1 == 5) {
			this.anInt5860 = arg0.method4614();
		} else if (arg1 == 6) {
			this.aBoolean438 = true;
			return;
		} else if (arg1 == 7) {
			this.aBoolean439 = true;
			return;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IILclient!wn;)V")
	public void method4868(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub20 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method4614();
			if (local5 == 0) {
				return;
			}
			this.method4865(arg1, local5, arg0);
		}
	}
}
