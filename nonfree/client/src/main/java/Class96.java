import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hi")
public final class Class96 {

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "Z")
	public boolean aBoolean183;

	@OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
	public int anInt2225;

	@OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
	public int anInt2226;

	@OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
	public int anInt2230;

	@OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
	public int anInt2231;

	@OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
	public int anInt2232;

	@OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
	public int anInt2227 = 16777215;

	@OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
	public int anInt2234 = 8;

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!nj;BII)V")
	private void method1833(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt2234 = arg0.method5715();
		} else if (arg2 == 2) {
			this.aBoolean183 = true;
		} else if (arg2 == 3) {
			this.anInt2232 = arg0.method5691();
			this.anInt2231 = arg0.method5691();
			this.anInt2226 = arg0.method5691();
		} else if (arg2 == 4) {
			this.anInt2225 = arg0.method5720();
		} else if (arg2 == 5) {
			this.anInt2230 = arg0.method5715();
		} else if (arg2 == 6) {
			this.anInt2227 = arg0.method5705();
			return;
		}
	}

	@OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lclient!nj;II)V")
	public void method1836(@OriginalArg(0) Class1_Sub21 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(17) int local17 = arg0.method5720();
			if (local17 == 0) {
				return;
			}
			this.method1833(arg0, arg1, local17);
		}
	}
}
