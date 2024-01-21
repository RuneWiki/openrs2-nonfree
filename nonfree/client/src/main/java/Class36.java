import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TSCGUBKV")
public final class Class36 {

	@OriginalMember(owner = "client!TSCGUBKV", name = "d", descriptor = "Lclient!YBEHHNFF;")
	private Class6_Sub1 aClass6_Sub1_26;

	@OriginalMember(owner = "client!TSCGUBKV", name = "a", descriptor = "I")
	private int anInt633 = -420;

	@OriginalMember(owner = "client!TSCGUBKV", name = "b", descriptor = "Z")
	private boolean aBoolean148 = false;

	@OriginalMember(owner = "client!TSCGUBKV", name = "c", descriptor = "Lclient!YBEHHNFF;")
	private Class6_Sub1 aClass6_Sub1_25 = new Class6_Sub1();

	@OriginalMember(owner = "client!TSCGUBKV", name = "<init>", descriptor = "(I)V")
	public Class36(@OriginalArg(0) int arg0) {
		try {
			this.aClass6_Sub1_25.aClass6_Sub1_36 = this.aClass6_Sub1_25;
			this.aClass6_Sub1_25.aClass6_Sub1_37 = this.aClass6_Sub1_25;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("5345, " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TSCGUBKV", name = "a", descriptor = "(Lclient!YBEHHNFF;)V")
	public void method385(@OriginalArg(0) Class6_Sub1 arg0) {
		if (arg0.aClass6_Sub1_37 != null) {
			arg0.method543();
		}
		arg0.aClass6_Sub1_37 = this.aClass6_Sub1_25.aClass6_Sub1_37;
		arg0.aClass6_Sub1_36 = this.aClass6_Sub1_25;
		arg0.aClass6_Sub1_37.aClass6_Sub1_36 = arg0;
		arg0.aClass6_Sub1_36.aClass6_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!TSCGUBKV", name = "a", descriptor = "()Lclient!YBEHHNFF;")
	public Class6_Sub1 method386() {
		@Pc(3) Class6_Sub1 local3 = this.aClass6_Sub1_25.aClass6_Sub1_36;
		if (local3 == this.aClass6_Sub1_25) {
			return null;
		} else {
			local3.method543();
			return local3;
		}
	}

	@OriginalMember(owner = "client!TSCGUBKV", name = "b", descriptor = "()Lclient!YBEHHNFF;")
	public Class6_Sub1 method387() {
		@Pc(3) Class6_Sub1 local3 = this.aClass6_Sub1_25.aClass6_Sub1_36;
		if (local3 == this.aClass6_Sub1_25) {
			this.aClass6_Sub1_26 = null;
			return null;
		} else {
			this.aClass6_Sub1_26 = local3.aClass6_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!TSCGUBKV", name = "a", descriptor = "(I)Lclient!YBEHHNFF;")
	public Class6_Sub1 method388() {
		try {
			@Pc(2) Class6_Sub1 local2 = this.aClass6_Sub1_26;
			if (local2 == this.aClass6_Sub1_25) {
				this.aClass6_Sub1_26 = null;
				return null;
			} else {
				this.aClass6_Sub1_26 = local2.aClass6_Sub1_36;
				return local2;
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("75824, " + -420 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TSCGUBKV", name = "c", descriptor = "()I")
	public int method389() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class6_Sub1 local5 = this.aClass6_Sub1_25.aClass6_Sub1_36; local5 != this.aClass6_Sub1_25; local5 = local5.aClass6_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
