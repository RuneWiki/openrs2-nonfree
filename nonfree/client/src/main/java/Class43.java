import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WMYPWVZI")
public final class Class43 {

	@OriginalMember(owner = "client!WMYPWVZI", name = "b", descriptor = "I")
	private int anInt716;

	@OriginalMember(owner = "client!WMYPWVZI", name = "c", descriptor = "I")
	private int anInt717;

	@OriginalMember(owner = "client!WMYPWVZI", name = "a", descriptor = "Z")
	private boolean aBoolean216 = false;

	@OriginalMember(owner = "client!WMYPWVZI", name = "d", descriptor = "Lclient!WLTWEDNK;")
	private Class3_Sub1 aClass3_Sub1_33 = new Class3_Sub1();

	@OriginalMember(owner = "client!WMYPWVZI", name = "h", descriptor = "Lclient!VHKTMNAT;")
	private Class41 aClass41_2 = new Class41(true);

	@OriginalMember(owner = "client!WMYPWVZI", name = "e", descriptor = "I")
	private int anInt718;

	@OriginalMember(owner = "client!WMYPWVZI", name = "f", descriptor = "I")
	private int anInt719;

	@OriginalMember(owner = "client!WMYPWVZI", name = "g", descriptor = "Lclient!SAEPCADT;")
	private Class33 aClass33_1;

	@OriginalMember(owner = "client!WMYPWVZI", name = "<init>", descriptor = "(II)V")
	public Class43(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt718 = arg0;
			this.anInt719 = arg0;
			this.aClass33_1 = new Class33(-854, 1024);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("17196, " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WMYPWVZI", name = "a", descriptor = "(J)Lclient!WLTWEDNK;")
	public Class3_Sub1 method484(@OriginalArg(0) long arg0) {
		@Pc(5) Class3_Sub1 local5 = (Class3_Sub1) this.aClass33_1.method354(arg0);
		if (local5 == null) {
			this.anInt716++;
		} else {
			this.aClass41_2.method427(local5);
			this.anInt717++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!WMYPWVZI", name = "a", descriptor = "(JILclient!WLTWEDNK;)V")
	public void method485(@OriginalArg(0) long arg0, @OriginalArg(2) Class3_Sub1 arg1) {
		try {
			if (this.anInt719 == 0) {
				@Pc(8) Class3_Sub1 local8 = this.aClass41_2.method428();
				local8.method535();
				local8.method536();
				if (local8 == this.aClass3_Sub1_33) {
					local8 = this.aClass41_2.method428();
					local8.method535();
					local8.method536();
				}
			} else {
				this.anInt719--;
			}
			this.aClass33_1.method355(arg0, arg1);
			this.aClass41_2.method427(arg1);
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("52454, " + arg0 + ", " + 5 + ", " + arg1 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WMYPWVZI", name = "a", descriptor = "()V")
	public void method486() {
		while (true) {
			@Pc(3) Class3_Sub1 local3 = this.aClass41_2.method428();
			if (local3 == null) {
				this.anInt719 = this.anInt718;
				return;
			}
			local3.method535();
			local3.method536();
		}
	}
}
