import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SXQMCHPP")
public final class Class38 {

	@OriginalMember(owner = "client!SXQMCHPP", name = "d", descriptor = "Lclient!YNSWJIIM;")
	private Class2 aClass2_36;

	@OriginalMember(owner = "client!SXQMCHPP", name = "a", descriptor = "I")
	private int anInt594 = -76;

	@OriginalMember(owner = "client!SXQMCHPP", name = "b", descriptor = "Z")
	private boolean aBoolean160 = false;

	@OriginalMember(owner = "client!SXQMCHPP", name = "c", descriptor = "Lclient!YNSWJIIM;")
	private Class2 aClass2_35 = new Class2();

	@OriginalMember(owner = "client!SXQMCHPP", name = "<init>", descriptor = "(I)V")
	public Class38(@OriginalArg(0) int arg0) {
		try {
			this.aClass2_35.aClass2_41 = this.aClass2_35;
			this.aClass2_35.aClass2_42 = this.aClass2_35;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("95936, " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXQMCHPP", name = "a", descriptor = "(Lclient!YNSWJIIM;)V")
	public void method458(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_42 != null) {
			arg0.method562();
		}
		arg0.aClass2_42 = this.aClass2_35.aClass2_42;
		arg0.aClass2_41 = this.aClass2_35;
		arg0.aClass2_42.aClass2_41 = arg0;
		arg0.aClass2_41.aClass2_42 = arg0;
	}

	@OriginalMember(owner = "client!SXQMCHPP", name = "a", descriptor = "(Lclient!YNSWJIIM;I)V")
	public void method459(@OriginalArg(0) Class2 arg0) {
		try {
			if (arg0.aClass2_42 != null) {
				arg0.method562();
			}
			arg0.aClass2_42 = this.aClass2_35;
			arg0.aClass2_41 = this.aClass2_35.aClass2_41;
			arg0.aClass2_42.aClass2_41 = arg0;
			arg0.aClass2_41.aClass2_42 = arg0;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("58869, " + arg0 + ", " + 0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXQMCHPP", name = "a", descriptor = "()Lclient!YNSWJIIM;")
	public Class2 method460() {
		@Pc(3) Class2 local3 = this.aClass2_35.aClass2_41;
		if (local3 == this.aClass2_35) {
			return null;
		} else {
			local3.method562();
			return local3;
		}
	}

	@OriginalMember(owner = "client!SXQMCHPP", name = "b", descriptor = "()Lclient!YNSWJIIM;")
	public Class2 method461() {
		@Pc(3) Class2 local3 = this.aClass2_35.aClass2_41;
		if (local3 == this.aClass2_35) {
			this.aClass2_36 = null;
			return null;
		} else {
			this.aClass2_36 = local3.aClass2_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!SXQMCHPP", name = "a", descriptor = "(B)Lclient!YNSWJIIM;")
	public Class2 method462() {
		try {
			@Pc(3) Class2 local3 = this.aClass2_35.aClass2_42;
			if (local3 == this.aClass2_35) {
				this.aClass2_36 = null;
				return null;
			} else {
				this.aClass2_36 = local3.aClass2_42;
				return local3;
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("99561, " + 61 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXQMCHPP", name = "a", descriptor = "(I)Lclient!YNSWJIIM;")
	public Class2 method463() {
		try {
			@Pc(2) Class2 local2 = this.aClass2_36;
			if (local2 == this.aClass2_35) {
				this.aClass2_36 = null;
				return null;
			} else {
				this.aClass2_36 = local2.aClass2_41;
				return local2;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("37717, " + 0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXQMCHPP", name = "b", descriptor = "(B)Lclient!YNSWJIIM;")
	public Class2 method464(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 6) {
				throw new NullPointerException();
			}
			@Pc(4) boolean local4 = false;
			@Pc(12) Class2 local12 = this.aClass2_36;
			if (local12 == this.aClass2_35) {
				this.aClass2_36 = null;
				return null;
			} else {
				this.aClass2_36 = local12.aClass2_42;
				return local12;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("99088, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SXQMCHPP", name = "c", descriptor = "()V")
	public void method465() {
		if (this.aClass2_35.aClass2_41 == this.aClass2_35) {
			return;
		}
		while (true) {
			@Pc(10) Class2 local10 = this.aClass2_35.aClass2_41;
			if (local10 == this.aClass2_35) {
				return;
			}
			local10.method562();
		}
	}
}
