import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LHGXPZPG")
public final class Class21 {

	@OriginalMember(owner = "client!LHGXPZPG", name = "d", descriptor = "Lclient!PKVMXVTO;")
	private Class1 aClass1_24;

	@OriginalMember(owner = "client!LHGXPZPG", name = "a", descriptor = "Z")
	private boolean aBoolean102 = false;

	@OriginalMember(owner = "client!LHGXPZPG", name = "b", descriptor = "I")
	private int anInt430 = -77;

	@OriginalMember(owner = "client!LHGXPZPG", name = "c", descriptor = "Lclient!PKVMXVTO;")
	private Class1 aClass1_23 = new Class1();

	@OriginalMember(owner = "client!LHGXPZPG", name = "<init>", descriptor = "(I)V")
	public Class21(@OriginalArg(0) int arg0) {
		try {
			this.aClass1_23.aClass1_41 = this.aClass1_23;
			this.aClass1_23.aClass1_42 = this.aClass1_23;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("91809, " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LHGXPZPG", name = "a", descriptor = "(Lclient!PKVMXVTO;)V")
	public void method243(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_42 != null) {
			arg0.method526();
		}
		arg0.aClass1_42 = this.aClass1_23.aClass1_42;
		arg0.aClass1_41 = this.aClass1_23;
		arg0.aClass1_42.aClass1_41 = arg0;
		arg0.aClass1_41.aClass1_42 = arg0;
	}

	@OriginalMember(owner = "client!LHGXPZPG", name = "a", descriptor = "(ILclient!PKVMXVTO;)V")
	public void method244(@OriginalArg(1) Class1 arg0) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method526();
			}
			arg0.aClass1_42 = this.aClass1_23;
			arg0.aClass1_41 = this.aClass1_23.aClass1_41;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("66209, " + -493 + ", " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LHGXPZPG", name = "a", descriptor = "()Lclient!PKVMXVTO;")
	public Class1 method245() {
		@Pc(3) Class1 local3 = this.aClass1_23.aClass1_41;
		if (local3 == this.aClass1_23) {
			return null;
		} else {
			local3.method526();
			return local3;
		}
	}

	@OriginalMember(owner = "client!LHGXPZPG", name = "b", descriptor = "()Lclient!PKVMXVTO;")
	public Class1 method246() {
		@Pc(3) Class1 local3 = this.aClass1_23.aClass1_41;
		if (local3 == this.aClass1_23) {
			this.aClass1_24 = null;
			return null;
		} else {
			this.aClass1_24 = local3.aClass1_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!LHGXPZPG", name = "a", descriptor = "(I)Lclient!PKVMXVTO;")
	public Class1 method247() {
		try {
			@Pc(13) Class1 local13 = this.aClass1_23.aClass1_42;
			if (local13 == this.aClass1_23) {
				this.aClass1_24 = null;
				return null;
			} else {
				this.aClass1_24 = local13.aClass1_42;
				return local13;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("79197, " + 5 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LHGXPZPG", name = "a", descriptor = "(Z)Lclient!PKVMXVTO;")
	public Class1 method248() {
		try {
			@Pc(2) Class1 local2 = this.aClass1_24;
			if (local2 == this.aClass1_23) {
				this.aClass1_24 = null;
				return null;
			} else {
				this.aClass1_24 = local2.aClass1_41;
				return local2;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("91709, " + false + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LHGXPZPG", name = "b", descriptor = "(I)Lclient!PKVMXVTO;")
	public Class1 method249() {
		try {
			@Pc(2) Class1 local2 = this.aClass1_24;
			if (local2 == this.aClass1_23) {
				this.aClass1_24 = null;
				return null;
			} else {
				this.aClass1_24 = local2.aClass1_42;
				return local2;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("43802, " + 8 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LHGXPZPG", name = "c", descriptor = "()V")
	public void method250() {
		if (this.aClass1_23.aClass1_41 == this.aClass1_23) {
			return;
		}
		while (true) {
			@Pc(10) Class1 local10 = this.aClass1_23.aClass1_41;
			if (local10 == this.aClass1_23) {
				return;
			}
			local10.method526();
		}
	}
}
