import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FEBLELGD")
public final class Class13 {

	@OriginalMember(owner = "client!FEBLELGD", name = "a", descriptor = "I")
	private int anInt263;

	@OriginalMember(owner = "client!FEBLELGD", name = "d", descriptor = "Lclient!CYIKEZWP;")
	private Class4_Sub1 aClass4_Sub1_19;

	@OriginalMember(owner = "client!FEBLELGD", name = "b", descriptor = "I")
	private int anInt264 = -558;

	@OriginalMember(owner = "client!FEBLELGD", name = "c", descriptor = "Lclient!CYIKEZWP;")
	private Class4_Sub1 aClass4_Sub1_18 = new Class4_Sub1();

	@OriginalMember(owner = "client!FEBLELGD", name = "<init>", descriptor = "(B)V")
	public Class13(@OriginalArg(0) byte arg0) {
		try {
			this.aClass4_Sub1_18.aClass4_Sub1_36 = this.aClass4_Sub1_18;
			this.aClass4_Sub1_18.aClass4_Sub1_37 = this.aClass4_Sub1_18;
			@Pc(24) boolean local24 = false;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("5266, " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FEBLELGD", name = "a", descriptor = "(Lclient!CYIKEZWP;)V")
	public void method212(@OriginalArg(0) Class4_Sub1 arg0) {
		if (arg0.aClass4_Sub1_37 != null) {
			arg0.method529();
		}
		arg0.aClass4_Sub1_37 = this.aClass4_Sub1_18.aClass4_Sub1_37;
		arg0.aClass4_Sub1_36 = this.aClass4_Sub1_18;
		arg0.aClass4_Sub1_37.aClass4_Sub1_36 = arg0;
		arg0.aClass4_Sub1_36.aClass4_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!FEBLELGD", name = "a", descriptor = "()Lclient!CYIKEZWP;")
	public Class4_Sub1 method213() {
		@Pc(3) Class4_Sub1 local3 = this.aClass4_Sub1_18.aClass4_Sub1_36;
		if (local3 == this.aClass4_Sub1_18) {
			return null;
		} else {
			local3.method529();
			return local3;
		}
	}

	@OriginalMember(owner = "client!FEBLELGD", name = "b", descriptor = "()Lclient!CYIKEZWP;")
	public Class4_Sub1 method214() {
		@Pc(3) Class4_Sub1 local3 = this.aClass4_Sub1_18.aClass4_Sub1_36;
		if (local3 == this.aClass4_Sub1_18) {
			this.aClass4_Sub1_19 = null;
			return null;
		} else {
			this.aClass4_Sub1_19 = local3.aClass4_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!FEBLELGD", name = "a", descriptor = "(I)Lclient!CYIKEZWP;")
	public Class4_Sub1 method215() {
		try {
			@Pc(7) Class4_Sub1 local7 = this.aClass4_Sub1_19;
			if (local7 == this.aClass4_Sub1_18) {
				this.aClass4_Sub1_19 = null;
				return null;
			} else {
				this.aClass4_Sub1_19 = local7.aClass4_Sub1_36;
				return local7;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("28577, " + -125 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FEBLELGD", name = "c", descriptor = "()I")
	public int method216() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class4_Sub1 local5 = this.aClass4_Sub1_18.aClass4_Sub1_36; local5 != this.aClass4_Sub1_18; local5 = local5.aClass4_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
