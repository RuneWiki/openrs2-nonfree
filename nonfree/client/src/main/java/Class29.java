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
	private boolean aBoolean222 = false;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Z")
	private boolean aBoolean223 = true;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
	private int anInt784 = 8;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Lclient!u;")
	private Class1 aClass1_37 = new Class1();

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(B)V")
	public Class29(@OriginalArg(0) byte arg0) {
		try {
			@Pc(20) boolean local20 = false;
			this.aClass1_37.aClass1_41 = this.aClass1_37;
			this.aClass1_37.aClass1_42 = this.aClass1_37;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("48820, " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!u;)V")
	public void method500(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_42 != null) {
			arg0.method666();
		}
		arg0.aClass1_42 = this.aClass1_37.aClass1_42;
		arg0.aClass1_41 = this.aClass1_37;
		arg0.aClass1_42.aClass1_41 = arg0;
		arg0.aClass1_41.aClass1_42 = arg0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!u;I)V")
	public void method501(@OriginalArg(0) Class1 arg0) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method666();
			}
			arg0.aClass1_42 = this.aClass1_37;
			arg0.aClass1_41 = this.aClass1_37.aClass1_41;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("62130, " + arg0 + ", " + 1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "()Lclient!u;")
	public Class1 method502() {
		@Pc(3) Class1 local3 = this.aClass1_37.aClass1_41;
		if (local3 == this.aClass1_37) {
			return null;
		} else {
			local3.method666();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "()Lclient!u;")
	public Class1 method503() {
		@Pc(3) Class1 local3 = this.aClass1_37.aClass1_41;
		if (local3 == this.aClass1_37) {
			this.aClass1_38 = null;
			return null;
		} else {
			this.aClass1_38 = local3.aClass1_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)Lclient!u;")
	public Class1 method504(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(3) Class1 local3 = this.aClass1_37.aClass1_42;
			if (local3 == this.aClass1_37) {
				this.aClass1_38 = null;
				return null;
			}
			this.aClass1_38 = local3.aClass1_42;
			if (!arg0) {
				this.aBoolean222 = !this.aBoolean222;
			}
			return local3;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("67520, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Lclient!u;")
	public Class1 method505() {
		try {
			@Pc(2) Class1 local2 = this.aClass1_38;
			if (local2 == this.aClass1_37) {
				this.aClass1_38 = null;
				return null;
			} else {
				this.aClass1_38 = local2.aClass1_41;
				return local2;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("2710, " + 30869 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)Lclient!u;")
	public Class1 method506(@OriginalArg(0) byte arg0) {
		try {
			@Pc(2) Class1 local2 = this.aClass1_38;
			@Pc(7) boolean local7 = false;
			if (local2 == this.aClass1_37) {
				this.aClass1_38 = null;
				return null;
			} else {
				this.aClass1_38 = local2.aClass1_42;
				return local2;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("76900, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "()V")
	public void method507() {
		if (this.aClass1_37.aClass1_41 == this.aClass1_37) {
			return;
		}
		while (true) {
			@Pc(10) Class1 local10 = this.aClass1_37.aClass1_41;
			if (local10 == this.aClass1_37) {
				return;
			}
			local10.method666();
		}
	}
}
