import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!s")
public final class Class40 {

	@OriginalMember(owner = "client!s", name = "b", descriptor = "I")
	private int anInt886;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	private int anInt887;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Z")
	private boolean aBoolean234 = true;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "Lclient!w;")
	private Class1_Sub1 aClass1_Sub1_35 = new Class1_Sub1();

	@OriginalMember(owner = "client!s", name = "h", descriptor = "Lclient!pb;")
	private Class32 aClass32_1 = new Class32(-5693);

	@OriginalMember(owner = "client!s", name = "e", descriptor = "I")
	private int anInt888;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "I")
	private int anInt889;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Lclient!t;")
	private Class43 aClass43_1;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(IZ)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anInt888 = arg0;
			this.anInt889 = arg0;
			this.aClass43_1 = new Class43(532, 1024);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("45431, " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(J)Lclient!w;")
	public Class1_Sub1 method591(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass43_1.method632(arg0);
		if (local5 == null) {
			this.anInt886++;
		} else {
			this.aClass32_1.method516(local5);
			this.anInt887++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(JILclient!w;)V")
	public void method592(@OriginalArg(0) long arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		try {
			if (this.anInt889 == 0) {
				@Pc(8) Class1_Sub1 local8 = this.aClass32_1.method517();
				local8.method673();
				local8.method674();
				if (local8 == this.aClass1_Sub1_35) {
					local8 = this.aClass32_1.method517();
					local8.method673();
					local8.method674();
				}
			} else {
				this.anInt889--;
			}
			this.aClass43_1.method633(arg0, arg1);
			this.aClass32_1.method516(arg1);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("65971, " + arg0 + ", " + -533 + ", " + arg1 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
	public void method593() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass32_1.method517();
			if (local3 == null) {
				this.anInt889 = this.anInt888;
				return;
			}
			local3.method673();
			local3.method674();
		}
	}
}
