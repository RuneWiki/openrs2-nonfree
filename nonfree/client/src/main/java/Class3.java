import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BISVHPUN")
public final class Class3 {

	@OriginalMember(owner = "client!BISVHPUN", name = "d", descriptor = "Lclient!PPOHBEGB;")
	private Class1_Sub1 aClass1_Sub1_6;

	@OriginalMember(owner = "client!BISVHPUN", name = "a", descriptor = "Z")
	private boolean aBoolean11 = false;

	@OriginalMember(owner = "client!BISVHPUN", name = "b", descriptor = "I")
	private int anInt16 = -589;

	@OriginalMember(owner = "client!BISVHPUN", name = "c", descriptor = "Lclient!PPOHBEGB;")
	private Class1_Sub1 aClass1_Sub1_5 = new Class1_Sub1();

	@OriginalMember(owner = "client!BISVHPUN", name = "<init>", descriptor = "(I)V")
	public Class3(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				this.anInt16 = -25;
			}
			this.aClass1_Sub1_5.aClass1_Sub1_36 = this.aClass1_Sub1_5;
			this.aClass1_Sub1_5.aClass1_Sub1_37 = this.aClass1_Sub1_5;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("656, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISVHPUN", name = "a", descriptor = "(Lclient!PPOHBEGB;)V")
	public void method20(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_37 != null) {
			arg0.method527();
		}
		arg0.aClass1_Sub1_37 = this.aClass1_Sub1_5.aClass1_Sub1_37;
		arg0.aClass1_Sub1_36 = this.aClass1_Sub1_5;
		arg0.aClass1_Sub1_37.aClass1_Sub1_36 = arg0;
		arg0.aClass1_Sub1_36.aClass1_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!BISVHPUN", name = "a", descriptor = "()Lclient!PPOHBEGB;")
	public Class1_Sub1 method21() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_5.aClass1_Sub1_36;
		if (local3 == this.aClass1_Sub1_5) {
			return null;
		} else {
			local3.method527();
			return local3;
		}
	}

	@OriginalMember(owner = "client!BISVHPUN", name = "b", descriptor = "()Lclient!PPOHBEGB;")
	public Class1_Sub1 method22() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_5.aClass1_Sub1_36;
		if (local3 == this.aClass1_Sub1_5) {
			this.aClass1_Sub1_6 = null;
			return null;
		} else {
			this.aClass1_Sub1_6 = local3.aClass1_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!BISVHPUN", name = "a", descriptor = "(Z)Lclient!PPOHBEGB;")
	public Class1_Sub1 method23() {
		try {
			@Pc(8) Class1_Sub1 local8 = this.aClass1_Sub1_6;
			if (local8 == this.aClass1_Sub1_5) {
				this.aClass1_Sub1_6 = null;
				return null;
			} else {
				this.aClass1_Sub1_6 = local8.aClass1_Sub1_36;
				return local8;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("42563, " + false + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BISVHPUN", name = "c", descriptor = "()I")
	public int method24() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class1_Sub1 local5 = this.aClass1_Sub1_5.aClass1_Sub1_36; local5 != this.aClass1_Sub1_5; local5 = local5.aClass1_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
