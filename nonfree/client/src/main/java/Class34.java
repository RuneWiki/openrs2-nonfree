import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!qb")
public final class Class34 {

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "Lclient!x;")
	private Class1_Sub1 aClass1_Sub1_36;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "Z")
	private boolean aBoolean180 = true;

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "Lclient!x;")
	private Class1_Sub1 aClass1_Sub1_35 = new Class1_Sub1();

	@OriginalMember(owner = "client!qb", name = "<init>", descriptor = "(B)V")
	public Class34(@OriginalArg(0) byte arg0) {
		try {
			@Pc(14) boolean local14 = false;
			this.aClass1_Sub1_35.aClass1_Sub1_33 = this.aClass1_Sub1_35;
			this.aClass1_Sub1_35.aClass1_Sub1_34 = this.aClass1_Sub1_35;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("97677, " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!x;)V")
	public void method541(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_34 != null) {
			arg0.method488();
		}
		arg0.aClass1_Sub1_34 = this.aClass1_Sub1_35.aClass1_Sub1_34;
		arg0.aClass1_Sub1_33 = this.aClass1_Sub1_35;
		arg0.aClass1_Sub1_34.aClass1_Sub1_33 = arg0;
		arg0.aClass1_Sub1_33.aClass1_Sub1_34 = arg0;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "()Lclient!x;")
	public Class1_Sub1 method542() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_35.aClass1_Sub1_33;
		if (local3 == this.aClass1_Sub1_35) {
			return null;
		} else {
			local3.method488();
			return local3;
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "()Lclient!x;")
	public Class1_Sub1 method543() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_35.aClass1_Sub1_33;
		if (local3 == this.aClass1_Sub1_35) {
			this.aClass1_Sub1_36 = null;
			return null;
		} else {
			this.aClass1_Sub1_36 = local3.aClass1_Sub1_33;
			return local3;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Z)Lclient!x;")
	public Class1_Sub1 method544() {
		try {
			@Pc(8) Class1_Sub1 local8 = this.aClass1_Sub1_36;
			if (local8 == this.aClass1_Sub1_35) {
				this.aClass1_Sub1_36 = null;
				return null;
			} else {
				this.aClass1_Sub1_36 = local8.aClass1_Sub1_33;
				return local8;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("7972, " + true + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!qb", name = "c", descriptor = "()I")
	public int method545() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class1_Sub1 local5 = this.aClass1_Sub1_35.aClass1_Sub1_33; local5 != this.aClass1_Sub1_35; local5 = local5.aClass1_Sub1_33) {
			local1++;
		}
		return local1;
	}
}
