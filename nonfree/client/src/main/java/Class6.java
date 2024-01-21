import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DTFBSXNF")
public final class Class6 {

	@OriginalMember(owner = "client!DTFBSXNF", name = "e", descriptor = "Lclient!IYPTVTAD;")
	private Class1_Sub1 aClass1_Sub1_13;

	@OriginalMember(owner = "client!DTFBSXNF", name = "a", descriptor = "Z")
	private boolean aBoolean33 = true;

	@OriginalMember(owner = "client!DTFBSXNF", name = "b", descriptor = "Z")
	private boolean aBoolean34 = false;

	@OriginalMember(owner = "client!DTFBSXNF", name = "c", descriptor = "B")
	private byte aByte2 = -27;

	@OriginalMember(owner = "client!DTFBSXNF", name = "d", descriptor = "Lclient!IYPTVTAD;")
	private Class1_Sub1 aClass1_Sub1_12 = new Class1_Sub1();

	@OriginalMember(owner = "client!DTFBSXNF", name = "<init>", descriptor = "(Z)V")
	public Class6(@OriginalArg(0) boolean arg0) {
		try {
			this.aClass1_Sub1_12.aClass1_Sub1_36 = this.aClass1_Sub1_12;
			this.aClass1_Sub1_12.aClass1_Sub1_37 = this.aClass1_Sub1_12;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("4926, " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DTFBSXNF", name = "a", descriptor = "(Lclient!IYPTVTAD;)V")
	public void method93(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_37 != null) {
			arg0.method545();
		}
		arg0.aClass1_Sub1_37 = this.aClass1_Sub1_12.aClass1_Sub1_37;
		arg0.aClass1_Sub1_36 = this.aClass1_Sub1_12;
		arg0.aClass1_Sub1_37.aClass1_Sub1_36 = arg0;
		arg0.aClass1_Sub1_36.aClass1_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!DTFBSXNF", name = "a", descriptor = "()Lclient!IYPTVTAD;")
	public Class1_Sub1 method94() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_12.aClass1_Sub1_36;
		if (local3 == this.aClass1_Sub1_12) {
			return null;
		} else {
			local3.method545();
			return local3;
		}
	}

	@OriginalMember(owner = "client!DTFBSXNF", name = "b", descriptor = "()Lclient!IYPTVTAD;")
	public Class1_Sub1 method95() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_12.aClass1_Sub1_36;
		if (local3 == this.aClass1_Sub1_12) {
			this.aClass1_Sub1_13 = null;
			return null;
		} else {
			this.aClass1_Sub1_13 = local3.aClass1_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!DTFBSXNF", name = "a", descriptor = "(B)Lclient!IYPTVTAD;")
	public Class1_Sub1 method96() {
		try {
			@Pc(9) Class1_Sub1 local9 = this.aClass1_Sub1_13;
			if (local9 == this.aClass1_Sub1_12) {
				this.aClass1_Sub1_13 = null;
				return null;
			} else {
				this.aClass1_Sub1_13 = local9.aClass1_Sub1_36;
				return local9;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("38150, " + 5 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DTFBSXNF", name = "c", descriptor = "()I")
	public int method97() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class1_Sub1 local5 = this.aClass1_Sub1_12.aClass1_Sub1_36; local5 != this.aClass1_Sub1_12; local5 = local5.aClass1_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
