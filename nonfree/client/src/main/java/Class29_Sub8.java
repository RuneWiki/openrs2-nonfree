import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dia")
public final class Class29_Sub8 extends Class29 {

	@OriginalMember(owner = "client!dia", name = "i", descriptor = "[J")
	public static final long[] aLongArray5 = new long[256];

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(10) long local10 = (long) local6;
			for (@Pc(12) int local12 = 0; local12 < 8; local12++) {
				if ((local10 & 0x1L) == 1L) {
					local10 = local10 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local10 >>>= 0x1;
				}
			}
			aLongArray5[local6] = local10;
		}
	}

	@OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(Lclient!fs;)V")
	public Class29_Sub8(@OriginalArg(0) Class6_Sub22 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!dia", name = "<init>", descriptor = "(ILclient!fs;)V")
	public Class29_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) Class6_Sub22 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(I)V")
	@Override
	public void method8995() {
		super.anInt10604 = this.method8997();
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(B)I")
	@Override
	protected int method8997() {
		return super.aClass6_Sub22_31.method2360() ? 1 : 0;
	}

	@OriginalMember(owner = "client!dia", name = "d", descriptor = "(II)V")
	@Override
	protected void method9000(@OriginalArg(0) int arg0) {
		super.anInt10604 = arg0;
	}

	@OriginalMember(owner = "client!dia", name = "a", descriptor = "(II)I")
	@Override
	public int method8994(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!dia", name = "c", descriptor = "(B)I")
	public int method1719() {
		return super.anInt10604;
	}
}
