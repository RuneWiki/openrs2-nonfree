import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uw")
public final class Class5_Sub16_Sub5 extends Class5_Sub16 {

	@OriginalMember(owner = "client!uw", name = "G", descriptor = "Z")
	private boolean aBoolean776;

	@OriginalMember(owner = "client!uw", name = "I", descriptor = "Z")
	private boolean aBoolean777;

	@OriginalMember(owner = "client!uw", name = "K", descriptor = "I")
	private int anInt9666;

	@OriginalMember(owner = "client!uw", name = "s", descriptor = "Lclient!ro;")
	private final Class306 aClass306_60 = new Class306();

	@OriginalMember(owner = "client!uw", name = "H", descriptor = "I")
	private int anInt9664 = 256;

	@OriginalMember(owner = "client!uw", name = "J", descriptor = "I")
	private int anInt9665 = 256;

	@OriginalMember(owner = "client!uw", name = "L", descriptor = "I")
	private int anInt9667 = 0;

	@OriginalMember(owner = "client!uw", name = "B", descriptor = "I")
	private final int anInt9659;

	@OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(I)V")
	public Class5_Sub16_Sub5(@OriginalArg(0) int arg0) {
		this.anInt9659 = arg0;
	}

	@OriginalMember(owner = "client!uw", name = "d", descriptor = "()I")
	@Override
	public int method8287() {
		return 1;
	}

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "(I)I")
	public synchronized int method8290() {
		return this.anInt9667;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(BZ)V")
	public synchronized void method8291(@OriginalArg(1) boolean arg0) {
		this.aBoolean776 = arg0;
	}

	@OriginalMember(owner = "client!uw", name = "c", descriptor = "(Z)D")
	public synchronized double method8292() {
		if (this.anInt9667 < 1) {
			return -1.0D;
		} else {
			@Pc(21) Class5_Sub4_Sub17 local21 = (Class5_Sub4_Sub17) this.aClass306_60.method7313();
			return local21 == null ? -1.0D : (double) -((float) local21.aShortArrayArray17[0].length / (float) Static92.anInt9993) + local21.aDouble26;
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ZI)V")
	public void method8293(@OriginalArg(1) int arg0) {
		this.anInt9665 = arg0;
		this.anInt9664 = arg0;
	}

	@OriginalMember(owner = "client!uw", name = "d", descriptor = "(I)V")
	private synchronized void method8294() {
		@Pc(7) Class5_Sub4_Sub17 local7 = this.method8296();
		if (local7 != null) {
			local7.method8911();
			this.anInt9667--;
			this.anInt9666 = 0;
			Static91.aClass368_1.method8527(local7.method7285(), local7);
		}
	}

	@OriginalMember(owner = "client!uw", name = "e", descriptor = "(I)Lclient!rj;")
	private synchronized Class5_Sub4_Sub17 method8296() {
		return (Class5_Sub4_Sub17) this.aClass306_60.method7313();
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "()Lclient!gu;")
	@Override
	public Class5_Sub16 method8283() {
		return null;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(BLclient!rj;)V")
	public synchronized void method8297(@OriginalArg(1) Class5_Sub4_Sub17 arg0) {
		while (this.anInt9667 >= 100) {
			this.aClass306_60.method7302();
			this.anInt9667--;
		}
		this.aClass306_60.method7303(arg0);
		this.anInt9667++;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "([III)V")
	@Override
	public synchronized void method8282(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean776) {
			return;
		}
		if (this.method8296() != null) {
			@Pc(28) int local28 = arg1 + arg2;
			if (Static568.aBoolean763) {
				local28 <<= 0x1;
			}
			@Pc(38) byte local38 = 0;
			if (this.anInt9659 == 2) {
				local38 = 1;
			}
			while (local28 > arg1) {
				@Pc(50) Class5_Sub4_Sub17 local50 = this.method8296();
				if (local50 == null) {
					return;
				}
				@Pc(56) short[][] local56 = local50.aShortArrayArray17;
				while (local28 > arg1 && local56[0].length > this.anInt9666) {
					if (Static568.aBoolean763) {
						arg0[arg1++] = local56[0][this.anInt9666] * this.anInt9664;
						arg0[arg1++] = this.anInt9665 * local56[local38][this.anInt9666];
					} else {
						@Pc(90) int local90 = arg1++;
						arg0[local90] += local56[0][this.anInt9666] * this.anInt9664 + local56[local38][this.anInt9666] * this.anInt9665;
					}
					this.anInt9666++;
				}
				if (this.anInt9666 >= local56[0].length) {
					this.method8294();
				}
			}
		} else if (this.aBoolean777) {
			this.method8911();
			Static91.aClass368_1.method8529();
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "()Lclient!gu;")
	@Override
	public Class5_Sub16 method8281() {
		return null;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(IDB)Lclient!rj;")
	public Class5_Sub4_Sub17 method8298(@OriginalArg(0) int arg0, @OriginalArg(1) double arg1) {
		@Pc(17) long local17 = (long) (this.anInt9659 << 0 | arg0);
		@Pc(23) Class5_Sub4_Sub17 local23 = (Class5_Sub4_Sub17) Static91.aClass368_1.method8528(local17);
		if (local23 == null) {
			local23 = new Class5_Sub4_Sub17(new short[this.anInt9659][arg0], arg1);
		} else {
			local23.aDouble26 = arg1;
			Static91.aClass368_1.method8530(local17);
		}
		return local23;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(B)V")
	public synchronized void method8299() {
		this.aBoolean777 = true;
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8286(@OriginalArg(0) int arg0) {
		if (this.aBoolean776) {
			return;
		}
		while (true) {
			@Pc(11) Class5_Sub4_Sub17 local11 = this.method8296();
			if (local11 == null) {
				if (this.aBoolean777) {
					this.method8911();
					Static91.aClass368_1.method8529();
				}
				return;
			}
			if (arg0 < local11.aShortArrayArray17[0].length - this.anInt9666) {
				this.anInt9666 += arg0;
				return;
			}
			arg0 -= local11.aShortArrayArray17[0].length - this.anInt9666;
			this.method8294();
		}
	}
}
