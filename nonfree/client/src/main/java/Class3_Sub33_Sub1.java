import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kc")
public final class Class3_Sub33_Sub1 extends Class3_Sub33 {

	@OriginalMember(owner = "client!kc", name = "B", descriptor = "Z")
	private boolean aBoolean357;

	@OriginalMember(owner = "client!kc", name = "u", descriptor = "Z")
	private boolean aBoolean358;

	@OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
	private int anInt5382;

	@OriginalMember(owner = "client!kc", name = "H", descriptor = "Lclient!sja;")
	private final Class342 aClass342_45 = new Class342();

	@OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
	private int anInt5374 = 256;

	@OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
	private int anInt5378 = 0;

	@OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
	private int anInt5379 = 256;

	@OriginalMember(owner = "client!kc", name = "C", descriptor = "I")
	private final int anInt5367;

	@OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(I)V")
	public Class3_Sub33_Sub1(@OriginalArg(0) int arg0) {
		this.anInt5367 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8709(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean357) {
			return;
		}
		if (this.method4812() != null) {
			@Pc(32) int local32 = arg2 + arg1;
			if (Static330.aBoolean659) {
				local32 <<= 0x1;
			}
			@Pc(42) byte local42 = 0;
			if (this.anInt5367 == 2) {
				local42 = 1;
			}
			while (local32 > arg1) {
				@Pc(56) Class3_Sub7_Sub19 local56 = this.method4812();
				if (local56 == null) {
					return;
				}
				@Pc(62) short[][] local62 = local56.aShortArrayArray4;
				while (local32 > arg1 && local62[0].length > this.anInt5382) {
					if (Static330.aBoolean659) {
						arg0[arg1++] = local62[0][this.anInt5382] * this.anInt5379;
						arg0[arg1++] = this.anInt5374 * local62[local42][this.anInt5382];
					} else {
						@Pc(100) int local100 = arg1++;
						arg0[local100] += this.anInt5379 * local62[0][this.anInt5382] + this.anInt5374 * local62[local42][this.anInt5382];
					}
					this.anInt5382++;
				}
				if (local62[0].length <= this.anInt5382) {
					this.method4814();
				}
			}
		} else if (this.aBoolean358) {
			this.method9596();
			Static644.aClass214_4.method4925();
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lclient!qha;Z)V")
	public synchronized void method4811(@OriginalArg(0) Class3_Sub7_Sub19 arg0) {
		while (this.anInt5378 >= 100) {
			this.aClass342_45.method7653();
			this.anInt5378--;
		}
		if (false) {
			this.anInt5382 = -97;
		}
		this.aClass342_45.method7654(arg0);
		this.anInt5378++;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8710(@OriginalArg(0) int arg0) {
		if (this.aBoolean357) {
			return;
		}
		while (true) {
			@Pc(14) Class3_Sub7_Sub19 local14 = this.method4812();
			if (local14 == null) {
				if (this.aBoolean358) {
					this.method9596();
					Static644.aClass214_4.method4925();
				}
				return;
			}
			if (local14.aShortArrayArray4[0].length - this.anInt5382 > arg0) {
				this.anInt5382 += arg0;
				return;
			}
			arg0 -= local14.aShortArrayArray4[0].length - this.anInt5382;
			this.method4814();
		}
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "()Lclient!oga;")
	@Override
	public Class3_Sub33 method8708() {
		return null;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(B)Lclient!qha;")
	private synchronized Class3_Sub7_Sub19 method4812() {
		return (Class3_Sub7_Sub19) this.aClass342_45.method7644();
	}

	@OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)D")
	public synchronized double method4813() {
		if (this.anInt5378 < 1) {
			return -1.0D;
		} else {
			@Pc(26) Class3_Sub7_Sub19 local26 = (Class3_Sub7_Sub19) this.aClass342_45.method7644();
			return local26 == null ? -1.0D : local26.aDouble19 - (double) ((float) local26.aShortArrayArray4[0].length / (float) Static330.anInt9773);
		}
	}

	@OriginalMember(owner = "client!kc", name = "c", descriptor = "()Lclient!oga;")
	@Override
	public Class3_Sub33 method8706() {
		return null;
	}

	@OriginalMember(owner = "client!kc", name = "i", descriptor = "(I)V")
	private synchronized void method4814() {
		@Pc(7) Class3_Sub7_Sub19 local7 = this.method4812();
		if (local7 != null) {
			local7.method9596();
			this.anInt5382 = 0;
			this.anInt5378--;
			Static644.aClass214_4.method4928(local7, local7.method7040());
		}
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZD)Lclient!qha;")
	public Class3_Sub7_Sub19 method4816(@OriginalArg(0) int arg0, @OriginalArg(2) double arg1) {
		@Pc(11) long local11 = (long) (arg0 | this.anInt5367 << 0);
		@Pc(17) Class3_Sub7_Sub19 local17 = (Class3_Sub7_Sub19) Static644.aClass214_4.method4927(local11);
		if (local17 == null) {
			local17 = new Class3_Sub7_Sub19(new short[this.anInt5367][arg0], arg1);
		} else {
			local17.aDouble19 = arg1;
			Static644.aClass214_4.method4924(local11);
		}
		return local17;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZB)V")
	public synchronized void method4817(@OriginalArg(0) boolean arg0) {
		this.aBoolean357 = arg0;
	}

	@OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)I")
	public synchronized int method4818() {
		return this.anInt5378;
	}

	@OriginalMember(owner = "client!kc", name = "h", descriptor = "(I)V")
	public synchronized void method4819() {
		this.aBoolean358 = true;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "()I")
	@Override
	public int method8705() {
		return 1;
	}

	@OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
	public void method4820(@OriginalArg(0) int arg0) {
		this.anInt5374 = arg0;
		this.anInt5379 = arg0;
	}
}
