import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!ACKKZISC")
public final class Class1 {

	@OriginalMember(owner = "client!ACKKZISC", name = "c", descriptor = "I")
	private int anInt1;

	@OriginalMember(owner = "client!ACKKZISC", name = "d", descriptor = "I")
	private int anInt2;

	@OriginalMember(owner = "client!ACKKZISC", name = "a", descriptor = "Z")
	private boolean aBoolean1 = true;

	@OriginalMember(owner = "client!ACKKZISC", name = "b", descriptor = "Z")
	private boolean aBoolean2 = false;

	@OriginalMember(owner = "client!ACKKZISC", name = "e", descriptor = "Lclient!HZZJZIMV;")
	private Class2_Sub1 aClass2_Sub1_1 = new Class2_Sub1();

	@OriginalMember(owner = "client!ACKKZISC", name = "i", descriptor = "Lclient!JTFJPMGL;")
	private Class19 aClass19_1 = new Class19(-120);

	@OriginalMember(owner = "client!ACKKZISC", name = "f", descriptor = "I")
	private int anInt3;

	@OriginalMember(owner = "client!ACKKZISC", name = "g", descriptor = "I")
	private int anInt4;

	@OriginalMember(owner = "client!ACKKZISC", name = "h", descriptor = "Lclient!SOYNUDRE;")
	private Class36 aClass36_1;

	@OriginalMember(owner = "client!ACKKZISC", name = "<init>", descriptor = "(ZI)V")
	public Class1(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt3 = arg1;
			this.anInt4 = arg1;
			this.aClass36_1 = new Class36(1024, (byte) 34);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("83083, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ACKKZISC", name = "a", descriptor = "(J)Lclient!HZZJZIMV;")
	public Class2_Sub1 method1(@OriginalArg(0) long arg0) {
		@Pc(5) Class2_Sub1 local5 = (Class2_Sub1) this.aClass36_1.method392(arg0);
		if (local5 == null) {
			this.anInt1++;
		} else {
			this.aClass19_1.method196(local5);
			this.anInt2++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ACKKZISC", name = "a", descriptor = "(IJLclient!HZZJZIMV;)V")
	public void method2(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class2_Sub1 arg2) {
		try {
			if (this.anInt4 == 0) {
				@Pc(6) Class2_Sub1 local6 = this.aClass19_1.method197();
				local6.method507();
				local6.method508();
				if (local6 == this.aClass2_Sub1_1) {
					local6 = this.aClass19_1.method197();
					local6.method507();
					local6.method508();
				}
			} else {
				this.anInt4--;
			}
			this.aClass36_1.method393(arg2, arg1);
			this.aClass19_1.method196(arg2);
			if (arg0 != 0) {
				this.aBoolean2 = !this.aBoolean2;
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("53427, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!ACKKZISC", name = "a", descriptor = "()V")
	public void method3() {
		while (true) {
			@Pc(3) Class2_Sub1 local3 = this.aClass19_1.method197();
			if (local3 == null) {
				this.anInt4 = this.anInt3;
				return;
			}
			local3.method507();
			local3.method508();
		}
	}
}
