import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fg")
public final class Class3_Sub6_Sub8 extends Class3_Sub6 {

	@OriginalMember(owner = "client!fg", name = "S", descriptor = "[J")
	public static final long[] aLongArray2 = new long[256];

	@OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
	private int anInt3432 = 0;

	@OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
	private int anInt3427 = 4096;

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
			aLongArray2[local4] = local8;
		}
	}

	@OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
	public Class3_Sub6_Sub8() {
		super(1, true);
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BLclient!ie;I)V")
	@Override
	public void method8003(@OriginalArg(1) Class3_Sub26 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 0) {
			this.anInt3432 = arg0.method6811();
		} else if (arg1 == 1) {
			this.anInt3427 = arg0.method6811();
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method8009(@OriginalArg(0) int arg0) {
		@Pc(11) int[] local11 = super.aClass170_41.method4104(arg0);
		if (super.aClass170_41.aBoolean337) {
			@Pc(21) int[] local21 = this.method8001(0, arg0);
			for (@Pc(23) int local23 = 0; local23 < Static481.anInt8358; local23++) {
				@Pc(29) int local29 = local21[local23];
				local11[local23] = local29 >= this.anInt3432 && this.anInt3427 >= local29 ? 4096 : 0;
			}
		}
		return local11;
	}
}
