import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pe")
public final class Class189 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "I")
	public int anInt5223;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "I")
	public int anInt5224;

	@OriginalMember(owner = "client!pe", name = "c", descriptor = "I")
	public int anInt5225;

	@OriginalMember(owner = "client!pe", name = "d", descriptor = "Z")
	public boolean aBoolean376;

	@OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
	public int anInt5228;

	@OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
	public int anInt5231;

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
	public int anInt5227 = 16777215;

	@OriginalMember(owner = "client!pe", name = "l", descriptor = "I")
	public int anInt5230 = 8;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!hp;I)V")
	public void method4325(@OriginalArg(0) Class1_Sub5 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method5366();
			if (local13 == 0) {
				return;
			}
			this.method4328(arg0, local13);
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZLclient!hp;I)V")
	private void method4328(@OriginalArg(1) Class1_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt5230 = arg0.method5362();
		} else if (arg1 == 2) {
			this.aBoolean376 = true;
		} else if (arg1 == 3) {
			this.anInt5231 = arg0.method5380();
			this.anInt5223 = arg0.method5380();
			this.anInt5228 = arg0.method5380();
		} else if (arg1 == 4) {
			this.anInt5224 = arg0.method5366();
		} else if (arg1 == 5) {
			this.anInt5225 = arg0.method5362();
		} else if (arg1 == 6) {
			this.anInt5227 = arg0.method5399();
		}
	}
}
