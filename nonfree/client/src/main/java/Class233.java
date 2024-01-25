import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!st")
public final class Class233 {

	@OriginalMember(owner = "client!st", name = "e", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!st", name = "f", descriptor = "Lclient!ek;")
	public Class67 aClass67_30;

	@OriginalMember(owner = "client!st", name = "i", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!st", name = "m", descriptor = "Lclient!ek;")
	private Class67 aClass67_31;

	@OriginalMember(owner = "client!st", name = "n", descriptor = "I")
	private int anInt6125;

	@OriginalMember(owner = "client!st", name = "h", descriptor = "Ljava/lang/String;")
	private String aString67 = "null";

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method4914(@OriginalArg(0) int arg0) {
		if (this.aClass67_30 == null) {
			return this.aString67;
		} else {
			@Pc(17) Class4_Sub38 local17 = (Class4_Sub38) this.aClass67_30.method1429((long) arg0);
			return local17 == null ? this.aString67 : local17.aString65;
		}
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(IB)I")
	public int method4915(@OriginalArg(0) int arg0) {
		if (this.aClass67_30 == null) {
			return this.anInt6125;
		} else {
			@Pc(25) Class4_Sub24 local25 = (Class4_Sub24) this.aClass67_30.method1429((long) arg0);
			return local25 == null ? this.anInt6125 : local25.anInt4057;
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(ZLjava/lang/String;)Z")
	public boolean method4916(@OriginalArg(1) String arg0) {
		if (this.aClass67_30 == null) {
			return false;
		}
		if (this.aClass67_31 == null) {
			this.method4920();
		}
		for (@Pc(30) Class4_Sub21 local30 = (Class4_Sub21) this.aClass67_31.method1429(Static54.method713(arg0)); local30 != null; local30 = (Class4_Sub21) this.aClass67_31.method1427()) {
			if (local30.aString31.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(IILclient!fh;)V")
	private void method4917(@OriginalArg(0) int arg0, @OriginalArg(2) Class4_Sub9 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static57.method814(arg1.method5063());
		} else if (arg0 == 2) {
			this.aChar4 = Static57.method814(arg1.method5063());
		} else if (arg0 == 3) {
			this.aString67 = arg1.method5038();
		} else if (arg0 == 4) {
			this.anInt6125 = arg1.method4997();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(38) int local38 = arg1.method5028();
			this.aClass67_30 = new Class67(Static171.method2382(local38));
			for (@Pc(48) int local48 = 0; local48 < local38; local48++) {
				@Pc(54) int local54 = arg1.method4997();
				@Pc(64) Class4 local64;
				if (arg0 == 5) {
					local64 = new Class4_Sub38(arg1.method5038());
				} else {
					local64 = new Class4_Sub24(arg1.method4997());
				}
				this.aClass67_30.method1426(local64, (long) local54);
			}
		}
	}

	@OriginalMember(owner = "client!st", name = "b", descriptor = "(I)V")
	private void method4918() {
		this.aClass67_31 = new Class67(this.aClass67_30.method1430());
		for (@Pc(18) Class4_Sub24 local18 = (Class4_Sub24) this.aClass67_30.method1428(); local18 != null; local18 = (Class4_Sub24) this.aClass67_30.method1424()) {
			@Pc(29) Class4_Sub24 local29 = new Class4_Sub24((int) local18.aLong227);
			this.aClass67_31.method1426(local29, (long) local18.anInt4057);
		}
	}

	@OriginalMember(owner = "client!st", name = "a", descriptor = "(Lclient!fh;Z)V")
	public void method4919(@OriginalArg(0) Class4_Sub9 arg0) {
		while (true) {
			@Pc(17) int local17 = arg0.method5007();
			if (local17 == 0) {
				return;
			}
			this.method4917(local17, arg0);
		}
	}

	@OriginalMember(owner = "client!st", name = "c", descriptor = "(I)V")
	private void method4920() {
		this.aClass67_31 = new Class67(this.aClass67_30.method1430());
		for (@Pc(20) Class4_Sub38 local20 = (Class4_Sub38) this.aClass67_30.method1428(); local20 != null; local20 = (Class4_Sub38) this.aClass67_30.method1424()) {
			@Pc(31) Class4_Sub21 local31 = new Class4_Sub21(local20.aString65, (int) local20.aLong227);
			this.aClass67_31.method1426(local31, Static54.method713(local20.aString65));
		}
	}

	@OriginalMember(owner = "client!st", name = "c", descriptor = "(IB)Z")
	public boolean method4921(@OriginalArg(0) int arg0) {
		if (this.aClass67_30 == null) {
			return false;
		}
		if (this.aClass67_31 == null) {
			this.method4918();
		}
		@Pc(27) Class4_Sub24 local27 = (Class4_Sub24) this.aClass67_31.method1429((long) arg0);
		return local27 != null;
	}
}
