import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fr")
public final class Class2_Sub26_Sub2 extends Class2_Sub26 {

	@OriginalMember(owner = "client!fr", name = "M", descriptor = "Z")
	private boolean aBoolean277;

	@OriginalMember(owner = "client!fr", name = "S", descriptor = "Z")
	private boolean aBoolean278;

	@OriginalMember(owner = "client!fr", name = "V", descriptor = "I")
	private int anInt3645;

	@OriginalMember(owner = "client!fr", name = "I", descriptor = "Lclient!ow;")
	private final Class271 aClass271_24 = new Class271();

	@OriginalMember(owner = "client!fr", name = "L", descriptor = "I")
	private int anInt3639 = 256;

	@OriginalMember(owner = "client!fr", name = "Q", descriptor = "I")
	private int anInt3643 = 256;

	@OriginalMember(owner = "client!fr", name = "P", descriptor = "I")
	private int anInt3642 = 0;

	@OriginalMember(owner = "client!fr", name = "s", descriptor = "I")
	private final int anInt3625;

	@OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(I)V")
	public Class2_Sub26_Sub2(@OriginalArg(0) int arg0) {
		this.anInt3625 = arg0;
	}

	@OriginalMember(owner = "client!fr", name = "f", descriptor = "(I)Lclient!vj;")
	private synchronized Class2_Sub1_Sub21 method3381() {
		return (Class2_Sub1_Sub21) this.aClass271_24.method7177();
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)V")
	public void method3382(@OriginalArg(0) int arg0) {
		this.anInt3639 = arg0;
		this.anInt3643 = arg0;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method9759(@OriginalArg(0) int arg0) {
		if (this.aBoolean277) {
			return;
		}
		while (true) {
			@Pc(11) Class2_Sub1_Sub21 local11 = this.method3381();
			if (local11 == null) {
				if (this.aBoolean278) {
					this.method9825();
					Static266.aClass42_3.method1172();
				}
				return;
			}
			if (local11.aShortArrayArray22[0].length - this.anInt3645 > arg0) {
				this.anInt3645 += arg0;
				return;
			}
			arg0 -= local11.aShortArrayArray22[0].length - this.anInt3645;
			this.method3389();
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)I")
	public synchronized int method3385() {
		return this.anInt3642;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "()I")
	@Override
	public int method9756() {
		return 1;
	}

	@OriginalMember(owner = "client!fr", name = "g", descriptor = "(I)V")
	public synchronized void method3386() {
		this.aBoolean278 = true;
	}

	@OriginalMember(owner = "client!fr", name = "h", descriptor = "(I)D")
	public synchronized double method3387() {
		if (this.anInt3642 < 1) {
			return -1.0D;
		} else {
			@Pc(23) Class2_Sub1_Sub21 local23 = (Class2_Sub1_Sub21) this.aClass271_24.method7177();
			return local23 == null ? -1.0D : (double) -((float) local23.aShortArrayArray22[0].length / (float) Static237.anInt4718) + local23.aDouble29;
		}
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method9760(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean277) {
			return;
		}
		if (this.method3381() != null) {
			@Pc(28) int local28 = arg1 + arg2;
			if (Static41.aBoolean53) {
				local28 <<= 0x1;
			}
			@Pc(38) byte local38 = 0;
			if (this.anInt3625 == 2) {
				local38 = 1;
			}
			while (local28 > arg1) {
				@Pc(52) Class2_Sub1_Sub21 local52 = this.method3381();
				if (local52 == null) {
					return;
				}
				@Pc(58) short[][] local58 = local52.aShortArrayArray22;
				while (local28 > arg1 && local58[0].length > this.anInt3645) {
					if (Static41.aBoolean53) {
						arg0[arg1++] = this.anInt3639 * local58[0][this.anInt3645];
						arg0[arg1++] = local58[local38][this.anInt3645] * this.anInt3643;
					} else {
						@Pc(64) int local64 = arg1++;
						arg0[local64] += this.anInt3643 * local58[local38][this.anInt3645] + this.anInt3639 * local58[0][this.anInt3645];
					}
					this.anInt3645++;
				}
				if (local58[0].length <= this.anInt3645) {
					this.method3389();
				}
			}
		} else if (this.aBoolean278) {
			this.method9825();
			Static266.aClass42_3.method1172();
		}
	}

	@OriginalMember(owner = "client!fr", name = "c", descriptor = "()Lclient!fja;")
	@Override
	public Class2_Sub26 method9758() {
		return null;
	}

	@OriginalMember(owner = "client!fr", name = "d", descriptor = "()Lclient!fja;")
	@Override
	public Class2_Sub26 method9761() {
		return null;
	}

	@OriginalMember(owner = "client!fr", name = "b", descriptor = "(B)V")
	private synchronized void method3389() {
		@Pc(16) Class2_Sub1_Sub21 local16 = this.method3381();
		if (local16 != null) {
			local16.method9825();
			this.anInt3645 = 0;
			this.anInt3642--;
			Static266.aClass42_3.method1175(local16, local16.method9383());
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(DII)Lclient!vj;")
	public Class2_Sub1_Sub21 method3390(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1) {
		@Pc(16) long local16 = (long) (arg1 | this.anInt3625 << 0);
		@Pc(22) Class2_Sub1_Sub21 local22 = (Class2_Sub1_Sub21) Static266.aClass42_3.method1177(local16);
		if (local22 == null) {
			local22 = new Class2_Sub1_Sub21(new short[this.anInt3625][arg1], arg0);
		} else {
			local22.aDouble29 = arg0;
			Static266.aClass42_3.method1176(local16);
		}
		return local22;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!vj;B)V")
	public synchronized void method3391(@OriginalArg(0) Class2_Sub1_Sub21 arg0) {
		while (this.anInt3642 >= 100) {
			this.aClass271_24.method7172();
			this.anInt3642--;
		}
		this.aClass271_24.method7174(arg0);
		this.anInt3642++;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(BZ)V")
	public synchronized void method3392(@OriginalArg(1) boolean arg0) {
		this.aBoolean277 = arg0;
	}
}
