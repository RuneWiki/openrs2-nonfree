import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!es")
public final class Class6_Sub8_Sub2 extends Class6_Sub8 {

	@OriginalMember(owner = "client!es", name = "D", descriptor = "I")
	private int anInt2427;

	@OriginalMember(owner = "client!es", name = "E", descriptor = "Z")
	private boolean aBoolean152;

	@OriginalMember(owner = "client!es", name = "L", descriptor = "Z")
	private boolean aBoolean153;

	@OriginalMember(owner = "client!es", name = "n", descriptor = "Lclient!v;")
	private final Class362 aClass362_13 = new Class362();

	@OriginalMember(owner = "client!es", name = "F", descriptor = "I")
	private int anInt2428 = 256;

	@OriginalMember(owner = "client!es", name = "G", descriptor = "I")
	private int anInt2429 = 256;

	@OriginalMember(owner = "client!es", name = "J", descriptor = "I")
	private int anInt2432 = 0;

	@OriginalMember(owner = "client!es", name = "p", descriptor = "I")
	private final int anInt2413;

	@OriginalMember(owner = "client!es", name = "<init>", descriptor = "(I)V")
	public Class6_Sub8_Sub2(@OriginalArg(0) int arg0) {
		this.anInt2413 = arg0;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(ZI)V")
	public synchronized void method2078(@OriginalArg(0) boolean arg0) {
		this.aBoolean153 = arg0;
	}

	@OriginalMember(owner = "client!es", name = "b", descriptor = "(I)D")
	public synchronized double method2079() {
		if (this.anInt2432 < 1) {
			return -1.0D;
		} else {
			@Pc(17) Class6_Sub4_Sub2 local17 = (Class6_Sub4_Sub2) this.aClass362_13.method8538();
			return local17 == null ? -1.0D : (double) -((float) local17.aShortArrayArray3[0].length / (float) Static328.anInt8868) + local17.aDouble21;
		}
	}

	@OriginalMember(owner = "client!es", name = "d", descriptor = "()I")
	@Override
	public int method9125() {
		return 1;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "()Lclient!qp;")
	@Override
	public Class6_Sub8 method9121() {
		return null;
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "(I)Lclient!bu;")
	private synchronized Class6_Sub4_Sub2 method2080() {
		return (Class6_Sub4_Sub2) this.aClass362_13.method8538();
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(II)V")
	public void method2081(@OriginalArg(1) int arg0) {
		this.anInt2428 = arg0;
		this.anInt2429 = arg0;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(B)V")
	public synchronized void method2083() {
		this.aBoolean152 = true;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(DIZ)Lclient!bu;")
	public Class6_Sub4_Sub2 method2084(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1) {
		@Pc(16) long local16 = (long) (this.anInt2413 << 0 | arg1);
		@Pc(22) Class6_Sub4_Sub2 local22 = (Class6_Sub4_Sub2) Static496.aClass189_7.method4279(local16);
		if (local22 == null) {
			local22 = new Class6_Sub4_Sub2(new short[this.anInt2413][arg1], arg0);
		} else {
			local22.aDouble21 = arg0;
			Static496.aClass189_7.method4277(local16);
		}
		return local22;
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(Lclient!bu;B)V")
	public synchronized void method2085(@OriginalArg(0) Class6_Sub4_Sub2 arg0) {
		while (this.anInt2432 >= 100) {
			this.aClass362_13.method8531();
			this.anInt2432--;
		}
		this.aClass362_13.method8536(arg0);
		this.anInt2432++;
	}

	@OriginalMember(owner = "client!es", name = "c", descriptor = "()Lclient!qp;")
	@Override
	public Class6_Sub8 method9124() {
		return null;
	}

	@OriginalMember(owner = "client!es", name = "g", descriptor = "(I)V")
	private synchronized void method2086() {
		@Pc(9) Class6_Sub4_Sub2 local9 = this.method2080();
		if (local9 != null) {
			local9.method9174();
			this.anInt2427 = 0;
			this.anInt2432--;
			Static496.aClass189_7.method4278(local9, local9.method1100());
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method9119(@OriginalArg(0) int arg0) {
		if (this.aBoolean153) {
			return;
		}
		while (true) {
			@Pc(11) Class6_Sub4_Sub2 local11 = this.method2080();
			if (local11 == null) {
				if (this.aBoolean152) {
					this.method9174();
					Static496.aClass189_7.method4280();
				}
				return;
			}
			if (arg0 < local11.aShortArrayArray3[0].length - this.anInt2427) {
				this.anInt2427 += arg0;
				return;
			}
			arg0 -= local11.aShortArrayArray3[0].length - this.anInt2427;
			this.method2086();
		}
	}

	@OriginalMember(owner = "client!es", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method9120(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean153) {
			return;
		}
		if (this.method2080() != null) {
			@Pc(27) int local27 = arg2 + arg1;
			if (Static555.aBoolean676) {
				local27 <<= 0x1;
			}
			@Pc(37) byte local37 = 0;
			if (this.anInt2413 == 2) {
				local37 = 1;
			}
			while (local27 > arg1) {
				@Pc(51) Class6_Sub4_Sub2 local51 = this.method2080();
				if (local51 == null) {
					return;
				}
				@Pc(57) short[][] local57 = local51.aShortArrayArray3;
				while (arg1 < local27 && local57[0].length > this.anInt2427) {
					if (Static555.aBoolean676) {
						arg0[arg1++] = local57[0][this.anInt2427] * this.anInt2429;
						arg0[arg1++] = this.anInt2428 * local57[local37][this.anInt2427];
					} else {
						@Pc(63) int local63 = arg1++;
						arg0[local63] += local57[local37][this.anInt2427] * this.anInt2428 + this.anInt2429 * local57[0][this.anInt2427];
					}
					this.anInt2427++;
				}
				if (this.anInt2427 >= local57[0].length) {
					this.method2086();
				}
			}
		} else if (this.aBoolean152) {
			this.method9174();
			Static496.aClass189_7.method4280();
		}
	}

	@OriginalMember(owner = "client!es", name = "h", descriptor = "(I)I")
	public synchronized int method2088() {
		return this.anInt2432;
	}
}
