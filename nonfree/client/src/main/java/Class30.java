import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NVDACYAH")
public final class Class30 {

	@OriginalMember(owner = "client!NVDACYAH", name = "b", descriptor = "I")
	private int anInt490;

	@OriginalMember(owner = "client!NVDACYAH", name = "c", descriptor = "I")
	private int anInt491;

	@OriginalMember(owner = "client!NVDACYAH", name = "a", descriptor = "I")
	private int anInt489 = -872;

	@OriginalMember(owner = "client!NVDACYAH", name = "d", descriptor = "Lclient!OHSXMHUZ;")
	private Class1_Sub2 aClass1_Sub2_23 = new Class1_Sub2();

	@OriginalMember(owner = "client!NVDACYAH", name = "h", descriptor = "Lclient!ISCMIAJK;")
	private Class19 aClass19_1 = new Class19(true);

	@OriginalMember(owner = "client!NVDACYAH", name = "e", descriptor = "I")
	private int anInt492;

	@OriginalMember(owner = "client!NVDACYAH", name = "f", descriptor = "I")
	private int anInt493;

	@OriginalMember(owner = "client!NVDACYAH", name = "g", descriptor = "Lclient!EHIGZZMD;")
	private Class7 aClass7_1;

	@OriginalMember(owner = "client!NVDACYAH", name = "<init>", descriptor = "(ZI)V")
	public Class30(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt492 = arg1;
			this.anInt493 = arg1;
			this.aClass7_1 = new Class7(0, 1024);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("69381, " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NVDACYAH", name = "a", descriptor = "(J)Lclient!OHSXMHUZ;")
	public Class1_Sub2 method348(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub2 local5 = (Class1_Sub2) this.aClass7_1.method97(arg0);
		if (local5 == null) {
			this.anInt490++;
		} else {
			this.aClass19_1.method222(local5);
			this.anInt491++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!NVDACYAH", name = "a", descriptor = "(JBLclient!OHSXMHUZ;)V")
	public void method349(@OriginalArg(0) long arg0, @OriginalArg(2) Class1_Sub2 arg1) {
		try {
			if (this.anInt493 == 0) {
				@Pc(8) Class1_Sub2 local8 = this.aClass19_1.method223();
				local8.method571();
				local8.method572();
				if (local8 == this.aClass1_Sub2_23) {
					local8 = this.aClass19_1.method223();
					local8.method571();
					local8.method572();
				}
			} else {
				this.anInt493--;
			}
			this.aClass7_1.method98(arg0, arg1);
			this.aClass19_1.method222(arg1);
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("72111, " + arg0 + ", " + 81 + ", " + arg1 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NVDACYAH", name = "a", descriptor = "()V")
	public void method350() {
		while (true) {
			@Pc(3) Class1_Sub2 local3 = this.aClass19_1.method223();
			if (local3 == null) {
				this.anInt493 = this.anInt492;
				return;
			}
			local3.method571();
			local3.method572();
		}
	}
}
