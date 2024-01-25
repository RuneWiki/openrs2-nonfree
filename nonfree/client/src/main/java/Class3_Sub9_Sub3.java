import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lja")
public final class Class3_Sub9_Sub3 extends Class3_Sub9 {

	@OriginalMember(owner = "client!lja", name = "G", descriptor = "I")
	private int anInt6188;

	@OriginalMember(owner = "client!lja", name = "H", descriptor = "Z")
	private boolean aBoolean476;

	@OriginalMember(owner = "client!lja", name = "K", descriptor = "Z")
	private boolean aBoolean477;

	@OriginalMember(owner = "client!lja", name = "q", descriptor = "Lclient!jia;")
	private final Class193 aClass193_30 = new Class193();

	@OriginalMember(owner = "client!lja", name = "F", descriptor = "I")
	private int anInt6187 = 256;

	@OriginalMember(owner = "client!lja", name = "D", descriptor = "I")
	private int anInt6185 = 0;

	@OriginalMember(owner = "client!lja", name = "J", descriptor = "I")
	private int anInt6190 = 256;

	@OriginalMember(owner = "client!lja", name = "y", descriptor = "I")
	private final int anInt6181;

	@OriginalMember(owner = "client!lja", name = "<init>", descriptor = "(I)V")
	public Class3_Sub9_Sub3(@OriginalArg(0) int arg0) {
		this.anInt6181 = arg0;
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(IDI)Lclient!cha;")
	public Class3_Sub6_Sub6 method5182(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1) {
		@Pc(11) long local11 = (long) (this.anInt6181 << 0 | arg0);
		@Pc(17) Class3_Sub6_Sub6 local17 = (Class3_Sub6_Sub6) Static485.aClass30_4.method1092(local11);
		if (local17 == null) {
			local17 = new Class3_Sub6_Sub6(new short[this.anInt6181][arg0], arg1);
		} else {
			local17.aDouble11 = arg1;
			Static485.aClass30_4.method1090(local11);
		}
		return local17;
	}

	@OriginalMember(owner = "client!lja", name = "b", descriptor = "(I)D")
	public synchronized double method5183() {
		if (this.anInt6185 < 1) {
			return -1.0D;
		} else {
			@Pc(21) Class3_Sub6_Sub6 local21 = (Class3_Sub6_Sub6) this.aClass193_30.method4457();
			return local21 == null ? -1.0D : (double) -((float) local21.aShortArrayArray3[0].length / (float) Static656.anInt1392) + local21.aDouble11;
		}
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(ILclient!cha;)V")
	public synchronized void method5184(@OriginalArg(1) Class3_Sub6_Sub6 arg0) {
		while (this.anInt6185 >= 100) {
			this.aClass193_30.method4452();
			this.anInt6185--;
		}
		this.aClass193_30.method4462(arg0);
		this.anInt6185++;
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(B)V")
	private synchronized void method5186() {
		@Pc(7) Class3_Sub6_Sub6 local7 = this.method5190();
		if (local7 != null) {
			local7.method8770();
			this.anInt6188 = 0;
			this.anInt6185--;
			Static485.aClass30_4.method1094(local7, local7.method1635());
		}
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(Z)V")
	public synchronized void method5187() {
		this.aBoolean476 = true;
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "()Lclient!ri;")
	@Override
	public Class3_Sub9 method6696() {
		return null;
	}

	@OriginalMember(owner = "client!lja", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method6702(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean477) {
			return;
		}
		if (this.method5190() != null) {
			@Pc(27) int local27 = arg2 + arg1;
			if (Static293.aBoolean421) {
				local27 <<= 0x1;
			}
			@Pc(37) byte local37 = 0;
			if (this.anInt6181 == 2) {
				local37 = 1;
			}
			while (arg1 < local27) {
				@Pc(49) Class3_Sub6_Sub6 local49 = this.method5190();
				if (local49 == null) {
					return;
				}
				@Pc(55) short[][] local55 = local49.aShortArrayArray3;
				while (arg1 < local27 && this.anInt6188 < local55[0].length) {
					if (Static293.aBoolean421) {
						arg0[arg1++] = this.anInt6187 * local55[0][this.anInt6188];
						arg0[arg1++] = local55[local37][this.anInt6188] * this.anInt6190;
					} else {
						@Pc(89) int local89 = arg1++;
						arg0[local89] += local55[local37][this.anInt6188] * this.anInt6190 + this.anInt6187 * local55[0][this.anInt6188];
					}
					this.anInt6188++;
				}
				if (local55[0].length <= this.anInt6188) {
					this.method5186();
				}
			}
		} else if (this.aBoolean476) {
			this.method8770();
			Static485.aClass30_4.method1095();
		}
	}

	@OriginalMember(owner = "client!lja", name = "f", descriptor = "(I)I")
	public synchronized int method5188() {
		return this.anInt6185;
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(BZ)V")
	public synchronized void method5189(@OriginalArg(1) boolean arg0) {
		this.aBoolean477 = arg0;
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6701(@OriginalArg(0) int arg0) {
		if (this.aBoolean477) {
			return;
		}
		while (true) {
			@Pc(11) Class3_Sub6_Sub6 local11 = this.method5190();
			if (local11 == null) {
				if (this.aBoolean476) {
					this.method8770();
					Static485.aClass30_4.method1095();
				}
				return;
			}
			if (arg0 < local11.aShortArrayArray3[0].length - this.anInt6188) {
				this.anInt6188 += arg0;
				return;
			}
			arg0 -= local11.aShortArrayArray3[0].length - this.anInt6188;
			this.method5186();
		}
	}

	@OriginalMember(owner = "client!lja", name = "c", descriptor = "()I")
	@Override
	public int method6699() {
		return 1;
	}

	@OriginalMember(owner = "client!lja", name = "g", descriptor = "(I)Lclient!cha;")
	private synchronized Class3_Sub6_Sub6 method5190() {
		return (Class3_Sub6_Sub6) this.aClass193_30.method4457();
	}

	@OriginalMember(owner = "client!lja", name = "a", descriptor = "(II)V")
	public void method5191(@OriginalArg(1) int arg0) {
		this.anInt6190 = arg0;
		this.anInt6187 = arg0;
	}

	@OriginalMember(owner = "client!lja", name = "d", descriptor = "()Lclient!ri;")
	@Override
	public Class3_Sub9 method6700() {
		return null;
	}
}
