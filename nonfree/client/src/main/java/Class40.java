import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!s")
public final class Class40 {

	@OriginalMember(owner = "client!s", name = "c", descriptor = "I")
	private int anInt870;

	@OriginalMember(owner = "client!s", name = "d", descriptor = "I")
	private int anInt871;

	@OriginalMember(owner = "client!s", name = "a", descriptor = "I")
	private int anInt869 = 848;

	@OriginalMember(owner = "client!s", name = "b", descriptor = "Z")
	private boolean aBoolean236 = false;

	@OriginalMember(owner = "client!s", name = "e", descriptor = "Lclient!w;")
	private Class1_Sub1 aClass1_Sub1_35 = new Class1_Sub1();

	@OriginalMember(owner = "client!s", name = "i", descriptor = "Lclient!pb;")
	private Class32 aClass32_1 = new Class32(false);

	@OriginalMember(owner = "client!s", name = "f", descriptor = "I")
	private int anInt872;

	@OriginalMember(owner = "client!s", name = "g", descriptor = "I")
	private int anInt873;

	@OriginalMember(owner = "client!s", name = "h", descriptor = "Lclient!t;")
	private Class43 aClass43_1;

	@OriginalMember(owner = "client!s", name = "<init>", descriptor = "(II)V")
	public Class40(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt872 = arg0;
			this.anInt873 = arg0;
			this.aClass43_1 = new Class43((byte) -114, 1024);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("44525, " + arg0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(J)Lclient!w;")
	public Class1_Sub1 method583(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub1 local5 = (Class1_Sub1) this.aClass43_1.method624(arg0);
		if (local5 == null) {
			this.anInt870++;
		} else {
			this.aClass32_1.method508(local5);
			this.anInt871++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "(JLclient!w;I)V")
	public void method584(@OriginalArg(0) long arg0, @OriginalArg(1) Class1_Sub1 arg1, @OriginalArg(2) int arg2) {
		try {
			if (this.anInt873 == 0) {
				@Pc(6) Class1_Sub1 local6 = this.aClass32_1.method509();
				local6.method666();
				local6.method667();
				if (local6 == this.aClass1_Sub1_35) {
					local6 = this.aClass32_1.method509();
					local6.method666();
					local6.method667();
				}
			} else {
				this.anInt873--;
			}
			this.aClass43_1.method625(arg0, arg1);
			if (arg2 > 0) {
				this.aClass32_1.method508(arg1);
			}
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("54060, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!s", name = "a", descriptor = "()V")
	public void method585() {
		while (true) {
			@Pc(3) Class1_Sub1 local3 = this.aClass32_1.method509();
			if (local3 == null) {
				this.anInt873 = this.anInt872;
				return;
			}
			local3.method666();
			local3.method667();
		}
	}
}
