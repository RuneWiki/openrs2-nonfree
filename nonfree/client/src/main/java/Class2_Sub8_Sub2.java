import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iha")
public final class Class2_Sub8_Sub2 extends Class2_Sub8 {

	@OriginalMember(owner = "client!iha", name = "Q", descriptor = "I")
	private int anInt5210;

	@OriginalMember(owner = "client!iha", name = "R", descriptor = "Z")
	private boolean aBoolean382;

	@OriginalMember(owner = "client!iha", name = "T", descriptor = "Z")
	private boolean aBoolean383;

	@OriginalMember(owner = "client!iha", name = "t", descriptor = "Lclient!uh;")
	private final Class341 aClass341_40 = new Class341();

	@OriginalMember(owner = "client!iha", name = "S", descriptor = "I")
	private int anInt5211 = 256;

	@OriginalMember(owner = "client!iha", name = "U", descriptor = "I")
	private int anInt5212 = 256;

	@OriginalMember(owner = "client!iha", name = "V", descriptor = "I")
	private int anInt5213 = 0;

	@OriginalMember(owner = "client!iha", name = "M", descriptor = "I")
	private final int anInt5206;

	@OriginalMember(owner = "client!iha", name = "<init>", descriptor = "(I)V")
	public Class2_Sub8_Sub2(@OriginalArg(0) int arg0) {
		this.anInt5206 = arg0;
	}

	@OriginalMember(owner = "client!iha", name = "c", descriptor = "(II)V")
	public void method4480(@OriginalArg(1) int arg0) {
		this.anInt5211 = arg0;
		this.anInt5212 = arg0;
	}

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "(I)Lclient!lm;")
	private synchronized Class2_Sub6_Sub15 method4481() {
		return (Class2_Sub6_Sub15) this.aClass341_40.method8524();
	}

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "()Lclient!jba;")
	@Override
	public Class2_Sub8 method8817() {
		return null;
	}

	@OriginalMember(owner = "client!iha", name = "d", descriptor = "(I)I")
	public synchronized int method4482() {
		return this.anInt5213;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(B)V")
	private synchronized void method4484() {
		@Pc(15) Class2_Sub6_Sub15 local15 = this.method4481();
		if (local15 != null) {
			local15.method9253();
			this.anInt5213--;
			this.anInt5210 = 0;
			Static304.aClass379_3.method9222(local15.method5657(), local15);
		}
	}

	@OriginalMember(owner = "client!iha", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8816(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean383) {
			return;
		}
		if (this.method4481() != null) {
			@Pc(28) int local28 = arg1 + arg2;
			if (Static600.aBoolean722) {
				local28 <<= 0x1;
			}
			@Pc(38) byte local38 = 0;
			if (this.anInt5206 == 2) {
				local38 = 1;
			}
			while (arg1 < local28) {
				@Pc(52) Class2_Sub6_Sub15 local52 = this.method4481();
				if (local52 == null) {
					return;
				}
				@Pc(58) short[][] local58 = local52.aShortArrayArray21;
				while (arg1 < local28 && this.anInt5210 < local58[0].length) {
					if (Static600.aBoolean722) {
						arg0[arg1++] = this.anInt5211 * local58[0][this.anInt5210];
						arg0[arg1++] = local58[local38][this.anInt5210] * this.anInt5212;
					} else {
						@Pc(92) int local92 = arg1++;
						arg0[local92] += local58[local38][this.anInt5210] * this.anInt5212 + this.anInt5211 * local58[0][this.anInt5210];
					}
					this.anInt5210++;
				}
				if (local58[0].length <= this.anInt5210) {
					this.method4484();
				}
			}
		} else if (this.aBoolean382) {
			this.method9253();
			Static304.aClass379_3.method9220();
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IZ)V")
	public synchronized void method4486(@OriginalArg(1) boolean arg0) {
		this.aBoolean383 = arg0;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(Lclient!lm;I)V")
	public synchronized void method4488(@OriginalArg(0) Class2_Sub6_Sub15 arg0) {
		while (this.anInt5213 >= 100) {
			this.aClass341_40.method8526();
			this.anInt5213--;
		}
		this.aClass341_40.method8528(arg0);
		this.anInt5213++;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "()Lclient!jba;")
	@Override
	public Class2_Sub8 method8815() {
		return null;
	}

	@OriginalMember(owner = "client!iha", name = "f", descriptor = "(I)V")
	public synchronized void method4489() {
		this.aBoolean382 = true;
	}

	@OriginalMember(owner = "client!iha", name = "g", descriptor = "(I)D")
	public synchronized double method4490() {
		if (this.anInt5213 < 1) {
			return -1.0D;
		} else {
			@Pc(21) Class2_Sub6_Sub15 local21 = (Class2_Sub6_Sub15) this.aClass341_40.method8524();
			return local21 == null ? -1.0D : (double) -((float) local21.aShortArrayArray21[0].length / (float) Static215.anInt4848) + local21.aDouble14;
		}
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(IDI)Lclient!lm;")
	public Class2_Sub6_Sub15 method4491(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1) {
		@Pc(11) long local11 = (long) (arg0 | this.anInt5206 << 0);
		@Pc(17) Class2_Sub6_Sub15 local17 = (Class2_Sub6_Sub15) Static304.aClass379_3.method9219(local11);
		if (local17 == null) {
			local17 = new Class2_Sub6_Sub15(new short[this.anInt5206][arg0], arg1);
		} else {
			local17.aDouble14 = arg1;
			Static304.aClass379_3.method9221(local11);
		}
		return local17;
	}

	@OriginalMember(owner = "client!iha", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8818(@OriginalArg(0) int arg0) {
		if (this.aBoolean383) {
			return;
		}
		while (true) {
			@Pc(11) Class2_Sub6_Sub15 local11 = this.method4481();
			if (local11 == null) {
				if (this.aBoolean382) {
					this.method9253();
					Static304.aClass379_3.method9220();
				}
				return;
			}
			if (arg0 < local11.aShortArrayArray21[0].length - this.anInt5210) {
				this.anInt5210 += arg0;
				return;
			}
			arg0 -= local11.aShortArrayArray21[0].length - this.anInt5210;
			this.method4484();
		}
	}

	@OriginalMember(owner = "client!iha", name = "d", descriptor = "()I")
	@Override
	public int method8820() {
		return 1;
	}
}
