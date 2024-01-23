import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class1_Sub1_Sub27 extends Class1_Sub1 {

	@OriginalMember(owner = "client!v", name = "L", descriptor = "I")
	public int anInt4379;

	@OriginalMember(owner = "client!v", name = "Q", descriptor = "Lclient!kh;")
	public Class60 aClass60_1506;

	@OriginalMember(owner = "client!v", name = "W", descriptor = "I")
	private int anInt4382;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(BLclient!nc;)V")
	public void method3204(@OriginalArg(1) Class1_Sub9 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method895();
			if (local5 == 0) {
				return;
			}
			this.method3207(local5, arg0);
		}
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(I)Z")
	public boolean method3206() {
		return this.anInt4382 == 115;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(ILclient!nc;B)V")
	private void method3207(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub9 arg1) {
		if (arg0 == 1) {
			this.anInt4382 = arg1.method895();
		} else if (arg0 == 2) {
			this.anInt4379 = arg1.method915();
		} else if (arg0 == 5) {
			this.aClass60_1506 = arg1.method935();
		}
	}
}
