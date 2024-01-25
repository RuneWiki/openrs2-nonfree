import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hn")
public final class Class146 {

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "Lclient!jw;")
	private Class183 aClass183_16;

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "I")
	private int anInt4200;

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "Lclient!jw;")
	public Class183 aClass183_17;

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!hn", name = "o", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "Ljava/lang/String;")
	private String aString43 = "null";

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
	private void method3564() {
		this.aClass183_16 = new Class183(this.aClass183_17.method4288());
		for (@Pc(20) Class4_Sub46 local20 = (Class4_Sub46) this.aClass183_17.method4286(); local20 != null; local20 = (Class4_Sub46) this.aClass183_17.method4283()) {
			@Pc(31) Class4_Sub34 local31 = new Class4_Sub34(local20.aString95, (int) local20.aLong307);
			this.aClass183_16.method4282(Static150.method7296(local20.aString95), local31);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)Z")
	public boolean method3566(@OriginalArg(1) int arg0) {
		if (this.aClass183_17 == null) {
			return false;
		}
		if (this.aClass183_16 == null) {
			this.method3575();
		}
		@Pc(27) Class4_Sub33 local27 = (Class4_Sub33) this.aClass183_16.method4289((long) arg0);
		return local27 != null;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!eh;II)V")
	private void method3568(@OriginalArg(0) Class4_Sub9 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar3 = Static413.method5932(arg0.method6021());
		} else if (arg1 == 2) {
			this.aChar2 = Static413.method5932(arg0.method6021());
		} else if (arg1 == 3) {
			this.aString43 = arg0.method6010();
		} else if (arg1 == 4) {
			this.anInt4200 = arg0.method6026();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(58) int local58 = arg0.method5982();
			this.aClass183_17 = new Class183(Static514.method7261(local58));
			for (@Pc(68) int local68 = 0; local68 < local58; local68++) {
				@Pc(74) int local74 = arg0.method6026();
				@Pc(86) Class4 local86;
				if (arg1 == 5) {
					local86 = new Class4_Sub46(arg0.method6010());
				} else {
					local86 = new Class4_Sub33(arg0.method6026());
				}
				this.aClass183_17.method4282((long) local74, local86);
			}
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(ILclient!eh;)V")
	public void method3570(@OriginalArg(1) Class4_Sub9 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method6015();
			if (local7 == 0) {
				return;
			}
			this.method3568(arg0, local7);
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLjava/lang/String;)Z")
	public boolean method3571(@OriginalArg(1) String arg0) {
		if (this.aClass183_17 == null) {
			return false;
		}
		if (this.aClass183_16 == null) {
			this.method3564();
		}
		for (@Pc(32) Class4_Sub34 local32 = (Class4_Sub34) this.aClass183_16.method4289(Static150.method7296(arg0)); local32 != null; local32 = (Class4_Sub34) this.aClass183_16.method4290()) {
			if (local32.aString73.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method3572(@OriginalArg(0) int arg0) {
		if (this.aClass183_17 == null) {
			return this.aString43;
		} else {
			@Pc(24) Class4_Sub46 local24 = (Class4_Sub46) this.aClass183_17.method4289((long) arg0);
			return local24 == null ? this.aString43 : local24.aString95;
		}
	}

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(IB)I")
	public int method3573(@OriginalArg(0) int arg0) {
		if (this.aClass183_17 == null) {
			return this.anInt4200;
		} else {
			@Pc(22) Class4_Sub33 local22 = (Class4_Sub33) this.aClass183_17.method4289((long) arg0);
			return local22 == null ? this.anInt4200 : local22.anInt6079;
		}
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Z)V")
	private void method3575() {
		this.aClass183_16 = new Class183(this.aClass183_17.method4288());
		for (@Pc(20) Class4_Sub33 local20 = (Class4_Sub33) this.aClass183_17.method4286(); local20 != null; local20 = (Class4_Sub33) this.aClass183_17.method4283()) {
			@Pc(35) Class4_Sub33 local35 = new Class4_Sub33((int) local20.aLong307);
			this.aClass183_16.method4282((long) local20.anInt6079, local35);
		}
	}
}
