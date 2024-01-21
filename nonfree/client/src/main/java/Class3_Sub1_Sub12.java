import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!p")
public final class Class3_Sub1_Sub12 extends Class3_Sub1 {

	@OriginalMember(owner = "client!p", name = "R", descriptor = "I")
	public int anInt2047;

	@OriginalMember(owner = "client!p", name = "bb", descriptor = "I")
	public int anInt2054;

	@OriginalMember(owner = "client!p", name = "fb", descriptor = "I")
	public int anInt2057;

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(Lclient!kd;II)V")
	private void method1245(@OriginalArg(0) Class3_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt2057 = arg0.method1789();
			this.anInt2054 = arg0.method1803();
			this.anInt2047 = arg0.method1803();
		}
	}

	@OriginalMember(owner = "client!p", name = "a", descriptor = "(ILclient!kd;)V")
	public void method1252(@OriginalArg(1) Class3_Sub8 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method1803();
			if (local13 == 0) {
				return;
			}
			this.method1245(arg0, local13);
		}
	}
}
