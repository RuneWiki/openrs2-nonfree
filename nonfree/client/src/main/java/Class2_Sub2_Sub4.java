import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mi")
public final class Class2_Sub2_Sub4 extends Class2_Sub2 {

	@OriginalMember(owner = "client!mi", name = "w", descriptor = "I")
	private int anInt6452;

	@OriginalMember(owner = "client!mi", name = "x", descriptor = "Z")
	private boolean aBoolean481;

	@OriginalMember(owner = "client!mi", name = "E", descriptor = "Z")
	private boolean aBoolean482;

	@OriginalMember(owner = "client!mi", name = "o", descriptor = "Lclient!nt;")
	private final Class238 aClass238_39 = new Class238();

	@OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
	private int anInt6454 = 0;

	@OriginalMember(owner = "client!mi", name = "A", descriptor = "I")
	private int anInt6455 = 256;

	@OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
	private int anInt6459 = 256;

	@OriginalMember(owner = "client!mi", name = "u", descriptor = "I")
	private final int anInt6450;

	@OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(I)V")
	public Class2_Sub2_Sub4(@OriginalArg(0) int arg0) {
		this.anInt6450 = arg0;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "()I")
	@Override
	public int method7541() {
		return 1;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)Lclient!hga;")
	private synchronized Class2_Sub5_Sub8 method5441() {
		return (Class2_Sub5_Sub8) this.aClass238_39.method5833();
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method7538(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean481) {
			return;
		}
		if (this.method5441() != null) {
			@Pc(27) int local27 = arg2 + arg1;
			if (Static440.aBoolean586) {
				local27 <<= 0x1;
			}
			@Pc(37) byte local37 = 0;
			if (this.anInt6450 == 2) {
				local37 = 1;
			}
			while (arg1 < local27) {
				@Pc(49) Class2_Sub5_Sub8 local49 = this.method5441();
				if (local49 == null) {
					return;
				}
				@Pc(55) short[][] local55 = local49.aShortArrayArray14;
				while (local27 > arg1 && local55[0].length > this.anInt6452) {
					if (Static440.aBoolean586) {
						arg0[arg1++] = local55[0][this.anInt6452] * this.anInt6459;
						arg0[arg1++] = this.anInt6455 * local55[local37][this.anInt6452];
					} else {
						@Pc(61) int local61 = arg1++;
						arg0[local61] += local55[0][this.anInt6452] * this.anInt6459 + local55[local37][this.anInt6452] * this.anInt6455;
					}
					this.anInt6452++;
				}
				if (this.anInt6452 >= local55[0].length) {
					this.method5448();
				}
			}
		} else if (this.aBoolean482) {
			this.method8599();
			Static614.aClass117_10.method3039();
		}
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "()Lclient!ep;")
	@Override
	public Class2_Sub2 method7542() {
		return null;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
	public synchronized void method5442() {
		this.aBoolean482 = true;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method7544(@OriginalArg(0) int arg0) {
		if (this.aBoolean481) {
			return;
		}
		while (true) {
			@Pc(11) Class2_Sub5_Sub8 local11 = this.method5441();
			if (local11 == null) {
				if (this.aBoolean482) {
					this.method8599();
					Static614.aClass117_10.method3039();
				}
				return;
			}
			if (arg0 < local11.aShortArrayArray14[0].length - this.anInt6452) {
				this.anInt6452 += arg0;
				return;
			}
			arg0 -= local11.aShortArrayArray14[0].length - this.anInt6452;
			this.method5448();
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "()Lclient!ep;")
	@Override
	public Class2_Sub2 method7539() {
		return null;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(ZI)V")
	public synchronized void method5443(@OriginalArg(0) boolean arg0) {
		this.aBoolean481 = arg0;
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)V")
	public void method5444(@OriginalArg(1) int arg0) {
		this.anInt6455 = arg0;
		this.anInt6459 = arg0;
	}

	@OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)I")
	public synchronized int method5445() {
		return this.anInt6454;
	}

	@OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)D")
	public synchronized double method5446() {
		if (this.anInt6454 < 1) {
			return -1.0D;
		} else {
			@Pc(20) Class2_Sub5_Sub8 local20 = (Class2_Sub5_Sub8) this.aClass238_39.method5833();
			return local20 == null ? -1.0D : local20.aDouble8 - (double) ((float) local20.aShortArrayArray14[0].length / (float) Static66.anInt1396);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(Lclient!hga;I)V")
	public synchronized void method5447(@OriginalArg(0) Class2_Sub5_Sub8 arg0) {
		while (this.anInt6454 >= 100) {
			this.aClass238_39.method5832();
			this.anInt6454--;
		}
		this.aClass238_39.method5837(arg0);
		this.anInt6454++;
	}

	@OriginalMember(owner = "client!mi", name = "g", descriptor = "(I)V")
	private synchronized void method5448() {
		@Pc(7) Class2_Sub5_Sub8 local7 = this.method5441();
		if (local7 != null) {
			local7.method8599();
			this.anInt6452 = 0;
			this.anInt6454--;
			Static614.aClass117_10.method3042(local7.method3615(), local7);
		}
	}

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(BID)Lclient!hga;")
	public Class2_Sub5_Sub8 method5449(@OriginalArg(1) int arg0, @OriginalArg(2) double arg1) {
		@Pc(19) long local19 = (long) (this.anInt6450 << 0 | arg0);
		@Pc(25) Class2_Sub5_Sub8 local25 = (Class2_Sub5_Sub8) Static614.aClass117_10.method3041(local19);
		if (local25 == null) {
			local25 = new Class2_Sub5_Sub8(new short[this.anInt6450][arg0], arg1);
		} else {
			local25.aDouble8 = arg1;
			Static614.aClass117_10.method3040(local19);
		}
		return local25;
	}
}
