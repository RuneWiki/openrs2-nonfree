import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BGEXEDZG")
public final class Class3 {

	@OriginalMember(owner = "client!BGEXEDZG", name = "e", descriptor = "Lclient!UXRJCYSS;")
	private Class1_Sub1 aClass1_Sub1_10;

	@OriginalMember(owner = "client!BGEXEDZG", name = "a", descriptor = "Z")
	private boolean aBoolean20 = true;

	@OriginalMember(owner = "client!BGEXEDZG", name = "b", descriptor = "I")
	private int anInt111 = -514;

	@OriginalMember(owner = "client!BGEXEDZG", name = "c", descriptor = "B")
	private byte aByte2 = 0;

	@OriginalMember(owner = "client!BGEXEDZG", name = "d", descriptor = "Lclient!UXRJCYSS;")
	private Class1_Sub1 aClass1_Sub1_9 = new Class1_Sub1();

	@OriginalMember(owner = "client!BGEXEDZG", name = "<init>", descriptor = "(B)V")
	public Class3(@OriginalArg(0) byte arg0) {
		try {
			this.aClass1_Sub1_9.aClass1_Sub1_36 = this.aClass1_Sub1_9;
			@Pc(25) boolean local25 = false;
			this.aClass1_Sub1_9.aClass1_Sub1_37 = this.aClass1_Sub1_9;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("17845, " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BGEXEDZG", name = "a", descriptor = "(Lclient!UXRJCYSS;)V")
	public void method27(@OriginalArg(0) Class1_Sub1 arg0) {
		if (arg0.aClass1_Sub1_37 != null) {
			arg0.method508();
		}
		arg0.aClass1_Sub1_37 = this.aClass1_Sub1_9.aClass1_Sub1_37;
		arg0.aClass1_Sub1_36 = this.aClass1_Sub1_9;
		arg0.aClass1_Sub1_37.aClass1_Sub1_36 = arg0;
		arg0.aClass1_Sub1_36.aClass1_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!BGEXEDZG", name = "a", descriptor = "()Lclient!UXRJCYSS;")
	public Class1_Sub1 method28() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_9.aClass1_Sub1_36;
		if (local3 == this.aClass1_Sub1_9) {
			return null;
		} else {
			local3.method508();
			return local3;
		}
	}

	@OriginalMember(owner = "client!BGEXEDZG", name = "b", descriptor = "()Lclient!UXRJCYSS;")
	public Class1_Sub1 method29() {
		@Pc(3) Class1_Sub1 local3 = this.aClass1_Sub1_9.aClass1_Sub1_36;
		if (local3 == this.aClass1_Sub1_9) {
			this.aClass1_Sub1_10 = null;
			return null;
		} else {
			this.aClass1_Sub1_10 = local3.aClass1_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!BGEXEDZG", name = "a", descriptor = "(I)Lclient!UXRJCYSS;")
	public Class1_Sub1 method30() {
		try {
			@Pc(2) Class1_Sub1 local2 = this.aClass1_Sub1_10;
			if (local2 == this.aClass1_Sub1_9) {
				this.aClass1_Sub1_10 = null;
				return null;
			} else {
				this.aClass1_Sub1_10 = local2.aClass1_Sub1_36;
				return local2;
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("140, " + 67 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BGEXEDZG", name = "c", descriptor = "()I")
	public int method31() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class1_Sub1 local5 = this.aClass1_Sub1_9.aClass1_Sub1_36; local5 != this.aClass1_Sub1_9; local5 = local5.aClass1_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
