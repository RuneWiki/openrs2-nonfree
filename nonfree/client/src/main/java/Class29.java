import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ob")
public final class Class29 {

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Lclient!u;")
	private Class1 aClass1_38;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "Lclient!u;")
	private Class1 aClass1_37 = new Class1();

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V")
	public Class29(@OriginalArg(0) int arg0) {
		try {
			this.aClass1_37.aClass1_41 = this.aClass1_37;
			@Pc(15) int local15 = 91 / arg0;
			this.aClass1_37.aClass1_42 = this.aClass1_37;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("67742, " + arg0 + ", " + local22.toString());
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

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ZLclient!u;)V")
	public void method509(@OriginalArg(1) Class1 arg0) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method673();
			}
			arg0.aClass1_42 = this.aClass1_37;
			arg0.aClass1_41 = this.aClass1_37.aClass1_41;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("67217, " + false + ", " + arg0 + ", " + local26.toString());
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

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)Lclient!u;")
	public Class1 method512() {
		try {
			@Pc(9) Class1 local9 = this.aClass1_37.aClass1_42;
			if (local9 == this.aClass1_37) {
				this.aClass1_38 = null;
				return null;
			} else {
				this.aClass1_38 = local9.aClass1_42;
				return local9;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("54325, " + true + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)Lclient!u;")
	public Class1 method513() {
		try {
			@Pc(11) Class1 local11 = this.aClass1_38;
			if (local11 == this.aClass1_37) {
				this.aClass1_38 = null;
				return null;
			} else {
				this.aClass1_38 = local11.aClass1_41;
				return local11;
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("29313, " + true + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)Lclient!u;")
	public Class1 method514(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 73) {
				throw new NullPointerException();
			}
			@Pc(9) Class1 local9 = this.aClass1_38;
			if (local9 == this.aClass1_37) {
				this.aClass1_38 = null;
				return null;
			} else {
				this.aClass1_38 = local9.aClass1_42;
				return local9;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("46397, " + arg0 + ", " + local25.toString());
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
