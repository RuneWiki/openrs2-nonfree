import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!s")
public final class Class40 {

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	private int anInt874;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "I")
	private int anInt875;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Z")
	private boolean aBoolean235 = false;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "I")
	private int anInt873 = -32;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "Lclient!w;")
	private Class1_Sub1 aClass1_Sub1_35 = new Class1_Sub1();

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Lclient!pb;")
	private Class32 aClass32_1 = new Class32((byte) 5);

	@OriginalMember(owner = "client!s", name = "f", descriptor = "I")
	private int anInt876;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "I")
	private int anInt877;

	@OriginalMember(owner = "client!s", name = "h", descriptor = "Lclient!t;")
	private Class43 aClass43_1;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(IB)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			this.anInt876 = arg0;
			this.anInt877 = arg0;
			this.aClass43_1 = new Class43(1024, this.anInt873);
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("25667, " + arg0 + ", " + arg1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(J)Lclient!w;")
	public Class1_Sub1 method591(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass43_1.method632(arg0);
		if (local5 == null) {
			this.anInt874++;
		} else {
			this.aClass32_1.method516(local5);
			this.anInt875++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!w;IJ)V")
	public void method592(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(2) long arg1) {
		try {
			if (this.anInt877 == 0) {
				@Pc(8) Class1_Sub1 local8 = this.aClass32_1.method517();
				local8.method673();
				local8.method674();
				if (local8 == this.aClass1_Sub1_35) {
					local8 = this.aClass32_1.method517();
					local8.method673();
					local8.method674();
				}
			} else {
				this.anInt877--;
			}
			this.aClass43_1.method633(38, arg0, arg1);
			this.aClass32_1.method516(arg0);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("81235, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
	public void method593() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass32_1.method517();
			if (local3 == null) {
				this.anInt877 = this.anInt876;
				return;
			}
			local3.method673();
			local3.method674();
		}
	}
}
