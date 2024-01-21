import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!JLOKOMHZ")
public final class Class16 {

	@OriginalMember(owner = "client!JLOKOMHZ", name = "d", descriptor = "Lclient!USMRNXZO;")
	private Class8_Sub1 aClass8_Sub1_15;

	@OriginalMember(owner = "client!JLOKOMHZ", name = "a", descriptor = "Z")
	private boolean aBoolean56 = false;

	@OriginalMember(owner = "client!JLOKOMHZ", name = "b", descriptor = "Z")
	private boolean aBoolean57 = false;

	@OriginalMember(owner = "client!JLOKOMHZ", name = "c", descriptor = "Lclient!USMRNXZO;")
	private Class8_Sub1 aClass8_Sub1_14 = new Class8_Sub1();

	@OriginalMember(owner = "client!JLOKOMHZ", name = "<init>", descriptor = "(I)V")
	public Class16(@OriginalArg(0) int arg0) {
		try {
			this.aClass8_Sub1_14.aClass8_Sub1_36 = this.aClass8_Sub1_14;
			this.aClass8_Sub1_14.aClass8_Sub1_37 = this.aClass8_Sub1_14;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("589, " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JLOKOMHZ", name = "a", descriptor = "(Lclient!USMRNXZO;)V")
	public void method119(@OriginalArg(0) Class8_Sub1 arg0) {
		if (arg0.aClass8_Sub1_37 != null) {
			arg0.method547();
		}
		arg0.aClass8_Sub1_37 = this.aClass8_Sub1_14.aClass8_Sub1_37;
		arg0.aClass8_Sub1_36 = this.aClass8_Sub1_14;
		arg0.aClass8_Sub1_37.aClass8_Sub1_36 = arg0;
		arg0.aClass8_Sub1_36.aClass8_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!JLOKOMHZ", name = "a", descriptor = "()Lclient!USMRNXZO;")
	public Class8_Sub1 method120() {
		@Pc(3) Class8_Sub1 local3 = this.aClass8_Sub1_14.aClass8_Sub1_36;
		if (local3 == this.aClass8_Sub1_14) {
			return null;
		} else {
			local3.method547();
			return local3;
		}
	}

	@OriginalMember(owner = "client!JLOKOMHZ", name = "b", descriptor = "()Lclient!USMRNXZO;")
	public Class8_Sub1 method121() {
		@Pc(3) Class8_Sub1 local3 = this.aClass8_Sub1_14.aClass8_Sub1_36;
		if (local3 == this.aClass8_Sub1_14) {
			this.aClass8_Sub1_15 = null;
			return null;
		} else {
			this.aClass8_Sub1_15 = local3.aClass8_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!JLOKOMHZ", name = "a", descriptor = "(B)Lclient!USMRNXZO;")
	public Class8_Sub1 method122() {
		try {
			@Pc(9) Class8_Sub1 local9 = this.aClass8_Sub1_15;
			if (local9 == this.aClass8_Sub1_14) {
				this.aClass8_Sub1_15 = null;
				return null;
			} else {
				this.aClass8_Sub1_15 = local9.aClass8_Sub1_36;
				return local9;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("67208, " + 2 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!JLOKOMHZ", name = "c", descriptor = "()I")
	public int method123() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class8_Sub1 local5 = this.aClass8_Sub1_14.aClass8_Sub1_36; local5 != this.aClass8_Sub1_14; local5 = local5.aClass8_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
