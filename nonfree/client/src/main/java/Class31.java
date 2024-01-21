import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pb")
public final class Class31 {

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	private int anInt854;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "Lclient!v;")
	private Class1 aClass1_40;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
	private int anInt855 = 5;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Z")
	private boolean aBoolean189 = false;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "Lclient!v;")
	private Class1 aClass1_39 = new Class1();

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Z)V")
	public Class31(@OriginalArg(0) boolean arg0) {
		try {
			this.aClass1_39.aClass1_41 = this.aClass1_39;
			this.aClass1_39.aClass1_42 = this.aClass1_39;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("82102, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!v;)V")
	public void method521(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_42 != null) {
			arg0.method665();
		}
		arg0.aClass1_42 = this.aClass1_39.aClass1_42;
		arg0.aClass1_41 = this.aClass1_39;
		arg0.aClass1_42.aClass1_41 = arg0;
		arg0.aClass1_41.aClass1_42 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!v;I)V")
	public void method522(@OriginalArg(0) Class1 arg0) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method665();
			}
			arg0.aClass1_42 = this.aClass1_39;
			arg0.aClass1_41 = this.aClass1_39.aClass1_41;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("8706, " + arg0 + ", " + 21 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "()Lclient!v;")
	public Class1 method523() {
		@Pc(3) Class1 local3 = this.aClass1_39.aClass1_41;
		if (local3 == this.aClass1_39) {
			return null;
		} else {
			local3.method665();
			return local3;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "()Lclient!v;")
	public Class1 method524() {
		@Pc(3) Class1 local3 = this.aClass1_39.aClass1_41;
		if (local3 == this.aClass1_39) {
			this.aClass1_40 = null;
			return null;
		} else {
			this.aClass1_40 = local3.aClass1_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)Lclient!v;")
	public Class1 method525() {
		try {
			@Pc(10) Class1 local10 = this.aClass1_39.aClass1_42;
			if (local10 == this.aClass1_39) {
				this.aClass1_40 = null;
				return null;
			} else {
				this.aClass1_40 = local10.aClass1_42;
				return local10;
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("75082, " + -43 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Lclient!v;")
	public Class1 method526() {
		try {
			@Pc(10) Class1 local10 = this.aClass1_40;
			if (local10 == this.aClass1_39) {
				this.aClass1_40 = null;
				return null;
			} else {
				this.aClass1_40 = local10.aClass1_41;
				return local10;
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("20408, " + -327 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Lclient!v;")
	public Class1 method527() {
		try {
			@Pc(11) Class1 local11 = this.aClass1_40;
			if (local11 == this.aClass1_39) {
				this.aClass1_40 = null;
				return null;
			} else {
				this.aClass1_40 = local11.aClass1_42;
				return local11;
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("60316, " + false + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "()V")
	public void method528() {
		while (true) {
			@Pc(3) Class1 local3 = this.aClass1_39.aClass1_41;
			if (local3 == this.aClass1_39) {
				return;
			}
			local3.method665();
		}
	}
}
