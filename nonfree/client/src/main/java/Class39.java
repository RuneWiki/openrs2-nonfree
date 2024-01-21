import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!URASIGRB")
public final class Class39 {

	@OriginalMember(owner = "client!URASIGRB", name = "g", descriptor = "Lclient!OKDOXVFL;")
	private Class6 aClass6_36;

	@OriginalMember(owner = "client!URASIGRB", name = "a", descriptor = "I")
	private int anInt686 = -21624;

	@OriginalMember(owner = "client!URASIGRB", name = "b", descriptor = "Z")
	private boolean aBoolean178 = false;

	@OriginalMember(owner = "client!URASIGRB", name = "c", descriptor = "I")
	private int anInt687 = 10369;

	@OriginalMember(owner = "client!URASIGRB", name = "d", descriptor = "Z")
	private boolean aBoolean179 = false;

	@OriginalMember(owner = "client!URASIGRB", name = "e", descriptor = "B")
	private byte aByte27 = -111;

	@OriginalMember(owner = "client!URASIGRB", name = "f", descriptor = "Lclient!OKDOXVFL;")
	private Class6 aClass6_35 = new Class6();

	@OriginalMember(owner = "client!URASIGRB", name = "<init>", descriptor = "(I)V")
	public Class39(@OriginalArg(0) int arg0) {
		try {
			this.aClass6_35.aClass6_41 = this.aClass6_35;
			this.aClass6_35.aClass6_42 = this.aClass6_35;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("40291, " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URASIGRB", name = "a", descriptor = "(Lclient!OKDOXVFL;)V")
	public void method456(@OriginalArg(0) Class6 arg0) {
		if (arg0.aClass6_42 != null) {
			arg0.method512();
		}
		arg0.aClass6_42 = this.aClass6_35.aClass6_42;
		arg0.aClass6_41 = this.aClass6_35;
		arg0.aClass6_42.aClass6_41 = arg0;
		arg0.aClass6_41.aClass6_42 = arg0;
	}

	@OriginalMember(owner = "client!URASIGRB", name = "a", descriptor = "(ILclient!OKDOXVFL;)V")
	public void method457(@OriginalArg(1) Class6 arg0) {
		try {
			if (arg0.aClass6_42 != null) {
				arg0.method512();
			}
			arg0.aClass6_42 = this.aClass6_35;
			arg0.aClass6_41 = this.aClass6_35.aClass6_41;
			arg0.aClass6_42.aClass6_41 = arg0;
			arg0.aClass6_41.aClass6_42 = arg0;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("50385, " + -728 + ", " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URASIGRB", name = "a", descriptor = "()Lclient!OKDOXVFL;")
	public Class6 method458() {
		@Pc(3) Class6 local3 = this.aClass6_35.aClass6_41;
		if (local3 == this.aClass6_35) {
			return null;
		} else {
			local3.method512();
			return local3;
		}
	}

	@OriginalMember(owner = "client!URASIGRB", name = "b", descriptor = "()Lclient!OKDOXVFL;")
	public Class6 method459() {
		@Pc(3) Class6 local3 = this.aClass6_35.aClass6_41;
		if (local3 == this.aClass6_35) {
			this.aClass6_36 = null;
			return null;
		} else {
			this.aClass6_36 = local3.aClass6_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!URASIGRB", name = "a", descriptor = "(B)Lclient!OKDOXVFL;")
	public Class6 method460() {
		try {
			@Pc(9) Class6 local9 = this.aClass6_35.aClass6_42;
			if (local9 == this.aClass6_35) {
				this.aClass6_36 = null;
				return null;
			} else {
				this.aClass6_36 = local9.aClass6_42;
				return local9;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("81332, " + -97 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URASIGRB", name = "a", descriptor = "(Z)Lclient!OKDOXVFL;")
	public Class6 method461() {
		try {
			@Pc(12) Class6 local12 = this.aClass6_36;
			if (local12 == this.aClass6_35) {
				this.aClass6_36 = null;
				return null;
			} else {
				this.aClass6_36 = local12.aClass6_41;
				return local12;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("1154, " + false + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URASIGRB", name = "b", descriptor = "(Z)Lclient!OKDOXVFL;")
	public Class6 method462() {
		try {
			@Pc(2) Class6 local2 = this.aClass6_36;
			if (local2 == this.aClass6_35) {
				this.aClass6_36 = null;
				return null;
			} else {
				this.aClass6_36 = local2.aClass6_42;
				return local2;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("70989, " + false + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!URASIGRB", name = "c", descriptor = "()V")
	public void method463() {
		if (this.aClass6_35.aClass6_41 == this.aClass6_35) {
			return;
		}
		while (true) {
			@Pc(10) Class6 local10 = this.aClass6_35.aClass6_41;
			if (local10 == this.aClass6_35) {
				return;
			}
			local10.method512();
		}
	}
}
