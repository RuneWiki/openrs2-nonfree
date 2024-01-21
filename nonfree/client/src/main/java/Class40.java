import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!s")
public final class Class40 {

	@OriginalMember(owner = "client!s", name = "d", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Z")
	private boolean aBoolean221 = true;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "I")
	private int anInt896 = 10514;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	private int anInt897 = 18835;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!w;")
	private Class1_Sub1 aClass1_Sub1_35 = new Class1_Sub1();

	@OriginalMember(owner = "client!s", name = "j", descriptor = "Lclient!pb;")
	private Class32 aClass32_1 = new Class32(true);

	@OriginalMember(owner = "client!s", name = "g", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!s", name = "h", descriptor = "I")
	private int anInt901;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Lclient!t;")
	private Class43 aClass43_1;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(II)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt900 = arg1;
			this.anInt901 = arg1;
			this.aClass43_1 = new Class43(-143, 1024);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("98685, " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(J)Lclient!w;")
	public Class1_Sub1 method591(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass43_1.method632(arg0);
		if (local5 == null) {
			this.anInt898++;
		} else {
			this.aClass32_1.method516(local5);
			this.anInt899++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(JLclient!w;I)V")
	public void method592(@OriginalArg(0) long arg0, @OriginalArg(1) Class1_Sub1 arg1) {
		try {
			if (this.anInt896 != 10514) {
				this.aBoolean221 = !this.aBoolean221;
			}
			if (this.anInt901 == 0) {
				@Pc(20) Class1_Sub1 local20 = this.aClass32_1.method517();
				local20.method673();
				local20.method674();
				if (local20 == this.aClass1_Sub1_35) {
					local20 = this.aClass32_1.method517();
					local20.method673();
					local20.method674();
				}
			} else {
				this.anInt901--;
			}
			this.aClass43_1.method633(arg1, arg0);
			this.aClass32_1.method516(arg1);
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("72605, " + arg0 + ", " + arg1 + ", " + 10514 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
	public void method593() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass32_1.method517();
			if (local3 == null) {
				this.anInt901 = this.anInt900;
				return;
			}
			local3.method673();
			local3.method674();
		}
	}
}
