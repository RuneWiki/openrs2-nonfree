import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!s")
public final class Class39 {

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Z")
	private boolean aBoolean211 = false;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "Z")
	private boolean aBoolean212 = false;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "Lclient!w;")
	private Class1_Sub1 aClass1_Sub1_37 = new Class1_Sub1();

	@OriginalMember(owner = "client!s", name = "h", descriptor = "Lclient!t;")
	private Class42 aClass42_1 = new Class42(1024, 3);

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Lclient!qb;")
	private Class34 aClass34_1 = new Class34(956);

	@OriginalMember(owner = "client!s", name = "f", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(IZ)V")
	public Class39(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anInt899 = arg0;
			this.anInt900 = arg0;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("54632, " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(J)Lclient!w;")
	public Class1_Sub1 method604(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass42_1.method617(arg0);
		if (local5 == null) {
			this.anInt897++;
		} else {
			this.aClass34_1.method539(local5);
			this.anInt898++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(Lclient!w;JZ)V")
	public void method605(@OriginalArg(0) Class1_Sub1 arg0, @OriginalArg(1) long arg1) {
		try {
			if (this.anInt900 == 0) {
				@Pc(16) Class1_Sub1 local16 = this.aClass34_1.method540();
				local16.method690();
				local16.method691();
				if (local16 == this.aClass1_Sub1_37) {
					local16 = this.aClass34_1.method540();
					local16.method690();
					local16.method691();
				}
			} else {
				this.anInt900--;
			}
			this.aClass42_1.method618(arg0, arg1);
			this.aClass34_1.method539(arg0);
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("39915, " + arg0 + ", " + arg1 + ", " + true + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
	public void method606() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass34_1.method540();
			if (local3 == null) {
				this.anInt900 = this.anInt899;
				return;
			}
			local3.method690();
			local3.method691();
		}
	}
}
