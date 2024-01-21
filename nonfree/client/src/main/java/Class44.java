import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XBBVJJRK")
public final class Class44 {

	@OriginalMember(owner = "client!XBBVJJRK", name = "c", descriptor = "Lclient!HSUOZGYX;")
	private Class1_Sub1 aClass1_Sub1_33;

	@OriginalMember(owner = "client!XBBVJJRK", name = "a", descriptor = "I")
	private int anInt743 = -459;

	@OriginalMember(owner = "client!XBBVJJRK", name = "b", descriptor = "Lclient!HSUOZGYX;")
	private Class1_Sub1 aClass1_Sub1_32 = new Class1_Sub1();

	@OriginalMember(owner = "client!XBBVJJRK", name = "<init>", descriptor = "(B)V")
	public Class44(@OriginalArg(0) byte arg0) {
		try {
			this.aClass1_Sub1_32.aClass1_Sub1_36 = this.aClass1_Sub1_32;
			this.aClass1_Sub1_32.aClass1_Sub1_37 = this.aClass1_Sub1_32;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("91951, " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XBBVJJRK", name = "a", descriptor = "(Lclient!HSUOZGYX;)V")
	public void method491(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_37 != null) {
			arg0.method511();
		}
		arg0.aClass1_Sub1_37 = this.aClass1_Sub1_32.aClass1_Sub1_37;
		arg0.aClass1_Sub1_36 = this.aClass1_Sub1_32;
		arg0.aClass1_Sub1_37.aClass1_Sub1_36 = arg0;
		arg0.aClass1_Sub1_36.aClass1_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!XBBVJJRK", name = "a", descriptor = "()Lclient!HSUOZGYX;")
	public Class1_Sub1 method492() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_32.aClass1_Sub1_36;
		if (local3 == this.aClass1_Sub1_32) {
			return null;
		} else {
			local3.method511();
			return local3;
		}
	}

	@OriginalMember(owner = "client!XBBVJJRK", name = "b", descriptor = "()Lclient!HSUOZGYX;")
	public Class1_Sub1 method493() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_32.aClass1_Sub1_36;
		if (local3 == this.aClass1_Sub1_32) {
			this.aClass1_Sub1_33 = null;
			return null;
		} else {
			this.aClass1_Sub1_33 = local3.aClass1_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!XBBVJJRK", name = "a", descriptor = "(B)Lclient!HSUOZGYX;")
	public Class1_Sub1 method494(@OriginalArg(0) byte arg0) {
		try {
			@Pc(2) Class1_Sub1 local2 = this.aClass1_Sub1_33;
			if (local2 == this.aClass1_Sub1_32) {
				this.aClass1_Sub1_33 = null;
				return null;
			} else {
				this.aClass1_Sub1_33 = local2.aClass1_Sub1_36;
				@Pc(20) boolean local20 = false;
				return local2;
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("68179, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XBBVJJRK", name = "c", descriptor = "()I")
	public int method495() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class1_Sub1 local5 = this.aClass1_Sub1_32.aClass1_Sub1_36; local5 != this.aClass1_Sub1_32; local5 = local5.aClass1_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
