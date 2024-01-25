import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!an")
public final class Class13 {

	@OriginalMember(owner = "client!an", name = "a", descriptor = "I")
	public int anInt220 = 2048;

	@OriginalMember(owner = "client!an", name = "d", descriptor = "I")
	public int anInt222 = 0;

	@OriginalMember(owner = "client!an", name = "i", descriptor = "I")
	public int anInt226 = 0;

	@OriginalMember(owner = "client!an", name = "h", descriptor = "I")
	public int anInt225 = 2048;

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(Lclient!kh;II)V")
	public void method170(@OriginalArg(0) Class11_Sub25 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method5185();
			if (local5 == 0) {
				return;
			}
			this.method171(arg1, arg0, local5);
		}
	}

	@OriginalMember(owner = "client!an", name = "a", descriptor = "(IILclient!kh;I)V")
	private void method171(@OriginalArg(0) int arg0, @OriginalArg(2) Class11_Sub25 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt222 = arg1.method5185();
		} else if (arg2 == 2) {
			this.anInt225 = arg1.method5187();
		} else if (arg2 == 3) {
			this.anInt220 = arg1.method5187();
		} else if (arg2 == 4) {
			this.anInt226 = arg1.method5220();
		}
	}
}
