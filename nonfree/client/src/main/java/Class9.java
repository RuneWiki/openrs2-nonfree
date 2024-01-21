import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EDMDOBNM")
public final class Class9 {

	@OriginalMember(owner = "client!EDMDOBNM", name = "c", descriptor = "Lclient!MCYIFIZT;")
	private Class3_Sub1 aClass3_Sub1_11;

	@OriginalMember(owner = "client!EDMDOBNM", name = "b", descriptor = "Lclient!MCYIFIZT;")
	private Class3_Sub1 aClass3_Sub1_10 = new Class3_Sub1();

	@OriginalMember(owner = "client!EDMDOBNM", name = "a", descriptor = "I")
	private int anInt116;

	@OriginalMember(owner = "client!EDMDOBNM", name = "<init>", descriptor = "(I)V")
	public Class9(@OriginalArg(0) int arg0) {
		try {
			this.aClass3_Sub1_10.aClass3_Sub1_36 = this.aClass3_Sub1_10;
			this.aClass3_Sub1_10.aClass3_Sub1_37 = this.aClass3_Sub1_10;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("56355, " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EDMDOBNM", name = "a", descriptor = "(Lclient!MCYIFIZT;)V")
	public void method79(@OriginalArg(0) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_37 != null) {
			arg0.method515();
		}
		arg0.aClass3_Sub1_37 = this.aClass3_Sub1_10.aClass3_Sub1_37;
		arg0.aClass3_Sub1_36 = this.aClass3_Sub1_10;
		arg0.aClass3_Sub1_37.aClass3_Sub1_36 = arg0;
		arg0.aClass3_Sub1_36.aClass3_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!EDMDOBNM", name = "a", descriptor = "()Lclient!MCYIFIZT;")
	public Class3_Sub1 method80() {
		@Pc(3) Class3_Sub1 local3 = this.aClass3_Sub1_10.aClass3_Sub1_36;
		if (local3 == this.aClass3_Sub1_10) {
			return null;
		} else {
			local3.method515();
			return local3;
		}
	}

	@OriginalMember(owner = "client!EDMDOBNM", name = "b", descriptor = "()Lclient!MCYIFIZT;")
	public Class3_Sub1 method81() {
		@Pc(3) Class3_Sub1 local3 = this.aClass3_Sub1_10.aClass3_Sub1_36;
		if (local3 == this.aClass3_Sub1_10) {
			this.aClass3_Sub1_11 = null;
			return null;
		} else {
			this.aClass3_Sub1_11 = local3.aClass3_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!EDMDOBNM", name = "a", descriptor = "(I)Lclient!MCYIFIZT;")
	public Class3_Sub1 method82() {
		try {
			@Pc(15) Class3_Sub1 local15 = this.aClass3_Sub1_11;
			if (local15 == this.aClass3_Sub1_10) {
				this.aClass3_Sub1_11 = null;
				return null;
			} else {
				this.aClass3_Sub1_11 = local15.aClass3_Sub1_36;
				return local15;
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("9166, " + 6 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EDMDOBNM", name = "c", descriptor = "()I")
	public int method83() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class3_Sub1 local5 = this.aClass3_Sub1_10.aClass3_Sub1_36; local5 != this.aClass3_Sub1_10; local5 = local5.aClass3_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
