import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!DMOAMUBS")
public final class Class12 {

	@OriginalMember(owner = "client!DMOAMUBS", name = "c", descriptor = "I")
	private static int anInt192 = -34;

	@OriginalMember(owner = "client!DMOAMUBS", name = "d", descriptor = "I")
	private int anInt193;

	@OriginalMember(owner = "client!DMOAMUBS", name = "e", descriptor = "I")
	private int anInt194;

	@OriginalMember(owner = "client!DMOAMUBS", name = "a", descriptor = "I")
	private int anInt191 = 1;

	@OriginalMember(owner = "client!DMOAMUBS", name = "b", descriptor = "Z")
	private boolean aBoolean65 = true;

	@OriginalMember(owner = "client!DMOAMUBS", name = "f", descriptor = "Lclient!IZSDUVJF;")
	private Class5_Sub1 aClass5_Sub1_13 = new Class5_Sub1();

	@OriginalMember(owner = "client!DMOAMUBS", name = "j", descriptor = "Lclient!TOAGRHDF;")
	private Class41 aClass41_1 = new Class41(anInt192);

	@OriginalMember(owner = "client!DMOAMUBS", name = "g", descriptor = "I")
	private int anInt195;

	@OriginalMember(owner = "client!DMOAMUBS", name = "h", descriptor = "I")
	private int anInt196;

	@OriginalMember(owner = "client!DMOAMUBS", name = "i", descriptor = "Lclient!MCCUMEPE;")
	private Class30 aClass30_1;

	@OriginalMember(owner = "client!DMOAMUBS", name = "<init>", descriptor = "(IZ)V")
	public Class12(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.anInt195 = arg0;
			this.anInt196 = arg0;
			this.aClass30_1 = new Class30(1024, 170);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("97534, " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DMOAMUBS", name = "a", descriptor = "(J)Lclient!IZSDUVJF;")
	public Class5_Sub1 method78(@OriginalArg(0) long arg0) {
		@Pc(5) Class5_Sub1 local5 = (Class5_Sub1) this.aClass30_1.method223(arg0);
		if (local5 == null) {
			this.anInt193++;
		} else {
			this.aClass41_1.method291(local5);
			this.anInt194++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!DMOAMUBS", name = "a", descriptor = "(JBLclient!IZSDUVJF;)V")
	public void method79(@OriginalArg(0) long arg0, @OriginalArg(2) Class5_Sub1 arg1) {
		try {
			if (this.anInt196 == 0) {
				@Pc(8) Class5_Sub1 local8 = this.aClass41_1.method292();
				local8.method423();
				local8.method424();
				if (local8 == this.aClass5_Sub1_13) {
					local8 = this.aClass41_1.method292();
					local8.method423();
					local8.method424();
				}
			} else {
				this.anInt196--;
			}
			this.aClass30_1.method224(arg1, arg0);
			this.aClass41_1.method291(arg1);
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("63888, " + arg0 + ", " + -80 + ", " + arg1 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!DMOAMUBS", name = "a", descriptor = "()V")
	public void method80() {
		while (true) {
			@Pc(3) Class5_Sub1 local3 = this.aClass41_1.method292();
			if (local3 == null) {
				this.anInt196 = this.anInt195;
				return;
			}
			local3.method423();
			local3.method424();
		}
	}
}
