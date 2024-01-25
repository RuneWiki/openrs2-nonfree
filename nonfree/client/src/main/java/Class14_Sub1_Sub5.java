import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wg")
public final class Class14_Sub1_Sub5 extends Class14_Sub1 {

	@OriginalMember(owner = "client!wg", name = "R", descriptor = "Z")
	private boolean aBoolean767;

	@OriginalMember(owner = "client!wg", name = "L", descriptor = "Z")
	private boolean aBoolean768;

	@OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
	private int anInt10995;

	@OriginalMember(owner = "client!wg", name = "t", descriptor = "Lclient!bd;")
	private final Class32 aClass32_67 = new Class32();

	@OriginalMember(owner = "client!wg", name = "O", descriptor = "I")
	private int anInt10992 = 0;

	@OriginalMember(owner = "client!wg", name = "G", descriptor = "I")
	private int anInt10993 = 256;

	@OriginalMember(owner = "client!wg", name = "x", descriptor = "I")
	private int anInt10996 = 256;

	@OriginalMember(owner = "client!wg", name = "A", descriptor = "I")
	private final int anInt10980;

	@OriginalMember(owner = "client!wg", name = "<init>", descriptor = "(I)V")
	public Class14_Sub1_Sub5(@OriginalArg(0) int arg0) {
		this.anInt10980 = arg0;
	}

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "()Lclient!ec;")
	@Override
	public Class14_Sub1 method9320() {
		return null;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)V")
	public void method9323(@OriginalArg(1) int arg0) {
		this.anInt10996 = arg0;
		this.anInt10993 = arg0;
	}

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "(I)V")
	public synchronized void method9324() {
		this.aBoolean768 = true;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method9317(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean767) {
			return;
		}
		if (this.method9325() != null) {
			@Pc(32) int local32 = arg2 + arg1;
			if (Static583.aBoolean664) {
				local32 <<= 0x1;
			}
			@Pc(42) byte local42 = 0;
			if (this.anInt10980 == 2) {
				local42 = 1;
			}
			while (arg1 < local32) {
				@Pc(58) Class14_Sub2_Sub14 local58 = this.method9325();
				if (local58 == null) {
					return;
				}
				@Pc(64) short[][] local64 = local58.aShortArrayArray3;
				while (local32 > arg1 && local64[0].length > this.anInt10995) {
					if (Static583.aBoolean664) {
						arg0[arg1++] = local64[0][this.anInt10995] * this.anInt10993;
						arg0[arg1++] = this.anInt10996 * local64[local42][this.anInt10995];
					} else {
						@Pc(72) int local72 = arg1++;
						arg0[local72] += this.anInt10993 * local64[0][this.anInt10995] + this.anInt10996 * local64[local42][this.anInt10995];
					}
					this.anInt10995++;
				}
				if (this.anInt10995 >= local64[0].length) {
					this.method9327();
				}
			}
		} else if (this.aBoolean768) {
			this.method9513();
			Static105.aClass378_5.method9083();
		}
	}

	@OriginalMember(owner = "client!wg", name = "e", descriptor = "(I)Lclient!mc;")
	private synchronized Class14_Sub2_Sub14 method9325() {
		return (Class14_Sub2_Sub14) this.aClass32_67.method584();
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "(I)V")
	@Override
	public synchronized void method9318(@OriginalArg(0) int arg0) {
		if (this.aBoolean767) {
			return;
		}
		while (true) {
			@Pc(14) Class14_Sub2_Sub14 local14 = this.method9325();
			if (local14 == null) {
				if (this.aBoolean768) {
					this.method9513();
					Static105.aClass378_5.method9083();
				}
				return;
			}
			if (arg0 < local14.aShortArrayArray3[0].length - this.anInt10995) {
				this.anInt10995 += arg0;
				return;
			}
			arg0 -= local14.aShortArrayArray3[0].length - this.anInt10995;
			this.method9327();
		}
	}

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "()Lclient!ec;")
	@Override
	public Class14_Sub1 method9316() {
		return null;
	}

	@OriginalMember(owner = "client!wg", name = "d", descriptor = "()I")
	@Override
	public int method9321() {
		return 1;
	}

	@OriginalMember(owner = "client!wg", name = "f", descriptor = "(I)V")
	private synchronized void method9327() {
		@Pc(21) Class14_Sub2_Sub14 local21 = this.method9325();
		if (local21 != null) {
			local21.method9513();
			this.anInt10992--;
			this.anInt10995 = 0;
			Static105.aClass378_5.method9078(local21, local21.method5539());
		}
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IID)Lclient!mc;")
	public Class14_Sub2_Sub14 method9329(@OriginalArg(1) int arg0, @OriginalArg(2) double arg1) {
		@Pc(11) long local11 = (long) (arg0 | this.anInt10980 << 0);
		@Pc(17) Class14_Sub2_Sub14 local17 = (Class14_Sub2_Sub14) Static105.aClass378_5.method9082(local11);
		if (local17 == null) {
			local17 = new Class14_Sub2_Sub14(new short[this.anInt10980][arg0], arg1);
		} else {
			local17.aDouble15 = arg1;
			Static105.aClass378_5.method9080(local11);
		}
		return local17;
	}

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "(I)I")
	public synchronized int method9330() {
		return this.anInt10992;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZ)V")
	public synchronized void method9331(@OriginalArg(1) boolean arg0) {
		this.aBoolean767 = arg0;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(Lclient!mc;B)V")
	public synchronized void method9332(@OriginalArg(0) Class14_Sub2_Sub14 arg0) {
		while (this.anInt10992 >= 100) {
			this.aClass32_67.method579();
			this.anInt10992--;
		}
		this.aClass32_67.method582(arg0);
		this.anInt10992++;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(B)D")
	public synchronized double method9333() {
		if (this.anInt10992 < 1) {
			return -1.0D;
		} else {
			@Pc(22) Class14_Sub2_Sub14 local22 = (Class14_Sub2_Sub14) this.aClass32_67.method584();
			return local22 == null ? -1.0D : local22.aDouble15 - (double) ((float) local22.aShortArrayArray3[0].length / (float) Static157.anInt2396);
		}
	}
}
