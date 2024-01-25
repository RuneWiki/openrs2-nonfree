import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fl")
public final class Class116 {

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "Lclient!si;")
	public final Class338 aClass338_13 = new Class338(20);

	@OriginalMember(owner = "client!fl", name = "h", descriptor = "Lclient!si;")
	private final Class338 aClass338_14 = new Class338(64);

	@OriginalMember(owner = "client!fl", name = "i", descriptor = "Lclient!lb;")
	public final Class221 aClass221_49;

	@OriginalMember(owner = "client!fl", name = "f", descriptor = "Lclient!lb;")
	private final Class221 aClass221_50;

	@OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;Lclient!lb;)V")
	public Class116(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2, @OriginalArg(3) Class221 arg3) {
		this.aClass221_49 = arg3;
		this.aClass221_50 = arg2;
		this.aClass221_50.method5065(46);
	}

	@OriginalMember(owner = "client!fl", name = "c", descriptor = "(I)V")
	public void method2797() {
		@Pc(13) Class338 local13 = this.aClass338_14;
		synchronized (this.aClass338_14) {
			this.aClass338_14.method8047();
		}
		local13 = this.aClass338_13;
		synchronized (this.aClass338_13) {
			this.aClass338_13.method8047();
		}
	}

	@OriginalMember(owner = "client!fl", name = "b", descriptor = "(I)V")
	public void method2798() {
		@Pc(14) Class338 local14 = this.aClass338_14;
		synchronized (this.aClass338_14) {
			this.aClass338_14.method8051();
		}
		local14 = this.aClass338_13;
		synchronized (this.aClass338_13) {
			this.aClass338_13.method8051();
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)Lclient!sh;")
	public Class337 method2800(@OriginalArg(0) int arg0) {
		@Pc(6) Class338 local6 = this.aClass338_14;
		@Pc(16) Class337 local16;
		synchronized (this.aClass338_14) {
			local16 = (Class337) this.aClass338_14.method8049((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(30) Class221 local30 = this.aClass221_50;
		@Pc(41) byte[] local41;
		synchronized (this.aClass221_50) {
			local41 = this.aClass221_50.method5089(arg0, 46);
		}
		local16 = new Class337();
		local16.aClass116_1 = this;
		if (local41 != null) {
			local16.method8031(new Class3_Sub28(local41));
		}
		@Pc(68) Class338 local68 = this.aClass338_14;
		synchronized (this.aClass338_14) {
			this.aClass338_14.method8044((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(BI)V")
	public void method2801() {
		@Pc(2) Class338 local2 = this.aClass338_14;
		synchronized (this.aClass338_14) {
			this.aClass338_14.method8052(5);
		}
		local2 = this.aClass338_13;
		synchronized (this.aClass338_13) {
			this.aClass338_13.method8052(5);
		}
	}
}
