import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ri")
public final class Class276 {

	@OriginalMember(owner = "client!ri", name = "d", descriptor = "I")
	public int anInt7922 = 2;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "I")
	public int anInt7920 = 64;

	@OriginalMember(owner = "client!ri", name = "j", descriptor = "Z")
	public boolean aBoolean519 = false;

	@OriginalMember(owner = "client!ri", name = "e", descriptor = "I")
	public int anInt7923 = 1;

	@OriginalMember(owner = "client!ri", name = "k", descriptor = "I")
	public int anInt7927 = 64;

	@OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
	public int anInt7928 = -1;

	@OriginalMember(owner = "client!ri", name = "i", descriptor = "Z")
	public boolean aBoolean518 = false;

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!jr;B)V")
	public void method6318(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		while (true) {
			@Pc(5) int local5 = arg1.method6019();
			if (local5 == 0) {
				return;
			}
			this.method6319(arg1, local5, arg0);
		}
	}

	@OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILclient!jr;II)V")
	private void method6319(@OriginalArg(1) Class6_Sub12 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 1) {
			this.anInt7928 = arg0.method6044();
			if (this.anInt7928 == 65535) {
				this.anInt7928 = -1;
			}
		} else if (arg1 == 2) {
			this.anInt7927 = arg0.method6044() + 1;
			this.anInt7920 = arg0.method6044() + 1;
		} else if (arg1 == 3) {
			arg0.method6049();
		} else if (arg1 == 4) {
			this.anInt7922 = arg0.method6019();
		} else if (arg1 == 5) {
			this.anInt7923 = arg0.method6019();
		} else if (arg1 == 6) {
			this.aBoolean519 = true;
		} else if (arg1 == 7) {
			this.aBoolean518 = true;
			return;
		}
	}
}
