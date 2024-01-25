import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!bf")
public final class Class31 {

	@OriginalMember(owner = "client!bf", name = "h", descriptor = "Z")
	public boolean aBoolean73 = false;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "I")
	public int anInt741 = 1;

	@OriginalMember(owner = "client!bf", name = "c", descriptor = "I")
	public int anInt743 = 2;

	@OriginalMember(owner = "client!bf", name = "j", descriptor = "Z")
	public boolean aBoolean74 = false;

	@OriginalMember(owner = "client!bf", name = "i", descriptor = "I")
	public int anInt746 = 64;

	@OriginalMember(owner = "client!bf", name = "p", descriptor = "I")
	public int anInt751 = 64;

	@OriginalMember(owner = "client!bf", name = "q", descriptor = "I")
	public int anInt752 = -1;

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lclient!np;III)V")
	private void method650(@OriginalArg(0) Class3_Sub11 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt752 = arg0.method5198();
			if (this.anInt752 == 65535) {
				this.anInt752 = -1;
			}
		} else if (arg2 == 2) {
			this.anInt751 = arg0.method5198() + 1;
			this.anInt746 = arg0.method5198() + 1;
		} else if (arg2 == 3) {
			arg0.method5212();
		} else if (arg2 == 4) {
			this.anInt743 = arg0.method5175();
		} else if (arg2 == 5) {
			this.anInt741 = arg0.method5175();
		} else if (arg2 == 6) {
			this.aBoolean74 = true;
		} else if (arg2 == 7) {
			this.aBoolean73 = true;
		}
	}

	@OriginalMember(owner = "client!bf", name = "a", descriptor = "(ILclient!np;I)V")
	public void method651(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub11 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method5175();
			if (local5 == 0) {
				return;
			}
			this.method650(arg1, arg0, local5);
		}
	}
}
