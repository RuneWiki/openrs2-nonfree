import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!go")
public final class Class2_Sub11_Sub3 extends Class2_Sub11 {

	@OriginalMember(owner = "client!go", name = "J", descriptor = "I")
	private int anInt3842;

	@OriginalMember(owner = "client!go", name = "K", descriptor = "Z")
	private boolean aBoolean285;

	@OriginalMember(owner = "client!go", name = "L", descriptor = "Z")
	private boolean aBoolean286;

	@OriginalMember(owner = "client!go", name = "G", descriptor = "Lclient!fh;")
	private final Class114 aClass114_20 = new Class114();

	@OriginalMember(owner = "client!go", name = "M", descriptor = "I")
	private int anInt3843 = 256;

	@OriginalMember(owner = "client!go", name = "O", descriptor = "I")
	private int anInt3845 = 0;

	@OriginalMember(owner = "client!go", name = "N", descriptor = "I")
	private int anInt3844 = 256;

	@OriginalMember(owner = "client!go", name = "E", descriptor = "I")
	private final int anInt3838;

	@OriginalMember(owner = "client!go", name = "<init>", descriptor = "(I)V")
	public Class2_Sub11_Sub3(@OriginalArg(0) int arg0) {
		this.anInt3838 = arg0;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(B)I")
	public synchronized int method3281() {
		return this.anInt3845;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method6155(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean286) {
			return;
		}
		if (this.method3288() != null) {
			@Pc(27) int local27 = arg2 + arg1;
			if (Static40.aBoolean75) {
				local27 <<= 0x1;
			}
			@Pc(37) byte local37 = 0;
			if (this.anInt3838 == 2) {
				local37 = 1;
			}
			while (local27 > arg1) {
				@Pc(49) Class2_Sub7_Sub19 local49 = this.method3288();
				if (local49 == null) {
					return;
				}
				@Pc(55) short[][] local55 = local49.aShortArrayArray17;
				while (arg1 < local27 && local55[0].length > this.anInt3842) {
					if (Static40.aBoolean75) {
						arg0[arg1++] = this.anInt3843 * local55[0][this.anInt3842];
						arg0[arg1++] = local55[local37][this.anInt3842] * this.anInt3844;
					} else {
						@Pc(61) int local61 = arg1++;
						arg0[local61] += this.anInt3844 * local55[local37][this.anInt3842] + local55[0][this.anInt3842] * this.anInt3843;
					}
					this.anInt3842++;
				}
				if (this.anInt3842 >= local55[0].length) {
					this.method3282();
				}
			}
		} else if (this.aBoolean285) {
			this.method8920();
			Static239.aClass280_3.method6427();
		}
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "()Lclient!lea;")
	@Override
	public Class2_Sub11 method6157() {
		return null;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V")
	private synchronized void method3282() {
		@Pc(7) Class2_Sub7_Sub19 local7 = this.method3288();
		if (local7 != null) {
			local7.method8920();
			this.anInt3842 = 0;
			this.anInt3845--;
			Static239.aClass280_3.method6428(local7.method7887(), local7);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "()Lclient!lea;")
	@Override
	public Class2_Sub11 method6156() {
		return null;
	}

	@OriginalMember(owner = "client!go", name = "c", descriptor = "(I)D")
	public synchronized double method3283() {
		if (this.anInt3845 < 1) {
			return -1.0D;
		} else {
			@Pc(19) Class2_Sub7_Sub19 local19 = (Class2_Sub7_Sub19) this.aClass114_20.method2772();
			return local19 == null ? -1.0D : local19.aDouble21 - (double) ((float) local19.aShortArrayArray17[0].length / (float) Static489.anInt8544);
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(IDI)Lclient!tv;")
	public Class2_Sub7_Sub19 method3284(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1) {
		@Pc(17) long local17 = (long) (this.anInt3838 << 0 | arg0);
		@Pc(23) Class2_Sub7_Sub19 local23 = (Class2_Sub7_Sub19) Static239.aClass280_3.method6424(local17);
		if (local23 == null) {
			local23 = new Class2_Sub7_Sub19(new short[this.anInt3838][arg0], arg1);
		} else {
			local23.aDouble21 = arg1;
			Static239.aClass280_3.method6425(local17);
		}
		return local23;
	}

	@OriginalMember(owner = "client!go", name = "d", descriptor = "()I")
	@Override
	public int method6161() {
		return 1;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ZB)V")
	public synchronized void method3285(@OriginalArg(0) boolean arg0) {
		this.aBoolean286 = arg0;
	}

	@OriginalMember(owner = "client!go", name = "e", descriptor = "(B)Lclient!tv;")
	private synchronized Class2_Sub7_Sub19 method3288() {
		return (Class2_Sub7_Sub19) this.aClass114_20.method2772();
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6159(@OriginalArg(0) int arg0) {
		if (this.aBoolean286) {
			return;
		}
		while (true) {
			@Pc(11) Class2_Sub7_Sub19 local11 = this.method3288();
			if (local11 == null) {
				if (this.aBoolean285) {
					this.method8920();
					Static239.aClass280_3.method6427();
				}
				return;
			}
			if (local11.aShortArrayArray17[0].length - this.anInt3842 > arg0) {
				this.anInt3842 += arg0;
				return;
			}
			arg0 -= local11.aShortArrayArray17[0].length - this.anInt3842;
			this.method3282();
		}
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(Lclient!tv;I)V")
	public synchronized void method3290(@OriginalArg(0) Class2_Sub7_Sub19 arg0) {
		while (this.anInt3845 >= 100) {
			this.aClass114_20.method2765();
			this.anInt3845--;
		}
		this.aClass114_20.method2771(arg0);
		this.anInt3845++;
	}

	@OriginalMember(owner = "client!go", name = "b", descriptor = "(Z)V")
	public synchronized void method3291() {
		this.aBoolean285 = true;
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(II)V")
	public void method3292(@OriginalArg(0) int arg0) {
		this.anInt3844 = arg0;
		this.anInt3843 = arg0;
	}
}
