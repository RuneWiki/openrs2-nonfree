import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!s")
public final class Class40 {

	@OriginalMember(owner = "client!s", name = "d", descriptor = "I")
	private int anInt894;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "I")
	private int anInt895;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "I")
	private int anInt893 = 7228;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!s", name = "c", descriptor = "Z")
	private boolean aBoolean217 = false;

	@OriginalMember(owner = "client!s", name = "f", descriptor = "Lclient!w;")
	private Class1_Sub1 aClass1_Sub1_35 = new Class1_Sub1();

	@OriginalMember(owner = "client!s", name = "j", descriptor = "Lclient!pb;")
	private Class32 aClass32_1 = new Class32((byte) 8);

	@OriginalMember(owner = "client!s", name = "g", descriptor = "I")
	private int anInt896;

	@OriginalMember(owner = "client!s", name = "h", descriptor = "I")
	private int anInt897;

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Lclient!t;")
	private Class43 aClass43_1;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(II)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt896 = arg0;
			this.anInt897 = arg0;
			this.aClass43_1 = new Class43(1024, this.anInt893);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("32010, " + arg0 + ", " + arg1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(J)Lclient!w;")
	public Class1_Sub1 method584(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass43_1.method625(arg0);
		if (local5 == null) {
			this.anInt894++;
		} else {
			this.aClass32_1.method509(local5);
			this.anInt895++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(IJLclient!w;)V")
	public void method585(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) Class1_Sub1 arg2) {
		try {
			@Pc(5) boolean local5 = false;
			if (this.anInt897 == 0) {
				@Pc(12) Class1_Sub1 local12 = this.aClass32_1.method510();
				local12.method667();
				local12.method668();
				if (local12 == this.aClass1_Sub1_35) {
					local12 = this.aClass32_1.method510();
					local12.method667();
					local12.method668();
				}
			} else {
				this.anInt897--;
			}
			this.aClass43_1.method626(arg1, arg2);
			this.aClass32_1.method509(arg2);
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("40450, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
	public void method586() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass32_1.method510();
			if (local3 == null) {
				this.anInt897 = this.anInt896;
				return;
			}
			local3.method667();
			local3.method668();
		}
	}
}
