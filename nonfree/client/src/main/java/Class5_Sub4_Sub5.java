import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class5_Sub4_Sub5 extends Class5_Sub4 {

	@OriginalMember(owner = "client!ki", name = "w", descriptor = "Z")
	private boolean aBoolean335;

	@OriginalMember(owner = "client!ki", name = "D", descriptor = "Z")
	private boolean aBoolean336;

	@OriginalMember(owner = "client!ki", name = "A", descriptor = "I")
	private int anInt5250;

	@OriginalMember(owner = "client!ki", name = "x", descriptor = "Lclient!at;")
	private final Class20 aClass20_20 = new Class20();

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
	private int anInt5247 = 256;

	@OriginalMember(owner = "client!ki", name = "M", descriptor = "I")
	private int anInt5249 = 0;

	@OriginalMember(owner = "client!ki", name = "O", descriptor = "I")
	private int anInt5251 = 256;

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
	private final int anInt5240;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(I)V")
	public Class5_Sub4_Sub5(@OriginalArg(0) int arg0) {
		this.anInt5240 = arg0;
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)I")
	public synchronized int method4715() {
		return this.anInt5249;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLclient!mia;)V")
	public synchronized void method4717(@OriginalArg(1) Class5_Sub1_Sub12 arg0) {
		while (this.anInt5249 >= 100) {
			this.aClass20_20.method369();
			this.anInt5249--;
		}
		this.aClass20_20.method370(arg0);
		this.anInt5249++;
	}

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "()I")
	@Override
	public int method4710() {
		return 1;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "(II)V")
	public void method4718(@OriginalArg(1) int arg0) {
		this.anInt5251 = arg0;
		this.anInt5247 = arg0;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)V")
	public synchronized void method4719(@OriginalArg(0) boolean arg0) {
		this.aBoolean336 = arg0;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method4712(@OriginalArg(0) int arg0) {
		if (this.aBoolean336) {
			return;
		}
		while (true) {
			@Pc(14) Class5_Sub1_Sub12 local14 = this.method4725();
			if (local14 == null) {
				if (this.aBoolean335) {
					this.method9222();
					Static284.aClass370_4.method8486();
				}
				return;
			}
			if (local14.aShortArrayArray17[0].length - this.anInt5250 > arg0) {
				this.anInt5250 += arg0;
				return;
			}
			arg0 -= local14.aShortArrayArray17[0].length - this.anInt5250;
			this.method4723();
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
	public synchronized void method4720() {
		this.aBoolean335 = true;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZID)Lclient!mia;")
	public Class5_Sub1_Sub12 method4722(@OriginalArg(1) int arg0, @OriginalArg(2) double arg1) {
		@Pc(17) long local17 = (long) (this.anInt5240 << 0 | arg0);
		@Pc(23) Class5_Sub1_Sub12 local23 = (Class5_Sub1_Sub12) Static284.aClass370_4.method8484(local17);
		if (local23 == null) {
			local23 = new Class5_Sub1_Sub12(new short[this.anInt5240][arg0], arg1);
		} else {
			local23.aDouble15 = arg1;
			Static284.aClass370_4.method8487(local17);
		}
		return local23;
	}

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method4713(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean336) {
			return;
		}
		if (this.method4725() != null) {
			@Pc(32) int local32 = arg2 + arg1;
			if (Static404.aBoolean460) {
				local32 <<= 0x1;
			}
			@Pc(42) byte local42 = 0;
			if (this.anInt5240 == 2) {
				local42 = 1;
			}
			while (arg1 < local32) {
				@Pc(56) Class5_Sub1_Sub12 local56 = this.method4725();
				if (local56 == null) {
					return;
				}
				@Pc(62) short[][] local62 = local56.aShortArrayArray17;
				while (arg1 < local32 && local62[0].length > this.anInt5250) {
					if (Static404.aBoolean460) {
						arg0[arg1++] = local62[0][this.anInt5250] * this.anInt5247;
						arg0[arg1++] = local62[local42][this.anInt5250] * this.anInt5251;
					} else {
						@Pc(100) int local100 = arg1++;
						arg0[local100] += this.anInt5247 * local62[0][this.anInt5250] + this.anInt5251 * local62[local42][this.anInt5250];
					}
					this.anInt5250++;
				}
				if (this.anInt5250 >= local62[0].length) {
					this.method4723();
				}
			}
		} else if (this.aBoolean335) {
			this.method9222();
			Static284.aClass370_4.method8486();
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)V")
	private synchronized void method4723() {
		@Pc(14) Class5_Sub1_Sub12 local14 = this.method4725();
		if (local14 != null) {
			local14.method9222();
			this.anInt5249--;
			this.anInt5250 = 0;
			Static284.aClass370_4.method8485(local14, local14.method5302());
		}
	}

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "()Lclient!ef;")
	@Override
	public Class5_Sub4 method4711() {
		return null;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "()Lclient!ef;")
	@Override
	public Class5_Sub4 method4714() {
		return null;
	}

	@OriginalMember(owner = "client!ki", name = "e", descriptor = "(I)Lclient!mia;")
	private synchronized Class5_Sub1_Sub12 method4725() {
		return (Class5_Sub1_Sub12) this.aClass20_20.method378();
	}

	@OriginalMember(owner = "client!ki", name = "d", descriptor = "(I)D")
	public synchronized double method4726() {
		if (this.anInt5249 < 1) {
			return -1.0D;
		} else {
			@Pc(24) Class5_Sub1_Sub12 local24 = (Class5_Sub1_Sub12) this.aClass20_20.method378();
			return local24 == null ? -1.0D : (double) -((float) local24.aShortArrayArray17[0].length / (float) Static417.anInt7038) + local24.aDouble15;
		}
	}
}
