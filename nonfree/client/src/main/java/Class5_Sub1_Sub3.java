import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sfa")
public final class Class5_Sub1_Sub3 extends Class5_Sub1 {

	@OriginalMember(owner = "client!sfa", name = "I", descriptor = "Z")
	private boolean aBoolean651;

	@OriginalMember(owner = "client!sfa", name = "J", descriptor = "I")
	private int anInt8831;

	@OriginalMember(owner = "client!sfa", name = "P", descriptor = "Z")
	private boolean aBoolean652;

	@OriginalMember(owner = "client!sfa", name = "w", descriptor = "Lclient!tg;")
	private final Class330 aClass330_56 = new Class330();

	@OriginalMember(owner = "client!sfa", name = "O", descriptor = "I")
	private int anInt8836 = 0;

	@OriginalMember(owner = "client!sfa", name = "L", descriptor = "I")
	private int anInt8833 = 256;

	@OriginalMember(owner = "client!sfa", name = "M", descriptor = "I")
	private int anInt8834 = 256;

	@OriginalMember(owner = "client!sfa", name = "E", descriptor = "I")
	private final int anInt8827;

	@OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(I)V")
	public Class5_Sub1_Sub3(@OriginalArg(0) int arg0) {
		this.anInt8827 = arg0;
	}

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "(I)V")
	private synchronized void method7605() {
		@Pc(7) Class5_Sub5_Sub9 local7 = this.method7613();
		if (local7 != null) {
			local7.method9047();
			this.anInt8831 = 0;
			this.anInt8836--;
			Static530.aClass232_10.method5129(local7, local7.method2914());
		}
	}

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "(II)V")
	public void method7606(@OriginalArg(1) int arg0) {
		this.anInt8834 = arg0;
		this.anInt8833 = arg0;
	}

	@OriginalMember(owner = "client!sfa", name = "c", descriptor = "()Lclient!aca;")
	@Override
	public Class5_Sub1 method8285() {
		return null;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(BZ)V")
	public synchronized void method7607(@OriginalArg(1) boolean arg0) {
		this.aBoolean652 = arg0;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "()Lclient!aca;")
	@Override
	public Class5_Sub1 method8282() {
		return null;
	}

	@OriginalMember(owner = "client!sfa", name = "b", descriptor = "()I")
	@Override
	public int method8284() {
		return 1;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IID)Lclient!gv;")
	public Class5_Sub5_Sub9 method7609(@OriginalArg(1) int arg0, @OriginalArg(2) double arg1) {
		@Pc(17) long local17 = (long) (arg0 | this.anInt8827 << 0);
		@Pc(25) Class5_Sub5_Sub9 local25 = (Class5_Sub5_Sub9) Static530.aClass232_10.method5128(local17);
		if (local25 == null) {
			local25 = new Class5_Sub5_Sub9(new short[this.anInt8827][arg0], arg1);
		} else {
			local25.aDouble9 = arg1;
			Static530.aClass232_10.method5127(local17);
		}
		return local25;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8287(@OriginalArg(0) int arg0) {
		if (this.aBoolean652) {
			return;
		}
		while (true) {
			@Pc(11) Class5_Sub5_Sub9 local11 = this.method7613();
			if (local11 == null) {
				if (this.aBoolean651) {
					this.method9047();
					Static530.aClass232_10.method5130();
				}
				return;
			}
			if (arg0 < local11.aShortArrayArray7[0].length - this.anInt8831) {
				this.anInt8831 += arg0;
				return;
			}
			arg0 -= local11.aShortArrayArray7[0].length - this.anInt8831;
			this.method7605();
		}
	}

	@OriginalMember(owner = "client!sfa", name = "f", descriptor = "(I)D")
	public synchronized double method7610() {
		if (this.anInt8836 < 1) {
			return -1.0D;
		} else {
			@Pc(21) Class5_Sub5_Sub9 local21 = (Class5_Sub5_Sub9) this.aClass330_56.method7908();
			return local21 == null ? -1.0D : local21.aDouble9 - (double) ((float) local21.aShortArrayArray7[0].length / (float) Static491.anInt8290);
		}
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(ILclient!gv;)V")
	public synchronized void method7611(@OriginalArg(1) Class5_Sub5_Sub9 arg0) {
		while (this.anInt8836 >= 100) {
			this.aClass330_56.method7911();
			this.anInt8836--;
		}
		this.aClass330_56.method7917(arg0);
		this.anInt8836++;
	}

	@OriginalMember(owner = "client!sfa", name = "g", descriptor = "(I)I")
	public synchronized int method7612() {
		return this.anInt8836;
	}

	@OriginalMember(owner = "client!sfa", name = "h", descriptor = "(I)Lclient!gv;")
	private synchronized Class5_Sub5_Sub9 method7613() {
		return (Class5_Sub5_Sub9) this.aClass330_56.method7908();
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Z)V")
	public synchronized void method7614() {
		this.aBoolean651 = true;
	}

	@OriginalMember(owner = "client!sfa", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method8283(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean652) {
			return;
		}
		if (this.method7613() != null) {
			@Pc(27) int local27 = arg2 + arg1;
			if (Static21.aBoolean12) {
				local27 <<= 0x1;
			}
			@Pc(37) byte local37 = 0;
			if (this.anInt8827 == 2) {
				local37 = 1;
			}
			while (local27 > arg1) {
				@Pc(49) Class5_Sub5_Sub9 local49 = this.method7613();
				if (local49 == null) {
					return;
				}
				@Pc(55) short[][] local55 = local49.aShortArrayArray7;
				while (local27 > arg1 && this.anInt8831 < local55[0].length) {
					if (Static21.aBoolean12) {
						arg0[arg1++] = local55[0][this.anInt8831] * this.anInt8833;
						arg0[arg1++] = local55[local37][this.anInt8831] * this.anInt8834;
					} else {
						@Pc(61) int local61 = arg1++;
						arg0[local61] += this.anInt8834 * local55[local37][this.anInt8831] + local55[0][this.anInt8831] * this.anInt8833;
					}
					this.anInt8831++;
				}
				if (local55[0].length <= this.anInt8831) {
					this.method7605();
				}
			}
		} else if (this.aBoolean651) {
			this.method9047();
			Static530.aClass232_10.method5130();
		}
	}
}
