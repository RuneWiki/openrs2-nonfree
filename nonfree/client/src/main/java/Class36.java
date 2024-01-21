import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!THJKANXW")
public final class Class36 {

	@OriginalMember(owner = "client!THJKANXW", name = "b", descriptor = "I")
	private static int anInt602;

	@OriginalMember(owner = "client!THJKANXW", name = "c", descriptor = "I")
	private int anInt603;

	@OriginalMember(owner = "client!THJKANXW", name = "d", descriptor = "I")
	private int anInt604;

	@OriginalMember(owner = "client!THJKANXW", name = "a", descriptor = "Z")
	private boolean aBoolean147 = true;

	@OriginalMember(owner = "client!THJKANXW", name = "e", descriptor = "Lclient!KIFEZIQJ;")
	private Class2_Sub1 aClass2_Sub1_27 = new Class2_Sub1();

	@OriginalMember(owner = "client!THJKANXW", name = "i", descriptor = "Lclient!YAKFHRTY;")
	private Class43 aClass43_2 = new Class43(anInt602);

	@OriginalMember(owner = "client!THJKANXW", name = "f", descriptor = "I")
	private int anInt605;

	@OriginalMember(owner = "client!THJKANXW", name = "g", descriptor = "I")
	private int anInt606;

	@OriginalMember(owner = "client!THJKANXW", name = "h", descriptor = "Lclient!YDNMMDSW;")
	private Class44 aClass44_1;

	@OriginalMember(owner = "client!THJKANXW", name = "<init>", descriptor = "(IZ)V")
	public Class36(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anInt605 = arg0;
			this.anInt606 = arg0;
			this.aClass44_1 = new Class44(153, 1024);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("70197, " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!THJKANXW", name = "a", descriptor = "(J)Lclient!KIFEZIQJ;")
	public Class2_Sub1 method456(@OriginalArg(0) long arg0) {
		@Pc(5) Class2_Sub1 local5 = (Class2_Sub1) this.aClass44_1.method508(arg0);
		if (local5 == null) {
			this.anInt603++;
		} else {
			this.aClass43_2.method503(local5);
			this.anInt604++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!THJKANXW", name = "a", descriptor = "(JZLclient!KIFEZIQJ;)V")
	public void method457(@OriginalArg(0) long arg0, @OriginalArg(2) Class2_Sub1 arg1) {
		try {
			if (this.anInt606 == 0) {
				@Pc(17) Class2_Sub1 local17 = this.aClass43_2.method504();
				local17.method573();
				local17.method574();
				if (local17 == this.aClass2_Sub1_27) {
					local17 = this.aClass43_2.method504();
					local17.method573();
					local17.method574();
				}
			} else {
				this.anInt606--;
			}
			this.aClass44_1.method509(arg0, arg1);
			this.aClass43_2.method503(arg1);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("64968, " + arg0 + ", " + true + ", " + arg1 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!THJKANXW", name = "a", descriptor = "()V")
	public void method458() {
		while (true) {
			@Pc(3) Class2_Sub1 local3 = this.aClass43_2.method504();
			if (local3 == null) {
				this.anInt606 = this.anInt605;
				return;
			}
			local3.method573();
			local3.method574();
		}
	}
}
