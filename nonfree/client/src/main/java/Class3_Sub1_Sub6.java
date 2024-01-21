import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class3_Sub1_Sub6 extends Class3_Sub1 {

	@OriginalMember(owner = "client!ff", name = "T", descriptor = "I")
	public int anInt1140;

	@OriginalMember(owner = "client!ff", name = "Y", descriptor = "I")
	public int anInt1142;

	@OriginalMember(owner = "client!ff", name = "rb", descriptor = "I")
	public int anInt1154;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLclient!la;)V")
	public void method750(@OriginalArg(1) Class3_Sub12 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1936();
			if (local14 == 0) {
				return;
			}
			this.method757(arg0, local14);
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(BLclient!la;I)V")
	private void method757(@OriginalArg(1) Class3_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1142 = arg0.method1963();
			this.anInt1154 = arg0.method1936();
			this.anInt1140 = arg0.method1936();
		}
	}
}
