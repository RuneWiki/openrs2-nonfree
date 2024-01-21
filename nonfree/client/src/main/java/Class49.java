import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ZPNSJLZE")
public final class Class49 {

	@OriginalMember(owner = "client!ZPNSJLZE", name = "c", descriptor = "I")
	private int anInt766;

	@OriginalMember(owner = "client!ZPNSJLZE", name = "d", descriptor = "I")
	private int anInt767;

	@OriginalMember(owner = "client!ZPNSJLZE", name = "a", descriptor = "Z")
	private boolean aBoolean187 = false;

	@OriginalMember(owner = "client!ZPNSJLZE", name = "b", descriptor = "I")
	private int anInt765 = -44493;

	@OriginalMember(owner = "client!ZPNSJLZE", name = "e", descriptor = "Lclient!KWULTEKW;")
	private Class3_Sub1 aClass3_Sub1_33 = new Class3_Sub1();

	@OriginalMember(owner = "client!ZPNSJLZE", name = "i", descriptor = "Lclient!YGUBUIIU;")
	private Class46 aClass46_2 = new Class46(false);

	@OriginalMember(owner = "client!ZPNSJLZE", name = "f", descriptor = "I")
	private int anInt768;

	@OriginalMember(owner = "client!ZPNSJLZE", name = "g", descriptor = "I")
	private int anInt769;

	@OriginalMember(owner = "client!ZPNSJLZE", name = "h", descriptor = "Lclient!XWMRKIHQ;")
	private Class45 aClass45_1;

	@OriginalMember(owner = "client!ZPNSJLZE", name = "<init>", descriptor = "(IZ)V")
	public Class49(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anInt768 = arg0;
			this.anInt769 = arg0;
			this.aClass45_1 = new Class45(1024, 38166);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("21592, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZPNSJLZE", name = "a", descriptor = "(J)Lclient!KWULTEKW;")
	public Class3_Sub1 method542(@OriginalArg(0) long arg0) {
		@Pc(5) Class3_Sub1 local5 = (Class3_Sub1) this.aClass45_1.method482(arg0);
		if (local5 == null) {
			this.anInt766++;
		} else {
			this.aClass46_2.method516(local5);
			this.anInt767++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ZPNSJLZE", name = "a", descriptor = "(Lclient!KWULTEKW;IJ)V")
	public void method543(@OriginalArg(0) Class3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2) {
		try {
			if (this.anInt769 == 0) {
				@Pc(6) Class3_Sub1 local6 = this.aClass46_2.method517();
				local6.method547();
				local6.method548();
				if (local6 == this.aClass3_Sub1_33) {
					local6 = this.aClass46_2.method517();
					local6.method547();
					local6.method548();
				}
			} else {
				this.anInt769--;
			}
			this.aClass45_1.method483(arg0, arg2);
			this.aClass46_2.method516(arg0);
			if (arg1 != 0) {
				this.aBoolean187 = !this.aBoolean187;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("88679, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ZPNSJLZE", name = "a", descriptor = "()V")
	public void method544() {
		while (true) {
			@Pc(3) Class3_Sub1 local3 = this.aClass46_2.method517();
			if (local3 == null) {
				this.anInt769 = this.anInt768;
				return;
			}
			local3.method547();
			local3.method548();
		}
	}
}
