import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ISCMIAJK")
public final class Class19 {

	@OriginalMember(owner = "client!ISCMIAJK", name = "d", descriptor = "Lclient!OHSXMHUZ;")
	private Class1_Sub2 aClass1_Sub2_18;

	@OriginalMember(owner = "client!ISCMIAJK", name = "a", descriptor = "I")
	private int anInt385 = 40071;

	@OriginalMember(owner = "client!ISCMIAJK", name = "b", descriptor = "Z")
	private boolean aBoolean71 = true;

	@OriginalMember(owner = "client!ISCMIAJK", name = "c", descriptor = "Lclient!OHSXMHUZ;")
	private Class1_Sub2 aClass1_Sub2_17 = new Class1_Sub2();

	@OriginalMember(owner = "client!ISCMIAJK", name = "<init>", descriptor = "(Z)V")
	public Class19(@OriginalArg(0) boolean arg0) {
		try {
			this.aClass1_Sub2_17.aClass1_Sub2_36 = this.aClass1_Sub2_17;
			this.aClass1_Sub2_17.aClass1_Sub2_37 = this.aClass1_Sub2_17;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("26631, " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ISCMIAJK", name = "a", descriptor = "(Lclient!OHSXMHUZ;)V")
	public void method222(@OriginalArg(0) Class1_Sub2 arg0) {
		if (arg0.aClass1_Sub2_37 != null) {
			arg0.method572();
		}
		arg0.aClass1_Sub2_37 = this.aClass1_Sub2_17.aClass1_Sub2_37;
		arg0.aClass1_Sub2_36 = this.aClass1_Sub2_17;
		arg0.aClass1_Sub2_37.aClass1_Sub2_36 = arg0;
		arg0.aClass1_Sub2_36.aClass1_Sub2_37 = arg0;
	}

	@OriginalMember(owner = "client!ISCMIAJK", name = "a", descriptor = "()Lclient!OHSXMHUZ;")
	public Class1_Sub2 method223() {
		@Pc(3) Class1_Sub2 local3 = this.aClass1_Sub2_17.aClass1_Sub2_36;
		if (local3 == this.aClass1_Sub2_17) {
			return null;
		} else {
			local3.method572();
			return local3;
		}
	}

	@OriginalMember(owner = "client!ISCMIAJK", name = "b", descriptor = "()Lclient!OHSXMHUZ;")
	public Class1_Sub2 method224() {
		@Pc(3) Class1_Sub2 local3 = this.aClass1_Sub2_17.aClass1_Sub2_36;
		if (local3 == this.aClass1_Sub2_17) {
			this.aClass1_Sub2_18 = null;
			return null;
		} else {
			this.aClass1_Sub2_18 = local3.aClass1_Sub2_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!ISCMIAJK", name = "a", descriptor = "(I)Lclient!OHSXMHUZ;")
	public Class1_Sub2 method225(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class1_Sub2 local2 = this.aClass1_Sub2_18;
			if (local2 == this.aClass1_Sub2_17) {
				this.aClass1_Sub2_18 = null;
				return null;
			} else {
				this.aClass1_Sub2_18 = local2.aClass1_Sub2_36;
				@Pc(19) boolean local19 = false;
				return local2;
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("87349, " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ISCMIAJK", name = "c", descriptor = "()I")
	public int method226() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class1_Sub2 local5 = this.aClass1_Sub2_17.aClass1_Sub2_36; local5 != this.aClass1_Sub2_17; local5 = local5.aClass1_Sub2_36) {
			local1++;
		}
		return local1;
	}
}
