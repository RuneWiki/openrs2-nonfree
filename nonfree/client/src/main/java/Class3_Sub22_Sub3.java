import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pp")
public final class Class3_Sub22_Sub3 extends Class3_Sub22 {

	@OriginalMember(owner = "client!pp", name = "F", descriptor = "Z")
	private boolean aBoolean638;

	@OriginalMember(owner = "client!pp", name = "H", descriptor = "I")
	private int anInt8567;

	@OriginalMember(owner = "client!pp", name = "o", descriptor = "Z")
	private boolean aBoolean640;

	@OriginalMember(owner = "client!pp", name = "D", descriptor = "Lclient!tj;")
	private final Class357 aClass357_51 = new Class357();

	@OriginalMember(owner = "client!pp", name = "x", descriptor = "I")
	private int anInt8561 = 256;

	@OriginalMember(owner = "client!pp", name = "s", descriptor = "I")
	private int anInt8564 = 256;

	@OriginalMember(owner = "client!pp", name = "I", descriptor = "I")
	private int anInt8573 = 0;

	@OriginalMember(owner = "client!pp", name = "y", descriptor = "I")
	private final int anInt8555;

	@OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(I)V")
	public Class3_Sub22_Sub3(@OriginalArg(0) int arg0) {
		this.anInt8555 = arg0;
	}

	@OriginalMember(owner = "client!pp", name = "d", descriptor = "()Lclient!fga;")
	@Override
	public Class3_Sub22 method9305() {
		return null;
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "()I")
	@Override
	public int method9307() {
		return 1;
	}

	@OriginalMember(owner = "client!pp", name = "c", descriptor = "()Lclient!fga;")
	@Override
	public Class3_Sub22 method9303() {
		return null;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)D")
	public synchronized double method7185() {
		if (this.anInt8573 < 1) {
			return -1.0D;
		} else {
			@Pc(24) Class3_Sub4_Sub12 local24 = (Class3_Sub4_Sub12) this.aClass357_51.method8391();
			return local24 == null ? -1.0D : (double) -((float) local24.aShortArrayArray3[0].length / (float) Static103.anInt1658) + local24.aDouble17;
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(I)Lclient!ida;")
	private synchronized Class3_Sub4_Sub12 method7186() {
		return (Class3_Sub4_Sub12) this.aClass357_51.method8391();
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IZ)V")
	public synchronized void method7187(@OriginalArg(1) boolean arg0) {
		this.aBoolean638 = arg0;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IDI)Lclient!ida;")
	public Class3_Sub4_Sub12 method7188(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1) {
		@Pc(17) long local17 = (long) (this.anInt8555 << 0 | arg0);
		@Pc(23) Class3_Sub4_Sub12 local23 = (Class3_Sub4_Sub12) Static679.aClass13_4.method324(local17);
		if (local23 == null) {
			local23 = new Class3_Sub4_Sub12(new short[this.anInt8555][arg0], arg1);
		} else {
			local23.aDouble17 = arg1;
			Static679.aClass13_4.method321(local17);
		}
		return local23;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZLclient!ida;)V")
	public synchronized void method7189(@OriginalArg(1) Class3_Sub4_Sub12 arg0) {
		while (this.anInt8573 >= 100) {
			this.aClass357_51.method8398();
			this.anInt8573--;
		}
		if (true) {
			this.aClass357_51.method8401(arg0);
			this.anInt8573++;
		}
	}

	@OriginalMember(owner = "client!pp", name = "e", descriptor = "(I)I")
	public synchronized int method7190() {
		return this.anInt8573;
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(IB)V")
	public void method7191(@OriginalArg(0) int arg0) {
		this.anInt8564 = arg0;
		this.anInt8561 = arg0;
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "(B)V")
	public synchronized void method7192() {
		this.aBoolean640 = true;
	}

	@OriginalMember(owner = "client!pp", name = "f", descriptor = "(I)V")
	private synchronized void method7193() {
		@Pc(7) Class3_Sub4_Sub12 local7 = this.method7186();
		if (local7 != null) {
			local7.method9446();
			this.anInt8573--;
			this.anInt8567 = 0;
			Static679.aClass13_4.method322(local7, local7.method4092());
		}
	}

	@OriginalMember(owner = "client!pp", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method9302(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean638) {
			return;
		}
		if (this.method7186() != null) {
			@Pc(32) int local32 = arg2 + arg1;
			if (Static510.aBoolean777) {
				local32 <<= 0x1;
			}
			@Pc(42) byte local42 = 0;
			if (this.anInt8555 == 2) {
				local42 = 1;
			}
			while (arg1 < local32) {
				@Pc(56) Class3_Sub4_Sub12 local56 = this.method7186();
				if (local56 == null) {
					return;
				}
				@Pc(62) short[][] local62 = local56.aShortArrayArray3;
				while (local32 > arg1 && local62[0].length > this.anInt8567) {
					if (Static510.aBoolean777) {
						arg0[arg1++] = this.anInt8564 * local62[0][this.anInt8567];
						arg0[arg1++] = local62[local42][this.anInt8567] * this.anInt8561;
					} else {
						@Pc(70) int local70 = arg1++;
						arg0[local70] += this.anInt8564 * local62[0][this.anInt8567] + this.anInt8561 * local62[local42][this.anInt8567];
					}
					this.anInt8567++;
				}
				if (this.anInt8567 >= local62[0].length) {
					this.method7193();
				}
			}
		} else if (this.aBoolean640) {
			this.method9446();
			Static679.aClass13_4.method318();
		}
	}

	@OriginalMember(owner = "client!pp", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method9304(@OriginalArg(0) int arg0) {
		if (this.aBoolean638) {
			return;
		}
		while (true) {
			@Pc(14) Class3_Sub4_Sub12 local14 = this.method7186();
			if (local14 == null) {
				if (this.aBoolean640) {
					this.method9446();
					Static679.aClass13_4.method318();
				}
				return;
			}
			if (local14.aShortArrayArray3[0].length - this.anInt8567 > arg0) {
				this.anInt8567 += arg0;
				return;
			}
			arg0 -= local14.aShortArrayArray3[0].length - this.anInt8567;
			this.method7193();
		}
	}
}
