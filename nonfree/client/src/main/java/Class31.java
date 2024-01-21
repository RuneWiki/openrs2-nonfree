import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pb")
public final class Class31 {

	@OriginalMember(owner = "client!pb", name = "f", descriptor = "Lclient!u;")
	private Class1 aClass1_40;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Z")
	private boolean aBoolean203 = false;

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "B")
	private byte aByte32 = 9;

	@OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
	private int anInt830 = -44203;

	@OriginalMember(owner = "client!pb", name = "e", descriptor = "Lclient!u;")
	private Class1 aClass1_39 = new Class1();

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
	private int anInt829;

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(B)V")
	public Class31(@OriginalArg(0) byte arg0) {
		try {
			this.aClass1_39.aClass1_43 = this.aClass1_39;
			this.aClass1_39.aClass1_44 = this.aClass1_39;
			if (arg0 == this.aByte32) {
				@Pc(31) boolean local31 = false;
			} else {
				this.anInt829 = 171;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("37975, " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!u;)V")
	public void method531(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_44 != null) {
			arg0.method690();
		}
		arg0.aClass1_44 = this.aClass1_39.aClass1_44;
		arg0.aClass1_43 = this.aClass1_39;
		arg0.aClass1_44.aClass1_43 = arg0;
		arg0.aClass1_43.aClass1_44 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZLclient!u;)V")
	public void method532(@OriginalArg(1) Class1 arg0) {
		try {
			if (arg0.aClass1_44 != null) {
				arg0.method690();
			}
			arg0.aClass1_44 = this.aClass1_39;
			arg0.aClass1_43 = this.aClass1_39.aClass1_43;
			arg0.aClass1_44.aClass1_43 = arg0;
			arg0.aClass1_43.aClass1_44 = arg0;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("82068, " + false + ", " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "()Lclient!u;")
	public Class1 method533() {
		@Pc(3) Class1 local3 = this.aClass1_39.aClass1_43;
		if (local3 == this.aClass1_39) {
			return null;
		} else {
			local3.method690();
			return local3;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "()Lclient!u;")
	public Class1 method534() {
		@Pc(3) Class1 local3 = this.aClass1_39.aClass1_43;
		if (local3 == this.aClass1_39) {
			this.aClass1_40 = null;
			return null;
		} else {
			this.aClass1_40 = local3.aClass1_43;
			return local3;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)Lclient!u;")
	public Class1 method535() {
		try {
			@Pc(9) Class1 local9 = this.aClass1_39.aClass1_44;
			if (local9 == this.aClass1_39) {
				this.aClass1_40 = null;
				return null;
			} else {
				this.aClass1_40 = local9.aClass1_44;
				return local9;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("70612, " + -42339 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "(I)Lclient!u;")
	public Class1 method536(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class1 local2 = this.aClass1_40;
			@Pc(6) boolean local6 = false;
			if (local2 == this.aClass1_39) {
				this.aClass1_40 = null;
				return null;
			} else {
				this.aClass1_40 = local2.aClass1_43;
				return local2;
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("73716, " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Lclient!u;")
	public Class1 method537() {
		try {
			@Pc(2) Class1 local2 = this.aClass1_40;
			if (local2 == this.aClass1_39) {
				this.aClass1_40 = null;
				return null;
			} else {
				this.aClass1_40 = local2.aClass1_44;
				return local2;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("87981, " + false + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "()V")
	public void method538() {
		if (this.aClass1_39.aClass1_43 == this.aClass1_39) {
			return;
		}
		while (true) {
			@Pc(10) Class1 local10 = this.aClass1_39.aClass1_43;
			if (local10 == this.aClass1_39) {
				return;
			}
			local10.method690();
		}
	}
}
