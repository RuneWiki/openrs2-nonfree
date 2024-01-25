import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fea")
public final class Class3_Sub3_Sub2 extends Class3_Sub3 {

	@OriginalMember(owner = "client!fea", name = "F", descriptor = "Z")
	private boolean aBoolean226;

	@OriginalMember(owner = "client!fea", name = "J", descriptor = "Z")
	private boolean aBoolean227;

	@OriginalMember(owner = "client!fea", name = "R", descriptor = "I")
	private int anInt3032;

	@OriginalMember(owner = "client!fea", name = "v", descriptor = "Lclient!mba;")
	private final Class216 aClass216_27 = new Class216();

	@OriginalMember(owner = "client!fea", name = "H", descriptor = "I")
	private int anInt3026 = 256;

	@OriginalMember(owner = "client!fea", name = "K", descriptor = "I")
	private int anInt3027 = 0;

	@OriginalMember(owner = "client!fea", name = "L", descriptor = "I")
	private int anInt3028 = 256;

	@OriginalMember(owner = "client!fea", name = "y", descriptor = "I")
	private final int anInt3020;

	@OriginalMember(owner = "client!fea", name = "<init>", descriptor = "(I)V")
	public Class3_Sub3_Sub2(@OriginalArg(0) int arg0) {
		this.anInt3020 = arg0;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4678(@OriginalArg(0) int arg0) {
		if (this.aBoolean226) {
			return;
		}
		while (true) {
			@Pc(11) Class3_Sub7_Sub11 local11 = this.method2566();
			if (local11 == null) {
				if (this.aBoolean227) {
					this.method8682();
					Static110.aClass282_1.method6851();
				}
				return;
			}
			if (local11.aShortArrayArray4[0].length - this.anInt3032 > arg0) {
				this.anInt3032 += arg0;
				return;
			}
			arg0 -= local11.aShortArrayArray4[0].length - this.anInt3032;
			this.method2570();
		}
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method4677(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean226) {
			return;
		}
		if (this.method2566() != null) {
			@Pc(28) int local28 = arg1 + arg2;
			if (Static411.aBoolean570) {
				local28 <<= 0x1;
			}
			@Pc(38) byte local38 = 0;
			if (this.anInt3020 == 2) {
				local38 = 1;
			}
			while (arg1 < local28) {
				@Pc(52) Class3_Sub7_Sub11 local52 = this.method2566();
				if (local52 == null) {
					return;
				}
				@Pc(58) short[][] local58 = local52.aShortArrayArray4;
				while (local28 > arg1 && this.anInt3032 < local58[0].length) {
					if (Static411.aBoolean570) {
						arg0[arg1++] = this.anInt3026 * local58[0][this.anInt3032];
						arg0[arg1++] = this.anInt3028 * local58[local38][this.anInt3032];
					} else {
						@Pc(64) int local64 = arg1++;
						arg0[local64] += this.anInt3026 * local58[0][this.anInt3032] + this.anInt3028 * local58[local38][this.anInt3032];
					}
					this.anInt3032++;
				}
				if (local58[0].length <= this.anInt3032) {
					this.method2570();
				}
			}
		} else if (this.aBoolean227) {
			this.method8682();
			Static110.aClass282_1.method6851();
		}
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(I)Lclient!hha;")
	private synchronized Class3_Sub7_Sub11 method2566() {
		return (Class3_Sub7_Sub11) this.aClass216_27.method5457();
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Z)D")
	public synchronized double method2567() {
		if (this.anInt3027 < 1) {
			return -1.0D;
		} else {
			@Pc(15) Class3_Sub7_Sub11 local15 = (Class3_Sub7_Sub11) this.aClass216_27.method5457();
			return local15 == null ? -1.0D : (double) -((float) local15.aShortArrayArray4[0].length / (float) Static168.anInt3272) + local15.aDouble7;
		}
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "()Lclient!co;")
	@Override
	public Class3_Sub3 method4680() {
		return null;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IDB)Lclient!hha;")
	public Class3_Sub7_Sub11 method2568(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1) {
		@Pc(11) long local11 = (long) (this.anInt3020 << 0 | arg0);
		@Pc(17) Class3_Sub7_Sub11 local17 = (Class3_Sub7_Sub11) Static110.aClass282_1.method6855(local11);
		if (local17 == null) {
			local17 = new Class3_Sub7_Sub11(new short[this.anInt3020][arg0], arg1);
		} else {
			local17.aDouble7 = arg1;
			Static110.aClass282_1.method6854(local11);
		}
		return local17;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(B)V")
	public synchronized void method2569() {
		this.aBoolean227 = true;
	}

	@OriginalMember(owner = "client!fea", name = "c", descriptor = "(I)V")
	private synchronized void method2570() {
		@Pc(15) Class3_Sub7_Sub11 local15 = this.method2566();
		if (local15 != null) {
			local15.method8682();
			this.anInt3032 = 0;
			this.anInt3027--;
			Static110.aClass282_1.method6850(local15, local15.method3284());
		}
	}

	@OriginalMember(owner = "client!fea", name = "c", descriptor = "()I")
	@Override
	public int method4681() {
		return 1;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(ZZ)V")
	public synchronized void method2571(@OriginalArg(1) boolean arg0) {
		this.aBoolean226 = arg0;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "()Lclient!co;")
	@Override
	public Class3_Sub3 method4679() {
		return null;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(Lclient!hha;B)V")
	public synchronized void method2574(@OriginalArg(0) Class3_Sub7_Sub11 arg0) {
		while (this.anInt3027 >= 100) {
			this.aClass216_27.method5462();
			this.anInt3027--;
		}
		this.aClass216_27.method5449(arg0);
		this.anInt3027++;
	}

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(IB)V")
	public void method2575(@OriginalArg(0) int arg0) {
		this.anInt3028 = arg0;
		this.anInt3026 = arg0;
	}

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "(B)I")
	public synchronized int method2576() {
		return this.anInt3027;
	}
}
