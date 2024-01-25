import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!he")
public final class Class8_Sub16_Sub2 extends Class8_Sub16 {

	@OriginalMember(owner = "client!he", name = "J", descriptor = "Z")
	private boolean aBoolean334;

	@OriginalMember(owner = "client!he", name = "K", descriptor = "I")
	private int anInt4581;

	@OriginalMember(owner = "client!he", name = "L", descriptor = "Z")
	private boolean aBoolean335;

	@OriginalMember(owner = "client!he", name = "x", descriptor = "Lclient!bq;")
	private final Class43 aClass43_26 = new Class43();

	@OriginalMember(owner = "client!he", name = "N", descriptor = "I")
	private int anInt4582 = 0;

	@OriginalMember(owner = "client!he", name = "H", descriptor = "I")
	private int anInt4579 = 256;

	@OriginalMember(owner = "client!he", name = "I", descriptor = "I")
	private int anInt4580 = 256;

	@OriginalMember(owner = "client!he", name = "D", descriptor = "I")
	private final int anInt4577;

	@OriginalMember(owner = "client!he", name = "<init>", descriptor = "(I)V")
	public Class8_Sub16_Sub2(@OriginalArg(0) int arg0) {
		this.anInt4577 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(Z)D")
	public synchronized double method3684() {
		if (this.anInt4582 < 1) {
			return -1.0D;
		} else {
			@Pc(17) Class8_Sub5_Sub10 local17 = (Class8_Sub5_Sub10) this.aClass43_26.method1422();
			return local17 == null ? -1.0D : (double) -((float) local17.aShortArrayArray9[0].length / (float) Static345.anInt6689) + local17.aDouble13;
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
	public synchronized void method3685() {
		this.aBoolean335 = true;
	}

	@OriginalMember(owner = "client!he", name = "f", descriptor = "(I)V")
	private synchronized void method3686() {
		@Pc(7) Class8_Sub5_Sub10 local7 = this.method3689();
		if (local7 != null) {
			local7.method8640();
			this.anInt4581 = 0;
			this.anInt4582--;
			Static233.aClass159_3.method4549(local7.method5407(), local7);
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "()Lclient!eia;")
	@Override
	public Class8_Sub16 method7429() {
		return null;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)V")
	public synchronized void method3688(@OriginalArg(1) boolean arg0) {
		this.aBoolean334 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "g", descriptor = "(I)Lclient!mda;")
	private synchronized Class8_Sub5_Sub10 method3689() {
		return (Class8_Sub5_Sub10) this.aClass43_26.method1422();
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(II)V")
	public void method3690(@OriginalArg(0) int arg0) {
		this.anInt4579 = arg0;
		this.anInt4580 = arg0;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(BLclient!mda;)V")
	public synchronized void method3691(@OriginalArg(1) Class8_Sub5_Sub10 arg0) {
		while (this.anInt4582 >= 100) {
			this.aClass43_26.method1432();
			this.anInt4582--;
		}
		this.aClass43_26.method1424(arg0);
		this.anInt4582++;
	}

	@OriginalMember(owner = "client!he", name = "h", descriptor = "(I)I")
	public synchronized int method3692() {
		return this.anInt4582;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IBD)Lclient!mda;")
	public Class8_Sub5_Sub10 method3693(@OriginalArg(0) int arg0, @OriginalArg(2) double arg1) {
		@Pc(17) long local17 = (long) (arg0 | this.anInt4577 << 0);
		@Pc(23) Class8_Sub5_Sub10 local23 = (Class8_Sub5_Sub10) Static233.aClass159_3.method4551(local17);
		if (local23 == null) {
			local23 = new Class8_Sub5_Sub10(new short[this.anInt4577][arg0], arg1);
		} else {
			local23.aDouble13 = arg1;
			Static233.aClass159_3.method4550(local17);
		}
		return local23;
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7435(@OriginalArg(0) int arg0) {
		if (this.aBoolean334) {
			return;
		}
		while (true) {
			@Pc(11) Class8_Sub5_Sub10 local11 = this.method3689();
			if (local11 == null) {
				if (this.aBoolean335) {
					this.method8640();
					Static233.aClass159_3.method4548();
				}
				return;
			}
			if (local11.aShortArrayArray9[0].length - this.anInt4581 > arg0) {
				this.anInt4581 += arg0;
				return;
			}
			arg0 -= local11.aShortArrayArray9[0].length - this.anInt4581;
			this.method3686();
		}
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method7430(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean334) {
			return;
		}
		if (this.method3689() != null) {
			@Pc(28) int local28 = arg1 + arg2;
			if (Static343.aBoolean463) {
				local28 <<= 0x1;
			}
			@Pc(38) byte local38 = 0;
			if (this.anInt4577 == 2) {
				local38 = 1;
			}
			while (local28 > arg1) {
				@Pc(52) Class8_Sub5_Sub10 local52 = this.method3689();
				if (local52 == null) {
					return;
				}
				@Pc(58) short[][] local58 = local52.aShortArrayArray9;
				while (local28 > arg1 && this.anInt4581 < local58[0].length) {
					if (Static343.aBoolean463) {
						arg0[arg1++] = local58[0][this.anInt4581] * this.anInt4580;
						arg0[arg1++] = this.anInt4579 * local58[local38][this.anInt4581];
					} else {
						@Pc(92) int local92 = arg1++;
						arg0[local92] += this.anInt4579 * local58[local38][this.anInt4581] + local58[0][this.anInt4581] * this.anInt4580;
					}
					this.anInt4581++;
				}
				if (local58[0].length <= this.anInt4581) {
					this.method3686();
				}
			}
		} else if (this.aBoolean335) {
			this.method8640();
			Static233.aClass159_3.method4548();
		}
	}

	@OriginalMember(owner = "client!he", name = "b", descriptor = "()I")
	@Override
	public int method7431() {
		return 1;
	}

	@OriginalMember(owner = "client!he", name = "d", descriptor = "()Lclient!eia;")
	@Override
	public Class8_Sub16 method7434() {
		return null;
	}
}
