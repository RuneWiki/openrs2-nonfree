import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CZYJUOKA")
public final class Class9 {

	@OriginalMember(owner = "client!CZYJUOKA", name = "c", descriptor = "Lclient!DPPNUUMQ;")
	private Class10_Sub1 aClass10_Sub1_2;

	@OriginalMember(owner = "client!CZYJUOKA", name = "a", descriptor = "Z")
	private boolean aBoolean16 = true;

	@OriginalMember(owner = "client!CZYJUOKA", name = "b", descriptor = "Lclient!DPPNUUMQ;")
	private Class10_Sub1 aClass10_Sub1_1 = new Class10_Sub1();

	@OriginalMember(owner = "client!CZYJUOKA", name = "<init>", descriptor = "(Z)V")
	public Class9(@OriginalArg(0) boolean arg0) {
		try {
			this.aClass10_Sub1_1.aClass10_Sub1_36 = this.aClass10_Sub1_1;
			this.aClass10_Sub1_1.aClass10_Sub1_37 = this.aClass10_Sub1_1;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("93229, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CZYJUOKA", name = "a", descriptor = "(Lclient!DPPNUUMQ;)V")
	public void method33(@OriginalArg(0) Class10_Sub1 arg0) {
		if (arg0.aClass10_Sub1_37 != null) {
			arg0.method535();
		}
		arg0.aClass10_Sub1_37 = this.aClass10_Sub1_1.aClass10_Sub1_37;
		arg0.aClass10_Sub1_36 = this.aClass10_Sub1_1;
		arg0.aClass10_Sub1_37.aClass10_Sub1_36 = arg0;
		arg0.aClass10_Sub1_36.aClass10_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!CZYJUOKA", name = "a", descriptor = "()Lclient!DPPNUUMQ;")
	public Class10_Sub1 method34() {
		@Pc(3) Class10_Sub1 local3 = this.aClass10_Sub1_1.aClass10_Sub1_36;
		if (local3 == this.aClass10_Sub1_1) {
			return null;
		} else {
			local3.method535();
			return local3;
		}
	}

	@OriginalMember(owner = "client!CZYJUOKA", name = "b", descriptor = "()Lclient!DPPNUUMQ;")
	public Class10_Sub1 method35() {
		@Pc(3) Class10_Sub1 local3 = this.aClass10_Sub1_1.aClass10_Sub1_36;
		if (local3 == this.aClass10_Sub1_1) {
			this.aClass10_Sub1_2 = null;
			return null;
		} else {
			this.aClass10_Sub1_2 = local3.aClass10_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!CZYJUOKA", name = "a", descriptor = "(I)Lclient!DPPNUUMQ;")
	public Class10_Sub1 method36() {
		try {
			@Pc(2) Class10_Sub1 local2 = this.aClass10_Sub1_2;
			if (local2 == this.aClass10_Sub1_1) {
				this.aClass10_Sub1_2 = null;
				return null;
			} else {
				this.aClass10_Sub1_2 = local2.aClass10_Sub1_36;
				return local2;
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("62279, " + 1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CZYJUOKA", name = "c", descriptor = "()I")
	public int method37() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class10_Sub1 local5 = this.aClass10_Sub1_1.aClass10_Sub1_36; local5 != this.aClass10_Sub1_1; local5 = local5.aClass10_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
