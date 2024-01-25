import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ip")
public final class Class115 implements Interface9 {

	@OriginalMember(owner = "client!ip", name = "i", descriptor = "Lclient!cp;")
	private Class44 aClass44_16 = new Class44(128);

	@OriginalMember(owner = "client!ip", name = "m", descriptor = "[I")
	public final int[] anIntArray301 = new int[Static131.aClass183_1.anInt4736];

	@OriginalMember(owner = "client!ip", name = "h", descriptor = "[I")
	private final int[] anIntArray300 = new int[Static131.aClass183_1.anInt4736];

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZII)V")
	public void method2400(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class66 local8 = Static139.aClass163_1.method3739(arg0);
		@Pc(11) int local11 = local8.anInt1629;
		@Pc(20) int local20 = local8.anInt1632;
		@Pc(23) int local23 = local8.anInt1631;
		@Pc(30) int local30 = Class72.anIntArray187[local23 - local20];
		if (arg1 < 0 || arg1 > local30) {
			arg1 = 0;
		}
		local30 <<= local20;
		this.method2407(~local30 & this.anIntArray300[local11] | local30 & arg1 << local20, local11);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IBI)V")
	public void method2403(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class66 local12 = Static139.aClass163_1.method3739(arg0);
		@Pc(15) int local15 = local12.anInt1629;
		@Pc(18) int local18 = local12.anInt1632;
		@Pc(21) int local21 = local12.anInt1631;
		@Pc(28) int local28 = Class72.anIntArray187[local21 - local18];
		if (arg1 < 0 || local28 < arg1) {
			arg1 = 0;
		}
		local28 <<= local18;
		this.method2408(local15, arg1 << local18 & local28 | this.anIntArray301[local15] & ~local28);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZZ)I")
	public int method2404(@OriginalArg(0) boolean arg0) {
		@Pc(8) long local8 = Static288.method4512();
		for (@Pc(22) Class3_Sub26 local22 = arg0 ? (Class3_Sub26) this.aClass44_16.method950() : (Class3_Sub26) this.aClass44_16.method949(); local22 != null; local22 = (Class3_Sub26) this.aClass44_16.method949()) {
			if ((local22.aLong144 & 0x3FFFFFFFFFFFFFFFL) < local8) {
				if ((local22.aLong144 & 0x4000000000000000L) != 0L) {
					@Pc(42) int local42 = (int) local22.aLong240;
					this.anIntArray301[local42] = this.anIntArray300[local42];
					local22.method5700();
					return local42;
				}
				local22.method5700();
			}
		}
		return -1;
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(ZI)I")
	@Override
	public int method2397(@OriginalArg(1) int arg0) {
		@Pc(8) Class66 local8 = Static139.aClass163_1.method3739(arg0);
		@Pc(16) int local16 = local8.anInt1629;
		@Pc(19) int local19 = local8.anInt1632;
		@Pc(22) int local22 = local8.anInt1631;
		@Pc(28) int local28 = Class72.anIntArray187[local22 - local19];
		return this.anIntArray301[local16] >> local19 & local28;
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(B)V")
	public void method2405() {
		for (@Pc(3) int local3 = 0; local3 < Static131.aClass183_1.anInt4736; local3++) {
			@Pc(18) Class221 local18 = Static131.aClass183_1.method4256(local3);
			if (local18 != null && local18.anInt5562 == 0) {
				this.anIntArray300[local3] = 0;
				this.anIntArray301[local3] = 0;
			}
		}
		this.aClass44_16 = new Class44(128);
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(IB)I")
	@Override
	public int method2398(@OriginalArg(0) int arg0) {
		return this.anIntArray301[arg0];
	}

	@OriginalMember(owner = "client!ip", name = "b", descriptor = "(IBI)V")
	public void method2407(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.anIntArray300[arg1] = arg0;
		@Pc(21) Class3_Sub26 local21 = (Class3_Sub26) this.aClass44_16.method942((long) arg1);
		if (local21 == null) {
			local21 = new Class3_Sub26(4611686018427387905L);
			this.aClass44_16.method948((long) arg1, local21);
		} else if (local21.aLong144 != 4611686018427387905L) {
			local21.aLong144 = Static288.method4512() + 500L | 0x4000000000000000L;
		}
	}

	@OriginalMember(owner = "client!ip", name = "a", descriptor = "(III)V")
	public void method2408(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anIntArray301[arg0] = arg1;
		@Pc(22) Class3_Sub26 local22 = (Class3_Sub26) this.aClass44_16.method942((long) arg0);
		if (local22 == null) {
			local22 = new Class3_Sub26(Static288.method4512() + 500L);
			this.aClass44_16.method948((long) arg0, local22);
		} else {
			local22.aLong144 = Static288.method4512() + 500L;
		}
	}
}
