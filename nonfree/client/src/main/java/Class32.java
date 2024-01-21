import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!pb")
public final class Class32 {

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "Lclient!w;")
	private Class1_Sub1 aClass1_Sub1_34;

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "Z")
	private boolean aBoolean203 = true;

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "Lclient!w;")
	private Class1_Sub1 aClass1_Sub1_33 = new Class1_Sub1();

	@OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(B)V")
	public Class32(@OriginalArg(0) byte arg0) {
		try {
			@Pc(14) boolean local14 = false;
			this.aClass1_Sub1_33.aClass1_Sub1_36 = this.aClass1_Sub1_33;
			this.aClass1_Sub1_33.aClass1_Sub1_37 = this.aClass1_Sub1_33;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("64475, " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lclient!w;)V")
	public void method509(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_37 != null) {
			arg0.method668();
		}
		arg0.aClass1_Sub1_37 = this.aClass1_Sub1_33.aClass1_Sub1_37;
		arg0.aClass1_Sub1_36 = this.aClass1_Sub1_33;
		arg0.aClass1_Sub1_37.aClass1_Sub1_36 = arg0;
		arg0.aClass1_Sub1_36.aClass1_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!pb", name = "a", descriptor = "()Lclient!w;")
	public Class1_Sub1 method510() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_33.aClass1_Sub1_36;
		if (local3 == this.aClass1_Sub1_33) {
			return null;
		} else {
			local3.method668();
			return local3;
		}
	}

	@OriginalMember(owner = "client!pb", name = "b", descriptor = "()Lclient!w;")
	public Class1_Sub1 method511() {
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
	public Class1_Sub1 method512(@OriginalArg(0) byte arg0) {
		try {
			@Pc(2) Class1_Sub1 local2 = this.aClass1_Sub1_34;
			if (local2 == this.aClass1_Sub1_33) {
				this.aClass1_Sub1_34 = null;
				return null;
			}
			this.aClass1_Sub1_34 = local2.aClass1_Sub1_36;
			if (arg0 == 0) {
				@Pc(19) boolean local19 = false;
			} else {
				this.aBoolean203 = !this.aBoolean203;
			}
			return local2;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("40993, " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pb", name = "c", descriptor = "()I")
	public int method513() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class1_Sub1 local5 = this.aClass1_Sub1_33.aClass1_Sub1_36; local5 != this.aClass1_Sub1_33; local5 = local5.aClass1_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
