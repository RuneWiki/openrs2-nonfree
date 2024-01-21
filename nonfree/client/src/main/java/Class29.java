import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ob")
public final class Class29 {

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "Lclient!u;")
	private Class1 aClass1_38;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
	private int anInt824 = -292;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Lclient!u;")
	private Class1 aClass1_37 = new Class1();

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V")
	public Class29(@OriginalArg(0) int arg0) {
		try {
			if (arg0 <= 0) {
				throw new NullPointerException();
			}
			this.aClass1_37.aClass1_41 = this.aClass1_37;
			this.aClass1_37.aClass1_42 = this.aClass1_37;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("90643, " + arg0 + ", " + local27.toString());
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

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!u;I)V")
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
			signlink.reporterror("40774, " + arg0 + ", " + 0 + ", " + local26.toString());
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
			@Pc(13) Class1 local13 = this.aClass1_37.aClass1_42;
			if (local13 == this.aClass1_37) {
				this.aClass1_38 = null;
				return null;
			} else {
				this.aClass1_38 = local13.aClass1_42;
				return local13;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("98515, " + 6 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)Lclient!u;")
	public Class1 method513() {
		try {
			@Pc(9) Class1 local9 = this.aClass1_38;
			if (local9 == this.aClass1_37) {
				this.aClass1_38 = null;
				return null;
			} else {
				this.aClass1_38 = local9.aClass1_41;
				return local9;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("64923, " + 7 + ", " + local25.toString());
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
			signlink.reporterror("94508, " + -921 + ", " + local24.toString());
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
