import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uo")
public final class Class336 {

	@OriginalMember(owner = "client!uo", name = "b", descriptor = "Z")
	public boolean aBoolean659 = false;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "I")
	public int anInt8507 = -1;

	@OriginalMember(owner = "client!uo", name = "j", descriptor = "I")
	public int anInt8514 = 1;

	@OriginalMember(owner = "client!uo", name = "e", descriptor = "Z")
	public boolean aBoolean660 = false;

	@OriginalMember(owner = "client!uo", name = "h", descriptor = "I")
	public int anInt8512 = 64;

	@OriginalMember(owner = "client!uo", name = "i", descriptor = "I")
	public int anInt8513 = 2;

	@OriginalMember(owner = "client!uo", name = "l", descriptor = "I")
	public int anInt8516 = 64;

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(IIILclient!qh;)V")
	private void method7127(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class3_Sub11 arg2) {
		if (arg1 == 1) {
			this.anInt8507 = arg2.method3109();
			if (this.anInt8507 == 65535) {
				this.anInt8507 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt8516 = arg2.method3109() + 1;
			this.anInt8512 = arg2.method3109() + 1;
		} else if (arg1 == 3) {
			arg2.method3096();
		} else if (arg1 == 4) {
			this.anInt8513 = arg2.method3118();
		} else if (arg1 == 5) {
			this.anInt8514 = arg2.method3118();
		} else if (arg1 == 6) {
			this.aBoolean660 = true;
		} else if (arg1 == 7) {
			this.aBoolean659 = true;
		}
	}

	@OriginalMember(owner = "client!uo", name = "a", descriptor = "(Lclient!qh;IZ)V")
	public void method7128(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(16) int local16 = arg0.method3118();
			if (local16 == 0) {
				return;
			}
			this.method7127(arg1, local16, arg0);
		}
	}
}
