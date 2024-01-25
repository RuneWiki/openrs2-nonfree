import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!du")
public final class Class75 {

	@OriginalMember(owner = "client!du", name = "b", descriptor = "I")
	public int anInt2593 = -1;

	@OriginalMember(owner = "client!du", name = "c", descriptor = "Z")
	public boolean aBoolean183 = false;

	@OriginalMember(owner = "client!du", name = "e", descriptor = "Z")
	public boolean aBoolean184 = false;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "I")
	public int anInt2592 = 1;

	@OriginalMember(owner = "client!du", name = "l", descriptor = "I")
	public int anInt2601 = 2;

	@OriginalMember(owner = "client!du", name = "n", descriptor = "I")
	public int anInt2602 = 64;

	@OriginalMember(owner = "client!du", name = "k", descriptor = "I")
	public int anInt2600 = 64;

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BIILclient!ie;)V")
	private void method2178(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub26 arg2) {
		if (arg1 == 1) {
			this.anInt2593 = arg2.method6811();
			if (this.anInt2593 == 65535) {
				this.anInt2593 = -1;
				return;
			}
		} else if (arg1 == 2) {
			this.anInt2600 = arg2.method6811() + 1;
			this.anInt2602 = arg2.method6811() + 1;
			return;
		} else if (arg1 == 3) {
			arg2.method6825();
		} else if (arg1 == 4) {
			this.anInt2601 = arg2.method6814();
			return;
		} else if (arg1 == 5) {
			this.anInt2592 = arg2.method6814();
			return;
		} else {
			if (arg1 == 6) {
				this.aBoolean184 = true;
			} else if (arg1 == 7) {
				this.aBoolean183 = true;
				return;
			}
			return;
		}
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Lclient!ie;II)V")
	public void method2183(@OriginalArg(0) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(11) int local11 = arg0.method6814();
			if (local11 == 0) {
				return;
			}
			this.method2178(arg1, local11, arg0);
		}
	}
}
