import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pb")
public final class Class31 {

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "Lclient!v;")
	private Class1 aClass1_40;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Z")
	private boolean aBoolean204 = true;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
	private int anInt832 = 15991;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
	private int anInt833 = 7;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "Lclient!v;")
	private Class1 aClass1_39 = new Class1();

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(I)V")
	public Class31(@OriginalArg(0) int arg0) {
		try {
			this.aClass1_39.aClass1_41 = this.aClass1_39;
			this.aClass1_39.aClass1_42 = this.aClass1_39;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("27865, " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!v;)V")
	public void method520(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_42 != null) {
			arg0.method669();
		}
		arg0.aClass1_42 = this.aClass1_39.aClass1_42;
		arg0.aClass1_41 = this.aClass1_39;
		arg0.aClass1_42.aClass1_41 = arg0;
		arg0.aClass1_41.aClass1_42 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!v;I)V")
	public void method521(@OriginalArg(0) Class1 arg0) {
		try {
			if (arg0.aClass1_42 != null) {
				arg0.method669();
			}
			arg0.aClass1_42 = this.aClass1_39;
			arg0.aClass1_41 = this.aClass1_39.aClass1_41;
			arg0.aClass1_42.aClass1_41 = arg0;
			arg0.aClass1_41.aClass1_42 = arg0;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("28858, " + arg0 + ", " + 6 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "()Lclient!v;")
	public Class1 method522() {
		@Pc(3) Class1 local3 = this.aClass1_39.aClass1_41;
		if (local3 == this.aClass1_39) {
			return null;
		} else {
			local3.method669();
			return local3;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "()Lclient!v;")
	public Class1 method523() {
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
	public Class1 method524() {
		try {
			@Pc(3) Class1 local3 = this.aClass1_39.aClass1_42;
			if (local3 == this.aClass1_39) {
				this.aClass1_40 = null;
				return null;
			} else {
				this.aClass1_40 = local3.aClass1_42;
				return local3;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("45466, " + 1 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Lclient!v;")
	public Class1 method525() {
		try {
			@Pc(2) Class1 local2 = this.aClass1_40;
			if (local2 == this.aClass1_39) {
				this.aClass1_40 = null;
				return null;
			} else {
				this.aClass1_40 = local2.aClass1_41;
				return local2;
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("26482, " + true + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Lclient!v;")
	public Class1 method526() {
		try {
			@Pc(2) Class1 local2 = this.aClass1_40;
			if (this.anInt832 != 15991) {
				throw new NullPointerException();
			} else if (local2 == this.aClass1_39) {
				this.aClass1_40 = null;
				return null;
			} else {
				this.aClass1_40 = local2.aClass1_42;
				return local2;
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("32770, " + 15991 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "()V")
	public void method527() {
		while (true) {
			@Pc(3) Class1 local3 = this.aClass1_39.aClass1_41;
			if (local3 == this.aClass1_39) {
				return;
			}
			local3.method669();
		}
	}
}
