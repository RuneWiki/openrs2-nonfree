import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!b")
public final class Class14_Sub5_Sub1 extends Class14_Sub5 {

	@OriginalMember(owner = "client!b", name = "K", descriptor = "Z")
	private boolean aBoolean62;

	@OriginalMember(owner = "client!b", name = "L", descriptor = "Z")
	private boolean aBoolean63;

	@OriginalMember(owner = "client!b", name = "M", descriptor = "I")
	private int anInt741;

	@OriginalMember(owner = "client!b", name = "G", descriptor = "Lclient!ok;")
	private final Class262 aClass262_2 = new Class262();

	@OriginalMember(owner = "client!b", name = "H", descriptor = "I")
	private int anInt738 = 256;

	@OriginalMember(owner = "client!b", name = "I", descriptor = "I")
	private int anInt739 = 0;

	@OriginalMember(owner = "client!b", name = "J", descriptor = "I")
	private int anInt740 = 256;

	@OriginalMember(owner = "client!b", name = "p", descriptor = "I")
	private final int anInt722;

	@OriginalMember(owner = "client!b", name = "<init>", descriptor = "(I)V")
	public Class14_Sub5_Sub1(@OriginalArg(0) int arg0) {
		this.anInt722 = arg0;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Lclient!ct;I)V")
	public synchronized void method648(@OriginalArg(0) Class14_Sub3_Sub5 arg0) {
		while (this.anInt739 >= 100) {
			this.aClass262_2.method6323();
			this.anInt739--;
		}
		this.aClass262_2.method6314(arg0);
		this.anInt739++;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(ZI)V")
	public synchronized void method649(@OriginalArg(0) boolean arg0) {
		this.aBoolean62 = arg0;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(I)Lclient!ct;")
	private synchronized Class14_Sub3_Sub5 method650() {
		return (Class14_Sub3_Sub5) this.aClass262_2.method6318();
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(IID)Lclient!ct;")
	public Class14_Sub3_Sub5 method652(@OriginalArg(0) int arg0, @OriginalArg(2) double arg1) {
		@Pc(11) long local11 = (long) (arg0 | this.anInt722 << 0);
		@Pc(17) Class14_Sub3_Sub5 local17 = (Class14_Sub3_Sub5) Static116.aClass57_4.method1424(local11);
		if (local17 == null) {
			local17 = new Class14_Sub3_Sub5(new short[this.anInt722][arg0], arg1);
		} else {
			local17.aDouble3 = arg1;
			Static116.aClass57_4.method1420(local11);
		}
		return local17;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
	@Override
	public synchronized void method8688(@OriginalArg(0) int arg0) {
		if (this.aBoolean62) {
			return;
		}
		while (true) {
			@Pc(11) Class14_Sub3_Sub5 local11 = this.method650();
			if (local11 == null) {
				if (this.aBoolean63) {
					this.method9315();
					Static116.aClass57_4.method1423();
				}
				return;
			}
			if (arg0 < local11.aShortArrayArray5[0].length - this.anInt741) {
				this.anInt741 += arg0;
				return;
			}
			arg0 -= local11.aShortArrayArray5[0].length - this.anInt741;
			this.method656();
		}
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "([III)V")
	@Override
	public synchronized void method8693(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (this.aBoolean62) {
			return;
		}
		if (this.method650() != null) {
			@Pc(27) int local27 = arg2 + arg1;
			if (Static40.aBoolean129) {
				local27 <<= 0x1;
			}
			@Pc(37) byte local37 = 0;
			if (this.anInt722 == 2) {
				local37 = 1;
			}
			while (arg1 < local27) {
				@Pc(49) Class14_Sub3_Sub5 local49 = this.method650();
				if (local49 == null) {
					return;
				}
				@Pc(55) short[][] local55 = local49.aShortArrayArray5;
				while (arg1 < local27 && local55[0].length > this.anInt741) {
					if (Static40.aBoolean129) {
						arg0[arg1++] = this.anInt740 * local55[0][this.anInt741];
						arg0[arg1++] = local55[local37][this.anInt741] * this.anInt738;
					} else {
						@Pc(61) int local61 = arg1++;
						arg0[local61] += local55[0][this.anInt741] * this.anInt740 + this.anInt738 * local55[local37][this.anInt741];
					}
					this.anInt741++;
				}
				if (this.anInt741 >= local55[0].length) {
					this.method656();
				}
			}
		} else if (this.aBoolean63) {
			this.method9315();
			Static116.aClass57_4.method1423();
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(Z)D")
	public synchronized double method653() {
		if (this.anInt739 < 1) {
			return -1.0D;
		} else {
			@Pc(20) Class14_Sub3_Sub5 local20 = (Class14_Sub3_Sub5) this.aClass262_2.method6318();
			return local20 == null ? -1.0D : local20.aDouble3 - (double) ((float) local20.aShortArrayArray5[0].length / (float) Static515.anInt9036);
		}
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "()Lclient!sd;")
	@Override
	public Class14_Sub5 method8691() {
		return null;
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "()Lclient!sd;")
	@Override
	public Class14_Sub5 method8692() {
		return null;
	}

	@OriginalMember(owner = "client!b", name = "d", descriptor = "(B)V")
	private synchronized void method656() {
		@Pc(11) Class14_Sub3_Sub5 local11 = this.method650();
		if (local11 != null) {
			local11.method9315();
			this.anInt739--;
			this.anInt741 = 0;
			Static116.aClass57_4.method1422(local11, local11.method1589());
		}
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "()I")
	@Override
	public int method8687() {
		return 1;
	}

	@OriginalMember(owner = "client!b", name = "b", descriptor = "(Z)V")
	public synchronized void method657() {
		this.aBoolean63 = true;
	}

	@OriginalMember(owner = "client!b", name = "c", descriptor = "(Z)I")
	public synchronized int method659() {
		return this.anInt739;
	}

	@OriginalMember(owner = "client!b", name = "a", descriptor = "(BI)V")
	public void method660(@OriginalArg(1) int arg0) {
		this.anInt738 = arg0;
		this.anInt740 = arg0;
	}
}
