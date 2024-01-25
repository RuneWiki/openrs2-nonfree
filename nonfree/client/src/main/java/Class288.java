import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uaa")
public final class Class288 {

	@OriginalMember(owner = "client!uaa", name = "s", descriptor = "Lclient!lj;")
	private final Class187 aClass187_10 = new Class187();

	@OriginalMember(owner = "client!uaa", name = "q", descriptor = "I")
	private int anInt8370;

	@OriginalMember(owner = "client!uaa", name = "r", descriptor = "I")
	private final int anInt8371;

	@OriginalMember(owner = "client!uaa", name = "g", descriptor = "Lclient!cb;")
	private final Class42 aClass42_37;

	@OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "(I)V")
	public Class288(@OriginalArg(0) int arg0) {
		this.anInt8370 = arg0;
		this.anInt8371 = arg0;
		@Pc(14) int local14;
		for (local14 = 1; arg0 > local14 + local14; local14 += local14) {
		}
		this.aClass42_37 = new Class42(local14);
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)I")
	public int method6731() {
		@Pc(7) int local7 = 0;
		for (@Pc(13) Class5_Sub2_Sub11 local13 = (Class5_Sub2_Sub11) this.aClass187_10.method4805(); local13 != null; local13 = (Class5_Sub2_Sub11) this.aClass187_10.method4810()) {
			if (!local13.method5024()) {
				local7++;
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IJLjava/lang/Object;I)V")
	private void method6732(@OriginalArg(1) long arg0, @OriginalArg(2) Object arg1) {
		if (this.anInt8371 < 1) {
			throw new IllegalStateException("s>cs");
		}
		this.method6741(arg0);
		this.anInt8370--;
		while (this.anInt8370 < 0) {
			@Pc(42) Class5_Sub2_Sub11 local42 = (Class5_Sub2_Sub11) this.aClass187_10.method4802();
			this.method6737(local42);
		}
		@Pc(58) Class5_Sub2_Sub11_Sub2 local58 = new Class5_Sub2_Sub11_Sub2(arg1, 1);
		this.aClass42_37.method1106(arg0, local58);
		this.aClass187_10.method4807(local58);
		local58.aLong252 = 0L;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Z)Ljava/lang/Object;")
	public Object method6733() {
		@Pc(18) Class5_Sub2_Sub11 local18 = (Class5_Sub2_Sub11) this.aClass42_37.method1105();
		while (local18 != null) {
			@Pc(24) Object local24 = local18.method5022();
			if (local24 != null) {
				return local24;
			}
			@Pc(28) Class5_Sub2_Sub11 local28 = local18;
			local18 = (Class5_Sub2_Sub11) this.aClass42_37.method1105();
			local28.method7425();
			local28.method7323();
			this.anInt8370 += local18.anInt6040;
		}
		return null;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(I)I")
	public int method6734() {
		return this.anInt8371;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IB)V")
	public void method6735(@OriginalArg(0) int arg0) {
		if (Static454.aClass109_1 == null) {
			return;
		}
		for (@Pc(19) Class5_Sub2_Sub11 local19 = (Class5_Sub2_Sub11) this.aClass187_10.method4805(); local19 != null; local19 = (Class5_Sub2_Sub11) this.aClass187_10.method4810()) {
			if (local19.method5024()) {
				if (local19.method5022() == null) {
					local19.method7425();
					local19.method7323();
					this.anInt8370++;
				}
			} else if ((long) arg0 < ++local19.aLong252) {
				@Pc(63) Class5_Sub2_Sub11 local63 = Static454.aClass109_1.method2817(local19);
				this.aClass42_37.method1106(local19.aLong253, local63);
				Static394.method5747(local19, local63);
				local19.method7425();
				local19.method7323();
			}
		}
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BLclient!ow;)V")
	private void method6737(@OriginalArg(1) Class5_Sub2_Sub11 arg0) {
		if (arg0 != null) {
			arg0.method7425();
			arg0.method7323();
			this.anInt8370 += arg0.anInt6040;
		}
	}

	@OriginalMember(owner = "client!uaa", name = "c", descriptor = "(I)I")
	public int method6738() {
		return this.anInt8370;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(JB)V")
	private void method6741(@OriginalArg(0) long arg0) {
		@Pc(17) Class5_Sub2_Sub11 local17 = (Class5_Sub2_Sub11) this.aClass42_37.method1109(arg0);
		this.method6737(local17);
	}

	@OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)V")
	public void method6742() {
		for (@Pc(11) Class5_Sub2_Sub11 local11 = (Class5_Sub2_Sub11) this.aClass187_10.method4805(); local11 != null; local11 = (Class5_Sub2_Sub11) this.aClass187_10.method4810()) {
			if (local11.method5024()) {
				local11.method7425();
				local11.method7323();
				this.anInt8370 += local11.anInt6040;
			}
		}
	}

	@OriginalMember(owner = "client!uaa", name = "e", descriptor = "(I)Ljava/lang/Object;")
	public Object method6743() {
		@Pc(20) Class5_Sub2_Sub11 local20 = (Class5_Sub2_Sub11) this.aClass42_37.method1103();
		while (local20 != null) {
			@Pc(26) Object local26 = local20.method5022();
			if (local26 != null) {
				return local26;
			}
			@Pc(32) Class5_Sub2_Sub11 local32 = local20;
			local20 = (Class5_Sub2_Sub11) this.aClass42_37.method1105();
			local32.method7425();
			local32.method7323();
			this.anInt8370 += local20.anInt6040;
		}
		return null;
	}

	@OriginalMember(owner = "client!uaa", name = "f", descriptor = "(I)V")
	public void method6744() {
		this.aClass187_10.method4808();
		this.aClass42_37.method1108();
		this.anInt8370 = this.anInt8371;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZJ)Ljava/lang/Object;")
	public Object method6745(@OriginalArg(1) long arg0) {
		@Pc(10) Class5_Sub2_Sub11 local10 = (Class5_Sub2_Sub11) this.aClass42_37.method1109(arg0);
		if (local10 == null) {
			return null;
		}
		@Pc(25) Object local25 = local10.method5022();
		if (local25 == null) {
			local10.method7425();
			local10.method7323();
			this.anInt8370 += local10.anInt6040;
			return null;
		}
		if (local10.method5024()) {
			@Pc(63) Class5_Sub2_Sub11_Sub2 local63 = new Class5_Sub2_Sub11_Sub2(local25, local10.anInt6040);
			this.aClass42_37.method1106(local10.aLong253, local63);
			this.aClass187_10.method4807(local63);
			local63.aLong252 = 0L;
			local10.method7425();
			local10.method7323();
		} else {
			this.aClass187_10.method4807(local10);
			local10.aLong252 = 0L;
		}
		return local25;
	}

	@OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Ljava/lang/Object;JI)V")
	public void method6746(@OriginalArg(0) Object arg0, @OriginalArg(1) long arg1) {
		this.method6732(arg1, arg0);
	}
}
