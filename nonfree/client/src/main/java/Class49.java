import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dr")
public final class Class49 {

	@OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
	public int anInt1402;

	@OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
	public int anInt1404;

	@OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
	public int anInt1406;

	@OriginalMember(owner = "client!dr", name = "k", descriptor = "I")
	public int anInt1408;

	@OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
	public int anInt1409;

	@OriginalMember(owner = "client!dr", name = "q", descriptor = "Z")
	public boolean aBoolean72;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
	public int anInt1399 = 8;

	@OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
	public int anInt1403 = 16777215;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!fb;II)V")
	public void method1090(@OriginalArg(0) Class3_Sub4 arg0, @OriginalArg(1) int arg1) {
		while (true) {
			@Pc(14) int local14 = arg0.method3643();
			if (local14 == 0) {
				return;
			}
			this.method1093(arg1, arg0, local14);
		}
	}

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(ILclient!fb;II)V")
	private void method1093(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub4 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 1) {
			this.anInt1399 = arg1.method3649();
		} else if (arg2 == 2) {
			this.aBoolean72 = true;
		} else if (arg2 == 3) {
			this.anInt1408 = arg1.method3622();
			this.anInt1404 = arg1.method3622();
			this.anInt1402 = arg1.method3622();
		} else if (arg2 == 4) {
			this.anInt1409 = arg1.method3643();
		} else if (arg2 == 5) {
			this.anInt1406 = arg1.method3649();
		} else if (arg2 == 6) {
			this.anInt1403 = arg1.method3659();
		}
	}
}
