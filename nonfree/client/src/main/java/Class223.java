import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lfa")
public final class Class223 {

	@OriginalMember(owner = "client!lfa", name = "g", descriptor = "[J")
	public static final long[] aLongArray11 = new long[256];

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "C")
	public char aChar1;

	@OriginalMember(owner = "client!lfa", name = "b", descriptor = "I")
	public int anInt6112;

	@OriginalMember(owner = "client!lfa", name = "c", descriptor = "I")
	public int anInt6113;

	@OriginalMember(owner = "client!lfa", name = "e", descriptor = "I")
	public int anInt6115;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(8) long local8 = (long) local4;
			for (@Pc(10) int local10 = 0; local10 < 8; local10++) {
				if ((local8 & 0x1L) == 1L) {
					local8 = local8 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local8 >>>= 0x1;
				}
			}
			aLongArray11[local4] = local8;
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Lclient!fca;I)V")
	public void method5126(@OriginalArg(0) Class3_Sub17 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method4888();
			if (local11 == 0) {
				return;
			}
			this.method5127(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ILclient!fca;I)V")
	private void method5127(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub17 arg1) {
		if (arg0 == 1) {
			this.aChar1 = Static669.method8682(arg1.method4861());
		} else if (arg0 == 2) {
			this.anInt6115 = arg1.method4858();
			this.anInt6112 = arg1.method4888();
			this.anInt6113 = arg1.method4888();
		}
	}
}
