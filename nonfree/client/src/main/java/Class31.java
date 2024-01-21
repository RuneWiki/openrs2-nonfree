import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pb")
public final class Class31 {

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "Lclient!v;")
	private Class1 aClass1_40;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Z")
	private boolean aBoolean230 = true;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Z")
	private boolean aBoolean231 = false;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Lclient!v;")
	private Class1 aClass1_39 = new Class1();

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(B)V")
	public Class31(@OriginalArg(0) byte arg0) {
		try {
			this.aClass1_39.aClass1_41 = this.aClass1_39;
			this.aClass1_39.aClass1_42 = this.aClass1_39;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("76815, " + arg0 + ", " + local30.toString());
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

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILclient!v;)V")
	public void method521(@OriginalArg(0) int arg0, @OriginalArg(1) Class1 arg1) {
		try {
			if (arg1.aClass1_42 != null) {
				arg1.method669();
			}
			arg1.aClass1_42 = this.aClass1_39;
			@Pc(14) boolean local14 = false;
			arg1.aClass1_41 = this.aClass1_39.aClass1_41;
			arg1.aClass1_42.aClass1_41 = arg1;
			arg1.aClass1_41.aClass1_42 = arg1;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("63618, " + arg0 + ", " + arg1 + ", " + local37.toString());
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

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Lclient!v;")
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
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("15911, " + false + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Lclient!v;")
	public Class1 method525() {
		try {
			@Pc(15) Class1 local15 = this.aClass1_40;
			if (local15 == this.aClass1_39) {
				this.aClass1_40 = null;
				return null;
			} else {
				this.aClass1_40 = local15.aClass1_41;
				return local15;
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("31987, " + -536 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)Lclient!v;")
	public Class1 method526() {
		try {
			@Pc(13) Class1 local13 = this.aClass1_40;
			if (local13 == this.aClass1_39) {
				this.aClass1_40 = null;
				return null;
			} else {
				this.aClass1_40 = local13.aClass1_42;
				return local13;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("71639, " + 96 + ", " + local29.toString());
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
