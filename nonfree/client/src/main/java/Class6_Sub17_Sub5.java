import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tfa")
public final class Class6_Sub17_Sub5 extends Class6_Sub17 {

	@OriginalMember(owner = "client!tfa", name = "J", descriptor = "I")
	private int anInt9323;

	@OriginalMember(owner = "client!tfa", name = "y", descriptor = "Z")
	private boolean aBoolean694;

	@OriginalMember(owner = "client!tfa", name = "G", descriptor = "Z")
	private boolean aBoolean695;

	@OriginalMember(owner = "client!tfa", name = "C", descriptor = "Lclient!tf;")
	private final Class340 aClass340_71 = new Class340();

	@OriginalMember(owner = "client!tfa", name = "x", descriptor = "I")
	private int anInt9325 = 0;

	@OriginalMember(owner = "client!tfa", name = "n", descriptor = "I")
	private int anInt9329 = 256;

	@OriginalMember(owner = "client!tfa", name = "t", descriptor = "I")
	private int anInt9328 = 256;

	@OriginalMember(owner = "client!tfa", name = "w", descriptor = "I")
	private final int anInt9314;

	@OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(I)V")
	public Class6_Sub17_Sub5(@OriginalArg(0) int arg0) {
		this.anInt9314 = arg0;
	}

	@OriginalMember(owner = "client!tfa", name = "g", descriptor = "(I)Lclient!gt;")
	private synchronized Class6_Sub2_Sub8 method8146() {
		return (Class6_Sub2_Sub8) this.aClass340_71.method8124();
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8139(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean694) {
			return;
		}
		if (this.method8146() != null) {
			@Pc(32) int local32 = arg1 + arg2;
			if (Static30.aBoolean32) {
				local32 <<= 0x1;
			}
			@Pc(42) byte local42 = 0;
			if (this.anInt9314 == 2) {
				local42 = 1;
			}
			while (arg1 < local32) {
				@Pc(58) Class6_Sub2_Sub8 local58 = this.method8146();
				if (local58 == null) {
					return;
				}
				@Pc(64) short[][] local64 = local58.aShortArrayArray7;
				while (local32 > arg1 && local64[0].length > this.anInt9323) {
					if (Static30.aBoolean32) {
						arg0[arg1++] = this.anInt9329 * local64[0][this.anInt9323];
						arg0[arg1++] = this.anInt9328 * local64[local42][this.anInt9323];
					} else {
						@Pc(102) int local102 = arg1++;
						arg0[local102] += local64[0][this.anInt9323] * this.anInt9329 + local64[local42][this.anInt9323] * this.anInt9328;
					}
					this.anInt9323++;
				}
				if (this.anInt9323 >= local64[0].length) {
					this.method8156();
				}
			}
		} else if (this.aBoolean695) {
			this.method9051();
			Static462.aClass379_4.method8730();
		}
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "()Lclient!jn;")
	@Override
	public Class6_Sub17 method8140() {
		return null;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ILclient!gt;)V")
	public synchronized void method8147(@OriginalArg(1) Class6_Sub2_Sub8 arg0) {
		while (this.anInt9325 >= 100) {
			this.aClass340_71.method8127();
			this.anInt9325--;
		}
		this.aClass340_71.method8131(arg0);
		this.anInt9325++;
	}

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "()I")
	@Override
	public int method8141() {
		return 1;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(ZB)V")
	public synchronized void method8148(@OriginalArg(0) boolean arg0) {
		this.aBoolean694 = arg0;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8144(@OriginalArg(0) int arg0) {
		if (this.aBoolean694) {
			return;
		}
		while (true) {
			@Pc(14) Class6_Sub2_Sub8 local14 = this.method8146();
			if (local14 == null) {
				if (this.aBoolean695) {
					this.method9051();
					Static462.aClass379_4.method8730();
				}
				return;
			}
			if (local14.aShortArrayArray7[0].length - this.anInt9323 > arg0) {
				this.anInt9323 += arg0;
				return;
			}
			arg0 -= local14.aShortArrayArray7[0].length - this.anInt9323;
			this.method8156();
		}
	}

	@OriginalMember(owner = "client!tfa", name = "c", descriptor = "(I)V")
	public synchronized void method8149() {
		this.aBoolean695 = true;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(II)V")
	public void method8151(@OriginalArg(0) int arg0) {
		this.anInt9329 = arg0;
		this.anInt9328 = arg0;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(DBI)Lclient!gt;")
	public Class6_Sub2_Sub8 method8152(@OriginalArg(0) double arg0, @OriginalArg(2) int arg1) {
		@Pc(11) long local11 = (long) (arg1 | this.anInt9314 << 0);
		@Pc(17) Class6_Sub2_Sub8 local17 = (Class6_Sub2_Sub8) Static462.aClass379_4.method8729(local11);
		if (local17 == null) {
			local17 = new Class6_Sub2_Sub8(new short[this.anInt9314][arg1], arg0);
		} else {
			local17.aDouble19 = arg0;
			Static462.aClass379_4.method8731(local11);
		}
		return local17;
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "(I)I")
	public synchronized int method8154() {
		return this.anInt9325;
	}

	@OriginalMember(owner = "client!tfa", name = "a", descriptor = "(B)D")
	public synchronized double method8155() {
		if (this.anInt9325 < 1) {
			return -1.0D;
		} else {
			@Pc(26) Class6_Sub2_Sub8 local26 = (Class6_Sub2_Sub8) this.aClass340_71.method8124();
			return local26 == null ? -1.0D : (double) -((float) local26.aShortArrayArray7[0].length / (float) Static90.anInt9479) + local26.aDouble19;
		}
	}

	@OriginalMember(owner = "client!tfa", name = "b", descriptor = "()Lclient!jn;")
	@Override
	public Class6_Sub17 method8143() {
		return null;
	}

	@OriginalMember(owner = "client!tfa", name = "f", descriptor = "(I)V")
	private synchronized void method8156() {
		@Pc(7) Class6_Sub2_Sub8 local7 = this.method8146();
		if (local7 != null) {
			local7.method9051();
			this.anInt9325--;
			this.anInt9323 = 0;
			Static462.aClass379_4.method8733(local7.method3832(), local7);
		}
	}
}
