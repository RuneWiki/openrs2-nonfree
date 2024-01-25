import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nm")
public final class Class3_Sub1_Sub5 extends Class3_Sub1 {

	@OriginalMember(owner = "client!nm", name = "M", descriptor = "Z")
	private boolean aBoolean456;

	@OriginalMember(owner = "client!nm", name = "P", descriptor = "Z")
	private boolean aBoolean457;

	@OriginalMember(owner = "client!nm", name = "R", descriptor = "I")
	private int anInt6501;

	@OriginalMember(owner = "client!nm", name = "u", descriptor = "Lclient!tm;")
	private final Class338 aClass338_160 = new Class338();

	@OriginalMember(owner = "client!nm", name = "N", descriptor = "I")
	private int anInt6498 = 0;

	@OriginalMember(owner = "client!nm", name = "Q", descriptor = "I")
	private int anInt6500 = 256;

	@OriginalMember(owner = "client!nm", name = "O", descriptor = "I")
	private int anInt6499 = 256;

	@OriginalMember(owner = "client!nm", name = "L", descriptor = "I")
	private final int anInt6497;

	@OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(I)V")
	public Class3_Sub1_Sub5(@OriginalArg(0) int arg0) {
		this.anInt6497 = arg0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IDI)Lclient!qg;")
	public Class3_Sub11_Sub15 method5785(@OriginalArg(1) double arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) (arg1 | this.anInt6497 << 0);
		@Pc(22) Class3_Sub11_Sub15 local22 = (Class3_Sub11_Sub15) Static172.aClass179_2.method4558(local11);
		if (local22 == null) {
			local22 = new Class3_Sub11_Sub15(new short[this.anInt6497][arg1], arg0);
		} else {
			local22.aDouble25 = arg0;
			Static172.aClass179_2.method4561(local11);
		}
		return local22;
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "()I")
	@Override
	public int method5780() {
		return 1;
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "()Lclient!sia;")
	@Override
	public Class3_Sub1 method5782() {
		return null;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(IB)V")
	public void method5786(@OriginalArg(0) int arg0) {
		this.anInt6500 = arg0;
		this.anInt6499 = arg0;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method5779(@OriginalArg(0) int arg0) {
		if (this.aBoolean457) {
			return;
		}
		while (true) {
			@Pc(11) Class3_Sub11_Sub15 local11 = this.method5795();
			if (local11 == null) {
				if (this.aBoolean456) {
					this.method9380();
					Static172.aClass179_2.method4563();
				}
				return;
			}
			if (arg0 < local11.aShortArrayArray27[0].length - this.anInt6501) {
				this.anInt6501 += arg0;
				return;
			}
			arg0 -= local11.aShortArrayArray27[0].length - this.anInt6501;
			this.method5797();
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)I")
	public synchronized int method5787() {
		return this.anInt6498;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method5783(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean457) {
			return;
		}
		if (this.method5795() != null) {
			@Pc(27) int local27 = arg2 + arg1;
			if (Static219.aBoolean313) {
				local27 <<= 0x1;
			}
			@Pc(37) byte local37 = 0;
			if (this.anInt6497 == 2) {
				local37 = 1;
			}
			while (arg1 < local27) {
				@Pc(49) Class3_Sub11_Sub15 local49 = this.method5795();
				if (local49 == null) {
					return;
				}
				@Pc(55) short[][] local55 = local49.aShortArrayArray27;
				while (arg1 < local27 && local55[0].length > this.anInt6501) {
					if (Static219.aBoolean313) {
						arg0[arg1++] = this.anInt6499 * local55[0][this.anInt6501];
						arg0[arg1++] = this.anInt6500 * local55[local37][this.anInt6501];
					} else {
						@Pc(61) int local61 = arg1++;
						arg0[local61] += this.anInt6499 * local55[0][this.anInt6501] + local55[local37][this.anInt6501] * this.anInt6500;
					}
					this.anInt6501++;
				}
				if (this.anInt6501 >= local55[0].length) {
					this.method5797();
				}
			}
		} else if (this.aBoolean456) {
			this.method9380();
			Static172.aClass179_2.method4563();
		}
	}

	@OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)V")
	public synchronized void method5788() {
		this.aBoolean456 = true;
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILclient!qg;)V")
	public synchronized void method5792(@OriginalArg(1) Class3_Sub11_Sub15 arg0) {
		while (this.anInt6498 >= 100) {
			this.aClass338_160.method8169();
			this.anInt6498--;
		}
		this.aClass338_160.method8171(arg0);
		this.anInt6498++;
	}

	@OriginalMember(owner = "client!nm", name = "d", descriptor = "(I)D")
	public synchronized double method5793() {
		if (this.anInt6498 < 1) {
			return -1.0D;
		} else {
			@Pc(17) Class3_Sub11_Sub15 local17 = (Class3_Sub11_Sub15) this.aClass338_160.method8177();
			return local17 == null ? -1.0D : local17.aDouble25 - (double) ((float) local17.aShortArrayArray27[0].length / (float) Static348.anInt5701);
		}
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "()Lclient!sia;")
	@Override
	public Class3_Sub1 method5778() {
		return null;
	}

	@OriginalMember(owner = "client!nm", name = "e", descriptor = "(I)Lclient!qg;")
	private synchronized Class3_Sub11_Sub15 method5795() {
		return (Class3_Sub11_Sub15) this.aClass338_160.method8177();
	}

	@OriginalMember(owner = "client!nm", name = "a", descriptor = "(ZI)V")
	public synchronized void method5796(@OriginalArg(0) boolean arg0) {
		this.aBoolean457 = arg0;
	}

	@OriginalMember(owner = "client!nm", name = "f", descriptor = "(I)V")
	private synchronized void method5797() {
		@Pc(11) Class3_Sub11_Sub15 local11 = this.method5795();
		if (local11 != null) {
			local11.method9380();
			this.anInt6501 = 0;
			this.anInt6498--;
			Static172.aClass179_2.method4562(local11, local11.method7038());
		}
	}
}
