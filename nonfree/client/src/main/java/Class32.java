import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pb")
public final class Class32 {

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Lclient!w;")
	private Class1_Sub1 aClass1_Sub1_34;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "B")
	private byte aByte30 = 1;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Lclient!w;")
	private Class1_Sub1 aClass1_Sub1_33 = new Class1_Sub1();

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(Z)V")
	public Class32(@OriginalArg(0) boolean arg0) {
		try {
			this.aClass1_Sub1_33.aClass1_Sub1_36 = this.aClass1_Sub1_33;
			this.aClass1_Sub1_33.aClass1_Sub1_37 = this.aClass1_Sub1_33;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("67616, " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!w;)V")
	public void method516(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_37 != null) {
			arg0.method674();
		}
		arg0.aClass1_Sub1_37 = this.aClass1_Sub1_33.aClass1_Sub1_37;
		arg0.aClass1_Sub1_36 = this.aClass1_Sub1_33;
		arg0.aClass1_Sub1_37.aClass1_Sub1_36 = arg0;
		arg0.aClass1_Sub1_36.aClass1_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "()Lclient!w;")
	public Class1_Sub1 method517() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_33.aClass1_Sub1_36;
		if (local3 == this.aClass1_Sub1_33) {
			return null;
		} else {
			local3.method674();
			return local3;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "()Lclient!w;")
	public Class1_Sub1 method518() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_33.aClass1_Sub1_36;
		if (local3 == this.aClass1_Sub1_33) {
			this.aClass1_Sub1_34 = null;
			return null;
		} else {
			this.aClass1_Sub1_34 = local3.aClass1_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)Lclient!w;")
	public Class1_Sub1 method519(@OriginalArg(0) byte arg0) {
		try {
			@Pc(2) Class1_Sub1 local2 = this.aClass1_Sub1_34;
			@Pc(7) boolean local7 = false;
			if (local2 == this.aClass1_Sub1_33) {
				this.aClass1_Sub1_34 = null;
				return null;
			} else {
				this.aClass1_Sub1_34 = local2.aClass1_Sub1_36;
				return local2;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("75306, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "()I")
	public int method520() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class1_Sub1 local5 = this.aClass1_Sub1_33.aClass1_Sub1_36; local5 != this.aClass1_Sub1_33; local5 = local5.aClass1_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
