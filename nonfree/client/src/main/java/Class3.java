import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public final class Class3 {

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
	public int anInt60;

	@OriginalMember(owner = "client!ab", name = "d", descriptor = "Z")
	public boolean aBoolean3;

	@OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
	public int anInt63;

	@OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
	public int anInt65;

	@OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
	public int anInt68;

	@OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
	public int anInt70;

	@OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
	public int anInt64 = 16777215;

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
	public int anInt67 = 8;

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lclient!daa;B)V")
	public void method196(@OriginalArg(0) Class12_Sub8 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method5216();
			if (local9 == 0) {
				return;
			}
			this.method200(local9, arg0);
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILclient!daa;)V")
	private void method200(@OriginalArg(1) int arg0, @OriginalArg(2) Class12_Sub8 arg1) {
		if (arg0 == 1) {
			this.anInt67 = arg1.method5199();
		} else if (arg0 == 2) {
			this.aBoolean3 = true;
		} else if (arg0 == 3) {
			this.anInt65 = arg1.method5217();
			this.anInt63 = arg1.method5217();
			this.anInt70 = arg1.method5217();
		} else if (arg0 == 4) {
			this.anInt68 = arg1.method5216();
		} else if (arg0 == 5) {
			this.anInt60 = arg1.method5199();
		} else if (arg0 == 6) {
			this.anInt64 = arg1.method5195();
		}
	}
}
