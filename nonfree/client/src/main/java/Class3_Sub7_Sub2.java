import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cf")
public final class Class3_Sub7_Sub2 extends Class3_Sub7 {

	@OriginalMember(owner = "client!cf", name = "H", descriptor = "I")
	private int anInt1302;

	@OriginalMember(owner = "client!cf", name = "J", descriptor = "Z")
	private boolean aBoolean105;

	@OriginalMember(owner = "client!cf", name = "L", descriptor = "Z")
	private boolean aBoolean106;

	@OriginalMember(owner = "client!cf", name = "C", descriptor = "Lclient!qia;")
	private final Class276 aClass276_3 = new Class276();

	@OriginalMember(owner = "client!cf", name = "I", descriptor = "I")
	private int anInt1303 = 256;

	@OriginalMember(owner = "client!cf", name = "K", descriptor = "I")
	private int anInt1304 = 0;

	@OriginalMember(owner = "client!cf", name = "M", descriptor = "I")
	private int anInt1305 = 256;

	@OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
	private final int anInt1285;

	@OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(I)V")
	public Class3_Sub7_Sub2(@OriginalArg(0) int arg0) {
		this.anInt1285 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method6004(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean105) {
			return;
		}
		if (this.method1328() != null) {
			@Pc(27) int local27 = arg2 + arg1;
			if (Static457.aBoolean715) {
				local27 <<= 0x1;
			}
			@Pc(37) byte local37 = 0;
			if (this.anInt1285 == 2) {
				local37 = 1;
			}
			while (arg1 < local27) {
				@Pc(51) Class3_Sub1_Sub11 local51 = this.method1328();
				if (local51 == null) {
					return;
				}
				@Pc(57) short[][] local57 = local51.aShortArrayArray8;
				while (arg1 < local27 && local57[0].length > this.anInt1302) {
					if (Static457.aBoolean715) {
						arg0[arg1++] = this.anInt1303 * local57[0][this.anInt1302];
						arg0[arg1++] = local57[local37][this.anInt1302] * this.anInt1305;
					} else {
						@Pc(63) int local63 = arg1++;
						arg0[local63] += this.anInt1305 * local57[local37][this.anInt1302] + local57[0][this.anInt1302] * this.anInt1303;
					}
					this.anInt1302++;
				}
				if (this.anInt1302 >= local57[0].length) {
					this.method1331();
				}
			}
		} else if (this.aBoolean106) {
			this.method8671();
			Static11.aClass345_1.method8052();
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method6002(@OriginalArg(0) int arg0) {
		if (this.aBoolean105) {
			return;
		}
		while (true) {
			@Pc(11) Class3_Sub1_Sub11 local11 = this.method1328();
			if (local11 == null) {
				if (this.aBoolean106) {
					this.method8671();
					Static11.aClass345_1.method8052();
				}
				return;
			}
			if (local11.aShortArrayArray8[0].length - this.anInt1302 > arg0) {
				this.anInt1302 += arg0;
				return;
			}
			arg0 -= local11.aShortArrayArray8[0].length - this.anInt1302;
			this.method1331();
		}
	}

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)Lclient!ke;")
	private synchronized Class3_Sub1_Sub11 method1328() {
		return (Class3_Sub1_Sub11) this.aClass276_3.method6907();
	}

	@OriginalMember(owner = "client!cf", name = "c", descriptor = "()Lclient!rn;")
	@Override
	public Class3_Sub7 method6005() {
		return null;
	}

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V")
	private synchronized void method1331() {
		@Pc(7) Class3_Sub1_Sub11 local7 = this.method1328();
		if (local7 != null) {
			local7.method8671();
			this.anInt1302 = 0;
			this.anInt1304--;
			Static11.aClass345_1.method8058(local7, local7.method4982());
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(II)V")
	public void method1332(@OriginalArg(0) int arg0) {
		this.anInt1305 = arg0;
		this.anInt1303 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Z)D")
	public synchronized double method1334() {
		if (this.anInt1304 < 1) {
			return -1.0D;
		} else {
			@Pc(21) Class3_Sub1_Sub11 local21 = (Class3_Sub1_Sub11) this.aClass276_3.method6907();
			return local21 == null ? -1.0D : local21.aDouble36 - (double) ((float) local21.aShortArrayArray8[0].length / (float) Static590.anInt9843);
		}
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(BZ)V")
	public synchronized void method1335(@OriginalArg(1) boolean arg0) {
		this.aBoolean105 = arg0;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(IBD)Lclient!ke;")
	public Class3_Sub1_Sub11 method1336(@OriginalArg(0) int arg0, @OriginalArg(2) double arg1) {
		@Pc(11) long local11 = (long) (this.anInt1285 << 0 | arg0);
		@Pc(27) Class3_Sub1_Sub11 local27 = (Class3_Sub1_Sub11) Static11.aClass345_1.method8056(local11);
		if (local27 == null) {
			local27 = new Class3_Sub1_Sub11(new short[this.anInt1285][arg0], arg1);
		} else {
			local27.aDouble36 = arg1;
			Static11.aClass345_1.method8054(local11);
		}
		return local27;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "()I")
	@Override
	public int method6000() {
		return 1;
	}

	@OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)V")
	public synchronized void method1338() {
		this.aBoolean106 = true;
	}

	@OriginalMember(owner = "client!cf", name = "g", descriptor = "(I)I")
	public synchronized int method1339() {
		return this.anInt1304;
	}

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "()Lclient!rn;")
	@Override
	public Class3_Sub7 method6006() {
		return null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!ke;I)V")
	public synchronized void method1340(@OriginalArg(0) Class3_Sub1_Sub11 arg0) {
		while (this.anInt1304 >= 100) {
			this.aClass276_3.method6911();
			this.anInt1304--;
		}
		this.aClass276_3.method6906(arg0);
		this.anInt1304++;
	}
}
