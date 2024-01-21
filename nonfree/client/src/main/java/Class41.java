import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WTGHTNMN")
public final class Class41 {

	@OriginalMember(owner = "client!WTGHTNMN", name = "b", descriptor = "I")
	private int anInt599;

	@OriginalMember(owner = "client!WTGHTNMN", name = "e", descriptor = "Lclient!OJTWJXEY;")
	private Class2 aClass2_34;

	@OriginalMember(owner = "client!WTGHTNMN", name = "a", descriptor = "I")
	private int anInt598 = 791;

	@OriginalMember(owner = "client!WTGHTNMN", name = "c", descriptor = "Z")
	private boolean aBoolean189 = true;

	@OriginalMember(owner = "client!WTGHTNMN", name = "d", descriptor = "Lclient!OJTWJXEY;")
	private Class2 aClass2_33 = new Class2();

	@OriginalMember(owner = "client!WTGHTNMN", name = "<init>", descriptor = "(I)V")
	public Class41(@OriginalArg(0) int arg0) {
		try {
			this.aClass2_33.aClass2_41 = this.aClass2_33;
			this.aClass2_33.aClass2_42 = this.aClass2_33;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("35816, " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WTGHTNMN", name = "a", descriptor = "(Lclient!OJTWJXEY;)V")
	public void method411(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_42 != null) {
			arg0.method466();
		}
		arg0.aClass2_42 = this.aClass2_33.aClass2_42;
		arg0.aClass2_41 = this.aClass2_33;
		arg0.aClass2_42.aClass2_41 = arg0;
		arg0.aClass2_41.aClass2_42 = arg0;
	}

	@OriginalMember(owner = "client!WTGHTNMN", name = "a", descriptor = "(Lclient!OJTWJXEY;I)V")
	public void method412(@OriginalArg(0) Class2 arg0) {
		try {
			if (arg0.aClass2_42 != null) {
				arg0.method466();
			}
			arg0.aClass2_42 = this.aClass2_33;
			arg0.aClass2_41 = this.aClass2_33.aClass2_41;
			arg0.aClass2_42.aClass2_41 = arg0;
			arg0.aClass2_41.aClass2_42 = arg0;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("64652, " + arg0 + ", " + 0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WTGHTNMN", name = "a", descriptor = "()Lclient!OJTWJXEY;")
	public Class2 method413() {
		@Pc(3) Class2 local3 = this.aClass2_33.aClass2_41;
		if (local3 == this.aClass2_33) {
			return null;
		} else {
			local3.method466();
			return local3;
		}
	}

	@OriginalMember(owner = "client!WTGHTNMN", name = "b", descriptor = "()Lclient!OJTWJXEY;")
	public Class2 method414() {
		@Pc(3) Class2 local3 = this.aClass2_33.aClass2_41;
		if (local3 == this.aClass2_33) {
			this.aClass2_34 = null;
			return null;
		} else {
			this.aClass2_34 = local3.aClass2_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!WTGHTNMN", name = "a", descriptor = "(I)Lclient!OJTWJXEY;")
	public Class2 method415() {
		try {
			@Pc(3) Class2 local3 = this.aClass2_33.aClass2_42;
			if (local3 == this.aClass2_33) {
				this.aClass2_34 = null;
				return null;
			} else {
				this.aClass2_34 = local3.aClass2_42;
				return local3;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("4629, " + 0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WTGHTNMN", name = "a", descriptor = "(Z)Lclient!OJTWJXEY;")
	public Class2 method416() {
		try {
			@Pc(2) Class2 local2 = this.aClass2_34;
			if (local2 == this.aClass2_33) {
				this.aClass2_34 = null;
				return null;
			} else {
				this.aClass2_34 = local2.aClass2_41;
				return local2;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("11300, " + false + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WTGHTNMN", name = "b", descriptor = "(I)Lclient!OJTWJXEY;")
	public Class2 method417() {
		try {
			@Pc(2) Class2 local2 = this.aClass2_34;
			if (local2 == this.aClass2_33) {
				this.aClass2_34 = null;
				return null;
			} else {
				this.aClass2_34 = local2.aClass2_42;
				return local2;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("64797, " + -698 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WTGHTNMN", name = "c", descriptor = "()V")
	public void method418() {
		if (this.aClass2_33.aClass2_41 == this.aClass2_33) {
			return;
		}
		while (true) {
			@Pc(10) Class2 local10 = this.aClass2_33.aClass2_41;
			if (local10 == this.aClass2_33) {
				return;
			}
			local10.method466();
		}
	}
}
