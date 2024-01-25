import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ju")
public final class Class185 {

	@OriginalMember(owner = "client!ju", name = "c", descriptor = "Lclient!tq;")
	private final Class340 aClass340_35 = new Class340(64);

	@OriginalMember(owner = "client!ju", name = "b", descriptor = "Lclient!wm;")
	private final Class390 aClass390_74;

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
	public final int anInt5742;

	@OriginalMember(owner = "client!ju", name = "<init>", descriptor = "(Lclient!ega;ILclient!wm;)V")
	public Class185(@OriginalArg(0) Class98 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class390 arg2) {
		this.aClass390_74 = arg2;
		this.anInt5742 = this.aClass390_74.method8913(19);
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(II)Lclient!ll;")
	public Class217 method4761(@OriginalArg(0) int arg0) {
		@Pc(6) Class340 local6 = this.aClass340_35;
		@Pc(16) Class217 local16;
		synchronized (this.aClass340_35) {
			local16 = (Class217) this.aClass340_35.method7999((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class390 local29 = this.aClass390_74;
		@Pc(38) byte[] local38;
		synchronized (this.aClass390_74) {
			local38 = this.aClass390_74.method8914(19, arg0);
		}
		local16 = new Class217();
		if (local38 != null) {
			local16.method5294(new Class5_Sub41(local38));
		}
		@Pc(68) Class340 local68 = this.aClass340_35;
		synchronized (this.aClass340_35) {
			this.aClass340_35.method7986((long) arg0, local16);
			return local16;
		}
	}
}
