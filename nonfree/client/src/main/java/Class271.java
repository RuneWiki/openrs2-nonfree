import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sc")
public final class Class271 {

	@OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
	public int anInt8107 = -1;

	@OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
	public int anInt8109 = 1;

	@OriginalMember(owner = "client!sc", name = "i", descriptor = "Z")
	public boolean aBoolean555 = false;

	@OriginalMember(owner = "client!sc", name = "j", descriptor = "Z")
	public boolean aBoolean556 = false;

	@OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
	public int anInt8112 = 2;

	@OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
	public int anInt8111 = 64;

	@OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
	public int anInt8113 = 64;

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIILclient!daa;)V")
	private void method6719(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class12_Sub8 arg2) {
		if (arg0 == 1) {
			this.anInt8107 = arg2.method5199();
			if (this.anInt8107 == 65535) {
				this.anInt8107 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt8113 = arg2.method5199() + 1;
			this.anInt8111 = arg2.method5199() + 1;
		} else if (arg0 == 3) {
			arg2.method5173();
		} else if (arg0 == 4) {
			this.anInt8112 = arg2.method5216();
		} else if (arg0 == 5) {
			this.anInt8109 = arg2.method5216();
		} else if (arg0 == 6) {
			this.aBoolean556 = true;
		} else if (arg0 == 7) {
			this.aBoolean555 = true;
		}
	}

	@OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lclient!daa;II)V")
	public void method6721(@OriginalArg(0) Class12_Sub8 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(15) int local15 = arg0.method5216();
			if (local15 == 0) {
				return;
			}
			this.method6719(local15, arg1, arg0);
		}
	}
}
