import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tp")
public final class Class336 {

	@OriginalMember(owner = "client!tp", name = "c", descriptor = "Lclient!de;")
	private Class69 aClass69_58 = new Class69(128);

	@OriginalMember(owner = "client!tp", name = "m", descriptor = "Lclient!de;")
	public Class69 aClass69_59 = new Class69(64);

	@OriginalMember(owner = "client!tp", name = "i", descriptor = "Lclient!nd;")
	public final Class238 aClass238_254;

	@OriginalMember(owner = "client!tp", name = "k", descriptor = "Lclient!nd;")
	private final Class238 aClass238_255;

	@OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lclient!al;ILclient!nd;Lclient!nd;)V")
	public Class336(@OriginalArg(0) Class17 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class238 arg2, @OriginalArg(3) Class238 arg3) {
		this.aClass238_254 = arg3;
		this.aClass238_255 = arg2;
		this.aClass238_255.method5592(36);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(IBI)V")
	public void method7850(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		this.aClass69_58 = new Class69(arg1);
		this.aClass69_59 = new Class69(arg0);
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)V")
	public void method7852() {
		@Pc(2) Class69 local2 = this.aClass69_58;
		synchronized (this.aClass69_58) {
			this.aClass69_58.method1904();
		}
		local2 = this.aClass69_59;
		synchronized (this.aClass69_59) {
			this.aClass69_59.method1904();
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(BI)V")
	public void method7854() {
		@Pc(2) Class69 local2 = this.aClass69_58;
		synchronized (this.aClass69_58) {
			this.aClass69_58.method1910(5);
		}
		local2 = this.aClass69_59;
		synchronized (this.aClass69_59) {
			this.aClass69_59.method1910(5);
		}
	}

	@OriginalMember(owner = "client!tp", name = "b", descriptor = "(BI)Lclient!up;")
	public Class353 method7855(@OriginalArg(1) int arg0) {
		@Pc(6) Class69 local6 = this.aClass69_58;
		@Pc(16) Class353 local16;
		synchronized (this.aClass69_58) {
			local16 = (Class353) this.aClass69_58.method1919((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class238 local29 = this.aClass238_255;
		@Pc(40) byte[] local40;
		synchronized (this.aClass238_255) {
			local40 = this.aClass238_255.method5567(arg0, 36);
		}
		local16 = new Class353();
		local16.aClass336_6 = this;
		local16.anInt9811 = arg0;
		if (local40 != null) {
			local16.method8339(new Class2_Sub17(local40));
		}
		local16.method8335();
		@Pc(76) Class69 local76 = this.aClass69_58;
		synchronized (this.aClass69_58) {
			this.aClass69_58.method1917((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
	public void method7856() {
		@Pc(2) Class69 local2 = this.aClass69_58;
		synchronized (this.aClass69_58) {
			this.aClass69_58.method1905();
		}
		local2 = this.aClass69_59;
		synchronized (this.aClass69_59) {
			this.aClass69_59.method1905();
		}
	}
}
