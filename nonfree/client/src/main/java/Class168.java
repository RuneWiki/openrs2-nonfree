import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jp")
public final class Class168 {

	@OriginalMember(owner = "client!jp", name = "g", descriptor = "C")
	public char aChar2;

	@OriginalMember(owner = "client!jp", name = "l", descriptor = "Lclient!mo;")
	private Class221 aClass221_13;

	@OriginalMember(owner = "client!jp", name = "n", descriptor = "Lclient!mo;")
	public Class221 aClass221_14;

	@OriginalMember(owner = "client!jp", name = "p", descriptor = "I")
	private int anInt5118;

	@OriginalMember(owner = "client!jp", name = "q", descriptor = "C")
	public char aChar3;

	@OriginalMember(owner = "client!jp", name = "b", descriptor = "Ljava/lang/String;")
	private String aString103 = "null";

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
	private void method3977() {
		this.aClass221_13 = new Class221(this.aClass221_14.method5077());
		for (@Pc(20) Class4_Sub27 local20 = (Class4_Sub27) this.aClass221_14.method5072(); local20 != null; local20 = (Class4_Sub27) this.aClass221_14.method5071()) {
			@Pc(29) Class4_Sub27 local29 = new Class4_Sub27((int) local20.aLong295);
			this.aClass221_13.method5073(local29, (long) local20.anInt4968);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZI)I")
	public int method3980(@OriginalArg(1) int arg0) {
		if (this.aClass221_14 == null) {
			return this.anInt5118;
		} else {
			@Pc(23) Class4_Sub27 local23 = (Class4_Sub27) this.aClass221_14.method5075((long) arg0);
			return local23 == null ? this.anInt5118 : local23.anInt4968;
		}
	}

	@OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)V")
	private void method3981() {
		this.aClass221_13 = new Class221(this.aClass221_14.method5077());
		for (@Pc(26) Class4_Sub11 local26 = (Class4_Sub11) this.aClass221_14.method5072(); local26 != null; local26 = (Class4_Sub11) this.aClass221_14.method5071()) {
			@Pc(37) Class4_Sub38 local37 = new Class4_Sub38(local26.aString37, (int) local26.aLong295);
			this.aClass221_13.method5073(local37, Static23.method884(local26.aString37));
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILjava/lang/String;)Z")
	public boolean method3982(@OriginalArg(1) String arg0) {
		if (this.aClass221_14 == null) {
			return false;
		}
		if (this.aClass221_13 == null) {
			this.method3981();
		}
		for (@Pc(30) Class4_Sub38 local30 = (Class4_Sub38) this.aClass221_13.method5075(Static23.method884(arg0)); local30 != null; local30 = (Class4_Sub38) this.aClass221_13.method5067()) {
			if (local30.aString158.equals(arg0)) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method3983(@OriginalArg(0) int arg0) {
		if (this.aClass221_14 == null) {
			return this.aString103;
		} else {
			@Pc(17) Class4_Sub11 local17 = (Class4_Sub11) this.aClass221_14.method5075((long) arg0);
			return local17 == null ? this.aString103 : local17.aString37;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILclient!ek;I)V")
	private void method3984(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub13 arg1) {
		if (arg0 == 1) {
			this.aChar3 = Static320.method5004(arg1.method7011());
		} else if (arg0 == 2) {
			this.aChar2 = Static320.method5004(arg1.method7011());
		} else if (arg0 == 3) {
			this.aString103 = arg1.method7016();
		} else if (arg0 == 4) {
			this.anInt5118 = arg1.method6990();
		} else if (arg0 == 5 || arg0 == 6) {
			@Pc(49) int local49 = arg1.method7054();
			this.aClass221_14 = new Class221(Static488.method7100(local49));
			for (@Pc(59) int local59 = 0; local59 < local49; local59++) {
				@Pc(65) int local65 = arg1.method6990();
				@Pc(77) Class4 local77;
				if (arg0 == 5) {
					local77 = new Class4_Sub11(arg1.method7016());
				} else {
					local77 = new Class4_Sub27(arg1.method6990());
				}
				this.aClass221_14.method5073(local77, (long) local65);
			}
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!ek;I)V")
	public void method3985(@OriginalArg(0) Class4_Sub13 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method7004();
			if (local11 == 0) {
				return;
			}
			this.method3984(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZ)Z")
	public boolean method3986(@OriginalArg(0) int arg0) {
		if (this.aClass221_14 == null) {
			return false;
		}
		if (this.aClass221_13 == null) {
			this.method3977();
		}
		@Pc(22) Class4_Sub27 local22 = (Class4_Sub27) this.aClass221_13.method5075((long) arg0);
		return local22 != null;
	}
}
