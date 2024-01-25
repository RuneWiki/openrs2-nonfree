import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class294 {

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
	public int anInt8726 = 1;

	@OriginalMember(owner = "client!ui", name = "i", descriptor = "Z")
	public boolean aBoolean647 = false;

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "Z")
	public boolean aBoolean646 = false;

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
	public int anInt8725 = 64;

	@OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
	public int anInt8731 = 64;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
	public int anInt8723 = -1;

	@OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
	public int anInt8732 = 2;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILclient!rt;I)V")
	private void method7176(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class3_Sub27 arg2) {
		if (arg0 == 1) {
			this.anInt8723 = arg2.method7591();
			if (this.anInt8723 == 65535) {
				this.anInt8723 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt8731 = arg2.method7591() + 1;
			this.anInt8725 = arg2.method7591() + 1;
		} else if (arg0 == 3) {
			arg2.method7584();
		} else if (arg0 == 4) {
			this.anInt8732 = arg2.method7548();
		} else if (arg0 == 5) {
			this.anInt8726 = arg2.method7548();
		} else if (arg0 == 6) {
			this.aBoolean647 = true;
		} else if (arg0 == 7) {
			this.aBoolean646 = true;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(IILclient!rt;)V")
	public void method7177(@OriginalArg(1) int arg0, @OriginalArg(2) Class3_Sub27 arg1) {
		while (true) {
			@Pc(9) int local9 = arg1.method7548();
			if (local9 == 0) {
				return;
			}
			this.method7176(local9, arg0, arg1);
		}
	}
}
