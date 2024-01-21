import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class3_Sub1_Sub9 extends Class3_Sub1 {

	@OriginalMember(owner = "client!kb", name = "P", descriptor = "I")
	public int anInt1443;

	@OriginalMember(owner = "client!kb", name = "T", descriptor = "I")
	public int anInt1446;

	@OriginalMember(owner = "client!kb", name = "W", descriptor = "I")
	public int anInt1449;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!m;B)V")
	public void method948(@OriginalArg(0) Class3_Sub6 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method1587();
			if (local14 == 0) {
				return;
			}
			this.method952(local14, arg0);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILclient!m;)V")
	private void method952(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub6 arg1) {
		if (arg0 == 1) {
			this.anInt1443 = arg1.method1603();
			this.anInt1446 = arg1.method1587();
			this.anInt1449 = arg1.method1587();
		}
	}
}
