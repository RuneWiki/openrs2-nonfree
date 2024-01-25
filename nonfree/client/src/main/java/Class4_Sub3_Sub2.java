import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kb")
public final class Class4_Sub3_Sub2 extends Class4_Sub3 {

	@OriginalMember(owner = "client!kb", name = "J", descriptor = "Z")
	private boolean aBoolean352;

	@OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
	private int anInt4722;

	@OriginalMember(owner = "client!kb", name = "L", descriptor = "Z")
	private boolean aBoolean353;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "Lclient!ifa;")
	private final Class163 aClass163_26 = new Class163();

	@OriginalMember(owner = "client!kb", name = "H", descriptor = "I")
	private int anInt4720 = 256;

	@OriginalMember(owner = "client!kb", name = "G", descriptor = "I")
	private int anInt4719 = 256;

	@OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
	private int anInt4721 = 0;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
	private final int anInt4707;

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(I)V")
	public Class4_Sub3_Sub2(@OriginalArg(0) int arg0) {
		this.anInt4707 = arg0;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "()Lclient!oia;")
	@Override
	public Class4_Sub3 method7719() {
		return null;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)I")
	public synchronized int method4216() {
		return this.anInt4721;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "()Lclient!oia;")
	@Override
	public Class4_Sub3 method7720() {
		return null;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)V")
	public void method4217(@OriginalArg(1) int arg0) {
		this.anInt4720 = arg0;
		this.anInt4719 = arg0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!kka;Z)V")
	public synchronized void method4218(@OriginalArg(0) Class4_Sub5_Sub13 arg0) {
		while (this.anInt4721 >= 100) {
			this.aClass163_26.method3644();
			this.anInt4721--;
		}
		this.aClass163_26.method3646(arg0);
		this.anInt4721++;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7715(@OriginalArg(0) int arg0) {
		if (this.aBoolean353) {
			return;
		}
		while (true) {
			@Pc(11) Class4_Sub5_Sub13 local11 = this.method4226();
			if (local11 == null) {
				if (this.aBoolean352) {
					this.method9000();
					Static388.aClass300_3.method6605();
				}
				return;
			}
			if (arg0 < local11.aShortArrayArray11[0].length - this.anInt4722) {
				this.anInt4722 += arg0;
				return;
			}
			arg0 -= local11.aShortArrayArray11[0].length - this.anInt4722;
			this.method4221();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)V")
	private synchronized void method4221() {
		@Pc(7) Class4_Sub5_Sub13 local7 = this.method4226();
		if (local7 != null) {
			local7.method9000();
			this.anInt4721--;
			this.anInt4722 = 0;
			Static388.aClass300_3.method6600(local7.method4372(), local7);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IDB)Lclient!kka;")
	public Class4_Sub5_Sub13 method4222(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1) {
		@Pc(16) long local16 = (long) (arg0 | this.anInt4707 << 0);
		@Pc(22) Class4_Sub5_Sub13 local22 = (Class4_Sub5_Sub13) Static388.aClass300_3.method6604(local16);
		if (local22 == null) {
			local22 = new Class4_Sub5_Sub13(new short[this.anInt4707][arg0], arg1);
		} else {
			local22.aDouble22 = arg1;
			Static388.aClass300_3.method6601(local16);
		}
		return local22;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method7718(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean353) {
			return;
		}
		if (this.method4226() != null) {
			@Pc(27) int local27 = arg2 + arg1;
			if (Static157.aBoolean213) {
				local27 <<= 0x1;
			}
			@Pc(37) byte local37 = 0;
			if (this.anInt4707 == 2) {
				local37 = 1;
			}
			while (local27 > arg1) {
				@Pc(49) Class4_Sub5_Sub13 local49 = this.method4226();
				if (local49 == null) {
					return;
				}
				@Pc(55) short[][] local55 = local49.aShortArrayArray11;
				while (arg1 < local27 && local55[0].length > this.anInt4722) {
					if (Static157.aBoolean213) {
						arg0[arg1++] = local55[0][this.anInt4722] * this.anInt4720;
						arg0[arg1++] = local55[local37][this.anInt4722] * this.anInt4719;
					} else {
						@Pc(89) int local89 = arg1++;
						arg0[local89] += local55[local37][this.anInt4722] * this.anInt4719 + local55[0][this.anInt4722] * this.anInt4720;
					}
					this.anInt4722++;
				}
				if (local55[0].length <= this.anInt4722) {
					this.method4221();
				}
			}
		} else if (this.aBoolean352) {
			this.method9000();
			Static388.aClass300_3.method6605();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "()I")
	@Override
	public int method7714() {
		return 1;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)D")
	public synchronized double method4223() {
		if (this.anInt4721 < 1) {
			return -1.0D;
		} else {
			@Pc(25) Class4_Sub5_Sub13 local25 = (Class4_Sub5_Sub13) this.aClass163_26.method3639();
			return local25 == null ? -1.0D : local25.aDouble22 - (double) ((float) local25.aShortArrayArray11[0].length / (float) Static434.anInt6851);
		}
	}

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)V")
	public synchronized void method4224() {
		this.aBoolean352 = true;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)V")
	public synchronized void method4225(@OriginalArg(1) boolean arg0) {
		this.aBoolean353 = arg0;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)Lclient!kka;")
	private synchronized Class4_Sub5_Sub13 method4226() {
		return (Class4_Sub5_Sub13) this.aClass163_26.method3639();
	}
}
