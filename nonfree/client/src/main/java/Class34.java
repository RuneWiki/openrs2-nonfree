import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!qb")
public final class Class34 {

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "Lclient!x;")
	private Class1_Sub1 aClass1_Sub1_36;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
	private int anInt865 = 309;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "Lclient!x;")
	private Class1_Sub1 aClass1_Sub1_35 = new Class1_Sub1();

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(I)V")
	public Class34(@OriginalArg(0) int arg0) {
		try {
			@Pc(13) int local13 = 32 / arg0;
			this.aClass1_Sub1_35.aClass1_Sub1_33 = this.aClass1_Sub1_35;
			this.aClass1_Sub1_35.aClass1_Sub1_34 = this.aClass1_Sub1_35;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("86073, " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!x;)V")
	public void method540(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_34 != null) {
			arg0.method487();
		}
		arg0.aClass1_Sub1_34 = this.aClass1_Sub1_35.aClass1_Sub1_34;
		arg0.aClass1_Sub1_33 = this.aClass1_Sub1_35;
		arg0.aClass1_Sub1_34.aClass1_Sub1_33 = arg0;
		arg0.aClass1_Sub1_33.aClass1_Sub1_34 = arg0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "()Lclient!x;")
	public Class1_Sub1 method541() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_35.aClass1_Sub1_33;
		if (local3 == this.aClass1_Sub1_35) {
			return null;
		} else {
			local3.method487();
			return local3;
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "()Lclient!x;")
	public Class1_Sub1 method542() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_35.aClass1_Sub1_33;
		if (local3 == this.aClass1_Sub1_35) {
			this.aClass1_Sub1_36 = null;
			return null;
		} else {
			this.aClass1_Sub1_36 = local3.aClass1_Sub1_33;
			return local3;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)Lclient!x;")
	public Class1_Sub1 method543() {
		try {
			@Pc(2) Class1_Sub1 local2 = this.aClass1_Sub1_36;
			if (local2 == this.aClass1_Sub1_35) {
				this.aClass1_Sub1_36 = null;
				return null;
			} else {
				this.aClass1_Sub1_36 = local2.aClass1_Sub1_33;
				return local2;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("5153, " + 7 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "()I")
	public int method544() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class1_Sub1 local5 = this.aClass1_Sub1_35.aClass1_Sub1_33; local5 != this.aClass1_Sub1_35; local5 = local5.aClass1_Sub1_33) {
			local1++;
		}
		return local1;
	}
}
