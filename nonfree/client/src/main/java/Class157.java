import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!m")
public final class Class157 {

	@OriginalMember(owner = "client!m", name = "d", descriptor = "I")
	public int anInt4073 = 64;

	@OriginalMember(owner = "client!m", name = "b", descriptor = "Z")
	public boolean aBoolean266 = false;

	@OriginalMember(owner = "client!m", name = "f", descriptor = "I")
	public int anInt4074 = 64;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "Z")
	public boolean aBoolean265 = false;

	@OriginalMember(owner = "client!m", name = "l", descriptor = "I")
	public int anInt4079 = 2;

	@OriginalMember(owner = "client!m", name = "p", descriptor = "I")
	public int anInt4083 = 1;

	@OriginalMember(owner = "client!m", name = "m", descriptor = "I")
	public int anInt4080 = -1;

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(Lclient!fh;BII)V")
	private void method3218(@OriginalArg(0) Class5_Sub15 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt4080 = arg0.method5598();
			if (this.anInt4080 == 65535) {
				this.anInt4080 = -1;
			}
		} else if (arg2 == 2) {
			this.anInt4074 = arg0.method5598() + 1;
			this.anInt4073 = arg0.method5598() + 1;
		} else if (arg2 == 3) {
			arg0.method5600();
		} else if (arg2 == 4) {
			this.anInt4079 = arg0.method5539();
		} else if (arg2 == 5) {
			this.anInt4083 = arg0.method5539();
		} else if (arg2 == 6) {
			this.aBoolean265 = true;
		} else if (arg2 == 7) {
			this.aBoolean266 = true;
		}
	}

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(ILclient!fh;I)V")
	public void method3220(@OriginalArg(1) Class5_Sub15 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method5539();
			if (local5 == 0) {
				return;
			}
			this.method3218(arg0, arg1, local5);
		}
	}
}
