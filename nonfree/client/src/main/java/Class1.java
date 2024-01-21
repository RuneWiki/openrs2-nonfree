import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AAITTAMV")
public final class Class1 {

	@OriginalMember(owner = "client!AAITTAMV", name = "f", descriptor = "Lclient!EDVKOEOK;")
	private Class4_Sub1 aClass4_Sub1_2;

	@OriginalMember(owner = "client!AAITTAMV", name = "a", descriptor = "I")
	private int anInt1 = -548;

	@OriginalMember(owner = "client!AAITTAMV", name = "b", descriptor = "I")
	private int anInt2 = 338;

	@OriginalMember(owner = "client!AAITTAMV", name = "c", descriptor = "Z")
	private boolean aBoolean1 = true;

	@OriginalMember(owner = "client!AAITTAMV", name = "d", descriptor = "B")
	private byte aByte1 = -113;

	@OriginalMember(owner = "client!AAITTAMV", name = "e", descriptor = "Lclient!EDVKOEOK;")
	private Class4_Sub1 aClass4_Sub1_1 = new Class4_Sub1();

	@OriginalMember(owner = "client!AAITTAMV", name = "<init>", descriptor = "(B)V")
	public Class1(@OriginalArg(0) byte arg0) {
		try {
			this.aClass4_Sub1_1.aClass4_Sub1_36 = this.aClass4_Sub1_1;
			this.aClass4_Sub1_1.aClass4_Sub1_37 = this.aClass4_Sub1_1;
			if (arg0 != this.aByte1) {
				this.anInt1 = -84;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("41339, " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AAITTAMV", name = "a", descriptor = "(Lclient!EDVKOEOK;)V")
	public void method1(@OriginalArg(0) Class4_Sub1 arg0) {
		if (arg0.aClass4_Sub1_37 != null) {
			arg0.method573();
		}
		arg0.aClass4_Sub1_37 = this.aClass4_Sub1_1.aClass4_Sub1_37;
		arg0.aClass4_Sub1_36 = this.aClass4_Sub1_1;
		arg0.aClass4_Sub1_37.aClass4_Sub1_36 = arg0;
		arg0.aClass4_Sub1_36.aClass4_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!AAITTAMV", name = "a", descriptor = "()Lclient!EDVKOEOK;")
	public Class4_Sub1 method2() {
		@Pc(3) Class4_Sub1 local3 = this.aClass4_Sub1_1.aClass4_Sub1_36;
		if (local3 == this.aClass4_Sub1_1) {
			return null;
		} else {
			local3.method573();
			return local3;
		}
	}

	@OriginalMember(owner = "client!AAITTAMV", name = "b", descriptor = "()Lclient!EDVKOEOK;")
	public Class4_Sub1 method3() {
		@Pc(3) Class4_Sub1 local3 = this.aClass4_Sub1_1.aClass4_Sub1_36;
		if (local3 == this.aClass4_Sub1_1) {
			this.aClass4_Sub1_2 = null;
			return null;
		} else {
			this.aClass4_Sub1_2 = local3.aClass4_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!AAITTAMV", name = "a", descriptor = "(Z)Lclient!EDVKOEOK;")
	public Class4_Sub1 method4() {
		try {
			@Pc(2) Class4_Sub1 local2 = this.aClass4_Sub1_2;
			if (local2 == this.aClass4_Sub1_1) {
				this.aClass4_Sub1_2 = null;
				return null;
			} else {
				this.aClass4_Sub1_2 = local2.aClass4_Sub1_36;
				return local2;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("85962, " + false + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AAITTAMV", name = "c", descriptor = "()I")
	public int method5() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class4_Sub1 local5 = this.aClass4_Sub1_1.aClass4_Sub1_36; local5 != this.aClass4_Sub1_1; local5 = local5.aClass4_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
