import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JQSVNFRT")
public final class Class23 {

	@OriginalMember(owner = "client!JQSVNFRT", name = "g", descriptor = "Lclient!IHAIACWA;")
	private Class4 aClass4_28;

	@OriginalMember(owner = "client!JQSVNFRT", name = "a", descriptor = "I")
	private int anInt392 = 518;

	@OriginalMember(owner = "client!JQSVNFRT", name = "b", descriptor = "Z")
	private boolean aBoolean126 = false;

	@OriginalMember(owner = "client!JQSVNFRT", name = "c", descriptor = "Z")
	private boolean aBoolean127 = true;

	@OriginalMember(owner = "client!JQSVNFRT", name = "d", descriptor = "I")
	private int anInt393 = -558;

	@OriginalMember(owner = "client!JQSVNFRT", name = "e", descriptor = "I")
	private int anInt394 = 691;

	@OriginalMember(owner = "client!JQSVNFRT", name = "f", descriptor = "Lclient!IHAIACWA;")
	private Class4 aClass4_27 = new Class4();

	@OriginalMember(owner = "client!JQSVNFRT", name = "<init>", descriptor = "(I)V")
	public Class23(@OriginalArg(0) int arg0) {
		try {
			this.aClass4_27.aClass4_41 = this.aClass4_27;
			this.aClass4_27.aClass4_42 = this.aClass4_27;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("95263, " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JQSVNFRT", name = "a", descriptor = "(Lclient!IHAIACWA;)V")
	public void method312(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_42 != null) {
			arg0.method528();
		}
		arg0.aClass4_42 = this.aClass4_27.aClass4_42;
		arg0.aClass4_41 = this.aClass4_27;
		arg0.aClass4_42.aClass4_41 = arg0;
		arg0.aClass4_41.aClass4_42 = arg0;
	}

	@OriginalMember(owner = "client!JQSVNFRT", name = "a", descriptor = "(Lclient!IHAIACWA;I)V")
	public void method313(@OriginalArg(0) Class4 arg0) {
		try {
			if (arg0.aClass4_42 != null) {
				arg0.method528();
			}
			arg0.aClass4_42 = this.aClass4_27;
			arg0.aClass4_41 = this.aClass4_27.aClass4_41;
			arg0.aClass4_42.aClass4_41 = arg0;
			arg0.aClass4_41.aClass4_42 = arg0;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("11790, " + arg0 + ", " + -558 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JQSVNFRT", name = "a", descriptor = "()Lclient!IHAIACWA;")
	public Class4 method314() {
		@Pc(3) Class4 local3 = this.aClass4_27.aClass4_41;
		if (local3 == this.aClass4_27) {
			return null;
		} else {
			local3.method528();
			return local3;
		}
	}

	@OriginalMember(owner = "client!JQSVNFRT", name = "b", descriptor = "()Lclient!IHAIACWA;")
	public Class4 method315() {
		@Pc(3) Class4 local3 = this.aClass4_27.aClass4_41;
		if (local3 == this.aClass4_27) {
			this.aClass4_28 = null;
			return null;
		} else {
			this.aClass4_28 = local3.aClass4_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!JQSVNFRT", name = "a", descriptor = "(I)Lclient!IHAIACWA;")
	public Class4 method316() {
		try {
			@Pc(3) Class4 local3 = this.aClass4_27.aClass4_42;
			if (local3 == this.aClass4_27) {
				this.aClass4_28 = null;
				return null;
			} else {
				this.aClass4_28 = local3.aClass4_42;
				return local3;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("76384, " + 3 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JQSVNFRT", name = "b", descriptor = "(I)Lclient!IHAIACWA;")
	public Class4 method317() {
		try {
			@Pc(2) Class4 local2 = this.aClass4_28;
			if (local2 == this.aClass4_27) {
				this.aClass4_28 = null;
				return null;
			} else {
				this.aClass4_28 = local2.aClass4_41;
				return local2;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("40580, " + -125 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JQSVNFRT", name = "a", descriptor = "(B)Lclient!IHAIACWA;")
	public Class4 method318() {
		try {
			@Pc(2) Class4 local2 = this.aClass4_28;
			if (local2 == this.aClass4_27) {
				this.aClass4_28 = null;
				return null;
			} else {
				this.aClass4_28 = local2.aClass4_42;
				return local2;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("40160, " + -128 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JQSVNFRT", name = "c", descriptor = "()V")
	public void method319() {
		if (this.aClass4_27.aClass4_41 == this.aClass4_27) {
			return;
		}
		while (true) {
			@Pc(10) Class4 local10 = this.aClass4_27.aClass4_41;
			if (local10 == this.aClass4_27) {
				return;
			}
			local10.method528();
		}
	}
}
