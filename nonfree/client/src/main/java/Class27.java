import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PILILDKN")
public final class Class27 {

	@OriginalMember(owner = "client!PILILDKN", name = "d", descriptor = "Lclient!WYQNTERC;")
	private Class3 aClass3_30;

	@OriginalMember(owner = "client!PILILDKN", name = "a", descriptor = "I")
	private int anInt403 = 3;

	@OriginalMember(owner = "client!PILILDKN", name = "b", descriptor = "I")
	private int anInt404 = 78;

	@OriginalMember(owner = "client!PILILDKN", name = "c", descriptor = "Lclient!WYQNTERC;")
	private Class3 aClass3_29 = new Class3();

	@OriginalMember(owner = "client!PILILDKN", name = "<init>", descriptor = "(Z)V")
	public Class27(@OriginalArg(0) boolean arg0) {
		try {
			this.aClass3_29.aClass3_41 = this.aClass3_29;
			this.aClass3_29.aClass3_42 = this.aClass3_29;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("21095, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PILILDKN", name = "a", descriptor = "(Lclient!WYQNTERC;)V")
	public void method302(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_42 != null) {
			arg0.method535();
		}
		arg0.aClass3_42 = this.aClass3_29.aClass3_42;
		arg0.aClass3_41 = this.aClass3_29;
		arg0.aClass3_42.aClass3_41 = arg0;
		arg0.aClass3_41.aClass3_42 = arg0;
	}

	@OriginalMember(owner = "client!PILILDKN", name = "a", descriptor = "(Lclient!WYQNTERC;Z)V")
	public void method303(@OriginalArg(0) Class3 arg0) {
		try {
			if (arg0.aClass3_42 != null) {
				arg0.method535();
			}
			arg0.aClass3_42 = this.aClass3_29;
			arg0.aClass3_41 = this.aClass3_29.aClass3_41;
			arg0.aClass3_42.aClass3_41 = arg0;
			arg0.aClass3_41.aClass3_42 = arg0;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("18114, " + arg0 + ", " + false + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PILILDKN", name = "a", descriptor = "()Lclient!WYQNTERC;")
	public Class3 method304() {
		@Pc(3) Class3 local3 = this.aClass3_29.aClass3_41;
		if (local3 == this.aClass3_29) {
			return null;
		} else {
			local3.method535();
			return local3;
		}
	}

	@OriginalMember(owner = "client!PILILDKN", name = "b", descriptor = "()Lclient!WYQNTERC;")
	public Class3 method305() {
		@Pc(3) Class3 local3 = this.aClass3_29.aClass3_41;
		if (local3 == this.aClass3_29) {
			this.aClass3_30 = null;
			return null;
		} else {
			this.aClass3_30 = local3.aClass3_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!PILILDKN", name = "a", descriptor = "(I)Lclient!WYQNTERC;")
	public Class3 method306() {
		try {
			@Pc(3) Class3 local3 = this.aClass3_29.aClass3_42;
			if (local3 == this.aClass3_29) {
				this.aClass3_30 = null;
				return null;
			} else {
				this.aClass3_30 = local3.aClass3_42;
				return local3;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("13683, " + 5 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PILILDKN", name = "a", descriptor = "(B)Lclient!WYQNTERC;")
	public Class3 method307() {
		try {
			@Pc(8) Class3 local8 = this.aClass3_30;
			if (local8 == this.aClass3_29) {
				this.aClass3_30 = null;
				return null;
			} else {
				this.aClass3_30 = local8.aClass3_41;
				return local8;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("90570, " + -96 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PILILDKN", name = "b", descriptor = "(I)Lclient!WYQNTERC;")
	public Class3 method308() {
		try {
			@Pc(8) Class3 local8 = this.aClass3_30;
			if (local8 == this.aClass3_29) {
				this.aClass3_30 = null;
				return null;
			} else {
				this.aClass3_30 = local8.aClass3_42;
				return local8;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("56650, " + -552 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PILILDKN", name = "c", descriptor = "()V")
	public void method309() {
		if (this.aClass3_29.aClass3_41 == this.aClass3_29) {
			return;
		}
		while (true) {
			@Pc(10) Class3 local10 = this.aClass3_29.aClass3_41;
			if (local10 == this.aClass3_29) {
				return;
			}
			local10.method535();
		}
	}
}
