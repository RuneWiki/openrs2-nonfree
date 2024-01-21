import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QASTZCLF")
public final class Class33 {

	@OriginalMember(owner = "client!QASTZCLF", name = "b", descriptor = "I")
	private int anInt568;

	@OriginalMember(owner = "client!QASTZCLF", name = "c", descriptor = "I")
	private int anInt569;

	@OriginalMember(owner = "client!QASTZCLF", name = "a", descriptor = "I")
	private int anInt567 = 45;

	@OriginalMember(owner = "client!QASTZCLF", name = "d", descriptor = "Lclient!IVMCUDWL;")
	private Class8_Sub1 aClass8_Sub1_25 = new Class8_Sub1();

	@OriginalMember(owner = "client!QASTZCLF", name = "h", descriptor = "Lclient!QHOLWOGP;")
	private Class34 aClass34_2 = new Class34((byte) -67);

	@OriginalMember(owner = "client!QASTZCLF", name = "e", descriptor = "I")
	private int anInt570;

	@OriginalMember(owner = "client!QASTZCLF", name = "f", descriptor = "I")
	private int anInt571;

	@OriginalMember(owner = "client!QASTZCLF", name = "g", descriptor = "Lclient!CABSPGMS;")
	private Class6 aClass6_1;

	@OriginalMember(owner = "client!QASTZCLF", name = "<init>", descriptor = "(IZ)V")
	public Class33(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anInt570 = arg0;
			this.anInt571 = arg0;
			this.aClass6_1 = new Class6(1024, 0);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("53800, " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QASTZCLF", name = "a", descriptor = "(J)Lclient!IVMCUDWL;")
	public Class8_Sub1 method367(@OriginalArg(0) long arg0) {
		@Pc(5) Class8_Sub1 local5 = (Class8_Sub1) this.aClass6_1.method46(arg0);
		if (local5 == null) {
			this.anInt568++;
		} else {
			this.aClass34_2.method370(local5);
			this.anInt569++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!QASTZCLF", name = "a", descriptor = "(Lclient!IVMCUDWL;JI)V")
	public void method368(@OriginalArg(0) Class8_Sub1 arg0, @OriginalArg(1) long arg1) {
		try {
			if (this.anInt571 == 0) {
				@Pc(8) Class8_Sub1 local8 = this.aClass34_2.method371();
				local8.method543();
				local8.method544();
				if (local8 == this.aClass8_Sub1_25) {
					local8 = this.aClass34_2.method371();
					local8.method543();
					local8.method544();
				}
			} else {
				this.anInt571--;
			}
			this.aClass6_1.method47(arg0, arg1);
			this.aClass34_2.method370(arg0);
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("19207, " + arg0 + ", " + arg1 + ", " + -27210 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QASTZCLF", name = "a", descriptor = "()V")
	public void method369() {
		while (true) {
			@Pc(3) Class8_Sub1 local3 = this.aClass34_2.method371();
			if (local3 == null) {
				this.anInt571 = this.anInt570;
				return;
			}
			local3.method543();
			local3.method544();
		}
	}
}
