import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class92 {

	@OriginalMember(owner = "client!eu", name = "m", descriptor = "[I")
	public static final int[] anIntArray192 = new int[128];

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
	public int anInt2456;

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
	public int anInt2458;

	@OriginalMember(owner = "client!eu", name = "g", descriptor = "I")
	public int anInt2462;

	@OriginalMember(owner = "client!eu", name = "h", descriptor = "I")
	public int anInt2463;

	@OriginalMember(owner = "client!eu", name = "j", descriptor = "Z")
	public boolean aBoolean210;

	@OriginalMember(owner = "client!eu", name = "k", descriptor = "I")
	public int anInt2464;

	@OriginalMember(owner = "client!eu", name = "f", descriptor = "I")
	public int anInt2461 = 8;

	@OriginalMember(owner = "client!eu", name = "l", descriptor = "I")
	public int anInt2465 = 16777215;

	static {
		for (@Pc(8) int local8 = 0; local8 < anIntArray192.length; local8++) {
			anIntArray192[local8] = -1;
		}
		for (@Pc(24) int local24 = 65; local24 <= 90; local24++) {
			anIntArray192[local24] = local24 - 65;
		}
		for (@Pc(39) int local39 = 97; local39 <= 122; local39++) {
			anIntArray192[local39] = local39 - 71;
		}
		for (@Pc(54) int local54 = 48; local54 <= 57; local54++) {
			anIntArray192[local54] = local54 + 52 - 48;
		}
		anIntArray192[45] = anIntArray192[47] = 63;
		anIntArray192[42] = anIntArray192[43] = 62;
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!os;I)V")
	public void method2290(@OriginalArg(0) Class1_Sub17 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method4487();
			if (local7 == 0) {
				return;
			}
			this.method2291(local7, arg0);
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILclient!os;Z)V")
	private void method2291(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub17 arg1) {
		if (arg0 == 1) {
			this.anInt2461 = arg1.method4494();
		} else if (arg0 == 2) {
			this.aBoolean210 = true;
		} else if (arg0 == 3) {
			this.anInt2458 = arg1.method4447();
			this.anInt2462 = arg1.method4447();
			this.anInt2463 = arg1.method4447();
		} else if (arg0 == 4) {
			this.anInt2456 = arg1.method4487();
		} else if (arg0 == 5) {
			this.anInt2464 = arg1.method4494();
		} else if (arg0 == 6) {
			this.anInt2465 = arg1.method4486();
		}
	}
}
