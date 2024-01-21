import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!s")
public final class Class40 {

	@OriginalMember(owner = "client!s", name = "b", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	private int anInt898;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "Z")
	private boolean aBoolean225 = false;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "Lclient!w;")
	private Class1_Sub1 aClass1_Sub1_35 = new Class1_Sub1();

	@OriginalMember(owner = "client!s", name = "h", descriptor = "Lclient!pb;")
	private Class32 aClass32_1 = new Class32(false);

	@OriginalMember(owner = "client!s", name = "e", descriptor = "I")
	private int anInt899;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "I")
	private int anInt900;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "Lclient!t;")
	private Class43 aClass43_1;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(ZI)V")
	public Class40(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt899 = arg1;
			this.anInt900 = arg1;
			this.aClass43_1 = new Class43(1024, 26228);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("51142, " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(J)Lclient!w;")
	public Class1_Sub1 method585(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass43_1.method626(arg0);
		if (local5 == null) {
			this.anInt897++;
		} else {
			this.aClass32_1.method510(local5);
			this.anInt898++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(ILclient!w;J)V")
	public void method586(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub1 arg1, @OriginalArg(2) long arg2) {
		try {
			if (this.anInt900 == 0) {
				@Pc(8) Class1_Sub1 local8 = this.aClass32_1.method511();
				local8.method668();
				local8.method669();
				if (local8 == this.aClass1_Sub1_35) {
					local8 = this.aClass32_1.method511();
					local8.method668();
					local8.method669();
				}
			} else {
				this.anInt900--;
			}
			this.aClass43_1.method627(arg1, arg2);
			@Pc(42) boolean local42 = false;
			this.aClass32_1.method510(arg1);
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("91466, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
	public void method587() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass32_1.method511();
			if (local3 == null) {
				this.anInt900 = this.anInt899;
				return;
			}
			local3.method668();
			local3.method669();
		}
	}
}
