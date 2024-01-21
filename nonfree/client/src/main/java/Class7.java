import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DSCQIAPU")
public final class Class7 {

	@OriginalMember(owner = "client!DSCQIAPU", name = "b", descriptor = "I")
	private int anInt91;

	@OriginalMember(owner = "client!DSCQIAPU", name = "c", descriptor = "I")
	private int anInt92;

	@OriginalMember(owner = "client!DSCQIAPU", name = "a", descriptor = "Z")
	private boolean aBoolean21 = true;

	@OriginalMember(owner = "client!DSCQIAPU", name = "d", descriptor = "Lclient!MCYIFIZT;")
	private Class3_Sub1 aClass3_Sub1_9 = new Class3_Sub1();

	@OriginalMember(owner = "client!DSCQIAPU", name = "h", descriptor = "Lclient!EDMDOBNM;")
	private Class9 aClass9_1 = new Class9(0);

	@OriginalMember(owner = "client!DSCQIAPU", name = "e", descriptor = "I")
	private int anInt93;

	@OriginalMember(owner = "client!DSCQIAPU", name = "f", descriptor = "I")
	private int anInt94;

	@OriginalMember(owner = "client!DSCQIAPU", name = "g", descriptor = "Lclient!JJYRPNAX;")
	private Class19 aClass19_1;

	@OriginalMember(owner = "client!DSCQIAPU", name = "<init>", descriptor = "(II)V")
	public Class7(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.anInt93 = arg1;
			this.anInt94 = arg1;
			this.aClass19_1 = new Class19(-952, 1024);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("33698, " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DSCQIAPU", name = "a", descriptor = "(J)Lclient!MCYIFIZT;")
	public Class3_Sub1 method65(@OriginalArg(0) long arg0) {
		@Pc(5) Class3_Sub1 local5 = (Class3_Sub1) this.aClass19_1.method232(arg0);
		if (local5 == null) {
			this.anInt91++;
		} else {
			this.aClass9_1.method79(local5);
			this.anInt92++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!DSCQIAPU", name = "a", descriptor = "(ZLclient!MCYIFIZT;J)V")
	public void method66(@OriginalArg(1) Class3_Sub1 arg0, @OriginalArg(2) long arg1) {
		try {
			if (this.anInt94 == 0) {
				@Pc(6) Class3_Sub1 local6 = this.aClass9_1.method80();
				local6.method514();
				local6.method515();
				if (local6 == this.aClass3_Sub1_9) {
					local6 = this.aClass9_1.method80();
					local6.method514();
					local6.method515();
				}
			} else {
				this.anInt94--;
			}
			this.aClass19_1.method233(arg0, arg1);
			this.aClass9_1.method79(arg0);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("68948, " + true + ", " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DSCQIAPU", name = "a", descriptor = "()V")
	public void method67() {
		while (true) {
			@Pc(3) Class3_Sub1 local3 = this.aClass9_1.method80();
			if (local3 == null) {
				this.anInt94 = this.anInt93;
				return;
			}
			local3.method514();
			local3.method515();
		}
	}
}
