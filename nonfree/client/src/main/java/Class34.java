import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QHOLWOGP")
public final class Class34 {

	@OriginalMember(owner = "client!QHOLWOGP", name = "c", descriptor = "Lclient!IVMCUDWL;")
	private Class8_Sub1 aClass8_Sub1_27;

	@OriginalMember(owner = "client!QHOLWOGP", name = "a", descriptor = "Z")
	private boolean aBoolean133 = false;

	@OriginalMember(owner = "client!QHOLWOGP", name = "b", descriptor = "Lclient!IVMCUDWL;")
	private Class8_Sub1 aClass8_Sub1_26 = new Class8_Sub1();

	@OriginalMember(owner = "client!QHOLWOGP", name = "<init>", descriptor = "(B)V")
	public Class34(@OriginalArg(0) byte arg0) {
		try {
			this.aClass8_Sub1_26.aClass8_Sub1_36 = this.aClass8_Sub1_26;
			this.aClass8_Sub1_26.aClass8_Sub1_37 = this.aClass8_Sub1_26;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("40876, " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QHOLWOGP", name = "a", descriptor = "(Lclient!IVMCUDWL;)V")
	public void method370(@OriginalArg(0) Class8_Sub1 arg0) {
		if (arg0.aClass8_Sub1_37 != null) {
			arg0.method544();
		}
		arg0.aClass8_Sub1_37 = this.aClass8_Sub1_26.aClass8_Sub1_37;
		arg0.aClass8_Sub1_36 = this.aClass8_Sub1_26;
		arg0.aClass8_Sub1_37.aClass8_Sub1_36 = arg0;
		arg0.aClass8_Sub1_36.aClass8_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!QHOLWOGP", name = "a", descriptor = "()Lclient!IVMCUDWL;")
	public Class8_Sub1 method371() {
		@Pc(3) Class8_Sub1 local3 = this.aClass8_Sub1_26.aClass8_Sub1_36;
		if (local3 == this.aClass8_Sub1_26) {
			return null;
		} else {
			local3.method544();
			return local3;
		}
	}

	@OriginalMember(owner = "client!QHOLWOGP", name = "b", descriptor = "()Lclient!IVMCUDWL;")
	public Class8_Sub1 method372() {
		@Pc(3) Class8_Sub1 local3 = this.aClass8_Sub1_26.aClass8_Sub1_36;
		if (local3 == this.aClass8_Sub1_26) {
			this.aClass8_Sub1_27 = null;
			return null;
		} else {
			this.aClass8_Sub1_27 = local3.aClass8_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!QHOLWOGP", name = "a", descriptor = "(B)Lclient!IVMCUDWL;")
	public Class8_Sub1 method373() {
		try {
			@Pc(12) Class8_Sub1 local12 = this.aClass8_Sub1_27;
			if (local12 == this.aClass8_Sub1_26) {
				this.aClass8_Sub1_27 = null;
				return null;
			} else {
				this.aClass8_Sub1_27 = local12.aClass8_Sub1_36;
				return local12;
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("66904, " + 6 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QHOLWOGP", name = "c", descriptor = "()I")
	public int method374() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class8_Sub1 local5 = this.aClass8_Sub1_26.aClass8_Sub1_36; local5 != this.aClass8_Sub1_26; local5 = local5.aClass8_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
