import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cr")
public final class Class40 {

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_44 = new Class145(29, -1);

	@OriginalMember(owner = "client!cr", name = "g", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_45 = new Class145(35, 3);

	@OriginalMember(owner = "client!cr", name = "e", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!cr", name = "c", descriptor = "I")
	public int anInt1257 = 1;

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!bt;I)V", line = 4)
	public void method1470(@OriginalArg(0) Class2_Sub4 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method4816();
			if (local17 == 0) {
				return;
			}
			this.method1472(arg0, local17);
		}
	}

	@OriginalMember(owner = "client!cr", name = "a", descriptor = "(Lclient!bt;II)V", line = 47)
	private void method1472(@OriginalArg(0) Class2_Sub4 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar2 = Static74.method5699(arg0.method4826());
		} else if (arg1 == 2) {
			this.anInt1257 = 0;
		}
	}
}
