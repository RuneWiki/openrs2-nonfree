import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VLUKUYNM")
public final class Class42 {

	@OriginalMember(owner = "client!VLUKUYNM", name = "d", descriptor = "Lclient!OWNYSRQV;")
	private Class5 aClass5_34;

	@OriginalMember(owner = "client!VLUKUYNM", name = "a", descriptor = "I")
	private int anInt593 = 831;

	@OriginalMember(owner = "client!VLUKUYNM", name = "b", descriptor = "Z")
	private boolean aBoolean164 = false;

	@OriginalMember(owner = "client!VLUKUYNM", name = "c", descriptor = "Lclient!OWNYSRQV;")
	private Class5 aClass5_33 = new Class5();

	@OriginalMember(owner = "client!VLUKUYNM", name = "<init>", descriptor = "(B)V")
	public Class42(@OriginalArg(0) byte arg0) {
		try {
			@Pc(16) boolean local16 = false;
			this.aClass5_33.aClass5_41 = this.aClass5_33;
			this.aClass5_33.aClass5_42 = this.aClass5_33;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("26907, " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VLUKUYNM", name = "a", descriptor = "(Lclient!OWNYSRQV;)V")
	public void method296(@OriginalArg(0) Class5 arg0) {
		if (arg0.aClass5_42 != null) {
			arg0.method423();
		}
		arg0.aClass5_42 = this.aClass5_33.aClass5_42;
		arg0.aClass5_41 = this.aClass5_33;
		arg0.aClass5_42.aClass5_41 = arg0;
		arg0.aClass5_41.aClass5_42 = arg0;
	}

	@OriginalMember(owner = "client!VLUKUYNM", name = "a", descriptor = "(Lclient!OWNYSRQV;I)V")
	public void method297(@OriginalArg(0) Class5 arg0) {
		try {
			if (arg0.aClass5_42 != null) {
				arg0.method423();
			}
			arg0.aClass5_42 = this.aClass5_33;
			arg0.aClass5_41 = this.aClass5_33.aClass5_41;
			arg0.aClass5_42.aClass5_41 = arg0;
			arg0.aClass5_41.aClass5_42 = arg0;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("52939, " + arg0 + ", " + 8 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VLUKUYNM", name = "a", descriptor = "()Lclient!OWNYSRQV;")
	public Class5 method298() {
		@Pc(3) Class5 local3 = this.aClass5_33.aClass5_41;
		if (local3 == this.aClass5_33) {
			return null;
		} else {
			local3.method423();
			return local3;
		}
	}

	@OriginalMember(owner = "client!VLUKUYNM", name = "b", descriptor = "()Lclient!OWNYSRQV;")
	public Class5 method299() {
		@Pc(3) Class5 local3 = this.aClass5_33.aClass5_41;
		if (local3 == this.aClass5_33) {
			this.aClass5_34 = null;
			return null;
		} else {
			this.aClass5_34 = local3.aClass5_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!VLUKUYNM", name = "a", descriptor = "(I)Lclient!OWNYSRQV;")
	public Class5 method300() {
		try {
			@Pc(3) Class5 local3 = this.aClass5_33.aClass5_42;
			if (local3 == this.aClass5_33) {
				this.aClass5_34 = null;
				return null;
			} else {
				this.aClass5_34 = local3.aClass5_42;
				return local3;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("91203, " + 46747 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VLUKUYNM", name = "b", descriptor = "(I)Lclient!OWNYSRQV;")
	public Class5 method301(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class5 local2 = this.aClass5_34;
			if (arg0 <= 0) {
				throw new NullPointerException();
			} else if (local2 == this.aClass5_33) {
				this.aClass5_34 = null;
				return null;
			} else {
				this.aClass5_34 = local2.aClass5_41;
				return local2;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("77743, " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VLUKUYNM", name = "c", descriptor = "(I)Lclient!OWNYSRQV;")
	public Class5 method302() {
		try {
			@Pc(14) Class5 local14 = this.aClass5_34;
			if (local14 == this.aClass5_33) {
				this.aClass5_34 = null;
				return null;
			} else {
				this.aClass5_34 = local14.aClass5_42;
				return local14;
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("73387, " + -472 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VLUKUYNM", name = "c", descriptor = "()V")
	public void method303() {
		if (this.aClass5_33.aClass5_41 == this.aClass5_33) {
			return;
		}
		while (true) {
			@Pc(10) Class5 local10 = this.aClass5_33.aClass5_41;
			if (local10 == this.aClass5_33) {
				return;
			}
			local10.method423();
		}
	}
}
