import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class6_Sub4_Sub4 extends Class6_Sub4 {

	@OriginalMember(owner = "client!wb", name = "y", descriptor = "I")
	private int anInt10461;

	@OriginalMember(owner = "client!wb", name = "D", descriptor = "Z")
	private boolean aBoolean828;

	@OriginalMember(owner = "client!wb", name = "O", descriptor = "Z")
	private boolean aBoolean829;

	@OriginalMember(owner = "client!wb", name = "r", descriptor = "Lclient!kba;")
	private final Class163 aClass163_62 = new Class163();

	@OriginalMember(owner = "client!wb", name = "H", descriptor = "I")
	private int anInt10469 = 256;

	@OriginalMember(owner = "client!wb", name = "z", descriptor = "I")
	private int anInt10462 = 0;

	@OriginalMember(owner = "client!wb", name = "L", descriptor = "I")
	private int anInt10473 = 256;

	@OriginalMember(owner = "client!wb", name = "p", descriptor = "I")
	private final int anInt10454;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(I)V")
	public Class6_Sub4_Sub4(@OriginalArg(0) int arg0) {
		this.anInt10454 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "(I)V")
	public synchronized void method8506() {
		this.aBoolean829 = true;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8631(@OriginalArg(0) int arg0) {
		if (this.aBoolean828) {
			return;
		}
		while (true) {
			@Pc(11) Class6_Sub5_Sub17 local11 = this.method8508();
			if (local11 == null) {
				if (this.aBoolean829) {
					this.method8792();
					Static620.aClass117_4.method3385();
				}
				return;
			}
			if (arg0 < local11.aShortArrayArray14[0].length - this.anInt10461) {
				this.anInt10461 += arg0;
				return;
			}
			arg0 -= local11.aShortArrayArray14[0].length - this.anInt10461;
			this.method8515();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(BLclient!jba;)V")
	public synchronized void method8507(@OriginalArg(1) Class6_Sub5_Sub17 arg0) {
		while (this.anInt10462 >= 100) {
			this.aClass163_62.method4969();
			this.anInt10462--;
		}
		this.aClass163_62.method4967(arg0);
		this.anInt10462++;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)Lclient!jba;")
	private synchronized Class6_Sub5_Sub17 method8508() {
		return (Class6_Sub5_Sub17) this.aClass163_62.method4966();
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)D")
	public synchronized double method8509() {
		if (this.anInt10462 < 1) {
			return -1.0D;
		} else {
			@Pc(23) Class6_Sub5_Sub17 local23 = (Class6_Sub5_Sub17) this.aClass163_62.method4966();
			return local23 == null ? -1.0D : local23.aDouble5 - (double) ((float) local23.aShortArrayArray14[0].length / (float) Static322.anInt6392);
		}
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "()I")
	@Override
	public int method8636() {
		return 1;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(DII)Lclient!jba;")
	public Class6_Sub5_Sub17 method8512(@OriginalArg(0) double arg0, @OriginalArg(1) int arg1) {
		@Pc(19) long local19 = (long) (this.anInt10454 << 0 | arg1);
		@Pc(25) Class6_Sub5_Sub17 local25 = (Class6_Sub5_Sub17) Static620.aClass117_4.method3389(local19);
		if (local25 == null) {
			local25 = new Class6_Sub5_Sub17(new short[this.anInt10454][arg1], arg0);
		} else {
			local25.aDouble5 = arg0;
			Static620.aClass117_4.method3384(local19);
		}
		return local25;
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(Z)I")
	public synchronized int method8514() {
		return this.anInt10462;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
	private synchronized void method8515() {
		@Pc(16) Class6_Sub5_Sub17 local16 = this.method8508();
		if (local16 != null) {
			local16.method8792();
			this.anInt10461 = 0;
			this.anInt10462--;
			Static620.aClass117_4.method3390(local16, local16.method4587());
		}
	}

	@OriginalMember(owner = "client!wb", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8635(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean828) {
			return;
		}
		if (this.method8508() != null) {
			@Pc(27) int local27 = arg2 + arg1;
			if (Static528.aBoolean739) {
				local27 <<= 0x1;
			}
			@Pc(37) byte local37 = 0;
			if (this.anInt10454 == 2) {
				local37 = 1;
			}
			while (local27 > arg1) {
				@Pc(49) Class6_Sub5_Sub17 local49 = this.method8508();
				if (local49 == null) {
					return;
				}
				@Pc(55) short[][] local55 = local49.aShortArrayArray14;
				while (arg1 < local27 && local55[0].length > this.anInt10461) {
					if (Static528.aBoolean739) {
						arg0[arg1++] = this.anInt10473 * local55[0][this.anInt10461];
						arg0[arg1++] = this.anInt10469 * local55[local37][this.anInt10461];
					} else {
						@Pc(61) int local61 = arg1++;
						arg0[local61] += this.anInt10469 * local55[local37][this.anInt10461] + this.anInt10473 * local55[0][this.anInt10461];
					}
					this.anInt10461++;
				}
				if (this.anInt10461 >= local55[0].length) {
					this.method8515();
				}
			}
		} else if (this.aBoolean829) {
			this.method8792();
			Static620.aClass117_4.method3385();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZI)V")
	public synchronized void method8518(@OriginalArg(0) boolean arg0) {
		this.aBoolean828 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "()Lclient!mha;")
	@Override
	public Class6_Sub4 method8632() {
		return null;
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(II)V")
	public void method8519(@OriginalArg(1) int arg0) {
		this.anInt10473 = arg0;
		this.anInt10469 = arg0;
	}

	@OriginalMember(owner = "client!wb", name = "d", descriptor = "()Lclient!mha;")
	@Override
	public Class6_Sub4 method8637() {
		return null;
	}
}
