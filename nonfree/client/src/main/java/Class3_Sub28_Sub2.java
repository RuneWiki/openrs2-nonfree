import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class3_Sub28_Sub2 extends Class3_Sub28 {

	@OriginalMember(owner = "client!lk", name = "Tb", descriptor = "[J")
	public static final long[] aLongArray10 = new long[256];

	@OriginalMember(owner = "client!lk", name = "Gb", descriptor = "Lclient!wea;")
	private Class399 aClass399_1;

	@OriginalMember(owner = "client!lk", name = "Ob", descriptor = "I")
	private int anInt6300;

	static {
		for (@Pc(91) int local91 = 0; local91 < 256; local91++) {
			@Pc(95) long local95 = (long) local91;
			for (@Pc(97) int local97 = 0; local97 < 8; local97++) {
				if ((local95 & 0x1L) == 1L) {
					local95 = local95 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local95 >>>= 0x1;
				}
			}
			aLongArray10[local91] = local95;
		}
	}

	@OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(I)V")
	public Class3_Sub28_Sub2(@OriginalArg(0) int arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!lk", name = "b", descriptor = "([BIII)V")
	public void method5337(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		for (@Pc(3) int local3 = 0; local3 < arg1; local3++) {
			arg0[local3] = (byte) (super.aByteArray50[super.anInt6241++] - this.aClass399_1.method9194());
		}
	}

	@OriginalMember(owner = "client!lk", name = "k", descriptor = "(II)I")
	public int method5338(@OriginalArg(0) int arg0) {
		return arg0 * 8 - this.anInt6300;
	}

	@OriginalMember(owner = "client!lk", name = "v", descriptor = "(I)Z")
	public boolean method5339() {
		@Pc(17) int local17 = super.aByteArray50[super.anInt6241] - this.aClass399_1.method9191() & 0xFF;
		return local17 >= 128;
	}

	@OriginalMember(owner = "client!lk", name = "l", descriptor = "(II)V")
	public void method5340(@OriginalArg(0) int arg0) {
		super.aByteArray50[super.anInt6241++] = (byte) (this.aClass399_1.method9194() + arg0);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "([IZ)V")
	public void method5342(@OriginalArg(0) int[] arg0) {
		this.aClass399_1 = new Class399(arg0);
	}

	@OriginalMember(owner = "client!lk", name = "t", descriptor = "(I)V")
	public void method5343() {
		this.anInt6300 = super.anInt6241 * 8;
	}

	@OriginalMember(owner = "client!lk", name = "m", descriptor = "(II)I")
	public int method5344(@OriginalArg(1) int arg0) {
		@Pc(10) int local10 = this.anInt6300 >> 3;
		@Pc(18) int local18 = 8 - (this.anInt6300 & 0x7);
		@Pc(20) int local20 = 0;
		this.anInt6300 += arg0;
		while (arg0 > local18) {
			local20 += (super.aByteArray50[local10++] & Static159.anIntArray140[local18]) << arg0 - local18;
			arg0 -= local18;
			local18 = 8;
		}
		if (-29598 != -29598) {
			return 38;
		}
		if (arg0 == local18) {
			local20 += Static159.anIntArray140[local18] & super.aByteArray50[local10];
		} else {
			local20 += super.aByteArray50[local10] >> local18 - arg0 & Static159.anIntArray140[arg0];
		}
		return local20;
	}

	@OriginalMember(owner = "client!lk", name = "x", descriptor = "(I)V")
	public void method5346() {
		super.anInt6241 = (this.anInt6300 + 7) / 8;
	}

	@OriginalMember(owner = "client!lk", name = "q", descriptor = "(B)I")
	public int method5347() {
		@Pc(27) int local27 = super.aByteArray50[super.anInt6241++] - this.aClass399_1.method9194() & 0xFF;
		return local27 < 128 ? local27 : (local27 - 128 << 8) + (super.aByteArray50[super.anInt6241++] - this.aClass399_1.method9194() & 0xFF);
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILclient!wea;)V")
	public void method5348(@OriginalArg(1) Class399 arg0) {
		this.aClass399_1 = arg0;
	}
}
