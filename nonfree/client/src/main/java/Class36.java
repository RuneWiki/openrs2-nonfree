import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!UECXVCCS")
public final class Class36 {

	@OriginalMember(owner = "client!UECXVCCS", name = "b", descriptor = "I")
	private int anInt700;

	@OriginalMember(owner = "client!UECXVCCS", name = "c", descriptor = "I")
	private int anInt701;

	@OriginalMember(owner = "client!UECXVCCS", name = "d", descriptor = "Lclient!DRKSBDQX;")
	private Class3_Sub1 aClass3_Sub1_31 = new Class3_Sub1();

	@OriginalMember(owner = "client!UECXVCCS", name = "h", descriptor = "Lclient!ZLISRGEK;")
	private Class49 aClass49_2 = new Class49(8);

	@OriginalMember(owner = "client!UECXVCCS", name = "e", descriptor = "I")
	private int anInt702;

	@OriginalMember(owner = "client!UECXVCCS", name = "f", descriptor = "I")
	private int anInt703;

	@OriginalMember(owner = "client!UECXVCCS", name = "g", descriptor = "Lclient!OYARMXQN;")
	private Class23 aClass23_1;

	@OriginalMember(owner = "client!UECXVCCS", name = "a", descriptor = "I")
	private int anInt699;

	@OriginalMember(owner = "client!UECXVCCS", name = "<init>", descriptor = "(IB)V")
	public Class36(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			this.anInt702 = arg0;
			this.anInt703 = arg0;
			this.aClass23_1 = new Class23(0, 1024);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("10818, " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UECXVCCS", name = "a", descriptor = "(J)Lclient!DRKSBDQX;")
	public Class3_Sub1 method513(@OriginalArg(0) long arg0) {
		@Pc(5) Class3_Sub1 local5 = (Class3_Sub1) this.aClass23_1.method295(arg0);
		if (local5 == null) {
			this.anInt700++;
		} else {
			this.aClass49_2.method563(local5);
			this.anInt701++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!UECXVCCS", name = "a", descriptor = "(Lclient!DRKSBDQX;IJ)V")
	public void method514(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(2) long arg1) {
		try {
			if (this.anInt703 == 0) {
				@Pc(19) Class3_Sub1 local19 = this.aClass49_2.method564();
				local19.method559();
				local19.method560();
				if (local19 == this.aClass3_Sub1_31) {
					local19 = this.aClass49_2.method564();
					local19.method559();
					local19.method560();
				}
			} else {
				this.anInt703--;
			}
			this.aClass23_1.method296(arg0, arg1);
			this.aClass49_2.method563(arg0);
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("88366, " + arg0 + ", " + -488 + ", " + arg1 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!UECXVCCS", name = "a", descriptor = "()V")
	public void method515() {
		while (true) {
			@Pc(3) Class3_Sub1 local3 = this.aClass49_2.method564();
			if (local3 == null) {
				this.anInt703 = this.anInt702;
				return;
			}
			local3.method559();
			local3.method560();
		}
	}
}
