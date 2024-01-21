import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OUZUCGGU")
public final class Class32 {

	@OriginalMember(owner = "client!OUZUCGGU", name = "b", descriptor = "Lclient!ICYTWAKR;")
	private Class1 aClass1_34;

	@OriginalMember(owner = "client!OUZUCGGU", name = "a", descriptor = "Lclient!ICYTWAKR;")
	private Class1 aClass1_33 = new Class1();

	@OriginalMember(owner = "client!OUZUCGGU", name = "<init>", descriptor = "(I)V")
	public Class32(@OriginalArg(0) int arg0) {
		try {
			this.aClass1_33.aClass1_41 = this.aClass1_33;
			this.aClass1_33.aClass1_42 = this.aClass1_33;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("91044, " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OUZUCGGU", name = "a", descriptor = "(Lclient!ICYTWAKR;)V")
	public void method333(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_42 != null) {
			arg0.method544();
		}
		arg0.aClass1_42 = this.aClass1_33.aClass1_42;
		arg0.aClass1_41 = this.aClass1_33;
		arg0.aClass1_42.aClass1_41 = arg0;
		arg0.aClass1_41.aClass1_42 = arg0;
	}

	@OriginalMember(owner = "client!OUZUCGGU", name = "a", descriptor = "(Lclient!ICYTWAKR;I)V")
	public void method334(@OriginalArg(0) Class1 arg0) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method544();
			}
			arg0.aClass1_42 = this.aClass1_33;
			arg0.aClass1_41 = this.aClass1_33.aClass1_41;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("16958, " + arg0 + ", " + -15393 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OUZUCGGU", name = "a", descriptor = "()Lclient!ICYTWAKR;")
	public Class1 method335() {
		@Pc(3) Class1 local3 = this.aClass1_33.aClass1_41;
		if (local3 == this.aClass1_33) {
			return null;
		} else {
			local3.method544();
			return local3;
		}
	}

	@OriginalMember(owner = "client!OUZUCGGU", name = "b", descriptor = "()Lclient!ICYTWAKR;")
	public Class1 method336() {
		@Pc(3) Class1 local3 = this.aClass1_33.aClass1_41;
		if (local3 == this.aClass1_33) {
			this.aClass1_34 = null;
			return null;
		} else {
			this.aClass1_34 = local3.aClass1_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!OUZUCGGU", name = "a", descriptor = "(Z)Lclient!ICYTWAKR;")
	public Class1 method337() {
		try {
			@Pc(3) Class1 local3 = this.aClass1_33.aClass1_42;
			if (local3 == this.aClass1_33) {
				this.aClass1_34 = null;
				return null;
			} else {
				this.aClass1_34 = local3.aClass1_42;
				return local3;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("96674, " + true + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OUZUCGGU", name = "b", descriptor = "(Z)Lclient!ICYTWAKR;")
	public Class1 method338() {
		try {
			@Pc(8) Class1 local8 = this.aClass1_34;
			if (local8 == this.aClass1_33) {
				this.aClass1_34 = null;
				return null;
			} else {
				this.aClass1_34 = local8.aClass1_41;
				return local8;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("26263, " + true + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OUZUCGGU", name = "a", descriptor = "(I)Lclient!ICYTWAKR;")
	public Class1 method339() {
		try {
			@Pc(2) Class1 local2 = this.aClass1_34;
			if (local2 == this.aClass1_33) {
				this.aClass1_34 = null;
				return null;
			} else {
				this.aClass1_34 = local2.aClass1_42;
				return local2;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("67661, " + 1837 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OUZUCGGU", name = "c", descriptor = "()V")
	public void method340() {
		if (this.aClass1_33.aClass1_41 == this.aClass1_33) {
			return;
		}
		while (true) {
			@Pc(10) Class1 local10 = this.aClass1_33.aClass1_41;
			if (local10 == this.aClass1_33) {
				return;
			}
			local10.method544();
		}
	}
}
