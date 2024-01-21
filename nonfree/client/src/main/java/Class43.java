import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YAKFHRTY")
public final class Class43 {

	@OriginalMember(owner = "client!YAKFHRTY", name = "c", descriptor = "Lclient!KIFEZIQJ;")
	private Class2_Sub1 aClass2_Sub1_31;

	@OriginalMember(owner = "client!YAKFHRTY", name = "a", descriptor = "I")
	private int anInt676 = -582;

	@OriginalMember(owner = "client!YAKFHRTY", name = "b", descriptor = "Lclient!KIFEZIQJ;")
	private Class2_Sub1 aClass2_Sub1_30 = new Class2_Sub1();

	@OriginalMember(owner = "client!YAKFHRTY", name = "<init>", descriptor = "(I)V")
	public Class43(@OriginalArg(0) int arg0) {
		try {
			this.aClass2_Sub1_30.aClass2_Sub1_36 = this.aClass2_Sub1_30;
			if (arg0 != 0) {
				for (@Pc(18) int local18 = 1; local18 > 0; local18++) {
				}
			}
			this.aClass2_Sub1_30.aClass2_Sub1_37 = this.aClass2_Sub1_30;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("2792, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YAKFHRTY", name = "a", descriptor = "(Lclient!KIFEZIQJ;)V")
	public void method503(@OriginalArg(0) Class2_Sub1 arg0) {
		if (arg0.aClass2_Sub1_37 != null) {
			arg0.method574();
		}
		arg0.aClass2_Sub1_37 = this.aClass2_Sub1_30.aClass2_Sub1_37;
		arg0.aClass2_Sub1_36 = this.aClass2_Sub1_30;
		arg0.aClass2_Sub1_37.aClass2_Sub1_36 = arg0;
		arg0.aClass2_Sub1_36.aClass2_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!YAKFHRTY", name = "a", descriptor = "()Lclient!KIFEZIQJ;")
	public Class2_Sub1 method504() {
		@Pc(3) Class2_Sub1 local3 = this.aClass2_Sub1_30.aClass2_Sub1_36;
		if (local3 == this.aClass2_Sub1_30) {
			return null;
		} else {
			local3.method574();
			return local3;
		}
	}

	@OriginalMember(owner = "client!YAKFHRTY", name = "b", descriptor = "()Lclient!KIFEZIQJ;")
	public Class2_Sub1 method505() {
		@Pc(3) Class2_Sub1 local3 = this.aClass2_Sub1_30.aClass2_Sub1_36;
		if (local3 == this.aClass2_Sub1_30) {
			this.aClass2_Sub1_31 = null;
			return null;
		} else {
			this.aClass2_Sub1_31 = local3.aClass2_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!YAKFHRTY", name = "a", descriptor = "(I)Lclient!KIFEZIQJ;")
	public Class2_Sub1 method506() {
		try {
			@Pc(8) Class2_Sub1 local8 = this.aClass2_Sub1_31;
			if (local8 == this.aClass2_Sub1_30) {
				this.aClass2_Sub1_31 = null;
				return null;
			} else {
				this.aClass2_Sub1_31 = local8.aClass2_Sub1_36;
				return local8;
			}
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("27833, " + -582 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YAKFHRTY", name = "c", descriptor = "()I")
	public int method507() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class2_Sub1 local5 = this.aClass2_Sub1_30.aClass2_Sub1_36; local5 != this.aClass2_Sub1_30; local5 = local5.aClass2_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
