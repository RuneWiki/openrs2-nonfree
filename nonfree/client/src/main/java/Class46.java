import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YGUBUIIU")
public final class Class46 {

	@OriginalMember(owner = "client!YGUBUIIU", name = "d", descriptor = "Lclient!KWULTEKW;")
	private Class3_Sub1 aClass3_Sub1_28;

	@OriginalMember(owner = "client!YGUBUIIU", name = "a", descriptor = "Z")
	private boolean aBoolean172 = false;

	@OriginalMember(owner = "client!YGUBUIIU", name = "b", descriptor = "I")
	private int anInt694 = 6;

	@OriginalMember(owner = "client!YGUBUIIU", name = "c", descriptor = "Lclient!KWULTEKW;")
	private Class3_Sub1 aClass3_Sub1_27 = new Class3_Sub1();

	@OriginalMember(owner = "client!YGUBUIIU", name = "<init>", descriptor = "(Z)V")
	public Class46(@OriginalArg(0) boolean arg0) {
		try {
			this.aClass3_Sub1_27.aClass3_Sub1_36 = this.aClass3_Sub1_27;
			this.aClass3_Sub1_27.aClass3_Sub1_37 = this.aClass3_Sub1_27;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("36859, " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YGUBUIIU", name = "a", descriptor = "(Lclient!KWULTEKW;)V")
	public void method516(@OriginalArg(0) Class3_Sub1 arg0) {
		if (arg0.aClass3_Sub1_37 != null) {
			arg0.method548();
		}
		arg0.aClass3_Sub1_37 = this.aClass3_Sub1_27.aClass3_Sub1_37;
		arg0.aClass3_Sub1_36 = this.aClass3_Sub1_27;
		arg0.aClass3_Sub1_37.aClass3_Sub1_36 = arg0;
		arg0.aClass3_Sub1_36.aClass3_Sub1_37 = arg0;
	}

	@OriginalMember(owner = "client!YGUBUIIU", name = "a", descriptor = "()Lclient!KWULTEKW;")
	public Class3_Sub1 method517() {
		@Pc(3) Class3_Sub1 local3 = this.aClass3_Sub1_27.aClass3_Sub1_36;
		if (local3 == this.aClass3_Sub1_27) {
			return null;
		} else {
			local3.method548();
			return local3;
		}
	}

	@OriginalMember(owner = "client!YGUBUIIU", name = "b", descriptor = "()Lclient!KWULTEKW;")
	public Class3_Sub1 method518() {
		@Pc(3) Class3_Sub1 local3 = this.aClass3_Sub1_27.aClass3_Sub1_36;
		if (local3 == this.aClass3_Sub1_27) {
			this.aClass3_Sub1_28 = null;
			return null;
		} else {
			this.aClass3_Sub1_28 = local3.aClass3_Sub1_36;
			return local3;
		}
	}

	@OriginalMember(owner = "client!YGUBUIIU", name = "a", descriptor = "(I)Lclient!KWULTEKW;")
	public Class3_Sub1 method519(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class3_Sub1 local2 = this.aClass3_Sub1_28;
			if (local2 == this.aClass3_Sub1_27) {
				this.aClass3_Sub1_28 = null;
				return null;
			}
			this.aClass3_Sub1_28 = local2.aClass3_Sub1_36;
			if (arg0 != 0) {
				this.aBoolean172 = !this.aBoolean172;
			}
			return local2;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("50299, " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YGUBUIIU", name = "c", descriptor = "()I")
	public int method520() {
		@Pc(1) int local1 = 0;
		for (@Pc(5) Class3_Sub1 local5 = this.aClass3_Sub1_27.aClass3_Sub1_36; local5 != this.aClass3_Sub1_27; local5 = local5.aClass3_Sub1_36) {
			local1++;
		}
		return local1;
	}
}
