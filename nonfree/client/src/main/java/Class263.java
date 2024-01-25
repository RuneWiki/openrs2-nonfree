import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pia")
public final class Class263 implements Interface6 {

	@OriginalMember(owner = "client!pia", name = "i", descriptor = "Lclient!eq;")
	private Class99 aClass99_59 = new Class99(128);

	@OriginalMember(owner = "client!pia", name = "b", descriptor = "[I")
	public final int[] anIntArray530 = new int[Static581.aClass305_1.anInt9249];

	@OriginalMember(owner = "client!pia", name = "q", descriptor = "[I")
	private final int[] anIntArray531 = new int[Static581.aClass305_1.anInt9249];

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(BZ)I")
	public int method6854(@OriginalArg(1) boolean arg0) {
		@Pc(20) long local20 = Static277.method5091();
		for (@Pc(34) Class2_Sub25 local34 = arg0 ? (Class2_Sub25) this.aClass99_59.method3060() : (Class2_Sub25) this.aClass99_59.method3058(); local34 != null; local34 = (Class2_Sub25) this.aClass99_59.method3058()) {
			if ((local34.aLong115 & 0x3FFFFFFFFFFFFFFFL) < local20) {
				if ((local34.aLong115 & 0x4000000000000000L) != 0L) {
					@Pc(58) int local58 = (int) local34.aLong278;
					this.anIntArray530[local58] = this.anIntArray531[local58];
					local34.method9253();
					return local58;
				}
				local34.method9253();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(BII)V")
	public void method6855(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray530[arg1] = arg0;
		@Pc(20) Class2_Sub25 local20 = (Class2_Sub25) this.aClass99_59.method3056((long) arg1);
		if (local20 == null) {
			local20 = new Class2_Sub25(Static277.method5091() + 500L);
			this.aClass99_59.method3059((long) arg1, local20);
		} else {
			local20.aLong115 = Static277.method5091() + 500L;
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(II)I")
	@Override
	public int method6853(@OriginalArg(0) int arg0) {
		@Pc(8) Class35 local8 = Static517.aClass284_1.method7411(arg0);
		@Pc(11) int local11 = local8.anInt1748;
		@Pc(19) int local19 = local8.anInt1745;
		@Pc(22) int local22 = local8.anInt1749;
		@Pc(29) int local29 = Class227.anIntArray466[local22 - local19];
		return this.anIntArray530[local11] >> local19 & local29;
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(III)V")
	public void method6856(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class35 local8 = Static517.aClass284_1.method7411(arg0);
		@Pc(11) int local11 = local8.anInt1748;
		@Pc(14) int local14 = local8.anInt1745;
		@Pc(17) int local17 = local8.anInt1749;
		@Pc(24) int local24 = Class227.anIntArray466[local17 - local14];
		if (arg1 < 0 || arg1 > local24) {
			arg1 = 0;
		}
		local24 <<= local14;
		this.method6855(arg1 << local14 & local24 | this.anIntArray530[local11] & ~local24, local11);
	}

	@OriginalMember(owner = "client!pia", name = "b", descriptor = "(BII)V")
	public void method6862(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray531[arg1] = arg0;
		@Pc(23) Class2_Sub25 local23 = (Class2_Sub25) this.aClass99_59.method3056((long) arg1);
		if (local23 == null) {
			local23 = new Class2_Sub25(4611686018427387905L);
			this.aClass99_59.method3059((long) arg1, local23);
		} else if (local23.aLong115 != 4611686018427387905L) {
			local23.aLong115 = Static277.method5091() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(B)V")
	public void method6863() {
		for (@Pc(3) int local3 = 0; local3 < Static581.aClass305_1.anInt9249; local3++) {
			@Pc(10) Class253 local10 = Static581.aClass305_1.method7737(local3);
			if (local10 != null && local10.anInt7766 == 0) {
				this.anIntArray531[local3] = 0;
				this.anIntArray530[local3] = 0;
			}
		}
		this.aClass99_59 = new Class99(128);
	}

	@OriginalMember(owner = "client!pia", name = "a", descriptor = "(IB)I")
	@Override
	public int method6852(@OriginalArg(0) int arg0) {
		return this.anIntArray530[arg0];
	}

	@OriginalMember(owner = "client!pia", name = "c", descriptor = "(BII)V")
	public void method6865(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class35 local8 = Static517.aClass284_1.method7411(arg0);
		@Pc(11) int local11 = local8.anInt1748;
		@Pc(14) int local14 = local8.anInt1745;
		@Pc(21) int local21 = local8.anInt1749;
		@Pc(27) int local27 = Class227.anIntArray466[local21 - local14];
		if (arg1 < 0 || local27 < arg1) {
			arg1 = 0;
		}
		local27 <<= local14;
		this.method6862(arg1 << local14 & local27 | ~local27 & this.anIntArray531[local11], local11);
	}
}
