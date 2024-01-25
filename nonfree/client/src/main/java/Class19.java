import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bb")
public final class Class19 {

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
	public int anInt531 = -1;

	@OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
	public int anInt533 = 64;

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "Z")
	public boolean aBoolean21 = false;

	@OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
	public int anInt535 = 64;

	@OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
	public int anInt537 = 2;

	@OriginalMember(owner = "client!bb", name = "n", descriptor = "Z")
	public boolean aBoolean22 = false;

	@OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
	public int anInt540 = 1;

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lclient!si;IB)V")
	public void method450(@OriginalArg(0) Class2_Sub23 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(13) int local13 = arg0.method5495();
			if (local13 == 0) {
				return;
			}
			this.method457(arg1, local13, arg0);
		}
	}

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(IILclient!si;I)V")
	private void method457(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class2_Sub23 arg2) {
		if (arg1 == 1) {
			this.anInt531 = arg2.method5500();
			if (this.anInt531 == 65535) {
				this.anInt531 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt535 = arg2.method5500() + 1;
			this.anInt533 = arg2.method5500() + 1;
		} else if (arg1 == 3) {
			arg2.method5484();
		} else if (arg1 == 4) {
			this.anInt537 = arg2.method5495();
		} else if (arg1 == 5) {
			this.anInt540 = arg2.method5495();
			return;
		} else if (arg1 == 6) {
			this.aBoolean22 = true;
			return;
		} else if (arg1 == 7) {
			this.aBoolean21 = true;
			return;
		}
	}
}
