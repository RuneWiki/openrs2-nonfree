import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gu")
public final class Class140 {

	@OriginalMember(owner = "client!gu", name = "h", descriptor = "Lclient!si;")
	private final Class338 aClass338_21 = new Class338(64);

	@OriginalMember(owner = "client!gu", name = "k", descriptor = "I")
	public int anInt4287 = 0;

	@OriginalMember(owner = "client!gu", name = "c", descriptor = "Lclient!lb;")
	private final Class221 aClass221_64;

	@OriginalMember(owner = "client!gu", name = "j", descriptor = "I")
	public final int anInt4286;

	@OriginalMember(owner = "client!gu", name = "<init>", descriptor = "(Lclient!iga;ILclient!lb;)V")
	public Class140(@OriginalArg(0) Class169 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class221 arg2) {
		this.aClass221_64 = arg2;
		this.anInt4286 = this.aClass221_64.method5065(4);
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(B)V")
	public void method3531() {
		@Pc(2) Class338 local2 = this.aClass338_21;
		synchronized (this.aClass338_21) {
			this.aClass338_21.method8051();
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(I)V")
	public void method3532() {
		@Pc(2) Class338 local2 = this.aClass338_21;
		synchronized (this.aClass338_21) {
			this.aClass338_21.method8047();
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(II)V")
	public void method3533() {
		@Pc(6) Class338 local6 = this.aClass338_21;
		synchronized (this.aClass338_21) {
			this.aClass338_21.method8052(5);
		}
	}

	@OriginalMember(owner = "client!gu", name = "a", descriptor = "(ZI)Lclient!ce;")
	public Class46 method3535(@OriginalArg(1) int arg0) {
		@Pc(6) Class338 local6 = this.aClass338_21;
		@Pc(16) Class46 local16;
		synchronized (this.aClass338_21) {
			local16 = (Class46) this.aClass338_21.method8049((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(37) Class221 local37 = this.aClass221_64;
		@Pc(46) byte[] local46;
		synchronized (this.aClass221_64) {
			local46 = this.aClass221_64.method5089(arg0, 4);
		}
		local16 = new Class46();
		local16.anInt1141 = arg0;
		local16.aClass140_1 = this;
		if (local46 != null) {
			local16.method938(new Class3_Sub28(local46));
		}
		local16.method937();
		@Pc(79) Class338 local79 = this.aClass338_21;
		synchronized (this.aClass338_21) {
			this.aClass338_21.method8044((long) arg0, local16);
			return local16;
		}
	}
}
