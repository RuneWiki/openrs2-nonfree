import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZEEWTYXI")
public final class Class49 {

	@OriginalMember(owner = "client!ZEEWTYXI", name = "g", descriptor = "Lclient!ZMCAQRHG;")
	private Class8 aClass8_40;

	@OriginalMember(owner = "client!ZEEWTYXI", name = "a", descriptor = "Z")
	private boolean aBoolean176 = true;

	@OriginalMember(owner = "client!ZEEWTYXI", name = "b", descriptor = "Z")
	private boolean aBoolean177 = true;

	@OriginalMember(owner = "client!ZEEWTYXI", name = "c", descriptor = "I")
	private int anInt798 = -39373;

	@OriginalMember(owner = "client!ZEEWTYXI", name = "d", descriptor = "I")
	private int anInt799 = 10853;

	@OriginalMember(owner = "client!ZEEWTYXI", name = "f", descriptor = "Lclient!ZMCAQRHG;")
	private Class8 aClass8_39 = new Class8();

	@OriginalMember(owner = "client!ZEEWTYXI", name = "e", descriptor = "I")
	private int anInt800;

	@OriginalMember(owner = "client!ZEEWTYXI", name = "<init>", descriptor = "(I)V")
	public Class49(@OriginalArg(0) int arg0) {
		try {
			this.aClass8_39.aClass8_41 = this.aClass8_39;
			this.aClass8_39.aClass8_42 = this.aClass8_39;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("2702, " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZEEWTYXI", name = "a", descriptor = "(Lclient!ZMCAQRHG;)V")
	public void method535(@OriginalArg(0) Class8 arg0) {
		if (arg0.aClass8_42 != null) {
			arg0.method543();
		}
		arg0.aClass8_42 = this.aClass8_39.aClass8_42;
		arg0.aClass8_41 = this.aClass8_39;
		arg0.aClass8_42.aClass8_41 = arg0;
		arg0.aClass8_41.aClass8_42 = arg0;
	}

	@OriginalMember(owner = "client!ZEEWTYXI", name = "a", descriptor = "(Lclient!ZMCAQRHG;I)V")
	public void method536(@OriginalArg(0) Class8 arg0) {
		try {
			if (arg0.aClass8_42 != null) {
				arg0.method543();
			}
			arg0.aClass8_42 = this.aClass8_39;
			arg0.aClass8_41 = this.aClass8_39.aClass8_41;
			arg0.aClass8_42.aClass8_41 = arg0;
			arg0.aClass8_41.aClass8_42 = arg0;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("1658, " + arg0 + ", " + 0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZEEWTYXI", name = "a", descriptor = "()Lclient!ZMCAQRHG;")
	public Class8 method537() {
		@Pc(3) Class8 local3 = this.aClass8_39.aClass8_41;
		if (local3 == this.aClass8_39) {
			return null;
		} else {
			local3.method543();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ZEEWTYXI", name = "b", descriptor = "()Lclient!ZMCAQRHG;")
	public Class8 method538() {
		@Pc(3) Class8 local3 = this.aClass8_39.aClass8_41;
		if (local3 == this.aClass8_39) {
			this.aClass8_40 = null;
			return null;
		} else {
			this.aClass8_40 = local3.aClass8_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!ZEEWTYXI", name = "a", descriptor = "(Z)Lclient!ZMCAQRHG;")
	public Class8 method539() {
		try {
			@Pc(3) Class8 local3 = this.aClass8_39.aClass8_42;
			if (local3 == this.aClass8_39) {
				this.aClass8_40 = null;
				return null;
			} else {
				this.aClass8_40 = local3.aClass8_42;
				return local3;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("99187, " + true + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZEEWTYXI", name = "a", descriptor = "(B)Lclient!ZMCAQRHG;")
	public Class8 method540(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(13) Class8 local13 = this.aClass8_40;
			if (local13 == this.aClass8_39) {
				this.aClass8_40 = null;
				return null;
			} else {
				this.aClass8_40 = local13.aClass8_41;
				return local13;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("75985, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZEEWTYXI", name = "a", descriptor = "(I)Lclient!ZMCAQRHG;")
	public Class8 method541() {
		try {
			@Pc(2) Class8 local2 = this.aClass8_40;
			if (local2 == this.aClass8_39) {
				this.aClass8_40 = null;
				return null;
			} else {
				this.aClass8_40 = local2.aClass8_42;
				return local2;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("83062, " + -79 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZEEWTYXI", name = "c", descriptor = "()V")
	public void method542() {
		if (this.aClass8_39.aClass8_41 == this.aClass8_39) {
			return;
		}
		while (true) {
			@Pc(10) Class8 local10 = this.aClass8_39.aClass8_41;
			if (local10 == this.aClass8_39) {
				return;
			}
			local10.method543();
		}
	}
}
