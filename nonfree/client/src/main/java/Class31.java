import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pb")
public final class Class31 {

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Lclient!v;")
	private Class1 aClass1_40;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	private int anInt845 = 21315;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Lclient!v;")
	private Class1 aClass1_39 = new Class1();

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I)V")
	public Class31(@OriginalArg(0) int arg0) {
		try {
			this.aClass1_39.aClass1_41 = this.aClass1_39;
			this.aClass1_39.aClass1_42 = this.aClass1_39;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("42517, " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!v;)V")
	public void method494(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_42 != null) {
			arg0.method630();
		}
		arg0.aClass1_42 = this.aClass1_39.aClass1_42;
		arg0.aClass1_41 = this.aClass1_39;
		arg0.aClass1_42.aClass1_41 = arg0;
		arg0.aClass1_41.aClass1_42 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!v;I)V")
	public void method495(@OriginalArg(0) Class1 arg0) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method630();
			}
			arg0.aClass1_42 = this.aClass1_39;
			arg0.aClass1_41 = this.aClass1_39.aClass1_41;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("2232, " + arg0 + ", " + -253 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "()Lclient!v;")
	public Class1 method496() {
		@Pc(3) Class1 local3 = this.aClass1_39.aClass1_41;
		if (local3 == this.aClass1_39) {
			return null;
		} else {
			local3.method630();
			return local3;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "()Lclient!v;")
	public Class1 method497() {
		@Pc(3) Class1 local3 = this.aClass1_39.aClass1_41;
		if (local3 == this.aClass1_39) {
			this.aClass1_40 = null;
			return null;
		} else {
			this.aClass1_40 = local3.aClass1_41;
			return local3;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Lclient!v;")
	public Class1 method498() {
		try {
			@Pc(12) Class1 local12 = this.aClass1_39.aClass1_42;
			if (local12 == this.aClass1_39) {
				this.aClass1_40 = null;
				return null;
			} else {
				this.aClass1_40 = local12.aClass1_42;
				return local12;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("17798, " + true + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Lclient!v;")
	public Class1 method499() {
		try {
			@Pc(12) Class1 local12 = this.aClass1_40;
			if (local12 == this.aClass1_39) {
				this.aClass1_40 = null;
				return null;
			} else {
				this.aClass1_40 = local12.aClass1_41;
				return local12;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("60805, " + 7 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(Z)Lclient!v;")
	public Class1 method500() {
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
			signlink.reporterror("44803, " + true + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "()V")
	public void method501() {
		while (true) {
			@Pc(3) Class1 local3 = this.aClass1_39.aClass1_41;
			if (local3 == this.aClass1_39) {
				return;
			}
			local3.method630();
		}
	}
}
