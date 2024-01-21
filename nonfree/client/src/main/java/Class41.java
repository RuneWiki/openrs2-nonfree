import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UEUHLQTT")
public final class Class41 {

	@OriginalMember(owner = "client!UEUHLQTT", name = "d", descriptor = "Lclient!JBHJGXME;")
	private Class5 aClass5_40;

	@OriginalMember(owner = "client!UEUHLQTT", name = "a", descriptor = "Z")
	private boolean aBoolean179 = true;

	@OriginalMember(owner = "client!UEUHLQTT", name = "b", descriptor = "I")
	private int anInt677 = 46794;

	@OriginalMember(owner = "client!UEUHLQTT", name = "c", descriptor = "Lclient!JBHJGXME;")
	private Class5 aClass5_39 = new Class5();

	@OriginalMember(owner = "client!UEUHLQTT", name = "<init>", descriptor = "(I)V")
	public Class41(@OriginalArg(0) int arg0) {
		try {
			this.aClass5_39.aClass5_41 = this.aClass5_39;
			this.aClass5_39.aClass5_42 = this.aClass5_39;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("8457, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UEUHLQTT", name = "a", descriptor = "(Lclient!JBHJGXME;)V")
	public void method465(@OriginalArg(0) Class5 arg0) {
		if (arg0.aClass5_42 != null) {
			arg0.method542();
		}
		arg0.aClass5_42 = this.aClass5_39.aClass5_42;
		arg0.aClass5_41 = this.aClass5_39;
		arg0.aClass5_42.aClass5_41 = arg0;
		arg0.aClass5_41.aClass5_42 = arg0;
	}

	@OriginalMember(owner = "client!UEUHLQTT", name = "a", descriptor = "(Lclient!JBHJGXME;I)V")
	public void method466(@OriginalArg(0) Class5 arg0) {
		try {
			if (arg0.aClass5_42 != null) {
				arg0.method542();
			}
			arg0.aClass5_42 = this.aClass5_39;
			arg0.aClass5_41 = this.aClass5_39.aClass5_41;
			arg0.aClass5_42.aClass5_41 = arg0;
			arg0.aClass5_41.aClass5_42 = arg0;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("46946, " + arg0 + ", " + -757 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UEUHLQTT", name = "a", descriptor = "()Lclient!JBHJGXME;")
	public Class5 method467() {
		@Pc(3) Class5 local3 = this.aClass5_39.aClass5_41;
		if (local3 == this.aClass5_39) {
			return null;
		} else {
			local3.method542();
			return local3;
		}
	}

	@OriginalMember(owner = "client!UEUHLQTT", name = "b", descriptor = "()Lclient!JBHJGXME;")
	public Class5 method468() {
		@Pc(3) Class5 local3 = this.aClass5_39.aClass5_41;
		if (local3 == this.aClass5_39) {
			this.aClass5_40 = null;
			return null;
		} else {
			this.aClass5_40 = local3.aClass5_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!UEUHLQTT", name = "a", descriptor = "(I)Lclient!JBHJGXME;")
	public Class5 method469() {
		try {
			@Pc(3) Class5 local3 = this.aClass5_39.aClass5_42;
			if (local3 == this.aClass5_39) {
				this.aClass5_40 = null;
				return null;
			} else {
				this.aClass5_40 = local3.aClass5_42;
				return local3;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("10823, " + 314 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UEUHLQTT", name = "a", descriptor = "(Z)Lclient!JBHJGXME;")
	public Class5 method470() {
		try {
			@Pc(2) Class5 local2 = this.aClass5_40;
			if (local2 == this.aClass5_39) {
				this.aClass5_40 = null;
				return null;
			} else {
				this.aClass5_40 = local2.aClass5_41;
				return local2;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("12215, " + false + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UEUHLQTT", name = "b", descriptor = "(I)Lclient!JBHJGXME;")
	public Class5 method471(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			@Pc(6) Class5 local6 = this.aClass5_40;
			if (local6 == this.aClass5_39) {
				this.aClass5_40 = null;
				return null;
			} else {
				this.aClass5_40 = local6.aClass5_42;
				return local6;
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("31276, " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UEUHLQTT", name = "c", descriptor = "()V")
	public void method472() {
		if (this.aClass5_39.aClass5_41 == this.aClass5_39) {
			return;
		}
		while (true) {
			@Pc(10) Class5 local10 = this.aClass5_39.aClass5_41;
			if (local10 == this.aClass5_39) {
				return;
			}
			local10.method542();
		}
	}
}
