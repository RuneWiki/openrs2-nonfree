import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gb")
public final class Class68 {

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
	public int anInt2164;

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "Z")
	public boolean aBoolean151;

	@OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
	public int anInt2167;

	@OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
	public int anInt2169;

	@OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
	public int anInt2170;

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
	public int anInt2171;

	@OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
	public int anInt2165 = 8;

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
	public int anInt2168 = 16777215;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIILclient!at;)V")
	private void method2092(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class1_Sub7 arg2) {
		if (arg1 == 1) {
			this.anInt2165 = arg2.method2161();
		} else if (arg1 == 2) {
			this.aBoolean151 = true;
		} else if (arg1 == 3) {
			this.anInt2171 = arg2.method2141();
			this.anInt2169 = arg2.method2141();
			this.anInt2164 = arg2.method2141();
		} else if (arg1 == 4) {
			this.anInt2167 = arg2.method2132();
		} else if (arg1 == 5) {
			this.anInt2170 = arg2.method2161();
		} else if (arg1 == 6) {
			this.anInt2168 = arg2.method2119();
		}
	}

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(BLclient!at;I)V")
	public void method2093(@OriginalArg(1) Class1_Sub7 arg0, @OriginalArg(2) int arg1) {
		while (true) {
			@Pc(5) int local5 = arg0.method2132();
			if (local5 == 0) {
				return;
			}
			this.method2092(arg1, local5, arg0);
		}
	}
}
