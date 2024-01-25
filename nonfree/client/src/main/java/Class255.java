import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oda")
public final class Class255 {

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "I")
	public int anInt6888 = 2;

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "I")
	public int anInt6889 = -1;

	@OriginalMember(owner = "client!oda", name = "f", descriptor = "I")
	public int anInt6892 = 64;

	@OriginalMember(owner = "client!oda", name = "g", descriptor = "I")
	public int anInt6893 = 1;

	@OriginalMember(owner = "client!oda", name = "j", descriptor = "Z")
	public boolean aBoolean571 = false;

	@OriginalMember(owner = "client!oda", name = "c", descriptor = "Z")
	public boolean aBoolean570 = false;

	@OriginalMember(owner = "client!oda", name = "e", descriptor = "I")
	public int anInt6891 = 64;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lclient!ee;BII)V")
	private void method6148(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt6889 = arg0.method8631();
			if (this.anInt6889 == 65535) {
				this.anInt6889 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt6892 = arg0.method8631() + 1;
			this.anInt6891 = arg0.method8631() + 1;
		} else if (arg1 == 3) {
			arg0.method8635();
		} else if (arg1 == 4) {
			this.anInt6888 = arg0.method8645();
		} else if (arg1 == 5) {
			this.anInt6893 = arg0.method8645();
		} else if (arg1 == 6) {
			this.aBoolean570 = true;
		} else if (arg1 == 7) {
			this.aBoolean571 = true;
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Lclient!ee;II)V")
	public void method6149(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(12) int local12 = arg0.method8645();
			if (local12 == 0) {
				return;
			}
			this.method6148(arg0, local12, arg1);
		}
	}
}
