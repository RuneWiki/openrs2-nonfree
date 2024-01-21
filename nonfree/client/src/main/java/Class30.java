import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!r")
public final class Class30 {

	@OriginalMember(owner = "client!r", name = "a", descriptor = "Z")
	private boolean aBoolean106 = true;

	@OriginalMember(owner = "client!r", name = "d", descriptor = "Lclient!s;")
	private Class32 aClass32_1 = new Class32(false, 1024);

	@OriginalMember(owner = "client!r", name = "e", descriptor = "Lclient!ob;")
	private Class25 aClass25_1 = new Class25((byte) 3);

	@OriginalMember(owner = "client!r", name = "b", descriptor = "I")
	private int anInt530;

	@OriginalMember(owner = "client!r", name = "c", descriptor = "I")
	private int anInt531;

	@OriginalMember(owner = "client!r", name = "<init>", descriptor = "(II)V")
	public Class30(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt530 = arg1;
		this.anInt531 = arg1;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(J)Lclient!cb;")
	public Class1_Sub3 method419(@OriginalArg(0) long arg0) {
		@Pc(5) Class1_Sub3 local5 = (Class1_Sub3) this.aClass32_1.method422(arg0);
		if (local5 != null) {
			this.aClass25_1.method357(local5);
		}
		return local5;
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "(Lclient!cb;JB)V")
	public void method420(@OriginalArg(0) Class1_Sub3 arg0, @OriginalArg(1) long arg1, @OriginalArg(2) byte arg2) {
		if (this.anInt531 == 0) {
			@Pc(8) Class1_Sub3 local8 = this.aClass25_1.method358();
			local8.method478();
			local8.method321();
		} else {
			this.anInt531--;
		}
		this.aClass32_1.method423(arg1, arg0);
		if (arg2 != 2) {
			this.aBoolean106 = !this.aBoolean106;
		}
		this.aClass25_1.method357(arg0);
	}

	@OriginalMember(owner = "client!r", name = "a", descriptor = "()V")
	public void method421() {
		while (true) {
			@Pc(3) Class1_Sub3 local3 = this.aClass25_1.method358();
			if (local3 == null) {
				this.anInt531 = this.anInt530;
				return;
			}
			local3.method478();
			local3.method321();
		}
	}
}
