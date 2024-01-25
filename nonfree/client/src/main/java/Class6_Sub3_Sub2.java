import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hm")
public final class Class6_Sub3_Sub2 extends Class6_Sub3 {

	@OriginalMember(owner = "client!hm", name = "M", descriptor = "Z")
	private boolean aBoolean303;

	@OriginalMember(owner = "client!hm", name = "O", descriptor = "I")
	private int anInt4259;

	@OriginalMember(owner = "client!hm", name = "P", descriptor = "Z")
	private boolean aBoolean304;

	@OriginalMember(owner = "client!hm", name = "L", descriptor = "Lclient!ada;")
	private final Class8 aClass8_23 = new Class8();

	@OriginalMember(owner = "client!hm", name = "N", descriptor = "I")
	private int anInt4258 = 256;

	@OriginalMember(owner = "client!hm", name = "Q", descriptor = "I")
	private int anInt4260 = 256;

	@OriginalMember(owner = "client!hm", name = "S", descriptor = "I")
	private int anInt4261 = 0;

	@OriginalMember(owner = "client!hm", name = "E", descriptor = "I")
	private final int anInt4251;

	@OriginalMember(owner = "client!hm", name = "<init>", descriptor = "(I)V")
	public Class6_Sub3_Sub2(@OriginalArg(0) int arg0) {
		this.anInt4251 = arg0;
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "(I)D")
	public synchronized double method3685() {
		if (this.anInt4261 < 1) {
			return -1.0D;
		} else {
			@Pc(17) Class6_Sub2_Sub8 local17 = (Class6_Sub2_Sub8) this.aClass8_23.method149();
			return local17 == null ? -1.0D : (double) -((float) local17.aShortArrayArray7[0].length / (float) Static78.anInt1661) + local17.aDouble6;
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7801(@OriginalArg(0) int arg0) {
		if (this.aBoolean303) {
			return;
		}
		while (true) {
			@Pc(11) Class6_Sub2_Sub8 local11 = this.method3697();
			if (local11 == null) {
				if (this.aBoolean304) {
					this.method9043();
					Static607.aClass195_6.method5380();
				}
				return;
			}
			if (local11.aShortArrayArray7[0].length - this.anInt4259 > arg0) {
				this.anInt4259 += arg0;
				return;
			}
			arg0 -= local11.aShortArrayArray7[0].length - this.anInt4259;
			this.method3689();
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(II)V")
	public void method3688(@OriginalArg(0) int arg0) {
		this.anInt4260 = arg0;
		this.anInt4258 = arg0;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "()Lclient!ca;")
	@Override
	public Class6_Sub3 method7800() {
		return null;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Z)V")
	private synchronized void method3689() {
		@Pc(11) Class6_Sub2_Sub8 local11 = this.method3697();
		if (local11 != null) {
			local11.method9043();
			this.anInt4259 = 0;
			this.anInt4261--;
			Static607.aClass195_6.method5384(local11.method3577(), local11);
		}
	}

	@OriginalMember(owner = "client!hm", name = "c", descriptor = "()Lclient!ca;")
	@Override
	public Class6_Sub3 method7803() {
		return null;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lclient!hea;I)V")
	public synchronized void method3692(@OriginalArg(0) Class6_Sub2_Sub8 arg0) {
		while (this.anInt4261 >= 100) {
			this.aClass8_23.method152();
			this.anInt4261--;
		}
		this.aClass8_23.method157(arg0);
		this.anInt4261++;
	}

	@OriginalMember(owner = "client!hm", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method7805(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean303) {
			return;
		}
		if (this.method3697() != null) {
			@Pc(27) int local27 = arg2 + arg1;
			if (Static339.aBoolean677) {
				local27 <<= 0x1;
			}
			@Pc(37) byte local37 = 0;
			if (this.anInt4251 == 2) {
				local37 = 1;
			}
			while (local27 > arg1) {
				@Pc(51) Class6_Sub2_Sub8 local51 = this.method3697();
				if (local51 == null) {
					return;
				}
				@Pc(57) short[][] local57 = local51.aShortArrayArray7;
				while (arg1 < local27 && this.anInt4259 < local57[0].length) {
					if (Static339.aBoolean677) {
						arg0[arg1++] = this.anInt4258 * local57[0][this.anInt4259];
						arg0[arg1++] = this.anInt4260 * local57[local37][this.anInt4259];
					} else {
						@Pc(63) int local63 = arg1++;
						arg0[local63] += local57[local37][this.anInt4259] * this.anInt4260 + this.anInt4258 * local57[0][this.anInt4259];
					}
					this.anInt4259++;
				}
				if (this.anInt4259 >= local57[0].length) {
					this.method3689();
				}
			}
		} else if (this.aBoolean304) {
			this.method9043();
			Static607.aClass195_6.method5380();
		}
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZB)V")
	public synchronized void method3693(@OriginalArg(0) boolean arg0) {
		this.aBoolean303 = arg0;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(ZDI)Lclient!hea;")
	public Class6_Sub2_Sub8 method3694(@OriginalArg(1) double arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) (arg1 | this.anInt4251 << 0);
		@Pc(17) Class6_Sub2_Sub8 local17 = (Class6_Sub2_Sub8) Static607.aClass195_6.method5381(local11);
		if (local17 == null) {
			local17 = new Class6_Sub2_Sub8(new short[this.anInt4251][arg1], arg0);
		} else {
			local17.aDouble6 = arg0;
			Static607.aClass195_6.method5382(local11);
		}
		return local17;
	}

	@OriginalMember(owner = "client!hm", name = "e", descriptor = "(I)V")
	public synchronized void method3695() {
		this.aBoolean304 = true;
	}

	@OriginalMember(owner = "client!hm", name = "a", descriptor = "(B)I")
	public synchronized int method3696() {
		return this.anInt4261;
	}

	@OriginalMember(owner = "client!hm", name = "f", descriptor = "(I)Lclient!hea;")
	private synchronized Class6_Sub2_Sub8 method3697() {
		return (Class6_Sub2_Sub8) this.aClass8_23.method149();
	}

	@OriginalMember(owner = "client!hm", name = "d", descriptor = "()I")
	@Override
	public int method7804() {
		return 1;
	}
}
