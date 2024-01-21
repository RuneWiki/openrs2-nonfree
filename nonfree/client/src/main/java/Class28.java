import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ob")
public final class Class28 {

	@OriginalMember(owner = "client!ob", name = "e", descriptor = "Lclient!u;")
	private Class1 aClass1_34;

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
	private int anInt639 = -865;

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "Z")
	private boolean aBoolean160 = false;

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "Z")
	private boolean aBoolean161 = true;

	@OriginalMember(owner = "client!ob", name = "d", descriptor = "Lclient!u;")
	private Class1 aClass1_33 = new Class1();

	@OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(B)V")
	public Class28(@OriginalArg(0) byte arg0) {
		try {
			this.aClass1_33.aClass1_41 = this.aClass1_33;
			this.aClass1_33.aClass1_42 = this.aClass1_33;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("98969, " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!u;)V")
	public void method434(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_42 != null) {
			arg0.method547();
		}
		arg0.aClass1_42 = this.aClass1_33.aClass1_42;
		arg0.aClass1_41 = this.aClass1_33;
		arg0.aClass1_42.aClass1_41 = arg0;
		arg0.aClass1_41.aClass1_42 = arg0;
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lclient!u;I)V")
	public void method435(@OriginalArg(0) Class1 arg0) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method547();
			}
			arg0.aClass1_42 = this.aClass1_33;
			arg0.aClass1_41 = this.aClass1_33.aClass1_41;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("42805, " + arg0 + ", " + 828 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "()Lclient!u;")
	public Class1 method436() {
		@Pc(3) Class1 local3 = this.aClass1_33.aClass1_41;
		if (local3 == this.aClass1_33) {
			return null;
		} else {
			local3.method547();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "()Lclient!u;")
	public Class1 method437() {
		@Pc(3) Class1 local3 = this.aClass1_33.aClass1_41;
		if (local3 == this.aClass1_33) {
			this.aClass1_34 = null;
			return null;
		} else {
			this.aClass1_34 = local3.aClass1_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)Lclient!u;")
	public Class1 method438() {
		try {
			@Pc(3) Class1 local3 = this.aClass1_33.aClass1_42;
			if (local3 == this.aClass1_33) {
				this.aClass1_34 = null;
				return null;
			} else {
				this.aClass1_34 = local3.aClass1_42;
				return local3;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("9405, " + -13562 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)Lclient!u;")
	public Class1 method439(@OriginalArg(0) byte arg0) {
		try {
			@Pc(2) Class1 local2 = this.aClass1_34;
			if (arg0 != 8) {
				this.aBoolean160 = !this.aBoolean160;
			}
			if (local2 == this.aClass1_33) {
				this.aClass1_34 = null;
				return null;
			} else {
				this.aClass1_34 = local2.aClass1_41;
				return local2;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("51996, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)Lclient!u;")
	public Class1 method440(@OriginalArg(0) byte arg0) {
		try {
			@Pc(2) Class1 local2 = this.aClass1_34;
			if (local2 == this.aClass1_33) {
				this.aClass1_34 = null;
				return null;
			} else {
				this.aClass1_34 = local2.aClass1_42;
				@Pc(20) boolean local20 = false;
				return local2;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("77867, " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ob", name = "c", descriptor = "()V")
	public void method441() {
		while (true) {
			@Pc(3) Class1 local3 = this.aClass1_33.aClass1_41;
			if (local3 == this.aClass1_33) {
				return;
			}
			local3.method547();
		}
	}
}
