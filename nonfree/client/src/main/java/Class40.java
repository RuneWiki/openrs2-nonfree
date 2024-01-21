import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!s")
public final class Class40 {

	@OriginalMember(owner = "client!s", name = "d", descriptor = "I")
	private int anInt912;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "I")
	private int anInt913;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "I")
	private int anInt910 = -652;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "Z")
	private boolean aBoolean218 = true;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	private int anInt911 = -1399;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!w;")
	private Class1_Sub1 aClass1_Sub1_35 = new Class1_Sub1();

	@OriginalMember(owner = "client!s", name = "j", descriptor = "Lclient!pb;")
	private Class32 aClass32_1 = new Class32(49694);

	@OriginalMember(owner = "client!s", name = "g", descriptor = "I")
	private int anInt914;

	@OriginalMember(owner = "client!s", name = "h", descriptor = "I")
	private int anInt915;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Lclient!t;")
	private Class43 aClass43_1;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(IZ)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anInt914 = arg0;
			this.anInt915 = arg0;
			this.aClass43_1 = new Class43(1024, -266);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("17396, " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(J)Lclient!w;")
	public Class1_Sub1 method591(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass43_1.method632(arg0);
		if (local5 == null) {
			this.anInt912++;
		} else {
			this.aClass32_1.method516(local5);
			this.anInt913++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!w;JZ)V")
	public void method592(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) boolean arg2) {
		try {
			if (this.anInt915 == 0) {
				@Pc(6) Class1_Sub1 local6 = this.aClass32_1.method517();
				local6.method673();
				local6.method674();
				if (local6 == this.aClass1_Sub1_35) {
					local6 = this.aClass32_1.method517();
					local6.method673();
					local6.method674();
				}
			} else {
				this.anInt915--;
			}
			this.aClass43_1.method633(arg1, arg0);
			if (arg2) {
				this.aClass32_1.method516(arg0);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("83679, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
	public void method593() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass32_1.method517();
			if (local3 == null) {
				this.anInt915 = this.anInt914;
				return;
			}
			local3.method673();
			local3.method674();
		}
	}
}
