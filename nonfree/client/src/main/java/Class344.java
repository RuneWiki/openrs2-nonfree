import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uea")
public final class Class344 {

	@OriginalMember(owner = "client!uea", name = "a", descriptor = "Lclient!wq;")
	private final Class391 aClass391_60 = new Class391(64);

	@OriginalMember(owner = "client!uea", name = "d", descriptor = "Lclient!la;")
	private final Class208 aClass208_134;

	@OriginalMember(owner = "client!uea", name = "f", descriptor = "I")
	public final int anInt10027;

	@OriginalMember(owner = "client!uea", name = "<init>", descriptor = "(Lclient!to;ILclient!la;)V")
	public Class344(@OriginalArg(0) Class333 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class208 arg2) {
		this.aClass208_134 = arg2;
		this.anInt10027 = this.aClass208_134.method5005(19);
	}

	@OriginalMember(owner = "client!uea", name = "b", descriptor = "(II)Lclient!dq;")
	public Class94 method8615(@OriginalArg(1) int arg0) {
		@Pc(6) Class391 local6 = this.aClass391_60;
		@Pc(21) Class94 local21;
		synchronized (this.aClass391_60) {
			local21 = (Class94) this.aClass391_60.method9275((long) arg0);
		}
		if (local21 != null) {
			return local21;
		}
		@Pc(35) Class208 local35 = this.aClass208_134;
		@Pc(44) byte[] local44;
		synchronized (this.aClass208_134) {
			local44 = this.aClass208_134.method4991(19, arg0, -127);
		}
		local21 = new Class94();
		if (local44 != null) {
			local21.method1659(new Class5_Sub23(local44));
		}
		@Pc(68) Class391 local68 = this.aClass391_60;
		synchronized (this.aClass391_60) {
			this.aClass391_60.method9273((long) arg0, local21, 1);
			return local21;
		}
	}
}
