import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bea")
public final class Class26 {

	@OriginalMember(owner = "client!bea", name = "e", descriptor = "I")
	public int anInt545 = 64;

	@OriginalMember(owner = "client!bea", name = "d", descriptor = "I")
	public int anInt544 = 64;

	@OriginalMember(owner = "client!bea", name = "l", descriptor = "Z")
	public boolean aBoolean18 = false;

	@OriginalMember(owner = "client!bea", name = "j", descriptor = "Z")
	public boolean aBoolean17 = false;

	@OriginalMember(owner = "client!bea", name = "b", descriptor = "I")
	public int anInt542 = 2;

	@OriginalMember(owner = "client!bea", name = "c", descriptor = "I")
	public int anInt543 = 1;

	@OriginalMember(owner = "client!bea", name = "m", descriptor = "I")
	public int anInt550 = -1;

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(BIILclient!dga;)V")
	private void method451(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub14 arg2) {
		if (arg0 == 1) {
			this.anInt550 = arg2.method6006();
			if (this.anInt550 == 65535) {
				this.anInt550 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt544 = arg2.method6006() + 1;
			this.anInt545 = arg2.method6006() + 1;
		} else if (arg0 == 3) {
			arg2.method6034();
		} else if (arg0 == 4) {
			this.anInt542 = arg2.method6041();
		} else if (arg0 == 5) {
			this.anInt543 = arg2.method6041();
		} else if (arg0 == 6) {
			this.aBoolean18 = true;
		} else if (arg0 == 7) {
			this.aBoolean17 = true;
		}
	}

	@OriginalMember(owner = "client!bea", name = "a", descriptor = "(Lclient!dga;II)V")
	public void method452(@OriginalArg(0) Class6_Sub14 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(13) int local13 = arg0.method6041();
			if (local13 == 0) {
				return;
			}
			this.method451(local13, arg1, arg0);
		}
	}
}
