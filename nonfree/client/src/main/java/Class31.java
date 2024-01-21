import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pb")
public final class Class31 {

	@OriginalMember(owner = "client!pb", name = "h", descriptor = "Lclient!v;")
	private Class1 aClass1_40;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Z")
	private boolean aBoolean198 = false;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
	private int anInt862 = -14686;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "I")
	private int anInt863 = 19781;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "Z")
	private boolean aBoolean199 = true;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "I")
	private int anInt864 = 253;

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "Z")
	private boolean aBoolean200 = false;

	@OriginalMember(owner = "client!pb", name = "g", descriptor = "Lclient!v;")
	private Class1 aClass1_39 = new Class1();

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Z)V")
	public Class31(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				this.aBoolean198 = !this.aBoolean198;
			}
			this.aClass1_39.aClass1_41 = this.aClass1_39;
			this.aClass1_39.aClass1_42 = this.aClass1_39;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("22283, " + arg0 + ", " + local46.toString());
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
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("93485, " + arg0 + ", " + -5257 + ", " + local44.toString());
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
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("60994, " + 69 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Lclient!v;")
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
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("64502, " + 17736 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)Lclient!v;")
	public Class1 method526() {
		try {
			@Pc(2) Class1 local2 = this.aClass1_40;
			if (local2 == this.aClass1_39) {
				this.aClass1_40 = null;
				return null;
			}
			this.aClass1_40 = local2.aClass1_42;
			if (this.anInt863 != 19781) {
				for (@Pc(21) int local21 = 1; local21 > 0; local21++) {
				}
			}
			return local2;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("32188, " + 19781 + ", " + local29.toString());
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
