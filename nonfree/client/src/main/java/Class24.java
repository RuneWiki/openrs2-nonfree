import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PNEYGONI")
public final class Class24 {

	@OriginalMember(owner = "client!PNEYGONI", name = "d", descriptor = "Lclient!OGGHOMII;")
	private Class3_Sub1 aClass3_Sub1_24;

	@OriginalMember(owner = "client!PNEYGONI", name = "a", descriptor = "I")
	private int anInt573 = -3061;

	@OriginalMember(owner = "client!PNEYGONI", name = "b", descriptor = "Z")
	private boolean aBoolean131 = false;

	@OriginalMember(owner = "client!PNEYGONI", name = "c", descriptor = "Lclient!OGGHOMII;")
	private Class3_Sub1 aClass3_Sub1_23 = new Class3_Sub1();

	@OriginalMember(owner = "client!PNEYGONI", name = "<init>", descriptor = "(B)V")
	public Class24(@OriginalArg(0) byte arg0) {
		try {
			this.aClass3_Sub1_23.aClass3_Sub1_36 = this.aClass3_Sub1_23;
			this.aClass3_Sub1_23.aClass3_Sub1_37 = this.aClass3_Sub1_23;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("35868, " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PNEYGONI", name = "a", descriptor = "(Lclient!OGGHOMII;)V")
	public void method367(@OriginalArg(0) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_37 != null) {
			arg0.method504();
		}
		arg0.aClass3_Sub1_37 = this.aClass3_Sub1_23.aClass3_Sub1_37;
		arg0.aClass3_Sub1_36 = this.aClass3_Sub1_23;
		arg0.aClass3_Sub1_37.aClass3_Sub1_36 = arg0;
		arg0.aClass3_Sub1_36.aClass3_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!PNEYGONI", name = "a", descriptor = "()Lclient!OGGHOMII;")
	public Class3_Sub1 method368() {
		@Pc(3) Class3_Sub1 local3 = this.aClass3_Sub1_23.aClass3_Sub1_36;
		if (local3 == this.aClass3_Sub1_23) {
			return null;
		} else {
			local3.method504();
			return local3;
		}
	}

	@OriginalMember(owner = "client!PNEYGONI", name = "b", descriptor = "()Lclient!OGGHOMII;")
	public Class3_Sub1 method369() {
		@Pc(3) Class3_Sub1 local3 = this.aClass3_Sub1_23.aClass3_Sub1_36;
		if (local3 == this.aClass3_Sub1_23) {
			this.aClass3_Sub1_24 = null;
			return null;
		} else {
			this.aClass3_Sub1_24 = local3.aClass3_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!PNEYGONI", name = "a", descriptor = "(I)Lclient!OGGHOMII;")
	public Class3_Sub1 method370() {
		try {
			@Pc(2) Class3_Sub1 local2 = this.aClass3_Sub1_24;
			if (local2 == this.aClass3_Sub1_23) {
				this.aClass3_Sub1_24 = null;
				return null;
			} else {
				this.aClass3_Sub1_24 = local2.aClass3_Sub1_36;
				return local2;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("80598, " + 5 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PNEYGONI", name = "c", descriptor = "()I")
	public int method371() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class3_Sub1 local5 = this.aClass3_Sub1_23.aClass3_Sub1_36; local5 != this.aClass3_Sub1_23; local5 = local5.aClass3_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
