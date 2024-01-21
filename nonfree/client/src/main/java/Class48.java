import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZCVCEQHJ")
public final class Class48 {

	@OriginalMember(owner = "client!ZCVCEQHJ", name = "f", descriptor = "Lclient!AJSSLSFA;")
	private Class2 aClass2_42;

	@OriginalMember(owner = "client!ZCVCEQHJ", name = "a", descriptor = "Z")
	private boolean aBoolean213 = false;

	@OriginalMember(owner = "client!ZCVCEQHJ", name = "b", descriptor = "Z")
	private boolean aBoolean214 = true;

	@OriginalMember(owner = "client!ZCVCEQHJ", name = "c", descriptor = "Z")
	private boolean aBoolean215 = false;

	@OriginalMember(owner = "client!ZCVCEQHJ", name = "d", descriptor = "I")
	private int anInt764 = 1;

	@OriginalMember(owner = "client!ZCVCEQHJ", name = "e", descriptor = "Lclient!AJSSLSFA;")
	private Class2 aClass2_41 = new Class2();

	@OriginalMember(owner = "client!ZCVCEQHJ", name = "<init>", descriptor = "(I)V")
	public Class48(@OriginalArg(0) int arg0) {
		try {
			this.aClass2_41.aClass2_39 = this.aClass2_41;
			this.aClass2_41.aClass2_40 = this.aClass2_41;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("91531, " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCVCEQHJ", name = "a", descriptor = "(Lclient!AJSSLSFA;)V")
	public void method562(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_40 != null) {
			arg0.method558();
		}
		arg0.aClass2_40 = this.aClass2_41.aClass2_40;
		arg0.aClass2_39 = this.aClass2_41;
		arg0.aClass2_40.aClass2_39 = arg0;
		arg0.aClass2_39.aClass2_40 = arg0;
	}

	@OriginalMember(owner = "client!ZCVCEQHJ", name = "a", descriptor = "(Lclient!AJSSLSFA;I)V")
	public void method563(@OriginalArg(0) Class2 arg0) {
		try {
			if (arg0.aClass2_40 != null) {
				arg0.method558();
			}
			arg0.aClass2_40 = this.aClass2_41;
			arg0.aClass2_39 = this.aClass2_41.aClass2_39;
			arg0.aClass2_40.aClass2_39 = arg0;
			arg0.aClass2_39.aClass2_40 = arg0;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("87282, " + arg0 + ", " + 0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCVCEQHJ", name = "a", descriptor = "()Lclient!AJSSLSFA;")
	public Class2 method564() {
		@Pc(3) Class2 local3 = this.aClass2_41.aClass2_39;
		if (local3 == this.aClass2_41) {
			return null;
		} else {
			local3.method558();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ZCVCEQHJ", name = "b", descriptor = "()Lclient!AJSSLSFA;")
	public Class2 method565() {
		@Pc(3) Class2 local3 = this.aClass2_41.aClass2_39;
		if (local3 == this.aClass2_41) {
			this.aClass2_42 = null;
			return null;
		} else {
			this.aClass2_42 = local3.aClass2_39;
			return local3;
		}
	}

	@OriginalMember(owner = "client!ZCVCEQHJ", name = "a", descriptor = "(Z)Lclient!AJSSLSFA;")
	public Class2 method566(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(3) Class2 local3 = this.aClass2_41.aClass2_40;
			if (!arg0) {
				throw new NullPointerException();
			} else if (local3 == this.aClass2_41) {
				this.aClass2_42 = null;
				return null;
			} else {
				this.aClass2_42 = local3.aClass2_40;
				return local3;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("98126, " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCVCEQHJ", name = "a", descriptor = "(I)Lclient!AJSSLSFA;")
	public Class2 method567() {
		try {
			@Pc(11) Class2 local11 = this.aClass2_42;
			if (local11 == this.aClass2_41) {
				this.aClass2_42 = null;
				return null;
			} else {
				this.aClass2_42 = local11.aClass2_39;
				return local11;
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("734, " + -314 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCVCEQHJ", name = "b", descriptor = "(Z)Lclient!AJSSLSFA;")
	public Class2 method568() {
		try {
			@Pc(8) Class2 local8 = this.aClass2_42;
			if (local8 == this.aClass2_41) {
				this.aClass2_42 = null;
				return null;
			} else {
				this.aClass2_42 = local8.aClass2_40;
				return local8;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("65205, " + true + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZCVCEQHJ", name = "c", descriptor = "()V")
	public void method569() {
		if (this.aClass2_41.aClass2_39 == this.aClass2_41) {
			return;
		}
		while (true) {
			@Pc(10) Class2 local10 = this.aClass2_41.aClass2_39;
			if (local10 == this.aClass2_41) {
				return;
			}
			local10.method558();
		}
	}
}
