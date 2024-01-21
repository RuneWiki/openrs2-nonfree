import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ob")
public final class Class29 {

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "Lclient!u;")
	private Class1 aClass1_38;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Z")
	private boolean aBoolean207 = true;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
	private int anInt810 = 530;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
	private int anInt811 = 9;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Lclient!u;")
	private Class1 aClass1_37 = new Class1();

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V")
	public Class29(@OriginalArg(0) int arg0) {
		try {
			this.aClass1_37.aClass1_41 = this.aClass1_37;
			this.aClass1_37.aClass1_42 = this.aClass1_37;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("32263, " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!u;)V")
	public void method508(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_42 != null) {
			arg0.method673();
		}
		arg0.aClass1_42 = this.aClass1_37.aClass1_42;
		arg0.aClass1_41 = this.aClass1_37;
		arg0.aClass1_42.aClass1_41 = arg0;
		arg0.aClass1_41.aClass1_42 = arg0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!u;Z)V")
	public void method509(@OriginalArg(0) Class1 arg0) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method673();
			}
			arg0.aClass1_42 = this.aClass1_37;
			arg0.aClass1_41 = this.aClass1_37.aClass1_41;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("99958, " + arg0 + ", " + true + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "()Lclient!u;")
	public Class1 method510() {
		@Pc(3) Class1 local3 = this.aClass1_37.aClass1_41;
		if (local3 == this.aClass1_37) {
			return null;
		} else {
			local3.method673();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "()Lclient!u;")
	public Class1 method511() {
		@Pc(3) Class1 local3 = this.aClass1_37.aClass1_41;
		if (local3 == this.aClass1_37) {
			this.aClass1_38 = null;
			return null;
		} else {
			this.aClass1_38 = local3.aClass1_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Lclient!u;")
	public Class1 method512() {
		try {
			@Pc(3) Class1 local3 = this.aClass1_37.aClass1_42;
			if (local3 == this.aClass1_37) {
				this.aClass1_38 = null;
				return null;
			} else {
				this.aClass1_38 = local3.aClass1_42;
				return local3;
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("11139, " + 8 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)Lclient!u;")
	public Class1 method513() {
		try {
			@Pc(2) Class1 local2 = this.aClass1_38;
			if (local2 == this.aClass1_37) {
				this.aClass1_38 = null;
				return null;
			} else {
				this.aClass1_38 = local2.aClass1_41;
				return local2;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("62942, " + 0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)Lclient!u;")
	public Class1 method514() {
		try {
			@Pc(8) Class1 local8 = this.aClass1_38;
			if (local8 == this.aClass1_37) {
				this.aClass1_38 = null;
				return null;
			} else {
				this.aClass1_38 = local8.aClass1_42;
				return local8;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("23386, " + 831 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "()V")
	public void method515() {
		if (this.aClass1_37.aClass1_41 == this.aClass1_37) {
			return;
		}
		while (true) {
			@Pc(10) Class1 local10 = this.aClass1_37.aClass1_41;
			if (local10 == this.aClass1_37) {
				return;
			}
			local10.method673();
		}
	}
}
