import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!s")
public final class Class40 {

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	private int anInt890;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "I")
	private int anInt891;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "I")
	private int anInt889 = -276;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "Z")
	private boolean aBoolean221 = false;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "Lclient!w;")
	private Class1_Sub1 aClass1_Sub1_35 = new Class1_Sub1();

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Lclient!pb;")
	private Class32 aClass32_1 = new Class32(true);

	@OriginalMember(owner = "client!s", name = "f", descriptor = "I")
	private int anInt892;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "I")
	private int anInt893;

	@OriginalMember(owner = "client!s", name = "h", descriptor = "Lclient!t;")
	private Class43 aClass43_1;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(BI)V")
	public Class40(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt892 = arg1;
			this.anInt893 = arg1;
			this.aClass43_1 = new Class43((byte) 10, 1024);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("76062, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(J)Lclient!w;")
	public Class1_Sub1 method591(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass43_1.method632(arg0);
		if (local5 == null) {
			this.anInt890++;
		} else {
			this.aClass32_1.method516(local5);
			this.anInt891++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(JILclient!w;)V")
	public void method592(@OriginalArg(0) long arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		try {
			if (this.anInt893 == 0) {
				@Pc(17) Class1_Sub1 local17 = this.aClass32_1.method517();
				local17.method673();
				local17.method674();
				if (local17 == this.aClass1_Sub1_35) {
					local17 = this.aClass32_1.method517();
					local17.method673();
					local17.method674();
				}
			} else {
				this.anInt893--;
			}
			this.aClass43_1.method633(arg1, arg0);
			this.aClass32_1.method516(arg1);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("22839, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
	public void method593() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass32_1.method517();
			if (local3 == null) {
				this.anInt893 = this.anInt892;
				return;
			}
			local3.method673();
			local3.method674();
		}
	}
}
