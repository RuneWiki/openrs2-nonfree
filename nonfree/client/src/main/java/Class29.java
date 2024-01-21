import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ob")
public final class Class29 {

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "Lclient!u;")
	private Class1 aClass1_38;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
	private int anInt807 = 6;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "B")
	private byte aByte28 = 1;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "Z")
	private boolean aBoolean208 = false;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Lclient!u;")
	private Class1 aClass1_37 = new Class1();

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(I)V")
	public Class29(@OriginalArg(0) int arg0) {
		try {
			this.aClass1_37.aClass1_41 = this.aClass1_37;
			this.aClass1_37.aClass1_42 = this.aClass1_37;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("28729, " + arg0 + ", " + local37.toString());
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

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILclient!u;)V")
	public void method509(@OriginalArg(1) Class1 arg0) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method673();
			}
			arg0.aClass1_42 = this.aClass1_37;
			arg0.aClass1_41 = this.aClass1_37.aClass1_41;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("65931, " + 7 + ", " + arg0 + ", " + local39.toString());
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
			@Pc(3) Class1 local3 = this.aClass1_37.aClass1_42;
			if (local3 == this.aClass1_37) {
				this.aClass1_38 = null;
				return null;
			} else {
				this.aClass1_38 = local3.aClass1_42;
				return local3;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("15988, " + true + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)Lclient!u;")
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
			signlink.reporterror("27860, " + 8 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)Lclient!u;")
	public Class1 method514(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) Class1 local4 = this.aClass1_38;
			if (this.aByte28 == 1) {
				@Pc(10) boolean local10 = false;
			} else {
				for (@Pc(14) int local14 = 1; local14 > 0; local14++) {
				}
			}
			if (local4 == this.aClass1_37) {
				this.aClass1_38 = null;
				return null;
			} else {
				this.aClass1_38 = local4.aClass1_42;
				return local4;
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("29881, " + arg0 + ", " + local35.toString());
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
