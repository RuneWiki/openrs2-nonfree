import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vda")
public final class Class374 {

	@OriginalMember(owner = "client!vda", name = "g", descriptor = "J")
	private long aLong326;

	@OriginalMember(owner = "client!vda", name = "c", descriptor = "J")
	private long aLong325 = -1L;

	@OriginalMember(owner = "client!vda", name = "f", descriptor = "Lclient!tf;")
	private final Class340 aClass340_74 = new Class340();

	@OriginalMember(owner = "client!vda", name = "<init>", descriptor = "(Lclient!jc;)V")
	public Class374(@OriginalArg(0) Class6_Sub15 arg0) {
		this.method8641(arg0);
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(Lclient!jc;I)V")
	private void method8641(@OriginalArg(0) Class6_Sub15 arg0) {
		this.aLong326 = arg0.method3049();
		this.aLong325 = arg0.method3049();
		for (@Pc(24) int local24 = arg0.method3030(); local24 != 0; local24 = arg0.method3030()) {
			@Pc(47) Class6_Sub7 local47;
			if (local24 == 1) {
				local47 = new Class6_Sub7_Sub1();
			} else if (local24 == 4) {
				local47 = new Class6_Sub7_Sub3();
			} else if (local24 == 3) {
				local47 = new Class6_Sub7_Sub4();
			} else if (local24 == 2) {
				local47 = new Class6_Sub7_Sub2();
			} else {
				throw new RuntimeException("Unrecognised ClanChannelDelta type in decode()");
			}
			local47.method8201(arg0);
			this.aClass340_74.method8131(local47);
		}
	}

	@OriginalMember(owner = "client!vda", name = "a", descriptor = "(BLclient!kj;)V")
	public void method8645(@OriginalArg(1) Class6_Sub29 arg0) {
		if (this.aLong326 != arg0.aLong346 || arg0.aLong182 != this.aLong325) {
			throw new RuntimeException("ClanChannelDelta.applyToClanChannel(): Credentials do not match! cc.clanHash:" + arg0.aLong346 + " updateNum:" + arg0.aLong182 + " delta.clanHash:" + this.aLong326 + " updateNum:" + this.aLong325);
		}
		for (@Pc(69) Class6_Sub7 local69 = (Class6_Sub7) this.aClass340_74.method8124(); local69 != null; local69 = (Class6_Sub7) this.aClass340_74.method8134()) {
			local69.method8200(arg0);
		}
		arg0.aLong182++;
	}
}
