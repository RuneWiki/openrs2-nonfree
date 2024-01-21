import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bg")
public final class Class3_Sub3_Sub4 extends Class3_Sub3 {

	@OriginalMember(owner = "client!bg", name = "E", descriptor = "I")
	public int anInt340;

	@OriginalMember(owner = "client!bg", name = "F", descriptor = "I")
	public int anInt341;

	@OriginalMember(owner = "client!bg", name = "R", descriptor = "I")
	public int anInt349;

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BLclient!ce;)V")
	public void method292(@OriginalArg(1) Class3_Sub4 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method1278();
			if (local7 == 0) {
				return;
			}
			this.method297(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!bg", name = "a", descriptor = "(BILclient!ce;)V")
	private void method297(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub4 arg1) {
		if (arg0 == 1) {
			this.anInt341 = arg1.method1270();
			this.anInt349 = arg1.method1278();
			this.anInt340 = arg1.method1278();
		}
	}
}
