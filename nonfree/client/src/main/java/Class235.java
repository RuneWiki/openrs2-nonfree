import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oda")
public final class Class235 {

	@OriginalMember(owner = "client!oda", name = "e", descriptor = "I")
	public int anInt6927 = 64;

	@OriginalMember(owner = "client!oda", name = "f", descriptor = "Z")
	public boolean aBoolean518 = false;

	@OriginalMember(owner = "client!oda", name = "h", descriptor = "I")
	public int anInt6929 = 2;

	@OriginalMember(owner = "client!oda", name = "d", descriptor = "Z")
	public boolean aBoolean517 = false;

	@OriginalMember(owner = "client!oda", name = "g", descriptor = "I")
	public int anInt6928 = 1;

	@OriginalMember(owner = "client!oda", name = "i", descriptor = "I")
	public int anInt6930 = -1;

	@OriginalMember(owner = "client!oda", name = "l", descriptor = "I")
	public int anInt6932 = 64;

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(BLclient!iaa;I)V")
	public void method5838(@OriginalArg(1) Class6_Sub26 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(17) int local17 = arg0.method4966();
			if (local17 == 0) {
				return;
			}
			this.method5840(local17, arg1, arg0);
		}
	}

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIBLclient!iaa;)V")
	private void method5840(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class6_Sub26 arg2) {
		if (arg0 == 1) {
			this.anInt6930 = arg2.method4999();
			if (this.anInt6930 == 65535) {
				this.anInt6930 = -1;
			}
		} else if (arg0 == 2) {
			this.anInt6927 = arg2.method4999() + 1;
			this.anInt6932 = arg2.method4999() + 1;
		} else if (arg0 == 3) {
			arg2.method4972();
		} else if (arg0 == 4) {
			this.anInt6929 = arg2.method4966();
		} else if (arg0 == 5) {
			this.anInt6928 = arg2.method4966();
		} else if (arg0 == 6) {
			this.aBoolean517 = true;
		} else if (arg0 == 7) {
			this.aBoolean518 = true;
		}
	}
}
