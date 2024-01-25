import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vb")
public final class Class327 {

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Lclient!vi;")
	private final Class332 aClass332_195 = new Class332(64);

	@OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
	public int anInt9056 = 0;

	@OriginalMember(owner = "client!vb", name = "c", descriptor = "Lclient!pq;")
	private final Class251 aClass251_149;

	@OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
	public final int anInt9055;

	@OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(Lclient!uea;ILclient!pq;)V")
	public Class327(@OriginalArg(0) Class314 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class251 arg2) {
		this.aClass251_149 = arg2;
		this.anInt9055 = this.aClass251_149.method5849(4);
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IB)V")
	public void method7406() {
		@Pc(2) Class332 local2 = this.aClass332_195;
		synchronized (this.aClass332_195) {
			this.aClass332_195.method7497(5);
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)Lclient!ss;")
	public Class298 method7411(@OriginalArg(1) int arg0) {
		@Pc(6) Class332 local6 = this.aClass332_195;
		@Pc(16) Class298 local16;
		synchronized (this.aClass332_195) {
			local16 = (Class298) this.aClass332_195.method7502((long) arg0);
		}
		if (local16 != null) {
			return local16;
		}
		@Pc(29) Class251 local29 = this.aClass251_149;
		@Pc(40) byte[] local40;
		synchronized (this.aClass251_149) {
			local40 = this.aClass251_149.method5860(4, arg0);
		}
		local16 = new Class298();
		local16.aClass327_6 = this;
		local16.anInt8018 = arg0;
		if (local40 != null) {
			local16.method6615(new Class6_Sub14(local40));
		}
		local16.method6617();
		@Pc(71) Class332 local71 = this.aClass332_195;
		synchronized (this.aClass332_195) {
			this.aClass332_195.method7498((long) arg0, local16);
			return local16;
		}
	}

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
	public void method7412() {
		@Pc(10) Class332 local10 = this.aClass332_195;
		synchronized (this.aClass332_195) {
			this.aClass332_195.method7512();
		}
	}

	@OriginalMember(owner = "client!vb", name = "b", descriptor = "(B)V")
	public void method7413() {
		@Pc(10) Class332 local10 = this.aClass332_195;
		synchronized (this.aClass332_195) {
			this.aClass332_195.method7510();
		}
	}
}
