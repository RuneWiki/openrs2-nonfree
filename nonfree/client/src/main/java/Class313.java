import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sp")
public final class Class313 {

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "Lclient!wr;")
	public Class380 aClass380_42;

	@OriginalMember(owner = "client!sp", name = "f", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!sp", name = "l", descriptor = "I")
	private int anInt9221;

	@OriginalMember(owner = "client!sp", name = "m", descriptor = "Lclient!wr;")
	private Class380 aClass380_43;

	@OriginalMember(owner = "client!sp", name = "s", descriptor = "C")
	public char aChar5;

	@OriginalMember(owner = "client!sp", name = "d", descriptor = "Ljava/lang/String;")
	private String aString96 = "null";

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lclient!ji;I)V")
	public void method7524(@OriginalArg(0) Class6_Sub8 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method8246();
			if (local5 == 0) {
				return;
			}
			this.method7531(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method7525(@OriginalArg(0) int arg0) {
		if (this.aClass380_42 == null) {
			return this.aString96;
		} else {
			@Pc(17) Class6_Sub23 local17 = (Class6_Sub23) this.aClass380_42.method8747((long) arg0);
			return local17 == null ? this.aString96 : local17.aString42;
		}
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(IB)Z")
	public boolean method7527(@OriginalArg(0) int arg0) {
		if (this.aClass380_42 == null) {
			return false;
		}
		if (this.aClass380_43 == null) {
			this.method7530();
		}
		@Pc(30) Class6_Sub37 local30 = (Class6_Sub37) this.aClass380_43.method8747((long) arg0);
		return local30 != null;
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(II)I")
	public int method7529(@OriginalArg(0) int arg0) {
		if (this.aClass380_42 == null) {
			return this.anInt9221;
		} else {
			@Pc(17) Class6_Sub37 local17 = (Class6_Sub37) this.aClass380_42.method8747((long) arg0);
			return local17 == null ? this.anInt9221 : local17.anInt7833;
		}
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(B)V")
	private void method7530() {
		this.aClass380_43 = new Class380(this.aClass380_42.method8754());
		for (@Pc(18) Class6_Sub37 local18 = (Class6_Sub37) this.aClass380_42.method8755(); local18 != null; local18 = (Class6_Sub37) this.aClass380_42.method8752()) {
			@Pc(29) Class6_Sub37 local29 = new Class6_Sub37((int) local18.aLong278);
			this.aClass380_43.method8753(local29, (long) local18.anInt7833);
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILclient!ji;I)V")
	private void method7531(@OriginalArg(1) Class6_Sub8 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static111.method2501(arg0.method8208());
		} else if (arg1 == 2) {
			this.aChar5 = Static111.method2501(arg0.method8208());
		} else if (arg1 == 3) {
			this.aString96 = arg0.method8221();
		} else if (arg1 == 4) {
			this.anInt9221 = arg0.method8236();
		} else if (arg1 == 5 || arg1 == 6) {
			@Pc(52) int local52 = arg0.method8220();
			this.aClass380_42 = new Class380(Static101.method2622(local52));
			for (@Pc(62) int local62 = 0; local62 < local52; local62++) {
				@Pc(68) int local68 = arg0.method8236();
				@Pc(80) Class6 local80;
				if (arg1 == 5) {
					local80 = new Class6_Sub23(arg0.method8221());
				} else {
					local80 = new Class6_Sub37(arg0.method8236());
				}
				this.aClass380_42.method8753(local80, (long) local68);
			}
		}
	}

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V")
	private void method7532() {
		this.aClass380_43 = new Class380(this.aClass380_42.method8754());
		for (@Pc(22) Class6_Sub23 local22 = (Class6_Sub23) this.aClass380_42.method8755(); local22 != null; local22 = (Class6_Sub23) this.aClass380_42.method8752()) {
			@Pc(33) Class6_Sub44 local33 = new Class6_Sub44(local22.aString42, (int) local22.aLong278);
			this.aClass380_43.method8753(local33, Static282.method4942(local22.aString42));
		}
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/lang/String;I)Z")
	public boolean method7533(@OriginalArg(0) String arg0) {
		if (this.aClass380_42 == null) {
			return false;
		}
		if (this.aClass380_43 == null) {
			this.method7532();
		}
		for (@Pc(23) Class6_Sub44 local23 = (Class6_Sub44) this.aClass380_43.method8747(Static282.method4942(arg0)); local23 != null; local23 = (Class6_Sub44) this.aClass380_43.method8750()) {
			if (local23.aString84.equals(arg0)) {
				return true;
			}
		}
		return false;
	}
}
